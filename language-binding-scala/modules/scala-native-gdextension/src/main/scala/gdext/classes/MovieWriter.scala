package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `MovieWriter`, extends `Object`. */
abstract class MovieWriter extends Object {
  override def godotClassName: String = "MovieWriter"

}

object MovieWriter {
  private[classes] var mb_add_writer: GDExtensionMethodBindPtr = null

  /** MovieWriter.add_writer */
  final def addWriter(writer: MovieWriter): Unit = {
    if (gdext.classes.MovieWriter.mb_add_writer == null) gdext.classes.MovieWriter.mb_add_writer = MethodBind.get("MovieWriter", "add_writer", 4023702871L)
    Ptrcall.callVoid1(gdext.classes.MovieWriter.mb_add_writer, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], Wrappers.handle(writer))
  }
}
