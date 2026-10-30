package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `EditorExportPlatform`, extends `RefCounted`. */
abstract class EditorExportPlatform extends RefCounted {
  override def godotClassName: String = "EditorExportPlatform"

  /** EditorExportPlatform.get_os_name */
  final def getOsName(): String = {
    if (gdext.classes.EditorExportPlatform.mb_get_os_name == null) gdext.classes.EditorExportPlatform.mb_get_os_name = MethodBind.get("EditorExportPlatform", "get_os_name", 201670096L)
    Ptrcall.call0[String](gdext.classes.EditorExportPlatform.mb_get_os_name, livePtr)
  }

  /** EditorExportPlatform.create_preset. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def createPreset(): EditorExportPreset = {
    if (gdext.classes.EditorExportPlatform.mb_create_preset == null) gdext.classes.EditorExportPlatform.mb_create_preset = MethodBind.get("EditorExportPlatform", "create_preset", 2572397818L)
    Wrappers.owned[EditorExportPreset](Ptrcall.call0[Long](gdext.classes.EditorExportPlatform.mb_create_preset, livePtr))
  }

  /** EditorExportPlatform.export_project */
  final def exportProject(preset: EditorExportPreset, debug: Boolean, path: String, flags: gdext.classes.EditorExportPlatform.DebugFlags = gdext.classes.EditorExportPlatform.DebugFlags(0L)): gdext.classes.Error = {
    if (gdext.classes.EditorExportPlatform.mb_export_project == null) gdext.classes.EditorExportPlatform.mb_export_project = MethodBind.get("EditorExportPlatform", "export_project", 3879521245L)
    gdext.classes.Error(Ptrcall.call4[GodotObject, Boolean, String, Long, Long](gdext.classes.EditorExportPlatform.mb_export_project, livePtr, Wrappers.handle(preset), debug, path, flags.asInstanceOf[Long]))
  }

  /** EditorExportPlatform.export_pack */
  final def exportPack(preset: EditorExportPreset, debug: Boolean, path: String, flags: gdext.classes.EditorExportPlatform.DebugFlags = gdext.classes.EditorExportPlatform.DebugFlags(0L)): gdext.classes.Error = {
    if (gdext.classes.EditorExportPlatform.mb_export_pack == null) gdext.classes.EditorExportPlatform.mb_export_pack = MethodBind.get("EditorExportPlatform", "export_pack", 3879521245L)
    gdext.classes.Error(Ptrcall.call4[GodotObject, Boolean, String, Long, Long](gdext.classes.EditorExportPlatform.mb_export_pack, livePtr, Wrappers.handle(preset), debug, path, flags.asInstanceOf[Long]))
  }

  /** EditorExportPlatform.export_zip */
  final def exportZip(preset: EditorExportPreset, debug: Boolean, path: String, flags: gdext.classes.EditorExportPlatform.DebugFlags = gdext.classes.EditorExportPlatform.DebugFlags(0L)): gdext.classes.Error = {
    if (gdext.classes.EditorExportPlatform.mb_export_zip == null) gdext.classes.EditorExportPlatform.mb_export_zip = MethodBind.get("EditorExportPlatform", "export_zip", 3879521245L)
    gdext.classes.Error(Ptrcall.call4[GodotObject, Boolean, String, Long, Long](gdext.classes.EditorExportPlatform.mb_export_zip, livePtr, Wrappers.handle(preset), debug, path, flags.asInstanceOf[Long]))
  }

  /** EditorExportPlatform.clear_messages */
  final def clearMessages(): Unit = {
    if (gdext.classes.EditorExportPlatform.mb_clear_messages == null) gdext.classes.EditorExportPlatform.mb_clear_messages = MethodBind.get("EditorExportPlatform", "clear_messages", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.EditorExportPlatform.mb_clear_messages, livePtr)
  }

  /** EditorExportPlatform.add_message */
  final def addMessage(`type`: gdext.classes.EditorExportPlatform.ExportMessageType, category: String, message: String): Unit = {
    if (gdext.classes.EditorExportPlatform.mb_add_message == null) gdext.classes.EditorExportPlatform.mb_add_message = MethodBind.get("EditorExportPlatform", "add_message", 782767225L)
    Ptrcall.callVoid3(gdext.classes.EditorExportPlatform.mb_add_message, livePtr, `type`, category, message)
  }

