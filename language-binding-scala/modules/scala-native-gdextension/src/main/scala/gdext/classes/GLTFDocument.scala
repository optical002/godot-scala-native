package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `GLTFDocument`, extends `Resource`. */
abstract class GLTFDocument extends Resource {
  override def godotClassName: String = "GLTFDocument"

  /** GLTFDocument.set_image_format */
  final def setImageFormat(image_format: String): Unit = {
    if (gdext.classes.GLTFDocument.mb_set_image_format == null) gdext.classes.GLTFDocument.mb_set_image_format = MethodBind.get("GLTFDocument", "set_image_format", 83702148L)
    Ptrcall.callVoid1(gdext.classes.GLTFDocument.mb_set_image_format, livePtr, image_format)
  }

  /** GLTFDocument.get_image_format */
  final def getImageFormat(): String = {
    if (gdext.classes.GLTFDocument.mb_get_image_format == null) gdext.classes.GLTFDocument.mb_get_image_format = MethodBind.get("GLTFDocument", "get_image_format", 201670096L)
    Ptrcall.call0[String](gdext.classes.GLTFDocument.mb_get_image_format, livePtr)
  }

  /** GLTFDocument.set_lossy_quality */
  final def setLossyQuality(lossy_quality: Double): Unit = {
    if (gdext.classes.GLTFDocument.mb_set_lossy_quality == null) gdext.classes.GLTFDocument.mb_set_lossy_quality = MethodBind.get("GLTFDocument", "set_lossy_quality", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GLTFDocument.mb_set_lossy_quality, livePtr, lossy_quality)
  }

  /** GLTFDocument.get_lossy_quality */
  final def getLossyQuality(): Double = {
    if (gdext.classes.GLTFDocument.mb_get_lossy_quality == null) gdext.classes.GLTFDocument.mb_get_lossy_quality = MethodBind.get("GLTFDocument", "get_lossy_quality", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.GLTFDocument.mb_get_lossy_quality, livePtr)
  }

  /** GLTFDocument.set_fallback_image_format */
  final def setFallbackImageFormat(fallback_image_format: String): Unit = {
    if (gdext.classes.GLTFDocument.mb_set_fallback_image_format == null) gdext.classes.GLTFDocument.mb_set_fallback_image_format = MethodBind.get("GLTFDocument", "set_fallback_image_format", 83702148L)
    Ptrcall.callVoid1(gdext.classes.GLTFDocument.mb_set_fallback_image_format, livePtr, fallback_image_format)
  }

  /** GLTFDocument.get_fallback_image_format */
  final def getFallbackImageFormat(): String = {
    if (gdext.classes.GLTFDocument.mb_get_fallback_image_format == null) gdext.classes.GLTFDocument.mb_get_fallback_image_format = MethodBind.get("GLTFDocument", "get_fallback_image_format", 201670096L)
    Ptrcall.call0[String](gdext.classes.GLTFDocument.mb_get_fallback_image_format, livePtr)
  }

  /** GLTFDocument.set_fallback_image_quality */
  final def setFallbackImageQuality(fallback_image_quality: Double): Unit = {
    if (gdext.classes.GLTFDocument.mb_set_fallback_image_quality == null) gdext.classes.GLTFDocument.mb_set_fallback_image_quality = MethodBind.get("GLTFDocument", "set_fallback_image_quality", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GLTFDocument.mb_set_fallback_image_quality, livePtr, fallback_image_quality)
  }

  /** GLTFDocument.get_fallback_image_quality */
  final def getFallbackImageQuality(): Double = {
    if (gdext.classes.GLTFDocument.mb_get_fallback_image_quality == null) gdext.classes.GLTFDocument.mb_get_fallback_image_quality = MethodBind.get("GLTFDocument", "get_fallback_image_quality", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.GLTFDocument.mb_get_fallback_image_quality, livePtr)
  }

  /** GLTFDocument.set_root_node_mode */
  final def setRootNodeMode(root_node_mode: Long): Unit = {
    if (gdext.classes.GLTFDocument.mb_set_root_node_mode == null) gdext.classes.GLTFDocument.mb_set_root_node_mode = MethodBind.get("GLTFDocument", "set_root_node_mode", 463633402L)
    Ptrcall.callVoid1(gdext.classes.GLTFDocument.mb_set_root_node_mode, livePtr, root_node_mode)
  }

  /** GLTFDocument.get_root_node_mode */
  final def getRootNodeMode(): Long = {
    if (gdext.classes.GLTFDocument.mb_get_root_node_mode == null) gdext.classes.GLTFDocument.mb_get_root_node_mode = MethodBind.get("GLTFDocument", "get_root_node_mode", 948057992L)
    Ptrcall.call0[Long](gdext.classes.GLTFDocument.mb_get_root_node_mode, livePtr)
  }

  /** GLTFDocument.set_visibility_mode */
  final def setVisibilityMode(visibility_mode: Long): Unit = {
    if (gdext.classes.GLTFDocument.mb_set_visibility_mode == null) gdext.classes.GLTFDocument.mb_set_visibility_mode = MethodBind.get("GLTFDocument", "set_visibility_mode", 2803579218L)
    Ptrcall.callVoid1(gdext.classes.GLTFDocument.mb_set_visibility_mode, livePtr, visibility_mode)
  }

