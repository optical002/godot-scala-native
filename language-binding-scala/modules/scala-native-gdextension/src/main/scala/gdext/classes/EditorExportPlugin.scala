package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `EditorExportPlugin`, extends `RefCounted`. */
abstract class EditorExportPlugin extends RefCounted {
  override def godotClassName: String = "EditorExportPlugin"

  /** EditorExportPlugin.add_apple_embedded_platform_project_static_lib */
  final def addAppleEmbeddedPlatformProjectStaticLib(path: String): Unit = {
    if (gdext.classes.EditorExportPlugin.mb_add_apple_embedded_platform_project_static_lib == null) gdext.classes.EditorExportPlugin.mb_add_apple_embedded_platform_project_static_lib = MethodBind.get("EditorExportPlugin", "add_apple_embedded_platform_project_static_lib", 83702148L)
    Ptrcall.callVoid1(gdext.classes.EditorExportPlugin.mb_add_apple_embedded_platform_project_static_lib, livePtr, path)
  }

  /** EditorExportPlugin.add_apple_embedded_platform_framework */
  final def addAppleEmbeddedPlatformFramework(path: String): Unit = {
    if (gdext.classes.EditorExportPlugin.mb_add_apple_embedded_platform_framework == null) gdext.classes.EditorExportPlugin.mb_add_apple_embedded_platform_framework = MethodBind.get("EditorExportPlugin", "add_apple_embedded_platform_framework", 83702148L)
    Ptrcall.callVoid1(gdext.classes.EditorExportPlugin.mb_add_apple_embedded_platform_framework, livePtr, path)
  }

  /** EditorExportPlugin.add_apple_embedded_platform_embedded_framework */
  final def addAppleEmbeddedPlatformEmbeddedFramework(path: String): Unit = {
    if (gdext.classes.EditorExportPlugin.mb_add_apple_embedded_platform_embedded_framework == null) gdext.classes.EditorExportPlugin.mb_add_apple_embedded_platform_embedded_framework = MethodBind.get("EditorExportPlugin", "add_apple_embedded_platform_embedded_framework", 83702148L)
    Ptrcall.callVoid1(gdext.classes.EditorExportPlugin.mb_add_apple_embedded_platform_embedded_framework, livePtr, path)
  }

  /** EditorExportPlugin.add_apple_embedded_platform_plist_content */
  final def addAppleEmbeddedPlatformPlistContent(plistContent: String): Unit = {
    if (gdext.classes.EditorExportPlugin.mb_add_apple_embedded_platform_plist_content == null) gdext.classes.EditorExportPlugin.mb_add_apple_embedded_platform_plist_content = MethodBind.get("EditorExportPlugin", "add_apple_embedded_platform_plist_content", 83702148L)
    Ptrcall.callVoid1(gdext.classes.EditorExportPlugin.mb_add_apple_embedded_platform_plist_content, livePtr, plistContent)
  }

  /** EditorExportPlugin.add_apple_embedded_platform_linker_flags */
  final def addAppleEmbeddedPlatformLinkerFlags(flags: String): Unit = {
    if (gdext.classes.EditorExportPlugin.mb_add_apple_embedded_platform_linker_flags == null) gdext.classes.EditorExportPlugin.mb_add_apple_embedded_platform_linker_flags = MethodBind.get("EditorExportPlugin", "add_apple_embedded_platform_linker_flags", 83702148L)
    Ptrcall.callVoid1(gdext.classes.EditorExportPlugin.mb_add_apple_embedded_platform_linker_flags, livePtr, flags)
  }

  /** EditorExportPlugin.add_apple_embedded_platform_bundle_file */
  final def addAppleEmbeddedPlatformBundleFile(path: String): Unit = {
    if (gdext.classes.EditorExportPlugin.mb_add_apple_embedded_platform_bundle_file == null) gdext.classes.EditorExportPlugin.mb_add_apple_embedded_platform_bundle_file = MethodBind.get("EditorExportPlugin", "add_apple_embedded_platform_bundle_file", 83702148L)
    Ptrcall.callVoid1(gdext.classes.EditorExportPlugin.mb_add_apple_embedded_platform_bundle_file, livePtr, path)
  }

  /** EditorExportPlugin.add_apple_embedded_platform_cpp_code */
  final def addAppleEmbeddedPlatformCppCode(code: String): Unit = {
    if (gdext.classes.EditorExportPlugin.mb_add_apple_embedded_platform_cpp_code == null) gdext.classes.EditorExportPlugin.mb_add_apple_embedded_platform_cpp_code = MethodBind.get("EditorExportPlugin", "add_apple_embedded_platform_cpp_code", 83702148L)
    Ptrcall.callVoid1(gdext.classes.EditorExportPlugin.mb_add_apple_embedded_platform_cpp_code, livePtr, code)
  }

  /** EditorExportPlugin.add_ios_project_static_lib */
  final def addIosProjectStaticLib(path: String): Unit = {
    if (gdext.classes.EditorExportPlugin.mb_add_ios_project_static_lib == null) gdext.classes.EditorExportPlugin.mb_add_ios_project_static_lib = MethodBind.get("EditorExportPlugin", "add_ios_project_static_lib", 83702148L)
    Ptrcall.callVoid1(gdext.classes.EditorExportPlugin.mb_add_ios_project_static_lib, livePtr, path)
  }

