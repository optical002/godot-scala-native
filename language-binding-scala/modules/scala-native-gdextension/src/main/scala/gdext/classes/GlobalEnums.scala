package gdext.classes

// Godot's `@GlobalScope` enums and bitfields (generated).

/** Godot enum `Side`. */
opaque type Side <: Long = Long

object Side {
  final val Left: Side = 0L.asInstanceOf[Side]
  final val Top: Side = 1L.asInstanceOf[Side]
  final val Right: Side = 2L.asInstanceOf[Side]
  final val Bottom: Side = 3L.asInstanceOf[Side]

  /** A value from its raw Godot integer. */
  inline def apply(value: Long): Side = value.asInstanceOf[Side]

  /** Every named value, ascending, aliases once. */
  val values: scala.IArray[Side] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[Side]]

  extension (self: Side)
    /** The constant's Scala name, or the number for an unnamed value. */
    def name: String = self.asInstanceOf[Long] match {
      case 0L => "Left"
      case 1L => "Top"
      case 2L => "Right"
      case 3L => "Bottom"
      case other => other.toString
    }
}


/** Godot enum `Corner`. */
opaque type Corner <: Long = Long

object Corner {
  final val TopLeft: Corner = 0L.asInstanceOf[Corner]
  final val TopRight: Corner = 1L.asInstanceOf[Corner]
  final val BottomRight: Corner = 2L.asInstanceOf[Corner]
  final val BottomLeft: Corner = 3L.asInstanceOf[Corner]

  /** A value from its raw Godot integer. */
  inline def apply(value: Long): Corner = value.asInstanceOf[Corner]

  /** Every named value, ascending, aliases once. */
  val values: scala.IArray[Corner] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[Corner]]

  extension (self: Corner)
    /** The constant's Scala name, or the number for an unnamed value. */
    def name: String = self.asInstanceOf[Long] match {
      case 0L => "TopLeft"
      case 1L => "TopRight"
      case 2L => "BottomRight"
      case 3L => "BottomLeft"
      case other => other.toString
    }
}


/** Godot enum `Orientation`. */
opaque type Orientation <: Long = Long

object Orientation {
  final val Vertical: Orientation = 1L.asInstanceOf[Orientation]
  final val Horizontal: Orientation = 0L.asInstanceOf[Orientation]

  /** A value from its raw Godot integer. */
  inline def apply(value: Long): Orientation = value.asInstanceOf[Orientation]

  /** Every named value, ascending, aliases once. */
  val values: scala.IArray[Orientation] = scala.IArray[Long](0L, 1L).asInstanceOf[scala.IArray[Orientation]]

  extension (self: Orientation)
    /** The constant's Scala name, or the number for an unnamed value. */
    def name: String = self.asInstanceOf[Long] match {
      case 0L => "Horizontal"
      case 1L => "Vertical"
      case other => other.toString
    }
}


/** Godot enum `ClockDirection`. */
opaque type ClockDirection <: Long = Long

object ClockDirection {
  final val Clockwise: ClockDirection = 0L.asInstanceOf[ClockDirection]
  final val Counterclockwise: ClockDirection = 1L.asInstanceOf[ClockDirection]

  /** A value from its raw Godot integer. */
  inline def apply(value: Long): ClockDirection = value.asInstanceOf[ClockDirection]

  /** Every named value, ascending, aliases once. */
  val values: scala.IArray[ClockDirection] = scala.IArray[Long](0L, 1L).asInstanceOf[scala.IArray[ClockDirection]]

  extension (self: ClockDirection)
    /** The constant's Scala name, or the number for an unnamed value. */
    def name: String = self.asInstanceOf[Long] match {
      case 0L => "Clockwise"
      case 1L => "Counterclockwise"
      case other => other.toString
    }
}


/** Godot enum `HorizontalAlignment`. */
opaque type HorizontalAlignment <: Long = Long

object HorizontalAlignment {
  final val Left: HorizontalAlignment = 0L.asInstanceOf[HorizontalAlignment]
  final val Center: HorizontalAlignment = 1L.asInstanceOf[HorizontalAlignment]
  final val Right: HorizontalAlignment = 2L.asInstanceOf[HorizontalAlignment]
  final val Fill: HorizontalAlignment = 3L.asInstanceOf[HorizontalAlignment]

  /** A value from its raw Godot integer. */
  inline def apply(value: Long): HorizontalAlignment = value.asInstanceOf[HorizontalAlignment]

  /** Every named value, ascending, aliases once. */
  val values: scala.IArray[HorizontalAlignment] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[HorizontalAlignment]]

  extension (self: HorizontalAlignment)
    /** The constant's Scala name, or the number for an unnamed value. */
    def name: String = self.asInstanceOf[Long] match {
      case 0L => "Left"
      case 1L => "Center"
      case 2L => "Right"
      case 3L => "Fill"
      case other => other.toString
    }
}


/** Godot enum `VerticalAlignment`. */
opaque type VerticalAlignment <: Long = Long

object VerticalAlignment {
  final val Top: VerticalAlignment = 0L.asInstanceOf[VerticalAlignment]
  final val Center: VerticalAlignment = 1L.asInstanceOf[VerticalAlignment]
  final val Bottom: VerticalAlignment = 2L.asInstanceOf[VerticalAlignment]
  final val Fill: VerticalAlignment = 3L.asInstanceOf[VerticalAlignment]

  /** A value from its raw Godot integer. */
  inline def apply(value: Long): VerticalAlignment = value.asInstanceOf[VerticalAlignment]

  /** Every named value, ascending, aliases once. */
  val values: scala.IArray[VerticalAlignment] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[VerticalAlignment]]

  extension (self: VerticalAlignment)
    /** The constant's Scala name, or the number for an unnamed value. */
    def name: String = self.asInstanceOf[Long] match {
      case 0L => "Top"
      case 1L => "Center"
      case 2L => "Bottom"
      case 3L => "Fill"
      case other => other.toString
    }
}


/** Godot enum `InlineAlignment`. */
opaque type InlineAlignment <: Long = Long

object InlineAlignment {
  final val TopTo: InlineAlignment = 0L.asInstanceOf[InlineAlignment]
  final val CenterTo: InlineAlignment = 1L.asInstanceOf[InlineAlignment]
  final val BaselineTo: InlineAlignment = 3L.asInstanceOf[InlineAlignment]
  final val BottomTo: InlineAlignment = 2L.asInstanceOf[InlineAlignment]
  final val ToTop: InlineAlignment = 0L.asInstanceOf[InlineAlignment]
  final val ToCenter: InlineAlignment = 4L.asInstanceOf[InlineAlignment]
  final val ToBaseline: InlineAlignment = 8L.asInstanceOf[InlineAlignment]
  final val ToBottom: InlineAlignment = 12L.asInstanceOf[InlineAlignment]
  final val Top: InlineAlignment = 0L.asInstanceOf[InlineAlignment]
  final val Center: InlineAlignment = 5L.asInstanceOf[InlineAlignment]
  final val Bottom: InlineAlignment = 14L.asInstanceOf[InlineAlignment]
  final val ImageMask: InlineAlignment = 3L.asInstanceOf[InlineAlignment]
  final val TextMask: InlineAlignment = 12L.asInstanceOf[InlineAlignment]

  /** A value from its raw Godot integer. */
  inline def apply(value: Long): InlineAlignment = value.asInstanceOf[InlineAlignment]

  /** Every named value, ascending, aliases once. */
  val values: scala.IArray[InlineAlignment] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 8L, 12L, 14L).asInstanceOf[scala.IArray[InlineAlignment]]

  extension (self: InlineAlignment)
    /** The constant's Scala name, or the number for an unnamed value. */
    def name: String = self.asInstanceOf[Long] match {
      case 0L => "TopTo"
      case 1L => "CenterTo"
      case 2L => "BottomTo"
      case 3L => "BaselineTo"
      case 4L => "ToCenter"
      case 5L => "Center"
      case 8L => "ToBaseline"
      case 12L => "ToBottom"
      case 14L => "Bottom"
      case other => other.toString
    }
}


/** Godot enum `EulerOrder`. */
opaque type EulerOrder <: Long = Long

object EulerOrder {
  final val Xyz: EulerOrder = 0L.asInstanceOf[EulerOrder]
  final val Xzy: EulerOrder = 1L.asInstanceOf[EulerOrder]
  final val Yxz: EulerOrder = 2L.asInstanceOf[EulerOrder]
  final val Yzx: EulerOrder = 3L.asInstanceOf[EulerOrder]
  final val Zxy: EulerOrder = 4L.asInstanceOf[EulerOrder]
  final val Zyx: EulerOrder = 5L.asInstanceOf[EulerOrder]

