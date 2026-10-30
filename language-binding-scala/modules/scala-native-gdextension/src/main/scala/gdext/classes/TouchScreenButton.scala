package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `TouchScreenButton`, extends `Node2D`. */
abstract class TouchScreenButton extends Node2D {
  override def godotClassName: String = "TouchScreenButton"

  /** TouchScreenButton.set_texture_normal */
  final def setTextureNormal(texture: Texture2D): Unit = {
    if (gdext.classes.TouchScreenButton.mb_set_texture_normal == null) gdext.classes.TouchScreenButton.mb_set_texture_normal = MethodBind.get("TouchScreenButton", "set_texture_normal", 4051416890L)
    Ptrcall.callVoid1(gdext.classes.TouchScreenButton.mb_set_texture_normal, livePtr, Wrappers.handle(texture))
  }

  /** TouchScreenButton.get_texture_normal. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getTextureNormal(): Texture2D = {
    if (gdext.classes.TouchScreenButton.mb_get_texture_normal == null) gdext.classes.TouchScreenButton.mb_get_texture_normal = MethodBind.get("TouchScreenButton", "get_texture_normal", 3635182373L)
    Wrappers.owned[Texture2D](Ptrcall.call0[Long](gdext.classes.TouchScreenButton.mb_get_texture_normal, livePtr))
  }

  /** TouchScreenButton.set_texture_pressed */
  final def setTexturePressed(texture: Texture2D): Unit = {
    if (gdext.classes.TouchScreenButton.mb_set_texture_pressed == null) gdext.classes.TouchScreenButton.mb_set_texture_pressed = MethodBind.get("TouchScreenButton", "set_texture_pressed", 4051416890L)
    Ptrcall.callVoid1(gdext.classes.TouchScreenButton.mb_set_texture_pressed, livePtr, Wrappers.handle(texture))
  }

  /** TouchScreenButton.get_texture_pressed. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getTexturePressed(): Texture2D = {
    if (gdext.classes.TouchScreenButton.mb_get_texture_pressed == null) gdext.classes.TouchScreenButton.mb_get_texture_pressed = MethodBind.get("TouchScreenButton", "get_texture_pressed", 3635182373L)
    Wrappers.owned[Texture2D](Ptrcall.call0[Long](gdext.classes.TouchScreenButton.mb_get_texture_pressed, livePtr))
  }

  /** TouchScreenButton.set_bitmask */
  final def setBitmask(bitmask: BitMap): Unit = {
    if (gdext.classes.TouchScreenButton.mb_set_bitmask == null) gdext.classes.TouchScreenButton.mb_set_bitmask = MethodBind.get("TouchScreenButton", "set_bitmask", 698588216L)
    Ptrcall.callVoid1(gdext.classes.TouchScreenButton.mb_set_bitmask, livePtr, Wrappers.handle(bitmask))
  }

  /** TouchScreenButton.get_bitmask. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getBitmask(): BitMap = {
    if (gdext.classes.TouchScreenButton.mb_get_bitmask == null) gdext.classes.TouchScreenButton.mb_get_bitmask = MethodBind.get("TouchScreenButton", "get_bitmask", 2459671998L)
    Wrappers.owned[BitMap](Ptrcall.call0[Long](gdext.classes.TouchScreenButton.mb_get_bitmask, livePtr))
  }

  /** TouchScreenButton.set_shape */
  final def setShape(shape: Shape2D): Unit = {
    if (gdext.classes.TouchScreenButton.mb_set_shape == null) gdext.classes.TouchScreenButton.mb_set_shape = MethodBind.get("TouchScreenButton", "set_shape", 771364740L)
    Ptrcall.callVoid1(gdext.classes.TouchScreenButton.mb_set_shape, livePtr, Wrappers.handle(shape))
  }

  /** TouchScreenButton.get_shape. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getShape(): Shape2D = {
    if (gdext.classes.TouchScreenButton.mb_get_shape == null) gdext.classes.TouchScreenButton.mb_get_shape = MethodBind.get("TouchScreenButton", "get_shape", 522005891L)
    Wrappers.owned[Shape2D](Ptrcall.call0[Long](gdext.classes.TouchScreenButton.mb_get_shape, livePtr))
  }

  /** TouchScreenButton.set_shape_centered */
  final def setShapeCentered(bool: Boolean): Unit = {
    if (gdext.classes.TouchScreenButton.mb_set_shape_centered == null) gdext.classes.TouchScreenButton.mb_set_shape_centered = MethodBind.get("TouchScreenButton", "set_shape_centered", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TouchScreenButton.mb_set_shape_centered, livePtr, bool)
  }

  /** TouchScreenButton.is_shape_centered */
  final def isShapeCentered(): Boolean = {
    if (gdext.classes.TouchScreenButton.mb_is_shape_centered == null) gdext.classes.TouchScreenButton.mb_is_shape_centered = MethodBind.get("TouchScreenButton", "is_shape_centered", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TouchScreenButton.mb_is_shape_centered, livePtr)
  }

