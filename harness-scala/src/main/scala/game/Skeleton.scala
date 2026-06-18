package game

import io.github.optical002.godot.GodotPrint
import io.github.optical002.godot.engine.Tscn
import io.github.optical002.godot.register.*

/**
 * A custom node that extends another custom node ([[Enemy]]) rather than an
 * engine class. `Register.auto[Skeleton]` derives its Godot parent from the
 * Scala superclass, so it is registered with Godot as a node deriving from
 * `Enemy`: instances expose `Skeleton`'s own exported property **plus**
 * everything inherited from `Enemy` (`hp`, `remaining_health()`, the `died`
 * signal). The build-time scanner emits `Enemy` before `Skeleton` so Godot
 * always sees the parent class first.
 *
 * Only `skeletonName` is registered here; the inherited members come from
 * `Enemy`'s own registration via Godot's ClassDB. (`Node` already has a built-in
 * `name`, so the new String property is `skeletonName` to avoid colliding.)
 *
 * The `extends Enemy(...)` clause forwards `Enemy`'s required ctor args with
 * sensible literals. Every primary-ctor param here is either a `var` or has a
 * default, so the macro factory can build a `Skeleton` with no arguments.
 */
class Skeleton(
  var skeletonName: String = "Bonechill",
  hp: Int = 10
) extends Enemy(hp, None, Tscn.unassigned[Player]) {

  override def _ready(): Unit = {
    super._ready() // inherited Enemy._ready still runs
    GodotPrint.print(s"Skeleton._ready (skeletonName=$skeletonName, hp=$hp)")
  }
}
