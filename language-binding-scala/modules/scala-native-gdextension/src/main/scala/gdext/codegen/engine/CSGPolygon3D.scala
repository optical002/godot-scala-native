package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `CSGPolygon3D`, extends `CSGPrimitive3D`. */
abstract class CSGPolygon3D extends CSGPrimitive3D {

  /** CSGPolygon3D.set_mode */
  final def setMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CSGPolygon3D", "set_mode", 3158377035L), hostObject.objectPtr, mode)

  /** CSGPolygon3D.get_mode */
  final def getMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("CSGPolygon3D", "get_mode", 1201612222L), hostObject.objectPtr)

  /** CSGPolygon3D.set_depth */
  final def setDepth(depth: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CSGPolygon3D", "set_depth", 373806689L), hostObject.objectPtr, depth)

  /** CSGPolygon3D.get_depth */
  final def getDepth(): Double =
    Ptrcall.call0[Double](MethodBind.get("CSGPolygon3D", "get_depth", 1740695150L), hostObject.objectPtr)

  /** CSGPolygon3D.set_spin_degrees */
  final def setSpinDegrees(degrees: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CSGPolygon3D", "set_spin_degrees", 373806689L), hostObject.objectPtr, degrees)

  /** CSGPolygon3D.get_spin_degrees */
  final def getSpinDegrees(): Double =
    Ptrcall.call0[Double](MethodBind.get("CSGPolygon3D", "get_spin_degrees", 1740695150L), hostObject.objectPtr)

  /** CSGPolygon3D.set_spin_sides */
  final def setSpinSides(spin_sides: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CSGPolygon3D", "set_spin_sides", 1286410249L), hostObject.objectPtr, spin_sides)

  /** CSGPolygon3D.get_spin_sides */
  final def getSpinSides(): Long =
    Ptrcall.call0[Long](MethodBind.get("CSGPolygon3D", "get_spin_sides", 3905245786L), hostObject.objectPtr)

  /** CSGPolygon3D.set_path_interval_type */
  final def setPathIntervalType(interval_type: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CSGPolygon3D", "set_path_interval_type", 3744240707L), hostObject.objectPtr, interval_type)

  /** CSGPolygon3D.get_path_interval_type */
  final def getPathIntervalType(): Long =
    Ptrcall.call0[Long](MethodBind.get("CSGPolygon3D", "get_path_interval_type", 3434618397L), hostObject.objectPtr)

  /** CSGPolygon3D.set_path_interval */
  final def setPathInterval(interval: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CSGPolygon3D", "set_path_interval", 373806689L), hostObject.objectPtr, interval)

  /** CSGPolygon3D.get_path_interval */
  final def getPathInterval(): Double =
    Ptrcall.call0[Double](MethodBind.get("CSGPolygon3D", "get_path_interval", 1740695150L), hostObject.objectPtr)

  /** CSGPolygon3D.set_path_simplify_angle */
  final def setPathSimplifyAngle(degrees: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CSGPolygon3D", "set_path_simplify_angle", 373806689L), hostObject.objectPtr, degrees)

  /** CSGPolygon3D.get_path_simplify_angle */
  final def getPathSimplifyAngle(): Double =
    Ptrcall.call0[Double](MethodBind.get("CSGPolygon3D", "get_path_simplify_angle", 1740695150L), hostObject.objectPtr)

  /** CSGPolygon3D.set_path_rotation */
  final def setPathRotation(path_rotation: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CSGPolygon3D", "set_path_rotation", 1412947288L), hostObject.objectPtr, path_rotation)

  /** CSGPolygon3D.get_path_rotation */
  final def getPathRotation(): Long =
    Ptrcall.call0[Long](MethodBind.get("CSGPolygon3D", "get_path_rotation", 647219346L), hostObject.objectPtr)

  /** CSGPolygon3D.set_path_rotation_accurate */
  final def setPathRotationAccurate(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CSGPolygon3D", "set_path_rotation_accurate", 2586408642L), hostObject.objectPtr, enable)

  /** CSGPolygon3D.get_path_rotation_accurate */
  final def getPathRotationAccurate(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CSGPolygon3D", "get_path_rotation_accurate", 36873697L), hostObject.objectPtr)

  /** CSGPolygon3D.set_path_local */
  final def setPathLocal(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CSGPolygon3D", "set_path_local", 2586408642L), hostObject.objectPtr, enable)

  /** CSGPolygon3D.is_path_local */
  final def isPathLocal(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CSGPolygon3D", "is_path_local", 36873697L), hostObject.objectPtr)

  /** CSGPolygon3D.set_path_continuous_u */
  final def setPathContinuousU(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CSGPolygon3D", "set_path_continuous_u", 2586408642L), hostObject.objectPtr, enable)

  /** CSGPolygon3D.is_path_continuous_u */
  final def isPathContinuousU(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CSGPolygon3D", "is_path_continuous_u", 36873697L), hostObject.objectPtr)

  /** CSGPolygon3D.set_path_u_distance */
  final def setPathUDistance(distance: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CSGPolygon3D", "set_path_u_distance", 373806689L), hostObject.objectPtr, distance)

  /** CSGPolygon3D.get_path_u_distance */
  final def getPathUDistance(): Double =
    Ptrcall.call0[Double](MethodBind.get("CSGPolygon3D", "get_path_u_distance", 1740695150L), hostObject.objectPtr)

  /** CSGPolygon3D.set_path_joined */
  final def setPathJoined(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CSGPolygon3D", "set_path_joined", 2586408642L), hostObject.objectPtr, enable)

  /** CSGPolygon3D.is_path_joined */
  final def isPathJoined(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CSGPolygon3D", "is_path_joined", 36873697L), hostObject.objectPtr)

  /** CSGPolygon3D.set_material */
  final def setMaterial(material: Material): Unit =
    Ptrcall.callVoid1(MethodBind.get("CSGPolygon3D", "set_material", 2757459619L), hostObject.objectPtr, material.hostObject)

  /** CSGPolygon3D.get_material */
  final def getMaterial(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("CSGPolygon3D", "get_material", 5934680L), hostObject.objectPtr)

  /** CSGPolygon3D.set_smooth_faces */
  final def setSmoothFaces(smooth_faces: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CSGPolygon3D", "set_smooth_faces", 2586408642L), hostObject.objectPtr, smooth_faces)

  /** CSGPolygon3D.get_smooth_faces */
  final def getSmoothFaces(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CSGPolygon3D", "get_smooth_faces", 36873697L), hostObject.objectPtr)

}

object CSGPolygon3D {
  /** Class metadata for Gd[CSGPolygon3D] lifetime management and casting. */
  given GodotClass[CSGPolygon3D] with {
    def className = "CSGPolygon3D"
    def isRefCounted = false
    def wrap(o: GodotObject): CSGPolygon3D = new CSGPolygon3D {}.withHost(o.objectPtr)
    def unwrap(t: CSGPolygon3D): GodotObject = t.hostObject
  }
}
