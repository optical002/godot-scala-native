package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `GLTFDocument`, extends `Resource`. */
abstract class GLTFDocument extends Resource {
  override def godotClassName: String = "GLTFDocument"

  /** GLTFDocument.set_image_format */
  final def setImageFormat(imageFormat: String): Unit = {
    if (gdext.classes.GLTFDocument.mb_set_image_format == null) gdext.classes.GLTFDocument.mb_set_image_format = MethodBind.get("GLTFDocument", "set_image_format", 83702148L)
    Ptrcall.callVoid1(gdext.classes.GLTFDocument.mb_set_image_format, livePtr, imageFormat)
  }

  /** GLTFDocument.get_image_format */
  final def getImageFormat(): String = {
    if (gdext.classes.GLTFDocument.mb_get_image_format == null) gdext.classes.GLTFDocument.mb_get_image_format = MethodBind.get("GLTFDocument", "get_image_format", 201670096L)
    Ptrcall.call0[String](gdext.classes.GLTFDocument.mb_get_image_format, livePtr)
  }

  /** GLTFDocument.set_lossy_quality */
  final def setLossyQuality(lossyQuality: Double): Unit = {
    if (gdext.classes.GLTFDocument.mb_set_lossy_quality == null) gdext.classes.GLTFDocument.mb_set_lossy_quality = MethodBind.get("GLTFDocument", "set_lossy_quality", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GLTFDocument.mb_set_lossy_quality, livePtr, lossyQuality)
  }

  /** GLTFDocument.get_lossy_quality */
  final def getLossyQuality(): Double = {
    if (gdext.classes.GLTFDocument.mb_get_lossy_quality == null) gdext.classes.GLTFDocument.mb_get_lossy_quality = MethodBind.get("GLTFDocument", "get_lossy_quality", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.GLTFDocument.mb_get_lossy_quality, livePtr)
  }

  /** GLTFDocument.set_fallback_image_format */
  final def setFallbackImageFormat(fallbackImageFormat: String): Unit = {
    if (gdext.classes.GLTFDocument.mb_set_fallback_image_format == null) gdext.classes.GLTFDocument.mb_set_fallback_image_format = MethodBind.get("GLTFDocument", "set_fallback_image_format", 83702148L)
    Ptrcall.callVoid1(gdext.classes.GLTFDocument.mb_set_fallback_image_format, livePtr, fallbackImageFormat)
  }

  /** GLTFDocument.get_fallback_image_format */
  final def getFallbackImageFormat(): String = {
    if (gdext.classes.GLTFDocument.mb_get_fallback_image_format == null) gdext.classes.GLTFDocument.mb_get_fallback_image_format = MethodBind.get("GLTFDocument", "get_fallback_image_format", 201670096L)
    Ptrcall.call0[String](gdext.classes.GLTFDocument.mb_get_fallback_image_format, livePtr)
  }

  /** GLTFDocument.set_fallback_image_quality */
  final def setFallbackImageQuality(fallbackImageQuality: Double): Unit = {
    if (gdext.classes.GLTFDocument.mb_set_fallback_image_quality == null) gdext.classes.GLTFDocument.mb_set_fallback_image_quality = MethodBind.get("GLTFDocument", "set_fallback_image_quality", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GLTFDocument.mb_set_fallback_image_quality, livePtr, fallbackImageQuality)
  }

  /** GLTFDocument.get_fallback_image_quality */
  final def getFallbackImageQuality(): Double = {
    if (gdext.classes.GLTFDocument.mb_get_fallback_image_quality == null) gdext.classes.GLTFDocument.mb_get_fallback_image_quality = MethodBind.get("GLTFDocument", "get_fallback_image_quality", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.GLTFDocument.mb_get_fallback_image_quality, livePtr)
  }

