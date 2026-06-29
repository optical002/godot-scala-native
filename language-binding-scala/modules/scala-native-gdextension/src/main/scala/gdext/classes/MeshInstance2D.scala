package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `MeshInstance2D`, extends `Node2D`. */
abstract class MeshInstance2D extends Node2D {
  override def godotClassName: String = "MeshInstance2D"

  /** MeshInstance2D.set_mesh */
  final def setMesh(mesh: Mesh): Unit =
    Ptrcall.callVoid1(MethodBind.get("MeshInstance2D", "set_mesh", 194775623L), hostObject.objectPtr, mesh.hostObject)

  /** MeshInstance2D.get_mesh */
  final def getMesh(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("MeshInstance2D", "get_mesh", 1808005922L), hostObject.objectPtr)

  /** MeshInstance2D.set_texture */
  final def setTexture(texture: Texture2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("MeshInstance2D", "set_texture", 4051416890L), hostObject.objectPtr, texture.hostObject)

  /** MeshInstance2D.get_texture */
  final def getTexture(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("MeshInstance2D", "get_texture", 3635182373L), hostObject.objectPtr)

}
