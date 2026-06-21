package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `ConfigFile`, extends `RefCounted`. */
abstract class ConfigFile extends RefCounted {

  /** ConfigFile.has_section */
  final def hasSection(section: String): Boolean =
    Ptrcall.call1[String, Boolean](MethodBind.get("ConfigFile", "has_section", 3927539163L), hostObject.objectPtr, section)

  /** ConfigFile.has_section_key */
  final def hasSectionKey(section: String, key: String): Boolean =
    Ptrcall.call2[String, String, Boolean](MethodBind.get("ConfigFile", "has_section_key", 820780508L), hostObject.objectPtr, section, key)

  /** ConfigFile.erase_section */
  final def eraseSection(section: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("ConfigFile", "erase_section", 83702148L), hostObject.objectPtr, section)

  /** ConfigFile.erase_section_key */
  final def eraseSectionKey(section: String, key: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("ConfigFile", "erase_section_key", 3186203200L), hostObject.objectPtr, section, key)

  /** ConfigFile.load */
  final def load(path: String): Long =
    Ptrcall.call1[String, Long](MethodBind.get("ConfigFile", "load", 166001499L), hostObject.objectPtr, path)

  /** ConfigFile.parse */
  final def parse(data: String): Long =
    Ptrcall.call1[String, Long](MethodBind.get("ConfigFile", "parse", 166001499L), hostObject.objectPtr, data)

  /** ConfigFile.save */
  final def save(path: String): Long =
    Ptrcall.call1[String, Long](MethodBind.get("ConfigFile", "save", 166001499L), hostObject.objectPtr, path)

  /** ConfigFile.encode_to_text */
  final def encodeToText(): String =
    Ptrcall.call0[String](MethodBind.get("ConfigFile", "encode_to_text", 201670096L), hostObject.objectPtr)

  /** ConfigFile.load_encrypted_pass */
  final def loadEncryptedPass(path: String, password: String): Long =
    Ptrcall.call2[String, String, Long](MethodBind.get("ConfigFile", "load_encrypted_pass", 852856452L), hostObject.objectPtr, path, password)

  /** ConfigFile.save_encrypted_pass */
  final def saveEncryptedPass(path: String, password: String): Long =
    Ptrcall.call2[String, String, Long](MethodBind.get("ConfigFile", "save_encrypted_pass", 852856452L), hostObject.objectPtr, path, password)

  /** ConfigFile.clear */
  final def clear(): Unit =
    Ptrcall.callVoid0(MethodBind.get("ConfigFile", "clear", 3218959716L), hostObject.objectPtr)

}

object ConfigFile {
  /** Class metadata for Gd[ConfigFile] lifetime management and casting. */
  given GodotClass[ConfigFile] with {
    def className = "ConfigFile"
    def isRefCounted = true
    def wrap(o: GodotObject): ConfigFile = new ConfigFile {}.withHost(o.objectPtr)
    def unwrap(t: ConfigFile): GodotObject = t.hostObject
  }
}