  /** EditorExportPlatform.get_message_count */
  final def getMessageCount(): Long = {
    if (gdext.classes.EditorExportPlatform.mb_get_message_count == null) gdext.classes.EditorExportPlatform.mb_get_message_count = MethodBind.get("EditorExportPlatform", "get_message_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.EditorExportPlatform.mb_get_message_count, livePtr)
  }

  /** EditorExportPlatform.get_message_type */
  final def getMessageType(index: Long): gdext.classes.EditorExportPlatform.ExportMessageType = {
    if (gdext.classes.EditorExportPlatform.mb_get_message_type == null) gdext.classes.EditorExportPlatform.mb_get_message_type = MethodBind.get("EditorExportPlatform", "get_message_type", 2667287293L)
    gdext.classes.EditorExportPlatform.ExportMessageType(Ptrcall.call1[Long, Long](gdext.classes.EditorExportPlatform.mb_get_message_type, livePtr, index))
  }

  /** EditorExportPlatform.get_message_category */
  final def getMessageCategory(index: Long): String = {
    if (gdext.classes.EditorExportPlatform.mb_get_message_category == null) gdext.classes.EditorExportPlatform.mb_get_message_category = MethodBind.get("EditorExportPlatform", "get_message_category", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.EditorExportPlatform.mb_get_message_category, livePtr, index)
  }

  /** EditorExportPlatform.get_message_text */
  final def getMessageText(index: Long): String = {
    if (gdext.classes.EditorExportPlatform.mb_get_message_text == null) gdext.classes.EditorExportPlatform.mb_get_message_text = MethodBind.get("EditorExportPlatform", "get_message_text", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.EditorExportPlatform.mb_get_message_text, livePtr, index)
  }

  /** EditorExportPlatform.get_worst_message_type */
  final def getWorstMessageType(): gdext.classes.EditorExportPlatform.ExportMessageType = {
    if (gdext.classes.EditorExportPlatform.mb_get_worst_message_type == null) gdext.classes.EditorExportPlatform.mb_get_worst_message_type = MethodBind.get("EditorExportPlatform", "get_worst_message_type", 2580557466L)
    gdext.classes.EditorExportPlatform.ExportMessageType(Ptrcall.call0[Long](gdext.classes.EditorExportPlatform.mb_get_worst_message_type, livePtr))
  }

}

object EditorExportPlatform {
  private[classes] var mb_get_os_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_create_preset: GDExtensionMethodBindPtr = null
  private[classes] var mb_export_project: GDExtensionMethodBindPtr = null
  private[classes] var mb_export_pack: GDExtensionMethodBindPtr = null
  private[classes] var mb_export_zip: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_messages: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_message: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_message_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_message_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_message_category: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_message_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_worst_message_type: GDExtensionMethodBindPtr = null

  /** Godot enum `EditorExportPlatform.ExportMessageType`. */
  opaque type ExportMessageType <: Long = Long

  object ExportMessageType {
    final val None: ExportMessageType = 0L.asInstanceOf[ExportMessageType]
    final val Info: ExportMessageType = 1L.asInstanceOf[ExportMessageType]
    final val Warning: ExportMessageType = 2L.asInstanceOf[ExportMessageType]
    final val Error: ExportMessageType = 3L.asInstanceOf[ExportMessageType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ExportMessageType = value.asInstanceOf[ExportMessageType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ExportMessageType] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[ExportMessageType]]

    extension (self: ExportMessageType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "None"
        case 1L => "Info"
        case 2L => "Warning"
        case 3L => "Error"
        case other => other.toString
      }
  }

  /** Godot bitfield `EditorExportPlatform.DebugFlags`. */
  opaque type DebugFlags = Long

  object DebugFlags {
    final val DumbClient: DebugFlags = 1L.asInstanceOf[DebugFlags]
    final val RemoteDebug: DebugFlags = 2L.asInstanceOf[DebugFlags]
    final val RemoteDebugLocalhost: DebugFlags = 4L.asInstanceOf[DebugFlags]
    final val ViewCollisions: DebugFlags = 8L.asInstanceOf[DebugFlags]
    final val ViewNavigation: DebugFlags = 16L.asInstanceOf[DebugFlags]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): DebugFlags = value.asInstanceOf[DebugFlags]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[DebugFlags] = scala.IArray[Long](1L, 2L, 4L, 8L, 16L).asInstanceOf[scala.IArray[DebugFlags]]

    extension (self: DebugFlags)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 1L => "DumbClient"
        case 2L => "RemoteDebug"
        case 4L => "RemoteDebugLocalhost"
        case 8L => "ViewCollisions"
        case 16L => "ViewNavigation"
        case other => other.toString
      }
    extension (self: DebugFlags) {
      inline def value: Long = self.asInstanceOf[Long]
      inline def |(other: DebugFlags): DebugFlags = (self.value | other.value).asInstanceOf[DebugFlags]
      inline def &(other: DebugFlags): DebugFlags = (self.value & other.value).asInstanceOf[DebugFlags]
      /** Every bit of `flag` is set. */
      inline def has(flag: DebugFlags): Boolean = (self.value & flag.value) == flag.value
    }
  }
}
