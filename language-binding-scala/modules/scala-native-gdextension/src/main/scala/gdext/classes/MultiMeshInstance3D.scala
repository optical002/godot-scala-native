package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `MultiMeshInstance3D`, extends `GeometryInstance3D`. */
abstract class MultiMeshInstance3D extends GeometryInstance3D {
  override def godotClassName: String = "MultiMeshInstance3D"

  /** MultiMeshInstance3D.set_multimesh */
  final def setMultimesh(multimesh: MultiMesh): Unit =
    Ptrcall.callVoid1(MethodBind.get("MultiMeshInstance3D", "set_multimesh", 2246127404L), hostObject.objectPtr, multimesh.hostObject)

  /** MultiMeshInstance3D.get_multimesh */
  final def getMultimesh(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("MultiMeshInstance3D", "get_multimesh", 1385450523L), hostObject.objectPtr)

}
