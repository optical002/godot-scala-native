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

  /** Object.property_can_revert */
  final def propertyCanRevert(property: io.github.optical002.godot.builtin.StringName): Boolean =
    Ptrcall.call1[io.github.optical002.godot.builtin.StringName, Boolean](MethodBind.get("Object", "property_can_revert", 2619796661L), hostObject.objectPtr, property)

  /** Object.notification */
  final def notification(what: Long, reversed: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("Object", "notification", 4023243586L), hostObject.objectPtr, what, reversed)

  /** Object.get_instance_id */
  final def getInstanceId(): Long =
    Ptrcall.call0[Long](MethodBind.get("Object", "get_instance_id", 3905245786L), hostObject.objectPtr)

  /** Object.remove_meta */
  final def removeMeta(name: io.github.optical002.godot.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("Object", "remove_meta", 3304788590L), hostObject.objectPtr, name)

  /** Object.has_meta */
  final def hasMeta(name: io.github.optical002.godot.builtin.StringName): Boolean =
    Ptrcall.call1[io.github.optical002.godot.builtin.StringName, Boolean](MethodBind.get("Object", "has_meta", 2619796661L), hostObject.objectPtr, name)

  /** Object.has_user_signal */
  final def hasUserSignal(signal: io.github.optical002.godot.builtin.StringName): Boolean =
    Ptrcall.call1[io.github.optical002.godot.builtin.StringName, Boolean](MethodBind.get("Object", "has_user_signal", 2619796661L), hostObject.objectPtr, signal)

  /** Object.remove_user_signal */
  final def removeUserSignal(signal: io.github.optical002.godot.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("Object", "remove_user_signal", 3304788590L), hostObject.objectPtr, signal)

  /** Object.has_method */
  final def hasMethod(method: io.github.optical002.godot.builtin.StringName): Boolean =
    Ptrcall.call1[io.github.optical002.godot.builtin.StringName, Boolean](MethodBind.get("Object", "has_method", 2619796661L), hostObject.objectPtr, method)

  /** Object.get_method_argument_count */
  final def getMethodArgumentCount(method: io.github.optical002.godot.builtin.StringName): Long =
    Ptrcall.call1[io.github.optical002.godot.builtin.StringName, Long](MethodBind.get("Object", "get_method_argument_count", 2458036349L), hostObject.objectPtr, method)

  /** Object.has_signal */
  final def hasSignal(signal: io.github.optical002.godot.builtin.StringName): Boolean =
    Ptrcall.call1[io.github.optical002.godot.builtin.StringName, Boolean](MethodBind.get("Object", "has_signal", 2619796661L), hostObject.objectPtr, signal)

  /** Object.has_connections */
  final def hasConnections(signal: io.github.optical002.godot.builtin.StringName): Boolean =
    Ptrcall.call1[io.github.optical002.godot.builtin.StringName, Boolean](MethodBind.get("Object", "has_connections", 2619796661L), hostObject.objectPtr, signal)

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

  /** Object.tr */
  final def tr(message: io.github.optical002.godot.builtin.StringName, context: io.github.optical002.godot.builtin.StringName): String =
    Ptrcall.call2[io.github.optical002.godot.builtin.StringName, io.github.optical002.godot.builtin.StringName, String](MethodBind.get("Object", "tr", 1195764410L), hostObject.objectPtr, message, context)

  /** Object.tr_n */
  final def trN(message: io.github.optical002.godot.builtin.StringName, plural_message: io.github.optical002.godot.builtin.StringName, n: Long, context: io.github.optical002.godot.builtin.StringName): String =
    Ptrcall.call4[io.github.optical002.godot.builtin.StringName, io.github.optical002.godot.builtin.StringName, Long, io.github.optical002.godot.builtin.StringName, String](MethodBind.get("Object", "tr_n", 162698058L), hostObject.objectPtr, message, plural_message, n, context)

  /** Object.get_translation_domain */
  final def getTranslationDomain(): io.github.optical002.godot.builtin.StringName =
    Ptrcall.call0[io.github.optical002.godot.builtin.StringName](MethodBind.get("Object", "get_translation_domain", 2002593661L), hostObject.objectPtr)

  /** Object.set_translation_domain */
  final def setTranslationDomain(domain: io.github.optical002.godot.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("Object", "set_translation_domain", 3304788590L), hostObject.objectPtr, domain)

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
