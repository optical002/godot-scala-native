package io.github.optical002.godot.engine

/**
 * Type-class describing a Godot engine class `T` (one of the generated opaque
 * wrappers). Carries the metadata `Gd[T]` and casting need at runtime:
 *
 *  - the engine class name (for class-tag / cast lookups),
 *  - whether instances are reference-counted (`RefCounted` subtree) vs
 *    manually-managed (`Object`/`Node` subtree),
 *  - how to wrap a raw [[GodotObject]] handle as a `T` and back.
 *
 * The generator emits one `given GodotClass[T]` per class. gdext encodes the
 * same facts in its `GodotClass` trait.
 */
trait GodotClass[T] {
  def className: String
  def isRefCounted: Boolean
  def wrap(o: GodotObject): T
  def unwrap(t: T): GodotObject
}

object GodotClass {
  def apply[T](using gc: GodotClass[T]): GodotClass[T] = gc
}
