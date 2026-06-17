# Layer 5 — registering user classes (`register/`)

How a `game` class becomes a real Godot class. **Zero registration code in the
game** — only `extends` + annotations.

## User-facing (game)
```scala
final class Player extends Node2D {          // base derived from superclass
  @gdexport var speed: Double = 120.0        // inspector property
  @func def getScore(): Long = ...           // callable from GDScript
  @signal def pinged(): Unit = ()            // signal
  override def _process(delta: Double) = ... // virtual, auto-detected
}
```
Entry lists each class once: `Register.auto[Player]()` (in `game.GameEntry`).
No `@godotClass` annotation — base comes from `extends`.

## Macro: `Register.scala` (`Register.auto[T]`)
Scans `T` at compile time and emits all registration calls:
- Godot **base** = `T`'s direct superclass symbol name.
- **virtuals** (`_ready`/`_process`/`_physics_process`) auto-detected from overrides.
- `@func` → `MethodRegistration.registerGetter`; `@gdexport` → `PropertyRegistration`;
  `@signal` → `SignalRegistration`. Supported types: Long/Int/Double/Boolean.
- Annotations in `annotations.scala`. `@gdexport` (not `@export` — keyword clash).

## Registration substrate
- `GodotScriptClass.scala` — root base: `hostObject`, `withHost`, virtuals.
- `ClassRegistration.scala` — fills `GDExtensionClassCreationInfo4` with static
  trampolines (create/free/recreate/get_virtual). **`is_runtime=1`** (runtime-only,
  so editor doesn't tick it). Reload-safe: probes `classdb_get_class_tag` and
  unregisters a stale class before re-registering. No deinit-side unregister.
- `ClassRegistry.scala` / `Tokens.scala` — integer tokens (in `CVoidPtr` slots)
  map Godot callbacks → Scala state (CFuncPtrs can't capture closures).
- `MethodRegistration` / `PropertyRegistration` / `SignalRegistration` — the
  builder APIs the macro targets. Dispatch via Variant `call_func` trampoline.

## Reliability note (Scala Native DCE)
SN dead-code-eliminates unreferenced classes and never runs module initializers
at load — so truly self-registering classes don't work. `Register.auto[T]()`
both references the type (keeps it linked) and registers it. One line per class.
