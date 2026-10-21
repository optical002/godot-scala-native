package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ConfigFile`, extends `RefCounted`. */
abstract class ConfigFile extends RefCounted {
  override def godotClassName: String = "ConfigFile"

  /** ConfigFile.has_section */
  final def hasSection(section: String): Boolean = {
    if (gdext.classes.ConfigFile.mb_has_section == null) gdext.classes.ConfigFile.mb_has_section = MethodBind.get("ConfigFile", "has_section", 3927539163L)
    Ptrcall.call1[String, Boolean](gdext.classes.ConfigFile.mb_has_section, livePtr, section)
  }

  /** ConfigFile.has_section_key */
  final def hasSectionKey(section: String, key: String): Boolean = {
    if (gdext.classes.ConfigFile.mb_has_section_key == null) gdext.classes.ConfigFile.mb_has_section_key = MethodBind.get("ConfigFile", "has_section_key", 820780508L)
    Ptrcall.call2[String, String, Boolean](gdext.classes.ConfigFile.mb_has_section_key, livePtr, section, key)
  }

  /** ConfigFile.erase_section */
  final def eraseSection(section: String): Unit = {
    if (gdext.classes.ConfigFile.mb_erase_section == null) gdext.classes.ConfigFile.mb_erase_section = MethodBind.get("ConfigFile", "erase_section", 83702148L)
    Ptrcall.callVoid1(gdext.classes.ConfigFile.mb_erase_section, livePtr, section)
  }

  /** ConfigFile.erase_section_key */
  final def eraseSectionKey(section: String, key: String): Unit = {
    if (gdext.classes.ConfigFile.mb_erase_section_key == null) gdext.classes.ConfigFile.mb_erase_section_key = MethodBind.get("ConfigFile", "erase_section_key", 3186203200L)
    Ptrcall.callVoid2(gdext.classes.ConfigFile.mb_erase_section_key, livePtr, section, key)
  }

  /** ConfigFile.load */
  final def load(path: String): Long = {
    if (gdext.classes.ConfigFile.mb_load == null) gdext.classes.ConfigFile.mb_load = MethodBind.get("ConfigFile", "load", 166001499L)
    Ptrcall.call1[String, Long](gdext.classes.ConfigFile.mb_load, livePtr, path)
  }

  /** ConfigFile.parse */
  final def parse(data: String): Long = {
    if (gdext.classes.ConfigFile.mb_parse == null) gdext.classes.ConfigFile.mb_parse = MethodBind.get("ConfigFile", "parse", 166001499L)
    Ptrcall.call1[String, Long](gdext.classes.ConfigFile.mb_parse, livePtr, data)
  }

  /** ConfigFile.save */
  final def save(path: String): Long = {
    if (gdext.classes.ConfigFile.mb_save == null) gdext.classes.ConfigFile.mb_save = MethodBind.get("ConfigFile", "save", 166001499L)
    Ptrcall.call1[String, Long](gdext.classes.ConfigFile.mb_save, livePtr, path)
  }

  /** ConfigFile.encode_to_text */
  final def encodeToText(): String = {
    if (gdext.classes.ConfigFile.mb_encode_to_text == null) gdext.classes.ConfigFile.mb_encode_to_text = MethodBind.get("ConfigFile", "encode_to_text", 201670096L)
    Ptrcall.call0[String](gdext.classes.ConfigFile.mb_encode_to_text, livePtr)
  }

  /** ConfigFile.load_encrypted_pass */
  final def loadEncryptedPass(path: String, password: String): Long = {
    if (gdext.classes.ConfigFile.mb_load_encrypted_pass == null) gdext.classes.ConfigFile.mb_load_encrypted_pass = MethodBind.get("ConfigFile", "load_encrypted_pass", 852856452L)
    Ptrcall.call2[String, String, Long](gdext.classes.ConfigFile.mb_load_encrypted_pass, livePtr, path, password)
  }

  /** ConfigFile.save_encrypted_pass */
  final def saveEncryptedPass(path: String, password: String): Long = {
    if (gdext.classes.ConfigFile.mb_save_encrypted_pass == null) gdext.classes.ConfigFile.mb_save_encrypted_pass = MethodBind.get("ConfigFile", "save_encrypted_pass", 852856452L)
    Ptrcall.call2[String, String, Long](gdext.classes.ConfigFile.mb_save_encrypted_pass, livePtr, path, password)
  }

  /** ConfigFile.clear */
  final def clear(): Unit = {
    if (gdext.classes.ConfigFile.mb_clear == null) gdext.classes.ConfigFile.mb_clear = MethodBind.get("ConfigFile", "clear", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.ConfigFile.mb_clear, livePtr)
  }

}

object ConfigFile {
  private[classes] var mb_has_section: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_section_key: GDExtensionMethodBindPtr = null
  private[classes] var mb_erase_section: GDExtensionMethodBindPtr = null
  private[classes] var mb_erase_section_key: GDExtensionMethodBindPtr = null
  private[classes] var mb_load: GDExtensionMethodBindPtr = null
  private[classes] var mb_parse: GDExtensionMethodBindPtr = null
  private[classes] var mb_save: GDExtensionMethodBindPtr = null
  private[classes] var mb_encode_to_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_load_encrypted_pass: GDExtensionMethodBindPtr = null
  private[classes] var mb_save_encrypted_pass: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear: GDExtensionMethodBindPtr = null
}
