package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ImageFormatLoaderExtension`, extends `ImageFormatLoader`. */
abstract class ImageFormatLoaderExtension extends ImageFormatLoader {
  override def godotClassName: String = "ImageFormatLoaderExtension"

  /** ImageFormatLoaderExtension.add_format_loader */
  final def addFormatLoader(): Unit = {
    if (gdext.classes.ImageFormatLoaderExtension.mb_add_format_loader == null) gdext.classes.ImageFormatLoaderExtension.mb_add_format_loader = MethodBind.get("ImageFormatLoaderExtension", "add_format_loader", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.ImageFormatLoaderExtension.mb_add_format_loader, livePtr)
  }

  /** ImageFormatLoaderExtension.remove_format_loader */
  final def removeFormatLoader(): Unit = {
    if (gdext.classes.ImageFormatLoaderExtension.mb_remove_format_loader == null) gdext.classes.ImageFormatLoaderExtension.mb_remove_format_loader = MethodBind.get("ImageFormatLoaderExtension", "remove_format_loader", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.ImageFormatLoaderExtension.mb_remove_format_loader, livePtr)
  }

}

object ImageFormatLoaderExtension {
  private[classes] var mb_add_format_loader: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_format_loader: GDExtensionMethodBindPtr = null
}
