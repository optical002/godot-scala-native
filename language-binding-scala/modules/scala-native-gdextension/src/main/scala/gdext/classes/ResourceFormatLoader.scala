package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ResourceFormatLoader`, extends `RefCounted`. */
abstract class ResourceFormatLoader extends RefCounted {
  override def godotClassName: String = "ResourceFormatLoader"

}

object ResourceFormatLoader {

  /** Godot enum `ResourceFormatLoader.CacheMode`. */
  opaque type CacheMode <: Long = Long

  object CacheMode {
    final val Ignore: CacheMode = 0L.asInstanceOf[CacheMode]
    final val Reuse: CacheMode = 1L.asInstanceOf[CacheMode]
    final val Replace: CacheMode = 2L.asInstanceOf[CacheMode]
    final val IgnoreDeep: CacheMode = 3L.asInstanceOf[CacheMode]
    final val ReplaceDeep: CacheMode = 4L.asInstanceOf[CacheMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): CacheMode = value.asInstanceOf[CacheMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[CacheMode] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[CacheMode]]

    extension (self: CacheMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Ignore"
        case 1L => "Reuse"
        case 2L => "Replace"
        case 3L => "IgnoreDeep"
        case 4L => "ReplaceDeep"
        case other => other.toString
      }
  }
}
