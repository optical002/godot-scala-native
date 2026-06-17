package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `GLTFAccessor`, extends `Resource`. */
abstract class GLTFAccessor extends Resource {

  /** GLTFAccessor.get_buffer_view */
  final def getBufferView(): Long =
    Ptrcall.call0[Long](MethodBind.get("GLTFAccessor", "get_buffer_view", 3905245786L), hostObject.objectPtr)

  /** GLTFAccessor.set_buffer_view */
  final def setBufferView(buffer_view: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFAccessor", "set_buffer_view", 1286410249L), hostObject.objectPtr, buffer_view)

  /** GLTFAccessor.get_byte_offset */
  final def getByteOffset(): Long =
    Ptrcall.call0[Long](MethodBind.get("GLTFAccessor", "get_byte_offset", 3905245786L), hostObject.objectPtr)

  /** GLTFAccessor.set_byte_offset */
  final def setByteOffset(byte_offset: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFAccessor", "set_byte_offset", 1286410249L), hostObject.objectPtr, byte_offset)

  /** GLTFAccessor.get_component_type */
  final def getComponentType(): Long =
    Ptrcall.call0[Long](MethodBind.get("GLTFAccessor", "get_component_type", 852227802L), hostObject.objectPtr)

  /** GLTFAccessor.set_component_type */
  final def setComponentType(component_type: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFAccessor", "set_component_type", 1780020221L), hostObject.objectPtr, component_type)

  /** GLTFAccessor.get_normalized */
  final def getNormalized(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("GLTFAccessor", "get_normalized", 36873697L), hostObject.objectPtr)

  /** GLTFAccessor.set_normalized */
  final def setNormalized(normalized: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFAccessor", "set_normalized", 2586408642L), hostObject.objectPtr, normalized)

  /** GLTFAccessor.get_count */
  final def getCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("GLTFAccessor", "get_count", 3905245786L), hostObject.objectPtr)

  /** GLTFAccessor.set_count */
  final def setCount(count: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFAccessor", "set_count", 1286410249L), hostObject.objectPtr, count)

  /** GLTFAccessor.get_accessor_type */
  final def getAccessorType(): Long =
    Ptrcall.call0[Long](MethodBind.get("GLTFAccessor", "get_accessor_type", 1998183368L), hostObject.objectPtr)

  /** GLTFAccessor.set_accessor_type */
  final def setAccessorType(accessor_type: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFAccessor", "set_accessor_type", 2347728198L), hostObject.objectPtr, accessor_type)

  /** GLTFAccessor.get_type */
  final def getType(): Long =
    Ptrcall.call0[Long](MethodBind.get("GLTFAccessor", "get_type", 3905245786L), hostObject.objectPtr)

  /** GLTFAccessor.set_type */
  final def setType(`type`: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFAccessor", "set_type", 1286410249L), hostObject.objectPtr, `type`)

  /** GLTFAccessor.get_sparse_count */
  final def getSparseCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("GLTFAccessor", "get_sparse_count", 3905245786L), hostObject.objectPtr)

  /** GLTFAccessor.set_sparse_count */
  final def setSparseCount(sparse_count: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFAccessor", "set_sparse_count", 1286410249L), hostObject.objectPtr, sparse_count)

  /** GLTFAccessor.get_sparse_indices_buffer_view */
  final def getSparseIndicesBufferView(): Long =
    Ptrcall.call0[Long](MethodBind.get("GLTFAccessor", "get_sparse_indices_buffer_view", 3905245786L), hostObject.objectPtr)

  /** GLTFAccessor.set_sparse_indices_buffer_view */
  final def setSparseIndicesBufferView(sparse_indices_buffer_view: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFAccessor", "set_sparse_indices_buffer_view", 1286410249L), hostObject.objectPtr, sparse_indices_buffer_view)

  /** GLTFAccessor.get_sparse_indices_byte_offset */
  final def getSparseIndicesByteOffset(): Long =
    Ptrcall.call0[Long](MethodBind.get("GLTFAccessor", "get_sparse_indices_byte_offset", 3905245786L), hostObject.objectPtr)

  /** GLTFAccessor.set_sparse_indices_byte_offset */
  final def setSparseIndicesByteOffset(sparse_indices_byte_offset: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFAccessor", "set_sparse_indices_byte_offset", 1286410249L), hostObject.objectPtr, sparse_indices_byte_offset)

  /** GLTFAccessor.get_sparse_indices_component_type */
  final def getSparseIndicesComponentType(): Long =
    Ptrcall.call0[Long](MethodBind.get("GLTFAccessor", "get_sparse_indices_component_type", 852227802L), hostObject.objectPtr)

  /** GLTFAccessor.set_sparse_indices_component_type */
  final def setSparseIndicesComponentType(sparse_indices_component_type: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFAccessor", "set_sparse_indices_component_type", 1780020221L), hostObject.objectPtr, sparse_indices_component_type)

  /** GLTFAccessor.get_sparse_values_buffer_view */
  final def getSparseValuesBufferView(): Long =
    Ptrcall.call0[Long](MethodBind.get("GLTFAccessor", "get_sparse_values_buffer_view", 3905245786L), hostObject.objectPtr)

  /** GLTFAccessor.set_sparse_values_buffer_view */
  final def setSparseValuesBufferView(sparse_values_buffer_view: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFAccessor", "set_sparse_values_buffer_view", 1286410249L), hostObject.objectPtr, sparse_values_buffer_view)

  /** GLTFAccessor.get_sparse_values_byte_offset */
  final def getSparseValuesByteOffset(): Long =
    Ptrcall.call0[Long](MethodBind.get("GLTFAccessor", "get_sparse_values_byte_offset", 3905245786L), hostObject.objectPtr)

  /** GLTFAccessor.set_sparse_values_byte_offset */
  final def setSparseValuesByteOffset(sparse_values_byte_offset: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFAccessor", "set_sparse_values_byte_offset", 1286410249L), hostObject.objectPtr, sparse_values_byte_offset)

}

object GLTFAccessor {
  /** Class metadata for Gd[GLTFAccessor] lifetime management and casting. */
  given GodotClass[GLTFAccessor] with {
    def className = "GLTFAccessor"
    def isRefCounted = true
    def wrap(o: GodotObject): GLTFAccessor = new GLTFAccessor {}.withHost(o.objectPtr)
    def unwrap(t: GLTFAccessor): GodotObject = t.hostObject
  }
}
