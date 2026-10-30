package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `JavaScriptBridge`, extends `Object`. */
abstract class JavaScriptBridge extends Object {
  override def godotClassName: String = "JavaScriptBridge"

  /** JavaScriptBridge.get_interface. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getInterface(interface: String): JavaScriptObject = {
    if (gdext.classes.JavaScriptBridge.mb_get_interface == null) gdext.classes.JavaScriptBridge.mb_get_interface = MethodBind.get("JavaScriptBridge", "get_interface", 1355533281L)
    Wrappers.owned[JavaScriptObject](Ptrcall.call1[String, Long](gdext.classes.JavaScriptBridge.mb_get_interface, livePtr, interface))
  }

  /** JavaScriptBridge.is_js_buffer */
  final def isJsBuffer(javascriptObject: JavaScriptObject): Boolean = {
    if (gdext.classes.JavaScriptBridge.mb_is_js_buffer == null) gdext.classes.JavaScriptBridge.mb_is_js_buffer = MethodBind.get("JavaScriptBridge", "is_js_buffer", 821968997L)
    Ptrcall.call1[GodotObject, Boolean](gdext.classes.JavaScriptBridge.mb_is_js_buffer, livePtr, Wrappers.handle(javascriptObject))
  }

  /** JavaScriptBridge.pwa_needs_update */
  final def pwaNeedsUpdate(): Boolean = {
    if (gdext.classes.JavaScriptBridge.mb_pwa_needs_update == null) gdext.classes.JavaScriptBridge.mb_pwa_needs_update = MethodBind.get("JavaScriptBridge", "pwa_needs_update", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.JavaScriptBridge.mb_pwa_needs_update, livePtr)
  }

  /** JavaScriptBridge.pwa_update */
  final def pwaUpdate(): gdext.classes.Error = {
    if (gdext.classes.JavaScriptBridge.mb_pwa_update == null) gdext.classes.JavaScriptBridge.mb_pwa_update = MethodBind.get("JavaScriptBridge", "pwa_update", 166280745L)
    gdext.classes.Error(Ptrcall.call0[Long](gdext.classes.JavaScriptBridge.mb_pwa_update, livePtr))
  }

  /** JavaScriptBridge.force_fs_sync */
  final def forceFsSync(): Unit = {
    if (gdext.classes.JavaScriptBridge.mb_force_fs_sync == null) gdext.classes.JavaScriptBridge.mb_force_fs_sync = MethodBind.get("JavaScriptBridge", "force_fs_sync", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.JavaScriptBridge.mb_force_fs_sync, livePtr)
  }

}

object JavaScriptBridge {
  private[classes] var mb_get_interface: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_js_buffer: GDExtensionMethodBindPtr = null
  private[classes] var mb_pwa_needs_update: GDExtensionMethodBindPtr = null
  private[classes] var mb_pwa_update: GDExtensionMethodBindPtr = null
  private[classes] var mb_force_fs_sync: GDExtensionMethodBindPtr = null

  private var instance: JavaScriptBridge = null

  /** The process-global JavaScriptBridge singleton instance. */
  def singleton: JavaScriptBridge = {
    if (instance == null)
      instance = Wrappers.borrowed[JavaScriptBridge](GodotObject.fromPtr(
        Godot.interface.global_get_singleton(StringNames.cached("JavaScriptBridge").ptr)))
    instance
  }

  /** Forwards to [[singleton]]: JavaScriptBridge.get_interface */
  final def getInterface(interface: String): JavaScriptObject =
    singleton.getInterface(interface)

  /** Forwards to [[singleton]]: JavaScriptBridge.is_js_buffer */
  final def isJsBuffer(javascriptObject: JavaScriptObject): Boolean =
    singleton.isJsBuffer(javascriptObject)

  /** Forwards to [[singleton]]: JavaScriptBridge.pwa_needs_update */
  final def pwaNeedsUpdate(): Boolean =
    singleton.pwaNeedsUpdate()

  /** Forwards to [[singleton]]: JavaScriptBridge.pwa_update */
  final def pwaUpdate(): gdext.classes.Error =
    singleton.pwaUpdate()

  /** Forwards to [[singleton]]: JavaScriptBridge.force_fs_sync */
  final def forceFsSync(): Unit =
    singleton.forceFsSync()
}
