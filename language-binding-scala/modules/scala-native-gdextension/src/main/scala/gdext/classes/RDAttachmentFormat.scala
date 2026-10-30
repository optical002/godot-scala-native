package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `RDAttachmentFormat`, extends `RefCounted`. */
abstract class RDAttachmentFormat extends RefCounted {
  override def godotClassName: String = "RDAttachmentFormat"

  /** RDAttachmentFormat.set_format */
  final def setFormat(pMember: gdext.classes.RenderingDevice.DataFormat): Unit = {
    if (gdext.classes.RDAttachmentFormat.mb_set_format == null) gdext.classes.RDAttachmentFormat.mb_set_format = MethodBind.get("RDAttachmentFormat", "set_format", 565531219L)
    Ptrcall.callVoid1(gdext.classes.RDAttachmentFormat.mb_set_format, livePtr, pMember)
  }

  /** RDAttachmentFormat.get_format */
  final def getFormat(): gdext.classes.RenderingDevice.DataFormat = {
    if (gdext.classes.RDAttachmentFormat.mb_get_format == null) gdext.classes.RDAttachmentFormat.mb_get_format = MethodBind.get("RDAttachmentFormat", "get_format", 2235804183L)
    gdext.classes.RenderingDevice.DataFormat(Ptrcall.call0[Long](gdext.classes.RDAttachmentFormat.mb_get_format, livePtr))
  }

  /** RDAttachmentFormat.set_samples */
  final def setSamples(pMember: gdext.classes.RenderingDevice.TextureSamples): Unit = {
    if (gdext.classes.RDAttachmentFormat.mb_set_samples == null) gdext.classes.RDAttachmentFormat.mb_set_samples = MethodBind.get("RDAttachmentFormat", "set_samples", 3774171498L)
    Ptrcall.callVoid1(gdext.classes.RDAttachmentFormat.mb_set_samples, livePtr, pMember)
  }

  /** RDAttachmentFormat.get_samples */
  final def getSamples(): gdext.classes.RenderingDevice.TextureSamples = {
    if (gdext.classes.RDAttachmentFormat.mb_get_samples == null) gdext.classes.RDAttachmentFormat.mb_get_samples = MethodBind.get("RDAttachmentFormat", "get_samples", 407791724L)
    gdext.classes.RenderingDevice.TextureSamples(Ptrcall.call0[Long](gdext.classes.RDAttachmentFormat.mb_get_samples, livePtr))
  }

  /** RDAttachmentFormat.set_usage_flags */
  final def setUsageFlags(pMember: Long): Unit = {
    if (gdext.classes.RDAttachmentFormat.mb_set_usage_flags == null) gdext.classes.RDAttachmentFormat.mb_set_usage_flags = MethodBind.get("RDAttachmentFormat", "set_usage_flags", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.RDAttachmentFormat.mb_set_usage_flags, livePtr, pMember)
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
