package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `MultiMeshInstance2D`, extends `Node2D`. */
abstract class MultiMeshInstance2D extends Node2D {
  override def godotClassName: String = "MultiMeshInstance2D"

  /** MultiMeshInstance2D.set_multimesh */
  final def setMultimesh(multimesh: MultiMesh): Unit =
    Ptrcall.callVoid1(MethodBind.get("MultiMeshInstance2D", "set_multimesh", 2246127404L), hostObject.objectPtr, multimesh.hostObject)

  /** MultiMeshInstance2D.get_multimesh */
  final def getMultimesh(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("MultiMeshInstance2D", "get_multimesh", 1385450523L), hostObject.objectPtr)

  /** MultiMeshInstance2D.set_texture */
  final def setTexture(texture: Texture2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("MultiMeshInstance2D", "set_texture", 4051416890L), hostObject.objectPtr, texture.hostObject)

  /** MultiMeshInstance2D.get_texture */
  final def getTexture(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("MultiMeshInstance2D", "get_texture", 3635182373L), hostObject.objectPtr)

}
