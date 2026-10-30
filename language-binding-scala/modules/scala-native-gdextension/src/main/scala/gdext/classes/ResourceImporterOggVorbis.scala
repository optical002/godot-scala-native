package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ResourceImporterOggVorbis`, extends `ResourceImporter`. */
abstract class ResourceImporterOggVorbis extends ResourceImporter {
  override def godotClassName: String = "ResourceImporterOggVorbis"

}

object ResourceImporterOggVorbis {
  private[classes] var mb_load_from_file: GDExtensionMethodBindPtr = null

  /** ResourceImporterOggVorbis.load_from_file. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def loadFromFile(path: String): AudioStreamOggVorbis = {
    if (gdext.classes.ResourceImporterOggVorbis.mb_load_from_file == null) gdext.classes.ResourceImporterOggVorbis.mb_load_from_file = MethodBind.get("ResourceImporterOggVorbis", "load_from_file", 797568536L)
    Wrappers.owned[AudioStreamOggVorbis](Ptrcall.call1[String, Long](gdext.classes.ResourceImporterOggVorbis.mb_load_from_file, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], path))
  }
}
