package game

import gdext.classes.{AnimationTree, Node}
import gdext.annotations.*

/**
 * The recommended downstream shape (CharacterRig-style): the comp node
 * reference is a primary-ctor `var` (scene-wired), while the dropdown String
 * fields live in the class BODY so their annotations can reference siblings
 * with `nameOf(field)` instead of raw strings. (Annotation arguments on ctor
 * params are typed outside the class scope, so `nameOf` cannot resolve there —
 * body fields are the way to avoid strings.)
 */
final class ExportCompCtorParams(
  var tree: AnimationTree = null
) extends Node {
  @exportAnimationStateName(nameOf(tree)) @gdexport var state: String = ""
  @exportAnimationStateProperty(nameOf(tree), nameOf(state)) @gdexport var stateParam: String = ""
  @exportAnimationStateNode(nameOf(tree), nameOf(state)) @gdexport var stateNode: String = ""
}
