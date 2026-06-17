package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorExportPlatformExtension`, extends `EditorExportPlatform`. */
abstract class EditorExportPlatformExtension extends EditorExportPlatform {

  /** EditorExportPlatformExtension.set_config_error */
  final def setConfigError(error_text: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorExportPlatformExtension", "set_config_error", 3089850668L), hostObject.objectPtr, error_text)

  /** EditorExportPlatformExtension.get_config_error */
  final def getConfigError(): String =
    Ptrcall.call0[String](MethodBind.get("EditorExportPlatformExtension", "get_config_error", 201670096L), hostObject.objectPtr)

  /** EditorExportPlatformExtension.set_config_missing_templates */
  final def setConfigMissingTemplates(missing_templates: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorExportPlatformExtension", "set_config_missing_templates", 1695273946L), hostObject.objectPtr, missing_templates)

  /** EditorExportPlatformExtension.get_config_missing_templates */
  final def getConfigMissingTemplates(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("EditorExportPlatformExtension", "get_config_missing_templates", 36873697L), hostObject.objectPtr)

}

object EditorExportPlatformExtension {
  /** Class metadata for Gd[EditorExportPlatformExtension] lifetime management and casting. */
  given GodotClass[EditorExportPlatformExtension] with {
    def className = "EditorExportPlatformExtension"
    def isRefCounted = true
    def wrap(o: GodotObject): EditorExportPlatformExtension = new EditorExportPlatformExtension {}.withHost(o.objectPtr)
    def unwrap(t: EditorExportPlatformExtension): GodotObject = t.hostObject
  }
}
