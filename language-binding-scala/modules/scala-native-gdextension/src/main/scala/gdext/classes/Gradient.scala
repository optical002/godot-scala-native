package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `Gradient`, extends `Resource`. */
abstract class Gradient extends Resource {

  /** Gradient.add_point */
  final def addPoint(offset: Double, color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid2(MethodBind.get("Gradient", "add_point", 3629403827L), hostObject.objectPtr, offset, color)

  /** Gradient.remove_point */
  final def removePoint(point: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Gradient", "remove_point", 1286410249L), hostObject.objectPtr, point)

  /** Gradient.set_offset */
  final def setOffset(point: Long, offset: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("Gradient", "set_offset", 1602489585L), hostObject.objectPtr, point, offset)

  /** Gradient.get_offset */
  final def getOffset(point: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("Gradient", "get_offset", 4025615559L), hostObject.objectPtr, point)

  /** Gradient.reverse */
  final def reverse(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Gradient", "reverse", 3218959716L), hostObject.objectPtr)

  /** Gradient.set_color */
  final def setColor(point: Long, color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid2(MethodBind.get("Gradient", "set_color", 2878471219L), hostObject.objectPtr, point, color)

  /** Gradient.get_color */
  final def getColor(point: Long): gdext.builtin.Color =
    Ptrcall.call1[Long, gdext.builtin.Color](MethodBind.get("Gradient", "get_color", 2624840992L), hostObject.objectPtr, point)

  /** Gradient.sample */
  final def sample(offset: Double): gdext.builtin.Color =
    Ptrcall.call1[Double, gdext.builtin.Color](MethodBind.get("Gradient", "sample", 1250405064L), hostObject.objectPtr, offset)

  /** Gradient.get_point_count */
  final def getPointCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("Gradient", "get_point_count", 3905245786L), hostObject.objectPtr)

  /** Gradient.set_interpolation_mode */
  final def setInterpolationMode(interpolation_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Gradient", "set_interpolation_mode", 1971444490L), hostObject.objectPtr, interpolation_mode)

  /** Gradient.get_interpolation_mode */
  final def getInterpolationMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("Gradient", "get_interpolation_mode", 3674172981L), hostObject.objectPtr)

  /** Gradient.set_interpolation_color_space */
  final def setInterpolationColorSpace(interpolation_color_space: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Gradient", "set_interpolation_color_space", 3685995981L), hostObject.objectPtr, interpolation_color_space)

  /** Gradient.get_interpolation_color_space */
  final def getInterpolationColorSpace(): Long =
    Ptrcall.call0[Long](MethodBind.get("Gradient", "get_interpolation_color_space", 1538296000L), hostObject.objectPtr)

}

object Gradient {
  /** Class metadata for Gd[Gradient] lifetime management and casting. */
  given GodotClass[Gradient] with {
    def className = "Gradient"
    def isRefCounted = true
    def wrap(o: GodotObject): Gradient = new Gradient {}.withHost(o.objectPtr)
    def unwrap(t: Gradient): GodotObject = t.hostObject
  }
}
