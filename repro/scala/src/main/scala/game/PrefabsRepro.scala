package game

import gdext.annotations.*
import gdext.api.Tres
import gdext.builtin.Dict
import gdext.classes.{Node, PackedScene, Resource}
import gdext.internal.engine.Gd

/** Repro for the survivor-game `Prefabs.scenes` bug. Mirrors the real scenario:
  *
  *   - a custom Resource (`PrefabsRepro`) with a `Dict[String, Tres[PackedScene]]`
  *     export, populated from a `.tres`;
  *   - a Node (`PrefabsReader`) that holds it as a `Tres[PrefabsRepro]` export
  *     (like survivor-game's `Entry.prefabs`) and reads the dict through
  *     `prefabs.get.scenes` — exactly how `Prefab.lookupScene` does.
  *
  * In survivor-game `scenes` came back null there; this isolates whether the
  * cause is object-valued dicts and/or access through a `Tres`/`Gd` handle. */
final class PrefabsRepro(
  var scenes: Dict[String, Tres[PackedScene]]
) extends Resource:

  /** -1 if the Scala field is null (the bug), else its size. Read directly on
    * the resource instance. */
  @func def scenesSize(): Long = if scenes == null then -1L else scenes.size.toLong

/** Holds a `PrefabsRepro` as a `Tres` export and reads its dict through the
  * `Gd` handle — the survivor-game `Entry.prefabs` -> `prefabs.get.scenes`
  * path. */
final class PrefabsReader(
  var prefabs: Option[Tres[PrefabsRepro]] = None,
  // survivor-game's Entry uses `Gd[Prefabs]` (a NODE-type export) for a
  // RESOURCE — this is the suspected bug. Mirror it here.
  var prefabsGd: Option[Gd[PrefabsRepro]] = None
) extends Node:

  /** Via the correct `Tres` export. */
  @func def readScenesSizeViaTres(): Long =
    prefabs match
      case None => -2L
      case Some(tres) =>
        val repro = tres.get.get
        if repro.scenes == null then -1L else repro.scenes.size.toLong

  /** Via the WRONG `Gd[Resource]` export (survivor-game's pattern). */
  @func def readScenesSizeViaGd(): Long =
    prefabsGd match
      case None => -2L
      case Some(gd) =>
        val repro = gd.get
        if repro.scenes == null then -1L else repro.scenes.size.toLong