  /** GLTFDocument.get_visibility_mode */
  final def getVisibilityMode(): Long = {
    if (gdext.classes.GLTFDocument.mb_get_visibility_mode == null) gdext.classes.GLTFDocument.mb_get_visibility_mode = MethodBind.get("GLTFDocument", "get_visibility_mode", 3885445962L)
    Ptrcall.call0[Long](gdext.classes.GLTFDocument.mb_get_visibility_mode, livePtr)
  }

  /** GLTFDocument.append_from_file */
  final def appendFromFile(path: String, state: GLTFState, flags: Long, base_path: String): Long = {
    if (gdext.classes.GLTFDocument.mb_append_from_file == null) gdext.classes.GLTFDocument.mb_append_from_file = MethodBind.get("GLTFDocument", "append_from_file", 866380864L)
    Ptrcall.call4[String, GodotObject, Long, String, Long](gdext.classes.GLTFDocument.mb_append_from_file, livePtr, path, Wrappers.handle(state), flags, base_path)
  }

  /** GLTFDocument.append_from_scene */
  final def appendFromScene(node: Node, state: GLTFState, flags: Long): Long = {
    if (gdext.classes.GLTFDocument.mb_append_from_scene == null) gdext.classes.GLTFDocument.mb_append_from_scene = MethodBind.get("GLTFDocument", "append_from_scene", 1622574258L)
    Ptrcall.call3[GodotObject, GodotObject, Long, Long](gdext.classes.GLTFDocument.mb_append_from_scene, livePtr, Wrappers.handle(node), Wrappers.handle(state), flags)
  }

  /** GLTFDocument.generate_scene */
  final def generateScene(state: GLTFState, bake_fps: Double, trimming: Boolean, remove_immutable_tracks: Boolean): Node = {
    if (gdext.classes.GLTFDocument.mb_generate_scene == null) gdext.classes.GLTFDocument.mb_generate_scene = MethodBind.get("GLTFDocument", "generate_scene", 596118388L)
    Wrappers.borrowed[Node](Ptrcall.call4[GodotObject, Double, Boolean, Boolean, Long](gdext.classes.GLTFDocument.mb_generate_scene, livePtr, Wrappers.handle(state), bake_fps, trimming, remove_immutable_tracks))
  }

  /** GLTFDocument.write_to_filesystem */
  final def writeToFilesystem(state: GLTFState, path: String): Long = {
    if (gdext.classes.GLTFDocument.mb_write_to_filesystem == null) gdext.classes.GLTFDocument.mb_write_to_filesystem = MethodBind.get("GLTFDocument", "write_to_filesystem", 1784551478L)
    Ptrcall.call2[GodotObject, String, Long](gdext.classes.GLTFDocument.mb_write_to_filesystem, livePtr, Wrappers.handle(state), path)
  }

}

object GLTFDocument {
  private[classes] var mb_set_image_format: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_image_format: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_lossy_quality: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_lossy_quality: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fallback_image_format: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fallback_image_format: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fallback_image_quality: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fallback_image_quality: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_root_node_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_root_node_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_visibility_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_visibility_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_append_from_file: GDExtensionMethodBindPtr = null
  private[classes] var mb_append_from_scene: GDExtensionMethodBindPtr = null
  private[classes] var mb_generate_scene: GDExtensionMethodBindPtr = null
  private[classes] var mb_write_to_filesystem: GDExtensionMethodBindPtr = null
  private[classes] var mb_import_object_model_property: GDExtensionMethodBindPtr = null
  private[classes] var mb_register_gltf_document_extension: GDExtensionMethodBindPtr = null
  private[classes] var mb_unregister_gltf_document_extension: GDExtensionMethodBindPtr = null

  /** GLTFDocument.import_object_model_property. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def importObjectModelProperty(state: GLTFState, json_pointer: String): GLTFObjectModelProperty = {
    if (gdext.classes.GLTFDocument.mb_import_object_model_property == null) gdext.classes.GLTFDocument.mb_import_object_model_property = MethodBind.get("GLTFDocument", "import_object_model_property", 1206708632L)
    Wrappers.owned[GLTFObjectModelProperty](Ptrcall.call2[GodotObject, String, Long](gdext.classes.GLTFDocument.mb_import_object_model_property, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], Wrappers.handle(state), json_pointer))
  }

  /** GLTFDocument.register_gltf_document_extension */
  final def registerGltfDocumentExtension(extension: GLTFDocumentExtension, first_priority: Boolean): Unit = {
    if (gdext.classes.GLTFDocument.mb_register_gltf_document_extension == null) gdext.classes.GLTFDocument.mb_register_gltf_document_extension = MethodBind.get("GLTFDocument", "register_gltf_document_extension", 3752678331L)
    Ptrcall.callVoid2(gdext.classes.GLTFDocument.mb_register_gltf_document_extension, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], Wrappers.handle(extension), first_priority)
  }

  /** GLTFDocument.unregister_gltf_document_extension */
  final def unregisterGltfDocumentExtension(extension: GLTFDocumentExtension): Unit = {
    if (gdext.classes.GLTFDocument.mb_unregister_gltf_document_extension == null) gdext.classes.GLTFDocument.mb_unregister_gltf_document_extension = MethodBind.get("GLTFDocument", "unregister_gltf_document_extension", 2684415758L)
    Ptrcall.callVoid1(gdext.classes.GLTFDocument.mb_unregister_gltf_document_extension, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], Wrappers.handle(extension))
  }
}
