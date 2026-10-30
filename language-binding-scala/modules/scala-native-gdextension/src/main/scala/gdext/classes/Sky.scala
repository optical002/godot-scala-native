package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Sky`, extends `Resource`. */
abstract class Sky extends Resource {
  override def godotClassName: String = "Sky"

  /** Sky.set_radiance_size */
  final def setRadianceSize(size: gdext.classes.Sky.RadianceSize): Unit = {
    if (gdext.classes.Sky.mb_set_radiance_size == null) gdext.classes.Sky.mb_set_radiance_size = MethodBind.get("Sky", "set_radiance_size", 1512957179L)
    Ptrcall.callVoid1(gdext.classes.Sky.mb_set_radiance_size, livePtr, size)
  }

  /** Sky.get_radiance_size */
  final def getRadianceSize(): gdext.classes.Sky.RadianceSize = {
    if (gdext.classes.Sky.mb_get_radiance_size == null) gdext.classes.Sky.mb_get_radiance_size = MethodBind.get("Sky", "get_radiance_size", 2708733976L)
    gdext.classes.Sky.RadianceSize(Ptrcall.call0[Long](gdext.classes.Sky.mb_get_radiance_size, livePtr))
  }

  /** Sky.set_process_mode */
  final def setProcessMode(mode: gdext.classes.Sky.ProcessMode): Unit = {
    if (gdext.classes.Sky.mb_set_process_mode == null) gdext.classes.Sky.mb_set_process_mode = MethodBind.get("Sky", "set_process_mode", 875986769L)
    Ptrcall.callVoid1(gdext.classes.Sky.mb_set_process_mode, livePtr, mode)
  }

  /** Sky.get_process_mode */
  final def getProcessMode(): gdext.classes.Sky.ProcessMode = {
    if (gdext.classes.Sky.mb_get_process_mode == null) gdext.classes.Sky.mb_get_process_mode = MethodBind.get("Sky", "get_process_mode", 731245043L)
    gdext.classes.Sky.ProcessMode(Ptrcall.call0[Long](gdext.classes.Sky.mb_get_process_mode, livePtr))
  }

  /** Sky.set_material */
  final def setMaterial(material: Material): Unit = {
    if (gdext.classes.Sky.mb_set_material == null) gdext.classes.Sky.mb_set_material = MethodBind.get("Sky", "set_material", 2757459619L)
    Ptrcall.callVoid1(gdext.classes.Sky.mb_set_material, livePtr, Wrappers.handle(material))
  }

  /** Sky.get_material. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getMaterial(): Material = {
    if (gdext.classes.Sky.mb_get_material == null) gdext.classes.Sky.mb_get_material = MethodBind.get("Sky", "get_material", 5934680L)
    Wrappers.owned[Material](Ptrcall.call0[Long](gdext.classes.Sky.mb_get_material, livePtr))
  }

}

object Sky {
  private[classes] var mb_set_radiance_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_radiance_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_process_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_process_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_material: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_material: GDExtensionMethodBindPtr = null

  /** Godot enum `Sky.RadianceSize`. */
  opaque type RadianceSize <: Long = Long

  object RadianceSize {
    final val Size32: RadianceSize = 0L.asInstanceOf[RadianceSize]
    final val Size64: RadianceSize = 1L.asInstanceOf[RadianceSize]
    final val Size128: RadianceSize = 2L.asInstanceOf[RadianceSize]
    final val Size256: RadianceSize = 3L.asInstanceOf[RadianceSize]
    final val Size512: RadianceSize = 4L.asInstanceOf[RadianceSize]
    final val Size1024: RadianceSize = 5L.asInstanceOf[RadianceSize]
    final val Size2048: RadianceSize = 6L.asInstanceOf[RadianceSize]
    final val Max: RadianceSize = 7L.asInstanceOf[RadianceSize]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): RadianceSize = value.asInstanceOf[RadianceSize]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[RadianceSize] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L).asInstanceOf[scala.IArray[RadianceSize]]

    extension (self: RadianceSize)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Size32"
        case 1L => "Size64"
        case 2L => "Size128"
        case 3L => "Size256"
        case 4L => "Size512"
        case 5L => "Size1024"
        case 6L => "Size2048"
        case 7L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `Sky.ProcessMode`. */
  opaque type ProcessMode <: Long = Long

  object ProcessMode {
    final val Automatic: ProcessMode = 0L.asInstanceOf[ProcessMode]
    final val Quality: ProcessMode = 1L.asInstanceOf[ProcessMode]
    final val Incremental: ProcessMode = 2L.asInstanceOf[ProcessMode]
    final val Realtime: ProcessMode = 3L.asInstanceOf[ProcessMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ProcessMode = value.asInstanceOf[ProcessMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ProcessMode] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[ProcessMode]]

    extension (self: ProcessMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Automatic"
        case 1L => "Quality"
        case 2L => "Incremental"
        case 3L => "Realtime"
        case other => other.toString
      }
  }
}
