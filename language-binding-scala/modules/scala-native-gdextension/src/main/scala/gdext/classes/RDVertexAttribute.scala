package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `RDVertexAttribute`, extends `RefCounted`. */
abstract class RDVertexAttribute extends RefCounted {

  /** RDVertexAttribute.set_binding */
  final def setBinding(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDVertexAttribute", "set_binding", 1286410249L), hostObject.objectPtr, p_member)

  /** RDVertexAttribute.get_binding */
  final def getBinding(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDVertexAttribute", "get_binding", 3905245786L), hostObject.objectPtr)

  /** RDVertexAttribute.set_location */
  final def setLocation(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDVertexAttribute", "set_location", 1286410249L), hostObject.objectPtr, p_member)

  /** RDVertexAttribute.get_location */
  final def getLocation(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDVertexAttribute", "get_location", 3905245786L), hostObject.objectPtr)

  /** RDVertexAttribute.set_offset */
  final def setOffset(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDVertexAttribute", "set_offset", 1286410249L), hostObject.objectPtr, p_member)

  /** RDVertexAttribute.get_offset */
  final def getOffset(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDVertexAttribute", "get_offset", 3905245786L), hostObject.objectPtr)

  /** RDVertexAttribute.set_format */
  final def setFormat(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDVertexAttribute", "set_format", 565531219L), hostObject.objectPtr, p_member)

  /** RDVertexAttribute.get_format */
  final def getFormat(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDVertexAttribute", "get_format", 2235804183L), hostObject.objectPtr)

  /** RDVertexAttribute.set_stride */
  final def setStride(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDVertexAttribute", "set_stride", 1286410249L), hostObject.objectPtr, p_member)

  /** RDVertexAttribute.get_stride */
  final def getStride(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDVertexAttribute", "get_stride", 3905245786L), hostObject.objectPtr)

  /** RDVertexAttribute.set_frequency */
  final def setFrequency(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDVertexAttribute", "set_frequency", 522141836L), hostObject.objectPtr, p_member)

  /** RDVertexAttribute.get_frequency */
  final def getFrequency(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDVertexAttribute", "get_frequency", 4154106413L), hostObject.objectPtr)

}

object RDVertexAttribute {
  /** Class metadata for Gd[RDVertexAttribute] lifetime management and casting. */
  given GodotClass[RDVertexAttribute] with {
    def className = "RDVertexAttribute"
    def isRefCounted = true
    def wrap(o: GodotObject): RDVertexAttribute = new RDVertexAttribute {}.withHost(o.objectPtr)
    def unwrap(t: RDVertexAttribute): GodotObject = t.hostObject
  }
}
