package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `CryptoKey`, extends `Resource`. */
abstract class CryptoKey extends Resource {
  override def godotClassName: String = "CryptoKey"

  /** CryptoKey.save */
  final def save(path: String, public_only: Boolean): Long =
    Ptrcall.call2[String, Boolean, Long](MethodBind.get("CryptoKey", "save", 885841341L), hostObject.objectPtr, path, public_only)

  /** CryptoKey.load */
  final def load(path: String, public_only: Boolean): Long =
    Ptrcall.call2[String, Boolean, Long](MethodBind.get("CryptoKey", "load", 885841341L), hostObject.objectPtr, path, public_only)

  /** CryptoKey.is_public_only */
  final def isPublicOnly(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CryptoKey", "is_public_only", 36873697L), hostObject.objectPtr)

  /** CryptoKey.save_to_string */
  final def saveToString(public_only: Boolean): String =
    Ptrcall.call1[Boolean, String](MethodBind.get("CryptoKey", "save_to_string", 32795936L), hostObject.objectPtr, public_only)

  /** CryptoKey.load_from_string */
  final def loadFromString(string_key: String, public_only: Boolean): Long =
    Ptrcall.call2[String, Boolean, Long](MethodBind.get("CryptoKey", "load_from_string", 885841341L), hostObject.objectPtr, string_key, public_only)

}