  /** EditorExportPlugin.add_ios_framework */
  final def addIosFramework(path: String): Unit = {
    if (gdext.classes.EditorExportPlugin.mb_add_ios_framework == null) gdext.classes.EditorExportPlugin.mb_add_ios_framework = MethodBind.get("EditorExportPlugin", "add_ios_framework", 83702148L)
    Ptrcall.callVoid1(gdext.classes.EditorExportPlugin.mb_add_ios_framework, livePtr, path)
  }

  /** EditorExportPlugin.add_ios_embedded_framework */
  final def addIosEmbeddedFramework(path: String): Unit = {
    if (gdext.classes.EditorExportPlugin.mb_add_ios_embedded_framework == null) gdext.classes.EditorExportPlugin.mb_add_ios_embedded_framework = MethodBind.get("EditorExportPlugin", "add_ios_embedded_framework", 83702148L)
    Ptrcall.callVoid1(gdext.classes.EditorExportPlugin.mb_add_ios_embedded_framework, livePtr, path)
  }

  /** EditorExportPlugin.add_ios_plist_content */
  final def addIosPlistContent(plistContent: String): Unit = {
    if (gdext.classes.EditorExportPlugin.mb_add_ios_plist_content == null) gdext.classes.EditorExportPlugin.mb_add_ios_plist_content = MethodBind.get("EditorExportPlugin", "add_ios_plist_content", 83702148L)
    Ptrcall.callVoid1(gdext.classes.EditorExportPlugin.mb_add_ios_plist_content, livePtr, plistContent)
  }

  /** EditorExportPlugin.add_ios_linker_flags */
  final def addIosLinkerFlags(flags: String): Unit = {
    if (gdext.classes.EditorExportPlugin.mb_add_ios_linker_flags == null) gdext.classes.EditorExportPlugin.mb_add_ios_linker_flags = MethodBind.get("EditorExportPlugin", "add_ios_linker_flags", 83702148L)
    Ptrcall.callVoid1(gdext.classes.EditorExportPlugin.mb_add_ios_linker_flags, livePtr, flags)
  }

  /** EditorExportPlugin.add_ios_bundle_file */
  final def addIosBundleFile(path: String): Unit = {
    if (gdext.classes.EditorExportPlugin.mb_add_ios_bundle_file == null) gdext.classes.EditorExportPlugin.mb_add_ios_bundle_file = MethodBind.get("EditorExportPlugin", "add_ios_bundle_file", 83702148L)
    Ptrcall.callVoid1(gdext.classes.EditorExportPlugin.mb_add_ios_bundle_file, livePtr, path)
  }

  /** EditorExportPlugin.add_ios_cpp_code */
  final def addIosCppCode(code: String): Unit = {
    if (gdext.classes.EditorExportPlugin.mb_add_ios_cpp_code == null) gdext.classes.EditorExportPlugin.mb_add_ios_cpp_code = MethodBind.get("EditorExportPlugin", "add_ios_cpp_code", 83702148L)
    Ptrcall.callVoid1(gdext.classes.EditorExportPlugin.mb_add_ios_cpp_code, livePtr, code)
  }

  /** EditorExportPlugin.add_macos_plugin_file */
  final def addMacosPluginFile(path: String): Unit = {
    if (gdext.classes.EditorExportPlugin.mb_add_macos_plugin_file == null) gdext.classes.EditorExportPlugin.mb_add_macos_plugin_file = MethodBind.get("EditorExportPlugin", "add_macos_plugin_file", 83702148L)
    Ptrcall.callVoid1(gdext.classes.EditorExportPlugin.mb_add_macos_plugin_file, livePtr, path)
  }

  /** EditorExportPlugin.skip */
  final def skip(): Unit = {
    if (gdext.classes.EditorExportPlugin.mb_skip == null) gdext.classes.EditorExportPlugin.mb_skip = MethodBind.get("EditorExportPlugin", "skip", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.EditorExportPlugin.mb_skip, livePtr)
  }

  /** EditorExportPlugin.get_export_preset. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getExportPreset(): EditorExportPreset = {
    if (gdext.classes.EditorExportPlugin.mb_get_export_preset == null) gdext.classes.EditorExportPlugin.mb_get_export_preset = MethodBind.get("EditorExportPlugin", "get_export_preset", 1610607222L)
    Wrappers.owned[EditorExportPreset](Ptrcall.call0[Long](gdext.classes.EditorExportPlugin.mb_get_export_preset, livePtr))
  }

  /** EditorExportPlugin.get_export_platform. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getExportPlatform(): EditorExportPlatform = {
    if (gdext.classes.EditorExportPlugin.mb_get_export_platform == null) gdext.classes.EditorExportPlugin.mb_get_export_platform = MethodBind.get("EditorExportPlugin", "get_export_platform", 282254641L)
    Wrappers.owned[EditorExportPlatform](Ptrcall.call0[Long](gdext.classes.EditorExportPlugin.mb_get_export_platform, livePtr))
  }

}

object EditorExportPlugin {
  private[classes] var mb_add_apple_embedded_platform_project_static_lib: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_apple_embedded_platform_framework: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_apple_embedded_platform_embedded_framework: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_apple_embedded_platform_plist_content: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_apple_embedded_platform_linker_flags: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_apple_embedded_platform_bundle_file: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_apple_embedded_platform_cpp_code: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_ios_project_static_lib: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_ios_framework: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_ios_embedded_framework: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_ios_plist_content: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_ios_linker_flags: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_ios_bundle_file: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_ios_cpp_code: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_macos_plugin_file: GDExtensionMethodBindPtr = null
  private[classes] var mb_skip: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_export_preset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_export_platform: GDExtensionMethodBindPtr = null
}
