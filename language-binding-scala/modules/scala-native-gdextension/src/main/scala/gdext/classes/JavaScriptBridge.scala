package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `JavaScriptBridge`, extends `Object`. */
abstract class JavaScriptBridge extends Object {

  /** JavaScriptBridge.get_interface */
  final def getInterface(interface: String): GodotObject =
    Ptrcall.call1[String, GodotObject](MethodBind.get("JavaScriptBridge", "get_interface", 1355533281L), hostObject.objectPtr, interface)

  /** JavaScriptBridge.is_js_buffer */
  final def isJsBuffer(javascript_object: JavaScriptObject): Boolean =
    Ptrcall.call1[GodotObject, Boolean](MethodBind.get("JavaScriptBridge", "is_js_buffer", 821968997L), hostObject.objectPtr, javascript_object.hostObject)

  /** JavaScriptBridge.pwa_needs_update */
  final def pwaNeedsUpdate(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("JavaScriptBridge", "pwa_needs_update", 36873697L), hostObject.objectPtr)

  /** JavaScriptBridge.pwa_update */
  final def pwaUpdate(): Long =
    Ptrcall.call0[Long](MethodBind.get("JavaScriptBridge", "pwa_update", 166280745L), hostObject.objectPtr)

  /** JavaScriptBridge.force_fs_sync */
  final def forceFsSync(): Unit =
    Ptrcall.callVoid0(MethodBind.get("JavaScriptBridge", "force_fs_sync", 3218959716L), hostObject.objectPtr)

}

object JavaScriptBridge {
  /** Class metadata for Gd[JavaScriptBridge] lifetime management and casting. */
  given GodotClass[JavaScriptBridge] with {
    def className = "JavaScriptBridge"
    def isRefCounted = false
    def wrap(o: GodotObject): JavaScriptBridge = new JavaScriptBridge {}.withHost(o.objectPtr)
    def unwrap(t: JavaScriptBridge): GodotObject = t.hostObject
  }

  /** The process-global JavaScriptBridge singleton instance. */
  def singleton: JavaScriptBridge = new JavaScriptBridge {}
    .withHost(Godot.interface.global_get_singleton(
      StringNames.cached("JavaScriptBridge").ptr))
}
