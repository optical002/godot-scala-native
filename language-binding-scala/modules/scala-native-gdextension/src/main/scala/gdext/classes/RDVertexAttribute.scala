package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `RDVertexAttribute`, extends `RefCounted`. */
abstract class RDVertexAttribute extends RefCounted {
  override def godotClassName: String = "RDVertexAttribute"

  /** RDVertexAttribute.set_binding */
  final def setBinding(p_member: Long): Unit = {
    if (gdext.classes.RDVertexAttribute.mb_set_binding == null) gdext.classes.RDVertexAttribute.mb_set_binding = MethodBind.get("RDVertexAttribute", "set_binding", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.RDVertexAttribute.mb_set_binding, livePtr, p_member)
  }

  /** RDVertexAttribute.get_binding */
  final def getBinding(): Long = {
    if (gdext.classes.RDVertexAttribute.mb_get_binding == null) gdext.classes.RDVertexAttribute.mb_get_binding = MethodBind.get("RDVertexAttribute", "get_binding", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RDVertexAttribute.mb_get_binding, livePtr)
  }

  /** RDVertexAttribute.set_location */
  final def setLocation(p_member: Long): Unit = {
    if (gdext.classes.RDVertexAttribute.mb_set_location == null) gdext.classes.RDVertexAttribute.mb_set_location = MethodBind.get("RDVertexAttribute", "set_location", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.RDVertexAttribute.mb_set_location, livePtr, p_member)
  }

  /** RDVertexAttribute.get_location */
  final def getLocation(): Long = {
    if (gdext.classes.RDVertexAttribute.mb_get_location == null) gdext.classes.RDVertexAttribute.mb_get_location = MethodBind.get("RDVertexAttribute", "get_location", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RDVertexAttribute.mb_get_location, livePtr)
  }

  /** RDVertexAttribute.set_offset */
  final def setOffset(p_member: Long): Unit = {
    if (gdext.classes.RDVertexAttribute.mb_set_offset == null) gdext.classes.RDVertexAttribute.mb_set_offset = MethodBind.get("RDVertexAttribute", "set_offset", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.RDVertexAttribute.mb_set_offset, livePtr, p_member)
  }

  /** RDVertexAttribute.get_offset */
  final def getOffset(): Long = {
    if (gdext.classes.RDVertexAttribute.mb_get_offset == null) gdext.classes.RDVertexAttribute.mb_get_offset = MethodBind.get("RDVertexAttribute", "get_offset", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RDVertexAttribute.mb_get_offset, livePtr)
  }

  /** RDVertexAttribute.set_format */
  final def setFormat(p_member: Long): Unit = {
    if (gdext.classes.RDVertexAttribute.mb_set_format == null) gdext.classes.RDVertexAttribute.mb_set_format = MethodBind.get("RDVertexAttribute", "set_format", 565531219L)
    Ptrcall.callVoid1(gdext.classes.RDVertexAttribute.mb_set_format, livePtr, p_member)
  }

  /** RDVertexAttribute.get_format */
  final def getFormat(): Long = {
    if (gdext.classes.RDVertexAttribute.mb_get_format == null) gdext.classes.RDVertexAttribute.mb_get_format = MethodBind.get("RDVertexAttribute", "get_format", 2235804183L)
    Ptrcall.call0[Long](gdext.classes.RDVertexAttribute.mb_get_format, livePtr)
  }

  /** RDVertexAttribute.set_stride */
  final def setStride(p_member: Long): Unit = {
    if (gdext.classes.RDVertexAttribute.mb_set_stride == null) gdext.classes.RDVertexAttribute.mb_set_stride = MethodBind.get("RDVertexAttribute", "set_stride", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.RDVertexAttribute.mb_set_stride, livePtr, p_member)
  }

  /** RDVertexAttribute.get_stride */
  final def getStride(): Long = {
    if (gdext.classes.RDVertexAttribute.mb_get_stride == null) gdext.classes.RDVertexAttribute.mb_get_stride = MethodBind.get("RDVertexAttribute", "get_stride", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RDVertexAttribute.mb_get_stride, livePtr)
  }

  /** RDVertexAttribute.set_frequency */
  final def setFrequency(p_member: Long): Unit = {
    if (gdext.classes.RDVertexAttribute.mb_set_frequency == null) gdext.classes.RDVertexAttribute.mb_set_frequency = MethodBind.get("RDVertexAttribute", "set_frequency", 522141836L)
    Ptrcall.callVoid1(gdext.classes.RDVertexAttribute.mb_set_frequency, livePtr, p_member)
  }

  /** RDVertexAttribute.get_frequency */
  final def getFrequency(): Long = {
    if (gdext.classes.RDVertexAttribute.mb_get_frequency == null) gdext.classes.RDVertexAttribute.mb_get_frequency = MethodBind.get("RDVertexAttribute", "get_frequency", 4154106413L)
    Ptrcall.call0[Long](gdext.classes.RDVertexAttribute.mb_get_frequency, livePtr)
  }

}

object RDVertexAttribute {
  private[classes] var mb_set_binding: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_binding: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_location: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_location: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_format: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_format: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_stride: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_stride: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_frequency: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_frequency: GDExtensionMethodBindPtr = null
}
