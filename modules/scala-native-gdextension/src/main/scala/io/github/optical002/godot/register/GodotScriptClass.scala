package io.github.optical002.godot.register

import io.github.optical002.godot.engine.GodotObject
import io.github.optical002.godot.codegen.gdextensioninterface.types.*

/**
 * Base class for user-defined Scala classes that are exposed to Godot.
 *
 * A subclass becomes a real Godot class (registered with ClassDB) via
 * [[ClassRegistration]] (or the macro layer that wraps it). Each live Godot
 * object of the class is backed by one instance of the subclass; the engine
 * object handle is injected by the create callback and available as
 * [[hostObject]].
 *
 * Subclasses override the engine virtuals they care about (`_ready`,
 * `_process`, ...). The defaults are no-ops, and only overridden ones are
 * reported to Godot (so non-overridden virtuals keep the engine's own
 * behaviour). This mirrors gdext's `I*` virtual traits.
 */
abstract class GodotScriptClass {

  /** The engine object this Scala instance backs. Set during construction. */
  private var _hostObject: GDExtensionObjectPtr = null

  /** The engine-side object handle for this instance. */
  final def hostObject: GodotObject = GodotObject.fromPtr(_hostObject)

  private[register] def setHostObject(o: GDExtensionObjectPtr): Unit =
    _hostObject = o

  // --- overridable engine virtuals (no-op defaults) ---------------------

  /** Called when the node enters the scene tree and is ready. */
  def _ready(): Unit = ()

  /** Called every rendered frame; `delta` is seconds since the last frame. */
  def _process(delta: Double): Unit = ()

  /** Called every physics frame; `delta` is the fixed physics step. */
  def _physics_process(delta: Double): Unit = ()
}
