package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `TranslationDomain`, extends `RefCounted`. */
abstract class TranslationDomain extends RefCounted {
  override def godotClassName: String = "TranslationDomain"

  /** TranslationDomain.get_translation_object. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getTranslationObject(locale: String): Translation = {
    if (gdext.classes.TranslationDomain.mb_get_translation_object == null) gdext.classes.TranslationDomain.mb_get_translation_object = MethodBind.get("TranslationDomain", "get_translation_object", 606768082L)
    Wrappers.owned[Translation](Ptrcall.call1[String, Long](gdext.classes.TranslationDomain.mb_get_translation_object, livePtr, locale))
  }

  /** TranslationDomain.add_translation */
  final def addTranslation(translation: Translation): Unit = {
    if (gdext.classes.TranslationDomain.mb_add_translation == null) gdext.classes.TranslationDomain.mb_add_translation = MethodBind.get("TranslationDomain", "add_translation", 1466479800L)
    Ptrcall.callVoid1(gdext.classes.TranslationDomain.mb_add_translation, livePtr, Wrappers.handle(translation))
  }

  /** TranslationDomain.remove_translation */
  final def removeTranslation(translation: Translation): Unit = {
    if (gdext.classes.TranslationDomain.mb_remove_translation == null) gdext.classes.TranslationDomain.mb_remove_translation = MethodBind.get("TranslationDomain", "remove_translation", 1466479800L)
    Ptrcall.callVoid1(gdext.classes.TranslationDomain.mb_remove_translation, livePtr, Wrappers.handle(translation))
  }

  /** TranslationDomain.clear */
  final def clear(): Unit = {
    if (gdext.classes.TranslationDomain.mb_clear == null) gdext.classes.TranslationDomain.mb_clear = MethodBind.get("TranslationDomain", "clear", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.TranslationDomain.mb_clear, livePtr)
  }

  /** TranslationDomain.has_translation_for_locale */
  final def hasTranslationForLocale(locale: String, exact: Boolean): Boolean = {
    if (gdext.classes.TranslationDomain.mb_has_translation_for_locale == null) gdext.classes.TranslationDomain.mb_has_translation_for_locale = MethodBind.get("TranslationDomain", "has_translation_for_locale", 2034713381L)
    Ptrcall.call2[String, Boolean, Boolean](gdext.classes.TranslationDomain.mb_has_translation_for_locale, livePtr, locale, exact)
  }

  /** TranslationDomain.has_translation */
  final def hasTranslation(translation: Translation): Boolean = {
    if (gdext.classes.TranslationDomain.mb_has_translation == null) gdext.classes.TranslationDomain.mb_has_translation = MethodBind.get("TranslationDomain", "has_translation", 2696976312L)
    Ptrcall.call1[GodotObject, Boolean](gdext.classes.TranslationDomain.mb_has_translation, livePtr, Wrappers.handle(translation))
  }

