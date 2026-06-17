package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `X509Certificate`, extends `Resource`. */
abstract class X509Certificate extends Resource {

  /** X509Certificate.save */
  final def save(path: String): Long =
    Ptrcall.call1[String, Long](MethodBind.get("X509Certificate", "save", 166001499L), hostObject.objectPtr, path)

  /** X509Certificate.load */
  final def load(path: String): Long =
    Ptrcall.call1[String, Long](MethodBind.get("X509Certificate", "load", 166001499L), hostObject.objectPtr, path)

  /** X509Certificate.save_to_string */
  final def saveToString(): String =
    Ptrcall.call0[String](MethodBind.get("X509Certificate", "save_to_string", 2841200299L), hostObject.objectPtr)

  /** X509Certificate.load_from_string */
  final def loadFromString(string: String): Long =
    Ptrcall.call1[String, Long](MethodBind.get("X509Certificate", "load_from_string", 166001499L), hostObject.objectPtr, string)

}

object X509Certificate {
  /** Class metadata for Gd[X509Certificate] lifetime management and casting. */
  given GodotClass[X509Certificate] with {
    def className = "X509Certificate"
    def isRefCounted = true
    def wrap(o: GodotObject): X509Certificate = new X509Certificate {}.withHost(o.objectPtr)
    def unwrap(t: X509Certificate): GodotObject = t.hostObject
  }
}
