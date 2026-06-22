package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `GLTFTextureSampler`, extends `Resource`. */
abstract class GLTFTextureSampler extends Resource {

  /** GLTFTextureSampler.get_mag_filter */
  final def getMagFilter(): Long =
    Ptrcall.call0[Long](MethodBind.get("GLTFTextureSampler", "get_mag_filter", 3905245786L), hostObject.objectPtr)

  /** GLTFTextureSampler.set_mag_filter */
  final def setMagFilter(filter_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFTextureSampler", "set_mag_filter", 1286410249L), hostObject.objectPtr, filter_mode)

  /** GLTFTextureSampler.get_min_filter */
  final def getMinFilter(): Long =
    Ptrcall.call0[Long](MethodBind.get("GLTFTextureSampler", "get_min_filter", 3905245786L), hostObject.objectPtr)

  /** GLTFTextureSampler.set_min_filter */
  final def setMinFilter(filter_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFTextureSampler", "set_min_filter", 1286410249L), hostObject.objectPtr, filter_mode)

  /** GLTFTextureSampler.get_wrap_s */
  final def getWrapS(): Long =
    Ptrcall.call0[Long](MethodBind.get("GLTFTextureSampler", "get_wrap_s", 3905245786L), hostObject.objectPtr)

  /** GLTFTextureSampler.set_wrap_s */
  final def setWrapS(wrap_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFTextureSampler", "set_wrap_s", 1286410249L), hostObject.objectPtr, wrap_mode)

  /** GLTFTextureSampler.get_wrap_t */
  final def getWrapT(): Long =
    Ptrcall.call0[Long](MethodBind.get("GLTFTextureSampler", "get_wrap_t", 3905245786L), hostObject.objectPtr)

  /** GLTFTextureSampler.set_wrap_t */
  final def setWrapT(wrap_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFTextureSampler", "set_wrap_t", 1286410249L), hostObject.objectPtr, wrap_mode)

}

object GLTFTextureSampler {
  /** Class metadata for Gd[GLTFTextureSampler] lifetime management and casting. */
  given GodotClass[GLTFTextureSampler] with {
    def className = "GLTFTextureSampler"
    def isRefCounted = true
    def wrap(o: GodotObject): GLTFTextureSampler = new GLTFTextureSampler {}.withHost(o.objectPtr)
    def unwrap(t: GLTFTextureSampler): GodotObject = t.hostObject
  }
}
