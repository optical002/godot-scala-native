package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ResourceSaver`, extends `Object`. */
abstract class ResourceSaver extends Object {
  override def godotClassName: String = "ResourceSaver"

  /** ResourceSaver.save */
  final def save(resource: Resource, path: String = "", flags: gdext.classes.ResourceSaver.SaverFlags = gdext.classes.ResourceSaver.SaverFlags(0L)): gdext.classes.Error = {
    if (gdext.classes.ResourceSaver.mb_save == null) gdext.classes.ResourceSaver.mb_save = MethodBind.get("ResourceSaver", "save", 2983274697L)
    gdext.classes.Error(Ptrcall.call3[GodotObject, String, Long, Long](gdext.classes.ResourceSaver.mb_save, livePtr, Wrappers.handle(resource), path, flags.asInstanceOf[Long]))
  }

  /** ResourceSaver.set_uid */
  final def setUid(resource: String, uid: Long): gdext.classes.Error = {
    if (gdext.classes.ResourceSaver.mb_set_uid == null) gdext.classes.ResourceSaver.mb_set_uid = MethodBind.get("ResourceSaver", "set_uid", 993915709L)
    gdext.classes.Error(Ptrcall.call2[String, Long, Long](gdext.classes.ResourceSaver.mb_set_uid, livePtr, resource, uid))
  }

  /** ResourceSaver.add_resource_format_saver */
  final def addResourceFormatSaver(formatSaver: ResourceFormatSaver, atFront: Boolean = false): Unit = {
    if (gdext.classes.ResourceSaver.mb_add_resource_format_saver == null) gdext.classes.ResourceSaver.mb_add_resource_format_saver = MethodBind.get("ResourceSaver", "add_resource_format_saver", 362894272L)
    Ptrcall.callVoid2(gdext.classes.ResourceSaver.mb_add_resource_format_saver, livePtr, Wrappers.handle(formatSaver), atFront)
  }

  /** ResourceSaver.remove_resource_format_saver */
  final def removeResourceFormatSaver(formatSaver: ResourceFormatSaver): Unit = {
    if (gdext.classes.ResourceSaver.mb_remove_resource_format_saver == null) gdext.classes.ResourceSaver.mb_remove_resource_format_saver = MethodBind.get("ResourceSaver", "remove_resource_format_saver", 3373026878L)
    Ptrcall.callVoid1(gdext.classes.ResourceSaver.mb_remove_resource_format_saver, livePtr, Wrappers.handle(formatSaver))
  }

  /** ResourceSaver.get_resource_id_for_path */
  final def getResourceIdForPath(path: String, generate: Boolean = false): Long = {
    if (gdext.classes.ResourceSaver.mb_get_resource_id_for_path == null) gdext.classes.ResourceSaver.mb_get_resource_id_for_path = MethodBind.get("ResourceSaver", "get_resource_id_for_path", 150756522L)
    Ptrcall.call2[String, Boolean, Long](gdext.classes.ResourceSaver.mb_get_resource_id_for_path, livePtr, path, generate)
  }

}

object ResourceSaver {
  private[classes] var mb_save: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_uid: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_resource_format_saver: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_resource_format_saver: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_resource_id_for_path: GDExtensionMethodBindPtr = null

  private var instance: ResourceSaver = null

  /** The process-global ResourceSaver singleton instance. */
  def singleton: ResourceSaver = {
    if (instance == null)
      instance = Wrappers.borrowed[ResourceSaver](GodotObject.fromPtr(
        Godot.interface.global_get_singleton(StringNames.cached("ResourceSaver").ptr)))
    instance
  }

  /** Forwards to [[singleton]]: ResourceSaver.save */
  final def save(resource: Resource, path: String = "", flags: gdext.classes.ResourceSaver.SaverFlags = gdext.classes.ResourceSaver.SaverFlags(0L)): gdext.classes.Error =
    singleton.save(resource, path, flags)

  /** Forwards to [[singleton]]: ResourceSaver.set_uid */
  final def setUid(resource: String, uid: Long): gdext.classes.Error =
    singleton.setUid(resource, uid)

  /** Forwards to [[singleton]]: ResourceSaver.add_resource_format_saver */
  final def addResourceFormatSaver(formatSaver: ResourceFormatSaver, atFront: Boolean = false): Unit =
    singleton.addResourceFormatSaver(formatSaver, atFront)

  /** Forwards to [[singleton]]: ResourceSaver.remove_resource_format_saver */
  final def removeResourceFormatSaver(formatSaver: ResourceFormatSaver): Unit =
    singleton.removeResourceFormatSaver(formatSaver)

  /** Forwards to [[singleton]]: ResourceSaver.get_resource_id_for_path */
  final def getResourceIdForPath(path: String, generate: Boolean = false): Long =
    singleton.getResourceIdForPath(path, generate)

  /** Godot bitfield `ResourceSaver.SaverFlags`. */
  opaque type SaverFlags = Long

  object SaverFlags {
    final val None: SaverFlags = 0L.asInstanceOf[SaverFlags]
    final val RelativePaths: SaverFlags = 1L.asInstanceOf[SaverFlags]
    final val BundleResources: SaverFlags = 2L.asInstanceOf[SaverFlags]
    final val ChangePath: SaverFlags = 4L.asInstanceOf[SaverFlags]
    final val OmitEditorProperties: SaverFlags = 8L.asInstanceOf[SaverFlags]
    final val SaveBigEndian: SaverFlags = 16L.asInstanceOf[SaverFlags]
    final val Compress: SaverFlags = 32L.asInstanceOf[SaverFlags]
    final val ReplaceSubresourcePaths: SaverFlags = 64L.asInstanceOf[SaverFlags]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): SaverFlags = value.asInstanceOf[SaverFlags]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[SaverFlags] = scala.IArray[Long](0L, 1L, 2L, 4L, 8L, 16L, 32L, 64L).asInstanceOf[scala.IArray[SaverFlags]]

    extension (self: SaverFlags)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "None"
        case 1L => "RelativePaths"
        case 2L => "BundleResources"
        case 4L => "ChangePath"
        case 8L => "OmitEditorProperties"
        case 16L => "SaveBigEndian"
        case 32L => "Compress"
        case 64L => "ReplaceSubresourcePaths"
        case other => other.toString
      }
    extension (self: SaverFlags) {
      inline def value: Long = self.asInstanceOf[Long]
      inline def |(other: SaverFlags): SaverFlags = (self.value | other.value).asInstanceOf[SaverFlags]
      inline def &(other: SaverFlags): SaverFlags = (self.value & other.value).asInstanceOf[SaverFlags]
      /** Every bit of `flag` is set. */
      inline def has(flag: SaverFlags): Boolean = (self.value & flag.value) == flag.value
    }
  }
}
