package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Mesh`, extends `Resource`. */
abstract class Mesh extends Resource {
  override def godotClassName: String = "Mesh"

  /** Mesh.set_lightmap_size_hint */
  final def setLightmapSizeHint(size: gdext.builtin.Vector2i): Unit = {
    if (gdext.classes.Mesh.mb_set_lightmap_size_hint == null) gdext.classes.Mesh.mb_set_lightmap_size_hint = MethodBind.get("Mesh", "set_lightmap_size_hint", 1130785943L)
    Ptrcall.callVoid1(gdext.classes.Mesh.mb_set_lightmap_size_hint, livePtr, size)
  }

  /** Mesh.get_lightmap_size_hint */
  final def getLightmapSizeHint(): gdext.builtin.Vector2i = {
    if (gdext.classes.Mesh.mb_get_lightmap_size_hint == null) gdext.classes.Mesh.mb_get_lightmap_size_hint = MethodBind.get("Mesh", "get_lightmap_size_hint", 3690982128L)
    Ptrcall.call0[gdext.builtin.Vector2i](gdext.classes.Mesh.mb_get_lightmap_size_hint, livePtr)
  }

  /** Mesh.get_aabb */
  final def getAabb(): gdext.builtin.AABB = {
    if (gdext.classes.Mesh.mb_get_aabb == null) gdext.classes.Mesh.mb_get_aabb = MethodBind.get("Mesh", "get_aabb", 1068685055L)
    Ptrcall.call0[gdext.builtin.AABB](gdext.classes.Mesh.mb_get_aabb, livePtr)
  }

  /** Mesh.get_surface_count */
  final def getSurfaceCount(): Long = {
    if (gdext.classes.Mesh.mb_get_surface_count == null) gdext.classes.Mesh.mb_get_surface_count = MethodBind.get("Mesh", "get_surface_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Mesh.mb_get_surface_count, livePtr)
  }

  /** Mesh.surface_set_material */
  final def surfaceSetMaterial(surfIdx: Long, material: Material): Unit = {
    if (gdext.classes.Mesh.mb_surface_set_material == null) gdext.classes.Mesh.mb_surface_set_material = MethodBind.get("Mesh", "surface_set_material", 3671737478L)
    Ptrcall.callVoid2(gdext.classes.Mesh.mb_surface_set_material, livePtr, surfIdx, Wrappers.handle(material))
  }

  /** Mesh.surface_get_material. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def surfaceGetMaterial(surfIdx: Long): Material = {
    if (gdext.classes.Mesh.mb_surface_get_material == null) gdext.classes.Mesh.mb_surface_get_material = MethodBind.get("Mesh", "surface_get_material", 2897466400L)
    Wrappers.owned[Material](Ptrcall.call1[Long, Long](gdext.classes.Mesh.mb_surface_get_material, livePtr, surfIdx))
  }

  /** Mesh.create_placeholder. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def createPlaceholder(): Resource = {
    if (gdext.classes.Mesh.mb_create_placeholder == null) gdext.classes.Mesh.mb_create_placeholder = MethodBind.get("Mesh", "create_placeholder", 121922552L)
    Wrappers.owned[Resource](Ptrcall.call0[Long](gdext.classes.Mesh.mb_create_placeholder, livePtr))
  }

  /** Mesh.create_trimesh_shape. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def createTrimeshShape(): ConcavePolygonShape3D = {
    if (gdext.classes.Mesh.mb_create_trimesh_shape == null) gdext.classes.Mesh.mb_create_trimesh_shape = MethodBind.get("Mesh", "create_trimesh_shape", 4160111210L)
    Wrappers.owned[ConcavePolygonShape3D](Ptrcall.call0[Long](gdext.classes.Mesh.mb_create_trimesh_shape, livePtr))
  }

  /** Mesh.create_convex_shape. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def createConvexShape(clean: Boolean = true, simplify: Boolean = false): ConvexPolygonShape3D = {
    if (gdext.classes.Mesh.mb_create_convex_shape == null) gdext.classes.Mesh.mb_create_convex_shape = MethodBind.get("Mesh", "create_convex_shape", 2529984628L)
    Wrappers.owned[ConvexPolygonShape3D](Ptrcall.call2[Boolean, Boolean, Long](gdext.classes.Mesh.mb_create_convex_shape, livePtr, clean, simplify))
  }

  /** Mesh.create_outline. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def createOutline(margin: Double): Mesh = {
    if (gdext.classes.Mesh.mb_create_outline == null) gdext.classes.Mesh.mb_create_outline = MethodBind.get("Mesh", "create_outline", 1208642001L)
    Wrappers.owned[Mesh](Ptrcall.call1[Double, Long](gdext.classes.Mesh.mb_create_outline, livePtr, margin))
  }

  /** Mesh.generate_triangle_mesh. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def generateTriangleMesh(): TriangleMesh = {
    if (gdext.classes.Mesh.mb_generate_triangle_mesh == null) gdext.classes.Mesh.mb_generate_triangle_mesh = MethodBind.get("Mesh", "generate_triangle_mesh", 3476533166L)
    Wrappers.owned[TriangleMesh](Ptrcall.call0[Long](gdext.classes.Mesh.mb_generate_triangle_mesh, livePtr))
  }

}

object Mesh {
  private[classes] var mb_set_lightmap_size_hint: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_lightmap_size_hint: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_aabb: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_surface_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_surface_set_material: GDExtensionMethodBindPtr = null
  private[classes] var mb_surface_get_material: GDExtensionMethodBindPtr = null
  private[classes] var mb_create_placeholder: GDExtensionMethodBindPtr = null
  private[classes] var mb_create_trimesh_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_create_convex_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_create_outline: GDExtensionMethodBindPtr = null
  private[classes] var mb_generate_triangle_mesh: GDExtensionMethodBindPtr = null

  /** Godot enum `Mesh.PrimitiveType`. */
  opaque type PrimitiveType <: Long = Long

  object PrimitiveType {
    final val Points: PrimitiveType = 0L.asInstanceOf[PrimitiveType]
    final val Lines: PrimitiveType = 1L.asInstanceOf[PrimitiveType]
    final val LineStrip: PrimitiveType = 2L.asInstanceOf[PrimitiveType]
    final val Triangles: PrimitiveType = 3L.asInstanceOf[PrimitiveType]
    final val TriangleStrip: PrimitiveType = 4L.asInstanceOf[PrimitiveType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): PrimitiveType = value.asInstanceOf[PrimitiveType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[PrimitiveType] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[PrimitiveType]]

    extension (self: PrimitiveType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Points"
        case 1L => "Lines"
        case 2L => "LineStrip"
        case 3L => "Triangles"
        case 4L => "TriangleStrip"
        case other => other.toString
      }
  }

  /** Godot enum `Mesh.ArrayType`. */
  opaque type ArrayType <: Long = Long

  object ArrayType {
    final val Vertex: ArrayType = 0L.asInstanceOf[ArrayType]
    final val Normal: ArrayType = 1L.asInstanceOf[ArrayType]
    final val Tangent: ArrayType = 2L.asInstanceOf[ArrayType]
    final val Color: ArrayType = 3L.asInstanceOf[ArrayType]
    final val TexUv: ArrayType = 4L.asInstanceOf[ArrayType]
    final val TexUv2: ArrayType = 5L.asInstanceOf[ArrayType]
    final val Custom0: ArrayType = 6L.asInstanceOf[ArrayType]
    final val Custom1: ArrayType = 7L.asInstanceOf[ArrayType]
    final val Custom2: ArrayType = 8L.asInstanceOf[ArrayType]
    final val Custom3: ArrayType = 9L.asInstanceOf[ArrayType]
    final val Bones: ArrayType = 10L.asInstanceOf[ArrayType]
    final val Weights: ArrayType = 11L.asInstanceOf[ArrayType]
    final val Index: ArrayType = 12L.asInstanceOf[ArrayType]
    final val Max: ArrayType = 13L.asInstanceOf[ArrayType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ArrayType = value.asInstanceOf[ArrayType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ArrayType] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 12L, 13L).asInstanceOf[scala.IArray[ArrayType]]

    extension (self: ArrayType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Vertex"
        case 1L => "Normal"
        case 2L => "Tangent"
        case 3L => "Color"
        case 4L => "TexUv"
        case 5L => "TexUv2"
        case 6L => "Custom0"
        case 7L => "Custom1"
        case 8L => "Custom2"
        case 9L => "Custom3"
        case 10L => "Bones"
        case 11L => "Weights"
        case 12L => "Index"
        case 13L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `Mesh.ArrayCustomFormat`. */
  opaque type ArrayCustomFormat <: Long = Long

  object ArrayCustomFormat {
    final val Rgba8Unorm: ArrayCustomFormat = 0L.asInstanceOf[ArrayCustomFormat]
    final val Rgba8Snorm: ArrayCustomFormat = 1L.asInstanceOf[ArrayCustomFormat]
    final val RgHalf: ArrayCustomFormat = 2L.asInstanceOf[ArrayCustomFormat]
    final val RgbaHalf: ArrayCustomFormat = 3L.asInstanceOf[ArrayCustomFormat]
    final val RFloat: ArrayCustomFormat = 4L.asInstanceOf[ArrayCustomFormat]
    final val RgFloat: ArrayCustomFormat = 5L.asInstanceOf[ArrayCustomFormat]
    final val RgbFloat: ArrayCustomFormat = 6L.asInstanceOf[ArrayCustomFormat]
    final val RgbaFloat: ArrayCustomFormat = 7L.asInstanceOf[ArrayCustomFormat]
    final val Max: ArrayCustomFormat = 8L.asInstanceOf[ArrayCustomFormat]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ArrayCustomFormat = value.asInstanceOf[ArrayCustomFormat]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ArrayCustomFormat] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L).asInstanceOf[scala.IArray[ArrayCustomFormat]]

    extension (self: ArrayCustomFormat)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Rgba8Unorm"
        case 1L => "Rgba8Snorm"
        case 2L => "RgHalf"
        case 3L => "RgbaHalf"
        case 4L => "RFloat"
        case 5L => "RgFloat"
        case 6L => "RgbFloat"
        case 7L => "RgbaFloat"
        case 8L => "Max"
        case other => other.toString
      }
  }

  /** Godot bitfield `Mesh.ArrayFormat`. */
  opaque type ArrayFormat = Long

  object ArrayFormat {
    final val FormatVertex: ArrayFormat = 1L.asInstanceOf[ArrayFormat]
    final val FormatNormal: ArrayFormat = 2L.asInstanceOf[ArrayFormat]
    final val FormatTangent: ArrayFormat = 4L.asInstanceOf[ArrayFormat]
    final val FormatColor: ArrayFormat = 8L.asInstanceOf[ArrayFormat]
    final val FormatTexUv: ArrayFormat = 16L.asInstanceOf[ArrayFormat]
    final val FormatTexUv2: ArrayFormat = 32L.asInstanceOf[ArrayFormat]
    final val FormatCustom0: ArrayFormat = 64L.asInstanceOf[ArrayFormat]
    final val FormatCustom1: ArrayFormat = 128L.asInstanceOf[ArrayFormat]
    final val FormatCustom2: ArrayFormat = 256L.asInstanceOf[ArrayFormat]
    final val FormatCustom3: ArrayFormat = 512L.asInstanceOf[ArrayFormat]
    final val FormatBones: ArrayFormat = 1024L.asInstanceOf[ArrayFormat]
    final val FormatWeights: ArrayFormat = 2048L.asInstanceOf[ArrayFormat]
    final val FormatIndex: ArrayFormat = 4096L.asInstanceOf[ArrayFormat]
    final val FormatBlendShapeMask: ArrayFormat = 7L.asInstanceOf[ArrayFormat]
    final val FormatCustomBase: ArrayFormat = 13L.asInstanceOf[ArrayFormat]
    final val FormatCustomBits: ArrayFormat = 3L.asInstanceOf[ArrayFormat]
    final val FormatCustom0Shift: ArrayFormat = 13L.asInstanceOf[ArrayFormat]
    final val FormatCustom1Shift: ArrayFormat = 16L.asInstanceOf[ArrayFormat]
    final val FormatCustom2Shift: ArrayFormat = 19L.asInstanceOf[ArrayFormat]
    final val FormatCustom3Shift: ArrayFormat = 22L.asInstanceOf[ArrayFormat]
    final val FormatCustomMask: ArrayFormat = 7L.asInstanceOf[ArrayFormat]
    final val CompressFlagsBase: ArrayFormat = 25L.asInstanceOf[ArrayFormat]
    final val FlagUse2dVertices: ArrayFormat = 33554432L.asInstanceOf[ArrayFormat]
    final val FlagUseDynamicUpdate: ArrayFormat = 67108864L.asInstanceOf[ArrayFormat]
    final val FlagUse8BoneWeights: ArrayFormat = 134217728L.asInstanceOf[ArrayFormat]
    final val FlagUsesEmptyVertexArray: ArrayFormat = 268435456L.asInstanceOf[ArrayFormat]
    final val FlagCompressAttributes: ArrayFormat = 536870912L.asInstanceOf[ArrayFormat]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ArrayFormat = value.asInstanceOf[ArrayFormat]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ArrayFormat] = scala.IArray[Long](1L, 2L, 3L, 4L, 7L, 8L, 13L, 16L, 19L, 22L, 25L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 4096L, 33554432L, 67108864L, 134217728L, 268435456L, 536870912L).asInstanceOf[scala.IArray[ArrayFormat]]

    extension (self: ArrayFormat)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 1L => "FormatVertex"
        case 2L => "FormatNormal"
        case 3L => "FormatCustomBits"
        case 4L => "FormatTangent"
        case 7L => "FormatBlendShapeMask"
        case 8L => "FormatColor"
        case 13L => "FormatCustomBase"
        case 16L => "FormatTexUv"
        case 19L => "FormatCustom2Shift"
        case 22L => "FormatCustom3Shift"
        case 25L => "CompressFlagsBase"
        case 32L => "FormatTexUv2"
        case 64L => "FormatCustom0"
        case 128L => "FormatCustom1"
        case 256L => "FormatCustom2"
        case 512L => "FormatCustom3"
        case 1024L => "FormatBones"
        case 2048L => "FormatWeights"
        case 4096L => "FormatIndex"
        case 33554432L => "FlagUse2dVertices"
        case 67108864L => "FlagUseDynamicUpdate"
        case 134217728L => "FlagUse8BoneWeights"
        case 268435456L => "FlagUsesEmptyVertexArray"
        case 536870912L => "FlagCompressAttributes"
        case other => other.toString
      }
    extension (self: ArrayFormat) {
      inline def value: Long = self.asInstanceOf[Long]
      inline def |(other: ArrayFormat): ArrayFormat = (self.value | other.value).asInstanceOf[ArrayFormat]
      inline def &(other: ArrayFormat): ArrayFormat = (self.value & other.value).asInstanceOf[ArrayFormat]
      /** Every bit of `flag` is set. */
      inline def has(flag: ArrayFormat): Boolean = (self.value & flag.value) == flag.value
    }
  }

  /** Godot enum `Mesh.BlendShapeMode`. */
  opaque type BlendShapeMode <: Long = Long

  object BlendShapeMode {
    final val Normalized: BlendShapeMode = 0L.asInstanceOf[BlendShapeMode]
    final val Relative: BlendShapeMode = 1L.asInstanceOf[BlendShapeMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): BlendShapeMode = value.asInstanceOf[BlendShapeMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[BlendShapeMode] = scala.IArray[Long](0L, 1L).asInstanceOf[scala.IArray[BlendShapeMode]]

    extension (self: BlendShapeMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Normalized"
        case 1L => "Relative"
        case other => other.toString
      }
  }
}
