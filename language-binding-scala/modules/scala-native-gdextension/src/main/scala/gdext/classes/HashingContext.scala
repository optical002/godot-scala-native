package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `HashingContext`, extends `RefCounted`. */
abstract class HashingContext extends RefCounted {
  override def godotClassName: String = "HashingContext"

  /** HashingContext.start */
  final def start(`type`: gdext.classes.HashingContext.HashType): gdext.classes.Error = {
    if (gdext.classes.HashingContext.mb_start == null) gdext.classes.HashingContext.mb_start = MethodBind.get("HashingContext", "start", 3940338335L)
    gdext.classes.Error(Ptrcall.call1[Long, Long](gdext.classes.HashingContext.mb_start, livePtr, `type`))
  }

}

object HashingContext {
  private[classes] var mb_start: GDExtensionMethodBindPtr = null

  /** Godot enum `HashingContext.HashType`. */
  opaque type HashType <: Long = Long

  object HashType {
    final val Md5: HashType = 0L.asInstanceOf[HashType]
    final val Sha1: HashType = 1L.asInstanceOf[HashType]
    final val Sha256: HashType = 2L.asInstanceOf[HashType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): HashType = value.asInstanceOf[HashType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[HashType] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[HashType]]

    extension (self: HashType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Md5"
        case 1L => "Sha1"
        case 2L => "Sha256"
        case other => other.toString
      }
  }
}
