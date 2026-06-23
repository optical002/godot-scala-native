package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `TranslationServer`, extends `Object`. */
abstract class TranslationServer extends Object {

  /** TranslationServer.set_locale */
  final def setLocale(locale: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("TranslationServer", "set_locale", 83702148L), hostObject.objectPtr, locale)

  /** TranslationServer.get_locale */
  final def getLocale(): String =
    Ptrcall.call0[String](MethodBind.get("TranslationServer", "get_locale", 201670096L), hostObject.objectPtr)

  /** TranslationServer.get_tool_locale */
  final def getToolLocale(): String =
    Ptrcall.call0[String](MethodBind.get("TranslationServer", "get_tool_locale", 2841200299L), hostObject.objectPtr)

  /** TranslationServer.compare_locales */
  final def compareLocales(locale_a: String, locale_b: String): Long =
    Ptrcall.call2[String, String, Long](MethodBind.get("TranslationServer", "compare_locales", 2878152881L), hostObject.objectPtr, locale_a, locale_b)

  /** TranslationServer.standardize_locale */
  final def standardizeLocale(locale: String, add_defaults: Boolean): String =
    Ptrcall.call2[String, Boolean, String](MethodBind.get("TranslationServer", "standardize_locale", 4216441673L), hostObject.objectPtr, locale, add_defaults)

  /** TranslationServer.get_language_name */
  final def getLanguageName(language: String): String =
    Ptrcall.call1[String, String](MethodBind.get("TranslationServer", "get_language_name", 3135753539L), hostObject.objectPtr, language)

  /** TranslationServer.get_script_name */
  final def getScriptName(script: String): String =
    Ptrcall.call1[String, String](MethodBind.get("TranslationServer", "get_script_name", 3135753539L), hostObject.objectPtr, script)

  /** TranslationServer.get_country_name */
  final def getCountryName(country: String): String =
    Ptrcall.call1[String, String](MethodBind.get("TranslationServer", "get_country_name", 3135753539L), hostObject.objectPtr, country)

  /** TranslationServer.get_locale_name */
  final def getLocaleName(locale: String): String =
    Ptrcall.call1[String, String](MethodBind.get("TranslationServer", "get_locale_name", 3135753539L), hostObject.objectPtr, locale)

  /** TranslationServer.get_plural_rules */
  final def getPluralRules(locale: String): String =
    Ptrcall.call1[String, String](MethodBind.get("TranslationServer", "get_plural_rules", 3135753539L), hostObject.objectPtr, locale)

