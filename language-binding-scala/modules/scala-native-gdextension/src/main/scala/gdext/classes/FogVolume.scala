package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `FogVolume`, extends `VisualInstance3D`. */
abstract class FogVolume extends VisualInstance3D {
  override def godotClassName: String = "FogVolume"

  /** FogVolume.set_size */
  final def setSize(size: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("FogVolume", "set_size", 3460891852L), hostObject.objectPtr, size)

  /** FogVolume.get_size */
  final def getSize(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("FogVolume", "get_size", 3360562783L), hostObject.objectPtr)

  /** FogVolume.set_shape */
  final def setShape(shape: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("FogVolume", "set_shape", 1416323362L), hostObject.objectPtr, shape)

  /** FogVolume.get_shape */
  final def getShape(): Long =
    Ptrcall.call0[Long](MethodBind.get("FogVolume", "get_shape", 3920334604L), hostObject.objectPtr)

  /** FogVolume.set_material */
  final def setMaterial(material: Material): Unit =
    Ptrcall.callVoid1(MethodBind.get("FogVolume", "set_material", 2757459619L), hostObject.objectPtr, material.hostObject)

  /** FogVolume.get_material */
  final def getMaterial(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("FogVolume", "get_material", 5934680L), hostObject.objectPtr)

}
