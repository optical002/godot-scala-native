package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorExportPlatform`, extends `RefCounted`. */
abstract class EditorExportPlatform extends RefCounted {

  /** EditorExportPlatform.get_os_name */
  final def getOsName(): String =
    Ptrcall.call0[String](MethodBind.get("EditorExportPlatform", "get_os_name", 201670096L), hostObject.objectPtr)

  /** EditorExportPlatform.create_preset */
  final def createPreset(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("EditorExportPlatform", "create_preset", 2572397818L), hostObject.objectPtr)

  /** EditorExportPlatform.export_project */
  final def exportProject(preset: EditorExportPreset, debug: Boolean, path: String, flags: Long): Long =
    Ptrcall.call4[GodotObject, Boolean, String, Long, Long](MethodBind.get("EditorExportPlatform", "export_project", 3879521245L), hostObject.objectPtr, preset.hostObject, debug, path, flags)

  /** EditorExportPlatform.export_pack */
  final def exportPack(preset: EditorExportPreset, debug: Boolean, path: String, flags: Long): Long =
    Ptrcall.call4[GodotObject, Boolean, String, Long, Long](MethodBind.get("EditorExportPlatform", "export_pack", 3879521245L), hostObject.objectPtr, preset.hostObject, debug, path, flags)

  /** EditorExportPlatform.export_zip */
  final def exportZip(preset: EditorExportPreset, debug: Boolean, path: String, flags: Long): Long =
    Ptrcall.call4[GodotObject, Boolean, String, Long, Long](MethodBind.get("EditorExportPlatform", "export_zip", 3879521245L), hostObject.objectPtr, preset.hostObject, debug, path, flags)

  /** EditorExportPlatform.clear_messages */
  final def clearMessages(): Unit =
    Ptrcall.callVoid0(MethodBind.get("EditorExportPlatform", "clear_messages", 3218959716L), hostObject.objectPtr)

  /** EditorExportPlatform.add_message */
  final def addMessage(`type`: Long, category: String, message: String): Unit =
    Ptrcall.callVoid3(MethodBind.get("EditorExportPlatform", "add_message", 782767225L), hostObject.objectPtr, `type`, category, message)

  /** EditorExportPlatform.get_message_count */
  final def getMessageCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("EditorExportPlatform", "get_message_count", 3905245786L), hostObject.objectPtr)

  /** EditorExportPlatform.get_message_type */
  final def getMessageType(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("EditorExportPlatform", "get_message_type", 2667287293L), hostObject.objectPtr, index)

  /** EditorExportPlatform.get_message_category */
  final def getMessageCategory(index: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("EditorExportPlatform", "get_message_category", 844755477L), hostObject.objectPtr, index)

  /** EditorExportPlatform.get_message_text */
  final def getMessageText(index: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("EditorExportPlatform", "get_message_text", 844755477L), hostObject.objectPtr, index)

  /** EditorExportPlatform.get_worst_message_type */
  final def getWorstMessageType(): Long =
    Ptrcall.call0[Long](MethodBind.get("EditorExportPlatform", "get_worst_message_type", 2580557466L), hostObject.objectPtr)

}

object EditorExportPlatform {
  /** Class metadata for Gd[EditorExportPlatform] lifetime management and casting. */
  given GodotClass[EditorExportPlatform] with {
    def className = "EditorExportPlatform"
    def isRefCounted = true
    def wrap(o: GodotObject): EditorExportPlatform = new EditorExportPlatform {}.withHost(o.objectPtr)
    def unwrap(t: EditorExportPlatform): GodotObject = t.hostObject
  }
}
