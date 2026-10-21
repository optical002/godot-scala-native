package gdext.internal.register

import scala.scalanative.unsigned.*
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.classes.{PackedScene, Node, Resource}
import gdext.internal.ffi.types.*
import gdext.internal.ffi.types.GDExtensionVariantType.*

/**
 * The single seam the `@gdexport` macro summons. Bundles Variant marshalling
 * with the inspector metadata (hint / hint_string / class_name / usage) for one
 * exportable field type. Per-type logic therefore lives in ordinary `given`s
 * here (not in the macro); the macro only reads the field type, summons
 * `ExportType[A]`, and wires the get/set lambdas.
 */
trait ExportType[A] {
  def variantType: GDExtensionVariantType
  def hint: Int = PropertyHint.None
  def hintString: String = ""
  def className: String = ""
  def usage: Int = PropertyUsage.Default
  def sceneRootType: Option[String] = None
  def toVariant(value: A, dest: GDExtensionVariantPtr): Unit
  def fromVariant(v: GDExtensionVariantPtr): A

  /** [[toVariant]] into the Variant at address `dest` (see `Addr`). */
  def toVariantAt(value: A, dest: Long): Unit =
    toVariant(value, gdext.internal.Addr.ptr[Byte](dest))

  /** [[fromVariant]] from the Variant at address `src`. */
  def fromVariantAt(src: Long): A =
    fromVariant(gdext.internal.Addr.ptr[Byte](src))

  /** True when a decoded value owns engine resources that [[release]] frees. */
  def holdsReferences: Boolean = false

  /** Release what a value decoded by [[fromVariant]] owns (once it is replaced). */
  def release(value: A): Unit = ()
}

object ExportType {
  def apply[A](using e: ExportType[A]): ExportType[A] = e

  /** Build an ExportType from the existing Variant typeclasses (value types). */
  def fromSeam[A](
    vt: GDExtensionVariantType
  )(using tv: ToVariant[A], fv: FromVariant[A]): ExportType[A] =
    new ExportType[A] {
      def variantType = vt
      def toVariant(value: A, dest: GDExtensionVariantPtr) =
        tv.toVariant(value, dest)
      def fromVariant(v: GDExtensionVariantPtr) = fv.fromVariant(v)
    }

  /** Primitive exports read and write the Variant at its address directly. */
  private def primitive[A](vt: GDExtensionVariantType)(
    write: (Long, A) => Unit,
    read: Long => A
  )(using tv: ToVariant[A], fv: FromVariant[A]): ExportType[A] =
    new ExportType[A] {
      def variantType = vt
      def toVariant(value: A, dest: GDExtensionVariantPtr) =
        tv.toVariant(value, dest)
      def fromVariant(v: GDExtensionVariantPtr) = fv.fromVariant(v)
      override def toVariantAt(value: A, dest: Long) = write(dest, value)
      override def fromVariantAt(src: Long) = read(src)
    }

  // --- primitives ---------------------------------------------------------
  given ExportType[Long] = primitive[Long](GDEXTENSION_VARIANT_TYPE_INT)(
    VariantIO.writeLong, VariantIO.readLong)
  given ExportType[Int] = primitive[Int](GDEXTENSION_VARIANT_TYPE_INT)(
    (d, v) => VariantIO.writeLong(d, v.toLong), s => VariantIO.readLong(s).toInt)
  given ExportType[Double] = primitive[Double](GDEXTENSION_VARIANT_TYPE_FLOAT)(
    VariantIO.writeDouble, VariantIO.readDouble)
  given ExportType[Float] = primitive[Float](GDEXTENSION_VARIANT_TYPE_FLOAT)(
    (d, v) => VariantIO.writeDouble(d, v.toDouble), s => VariantIO.readDouble(s).toFloat)
  given ExportType[Boolean] = primitive[Boolean](GDEXTENSION_VARIANT_TYPE_BOOL)(
    VariantIO.writeBool, VariantIO.readBool)
  given ExportType[String]  = fromSeam[String](GDEXTENSION_VARIANT_TYPE_STRING)

  // --- color --------------------------------------------------------------
  // Exports as a COLOR-typed property (inspector shows a color picker). The
  // alpha-less picker is opt-in via `@gdexport(ExportHint.colorNoAlpha)`.
  given ExportType[Color] = fromSeam[Color](GDEXTENSION_VARIANT_TYPE_COLOR)

