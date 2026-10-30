package gdext.internal.input

import scala.scalanative.unsafe.Ptr

import gdext.api.Gd
import gdext.classes.{
  Input,
  InputEvent,
  InputEventJoypadButton,
  InputEventKey,
  InputEventMouseButton,
  InputMap,
  JoyButton,
  Key,
  KeyModifierMask,
  MouseButton
}
import gdext.internal.StringNames
import gdext.internal.engine.{MethodBind, Ptrcall}
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** How a key, button or action is queried. */
enum KeyState {

  /** Held down now. */
  case Pressed

  /** Went down this frame (true for exactly one frame). */
  case JustPressed

  /** Went up this frame (true for exactly one frame). */
  case JustReleased

  /** Not held down. */
  case Released
}

/** A named Input Map action. The build generates `game.Actions` (an enum of
  * these) from `project.godot`; [[InputAction.apply]] names one added at run
  * time.
  */
trait InputAction {
  def name: String

  private var handle: Long = 0L

  /** The action's interned StringName handle word, resolved on first use; a
    * name missing from the Input Map is reported once.
    */
  private[gdext] final def nameHandle: Long = {
    if (handle == 0L) {
      if (!InputMap.hasAction(name))
        Gd.printWarning(
          s"Input action '$name' is not in the Input Map (stale build?)"
        )
      handle = InputQuery.handleOf(name)
    }
    handle
  }
}

object InputAction {

  /** An action by name, for one not in `project.godot` (added via `InputMap`).
    */
  def apply(actionName: String): InputAction = new InputAction {
    val name: String = actionName
  }
}

/** Short names for the [[KeyModifierMask]] bits used with `Input.getKey`. */
object KeyMod {
  final val Shift: KeyModifierMask = KeyModifierMask.MaskShift
  final val Alt: KeyModifierMask = KeyModifierMask.MaskAlt
  final val Meta: KeyModifierMask = KeyModifierMask.MaskMeta
  final val Ctrl: KeyModifierMask = KeyModifierMask.MaskCtrl

  /** Ctrl, or Cmd on macOS. */
  final val CmdOrCtrl: KeyModifierMask = KeyModifierMask.MaskCmdOrCtrl
}

/** Typed queries mixed into the generated `Input` companion
  * (`Input.getKey(Key.Space, KeyState.JustPressed)`).
  */
trait InputOps {

  /** `key` (layout-dependent: the key that types the letter) is in `state`. */
  final def getKey(key: Key, state: KeyState): Boolean =
    InputQuery.query(HiddenActions.keys.handle(key), state, false)

  /** `key` with exactly the `mods` modifiers held (`Key.S`, `KeyMod.Ctrl`). */
  final def getKey(key: Key, state: KeyState, mods: KeyModifierMask): Boolean =
    InputQuery.query(HiddenActions.keys.handle(key | mods.value), state, true)

  /** The key at `key`'s position on a US QWERTY layout, whatever the layout
    * (WASD stays WASD on AZERTY).
    */
  final def getPhysicalKey(key: Key, state: KeyState): Boolean =
    InputQuery.query(HiddenActions.physicalKeys.handle(key), state, false)

  final def getMouseButton(button: MouseButton, state: KeyState): Boolean =
    InputQuery.query(HiddenActions.mouseButtons.handle(button), state, false)

  /** `button` on any connected joypad. */
  final def getJoyButton(button: JoyButton, state: KeyState): Boolean =
    InputQuery.query(HiddenActions.joyButtons.handle(button), state, false)

  /** `exact` ignores the event when extra modifiers are held. */
  final def getAction(
    action: InputAction,
    state: KeyState,
    exact: Boolean = false
  ): Boolean =
    InputQuery.query(action.nameHandle, state, exact)

  /** 0..1: how far an analog control bound to `action` is pushed. */
  final def getActionStrength(action: InputAction): Double =
    InputQuery.strength(action.nameHandle)

  /** `positive` strength minus `negative` strength, in -1..1. */
  final def getAxis(negative: InputAction, positive: InputAction): Double =
    InputQuery.axis(negative.nameHandle, positive.nameHandle)

