package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `SkeletonModificationStack2D`, extends `Resource`. */
abstract class SkeletonModificationStack2D extends Resource {
  override def godotClassName: String = "SkeletonModificationStack2D"

  /** SkeletonModificationStack2D.setup */
  final def setup(): Unit = {
    if (gdext.classes.SkeletonModificationStack2D.mb_setup == null) gdext.classes.SkeletonModificationStack2D.mb_setup = MethodBind.get("SkeletonModificationStack2D", "setup", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.SkeletonModificationStack2D.mb_setup, livePtr)
  }

  /** SkeletonModificationStack2D.execute */
  final def execute(delta: Double, executionMode: Long): Unit = {
    if (gdext.classes.SkeletonModificationStack2D.mb_execute == null) gdext.classes.SkeletonModificationStack2D.mb_execute = MethodBind.get("SkeletonModificationStack2D", "execute", 1005356550L)
    Ptrcall.callVoid2(gdext.classes.SkeletonModificationStack2D.mb_execute, livePtr, delta, executionMode)
  }

  /** SkeletonModificationStack2D.enable_all_modifications */
  final def enableAllModifications(enabled: Boolean): Unit = {
    if (gdext.classes.SkeletonModificationStack2D.mb_enable_all_modifications == null) gdext.classes.SkeletonModificationStack2D.mb_enable_all_modifications = MethodBind.get("SkeletonModificationStack2D", "enable_all_modifications", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.SkeletonModificationStack2D.mb_enable_all_modifications, livePtr, enabled)
  }

  /** SkeletonModificationStack2D.get_modification. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getModification(modIdx: Long): SkeletonModification2D = {
    if (gdext.classes.SkeletonModificationStack2D.mb_get_modification == null) gdext.classes.SkeletonModificationStack2D.mb_get_modification = MethodBind.get("SkeletonModificationStack2D", "get_modification", 2570274329L)
    Wrappers.owned[SkeletonModification2D](Ptrcall.call1[Long, Long](gdext.classes.SkeletonModificationStack2D.mb_get_modification, livePtr, modIdx))
  }

  /** SkeletonModificationStack2D.add_modification */
  final def addModification(modification: SkeletonModification2D): Unit = {
    if (gdext.classes.SkeletonModificationStack2D.mb_add_modification == null) gdext.classes.SkeletonModificationStack2D.mb_add_modification = MethodBind.get("SkeletonModificationStack2D", "add_modification", 354162120L)
    Ptrcall.callVoid1(gdext.classes.SkeletonModificationStack2D.mb_add_modification, livePtr, Wrappers.handle(modification))
  }

  /** SkeletonModificationStack2D.delete_modification */
  final def deleteModification(modIdx: Long): Unit = {
    if (gdext.classes.SkeletonModificationStack2D.mb_delete_modification == null) gdext.classes.SkeletonModificationStack2D.mb_delete_modification = MethodBind.get("SkeletonModificationStack2D", "delete_modification", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.SkeletonModificationStack2D.mb_delete_modification, livePtr, modIdx)
  }

  /** SkeletonModificationStack2D.set_modification */
  final def setModification(modIdx: Long, modification: SkeletonModification2D): Unit = {
    if (gdext.classes.SkeletonModificationStack2D.mb_set_modification == null) gdext.classes.SkeletonModificationStack2D.mb_set_modification = MethodBind.get("SkeletonModificationStack2D", "set_modification", 1098262544L)
    Ptrcall.callVoid2(gdext.classes.SkeletonModificationStack2D.mb_set_modification, livePtr, modIdx, Wrappers.handle(modification))
  }

  /** SkeletonModificationStack2D.set_modification_count */
  final def setModificationCount(count: Long): Unit = {
    if (gdext.classes.SkeletonModificationStack2D.mb_set_modification_count == null) gdext.classes.SkeletonModificationStack2D.mb_set_modification_count = MethodBind.get("SkeletonModificationStack2D", "set_modification_count", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.SkeletonModificationStack2D.mb_set_modification_count, livePtr, count)
  }

  /** SkeletonModificationStack2D.get_modification_count */
  final def getModificationCount(): Long = {
    if (gdext.classes.SkeletonModificationStack2D.mb_get_modification_count == null) gdext.classes.SkeletonModificationStack2D.mb_get_modification_count = MethodBind.get("SkeletonModificationStack2D", "get_modification_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.SkeletonModificationStack2D.mb_get_modification_count, livePtr)
  }

  /** SkeletonModificationStack2D.get_is_setup */
  final def getIsSetup(): Boolean = {
    if (gdext.classes.SkeletonModificationStack2D.mb_get_is_setup == null) gdext.classes.SkeletonModificationStack2D.mb_get_is_setup = MethodBind.get("SkeletonModificationStack2D", "get_is_setup", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.SkeletonModificationStack2D.mb_get_is_setup, livePtr)
  }

  /** SkeletonModificationStack2D.set_enabled */
  final def setEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.SkeletonModificationStack2D.mb_set_enabled == null) gdext.classes.SkeletonModificationStack2D.mb_set_enabled = MethodBind.get("SkeletonModificationStack2D", "set_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.SkeletonModificationStack2D.mb_set_enabled, livePtr, enabled)
  }

  /** SkeletonModificationStack2D.get_enabled */
  final def getEnabled(): Boolean = {
    if (gdext.classes.SkeletonModificationStack2D.mb_get_enabled == null) gdext.classes.SkeletonModificationStack2D.mb_get_enabled = MethodBind.get("SkeletonModificationStack2D", "get_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.SkeletonModificationStack2D.mb_get_enabled, livePtr)
  }

  /** SkeletonModificationStack2D.set_strength */
  final def setStrength(strength: Double): Unit = {
    if (gdext.classes.SkeletonModificationStack2D.mb_set_strength == null) gdext.classes.SkeletonModificationStack2D.mb_set_strength = MethodBind.get("SkeletonModificationStack2D", "set_strength", 373806689L)
    Ptrcall.callVoid1(gdext.classes.SkeletonModificationStack2D.mb_set_strength, livePtr, strength)
  }

  /** SkeletonModificationStack2D.get_strength */
  final def getStrength(): Double = {
    if (gdext.classes.SkeletonModificationStack2D.mb_get_strength == null) gdext.classes.SkeletonModificationStack2D.mb_get_strength = MethodBind.get("SkeletonModificationStack2D", "get_strength", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.SkeletonModificationStack2D.mb_get_strength, livePtr)
  }

  /** SkeletonModificationStack2D.get_skeleton */
  final def getSkeleton(): Skeleton2D = {
    if (gdext.classes.SkeletonModificationStack2D.mb_get_skeleton == null) gdext.classes.SkeletonModificationStack2D.mb_get_skeleton = MethodBind.get("SkeletonModificationStack2D", "get_skeleton", 1697361217L)
    Wrappers.borrowed[Skeleton2D](Ptrcall.call0[Long](gdext.classes.SkeletonModificationStack2D.mb_get_skeleton, livePtr))
  }

}

object SkeletonModificationStack2D {
  private[classes] var mb_setup: GDExtensionMethodBindPtr = null
  private[classes] var mb_execute: GDExtensionMethodBindPtr = null
  private[classes] var mb_enable_all_modifications: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_modification: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_modification: GDExtensionMethodBindPtr = null
  private[classes] var mb_delete_modification: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_modification: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_modification_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_modification_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_is_setup: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_strength: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_strength: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_skeleton: GDExtensionMethodBindPtr = null
}
