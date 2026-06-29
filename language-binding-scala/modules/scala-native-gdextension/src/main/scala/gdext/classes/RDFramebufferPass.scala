package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `RDFramebufferPass`, extends `RefCounted`. */
abstract class RDFramebufferPass extends RefCounted {
  override def godotClassName: String = "RDFramebufferPass"

  /** RDFramebufferPass.set_depth_attachment */
  final def setDepthAttachment(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDFramebufferPass", "set_depth_attachment", 1286410249L), hostObject.objectPtr, p_member)

  /** RDFramebufferPass.get_depth_attachment */
  final def getDepthAttachment(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDFramebufferPass", "get_depth_attachment", 3905245786L), hostObject.objectPtr)

}
