package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `EditorScenePostImportPlugin`, extends `RefCounted`. */
abstract class EditorScenePostImportPlugin extends RefCounted {
  override def godotClassName: String = "EditorScenePostImportPlugin"

}

object EditorScenePostImportPlugin {

  /** Godot enum `EditorScenePostImportPlugin.InternalImportCategory`. */
  opaque type InternalImportCategory <: Long = Long

  object InternalImportCategory {
    final val Node: InternalImportCategory = 0L.asInstanceOf[InternalImportCategory]
    final val Mesh3dNode: InternalImportCategory = 1L.asInstanceOf[InternalImportCategory]
    final val Mesh: InternalImportCategory = 2L.asInstanceOf[InternalImportCategory]
    final val Material: InternalImportCategory = 3L.asInstanceOf[InternalImportCategory]
    final val Animation: InternalImportCategory = 4L.asInstanceOf[InternalImportCategory]
    final val AnimationNode: InternalImportCategory = 5L.asInstanceOf[InternalImportCategory]
    final val Skeleton3dNode: InternalImportCategory = 6L.asInstanceOf[InternalImportCategory]
    final val Max: InternalImportCategory = 7L.asInstanceOf[InternalImportCategory]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): InternalImportCategory = value.asInstanceOf[InternalImportCategory]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[InternalImportCategory] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L).asInstanceOf[scala.IArray[InternalImportCategory]]

    extension (self: InternalImportCategory)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Node"
        case 1L => "Mesh3dNode"
        case 2L => "Mesh"
        case 3L => "Material"
        case 4L => "Animation"
        case 5L => "AnimationNode"
        case 6L => "Skeleton3dNode"
        case 7L => "Max"
        case other => other.toString
      }
  }
}
