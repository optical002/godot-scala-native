package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `World3D`, extends `Resource`. */
abstract class World3D extends Resource {

  /** World3D.set_environment */
  final def setEnvironment(env: Environment): Unit =
    Ptrcall.callVoid1(MethodBind.get("World3D", "set_environment", 4143518816L), hostObject.objectPtr, env.hostObject)

  /** World3D.get_environment */
  final def getEnvironment(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("World3D", "get_environment", 3082064660L), hostObject.objectPtr)

  /** World3D.set_fallback_environment */
  final def setFallbackEnvironment(env: Environment): Unit =
    Ptrcall.callVoid1(MethodBind.get("World3D", "set_fallback_environment", 4143518816L), hostObject.objectPtr, env.hostObject)

  /** World3D.get_fallback_environment */
  final def getFallbackEnvironment(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("World3D", "get_fallback_environment", 3082064660L), hostObject.objectPtr)

  /** World3D.set_camera_attributes */
  final def setCameraAttributes(attributes: CameraAttributes): Unit =
    Ptrcall.callVoid1(MethodBind.get("World3D", "set_camera_attributes", 2817810567L), hostObject.objectPtr, attributes.hostObject)

  /** World3D.get_camera_attributes */
  final def getCameraAttributes(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("World3D", "get_camera_attributes", 3921283215L), hostObject.objectPtr)

  /** World3D.get_direct_space_state */
  final def getDirectSpaceState(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("World3D", "get_direct_space_state", 2069328350L), hostObject.objectPtr)

}

object World3D {
  /** Class metadata for Gd[World3D] lifetime management and casting. */
  given GodotClass[World3D] with {
    def className = "World3D"
    def isRefCounted = true
    def wrap(o: GodotObject): World3D = new World3D {}.withHost(o.objectPtr)
    def unwrap(t: World3D): GodotObject = t.hostObject
  }
}
