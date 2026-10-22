# Conventions & hard-won gotchas

These cost real debugging time. Respect them.

## Native / FFI
- **Struct field writes**: write through field-pointer accessors —
  `!(!ptr).at_field = v` — NOT `val s = !ptr; s.field = v` (may target a copy).
- **`sizeof[T]` for malloc**: use the **concrete** type at the allocation site.
  A generic `def alloc[T](using Tag[T]) = malloc(sizeof[T])` under-allocates and
  Godot reads OOB → segfault.
- **Method-info structs** (`GDExtensionClassMethodInfo`): if `argument_count>0`,
  also allocate a zeroed `arguments_metadata` array — Godot reads it.
- **CFuncPtr from proc address**: `CFuncPtr.fromPtr[T](ptr)`, never `asInstanceOf`.
- **Never let exceptions unwind across the C ABI**: catch at the boundary
  (`GodotEngine.run` does this), return failure.
- **`Ptrcall` dispatchers ARE `inline` now** (0.1.9) with `erasedValue`
  matches in `Marshal`; the old "inlining crashed dotty" no longer reproduces
  on Scala 3.8.1 with this shape (no typeclass givens inside the inline).

## Zero-allocation hot path (Scala Native 0.5 gotchas)
Prove any hot-path change with `memory_verify.gd`; find a new allocation with
gdb (`nix-shell -p gdb`, run the unwrapped binary from the `godot` wrapper's
`exec` line, `break scalanative_GC_alloc_small`, `ignore 1 300000`, `bt 8`
inside a probe loop: a throwaway `--script` that sets `MemoryProbe.step`,
`iterations = 400000` and calls `measure()`).
- **`Ptr` is a class**: a `Ptr` passed to / returned from a NON-inlined method
  is boxed (`Boxes.boxToPtr`, 32 B). Pass addresses as `Long` (`gdext.internal.
  Addr.ptr[T](addr)` rebuilds locally) or make the method `inline`.
- A `Ptr` chosen by an `if` (e.g. stackalloc vs malloc) is boxed: pick the
  address as a `Long` in each branch.
- **FFI returns of `Ptr` box** too: re-type the `CFuncPtr` with `Long`
  params/return via `CFuncPtr.fromPtr[CFuncPtrN[Long, ...]](CFuncPtr.toPtr(fn))`
  (pointers and int64 share registers on every 64-bit target).
- **Lambda `CFuncPtr` callbacks box every argument** (`$extern$forwarder` →
  `boxToLong`/`boxToPtr`). Per-call callbacks are `@exported` object methods
  taking `Long`s; `resources/scala-native/gdext_trampolines.c` returns their
  addresses (Scala can't take an exported method's address). The owning
  object must be reachable (SN keeps `@exported` methods of reachable objects).
- Interflow (`releaseFast`) scalar-replaces small case classes (Vector3) but
  not a 12-field `Transform3D`; `debug` mode boxes much more — budgets in
  `memory_verify.gd` are for optimized builds (`-- debug` reports only).
