package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `MissingNode`, extends `Node`. */
abstract class MissingNode extends Node {
  override def godotClassName: String = "MissingNode"

  /** MissingNode.set_original_class */
  final def setOriginalClass(name: String): Unit = {
    if (gdext.classes.MissingNode.mb_set_original_class == null) gdext.classes.MissingNode.mb_set_original_class = MethodBind.get("MissingNode", "set_original_class", 83702148L)
    Ptrcall.callVoid1(gdext.classes.MissingNode.mb_set_original_class, livePtr, name)
  }

  /** MissingNode.get_original_class */
  final def getOriginalClass(): String = {
    if (gdext.classes.MissingNode.mb_get_original_class == null) gdext.classes.MissingNode.mb_get_original_class = MethodBind.get("MissingNode", "get_original_class", 201670096L)
    Ptrcall.call0[String](gdext.classes.MissingNode.mb_get_original_class, livePtr)
  }

  /** MissingNode.set_original_scene */
  final def setOriginalScene(name: String): Unit = {
    if (gdext.classes.MissingNode.mb_set_original_scene == null) gdext.classes.MissingNode.mb_set_original_scene = MethodBind.get("MissingNode", "set_original_scene", 83702148L)
    Ptrcall.callVoid1(gdext.classes.MissingNode.mb_set_original_scene, livePtr, name)
  }

  /** MissingNode.get_original_scene */
  final def getOriginalScene(): String = {
    if (gdext.classes.MissingNode.mb_get_original_scene == null) gdext.classes.MissingNode.mb_get_original_scene = MethodBind.get("MissingNode", "get_original_scene", 201670096L)
    Ptrcall.call0[String](gdext.classes.MissingNode.mb_get_original_scene, livePtr)
  }

  /** MissingNode.set_recording_properties */
  final def setRecordingProperties(enable: Boolean): Unit = {
    if (gdext.classes.MissingNode.mb_set_recording_properties == null) gdext.classes.MissingNode.mb_set_recording_properties = MethodBind.get("MissingNode", "set_recording_properties", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.MissingNode.mb_set_recording_properties, livePtr, enable)
  }

  /** MissingNode.is_recording_properties */
  final def isRecordingProperties(): Boolean = {
    if (gdext.classes.MissingNode.mb_is_recording_properties == null) gdext.classes.MissingNode.mb_is_recording_properties = MethodBind.get("MissingNode", "is_recording_properties", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.MissingNode.mb_is_recording_properties, livePtr)
  }

  /** MissingNode.set_recording_signals */
  final def setRecordingSignals(enable: Boolean): Unit = {
    if (gdext.classes.MissingNode.mb_set_recording_signals == null) gdext.classes.MissingNode.mb_set_recording_signals = MethodBind.get("MissingNode", "set_recording_signals", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.MissingNode.mb_set_recording_signals, livePtr, enable)
  }

  /** MissingNode.is_recording_signals */
  final def isRecordingSignals(): Boolean = {
    if (gdext.classes.MissingNode.mb_is_recording_signals == null) gdext.classes.MissingNode.mb_is_recording_signals = MethodBind.get("MissingNode", "is_recording_signals", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.MissingNode.mb_is_recording_signals, livePtr)
  }

}

object MissingNode {
  private[classes] var mb_set_original_class: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_original_class: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_original_scene: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_original_scene: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_recording_properties: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_recording_properties: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_recording_signals: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_recording_signals: GDExtensionMethodBindPtr = null
}
