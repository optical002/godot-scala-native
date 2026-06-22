package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `HeightMapShape3D`, extends `Shape3D`. */
abstract class HeightMapShape3D extends Shape3D {

  /** HeightMapShape3D.set_map_width */
  final def setMapWidth(width: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("HeightMapShape3D", "set_map_width", 1286410249L), hostObject.objectPtr, width)

  /** HeightMapShape3D.get_map_width */
  final def getMapWidth(): Long =
    Ptrcall.call0[Long](MethodBind.get("HeightMapShape3D", "get_map_width", 3905245786L), hostObject.objectPtr)

  /** HeightMapShape3D.set_map_depth */
  final def setMapDepth(height: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("HeightMapShape3D", "set_map_depth", 1286410249L), hostObject.objectPtr, height)

  /** HeightMapShape3D.get_map_depth */
  final def getMapDepth(): Long =
    Ptrcall.call0[Long](MethodBind.get("HeightMapShape3D", "get_map_depth", 3905245786L), hostObject.objectPtr)

  /** HeightMapShape3D.get_min_height */
  final def getMinHeight(): Double =
    Ptrcall.call0[Double](MethodBind.get("HeightMapShape3D", "get_min_height", 1740695150L), hostObject.objectPtr)

  /** HeightMapShape3D.get_max_height */
  final def getMaxHeight(): Double =
    Ptrcall.call0[Double](MethodBind.get("HeightMapShape3D", "get_max_height", 1740695150L), hostObject.objectPtr)

  /** HeightMapShape3D.update_map_data_from_image */
  final def updateMapDataFromImage(image: Image, height_min: Double, height_max: Double): Unit =
    Ptrcall.callVoid3(MethodBind.get("HeightMapShape3D", "update_map_data_from_image", 2636652979L), hostObject.objectPtr, image.hostObject, height_min, height_max)

}

object HeightMapShape3D {
  /** Class metadata for Gd[HeightMapShape3D] lifetime management and casting. */
  given GodotClass[HeightMapShape3D] with {
    def className = "HeightMapShape3D"
    def isRefCounted = true
    def wrap(o: GodotObject): HeightMapShape3D = new HeightMapShape3D {}.withHost(o.objectPtr)
    def unwrap(t: HeightMapShape3D): GodotObject = t.hostObject
  }
}
