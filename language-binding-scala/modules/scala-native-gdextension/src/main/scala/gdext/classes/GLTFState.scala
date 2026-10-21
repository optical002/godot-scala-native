package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `GLTFState`, extends `Resource`. */
abstract class GLTFState extends Resource {
  override def godotClassName: String = "GLTFState"

  /** GLTFState.add_used_extension */
  final def addUsedExtension(extension_name: String, required: Boolean): Unit = {
    if (gdext.classes.GLTFState.mb_add_used_extension == null) gdext.classes.GLTFState.mb_add_used_extension = MethodBind.get("GLTFState", "add_used_extension", 2678287736L)
    Ptrcall.callVoid2(gdext.classes.GLTFState.mb_add_used_extension, livePtr, extension_name, required)
  }

  /** GLTFState.append_gltf_node */
  final def appendGltfNode(gltf_node: GLTFNode, godot_scene_node: Node, parent_node_index: Long): Long = {
    if (gdext.classes.GLTFState.mb_append_gltf_node == null) gdext.classes.GLTFState.mb_append_gltf_node = MethodBind.get("GLTFState", "append_gltf_node", 3562288551L)
    Ptrcall.call3[GodotObject, GodotObject, Long, Long](gdext.classes.GLTFState.mb_append_gltf_node, livePtr, Wrappers.handle(gltf_node), Wrappers.handle(godot_scene_node), parent_node_index)
  }

  /** GLTFState.get_major_version */
  final def getMajorVersion(): Long = {
    if (gdext.classes.GLTFState.mb_get_major_version == null) gdext.classes.GLTFState.mb_get_major_version = MethodBind.get("GLTFState", "get_major_version", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.GLTFState.mb_get_major_version, livePtr)
  }

  /** GLTFState.set_major_version */
  final def setMajorVersion(major_version: Long): Unit = {
    if (gdext.classes.GLTFState.mb_set_major_version == null) gdext.classes.GLTFState.mb_set_major_version = MethodBind.get("GLTFState", "set_major_version", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GLTFState.mb_set_major_version, livePtr, major_version)
  }

  /** GLTFState.get_minor_version */
  final def getMinorVersion(): Long = {
    if (gdext.classes.GLTFState.mb_get_minor_version == null) gdext.classes.GLTFState.mb_get_minor_version = MethodBind.get("GLTFState", "get_minor_version", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.GLTFState.mb_get_minor_version, livePtr)
  }

  /** GLTFState.set_minor_version */
  final def setMinorVersion(minor_version: Long): Unit = {
    if (gdext.classes.GLTFState.mb_set_minor_version == null) gdext.classes.GLTFState.mb_set_minor_version = MethodBind.get("GLTFState", "set_minor_version", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GLTFState.mb_set_minor_version, livePtr, minor_version)
  }

  /** GLTFState.get_copyright */
  final def getCopyright(): String = {
    if (gdext.classes.GLTFState.mb_get_copyright == null) gdext.classes.GLTFState.mb_get_copyright = MethodBind.get("GLTFState", "get_copyright", 201670096L)
    Ptrcall.call0[String](gdext.classes.GLTFState.mb_get_copyright, livePtr)
  }

  /** GLTFState.set_copyright */
  final def setCopyright(copyright: String): Unit = {
    if (gdext.classes.GLTFState.mb_set_copyright == null) gdext.classes.GLTFState.mb_set_copyright = MethodBind.get("GLTFState", "set_copyright", 83702148L)
    Ptrcall.callVoid1(gdext.classes.GLTFState.mb_set_copyright, livePtr, copyright)
  }

  /** GLTFState.get_use_named_skin_binds */
  final def getUseNamedSkinBinds(): Boolean = {
    if (gdext.classes.GLTFState.mb_get_use_named_skin_binds == null) gdext.classes.GLTFState.mb_get_use_named_skin_binds = MethodBind.get("GLTFState", "get_use_named_skin_binds", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.GLTFState.mb_get_use_named_skin_binds, livePtr)
  }

  /** GLTFState.set_use_named_skin_binds */
  final def setUseNamedSkinBinds(use_named_skin_binds: Boolean): Unit = {
    if (gdext.classes.GLTFState.mb_set_use_named_skin_binds == null) gdext.classes.GLTFState.mb_set_use_named_skin_binds = MethodBind.get("GLTFState", "set_use_named_skin_binds", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.GLTFState.mb_set_use_named_skin_binds, livePtr, use_named_skin_binds)
  }

