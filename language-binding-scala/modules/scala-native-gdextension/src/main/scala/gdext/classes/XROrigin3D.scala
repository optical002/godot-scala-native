package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `XROrigin3D`, extends `Node3D`. */
abstract class XROrigin3D extends Node3D {
  override def godotClassName: String = "XROrigin3D"

  /** XROrigin3D.set_world_scale */
  final def setWorldScale(worldScale: Double): Unit = {
    if (gdext.classes.XROrigin3D.mb_set_world_scale == null) gdext.classes.XROrigin3D.mb_set_world_scale = MethodBind.get("XROrigin3D", "set_world_scale", 373806689L)
    Ptrcall.callVoid1(gdext.classes.XROrigin3D.mb_set_world_scale, livePtr, worldScale)
  }

  /** XROrigin3D.get_world_scale */
  final def getWorldScale(): Double = {
    if (gdext.classes.XROrigin3D.mb_get_world_scale == null) gdext.classes.XROrigin3D.mb_get_world_scale = MethodBind.get("XROrigin3D", "get_world_scale", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.XROrigin3D.mb_get_world_scale, livePtr)
  }

  /** XROrigin3D.set_current */
  final def setCurrent(enabled: Boolean): Unit = {
    if (gdext.classes.XROrigin3D.mb_set_current == null) gdext.classes.XROrigin3D.mb_set_current = MethodBind.get("XROrigin3D", "set_current", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.XROrigin3D.mb_set_current, livePtr, enabled)
  }

  /** XROrigin3D.is_current */
  final def isCurrent(): Boolean = {
    if (gdext.classes.XROrigin3D.mb_is_current == null) gdext.classes.XROrigin3D.mb_is_current = MethodBind.get("XROrigin3D", "is_current", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.XROrigin3D.mb_is_current, livePtr)
  }

}

object XROrigin3D {
  private[classes] var mb_set_world_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_world_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_current: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_current: GDExtensionMethodBindPtr = null
}
