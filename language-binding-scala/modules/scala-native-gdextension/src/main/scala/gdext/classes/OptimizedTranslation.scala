package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OptimizedTranslation`, extends `Translation`. */
abstract class OptimizedTranslation extends Translation {
  override def godotClassName: String = "OptimizedTranslation"

  /** OptimizedTranslation.generate */
  final def generate(from: Translation): Unit = {
    if (gdext.classes.OptimizedTranslation.mb_generate == null) gdext.classes.OptimizedTranslation.mb_generate = MethodBind.get("OptimizedTranslation", "generate", 1466479800L)
    Ptrcall.callVoid1(gdext.classes.OptimizedTranslation.mb_generate, livePtr, Wrappers.handle(from))
  }

}

object OptimizedTranslation {
  private[classes] var mb_generate: GDExtensionMethodBindPtr = null
}
