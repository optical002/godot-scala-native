package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `NativeMenu`, extends `Object`. */
abstract class NativeMenu extends Object {

  /** NativeMenu.has_feature */
  final def hasFeature(feature: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("NativeMenu", "has_feature", 1708975490L), hostObject.objectPtr, feature)

  /** NativeMenu.has_system_menu */
  final def hasSystemMenu(menu_id: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("NativeMenu", "has_system_menu", 718213027L), hostObject.objectPtr, menu_id)

  /** NativeMenu.get_system_menu_name */
  final def getSystemMenuName(menu_id: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("NativeMenu", "get_system_menu_name", 1281499290L), hostObject.objectPtr, menu_id)

  /** NativeMenu.get_system_menu_text */
  final def getSystemMenuText(menu_id: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("NativeMenu", "get_system_menu_text", 1281499290L), hostObject.objectPtr, menu_id)

  /** NativeMenu.set_system_menu_text */
  final def setSystemMenuText(menu_id: Long, name: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("NativeMenu", "set_system_menu_text", 3925225603L), hostObject.objectPtr, menu_id, name)

}

object NativeMenu {
  /** Class metadata for Gd[NativeMenu] lifetime management and casting. */
  given GodotClass[NativeMenu] with {
    def className = "NativeMenu"
    def isRefCounted = false
    def wrap(o: GodotObject): NativeMenu = new NativeMenu {}.withHost(o.objectPtr)
    def unwrap(t: NativeMenu): GodotObject = t.hostObject
  }

  /** The process-global NativeMenu singleton instance. */
  def singleton: NativeMenu = new NativeMenu {}
    .withHost(Godot.interface.global_get_singleton(
      StringNames.cached("NativeMenu").ptr))
}
