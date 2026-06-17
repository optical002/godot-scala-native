package io.github.optical002.godot.builtin

/**
 * Byte sizes of Godot's builtin (Variant) types for the `float_64` build
 * configuration — Godot's default desktop build, and the configuration the
 * bundled `extension_api.json` (Godot 4.5) documents.
 *
 * These types are opaque blobs on the GDExtension boundary: we allocate a
 * buffer of exactly this many bytes and hand Godot a pointer to it. Getting a
 * size wrong corrupts memory silently, so these are pinned from the API's
 * `builtin_class_sizes` table and asserted against the live engine at init
 * (see [[BuiltinSizes.assertMatchesEngine]] — wired up once engine version
 * querying lands).
 *
 * If you target a non-default build configuration (`float_32`, `double_*`),
 * regenerate these from `extension_api.json`.
 */
object BuiltinSizes {
  final val Variant = 24

  final val String = 8
  final val StringName = 8
  final val NodePath = 8

  final val Vector2 = 8
  final val Vector2i = 8
  final val Vector3 = 12
  final val Vector3i = 12
  final val Vector4 = 16
  final val Vector4i = 16

  final val Rect2 = 16
  final val Rect2i = 16
  final val Color = 16
  final val Quaternion = 16
  final val Plane = 16
  final val AABB = 24
  final val Basis = 36
  final val Transform2D = 24
  final val Transform3D = 48
  final val Projection = 64

  final val Array = 8
  final val Dictionary = 8
  final val Callable = 16
  final val Signal = 16
  final val RID = 8

  final val PackedByteArray = 16
  final val PackedInt32Array = 16
  final val PackedInt64Array = 16
  final val PackedFloat32Array = 16
  final val PackedFloat64Array = 16
  final val PackedStringArray = 16
  final val PackedVector2Array = 16
  final val PackedVector3Array = 16
  final val PackedVector4Array = 16
  final val PackedColorArray = 16
}
