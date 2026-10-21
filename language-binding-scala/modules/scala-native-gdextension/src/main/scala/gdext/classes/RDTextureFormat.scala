package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `RDTextureFormat`, extends `RefCounted`. */
abstract class RDTextureFormat extends RefCounted {
  override def godotClassName: String = "RDTextureFormat"

  /** RDTextureFormat.set_format */
  final def setFormat(p_member: Long): Unit = {
    if (gdext.classes.RDTextureFormat.mb_set_format == null) gdext.classes.RDTextureFormat.mb_set_format = MethodBind.get("RDTextureFormat", "set_format", 565531219L)
    Ptrcall.callVoid1(gdext.classes.RDTextureFormat.mb_set_format, livePtr, p_member)
  }

  /** RDTextureFormat.get_format */
  final def getFormat(): Long = {
    if (gdext.classes.RDTextureFormat.mb_get_format == null) gdext.classes.RDTextureFormat.mb_get_format = MethodBind.get("RDTextureFormat", "get_format", 2235804183L)
    Ptrcall.call0[Long](gdext.classes.RDTextureFormat.mb_get_format, livePtr)
  }

  /** RDTextureFormat.set_width */
  final def setWidth(p_member: Long): Unit = {
    if (gdext.classes.RDTextureFormat.mb_set_width == null) gdext.classes.RDTextureFormat.mb_set_width = MethodBind.get("RDTextureFormat", "set_width", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.RDTextureFormat.mb_set_width, livePtr, p_member)
  }

  /** RDTextureFormat.get_width */
  final def getWidth(): Long = {
    if (gdext.classes.RDTextureFormat.mb_get_width == null) gdext.classes.RDTextureFormat.mb_get_width = MethodBind.get("RDTextureFormat", "get_width", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RDTextureFormat.mb_get_width, livePtr)
  }

  /** RDTextureFormat.set_height */
  final def setHeight(p_member: Long): Unit = {
    if (gdext.classes.RDTextureFormat.mb_set_height == null) gdext.classes.RDTextureFormat.mb_set_height = MethodBind.get("RDTextureFormat", "set_height", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.RDTextureFormat.mb_set_height, livePtr, p_member)
  }

  /** RDTextureFormat.get_height */
  final def getHeight(): Long = {
    if (gdext.classes.RDTextureFormat.mb_get_height == null) gdext.classes.RDTextureFormat.mb_get_height = MethodBind.get("RDTextureFormat", "get_height", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RDTextureFormat.mb_get_height, livePtr)
  }

  /** RDTextureFormat.set_depth */
  final def setDepth(p_member: Long): Unit = {
    if (gdext.classes.RDTextureFormat.mb_set_depth == null) gdext.classes.RDTextureFormat.mb_set_depth = MethodBind.get("RDTextureFormat", "set_depth", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.RDTextureFormat.mb_set_depth, livePtr, p_member)
  }

  /** RDTextureFormat.get_depth */
  final def getDepth(): Long = {
    if (gdext.classes.RDTextureFormat.mb_get_depth == null) gdext.classes.RDTextureFormat.mb_get_depth = MethodBind.get("RDTextureFormat", "get_depth", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RDTextureFormat.mb_get_depth, livePtr)
  }

  /** RDTextureFormat.set_array_layers */
  final def setArrayLayers(p_member: Long): Unit = {
    if (gdext.classes.RDTextureFormat.mb_set_array_layers == null) gdext.classes.RDTextureFormat.mb_set_array_layers = MethodBind.get("RDTextureFormat", "set_array_layers", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.RDTextureFormat.mb_set_array_layers, livePtr, p_member)
  }

  /** RDTextureFormat.get_array_layers */
  final def getArrayLayers(): Long = {
    if (gdext.classes.RDTextureFormat.mb_get_array_layers == null) gdext.classes.RDTextureFormat.mb_get_array_layers = MethodBind.get("RDTextureFormat", "get_array_layers", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RDTextureFormat.mb_get_array_layers, livePtr)
  }

  /** RDTextureFormat.set_mipmaps */
  final def setMipmaps(p_member: Long): Unit = {
    if (gdext.classes.RDTextureFormat.mb_set_mipmaps == null) gdext.classes.RDTextureFormat.mb_set_mipmaps = MethodBind.get("RDTextureFormat", "set_mipmaps", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.RDTextureFormat.mb_set_mipmaps, livePtr, p_member)
  }

  /** RDTextureFormat.get_mipmaps */
  final def getMipmaps(): Long = {
    if (gdext.classes.RDTextureFormat.mb_get_mipmaps == null) gdext.classes.RDTextureFormat.mb_get_mipmaps = MethodBind.get("RDTextureFormat", "get_mipmaps", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RDTextureFormat.mb_get_mipmaps, livePtr)
  }

  /** RDTextureFormat.set_texture_type */
  final def setTextureType(p_member: Long): Unit = {
    if (gdext.classes.RDTextureFormat.mb_set_texture_type == null) gdext.classes.RDTextureFormat.mb_set_texture_type = MethodBind.get("RDTextureFormat", "set_texture_type", 652343381L)
    Ptrcall.callVoid1(gdext.classes.RDTextureFormat.mb_set_texture_type, livePtr, p_member)
  }

