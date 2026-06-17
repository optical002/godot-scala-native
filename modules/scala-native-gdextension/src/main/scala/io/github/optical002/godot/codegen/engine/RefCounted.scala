package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `RefCounted`, inherits `Object`. */
opaque type RefCounted = GodotObject

object RefCounted {
  /** Wrap a raw object handle as a `RefCounted` (no checked cast). */
  def fromObject(o: GodotObject): RefCounted = o

  /** Class metadata for Gd[RefCounted] lifetime management and casting. */
  given GodotClass[RefCounted] with {
    def className = "RefCounted"
    def isRefCounted = true
    def wrap(o: GodotObject): RefCounted = o
    def unwrap(t: RefCounted): GodotObject = t
  }

  extension (self: RefCounted) {
    /** The underlying object handle. */
    def asObject: GodotObject = self

    /** RefCounted.init_ref */
    def initRef(): Boolean =
      Ptrcall.call0[Boolean](MethodBind.get("RefCounted", "init_ref", 2240911060L), self.asObject.objectPtr)

    /** RefCounted.reference */
    def reference(): Boolean =
      Ptrcall.call0[Boolean](MethodBind.get("RefCounted", "reference", 2240911060L), self.asObject.objectPtr)

    /** RefCounted.unreference */
    def unreference(): Boolean =
      Ptrcall.call0[Boolean](MethodBind.get("RefCounted", "unreference", 2240911060L), self.asObject.objectPtr)

    /** RefCounted.get_reference_count */
    def getReferenceCount(): Long =
      Ptrcall.call0[Long](MethodBind.get("RefCounted", "get_reference_count", 3905245786L), self.asObject.objectPtr)

    /** Object.is_class */
    def isClass(`class`: String): Boolean =
      Ptrcall.call1[String, Boolean](MethodBind.get("Object", "is_class", 3927539163L), self.asObject.objectPtr, `class`)

    /** Object.notification */
    def notification(what: Long, reversed: Boolean): Unit =
      Ptrcall.callVoid2(MethodBind.get("Object", "notification", 4023243586L), self.asObject.objectPtr, what, reversed)

    /** Object.get_instance_id */
    def getInstanceId(): Long =
      Ptrcall.call0[Long](MethodBind.get("Object", "get_instance_id", 3905245786L), self.asObject.objectPtr)

    /** Object.set_block_signals */
    def setBlockSignals(enable: Boolean): Unit =
      Ptrcall.callVoid1(MethodBind.get("Object", "set_block_signals", 2586408642L), self.asObject.objectPtr, enable)

    /** Object.is_blocking_signals */
    def isBlockingSignals(): Boolean =
      Ptrcall.call0[Boolean](MethodBind.get("Object", "is_blocking_signals", 36873697L), self.asObject.objectPtr)

    /** Object.notify_property_list_changed */
    def notifyPropertyListChanged(): Unit =
      Ptrcall.callVoid0(MethodBind.get("Object", "notify_property_list_changed", 3218959716L), self.asObject.objectPtr)

    /** Object.set_message_translation */
    def setMessageTranslation(enable: Boolean): Unit =
      Ptrcall.callVoid1(MethodBind.get("Object", "set_message_translation", 2586408642L), self.asObject.objectPtr, enable)

    /** Object.can_translate_messages */
    def canTranslateMessages(): Boolean =
      Ptrcall.call0[Boolean](MethodBind.get("Object", "can_translate_messages", 36873697L), self.asObject.objectPtr)

    /** Object.is_queued_for_deletion */
    def isQueuedForDeletion(): Boolean =
      Ptrcall.call0[Boolean](MethodBind.get("Object", "is_queued_for_deletion", 36873697L), self.asObject.objectPtr)

    /** Object.cancel_free */
    def cancelFree(): Unit =
      Ptrcall.callVoid0(MethodBind.get("Object", "cancel_free", 3218959716L), self.asObject.objectPtr)

  }
}
