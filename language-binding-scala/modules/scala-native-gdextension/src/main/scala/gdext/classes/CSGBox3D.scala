package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `CSGBox3D`, extends `CSGPrimitive3D`. */
abstract class CSGBox3D extends CSGPrimitive3D {
  override def godotClassName: String = "CSGBox3D"

  /** CSGBox3D.set_size */
  final def setSize(size: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.CSGBox3D.mb_set_size == null) gdext.classes.CSGBox3D.mb_set_size = MethodBind.get("CSGBox3D", "set_size", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.CSGBox3D.mb_set_size, livePtr, size)
  }

  /** CSGBox3D.get_size */
  final def getSize(): gdext.builtin.Vector3 = {
    if (gdext.classes.CSGBox3D.mb_get_size == null) gdext.classes.CSGBox3D.mb_get_size = MethodBind.get("CSGBox3D", "get_size", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.CSGBox3D.mb_get_size, livePtr)
  }

  /** CSGBox3D.set_material */
  final def setMaterial(material: Material): Unit = {
    if (gdext.classes.CSGBox3D.mb_set_material == null) gdext.classes.CSGBox3D.mb_set_material = MethodBind.get("CSGBox3D", "set_material", 2757459619L)
    Ptrcall.callVoid1(gdext.classes.CSGBox3D.mb_set_material, livePtr, Wrappers.handle(material))
  }

  /** CSGBox3D.get_material. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getMaterial(): Material = {
    if (gdext.classes.CSGBox3D.mb_get_material == null) gdext.classes.CSGBox3D.mb_get_material = MethodBind.get("CSGBox3D", "get_material", 5934680L)
    Wrappers.owned[Material](Ptrcall.call0[Long](gdext.classes.CSGBox3D.mb_get_material, livePtr))
  }

}

object CSGBox3D {
  private[classes] var mb_set_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_material: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_material: GDExtensionMethodBindPtr = null
}