  /** GLTFDocument.set_root_node_mode */
  final def setRootNodeMode(rootNodeMode: gdext.classes.GLTFDocument.RootNodeMode): Unit = {
    if (gdext.classes.GLTFDocument.mb_set_root_node_mode == null) gdext.classes.GLTFDocument.mb_set_root_node_mode = MethodBind.get("GLTFDocument", "set_root_node_mode", 463633402L)
    Ptrcall.callVoid1(gdext.classes.GLTFDocument.mb_set_root_node_mode, livePtr, rootNodeMode)
  }

  /** GLTFDocument.get_root_node_mode */
  final def getRootNodeMode(): gdext.classes.GLTFDocument.RootNodeMode = {
    if (gdext.classes.GLTFDocument.mb_get_root_node_mode == null) gdext.classes.GLTFDocument.mb_get_root_node_mode = MethodBind.get("GLTFDocument", "get_root_node_mode", 948057992L)
    gdext.classes.GLTFDocument.RootNodeMode(Ptrcall.call0[Long](gdext.classes.GLTFDocument.mb_get_root_node_mode, livePtr))
  }

  /** GLTFDocument.set_visibility_mode */
  final def setVisibilityMode(visibilityMode: gdext.classes.GLTFDocument.VisibilityMode): Unit = {
    if (gdext.classes.GLTFDocument.mb_set_visibility_mode == null) gdext.classes.GLTFDocument.mb_set_visibility_mode = MethodBind.get("GLTFDocument", "set_visibility_mode", 2803579218L)
    Ptrcall.callVoid1(gdext.classes.GLTFDocument.mb_set_visibility_mode, livePtr, visibilityMode)
  }

  /** GLTFDocument.get_visibility_mode */
  final def getVisibilityMode(): gdext.classes.GLTFDocument.VisibilityMode = {
    if (gdext.classes.GLTFDocument.mb_get_visibility_mode == null) gdext.classes.GLTFDocument.mb_get_visibility_mode = MethodBind.get("GLTFDocument", "get_visibility_mode", 3885445962L)
    gdext.classes.GLTFDocument.VisibilityMode(Ptrcall.call0[Long](gdext.classes.GLTFDocument.mb_get_visibility_mode, livePtr))
  }

  /** GLTFDocument.append_from_file */
  final def appendFromFile(path: String, state: GLTFState, flags: Long = 0L, basePath: String = ""): gdext.classes.Error = {
    if (gdext.classes.GLTFDocument.mb_append_from_file == null) gdext.classes.GLTFDocument.mb_append_from_file = MethodBind.get("GLTFDocument", "append_from_file", 866380864L)
    gdext.classes.Error(Ptrcall.call4[String, GodotObject, Long, String, Long](gdext.classes.GLTFDocument.mb_append_from_file, livePtr, path, Wrappers.handle(state), flags, basePath))
  }

  /** GLTFDocument.append_from_scene */
  final def appendFromScene(node: Node, state: GLTFState, flags: Long = 0L): gdext.classes.Error = {
    if (gdext.classes.GLTFDocument.mb_append_from_scene == null) gdext.classes.GLTFDocument.mb_append_from_scene = MethodBind.get("GLTFDocument", "append_from_scene", 1622574258L)
    gdext.classes.Error(Ptrcall.call3[GodotObject, GodotObject, Long, Long](gdext.classes.GLTFDocument.mb_append_from_scene, livePtr, Wrappers.handle(node), Wrappers.handle(state), flags))
  }

  /** GLTFDocument.generate_scene */
  final def generateScene(state: GLTFState, bakeFps: Double = 30.0, trimming: Boolean = false, removeImmutableTracks: Boolean = true): Node = {
    if (gdext.classes.GLTFDocument.mb_generate_scene == null) gdext.classes.GLTFDocument.mb_generate_scene = MethodBind.get("GLTFDocument", "generate_scene", 596118388L)
    Wrappers.borrowed[Node](Ptrcall.call4[GodotObject, Double, Boolean, Boolean, Long](gdext.classes.GLTFDocument.mb_generate_scene, livePtr, Wrappers.handle(state), bakeFps, trimming, removeImmutableTracks))
  }

