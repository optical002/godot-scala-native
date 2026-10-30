package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `SkeletonModification2DPhysicalBones`, extends `SkeletonModification2D`. */
abstract class SkeletonModification2DPhysicalBones extends SkeletonModification2D {
  override def godotClassName: String = "SkeletonModification2DPhysicalBones"

  /** SkeletonModification2DPhysicalBones.set_physical_bone_chain_length */
  final def setPhysicalBoneChainLength(length: Long): Unit = {
    if (gdext.classes.SkeletonModification2DPhysicalBones.mb_set_physical_bone_chain_length == null) gdext.classes.SkeletonModification2DPhysicalBones.mb_set_physical_bone_chain_length = MethodBind.get("SkeletonModification2DPhysicalBones", "set_physical_bone_chain_length", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.SkeletonModification2DPhysicalBones.mb_set_physical_bone_chain_length, livePtr, length)
  }

  /** SkeletonModification2DPhysicalBones.get_physical_bone_chain_length */
  final def getPhysicalBoneChainLength(): Long = {
    if (gdext.classes.SkeletonModification2DPhysicalBones.mb_get_physical_bone_chain_length == null) gdext.classes.SkeletonModification2DPhysicalBones.mb_get_physical_bone_chain_length = MethodBind.get("SkeletonModification2DPhysicalBones", "get_physical_bone_chain_length", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.SkeletonModification2DPhysicalBones.mb_get_physical_bone_chain_length, livePtr)
  }

  /** SkeletonModification2DPhysicalBones.fetch_physical_bones */
  final def fetchPhysicalBones(): Unit = {
    if (gdext.classes.SkeletonModification2DPhysicalBones.mb_fetch_physical_bones == null) gdext.classes.SkeletonModification2DPhysicalBones.mb_fetch_physical_bones = MethodBind.get("SkeletonModification2DPhysicalBones", "fetch_physical_bones", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.SkeletonModification2DPhysicalBones.mb_fetch_physical_bones, livePtr)
  }

}

object SkeletonModification2DPhysicalBones {
  private[classes] var mb_set_physical_bone_chain_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_physical_bone_chain_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_fetch_physical_bones: GDExtensionMethodBindPtr = null
}