  /** RDTextureFormat.get_texture_type */
  final def getTextureType(): Long = {
    if (gdext.classes.RDTextureFormat.mb_get_texture_type == null) gdext.classes.RDTextureFormat.mb_get_texture_type = MethodBind.get("RDTextureFormat", "get_texture_type", 4036357416L)
    Ptrcall.call0[Long](gdext.classes.RDTextureFormat.mb_get_texture_type, livePtr)
  }

  /** RDTextureFormat.set_samples */
  final def setSamples(p_member: Long): Unit = {
    if (gdext.classes.RDTextureFormat.mb_set_samples == null) gdext.classes.RDTextureFormat.mb_set_samples = MethodBind.get("RDTextureFormat", "set_samples", 3774171498L)
    Ptrcall.callVoid1(gdext.classes.RDTextureFormat.mb_set_samples, livePtr, p_member)
  }

  /** RDTextureFormat.get_samples */
  final def getSamples(): Long = {
    if (gdext.classes.RDTextureFormat.mb_get_samples == null) gdext.classes.RDTextureFormat.mb_get_samples = MethodBind.get("RDTextureFormat", "get_samples", 407791724L)
    Ptrcall.call0[Long](gdext.classes.RDTextureFormat.mb_get_samples, livePtr)
  }

  /** RDTextureFormat.set_usage_bits */
  final def setUsageBits(p_member: Long): Unit = {
    if (gdext.classes.RDTextureFormat.mb_set_usage_bits == null) gdext.classes.RDTextureFormat.mb_set_usage_bits = MethodBind.get("RDTextureFormat", "set_usage_bits", 245642367L)
    Ptrcall.callVoid1(gdext.classes.RDTextureFormat.mb_set_usage_bits, livePtr, p_member)
  }

  /** RDTextureFormat.get_usage_bits */
  final def getUsageBits(): Long = {
    if (gdext.classes.RDTextureFormat.mb_get_usage_bits == null) gdext.classes.RDTextureFormat.mb_get_usage_bits = MethodBind.get("RDTextureFormat", "get_usage_bits", 1313398998L)
    Ptrcall.call0[Long](gdext.classes.RDTextureFormat.mb_get_usage_bits, livePtr)
  }

  /** RDTextureFormat.set_is_resolve_buffer */
  final def setIsResolveBuffer(p_member: Boolean): Unit = {
    if (gdext.classes.RDTextureFormat.mb_set_is_resolve_buffer == null) gdext.classes.RDTextureFormat.mb_set_is_resolve_buffer = MethodBind.get("RDTextureFormat", "set_is_resolve_buffer", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RDTextureFormat.mb_set_is_resolve_buffer, livePtr, p_member)
  }

  /** RDTextureFormat.get_is_resolve_buffer */
  final def getIsResolveBuffer(): Boolean = {
    if (gdext.classes.RDTextureFormat.mb_get_is_resolve_buffer == null) gdext.classes.RDTextureFormat.mb_get_is_resolve_buffer = MethodBind.get("RDTextureFormat", "get_is_resolve_buffer", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RDTextureFormat.mb_get_is_resolve_buffer, livePtr)
  }

  /** RDTextureFormat.set_is_discardable */
  final def setIsDiscardable(p_member: Boolean): Unit = {
    if (gdext.classes.RDTextureFormat.mb_set_is_discardable == null) gdext.classes.RDTextureFormat.mb_set_is_discardable = MethodBind.get("RDTextureFormat", "set_is_discardable", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RDTextureFormat.mb_set_is_discardable, livePtr, p_member)
  }

  /** RDTextureFormat.get_is_discardable */
  final def getIsDiscardable(): Boolean = {
    if (gdext.classes.RDTextureFormat.mb_get_is_discardable == null) gdext.classes.RDTextureFormat.mb_get_is_discardable = MethodBind.get("RDTextureFormat", "get_is_discardable", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RDTextureFormat.mb_get_is_discardable, livePtr)
  }

  /** RDTextureFormat.add_shareable_format */
  final def addShareableFormat(format: Long): Unit = {
    if (gdext.classes.RDTextureFormat.mb_add_shareable_format == null) gdext.classes.RDTextureFormat.mb_add_shareable_format = MethodBind.get("RDTextureFormat", "add_shareable_format", 565531219L)
    Ptrcall.callVoid1(gdext.classes.RDTextureFormat.mb_add_shareable_format, livePtr, format)
  }

  /** RDTextureFormat.remove_shareable_format */
  final def removeShareableFormat(format: Long): Unit = {
    if (gdext.classes.RDTextureFormat.mb_remove_shareable_format == null) gdext.classes.RDTextureFormat.mb_remove_shareable_format = MethodBind.get("RDTextureFormat", "remove_shareable_format", 565531219L)
    Ptrcall.callVoid1(gdext.classes.RDTextureFormat.mb_remove_shareable_format, livePtr, format)
  }

}

object RDTextureFormat {
  private[classes] var mb_set_format: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_format: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_depth: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_depth: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_array_layers: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_array_layers: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_mipmaps: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_mipmaps: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_texture_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_samples: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_samples: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_usage_bits: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_usage_bits: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_is_resolve_buffer: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_is_resolve_buffer: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_is_discardable: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_is_discardable: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_shareable_format: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_shareable_format: GDExtensionMethodBindPtr = null
}
