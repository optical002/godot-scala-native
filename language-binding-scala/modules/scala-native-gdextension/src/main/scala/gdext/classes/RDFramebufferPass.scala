package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `RDFramebufferPass`, extends `RefCounted`. */
abstract class RDFramebufferPass extends RefCounted {
  override def godotClassName: String = "RDFramebufferPass"

  /** RDFramebufferPass.set_depth_attachment */
  final def setDepthAttachment(pMember: Long): Unit = {
    if (gdext.classes.RDFramebufferPass.mb_set_depth_attachment == null) gdext.classes.RDFramebufferPass.mb_set_depth_attachment = MethodBind.get("RDFramebufferPass", "set_depth_attachment", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.RDFramebufferPass.mb_set_depth_attachment, livePtr, pMember)
  }

  /** RDFramebufferPass.get_depth_attachment */
  final def getDepthAttachment(): Long = {
    if (gdext.classes.RDFramebufferPass.mb_get_depth_attachment == null) gdext.classes.RDFramebufferPass.mb_get_depth_attachment = MethodBind.get("RDFramebufferPass", "get_depth_attachment", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RDFramebufferPass.mb_get_depth_attachment, livePtr)
  }

}

object RDFramebufferPass {
  private[classes] var mb_set_depth_attachment: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_depth_attachment: GDExtensionMethodBindPtr = null
}
