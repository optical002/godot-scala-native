package game

import gdext.builtin.Dict
import gdext.engine.{Gd, Required, Tres, Tscn}
import gdext.codegen.engine.{Area2D, Node, Node2D, Resource}
import gdext.register.*

/** A simple parameterless enum, exported as a Godot ENUM property. */
enum Team {
  case Red, Blue, Green
}

/**
 * Exercises every export kind the binding supports, for headless validation of
 * the emitted inspector metadata (type/hint/hint_string/class_name) and value
 * round-trips. See `godot/export_verify.gd`.
 */
final class ExportsDemo extends Node2D {
  // Node references: optional vs required vs bare (bare == required).
  @gdexport var optNode: Option[Gd[Node2D]] = None
  @gdexport var reqNode: Required[Gd[Node2D]] = Required.unassigned
  @gdexport var bareNode: Gd[Node] = Gd.nullOf

  // Typed resource reference.
  @gdexport var optRes: Option[Tres[Resource]] = None

  // Typed scene reference (root node must be Area2D).
  @gdexport var optScene: Option[Tscn[Area2D]] = None

  // Simple enum.
  @gdexport var team: Team = Team.Red

  // Typed dictionary.
  @gdexport var weights: Dict[String, Long] = Dict.empty
}
