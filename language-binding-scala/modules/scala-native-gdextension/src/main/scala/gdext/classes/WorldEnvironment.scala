package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `WorldEnvironment`, extends `Node`. */
abstract class WorldEnvironment extends Node {
  override def godotClassName: String = "WorldEnvironment"

  /** WorldEnvironment.set_environment */
  final def setEnvironment(env: Environment): Unit = {
    if (gdext.classes.WorldEnvironment.mb_set_environment == null) gdext.classes.WorldEnvironment.mb_set_environment = MethodBind.get("WorldEnvironment", "set_environment", 4143518816L)
    Ptrcall.callVoid1(gdext.classes.WorldEnvironment.mb_set_environment, livePtr, Wrappers.handle(env))
  }

  /** WorldEnvironment.get_environment. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getEnvironment(): Environment = {
    if (gdext.classes.WorldEnvironment.mb_get_environment == null) gdext.classes.WorldEnvironment.mb_get_environment = MethodBind.get("WorldEnvironment", "get_environment", 3082064660L)
    Wrappers.owned[Environment](Ptrcall.call0[Long](gdext.classes.WorldEnvironment.mb_get_environment, livePtr))
  }

  /** WorldEnvironment.set_camera_attributes */
  final def setCameraAttributes(cameraAttributes: CameraAttributes): Unit = {
    if (gdext.classes.WorldEnvironment.mb_set_camera_attributes == null) gdext.classes.WorldEnvironment.mb_set_camera_attributes = MethodBind.get("WorldEnvironment", "set_camera_attributes", 2817810567L)
    Ptrcall.callVoid1(gdext.classes.WorldEnvironment.mb_set_camera_attributes, livePtr, Wrappers.handle(cameraAttributes))
  }

  /** WorldEnvironment.get_camera_attributes. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getCameraAttributes(): CameraAttributes = {
    if (gdext.classes.WorldEnvironment.mb_get_camera_attributes == null) gdext.classes.WorldEnvironment.mb_get_camera_attributes = MethodBind.get("WorldEnvironment", "get_camera_attributes", 3921283215L)
    Wrappers.owned[CameraAttributes](Ptrcall.call0[Long](gdext.classes.WorldEnvironment.mb_get_camera_attributes, livePtr))
  }

  /** WorldEnvironment.set_compositor */
  final def setCompositor(compositor: Compositor): Unit = {
    if (gdext.classes.WorldEnvironment.mb_set_compositor == null) gdext.classes.WorldEnvironment.mb_set_compositor = MethodBind.get("WorldEnvironment", "set_compositor", 1586754307L)
    Ptrcall.callVoid1(gdext.classes.WorldEnvironment.mb_set_compositor, livePtr, Wrappers.handle(compositor))
  }

  /** WorldEnvironment.get_compositor. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getCompositor(): Compositor = {
    if (gdext.classes.WorldEnvironment.mb_get_compositor == null) gdext.classes.WorldEnvironment.mb_get_compositor = MethodBind.get("WorldEnvironment", "get_compositor", 3647707413L)
    Wrappers.owned[Compositor](Ptrcall.call0[Long](gdext.classes.WorldEnvironment.mb_get_compositor, livePtr))
  }

}

object WorldEnvironment {
  private[classes] var mb_set_environment: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_environment: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_camera_attributes: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_camera_attributes: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_compositor: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_compositor: GDExtensionMethodBindPtr = null
}
