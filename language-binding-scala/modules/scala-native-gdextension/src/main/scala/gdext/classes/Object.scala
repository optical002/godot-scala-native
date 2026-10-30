package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Object`. */
abstract class Object extends gdext.internal.register.GodotScriptClass {
  override def godotClassName: String = "Object"

  /** Object.is_class */
  final def isClass(`class`: String): Boolean = {
    if (gdext.classes.Object.mb_is_class == null) gdext.classes.Object.mb_is_class = MethodBind.get("Object", "is_class", 3927539163L)
    Ptrcall.call1[String, Boolean](gdext.classes.Object.mb_is_class, livePtr, `class`)
  }

  /** Object.property_can_revert */
  final def propertyCanRevert(property: String): Boolean = {
    if (gdext.classes.Object.mb_property_can_revert == null) gdext.classes.Object.mb_property_can_revert = MethodBind.get("Object", "property_can_revert", 2619796661L)
    Ptrcall.call1[SnArg, Boolean](gdext.classes.Object.mb_property_can_revert, livePtr, SnArg(property))
  }

  /** Object.notification */
  final def notification(what: Long, reversed: Boolean = false): Unit = {
    if (gdext.classes.Object.mb_notification == null) gdext.classes.Object.mb_notification = MethodBind.get("Object", "notification", 4023243586L)
    Ptrcall.callVoid2(gdext.classes.Object.mb_notification, livePtr, what, reversed)
  }

  /** Object.get_instance_id */
  final def getInstanceId(): Long = {
    if (gdext.classes.Object.mb_get_instance_id == null) gdext.classes.Object.mb_get_instance_id = MethodBind.get("Object", "get_instance_id", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Object.mb_get_instance_id, livePtr)
  }

  /** Object.remove_meta */
  final def removeMeta(name: String): Unit = {
    if (gdext.classes.Object.mb_remove_meta == null) gdext.classes.Object.mb_remove_meta = MethodBind.get("Object", "remove_meta", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.Object.mb_remove_meta, livePtr, SnArg(name))
  }

  /** Object.has_meta */
  final def hasMeta(name: String): Boolean = {
    if (gdext.classes.Object.mb_has_meta == null) gdext.classes.Object.mb_has_meta = MethodBind.get("Object", "has_meta", 2619796661L)
    Ptrcall.call1[SnArg, Boolean](gdext.classes.Object.mb_has_meta, livePtr, SnArg(name))
  }

  /** Object.has_user_signal */
  final def hasUserSignal(signal: String): Boolean = {
    if (gdext.classes.Object.mb_has_user_signal == null) gdext.classes.Object.mb_has_user_signal = MethodBind.get("Object", "has_user_signal", 2619796661L)
    Ptrcall.call1[SnArg, Boolean](gdext.classes.Object.mb_has_user_signal, livePtr, SnArg(signal))
  }

  /** Object.remove_user_signal */
  final def removeUserSignal(signal: String): Unit = {
    if (gdext.classes.Object.mb_remove_user_signal == null) gdext.classes.Object.mb_remove_user_signal = MethodBind.get("Object", "remove_user_signal", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.Object.mb_remove_user_signal, livePtr, SnArg(signal))
  }

  /** Object.has_method */
  final def hasMethod(method: String): Boolean = {
    if (gdext.classes.Object.mb_has_method == null) gdext.classes.Object.mb_has_method = MethodBind.get("Object", "has_method", 2619796661L)
    Ptrcall.call1[SnArg, Boolean](gdext.classes.Object.mb_has_method, livePtr, SnArg(method))
  }

  /** Object.get_method_argument_count */
  final def getMethodArgumentCount(method: String): Long = {
    if (gdext.classes.Object.mb_get_method_argument_count == null) gdext.classes.Object.mb_get_method_argument_count = MethodBind.get("Object", "get_method_argument_count", 2458036349L)
    Ptrcall.call1[SnArg, Long](gdext.classes.Object.mb_get_method_argument_count, livePtr, SnArg(method))
  }

  /** Object.has_signal */
  final def hasSignal(signal: String): Boolean = {
    if (gdext.classes.Object.mb_has_signal == null) gdext.classes.Object.mb_has_signal = MethodBind.get("Object", "has_signal", 2619796661L)
    Ptrcall.call1[SnArg, Boolean](gdext.classes.Object.mb_has_signal, livePtr, SnArg(signal))
  }

  /** Object.has_connections */
  final def hasConnections(signal: String): Boolean = {
    if (gdext.classes.Object.mb_has_connections == null) gdext.classes.Object.mb_has_connections = MethodBind.get("Object", "has_connections", 2619796661L)
    Ptrcall.call1[SnArg, Boolean](gdext.classes.Object.mb_has_connections, livePtr, SnArg(signal))
  }

  /** Object.set_block_signals */
  final def setBlockSignals(enable: Boolean): Unit = {
    if (gdext.classes.Object.mb_set_block_signals == null) gdext.classes.Object.mb_set_block_signals = MethodBind.get("Object", "set_block_signals", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Object.mb_set_block_signals, livePtr, enable)
  }

  /** Object.is_blocking_signals */
  final def isBlockingSignals(): Boolean = {
    if (gdext.classes.Object.mb_is_blocking_signals == null) gdext.classes.Object.mb_is_blocking_signals = MethodBind.get("Object", "is_blocking_signals", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Object.mb_is_blocking_signals, livePtr)
  }

  /** Object.notify_property_list_changed */
  final def notifyPropertyListChanged(): Unit = {
    if (gdext.classes.Object.mb_notify_property_list_changed == null) gdext.classes.Object.mb_notify_property_list_changed = MethodBind.get("Object", "notify_property_list_changed", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Object.mb_notify_property_list_changed, livePtr)
  }

  /** Object.set_message_translation */
  final def setMessageTranslation(enable: Boolean): Unit = {
    if (gdext.classes.Object.mb_set_message_translation == null) gdext.classes.Object.mb_set_message_translation = MethodBind.get("Object", "set_message_translation", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Object.mb_set_message_translation, livePtr, enable)
  }

  /** Object.can_translate_messages */
  final def canTranslateMessages(): Boolean = {
    if (gdext.classes.Object.mb_can_translate_messages == null) gdext.classes.Object.mb_can_translate_messages = MethodBind.get("Object", "can_translate_messages", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Object.mb_can_translate_messages, livePtr)
  }

  /** Object.tr */
  final def tr(message: String, context: String = ""): String = {
    if (gdext.classes.Object.mb_tr == null) gdext.classes.Object.mb_tr = MethodBind.get("Object", "tr", 1195764410L)
    Ptrcall.call2[SnArg, SnArg, String](gdext.classes.Object.mb_tr, livePtr, SnArg(message), SnArg(context))
  }

  /** Object.tr_n */
  final def trN(message: String, pluralMessage: String, n: Long, context: String = ""): String = {
    if (gdext.classes.Object.mb_tr_n == null) gdext.classes.Object.mb_tr_n = MethodBind.get("Object", "tr_n", 162698058L)
    Ptrcall.call4[SnArg, SnArg, Long, SnArg, String](gdext.classes.Object.mb_tr_n, livePtr, SnArg(message), SnArg(pluralMessage), n, SnArg(context))
  }

  /** Object.get_translation_domain */
  final def getTranslationDomain(): String = {
    if (gdext.classes.Object.mb_get_translation_domain == null) gdext.classes.Object.mb_get_translation_domain = MethodBind.get("Object", "get_translation_domain", 2002593661L)
    Ptrcall.call0[SnArg](gdext.classes.Object.mb_get_translation_domain, livePtr)
  }

  /** Object.set_translation_domain */
  final def setTranslationDomain(domain: String): Unit = {
    if (gdext.classes.Object.mb_set_translation_domain == null) gdext.classes.Object.mb_set_translation_domain = MethodBind.get("Object", "set_translation_domain", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.Object.mb_set_translation_domain, livePtr, SnArg(domain))
  }

  /** Object.is_queued_for_deletion */
  final def isQueuedForDeletion(): Boolean = {
    if (gdext.classes.Object.mb_is_queued_for_deletion == null) gdext.classes.Object.mb_is_queued_for_deletion = MethodBind.get("Object", "is_queued_for_deletion", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Object.mb_is_queued_for_deletion, livePtr)
  }

  /** Object.cancel_free */
  final def cancelFree(): Unit = {
    if (gdext.classes.Object.mb_cancel_free == null) gdext.classes.Object.mb_cancel_free = MethodBind.get("Object", "cancel_free", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Object.mb_cancel_free, livePtr)
  }

}

object Object {
  private[classes] var mb_is_class: GDExtensionMethodBindPtr = null
  private[classes] var mb_property_can_revert: GDExtensionMethodBindPtr = null
  private[classes] var mb_notification: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_instance_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_meta: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_meta: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_user_signal: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_user_signal: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_method: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_method_argument_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_signal: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_connections: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_block_signals: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_blocking_signals: GDExtensionMethodBindPtr = null
  private[classes] var mb_notify_property_list_changed: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_message_translation: GDExtensionMethodBindPtr = null
  private[classes] var mb_can_translate_messages: GDExtensionMethodBindPtr = null
  private[classes] var mb_tr: GDExtensionMethodBindPtr = null
  private[classes] var mb_tr_n: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_translation_domain: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_translation_domain: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_queued_for_deletion: GDExtensionMethodBindPtr = null
  private[classes] var mb_cancel_free: GDExtensionMethodBindPtr = null

  /** Godot enum `Object.ConnectFlags`. */
  opaque type ConnectFlags <: Long = Long

  object ConnectFlags {
    final val Deferred: ConnectFlags = 1L.asInstanceOf[ConnectFlags]
    final val Persist: ConnectFlags = 2L.asInstanceOf[ConnectFlags]
    final val OneShot: ConnectFlags = 4L.asInstanceOf[ConnectFlags]
    final val ReferenceCounted: ConnectFlags = 8L.asInstanceOf[ConnectFlags]
    final val AppendSourceObject: ConnectFlags = 16L.asInstanceOf[ConnectFlags]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ConnectFlags = value.asInstanceOf[ConnectFlags]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ConnectFlags] = scala.IArray[Long](1L, 2L, 4L, 8L, 16L).asInstanceOf[scala.IArray[ConnectFlags]]

    extension (self: ConnectFlags)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 1L => "Deferred"
        case 2L => "Persist"
        case 4L => "OneShot"
        case 8L => "ReferenceCounted"
        case 16L => "AppendSourceObject"
        case other => other.toString
      }
  }
}
