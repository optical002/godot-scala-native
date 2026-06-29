package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorResourceTooltipPlugin`, extends `RefCounted`. */
abstract class EditorResourceTooltipPlugin extends RefCounted {
  override def godotClassName: String = "EditorResourceTooltipPlugin"

  /** EditorResourceTooltipPlugin.request_thumbnail */
  final def requestThumbnail(path: String, control: TextureRect): Unit =
    Ptrcall.callVoid2(MethodBind.get("EditorResourceTooltipPlugin", "request_thumbnail", 3245519720L), hostObject.objectPtr, path, control.hostObject)

}