  /** GLTFState.get_animation_players_count */
  final def getAnimationPlayersCount(anim_player_index: Long): Long = {
    if (gdext.classes.GLTFState.mb_get_animation_players_count == null) gdext.classes.GLTFState.mb_get_animation_players_count = MethodBind.get("GLTFState", "get_animation_players_count", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.GLTFState.mb_get_animation_players_count, livePtr, anim_player_index)
  }

  /** GLTFState.get_animation_player */
  final def getAnimationPlayer(anim_player_index: Long): AnimationPlayer = {
    if (gdext.classes.GLTFState.mb_get_animation_player == null) gdext.classes.GLTFState.mb_get_animation_player = MethodBind.get("GLTFState", "get_animation_player", 1550200483L)
    Wrappers.borrowed[AnimationPlayer](Ptrcall.call1[Long, Long](gdext.classes.GLTFState.mb_get_animation_player, livePtr, anim_player_index))
  }

  /** GLTFState.get_scene_name */
  final def getSceneName(): String = {
    if (gdext.classes.GLTFState.mb_get_scene_name == null) gdext.classes.GLTFState.mb_get_scene_name = MethodBind.get("GLTFState", "get_scene_name", 201670096L)
    Ptrcall.call0[String](gdext.classes.GLTFState.mb_get_scene_name, livePtr)
  }

  /** GLTFState.set_scene_name */
  final def setSceneName(scene_name: String): Unit = {
    if (gdext.classes.GLTFState.mb_set_scene_name == null) gdext.classes.GLTFState.mb_set_scene_name = MethodBind.get("GLTFState", "set_scene_name", 83702148L)
    Ptrcall.callVoid1(gdext.classes.GLTFState.mb_set_scene_name, livePtr, scene_name)
  }

  /** GLTFState.get_base_path */
  final def getBasePath(): String = {
    if (gdext.classes.GLTFState.mb_get_base_path == null) gdext.classes.GLTFState.mb_get_base_path = MethodBind.get("GLTFState", "get_base_path", 201670096L)
    Ptrcall.call0[String](gdext.classes.GLTFState.mb_get_base_path, livePtr)
  }

  /** GLTFState.set_base_path */
  final def setBasePath(base_path: String): Unit = {
    if (gdext.classes.GLTFState.mb_set_base_path == null) gdext.classes.GLTFState.mb_set_base_path = MethodBind.get("GLTFState", "set_base_path", 83702148L)
    Ptrcall.callVoid1(gdext.classes.GLTFState.mb_set_base_path, livePtr, base_path)
  }

  /** GLTFState.get_filename */
  final def getFilename(): String = {
    if (gdext.classes.GLTFState.mb_get_filename == null) gdext.classes.GLTFState.mb_get_filename = MethodBind.get("GLTFState", "get_filename", 201670096L)
    Ptrcall.call0[String](gdext.classes.GLTFState.mb_get_filename, livePtr)
  }

  /** GLTFState.set_filename */
  final def setFilename(filename: String): Unit = {
    if (gdext.classes.GLTFState.mb_set_filename == null) gdext.classes.GLTFState.mb_set_filename = MethodBind.get("GLTFState", "set_filename", 83702148L)
    Ptrcall.callVoid1(gdext.classes.GLTFState.mb_set_filename, livePtr, filename)
  }

  /** GLTFState.get_create_animations */
  final def getCreateAnimations(): Boolean = {
    if (gdext.classes.GLTFState.mb_get_create_animations == null) gdext.classes.GLTFState.mb_get_create_animations = MethodBind.get("GLTFState", "get_create_animations", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.GLTFState.mb_get_create_animations, livePtr)
  }

  /** GLTFState.set_create_animations */
  final def setCreateAnimations(create_animations: Boolean): Unit = {
    if (gdext.classes.GLTFState.mb_set_create_animations == null) gdext.classes.GLTFState.mb_set_create_animations = MethodBind.get("GLTFState", "set_create_animations", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.GLTFState.mb_set_create_animations, livePtr, create_animations)
  }

  /** GLTFState.get_import_as_skeleton_bones */
  final def getImportAsSkeletonBones(): Boolean = {
    if (gdext.classes.GLTFState.mb_get_import_as_skeleton_bones == null) gdext.classes.GLTFState.mb_get_import_as_skeleton_bones = MethodBind.get("GLTFState", "get_import_as_skeleton_bones", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.GLTFState.mb_get_import_as_skeleton_bones, livePtr)
  }

