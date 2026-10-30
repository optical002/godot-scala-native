package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ResourceImporter`, extends `RefCounted`. */
abstract class ResourceImporter extends RefCounted {
  override def godotClassName: String = "ResourceImporter"

}

object ResourceImporter {

  /** Godot enum `ResourceImporter.ImportOrder`. */
  opaque type ImportOrder <: Long = Long

  object ImportOrder {
    final val Default: ImportOrder = 0L.asInstanceOf[ImportOrder]
    final val Scene: ImportOrder = 100L.asInstanceOf[ImportOrder]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ImportOrder = value.asInstanceOf[ImportOrder]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ImportOrder] = scala.IArray[Long](0L, 100L).asInstanceOf[scala.IArray[ImportOrder]]

    extension (self: ImportOrder)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Default"
        case 100L => "Scene"
        case other => other.toString
      }
  }
}
