package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `GLTFBufferView`, extends `Resource`. */
abstract class GLTFBufferView extends Resource {
  override def godotClassName: String = "GLTFBufferView"

  /** GLTFBufferView.get_buffer */
  final def getBuffer(): Long = {
    if (gdext.classes.GLTFBufferView.mb_get_buffer == null) gdext.classes.GLTFBufferView.mb_get_buffer = MethodBind.get("GLTFBufferView", "get_buffer", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.GLTFBufferView.mb_get_buffer, livePtr)
  }

  /** GLTFBufferView.set_buffer */
  final def setBuffer(buffer: Long): Unit = {
    if (gdext.classes.GLTFBufferView.mb_set_buffer == null) gdext.classes.GLTFBufferView.mb_set_buffer = MethodBind.get("GLTFBufferView", "set_buffer", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GLTFBufferView.mb_set_buffer, livePtr, buffer)
  }

  /** GLTFBufferView.get_byte_offset */
  final def getByteOffset(): Long = {
    if (gdext.classes.GLTFBufferView.mb_get_byte_offset == null) gdext.classes.GLTFBufferView.mb_get_byte_offset = MethodBind.get("GLTFBufferView", "get_byte_offset", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.GLTFBufferView.mb_get_byte_offset, livePtr)
  }

  /** GLTFBufferView.set_byte_offset */
  final def setByteOffset(byte_offset: Long): Unit = {
    if (gdext.classes.GLTFBufferView.mb_set_byte_offset == null) gdext.classes.GLTFBufferView.mb_set_byte_offset = MethodBind.get("GLTFBufferView", "set_byte_offset", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GLTFBufferView.mb_set_byte_offset, livePtr, byte_offset)
  }

  /** GLTFBufferView.get_byte_length */
  final def getByteLength(): Long = {
    if (gdext.classes.GLTFBufferView.mb_get_byte_length == null) gdext.classes.GLTFBufferView.mb_get_byte_length = MethodBind.get("GLTFBufferView", "get_byte_length", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.GLTFBufferView.mb_get_byte_length, livePtr)
  }

  /** GLTFBufferView.set_byte_length */
  final def setByteLength(byte_length: Long): Unit = {
    if (gdext.classes.GLTFBufferView.mb_set_byte_length == null) gdext.classes.GLTFBufferView.mb_set_byte_length = MethodBind.get("GLTFBufferView", "set_byte_length", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GLTFBufferView.mb_set_byte_length, livePtr, byte_length)
  }

  /** GLTFBufferView.get_byte_stride */
  final def getByteStride(): Long = {
    if (gdext.classes.GLTFBufferView.mb_get_byte_stride == null) gdext.classes.GLTFBufferView.mb_get_byte_stride = MethodBind.get("GLTFBufferView", "get_byte_stride", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.GLTFBufferView.mb_get_byte_stride, livePtr)
  }

  /** GLTFBufferView.set_byte_stride */
  final def setByteStride(byte_stride: Long): Unit = {
    if (gdext.classes.GLTFBufferView.mb_set_byte_stride == null) gdext.classes.GLTFBufferView.mb_set_byte_stride = MethodBind.get("GLTFBufferView", "set_byte_stride", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GLTFBufferView.mb_set_byte_stride, livePtr, byte_stride)
  }

  /** GLTFBufferView.get_indices */
  final def getIndices(): Boolean = {
    if (gdext.classes.GLTFBufferView.mb_get_indices == null) gdext.classes.GLTFBufferView.mb_get_indices = MethodBind.get("GLTFBufferView", "get_indices", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.GLTFBufferView.mb_get_indices, livePtr)
  }

  /** GLTFBufferView.set_indices */
  final def setIndices(indices: Boolean): Unit = {
    if (gdext.classes.GLTFBufferView.mb_set_indices == null) gdext.classes.GLTFBufferView.mb_set_indices = MethodBind.get("GLTFBufferView", "set_indices", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.GLTFBufferView.mb_set_indices, livePtr, indices)
  }

  /** GLTFBufferView.get_vertex_attributes */
  final def getVertexAttributes(): Boolean = {
    if (gdext.classes.GLTFBufferView.mb_get_vertex_attributes == null) gdext.classes.GLTFBufferView.mb_get_vertex_attributes = MethodBind.get("GLTFBufferView", "get_vertex_attributes", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.GLTFBufferView.mb_get_vertex_attributes, livePtr)
  }

  /** GLTFBufferView.set_vertex_attributes */
  final def setVertexAttributes(is_attributes: Boolean): Unit = {
    if (gdext.classes.GLTFBufferView.mb_set_vertex_attributes == null) gdext.classes.GLTFBufferView.mb_set_vertex_attributes = MethodBind.get("GLTFBufferView", "set_vertex_attributes", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.GLTFBufferView.mb_set_vertex_attributes, livePtr, is_attributes)
  }

}

object GLTFBufferView {
  private[classes] var mb_get_buffer: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_buffer: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_byte_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_byte_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_byte_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_byte_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_byte_stride: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_byte_stride: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_indices: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_indices: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_vertex_attributes: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_vertex_attributes: GDExtensionMethodBindPtr = null
}
