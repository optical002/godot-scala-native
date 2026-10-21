package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `MultiplayerSpawner`, extends `Node`. */
abstract class MultiplayerSpawner extends Node {
  override def godotClassName: String = "MultiplayerSpawner"

  /** MultiplayerSpawner.add_spawnable_scene */
  final def addSpawnableScene(path: String): Unit = {
    if (gdext.classes.MultiplayerSpawner.mb_add_spawnable_scene == null) gdext.classes.MultiplayerSpawner.mb_add_spawnable_scene = MethodBind.get("MultiplayerSpawner", "add_spawnable_scene", 83702148L)
    Ptrcall.callVoid1(gdext.classes.MultiplayerSpawner.mb_add_spawnable_scene, livePtr, path)
  }

  /** MultiplayerSpawner.get_spawnable_scene_count */
  final def getSpawnableSceneCount(): Long = {
    if (gdext.classes.MultiplayerSpawner.mb_get_spawnable_scene_count == null) gdext.classes.MultiplayerSpawner.mb_get_spawnable_scene_count = MethodBind.get("MultiplayerSpawner", "get_spawnable_scene_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.MultiplayerSpawner.mb_get_spawnable_scene_count, livePtr)
  }

  /** MultiplayerSpawner.get_spawnable_scene */
  final def getSpawnableScene(index: Long): String = {
    if (gdext.classes.MultiplayerSpawner.mb_get_spawnable_scene == null) gdext.classes.MultiplayerSpawner.mb_get_spawnable_scene = MethodBind.get("MultiplayerSpawner", "get_spawnable_scene", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.MultiplayerSpawner.mb_get_spawnable_scene, livePtr, index)
  }

  /** MultiplayerSpawner.clear_spawnable_scenes */
  final def clearSpawnableScenes(): Unit = {
    if (gdext.classes.MultiplayerSpawner.mb_clear_spawnable_scenes == null) gdext.classes.MultiplayerSpawner.mb_clear_spawnable_scenes = MethodBind.get("MultiplayerSpawner", "clear_spawnable_scenes", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.MultiplayerSpawner.mb_clear_spawnable_scenes, livePtr)
  }

  /** MultiplayerSpawner.get_spawn_limit */
  final def getSpawnLimit(): Long = {
    if (gdext.classes.MultiplayerSpawner.mb_get_spawn_limit == null) gdext.classes.MultiplayerSpawner.mb_get_spawn_limit = MethodBind.get("MultiplayerSpawner", "get_spawn_limit", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.MultiplayerSpawner.mb_get_spawn_limit, livePtr)
  }

  /** MultiplayerSpawner.set_spawn_limit */
  final def setSpawnLimit(limit: Long): Unit = {
    if (gdext.classes.MultiplayerSpawner.mb_set_spawn_limit == null) gdext.classes.MultiplayerSpawner.mb_set_spawn_limit = MethodBind.get("MultiplayerSpawner", "set_spawn_limit", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.MultiplayerSpawner.mb_set_spawn_limit, livePtr, limit)
  }

}

object MultiplayerSpawner {
  private[classes] var mb_add_spawnable_scene: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_spawnable_scene_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_spawnable_scene: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_spawnable_scenes: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_spawn_limit: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_spawn_limit: GDExtensionMethodBindPtr = null
}