  /** A value from its raw Godot integer. */
  inline def apply(value: Long): EulerOrder = value.asInstanceOf[EulerOrder]

  /** Every named value, ascending, aliases once. */
  val values: scala.IArray[EulerOrder] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L).asInstanceOf[scala.IArray[EulerOrder]]

  extension (self: EulerOrder)
    /** The constant's Scala name, or the number for an unnamed value. */
    def name: String = self.asInstanceOf[Long] match {
      case 0L => "Xyz"
      case 1L => "Xzy"
      case 2L => "Yxz"
      case 3L => "Yzx"
      case 4L => "Zxy"
      case 5L => "Zyx"
      case other => other.toString
    }
}


/** Godot enum `Key`. */
opaque type Key <: Long = Long

object Key {
  final val None: Key = 0L.asInstanceOf[Key]
  final val Special: Key = 4194304L.asInstanceOf[Key]
  final val Escape: Key = 4194305L.asInstanceOf[Key]
  final val Tab: Key = 4194306L.asInstanceOf[Key]
  final val Backtab: Key = 4194307L.asInstanceOf[Key]
  final val Backspace: Key = 4194308L.asInstanceOf[Key]
  final val Enter: Key = 4194309L.asInstanceOf[Key]
  final val KpEnter: Key = 4194310L.asInstanceOf[Key]
  final val Insert: Key = 4194311L.asInstanceOf[Key]
  final val Delete: Key = 4194312L.asInstanceOf[Key]
  final val Pause: Key = 4194313L.asInstanceOf[Key]
  final val Print: Key = 4194314L.asInstanceOf[Key]
  final val Sysreq: Key = 4194315L.asInstanceOf[Key]
  final val Clear: Key = 4194316L.asInstanceOf[Key]
  final val Home: Key = 4194317L.asInstanceOf[Key]
  final val End: Key = 4194318L.asInstanceOf[Key]
  final val Left: Key = 4194319L.asInstanceOf[Key]
  final val Up: Key = 4194320L.asInstanceOf[Key]
  final val Right: Key = 4194321L.asInstanceOf[Key]
  final val Down: Key = 4194322L.asInstanceOf[Key]
  final val Pageup: Key = 4194323L.asInstanceOf[Key]
  final val Pagedown: Key = 4194324L.asInstanceOf[Key]
  final val Shift: Key = 4194325L.asInstanceOf[Key]
  final val Ctrl: Key = 4194326L.asInstanceOf[Key]
  final val Meta: Key = 4194327L.asInstanceOf[Key]
  final val Alt: Key = 4194328L.asInstanceOf[Key]
  final val Capslock: Key = 4194329L.asInstanceOf[Key]
  final val Numlock: Key = 4194330L.asInstanceOf[Key]
  final val Scrolllock: Key = 4194331L.asInstanceOf[Key]
  final val F1: Key = 4194332L.asInstanceOf[Key]
  final val F2: Key = 4194333L.asInstanceOf[Key]
  final val F3: Key = 4194334L.asInstanceOf[Key]
  final val F4: Key = 4194335L.asInstanceOf[Key]
  final val F5: Key = 4194336L.asInstanceOf[Key]
  final val F6: Key = 4194337L.asInstanceOf[Key]
  final val F7: Key = 4194338L.asInstanceOf[Key]
  final val F8: Key = 4194339L.asInstanceOf[Key]
  final val F9: Key = 4194340L.asInstanceOf[Key]
  final val F10: Key = 4194341L.asInstanceOf[Key]
  final val F11: Key = 4194342L.asInstanceOf[Key]
  final val F12: Key = 4194343L.asInstanceOf[Key]
  final val F13: Key = 4194344L.asInstanceOf[Key]
  final val F14: Key = 4194345L.asInstanceOf[Key]
  final val F15: Key = 4194346L.asInstanceOf[Key]
  final val F16: Key = 4194347L.asInstanceOf[Key]
  final val F17: Key = 4194348L.asInstanceOf[Key]
  final val F18: Key = 4194349L.asInstanceOf[Key]
  final val F19: Key = 4194350L.asInstanceOf[Key]
  final val F20: Key = 4194351L.asInstanceOf[Key]
  final val F21: Key = 4194352L.asInstanceOf[Key]
  final val F22: Key = 4194353L.asInstanceOf[Key]
  final val F23: Key = 4194354L.asInstanceOf[Key]
  final val F24: Key = 4194355L.asInstanceOf[Key]
  final val F25: Key = 4194356L.asInstanceOf[Key]
  final val F26: Key = 4194357L.asInstanceOf[Key]
  final val F27: Key = 4194358L.asInstanceOf[Key]
  final val F28: Key = 4194359L.asInstanceOf[Key]
  final val F29: Key = 4194360L.asInstanceOf[Key]
  final val F30: Key = 4194361L.asInstanceOf[Key]
  final val F31: Key = 4194362L.asInstanceOf[Key]
  final val F32: Key = 4194363L.asInstanceOf[Key]
  final val F33: Key = 4194364L.asInstanceOf[Key]
  final val F34: Key = 4194365L.asInstanceOf[Key]
  final val F35: Key = 4194366L.asInstanceOf[Key]
  final val KpMultiply: Key = 4194433L.asInstanceOf[Key]
  final val KpDivide: Key = 4194434L.asInstanceOf[Key]
  final val KpSubtract: Key = 4194435L.asInstanceOf[Key]
  final val KpPeriod: Key = 4194436L.asInstanceOf[Key]
  final val KpAdd: Key = 4194437L.asInstanceOf[Key]
  final val Kp0: Key = 4194438L.asInstanceOf[Key]
  final val Kp1: Key = 4194439L.asInstanceOf[Key]
  final val Kp2: Key = 4194440L.asInstanceOf[Key]
  final val Kp3: Key = 4194441L.asInstanceOf[Key]
  final val Kp4: Key = 4194442L.asInstanceOf[Key]
  final val Kp5: Key = 4194443L.asInstanceOf[Key]
  final val Kp6: Key = 4194444L.asInstanceOf[Key]
  final val Kp7: Key = 4194445L.asInstanceOf[Key]
  final val Kp8: Key = 4194446L.asInstanceOf[Key]
  final val Kp9: Key = 4194447L.asInstanceOf[Key]
  final val Menu: Key = 4194370L.asInstanceOf[Key]
  final val Hyper: Key = 4194371L.asInstanceOf[Key]
  final val Help: Key = 4194373L.asInstanceOf[Key]
  final val Back: Key = 4194376L.asInstanceOf[Key]
  final val Forward: Key = 4194377L.asInstanceOf[Key]
  final val Stop: Key = 4194378L.asInstanceOf[Key]
  final val Refresh: Key = 4194379L.asInstanceOf[Key]
  final val Volumedown: Key = 4194380L.asInstanceOf[Key]
  final val Volumemute: Key = 4194381L.asInstanceOf[Key]
  final val Volumeup: Key = 4194382L.asInstanceOf[Key]
  final val Mediaplay: Key = 4194388L.asInstanceOf[Key]
  final val Mediastop: Key = 4194389L.asInstanceOf[Key]
  final val Mediaprevious: Key = 4194390L.asInstanceOf[Key]
  final val Medianext: Key = 4194391L.asInstanceOf[Key]
  final val Mediarecord: Key = 4194392L.asInstanceOf[Key]
  final val Homepage: Key = 4194393L.asInstanceOf[Key]
  final val Favorites: Key = 4194394L.asInstanceOf[Key]
  final val Search: Key = 4194395L.asInstanceOf[Key]
  final val Standby: Key = 4194396L.asInstanceOf[Key]
  final val Openurl: Key = 4194397L.asInstanceOf[Key]
  final val Launchmail: Key = 4194398L.asInstanceOf[Key]
  final val Launchmedia: Key = 4194399L.asInstanceOf[Key]
  final val Launch0: Key = 4194400L.asInstanceOf[Key]
  final val Launch1: Key = 4194401L.asInstanceOf[Key]
  final val Launch2: Key = 4194402L.asInstanceOf[Key]
  final val Launch3: Key = 4194403L.asInstanceOf[Key]
  final val Launch4: Key = 4194404L.asInstanceOf[Key]
  final val Launch5: Key = 4194405L.asInstanceOf[Key]
  final val Launch6: Key = 4194406L.asInstanceOf[Key]
  final val Launch7: Key = 4194407L.asInstanceOf[Key]
  final val Launch8: Key = 4194408L.asInstanceOf[Key]
  final val Launch9: Key = 4194409L.asInstanceOf[Key]
  final val Launcha: Key = 4194410L.asInstanceOf[Key]
  final val Launchb: Key = 4194411L.asInstanceOf[Key]
  final val Launchc: Key = 4194412L.asInstanceOf[Key]
  final val Launchd: Key = 4194413L.asInstanceOf[Key]
  final val Launche: Key = 4194414L.asInstanceOf[Key]
  final val Launchf: Key = 4194415L.asInstanceOf[Key]
  final val Globe: Key = 4194416L.asInstanceOf[Key]
  final val Keyboard: Key = 4194417L.asInstanceOf[Key]
  final val JisEisu: Key = 4194418L.asInstanceOf[Key]
  final val JisKana: Key = 4194419L.asInstanceOf[Key]
  final val Unknown: Key = 8388607L.asInstanceOf[Key]
  final val Space: Key = 32L.asInstanceOf[Key]
  final val Exclam: Key = 33L.asInstanceOf[Key]
  final val Quotedbl: Key = 34L.asInstanceOf[Key]
  final val Numbersign: Key = 35L.asInstanceOf[Key]
  final val Dollar: Key = 36L.asInstanceOf[Key]
  final val Percent: Key = 37L.asInstanceOf[Key]
  final val Ampersand: Key = 38L.asInstanceOf[Key]
  final val Apostrophe: Key = 39L.asInstanceOf[Key]
  final val Parenleft: Key = 40L.asInstanceOf[Key]
  final val Parenright: Key = 41L.asInstanceOf[Key]
  final val Asterisk: Key = 42L.asInstanceOf[Key]
  final val Plus: Key = 43L.asInstanceOf[Key]
  final val Comma: Key = 44L.asInstanceOf[Key]
  final val Minus: Key = 45L.asInstanceOf[Key]
  final val Period: Key = 46L.asInstanceOf[Key]
  final val Slash: Key = 47L.asInstanceOf[Key]
  final val Key0: Key = 48L.asInstanceOf[Key]
  final val Key1: Key = 49L.asInstanceOf[Key]
  final val Key2: Key = 50L.asInstanceOf[Key]
  final val Key3: Key = 51L.asInstanceOf[Key]
  final val Key4: Key = 52L.asInstanceOf[Key]
  final val Key5: Key = 53L.asInstanceOf[Key]
  final val Key6: Key = 54L.asInstanceOf[Key]
  final val Key7: Key = 55L.asInstanceOf[Key]
  final val Key8: Key = 56L.asInstanceOf[Key]
  final val Key9: Key = 57L.asInstanceOf[Key]
  final val Colon: Key = 58L.asInstanceOf[Key]
  final val Semicolon: Key = 59L.asInstanceOf[Key]
  final val Less: Key = 60L.asInstanceOf[Key]
  final val Equal: Key = 61L.asInstanceOf[Key]
  final val Greater: Key = 62L.asInstanceOf[Key]
  final val Question: Key = 63L.asInstanceOf[Key]
  final val At: Key = 64L.asInstanceOf[Key]
  final val A: Key = 65L.asInstanceOf[Key]
  final val B: Key = 66L.asInstanceOf[Key]
  final val C: Key = 67L.asInstanceOf[Key]
  final val D: Key = 68L.asInstanceOf[Key]
  final val E: Key = 69L.asInstanceOf[Key]
  final val F: Key = 70L.asInstanceOf[Key]
  final val G: Key = 71L.asInstanceOf[Key]
  final val H: Key = 72L.asInstanceOf[Key]
  final val I: Key = 73L.asInstanceOf[Key]
  final val J: Key = 74L.asInstanceOf[Key]
  final val K: Key = 75L.asInstanceOf[Key]
  final val L: Key = 76L.asInstanceOf[Key]
  final val M: Key = 77L.asInstanceOf[Key]
  final val N: Key = 78L.asInstanceOf[Key]
  final val O: Key = 79L.asInstanceOf[Key]
  final val P: Key = 80L.asInstanceOf[Key]
  final val Q: Key = 81L.asInstanceOf[Key]
  final val R: Key = 82L.asInstanceOf[Key]
  final val S: Key = 83L.asInstanceOf[Key]
  final val T: Key = 84L.asInstanceOf[Key]
  final val U: Key = 85L.asInstanceOf[Key]
  final val V: Key = 86L.asInstanceOf[Key]
  final val W: Key = 87L.asInstanceOf[Key]
  final val X: Key = 88L.asInstanceOf[Key]
  final val Y: Key = 89L.asInstanceOf[Key]
  final val Z: Key = 90L.asInstanceOf[Key]
  final val Bracketleft: Key = 91L.asInstanceOf[Key]
  final val Backslash: Key = 92L.asInstanceOf[Key]
  final val Bracketright: Key = 93L.asInstanceOf[Key]
  final val Asciicircum: Key = 94L.asInstanceOf[Key]
  final val Underscore: Key = 95L.asInstanceOf[Key]
  final val Quoteleft: Key = 96L.asInstanceOf[Key]
  final val Braceleft: Key = 123L.asInstanceOf[Key]
  final val Bar: Key = 124L.asInstanceOf[Key]
  final val Braceright: Key = 125L.asInstanceOf[Key]
  final val Asciitilde: Key = 126L.asInstanceOf[Key]
  final val Yen: Key = 165L.asInstanceOf[Key]
  final val Section: Key = 167L.asInstanceOf[Key]

