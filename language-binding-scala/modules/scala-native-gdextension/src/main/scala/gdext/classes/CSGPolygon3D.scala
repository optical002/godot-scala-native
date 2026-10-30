package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `CSGPolygon3D`, extends `CSGPrimitive3D`. */
abstract class CSGPolygon3D extends CSGPrimitive3D {
  override def godotClassName: String = "CSGPolygon3D"

  /** CSGPolygon3D.set_mode */
  final def setMode(mode: gdext.classes.CSGPolygon3D.Mode): Unit = {
    if (gdext.classes.CSGPolygon3D.mb_set_mode == null) gdext.classes.CSGPolygon3D.mb_set_mode = MethodBind.get("CSGPolygon3D", "set_mode", 3158377035L)
    Ptrcall.callVoid1(gdext.classes.CSGPolygon3D.mb_set_mode, livePtr, mode)
  }

  /** CSGPolygon3D.get_mode */
  final def getMode(): gdext.classes.CSGPolygon3D.Mode = {
    if (gdext.classes.CSGPolygon3D.mb_get_mode == null) gdext.classes.CSGPolygon3D.mb_get_mode = MethodBind.get("CSGPolygon3D", "get_mode", 1201612222L)
    gdext.classes.CSGPolygon3D.Mode(Ptrcall.call0[Long](gdext.classes.CSGPolygon3D.mb_get_mode, livePtr))
  }

  /** CSGPolygon3D.set_depth */
  final def setDepth(depth: Double): Unit = {
    if (gdext.classes.CSGPolygon3D.mb_set_depth == null) gdext.classes.CSGPolygon3D.mb_set_depth = MethodBind.get("CSGPolygon3D", "set_depth", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CSGPolygon3D.mb_set_depth, livePtr, depth)
  }

  /** CSGPolygon3D.get_depth */
  final def getDepth(): Double = {
    if (gdext.classes.CSGPolygon3D.mb_get_depth == null) gdext.classes.CSGPolygon3D.mb_get_depth = MethodBind.get("CSGPolygon3D", "get_depth", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CSGPolygon3D.mb_get_depth, livePtr)
  }

  /** CSGPolygon3D.set_spin_degrees */
  final def setSpinDegrees(degrees: Double): Unit = {
    if (gdext.classes.CSGPolygon3D.mb_set_spin_degrees == null) gdext.classes.CSGPolygon3D.mb_set_spin_degrees = MethodBind.get("CSGPolygon3D", "set_spin_degrees", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CSGPolygon3D.mb_set_spin_degrees, livePtr, degrees)
  }

  /** CSGPolygon3D.get_spin_degrees */
  final def getSpinDegrees(): Double = {
    if (gdext.classes.CSGPolygon3D.mb_get_spin_degrees == null) gdext.classes.CSGPolygon3D.mb_get_spin_degrees = MethodBind.get("CSGPolygon3D", "get_spin_degrees", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CSGPolygon3D.mb_get_spin_degrees, livePtr)
  }

  /** CSGPolygon3D.set_spin_sides */
  final def setSpinSides(spinSides: Long): Unit = {
    if (gdext.classes.CSGPolygon3D.mb_set_spin_sides == null) gdext.classes.CSGPolygon3D.mb_set_spin_sides = MethodBind.get("CSGPolygon3D", "set_spin_sides", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.CSGPolygon3D.mb_set_spin_sides, livePtr, spinSides)
  }

  /** CSGPolygon3D.get_spin_sides */
  final def getSpinSides(): Long = {
    if (gdext.classes.CSGPolygon3D.mb_get_spin_sides == null) gdext.classes.CSGPolygon3D.mb_get_spin_sides = MethodBind.get("CSGPolygon3D", "get_spin_sides", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.CSGPolygon3D.mb_get_spin_sides, livePtr)
  }

