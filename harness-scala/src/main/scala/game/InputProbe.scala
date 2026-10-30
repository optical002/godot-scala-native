package game

import gdext.annotations.*
import gdext.api.*
import gdext.classes.*

/** Drives the typed Input API for `input_verify.gd`. `@func`s take no
  * arguments, so the script sets the exported fields first: `code` (a key or
  * button), `mods`, `state` (a `KeyState` ordinal), `action` (an `Actions` case
  * name), and `pressed`/`echo` for [[checkEvent]].
  */
class InputProbe extends Node {
  @gdexport var code: Int = 0
  @gdexport var mods: Int = 0
  @gdexport var state: Int = 0
  @gdexport var action: String = "Jump"
  @gdexport var pressed: Boolean = true
  @gdexport var echo: Boolean = false

  private var seen: String = ""

  private def st: KeyState = KeyState.fromOrdinal(state)

  @func def key(): Boolean = Input.getKey(Key(code), st)
  @func def keyMods(): Boolean =
    Input.getKey(Key(code), st, KeyModifierMask(mods))
  @func def physicalKey(): Boolean = Input.getPhysicalKey(Key(code), st)
  @func def mouse(): Boolean = Input.getMouseButton(MouseButton(code), st)
  @func def joy(): Boolean = Input.getJoyButton(JoyButton(code), st)
  @func def act(): Boolean = Input.getAction(Actions.valueOf(action), st)
  @func def axis(): Double = Input.getAxis(Actions.MoveLeft, Actions.MoveRight)
  @func def vector(): String = {
    val v = Input.getVector(
      Actions.MoveLeft,
      Actions.MoveRight,
      Actions.MoveUp,
      Actions.MoveDown
    )
    s"${v.x},${v.y}"
  }
  @func def press(): Boolean = { Input.press(Actions.valueOf(action)); true }
  @func def release(): Boolean = {
    Input.release(Actions.valueOf(action)); true
  }

  /** Singleton forwarder plus the generated enums' names. */
  @func def forwarded(): Boolean = Input.isKeyPressed(Key(code))
  @func def keyName(): String = Key(code).name
  @func def mouseMode(): String = Input.getMouseMode().name

  /** The typed event checks on a Space key event built from `pressed`/`echo`,
    * as `isKey JustPressed,isAction JustPressed,isKey Released,isKey Pressed`.
    */
  @func def checkEvent(): String = {
    val e = Gd.create[InputEventKey]()
    e.setKeycode(Key.Space)
    e.setPressed(pressed)
    e.setEcho(echo)
    try describe(e)
    finally e.unref()
  }

  private def describe(e: InputEvent): String =
    Seq(
      e.isKey(Key.Space, KeyState.JustPressed),
      e.isAction(Actions.Jump, KeyState.JustPressed),
      e.isKey(Key.Space, KeyState.Released),
      e.isKey(Key.Space, KeyState.Pressed)
    ).mkString(",")

  override def input(event: InputEvent): Unit =
    if (
      event.isKey(Key.Space, KeyState.Pressed) || event.isKey(
        Key.Space,
        KeyState.Released
      )
    )
      seen = describe(event)

  @func def lastSeen(): String = seen
}