  /** A value from its raw Godot integer. */
  inline def apply(value: Long): Key = value.asInstanceOf[Key]

  /** Every named value, ascending, aliases once. */
  val values: scala.IArray[Key] = scala.IArray[Long](0L, 32L, 33L, 34L, 35L, 36L, 37L, 38L, 39L, 40L, 41L, 42L, 43L, 44L, 45L, 46L, 47L, 48L, 49L, 50L, 51L, 52L, 53L, 54L, 55L, 56L, 57L, 58L, 59L, 60L, 61L, 62L, 63L, 64L, 65L, 66L, 67L, 68L, 69L, 70L, 71L, 72L, 73L, 74L, 75L, 76L, 77L, 78L, 79L, 80L, 81L, 82L, 83L, 84L, 85L, 86L, 87L, 88L, 89L, 90L, 91L, 92L, 93L, 94L, 95L, 96L, 123L, 124L, 125L, 126L, 165L, 167L, 4194304L, 4194305L, 4194306L, 4194307L, 4194308L, 4194309L, 4194310L, 4194311L, 4194312L, 4194313L, 4194314L, 4194315L, 4194316L, 4194317L, 4194318L, 4194319L, 4194320L, 4194321L, 4194322L, 4194323L, 4194324L, 4194325L, 4194326L, 4194327L, 4194328L, 4194329L, 4194330L, 4194331L, 4194332L, 4194333L, 4194334L, 4194335L, 4194336L, 4194337L, 4194338L, 4194339L, 4194340L, 4194341L, 4194342L, 4194343L, 4194344L, 4194345L, 4194346L, 4194347L, 4194348L, 4194349L, 4194350L, 4194351L, 4194352L, 4194353L, 4194354L, 4194355L, 4194356L, 4194357L, 4194358L, 4194359L, 4194360L, 4194361L, 4194362L, 4194363L, 4194364L, 4194365L, 4194366L, 4194370L, 4194371L, 4194373L, 4194376L, 4194377L, 4194378L, 4194379L, 4194380L, 4194381L, 4194382L, 4194388L, 4194389L, 4194390L, 4194391L, 4194392L, 4194393L, 4194394L, 4194395L, 4194396L, 4194397L, 4194398L, 4194399L, 4194400L, 4194401L, 4194402L, 4194403L, 4194404L, 4194405L, 4194406L, 4194407L, 4194408L, 4194409L, 4194410L, 4194411L, 4194412L, 4194413L, 4194414L, 4194415L, 4194416L, 4194417L, 4194418L, 4194419L, 4194433L, 4194434L, 4194435L, 4194436L, 4194437L, 4194438L, 4194439L, 4194440L, 4194441L, 4194442L, 4194443L, 4194444L, 4194445L, 4194446L, 4194447L, 8388607L).asInstanceOf[scala.IArray[Key]]

