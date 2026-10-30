package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `TranslationServer`, extends `Object`. */
abstract class TranslationServer extends Object {
  override def godotClassName: String = "TranslationServer"

  /** TranslationServer.set_locale */
  final def setLocale(locale: String): Unit = {
    if (gdext.classes.TranslationServer.mb_set_locale == null) gdext.classes.TranslationServer.mb_set_locale = MethodBind.get("TranslationServer", "set_locale", 83702148L)
    Ptrcall.callVoid1(gdext.classes.TranslationServer.mb_set_locale, livePtr, locale)
  }

  /** TranslationServer.get_locale */
  final def getLocale(): String = {
    if (gdext.classes.TranslationServer.mb_get_locale == null) gdext.classes.TranslationServer.mb_get_locale = MethodBind.get("TranslationServer", "get_locale", 201670096L)
    Ptrcall.call0[String](gdext.classes.TranslationServer.mb_get_locale, livePtr)
  }

  /** TranslationServer.get_tool_locale */
  final def getToolLocale(): String = {
    if (gdext.classes.TranslationServer.mb_get_tool_locale == null) gdext.classes.TranslationServer.mb_get_tool_locale = MethodBind.get("TranslationServer", "get_tool_locale", 2841200299L)
    Ptrcall.call0[String](gdext.classes.TranslationServer.mb_get_tool_locale, livePtr)
  }

  /** TranslationServer.compare_locales */
  final def compareLocales(localeA: String, localeB: String): Long = {
    if (gdext.classes.TranslationServer.mb_compare_locales == null) gdext.classes.TranslationServer.mb_compare_locales = MethodBind.get("TranslationServer", "compare_locales", 2878152881L)
    Ptrcall.call2[String, String, Long](gdext.classes.TranslationServer.mb_compare_locales, livePtr, localeA, localeB)
  }

  /** TranslationServer.standardize_locale */
  final def standardizeLocale(locale: String, addDefaults: Boolean = false): String = {
    if (gdext.classes.TranslationServer.mb_standardize_locale == null) gdext.classes.TranslationServer.mb_standardize_locale = MethodBind.get("TranslationServer", "standardize_locale", 4216441673L)
    Ptrcall.call2[String, Boolean, String](gdext.classes.TranslationServer.mb_standardize_locale, livePtr, locale, addDefaults)
  }

  /** TranslationServer.get_language_name */
  final def getLanguageName(language: String): String = {
    if (gdext.classes.TranslationServer.mb_get_language_name == null) gdext.classes.TranslationServer.mb_get_language_name = MethodBind.get("TranslationServer", "get_language_name", 3135753539L)
    Ptrcall.call1[String, String](gdext.classes.TranslationServer.mb_get_language_name, livePtr, language)
  }

  /** TranslationServer.get_script_name */
  final def getScriptName(script: String): String = {
    if (gdext.classes.TranslationServer.mb_get_script_name == null) gdext.classes.TranslationServer.mb_get_script_name = MethodBind.get("TranslationServer", "get_script_name", 3135753539L)
    Ptrcall.call1[String, String](gdext.classes.TranslationServer.mb_get_script_name, livePtr, script)
  }

  /** TranslationServer.get_country_name */
  final def getCountryName(country: String): String = {
    if (gdext.classes.TranslationServer.mb_get_country_name == null) gdext.classes.TranslationServer.mb_get_country_name = MethodBind.get("TranslationServer", "get_country_name", 3135753539L)
    Ptrcall.call1[String, String](gdext.classes.TranslationServer.mb_get_country_name, livePtr, country)
  }

  /** TranslationServer.get_locale_name */
  final def getLocaleName(locale: String): String = {
    if (gdext.classes.TranslationServer.mb_get_locale_name == null) gdext.classes.TranslationServer.mb_get_locale_name = MethodBind.get("TranslationServer", "get_locale_name", 3135753539L)
    Ptrcall.call1[String, String](gdext.classes.TranslationServer.mb_get_locale_name, livePtr, locale)
  }

  /** TranslationServer.get_plural_rules */
  final def getPluralRules(locale: String): String = {
    if (gdext.classes.TranslationServer.mb_get_plural_rules == null) gdext.classes.TranslationServer.mb_get_plural_rules = MethodBind.get("TranslationServer", "get_plural_rules", 3135753539L)
    Ptrcall.call1[String, String](gdext.classes.TranslationServer.mb_get_plural_rules, livePtr, locale)
  }

  /** TranslationServer.translate */
  final def translate(message: String, context: String = ""): String = {
    if (gdext.classes.TranslationServer.mb_translate == null) gdext.classes.TranslationServer.mb_translate = MethodBind.get("TranslationServer", "translate", 1829228469L)
    Ptrcall.call2[SnArg, SnArg, SnArg](gdext.classes.TranslationServer.mb_translate, livePtr, SnArg(message), SnArg(context))
  }

