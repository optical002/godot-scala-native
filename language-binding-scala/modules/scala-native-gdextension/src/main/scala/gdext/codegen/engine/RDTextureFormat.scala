package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `RDTextureFormat`, extends `RefCounted`. */
abstract class RDTextureFormat extends RefCounted {

  /** RDTextureFormat.set_format */
  final def setFormat(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDTextureFormat", "set_format", 565531219L), hostObject.objectPtr, p_member)

  /** RDTextureFormat.get_format */
  final def getFormat(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDTextureFormat", "get_format", 2235804183L), hostObject.objectPtr)

  /** RDTextureFormat.set_width */
  final def setWidth(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDTextureFormat", "set_width", 1286410249L), hostObject.objectPtr, p_member)

  /** RDTextureFormat.get_width */
  final def getWidth(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDTextureFormat", "get_width", 3905245786L), hostObject.objectPtr)

  /** RDTextureFormat.set_height */
  final def setHeight(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDTextureFormat", "set_height", 1286410249L), hostObject.objectPtr, p_member)

  /** RDTextureFormat.get_height */
  final def getHeight(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDTextureFormat", "get_height", 3905245786L), hostObject.objectPtr)

  /** RDTextureFormat.set_depth */
  final def setDepth(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDTextureFormat", "set_depth", 1286410249L), hostObject.objectPtr, p_member)

  /** RDTextureFormat.get_depth */
  final def getDepth(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDTextureFormat", "get_depth", 3905245786L), hostObject.objectPtr)

  /** RDTextureFormat.set_array_layers */
  final def setArrayLayers(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDTextureFormat", "set_array_layers", 1286410249L), hostObject.objectPtr, p_member)

  /** RDTextureFormat.get_array_layers */
  final def getArrayLayers(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDTextureFormat", "get_array_layers", 3905245786L), hostObject.objectPtr)

  /** RDTextureFormat.set_mipmaps */
  final def setMipmaps(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDTextureFormat", "set_mipmaps", 1286410249L), hostObject.objectPtr, p_member)

  /** RDTextureFormat.get_mipmaps */
  final def getMipmaps(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDTextureFormat", "get_mipmaps", 3905245786L), hostObject.objectPtr)

  /** RDTextureFormat.set_texture_type */
  final def setTextureType(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDTextureFormat", "set_texture_type", 652343381L), hostObject.objectPtr, p_member)

  /** RDTextureFormat.get_texture_type */
  final def getTextureType(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDTextureFormat", "get_texture_type", 4036357416L), hostObject.objectPtr)

  /** RDTextureFormat.set_samples */
  final def setSamples(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDTextureFormat", "set_samples", 3774171498L), hostObject.objectPtr, p_member)

  /** RDTextureFormat.get_samples */
  final def getSamples(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDTextureFormat", "get_samples", 407791724L), hostObject.objectPtr)

  /** RDTextureFormat.set_usage_bits */
  final def setUsageBits(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDTextureFormat", "set_usage_bits", 245642367L), hostObject.objectPtr, p_member)

  /** RDTextureFormat.get_usage_bits */
  final def getUsageBits(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDTextureFormat", "get_usage_bits", 1313398998L), hostObject.objectPtr)

  /** RDTextureFormat.set_is_resolve_buffer */
  final def setIsResolveBuffer(p_member: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDTextureFormat", "set_is_resolve_buffer", 2586408642L), hostObject.objectPtr, p_member)

  /** RDTextureFormat.get_is_resolve_buffer */
  final def getIsResolveBuffer(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RDTextureFormat", "get_is_resolve_buffer", 36873697L), hostObject.objectPtr)

  /** RDTextureFormat.set_is_discardable */
  final def setIsDiscardable(p_member: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDTextureFormat", "set_is_discardable", 2586408642L), hostObject.objectPtr, p_member)

  /** RDTextureFormat.get_is_discardable */
  final def getIsDiscardable(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RDTextureFormat", "get_is_discardable", 36873697L), hostObject.objectPtr)

  /** RDTextureFormat.add_shareable_format */
  final def addShareableFormat(format: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDTextureFormat", "add_shareable_format", 565531219L), hostObject.objectPtr, format)

  /** RDTextureFormat.remove_shareable_format */
  final def removeShareableFormat(format: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDTextureFormat", "remove_shareable_format", 565531219L), hostObject.objectPtr, format)

}

object RDTextureFormat {
  /** Class metadata for Gd[RDTextureFormat] lifetime management and casting. */
  given GodotClass[RDTextureFormat] with {
    def className = "RDTextureFormat"
    def isRefCounted = true
    def wrap(o: GodotObject): RDTextureFormat = new RDTextureFormat {}.withHost(o.objectPtr)
    def unwrap(t: RDTextureFormat): GodotObject = t.hostObject
  }
}
