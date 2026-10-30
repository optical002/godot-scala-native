package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `GrooveJoint2D`, extends `Joint2D`. */
abstract class GrooveJoint2D extends Joint2D {
  override def godotClassName: String = "GrooveJoint2D"

  /** GrooveJoint2D.set_length */
  final def setLength(length: Double): Unit = {
    if (gdext.classes.GrooveJoint2D.mb_set_length == null) gdext.classes.GrooveJoint2D.mb_set_length = MethodBind.get("GrooveJoint2D", "set_length", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GrooveJoint2D.mb_set_length, livePtr, length)
  }

  /** GrooveJoint2D.get_length */
  final def getLength(): Double = {
    if (gdext.classes.GrooveJoint2D.mb_get_length == null) gdext.classes.GrooveJoint2D.mb_get_length = MethodBind.get("GrooveJoint2D", "get_length", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.GrooveJoint2D.mb_get_length, livePtr)
  }

  /** GrooveJoint2D.set_initial_offset */
  final def setInitialOffset(offset: Double): Unit = {
    if (gdext.classes.GrooveJoint2D.mb_set_initial_offset == null) gdext.classes.GrooveJoint2D.mb_set_initial_offset = MethodBind.get("GrooveJoint2D", "set_initial_offset", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GrooveJoint2D.mb_set_initial_offset, livePtr, offset)
  }

  /** GrooveJoint2D.get_initial_offset */
  final def getInitialOffset(): Double = {
    if (gdext.classes.GrooveJoint2D.mb_get_initial_offset == null) gdext.classes.GrooveJoint2D.mb_get_initial_offset = MethodBind.get("GrooveJoint2D", "get_initial_offset", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.GrooveJoint2D.mb_get_initial_offset, livePtr)
  }

}

object GrooveJoint2D {
  private[classes] var mb_set_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_initial_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_initial_offset: GDExtensionMethodBindPtr = null
}
