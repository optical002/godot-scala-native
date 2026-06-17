package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `MissingNode`, extends `Node`. */
abstract class MissingNode extends Node {

  /** MissingNode.set_original_class */
  final def setOriginalClass(name: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("MissingNode", "set_original_class", 83702148L), hostObject.objectPtr, name)

  /** MissingNode.get_original_class */
  final def getOriginalClass(): String =
    Ptrcall.call0[String](MethodBind.get("MissingNode", "get_original_class", 201670096L), hostObject.objectPtr)

  /** MissingNode.set_original_scene */
  final def setOriginalScene(name: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("MissingNode", "set_original_scene", 83702148L), hostObject.objectPtr, name)

  /** MissingNode.get_original_scene */
  final def getOriginalScene(): String =
    Ptrcall.call0[String](MethodBind.get("MissingNode", "get_original_scene", 201670096L), hostObject.objectPtr)

  /** MissingNode.set_recording_properties */
  final def setRecordingProperties(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("MissingNode", "set_recording_properties", 2586408642L), hostObject.objectPtr, enable)

  /** MissingNode.is_recording_properties */
  final def isRecordingProperties(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("MissingNode", "is_recording_properties", 36873697L), hostObject.objectPtr)

  /** MissingNode.set_recording_signals */
  final def setRecordingSignals(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("MissingNode", "set_recording_signals", 2586408642L), hostObject.objectPtr, enable)

  /** MissingNode.is_recording_signals */
  final def isRecordingSignals(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("MissingNode", "is_recording_signals", 36873697L), hostObject.objectPtr)

}

object MissingNode {
  /** Class metadata for Gd[MissingNode] lifetime management and casting. */
  given GodotClass[MissingNode] with {
    def className = "MissingNode"
    def isRefCounted = false
    def wrap(o: GodotObject): MissingNode = new MissingNode {}.withHost(o.objectPtr)
    def unwrap(t: MissingNode): GodotObject = t.hostObject
  }
}
