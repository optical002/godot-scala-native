package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `PackedScene`, extends `Resource`. */
abstract class PackedScene extends Resource {

  /** PackedScene.pack */
  final def pack(path: Node): Long =
    Ptrcall.call1[GodotObject, Long](MethodBind.get("PackedScene", "pack", 2584678054L), hostObject.objectPtr, path.hostObject)

  /** PackedScene.instantiate */
  final def instantiate(edit_state: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("PackedScene", "instantiate", 2628778455L), hostObject.objectPtr, edit_state)

  /** PackedScene.can_instantiate */
  final def canInstantiate(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("PackedScene", "can_instantiate", 36873697L), hostObject.objectPtr)

  /** PackedScene.get_state */
  final def getState(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("PackedScene", "get_state", 3479783971L), hostObject.objectPtr)

}

object PackedScene {
  /** Class metadata for Gd[PackedScene] lifetime management and casting. */
  given GodotClass[PackedScene] with {
    def className = "PackedScene"
    def isRefCounted = true
    def wrap(o: GodotObject): PackedScene = new PackedScene {}.withHost(o.objectPtr)
    def unwrap(t: PackedScene): GodotObject = t.hostObject
  }
}
