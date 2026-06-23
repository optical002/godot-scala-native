package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `Object`. */
abstract class Object extends gdext.internal.register.GodotScriptClass {

  /** Object.is_class */
  final def isClass(`class`: String): Boolean =
    Ptrcall.call1[String, Boolean](MethodBind.get("Object", "is_class", 3927539163L), hostObject.objectPtr, `class`)

  /** Object.property_can_revert */
  final def propertyCanRevert(property: gdext.builtin.StringName): Boolean =
    Ptrcall.call1[gdext.builtin.StringName, Boolean](MethodBind.get("Object", "property_can_revert", 2619796661L), hostObject.objectPtr, property)

  /** Object.notification */
  final def notification(what: Long, reversed: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("Object", "notification", 4023243586L), hostObject.objectPtr, what, reversed)

  /** Object.get_instance_id */
  final def getInstanceId(): Long =
    Ptrcall.call0[Long](MethodBind.get("Object", "get_instance_id", 3905245786L), hostObject.objectPtr)

  /** Object.remove_meta */
  final def removeMeta(name: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("Object", "remove_meta", 3304788590L), hostObject.objectPtr, name)

  /** Object.has_meta */
  final def hasMeta(name: gdext.builtin.StringName): Boolean =
    Ptrcall.call1[gdext.builtin.StringName, Boolean](MethodBind.get("Object", "has_meta", 2619796661L), hostObject.objectPtr, name)

  /** Object.has_user_signal */
  final def hasUserSignal(signal: gdext.builtin.StringName): Boolean =
    Ptrcall.call1[gdext.builtin.StringName, Boolean](MethodBind.get("Object", "has_user_signal", 2619796661L), hostObject.objectPtr, signal)

  /** Object.remove_user_signal */
  final def removeUserSignal(signal: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("Object", "remove_user_signal", 3304788590L), hostObject.objectPtr, signal)

  /** Object.has_method */
  final def hasMethod(method: gdext.builtin.StringName): Boolean =
    Ptrcall.call1[gdext.builtin.StringName, Boolean](MethodBind.get("Object", "has_method", 2619796661L), hostObject.objectPtr, method)

  /** Object.get_method_argument_count */
  final def getMethodArgumentCount(method: gdext.builtin.StringName): Long =
    Ptrcall.call1[gdext.builtin.StringName, Long](MethodBind.get("Object", "get_method_argument_count", 2458036349L), hostObject.objectPtr, method)

  /** Object.has_signal */
  final def hasSignal(signal: gdext.builtin.StringName): Boolean =
    Ptrcall.call1[gdext.builtin.StringName, Boolean](MethodBind.get("Object", "has_signal", 2619796661L), hostObject.objectPtr, signal)

  /** Object.has_connections */
  final def hasConnections(signal: gdext.builtin.StringName): Boolean =
    Ptrcall.call1[gdext.builtin.StringName, Boolean](MethodBind.get("Object", "has_connections", 2619796661L), hostObject.objectPtr, signal)

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
  final def tr(message: gdext.builtin.StringName, context: gdext.builtin.StringName): String =
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, String](MethodBind.get("Object", "tr", 1195764410L), hostObject.objectPtr, message, context)

  /** Object.tr_n */
  final def trN(message: gdext.builtin.StringName, plural_message: gdext.builtin.StringName, n: Long, context: gdext.builtin.StringName): String =
    Ptrcall.call4[gdext.builtin.StringName, gdext.builtin.StringName, Long, gdext.builtin.StringName, String](MethodBind.get("Object", "tr_n", 162698058L), hostObject.objectPtr, message, plural_message, n, context)

  /** Object.get_translation_domain */
  final def getTranslationDomain(): gdext.builtin.StringName =
    Ptrcall.call0[gdext.builtin.StringName](MethodBind.get("Object", "get_translation_domain", 2002593661L), hostObject.objectPtr)

  /** Object.set_translation_domain */
  final def setTranslationDomain(domain: gdext.builtin.StringName): Unit =
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
