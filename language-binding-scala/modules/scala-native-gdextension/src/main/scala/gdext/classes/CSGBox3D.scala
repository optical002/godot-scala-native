package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `CSGBox3D`, extends `CSGPrimitive3D`. */
abstract class CSGBox3D extends CSGPrimitive3D {
  override def godotClassName: String = "CSGBox3D"

  /** CSGBox3D.set_size */
  final def setSize(size: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("CSGBox3D", "set_size", 3460891852L), hostObject.objectPtr, size)

  /** CSGBox3D.get_size */
  final def getSize(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("CSGBox3D", "get_size", 3360562783L), hostObject.objectPtr)

  /** CSGBox3D.set_material */
  final def setMaterial(material: Material): Unit =
    Ptrcall.callVoid1(MethodBind.get("CSGBox3D", "set_material", 2757459619L), hostObject.objectPtr, material.hostObject)

  /** CSGBox3D.get_material */
  final def getMaterial(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("CSGBox3D", "get_material", 5934680L), hostObject.objectPtr)

}
