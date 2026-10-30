package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ConeTwistJoint3D`, extends `Joint3D`. */
abstract class ConeTwistJoint3D extends Joint3D {
  override def godotClassName: String = "ConeTwistJoint3D"

  /** ConeTwistJoint3D.set_param */
  final def setParam(param: gdext.classes.ConeTwistJoint3D.Param, value: Double): Unit = {
    if (gdext.classes.ConeTwistJoint3D.mb_set_param == null) gdext.classes.ConeTwistJoint3D.mb_set_param = MethodBind.get("ConeTwistJoint3D", "set_param", 1062470226L)
    Ptrcall.callVoid2(gdext.classes.ConeTwistJoint3D.mb_set_param, livePtr, param, value)
  }

  /** ConeTwistJoint3D.get_param */
  final def getParam(param: gdext.classes.ConeTwistJoint3D.Param): Double = {
    if (gdext.classes.ConeTwistJoint3D.mb_get_param == null) gdext.classes.ConeTwistJoint3D.mb_get_param = MethodBind.get("ConeTwistJoint3D", "get_param", 2928790850L)
    Ptrcall.call1[Long, Double](gdext.classes.ConeTwistJoint3D.mb_get_param, livePtr, param)
  }

}

object ConeTwistJoint3D {
  private[classes] var mb_set_param: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_param: GDExtensionMethodBindPtr = null

  /** Godot enum `ConeTwistJoint3D.Param`. */
  opaque type Param <: Long = Long

  object Param {
    final val SwingSpan: Param = 0L.asInstanceOf[Param]
    final val TwistSpan: Param = 1L.asInstanceOf[Param]
    final val Bias: Param = 2L.asInstanceOf[Param]
    final val Softness: Param = 3L.asInstanceOf[Param]
    final val Relaxation: Param = 4L.asInstanceOf[Param]
    final val Max: Param = 5L.asInstanceOf[Param]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Param = value.asInstanceOf[Param]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Param] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L).asInstanceOf[scala.IArray[Param]]

    extension (self: Param)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "SwingSpan"
        case 1L => "TwistSpan"
        case 2L => "Bias"
        case 3L => "Softness"
        case 4L => "Relaxation"
        case 5L => "Max"
        case other => other.toString
      }
  }
}
