package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `GLTFCamera`, extends `Resource`. */
abstract class GLTFCamera extends Resource {

  /** GLTFCamera.to_node */
  final def toNode(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("GLTFCamera", "to_node", 2285090890L), hostObject.objectPtr)

  /** GLTFCamera.get_perspective */
  final def getPerspective(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("GLTFCamera", "get_perspective", 36873697L), hostObject.objectPtr)

  /** GLTFCamera.set_perspective */
  final def setPerspective(perspective: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFCamera", "set_perspective", 2586408642L), hostObject.objectPtr, perspective)

  /** GLTFCamera.get_fov */
  final def getFov(): Double =
    Ptrcall.call0[Double](MethodBind.get("GLTFCamera", "get_fov", 1740695150L), hostObject.objectPtr)

  /** GLTFCamera.set_fov */
  final def setFov(fov: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFCamera", "set_fov", 373806689L), hostObject.objectPtr, fov)

  /** GLTFCamera.get_size_mag */
  final def getSizeMag(): Double =
    Ptrcall.call0[Double](MethodBind.get("GLTFCamera", "get_size_mag", 1740695150L), hostObject.objectPtr)

  /** GLTFCamera.set_size_mag */
  final def setSizeMag(size_mag: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFCamera", "set_size_mag", 373806689L), hostObject.objectPtr, size_mag)

  /** GLTFCamera.get_depth_far */
  final def getDepthFar(): Double =
    Ptrcall.call0[Double](MethodBind.get("GLTFCamera", "get_depth_far", 1740695150L), hostObject.objectPtr)

  /** GLTFCamera.set_depth_far */
  final def setDepthFar(zdepth_far: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFCamera", "set_depth_far", 373806689L), hostObject.objectPtr, zdepth_far)

  /** GLTFCamera.get_depth_near */
  final def getDepthNear(): Double =
    Ptrcall.call0[Double](MethodBind.get("GLTFCamera", "get_depth_near", 1740695150L), hostObject.objectPtr)

  /** GLTFCamera.set_depth_near */
  final def setDepthNear(zdepth_near: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFCamera", "set_depth_near", 373806689L), hostObject.objectPtr, zdepth_near)

}

object GLTFCamera {
  /** Class metadata for Gd[GLTFCamera] lifetime management and casting. */
  given GodotClass[GLTFCamera] with {
    def className = "GLTFCamera"
    def isRefCounted = true
    def wrap(o: GodotObject): GLTFCamera = new GLTFCamera {}.withHost(o.objectPtr)
    def unwrap(t: GLTFCamera): GodotObject = t.hostObject
  }
}
