package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ImageFormatLoader`, extends `RefCounted`. */
abstract class ImageFormatLoader extends RefCounted {
  override def godotClassName: String = "ImageFormatLoader"

}

object ImageFormatLoader {

  /** Godot bitfield `ImageFormatLoader.LoaderFlags`. */
  opaque type LoaderFlags = Long

  object LoaderFlags {
    final val None: LoaderFlags = 0L.asInstanceOf[LoaderFlags]
    final val ForceLinear: LoaderFlags = 1L.asInstanceOf[LoaderFlags]
    final val ConvertColors: LoaderFlags = 2L.asInstanceOf[LoaderFlags]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): LoaderFlags = value.asInstanceOf[LoaderFlags]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[LoaderFlags] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[LoaderFlags]]

    extension (self: LoaderFlags)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "None"
        case 1L => "ForceLinear"
        case 2L => "ConvertColors"
        case other => other.toString
      }
    extension (self: LoaderFlags) {
      inline def value: Long = self.asInstanceOf[Long]
      inline def |(other: LoaderFlags): LoaderFlags = (self.value | other.value).asInstanceOf[LoaderFlags]
      inline def &(other: LoaderFlags): LoaderFlags = (self.value & other.value).asInstanceOf[LoaderFlags]
      /** Every bit of `flag` is set. */
      inline def has(flag: LoaderFlags): Boolean = (self.value & flag.value) == flag.value
    }
  }
}
