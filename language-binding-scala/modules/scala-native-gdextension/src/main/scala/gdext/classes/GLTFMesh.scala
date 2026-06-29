package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `GLTFMesh`, extends `Resource`. */
abstract class GLTFMesh extends Resource {
  override def godotClassName: String = "GLTFMesh"

  /** GLTFMesh.get_original_name */
  final def getOriginalName(): String =
    Ptrcall.call0[String](MethodBind.get("GLTFMesh", "get_original_name", 2841200299L), hostObject.objectPtr)

  /** GLTFMesh.set_original_name */
  final def setOriginalName(original_name: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFMesh", "set_original_name", 83702148L), hostObject.objectPtr, original_name)

  /** GLTFMesh.get_mesh */
  final def getMesh(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("GLTFMesh", "get_mesh", 3754628756L), hostObject.objectPtr)

  /** GLTFMesh.set_mesh */
  final def setMesh(mesh: ImporterMesh): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFMesh", "set_mesh", 2255166972L), hostObject.objectPtr, mesh.hostObject)

}
