package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `SplineIK3D`, extends `ChainIK3D`. */
abstract class SplineIK3D extends ChainIK3D {

  /** SplineIK3D.set_tilt_enabled */
  final def setTiltEnabled(index: Long, enabled: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("SplineIK3D", "set_tilt_enabled", 300928843L), hostObject.objectPtr, index, enabled)

  /** SplineIK3D.is_tilt_enabled */
  final def isTiltEnabled(index: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("SplineIK3D", "is_tilt_enabled", 1116898809L), hostObject.objectPtr, index)

  /** SplineIK3D.set_tilt_fade_in */
  final def setTiltFadeIn(index: Long, size: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("SplineIK3D", "set_tilt_fade_in", 3937882851L), hostObject.objectPtr, index, size)

  /** SplineIK3D.get_tilt_fade_in */
  final def getTiltFadeIn(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("SplineIK3D", "get_tilt_fade_in", 923996154L), hostObject.objectPtr, index)

  /** SplineIK3D.set_tilt_fade_out */
  final def setTiltFadeOut(index: Long, size: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("SplineIK3D", "set_tilt_fade_out", 3937882851L), hostObject.objectPtr, index, size)

  /** SplineIK3D.get_tilt_fade_out */
  final def getTiltFadeOut(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("SplineIK3D", "get_tilt_fade_out", 923996154L), hostObject.objectPtr, index)

}

object SplineIK3D {
  /** Class metadata for Gd[SplineIK3D] lifetime management and casting. */
  given GodotClass[SplineIK3D] with {
    def className = "SplineIK3D"
    def isRefCounted = false
    def wrap(o: GodotObject): SplineIK3D = new SplineIK3D {}.withHost(o.objectPtr)
    def unwrap(t: SplineIK3D): GodotObject = t.hostObject
  }
}
