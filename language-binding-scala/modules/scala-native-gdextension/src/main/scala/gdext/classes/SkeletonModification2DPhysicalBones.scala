package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `SkeletonModification2DPhysicalBones`, extends `SkeletonModification2D`. */
abstract class SkeletonModification2DPhysicalBones extends SkeletonModification2D {
  override def godotClassName: String = "SkeletonModification2DPhysicalBones"

  /** SkeletonModification2DPhysicalBones.set_physical_bone_chain_length */
  final def setPhysicalBoneChainLength(length: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("SkeletonModification2DPhysicalBones", "set_physical_bone_chain_length", 1286410249L), hostObject.objectPtr, length)

  /** SkeletonModification2DPhysicalBones.get_physical_bone_chain_length */
  final def getPhysicalBoneChainLength(): Long =
    Ptrcall.call0[Long](MethodBind.get("SkeletonModification2DPhysicalBones", "get_physical_bone_chain_length", 2455072627L), hostObject.objectPtr)

  /** SkeletonModification2DPhysicalBones.fetch_physical_bones */
  final def fetchPhysicalBones(): Unit =
    Ptrcall.callVoid0(MethodBind.get("SkeletonModification2DPhysicalBones", "fetch_physical_bones", 3218959716L), hostObject.objectPtr)

}
