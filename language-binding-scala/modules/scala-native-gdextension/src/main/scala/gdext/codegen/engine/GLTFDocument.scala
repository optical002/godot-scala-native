package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `GLTFDocument`, extends `Resource`. */
abstract class GLTFDocument extends Resource {

  /** GLTFDocument.set_image_format */
  final def setImageFormat(image_format: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFDocument", "set_image_format", 83702148L), hostObject.objectPtr, image_format)

  /** GLTFDocument.get_image_format */
  final def getImageFormat(): String =
    Ptrcall.call0[String](MethodBind.get("GLTFDocument", "get_image_format", 201670096L), hostObject.objectPtr)

  /** GLTFDocument.set_lossy_quality */
  final def setLossyQuality(lossy_quality: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFDocument", "set_lossy_quality", 373806689L), hostObject.objectPtr, lossy_quality)

  /** GLTFDocument.get_lossy_quality */
  final def getLossyQuality(): Double =
    Ptrcall.call0[Double](MethodBind.get("GLTFDocument", "get_lossy_quality", 1740695150L), hostObject.objectPtr)

  /** GLTFDocument.set_fallback_image_format */
  final def setFallbackImageFormat(fallback_image_format: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFDocument", "set_fallback_image_format", 83702148L), hostObject.objectPtr, fallback_image_format)

  /** GLTFDocument.get_fallback_image_format */
  final def getFallbackImageFormat(): String =
    Ptrcall.call0[String](MethodBind.get("GLTFDocument", "get_fallback_image_format", 201670096L), hostObject.objectPtr)

  /** GLTFDocument.set_fallback_image_quality */
  final def setFallbackImageQuality(fallback_image_quality: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFDocument", "set_fallback_image_quality", 373806689L), hostObject.objectPtr, fallback_image_quality)

  /** GLTFDocument.get_fallback_image_quality */
  final def getFallbackImageQuality(): Double =
    Ptrcall.call0[Double](MethodBind.get("GLTFDocument", "get_fallback_image_quality", 1740695150L), hostObject.objectPtr)

  /** GLTFDocument.set_root_node_mode */
  final def setRootNodeMode(root_node_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFDocument", "set_root_node_mode", 463633402L), hostObject.objectPtr, root_node_mode)

  /** GLTFDocument.get_root_node_mode */
  final def getRootNodeMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("GLTFDocument", "get_root_node_mode", 948057992L), hostObject.objectPtr)

  /** GLTFDocument.set_visibility_mode */
  final def setVisibilityMode(visibility_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFDocument", "set_visibility_mode", 2803579218L), hostObject.objectPtr, visibility_mode)

  /** GLTFDocument.get_visibility_mode */
  final def getVisibilityMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("GLTFDocument", "get_visibility_mode", 3885445962L), hostObject.objectPtr)

  /** GLTFDocument.append_from_file */
  final def appendFromFile(path: String, state: GLTFState, flags: Long, base_path: String): Long =
    Ptrcall.call4[String, GodotObject, Long, String, Long](MethodBind.get("GLTFDocument", "append_from_file", 866380864L), hostObject.objectPtr, path, state.hostObject, flags, base_path)

  /** GLTFDocument.append_from_scene */
  final def appendFromScene(node: Node, state: GLTFState, flags: Long): Long =
    Ptrcall.call3[GodotObject, GodotObject, Long, Long](MethodBind.get("GLTFDocument", "append_from_scene", 1622574258L), hostObject.objectPtr, node.hostObject, state.hostObject, flags)

  /** GLTFDocument.generate_scene */
  final def generateScene(state: GLTFState, bake_fps: Double, trimming: Boolean, remove_immutable_tracks: Boolean): GodotObject =
    Ptrcall.call4[GodotObject, Double, Boolean, Boolean, GodotObject](MethodBind.get("GLTFDocument", "generate_scene", 596118388L), hostObject.objectPtr, state.hostObject, bake_fps, trimming, remove_immutable_tracks)

  /** GLTFDocument.write_to_filesystem */
  final def writeToFilesystem(state: GLTFState, path: String): Long =
    Ptrcall.call2[GodotObject, String, Long](MethodBind.get("GLTFDocument", "write_to_filesystem", 1784551478L), hostObject.objectPtr, state.hostObject, path)

}

object GLTFDocument {
  /** Class metadata for Gd[GLTFDocument] lifetime management and casting. */
  given GodotClass[GLTFDocument] with {
    def className = "GLTFDocument"
    def isRefCounted = true
    def wrap(o: GodotObject): GLTFDocument = new GLTFDocument {}.withHost(o.objectPtr)
    def unwrap(t: GLTFDocument): GodotObject = t.hostObject
  }
}
