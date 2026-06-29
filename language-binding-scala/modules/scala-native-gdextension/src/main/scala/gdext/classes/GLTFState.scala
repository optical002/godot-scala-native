package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `GLTFState`, extends `Resource`. */
abstract class GLTFState extends Resource {
  override def godotClassName: String = "GLTFState"

  /** GLTFState.add_used_extension */
  final def addUsedExtension(extension_name: String, required: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("GLTFState", "add_used_extension", 2678287736L), hostObject.objectPtr, extension_name, required)

  /** GLTFState.append_gltf_node */
  final def appendGltfNode(gltf_node: GLTFNode, godot_scene_node: Node, parent_node_index: Long): Long =
    Ptrcall.call3[GodotObject, GodotObject, Long, Long](MethodBind.get("GLTFState", "append_gltf_node", 3562288551L), hostObject.objectPtr, gltf_node.hostObject, godot_scene_node.hostObject, parent_node_index)

  /** GLTFState.get_major_version */
  final def getMajorVersion(): Long =
    Ptrcall.call0[Long](MethodBind.get("GLTFState", "get_major_version", 3905245786L), hostObject.objectPtr)

  /** GLTFState.set_major_version */
  final def setMajorVersion(major_version: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFState", "set_major_version", 1286410249L), hostObject.objectPtr, major_version)

  /** GLTFState.get_minor_version */
  final def getMinorVersion(): Long =
    Ptrcall.call0[Long](MethodBind.get("GLTFState", "get_minor_version", 3905245786L), hostObject.objectPtr)

  /** GLTFState.set_minor_version */
  final def setMinorVersion(minor_version: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFState", "set_minor_version", 1286410249L), hostObject.objectPtr, minor_version)

  /** GLTFState.get_copyright */
  final def getCopyright(): String =
    Ptrcall.call0[String](MethodBind.get("GLTFState", "get_copyright", 201670096L), hostObject.objectPtr)

  /** GLTFState.set_copyright */
  final def setCopyright(copyright: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFState", "set_copyright", 83702148L), hostObject.objectPtr, copyright)

  /** GLTFState.get_use_named_skin_binds */
  final def getUseNamedSkinBinds(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("GLTFState", "get_use_named_skin_binds", 36873697L), hostObject.objectPtr)

  /** GLTFState.set_use_named_skin_binds */
  final def setUseNamedSkinBinds(use_named_skin_binds: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFState", "set_use_named_skin_binds", 2586408642L), hostObject.objectPtr, use_named_skin_binds)

  /** GLTFState.get_animation_players_count */
  final def getAnimationPlayersCount(anim_player_index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("GLTFState", "get_animation_players_count", 923996154L), hostObject.objectPtr, anim_player_index)

  /** GLTFState.get_animation_player */
  final def getAnimationPlayer(anim_player_index: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("GLTFState", "get_animation_player", 1550200483L), hostObject.objectPtr, anim_player_index)

  /** GLTFState.get_scene_name */
  final def getSceneName(): String =
    Ptrcall.call0[String](MethodBind.get("GLTFState", "get_scene_name", 201670096L), hostObject.objectPtr)

  /** GLTFState.set_scene_name */
  final def setSceneName(scene_name: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFState", "set_scene_name", 83702148L), hostObject.objectPtr, scene_name)

  /** GLTFState.get_base_path */
  final def getBasePath(): String =
    Ptrcall.call0[String](MethodBind.get("GLTFState", "get_base_path", 201670096L), hostObject.objectPtr)

  /** GLTFState.set_base_path */
  final def setBasePath(base_path: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFState", "set_base_path", 83702148L), hostObject.objectPtr, base_path)

  /** GLTFState.get_filename */
  final def getFilename(): String =
    Ptrcall.call0[String](MethodBind.get("GLTFState", "get_filename", 201670096L), hostObject.objectPtr)

  /** GLTFState.set_filename */
  final def setFilename(filename: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFState", "set_filename", 83702148L), hostObject.objectPtr, filename)

  /** GLTFState.get_create_animations */
  final def getCreateAnimations(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("GLTFState", "get_create_animations", 36873697L), hostObject.objectPtr)

  /** GLTFState.set_create_animations */
  final def setCreateAnimations(create_animations: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFState", "set_create_animations", 2586408642L), hostObject.objectPtr, create_animations)

  /** GLTFState.get_import_as_skeleton_bones */
  final def getImportAsSkeletonBones(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("GLTFState", "get_import_as_skeleton_bones", 36873697L), hostObject.objectPtr)

  /** GLTFState.set_import_as_skeleton_bones */
  final def setImportAsSkeletonBones(import_as_skeleton_bones: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFState", "set_import_as_skeleton_bones", 2586408642L), hostObject.objectPtr, import_as_skeleton_bones)

  /** GLTFState.get_scene_node */
  final def getSceneNode(gltf_node_index: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("GLTFState", "get_scene_node", 539202265L), hostObject.objectPtr, gltf_node_index)

  /** GLTFState.get_node_index */
  final def getNodeIndex(scene_node: Node): Long =
    Ptrcall.call1[GodotObject, Long](MethodBind.get("GLTFState", "get_node_index", 3810805390L), hostObject.objectPtr, scene_node.hostObject)

  /** GLTFState.get_handle_binary_image_mode */
  final def getHandleBinaryImageMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("GLTFState", "get_handle_binary_image_mode", 1363384196L), hostObject.objectPtr)

  /** GLTFState.set_handle_binary_image_mode */
  final def setHandleBinaryImageMode(method: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFState", "set_handle_binary_image_mode", 854676334L), hostObject.objectPtr, method)

  /** GLTFState.set_bake_fps */
  final def setBakeFps(value: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFState", "set_bake_fps", 373806689L), hostObject.objectPtr, value)

  /** GLTFState.get_bake_fps */
  final def getBakeFps(): Double =
    Ptrcall.call0[Double](MethodBind.get("GLTFState", "get_bake_fps", 1740695150L), hostObject.objectPtr)

  /** GLTFState.get_handle_binary_image */
  final def getHandleBinaryImage(): Long =
    Ptrcall.call0[Long](MethodBind.get("GLTFState", "get_handle_binary_image", 3905245786L), hostObject.objectPtr)

  /** GLTFState.set_handle_binary_image */
  final def setHandleBinaryImage(method: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFState", "set_handle_binary_image", 1286410249L), hostObject.objectPtr, method)

}
