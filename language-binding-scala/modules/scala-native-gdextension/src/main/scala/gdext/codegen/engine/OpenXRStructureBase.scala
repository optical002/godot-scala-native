package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRStructureBase`, extends `RefCounted`. */
abstract class OpenXRStructureBase extends RefCounted {

  /** OpenXRStructureBase.get_structure_type */
  final def getStructureType(): Long =
    Ptrcall.call0[Long](MethodBind.get("OpenXRStructureBase", "get_structure_type", 2455072627L), hostObject.objectPtr)

  /** OpenXRStructureBase.set_next */
  final def setNext(entity: OpenXRStructureBase): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRStructureBase", "set_next", 334698771L), hostObject.objectPtr, entity.hostObject)

  /** OpenXRStructureBase.get_next */
  final def getNext(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("OpenXRStructureBase", "get_next", 2798796760L), hostObject.objectPtr)

}

object OpenXRStructureBase {
  /** Class metadata for Gd[OpenXRStructureBase] lifetime management and casting. */
  given GodotClass[OpenXRStructureBase] with {
    def className = "OpenXRStructureBase"
    def isRefCounted = true
    def wrap(o: GodotObject): OpenXRStructureBase = new OpenXRStructureBase {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRStructureBase): GodotObject = t.hostObject
  }
}