  extension (self: Key)
    /** The constant's Scala name, or the number for an unnamed value. */
    def name: String = self.asInstanceOf[Long] match {
      case 0L => "None"
      case 32L => "Space"
      case 33L => "Exclam"
      case 34L => "Quotedbl"
      case 35L => "Numbersign"
      case 36L => "Dollar"
      case 37L => "Percent"
      case 38L => "Ampersand"
      case 39L => "Apostrophe"
      case 40L => "Parenleft"
      case 41L => "Parenright"
      case 42L => "Asterisk"
      case 43L => "Plus"
      case 44L => "Comma"
      case 45L => "Minus"
      case 46L => "Period"
      case 47L => "Slash"
      case 48L => "Key0"
      case 49L => "Key1"
      case 50L => "Key2"
      case 51L => "Key3"
      case 52L => "Key4"
      case 53L => "Key5"
      case 54L => "Key6"
      case 55L => "Key7"
      case 56L => "Key8"
      case 57L => "Key9"
      case 58L => "Colon"
      case 59L => "Semicolon"
      case 60L => "Less"
      case 61L => "Equal"
      case 62L => "Greater"
      case 63L => "Question"
      case 64L => "At"
      case 65L => "A"
      case 66L => "B"
      case 67L => "C"
      case 68L => "D"
      case 69L => "E"
      case 70L => "F"
      case 71L => "G"
      case 72L => "H"
      case 73L => "I"
      case 74L => "J"
      case 75L => "K"
      case 76L => "L"
      case 77L => "M"
      case 78L => "N"
      case 79L => "O"
      case 80L => "P"
      case 81L => "Q"
      case 82L => "R"
      case 83L => "S"
      case 84L => "T"
      case 85L => "U"
      case 86L => "V"
      case 87L => "W"
      case 88L => "X"
      case 89L => "Y"
      case 90L => "Z"
      case 91L => "Bracketleft"
      case 92L => "Backslash"
      case 93L => "Bracketright"
      case 94L => "Asciicircum"
      case 95L => "Underscore"
      case 96L => "Quoteleft"
      case 123L => "Braceleft"
      case 124L => "Bar"
      case 125L => "Braceright"
      case 126L => "Asciitilde"
      case 165L => "Yen"
      case 167L => "Section"
      case 4194304L => "Special"
      case 4194305L => "Escape"
      case 4194306L => "Tab"
      case 4194307L => "Backtab"
      case 4194308L => "Backspace"
      case 4194309L => "Enter"
      case 4194310L => "KpEnter"
      case 4194311L => "Insert"
      case 4194312L => "Delete"
      case 4194313L => "Pause"
      case 4194314L => "Print"
      case 4194315L => "Sysreq"
      case 4194316L => "Clear"
      case 4194317L => "Home"
      case 4194318L => "End"
      case 4194319L => "Left"
      case 4194320L => "Up"
      case 4194321L => "Right"
      case 4194322L => "Down"
      case 4194323L => "Pageup"
      case 4194324L => "Pagedown"
      case 4194325L => "Shift"
      case 4194326L => "Ctrl"
      case 4194327L => "Meta"
      case 4194328L => "Alt"
      case 4194329L => "Capslock"
      case 4194330L => "Numlock"
      case 4194331L => "Scrolllock"
      case 4194332L => "F1"
      case 4194333L => "F2"
      case 4194334L => "F3"
      case 4194335L => "F4"
      case 4194336L => "F5"
      case 4194337L => "F6"
      case 4194338L => "F7"
      case 4194339L => "F8"
      case 4194340L => "F9"
      case 4194341L => "F10"
      case 4194342L => "F11"
      case 4194343L => "F12"
      case 4194344L => "F13"
      case 4194345L => "F14"
      case 4194346L => "F15"
      case 4194347L => "F16"
      case 4194348L => "F17"
      case 4194349L => "F18"
      case 4194350L => "F19"
      case 4194351L => "F20"
      case 4194352L => "F21"
      case 4194353L => "F22"
      case 4194354L => "F23"
      case 4194355L => "F24"
      case 4194356L => "F25"
      case 4194357L => "F26"
      case 4194358L => "F27"
      case 4194359L => "F28"
      case 4194360L => "F29"
      case 4194361L => "F30"
      case 4194362L => "F31"
      case 4194363L => "F32"
      case 4194364L => "F33"
      case 4194365L => "F34"
      case 4194366L => "F35"
      case 4194370L => "Menu"
      case 4194371L => "Hyper"
      case 4194373L => "Help"
      case 4194376L => "Back"
      case 4194377L => "Forward"
      case 4194378L => "Stop"
      case 4194379L => "Refresh"
      case 4194380L => "Volumedown"
      case 4194381L => "Volumemute"
      case 4194382L => "Volumeup"
      case 4194388L => "Mediaplay"
      case 4194389L => "Mediastop"
      case 4194390L => "Mediaprevious"
      case 4194391L => "Medianext"
      case 4194392L => "Mediarecord"
      case 4194393L => "Homepage"
      case 4194394L => "Favorites"
      case 4194395L => "Search"
      case 4194396L => "Standby"
      case 4194397L => "Openurl"
      case 4194398L => "Launchmail"
      case 4194399L => "Launchmedia"
      case 4194400L => "Launch0"
      case 4194401L => "Launch1"
      case 4194402L => "Launch2"
      case 4194403L => "Launch3"
      case 4194404L => "Launch4"
      case 4194405L => "Launch5"
      case 4194406L => "Launch6"
      case 4194407L => "Launch7"
      case 4194408L => "Launch8"
      case 4194409L => "Launch9"
      case 4194410L => "Launcha"
      case 4194411L => "Launchb"
      case 4194412L => "Launchc"
      case 4194413L => "Launchd"
      case 4194414L => "Launche"
      case 4194415L => "Launchf"
      case 4194416L => "Globe"
      case 4194417L => "Keyboard"
      case 4194418L => "JisEisu"
      case 4194419L => "JisKana"
      case 4194433L => "KpMultiply"
      case 4194434L => "KpDivide"
      case 4194435L => "KpSubtract"
      case 4194436L => "KpPeriod"
      case 4194437L => "KpAdd"
      case 4194438L => "Kp0"
      case 4194439L => "Kp1"
      case 4194440L => "Kp2"
      case 4194441L => "Kp3"
      case 4194442L => "Kp4"
      case 4194443L => "Kp5"
      case 4194444L => "Kp6"
      case 4194445L => "Kp7"
      case 4194446L => "Kp8"
      case 4194447L => "Kp9"
      case 8388607L => "Unknown"
      case other => other.toString
    }
}


/** Godot bitfield `KeyModifierMask`. */
opaque type KeyModifierMask = Long

object KeyModifierMask {
  final val CodeMask: KeyModifierMask = 8388607L.asInstanceOf[KeyModifierMask]
  final val ModifierMask: KeyModifierMask = 2130706432L.asInstanceOf[KeyModifierMask]
  final val MaskCmdOrCtrl: KeyModifierMask = 16777216L.asInstanceOf[KeyModifierMask]
  final val MaskShift: KeyModifierMask = 33554432L.asInstanceOf[KeyModifierMask]
  final val MaskAlt: KeyModifierMask = 67108864L.asInstanceOf[KeyModifierMask]
  final val MaskMeta: KeyModifierMask = 134217728L.asInstanceOf[KeyModifierMask]
  final val MaskCtrl: KeyModifierMask = 268435456L.asInstanceOf[KeyModifierMask]
  final val MaskKpad: KeyModifierMask = 536870912L.asInstanceOf[KeyModifierMask]
  final val MaskGroupSwitch: KeyModifierMask = 1073741824L.asInstanceOf[KeyModifierMask]

  /** A value from its raw Godot integer. */
  inline def apply(value: Long): KeyModifierMask = value.asInstanceOf[KeyModifierMask]

  /** Every named value, ascending, aliases once. */
  val values: scala.IArray[KeyModifierMask] = scala.IArray[Long](8388607L, 16777216L, 33554432L, 67108864L, 134217728L, 268435456L, 536870912L, 1073741824L, 2130706432L).asInstanceOf[scala.IArray[KeyModifierMask]]

  extension (self: KeyModifierMask)
    /** The constant's Scala name, or the number for an unnamed value. */
    def name: String = self.asInstanceOf[Long] match {
      case 8388607L => "CodeMask"
      case 16777216L => "MaskCmdOrCtrl"
      case 33554432L => "MaskShift"
      case 67108864L => "MaskAlt"
      case 134217728L => "MaskMeta"
      case 268435456L => "MaskCtrl"
      case 536870912L => "MaskKpad"
      case 1073741824L => "MaskGroupSwitch"
      case 2130706432L => "ModifierMask"
      case other => other.toString
    }
  extension (self: KeyModifierMask) {
    inline def value: Long = self.asInstanceOf[Long]
    inline def |(other: KeyModifierMask): KeyModifierMask = (self.value | other.value).asInstanceOf[KeyModifierMask]
    inline def &(other: KeyModifierMask): KeyModifierMask = (self.value & other.value).asInstanceOf[KeyModifierMask]
    /** Every bit of `flag` is set. */
    inline def has(flag: KeyModifierMask): Boolean = (self.value & flag.value) == flag.value
  }
}


/** Godot enum `KeyLocation`. */
opaque type KeyLocation <: Long = Long

object KeyLocation {
  final val Unspecified: KeyLocation = 0L.asInstanceOf[KeyLocation]
  final val Left: KeyLocation = 1L.asInstanceOf[KeyLocation]
  final val Right: KeyLocation = 2L.asInstanceOf[KeyLocation]