  // --- math value types ---------------------------------------------------
  // Fixed-layout math builtins. Each exports as its own Variant type; the
  // inspector picks the matching editor (vector spinboxes, rect fields, etc.)
  // from the property's variant type alone — no hint needed. Marshalling reuses
  // the `ToVariant`/`FromVariant` givens defined alongside each type.
  given ExportType[Vector2]     = fromSeam[Vector2](GDEXTENSION_VARIANT_TYPE_VECTOR2)
  given ExportType[Vector2i]    = fromSeam[Vector2i](GDEXTENSION_VARIANT_TYPE_VECTOR2I)
  given ExportType[Vector3]     = fromSeam[Vector3](GDEXTENSION_VARIANT_TYPE_VECTOR3)
  given ExportType[Vector3i]    = fromSeam[Vector3i](GDEXTENSION_VARIANT_TYPE_VECTOR3I)
  given ExportType[Vector4]     = fromSeam[Vector4](GDEXTENSION_VARIANT_TYPE_VECTOR4)
  given ExportType[Vector4i]    = fromSeam[Vector4i](GDEXTENSION_VARIANT_TYPE_VECTOR4I)
  given ExportType[Rect2]       = fromSeam[Rect2](GDEXTENSION_VARIANT_TYPE_RECT2)
  given ExportType[Rect2i]      = fromSeam[Rect2i](GDEXTENSION_VARIANT_TYPE_RECT2I)
  given ExportType[Quaternion]  = fromSeam[Quaternion](GDEXTENSION_VARIANT_TYPE_QUATERNION)
  given ExportType[Plane]       = fromSeam[Plane](GDEXTENSION_VARIANT_TYPE_PLANE)
  given ExportType[AABB]        = fromSeam[AABB](GDEXTENSION_VARIANT_TYPE_AABB)
  given ExportType[Basis]       = fromSeam[Basis](GDEXTENSION_VARIANT_TYPE_BASIS)
  given ExportType[Transform2D] = fromSeam[Transform2D](GDEXTENSION_VARIANT_TYPE_TRANSFORM2D)
  given ExportType[Transform3D] = fromSeam[Transform3D](GDEXTENSION_VARIANT_TYPE_TRANSFORM3D)
  given ExportType[Projection]  = fromSeam[Projection](GDEXTENSION_VARIANT_TYPE_PROJECTION)

  // --- typed dictionary ---------------------------------------------------
  // Encoded like GDScript: hint=TYPE_STRING, hint_string = "<key>;<value>",
  // each part "<variant_type>[/<elem_hint>]:<elem_hint_string>".
  private def elemPart(e: ExportType[?]): String = {
    val t = e.variantType.toInt
    if (e.hint == PropertyHint.None) s"$t:${e.hintString}"
    else s"$t/${e.hint}:${e.hintString}"
  }

  // --- typed array --------------------------------------------------------
  // Same encoding as a Dict element: hint=TYPE_STRING, hint_string = one
  // elemPart "<variant_type>[/<elem_hint>]:<elem_hint_string>" (e.g. "2:" for
  // Int, "4:" for String, "24/34:Enemy" for a node element).
  given arrExport[A](using
    ea: ExportType[A],
    ta: ToVariant[Arr[A]],
    fa: FromVariant[Arr[A]]
  ): ExportType[Arr[A]] = new ExportType[Arr[A]] {
    def variantType = GDEXTENSION_VARIANT_TYPE_ARRAY
    override def hint = PropertyHint.TypeString
    override def hintString = elemPart(ea)
    def toVariant(value: Arr[A], dest: GDExtensionVariantPtr) =
      ta.toVariant(value, dest)
    def fromVariant(v: GDExtensionVariantPtr) = fa.fromVariant(v)
    override def holdsReferences = true
    override def release(value: Arr[A]) = if (value != null) value.free()
  }

  given dictExport[K, V](using
    ek: ExportType[K],
    ev: ExportType[V],
    tdict: ToVariant[Dict[K, V]],
    fdict: FromVariant[Dict[K, V]]
  ): ExportType[Dict[K, V]] = new ExportType[Dict[K, V]] {
    def variantType = GDEXTENSION_VARIANT_TYPE_DICTIONARY
    override def hint = PropertyHint.TypeString
    override def hintString = elemPart(ek) + ";" + elemPart(ev)
    def toVariant(value: Dict[K, V], dest: GDExtensionVariantPtr) =
      tdict.toVariant(value, dest)
    def fromVariant(v: GDExtensionVariantPtr) = fdict.fromVariant(v)
    override def holdsReferences = true
    override def release(value: Dict[K, V]) = if (value != null) value.free()
  }

  // --- optionality derivations over any RefLeaf ---------------------------
  /** Bare `X` (no wrapper) is treated as Required: stored, may be null at runtime. */
  given bareRef[A](using r: RefLeaf[A]): ExportType[A] = refExport(r)(
    toV = (a, dest) => ObjectVariant.write(r.handleOf(a), dest),
    fromV = v => r.fromHandle(ObjectVariant.read(v)),
    rel = a => r.release(a)
  )

  given optRef[A](using r: RefLeaf[A]): ExportType[Option[A]] =
    refExport[Option[A]](r)(
      toV = (a, dest) =>
        ObjectVariant.write(a.map(r.handleOf).getOrElse(null), dest),
      fromV = v => {
        val p = ObjectVariant.read(v)
        if (p == null) None else Some(r.fromHandle(p))
      },
      rel = a => if (a != null) a.foreach(r.release)
    )

