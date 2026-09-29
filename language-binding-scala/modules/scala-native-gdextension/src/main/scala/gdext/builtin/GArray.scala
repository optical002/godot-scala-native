package gdext.builtin

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import scala.scalanative.libc.string.memset
import scala.scalanative.libc.stdlib
import gdext.Godot
import gdext.internal.ffi.types.*
import gdext.internal.ffi.types.GDExtensionVariantType.*

/**
 * Godot's untyped `Array`. An 8-byte ([[BuiltinSizes.Array]]) reference-counted
 * handle to a heap-backed variant array.
 *
 * Element access uses `array_operator_index`, which hands back a pointer to the
 * Variant slot inside the array (no copy). Mutating operations (`push_back`,
 * `size`, ...) go through the engine's builtin-method machinery, keyed by the
 * method hashes baked from `extension_api.json` (Godot 4.5). Phase 2 will
 * generate these hash constants rather than hand-listing them.
 */
opaque type GArray = GDExtensionTypePtr

object GArray {
  // Method hashes from extension_api.json (Array, Godot 4.5).
  private final val HashSize = 3173160232L
  private final val HashPushBack = 3316032543L
  private final val HashSet = 3798478031L

  extension (a: GArray) {
    def ptr: GDExtensionTypePtr = a

    def destroy(): Unit =
      VariantConstructors.destructor(GDEXTENSION_VARIANT_TYPE_ARRAY)(a)

    /** Number of elements (calls Array.size). */
    def size: Int = {
      val out = stackalloc[GDExtensionInt]()
      BuiltinMethods
        .method(GDEXTENSION_VARIANT_TYPE_ARRAY, "size", HashSize)
        .apply(a, null, out.asInstanceOf[GDExtensionTypePtr], 0)
      (!out).toInt
    }

    /** Append a value (calls Array.push_back). */
    def pushBack[A](value: A)(using tv: ToVariant[A]): Unit = {
      val varBuf = stackalloc[Byte](BuiltinSizes.Variant.toCSize)
      val v = Variant.from(value, varBuf)
      val args = stackalloc[GDExtensionConstTypePtr](1)
      args(0) = v.ptr
      try
        BuiltinMethods
          .method(GDEXTENSION_VARIANT_TYPE_ARRAY, "push_back", HashPushBack)
          .apply(a, args, null, 1)
      finally v.destroy()
    }

    /** Read element `i` as a Scala value. */
    def get[A](i: Int)(using fv: FromVariant[A]): A = {
      checkIndex(i)
      val slot = Godot.interface.array_operator_index(a, i.toLong)
      fv.fromVariant(slot)
    }

    def set[A](i: Int, value: A)(using tv: ToVariant[A]): Unit = {
      checkIndex(i)
      val idx = stackalloc[GDExtensionInt]()
      !idx = i.toLong
      val varBuf = stackalloc[Byte](BuiltinSizes.Variant.toCSize)
      val v = Variant.from(value, varBuf)
      val args = stackalloc[GDExtensionConstTypePtr](2)
      args(0) = idx.asInstanceOf[GDExtensionConstTypePtr]
      args(1) = v.ptr
      try
        BuiltinMethods
          .method(GDEXTENSION_VARIANT_TYPE_ARRAY, "set", HashSet)
          .apply(a, args, null, 2)
      finally v.destroy()
    }

    def variantTypeAt(i: Int): GDExtensionVariantType = {
      checkIndex(i)
      Godot.interface.variant_get_type(Godot.interface.array_operator_index(a, i.toLong))
    }

    def isNilAt(i: Int): Boolean = variantTypeAt(i) == GDEXTENSION_VARIANT_TYPE_NIL

    /** [[destroy]] plus releasing the malloc'd handle from [[allocate]]. */
    def free(): Unit = {
      destroy()
      stdlib.free(a.asInstanceOf[Ptr[Byte]])
    }

    private def checkIndex(i: Int): Unit = {
      val n = size
      if (i < 0 || i >= n) throw new IndexOutOfBoundsException(s"index $i, size $n")
    }
  }

  /** An empty Array in heap storage; release with [[free]]. */
  def allocate(): GArray =
    empty(stdlib.malloc(BuiltinSizes.Array.toCSize).asInstanceOf[GDExtensionTypePtr])

  /** Reinterpret a raw handle as a `GArray` (the opaque type is its pointer). */
  def fromPtr(p: GDExtensionTypePtr): GArray = p

  /** Construct an empty Array into caller storage. */
  def empty(dest: GDExtensionTypePtr): GArray = {
    // Constructor index 0 of Array is the default (empty) constructor.
    val ctor = Godot.interface.variant_get_ptr_constructor(
      GDEXTENSION_VARIANT_TYPE_ARRAY,
      0
    )
    ctor(dest, null)
    dest
  }

  /**
   * Construct an empty **typed** Array into caller storage, via Array's typed
   * constructor (index 2: `Array(base, type, class_name, script)`). Typing the
   * array makes Godot fill new elements with the element type's default (e.g.
   * `""` for String) instead of `<null>` when the inspector adds a row.
   *
   * `elemType` is the element's variant type; `className` is the element class
   * name for OBJECT elements (e.g. `"Enemy"`), `""` for builtins.
   */
  def emptyTyped(
    dest: GDExtensionTypePtr,
    elemType: GDExtensionVariantType,
    className: String
  ): GArray = {
    val base = stackalloc[Byte](BuiltinSizes.Array.toCSize)
    empty(base)
    val typeBuf = stackalloc[GDExtensionInt]()
    !typeBuf = elemType.toInt.toLong
    val classSn = StringNames.cached(className)
    // A zeroed Variant is a valid NIL Variant (no script for builtin/native types).
    val script = stackalloc[Byte](BuiltinSizes.Variant.toCSize)
    memset(script, 0, BuiltinSizes.Variant.toCSize)
    val args = stackalloc[GDExtensionConstTypePtr](4)
    args(0) = base
    args(1) = typeBuf.asInstanceOf[GDExtensionConstTypePtr]
    args(2) = classSn.ptr
    args(3) = script
    val ctor = Godot.interface.variant_get_ptr_constructor(
      GDEXTENSION_VARIANT_TYPE_ARRAY,
      2
    )
    ctor(dest, args)
    GArray.fromPtr(base).destroy()
    dest
  }

  /** Run `body` with a stack-allocated empty Array; destroyed on exit. */
  inline def scope[R](body: GArray => R): R = {
    val buf = stackalloc[Byte](BuiltinSizes.Array.toCSize)
    val a = empty(buf)
    try body(a)
    finally a.destroy()
  }
}
