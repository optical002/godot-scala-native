package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `CSGMesh3D`, extends `CSGPrimitive3D`. */
abstract class CSGMesh3D extends CSGPrimitive3D {

  /** CSGMesh3D.set_mesh */
  final def setMesh(mesh: Mesh): Unit =
    Ptrcall.callVoid1(MethodBind.get("CSGMesh3D", "set_mesh", 194775623L), hostObject.objectPtr, mesh.hostObject)

  /** CSGMesh3D.get_mesh */
  final def getMesh(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("CSGMesh3D", "get_mesh", 4081188045L), hostObject.objectPtr)

  /** CSGMesh3D.set_material */
  final def setMaterial(material: Material): Unit =
    Ptrcall.callVoid1(MethodBind.get("CSGMesh3D", "set_material", 2757459619L), hostObject.objectPtr, material.hostObject)

  /** CSGMesh3D.get_material */
  final def getMaterial(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("CSGMesh3D", "get_material", 5934680L), hostObject.objectPtr)

}

object CSGMesh3D {
  /** Class metadata for Gd[CSGMesh3D] lifetime management and casting. */
  given GodotClass[CSGMesh3D] with {
    def className = "CSGMesh3D"
    def isRefCounted = false
    def wrap(o: GodotObject): CSGMesh3D = new CSGMesh3D {}.withHost(o.objectPtr)
    def unwrap(t: CSGMesh3D): GodotObject = t.hostObject
  }
}
