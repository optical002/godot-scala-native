package game

import gdext.api.Tres
import gdext.classes.{Node, Skeleton3D, AnimationPlayer, SpriteFrames, AnimationTree}
import gdext.annotations.*
import gdext.api.*

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
 *  - `@exportAnimationStateName("stateTree")` — state names of an
 *    `AnimationTree`'s root state machine.
 *  - `@exportAnimationStateProperty("stateTree", "stateName")` — parameter
 *    names under the state currently picked by the `stateName` field.
 *
 * Auto-registered like any other `game` class; add an `ExportCompProperties`
 * node to a scene, assign a comp, and the partner field turns into a dropdown.
 */
final class ExportCompProperties extends Node {
  // Bones of the referenced skeleton.
  @gdexport var skeleton: Skeleton3D = null
  @exportBoneName("skeleton") @gdexport var boneName: String = ""

  // Animations of the referenced animation player.
  @gdexport var player: AnimationPlayer = null
  @exportAnimation("player") @gdexport var anim: String = ""

  // Animation names of the referenced sprite-frames resource.
  @gdexport var frames: Tres[SpriteFrames] = Tres.unassigned[SpriteFrames]
  @exportSpriteAnimation("frames") @gdexport var spriteAnim: String = ""

  // "parameters/..." paths of the referenced animation tree.
  @gdexport var tree: AnimationTree = null
  @exportAnimationProperty("tree") @gdexport var treeParam: String = ""

  // State names of the referenced tree's root state machine, the parameter
  // names under whichever state `stateName` currently holds, and the sub-node
  // names of that state's blend tree. Comp references via `nameOf(field)`
  // instead of raw strings (body-field annotations are typed in class scope,
  // so the references resolve and survive renames).
  @gdexport var stateTree: AnimationTree = null
  @exportAnimationStateName(nameOf(stateTree)) @gdexport var stateName: String = ""
  @exportAnimationStateProperty(nameOf(stateTree), nameOf(stateName)) @gdexport var stateParam: String = ""
  @exportAnimationStateNode(nameOf(stateTree), nameOf(stateName)) @gdexport var stateNode: String = ""
}
