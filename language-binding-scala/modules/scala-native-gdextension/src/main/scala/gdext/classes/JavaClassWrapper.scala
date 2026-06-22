package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `JavaClassWrapper`, extends `Object`. */
abstract class JavaClassWrapper extends Object {

  /** JavaClassWrapper.wrap */
  final def wrap(name: String): GodotObject =
    Ptrcall.call1[String, GodotObject](MethodBind.get("JavaClassWrapper", "wrap", 1124367868L), hostObject.objectPtr, name)

  /** JavaClassWrapper.get_exception */
  final def getException(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("JavaClassWrapper", "get_exception", 3277089691L), hostObject.objectPtr)

}

object JavaClassWrapper {
  /** Class metadata for Gd[JavaClassWrapper] lifetime management and casting. */
  given GodotClass[JavaClassWrapper] with {
    def className = "JavaClassWrapper"
    def isRefCounted = false
    def wrap(o: GodotObject): JavaClassWrapper = new JavaClassWrapper {}.withHost(o.objectPtr)
    def unwrap(t: JavaClassWrapper): GodotObject = t.hostObject
  }

  /** The process-global JavaClassWrapper singleton instance. */
  def singleton: JavaClassWrapper = new JavaClassWrapper {}
    .withHost(Godot.interface.global_get_singleton(
      StringNames.cached("JavaClassWrapper").ptr))
}