  /** A value from its raw Godot integer. */
  inline def apply(value: Long): KeyLocation = value.asInstanceOf[KeyLocation]

  /** Every named value, ascending, aliases once. */
  val values: scala.IArray[KeyLocation] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[KeyLocation]]

  extension (self: KeyLocation)
    /** The constant's Scala name, or the number for an unnamed value. */
    def name: String = self.asInstanceOf[Long] match {
      case 0L => "Unspecified"
      case 1L => "Left"
      case 2L => "Right"
      case other => other.toString
    }
}


/** Godot enum `MouseButton`. */
opaque type MouseButton <: Long = Long

object MouseButton {
  final val None: MouseButton = 0L.asInstanceOf[MouseButton]
  final val Left: MouseButton = 1L.asInstanceOf[MouseButton]
  final val Right: MouseButton = 2L.asInstanceOf[MouseButton]
  final val Middle: MouseButton = 3L.asInstanceOf[MouseButton]
  final val WheelUp: MouseButton = 4L.asInstanceOf[MouseButton]
  final val WheelDown: MouseButton = 5L.asInstanceOf[MouseButton]
  final val WheelLeft: MouseButton = 6L.asInstanceOf[MouseButton]
  final val WheelRight: MouseButton = 7L.asInstanceOf[MouseButton]
  final val Xbutton1: MouseButton = 8L.asInstanceOf[MouseButton]
  final val Xbutton2: MouseButton = 9L.asInstanceOf[MouseButton]

  /** A value from its raw Godot integer. */
  inline def apply(value: Long): MouseButton = value.asInstanceOf[MouseButton]

  /** Every named value, ascending, aliases once. */
  val values: scala.IArray[MouseButton] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L).asInstanceOf[scala.IArray[MouseButton]]

  extension (self: MouseButton)
    /** The constant's Scala name, or the number for an unnamed value. */
    def name: String = self.asInstanceOf[Long] match {
      case 0L => "None"
      case 1L => "Left"
      case 2L => "Right"
      case 3L => "Middle"
      case 4L => "WheelUp"
      case 5L => "WheelDown"
      case 6L => "WheelLeft"
      case 7L => "WheelRight"
      case 8L => "Xbutton1"
      case 9L => "Xbutton2"
      case other => other.toString
    }
}


/** Godot bitfield `MouseButtonMask`. */
opaque type MouseButtonMask = Long

object MouseButtonMask {
  final val Left: MouseButtonMask = 1L.asInstanceOf[MouseButtonMask]
  final val Right: MouseButtonMask = 2L.asInstanceOf[MouseButtonMask]
  final val Middle: MouseButtonMask = 4L.asInstanceOf[MouseButtonMask]
  final val MbXbutton1: MouseButtonMask = 128L.asInstanceOf[MouseButtonMask]
  final val MbXbutton2: MouseButtonMask = 256L.asInstanceOf[MouseButtonMask]

  /** A value from its raw Godot integer. */
  inline def apply(value: Long): MouseButtonMask = value.asInstanceOf[MouseButtonMask]

  /** Every named value, ascending, aliases once. */
  val values: scala.IArray[MouseButtonMask] = scala.IArray[Long](1L, 2L, 4L, 128L, 256L).asInstanceOf[scala.IArray[MouseButtonMask]]

  extension (self: MouseButtonMask)
    /** The constant's Scala name, or the number for an unnamed value. */
    def name: String = self.asInstanceOf[Long] match {
      case 1L => "Left"
      case 2L => "Right"
      case 4L => "Middle"
      case 128L => "MbXbutton1"
      case 256L => "MbXbutton2"
      case other => other.toString
    }
  extension (self: MouseButtonMask) {
    inline def value: Long = self.asInstanceOf[Long]
    inline def |(other: MouseButtonMask): MouseButtonMask = (self.value | other.value).asInstanceOf[MouseButtonMask]
    inline def &(other: MouseButtonMask): MouseButtonMask = (self.value & other.value).asInstanceOf[MouseButtonMask]
    /** Every bit of `flag` is set. */
    inline def has(flag: MouseButtonMask): Boolean = (self.value & flag.value) == flag.value
  }
}


/** Godot enum `JoyButton`. */
opaque type JoyButton <: Long = Long

object JoyButton {
  final val Invalid: JoyButton = -1L.asInstanceOf[JoyButton]
  final val A: JoyButton = 0L.asInstanceOf[JoyButton]
  final val B: JoyButton = 1L.asInstanceOf[JoyButton]
  final val X: JoyButton = 2L.asInstanceOf[JoyButton]
  final val Y: JoyButton = 3L.asInstanceOf[JoyButton]
  final val Back: JoyButton = 4L.asInstanceOf[JoyButton]
  final val Guide: JoyButton = 5L.asInstanceOf[JoyButton]
  final val Start: JoyButton = 6L.asInstanceOf[JoyButton]
  final val LeftStick: JoyButton = 7L.asInstanceOf[JoyButton]
  final val RightStick: JoyButton = 8L.asInstanceOf[JoyButton]
  final val LeftShoulder: JoyButton = 9L.asInstanceOf[JoyButton]
  final val RightShoulder: JoyButton = 10L.asInstanceOf[JoyButton]
  final val DpadUp: JoyButton = 11L.asInstanceOf[JoyButton]
  final val DpadDown: JoyButton = 12L.asInstanceOf[JoyButton]
  final val DpadLeft: JoyButton = 13L.asInstanceOf[JoyButton]
  final val DpadRight: JoyButton = 14L.asInstanceOf[JoyButton]
  final val Misc1: JoyButton = 15L.asInstanceOf[JoyButton]
  final val Paddle1: JoyButton = 16L.asInstanceOf[JoyButton]
  final val Paddle2: JoyButton = 17L.asInstanceOf[JoyButton]
  final val Paddle3: JoyButton = 18L.asInstanceOf[JoyButton]
  final val Paddle4: JoyButton = 19L.asInstanceOf[JoyButton]
  final val Touchpad: JoyButton = 20L.asInstanceOf[JoyButton]
  final val SdlMax: JoyButton = 21L.asInstanceOf[JoyButton]
  final val Max: JoyButton = 128L.asInstanceOf[JoyButton]

  /** A value from its raw Godot integer. */
  inline def apply(value: Long): JoyButton = value.asInstanceOf[JoyButton]

  /** Every named value, ascending, aliases once. */
  val values: scala.IArray[JoyButton] = scala.IArray[Long](-1L, 0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 12L, 13L, 14L, 15L, 16L, 17L, 18L, 19L, 20L, 21L, 128L).asInstanceOf[scala.IArray[JoyButton]]

  extension (self: JoyButton)
    /** The constant's Scala name, or the number for an unnamed value. */
    def name: String = self.asInstanceOf[Long] match {
      case -1L => "Invalid"
      case 0L => "A"
      case 1L => "B"
      case 2L => "X"
      case 3L => "Y"
      case 4L => "Back"
      case 5L => "Guide"
      case 6L => "Start"
      case 7L => "LeftStick"
      case 8L => "RightStick"
      case 9L => "LeftShoulder"
      case 10L => "RightShoulder"
      case 11L => "DpadUp"
      case 12L => "DpadDown"
      case 13L => "DpadLeft"
      case 14L => "DpadRight"
      case 15L => "Misc1"
      case 16L => "Paddle1"
      case 17L => "Paddle2"
      case 18L => "Paddle3"
      case 19L => "Paddle4"
      case 20L => "Touchpad"
      case 21L => "SdlMax"
      case 128L => "Max"
      case other => other.toString
    }
}


/** Godot enum `JoyAxis`. */
opaque type JoyAxis <: Long = Long

object JoyAxis {
  final val Invalid: JoyAxis = -1L.asInstanceOf[JoyAxis]
  final val LeftX: JoyAxis = 0L.asInstanceOf[JoyAxis]
  final val LeftY: JoyAxis = 1L.asInstanceOf[JoyAxis]
  final val RightX: JoyAxis = 2L.asInstanceOf[JoyAxis]
  final val RightY: JoyAxis = 3L.asInstanceOf[JoyAxis]
  final val TriggerLeft: JoyAxis = 4L.asInstanceOf[JoyAxis]
  final val TriggerRight: JoyAxis = 5L.asInstanceOf[JoyAxis]
  final val SdlMax: JoyAxis = 6L.asInstanceOf[JoyAxis]
  final val Max: JoyAxis = 10L.asInstanceOf[JoyAxis]

  /** A value from its raw Godot integer. */
  inline def apply(value: Long): JoyAxis = value.asInstanceOf[JoyAxis]

