package io.github.optical002.godot.register

import scala.annotation.StaticAnnotation

/**
 * Annotations that drive automatic class registration. A game class extends
 * [[GodotScriptClass]] and marks its members with these; the macro then scans
 * the class at compile time and emits all the registration calls, so game code
 * never touches the registration APIs directly.
 *
 * The supported set mirrors gdext's `#[func]` / `#[export]` / `#[signal]`.
 */

/**
 * The engine base class this Scala class extends (e.g. `Node2D`). Required:
 * it cannot be inferred from `extends GodotScriptClass`, so it is declared here,
 * matching gdext's `#[class(base = Node2D)]`. Read by `Register.auto[T]`.
 */
final class godotClass(val base: String) extends StaticAnnotation

/** Marks a method as callable from Godot/GDScript (gdext `#[func]`). */
final class func extends StaticAnnotation

/**
 * Marks a `var` as an editor-exposed property (gdext `#[export]`). The macro
 * registers it using a `get_<name>`/`set_<name>` accessor pair derived from the
 * field. (Named `gdexport` because `export` is a Scala keyword.)
 */
final class gdexport extends StaticAnnotation

/**
 * Declares a (currently no-argument) signal on the class (gdext `#[signal]`).
 * Apply to a `def <name>(): Unit` member; only the name is used.
 */
final class signal extends StaticAnnotation
