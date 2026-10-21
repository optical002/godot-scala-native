package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `CSGPolygon3D`, extends `CSGPrimitive3D`. */
abstract class CSGPolygon3D extends CSGPrimitive3D {
  override def godotClassName: String = "CSGPolygon3D"

  /** CSGPolygon3D.set_mode */
  final def setMode(mode: Long): Unit = {
    if (gdext.classes.CSGPolygon3D.mb_set_mode == null) gdext.classes.CSGPolygon3D.mb_set_mode = MethodBind.get("CSGPolygon3D", "set_mode", 3158377035L)
    Ptrcall.callVoid1(gdext.classes.CSGPolygon3D.mb_set_mode, livePtr, mode)
  }

  /** CSGPolygon3D.get_mode */
  final def getMode(): Long = {
    if (gdext.classes.CSGPolygon3D.mb_get_mode == null) gdext.classes.CSGPolygon3D.mb_get_mode = MethodBind.get("CSGPolygon3D", "get_mode", 1201612222L)
    Ptrcall.call0[Long](gdext.classes.CSGPolygon3D.mb_get_mode, livePtr)
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
  final def setSpinSides(spin_sides: Long): Unit = {
    if (gdext.classes.CSGPolygon3D.mb_set_spin_sides == null) gdext.classes.CSGPolygon3D.mb_set_spin_sides = MethodBind.get("CSGPolygon3D", "set_spin_sides", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.CSGPolygon3D.mb_set_spin_sides, livePtr, spin_sides)
  }

  /** CSGPolygon3D.get_spin_sides */
  final def getSpinSides(): Long = {
    if (gdext.classes.CSGPolygon3D.mb_get_spin_sides == null) gdext.classes.CSGPolygon3D.mb_get_spin_sides = MethodBind.get("CSGPolygon3D", "get_spin_sides", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.CSGPolygon3D.mb_get_spin_sides, livePtr)
  }

  /** CSGPolygon3D.set_path_interval_type */
  final def setPathIntervalType(interval_type: Long): Unit = {
    if (gdext.classes.CSGPolygon3D.mb_set_path_interval_type == null) gdext.classes.CSGPolygon3D.mb_set_path_interval_type = MethodBind.get("CSGPolygon3D", "set_path_interval_type", 3744240707L)
    Ptrcall.callVoid1(gdext.classes.CSGPolygon3D.mb_set_path_interval_type, livePtr, interval_type)
  }

  /** CSGPolygon3D.get_path_interval_type */
  final def getPathIntervalType(): Long = {
    if (gdext.classes.CSGPolygon3D.mb_get_path_interval_type == null) gdext.classes.CSGPolygon3D.mb_get_path_interval_type = MethodBind.get("CSGPolygon3D", "get_path_interval_type", 3434618397L)
    Ptrcall.call0[Long](gdext.classes.CSGPolygon3D.mb_get_path_interval_type, livePtr)
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
  final def setPathRotation(path_rotation: Long): Unit = {
    if (gdext.classes.CSGPolygon3D.mb_set_path_rotation == null) gdext.classes.CSGPolygon3D.mb_set_path_rotation = MethodBind.get("CSGPolygon3D", "set_path_rotation", 1412947288L)
    Ptrcall.callVoid1(gdext.classes.CSGPolygon3D.mb_set_path_rotation, livePtr, path_rotation)
  }

  /** CSGPolygon3D.get_path_rotation */
  final def getPathRotation(): Long = {
    if (gdext.classes.CSGPolygon3D.mb_get_path_rotation == null) gdext.classes.CSGPolygon3D.mb_get_path_rotation = MethodBind.get("CSGPolygon3D", "get_path_rotation", 647219346L)
    Ptrcall.call0[Long](gdext.classes.CSGPolygon3D.mb_get_path_rotation, livePtr)
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
  final def setSmoothFaces(smooth_faces: Boolean): Unit = {
    if (gdext.classes.CSGPolygon3D.mb_set_smooth_faces == null) gdext.classes.CSGPolygon3D.mb_set_smooth_faces = MethodBind.get("CSGPolygon3D", "set_smooth_faces", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CSGPolygon3D.mb_set_smooth_faces, livePtr, smooth_faces)
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
}