  /** Every named value, ascending, aliases once. */
  val values: scala.IArray[JoyAxis] = scala.IArray[Long](-1L, 0L, 1L, 2L, 3L, 4L, 5L, 6L, 10L).asInstanceOf[scala.IArray[JoyAxis]]

  extension (self: JoyAxis)
    /** The constant's Scala name, or the number for an unnamed value. */
    def name: String = self.asInstanceOf[Long] match {
      case -1L => "Invalid"
      case 0L => "LeftX"
      case 1L => "LeftY"
      case 2L => "RightX"
      case 3L => "RightY"
      case 4L => "TriggerLeft"
      case 5L => "TriggerRight"
      case 6L => "SdlMax"
      case 10L => "Max"
      case other => other.toString
    }
}


/** Godot enum `MIDIMessage`. */
opaque type MIDIMessage <: Long = Long

object MIDIMessage {
  final val None: MIDIMessage = 0L.asInstanceOf[MIDIMessage]
  final val NoteOff: MIDIMessage = 8L.asInstanceOf[MIDIMessage]
  final val NoteOn: MIDIMessage = 9L.asInstanceOf[MIDIMessage]
  final val Aftertouch: MIDIMessage = 10L.asInstanceOf[MIDIMessage]
  final val ControlChange: MIDIMessage = 11L.asInstanceOf[MIDIMessage]
  final val ProgramChange: MIDIMessage = 12L.asInstanceOf[MIDIMessage]
  final val ChannelPressure: MIDIMessage = 13L.asInstanceOf[MIDIMessage]
  final val PitchBend: MIDIMessage = 14L.asInstanceOf[MIDIMessage]
  final val SystemExclusive: MIDIMessage = 240L.asInstanceOf[MIDIMessage]
  final val QuarterFrame: MIDIMessage = 241L.asInstanceOf[MIDIMessage]
  final val SongPositionPointer: MIDIMessage = 242L.asInstanceOf[MIDIMessage]
  final val SongSelect: MIDIMessage = 243L.asInstanceOf[MIDIMessage]
  final val TuneRequest: MIDIMessage = 246L.asInstanceOf[MIDIMessage]
  final val TimingClock: MIDIMessage = 248L.asInstanceOf[MIDIMessage]
  final val Start: MIDIMessage = 250L.asInstanceOf[MIDIMessage]
  final val Continue: MIDIMessage = 251L.asInstanceOf[MIDIMessage]
  final val Stop: MIDIMessage = 252L.asInstanceOf[MIDIMessage]
  final val ActiveSensing: MIDIMessage = 254L.asInstanceOf[MIDIMessage]
  final val SystemReset: MIDIMessage = 255L.asInstanceOf[MIDIMessage]

  /** A value from its raw Godot integer. */
  inline def apply(value: Long): MIDIMessage = value.asInstanceOf[MIDIMessage]

  /** Every named value, ascending, aliases once. */
  val values: scala.IArray[MIDIMessage] = scala.IArray[Long](0L, 8L, 9L, 10L, 11L, 12L, 13L, 14L, 240L, 241L, 242L, 243L, 246L, 248L, 250L, 251L, 252L, 254L, 255L).asInstanceOf[scala.IArray[MIDIMessage]]

  extension (self: MIDIMessage)
    /** The constant's Scala name, or the number for an unnamed value. */
    def name: String = self.asInstanceOf[Long] match {
      case 0L => "None"
      case 8L => "NoteOff"
      case 9L => "NoteOn"
      case 10L => "Aftertouch"
      case 11L => "ControlChange"
      case 12L => "ProgramChange"
      case 13L => "ChannelPressure"
      case 14L => "PitchBend"
      case 240L => "SystemExclusive"
      case 241L => "QuarterFrame"
      case 242L => "SongPositionPointer"
      case 243L => "SongSelect"
      case 246L => "TuneRequest"
      case 248L => "TimingClock"
      case 250L => "Start"
      case 251L => "Continue"
      case 252L => "Stop"
      case 254L => "ActiveSensing"
      case 255L => "SystemReset"
      case other => other.toString
    }
}


/** Godot enum `Error`. */
opaque type Error <: Long = Long

object Error {
  final val Ok: Error = 0L.asInstanceOf[Error]
  final val Failed: Error = 1L.asInstanceOf[Error]
  final val ErrUnavailable: Error = 2L.asInstanceOf[Error]
  final val ErrUnconfigured: Error = 3L.asInstanceOf[Error]
  final val ErrUnauthorized: Error = 4L.asInstanceOf[Error]
  final val ErrParameterRangeError: Error = 5L.asInstanceOf[Error]
  final val ErrOutOfMemory: Error = 6L.asInstanceOf[Error]
  final val ErrFileNotFound: Error = 7L.asInstanceOf[Error]
  final val ErrFileBadDrive: Error = 8L.asInstanceOf[Error]
  final val ErrFileBadPath: Error = 9L.asInstanceOf[Error]
  final val ErrFileNoPermission: Error = 10L.asInstanceOf[Error]
  final val ErrFileAlreadyInUse: Error = 11L.asInstanceOf[Error]
  final val ErrFileCantOpen: Error = 12L.asInstanceOf[Error]
  final val ErrFileCantWrite: Error = 13L.asInstanceOf[Error]
  final val ErrFileCantRead: Error = 14L.asInstanceOf[Error]
  final val ErrFileUnrecognized: Error = 15L.asInstanceOf[Error]
  final val ErrFileCorrupt: Error = 16L.asInstanceOf[Error]
  final val ErrFileMissingDependencies: Error = 17L.asInstanceOf[Error]
  final val ErrFileEof: Error = 18L.asInstanceOf[Error]
  final val ErrCantOpen: Error = 19L.asInstanceOf[Error]
  final val ErrCantCreate: Error = 20L.asInstanceOf[Error]
  final val ErrQueryFailed: Error = 21L.asInstanceOf[Error]
  final val ErrAlreadyInUse: Error = 22L.asInstanceOf[Error]
  final val ErrLocked: Error = 23L.asInstanceOf[Error]
  final val ErrTimeout: Error = 24L.asInstanceOf[Error]
  final val ErrCantConnect: Error = 25L.asInstanceOf[Error]
  final val ErrCantResolve: Error = 26L.asInstanceOf[Error]
  final val ErrConnectionError: Error = 27L.asInstanceOf[Error]
  final val ErrCantAcquireResource: Error = 28L.asInstanceOf[Error]
  final val ErrCantFork: Error = 29L.asInstanceOf[Error]
  final val ErrInvalidData: Error = 30L.asInstanceOf[Error]
  final val ErrInvalidParameter: Error = 31L.asInstanceOf[Error]
  final val ErrAlreadyExists: Error = 32L.asInstanceOf[Error]
  final val ErrDoesNotExist: Error = 33L.asInstanceOf[Error]
  final val ErrDatabaseCantRead: Error = 34L.asInstanceOf[Error]
  final val ErrDatabaseCantWrite: Error = 35L.asInstanceOf[Error]
  final val ErrCompilationFailed: Error = 36L.asInstanceOf[Error]
  final val ErrMethodNotFound: Error = 37L.asInstanceOf[Error]
  final val ErrLinkFailed: Error = 38L.asInstanceOf[Error]
  final val ErrScriptFailed: Error = 39L.asInstanceOf[Error]
  final val ErrCyclicLink: Error = 40L.asInstanceOf[Error]
  final val ErrInvalidDeclaration: Error = 41L.asInstanceOf[Error]
  final val ErrDuplicateSymbol: Error = 42L.asInstanceOf[Error]
  final val ErrParseError: Error = 43L.asInstanceOf[Error]
  final val ErrBusy: Error = 44L.asInstanceOf[Error]
  final val ErrSkip: Error = 45L.asInstanceOf[Error]
  final val ErrHelp: Error = 46L.asInstanceOf[Error]
  final val ErrBug: Error = 47L.asInstanceOf[Error]
  final val ErrPrinterOnFire: Error = 48L.asInstanceOf[Error]

  /** A value from its raw Godot integer. */
  inline def apply(value: Long): Error = value.asInstanceOf[Error]

