package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `RenderData`, extends `Object`. */
abstract class RenderData extends Object {

  /** RenderData.get_render_scene_buffers */
  final def getRenderSceneBuffers(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("RenderData", "get_render_scene_buffers", 2793216201L), hostObject.objectPtr)

  /** RenderData.get_render_scene_data */
  final def getRenderSceneData(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("RenderData", "get_render_scene_data", 1288715698L), hostObject.objectPtr)

}

object RenderData {
  /** Class metadata for Gd[RenderData] lifetime management and casting. */
  given GodotClass[RenderData] with {
    def className = "RenderData"
    def isRefCounted = false
    def wrap(o: GodotObject): RenderData = new RenderData {}.withHost(o.objectPtr)
    def unwrap(t: RenderData): GodotObject = t.hostObject
  }
}
