package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `ImageFormatLoaderExtension`, extends `ImageFormatLoader`. */
abstract class ImageFormatLoaderExtension extends ImageFormatLoader {
  override def godotClassName: String = "ImageFormatLoaderExtension"

  /** ImageFormatLoaderExtension.add_format_loader */
  final def addFormatLoader(): Unit =
    Ptrcall.callVoid0(MethodBind.get("ImageFormatLoaderExtension", "add_format_loader", 3218959716L), hostObject.objectPtr)

  /** ImageFormatLoaderExtension.remove_format_loader */
  final def removeFormatLoader(): Unit =
    Ptrcall.callVoid0(MethodBind.get("ImageFormatLoaderExtension", "remove_format_loader", 3218959716L), hostObject.objectPtr)

}
