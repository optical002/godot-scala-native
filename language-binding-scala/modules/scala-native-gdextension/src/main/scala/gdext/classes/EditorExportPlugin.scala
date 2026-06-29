package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorExportPlugin`, extends `RefCounted`. */
abstract class EditorExportPlugin extends RefCounted {
  override def godotClassName: String = "EditorExportPlugin"

  /** EditorExportPlugin.add_apple_embedded_platform_project_static_lib */
  final def addAppleEmbeddedPlatformProjectStaticLib(path: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorExportPlugin", "add_apple_embedded_platform_project_static_lib", 83702148L), hostObject.objectPtr, path)

  /** EditorExportPlugin.add_apple_embedded_platform_framework */
  final def addAppleEmbeddedPlatformFramework(path: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorExportPlugin", "add_apple_embedded_platform_framework", 83702148L), hostObject.objectPtr, path)

  /** EditorExportPlugin.add_apple_embedded_platform_embedded_framework */
  final def addAppleEmbeddedPlatformEmbeddedFramework(path: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorExportPlugin", "add_apple_embedded_platform_embedded_framework", 83702148L), hostObject.objectPtr, path)

  /** EditorExportPlugin.add_apple_embedded_platform_plist_content */
  final def addAppleEmbeddedPlatformPlistContent(plist_content: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorExportPlugin", "add_apple_embedded_platform_plist_content", 83702148L), hostObject.objectPtr, plist_content)

  /** EditorExportPlugin.add_apple_embedded_platform_linker_flags */
  final def addAppleEmbeddedPlatformLinkerFlags(flags: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorExportPlugin", "add_apple_embedded_platform_linker_flags", 83702148L), hostObject.objectPtr, flags)

  /** EditorExportPlugin.add_apple_embedded_platform_bundle_file */
  final def addAppleEmbeddedPlatformBundleFile(path: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorExportPlugin", "add_apple_embedded_platform_bundle_file", 83702148L), hostObject.objectPtr, path)

  /** EditorExportPlugin.add_apple_embedded_platform_cpp_code */
  final def addAppleEmbeddedPlatformCppCode(code: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorExportPlugin", "add_apple_embedded_platform_cpp_code", 83702148L), hostObject.objectPtr, code)

  /** EditorExportPlugin.add_ios_project_static_lib */
  final def addIosProjectStaticLib(path: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorExportPlugin", "add_ios_project_static_lib", 83702148L), hostObject.objectPtr, path)

  /** EditorExportPlugin.add_ios_framework */
  final def addIosFramework(path: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorExportPlugin", "add_ios_framework", 83702148L), hostObject.objectPtr, path)

  /** EditorExportPlugin.add_ios_embedded_framework */
  final def addIosEmbeddedFramework(path: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorExportPlugin", "add_ios_embedded_framework", 83702148L), hostObject.objectPtr, path)

  /** EditorExportPlugin.add_ios_plist_content */
  final def addIosPlistContent(plist_content: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorExportPlugin", "add_ios_plist_content", 83702148L), hostObject.objectPtr, plist_content)

  /** EditorExportPlugin.add_ios_linker_flags */
  final def addIosLinkerFlags(flags: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorExportPlugin", "add_ios_linker_flags", 83702148L), hostObject.objectPtr, flags)

  /** EditorExportPlugin.add_ios_bundle_file */
  final def addIosBundleFile(path: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorExportPlugin", "add_ios_bundle_file", 83702148L), hostObject.objectPtr, path)

  /** EditorExportPlugin.add_ios_cpp_code */
  final def addIosCppCode(code: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorExportPlugin", "add_ios_cpp_code", 83702148L), hostObject.objectPtr, code)

  /** EditorExportPlugin.add_macos_plugin_file */
  final def addMacosPluginFile(path: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorExportPlugin", "add_macos_plugin_file", 83702148L), hostObject.objectPtr, path)

  /** EditorExportPlugin.skip */
  final def skip(): Unit =
    Ptrcall.callVoid0(MethodBind.get("EditorExportPlugin", "skip", 3218959716L), hostObject.objectPtr)

  /** EditorExportPlugin.get_export_preset */
  final def getExportPreset(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("EditorExportPlugin", "get_export_preset", 1610607222L), hostObject.objectPtr)

  /** EditorExportPlugin.get_export_platform */
  final def getExportPlatform(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("EditorExportPlugin", "get_export_platform", 282254641L), hostObject.objectPtr)

}
