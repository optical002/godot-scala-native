package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `SkeletonModificationStack2D`, extends `Resource`. */
abstract class SkeletonModificationStack2D extends Resource {

  /** SkeletonModificationStack2D.setup */
  final def setup(): Unit =
    Ptrcall.callVoid0(MethodBind.get("SkeletonModificationStack2D", "setup", 3218959716L), hostObject.objectPtr)

  /** SkeletonModificationStack2D.execute */
  final def execute(delta: Double, execution_mode: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("SkeletonModificationStack2D", "execute", 1005356550L), hostObject.objectPtr, delta, execution_mode)

  /** SkeletonModificationStack2D.enable_all_modifications */
  final def enableAllModifications(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("SkeletonModificationStack2D", "enable_all_modifications", 2586408642L), hostObject.objectPtr, enabled)

  /** SkeletonModificationStack2D.get_modification */
  final def getModification(mod_idx: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("SkeletonModificationStack2D", "get_modification", 2570274329L), hostObject.objectPtr, mod_idx)

  /** SkeletonModificationStack2D.add_modification */
  final def addModification(modification: SkeletonModification2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("SkeletonModificationStack2D", "add_modification", 354162120L), hostObject.objectPtr, modification.hostObject)

  /** SkeletonModificationStack2D.delete_modification */
  final def deleteModification(mod_idx: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("SkeletonModificationStack2D", "delete_modification", 1286410249L), hostObject.objectPtr, mod_idx)

  /** SkeletonModificationStack2D.set_modification */
  final def setModification(mod_idx: Long, modification: SkeletonModification2D): Unit =
    Ptrcall.callVoid2(MethodBind.get("SkeletonModificationStack2D", "set_modification", 1098262544L), hostObject.objectPtr, mod_idx, modification.hostObject)

  /** SkeletonModificationStack2D.set_modification_count */
  final def setModificationCount(count: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("SkeletonModificationStack2D", "set_modification_count", 1286410249L), hostObject.objectPtr, count)

  /** SkeletonModificationStack2D.get_modification_count */
  final def getModificationCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("SkeletonModificationStack2D", "get_modification_count", 3905245786L), hostObject.objectPtr)

  /** SkeletonModificationStack2D.get_is_setup */
  final def getIsSetup(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("SkeletonModificationStack2D", "get_is_setup", 36873697L), hostObject.objectPtr)

  /** SkeletonModificationStack2D.set_enabled */
  final def setEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("SkeletonModificationStack2D", "set_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** SkeletonModificationStack2D.get_enabled */
  final def getEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("SkeletonModificationStack2D", "get_enabled", 36873697L), hostObject.objectPtr)

  /** SkeletonModificationStack2D.set_strength */
  final def setStrength(strength: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("SkeletonModificationStack2D", "set_strength", 373806689L), hostObject.objectPtr, strength)

  /** SkeletonModificationStack2D.get_strength */
  final def getStrength(): Double =
    Ptrcall.call0[Double](MethodBind.get("SkeletonModificationStack2D", "get_strength", 1740695150L), hostObject.objectPtr)

  /** SkeletonModificationStack2D.get_skeleton */
  final def getSkeleton(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("SkeletonModificationStack2D", "get_skeleton", 1697361217L), hostObject.objectPtr)

}

object SkeletonModificationStack2D {
  /** Class metadata for Gd[SkeletonModificationStack2D] lifetime management and casting. */
  given GodotClass[SkeletonModificationStack2D] with {
    def className = "SkeletonModificationStack2D"
    def isRefCounted = true
    def wrap(o: GodotObject): SkeletonModificationStack2D = new SkeletonModificationStack2D {}.withHost(o.objectPtr)
    def unwrap(t: SkeletonModificationStack2D): GodotObject = t.hostObject
  }
}
