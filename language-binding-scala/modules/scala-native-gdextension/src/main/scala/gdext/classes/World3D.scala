package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `World3D`, extends `Resource`. */
abstract class World3D extends Resource {
  override def godotClassName: String = "World3D"

  /** World3D.set_environment */
  final def setEnvironment(env: Environment): Unit = {
    if (gdext.classes.World3D.mb_set_environment == null) gdext.classes.World3D.mb_set_environment = MethodBind.get("World3D", "set_environment", 4143518816L)
    Ptrcall.callVoid1(gdext.classes.World3D.mb_set_environment, livePtr, Wrappers.handle(env))
  }

  /** World3D.get_environment. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getEnvironment(): Environment = {
    if (gdext.classes.World3D.mb_get_environment == null) gdext.classes.World3D.mb_get_environment = MethodBind.get("World3D", "get_environment", 3082064660L)
    Wrappers.owned[Environment](Ptrcall.call0[Long](gdext.classes.World3D.mb_get_environment, livePtr))
  }

  /** World3D.set_fallback_environment */
  final def setFallbackEnvironment(env: Environment): Unit = {
    if (gdext.classes.World3D.mb_set_fallback_environment == null) gdext.classes.World3D.mb_set_fallback_environment = MethodBind.get("World3D", "set_fallback_environment", 4143518816L)
    Ptrcall.callVoid1(gdext.classes.World3D.mb_set_fallback_environment, livePtr, Wrappers.handle(env))
  }

  /** World3D.get_fallback_environment. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getFallbackEnvironment(): Environment = {
    if (gdext.classes.World3D.mb_get_fallback_environment == null) gdext.classes.World3D.mb_get_fallback_environment = MethodBind.get("World3D", "get_fallback_environment", 3082064660L)
    Wrappers.owned[Environment](Ptrcall.call0[Long](gdext.classes.World3D.mb_get_fallback_environment, livePtr))
  }

  /** World3D.set_camera_attributes */
  final def setCameraAttributes(attributes: CameraAttributes): Unit = {
    if (gdext.classes.World3D.mb_set_camera_attributes == null) gdext.classes.World3D.mb_set_camera_attributes = MethodBind.get("World3D", "set_camera_attributes", 2817810567L)
    Ptrcall.callVoid1(gdext.classes.World3D.mb_set_camera_attributes, livePtr, Wrappers.handle(attributes))
  }

  /** World3D.get_camera_attributes. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getCameraAttributes(): CameraAttributes = {
    if (gdext.classes.World3D.mb_get_camera_attributes == null) gdext.classes.World3D.mb_get_camera_attributes = MethodBind.get("World3D", "get_camera_attributes", 3921283215L)
    Wrappers.owned[CameraAttributes](Ptrcall.call0[Long](gdext.classes.World3D.mb_get_camera_attributes, livePtr))
  }

  /** World3D.get_direct_space_state */
  final def getDirectSpaceState(): PhysicsDirectSpaceState3D = {
    if (gdext.classes.World3D.mb_get_direct_space_state == null) gdext.classes.World3D.mb_get_direct_space_state = MethodBind.get("World3D", "get_direct_space_state", 2069328350L)
    Wrappers.borrowed[PhysicsDirectSpaceState3D](Ptrcall.call0[Long](gdext.classes.World3D.mb_get_direct_space_state, livePtr))
  }

}

object World3D {
  private[classes] var mb_set_environment: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_environment: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fallback_environment: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fallback_environment: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_camera_attributes: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_camera_attributes: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_direct_space_state: GDExtensionMethodBindPtr = null
}
