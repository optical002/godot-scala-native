package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Marshalls`, extends `Object`. */
abstract class Marshalls extends Object {
  override def godotClassName: String = "Marshalls"

  /** Marshalls.utf8_to_base64 */
  final def utf8ToBase64(utf8Str: String): String = {
    if (gdext.classes.Marshalls.mb_utf8_to_base64 == null) gdext.classes.Marshalls.mb_utf8_to_base64 = MethodBind.get("Marshalls", "utf8_to_base64", 1703090593L)
    Ptrcall.call1[String, String](gdext.classes.Marshalls.mb_utf8_to_base64, livePtr, utf8Str)
  }

  /** Marshalls.base64_to_utf8 */
  final def base64ToUtf8(base64Str: String): String = {
    if (gdext.classes.Marshalls.mb_base64_to_utf8 == null) gdext.classes.Marshalls.mb_base64_to_utf8 = MethodBind.get("Marshalls", "base64_to_utf8", 1703090593L)
    Ptrcall.call1[String, String](gdext.classes.Marshalls.mb_base64_to_utf8, livePtr, base64Str)
  }

}

object Marshalls {
  private[classes] var mb_utf8_to_base64: GDExtensionMethodBindPtr = null
  private[classes] var mb_base64_to_utf8: GDExtensionMethodBindPtr = null

  private var instance: Marshalls = null

  /** The process-global Marshalls singleton instance. */
  def singleton: Marshalls = {
    if (instance == null)
      instance = Wrappers.borrowed[Marshalls](GodotObject.fromPtr(
        Godot.interface.global_get_singleton(StringNames.cached("Marshalls").ptr)))
    instance
  }

  /** Forwards to [[singleton]]: Marshalls.utf8_to_base64 */
  final def utf8ToBase64(utf8Str: String): String =
    singleton.utf8ToBase64(utf8Str)

  /** Forwards to [[singleton]]: Marshalls.base64_to_utf8 */
  final def base64ToUtf8(base64Str: String): String =
    singleton.base64ToUtf8(base64Str)
}