  /** CSGPolygon3D.set_path_interval_type */
  final def setPathIntervalType(intervalType: gdext.classes.CSGPolygon3D.PathIntervalType): Unit = {
    if (gdext.classes.CSGPolygon3D.mb_set_path_interval_type == null) gdext.classes.CSGPolygon3D.mb_set_path_interval_type = MethodBind.get("CSGPolygon3D", "set_path_interval_type", 3744240707L)
    Ptrcall.callVoid1(gdext.classes.CSGPolygon3D.mb_set_path_interval_type, livePtr, intervalType)
  }

  /** CSGPolygon3D.get_path_interval_type */
  final def getPathIntervalType(): gdext.classes.CSGPolygon3D.PathIntervalType = {
    if (gdext.classes.CSGPolygon3D.mb_get_path_interval_type == null) gdext.classes.CSGPolygon3D.mb_get_path_interval_type = MethodBind.get("CSGPolygon3D", "get_path_interval_type", 3434618397L)
    gdext.classes.CSGPolygon3D.PathIntervalType(Ptrcall.call0[Long](gdext.classes.CSGPolygon3D.mb_get_path_interval_type, livePtr))
  }

  /** CSGPolygon3D.set_path_interval */
  final def setPathInterval(interval: Double): Unit = {
    if (gdext.classes.CSGPolygon3D.mb_set_path_interval == null) gdext.classes.CSGPolygon3D.mb_set_path_interval = MethodBind.get("CSGPolygon3D", "set_path_interval", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CSGPolygon3D.mb_set_path_interval, livePtr, interval)
  }

  /** CSGPolygon3D.get_path_interval */
  final def getPathInterval(): Double = {
    if (gdext.classes.CSGPolygon3D.mb_get_path_interval == null) gdext.classes.CSGPolygon3D.mb_get_path_interval = MethodBind.get("CSGPolygon3D", "get_path_interval", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CSGPolygon3D.mb_get_path_interval, livePtr)
  }

  /** CSGPolygon3D.set_path_simplify_angle */
  final def setPathSimplifyAngle(degrees: Double): Unit = {
    if (gdext.classes.CSGPolygon3D.mb_set_path_simplify_angle == null) gdext.classes.CSGPolygon3D.mb_set_path_simplify_angle = MethodBind.get("CSGPolygon3D", "set_path_simplify_angle", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CSGPolygon3D.mb_set_path_simplify_angle, livePtr, degrees)
  }

  /** CSGPolygon3D.get_path_simplify_angle */
  final def getPathSimplifyAngle(): Double = {
    if (gdext.classes.CSGPolygon3D.mb_get_path_simplify_angle == null) gdext.classes.CSGPolygon3D.mb_get_path_simplify_angle = MethodBind.get("CSGPolygon3D", "get_path_simplify_angle", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CSGPolygon3D.mb_get_path_simplify_angle, livePtr)
  }

  /** CSGPolygon3D.set_path_rotation */
  final def setPathRotation(pathRotation: gdext.classes.CSGPolygon3D.PathRotation): Unit = {
    if (gdext.classes.CSGPolygon3D.mb_set_path_rotation == null) gdext.classes.CSGPolygon3D.mb_set_path_rotation = MethodBind.get("CSGPolygon3D", "set_path_rotation", 1412947288L)
    Ptrcall.callVoid1(gdext.classes.CSGPolygon3D.mb_set_path_rotation, livePtr, pathRotation)
  }

  /** CSGPolygon3D.get_path_rotation */
  final def getPathRotation(): gdext.classes.CSGPolygon3D.PathRotation = {
    if (gdext.classes.CSGPolygon3D.mb_get_path_rotation == null) gdext.classes.CSGPolygon3D.mb_get_path_rotation = MethodBind.get("CSGPolygon3D", "get_path_rotation", 647219346L)
    gdext.classes.CSGPolygon3D.PathRotation(Ptrcall.call0[Long](gdext.classes.CSGPolygon3D.mb_get_path_rotation, livePtr))
  }

  /** CSGPolygon3D.set_path_rotation_accurate */
  final def setPathRotationAccurate(enable: Boolean): Unit = {
    if (gdext.classes.CSGPolygon3D.mb_set_path_rotation_accurate == null) gdext.classes.CSGPolygon3D.mb_set_path_rotation_accurate = MethodBind.get("CSGPolygon3D", "set_path_rotation_accurate", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CSGPolygon3D.mb_set_path_rotation_accurate, livePtr, enable)
  }

