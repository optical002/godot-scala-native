package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `PackedScene`, extends `Resource`. */
abstract class PackedScene extends Resource {
  override def godotClassName: String = "PackedScene"

  /** PackedScene.pack */
  final def pack(path: Node): Long = {
    if (gdext.classes.PackedScene.mb_pack == null) gdext.classes.PackedScene.mb_pack = MethodBind.get("PackedScene", "pack", 2584678054L)
    Ptrcall.call1[GodotObject, Long](gdext.classes.PackedScene.mb_pack, livePtr, Wrappers.handle(path))
  }

  /** PackedScene.instantiate */
  final def instantiate(edit_state: Long): Node = {
    if (gdext.classes.PackedScene.mb_instantiate == null) gdext.classes.PackedScene.mb_instantiate = MethodBind.get("PackedScene", "instantiate", 2628778455L)
    Wrappers.borrowed[Node](Ptrcall.call1[Long, Long](gdext.classes.PackedScene.mb_instantiate, livePtr, edit_state))
  }

  /** PackedScene.can_instantiate */
  final def canInstantiate(): Boolean = {
    if (gdext.classes.PackedScene.mb_can_instantiate == null) gdext.classes.PackedScene.mb_can_instantiate = MethodBind.get("PackedScene", "can_instantiate", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.PackedScene.mb_can_instantiate, livePtr)
  }

  /** PackedScene.get_state. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getState(): SceneState = {
    if (gdext.classes.PackedScene.mb_get_state == null) gdext.classes.PackedScene.mb_get_state = MethodBind.get("PackedScene", "get_state", 3479783971L)
    Wrappers.owned[SceneState](Ptrcall.call0[Long](gdext.classes.PackedScene.mb_get_state, livePtr))
  }

}

object PackedScene {
  private[classes] var mb_pack: GDExtensionMethodBindPtr = null
  private[classes] var mb_instantiate: GDExtensionMethodBindPtr = null
  private[classes] var mb_can_instantiate: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_state: GDExtensionMethodBindPtr = null
}