  given reqRef[A](using r: RefLeaf[A]): ExportType[Required[A]] =
    refExport[Required[A]](r)(
      toV = (a, dest) =>
        ObjectVariant.write(a.toOption.map(r.handleOf).getOrElse(null), dest),
      fromV = v => {
        val p = ObjectVariant.read(v)
        if (p == null) Required.unassigned[A] else Required(r.fromHandle(p))
      },
      rel = a => if (a != null) a.toOption.foreach(r.release)
    )

  private def refExport[W](leaf: RefLeaf[?])(
    toV: (W, GDExtensionVariantPtr) => Unit,
    fromV: GDExtensionVariantPtr => W,
    rel: W => Unit
  ): ExportType[W] = new ExportType[W] {
    override def holdsReferences = leaf.holdsReferences
    override def release(value: W) = rel(value)
    def variantType = GDEXTENSION_VARIANT_TYPE_OBJECT
    override def hint = leaf.hint
    override def hintString = leaf.className
    override def className = leaf.className
    override def sceneRootType = leaf.sceneRootType
    def toVariant(value: W, dest: GDExtensionVariantPtr) = toV(value, dest)
    def fromVariant(v: GDExtensionVariantPtr) = fromV(v)
  }
}

/**
 * A reference "leaf": how a node/resource/scene wrapper marshals to/from a raw
 * engine handle, plus its inspector hint metadata. `ExportType` derives the
 * Option/Required/bare variants from this. The givens live here (RefLeaf's
 * companion) so implicit search for `RefLeaf[Tres[T]]` etc. finds them.
 */
trait RefLeaf[A] {
  def hint: Int
  def className: String
  def sceneRootType: Option[String] = None
  def handleOf(a: A): GDExtensionObjectPtr
  def fromHandle(p: GDExtensionObjectPtr): A

  /** True when [[fromHandle]] takes a reference that [[release]] drops. */
  def holdsReferences: Boolean = false
  def release(a: A): Unit = ()
}

object RefLeaf {
  /**
   * Bare node type: `@gdexport var p: Option[Projectile]` exports a node
   * reference. The node-vs-resource hint is inferred from the class hierarchy.
   * The reference is held as the plain wrapper `T`; marshals via the
   * `ClassMeta[T]` factory.
   */
  given bareNodeLeaf[T <: Node](using meta: ClassMeta[T]): RefLeaf[T] =
    new RefLeaf[T] {
      def hint = PropertyHint.NodeType
      def className = meta.className
      def handleOf(a: T) = if (a == null) null else a.hostPtr
      def fromHandle(p: GDExtensionObjectPtr) = meta.fromHandle(p)
    }

  /** Bare resource type (see [[bareNodeLeaf]]). */
  given bareResourceLeaf[T <: Resource](using meta: ClassMeta[T]): RefLeaf[T] =
    new RefLeaf[T] {
      def hint = PropertyHint.ResourceType
      def className = meta.className
      def handleOf(a: T) = if (a == null) null else a.hostPtr
      // Take a reference: this handle is stored in an export field, so it must
      // outlive Godot's temporary loader reference (see GodotScriptClass.reference).
      def fromHandle(p: GDExtensionObjectPtr) = {
        val wrapped = meta.fromHandle(p)
        if (wrapped != null) wrapped.refInc()
        wrapped
      }
      override def holdsReferences = true
      override def release(a: T) = if (a != null) a.unref()
    }

  given tresLeaf[T <: Resource](using meta: ClassMeta[T]): RefLeaf[Tres[T]] =
    new RefLeaf[Tres[T]] {
      def hint = PropertyHint.ResourceType
      def className = meta.className
      def handleOf(a: Tres[T]) = if (a.raw == null) null else a.raw.hostPtr
      // Reference: the Tres is stored in an export field and must keep the
      // Resource alive past Godot's temporary loader reference.
      def fromHandle(p: GDExtensionObjectPtr) = {
        val wrapped = meta.fromHandle(p)
        if (wrapped != null) wrapped.refInc()
        Tres(wrapped)
      }
      override def holdsReferences = true
      override def release(a: Tres[T]) =
        if (a != null && a.raw != null) a.raw.unref()
    }

  given tscnLeaf[T <: GodotScriptClass](using
    root: ClassMeta[T],
    ps: ClassMeta[PackedScene]
  ): RefLeaf[Tscn[T]] = new RefLeaf[Tscn[T]] {
    def hint = PropertyHint.ResourceType
    def className = "PackedScene"
    override def sceneRootType = Some(root.className)
    def handleOf(a: Tscn[T]) = if (a.raw == null) null else a.raw.hostPtr
    def fromHandle(p: GDExtensionObjectPtr) = {
      val scene = ps.fromHandle(p)
      Tscn[T](if (scene == null) scene else scene.refInc())
    }
    override def holdsReferences = true
    override def release(a: Tscn[T]) =
      if (a != null && a.raw != null) a.raw.unref()
  }
}
