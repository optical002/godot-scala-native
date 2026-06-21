package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `ImageFormatLoaderExtension`, extends `ImageFormatLoader`. */
abstract class ImageFormatLoaderExtension extends ImageFormatLoader {

  /** ImageFormatLoaderExtension.add_format_loader */
  final def addFormatLoader(): Unit =
    Ptrcall.callVoid0(MethodBind.get("ImageFormatLoaderExtension", "add_format_loader", 3218959716L), hostObject.objectPtr)

  /** ImageFormatLoaderExtension.remove_format_loader */
  final def removeFormatLoader(): Unit =
    Ptrcall.callVoid0(MethodBind.get("ImageFormatLoaderExtension", "remove_format_loader", 3218959716L), hostObject.objectPtr)

}

object ImageFormatLoaderExtension {
  /** Class metadata for Gd[ImageFormatLoaderExtension] lifetime management and casting. */
  given GodotClass[ImageFormatLoaderExtension] with {
    def className = "ImageFormatLoaderExtension"
    def isRefCounted = true
    def wrap(o: GodotObject): ImageFormatLoaderExtension = new ImageFormatLoaderExtension {}.withHost(o.objectPtr)
    def unwrap(t: ImageFormatLoaderExtension): GodotObject = t.hostObject
  }
}
