package gdext.register

import gdext.engine.GodotObject
import gdext.codegen.gdextensioninterface.types.*

/**
 * Root base for everything in the engine class hierarchy.
 *
 * Generated engine classes extend this (transitively via `Object`), and user
 * classes extend an engine class (`class Player extends Node2D`). It carries the
 * engine-object handle every instance is backed by, the overridable engine
 * virtuals, and the small plumbing the generated wrappers and registration use.
 *
 * Two ways an instance gets its handle:
 *  - a **user class** is constructed by Godot via the create callback, which
 *    calls [[setHostObject]];
 *  - an engine wrapper around a **fetched** object (e.g. from `Gd[T].wrap` or a
 *    singleton) is built then handed a handle via [[withHost]].
 */
abstract class GodotScriptClass {

  private var _hostObject: GDExtensionObjectPtr = null

  /** The engine-side object handle for this instance. */
  final def hostObject: GodotObject = GodotObject.fromPtr(_hostObject)

  /** The raw handle, as the engine pointer type (used by generated methods). */
  private[gdext] def hostPtr: GDExtensionObjectPtr = _hostObject

  private[register] def setHostObject(o: GDExtensionObjectPtr): Unit =
    _hostObject = o

  /** Set the handle and return `this` (fluent, for wrapping fetched objects). */
  final def withHost(o: GDExtensionObjectPtr): this.type = {
    _hostObject = o
    this
  }

  // --- overridable engine virtuals (no-op defaults) ---------------------

  /** Called when the node enters the scene tree and is ready. */
  def _ready(): Unit = ()

  /** Called every rendered frame; `delta` is seconds since the last frame. */
  def _process(delta: Double): Unit = ()

  /** Called every physics frame; `delta` is the fixed physics step. */
  def _physics_process(delta: Double): Unit = ()

  // --- editor virtuals (EditorPlugin / EditorInspectorPlugin / EditorProperty)
  // No-op defaults; only the binding's editor classes override these. Dispatch
  // for them is wired in ClassRegistration alongside the node virtuals.

  /** EditorPlugin/Node: entered the (editor) tree. */
  def _enter_tree(): Unit = ()

  /** EditorPlugin/Node: leaving the (editor) tree. */
  def _exit_tree(): Unit = ()

  /** EditorInspectorPlugin: can this plugin handle `obj`'s inspector? */
  def _can_handle(obj: GodotObject): Boolean = false

  /**
   * EditorInspectorPlugin: inspect one property. Return true to take it over
   * (after calling addPropertyEditor), false to let the default editor render.
   */
  def _parse_property(
    obj: GodotObject,
    varType: Long,
    name: String,
    hintType: Long,
    hintString: String,
    usage: Long,
    wide: Boolean
  ): Boolean = false

  /** EditorProperty: refresh the widget from the edited property's value. */
  def _update_property(): Unit = ()
}
