package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `Marshalls`, extends `Object`. */
abstract class Marshalls extends Object {
  override def godotClassName: String = "Marshalls"

  /** Marshalls.utf8_to_base64 */
  final def utf8ToBase64(utf8_str: String): String =
    Ptrcall.call1[String, String](MethodBind.get("Marshalls", "utf8_to_base64", 1703090593L), hostObject.objectPtr, utf8_str)

  /** Marshalls.base64_to_utf8 */
  final def base64ToUtf8(base64_str: String): String =
    Ptrcall.call1[String, String](MethodBind.get("Marshalls", "base64_to_utf8", 1703090593L), hostObject.objectPtr, base64_str)

}

object Marshalls {
  /** The process-global Marshalls singleton instance. */
  def singleton: Marshalls = new Marshalls {}
    .withHost(Godot.interface.global_get_singleton(
      StringNames.cached("Marshalls").ptr))
}
