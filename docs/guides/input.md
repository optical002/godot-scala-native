# Input

Keys, buttons and Input Map actions are queried with typed calls on `Input`:

```scala
package game

import gdext.api.*       // KeyState, KeyMod, InputAction
import gdext.classes.*   // Input, Key, MouseButton, JoyButton, Node2D, ...

final class Player(var speed: Double = 200.0) extends Node2D {
  override def process(delta: Double): Unit = {
    val dir = Input.getVector(Actions.MoveLeft, Actions.MoveRight, Actions.MoveUp, Actions.MoveDown)
    setPosition(getPosition() + dir * (speed * delta).toFloat)

    if (Input.getAction(Actions.Jump, KeyState.JustPressed)) jump()
    if (Input.getKey(Key.Escape, KeyState.JustPressed)) getTree().quit()
  }

  private def jump(): Unit = ()
}
```

`Actions` is generated from your project's Input Map, and `Key` from Godot's
key list. A misspelled action or key does not compile.

## Key states

Every query takes a `KeyState`:

| State | True when |
|---|---|
| `KeyState.Pressed` | held down now |
| `KeyState.JustPressed` | went down this frame (exactly one frame) |
| `KeyState.JustReleased` | went up this frame (exactly one frame) |
| `KeyState.Released` | not held down |

Use `JustPressed` for one-shot actions such as jumping or opening a menu, and
`Pressed` for anything that lasts while held, such as running.

"This frame" follows Godot's rule: queried from `physicsProcess` it means
this physics tick, otherwise this process frame. A press and release inside one
frame still counts as `JustPressed`.

## Actions

Define actions in *Project Settings > Input Map*. On every build the plugin reads
the `[input]` section of `project.godot` and generates `game.Actions`, one enum
case per action:

```scala
// target/.../game/Actions.scala (generated)
enum Actions(val name: String) extends gdext.api.InputAction {
  /** `jump`: key 32, joypad button 0 */
  case Jump extends Actions("jump")
  /** `move_left`: physical key 65 */
  case MoveLeft extends Actions("move_left")
  ...
  case UiAccept extends Actions("ui_accept")
  ...
}
```

- Names are PascalCase: `move_left` becomes `MoveLeft`. A name starting with a
  digit gets an `Action` prefix (`2nd_fire` becomes `Action2ndFire`).
- Godot's built-in `ui_*` actions (`UiAccept`, `UiCancel`, `UiLeft`, ...) are
  always included. Your project's actions come first.
- Each case's doc comment lists the events bound to it.
- Renaming or deleting an action in the editor makes the next build fail
  wherever the old name is used.
- The editor plugin's watch rebuilds when `project.godot` changes, so new
  actions show up without restarting sbt.

```scala
Input.getAction(Actions.Jump, KeyState.JustPressed)
Input.getAction(Actions.Jump, KeyState.Pressed, exact = true) // no extra modifiers held
```

An action added at run time through `InputMap` has no generated case. Name it
with `InputAction`:

```scala
val dash = InputAction("dash")
InputMap.addAction("dash")
Input.getAction(dash, KeyState.JustPressed)
```

If a generated action is missing from the Input Map at run time (the library is
older than `project.godot`), the first query logs a warning.

## Keys

```scala
Input.getKey(Key.Space, KeyState.JustPressed)
Input.getKey(Key.A, KeyState.Pressed)
Input.getKey(Key.F1, KeyState.JustReleased)
Input.getKey(Key.Key0, KeyState.Pressed)   // the 0 key on the main row
Input.getKey(Key.Kp0, KeyState.Pressed)    // keypad 0
```

`getKey` is layout-dependent: `Key.Q` is the key that types "q". For movement
keys, use `getPhysicalKey`. It names the key by its position on a US QWERTY
keyboard, so WASD stays in the same place on AZERTY or Dvorak:

```scala
Input.getPhysicalKey(Key.W, KeyState.Pressed)
```

### Modifiers

Without modifiers, `getKey` ignores Shift, Ctrl, Alt and Meta, so
`getKey(Key.S, ...)` also fires for Ctrl+S. To require exactly a set of
modifiers, pass them:

```scala
Input.getKey(Key.S, KeyState.JustPressed, KeyMod.Ctrl)              // Ctrl+S
Input.getKey(Key.Z, KeyState.JustPressed, KeyMod.Ctrl | KeyMod.Shift)
Input.getKey(Key.C, KeyState.JustPressed, KeyMod.CmdOrCtrl)         // Cmd on macOS
```

## Mouse and joypad buttons

```scala
Input.getMouseButton(MouseButton.Left, KeyState.JustPressed)
Input.getMouseButton(MouseButton.WheelUp, KeyState.JustPressed)
Input.getJoyButton(JoyButton.A, KeyState.Pressed)   // any connected joypad
```

