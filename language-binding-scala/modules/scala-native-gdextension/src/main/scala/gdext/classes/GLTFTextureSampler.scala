package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `GLTFTextureSampler`, extends `Resource`. */
abstract class GLTFTextureSampler extends Resource {
  override def godotClassName: String = "GLTFTextureSampler"

  /** GLTFTextureSampler.get_mag_filter */
  final def getMagFilter(): Long = {
    if (gdext.classes.GLTFTextureSampler.mb_get_mag_filter == null) gdext.classes.GLTFTextureSampler.mb_get_mag_filter = MethodBind.get("GLTFTextureSampler", "get_mag_filter", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.GLTFTextureSampler.mb_get_mag_filter, livePtr)
  }

  /** GLTFTextureSampler.set_mag_filter */
  final def setMagFilter(filterMode: Long): Unit = {
    if (gdext.classes.GLTFTextureSampler.mb_set_mag_filter == null) gdext.classes.GLTFTextureSampler.mb_set_mag_filter = MethodBind.get("GLTFTextureSampler", "set_mag_filter", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GLTFTextureSampler.mb_set_mag_filter, livePtr, filterMode)
  }

  /** GLTFTextureSampler.get_min_filter */
  final def getMinFilter(): Long = {
    if (gdext.classes.GLTFTextureSampler.mb_get_min_filter == null) gdext.classes.GLTFTextureSampler.mb_get_min_filter = MethodBind.get("GLTFTextureSampler", "get_min_filter", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.GLTFTextureSampler.mb_get_min_filter, livePtr)
  }

  /** GLTFTextureSampler.set_min_filter */
  final def setMinFilter(filterMode: Long): Unit = {
    if (gdext.classes.GLTFTextureSampler.mb_set_min_filter == null) gdext.classes.GLTFTextureSampler.mb_set_min_filter = MethodBind.get("GLTFTextureSampler", "set_min_filter", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GLTFTextureSampler.mb_set_min_filter, livePtr, filterMode)
  }

  /** GLTFTextureSampler.get_wrap_s */
  final def getWrapS(): Long = {
    if (gdext.classes.GLTFTextureSampler.mb_get_wrap_s == null) gdext.classes.GLTFTextureSampler.mb_get_wrap_s = MethodBind.get("GLTFTextureSampler", "get_wrap_s", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.GLTFTextureSampler.mb_get_wrap_s, livePtr)
  }

  /** GLTFTextureSampler.set_wrap_s */
  final def setWrapS(wrapMode: Long): Unit = {
    if (gdext.classes.GLTFTextureSampler.mb_set_wrap_s == null) gdext.classes.GLTFTextureSampler.mb_set_wrap_s = MethodBind.get("GLTFTextureSampler", "set_wrap_s", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GLTFTextureSampler.mb_set_wrap_s, livePtr, wrapMode)
  }

  /** GLTFTextureSampler.get_wrap_t */
  final def getWrapT(): Long = {
    if (gdext.classes.GLTFTextureSampler.mb_get_wrap_t == null) gdext.classes.GLTFTextureSampler.mb_get_wrap_t = MethodBind.get("GLTFTextureSampler", "get_wrap_t", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.GLTFTextureSampler.mb_get_wrap_t, livePtr)
  }

  /** GLTFTextureSampler.set_wrap_t */
  final def setWrapT(wrapMode: Long): Unit = {
    if (gdext.classes.GLTFTextureSampler.mb_set_wrap_t == null) gdext.classes.GLTFTextureSampler.mb_set_wrap_t = MethodBind.get("GLTFTextureSampler", "set_wrap_t", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GLTFTextureSampler.mb_set_wrap_t, livePtr, wrapMode)
  }

}

object GLTFTextureSampler {
  private[classes] var mb_get_mag_filter: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_mag_filter: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_min_filter: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_min_filter: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_wrap_s: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_wrap_s: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_wrap_t: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_wrap_t: GDExtensionMethodBindPtr = null
}