- **Inline code + top-level objects**: an object reached through a WILDCARD
  package import (`import gdext.builtin.*`) inside an `inline def` that gets
  inlined elsewhere links as an unknown `gdext.builtin$` type ("Found N
  unreachable symbols"). Import the object explicitly. A `private[gdext]`
  object referenced from inlined code / C-callback lambdas hit the same
  failure (`gdext.internal.engine$`) — such helper objects are public, under
  `gdext.internal`.
- `ConcurrentHashMap.computeIfAbsent(key, _ => ...)` allocates a capturing
  closure even on a hit: `get` first.
- Generic `Function1/4` and typeclass methods over `A` box primitives and Ptrs;
  registration getters/setters are specialized with `inline` + `erasedValue`.

## StringName
Two StringName *storage pointers* for the same text are NOT pointer-equal, but
the 8-byte handle word they contain (`_data`) IS unique per text while alive —
`StringNames.adopt` keys on it. Compare by decoding (`StringName.toScala`) when
you only have an engine pointer, e.g. in `get_virtual` dispatch.

## Ref<T> ptrcall returns (verified, Godot 4.6.1)
The engine's `PtrToArg<Ref<T>>::encode` assigns a `Ref` into the return buffer:
the caller receives **+1** (`memory_verify.gd` prints `load=1 duplicate=1`).
Generated methods adopt it (`Wrappers.owned`). `RefCounted.unreference` only
decrements; when it returns true the caller must `object_destroy` (as
godot-cpp's `Ref::unref`).

## Editor hot-reload
- `godot/scala.gdextension` is **GENERATED** by the plugin (`godotManifest`,
  and as part of `godotBuild`) — don't hand-edit; change the plugin settings
  (`godotLibName`, `godotCompatibilityMinimum`, …) instead. It has
  `reloadable = true`; `godotBuild` atomically renames the `.so` (no in-place
  overwrite — that freezes the editor).
- **Who triggers the reload**: Godot itself only reloads GDExtensions from the
  editor's window-focus-in handler (`EditorNode`: deferred
  `GDExtensionManager::reload_extensions`) — never from a filesystem scan. The
  `godot_scala` addon therefore drives it after each swap:
  `GDExtensionManager.reload_extension(manifest)` **plus**
  `emit_signal("extensions_reloaded")` (the singular call doesn't emit it, and
  without the signal `EditorNode` never refreshes the InspectorDock — new
  `@gdexport` properties stay invisible). E2E-verified: property change →
  visible in ClassDB/inspector ≈10.6 s (sbt incremental build ≈10.5 s of that,
  the reload itself ≈35 ms).
- **E2E reload test**: `cd godot && godot --headless -e -- verify-hot-reload`
  (addon `godot/addons/hot_reload_verify/`, inert without the arg). Pre-warm
  with `cd harness-scala && sbt godotBuild` first or the cold-server build
  blows the timeout. It injects an all-lowercase `@gdexport` probe into
  `ExportTest.scala` (the binding snake_cases camelCase names!), waits for
  watch-rebuild + reload, asserts the property in
  `ClassDB.class_get_property_list("ExportTest")`, restores the file, exits
  0/1.
- **Reload protocol (critical, hard-won)**: the old image **must** unregister its
  classes in `deinitialize(SCENE)` (`ClassRegistration.unregisterAll()`), and the
  register side must **NOT** unregister-stale. Timestamped logs prove the order is
  clean: old-image `deinitialize` fully completes *before* the new image's
  `run`/`initialize` (they do NOT interleave — the old "races the new image"
  belief was wrong). Only with this old-deinit cleanup does Godot drive
  `recreate_instance_func` to rebind live editor instances; **without it Godot
  never recreates, live nodes/resources stay bound to the unloaded image, and
  selecting any custom node in the inspector after a reload freezes the editor**.
  Doing the unregister on the *register* side instead races Godot's own teardown
  and deadlocks. Set `GODOT_SCALA_TRACE=1` to get the verbose `Log.trace` reload
  trace (thread id + ms timestamp per line) when diagnosing this.
- **Editor plugin must be removed on `deinitialize(EDITOR)`**: `initialize(EDITOR)`
  calls `editor_add_plugin("ScalaExportPlugin")` (`EditorIntegration`), so the old
  image **must** `editor_remove_plugin` in `deinitialize(EDITOR)`
  (`EditorIntegration.unregisterAtEditorLevel`) — else each reload re-adds it and
  Godot errors `Editor plugin already added for class: ScalaExportPlugin`.
  deinit order is EDITOR-then-SCENE, so the plugin is removed before SCENE
  `unregisterAll()` drops its class.
- `is_runtime=1` so virtuals don't run while editing.
- **`is_runtime` is Node-only**: `Register.auto` sets `ClassDescriptor.isRuntime`
  from `T <: gdext.classes.Node`. Nodes are runtime (editor doesn't tick their
  `_process`/`_ready`); **Resources / other Objects must be non-runtime**. A
  custom `Resource` registered as runtime makes the editor use a placeholder and
  go through the placeholder↔real recreate path on hot-reload — which **freezes
  the editor** when the resource is referenced by an open scene.
- **Editor inspector plugin must stay inert when idle**: `ScalaExportInspectorPlugin._can_handle`
  returns `true` only when `SceneExportRegistry.size > 0` (a real `Tscn[T]`
  export exists). Returning `true` unconditionally routes every property of every
  inspected object through our `_parse_property` Scala dispatch; on hot-reload,
  the sub-inspector Godot builds for a custom `Resource` property (`Tres[T]`)
  then **deadlocks/freezes the editor**. `_parse_property` never takes a property
  over (always false), so this guard is behaviour-preserving.
- **Reload detection + timing**: `ClassRegistration.register` finding a class
  already in ClassDB (non-null tag) == hot-reload (a first load finds none);
  exposed via `ClassRegistration.consumeReloadDetected()`. On reload,
  `GodotEngine` `GodotPrint`s `[scala-native] hot-reload complete in N ms` to the
  Output panel. The `N ms` is full swap→live latency: the `godotBuild` task
  stamps `godot/reload.stamp` (epoch millis) after the atomic swap; the binding reads
  (relative to Godot's CWD, like `.scala/log`) and deletes it on reload. Headless
  one-shot runs never trigger it.

## Editor widgets / signals (primitives + a hard gotcha)
- **Callable→Scala + connect**: `builtin/Callable.scala` builds `Callable(object,
  method)` (variant ctor index 2); `engine/Signals.connect` wires a signal to it
  (`Object.connect` hash `1518946055`, via `Ptrcall.call3` + `PtrArg[Callable]`).
  When fired, Godot calls `method` on the object → routes into Scala iff that
  method is registered (`MethodRegistration.registerAction` = no-arg void).
  `SignalRegistration.callDeferred` = `Object.call_deferred(name)` (hash
  `3400424181`, vararg via `object_method_bind_call`, like `emit`).
- **`@gdexport Tscn[T]` works** (PackedScene picker) but is **unfiltered** — Godot
  exposes no root-type filter for its scene picker; `ScalaExportInspectorPlugin`
  stays inert (`_can_handle=false`).
- **GOTCHA (blocks the custom picker)**: a child `Control` (e.g. `Button`) added
  to an **extension-created `EditorProperty`** (via `add_property_editor`)
  **segfaults reading its theme on enter-tree** ("theme items too early") — and
  this reproduces in `--headless` editor too (run `godot --headless --editor
  --path . --quit-after N` to get a C++ backtrace). Unresolved across pre-tree /
  `_ready` / `call_deferred` / minimal-`addChild` timings; likely a theme-owner
  propagation issue. Filtered picker also needs missing codegen methods
  (`PopupMenu.popup`, `DirAccess`/`PackedStringArray`, `EditorProperty.emit_changed`).

## Logging (split)
`Log` (gdext, **`private[gdext]`**) has split channels. Binding internals →
`Log.file` (file `.scala/log`). Game code → `gdext.api.GodotPrint.print`
(Godot Output). Don't mix.

## Codegen
The generated packages — `gdext.classes` (engine, incl. `ClassFactory`) and
`gdext.internal.ffi` (FFI), plus `builtin/BuiltinSizes.scala`,
`builtin/ColorNames.scala` and `harness/MathParity*.scala` (BuiltinGenerator)
— are generated, never hand-edit (`classes/EngineExtras.scala` is the one
hand-written file under `classes/`); change the generator in `igen` and run
`cd language-binding-scala && sbt igen/regenerate`. (The generator emits the FFI
`Interface` as `private[gdext]`.) After moving the entry symbol, `cd harness-scala
&& sbt clean` (stale `.nir` causes "multiple definition of godot_scala_init").

## Public API vs internal (compiler-enforced)
Consumers import only `gdext.api.*`, `gdext.classes`, `gdext.builtin`,
`gdext.annotations`. `Godot`, `GodotEngine`, `Log`, `FileLogger` and the FFI
`Interface` are `private[gdext]` — a game file referencing them fails to compile
("can only be accessed from package gdext"). The registration builders
(`ClassRegistration`/`MethodRegistration`/…) stay accessible because the
`Register` macro emits calls to them into consumer code. See
[architecture](index.md) "Package layout".

## Decoupled consumer / publishLocal
`harness-scala` consumes the binding + plugin as **published** artifacts (no
source `ProjectRef`), so any change in `language-binding-scala` needs
`sbt publishLocal` before `sbt godotBuild` — see the skill body, which the
`check-publish-local` hook enforces. Both publish under `0.1.10`.
Changing the plugin's task/setting keys or the embedded `gdext` version requires
a republish to take effect downstream.

## Scala Native link cache misses (upstream bug, 0.5.10)
`Build.buildCached` writes `target/scala-3.8.1/native/build-checksum` with
`Files.write(CREATE, WRITE)` — **no truncate**. A shorter new checksum leaves the
old tail (e.g. `14993716273`, not a valid Int), the next check fails, and
no-change builds relink (~35 s releaseFast) until a long-enough checksum lands.
Looks random. Not ours; `godotBuild` skips the `.so` swap when the linked file's
path/size/mtime equals the last swap (`last-swap.stamp`), so a cache hit means
no hot reload. Deleting `build-checksum` forces one relink and resets it.
Upstream: issue #5111, fix PR #5112 (open, not in 0.5.12).

## Scala Native 0.5.12 upgrade: executable stack (tried 2026-10-22, reverted)
0.5.12's nativelib ships `SafepointPollTrampoline-aarch64.S` without a
`.note.GNU-stack` section, so the linked `.so` gets `GNU_STACK RWE`; glibc 2.41+
refuses to `dlopen` it ("cannot enable executable stack as shared object
requires") → Godot loads no extension, every verify fails. Fix if upgrading:
add `-Wl,-z,noexecstack` to `nativeConfig.linkingOptions` in the plugin, check
`readelf -lW <so> | grep GNU_STACK` shows `RW`. No link-time gain measured on
the harness (32.6 s vs 30.4–31.6 s on 0.5.10). Republishing the plugin under the
same version does NOT re-resolve harness's meta-build deps — `rm -rf
harness-scala/project/target` after changing the plugin's dependencies.

## Incremental native codegen: patched in the plugin (Scala Native 0.5.10)
Upstream (0.5.10–main, unreported) numbers classes by iterating
`linker.Class.subclasses`, a `mutable.Set` with identity hashCodes, so ids differ
every JVM run; type tests are lowered to id-range compares *before*
`IncrementalCodeGenContext` hashes each source dir → every dir looked changed →
all `.ll` regenerated + recompiled. **Fix shipped**:
`modules/sbt-godot-scala-native/src/main/scala/snpatch/Metadata.scala`, a copy
of 0.5.10 `codegen/Metadata.scala` with `sortBy(_.name.mangle)` on subclasses
(and traits — no measured effect, trait order was already stable). It shadows
the toolchain class because the plugin jar precedes `tools_2.12` on the
consumer's meta-build classpath (verified on harness). A class compiled into
`harness-scala/project/` does NOT shadow it (separate classloader layer).
- **On every Scala Native bump: re-copy the new `Metadata.scala`, re-apply the
  sort, update `PatchedScalaNativeVersion`** in `GodotScalaNativePlugin`, which
  warns when the classpath version differs.
- Verify it is active: two `rm target/scala-3.8.1/native/build-checksum` +
  `godotBuild` runs with `set Compile/nativeLink/logLevel := Level.Debug` →
  ~67 "has not changed" lines and 3 `clang` runs.
- `snpatch/IncrementalCodeGenContext.scala` hashes defns by content
  (`stableHash`): upstream `Defn.hashCode` includes `nir.Val.ByteString`'s
  `Array[Byte]` (identity hash), so every dir with a C-string literal
  (`runtime`, `unsafe`) regenerated every link. Now only `__buildInfo.ll` does.
- `snpatch/LLVM.scala`: `needsCompiling` = timestamps only. Upstream also
  checked `Build.userConfigHasChanged(config)`, but native libs compile with a
  per-library config (`configureNativeLibrary` adds preprocessor flags) whose
  hash never matches `userConfigHash` → all ~170 runtime `.c` files recompiled
  every link (~2 s). A real config change deletes `dependencies/` + `generated/`
  so the objects go too (verified: debug ↔ releaseFast recompiles 169 files).
- `snpatch/CodeGen.scala`: `outputFileId` groups project-package defns per
  *source file* (library code stays per directory) → an edit recompiles one
  small `.ll`. The harness has ~337 `.ll` files instead of 70.
- `snpatch/ClassLoader.scala` + `ClassPath.scala`: `ClassPathCache` keeps jar
  entries (listing, entry-point header scan, deserialized NIR) across links in
  the sbt JVM, keyed by canonical path + size + mtime, each with its own
  `Scope.unsafe()` closed on eviction; held via `SoftReference` (~150 MB NIR on
  the harness, 1 GB default sbt heap → some entries get dropped: NIR link
  1.2–2.2 s instead of ~3.5 s). `ClassPath.load` is synchronized (shared).
- `snpatch/CodeGen.scala` also logs debug-level `[snpatch] codegen <phase>: N ms`
  (metadata / generate / lower / hash+dispatch); lowering (~3.4 s, parallel,
  whole program) is the IR-generation floor. Skipping it for unchanged dirs
  would need a digest of every metadata input Lower reads (vtable slots, field
  layouts, id ranges) — not done: a miss means a silent miscompile.
- Project packages (from RegistrationScan, + `game`) are passed via system
  property `godot.scalanative.lastPackages` and numbered after library
  siblings, so a new project lambda/class shifts only project ids (6 files
  recompile instead of 58; the 16 MB `game.harness` MathParity file is one of
  them in this repo).
- Adding/removing a *linked* class or lambda shifts ids after it → ~half the
  files recompile (no gain then).
