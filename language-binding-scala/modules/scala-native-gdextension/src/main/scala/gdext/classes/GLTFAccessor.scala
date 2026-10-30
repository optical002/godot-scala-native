package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
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
  final def setBufferView(bufferView: Long): Unit = {
    if (gdext.classes.GLTFAccessor.mb_set_buffer_view == null) gdext.classes.GLTFAccessor.mb_set_buffer_view = MethodBind.get("GLTFAccessor", "set_buffer_view", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GLTFAccessor.mb_set_buffer_view, livePtr, bufferView)
  }

  /** GLTFAccessor.get_byte_offset */
  final def getByteOffset(): Long = {
    if (gdext.classes.GLTFAccessor.mb_get_byte_offset == null) gdext.classes.GLTFAccessor.mb_get_byte_offset = MethodBind.get("GLTFAccessor", "get_byte_offset", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.GLTFAccessor.mb_get_byte_offset, livePtr)
  }

  /** GLTFAccessor.set_byte_offset */
  final def setByteOffset(byteOffset: Long): Unit = {
    if (gdext.classes.GLTFAccessor.mb_set_byte_offset == null) gdext.classes.GLTFAccessor.mb_set_byte_offset = MethodBind.get("GLTFAccessor", "set_byte_offset", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GLTFAccessor.mb_set_byte_offset, livePtr, byteOffset)
  }

  /** GLTFAccessor.get_component_type */
  final def getComponentType(): gdext.classes.GLTFAccessor.GLTFComponentType = {
    if (gdext.classes.GLTFAccessor.mb_get_component_type == null) gdext.classes.GLTFAccessor.mb_get_component_type = MethodBind.get("GLTFAccessor", "get_component_type", 852227802L)
    gdext.classes.GLTFAccessor.GLTFComponentType(Ptrcall.call0[Long](gdext.classes.GLTFAccessor.mb_get_component_type, livePtr))
  }

  /** GLTFAccessor.set_component_type */
  final def setComponentType(componentType: gdext.classes.GLTFAccessor.GLTFComponentType): Unit = {
    if (gdext.classes.GLTFAccessor.mb_set_component_type == null) gdext.classes.GLTFAccessor.mb_set_component_type = MethodBind.get("GLTFAccessor", "set_component_type", 1780020221L)
    Ptrcall.callVoid1(gdext.classes.GLTFAccessor.mb_set_component_type, livePtr, componentType)
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
  final def getAccessorType(): gdext.classes.GLTFAccessor.GLTFAccessorType = {
    if (gdext.classes.GLTFAccessor.mb_get_accessor_type == null) gdext.classes.GLTFAccessor.mb_get_accessor_type = MethodBind.get("GLTFAccessor", "get_accessor_type", 1998183368L)
    gdext.classes.GLTFAccessor.GLTFAccessorType(Ptrcall.call0[Long](gdext.classes.GLTFAccessor.mb_get_accessor_type, livePtr))
  }

  /** GLTFAccessor.set_accessor_type */
  final def setAccessorType(accessorType: gdext.classes.GLTFAccessor.GLTFAccessorType): Unit = {
    if (gdext.classes.GLTFAccessor.mb_set_accessor_type == null) gdext.classes.GLTFAccessor.mb_set_accessor_type = MethodBind.get("GLTFAccessor", "set_accessor_type", 2347728198L)
    Ptrcall.callVoid1(gdext.classes.GLTFAccessor.mb_set_accessor_type, livePtr, accessorType)
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
  final def setSparseCount(sparseCount: Long): Unit = {
    if (gdext.classes.GLTFAccessor.mb_set_sparse_count == null) gdext.classes.GLTFAccessor.mb_set_sparse_count = MethodBind.get("GLTFAccessor", "set_sparse_count", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GLTFAccessor.mb_set_sparse_count, livePtr, sparseCount)
  }

  /** GLTFAccessor.get_sparse_indices_buffer_view */
  final def getSparseIndicesBufferView(): Long = {
    if (gdext.classes.GLTFAccessor.mb_get_sparse_indices_buffer_view == null) gdext.classes.GLTFAccessor.mb_get_sparse_indices_buffer_view = MethodBind.get("GLTFAccessor", "get_sparse_indices_buffer_view", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.GLTFAccessor.mb_get_sparse_indices_buffer_view, livePtr)
  }

  /** GLTFAccessor.set_sparse_indices_buffer_view */
  final def setSparseIndicesBufferView(sparseIndicesBufferView: Long): Unit = {
    if (gdext.classes.GLTFAccessor.mb_set_sparse_indices_buffer_view == null) gdext.classes.GLTFAccessor.mb_set_sparse_indices_buffer_view = MethodBind.get("GLTFAccessor", "set_sparse_indices_buffer_view", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GLTFAccessor.mb_set_sparse_indices_buffer_view, livePtr, sparseIndicesBufferView)
  }

  /** GLTFAccessor.get_sparse_indices_byte_offset */
  final def getSparseIndicesByteOffset(): Long = {
    if (gdext.classes.GLTFAccessor.mb_get_sparse_indices_byte_offset == null) gdext.classes.GLTFAccessor.mb_get_sparse_indices_byte_offset = MethodBind.get("GLTFAccessor", "get_sparse_indices_byte_offset", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.GLTFAccessor.mb_get_sparse_indices_byte_offset, livePtr)
  }

  /** GLTFAccessor.set_sparse_indices_byte_offset */
  final def setSparseIndicesByteOffset(sparseIndicesByteOffset: Long): Unit = {
    if (gdext.classes.GLTFAccessor.mb_set_sparse_indices_byte_offset == null) gdext.classes.GLTFAccessor.mb_set_sparse_indices_byte_offset = MethodBind.get("GLTFAccessor", "set_sparse_indices_byte_offset", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GLTFAccessor.mb_set_sparse_indices_byte_offset, livePtr, sparseIndicesByteOffset)
  }

  /** GLTFAccessor.get_sparse_indices_component_type */
  final def getSparseIndicesComponentType(): gdext.classes.GLTFAccessor.GLTFComponentType = {
    if (gdext.classes.GLTFAccessor.mb_get_sparse_indices_component_type == null) gdext.classes.GLTFAccessor.mb_get_sparse_indices_component_type = MethodBind.get("GLTFAccessor", "get_sparse_indices_component_type", 852227802L)
    gdext.classes.GLTFAccessor.GLTFComponentType(Ptrcall.call0[Long](gdext.classes.GLTFAccessor.mb_get_sparse_indices_component_type, livePtr))
  }

  /** GLTFAccessor.set_sparse_indices_component_type */
  final def setSparseIndicesComponentType(sparseIndicesComponentType: gdext.classes.GLTFAccessor.GLTFComponentType): Unit = {
    if (gdext.classes.GLTFAccessor.mb_set_sparse_indices_component_type == null) gdext.classes.GLTFAccessor.mb_set_sparse_indices_component_type = MethodBind.get("GLTFAccessor", "set_sparse_indices_component_type", 1780020221L)
    Ptrcall.callVoid1(gdext.classes.GLTFAccessor.mb_set_sparse_indices_component_type, livePtr, sparseIndicesComponentType)
  }

  /** GLTFAccessor.get_sparse_values_buffer_view */
  final def getSparseValuesBufferView(): Long = {
    if (gdext.classes.GLTFAccessor.mb_get_sparse_values_buffer_view == null) gdext.classes.GLTFAccessor.mb_get_sparse_values_buffer_view = MethodBind.get("GLTFAccessor", "get_sparse_values_buffer_view", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.GLTFAccessor.mb_get_sparse_values_buffer_view, livePtr)
  }

  /** GLTFAccessor.set_sparse_values_buffer_view */
  final def setSparseValuesBufferView(sparseValuesBufferView: Long): Unit = {
    if (gdext.classes.GLTFAccessor.mb_set_sparse_values_buffer_view == null) gdext.classes.GLTFAccessor.mb_set_sparse_values_buffer_view = MethodBind.get("GLTFAccessor", "set_sparse_values_buffer_view", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GLTFAccessor.mb_set_sparse_values_buffer_view, livePtr, sparseValuesBufferView)
  }

  /** GLTFAccessor.get_sparse_values_byte_offset */
  final def getSparseValuesByteOffset(): Long = {
    if (gdext.classes.GLTFAccessor.mb_get_sparse_values_byte_offset == null) gdext.classes.GLTFAccessor.mb_get_sparse_values_byte_offset = MethodBind.get("GLTFAccessor", "get_sparse_values_byte_offset", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.GLTFAccessor.mb_get_sparse_values_byte_offset, livePtr)
  }

  /** GLTFAccessor.set_sparse_values_byte_offset */
  final def setSparseValuesByteOffset(sparseValuesByteOffset: Long): Unit = {
    if (gdext.classes.GLTFAccessor.mb_set_sparse_values_byte_offset == null) gdext.classes.GLTFAccessor.mb_set_sparse_values_byte_offset = MethodBind.get("GLTFAccessor", "set_sparse_values_byte_offset", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GLTFAccessor.mb_set_sparse_values_byte_offset, livePtr, sparseValuesByteOffset)
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

  /** Godot enum `GLTFAccessor.GLTFAccessorType`. */
  opaque type GLTFAccessorType <: Long = Long

  object GLTFAccessorType {
    final val Scalar: GLTFAccessorType = 0L.asInstanceOf[GLTFAccessorType]
    final val Vec2: GLTFAccessorType = 1L.asInstanceOf[GLTFAccessorType]
    final val Vec3: GLTFAccessorType = 2L.asInstanceOf[GLTFAccessorType]
    final val Vec4: GLTFAccessorType = 3L.asInstanceOf[GLTFAccessorType]
    final val Mat2: GLTFAccessorType = 4L.asInstanceOf[GLTFAccessorType]
    final val Mat3: GLTFAccessorType = 5L.asInstanceOf[GLTFAccessorType]
    final val Mat4: GLTFAccessorType = 6L.asInstanceOf[GLTFAccessorType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): GLTFAccessorType = value.asInstanceOf[GLTFAccessorType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[GLTFAccessorType] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L).asInstanceOf[scala.IArray[GLTFAccessorType]]

    extension (self: GLTFAccessorType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Scalar"
        case 1L => "Vec2"
        case 2L => "Vec3"
        case 3L => "Vec4"
        case 4L => "Mat2"
        case 5L => "Mat3"
        case 6L => "Mat4"
        case other => other.toString
      }
  }

  /** Godot enum `GLTFAccessor.GLTFComponentType`. */
  opaque type GLTFComponentType <: Long = Long

  object GLTFComponentType {
    final val None: GLTFComponentType = 0L.asInstanceOf[GLTFComponentType]
    final val SignedByte: GLTFComponentType = 5120L.asInstanceOf[GLTFComponentType]
    final val UnsignedByte: GLTFComponentType = 5121L.asInstanceOf[GLTFComponentType]
    final val SignedShort: GLTFComponentType = 5122L.asInstanceOf[GLTFComponentType]
    final val UnsignedShort: GLTFComponentType = 5123L.asInstanceOf[GLTFComponentType]
    final val SignedInt: GLTFComponentType = 5124L.asInstanceOf[GLTFComponentType]
    final val UnsignedInt: GLTFComponentType = 5125L.asInstanceOf[GLTFComponentType]
    final val SingleFloat: GLTFComponentType = 5126L.asInstanceOf[GLTFComponentType]
    final val DoubleFloat: GLTFComponentType = 5130L.asInstanceOf[GLTFComponentType]
    final val HalfFloat: GLTFComponentType = 5131L.asInstanceOf[GLTFComponentType]
    final val SignedLong: GLTFComponentType = 5134L.asInstanceOf[GLTFComponentType]
    final val UnsignedLong: GLTFComponentType = 5135L.asInstanceOf[GLTFComponentType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): GLTFComponentType = value.asInstanceOf[GLTFComponentType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[GLTFComponentType] = scala.IArray[Long](0L, 5120L, 5121L, 5122L, 5123L, 5124L, 5125L, 5126L, 5130L, 5131L, 5134L, 5135L).asInstanceOf[scala.IArray[GLTFComponentType]]

    extension (self: GLTFComponentType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "None"
        case 5120L => "SignedByte"
        case 5121L => "UnsignedByte"
        case 5122L => "SignedShort"
        case 5123L => "UnsignedShort"
        case 5124L => "SignedInt"
        case 5125L => "UnsignedInt"
        case 5126L => "SingleFloat"
        case 5130L => "DoubleFloat"
        case 5131L => "HalfFloat"
        case 5134L => "SignedLong"
        case 5135L => "UnsignedLong"
        case other => other.toString
      }
  }
}
