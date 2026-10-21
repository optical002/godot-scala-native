package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `XRHandModifier3D`, extends `SkeletonModifier3D`. */
abstract class XRHandModifier3D extends SkeletonModifier3D {
  override def godotClassName: String = "XRHandModifier3D"

  /** XRHandModifier3D.set_hand_tracker */
  final def setHandTracker(tracker_name: gdext.builtin.StringName): Unit = {
    if (gdext.classes.XRHandModifier3D.mb_set_hand_tracker == null) gdext.classes.XRHandModifier3D.mb_set_hand_tracker = MethodBind.get("XRHandModifier3D", "set_hand_tracker", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.XRHandModifier3D.mb_set_hand_tracker, livePtr, tracker_name)
  }

  /** XRHandModifier3D.get_hand_tracker */
  final def getHandTracker(): gdext.builtin.StringName = {
    if (gdext.classes.XRHandModifier3D.mb_get_hand_tracker == null) gdext.classes.XRHandModifier3D.mb_get_hand_tracker = MethodBind.get("XRHandModifier3D", "get_hand_tracker", 2002593661L)
    Ptrcall.call0[gdext.builtin.StringName](gdext.classes.XRHandModifier3D.mb_get_hand_tracker, livePtr)
  }

  /** XRHandModifier3D.set_bone_update */
  final def setBoneUpdate(bone_update: Long): Unit = {
    if (gdext.classes.XRHandModifier3D.mb_set_bone_update == null) gdext.classes.XRHandModifier3D.mb_set_bone_update = MethodBind.get("XRHandModifier3D", "set_bone_update", 3635701455L)
    Ptrcall.callVoid1(gdext.classes.XRHandModifier3D.mb_set_bone_update, livePtr, bone_update)
  }

  /** XRHandModifier3D.get_bone_update */
  final def getBoneUpdate(): Long = {
    if (gdext.classes.XRHandModifier3D.mb_get_bone_update == null) gdext.classes.XRHandModifier3D.mb_get_bone_update = MethodBind.get("XRHandModifier3D", "get_bone_update", 2873665691L)
    Ptrcall.call0[Long](gdext.classes.XRHandModifier3D.mb_get_bone_update, livePtr)
  }

}

object XRHandModifier3D {
  private[classes] var mb_set_hand_tracker: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_hand_tracker: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bone_update: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bone_update: GDExtensionMethodBindPtr = null
}