  /** GLTFDocument.write_to_filesystem */
  final def writeToFilesystem(state: GLTFState, path: String): gdext.classes.Error = {
    if (gdext.classes.GLTFDocument.mb_write_to_filesystem == null) gdext.classes.GLTFDocument.mb_write_to_filesystem = MethodBind.get("GLTFDocument", "write_to_filesystem", 1784551478L)
    gdext.classes.Error(Ptrcall.call2[GodotObject, String, Long](gdext.classes.GLTFDocument.mb_write_to_filesystem, livePtr, Wrappers.handle(state), path))
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
  final def importObjectModelProperty(state: GLTFState, jsonPointer: String): GLTFObjectModelProperty = {
    if (gdext.classes.GLTFDocument.mb_import_object_model_property == null) gdext.classes.GLTFDocument.mb_import_object_model_property = MethodBind.get("GLTFDocument", "import_object_model_property", 1206708632L)
    Wrappers.owned[GLTFObjectModelProperty](Ptrcall.call2[GodotObject, String, Long](gdext.classes.GLTFDocument.mb_import_object_model_property, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], Wrappers.handle(state), jsonPointer))
  }

  /** GLTFDocument.register_gltf_document_extension */
  final def registerGltfDocumentExtension(extension: GLTFDocumentExtension, firstPriority: Boolean = false): Unit = {
    if (gdext.classes.GLTFDocument.mb_register_gltf_document_extension == null) gdext.classes.GLTFDocument.mb_register_gltf_document_extension = MethodBind.get("GLTFDocument", "register_gltf_document_extension", 3752678331L)
    Ptrcall.callVoid2(gdext.classes.GLTFDocument.mb_register_gltf_document_extension, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], Wrappers.handle(extension), firstPriority)
  }

  /** GLTFDocument.unregister_gltf_document_extension */
  final def unregisterGltfDocumentExtension(extension: GLTFDocumentExtension): Unit = {
    if (gdext.classes.GLTFDocument.mb_unregister_gltf_document_extension == null) gdext.classes.GLTFDocument.mb_unregister_gltf_document_extension = MethodBind.get("GLTFDocument", "unregister_gltf_document_extension", 2684415758L)
    Ptrcall.callVoid1(gdext.classes.GLTFDocument.mb_unregister_gltf_document_extension, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], Wrappers.handle(extension))
  }

  /** Godot enum `GLTFDocument.RootNodeMode`. */
  opaque type RootNodeMode <: Long = Long

  object RootNodeMode {
    final val SingleRoot: RootNodeMode = 0L.asInstanceOf[RootNodeMode]
    final val KeepRoot: RootNodeMode = 1L.asInstanceOf[RootNodeMode]
    final val MultiRoot: RootNodeMode = 2L.asInstanceOf[RootNodeMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): RootNodeMode = value.asInstanceOf[RootNodeMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[RootNodeMode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[RootNodeMode]]

    extension (self: RootNodeMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "SingleRoot"
        case 1L => "KeepRoot"
        case 2L => "MultiRoot"
        case other => other.toString
      }
  }

  /** Godot enum `GLTFDocument.VisibilityMode`. */
  opaque type VisibilityMode <: Long = Long

  object VisibilityMode {
    final val IncludeRequired: VisibilityMode = 0L.asInstanceOf[VisibilityMode]
    final val IncludeOptional: VisibilityMode = 1L.asInstanceOf[VisibilityMode]
    final val Exclude: VisibilityMode = 2L.asInstanceOf[VisibilityMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): VisibilityMode = value.asInstanceOf[VisibilityMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[VisibilityMode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[VisibilityMode]]

    extension (self: VisibilityMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "IncludeRequired"
        case 1L => "IncludeOptional"
        case 2L => "Exclude"
        case other => other.toString
      }
  }
}