  /** TranslationServer.translate */
  final def translate(message: gdext.builtin.StringName, context: gdext.builtin.StringName): gdext.builtin.StringName =
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, gdext.builtin.StringName](MethodBind.get("TranslationServer", "translate", 1829228469L), hostObject.objectPtr, message, context)

  /** TranslationServer.translate_plural */
  final def translatePlural(message: gdext.builtin.StringName, plural_message: gdext.builtin.StringName, n: Long, context: gdext.builtin.StringName): gdext.builtin.StringName =
    Ptrcall.call4[gdext.builtin.StringName, gdext.builtin.StringName, Long, gdext.builtin.StringName, gdext.builtin.StringName](MethodBind.get("TranslationServer", "translate_plural", 229954002L), hostObject.objectPtr, message, plural_message, n, context)

  /** TranslationServer.add_translation */
  final def addTranslation(translation: Translation): Unit =
    Ptrcall.callVoid1(MethodBind.get("TranslationServer", "add_translation", 1466479800L), hostObject.objectPtr, translation.hostObject)

  /** TranslationServer.remove_translation */
  final def removeTranslation(translation: Translation): Unit =
    Ptrcall.callVoid1(MethodBind.get("TranslationServer", "remove_translation", 1466479800L), hostObject.objectPtr, translation.hostObject)

  /** TranslationServer.get_translation_object */
  final def getTranslationObject(locale: String): GodotObject =
    Ptrcall.call1[String, GodotObject](MethodBind.get("TranslationServer", "get_translation_object", 2065240175L), hostObject.objectPtr, locale)

  /** TranslationServer.has_translation_for_locale */
  final def hasTranslationForLocale(locale: String, exact: Boolean): Boolean =
    Ptrcall.call2[String, Boolean, Boolean](MethodBind.get("TranslationServer", "has_translation_for_locale", 2034713381L), hostObject.objectPtr, locale, exact)

  /** TranslationServer.has_translation */
  final def hasTranslation(translation: Translation): Boolean =
    Ptrcall.call1[GodotObject, Boolean](MethodBind.get("TranslationServer", "has_translation", 2696976312L), hostObject.objectPtr, translation.hostObject)

  /** TranslationServer.has_domain */
  final def hasDomain(domain: gdext.builtin.StringName): Boolean =
    Ptrcall.call1[gdext.builtin.StringName, Boolean](MethodBind.get("TranslationServer", "has_domain", 2619796661L), hostObject.objectPtr, domain)

  /** TranslationServer.get_or_add_domain */
  final def getOrAddDomain(domain: gdext.builtin.StringName): GodotObject =
    Ptrcall.call1[gdext.builtin.StringName, GodotObject](MethodBind.get("TranslationServer", "get_or_add_domain", 397200075L), hostObject.objectPtr, domain)

  /** TranslationServer.remove_domain */
  final def removeDomain(domain: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("TranslationServer", "remove_domain", 3304788590L), hostObject.objectPtr, domain)

  /** TranslationServer.clear */
  final def clear(): Unit =
    Ptrcall.callVoid0(MethodBind.get("TranslationServer", "clear", 3218959716L), hostObject.objectPtr)

  /** TranslationServer.format_number */
  final def formatNumber(number: String, locale: String): String =
    Ptrcall.call2[String, String, String](MethodBind.get("TranslationServer", "format_number", 315676799L), hostObject.objectPtr, number, locale)

  /** TranslationServer.get_percent_sign */
  final def getPercentSign(locale: String): String =
    Ptrcall.call1[String, String](MethodBind.get("TranslationServer", "get_percent_sign", 3135753539L), hostObject.objectPtr, locale)

  /** TranslationServer.parse_number */
  final def parseNumber(number: String, locale: String): String =
    Ptrcall.call2[String, String, String](MethodBind.get("TranslationServer", "parse_number", 315676799L), hostObject.objectPtr, number, locale)

  /** TranslationServer.is_pseudolocalization_enabled */
  final def isPseudolocalizationEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TranslationServer", "is_pseudolocalization_enabled", 36873697L), hostObject.objectPtr)

  /** TranslationServer.set_pseudolocalization_enabled */
  final def setPseudolocalizationEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TranslationServer", "set_pseudolocalization_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** TranslationServer.reload_pseudolocalization */
  final def reloadPseudolocalization(): Unit =
    Ptrcall.callVoid0(MethodBind.get("TranslationServer", "reload_pseudolocalization", 3218959716L), hostObject.objectPtr)

  /** TranslationServer.pseudolocalize */
  final def pseudolocalize(message: gdext.builtin.StringName): gdext.builtin.StringName =
    Ptrcall.call1[gdext.builtin.StringName, gdext.builtin.StringName](MethodBind.get("TranslationServer", "pseudolocalize", 1965194235L), hostObject.objectPtr, message)

}

object TranslationServer {
  /** Class metadata for Gd[TranslationServer] lifetime management and casting. */
  given GodotClass[TranslationServer] with {
    def className = "TranslationServer"
    def isRefCounted = false
    def wrap(o: GodotObject): TranslationServer = new TranslationServer {}.withHost(o.objectPtr)
    def unwrap(t: TranslationServer): GodotObject = t.hostObject
  }

  /** The process-global TranslationServer singleton instance. */
  def singleton: TranslationServer = new TranslationServer {}
    .withHost(Godot.interface.global_get_singleton(
      StringNames.cached("TranslationServer").ptr))
}
