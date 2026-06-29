package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `JavaClassWrapper`, extends `Object`. */
abstract class JavaClassWrapper extends Object {
  override def godotClassName: String = "JavaClassWrapper"

  /** JavaClassWrapper.wrap */
  final def wrap(name: String): GodotObject =
    Ptrcall.call1[String, GodotObject](MethodBind.get("JavaClassWrapper", "wrap", 1124367868L), hostObject.objectPtr, name)

  /** JavaClassWrapper.get_exception */
  final def getException(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("JavaClassWrapper", "get_exception", 3277089691L), hostObject.objectPtr)

}

object JavaClassWrapper {
  /** The process-global JavaClassWrapper singleton instance. */
  def singleton: JavaClassWrapper = new JavaClassWrapper {}
    .withHost(Godot.interface.global_get_singleton(
      StringNames.cached("JavaClassWrapper").ptr))
}
