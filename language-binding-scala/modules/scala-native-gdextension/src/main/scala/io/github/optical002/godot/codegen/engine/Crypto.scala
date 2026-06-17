package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `Crypto`, extends `RefCounted`. */
abstract class Crypto extends RefCounted {

  /** Crypto.generate_rsa */
  final def generateRsa(size: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("Crypto", "generate_rsa", 1237515462L), hostObject.objectPtr, size)

  /** Crypto.generate_self_signed_certificate */
  final def generateSelfSignedCertificate(key: CryptoKey, issuer_name: String, not_before: String, not_after: String): GodotObject =
    Ptrcall.call4[GodotObject, String, String, String, GodotObject](MethodBind.get("Crypto", "generate_self_signed_certificate", 492266173L), hostObject.objectPtr, key.hostObject, issuer_name, not_before, not_after)

}

object Crypto {
  /** Class metadata for Gd[Crypto] lifetime management and casting. */
  given GodotClass[Crypto] with {
    def className = "Crypto"
    def isRefCounted = true
    def wrap(o: GodotObject): Crypto = new Crypto {}.withHost(o.objectPtr)
    def unwrap(t: Crypto): GodotObject = t.hostObject
  }
}
