package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `OptimizedTranslation`, extends `Translation`. */
abstract class OptimizedTranslation extends Translation {
  override def godotClassName: String = "OptimizedTranslation"

  /** OptimizedTranslation.generate */
  final def generate(from: Translation): Unit =
    Ptrcall.callVoid1(MethodBind.get("OptimizedTranslation", "generate", 1466479800L), hostObject.objectPtr, from.hostObject)

}
