package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AESContext`, extends `RefCounted`. */
abstract class AESContext extends RefCounted {
  override def godotClassName: String = "AESContext"

  /** AESContext.finish */
  final def finish(): Unit = {
    if (gdext.classes.AESContext.mb_finish == null) gdext.classes.AESContext.mb_finish = MethodBind.get("AESContext", "finish", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.AESContext.mb_finish, livePtr)
  }

}

object AESContext {
  private[classes] var mb_finish: GDExtensionMethodBindPtr = null

  /** Godot enum `AESContext.Mode`. */
  opaque type Mode <: Long = Long

  object Mode {
    final val EcbEncrypt: Mode = 0L.asInstanceOf[Mode]
    final val EcbDecrypt: Mode = 1L.asInstanceOf[Mode]
    final val CbcEncrypt: Mode = 2L.asInstanceOf[Mode]
    final val CbcDecrypt: Mode = 3L.asInstanceOf[Mode]
    final val Max: Mode = 4L.asInstanceOf[Mode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Mode = value.asInstanceOf[Mode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Mode] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[Mode]]

    extension (self: Mode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "EcbEncrypt"
        case 1L => "EcbDecrypt"
        case 2L => "CbcEncrypt"
        case 3L => "CbcDecrypt"
        case 4L => "Max"
        case other => other.toString
      }
  }
}
