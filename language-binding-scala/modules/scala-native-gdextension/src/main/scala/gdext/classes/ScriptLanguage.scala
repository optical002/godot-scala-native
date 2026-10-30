package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ScriptLanguage`, extends `Object`. */
abstract class ScriptLanguage extends Object {
  override def godotClassName: String = "ScriptLanguage"

}

object ScriptLanguage {

  /** Godot enum `ScriptLanguage.ScriptNameCasing`. */
  opaque type ScriptNameCasing <: Long = Long

  object ScriptNameCasing {
    final val Auto: ScriptNameCasing = 0L.asInstanceOf[ScriptNameCasing]
    final val PascalCase: ScriptNameCasing = 1L.asInstanceOf[ScriptNameCasing]
    final val SnakeCase: ScriptNameCasing = 2L.asInstanceOf[ScriptNameCasing]
    final val KebabCase: ScriptNameCasing = 3L.asInstanceOf[ScriptNameCasing]
    final val CamelCase: ScriptNameCasing = 4L.asInstanceOf[ScriptNameCasing]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ScriptNameCasing = value.asInstanceOf[ScriptNameCasing]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ScriptNameCasing] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[ScriptNameCasing]]

    extension (self: ScriptNameCasing)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Auto"
        case 1L => "PascalCase"
        case 2L => "SnakeCase"
        case 3L => "KebabCase"
        case 4L => "CamelCase"
        case other => other.toString
      }
  }
}