  /** Every named value, ascending, aliases once. */
  val values: scala.IArray[Error] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 12L, 13L, 14L, 15L, 16L, 17L, 18L, 19L, 20L, 21L, 22L, 23L, 24L, 25L, 26L, 27L, 28L, 29L, 30L, 31L, 32L, 33L, 34L, 35L, 36L, 37L, 38L, 39L, 40L, 41L, 42L, 43L, 44L, 45L, 46L, 47L, 48L).asInstanceOf[scala.IArray[Error]]

  extension (self: Error)
    /** The constant's Scala name, or the number for an unnamed value. */
    def name: String = self.asInstanceOf[Long] match {
      case 0L => "Ok"
      case 1L => "Failed"
      case 2L => "ErrUnavailable"
      case 3L => "ErrUnconfigured"
      case 4L => "ErrUnauthorized"
      case 5L => "ErrParameterRangeError"
      case 6L => "ErrOutOfMemory"
      case 7L => "ErrFileNotFound"
      case 8L => "ErrFileBadDrive"
      case 9L => "ErrFileBadPath"
      case 10L => "ErrFileNoPermission"
      case 11L => "ErrFileAlreadyInUse"
      case 12L => "ErrFileCantOpen"
      case 13L => "ErrFileCantWrite"
      case 14L => "ErrFileCantRead"
      case 15L => "ErrFileUnrecognized"
      case 16L => "ErrFileCorrupt"
      case 17L => "ErrFileMissingDependencies"
      case 18L => "ErrFileEof"
      case 19L => "ErrCantOpen"
      case 20L => "ErrCantCreate"
      case 21L => "ErrQueryFailed"
      case 22L => "ErrAlreadyInUse"
      case 23L => "ErrLocked"
      case 24L => "ErrTimeout"
      case 25L => "ErrCantConnect"
      case 26L => "ErrCantResolve"
      case 27L => "ErrConnectionError"
      case 28L => "ErrCantAcquireResource"
      case 29L => "ErrCantFork"
      case 30L => "ErrInvalidData"
      case 31L => "ErrInvalidParameter"
      case 32L => "ErrAlreadyExists"
      case 33L => "ErrDoesNotExist"
      case 34L => "ErrDatabaseCantRead"
      case 35L => "ErrDatabaseCantWrite"
      case 36L => "ErrCompilationFailed"
      case 37L => "ErrMethodNotFound"
      case 38L => "ErrLinkFailed"
      case 39L => "ErrScriptFailed"
      case 40L => "ErrCyclicLink"
      case 41L => "ErrInvalidDeclaration"
      case 42L => "ErrDuplicateSymbol"
      case 43L => "ErrParseError"
      case 44L => "ErrBusy"
      case 45L => "ErrSkip"
      case 46L => "ErrHelp"
      case 47L => "ErrBug"
      case 48L => "ErrPrinterOnFire"
      case other => other.toString
    }
}


/** Godot enum `PropertyHint`. */
opaque type PropertyHint <: Long = Long

object PropertyHint {
  final val None: PropertyHint = 0L.asInstanceOf[PropertyHint]
  final val Range: PropertyHint = 1L.asInstanceOf[PropertyHint]
  final val Enum: PropertyHint = 2L.asInstanceOf[PropertyHint]
  final val EnumSuggestion: PropertyHint = 3L.asInstanceOf[PropertyHint]
  final val ExpEasing: PropertyHint = 4L.asInstanceOf[PropertyHint]
  final val Link: PropertyHint = 5L.asInstanceOf[PropertyHint]
  final val Flags: PropertyHint = 6L.asInstanceOf[PropertyHint]
  final val Layers2dRender: PropertyHint = 7L.asInstanceOf[PropertyHint]
  final val Layers2dPhysics: PropertyHint = 8L.asInstanceOf[PropertyHint]
  final val Layers2dNavigation: PropertyHint = 9L.asInstanceOf[PropertyHint]
  final val Layers3dRender: PropertyHint = 10L.asInstanceOf[PropertyHint]
  final val Layers3dPhysics: PropertyHint = 11L.asInstanceOf[PropertyHint]
  final val Layers3dNavigation: PropertyHint = 12L.asInstanceOf[PropertyHint]
  final val LayersAvoidance: PropertyHint = 37L.asInstanceOf[PropertyHint]
  final val File: PropertyHint = 13L.asInstanceOf[PropertyHint]
  final val Dir: PropertyHint = 14L.asInstanceOf[PropertyHint]
  final val GlobalFile: PropertyHint = 15L.asInstanceOf[PropertyHint]
  final val GlobalDir: PropertyHint = 16L.asInstanceOf[PropertyHint]
  final val ResourceType: PropertyHint = 17L.asInstanceOf[PropertyHint]
  final val MultilineText: PropertyHint = 18L.asInstanceOf[PropertyHint]
  final val Expression: PropertyHint = 19L.asInstanceOf[PropertyHint]
  final val PlaceholderText: PropertyHint = 20L.asInstanceOf[PropertyHint]
  final val ColorNoAlpha: PropertyHint = 21L.asInstanceOf[PropertyHint]
  final val ObjectId: PropertyHint = 22L.asInstanceOf[PropertyHint]
  final val TypeString: PropertyHint = 23L.asInstanceOf[PropertyHint]
  final val NodePathToEditedNode: PropertyHint = 24L.asInstanceOf[PropertyHint]
  final val ObjectTooBig: PropertyHint = 25L.asInstanceOf[PropertyHint]
  final val NodePathValidTypes: PropertyHint = 26L.asInstanceOf[PropertyHint]
  final val SaveFile: PropertyHint = 27L.asInstanceOf[PropertyHint]
  final val GlobalSaveFile: PropertyHint = 28L.asInstanceOf[PropertyHint]
  final val IntIsObjectid: PropertyHint = 29L.asInstanceOf[PropertyHint]
  final val IntIsPointer: PropertyHint = 30L.asInstanceOf[PropertyHint]
  final val ArrayType: PropertyHint = 31L.asInstanceOf[PropertyHint]
  final val DictionaryType: PropertyHint = 38L.asInstanceOf[PropertyHint]
  final val LocaleId: PropertyHint = 32L.asInstanceOf[PropertyHint]
  final val LocalizableString: PropertyHint = 33L.asInstanceOf[PropertyHint]
  final val NodeType: PropertyHint = 34L.asInstanceOf[PropertyHint]
  final val HideQuaternionEdit: PropertyHint = 35L.asInstanceOf[PropertyHint]
  final val Password: PropertyHint = 36L.asInstanceOf[PropertyHint]
  final val ToolButton: PropertyHint = 39L.asInstanceOf[PropertyHint]
  final val Oneshot: PropertyHint = 40L.asInstanceOf[PropertyHint]
  final val GroupEnable: PropertyHint = 42L.asInstanceOf[PropertyHint]
  final val InputName: PropertyHint = 43L.asInstanceOf[PropertyHint]
  final val FilePath: PropertyHint = 44L.asInstanceOf[PropertyHint]
  final val Max: PropertyHint = 45L.asInstanceOf[PropertyHint]

  /** A value from its raw Godot integer. */
  inline def apply(value: Long): PropertyHint = value.asInstanceOf[PropertyHint]

  /** Every named value, ascending, aliases once. */
  val values: scala.IArray[PropertyHint] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 12L, 13L, 14L, 15L, 16L, 17L, 18L, 19L, 20L, 21L, 22L, 23L, 24L, 25L, 26L, 27L, 28L, 29L, 30L, 31L, 32L, 33L, 34L, 35L, 36L, 37L, 38L, 39L, 40L, 42L, 43L, 44L, 45L).asInstanceOf[scala.IArray[PropertyHint]]

  extension (self: PropertyHint)
    /** The constant's Scala name, or the number for an unnamed value. */
    def name: String = self.asInstanceOf[Long] match {
      case 0L => "None"
      case 1L => "Range"
      case 2L => "Enum"
      case 3L => "EnumSuggestion"
      case 4L => "ExpEasing"
      case 5L => "Link"
      case 6L => "Flags"
      case 7L => "Layers2dRender"
      case 8L => "Layers2dPhysics"
      case 9L => "Layers2dNavigation"
      case 10L => "Layers3dRender"
      case 11L => "Layers3dPhysics"
      case 12L => "Layers3dNavigation"
      case 13L => "File"
      case 14L => "Dir"
      case 15L => "GlobalFile"
      case 16L => "GlobalDir"
      case 17L => "ResourceType"
      case 18L => "MultilineText"
      case 19L => "Expression"
      case 20L => "PlaceholderText"
      case 21L => "ColorNoAlpha"
      case 22L => "ObjectId"
      case 23L => "TypeString"
      case 24L => "NodePathToEditedNode"
      case 25L => "ObjectTooBig"
      case 26L => "NodePathValidTypes"
      case 27L => "SaveFile"
      case 28L => "GlobalSaveFile"
      case 29L => "IntIsObjectid"
      case 30L => "IntIsPointer"
      case 31L => "ArrayType"
      case 32L => "LocaleId"
      case 33L => "LocalizableString"
      case 34L => "NodeType"
      case 35L => "HideQuaternionEdit"
      case 36L => "Password"
      case 37L => "LayersAvoidance"
      case 38L => "DictionaryType"
      case 39L => "ToolButton"
      case 40L => "Oneshot"
      case 42L => "GroupEnable"
      case 43L => "InputName"
      case 44L => "FilePath"
      case 45L => "Max"
      case other => other.toString
    }
}