  /** GLTFState.set_import_as_skeleton_bones */
  final def setImportAsSkeletonBones(import_as_skeleton_bones: Boolean): Unit = {
    if (gdext.classes.GLTFState.mb_set_import_as_skeleton_bones == null) gdext.classes.GLTFState.mb_set_import_as_skeleton_bones = MethodBind.get("GLTFState", "set_import_as_skeleton_bones", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.GLTFState.mb_set_import_as_skeleton_bones, livePtr, import_as_skeleton_bones)
  }

  /** GLTFState.get_scene_node */
  final def getSceneNode(gltf_node_index: Long): Node = {
    if (gdext.classes.GLTFState.mb_get_scene_node == null) gdext.classes.GLTFState.mb_get_scene_node = MethodBind.get("GLTFState", "get_scene_node", 539202265L)
    Wrappers.borrowed[Node](Ptrcall.call1[Long, Long](gdext.classes.GLTFState.mb_get_scene_node, livePtr, gltf_node_index))
  }

  /** GLTFState.get_node_index */
  final def getNodeIndex(scene_node: Node): Long = {
    if (gdext.classes.GLTFState.mb_get_node_index == null) gdext.classes.GLTFState.mb_get_node_index = MethodBind.get("GLTFState", "get_node_index", 3810805390L)
    Ptrcall.call1[GodotObject, Long](gdext.classes.GLTFState.mb_get_node_index, livePtr, Wrappers.handle(scene_node))
  }

  /** GLTFState.get_handle_binary_image_mode */
  final def getHandleBinaryImageMode(): Long = {
    if (gdext.classes.GLTFState.mb_get_handle_binary_image_mode == null) gdext.classes.GLTFState.mb_get_handle_binary_image_mode = MethodBind.get("GLTFState", "get_handle_binary_image_mode", 1363384196L)
    Ptrcall.call0[Long](gdext.classes.GLTFState.mb_get_handle_binary_image_mode, livePtr)
  }

  /** GLTFState.set_handle_binary_image_mode */
  final def setHandleBinaryImageMode(method: Long): Unit = {
    if (gdext.classes.GLTFState.mb_set_handle_binary_image_mode == null) gdext.classes.GLTFState.mb_set_handle_binary_image_mode = MethodBind.get("GLTFState", "set_handle_binary_image_mode", 854676334L)
    Ptrcall.callVoid1(gdext.classes.GLTFState.mb_set_handle_binary_image_mode, livePtr, method)
  }

  /** GLTFState.set_bake_fps */
  final def setBakeFps(value: Double): Unit = {
    if (gdext.classes.GLTFState.mb_set_bake_fps == null) gdext.classes.GLTFState.mb_set_bake_fps = MethodBind.get("GLTFState", "set_bake_fps", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GLTFState.mb_set_bake_fps, livePtr, value)
  }

  /** GLTFState.get_bake_fps */
  final def getBakeFps(): Double = {
    if (gdext.classes.GLTFState.mb_get_bake_fps == null) gdext.classes.GLTFState.mb_get_bake_fps = MethodBind.get("GLTFState", "get_bake_fps", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.GLTFState.mb_get_bake_fps, livePtr)
  }

  /** GLTFState.get_handle_binary_image */
  final def getHandleBinaryImage(): Long = {
    if (gdext.classes.GLTFState.mb_get_handle_binary_image == null) gdext.classes.GLTFState.mb_get_handle_binary_image = MethodBind.get("GLTFState", "get_handle_binary_image", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.GLTFState.mb_get_handle_binary_image, livePtr)
  }

  /** GLTFState.set_handle_binary_image */
  final def setHandleBinaryImage(method: Long): Unit = {
    if (gdext.classes.GLTFState.mb_set_handle_binary_image == null) gdext.classes.GLTFState.mb_set_handle_binary_image = MethodBind.get("GLTFState", "set_handle_binary_image", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GLTFState.mb_set_handle_binary_image, livePtr, method)
  }

}

object GLTFState {
  private[classes] var mb_add_used_extension: GDExtensionMethodBindPtr = null
  private[classes] var mb_append_gltf_node: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_major_version: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_major_version: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_minor_version: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_minor_version: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_copyright: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_copyright: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_use_named_skin_binds: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_named_skin_binds: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_animation_players_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_animation_player: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_scene_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_scene_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_base_path: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_base_path: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_filename: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_filename: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_create_animations: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_create_animations: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_import_as_skeleton_bones: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_import_as_skeleton_bones: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_scene_node: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_node_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_handle_binary_image_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_handle_binary_image_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bake_fps: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bake_fps: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_handle_binary_image: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_handle_binary_image: GDExtensionMethodBindPtr = null
}