  /** CSGPolygon3D.get_path_rotation_accurate */
  final def getPathRotationAccurate(): Boolean = {
    if (gdext.classes.CSGPolygon3D.mb_get_path_rotation_accurate == null) gdext.classes.CSGPolygon3D.mb_get_path_rotation_accurate = MethodBind.get("CSGPolygon3D", "get_path_rotation_accurate", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CSGPolygon3D.mb_get_path_rotation_accurate, livePtr)
  }

  /** CSGPolygon3D.set_path_local */
  final def setPathLocal(enable: Boolean): Unit = {
    if (gdext.classes.CSGPolygon3D.mb_set_path_local == null) gdext.classes.CSGPolygon3D.mb_set_path_local = MethodBind.get("CSGPolygon3D", "set_path_local", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CSGPolygon3D.mb_set_path_local, livePtr, enable)
  }

  /** CSGPolygon3D.is_path_local */
  final def isPathLocal(): Boolean = {
    if (gdext.classes.CSGPolygon3D.mb_is_path_local == null) gdext.classes.CSGPolygon3D.mb_is_path_local = MethodBind.get("CSGPolygon3D", "is_path_local", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CSGPolygon3D.mb_is_path_local, livePtr)
  }

  /** CSGPolygon3D.set_path_continuous_u */
  final def setPathContinuousU(enable: Boolean): Unit = {
    if (gdext.classes.CSGPolygon3D.mb_set_path_continuous_u == null) gdext.classes.CSGPolygon3D.mb_set_path_continuous_u = MethodBind.get("CSGPolygon3D", "set_path_continuous_u", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CSGPolygon3D.mb_set_path_continuous_u, livePtr, enable)
  }

  /** CSGPolygon3D.is_path_continuous_u */
  final def isPathContinuousU(): Boolean = {
    if (gdext.classes.CSGPolygon3D.mb_is_path_continuous_u == null) gdext.classes.CSGPolygon3D.mb_is_path_continuous_u = MethodBind.get("CSGPolygon3D", "is_path_continuous_u", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CSGPolygon3D.mb_is_path_continuous_u, livePtr)
  }

  /** CSGPolygon3D.set_path_u_distance */
  final def setPathUDistance(distance: Double): Unit = {
    if (gdext.classes.CSGPolygon3D.mb_set_path_u_distance == null) gdext.classes.CSGPolygon3D.mb_set_path_u_distance = MethodBind.get("CSGPolygon3D", "set_path_u_distance", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CSGPolygon3D.mb_set_path_u_distance, livePtr, distance)
  }

  /** CSGPolygon3D.get_path_u_distance */
  final def getPathUDistance(): Double = {
    if (gdext.classes.CSGPolygon3D.mb_get_path_u_distance == null) gdext.classes.CSGPolygon3D.mb_get_path_u_distance = MethodBind.get("CSGPolygon3D", "get_path_u_distance", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CSGPolygon3D.mb_get_path_u_distance, livePtr)
  }

  /** CSGPolygon3D.set_path_joined */
  final def setPathJoined(enable: Boolean): Unit = {
    if (gdext.classes.CSGPolygon3D.mb_set_path_joined == null) gdext.classes.CSGPolygon3D.mb_set_path_joined = MethodBind.get("CSGPolygon3D", "set_path_joined", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CSGPolygon3D.mb_set_path_joined, livePtr, enable)
  }

  /** CSGPolygon3D.is_path_joined */
  final def isPathJoined(): Boolean = {
    if (gdext.classes.CSGPolygon3D.mb_is_path_joined == null) gdext.classes.CSGPolygon3D.mb_is_path_joined = MethodBind.get("CSGPolygon3D", "is_path_joined", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CSGPolygon3D.mb_is_path_joined, livePtr)
  }

