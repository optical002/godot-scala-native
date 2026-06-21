package game

import gdext.engine.{Gd, Tres}
import gdext.codegen.engine.{Node, Skeleton3D, AnimationPlayer, SpriteFrames, AnimationTree}
import gdext.register.*

/**
 * Component-reference string dropdowns. Each `String` property below becomes an
 * ENUM dropdown in the inspector, populated at inspect time from the referenced
 * comp's current value (via the class's `validate_property` callback). Pick a
 * comp, and its partner String field offers the matching names to choose from.
 *
 * Implemented cases (one per annotation the binding provides):
 *  - `@exportBoneName("skeleton")`      — bones of a `Skeleton3D`
 *    (via `getConcatenatedBoneNames`).
 *  - `@exportAnimation("player")`       — animations of an `AnimationPlayer`
 *    (an `AnimationMixer`; via `get_animation_list`).
 *  - `@exportSpriteAnimation("frames")` — animation names of a `SpriteFrames`
 *    (via `get_animation_names`).
 *  - `@exportAnimationProperty("tree")` — `parameters/...` paths of an
 *    `AnimationTree` (via `get_property_list` introspection).
 *
 * Auto-registered like any other `game` class; add an `ExportCompProperties`
 * node to a scene, assign a comp, and the partner field turns into a dropdown.
 */
final class ExportCompProperties extends Node {
  // Bones of the referenced skeleton.
  @gdexport var skeleton: Gd[Skeleton3D] = Gd.nullOf[Skeleton3D]
  @exportBoneName("skeleton") @gdexport var boneName: String = ""

  // Animations of the referenced animation player.
  @gdexport var player: Gd[AnimationPlayer] = Gd.nullOf[AnimationPlayer]
  @exportAnimation("player") @gdexport var anim: String = ""

  // Animation names of the referenced sprite-frames resource.
  @gdexport var frames: Tres[SpriteFrames] = Tres.unassigned[SpriteFrames]
  @exportSpriteAnimation("frames") @gdexport var spriteAnim: String = ""

  // "parameters/..." paths of the referenced animation tree.
  @gdexport var tree: Gd[AnimationTree] = Gd.nullOf[AnimationTree]
  @exportAnimationProperty("tree") @gdexport var treeParam: String = ""
}
