package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Logger`, extends `RefCounted`. */
abstract class Logger extends RefCounted {
  override def godotClassName: String = "Logger"

}

object Logger {

  /** Godot enum `Logger.ErrorType`. */
  opaque type ErrorType <: Long = Long

  object ErrorType {
    final val Error: ErrorType = 0L.asInstanceOf[ErrorType]
    final val Warning: ErrorType = 1L.asInstanceOf[ErrorType]
    final val Script: ErrorType = 2L.asInstanceOf[ErrorType]
    final val Shader: ErrorType = 3L.asInstanceOf[ErrorType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ErrorType = value.asInstanceOf[ErrorType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ErrorType] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[ErrorType]]

    extension (self: ErrorType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Error"
        case 1L => "Warning"
        case 2L => "Script"
        case 3L => "Shader"
        case other => other.toString
      }
  }
}
