package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `X509Certificate`, extends `Resource`. */
abstract class X509Certificate extends Resource {
  override def godotClassName: String = "X509Certificate"

  /** X509Certificate.save */
  final def save(path: String): gdext.classes.Error = {
    if (gdext.classes.X509Certificate.mb_save == null) gdext.classes.X509Certificate.mb_save = MethodBind.get("X509Certificate", "save", 166001499L)
    gdext.classes.Error(Ptrcall.call1[String, Long](gdext.classes.X509Certificate.mb_save, livePtr, path))
  }

  /** X509Certificate.load */
  final def load(path: String): gdext.classes.Error = {
    if (gdext.classes.X509Certificate.mb_load == null) gdext.classes.X509Certificate.mb_load = MethodBind.get("X509Certificate", "load", 166001499L)
    gdext.classes.Error(Ptrcall.call1[String, Long](gdext.classes.X509Certificate.mb_load, livePtr, path))
  }

  /** X509Certificate.save_to_string */
  final def saveToString(): String = {
    if (gdext.classes.X509Certificate.mb_save_to_string == null) gdext.classes.X509Certificate.mb_save_to_string = MethodBind.get("X509Certificate", "save_to_string", 2841200299L)
    Ptrcall.call0[String](gdext.classes.X509Certificate.mb_save_to_string, livePtr)
  }

  /** X509Certificate.load_from_string */
  final def loadFromString(string: String): gdext.classes.Error = {
    if (gdext.classes.X509Certificate.mb_load_from_string == null) gdext.classes.X509Certificate.mb_load_from_string = MethodBind.get("X509Certificate", "load_from_string", 166001499L)
    gdext.classes.Error(Ptrcall.call1[String, Long](gdext.classes.X509Certificate.mb_load_from_string, livePtr, string))
  }

}

object X509Certificate {
  private[classes] var mb_save: GDExtensionMethodBindPtr = null
  private[classes] var mb_load: GDExtensionMethodBindPtr = null
  private[classes] var mb_save_to_string: GDExtensionMethodBindPtr = null
  private[classes] var mb_load_from_string: GDExtensionMethodBindPtr = null
}
