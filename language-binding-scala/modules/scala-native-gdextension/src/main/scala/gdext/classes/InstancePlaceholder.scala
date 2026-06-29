package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `InstancePlaceholder`, extends `Node`. */
abstract class InstancePlaceholder extends Node {
  override def godotClassName: String = "InstancePlaceholder"

  /** InstancePlaceholder.create_instance */
  final def createInstance(replace: Boolean, custom_scene: PackedScene): GodotObject =
    Ptrcall.call2[Boolean, GodotObject, GodotObject](MethodBind.get("InstancePlaceholder", "create_instance", 3794612210L), hostObject.objectPtr, replace, custom_scene.hostObject)

  /** InstancePlaceholder.get_instance_path */
  final def getInstancePath(): String =
    Ptrcall.call0[String](MethodBind.get("InstancePlaceholder", "get_instance_path", 201670096L), hostObject.objectPtr)

}