  /** TranslationServer.translate_plural */
  final def translatePlural(message: String, pluralMessage: String, n: Long, context: String = ""): String = {
    if (gdext.classes.TranslationServer.mb_translate_plural == null) gdext.classes.TranslationServer.mb_translate_plural = MethodBind.get("TranslationServer", "translate_plural", 229954002L)
    Ptrcall.call4[SnArg, SnArg, Long, SnArg, SnArg](gdext.classes.TranslationServer.mb_translate_plural, livePtr, SnArg(message), SnArg(pluralMessage), n, SnArg(context))
  }

  /** TranslationServer.add_translation */
  final def addTranslation(translation: Translation): Unit = {
    if (gdext.classes.TranslationServer.mb_add_translation == null) gdext.classes.TranslationServer.mb_add_translation = MethodBind.get("TranslationServer", "add_translation", 1466479800L)
    Ptrcall.callVoid1(gdext.classes.TranslationServer.mb_add_translation, livePtr, Wrappers.handle(translation))
  }

  /** TranslationServer.remove_translation */
  final def removeTranslation(translation: Translation): Unit = {
    if (gdext.classes.TranslationServer.mb_remove_translation == null) gdext.classes.TranslationServer.mb_remove_translation = MethodBind.get("TranslationServer", "remove_translation", 1466479800L)
    Ptrcall.callVoid1(gdext.classes.TranslationServer.mb_remove_translation, livePtr, Wrappers.handle(translation))
  }

  /** TranslationServer.get_translation_object. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getTranslationObject(locale: String): Translation = {
    if (gdext.classes.TranslationServer.mb_get_translation_object == null) gdext.classes.TranslationServer.mb_get_translation_object = MethodBind.get("TranslationServer", "get_translation_object", 2065240175L)
    Wrappers.owned[Translation](Ptrcall.call1[String, Long](gdext.classes.TranslationServer.mb_get_translation_object, livePtr, locale))
  }

  /** TranslationServer.has_translation_for_locale */
  final def hasTranslationForLocale(locale: String, exact: Boolean): Boolean = {
    if (gdext.classes.TranslationServer.mb_has_translation_for_locale == null) gdext.classes.TranslationServer.mb_has_translation_for_locale = MethodBind.get("TranslationServer", "has_translation_for_locale", 2034713381L)
    Ptrcall.call2[String, Boolean, Boolean](gdext.classes.TranslationServer.mb_has_translation_for_locale, livePtr, locale, exact)
  }

  /** TranslationServer.has_translation */
  final def hasTranslation(translation: Translation): Boolean = {
    if (gdext.classes.TranslationServer.mb_has_translation == null) gdext.classes.TranslationServer.mb_has_translation = MethodBind.get("TranslationServer", "has_translation", 2696976312L)
    Ptrcall.call1[GodotObject, Boolean](gdext.classes.TranslationServer.mb_has_translation, livePtr, Wrappers.handle(translation))
  }

  /** TranslationServer.has_domain */
  final def hasDomain(domain: String): Boolean = {
    if (gdext.classes.TranslationServer.mb_has_domain == null) gdext.classes.TranslationServer.mb_has_domain = MethodBind.get("TranslationServer", "has_domain", 2619796661L)
    Ptrcall.call1[SnArg, Boolean](gdext.classes.TranslationServer.mb_has_domain, livePtr, SnArg(domain))
  }

  /** TranslationServer.get_or_add_domain. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getOrAddDomain(domain: String): TranslationDomain = {
    if (gdext.classes.TranslationServer.mb_get_or_add_domain == null) gdext.classes.TranslationServer.mb_get_or_add_domain = MethodBind.get("TranslationServer", "get_or_add_domain", 397200075L)
    Wrappers.owned[TranslationDomain](Ptrcall.call1[SnArg, Long](gdext.classes.TranslationServer.mb_get_or_add_domain, livePtr, SnArg(domain)))
  }

  /** TranslationServer.remove_domain */
  final def removeDomain(domain: String): Unit = {
    if (gdext.classes.TranslationServer.mb_remove_domain == null) gdext.classes.TranslationServer.mb_remove_domain = MethodBind.get("TranslationServer", "remove_domain", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.TranslationServer.mb_remove_domain, livePtr, SnArg(domain))
  }

  /** TranslationServer.clear */
  final def clear(): Unit = {
    if (gdext.classes.TranslationServer.mb_clear == null) gdext.classes.TranslationServer.mb_clear = MethodBind.get("TranslationServer", "clear", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.TranslationServer.mb_clear, livePtr)
  }

