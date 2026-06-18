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
- **`Ptrcall` dispatchers must not be `inline`** (inlining crashed dotty).

## StringName
Two StringName *handles* for the same text are NOT pointer-equal. Compare by
decoding (`StringName.toScala`), e.g. in `get_virtual` dispatch.

## Editor hot-reload
- `.gdextension` has `reloadable = true`; `harness-scala`'s `build` task
  atomically renames the `.so` (no in-place overwrite — that freezes the editor).
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
- `is_runtime=1` so virtuals don't run while editing.
- **`is_runtime` is Node-only**: `Register.auto` sets `ClassDescriptor.isRuntime`
  from `T <: codegen.engine.Node`. Nodes are runtime (editor doesn't tick their
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
  Output panel. The `N ms` is full swap→live latency: the `build` task stamps
  `godot/reload.stamp` (epoch millis) after the atomic swap; the binding reads
  (relative to Godot's CWD, like `godot-init`) and deletes it on reload. Headless
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
`Log` (gdext) has split channels. Binding internals → `Log.file` (file
`godot-init`). Game code → `GodotPrint.print` (Godot Output). Don't mix.

## Codegen
`codegen/` is generated — never hand-edit; change the generator in `igen` and
run `cd language-binding-scala && sbt igen/regenerate`. After moving the entry
symbol, `cd harness-scala && sbt clean` (stale `.nir` causes "multiple definition
of godot_scala_init").