  /** CSGPolygon3D.set_material */
  final def setMaterial(material: Material): Unit = {
    if (gdext.classes.CSGPolygon3D.mb_set_material == null) gdext.classes.CSGPolygon3D.mb_set_material = MethodBind.get("CSGPolygon3D", "set_material", 2757459619L)
    Ptrcall.callVoid1(gdext.classes.CSGPolygon3D.mb_set_material, livePtr, Wrappers.handle(material))
  }

  /** CSGPolygon3D.get_material. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getMaterial(): Material = {
    if (gdext.classes.CSGPolygon3D.mb_get_material == null) gdext.classes.CSGPolygon3D.mb_get_material = MethodBind.get("CSGPolygon3D", "get_material", 5934680L)
    Wrappers.owned[Material](Ptrcall.call0[Long](gdext.classes.CSGPolygon3D.mb_get_material, livePtr))
  }

  /** CSGPolygon3D.set_smooth_faces */
  final def setSmoothFaces(smoothFaces: Boolean): Unit = {
    if (gdext.classes.CSGPolygon3D.mb_set_smooth_faces == null) gdext.classes.CSGPolygon3D.mb_set_smooth_faces = MethodBind.get("CSGPolygon3D", "set_smooth_faces", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CSGPolygon3D.mb_set_smooth_faces, livePtr, smoothFaces)
  }

  /** CSGPolygon3D.get_smooth_faces */
  final def getSmoothFaces(): Boolean = {
    if (gdext.classes.CSGPolygon3D.mb_get_smooth_faces == null) gdext.classes.CSGPolygon3D.mb_get_smooth_faces = MethodBind.get("CSGPolygon3D", "get_smooth_faces", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CSGPolygon3D.mb_get_smooth_faces, livePtr)
  }

}

object CSGPolygon3D {
  private[classes] var mb_set_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_depth: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_depth: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_spin_degrees: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_spin_degrees: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_spin_sides: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_spin_sides: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_path_interval_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_path_interval_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_path_interval: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_path_interval: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_path_simplify_angle: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_path_simplify_angle: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_path_rotation: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_path_rotation: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_path_rotation_accurate: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_path_rotation_accurate: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_path_local: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_path_local: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_path_continuous_u: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_path_continuous_u: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_path_u_distance: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_path_u_distance: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_path_joined: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_path_joined: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_material: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_material: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_smooth_faces: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_smooth_faces: GDExtensionMethodBindPtr = null

  /** Godot enum `CSGPolygon3D.Mode`. */
  opaque type Mode <: Long = Long

  object Mode {
    final val Depth: Mode = 0L.asInstanceOf[Mode]
    final val Spin: Mode = 1L.asInstanceOf[Mode]
    final val Path: Mode = 2L.asInstanceOf[Mode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Mode = value.asInstanceOf[Mode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Mode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[Mode]]

    extension (self: Mode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Depth"
        case 1L => "Spin"
        case 2L => "Path"
        case other => other.toString
      }
  }

  /** Godot enum `CSGPolygon3D.PathRotation`. */
  opaque type PathRotation <: Long = Long

  object PathRotation {
    final val Polygon: PathRotation = 0L.asInstanceOf[PathRotation]
    final val Path: PathRotation = 1L.asInstanceOf[PathRotation]
    final val PathFollow: PathRotation = 2L.asInstanceOf[PathRotation]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): PathRotation = value.asInstanceOf[PathRotation]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[PathRotation] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[PathRotation]]

    extension (self: PathRotation)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Polygon"
        case 1L => "Path"
        case 2L => "PathFollow"
        case other => other.toString
      }
  }

  /** Godot enum `CSGPolygon3D.PathIntervalType`. */
  opaque type PathIntervalType <: Long = Long

  object PathIntervalType {
    final val Distance: PathIntervalType = 0L.asInstanceOf[PathIntervalType]
    final val Subdivide: PathIntervalType = 1L.asInstanceOf[PathIntervalType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): PathIntervalType = value.asInstanceOf[PathIntervalType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[PathIntervalType] = scala.IArray[Long](0L, 1L).asInstanceOf[scala.IArray[PathIntervalType]]

    extension (self: PathIntervalType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Distance"
        case 1L => "Subdivide"
        case other => other.toString
      }
  }
}
