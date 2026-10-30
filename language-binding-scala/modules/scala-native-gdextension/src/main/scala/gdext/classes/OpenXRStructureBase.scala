package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRStructureBase`, extends `RefCounted`. */
abstract class OpenXRStructureBase extends RefCounted {
  override def godotClassName: String = "OpenXRStructureBase"

  /** OpenXRStructureBase.get_structure_type */
  final def getStructureType(): Long = {
    if (gdext.classes.OpenXRStructureBase.mb_get_structure_type == null) gdext.classes.OpenXRStructureBase.mb_get_structure_type = MethodBind.get("OpenXRStructureBase", "get_structure_type", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.OpenXRStructureBase.mb_get_structure_type, livePtr)
  }

  /** OpenXRStructureBase.set_next */
  final def setNext(entity: OpenXRStructureBase): Unit = {
    if (gdext.classes.OpenXRStructureBase.mb_set_next == null) gdext.classes.OpenXRStructureBase.mb_set_next = MethodBind.get("OpenXRStructureBase", "set_next", 334698771L)
    Ptrcall.callVoid1(gdext.classes.OpenXRStructureBase.mb_set_next, livePtr, Wrappers.handle(entity))
  }

  /** OpenXRStructureBase.get_next. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getNext(): OpenXRStructureBase = {
    if (gdext.classes.OpenXRStructureBase.mb_get_next == null) gdext.classes.OpenXRStructureBase.mb_get_next = MethodBind.get("OpenXRStructureBase", "get_next", 2798796760L)
    Wrappers.owned[OpenXRStructureBase](Ptrcall.call0[Long](gdext.classes.OpenXRStructureBase.mb_get_next, livePtr))
  }

}

object OpenXRStructureBase {
  private[classes] var mb_get_structure_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_next: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_next: GDExtensionMethodBindPtr = null
}
