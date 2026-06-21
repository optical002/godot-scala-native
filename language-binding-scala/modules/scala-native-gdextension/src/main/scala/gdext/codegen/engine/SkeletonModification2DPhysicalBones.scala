package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `SkeletonModification2DPhysicalBones`, extends `SkeletonModification2D`. */
abstract class SkeletonModification2DPhysicalBones extends SkeletonModification2D {

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

object SkeletonModification2DPhysicalBones {
  /** Class metadata for Gd[SkeletonModification2DPhysicalBones] lifetime management and casting. */
  given GodotClass[SkeletonModification2DPhysicalBones] with {
    def className = "SkeletonModification2DPhysicalBones"
    def isRefCounted = true
    def wrap(o: GodotObject): SkeletonModification2DPhysicalBones = new SkeletonModification2DPhysicalBones {}.withHost(o.objectPtr)
    def unwrap(t: SkeletonModification2DPhysicalBones): GodotObject = t.hostObject
  }
}