  /** TranslationDomain.translate */
  final def translate(message: gdext.builtin.StringName, context: gdext.builtin.StringName): gdext.builtin.StringName = {
    if (gdext.classes.TranslationDomain.mb_translate == null) gdext.classes.TranslationDomain.mb_translate = MethodBind.get("TranslationDomain", "translate", 1829228469L)
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, gdext.builtin.StringName](gdext.classes.TranslationDomain.mb_translate, livePtr, message, context)
  }

  /** TranslationDomain.translate_plural */
  final def translatePlural(message: gdext.builtin.StringName, message_plural: gdext.builtin.StringName, n: Long, context: gdext.builtin.StringName): gdext.builtin.StringName = {
    if (gdext.classes.TranslationDomain.mb_translate_plural == null) gdext.classes.TranslationDomain.mb_translate_plural = MethodBind.get("TranslationDomain", "translate_plural", 229954002L)
    Ptrcall.call4[gdext.builtin.StringName, gdext.builtin.StringName, Long, gdext.builtin.StringName, gdext.builtin.StringName](gdext.classes.TranslationDomain.mb_translate_plural, livePtr, message, message_plural, n, context)
  }

  /** TranslationDomain.get_locale_override */
  final def getLocaleOverride(): String = {
    if (gdext.classes.TranslationDomain.mb_get_locale_override == null) gdext.classes.TranslationDomain.mb_get_locale_override = MethodBind.get("TranslationDomain", "get_locale_override", 201670096L)
    Ptrcall.call0[String](gdext.classes.TranslationDomain.mb_get_locale_override, livePtr)
  }

  /** TranslationDomain.set_locale_override */
  final def setLocaleOverride(locale: String): Unit = {
    if (gdext.classes.TranslationDomain.mb_set_locale_override == null) gdext.classes.TranslationDomain.mb_set_locale_override = MethodBind.get("TranslationDomain", "set_locale_override", 83702148L)
    Ptrcall.callVoid1(gdext.classes.TranslationDomain.mb_set_locale_override, livePtr, locale)
  }

  /** TranslationDomain.is_enabled */
  final def isEnabled(): Boolean = {
    if (gdext.classes.TranslationDomain.mb_is_enabled == null) gdext.classes.TranslationDomain.mb_is_enabled = MethodBind.get("TranslationDomain", "is_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TranslationDomain.mb_is_enabled, livePtr)
  }

  /** TranslationDomain.set_enabled */
  final def setEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.TranslationDomain.mb_set_enabled == null) gdext.classes.TranslationDomain.mb_set_enabled = MethodBind.get("TranslationDomain", "set_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TranslationDomain.mb_set_enabled, livePtr, enabled)
  }

  /** TranslationDomain.is_pseudolocalization_enabled */
  final def isPseudolocalizationEnabled(): Boolean = {
    if (gdext.classes.TranslationDomain.mb_is_pseudolocalization_enabled == null) gdext.classes.TranslationDomain.mb_is_pseudolocalization_enabled = MethodBind.get("TranslationDomain", "is_pseudolocalization_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TranslationDomain.mb_is_pseudolocalization_enabled, livePtr)
  }

  /** TranslationDomain.set_pseudolocalization_enabled */
  final def setPseudolocalizationEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.TranslationDomain.mb_set_pseudolocalization_enabled == null) gdext.classes.TranslationDomain.mb_set_pseudolocalization_enabled = MethodBind.get("TranslationDomain", "set_pseudolocalization_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TranslationDomain.mb_set_pseudolocalization_enabled, livePtr, enabled)
  }

  /** TranslationDomain.is_pseudolocalization_accents_enabled */
  final def isPseudolocalizationAccentsEnabled(): Boolean = {
    if (gdext.classes.TranslationDomain.mb_is_pseudolocalization_accents_enabled == null) gdext.classes.TranslationDomain.mb_is_pseudolocalization_accents_enabled = MethodBind.get("TranslationDomain", "is_pseudolocalization_accents_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TranslationDomain.mb_is_pseudolocalization_accents_enabled, livePtr)
  }

  /** TranslationDomain.set_pseudolocalization_accents_enabled */
  final def setPseudolocalizationAccentsEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.TranslationDomain.mb_set_pseudolocalization_accents_enabled == null) gdext.classes.TranslationDomain.mb_set_pseudolocalization_accents_enabled = MethodBind.get("TranslationDomain", "set_pseudolocalization_accents_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TranslationDomain.mb_set_pseudolocalization_accents_enabled, livePtr, enabled)
  }

  /** TranslationDomain.is_pseudolocalization_double_vowels_enabled */
  final def isPseudolocalizationDoubleVowelsEnabled(): Boolean = {
    if (gdext.classes.TranslationDomain.mb_is_pseudolocalization_double_vowels_enabled == null) gdext.classes.TranslationDomain.mb_is_pseudolocalization_double_vowels_enabled = MethodBind.get("TranslationDomain", "is_pseudolocalization_double_vowels_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TranslationDomain.mb_is_pseudolocalization_double_vowels_enabled, livePtr)
  }

  /** TranslationDomain.set_pseudolocalization_double_vowels_enabled */
  final def setPseudolocalizationDoubleVowelsEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.TranslationDomain.mb_set_pseudolocalization_double_vowels_enabled == null) gdext.classes.TranslationDomain.mb_set_pseudolocalization_double_vowels_enabled = MethodBind.get("TranslationDomain", "set_pseudolocalization_double_vowels_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TranslationDomain.mb_set_pseudolocalization_double_vowels_enabled, livePtr, enabled)
  }

  /** TranslationDomain.is_pseudolocalization_fake_bidi_enabled */
  final def isPseudolocalizationFakeBidiEnabled(): Boolean = {
    if (gdext.classes.TranslationDomain.mb_is_pseudolocalization_fake_bidi_enabled == null) gdext.classes.TranslationDomain.mb_is_pseudolocalization_fake_bidi_enabled = MethodBind.get("TranslationDomain", "is_pseudolocalization_fake_bidi_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TranslationDomain.mb_is_pseudolocalization_fake_bidi_enabled, livePtr)
  }

  /** TranslationDomain.set_pseudolocalization_fake_bidi_enabled */
  final def setPseudolocalizationFakeBidiEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.TranslationDomain.mb_set_pseudolocalization_fake_bidi_enabled == null) gdext.classes.TranslationDomain.mb_set_pseudolocalization_fake_bidi_enabled = MethodBind.get("TranslationDomain", "set_pseudolocalization_fake_bidi_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TranslationDomain.mb_set_pseudolocalization_fake_bidi_enabled, livePtr, enabled)
  }

  /** TranslationDomain.is_pseudolocalization_override_enabled */
  final def isPseudolocalizationOverrideEnabled(): Boolean = {
    if (gdext.classes.TranslationDomain.mb_is_pseudolocalization_override_enabled == null) gdext.classes.TranslationDomain.mb_is_pseudolocalization_override_enabled = MethodBind.get("TranslationDomain", "is_pseudolocalization_override_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TranslationDomain.mb_is_pseudolocalization_override_enabled, livePtr)
  }

  /** TranslationDomain.set_pseudolocalization_override_enabled */
  final def setPseudolocalizationOverrideEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.TranslationDomain.mb_set_pseudolocalization_override_enabled == null) gdext.classes.TranslationDomain.mb_set_pseudolocalization_override_enabled = MethodBind.get("TranslationDomain", "set_pseudolocalization_override_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TranslationDomain.mb_set_pseudolocalization_override_enabled, livePtr, enabled)
  }

  /** TranslationDomain.is_pseudolocalization_skip_placeholders_enabled */
  final def isPseudolocalizationSkipPlaceholdersEnabled(): Boolean = {
    if (gdext.classes.TranslationDomain.mb_is_pseudolocalization_skip_placeholders_enabled == null) gdext.classes.TranslationDomain.mb_is_pseudolocalization_skip_placeholders_enabled = MethodBind.get("TranslationDomain", "is_pseudolocalization_skip_placeholders_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TranslationDomain.mb_is_pseudolocalization_skip_placeholders_enabled, livePtr)
  }

  /** TranslationDomain.set_pseudolocalization_skip_placeholders_enabled */
  final def setPseudolocalizationSkipPlaceholdersEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.TranslationDomain.mb_set_pseudolocalization_skip_placeholders_enabled == null) gdext.classes.TranslationDomain.mb_set_pseudolocalization_skip_placeholders_enabled = MethodBind.get("TranslationDomain", "set_pseudolocalization_skip_placeholders_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TranslationDomain.mb_set_pseudolocalization_skip_placeholders_enabled, livePtr, enabled)
  }

  /** TranslationDomain.get_pseudolocalization_expansion_ratio */
  final def getPseudolocalizationExpansionRatio(): Double = {
    if (gdext.classes.TranslationDomain.mb_get_pseudolocalization_expansion_ratio == null) gdext.classes.TranslationDomain.mb_get_pseudolocalization_expansion_ratio = MethodBind.get("TranslationDomain", "get_pseudolocalization_expansion_ratio", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.TranslationDomain.mb_get_pseudolocalization_expansion_ratio, livePtr)
  }

  /** TranslationDomain.set_pseudolocalization_expansion_ratio */
  final def setPseudolocalizationExpansionRatio(ratio: Double): Unit = {
    if (gdext.classes.TranslationDomain.mb_set_pseudolocalization_expansion_ratio == null) gdext.classes.TranslationDomain.mb_set_pseudolocalization_expansion_ratio = MethodBind.get("TranslationDomain", "set_pseudolocalization_expansion_ratio", 373806689L)
    Ptrcall.callVoid1(gdext.classes.TranslationDomain.mb_set_pseudolocalization_expansion_ratio, livePtr, ratio)
  }

  /** TranslationDomain.get_pseudolocalization_prefix */
  final def getPseudolocalizationPrefix(): String = {
    if (gdext.classes.TranslationDomain.mb_get_pseudolocalization_prefix == null) gdext.classes.TranslationDomain.mb_get_pseudolocalization_prefix = MethodBind.get("TranslationDomain", "get_pseudolocalization_prefix", 201670096L)
    Ptrcall.call0[String](gdext.classes.TranslationDomain.mb_get_pseudolocalization_prefix, livePtr)
  }

  /** TranslationDomain.set_pseudolocalization_prefix */
  final def setPseudolocalizationPrefix(prefix: String): Unit = {
    if (gdext.classes.TranslationDomain.mb_set_pseudolocalization_prefix == null) gdext.classes.TranslationDomain.mb_set_pseudolocalization_prefix = MethodBind.get("TranslationDomain", "set_pseudolocalization_prefix", 83702148L)
    Ptrcall.callVoid1(gdext.classes.TranslationDomain.mb_set_pseudolocalization_prefix, livePtr, prefix)
  }

  /** TranslationDomain.get_pseudolocalization_suffix */
  final def getPseudolocalizationSuffix(): String = {
    if (gdext.classes.TranslationDomain.mb_get_pseudolocalization_suffix == null) gdext.classes.TranslationDomain.mb_get_pseudolocalization_suffix = MethodBind.get("TranslationDomain", "get_pseudolocalization_suffix", 201670096L)
    Ptrcall.call0[String](gdext.classes.TranslationDomain.mb_get_pseudolocalization_suffix, livePtr)
  }

  /** TranslationDomain.set_pseudolocalization_suffix */
  final def setPseudolocalizationSuffix(suffix: String): Unit = {
    if (gdext.classes.TranslationDomain.mb_set_pseudolocalization_suffix == null) gdext.classes.TranslationDomain.mb_set_pseudolocalization_suffix = MethodBind.get("TranslationDomain", "set_pseudolocalization_suffix", 83702148L)
    Ptrcall.callVoid1(gdext.classes.TranslationDomain.mb_set_pseudolocalization_suffix, livePtr, suffix)
  }

  /** TranslationDomain.pseudolocalize */
  final def pseudolocalize(message: gdext.builtin.StringName): gdext.builtin.StringName = {
    if (gdext.classes.TranslationDomain.mb_pseudolocalize == null) gdext.classes.TranslationDomain.mb_pseudolocalize = MethodBind.get("TranslationDomain", "pseudolocalize", 1965194235L)
    Ptrcall.call1[gdext.builtin.StringName, gdext.builtin.StringName](gdext.classes.TranslationDomain.mb_pseudolocalize, livePtr, message)
  }

}

object TranslationDomain {
  private[classes] var mb_get_translation_object: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_translation: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_translation: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_translation_for_locale: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_translation: GDExtensionMethodBindPtr = null
  private[classes] var mb_translate: GDExtensionMethodBindPtr = null
  private[classes] var mb_translate_plural: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_locale_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_locale_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_pseudolocalization_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_pseudolocalization_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_pseudolocalization_accents_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_pseudolocalization_accents_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_pseudolocalization_double_vowels_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_pseudolocalization_double_vowels_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_pseudolocalization_fake_bidi_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_pseudolocalization_fake_bidi_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_pseudolocalization_override_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_pseudolocalization_override_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_pseudolocalization_skip_placeholders_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_pseudolocalization_skip_placeholders_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_pseudolocalization_expansion_ratio: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_pseudolocalization_expansion_ratio: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_pseudolocalization_prefix: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_pseudolocalization_prefix: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_pseudolocalization_suffix: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_pseudolocalization_suffix: GDExtensionMethodBindPtr = null
  private[classes] var mb_pseudolocalize: GDExtensionMethodBindPtr = null
}
