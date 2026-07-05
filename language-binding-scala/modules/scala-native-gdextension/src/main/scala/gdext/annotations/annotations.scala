package gdext.annotations

import gdext.internal.register.ExportHint

import scala.annotation.StaticAnnotation

/**
 * Annotations that drive automatic class registration. A game class extends an
 * engine class directly (`class Player extends Node2D`) and marks its members
 * with these; `Register.auto[T]` scans the class at compile time, derives the
 * Godot base from the superclass, and emits all the registration calls — so
 * game code never touches the registration APIs directly.
 *
 * The supported set mirrors gdext's `#[func]` / `#[export]` / `#[signal]`.
 */

/** Marks a method as callable from Godot/GDScript (gdext `#[func]`). */
final class func extends StaticAnnotation

/**
 * Marks a `var` as an editor-exposed property (gdext `#[export]`). The macro
 * registers it using a `get_<name>`/`set_<name>` accessor pair derived from the
 * field. (Named `gdexport` because `export` is a Scala keyword.)
 *
 * An optional [[ExportHint]] customises the inspector widget, mirroring
 * GDScript's `@export_range` / `@export_file` / `@export_multiline` / … :
 * {{{ @gdexport(ExportHint.range(0, 100)) var hp: Int = 50 }}}
 */
final class gdexport(hint: ExportHint = ExportHint.none) extends StaticAnnotation

/**
 * Starts an inspector **group** (gdext / GDScript `@export_group`) at the
 * annotated property; following exported properties stay in the group until the
 * next section marker. `prefix`, if given, is stripped from member display names.
 */
final class exportGroup(name: String, prefix: String = "") extends StaticAnnotation

/** Starts an inspector **subgroup** (`@export_subgroup`) at the annotated property. */
final class exportSubgroup(name: String, prefix: String = "") extends StaticAnnotation

/** Starts an inspector **category** (`@export_category`) at the annotated property. */
final class exportCategory(name: String) extends StaticAnnotation

/**
 * Declares a (currently no-argument) signal on the class (gdext `#[signal]`).
 * Apply to a `def <name>(): Unit` member; only the name is used.
 */
final class signal extends StaticAnnotation

/**
 * Component-reference dropdown annotations. Each one turns a `String`
 * `@gdexport` field into an ENUM dropdown in the inspector whose options are
 * enumerated, at inspect time, from another exported "comp" property on the same
 * class (named by `comp`, the sibling field's Scala name). The names are
 * recomputed from the comp's CURRENT value via the class's `validate_property`
 * callback — see [[CompEnumRegistry]] / [[CompEnum]].
 *
 * {{{
 * @gdexport var skeleton: Skeleton3D = null
 * @exportBoneName("skeleton") @gdexport var boneName: String = ""
 * }}}
 *
 * The annotated field must be a `String` with `@gdexport`, and `comp` must name a
 * sibling field whose type can be projected to the expected engine class.
 *
 * A Node class using any of these registers as a TOOL (non-runtime) class: the
 * editor swaps runtime-class nodes for native-parent placeholders that never
 * call `validate_property`, which would leave the dropdowns as plain strings.
 * Only overridden virtuals are registered, so nothing ticks in the editor
 * unless the class overrides e.g. `_process` — guard those with
 * `Engine.isEditorHint` if it does.
 */

/** Dropdown of the bones of the referenced `Skeleton3D` comp. */
final class exportBoneName(comp: String) extends StaticAnnotation

/** Dropdown of the animations of the referenced `AnimationPlayer`/`AnimationMixer` comp. */
final class exportAnimation(comp: String) extends StaticAnnotation

/** Dropdown of the animation names of the referenced `SpriteFrames` comp. */
final class exportSpriteAnimation(comp: String) extends StaticAnnotation

/** Dropdown of the `parameters/...` paths of the referenced `AnimationTree` comp. */
final class exportAnimationProperty(comp: String) extends StaticAnnotation

/**
 * Dropdown of the state names of the referenced `AnimationTree` comp's root
 * state machine (the names `AnimationNodeStateMachinePlayback.travel` accepts).
 */
final class exportAnimationStateName(comp: String) extends StaticAnnotation

/**
 * Dropdown of the parameter names under one state of the referenced
 * `AnimationTree` comp — the `<param>` in `parameters/<state>/<param>`. `state`
 * names a sibling `String` field (typically an [[exportAnimationStateName]]
 * one) whose CURRENT value selects the state, so the options follow it.
 */
final class exportAnimationStateProperty(comp: String, state: String) extends StaticAnnotation

/**
 * Dropdown of the sub-node names inside one state's `AnimationNodeBlendTree`
 * (e.g. a OneShot node to fire via `parameters/<state>/<node>/request`).
 * `state` selects the state exactly as in [[exportAnimationStateProperty]].
 */
final class exportAnimationStateNode(comp: String, state: String) extends StaticAnnotation

/**
 * Compile-time field-name reference for the annotation arguments above:
 * `@exportAnimationStateName(nameOf(animationTree))` means "animationTree" but
 * follows the field through renames. Only usable on CLASS-BODY fields — an
 * annotation argument on a constructor param is typed outside the class scope
 * and cannot see sibling params, so ctor-param dropdowns must keep string
 * arguments. Only meaningful inside these annotations (the registration macro
 * reads the referenced field's name from the tree); calling it at runtime
 * throws.
 */
def nameOf(field: Any): String =
  throw new UnsupportedOperationException("nameOf is a compile-time annotation argument")
