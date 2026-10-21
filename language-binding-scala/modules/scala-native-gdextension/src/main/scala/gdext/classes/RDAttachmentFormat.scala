package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `RDAttachmentFormat`, extends `RefCounted`. */
abstract class RDAttachmentFormat extends RefCounted {
  override def godotClassName: String = "RDAttachmentFormat"

  /** RDAttachmentFormat.set_format */
  final def setFormat(p_member: Long): Unit = {
    if (gdext.classes.RDAttachmentFormat.mb_set_format == null) gdext.classes.RDAttachmentFormat.mb_set_format = MethodBind.get("RDAttachmentFormat", "set_format", 565531219L)
    Ptrcall.callVoid1(gdext.classes.RDAttachmentFormat.mb_set_format, livePtr, p_member)
  }

  /** RDAttachmentFormat.get_format */
  final def getFormat(): Long = {
    if (gdext.classes.RDAttachmentFormat.mb_get_format == null) gdext.classes.RDAttachmentFormat.mb_get_format = MethodBind.get("RDAttachmentFormat", "get_format", 2235804183L)
    Ptrcall.call0[Long](gdext.classes.RDAttachmentFormat.mb_get_format, livePtr)
  }

  /** RDAttachmentFormat.set_samples */
  final def setSamples(p_member: Long): Unit = {
    if (gdext.classes.RDAttachmentFormat.mb_set_samples == null) gdext.classes.RDAttachmentFormat.mb_set_samples = MethodBind.get("RDAttachmentFormat", "set_samples", 3774171498L)
    Ptrcall.callVoid1(gdext.classes.RDAttachmentFormat.mb_set_samples, livePtr, p_member)
  }

  /** RDAttachmentFormat.get_samples */
  final def getSamples(): Long = {
    if (gdext.classes.RDAttachmentFormat.mb_get_samples == null) gdext.classes.RDAttachmentFormat.mb_get_samples = MethodBind.get("RDAttachmentFormat", "get_samples", 407791724L)
    Ptrcall.call0[Long](gdext.classes.RDAttachmentFormat.mb_get_samples, livePtr)
  }

  /** RDAttachmentFormat.set_usage_flags */
  final def setUsageFlags(p_member: Long): Unit = {
    if (gdext.classes.RDAttachmentFormat.mb_set_usage_flags == null) gdext.classes.RDAttachmentFormat.mb_set_usage_flags = MethodBind.get("RDAttachmentFormat", "set_usage_flags", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.RDAttachmentFormat.mb_set_usage_flags, livePtr, p_member)
  }

  /** RDAttachmentFormat.get_usage_flags */
  final def getUsageFlags(): Long = {
    if (gdext.classes.RDAttachmentFormat.mb_get_usage_flags == null) gdext.classes.RDAttachmentFormat.mb_get_usage_flags = MethodBind.get("RDAttachmentFormat", "get_usage_flags", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RDAttachmentFormat.mb_get_usage_flags, livePtr)
  }

}

object RDAttachmentFormat {
  private[classes] var mb_set_format: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_format: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_samples: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_samples: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_usage_flags: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_usage_flags: GDExtensionMethodBindPtr = null
}
