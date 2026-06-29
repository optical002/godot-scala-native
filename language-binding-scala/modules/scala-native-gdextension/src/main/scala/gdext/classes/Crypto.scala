package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `Crypto`, extends `RefCounted`. */
abstract class Crypto extends RefCounted {
  override def godotClassName: String = "Crypto"

  /** Crypto.generate_rsa */
  final def generateRsa(size: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("Crypto", "generate_rsa", 1237515462L), hostObject.objectPtr, size)

  /** Crypto.generate_self_signed_certificate */
  final def generateSelfSignedCertificate(key: CryptoKey, issuer_name: String, not_before: String, not_after: String): GodotObject =
    Ptrcall.call4[GodotObject, String, String, String, GodotObject](MethodBind.get("Crypto", "generate_self_signed_certificate", 492266173L), hostObject.objectPtr, key.hostObject, issuer_name, not_before, not_after)

}