  /** TranslationServer.format_number */
  final def formatNumber(number: String, locale: String): String = {
    if (gdext.classes.TranslationServer.mb_format_number == null) gdext.classes.TranslationServer.mb_format_number = MethodBind.get("TranslationServer", "format_number", 315676799L)
    Ptrcall.call2[String, String, String](gdext.classes.TranslationServer.mb_format_number, livePtr, number, locale)
  }

  /** TranslationServer.get_percent_sign */
  final def getPercentSign(locale: String): String = {
    if (gdext.classes.TranslationServer.mb_get_percent_sign == null) gdext.classes.TranslationServer.mb_get_percent_sign = MethodBind.get("TranslationServer", "get_percent_sign", 3135753539L)
    Ptrcall.call1[String, String](gdext.classes.TranslationServer.mb_get_percent_sign, livePtr, locale)
  }

  /** TranslationServer.parse_number */
  final def parseNumber(number: String, locale: String): String = {
    if (gdext.classes.TranslationServer.mb_parse_number == null) gdext.classes.TranslationServer.mb_parse_number = MethodBind.get("TranslationServer", "parse_number", 315676799L)
    Ptrcall.call2[String, String, String](gdext.classes.TranslationServer.mb_parse_number, livePtr, number, locale)
  }

  /** TranslationServer.is_pseudolocalization_enabled */
  final def isPseudolocalizationEnabled(): Boolean = {
    if (gdext.classes.TranslationServer.mb_is_pseudolocalization_enabled == null) gdext.classes.TranslationServer.mb_is_pseudolocalization_enabled = MethodBind.get("TranslationServer", "is_pseudolocalization_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TranslationServer.mb_is_pseudolocalization_enabled, livePtr)
  }

  /** TranslationServer.set_pseudolocalization_enabled */
  final def setPseudolocalizationEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.TranslationServer.mb_set_pseudolocalization_enabled == null) gdext.classes.TranslationServer.mb_set_pseudolocalization_enabled = MethodBind.get("TranslationServer", "set_pseudolocalization_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TranslationServer.mb_set_pseudolocalization_enabled, livePtr, enabled)
  }

  /** TranslationServer.reload_pseudolocalization */
  final def reloadPseudolocalization(): Unit = {
    if (gdext.classes.TranslationServer.mb_reload_pseudolocalization == null) gdext.classes.TranslationServer.mb_reload_pseudolocalization = MethodBind.get("TranslationServer", "reload_pseudolocalization", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.TranslationServer.mb_reload_pseudolocalization, livePtr)
  }

  /** TranslationServer.pseudolocalize */
  final def pseudolocalize(message: String): String = {
    if (gdext.classes.TranslationServer.mb_pseudolocalize == null) gdext.classes.TranslationServer.mb_pseudolocalize = MethodBind.get("TranslationServer", "pseudolocalize", 1965194235L)
    Ptrcall.call1[SnArg, SnArg](gdext.classes.TranslationServer.mb_pseudolocalize, livePtr, SnArg(message))
  }

}

object TranslationServer {
  private[classes] var mb_set_locale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_locale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tool_locale: GDExtensionMethodBindPtr = null
  private[classes] var mb_compare_locales: GDExtensionMethodBindPtr = null
  private[classes] var mb_standardize_locale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_language_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_script_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_country_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_locale_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_plural_rules: GDExtensionMethodBindPtr = null
  private[classes] var mb_translate: GDExtensionMethodBindPtr = null
  private[classes] var mb_translate_plural: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_translation: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_translation: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_translation_object: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_translation_for_locale: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_translation: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_domain: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_or_add_domain: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_domain: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear: GDExtensionMethodBindPtr = null
  private[classes] var mb_format_number: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_percent_sign: GDExtensionMethodBindPtr = null
  private[classes] var mb_parse_number: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_pseudolocalization_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_pseudolocalization_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_reload_pseudolocalization: GDExtensionMethodBindPtr = null
  private[classes] var mb_pseudolocalize: GDExtensionMethodBindPtr = null

  private var instance: TranslationServer = null

  /** The process-global TranslationServer singleton instance. */
  def singleton: TranslationServer = {
    if (instance == null)
      instance = Wrappers.borrowed[TranslationServer](GodotObject.fromPtr(
        Godot.interface.global_get_singleton(StringNames.cached("TranslationServer").ptr)))
    instance
  }

  /** Forwards to [[singleton]]: TranslationServer.set_locale */
  final def setLocale(locale: String): Unit =
    singleton.setLocale(locale)