  /** A 2D direction from four actions, length at most 1, using the actions' own
    * deadzones.
    */
  final def getVector(
    negativeX: InputAction,
    positiveX: InputAction,
    negativeY: InputAction,
    positiveY: InputAction
  ): gdext.builtin.Vector2 =
    getVector(negativeX, positiveX, negativeY, positiveY, -1.0)

  final def getVector(
    negativeX: InputAction,
    positiveX: InputAction,
    negativeY: InputAction,
    positiveY: InputAction,
    deadzone: Double
  ): gdext.builtin.Vector2 =
    InputQuery.vector(
      negativeX.nameHandle,
      positiveX.nameHandle,
      negativeY.nameHandle,
      positiveY.nameHandle,
      deadzone
    )

  /** Simulate `action` being pressed (until [[release]]). */
  final def press(action: InputAction, strength: Double = 1.0): Unit =
    InputQuery.press(action.nameHandle, strength)

  final def release(action: InputAction): Unit =
    InputQuery.release(action.nameHandle)
}

/** Typed checks mixed into the generated `InputEvent`, for `_input` /
  * `_unhandled_input`. An event is one transition, so `JustReleased` and
  * `Released` both mean "this is a release"; `JustPressed` excludes key repeats
  * (echo), `Pressed` includes them.
  */
trait InputEventOps { self: InputEvent =>

  final def isKey(key: Key, state: KeyState): Boolean = self match {
    case k: InputEventKey =>
      k.getKeycode() == key && InputQuery.matches(
        k.isPressed(),
        k.isEcho(),
        state
      )
    case _ => false
  }

  final def isPhysicalKey(key: Key, state: KeyState): Boolean = self match {
    case k: InputEventKey =>
      k.getPhysicalKeycode() == key && InputQuery.matches(
        k.isPressed(),
        k.isEcho(),
        state
      )
    case _ => false
  }

  final def isMouseButton(button: MouseButton, state: KeyState): Boolean =
    self match {
      case m: InputEventMouseButton =>
        m.getButtonIndex() == button && InputQuery.matches(
          m.isPressed(),
          false,
          state
        )
      case _ => false
    }

  final def isJoyButton(button: JoyButton, state: KeyState): Boolean =
    self match {
      case j: InputEventJoypadButton =>
        j.getButtonIndex() == button && InputQuery.matches(
          j.isPressed(),
          false,
          state
        )
      case _ => false
    }

  /** This event triggers `action` in `state`. */
  final def isAction(action: InputAction, state: KeyState): Boolean =
    InputQuery.eventState(self.livePtr, action.nameHandle, state)
}

/** The engine calls behind the typed API. Action names cross ptrcall as their
  * StringName *handle word* passed by value: a `const StringName &` argument
  * only reads those 8 bytes, the cached name keeps the reference alive, and a
  * `Long` never boxes (a `Ptr` would, through a non-inlined call).
  */
object InputQuery {
  private var bPressed: GDExtensionMethodBindPtr = null
  private var bJustPressed: GDExtensionMethodBindPtr = null
  private var bJustReleased: GDExtensionMethodBindPtr = null
  private var bStrength: GDExtensionMethodBindPtr = null
  private var bAxis: GDExtensionMethodBindPtr = null
  private var bVector: GDExtensionMethodBindPtr = null
  private var bPress: GDExtensionMethodBindPtr = null
  private var bRelease: GDExtensionMethodBindPtr = null
  private var bEvPressed: GDExtensionMethodBindPtr = null
  private var bEvReleased: GDExtensionMethodBindPtr = null

  private final val ActionExact = 1558498928L // (StringName, bool) -> bool

  /** The interned handle word of `name` (process lifetime). */
  def handleOf(name: String): Long =
    !StringNames.cached(name).ptr.asInstanceOf[Ptr[Long]]

