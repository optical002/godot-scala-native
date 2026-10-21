package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `CryptoKey`, extends `Resource`. */
abstract class CryptoKey extends Resource {
  override def godotClassName: String = "CryptoKey"

  /** CryptoKey.save */
  final def save(path: String, public_only: Boolean): Long = {
    if (gdext.classes.CryptoKey.mb_save == null) gdext.classes.CryptoKey.mb_save = MethodBind.get("CryptoKey", "save", 885841341L)
    Ptrcall.call2[String, Boolean, Long](gdext.classes.CryptoKey.mb_save, livePtr, path, public_only)
  }

  /** CryptoKey.load */
  final def load(path: String, public_only: Boolean): Long = {
    if (gdext.classes.CryptoKey.mb_load == null) gdext.classes.CryptoKey.mb_load = MethodBind.get("CryptoKey", "load", 885841341L)
    Ptrcall.call2[String, Boolean, Long](gdext.classes.CryptoKey.mb_load, livePtr, path, public_only)
  }

  /** CryptoKey.is_public_only */
  final def isPublicOnly(): Boolean = {
    if (gdext.classes.CryptoKey.mb_is_public_only == null) gdext.classes.CryptoKey.mb_is_public_only = MethodBind.get("CryptoKey", "is_public_only", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CryptoKey.mb_is_public_only, livePtr)
  }

  /** CryptoKey.save_to_string */
  final def saveToString(public_only: Boolean): String = {
    if (gdext.classes.CryptoKey.mb_save_to_string == null) gdext.classes.CryptoKey.mb_save_to_string = MethodBind.get("CryptoKey", "save_to_string", 32795936L)
    Ptrcall.call1[Boolean, String](gdext.classes.CryptoKey.mb_save_to_string, livePtr, public_only)
  }

  /** CryptoKey.load_from_string */
  final def loadFromString(string_key: String, public_only: Boolean): Long = {
    if (gdext.classes.CryptoKey.mb_load_from_string == null) gdext.classes.CryptoKey.mb_load_from_string = MethodBind.get("CryptoKey", "load_from_string", 885841341L)
    Ptrcall.call2[String, Boolean, Long](gdext.classes.CryptoKey.mb_load_from_string, livePtr, string_key, public_only)
  }

}

object CryptoKey {
  private[classes] var mb_save: GDExtensionMethodBindPtr = null
  private[classes] var mb_load: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_public_only: GDExtensionMethodBindPtr = null
  private[classes] var mb_save_to_string: GDExtensionMethodBindPtr = null
  private[classes] var mb_load_from_string: GDExtensionMethodBindPtr = null
}
