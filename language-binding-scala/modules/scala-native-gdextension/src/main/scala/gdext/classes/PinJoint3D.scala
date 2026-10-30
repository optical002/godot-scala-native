package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `PinJoint3D`, extends `Joint3D`. */
abstract class PinJoint3D extends Joint3D {
  override def godotClassName: String = "PinJoint3D"

  /** PinJoint3D.set_param */
  final def setParam(param: gdext.classes.PinJoint3D.Param, value: Double): Unit = {
    if (gdext.classes.PinJoint3D.mb_set_param == null) gdext.classes.PinJoint3D.mb_set_param = MethodBind.get("PinJoint3D", "set_param", 2059913726L)
    Ptrcall.callVoid2(gdext.classes.PinJoint3D.mb_set_param, livePtr, param, value)
  }

  /** PinJoint3D.get_param */
  final def getParam(param: gdext.classes.PinJoint3D.Param): Double = {
    if (gdext.classes.PinJoint3D.mb_get_param == null) gdext.classes.PinJoint3D.mb_get_param = MethodBind.get("PinJoint3D", "get_param", 1758438771L)
    Ptrcall.call1[Long, Double](gdext.classes.PinJoint3D.mb_get_param, livePtr, param)
  }

}

object PinJoint3D {
  private[classes] var mb_set_param: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_param: GDExtensionMethodBindPtr = null

  /** Godot enum `PinJoint3D.Param`. */
  opaque type Param <: Long = Long

  object Param {
    final val Bias: Param = 0L.asInstanceOf[Param]
    final val Damping: Param = 1L.asInstanceOf[Param]
    final val ImpulseClamp: Param = 2L.asInstanceOf[Param]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Param = value.asInstanceOf[Param]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Param] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[Param]]

    extension (self: Param)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Bias"
        case 1L => "Damping"
        case 2L => "ImpulseClamp"
        case other => other.toString
      }
  }
}