To read one specific joypad, use the engine call `Input.isJoyButtonPressed(device, JoyButton.A)`.

## Analog input

```scala
val throttle: Double = Input.getActionStrength(Actions.Accelerate) // 0..1
val steer: Double    = Input.getAxis(Actions.SteerLeft, Actions.SteerRight) // -1..1
val move: Vector2    = Input.getVector(Actions.MoveLeft, Actions.MoveRight, Actions.MoveUp, Actions.MoveDown)
val strict: Vector2  = Input.getVector(Actions.MoveLeft, Actions.MoveRight, Actions.MoveUp, Actions.MoveDown, 0.3)
```

`getVector` uses the actions' own deadzones unless you pass one, and caps the
result at length 1, so diagonals are not faster.

## Input events

Polling with `Input.getX` suits gameplay that runs every frame. To react to
each event as it arrives, for example a pause key that must not reach the game
underneath a menu, override `unhandledInput` (or `input`) and use the typed
checks on the event:

```scala
override def unhandledInput(event: InputEvent): Unit = {
  if (event.isAction(Actions.UiCancel, KeyState.JustPressed)) togglePause()
  else if (event.isKey(Key.F11, KeyState.JustPressed)) toggleFullscreen()
  else if (event.isMouseButton(MouseButton.Right, KeyState.Pressed)) openContextMenu()
}
```

| Check | Matches |
|---|---|
| `isKey(key, state)` | a key event for `key` (layout-dependent) |
| `isPhysicalKey(key, state)` | a key event at `key`'s position |
| `isMouseButton(button, state)` | a mouse button event |
| `isJoyButton(button, state)` | a joypad button event |
| `isAction(action, state)` | any event bound to `action` |

An event is a single transition, so the states mean:

| State | On an event |
|---|---|
| `Pressed` | a press, including key repeats (echo) |
| `JustPressed` | a press, excluding key repeats |
| `JustReleased`, `Released` | a release |

For anything else, `cast` to the event class and read it directly:

```scala
event.cast[InputEventMouseMotion] match {
  case null   => ()
  case motion => look(motion.getRelative())
}
```

The `InputEvent` passed to `input` is borrowed. Call `refInc()` on it to keep
it after the callback returns; see [Memory and object lifetimes](memory.md).

## Simulating input

`press` and `release` make an action read as held, as if its key were down.
This is useful for on-screen buttons, replays and tests:

```scala
Input.press(Actions.Jump)
Input.press(Actions.Accelerate, strength = 0.5)
Input.release(Actions.Jump)
```

To inject a complete event that also reaches `input` handlers, use
`Input.parseInputEvent(event)`.

## The rest of the engine's Input

Every method of Godot's `Input` singleton is also available on `Input`, typed
and with Godot's default arguments:

```scala
Input.setMouseMode(Input.MouseMode.Captured)
Input.getMouseMode() == Input.MouseMode.Captured
Input.warpMouse(Vector2(640f, 360f))
Input.getLastMouseVelocity()
Input.setDefaultCursorShape(Input.CursorShape.PointingHand)
Input.startJoyVibration(0L, 0.5, 1.0, 0.25)
Input.getJoyAxis(0L, JoyAxis.LeftX)
Input.isKeyPressed(Key.Space)           // held state only, no edge
Input.isActionJustPressed("jump")       // by name, unchecked
```

`InputMap` (the action table) is a singleton too: `InputMap.addAction`,
`InputMap.actionAddEvent`, `InputMap.actionEraseEvents`, and so on, for
rebinding controls at run time.

## How key edges work

Godot tracks `JustPressed` and `JustReleased` only for actions. For keys and
buttons, the binding adds a hidden Input Map action per key (named
`__gdsn_key_32` and similar), bound to that single key. The first
`getKey`/`getPhysicalKey`/`getMouseButton`/`getJoyButton` call creates one for
every named key or button of that kind. A key with modifiers gets its own action
the first time it is queried.

- **First-query delay:** a key held down before its first query reads as
  released until it is pressed again. In practice the first query happens in
  the first frame, before anyone has pressed anything.
- **Visible when listing actions:** the hidden actions show up in GDScript's
  `InputMap.get_actions()`. Skip names starting with `__gdsn_` when listing
  actions, for example in a rebinding menu.
- **Wiped by a reload:** `InputMap.loadFromProjectSettings()` removes the
  hidden actions, and key queries then read as released.

## Performance

`getKey`, `getAction` and the forwarded engine calls (`Input.isKeyPressed`)
allocate nothing on the Scala heap and cost about one engine call each (30 to
40 ns, measured by `memory_verify.gd`). Action names are interned once, on
first use.

## Build settings

| Setting | Default | Effect |
|---|---|---|
| `godotInputActions` | `true` | generate `game.Actions` |
| `godotActionsObject` | `"Actions"` | name of the generated enum |
