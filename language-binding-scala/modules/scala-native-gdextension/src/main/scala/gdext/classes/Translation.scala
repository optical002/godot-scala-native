package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `Translation`, extends `Resource`. */
abstract class Translation extends Resource {

  /** Translation.set_locale */
  final def setLocale(locale: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("Translation", "set_locale", 83702148L), hostObject.objectPtr, locale)

  /** Translation.get_locale */
  final def getLocale(): String =
    Ptrcall.call0[String](MethodBind.get("Translation", "get_locale", 201670096L), hostObject.objectPtr)

  /** Translation.add_message */
  final def addMessage(src_message: gdext.builtin.StringName, xlated_message: gdext.builtin.StringName, context: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid3(MethodBind.get("Translation", "add_message", 3898530326L), hostObject.objectPtr, src_message, xlated_message, context)

  /** Translation.get_message */
  final def getMessage(src_message: gdext.builtin.StringName, context: gdext.builtin.StringName): gdext.builtin.StringName =
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, gdext.builtin.StringName](MethodBind.get("Translation", "get_message", 1829228469L), hostObject.objectPtr, src_message, context)

  /** Translation.get_plural_message */
  final def getPluralMessage(src_message: gdext.builtin.StringName, src_plural_message: gdext.builtin.StringName, n: Long, context: gdext.builtin.StringName): gdext.builtin.StringName =
    Ptrcall.call4[gdext.builtin.StringName, gdext.builtin.StringName, Long, gdext.builtin.StringName, gdext.builtin.StringName](MethodBind.get("Translation", "get_plural_message", 229954002L), hostObject.objectPtr, src_message, src_plural_message, n, context)

  /** Translation.erase_message */
  final def eraseMessage(src_message: gdext.builtin.StringName, context: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid2(MethodBind.get("Translation", "erase_message", 3959009644L), hostObject.objectPtr, src_message, context)

  /** Translation.get_message_count */
  final def getMessageCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("Translation", "get_message_count", 3905245786L), hostObject.objectPtr)

  /** Translation.set_plural_rules_override */
  final def setPluralRulesOverride(rules: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("Translation", "set_plural_rules_override", 83702148L), hostObject.objectPtr, rules)

  /** Translation.get_plural_rules_override */
  final def getPluralRulesOverride(): String =
    Ptrcall.call0[String](MethodBind.get("Translation", "get_plural_rules_override", 201670096L), hostObject.objectPtr)

}

object Translation {
  /** Class metadata for Gd[Translation] lifetime management and casting. */
  given GodotClass[Translation] with {
    def className = "Translation"
    def isRefCounted = true
    def wrap(o: GodotObject): Translation = new Translation {}.withHost(o.objectPtr)
    def unwrap(t: Translation): GodotObject = t.hostObject
  }
}
