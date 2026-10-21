package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `XRBodyModifier3D`, extends `SkeletonModifier3D`. */
abstract class XRBodyModifier3D extends SkeletonModifier3D {
  override def godotClassName: String = "XRBodyModifier3D"

  /** XRBodyModifier3D.set_body_tracker */
  final def setBodyTracker(tracker_name: gdext.builtin.StringName): Unit = {
    if (gdext.classes.XRBodyModifier3D.mb_set_body_tracker == null) gdext.classes.XRBodyModifier3D.mb_set_body_tracker = MethodBind.get("XRBodyModifier3D", "set_body_tracker", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.XRBodyModifier3D.mb_set_body_tracker, livePtr, tracker_name)
  }

  /** XRBodyModifier3D.get_body_tracker */
  final def getBodyTracker(): gdext.builtin.StringName = {
    if (gdext.classes.XRBodyModifier3D.mb_get_body_tracker == null) gdext.classes.XRBodyModifier3D.mb_get_body_tracker = MethodBind.get("XRBodyModifier3D", "get_body_tracker", 2002593661L)
    Ptrcall.call0[gdext.builtin.StringName](gdext.classes.XRBodyModifier3D.mb_get_body_tracker, livePtr)
  }

  /** XRBodyModifier3D.set_body_update */
  final def setBodyUpdate(body_update: Long): Unit = {
    if (gdext.classes.XRBodyModifier3D.mb_set_body_update == null) gdext.classes.XRBodyModifier3D.mb_set_body_update = MethodBind.get("XRBodyModifier3D", "set_body_update", 2211199417L)
    Ptrcall.callVoid1(gdext.classes.XRBodyModifier3D.mb_set_body_update, livePtr, body_update)
  }

  /** XRBodyModifier3D.get_body_update */
  final def getBodyUpdate(): Long = {
    if (gdext.classes.XRBodyModifier3D.mb_get_body_update == null) gdext.classes.XRBodyModifier3D.mb_get_body_update = MethodBind.get("XRBodyModifier3D", "get_body_update", 2642335328L)
    Ptrcall.call0[Long](gdext.classes.XRBodyModifier3D.mb_get_body_update, livePtr)
  }

  /** XRBodyModifier3D.set_bone_update */
  final def setBoneUpdate(bone_update: Long): Unit = {
    if (gdext.classes.XRBodyModifier3D.mb_set_bone_update == null) gdext.classes.XRBodyModifier3D.mb_set_bone_update = MethodBind.get("XRBodyModifier3D", "set_bone_update", 3356796943L)
    Ptrcall.callVoid1(gdext.classes.XRBodyModifier3D.mb_set_bone_update, livePtr, bone_update)
  }

  /** XRBodyModifier3D.get_bone_update */
  final def getBoneUpdate(): Long = {
    if (gdext.classes.XRBodyModifier3D.mb_get_bone_update == null) gdext.classes.XRBodyModifier3D.mb_get_bone_update = MethodBind.get("XRBodyModifier3D", "get_bone_update", 1309305964L)
    Ptrcall.call0[Long](gdext.classes.XRBodyModifier3D.mb_get_bone_update, livePtr)
  }

}

object XRBodyModifier3D {
  private[classes] var mb_set_body_tracker: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_body_tracker: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_body_update: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_body_update: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bone_update: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bone_update: GDExtensionMethodBindPtr = null
}
