package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `GLTFTexture`, extends `Resource`. */
abstract class GLTFTexture extends Resource {
  override def godotClassName: String = "GLTFTexture"

  /** GLTFTexture.get_src_image */
  final def getSrcImage(): Long = {
    if (gdext.classes.GLTFTexture.mb_get_src_image == null) gdext.classes.GLTFTexture.mb_get_src_image = MethodBind.get("GLTFTexture", "get_src_image", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.GLTFTexture.mb_get_src_image, livePtr)
  }

  /** GLTFTexture.set_src_image */
  final def setSrcImage(src_image: Long): Unit = {
    if (gdext.classes.GLTFTexture.mb_set_src_image == null) gdext.classes.GLTFTexture.mb_set_src_image = MethodBind.get("GLTFTexture", "set_src_image", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GLTFTexture.mb_set_src_image, livePtr, src_image)
  }

  /** GLTFTexture.get_sampler */
  final def getSampler(): Long = {
    if (gdext.classes.GLTFTexture.mb_get_sampler == null) gdext.classes.GLTFTexture.mb_get_sampler = MethodBind.get("GLTFTexture", "get_sampler", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.GLTFTexture.mb_get_sampler, livePtr)
  }

  /** GLTFTexture.set_sampler */
  final def setSampler(sampler: Long): Unit = {
    if (gdext.classes.GLTFTexture.mb_set_sampler == null) gdext.classes.GLTFTexture.mb_set_sampler = MethodBind.get("GLTFTexture", "set_sampler", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GLTFTexture.mb_set_sampler, livePtr, sampler)
  }

}

object GLTFTexture {
  private[classes] var mb_get_src_image: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_src_image: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_sampler: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_sampler: GDExtensionMethodBindPtr = null
}
