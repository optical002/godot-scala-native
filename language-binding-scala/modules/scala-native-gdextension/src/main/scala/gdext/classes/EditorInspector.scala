package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorInspector`, extends `ScrollContainer`. */
abstract class EditorInspector extends ScrollContainer {

  /** EditorInspector.edit */
  final def edit(`object`: Object): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorInspector", "edit", 3975164845L), hostObject.objectPtr, `object`.hostObject)

  /** EditorInspector.get_selected_path */
  final def getSelectedPath(): String =
    Ptrcall.call0[String](MethodBind.get("EditorInspector", "get_selected_path", 201670096L), hostObject.objectPtr)

  /** EditorInspector.get_edited_object */
  final def getEditedObject(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("EditorInspector", "get_edited_object", 2050059866L), hostObject.objectPtr)

}

object EditorInspector {
  /** Class metadata for Gd[EditorInspector] lifetime management and casting. */
  given GodotClass[EditorInspector] with {
    def className = "EditorInspector"
    def isRefCounted = false
    def wrap(o: GodotObject): EditorInspector = new EditorInspector {}.withHost(o.objectPtr)
    def unwrap(t: EditorInspector): GodotObject = t.hostObject
  }
}
