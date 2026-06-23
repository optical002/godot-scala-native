package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `InstancePlaceholder`, extends `Node`. */
abstract class InstancePlaceholder extends Node {

  /** InstancePlaceholder.create_instance */
  final def createInstance(replace: Boolean, custom_scene: PackedScene): GodotObject =
    Ptrcall.call2[Boolean, GodotObject, GodotObject](MethodBind.get("InstancePlaceholder", "create_instance", 3794612210L), hostObject.objectPtr, replace, custom_scene.hostObject)

  /** InstancePlaceholder.get_instance_path */
  final def getInstancePath(): String =
    Ptrcall.call0[String](MethodBind.get("InstancePlaceholder", "get_instance_path", 201670096L), hostObject.objectPtr)

}

object InstancePlaceholder {
  /** Class metadata for Gd[InstancePlaceholder] lifetime management and casting. */
  given GodotClass[InstancePlaceholder] with {
    def className = "InstancePlaceholder"
    def isRefCounted = false
    def wrap(o: GodotObject): InstancePlaceholder = new InstancePlaceholder {}.withHost(o.objectPtr)
    def unwrap(t: InstancePlaceholder): GodotObject = t.hostObject
  }
}
