package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `GLTFAccessor`, extends `Resource`. */
abstract class GLTFAccessor extends Resource {
  override def godotClassName: String = "GLTFAccessor"

  /** GLTFAccessor.get_buffer_view */
  final def getBufferView(): Long = {
    if (gdext.classes.GLTFAccessor.mb_get_buffer_view == null) gdext.classes.GLTFAccessor.mb_get_buffer_view = MethodBind.get("GLTFAccessor", "get_buffer_view", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.GLTFAccessor.mb_get_buffer_view, livePtr)
  }

  /** GLTFAccessor.set_buffer_view */
  final def setBufferView(buffer_view: Long): Unit = {
    if (gdext.classes.GLTFAccessor.mb_set_buffer_view == null) gdext.classes.GLTFAccessor.mb_set_buffer_view = MethodBind.get("GLTFAccessor", "set_buffer_view", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GLTFAccessor.mb_set_buffer_view, livePtr, buffer_view)
  }

  /** GLTFAccessor.get_byte_offset */
  final def getByteOffset(): Long = {
    if (gdext.classes.GLTFAccessor.mb_get_byte_offset == null) gdext.classes.GLTFAccessor.mb_get_byte_offset = MethodBind.get("GLTFAccessor", "get_byte_offset", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.GLTFAccessor.mb_get_byte_offset, livePtr)
  }

  /** GLTFAccessor.set_byte_offset */
  final def setByteOffset(byte_offset: Long): Unit = {
    if (gdext.classes.GLTFAccessor.mb_set_byte_offset == null) gdext.classes.GLTFAccessor.mb_set_byte_offset = MethodBind.get("GLTFAccessor", "set_byte_offset", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GLTFAccessor.mb_set_byte_offset, livePtr, byte_offset)
  }

  /** GLTFAccessor.get_component_type */
  final def getComponentType(): Long = {
    if (gdext.classes.GLTFAccessor.mb_get_component_type == null) gdext.classes.GLTFAccessor.mb_get_component_type = MethodBind.get("GLTFAccessor", "get_component_type", 852227802L)
    Ptrcall.call0[Long](gdext.classes.GLTFAccessor.mb_get_component_type, livePtr)
  }

  /** GLTFAccessor.set_component_type */
  final def setComponentType(component_type: Long): Unit = {
    if (gdext.classes.GLTFAccessor.mb_set_component_type == null) gdext.classes.GLTFAccessor.mb_set_component_type = MethodBind.get("GLTFAccessor", "set_component_type", 1780020221L)
    Ptrcall.callVoid1(gdext.classes.GLTFAccessor.mb_set_component_type, livePtr, component_type)
  }

  /** GLTFAccessor.get_normalized */
  final def getNormalized(): Boolean = {
    if (gdext.classes.GLTFAccessor.mb_get_normalized == null) gdext.classes.GLTFAccessor.mb_get_normalized = MethodBind.get("GLTFAccessor", "get_normalized", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.GLTFAccessor.mb_get_normalized, livePtr)
  }

  /** GLTFAccessor.set_normalized */
  final def setNormalized(normalized: Boolean): Unit = {
    if (gdext.classes.GLTFAccessor.mb_set_normalized == null) gdext.classes.GLTFAccessor.mb_set_normalized = MethodBind.get("GLTFAccessor", "set_normalized", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.GLTFAccessor.mb_set_normalized, livePtr, normalized)
  }

