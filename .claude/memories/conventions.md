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
