package gdext.classes

/**
 * Named built-in engine signals, so connection sites pass a typed value
 * (`SignalName.Pressed`) instead of a bare `"pressed"` string. Each case carries
 * its exact Godot signal name. This is not exhaustive — it covers the common
 * `BaseButton` / `Control` / `Node` signals games connect to; add cases as
 * needed. For a signal not listed here, the string-based `connect` overloads
 * still work.
 */
enum SignalName(val godotName: String):
  // BaseButton
  case Pressed       extends SignalName("pressed")
  case ButtonDown    extends SignalName("button_down")
  case ButtonUp      extends SignalName("button_up")
  case Toggled       extends SignalName("toggled")
  // Control
  case MouseEntered  extends SignalName("mouse_entered")
  case MouseExited   extends SignalName("mouse_exited")
  case FocusEntered  extends SignalName("focus_entered")
  case FocusExited   extends SignalName("focus_exited")
  case Resized       extends SignalName("resized")
  case GuiInput      extends SignalName("gui_input")
  // Range (sliders, progress)
  case ValueChanged  extends SignalName("value_changed")
  // Node lifecycle
  case Ready         extends SignalName("ready")
  case TreeEntered   extends SignalName("tree_entered")
  case TreeExiting   extends SignalName("tree_exiting")
  case TreeExited    extends SignalName("tree_exited")
  // Timer
  case Timeout       extends SignalName("timeout")
  // Area / body monitoring
  case BodyEntered   extends SignalName("body_entered")
  case BodyExited    extends SignalName("body_exited")
  case AreaEntered   extends SignalName("area_entered")
  case AreaExited    extends SignalName("area_exited")
  // AnimationPlayer / AnimationTree
  case AnimationFinished extends SignalName("animation_finished")
