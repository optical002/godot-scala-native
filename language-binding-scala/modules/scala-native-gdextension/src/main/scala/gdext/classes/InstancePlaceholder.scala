package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `InstancePlaceholder`, extends `Node`. */
abstract class InstancePlaceholder extends Node {
  override def godotClassName: String = "InstancePlaceholder"

  /** InstancePlaceholder.create_instance */
  final def createInstance(replace: Boolean = false, customScene: PackedScene = null): Node = {
    if (gdext.classes.InstancePlaceholder.mb_create_instance == null) gdext.classes.InstancePlaceholder.mb_create_instance = MethodBind.get("InstancePlaceholder", "create_instance", 3794612210L)
    Wrappers.borrowed[Node](Ptrcall.call2[Boolean, GodotObject, Long](gdext.classes.InstancePlaceholder.mb_create_instance, livePtr, replace, Wrappers.handle(customScene)))
  }

  /** InstancePlaceholder.get_instance_path */
  final def getInstancePath(): String = {
    if (gdext.classes.InstancePlaceholder.mb_get_instance_path == null) gdext.classes.InstancePlaceholder.mb_get_instance_path = MethodBind.get("InstancePlaceholder", "get_instance_path", 201670096L)
    Ptrcall.call0[String](gdext.classes.InstancePlaceholder.mb_get_instance_path, livePtr)
  }

}

object InstancePlaceholder {
  private[classes] var mb_create_instance: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_instance_path: GDExtensionMethodBindPtr = null
}
