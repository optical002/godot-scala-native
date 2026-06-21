package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `MultiplayerSpawner`, extends `Node`. */
abstract class MultiplayerSpawner extends Node {

  /** MultiplayerSpawner.add_spawnable_scene */
  final def addSpawnableScene(path: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("MultiplayerSpawner", "add_spawnable_scene", 83702148L), hostObject.objectPtr, path)

  /** MultiplayerSpawner.get_spawnable_scene_count */
  final def getSpawnableSceneCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("MultiplayerSpawner", "get_spawnable_scene_count", 3905245786L), hostObject.objectPtr)

  /** MultiplayerSpawner.get_spawnable_scene */
  final def getSpawnableScene(index: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("MultiplayerSpawner", "get_spawnable_scene", 844755477L), hostObject.objectPtr, index)

  /** MultiplayerSpawner.clear_spawnable_scenes */
  final def clearSpawnableScenes(): Unit =
    Ptrcall.callVoid0(MethodBind.get("MultiplayerSpawner", "clear_spawnable_scenes", 3218959716L), hostObject.objectPtr)

  /** MultiplayerSpawner.get_spawn_limit */
  final def getSpawnLimit(): Long =
    Ptrcall.call0[Long](MethodBind.get("MultiplayerSpawner", "get_spawn_limit", 3905245786L), hostObject.objectPtr)

  /** MultiplayerSpawner.set_spawn_limit */
  final def setSpawnLimit(limit: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("MultiplayerSpawner", "set_spawn_limit", 1286410249L), hostObject.objectPtr, limit)

}

object MultiplayerSpawner {
  /** Class metadata for Gd[MultiplayerSpawner] lifetime management and casting. */
  given GodotClass[MultiplayerSpawner] with {
    def className = "MultiplayerSpawner"
    def isRefCounted = false
    def wrap(o: GodotObject): MultiplayerSpawner = new MultiplayerSpawner {}.withHost(o.objectPtr)
    def unwrap(t: MultiplayerSpawner): GodotObject = t.hostObject
  }
}
