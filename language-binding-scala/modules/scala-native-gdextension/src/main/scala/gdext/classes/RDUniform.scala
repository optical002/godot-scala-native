package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `RDUniform`, extends `RefCounted`. */
abstract class RDUniform extends RefCounted {
  override def godotClassName: String = "RDUniform"

  /** RDUniform.set_uniform_type */
  final def setUniformType(pMember: gdext.classes.RenderingDevice.UniformType): Unit = {
    if (gdext.classes.RDUniform.mb_set_uniform_type == null) gdext.classes.RDUniform.mb_set_uniform_type = MethodBind.get("RDUniform", "set_uniform_type", 1664894931L)
    Ptrcall.callVoid1(gdext.classes.RDUniform.mb_set_uniform_type, livePtr, pMember)
  }

  /** RDUniform.get_uniform_type */
  final def getUniformType(): gdext.classes.RenderingDevice.UniformType = {
    if (gdext.classes.RDUniform.mb_get_uniform_type == null) gdext.classes.RDUniform.mb_get_uniform_type = MethodBind.get("RDUniform", "get_uniform_type", 475470040L)
    gdext.classes.RenderingDevice.UniformType(Ptrcall.call0[Long](gdext.classes.RDUniform.mb_get_uniform_type, livePtr))
  }

  /** RDUniform.set_binding */
  final def setBinding(pMember: Long): Unit = {
    if (gdext.classes.RDUniform.mb_set_binding == null) gdext.classes.RDUniform.mb_set_binding = MethodBind.get("RDUniform", "set_binding", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.RDUniform.mb_set_binding, livePtr, pMember)
  }

  /** RDUniform.get_binding */
  final def getBinding(): Long = {
    if (gdext.classes.RDUniform.mb_get_binding == null) gdext.classes.RDUniform.mb_get_binding = MethodBind.get("RDUniform", "get_binding", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RDUniform.mb_get_binding, livePtr)
  }

  /** RDUniform.clear_ids */
  final def clearIds(): Unit = {
    if (gdext.classes.RDUniform.mb_clear_ids == null) gdext.classes.RDUniform.mb_clear_ids = MethodBind.get("RDUniform", "clear_ids", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.RDUniform.mb_clear_ids, livePtr)
  }

}

object RDUniform {
  private[classes] var mb_set_uniform_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_uniform_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_binding: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_binding: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_ids: GDExtensionMethodBindPtr = null
}