/** Godot bitfield `PropertyUsageFlags`. */
opaque type PropertyUsageFlags = Long

object PropertyUsageFlags {
  final val None: PropertyUsageFlags = 0L.asInstanceOf[PropertyUsageFlags]
  final val Storage: PropertyUsageFlags = 2L.asInstanceOf[PropertyUsageFlags]
  final val Editor: PropertyUsageFlags = 4L.asInstanceOf[PropertyUsageFlags]
  final val Internal: PropertyUsageFlags = 8L.asInstanceOf[PropertyUsageFlags]
  final val Checkable: PropertyUsageFlags = 16L.asInstanceOf[PropertyUsageFlags]
  final val Checked: PropertyUsageFlags = 32L.asInstanceOf[PropertyUsageFlags]
  final val Group: PropertyUsageFlags = 64L.asInstanceOf[PropertyUsageFlags]
  final val Category: PropertyUsageFlags = 128L.asInstanceOf[PropertyUsageFlags]
  final val Subgroup: PropertyUsageFlags = 256L.asInstanceOf[PropertyUsageFlags]
  final val ClassIsBitfield: PropertyUsageFlags = 512L.asInstanceOf[PropertyUsageFlags]
  final val NoInstanceState: PropertyUsageFlags = 1024L.asInstanceOf[PropertyUsageFlags]
  final val RestartIfChanged: PropertyUsageFlags = 2048L.asInstanceOf[PropertyUsageFlags]
  final val ScriptVariable: PropertyUsageFlags = 4096L.asInstanceOf[PropertyUsageFlags]
  final val StoreIfNull: PropertyUsageFlags = 8192L.asInstanceOf[PropertyUsageFlags]
  final val UpdateAllIfModified: PropertyUsageFlags = 16384L.asInstanceOf[PropertyUsageFlags]
  final val ScriptDefaultValue: PropertyUsageFlags = 32768L.asInstanceOf[PropertyUsageFlags]
  final val ClassIsEnum: PropertyUsageFlags = 65536L.asInstanceOf[PropertyUsageFlags]
  final val NilIsVariant: PropertyUsageFlags = 131072L.asInstanceOf[PropertyUsageFlags]
  final val Array: PropertyUsageFlags = 262144L.asInstanceOf[PropertyUsageFlags]
  final val AlwaysDuplicate: PropertyUsageFlags = 524288L.asInstanceOf[PropertyUsageFlags]
  final val NeverDuplicate: PropertyUsageFlags = 1048576L.asInstanceOf[PropertyUsageFlags]
  final val HighEndGfx: PropertyUsageFlags = 2097152L.asInstanceOf[PropertyUsageFlags]
  final val NodePathFromSceneRoot: PropertyUsageFlags = 4194304L.asInstanceOf[PropertyUsageFlags]
  final val ResourceNotPersistent: PropertyUsageFlags = 8388608L.asInstanceOf[PropertyUsageFlags]
  final val KeyingIncrements: PropertyUsageFlags = 16777216L.asInstanceOf[PropertyUsageFlags]
  final val DeferredSetResource: PropertyUsageFlags = 33554432L.asInstanceOf[PropertyUsageFlags]
  final val EditorInstantiateObject: PropertyUsageFlags = 67108864L.asInstanceOf[PropertyUsageFlags]
  final val EditorBasicSetting: PropertyUsageFlags = 134217728L.asInstanceOf[PropertyUsageFlags]
  final val ReadOnly: PropertyUsageFlags = 268435456L.asInstanceOf[PropertyUsageFlags]
  final val Secret: PropertyUsageFlags = 536870912L.asInstanceOf[PropertyUsageFlags]
  final val Default: PropertyUsageFlags = 6L.asInstanceOf[PropertyUsageFlags]
  final val NoEditor: PropertyUsageFlags = 2L.asInstanceOf[PropertyUsageFlags]

  /** A value from its raw Godot integer. */
  inline def apply(value: Long): PropertyUsageFlags = value.asInstanceOf[PropertyUsageFlags]

  /** Every named value, ascending, aliases once. */
  val values: scala.IArray[PropertyUsageFlags] = scala.IArray[Long](0L, 2L, 4L, 6L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 65536L, 131072L, 262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 67108864L, 134217728L, 268435456L, 536870912L).asInstanceOf[scala.IArray[PropertyUsageFlags]]

  extension (self: PropertyUsageFlags)
    /** The constant's Scala name, or the number for an unnamed value. */
    def name: String = self.asInstanceOf[Long] match {
      case 0L => "None"
      case 2L => "Storage"
      case 4L => "Editor"
      case 6L => "Default"
      case 8L => "Internal"
      case 16L => "Checkable"
      case 32L => "Checked"
      case 64L => "Group"
      case 128L => "Category"
      case 256L => "Subgroup"
      case 512L => "ClassIsBitfield"
      case 1024L => "NoInstanceState"
      case 2048L => "RestartIfChanged"
      case 4096L => "ScriptVariable"
      case 8192L => "StoreIfNull"
      case 16384L => "UpdateAllIfModified"
      case 32768L => "ScriptDefaultValue"
      case 65536L => "ClassIsEnum"
      case 131072L => "NilIsVariant"
      case 262144L => "Array"
      case 524288L => "AlwaysDuplicate"
      case 1048576L => "NeverDuplicate"
      case 2097152L => "HighEndGfx"
      case 4194304L => "NodePathFromSceneRoot"
      case 8388608L => "ResourceNotPersistent"
      case 16777216L => "KeyingIncrements"
      case 33554432L => "DeferredSetResource"
      case 67108864L => "EditorInstantiateObject"
      case 134217728L => "EditorBasicSetting"
      case 268435456L => "ReadOnly"
      case 536870912L => "Secret"
      case other => other.toString
    }
  extension (self: PropertyUsageFlags) {
    inline def value: Long = self.asInstanceOf[Long]
    inline def |(other: PropertyUsageFlags): PropertyUsageFlags = (self.value | other.value).asInstanceOf[PropertyUsageFlags]
    inline def &(other: PropertyUsageFlags): PropertyUsageFlags = (self.value & other.value).asInstanceOf[PropertyUsageFlags]
    /** Every bit of `flag` is set. */
    inline def has(flag: PropertyUsageFlags): Boolean = (self.value & flag.value) == flag.value
  }
}


/** Godot bitfield `MethodFlags`. */
opaque type MethodFlags = Long

object MethodFlags {
  final val FlagNormal: MethodFlags = 1L.asInstanceOf[MethodFlags]
  final val FlagEditor: MethodFlags = 2L.asInstanceOf[MethodFlags]
  final val FlagConst: MethodFlags = 4L.asInstanceOf[MethodFlags]
  final val FlagVirtual: MethodFlags = 8L.asInstanceOf[MethodFlags]
  final val FlagVararg: MethodFlags = 16L.asInstanceOf[MethodFlags]
  final val FlagStatic: MethodFlags = 32L.asInstanceOf[MethodFlags]
  final val FlagObjectCore: MethodFlags = 64L.asInstanceOf[MethodFlags]
  final val FlagVirtualRequired: MethodFlags = 128L.asInstanceOf[MethodFlags]
  final val FlagsDefault: MethodFlags = 1L.asInstanceOf[MethodFlags]

  /** A value from its raw Godot integer. */
  inline def apply(value: Long): MethodFlags = value.asInstanceOf[MethodFlags]

  /** Every named value, ascending, aliases once. */
  val values: scala.IArray[MethodFlags] = scala.IArray[Long](1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L).asInstanceOf[scala.IArray[MethodFlags]]

  extension (self: MethodFlags)
    /** The constant's Scala name, or the number for an unnamed value. */
    def name: String = self.asInstanceOf[Long] match {
      case 1L => "FlagNormal"
      case 2L => "FlagEditor"
      case 4L => "FlagConst"
      case 8L => "FlagVirtual"
      case 16L => "FlagVararg"
      case 32L => "FlagStatic"
      case 64L => "FlagObjectCore"
      case 128L => "FlagVirtualRequired"
      case other => other.toString
    }
  extension (self: MethodFlags) {
    inline def value: Long = self.asInstanceOf[Long]
    inline def |(other: MethodFlags): MethodFlags = (self.value | other.value).asInstanceOf[MethodFlags]
    inline def &(other: MethodFlags): MethodFlags = (self.value & other.value).asInstanceOf[MethodFlags]
    /** Every bit of `flag` is set. */
    inline def has(flag: MethodFlags): Boolean = (self.value & flag.value) == flag.value
  }
}
