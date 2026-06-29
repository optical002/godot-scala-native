package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `GLTFTexture`, extends `Resource`. */
abstract class GLTFTexture extends Resource {
  override def godotClassName: String = "GLTFTexture"

  /** GLTFTexture.get_src_image */
  final def getSrcImage(): Long =
    Ptrcall.call0[Long](MethodBind.get("GLTFTexture", "get_src_image", 3905245786L), hostObject.objectPtr)

  /** GLTFTexture.set_src_image */
  final def setSrcImage(src_image: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFTexture", "set_src_image", 1286410249L), hostObject.objectPtr, src_image)

  /** GLTFTexture.get_sampler */
  final def getSampler(): Long =
    Ptrcall.call0[Long](MethodBind.get("GLTFTexture", "get_sampler", 3905245786L), hostObject.objectPtr)

  /** GLTFTexture.set_sampler */
  final def setSampler(sampler: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFTexture", "set_sampler", 1286410249L), hostObject.objectPtr, sampler)

}
