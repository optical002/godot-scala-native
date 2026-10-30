package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `NavigationPathQueryResult3D`, extends `RefCounted`. */
abstract class NavigationPathQueryResult3D extends RefCounted {
  override def godotClassName: String = "NavigationPathQueryResult3D"

  /** NavigationPathQueryResult3D.set_path_length */
  final def setPathLength(length: Double): Unit = {
    if (gdext.classes.NavigationPathQueryResult3D.mb_set_path_length == null) gdext.classes.NavigationPathQueryResult3D.mb_set_path_length = MethodBind.get("NavigationPathQueryResult3D", "set_path_length", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationPathQueryResult3D.mb_set_path_length, livePtr, length)
  }

  /** NavigationPathQueryResult3D.get_path_length */
  final def getPathLength(): Double = {
    if (gdext.classes.NavigationPathQueryResult3D.mb_get_path_length == null) gdext.classes.NavigationPathQueryResult3D.mb_get_path_length = MethodBind.get("NavigationPathQueryResult3D", "get_path_length", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationPathQueryResult3D.mb_get_path_length, livePtr)
  }

  /** NavigationPathQueryResult3D.reset */
  final def reset(): Unit = {
    if (gdext.classes.NavigationPathQueryResult3D.mb_reset == null) gdext.classes.NavigationPathQueryResult3D.mb_reset = MethodBind.get("NavigationPathQueryResult3D", "reset", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.NavigationPathQueryResult3D.mb_reset, livePtr)
  }

}

object NavigationPathQueryResult3D {
  private[classes] var mb_set_path_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_path_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_reset: GDExtensionMethodBindPtr = null

  /** Godot enum `NavigationPathQueryResult3D.PathSegmentType`. */
  opaque type PathSegmentType <: Long = Long

  object PathSegmentType {
    final val Region: PathSegmentType = 0L.asInstanceOf[PathSegmentType]
    final val Link: PathSegmentType = 1L.asInstanceOf[PathSegmentType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): PathSegmentType = value.asInstanceOf[PathSegmentType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[PathSegmentType] = scala.IArray[Long](0L, 1L).asInstanceOf[scala.IArray[PathSegmentType]]

    extension (self: PathSegmentType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Region"
        case 1L => "Link"
        case other => other.toString
      }
  }
}
