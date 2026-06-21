package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `TranslationDomain`, extends `RefCounted`. */
abstract class TranslationDomain extends RefCounted {

  /** TranslationDomain.get_translation_object */
  final def getTranslationObject(locale: String): GodotObject =
    Ptrcall.call1[String, GodotObject](MethodBind.get("TranslationDomain", "get_translation_object", 606768082L), hostObject.objectPtr, locale)

  /** TranslationDomain.add_translation */
  final def addTranslation(translation: Translation): Unit =
    Ptrcall.callVoid1(MethodBind.get("TranslationDomain", "add_translation", 1466479800L), hostObject.objectPtr, translation.hostObject)

  /** TranslationDomain.remove_translation */
  final def removeTranslation(translation: Translation): Unit =
    Ptrcall.callVoid1(MethodBind.get("TranslationDomain", "remove_translation", 1466479800L), hostObject.objectPtr, translation.hostObject)

  /** TranslationDomain.clear */
  final def clear(): Unit =
    Ptrcall.callVoid0(MethodBind.get("TranslationDomain", "clear", 3218959716L), hostObject.objectPtr)

  /** TranslationDomain.has_translation_for_locale */
  final def hasTranslationForLocale(locale: String, exact: Boolean): Boolean =
    Ptrcall.call2[String, Boolean, Boolean](MethodBind.get("TranslationDomain", "has_translation_for_locale", 2034713381L), hostObject.objectPtr, locale, exact)

  /** TranslationDomain.has_translation */
  final def hasTranslation(translation: Translation): Boolean =
    Ptrcall.call1[GodotObject, Boolean](MethodBind.get("TranslationDomain", "has_translation", 2696976312L), hostObject.objectPtr, translation.hostObject)

