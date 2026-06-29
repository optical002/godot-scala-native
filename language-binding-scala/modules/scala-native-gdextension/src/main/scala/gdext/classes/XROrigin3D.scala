package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `XROrigin3D`, extends `Node3D`. */
abstract class XROrigin3D extends Node3D {
  override def godotClassName: String = "XROrigin3D"

  /** XROrigin3D.set_world_scale */
  final def setWorldScale(world_scale: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("XROrigin3D", "set_world_scale", 373806689L), hostObject.objectPtr, world_scale)

  /** XROrigin3D.get_world_scale */
  final def getWorldScale(): Double =
    Ptrcall.call0[Double](MethodBind.get("XROrigin3D", "get_world_scale", 1740695150L), hostObject.objectPtr)

  /** XROrigin3D.set_current */
  final def setCurrent(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("XROrigin3D", "set_current", 2586408642L), hostObject.objectPtr, enabled)

  /** XROrigin3D.is_current */
  final def isCurrent(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("XROrigin3D", "is_current", 36873697L), hostObject.objectPtr)

}
