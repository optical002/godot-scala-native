package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `RDTextureView`, extends `RefCounted`. */
abstract class RDTextureView extends RefCounted {

  /** RDTextureView.set_format_override */
  final def setFormatOverride(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDTextureView", "set_format_override", 565531219L), hostObject.objectPtr, p_member)

  /** RDTextureView.get_format_override */
  final def getFormatOverride(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDTextureView", "get_format_override", 2235804183L), hostObject.objectPtr)

  /** RDTextureView.set_swizzle_r */
  final def setSwizzleR(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDTextureView", "set_swizzle_r", 3833362581L), hostObject.objectPtr, p_member)

  /** RDTextureView.get_swizzle_r */
  final def getSwizzleR(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDTextureView", "get_swizzle_r", 4150792614L), hostObject.objectPtr)

  /** RDTextureView.set_swizzle_g */
  final def setSwizzleG(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDTextureView", "set_swizzle_g", 3833362581L), hostObject.objectPtr, p_member)

  /** RDTextureView.get_swizzle_g */
  final def getSwizzleG(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDTextureView", "get_swizzle_g", 4150792614L), hostObject.objectPtr)

  /** RDTextureView.set_swizzle_b */
  final def setSwizzleB(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDTextureView", "set_swizzle_b", 3833362581L), hostObject.objectPtr, p_member)

  /** RDTextureView.get_swizzle_b */
  final def getSwizzleB(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDTextureView", "get_swizzle_b", 4150792614L), hostObject.objectPtr)

  /** RDTextureView.set_swizzle_a */
  final def setSwizzleA(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDTextureView", "set_swizzle_a", 3833362581L), hostObject.objectPtr, p_member)

  /** RDTextureView.get_swizzle_a */
  final def getSwizzleA(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDTextureView", "get_swizzle_a", 4150792614L), hostObject.objectPtr)

}

object RDTextureView {
  /** Class metadata for Gd[RDTextureView] lifetime management and casting. */
  given GodotClass[RDTextureView] with {
    def className = "RDTextureView"
    def isRefCounted = true
    def wrap(o: GodotObject): RDTextureView = new RDTextureView {}.withHost(o.objectPtr)
    def unwrap(t: RDTextureView): GodotObject = t.hostObject
  }
}