  /** Forwards to [[singleton]]: TranslationServer.get_locale */
  final def getLocale(): String =
    singleton.getLocale()

  /** Forwards to [[singleton]]: TranslationServer.get_tool_locale */
  final def getToolLocale(): String =
    singleton.getToolLocale()

  /** Forwards to [[singleton]]: TranslationServer.compare_locales */
  final def compareLocales(localeA: String, localeB: String): Long =
    singleton.compareLocales(localeA, localeB)

  /** Forwards to [[singleton]]: TranslationServer.standardize_locale */
  final def standardizeLocale(locale: String, addDefaults: Boolean = false): String =
    singleton.standardizeLocale(locale, addDefaults)

  /** Forwards to [[singleton]]: TranslationServer.get_language_name */
  final def getLanguageName(language: String): String =
    singleton.getLanguageName(language)

  /** Forwards to [[singleton]]: TranslationServer.get_script_name */
  final def getScriptName(script: String): String =
    singleton.getScriptName(script)

  /** Forwards to [[singleton]]: TranslationServer.get_country_name */
  final def getCountryName(country: String): String =
    singleton.getCountryName(country)

  /** Forwards to [[singleton]]: TranslationServer.get_locale_name */
  final def getLocaleName(locale: String): String =
    singleton.getLocaleName(locale)

  /** Forwards to [[singleton]]: TranslationServer.get_plural_rules */
  final def getPluralRules(locale: String): String =
    singleton.getPluralRules(locale)

  /** Forwards to [[singleton]]: TranslationServer.translate */
  final def translate(message: String, context: String = ""): String =
    singleton.translate(message, context)

  /** Forwards to [[singleton]]: TranslationServer.translate_plural */
  final def translatePlural(message: String, pluralMessage: String, n: Long, context: String = ""): String =
    singleton.translatePlural(message, pluralMessage, n, context)

  /** Forwards to [[singleton]]: TranslationServer.add_translation */
  final def addTranslation(translation: Translation): Unit =
    singleton.addTranslation(translation)

  /** Forwards to [[singleton]]: TranslationServer.remove_translation */
  final def removeTranslation(translation: Translation): Unit =
    singleton.removeTranslation(translation)

  /** Forwards to [[singleton]]: TranslationServer.get_translation_object */
  final def getTranslationObject(locale: String): Translation =
    singleton.getTranslationObject(locale)

  /** Forwards to [[singleton]]: TranslationServer.has_translation_for_locale */
  final def hasTranslationForLocale(locale: String, exact: Boolean): Boolean =
    singleton.hasTranslationForLocale(locale, exact)

  /** Forwards to [[singleton]]: TranslationServer.has_translation */
  final def hasTranslation(translation: Translation): Boolean =
    singleton.hasTranslation(translation)

  /** Forwards to [[singleton]]: TranslationServer.has_domain */
  final def hasDomain(domain: String): Boolean =
    singleton.hasDomain(domain)

  /** Forwards to [[singleton]]: TranslationServer.get_or_add_domain */
  final def getOrAddDomain(domain: String): TranslationDomain =
    singleton.getOrAddDomain(domain)

  /** Forwards to [[singleton]]: TranslationServer.remove_domain */
  final def removeDomain(domain: String): Unit =
    singleton.removeDomain(domain)

  /** Forwards to [[singleton]]: TranslationServer.clear */
  final def clear(): Unit =
    singleton.clear()

  /** Forwards to [[singleton]]: TranslationServer.format_number */
  final def formatNumber(number: String, locale: String): String =
    singleton.formatNumber(number, locale)

  /** Forwards to [[singleton]]: TranslationServer.get_percent_sign */
  final def getPercentSign(locale: String): String =
    singleton.getPercentSign(locale)

  /** Forwards to [[singleton]]: TranslationServer.parse_number */
  final def parseNumber(number: String, locale: String): String =
    singleton.parseNumber(number, locale)

  /** Forwards to [[singleton]]: TranslationServer.is_pseudolocalization_enabled */
  final def isPseudolocalizationEnabled(): Boolean =
    singleton.isPseudolocalizationEnabled()

  /** Forwards to [[singleton]]: TranslationServer.set_pseudolocalization_enabled */
  final def setPseudolocalizationEnabled(enabled: Boolean): Unit =
    singleton.setPseudolocalizationEnabled(enabled)

  /** Forwards to [[singleton]]: TranslationServer.reload_pseudolocalization */
  final def reloadPseudolocalization(): Unit =
    singleton.reloadPseudolocalization()

  /** Forwards to [[singleton]]: TranslationServer.pseudolocalize */
  final def pseudolocalize(message: String): String =
    singleton.pseudolocalize(message)
}
