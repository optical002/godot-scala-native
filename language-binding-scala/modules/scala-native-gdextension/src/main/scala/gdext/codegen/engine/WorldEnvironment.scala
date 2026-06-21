package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `WorldEnvironment`, extends `Node`. */
abstract class WorldEnvironment extends Node {

  /** WorldEnvironment.set_environment */
  final def setEnvironment(env: Environment): Unit =
    Ptrcall.callVoid1(MethodBind.get("WorldEnvironment", "set_environment", 4143518816L), hostObject.objectPtr, env.hostObject)

  /** WorldEnvironment.get_environment */
  final def getEnvironment(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("WorldEnvironment", "get_environment", 3082064660L), hostObject.objectPtr)

  /** WorldEnvironment.set_camera_attributes */
  final def setCameraAttributes(camera_attributes: CameraAttributes): Unit =
    Ptrcall.callVoid1(MethodBind.get("WorldEnvironment", "set_camera_attributes", 2817810567L), hostObject.objectPtr, camera_attributes.hostObject)

  /** WorldEnvironment.get_camera_attributes */
  final def getCameraAttributes(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("WorldEnvironment", "get_camera_attributes", 3921283215L), hostObject.objectPtr)

  /** WorldEnvironment.set_compositor */
  final def setCompositor(compositor: Compositor): Unit =
    Ptrcall.callVoid1(MethodBind.get("WorldEnvironment", "set_compositor", 1586754307L), hostObject.objectPtr, compositor.hostObject)

  /** WorldEnvironment.get_compositor */
  final def getCompositor(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("WorldEnvironment", "get_compositor", 3647707413L), hostObject.objectPtr)

}

object WorldEnvironment {
  /** Class metadata for Gd[WorldEnvironment] lifetime management and casting. */
  given GodotClass[WorldEnvironment] with {
    def className = "WorldEnvironment"
    def isRefCounted = false
    def wrap(o: GodotObject): WorldEnvironment = new WorldEnvironment {}.withHost(o.objectPtr)
    def unwrap(t: WorldEnvironment): GodotObject = t.hostObject
  }
}
