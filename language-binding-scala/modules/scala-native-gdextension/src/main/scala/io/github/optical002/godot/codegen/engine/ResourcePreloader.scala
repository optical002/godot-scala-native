package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `ResourcePreloader`, extends `Node`. */
abstract class ResourcePreloader extends Node {

  /** ResourcePreloader.add_resource */
  final def addResource(name: io.github.optical002.godot.builtin.StringName, resource: Resource): Unit =
    Ptrcall.callVoid2(MethodBind.get("ResourcePreloader", "add_resource", 1168801743L), hostObject.objectPtr, name, resource.hostObject)

  /** ResourcePreloader.remove_resource */
  final def removeResource(name: io.github.optical002.godot.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("ResourcePreloader", "remove_resource", 3304788590L), hostObject.objectPtr, name)

  /** ResourcePreloader.rename_resource */
  final def renameResource(name: io.github.optical002.godot.builtin.StringName, newname: io.github.optical002.godot.builtin.StringName): Unit =
    Ptrcall.callVoid2(MethodBind.get("ResourcePreloader", "rename_resource", 3740211285L), hostObject.objectPtr, name, newname)

  /** ResourcePreloader.has_resource */
  final def hasResource(name: io.github.optical002.godot.builtin.StringName): Boolean =
    Ptrcall.call1[io.github.optical002.godot.builtin.StringName, Boolean](MethodBind.get("ResourcePreloader", "has_resource", 2619796661L), hostObject.objectPtr, name)

  /** ResourcePreloader.get_resource */
  final def getResource(name: io.github.optical002.godot.builtin.StringName): GodotObject =
    Ptrcall.call1[io.github.optical002.godot.builtin.StringName, GodotObject](MethodBind.get("ResourcePreloader", "get_resource", 3742749261L), hostObject.objectPtr, name)

}

object ResourcePreloader {
  /** Class metadata for Gd[ResourcePreloader] lifetime management and casting. */
  given GodotClass[ResourcePreloader] with {
    def className = "ResourcePreloader"
    def isRefCounted = false
    def wrap(o: GodotObject): ResourcePreloader = new ResourcePreloader {}.withHost(o.objectPtr)
    def unwrap(t: ResourcePreloader): GodotObject = t.hostObject
  }
}
