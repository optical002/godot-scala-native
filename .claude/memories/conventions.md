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
- `recreate_instance_func` rebinds instances on reload.
- Registration must be reload-safe (probe + unregister stale before register);
  do NOT unregister on deinit (races the new image → "unregister unexisting").
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

## Logging (split)
`Log` (gdext) has split channels. Binding internals → `Log.file` (file
`godot-init`). Game code → `GodotPrint.print` (Godot Output). Don't mix.

## Codegen
`codegen/` is generated — never hand-edit; change the generator in `igen` and
run `cd language-binding-scala && sbt igen/regenerate`. After moving the entry
symbol, `cd harness-scala && sbt clean` (stale `.nir` causes "multiple definition
of godot_scala_init").
