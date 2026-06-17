package io.github.optical002.godot.register

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
 */
final class gdexport extends StaticAnnotation

/**
 * Declares a (currently no-argument) signal on the class (gdext `#[signal]`).
 * Apply to a `def <name>(): Unit` member; only the name is used.
 */
final class signal extends StaticAnnotation
