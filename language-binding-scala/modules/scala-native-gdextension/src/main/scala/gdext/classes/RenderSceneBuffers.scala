package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `RenderSceneBuffers`, extends `RefCounted`. */
abstract class RenderSceneBuffers extends RefCounted {
  override def godotClassName: String = "RenderSceneBuffers"

  /** RenderSceneBuffers.configure */
  final def configure(config: RenderSceneBuffersConfiguration): Unit = {
    if (gdext.classes.RenderSceneBuffers.mb_configure == null) gdext.classes.RenderSceneBuffers.mb_configure = MethodBind.get("RenderSceneBuffers", "configure", 3072623270L)
    Ptrcall.callVoid1(gdext.classes.RenderSceneBuffers.mb_configure, livePtr, Wrappers.handle(config))
  }

}

object RenderSceneBuffers {
  private[classes] var mb_configure: GDExtensionMethodBindPtr = null
}
