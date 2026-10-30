package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ScriptLanguageExtension`, extends `ScriptLanguage`. */
abstract class ScriptLanguageExtension extends ScriptLanguage {
  override def godotClassName: String = "ScriptLanguageExtension"

}

object ScriptLanguageExtension {

  /** Godot enum `ScriptLanguageExtension.LookupResultType`. */
  opaque type LookupResultType <: Long = Long

  object LookupResultType {
    final val ScriptLocation: LookupResultType = 0L.asInstanceOf[LookupResultType]
    final val Class: LookupResultType = 1L.asInstanceOf[LookupResultType]
    final val ClassConstant: LookupResultType = 2L.asInstanceOf[LookupResultType]
    final val ClassProperty: LookupResultType = 3L.asInstanceOf[LookupResultType]
    final val ClassMethod: LookupResultType = 4L.asInstanceOf[LookupResultType]
    final val ClassSignal: LookupResultType = 5L.asInstanceOf[LookupResultType]
    final val ClassEnum: LookupResultType = 6L.asInstanceOf[LookupResultType]
    final val ClassTbdGlobalscope: LookupResultType = 7L.asInstanceOf[LookupResultType]
    final val ClassAnnotation: LookupResultType = 8L.asInstanceOf[LookupResultType]
    final val LocalConstant: LookupResultType = 9L.asInstanceOf[LookupResultType]
    final val LocalVariable: LookupResultType = 10L.asInstanceOf[LookupResultType]
    final val Max: LookupResultType = 11L.asInstanceOf[LookupResultType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): LookupResultType = value.asInstanceOf[LookupResultType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[LookupResultType] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L).asInstanceOf[scala.IArray[LookupResultType]]

    extension (self: LookupResultType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "ScriptLocation"
        case 1L => "Class"
        case 2L => "ClassConstant"
        case 3L => "ClassProperty"
        case 4L => "ClassMethod"
        case 5L => "ClassSignal"
        case 6L => "ClassEnum"
        case 7L => "ClassTbdGlobalscope"
        case 8L => "ClassAnnotation"
        case 9L => "LocalConstant"
        case 10L => "LocalVariable"
        case 11L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `ScriptLanguageExtension.CodeCompletionLocation`. */
  opaque type CodeCompletionLocation <: Long = Long

  object CodeCompletionLocation {
    final val Local: CodeCompletionLocation = 0L.asInstanceOf[CodeCompletionLocation]
    final val ParentMask: CodeCompletionLocation = 256L.asInstanceOf[CodeCompletionLocation]
    final val OtherUserCode: CodeCompletionLocation = 512L.asInstanceOf[CodeCompletionLocation]
    final val Other: CodeCompletionLocation = 1024L.asInstanceOf[CodeCompletionLocation]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): CodeCompletionLocation = value.asInstanceOf[CodeCompletionLocation]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[CodeCompletionLocation] = scala.IArray[Long](0L, 256L, 512L, 1024L).asInstanceOf[scala.IArray[CodeCompletionLocation]]

    extension (self: CodeCompletionLocation)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Local"
        case 256L => "ParentMask"
        case 512L => "OtherUserCode"
        case 1024L => "Other"
        case other => other.toString
      }
  }

  /** Godot enum `ScriptLanguageExtension.CodeCompletionKind`. */
  opaque type CodeCompletionKind <: Long = Long

  object CodeCompletionKind {
    final val Class: CodeCompletionKind = 0L.asInstanceOf[CodeCompletionKind]
    final val Function: CodeCompletionKind = 1L.asInstanceOf[CodeCompletionKind]
    final val Signal: CodeCompletionKind = 2L.asInstanceOf[CodeCompletionKind]
    final val Variable: CodeCompletionKind = 3L.asInstanceOf[CodeCompletionKind]
    final val Member: CodeCompletionKind = 4L.asInstanceOf[CodeCompletionKind]
    final val Enum: CodeCompletionKind = 5L.asInstanceOf[CodeCompletionKind]
    final val Constant: CodeCompletionKind = 6L.asInstanceOf[CodeCompletionKind]
    final val NodePath: CodeCompletionKind = 7L.asInstanceOf[CodeCompletionKind]
    final val FilePath: CodeCompletionKind = 8L.asInstanceOf[CodeCompletionKind]
    final val PlainText: CodeCompletionKind = 9L.asInstanceOf[CodeCompletionKind]
    final val Max: CodeCompletionKind = 10L.asInstanceOf[CodeCompletionKind]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): CodeCompletionKind = value.asInstanceOf[CodeCompletionKind]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[CodeCompletionKind] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L).asInstanceOf[scala.IArray[CodeCompletionKind]]

    extension (self: CodeCompletionKind)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Class"
        case 1L => "Function"
        case 2L => "Signal"
        case 3L => "Variable"
        case 4L => "Member"
        case 5L => "Enum"
        case 6L => "Constant"
        case 7L => "NodePath"
        case 8L => "FilePath"
        case 9L => "PlainText"
        case 10L => "Max"
        case other => other.toString
      }
  }
}
