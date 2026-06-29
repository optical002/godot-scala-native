package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `RDUniform`, extends `RefCounted`. */
abstract class RDUniform extends RefCounted {
  override def godotClassName: String = "RDUniform"

  /** RDUniform.set_uniform_type */
  final def setUniformType(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDUniform", "set_uniform_type", 1664894931L), hostObject.objectPtr, p_member)

  /** RDUniform.get_uniform_type */
  final def getUniformType(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDUniform", "get_uniform_type", 475470040L), hostObject.objectPtr)

  /** RDUniform.set_binding */
  final def setBinding(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDUniform", "set_binding", 1286410249L), hostObject.objectPtr, p_member)

  /** RDUniform.get_binding */
  final def getBinding(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDUniform", "get_binding", 3905245786L), hostObject.objectPtr)

  /** RDUniform.clear_ids */
  final def clearIds(): Unit =
    Ptrcall.callVoid0(MethodBind.get("RDUniform", "clear_ids", 3218959716L), hostObject.objectPtr)

}