  /** GLTFAccessor.get_count */
  final def getCount(): Long = {
    if (gdext.classes.GLTFAccessor.mb_get_count == null) gdext.classes.GLTFAccessor.mb_get_count = MethodBind.get("GLTFAccessor", "get_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.GLTFAccessor.mb_get_count, livePtr)
  }

  /** GLTFAccessor.set_count */
  final def setCount(count: Long): Unit = {
    if (gdext.classes.GLTFAccessor.mb_set_count == null) gdext.classes.GLTFAccessor.mb_set_count = MethodBind.get("GLTFAccessor", "set_count", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GLTFAccessor.mb_set_count, livePtr, count)
  }

  /** GLTFAccessor.get_accessor_type */
  final def getAccessorType(): Long = {
    if (gdext.classes.GLTFAccessor.mb_get_accessor_type == null) gdext.classes.GLTFAccessor.mb_get_accessor_type = MethodBind.get("GLTFAccessor", "get_accessor_type", 1998183368L)
    Ptrcall.call0[Long](gdext.classes.GLTFAccessor.mb_get_accessor_type, livePtr)
  }

  /** GLTFAccessor.set_accessor_type */
  final def setAccessorType(accessor_type: Long): Unit = {
    if (gdext.classes.GLTFAccessor.mb_set_accessor_type == null) gdext.classes.GLTFAccessor.mb_set_accessor_type = MethodBind.get("GLTFAccessor", "set_accessor_type", 2347728198L)
    Ptrcall.callVoid1(gdext.classes.GLTFAccessor.mb_set_accessor_type, livePtr, accessor_type)
  }

  /** GLTFAccessor.get_type */
  final def getType(): Long = {
    if (gdext.classes.GLTFAccessor.mb_get_type == null) gdext.classes.GLTFAccessor.mb_get_type = MethodBind.get("GLTFAccessor", "get_type", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.GLTFAccessor.mb_get_type, livePtr)
  }

  /** GLTFAccessor.set_type */
  final def setType(`type`: Long): Unit = {
    if (gdext.classes.GLTFAccessor.mb_set_type == null) gdext.classes.GLTFAccessor.mb_set_type = MethodBind.get("GLTFAccessor", "set_type", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GLTFAccessor.mb_set_type, livePtr, `type`)
  }

  /** GLTFAccessor.get_sparse_count */
  final def getSparseCount(): Long = {
    if (gdext.classes.GLTFAccessor.mb_get_sparse_count == null) gdext.classes.GLTFAccessor.mb_get_sparse_count = MethodBind.get("GLTFAccessor", "get_sparse_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.GLTFAccessor.mb_get_sparse_count, livePtr)
  }

  /** GLTFAccessor.set_sparse_count */
  final def setSparseCount(sparse_count: Long): Unit = {
    if (gdext.classes.GLTFAccessor.mb_set_sparse_count == null) gdext.classes.GLTFAccessor.mb_set_sparse_count = MethodBind.get("GLTFAccessor", "set_sparse_count", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GLTFAccessor.mb_set_sparse_count, livePtr, sparse_count)
  }

  /** GLTFAccessor.get_sparse_indices_buffer_view */
  final def getSparseIndicesBufferView(): Long = {
    if (gdext.classes.GLTFAccessor.mb_get_sparse_indices_buffer_view == null) gdext.classes.GLTFAccessor.mb_get_sparse_indices_buffer_view = MethodBind.get("GLTFAccessor", "get_sparse_indices_buffer_view", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.GLTFAccessor.mb_get_sparse_indices_buffer_view, livePtr)
  }

  /** GLTFAccessor.set_sparse_indices_buffer_view */
  final def setSparseIndicesBufferView(sparse_indices_buffer_view: Long): Unit = {
    if (gdext.classes.GLTFAccessor.mb_set_sparse_indices_buffer_view == null) gdext.classes.GLTFAccessor.mb_set_sparse_indices_buffer_view = MethodBind.get("GLTFAccessor", "set_sparse_indices_buffer_view", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GLTFAccessor.mb_set_sparse_indices_buffer_view, livePtr, sparse_indices_buffer_view)
  }

  /** GLTFAccessor.get_sparse_indices_byte_offset */
  final def getSparseIndicesByteOffset(): Long = {
    if (gdext.classes.GLTFAccessor.mb_get_sparse_indices_byte_offset == null) gdext.classes.GLTFAccessor.mb_get_sparse_indices_byte_offset = MethodBind.get("GLTFAccessor", "get_sparse_indices_byte_offset", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.GLTFAccessor.mb_get_sparse_indices_byte_offset, livePtr)
  }

  /** GLTFAccessor.set_sparse_indices_byte_offset */
  final def setSparseIndicesByteOffset(sparse_indices_byte_offset: Long): Unit = {
    if (gdext.classes.GLTFAccessor.mb_set_sparse_indices_byte_offset == null) gdext.classes.GLTFAccessor.mb_set_sparse_indices_byte_offset = MethodBind.get("GLTFAccessor", "set_sparse_indices_byte_offset", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GLTFAccessor.mb_set_sparse_indices_byte_offset, livePtr, sparse_indices_byte_offset)
  }

  /** GLTFAccessor.get_sparse_indices_component_type */
  final def getSparseIndicesComponentType(): Long = {
    if (gdext.classes.GLTFAccessor.mb_get_sparse_indices_component_type == null) gdext.classes.GLTFAccessor.mb_get_sparse_indices_component_type = MethodBind.get("GLTFAccessor", "get_sparse_indices_component_type", 852227802L)
    Ptrcall.call0[Long](gdext.classes.GLTFAccessor.mb_get_sparse_indices_component_type, livePtr)
  }

  /** GLTFAccessor.set_sparse_indices_component_type */
  final def setSparseIndicesComponentType(sparse_indices_component_type: Long): Unit = {
    if (gdext.classes.GLTFAccessor.mb_set_sparse_indices_component_type == null) gdext.classes.GLTFAccessor.mb_set_sparse_indices_component_type = MethodBind.get("GLTFAccessor", "set_sparse_indices_component_type", 1780020221L)
    Ptrcall.callVoid1(gdext.classes.GLTFAccessor.mb_set_sparse_indices_component_type, livePtr, sparse_indices_component_type)
  }

  /** GLTFAccessor.get_sparse_values_buffer_view */
  final def getSparseValuesBufferView(): Long = {
    if (gdext.classes.GLTFAccessor.mb_get_sparse_values_buffer_view == null) gdext.classes.GLTFAccessor.mb_get_sparse_values_buffer_view = MethodBind.get("GLTFAccessor", "get_sparse_values_buffer_view", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.GLTFAccessor.mb_get_sparse_values_buffer_view, livePtr)
  }

  /** GLTFAccessor.set_sparse_values_buffer_view */
  final def setSparseValuesBufferView(sparse_values_buffer_view: Long): Unit = {
    if (gdext.classes.GLTFAccessor.mb_set_sparse_values_buffer_view == null) gdext.classes.GLTFAccessor.mb_set_sparse_values_buffer_view = MethodBind.get("GLTFAccessor", "set_sparse_values_buffer_view", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GLTFAccessor.mb_set_sparse_values_buffer_view, livePtr, sparse_values_buffer_view)
  }

  /** GLTFAccessor.get_sparse_values_byte_offset */
  final def getSparseValuesByteOffset(): Long = {
    if (gdext.classes.GLTFAccessor.mb_get_sparse_values_byte_offset == null) gdext.classes.GLTFAccessor.mb_get_sparse_values_byte_offset = MethodBind.get("GLTFAccessor", "get_sparse_values_byte_offset", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.GLTFAccessor.mb_get_sparse_values_byte_offset, livePtr)
  }

  /** GLTFAccessor.set_sparse_values_byte_offset */
  final def setSparseValuesByteOffset(sparse_values_byte_offset: Long): Unit = {
    if (gdext.classes.GLTFAccessor.mb_set_sparse_values_byte_offset == null) gdext.classes.GLTFAccessor.mb_set_sparse_values_byte_offset = MethodBind.get("GLTFAccessor", "set_sparse_values_byte_offset", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GLTFAccessor.mb_set_sparse_values_byte_offset, livePtr, sparse_values_byte_offset)
  }

}

object GLTFAccessor {
  private[classes] var mb_get_buffer_view: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_buffer_view: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_byte_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_byte_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_component_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_component_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_normalized: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_normalized: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_accessor_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_accessor_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_sparse_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_sparse_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_sparse_indices_buffer_view: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_sparse_indices_buffer_view: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_sparse_indices_byte_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_sparse_indices_byte_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_sparse_indices_component_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_sparse_indices_component_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_sparse_values_buffer_view: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_sparse_values_buffer_view: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_sparse_values_byte_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_sparse_values_byte_offset: GDExtensionMethodBindPtr = null
}
