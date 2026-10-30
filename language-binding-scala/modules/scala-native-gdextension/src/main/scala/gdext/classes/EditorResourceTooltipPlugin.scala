package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `EditorResourceTooltipPlugin`, extends `RefCounted`. */
abstract class EditorResourceTooltipPlugin extends RefCounted {
  override def godotClassName: String = "EditorResourceTooltipPlugin"

  /** EditorResourceTooltipPlugin.request_thumbnail */
  final def requestThumbnail(path: String, control: TextureRect): Unit = {
    if (gdext.classes.EditorResourceTooltipPlugin.mb_request_thumbnail == null) gdext.classes.EditorResourceTooltipPlugin.mb_request_thumbnail = MethodBind.get("EditorResourceTooltipPlugin", "request_thumbnail", 3245519720L)
    Ptrcall.callVoid2(gdext.classes.EditorResourceTooltipPlugin.mb_request_thumbnail, livePtr, path, Wrappers.handle(control))
  }

}

object EditorResourceTooltipPlugin {
  private[classes] var mb_request_thumbnail: GDExtensionMethodBindPtr = null
}
