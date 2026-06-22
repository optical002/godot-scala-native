package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorResourceTooltipPlugin`, extends `RefCounted`. */
abstract class EditorResourceTooltipPlugin extends RefCounted {

  /** EditorResourceTooltipPlugin.request_thumbnail */
  final def requestThumbnail(path: String, control: TextureRect): Unit =
    Ptrcall.callVoid2(MethodBind.get("EditorResourceTooltipPlugin", "request_thumbnail", 3245519720L), hostObject.objectPtr, path, control.hostObject)

}

object EditorResourceTooltipPlugin {
  /** Class metadata for Gd[EditorResourceTooltipPlugin] lifetime management and casting. */
  given GodotClass[EditorResourceTooltipPlugin] with {
    def className = "EditorResourceTooltipPlugin"
    def isRefCounted = true
    def wrap(o: GodotObject): EditorResourceTooltipPlugin = new EditorResourceTooltipPlugin {}.withHost(o.objectPtr)
    def unwrap(t: EditorResourceTooltipPlugin): GodotObject = t.hostObject
  }
}
