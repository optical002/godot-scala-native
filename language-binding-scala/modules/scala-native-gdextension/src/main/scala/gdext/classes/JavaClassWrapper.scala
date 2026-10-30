package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `JavaClassWrapper`, extends `Object`. */
abstract class JavaClassWrapper extends Object {
  override def godotClassName: String = "JavaClassWrapper"

  /** JavaClassWrapper.wrap. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def wrap(name: String): JavaClass = {
    if (gdext.classes.JavaClassWrapper.mb_wrap == null) gdext.classes.JavaClassWrapper.mb_wrap = MethodBind.get("JavaClassWrapper", "wrap", 1124367868L)
    Wrappers.owned[JavaClass](Ptrcall.call1[String, Long](gdext.classes.JavaClassWrapper.mb_wrap, livePtr, name))
  }

  /** JavaClassWrapper.get_exception. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getException(): JavaObject = {
    if (gdext.classes.JavaClassWrapper.mb_get_exception == null) gdext.classes.JavaClassWrapper.mb_get_exception = MethodBind.get("JavaClassWrapper", "get_exception", 3277089691L)
    Wrappers.owned[JavaObject](Ptrcall.call0[Long](gdext.classes.JavaClassWrapper.mb_get_exception, livePtr))
  }

}

object JavaClassWrapper {
  private[classes] var mb_wrap: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_exception: GDExtensionMethodBindPtr = null

  private var instance: JavaClassWrapper = null

  /** The process-global JavaClassWrapper singleton instance. */
  def singleton: JavaClassWrapper = {
    if (instance == null)
      instance = Wrappers.borrowed[JavaClassWrapper](GodotObject.fromPtr(
        Godot.interface.global_get_singleton(StringNames.cached("JavaClassWrapper").ptr)))
    instance
  }

  /** Forwards to [[singleton]]: JavaClassWrapper.wrap */
  final def wrap(name: String): JavaClass =
    singleton.wrap(name)

  /** Forwards to [[singleton]]: JavaClassWrapper.get_exception */
  final def getException(): JavaObject =
    singleton.getException()
}
