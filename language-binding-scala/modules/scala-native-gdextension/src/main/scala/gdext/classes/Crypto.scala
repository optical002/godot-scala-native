package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Crypto`, extends `RefCounted`. */
abstract class Crypto extends RefCounted {
  override def godotClassName: String = "Crypto"

  /** Crypto.generate_rsa. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def generateRsa(size: Long): CryptoKey = {
    if (gdext.classes.Crypto.mb_generate_rsa == null) gdext.classes.Crypto.mb_generate_rsa = MethodBind.get("Crypto", "generate_rsa", 1237515462L)
    Wrappers.owned[CryptoKey](Ptrcall.call1[Long, Long](gdext.classes.Crypto.mb_generate_rsa, livePtr, size))
  }

  /** Crypto.generate_self_signed_certificate. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def generateSelfSignedCertificate(key: CryptoKey, issuer_name: String, not_before: String, not_after: String): X509Certificate = {
    if (gdext.classes.Crypto.mb_generate_self_signed_certificate == null) gdext.classes.Crypto.mb_generate_self_signed_certificate = MethodBind.get("Crypto", "generate_self_signed_certificate", 492266173L)
    Wrappers.owned[X509Certificate](Ptrcall.call4[GodotObject, String, String, String, Long](gdext.classes.Crypto.mb_generate_self_signed_certificate, livePtr, Wrappers.handle(key), issuer_name, not_before, not_after))
  }

}

object Crypto {
  private[classes] var mb_generate_rsa: GDExtensionMethodBindPtr = null
  private[classes] var mb_generate_self_signed_certificate: GDExtensionMethodBindPtr = null
}
