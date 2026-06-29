package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `GLTFBufferView`, extends `Resource`. */
abstract class GLTFBufferView extends Resource {
  override def godotClassName: String = "GLTFBufferView"

  /** GLTFBufferView.get_buffer */
  final def getBuffer(): Long =
    Ptrcall.call0[Long](MethodBind.get("GLTFBufferView", "get_buffer", 3905245786L), hostObject.objectPtr)

  /** GLTFBufferView.set_buffer */
  final def setBuffer(buffer: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFBufferView", "set_buffer", 1286410249L), hostObject.objectPtr, buffer)

  /** GLTFBufferView.get_byte_offset */
  final def getByteOffset(): Long =
    Ptrcall.call0[Long](MethodBind.get("GLTFBufferView", "get_byte_offset", 3905245786L), hostObject.objectPtr)

  /** GLTFBufferView.set_byte_offset */
  final def setByteOffset(byte_offset: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFBufferView", "set_byte_offset", 1286410249L), hostObject.objectPtr, byte_offset)

  /** GLTFBufferView.get_byte_length */
  final def getByteLength(): Long =
    Ptrcall.call0[Long](MethodBind.get("GLTFBufferView", "get_byte_length", 3905245786L), hostObject.objectPtr)

  /** GLTFBufferView.set_byte_length */
  final def setByteLength(byte_length: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFBufferView", "set_byte_length", 1286410249L), hostObject.objectPtr, byte_length)

  /** GLTFBufferView.get_byte_stride */
  final def getByteStride(): Long =
    Ptrcall.call0[Long](MethodBind.get("GLTFBufferView", "get_byte_stride", 3905245786L), hostObject.objectPtr)

  /** GLTFBufferView.set_byte_stride */
  final def setByteStride(byte_stride: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFBufferView", "set_byte_stride", 1286410249L), hostObject.objectPtr, byte_stride)

  /** GLTFBufferView.get_indices */
  final def getIndices(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("GLTFBufferView", "get_indices", 36873697L), hostObject.objectPtr)

  /** GLTFBufferView.set_indices */
  final def setIndices(indices: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFBufferView", "set_indices", 2586408642L), hostObject.objectPtr, indices)

  /** GLTFBufferView.get_vertex_attributes */
  final def getVertexAttributes(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("GLTFBufferView", "get_vertex_attributes", 36873697L), hostObject.objectPtr)

  /** GLTFBufferView.set_vertex_attributes */
  final def setVertexAttributes(is_attributes: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFBufferView", "set_vertex_attributes", 2586408642L), hostObject.objectPtr, is_attributes)

}
