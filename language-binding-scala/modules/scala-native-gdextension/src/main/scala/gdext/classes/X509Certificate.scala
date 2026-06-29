package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `X509Certificate`, extends `Resource`. */
abstract class X509Certificate extends Resource {
  override def godotClassName: String = "X509Certificate"

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
