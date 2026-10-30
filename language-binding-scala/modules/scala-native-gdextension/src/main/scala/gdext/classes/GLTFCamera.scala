package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `GLTFCamera`, extends `Resource`. */
abstract class GLTFCamera extends Resource {
  override def godotClassName: String = "GLTFCamera"

  /** GLTFCamera.to_node */
  final def toNode(): Camera3D = {
    if (gdext.classes.GLTFCamera.mb_to_node == null) gdext.classes.GLTFCamera.mb_to_node = MethodBind.get("GLTFCamera", "to_node", 2285090890L)
    Wrappers.borrowed[Camera3D](Ptrcall.call0[Long](gdext.classes.GLTFCamera.mb_to_node, livePtr))
  }

  /** GLTFCamera.get_perspective */
  final def getPerspective(): Boolean = {
    if (gdext.classes.GLTFCamera.mb_get_perspective == null) gdext.classes.GLTFCamera.mb_get_perspective = MethodBind.get("GLTFCamera", "get_perspective", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.GLTFCamera.mb_get_perspective, livePtr)
  }

  /** GLTFCamera.set_perspective */
  final def setPerspective(perspective: Boolean): Unit = {
    if (gdext.classes.GLTFCamera.mb_set_perspective == null) gdext.classes.GLTFCamera.mb_set_perspective = MethodBind.get("GLTFCamera", "set_perspective", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.GLTFCamera.mb_set_perspective, livePtr, perspective)
  }

  /** GLTFCamera.get_fov */
  final def getFov(): Double = {
    if (gdext.classes.GLTFCamera.mb_get_fov == null) gdext.classes.GLTFCamera.mb_get_fov = MethodBind.get("GLTFCamera", "get_fov", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.GLTFCamera.mb_get_fov, livePtr)
  }

  /** GLTFCamera.set_fov */
  final def setFov(fov: Double): Unit = {
    if (gdext.classes.GLTFCamera.mb_set_fov == null) gdext.classes.GLTFCamera.mb_set_fov = MethodBind.get("GLTFCamera", "set_fov", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GLTFCamera.mb_set_fov, livePtr, fov)
  }

  /** GLTFCamera.get_size_mag */
  final def getSizeMag(): Double = {
    if (gdext.classes.GLTFCamera.mb_get_size_mag == null) gdext.classes.GLTFCamera.mb_get_size_mag = MethodBind.get("GLTFCamera", "get_size_mag", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.GLTFCamera.mb_get_size_mag, livePtr)
  }

  /** GLTFCamera.set_size_mag */
  final def setSizeMag(sizeMag: Double): Unit = {
    if (gdext.classes.GLTFCamera.mb_set_size_mag == null) gdext.classes.GLTFCamera.mb_set_size_mag = MethodBind.get("GLTFCamera", "set_size_mag", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GLTFCamera.mb_set_size_mag, livePtr, sizeMag)
  }

  /** GLTFCamera.get_depth_far */
  final def getDepthFar(): Double = {
    if (gdext.classes.GLTFCamera.mb_get_depth_far == null) gdext.classes.GLTFCamera.mb_get_depth_far = MethodBind.get("GLTFCamera", "get_depth_far", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.GLTFCamera.mb_get_depth_far, livePtr)
  }

  /** GLTFCamera.set_depth_far */
  final def setDepthFar(zdepthFar: Double): Unit = {
    if (gdext.classes.GLTFCamera.mb_set_depth_far == null) gdext.classes.GLTFCamera.mb_set_depth_far = MethodBind.get("GLTFCamera", "set_depth_far", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GLTFCamera.mb_set_depth_far, livePtr, zdepthFar)
  }

  /** GLTFCamera.get_depth_near */
  final def getDepthNear(): Double = {
    if (gdext.classes.GLTFCamera.mb_get_depth_near == null) gdext.classes.GLTFCamera.mb_get_depth_near = MethodBind.get("GLTFCamera", "get_depth_near", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.GLTFCamera.mb_get_depth_near, livePtr)
  }

  /** GLTFCamera.set_depth_near */
  final def setDepthNear(zdepthNear: Double): Unit = {
    if (gdext.classes.GLTFCamera.mb_set_depth_near == null) gdext.classes.GLTFCamera.mb_set_depth_near = MethodBind.get("GLTFCamera", "set_depth_near", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GLTFCamera.mb_set_depth_near, livePtr, zdepthNear)
  }

}

object GLTFCamera {
  private[classes] var mb_from_node: GDExtensionMethodBindPtr = null
  private[classes] var mb_to_node: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_perspective: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_perspective: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fov: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fov: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_size_mag: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_size_mag: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_depth_far: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_depth_far: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_depth_near: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_depth_near: GDExtensionMethodBindPtr = null

  /** GLTFCamera.from_node. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def fromNode(cameraNode: Camera3D): GLTFCamera = {
    if (gdext.classes.GLTFCamera.mb_from_node == null) gdext.classes.GLTFCamera.mb_from_node = MethodBind.get("GLTFCamera", "from_node", 237784L)
    Wrappers.owned[GLTFCamera](Ptrcall.call1[GodotObject, Long](gdext.classes.GLTFCamera.mb_from_node, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], Wrappers.handle(cameraNode)))
  }
}
