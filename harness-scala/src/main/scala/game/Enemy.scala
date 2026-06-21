package game

import gdext.GodotPrint
import gdext.codegen.engine.Node2D
import gdext.engine.Tscn
import gdext.register.*

/**
 * Example of the compact `var`-param export form: every `var` constructor
 * parameter behaves as if it carried an inlined `@gdexport`, so the class body
 * needs no per-field annotation. `Register.auto[Enemy]` exports the `var`
 * params; the build-time scanner registers the class because all its params are
 * `var` (Godot constructs with no args — the macro factory fills each param
 * from its type's `DefaultValue`).
 *
 * Params must be `var` (Godot sets the property after construction) but need
 * **no default** — `hp` starts at 0, `projectile` at `None`, `scene` unassigned.
 * Write an explicit `= ...` only to override the type's natural default. Body
 * `@func` / `@signal` (and `@gdexport`s) still work alongside the params.
 *
 * Declared as a plain open `class` (not `final`, not `case`) so it can serve as
 * the base of another custom node — see [[Skeleton]], which extends it and is
 * registered with Godot as a node deriving from `Enemy`.
 */
class Enemy(
  var hp: Int,
  var projectile: Option[Projectile],
  var scene: Tscn[Player]
) extends Node2D {

  // Note: a `@func` must not snake_case to a property's `get_<name>`/`set_<name>`
  // accessor — e.g. `getHp` would collide with the exported `hp`'s `get_hp`.
  @func def remainingHealth(): Long = hp.toLong

  @signal def died(): Unit = ()

  override def _ready(): Unit =
    GodotPrint.print(s"Enemy._ready (hp=$hp)")
}