  def query(handle: Long, state: KeyState, exact: Boolean): Boolean = {
    val input = Input.singleton.livePtr
    state match {
      case KeyState.Pressed =>
        if (bPressed == null)
          bPressed = MethodBind.get("Input", "is_action_pressed", ActionExact)
        Ptrcall.call2[Long, Boolean, Boolean](bPressed, input, handle, exact)
      case KeyState.JustPressed =>
        if (bJustPressed == null)
          bJustPressed =
            MethodBind.get("Input", "is_action_just_pressed", ActionExact)
        Ptrcall.call2[Long, Boolean, Boolean](
          bJustPressed,
          input,
          handle,
          exact
        )
      case KeyState.JustReleased =>
        if (bJustReleased == null)
          bJustReleased =
            MethodBind.get("Input", "is_action_just_released", ActionExact)
        Ptrcall.call2[Long, Boolean, Boolean](
          bJustReleased,
          input,
          handle,
          exact
        )
      case KeyState.Released =>
        if (bPressed == null)
          bPressed = MethodBind.get("Input", "is_action_pressed", ActionExact)
        !Ptrcall.call2[Long, Boolean, Boolean](bPressed, input, handle, exact)
    }
  }

  def strength(handle: Long): Double = {
    if (bStrength == null)
      bStrength = MethodBind.get("Input", "get_action_strength", 801543509L)
    Ptrcall.call2[Long, Boolean, Double](
      bStrength,
      Input.singleton.livePtr,
      handle,
      false
    )
  }

  def axis(negative: Long, positive: Long): Double = {
    if (bAxis == null) bAxis = MethodBind.get("Input", "get_axis", 1958752504L)
    Ptrcall.call2[Long, Long, Double](
      bAxis,
      Input.singleton.livePtr,
      negative,
      positive
    )
  }

  def vector(
    nx: Long,
    px: Long,
    ny: Long,
    py: Long,
    deadzone: Double
  ): gdext.builtin.Vector2 = {
    if (bVector == null)
      bVector = MethodBind.get("Input", "get_vector", 2479607902L)
    Ptrcall.call5[Long, Long, Long, Long, Double, gdext.builtin.Vector2](
      bVector,
      Input.singleton.livePtr,
      nx,
      px,
      ny,
      py,
      deadzone
    )
  }

  def press(handle: Long, strength: Double): Unit = {
    if (bPress == null)
      bPress = MethodBind.get("Input", "action_press", 1713091165L)
    Ptrcall.callVoid2[Long, Double](
      bPress,
      Input.singleton.livePtr,
      handle,
      strength
    )
  }

  def release(handle: Long): Unit = {
    if (bRelease == null)
      bRelease = MethodBind.get("Input", "action_release", 3304788590L)
    Ptrcall.callVoid1[Long](bRelease, Input.singleton.livePtr, handle)
  }

  def eventState(
    event: gdext.internal.ffi.types.GDExtensionObjectPtr,
    handle: Long,
    state: KeyState
  ): Boolean = state match {
    case KeyState.Pressed | KeyState.JustPressed =>
      if (bEvPressed == null)
        bEvPressed =
          MethodBind.get("InputEvent", "is_action_pressed", 1631499404L)
      val allowEcho = state == KeyState.Pressed
      Ptrcall.call3[Long, Boolean, Boolean, Boolean](
        bEvPressed,
        event,
        handle,
        allowEcho,
        false
      )
    case _ =>
      if (bEvReleased == null)
        bEvReleased =
          MethodBind.get("InputEvent", "is_action_released", ActionExact)
      Ptrcall.call2[Long, Boolean, Boolean](bEvReleased, event, handle, false)
  }

  def matches(pressed: Boolean, echo: Boolean, state: KeyState): Boolean =
    state match {
      case KeyState.Pressed      => pressed
      case KeyState.JustPressed  => pressed && !echo
      case KeyState.JustReleased => !pressed
      case KeyState.Released     => !pressed
    }
}

/** Godot tracks just-pressed/just-released only for actions, so raw keys and
  * buttons are queried through hidden Input Map actions (`__gdsn_key_32`, ...),
  * one per code, each bound to a single event. A table registers every named
  * code on its first query and any other code (a non-enum keycode, a key with
  * modifiers) on its own first query. A newly registered action reads as
  * released until its next event.
  */