  /** TranslationDomain.translate */
  final def translate(message: gdext.builtin.StringName, context: gdext.builtin.StringName): gdext.builtin.StringName =
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, gdext.builtin.StringName](MethodBind.get("TranslationDomain", "translate", 1829228469L), hostObject.objectPtr, message, context)

  /** TranslationDomain.translate_plural */
  final def translatePlural(message: gdext.builtin.StringName, message_plural: gdext.builtin.StringName, n: Long, context: gdext.builtin.StringName): gdext.builtin.StringName =
    Ptrcall.call4[gdext.builtin.StringName, gdext.builtin.StringName, Long, gdext.builtin.StringName, gdext.builtin.StringName](MethodBind.get("TranslationDomain", "translate_plural", 229954002L), hostObject.objectPtr, message, message_plural, n, context)

  /** TranslationDomain.get_locale_override */
  final def getLocaleOverride(): String =
    Ptrcall.call0[String](MethodBind.get("TranslationDomain", "get_locale_override", 201670096L), hostObject.objectPtr)

  /** TranslationDomain.set_locale_override */
  final def setLocaleOverride(locale: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("TranslationDomain", "set_locale_override", 83702148L), hostObject.objectPtr, locale)

  /** TranslationDomain.is_enabled */
  final def isEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TranslationDomain", "is_enabled", 36873697L), hostObject.objectPtr)

  /** TranslationDomain.set_enabled */
  final def setEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TranslationDomain", "set_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** TranslationDomain.is_pseudolocalization_enabled */
  final def isPseudolocalizationEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TranslationDomain", "is_pseudolocalization_enabled", 36873697L), hostObject.objectPtr)

  /** TranslationDomain.set_pseudolocalization_enabled */
  final def setPseudolocalizationEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TranslationDomain", "set_pseudolocalization_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** TranslationDomain.is_pseudolocalization_accents_enabled */
  final def isPseudolocalizationAccentsEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TranslationDomain", "is_pseudolocalization_accents_enabled", 36873697L), hostObject.objectPtr)

  /** TranslationDomain.set_pseudolocalization_accents_enabled */
  final def setPseudolocalizationAccentsEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TranslationDomain", "set_pseudolocalization_accents_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** TranslationDomain.is_pseudolocalization_double_vowels_enabled */
  final def isPseudolocalizationDoubleVowelsEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TranslationDomain", "is_pseudolocalization_double_vowels_enabled", 36873697L), hostObject.objectPtr)

  /** TranslationDomain.set_pseudolocalization_double_vowels_enabled */
  final def setPseudolocalizationDoubleVowelsEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TranslationDomain", "set_pseudolocalization_double_vowels_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** TranslationDomain.is_pseudolocalization_fake_bidi_enabled */
  final def isPseudolocalizationFakeBidiEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TranslationDomain", "is_pseudolocalization_fake_bidi_enabled", 36873697L), hostObject.objectPtr)

  /** TranslationDomain.set_pseudolocalization_fake_bidi_enabled */
  final def setPseudolocalizationFakeBidiEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TranslationDomain", "set_pseudolocalization_fake_bidi_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** TranslationDomain.is_pseudolocalization_override_enabled */
  final def isPseudolocalizationOverrideEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TranslationDomain", "is_pseudolocalization_override_enabled", 36873697L), hostObject.objectPtr)

  /** TranslationDomain.set_pseudolocalization_override_enabled */
  final def setPseudolocalizationOverrideEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TranslationDomain", "set_pseudolocalization_override_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** TranslationDomain.is_pseudolocalization_skip_placeholders_enabled */
  final def isPseudolocalizationSkipPlaceholdersEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TranslationDomain", "is_pseudolocalization_skip_placeholders_enabled", 36873697L), hostObject.objectPtr)

  /** TranslationDomain.set_pseudolocalization_skip_placeholders_enabled */
  final def setPseudolocalizationSkipPlaceholdersEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TranslationDomain", "set_pseudolocalization_skip_placeholders_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** TranslationDomain.get_pseudolocalization_expansion_ratio */
  final def getPseudolocalizationExpansionRatio(): Double =
    Ptrcall.call0[Double](MethodBind.get("TranslationDomain", "get_pseudolocalization_expansion_ratio", 1740695150L), hostObject.objectPtr)

  /** TranslationDomain.set_pseudolocalization_expansion_ratio */
  final def setPseudolocalizationExpansionRatio(ratio: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("TranslationDomain", "set_pseudolocalization_expansion_ratio", 373806689L), hostObject.objectPtr, ratio)

  /** TranslationDomain.get_pseudolocalization_prefix */
  final def getPseudolocalizationPrefix(): String =
    Ptrcall.call0[String](MethodBind.get("TranslationDomain", "get_pseudolocalization_prefix", 201670096L), hostObject.objectPtr)

  /** TranslationDomain.set_pseudolocalization_prefix */
  final def setPseudolocalizationPrefix(prefix: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("TranslationDomain", "set_pseudolocalization_prefix", 83702148L), hostObject.objectPtr, prefix)

  /** TranslationDomain.get_pseudolocalization_suffix */
  final def getPseudolocalizationSuffix(): String =
    Ptrcall.call0[String](MethodBind.get("TranslationDomain", "get_pseudolocalization_suffix", 201670096L), hostObject.objectPtr)

  /** TranslationDomain.set_pseudolocalization_suffix */
  final def setPseudolocalizationSuffix(suffix: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("TranslationDomain", "set_pseudolocalization_suffix", 83702148L), hostObject.objectPtr, suffix)

  /** TranslationDomain.pseudolocalize */
  final def pseudolocalize(message: gdext.builtin.StringName): gdext.builtin.StringName =
    Ptrcall.call1[gdext.builtin.StringName, gdext.builtin.StringName](MethodBind.get("TranslationDomain", "pseudolocalize", 1965194235L), hostObject.objectPtr, message)

}

object TranslationDomain {
  /** Class metadata for Gd[TranslationDomain] lifetime management and casting. */
  given GodotClass[TranslationDomain] with {
    def className = "TranslationDomain"
    def isRefCounted = true
    def wrap(o: GodotObject): TranslationDomain = new TranslationDomain {}.withHost(o.objectPtr)
    def unwrap(t: TranslationDomain): GodotObject = t.hostObject
  }
}
