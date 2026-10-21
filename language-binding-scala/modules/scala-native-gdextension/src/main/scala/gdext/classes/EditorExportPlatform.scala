package gdext.classes

import gdext.Godot
import gdext.builtin.*
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
  final def exportProject(preset: EditorExportPreset, debug: Boolean, path: String, flags: Long): Long = {
    if (gdext.classes.EditorExportPlatform.mb_export_project == null) gdext.classes.EditorExportPlatform.mb_export_project = MethodBind.get("EditorExportPlatform", "export_project", 3879521245L)
    Ptrcall.call4[GodotObject, Boolean, String, Long, Long](gdext.classes.EditorExportPlatform.mb_export_project, livePtr, Wrappers.handle(preset), debug, path, flags)
  }

  /** EditorExportPlatform.export_pack */
  final def exportPack(preset: EditorExportPreset, debug: Boolean, path: String, flags: Long): Long = {
    if (gdext.classes.EditorExportPlatform.mb_export_pack == null) gdext.classes.EditorExportPlatform.mb_export_pack = MethodBind.get("EditorExportPlatform", "export_pack", 3879521245L)
    Ptrcall.call4[GodotObject, Boolean, String, Long, Long](gdext.classes.EditorExportPlatform.mb_export_pack, livePtr, Wrappers.handle(preset), debug, path, flags)
  }

  /** EditorExportPlatform.export_zip */
  final def exportZip(preset: EditorExportPreset, debug: Boolean, path: String, flags: Long): Long = {
    if (gdext.classes.EditorExportPlatform.mb_export_zip == null) gdext.classes.EditorExportPlatform.mb_export_zip = MethodBind.get("EditorExportPlatform", "export_zip", 3879521245L)
    Ptrcall.call4[GodotObject, Boolean, String, Long, Long](gdext.classes.EditorExportPlatform.mb_export_zip, livePtr, Wrappers.handle(preset), debug, path, flags)
  }

  /** EditorExportPlatform.clear_messages */
  final def clearMessages(): Unit = {
    if (gdext.classes.EditorExportPlatform.mb_clear_messages == null) gdext.classes.EditorExportPlatform.mb_clear_messages = MethodBind.get("EditorExportPlatform", "clear_messages", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.EditorExportPlatform.mb_clear_messages, livePtr)
  }

  /** EditorExportPlatform.add_message */
  final def addMessage(`type`: Long, category: String, message: String): Unit = {
    if (gdext.classes.EditorExportPlatform.mb_add_message == null) gdext.classes.EditorExportPlatform.mb_add_message = MethodBind.get("EditorExportPlatform", "add_message", 782767225L)
    Ptrcall.callVoid3(gdext.classes.EditorExportPlatform.mb_add_message, livePtr, `type`, category, message)
  }

  /** EditorExportPlatform.get_message_count */
  final def getMessageCount(): Long = {
    if (gdext.classes.EditorExportPlatform.mb_get_message_count == null) gdext.classes.EditorExportPlatform.mb_get_message_count = MethodBind.get("EditorExportPlatform", "get_message_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.EditorExportPlatform.mb_get_message_count, livePtr)
  }

  /** EditorExportPlatform.get_message_type */
  final def getMessageType(index: Long): Long = {
    if (gdext.classes.EditorExportPlatform.mb_get_message_type == null) gdext.classes.EditorExportPlatform.mb_get_message_type = MethodBind.get("EditorExportPlatform", "get_message_type", 2667287293L)
    Ptrcall.call1[Long, Long](gdext.classes.EditorExportPlatform.mb_get_message_type, livePtr, index)
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
  final def getWorstMessageType(): Long = {
    if (gdext.classes.EditorExportPlatform.mb_get_worst_message_type == null) gdext.classes.EditorExportPlatform.mb_get_worst_message_type = MethodBind.get("EditorExportPlatform", "get_worst_message_type", 2580557466L)
    Ptrcall.call0[Long](gdext.classes.EditorExportPlatform.mb_get_worst_message_type, livePtr)
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
}