object HiddenActions {

  /** All devices, as in Input Map events (`InputMap::ALL_DEVICES`). */
  private final val AllDevices = -1L

  final class Table(
    prefix: String,
    seed: () => Iterable[Long],
    make: Long => InputEvent
  ) {
    private var codes = new Array[Long](0)
    private var handles = new Array[Long](0)
    private var size = 0
    private var seeded = false

    /** The action handle for `code`, registering it on first sight. */
    def handle(code: Long): Long = {
      if (!seeded) {
        seeded = true
        seed().foreach(c => if (find(c) < 0) insert(-find(c) - 1, c))
      }
      val i = find(code)
      if (i >= 0) handles(i) else insert(-i - 1, code)
    }

    /** Index of `code`, or `-(insertion point) - 1`. Hand-rolled: Scala
      * Native's `Arrays.binarySearch` boxes.
      */
    private def find(code: Long): Int = {
      var lo = 0
      var hi = size - 1
      while (lo <= hi) {
        val mid = (lo + hi) >>> 1
        val c = codes(mid)
        if (c < code) lo = mid + 1
        else if (c > code) hi = mid - 1
        else return mid
      }
      -(lo + 1)
    }

    private def insert(at: Int, code: Long): Long = {
      val name = s"$prefix$code"
      if (!InputMap.hasAction(name)) {
        InputMap.addAction(name, 0.5)
        val event = make(code)
        event.setDevice(AllDevices)
        InputMap.actionAddEvent(name, event)
        event.unref()
      }
      if (size == codes.length) {
        codes = java.util.Arrays.copyOf(codes, math.max(16, size * 2))
        handles = java.util.Arrays.copyOf(handles, math.max(16, size * 2))
      }
      System.arraycopy(codes, at, codes, at + 1, size - at)
      System.arraycopy(handles, at, handles, at + 1, size - at)
      val h = InputQuery.handleOf(name)
      codes(at) = code
      handles(at) = h
      size += 1
      h
    }
  }

  private def keyEvent(code: Long, physical: Boolean): InputEvent = {
    val e = Gd.create[InputEventKey]()
    val key = Key(code & KeyModifierMask.CodeMask.value)
    if (physical) e.setPhysicalKeycode(key) else e.setKeycode(key)
    e.setShiftPressed((code & KeyModifierMask.MaskShift.value) != 0)
    e.setAltPressed((code & KeyModifierMask.MaskAlt.value) != 0)
    e.setMetaPressed((code & KeyModifierMask.MaskMeta.value) != 0)
    e.setCtrlPressed((code & KeyModifierMask.MaskCtrl.value) != 0)
    e.setCommandOrControlAutoremap(
      (code & KeyModifierMask.MaskCmdOrCtrl.value) != 0
    )
    e
  }

  private def keyCodes(): Iterable[Long] =
    Key.values.toSeq
      .map(k => k: Long)
      .filter(c => c != 0L && c != (Key.Special: Long))

  val keys: Table =
    new Table("__gdsn_key_", () => keyCodes(), c => keyEvent(c, false))

  val physicalKeys: Table =
    new Table("__gdsn_physical_key_", () => keyCodes(), c => keyEvent(c, true))

  val mouseButtons: Table = new Table(
    "__gdsn_mouse_",
    () => MouseButton.values.toSeq.map(b => b: Long).filter(_ > 0L),
    { c =>
      val e = Gd.create[InputEventMouseButton]()
      e.setButtonIndex(MouseButton(c))
      e
    }
  )

  val joyButtons: Table = new Table(
    "__gdsn_joy_",
    () =>
      JoyButton.values.toSeq
        .map(b => b: Long)
        .filter(c => c >= 0L && c < (JoyButton.SdlMax: Long)),
    { c =>
      val e = Gd.create[InputEventJoypadButton]()
      e.setButtonIndex(JoyButton(c))
      e
    }
  )
}
