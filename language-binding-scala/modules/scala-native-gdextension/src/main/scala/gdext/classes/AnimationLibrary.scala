package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `AnimationLibrary`, extends `Resource`. */
abstract class AnimationLibrary extends Resource {

  /** AnimationLibrary.add_animation */
  final def addAnimation(name: gdext.builtin.StringName, animation: Animation): Long =
    Ptrcall.call2[gdext.builtin.StringName, GodotObject, Long](MethodBind.get("AnimationLibrary", "add_animation", 1811855551L), hostObject.objectPtr, name, animation.hostObject)

  /** AnimationLibrary.remove_animation */
  final def removeAnimation(name: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationLibrary", "remove_animation", 3304788590L), hostObject.objectPtr, name)

  /** AnimationLibrary.rename_animation */
  final def renameAnimation(name: gdext.builtin.StringName, newname: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid2(MethodBind.get("AnimationLibrary", "rename_animation", 3740211285L), hostObject.objectPtr, name, newname)

  /** AnimationLibrary.has_animation */
  final def hasAnimation(name: gdext.builtin.StringName): Boolean =
    Ptrcall.call1[gdext.builtin.StringName, Boolean](MethodBind.get("AnimationLibrary", "has_animation", 2619796661L), hostObject.objectPtr, name)

  /** AnimationLibrary.get_animation */
  final def getAnimation(name: gdext.builtin.StringName): GodotObject =
    Ptrcall.call1[gdext.builtin.StringName, GodotObject](MethodBind.get("AnimationLibrary", "get_animation", 2933122410L), hostObject.objectPtr, name)

  /** AnimationLibrary.get_animation_list_size */
  final def getAnimationListSize(): Long =
    Ptrcall.call0[Long](MethodBind.get("AnimationLibrary", "get_animation_list_size", 3905245786L), hostObject.objectPtr)

}

object AnimationLibrary {
  /** Class metadata for Gd[AnimationLibrary] lifetime management and casting. */
  given GodotClass[AnimationLibrary] with {
    def className = "AnimationLibrary"
    def isRefCounted = true
    def wrap(o: GodotObject): AnimationLibrary = new AnimationLibrary {}.withHost(o.objectPtr)
    def unwrap(t: AnimationLibrary): GodotObject = t.hostObject
  }
}
