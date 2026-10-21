package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `GLTFMesh`, extends `Resource`. */
abstract class GLTFMesh extends Resource {
  override def godotClassName: String = "GLTFMesh"

  /** GLTFMesh.get_original_name */
  final def getOriginalName(): String = {
    if (gdext.classes.GLTFMesh.mb_get_original_name == null) gdext.classes.GLTFMesh.mb_get_original_name = MethodBind.get("GLTFMesh", "get_original_name", 2841200299L)
    Ptrcall.call0[String](gdext.classes.GLTFMesh.mb_get_original_name, livePtr)
  }

  /** GLTFMesh.set_original_name */
  final def setOriginalName(original_name: String): Unit = {
    if (gdext.classes.GLTFMesh.mb_set_original_name == null) gdext.classes.GLTFMesh.mb_set_original_name = MethodBind.get("GLTFMesh", "set_original_name", 83702148L)
    Ptrcall.callVoid1(gdext.classes.GLTFMesh.mb_set_original_name, livePtr, original_name)
  }

  /** GLTFMesh.get_mesh. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getMesh(): ImporterMesh = {
    if (gdext.classes.GLTFMesh.mb_get_mesh == null) gdext.classes.GLTFMesh.mb_get_mesh = MethodBind.get("GLTFMesh", "get_mesh", 3754628756L)
    Wrappers.owned[ImporterMesh](Ptrcall.call0[Long](gdext.classes.GLTFMesh.mb_get_mesh, livePtr))
  }

  /** GLTFMesh.set_mesh */
  final def setMesh(mesh: ImporterMesh): Unit = {
    if (gdext.classes.GLTFMesh.mb_set_mesh == null) gdext.classes.GLTFMesh.mb_set_mesh = MethodBind.get("GLTFMesh", "set_mesh", 2255166972L)
    Ptrcall.callVoid1(gdext.classes.GLTFMesh.mb_set_mesh, livePtr, Wrappers.handle(mesh))
  }

}

object GLTFMesh {
  private[classes] var mb_get_original_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_original_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_mesh: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_mesh: GDExtensionMethodBindPtr = null
}
