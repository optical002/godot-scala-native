package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `TouchScreenButton`, extends `Node2D`. */
abstract class TouchScreenButton extends Node2D {

  /** TouchScreenButton.set_texture_normal */
  final def setTextureNormal(texture: Texture2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("TouchScreenButton", "set_texture_normal", 4051416890L), hostObject.objectPtr, texture.hostObject)

  /** TouchScreenButton.get_texture_normal */
  final def getTextureNormal(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("TouchScreenButton", "get_texture_normal", 3635182373L), hostObject.objectPtr)

  /** TouchScreenButton.set_texture_pressed */
  final def setTexturePressed(texture: Texture2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("TouchScreenButton", "set_texture_pressed", 4051416890L), hostObject.objectPtr, texture.hostObject)

  /** TouchScreenButton.get_texture_pressed */
  final def getTexturePressed(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("TouchScreenButton", "get_texture_pressed", 3635182373L), hostObject.objectPtr)

  /** TouchScreenButton.set_bitmask */
  final def setBitmask(bitmask: BitMap): Unit =
    Ptrcall.callVoid1(MethodBind.get("TouchScreenButton", "set_bitmask", 698588216L), hostObject.objectPtr, bitmask.hostObject)

  /** TouchScreenButton.get_bitmask */
  final def getBitmask(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("TouchScreenButton", "get_bitmask", 2459671998L), hostObject.objectPtr)

  /** TouchScreenButton.set_shape */
  final def setShape(shape: Shape2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("TouchScreenButton", "set_shape", 771364740L), hostObject.objectPtr, shape.hostObject)

  /** TouchScreenButton.get_shape */
  final def getShape(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("TouchScreenButton", "get_shape", 522005891L), hostObject.objectPtr)

  /** TouchScreenButton.set_shape_centered */
  final def setShapeCentered(bool: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TouchScreenButton", "set_shape_centered", 2586408642L), hostObject.objectPtr, bool)

  /** TouchScreenButton.is_shape_centered */
  final def isShapeCentered(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TouchScreenButton", "is_shape_centered", 36873697L), hostObject.objectPtr)

  /** TouchScreenButton.set_shape_visible */
  final def setShapeVisible(bool: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TouchScreenButton", "set_shape_visible", 2586408642L), hostObject.objectPtr, bool)

  /** TouchScreenButton.is_shape_visible */
  final def isShapeVisible(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TouchScreenButton", "is_shape_visible", 36873697L), hostObject.objectPtr)

  /** TouchScreenButton.set_action */
  final def setAction(action: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("TouchScreenButton", "set_action", 83702148L), hostObject.objectPtr, action)

  /** TouchScreenButton.get_action */
  final def getAction(): String =
    Ptrcall.call0[String](MethodBind.get("TouchScreenButton", "get_action", 201670096L), hostObject.objectPtr)

  /** TouchScreenButton.set_visibility_mode */
  final def setVisibilityMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TouchScreenButton", "set_visibility_mode", 3031128463L), hostObject.objectPtr, mode)

  /** TouchScreenButton.get_visibility_mode */
  final def getVisibilityMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("TouchScreenButton", "get_visibility_mode", 2558996468L), hostObject.objectPtr)

  /** TouchScreenButton.set_passby_press */
  final def setPassbyPress(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TouchScreenButton", "set_passby_press", 2586408642L), hostObject.objectPtr, enabled)

  /** TouchScreenButton.is_passby_press_enabled */
  final def isPassbyPressEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TouchScreenButton", "is_passby_press_enabled", 36873697L), hostObject.objectPtr)

  /** TouchScreenButton.is_pressed */
  final def isPressed(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TouchScreenButton", "is_pressed", 36873697L), hostObject.objectPtr)

}

object TouchScreenButton {
  /** Class metadata for Gd[TouchScreenButton] lifetime management and casting. */
  given GodotClass[TouchScreenButton] with {
    def className = "TouchScreenButton"
    def isRefCounted = false
    def wrap(o: GodotObject): TouchScreenButton = new TouchScreenButton {}.withHost(o.objectPtr)
    def unwrap(t: TouchScreenButton): GodotObject = t.hostObject
  }
}