  /** TouchScreenButton.set_shape_visible */
  final def setShapeVisible(bool: Boolean): Unit = {
    if (gdext.classes.TouchScreenButton.mb_set_shape_visible == null) gdext.classes.TouchScreenButton.mb_set_shape_visible = MethodBind.get("TouchScreenButton", "set_shape_visible", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TouchScreenButton.mb_set_shape_visible, livePtr, bool)
  }

  /** TouchScreenButton.is_shape_visible */
  final def isShapeVisible(): Boolean = {
    if (gdext.classes.TouchScreenButton.mb_is_shape_visible == null) gdext.classes.TouchScreenButton.mb_is_shape_visible = MethodBind.get("TouchScreenButton", "is_shape_visible", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TouchScreenButton.mb_is_shape_visible, livePtr)
  }

  /** TouchScreenButton.set_action */
  final def setAction(action: String): Unit = {
    if (gdext.classes.TouchScreenButton.mb_set_action == null) gdext.classes.TouchScreenButton.mb_set_action = MethodBind.get("TouchScreenButton", "set_action", 83702148L)
    Ptrcall.callVoid1(gdext.classes.TouchScreenButton.mb_set_action, livePtr, action)
  }

  /** TouchScreenButton.get_action */
  final def getAction(): String = {
    if (gdext.classes.TouchScreenButton.mb_get_action == null) gdext.classes.TouchScreenButton.mb_get_action = MethodBind.get("TouchScreenButton", "get_action", 201670096L)
    Ptrcall.call0[String](gdext.classes.TouchScreenButton.mb_get_action, livePtr)
  }

  /** TouchScreenButton.set_visibility_mode */
  final def setVisibilityMode(mode: gdext.classes.TouchScreenButton.VisibilityMode): Unit = {
    if (gdext.classes.TouchScreenButton.mb_set_visibility_mode == null) gdext.classes.TouchScreenButton.mb_set_visibility_mode = MethodBind.get("TouchScreenButton", "set_visibility_mode", 3031128463L)
    Ptrcall.callVoid1(gdext.classes.TouchScreenButton.mb_set_visibility_mode, livePtr, mode)
  }

  /** TouchScreenButton.get_visibility_mode */
  final def getVisibilityMode(): gdext.classes.TouchScreenButton.VisibilityMode = {
    if (gdext.classes.TouchScreenButton.mb_get_visibility_mode == null) gdext.classes.TouchScreenButton.mb_get_visibility_mode = MethodBind.get("TouchScreenButton", "get_visibility_mode", 2558996468L)
    gdext.classes.TouchScreenButton.VisibilityMode(Ptrcall.call0[Long](gdext.classes.TouchScreenButton.mb_get_visibility_mode, livePtr))
  }

  /** TouchScreenButton.set_passby_press */
  final def setPassbyPress(enabled: Boolean): Unit = {
    if (gdext.classes.TouchScreenButton.mb_set_passby_press == null) gdext.classes.TouchScreenButton.mb_set_passby_press = MethodBind.get("TouchScreenButton", "set_passby_press", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TouchScreenButton.mb_set_passby_press, livePtr, enabled)
  }

  /** TouchScreenButton.is_passby_press_enabled */
  final def isPassbyPressEnabled(): Boolean = {
    if (gdext.classes.TouchScreenButton.mb_is_passby_press_enabled == null) gdext.classes.TouchScreenButton.mb_is_passby_press_enabled = MethodBind.get("TouchScreenButton", "is_passby_press_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TouchScreenButton.mb_is_passby_press_enabled, livePtr)
  }

  /** TouchScreenButton.is_pressed */
  final def isPressed(): Boolean = {
    if (gdext.classes.TouchScreenButton.mb_is_pressed == null) gdext.classes.TouchScreenButton.mb_is_pressed = MethodBind.get("TouchScreenButton", "is_pressed", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TouchScreenButton.mb_is_pressed, livePtr)
  }

}

object TouchScreenButton {
  private[classes] var mb_set_texture_normal: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture_normal: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_texture_pressed: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture_pressed: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bitmask: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bitmask: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_shape_centered: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_shape_centered: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_shape_visible: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_shape_visible: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_action: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_action: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_visibility_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_visibility_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_passby_press: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_passby_press_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_pressed: GDExtensionMethodBindPtr = null

  /** Godot enum `TouchScreenButton.VisibilityMode`. */
  opaque type VisibilityMode <: Long = Long

  object VisibilityMode {
    final val Always: VisibilityMode = 0L.asInstanceOf[VisibilityMode]
    final val TouchscreenOnly: VisibilityMode = 1L.asInstanceOf[VisibilityMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): VisibilityMode = value.asInstanceOf[VisibilityMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[VisibilityMode] = scala.IArray[Long](0L, 1L).asInstanceOf[scala.IArray[VisibilityMode]]

    extension (self: VisibilityMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Always"
        case 1L => "TouchscreenOnly"
        case other => other.toString
      }
  }
}
