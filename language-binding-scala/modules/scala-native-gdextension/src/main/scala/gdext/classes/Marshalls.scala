package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `Marshalls`, extends `Object`. */
abstract class Marshalls extends Object {

  /** Marshalls.utf8_to_base64 */
  final def utf8ToBase64(utf8_str: String): String =
    Ptrcall.call1[String, String](MethodBind.get("Marshalls", "utf8_to_base64", 1703090593L), hostObject.objectPtr, utf8_str)

  /** Marshalls.base64_to_utf8 */
  final def base64ToUtf8(base64_str: String): String =
    Ptrcall.call1[String, String](MethodBind.get("Marshalls", "base64_to_utf8", 1703090593L), hostObject.objectPtr, base64_str)

}

object Marshalls {
  /** Class metadata for Gd[Marshalls] lifetime management and casting. */
  given GodotClass[Marshalls] with {
    def className = "Marshalls"
    def isRefCounted = false
    def wrap(o: GodotObject): Marshalls = new Marshalls {}.withHost(o.objectPtr)
    def unwrap(t: Marshalls): GodotObject = t.hostObject
  }

  /** The process-global Marshalls singleton instance. */
  def singleton: Marshalls = new Marshalls {}
    .withHost(Godot.interface.global_get_singleton(
      StringNames.cached("Marshalls").ptr))
}
