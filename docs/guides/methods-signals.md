# Methods and signals

## Methods: `@func`

```scala
final class Player extends Node2D {
  private var elapsed = 0.0

  @func def getScore(): Long = (elapsed * 10).toLong
  @func def joinTags(): String = "a,b"
}
```

`@func` registers the method with ClassDB under its snake_case name. Godot
sees `getScore` as `get_score`.

```gdscript
var p = ClassDB.instantiate("Player")
print(p.get_score())
```

Current limits:

- A `@func` method takes **no parameters**.
- It returns `Long`, `Int`, `Double`, `Boolean`, or `String`. Any other return
  type is a compile error that names the supported types.

To pass data in from GDScript, set an [exported property](properties.md) first,
then call the method.

!!! warning
    Do not name a `@func` after a property accessor. A `@func def getHp()` next to
    an exported `hp` collides with the `get_hp` accessor Godot generates for the
    property, and registration fails with "Method already bound".

## Signals: `@signal`

```scala
final class Player extends Node2D {
  @signal def pinged(): Unit = ()

  override def process(delta: Double): Unit =
    emitSignal(hostObject, "pinged")
}
```

- The method body is never called. The annotation just declares a signal with
  that name.
- `emitSignal(hostObject, "name")` comes from `gdext.api` and fires the signal
  on this instance.
- Signals currently take **no arguments**.

Connecting from GDScript:

```gdscript
$Player.pinged.connect(_on_pinged)
```
