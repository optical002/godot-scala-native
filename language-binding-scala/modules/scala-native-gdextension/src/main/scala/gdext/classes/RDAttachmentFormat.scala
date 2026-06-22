package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `RDAttachmentFormat`, extends `RefCounted`. */
abstract class RDAttachmentFormat extends RefCounted {

  /** RDAttachmentFormat.set_format */
  final def setFormat(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDAttachmentFormat", "set_format", 565531219L), hostObject.objectPtr, p_member)

  /** RDAttachmentFormat.get_format */
  final def getFormat(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDAttachmentFormat", "get_format", 2235804183L), hostObject.objectPtr)

  /** RDAttachmentFormat.set_samples */
  final def setSamples(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDAttachmentFormat", "set_samples", 3774171498L), hostObject.objectPtr, p_member)

  /** RDAttachmentFormat.get_samples */
  final def getSamples(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDAttachmentFormat", "get_samples", 407791724L), hostObject.objectPtr)

  /** RDAttachmentFormat.set_usage_flags */
  final def setUsageFlags(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDAttachmentFormat", "set_usage_flags", 1286410249L), hostObject.objectPtr, p_member)

  /** RDAttachmentFormat.get_usage_flags */
  final def getUsageFlags(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDAttachmentFormat", "get_usage_flags", 3905245786L), hostObject.objectPtr)

}

object RDAttachmentFormat {
  /** Class metadata for Gd[RDAttachmentFormat] lifetime management and casting. */
  given GodotClass[RDAttachmentFormat] with {
    def className = "RDAttachmentFormat"
    def isRefCounted = true
    def wrap(o: GodotObject): RDAttachmentFormat = new RDAttachmentFormat {}.withHost(o.objectPtr)
    def unwrap(t: RDAttachmentFormat): GodotObject = t.hostObject
  }
}
