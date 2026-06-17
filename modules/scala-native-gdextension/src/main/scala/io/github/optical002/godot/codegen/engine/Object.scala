package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `Object`. */
abstract class Object extends io.github.optical002.godot.register.GodotScriptClass {

  /** Object.is_class */
  final def isClass(`class`: String): Boolean =
    Ptrcall.call1[String, Boolean](MethodBind.get("Object", "is_class", 3927539163L), hostObject.objectPtr, `class`)

  /** Object.notification */
  final def notification(what: Long, reversed: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("Object", "notification", 4023243586L), hostObject.objectPtr, what, reversed)

  /** Object.get_instance_id */
  final def getInstanceId(): Long =
    Ptrcall.call0[Long](MethodBind.get("Object", "get_instance_id", 3905245786L), hostObject.objectPtr)

  /** Object.set_block_signals */
  final def setBlockSignals(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Object", "set_block_signals", 2586408642L), hostObject.objectPtr, enable)

  /** Object.is_blocking_signals */
  final def isBlockingSignals(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Object", "is_blocking_signals", 36873697L), hostObject.objectPtr)

  /** Object.notify_property_list_changed */
  final def notifyPropertyListChanged(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Object", "notify_property_list_changed", 3218959716L), hostObject.objectPtr)

  /** Object.set_message_translation */
  final def setMessageTranslation(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Object", "set_message_translation", 2586408642L), hostObject.objectPtr, enable)

  /** Object.can_translate_messages */
  final def canTranslateMessages(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Object", "can_translate_messages", 36873697L), hostObject.objectPtr)

  /** Object.is_queued_for_deletion */
  final def isQueuedForDeletion(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Object", "is_queued_for_deletion", 36873697L), hostObject.objectPtr)

  /** Object.cancel_free */
  final def cancelFree(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Object", "cancel_free", 3218959716L), hostObject.objectPtr)

}

object Object {
  /** Class metadata for Gd[Object] lifetime management and casting. */
  given GodotClass[Object] with {
    def className = "Object"
    def isRefCounted = false
    def wrap(o: GodotObject): Object = new Object {}.withHost(o.objectPtr)
    def unwrap(t: Object): GodotObject = t.hostObject
  }
}
