package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `CSGMesh3D`, extends `CSGPrimitive3D`. */
abstract class CSGMesh3D extends CSGPrimitive3D {
  override def godotClassName: String = "CSGMesh3D"

  /** CSGMesh3D.set_mesh */
  final def setMesh(mesh: Mesh): Unit = {
    if (gdext.classes.CSGMesh3D.mb_set_mesh == null) gdext.classes.CSGMesh3D.mb_set_mesh = MethodBind.get("CSGMesh3D", "set_mesh", 194775623L)
    Ptrcall.callVoid1(gdext.classes.CSGMesh3D.mb_set_mesh, livePtr, Wrappers.handle(mesh))
  }

  /** CSGMesh3D.get_mesh. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getMesh(): Mesh = {
    if (gdext.classes.CSGMesh3D.mb_get_mesh == null) gdext.classes.CSGMesh3D.mb_get_mesh = MethodBind.get("CSGMesh3D", "get_mesh", 4081188045L)
    Wrappers.owned[Mesh](Ptrcall.call0[Long](gdext.classes.CSGMesh3D.mb_get_mesh, livePtr))
  }

  /** CSGMesh3D.set_material */
  final def setMaterial(material: Material): Unit = {
    if (gdext.classes.CSGMesh3D.mb_set_material == null) gdext.classes.CSGMesh3D.mb_set_material = MethodBind.get("CSGMesh3D", "set_material", 2757459619L)
    Ptrcall.callVoid1(gdext.classes.CSGMesh3D.mb_set_material, livePtr, Wrappers.handle(material))
  }

  /** CSGMesh3D.get_material. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getMaterial(): Material = {
    if (gdext.classes.CSGMesh3D.mb_get_material == null) gdext.classes.CSGMesh3D.mb_get_material = MethodBind.get("CSGMesh3D", "get_material", 5934680L)
    Wrappers.owned[Material](Ptrcall.call0[Long](gdext.classes.CSGMesh3D.mb_get_material, livePtr))
  }

}

object CSGMesh3D {
  private[classes] var mb_set_mesh: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_mesh: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_material: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_material: GDExtensionMethodBindPtr = null
}
