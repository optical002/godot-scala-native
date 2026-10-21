package gdext.builtin

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import gdext.internal.ffi.types.*
import gdext.internal.ffi.types.GDExtensionVariantType.*

/** Godot's `Color`: RGBA as single-precision floats (16 bytes), usually in
  * `0..1`. The named colors (`Color.RED`, `Color.ALICE_BLUE`, ...) come from
  * the engine's API dump; see [[ColorNames]].
  */
final case class Color(r: Float, g: Float, b: Float, a: Float = 1f) {
  def +(o: Color): Color = Color(r + o.r, g + o.g, b + o.b, a + o.a)
  def -(o: Color): Color = Color(r - o.r, g - o.g, b - o.b, a - o.a)
  def *(o: Color): Color = Color(r * o.r, g * o.g, b * o.b, a * o.a)
  def /(o: Color): Color = Color(r / o.r, g / o.g, b / o.b, a / o.a)
  def *(s: Float): Color = Color(r * s, g * s, b * s, a * s)
  def /(s: Float): Color = Color(r / s, g / s, b / s, a / s)

  /** Like GDScript `-color`: every channel, alpha included, becomes `1 - c`. */
  def unary_- : Color = Color(1f - r, 1f - g, 1f - b, 1f - a)
  def unary_+ : Color = this

  private def to8(c: Float): Long =
    (GodotMath.round(c * 255.0f).toInt & 0xff).toLong
  private def to16(c: Float): Long =
    (GodotMath.round(c * 65535.0f).toInt & 0xffff).toLong

  def toArgb32: Long = (to8(a) << 24) | (to8(r) << 16) | (to8(g) << 8) | to8(b)
  def toAbgr32: Long = (to8(a) << 24) | (to8(b) << 16) | (to8(g) << 8) | to8(r)
  def toRgba32: Long = (to8(r) << 24) | (to8(g) << 16) | (to8(b) << 8) | to8(a)
  def toArgb64: Long =
    (to16(a) << 48) | (to16(r) << 32) | (to16(g) << 16) | to16(b)
  def toAbgr64: Long =
    (to16(a) << 48) | (to16(b) << 32) | (to16(g) << 16) | to16(r)
  def toRgba64: Long =
    (to16(r) << 48) | (to16(g) << 32) | (to16(b) << 16) | to16(a)

  def toHtml(withAlpha: Boolean = true): String = {
    def hex(c: Float): String = {
      val v = GodotMath.clamp(GodotMath.round(c * 255.0f).toInt, 0, 255)
      val digits = "0123456789abcdef"
      s"${digits(v >> 4)}${digits(v & 0xf)}"
    }
    hex(r) + hex(g) + hex(b) + (if (withAlpha) hex(a) else "")
  }

  def clamp(
    min: Color = Color(0f, 0f, 0f, 0f),
    max: Color = Color(1f, 1f, 1f, 1f)
  ): Color =
    Color(
      GodotMath.clamp(r, min.r, max.r),
      GodotMath.clamp(g, min.g, max.g),
      GodotMath.clamp(b, min.b, max.b),
      GodotMath.clamp(a, min.a, max.a)
    )

  def inverted: Color = Color(1f - r, 1f - g, 1f - b, a)

  def lerp(to: Color, weight: Float): Color =
    Color(
      GodotMath.lerp(r, to.r, weight),
      GodotMath.lerp(g, to.g, weight),
      GodotMath.lerp(b, to.b, weight),
      GodotMath.lerp(a, to.a, weight)
    )

  def lightened(amount: Float): Color =
    Color(
      r + (1f - r) * amount,
      g + (1f - g) * amount,
      b + (1f - b) * amount,
      a
    )

  def darkened(amount: Float): Color =
    Color(r * (1f - amount), g * (1f - amount), b * (1f - amount), a)

  def blend(over: Color): Color = {
    val sa = 1.0f - over.a
    val ra = a * sa + over.a
    if (ra == 0f) Color(0f, 0f, 0f, 0f)
    else
      Color(
        (r * a * sa + over.r * over.a) / ra,
        (g * a * sa + over.g * over.a) / ra,
        (b * a * sa + over.b * over.a) / ra,
        ra
      )
  }

  def getLuminance: Float = 0.2126f * r + 0.7152f * g + 0.0722f * b

  def srgbToLinear: Color = {
    def f(c: Float): Float =
      if (c < 0.04045f) c * (1.0f / 12.92f)
      else GodotMath.pow(((c + 0.055) * (1.0 / (1.0 + 0.055))).toFloat, 2.4f)
    Color(f(r), f(g), f(b), a)
  }

  def linearToSrgb: Color = {
    def f(c: Float): Float =
      if (c < 0.0031308f) 12.92f * c
      else (1.0f + 0.055f) * GodotMath.pow(c, 1.0f / 2.4f) - 0.055f
    Color(f(r), f(g), f(b), a)
  }

  def isEqualApprox(to: Color): Boolean =
    GodotMath.isEqualApprox(r, to.r) && GodotMath.isEqualApprox(g, to.g) &&
      GodotMath.isEqualApprox(b, to.b) && GodotMath.isEqualApprox(a, to.a)

  // --- derived members (as GDScript's `color.r8`, `color.h`, ...) ---------

  private def c8(c: Float): Long =
    GodotMath.clamp(GodotMath.round(c * 255.0f), 0f, 255f).toLong
  def r8: Long = c8(r)
  def g8: Long = c8(g)
  def b8: Long = c8(b)
  def a8: Long = c8(a)

  /** HSV hue, `0..1`. */
  def h: Float = {
    val min = math.min(math.min(r, g), b)
    val max = math.max(math.max(r, g), b)
    val delta = max - min
    if (delta == 0.0f) 0.0f
    else {
      var hue =
        if (r == max) (g - b) / delta
        else if (g == max) 2 + (b - r) / delta
        else 4 + (r - g) / delta
      hue /= 6.0f
      if (hue < 0.0f) hue += 1.0f
      hue
    }
  }

  /** HSV saturation. */
  def s: Float = {
    val min = math.min(math.min(r, g), b)
    val max = math.max(math.max(r, g), b)
    if (max != 0.0f) (max - min) / max else 0.0f
  }

  /** HSV value. */
  def v: Float = math.max(math.max(r, g), b)

  private def okHsl: (Float, Float, Float) = OkColor.srgbToOkhsl(r, g, b)
  private def okClamp(x: Float): Float =
    if (x.isNaN) 0f else GodotMath.clamp(x, 0f, 1f)
  def okHslH: Float = okClamp(okHsl._1)
  def okHslS: Float = okClamp(okHsl._2)
  def okHslL: Float = okClamp(okHsl._3)
}

object Color {
  export ColorNames.*

  def apply(): Color = Color(0f, 0f, 0f, 1f)
  def apply(c: Color, alpha: Float): Color = Color(c.r, c.g, c.b, alpha)

  /** From an HTML code or a color name (see [[fromString]] / [[html]]). */
  def apply(code: String): Color =
    if (htmlIsValid(code)) html(code) else named(code, Color(0f, 0f, 0f, 1f))
  def apply(code: String, alpha: Float): Color = Color(Color(code), alpha)

  /** From a 32-bit RGBA integer, `0xRRGGBBAA`. */
  def hex(hex: Long): Color = {
    val h = hex & 0xffffffffL
    Color(
      ((h >> 24) & 0xff) / 255.0f,
      ((h >> 16) & 0xff) / 255.0f,
      ((h >> 8) & 0xff) / 255.0f,
      (h & 0xff) / 255.0f
    )
  }

  /** From a 64-bit RGBA integer, 16 bits per channel. */
  def hex64(hex: Long): Color =
    Color(
      ((hex >>> 48) & 0xffff) / 65535.0f,
      ((hex >>> 32) & 0xffff) / 65535.0f,
      ((hex >>> 16) & 0xffff) / 65535.0f,
      (hex & 0xffff) / 65535.0f
    )

  private def hexDigit(c: Char): Int =
    if (c >= '0' && c <= '9') c - '0'
    else if (c >= 'a' && c <= 'f') c - 'a' + 10
    else if (c >= 'A' && c <= 'F') c - 'A' + 10
    else -1

  /** Parse `#RGB`, `#RGBA`, `#RRGGBB` or `#RRGGBBAA` (the `#` is optional). */
  def html(rgba: String): Color = {
    val code = if (rgba.startsWith("#")) rgba.substring(1) else rgba
    if (code.isEmpty) Color(0f, 0f, 0f, 1f)
    else {
      val alpha = code.length == 8 || code.length == 4
      if (
        !(code.length == 3 || code.length == 4 || code.length == 6 || code.length == 8)
      )
        throw new IllegalArgumentException(s"Invalid color code: $rgba.")
      def c4(i: Int) = hexDigit(code(i))
      def c8(i: Int) = {
        val hi = c4(i); val lo = c4(i + 1);
        if (hi < 0 || lo < 0) -1 else hi * 16 + lo
      }
      val (rr, gg, bb, aa) =
        if (code.length < 5)
          (
            c4(0) / 15.0f,
            c4(1) / 15.0f,
            c4(2) / 15.0f,
            if (alpha) c4(3) / 15.0f else 1f
          )
        else
          (
            c8(0) / 255.0f,
            c8(2) / 255.0f,
            c8(4) / 255.0f,
            if (alpha) c8(6) / 255.0f else 1f
          )
      if (rr < 0f || gg < 0f || bb < 0f || aa < 0f)
        throw new IllegalArgumentException(s"Invalid color code: $rgba.")
      Color(rr, gg, bb, aa)
    }
  }

  def htmlIsValid(color: String): Boolean = {
    val code = if (color.startsWith("#")) color.substring(1) else color
    val len = code.length
    (len == 3 || len == 4 || len == 6 || len == 8) && code.forall(c =>
      hexDigit(c) >= 0
    )
  }

  /** An HTML code or a named color (case and `" -_'."` ignored), else
    * `default`.
    */
  def fromString(str: String, default: Color): Color =
    if (htmlIsValid(str)) html(str) else named(str, default)

  def named(name: String, default: Color): Color = {
    val key = name.filterNot(c => " -_'.".indexOf(c) >= 0).toUpperCase
    ColorNames.byNormalizedName.getOrElse(key, default)
  }

  def fromHsv(h: Float, s: Float, v: Float, alpha: Float = 1.0f): Color =
    if (s == 0.0f) Color(v, v, v, alpha)
    else {
      var hh = h * 6.0f
      hh = GodotMath.fmod(hh, 6f)
      val i = GodotMath.floor(hh).toInt
      val f = hh - i
      val p = v * (1.0f - s)
      val q = v * (1.0f - s * f)
      val t = v * (1.0f - s * (1.0f - f))
      i match {
        case 0 => Color(v, t, p, alpha)
        case 1 => Color(q, v, p, alpha)
        case 2 => Color(p, v, t, alpha)
        case 3 => Color(p, q, v, alpha)
        case 4 => Color(t, p, v, alpha)
        case _ => Color(v, p, q, alpha)
      }
    }

  def fromOkHsl(h: Float, s: Float, l: Float, alpha: Float = 1.0f): Color = {
    val (rr, gg, bb) = OkColor.okhslToSrgb(h, s, l)
    Color(rr, gg, bb, alpha).clamp()
  }

  def fromRgbe9995(rgbe: Long): Color = {
    val r = (rgbe & 0x1ff).toFloat
    val g = ((rgbe >> 9) & 0x1ff).toFloat
    val b = ((rgbe >> 18) & 0x1ff).toFloat
    val e = ((rgbe & 0xffffffffL) >> 27).toFloat
    val m = GodotMath.pow(2.0f, e - 15.0f - 9.0f)
    Color(r * m, g * m, b * m, 1.0f)
  }

  def fromRgba8(r8: Long, g8: Long, b8: Long, a8: Long = 255L): Color =
    Color(r8 / 255.0f, g8 / 255.0f, b8 / 255.0f, a8 / 255.0f)

  private[gdext] inline def writeType(c: Color, p: GDExtensionTypePtr): Unit = {
    val f = p.asInstanceOf[Ptr[CFloat]]
    f(0) = c.r; f(1) = c.g; f(2) = c.b; f(3) = c.a
  }

  private[gdext] inline def readType(p: GDExtensionTypePtr): Color = {
    val f = p.asInstanceOf[Ptr[CFloat]]
    Color(f(0), f(1), f(2), f(3))
  }

  given ToVariant[Color] = (value, dest) => {
    val buf = stackalloc[Byte](BuiltinSizes.Color.toCSize)
    writeType(value, buf)
    VariantConstructors.fromType(GDEXTENSION_VARIANT_TYPE_COLOR)(dest, buf)
  }

  given FromVariant[Color] = variant => {
    val buf = stackalloc[Byte](BuiltinSizes.Color.toCSize)
    VariantConstructors.toType(GDEXTENSION_VARIANT_TYPE_COLOR)(buf, variant)
    readType(buf)
  }
}

/** The OKHSL conversions Godot uses (its bundled `ok_color.h` by Björn
  * Ottosson, MIT), in single precision.
  */
private[builtin] object OkColor {
  private final val Pi =
    3.1415926535897932384626433832795028841971693993751058209749445923078164062f

  private def cbrt(x: Float): Float = math.cbrt(x.toDouble).toFloat

  private def srgbTransfer(a: Float): Float =
    if (0.0031308f >= a) 12.92f * a
    else 1.055f * GodotMath.pow(a, 0.4166666666666667f) - 0.055f

  private def srgbTransferInv(a: Float): Float =
    if (0.04045f < a) GodotMath.pow((a + 0.055f) / 1.055f, 2.4f) else a / 12.92f

  private def oklabToLinearSrgb(
    l0: Float,
    a: Float,
    b: Float
  ): (Float, Float, Float) = {
    val l_ = l0 + 0.3963377774f * a + 0.2158037573f * b
    val m_ = l0 - 0.1055613458f * a - 0.0638541728f * b
    val s_ = l0 - 0.0894841775f * a - 1.2914855480f * b
    val l = l_ * l_ * l_; val m = m_ * m_ * m_; val s = s_ * s_ * s_
    (
      4.0767416621f * l - 3.3077115913f * m + 0.2309699292f * s,
      -1.2684380046f * l + 2.6097574011f * m - 0.3413193965f * s,
      -0.0041960863f * l - 0.7034186147f * m + 1.7076147010f * s
    )
  }

  private def linearSrgbToOklab(
    r: Float,
    g: Float,
    b: Float
  ): (Float, Float, Float) = {
    val l = 0.4122214708f * r + 0.5363325363f * g + 0.0514459929f * b
    val m = 0.2119034982f * r + 0.6806995451f * g + 0.1073969566f * b
    val s = 0.0883024619f * r + 0.2817188376f * g + 0.6299787005f * b
    val l_ = cbrt(l); val m_ = cbrt(m); val s_ = cbrt(s)
    (
      0.2104542553f * l_ + 0.7936177850f * m_ - 0.0040720468f * s_,
      1.9779984951f * l_ - 2.4285922050f * m_ + 0.4505937099f * s_,
      0.0259040371f * l_ + 0.7827717662f * m_ - 0.8086757660f * s_
    )
  }

  private def computeMaxSaturation(a: Float, b: Float): Float = {
    val (k0, k1, k2, k3, k4, wl, wm, ws) =
      if (-1.88170328f * a - 0.80936493f * b > 1)
        (1.19086277f, 1.76576728f, 0.59662641f, 0.75515197f, 0.56771245f,
          4.0767416621f, -3.3077115913f, 0.2309699292f)
      else if (1.81444104f * a - 1.19445276f * b > 1)
        (0.73956515f, -0.45954404f, 0.08285427f, 0.12541070f, 0.14503204f,
          -1.2684380046f, 2.6097574011f, -0.3413193965f)
      else
        (1.35733652f, -0.00915799f, -1.15130210f, -0.50559606f, 0.00692167f,
          -0.0041960863f, -0.7034186147f, 1.7076147010f)
    var s = k0 + k1 * a + k2 * b + k3 * a * a + k4 * a * b
    val kL = 0.3963377774f * a + 0.2158037573f * b
    val kM = -0.1055613458f * a - 0.0638541728f * b
    val kS = -0.0894841775f * a - 1.2914855480f * b
    val l_ = 1f + s * kL; val m_ = 1f + s * kM; val s_ = 1f + s * kS
    val l = l_ * l_ * l_; val m = m_ * m_ * m_; val ss = s_ * s_ * s_
    val lDS = 3f * kL * l_ * l_; val mDS = 3f * kM * m_ * m_;
    val sDS = 3f * kS * s_ * s_
    val lDS2 = 6f * kL * kL * l_; val mDS2 = 6f * kM * kM * m_;
    val sDS2 = 6f * kS * kS * s_
    val f = wl * l + wm * m + ws * ss
    val f1 = wl * lDS + wm * mDS + ws * sDS
    val f2 = wl * lDS2 + wm * mDS2 + ws * sDS2
    s - f * f1 / (f1 * f1 - 0.5f * f * f2)
  }

  private def findCusp(a: Float, b: Float): (Float, Float) = {
    val sCusp = computeMaxSaturation(a, b)
    val (rr, gg, bb) = oklabToLinearSrgb(1f, sCusp * a, sCusp * b)
    val lCusp = cbrt(1f / math.max(math.max(rr, gg), bb))
    (lCusp, lCusp * sCusp)
  }

  private def findGamutIntersection(
    a: Float,
    b: Float,
    l1: Float,
    c1: Float,
    l0: Float,
    cuspL: Float,
    cuspC: Float
  ): Float =
    if (((l1 - l0) * cuspC - (cuspL - l0) * c1) <= 0f)
      cuspC * l0 / (c1 * cuspL + cuspC * (l0 - l1))
    else {
      var t = cuspC * (l0 - 1f) / (c1 * (cuspL - 1f) + cuspC * (l0 - l1))
      val dL = l1 - l0; val dC = c1
      val kL = 0.3963377774f * a + 0.2158037573f * b
      val kM = -0.1055613458f * a - 0.0638541728f * b
      val kS = -0.0894841775f * a - 1.2914855480f * b
      val lDt = dL + dC * kL; val mDt = dL + dC * kM; val sDt = dL + dC * kS
      val ll = l0 * (1f - t) + t * l1
      val cc = t * c1
      val l_ = ll + cc * kL; val m_ = ll + cc * kM; val s_ = ll + cc * kS
      val l = l_ * l_ * l_; val m = m_ * m_ * m_; val s = s_ * s_ * s_
      val ldt = 3 * lDt * l_ * l_; val mdt = 3 * mDt * m_ * m_;
      val sdt = 3 * sDt * s_ * s_
      val ldt2 = 6 * lDt * lDt * l_; val mdt2 = 6 * mDt * mDt * m_;
      val sdt2 = 6 * sDt * sDt * s_
      def step(w0: Float, w1: Float, w2: Float): Float = {
        val r = w0 * l + w1 * m + w2 * s - 1
        val r1 = w0 * ldt + w1 * mdt + w2 * sdt
        val r2 = w0 * ldt2 + w1 * mdt2 + w2 * sdt2
        val u = r1 / (r1 * r1 - 0.5f * r * r2)
        if (u >= 0f) -r * u else Float.MaxValue
      }
      val tR = step(4.0767416621f, -3.3077115913f, 0.2309699292f)
      val tG = step(-1.2684380046f, 2.6097574011f, -0.3413193965f)
      val tB = step(-0.0041960863f, -0.7034186147f, 1.7076147010f)
      t += math.min(tR, math.min(tG, tB))
      t
    }

  private final val K1 = 0.206f
  private final val K2 = 0.03f
  private final val K3 = (1f + K1) / (1f + K2)

  private def toe(x: Float): Float =
    0.5f * (K3 * x - K1 + GodotMath.sqrt(
      (K3 * x - K1) * (K3 * x - K1) + 4 * K2 * K3 * x
    ))

  private def toeInv(x: Float): Float = (x * x + K1 * x) / (K3 * (x + K2))

  private def stMid(a: Float, b: Float): (Float, Float) = {
    val s =
      0.11516993f + 1f / (7.44778970f + 4.15901240f * b + a * (-2.19557347f + 1.75198401f * b +
        a * (-2.13704948f - 10.02301043f * b + a * (-4.24894561f + 5.38770819f * b + 4.69891013f * a))))
    val t =
      0.11239642f + 1f / (1.61320320f - 0.68124379f * b + a * (0.40370612f + 0.90148123f * b +
        a * (-0.27087943f + 0.61223990f * b + a * (0.00299215f - 0.45399568f * b - 0.14661872f * a))))
    (s, t)
  }

  /** (C_0, C_mid, C_max). */
  private def getCs(l: Float, a: Float, b: Float): (Float, Float, Float) = {
    val (cuspL, cuspC) = findCusp(a, b)
    val cMax = findGamutIntersection(a, b, l, 1, l, cuspL, cuspC)
    val stMaxS = cuspC / cuspL
    val stMaxT = cuspC / (1 - cuspL)
    val k = cMax / math.min(l * stMaxS, (1 - l) * stMaxT)
    val (midS, midT) = stMid(a, b)
    val ca = l * midS
    val cb = (1f - l) * midT
    val cMid = 0.9f * k * GodotMath.sqrt(
      GodotMath.sqrt(1f / (1f / (ca * ca * ca * ca) + 1f / (cb * cb * cb * cb)))
    )
    val ca0 = l * 0.4f
    val cb0 = (1f - l) * 0.8f
    val c0 = GodotMath.sqrt(1f / (1f / (ca0 * ca0) + 1f / (cb0 * cb0)))
    (c0, cMid, cMax)
  }

  def okhslToSrgb(h: Float, s: Float, l: Float): (Float, Float, Float) =
    if (l == 1.0f) (1f, 1f, 1f)
    else if (l == 0f) (0f, 0f, 0f)
    else {
      val a = GodotMath.cos(2f * Pi * h)
      val b = GodotMath.sin(2f * Pi * h)
      val ll = toeInv(l)
      val (c0, cMid, cMax) = getCs(ll, a, b)
      val mid = 0.8f
      val midInv = 1.25f
      val c =
        if (s < mid) {
          val t = midInv * s
          val k1 = mid * c0
          val k2 = 1f - k1 / cMid
          t * k1 / (1f - k2 * t)
        } else {
          val t = (s - mid) / (1 - mid)
          val k0 = cMid
          val k1 = (1f - mid) * cMid * cMid * midInv * midInv / c0
          val k2 = 1f - k1 / (cMax - cMid)
          k0 + t * k1 / (1f - k2 * t)
        }
      val (rr, gg, bb) = oklabToLinearSrgb(ll, c * a, c * b)
      (srgbTransfer(rr), srgbTransfer(gg), srgbTransfer(bb))
    }

  def srgbToOkhsl(r: Float, g: Float, b: Float): (Float, Float, Float) = {
    val (labL, labA, labB) =
      linearSrgbToOklab(
        srgbTransferInv(r),
        srgbTransferInv(g),
        srgbTransferInv(b)
      )
    val c = GodotMath.sqrt(labA * labA + labB * labB)
    val a_ = labA / c
    val b_ = labB / c
    val h = 0.5f + 0.5f * GodotMath.atan2(-labB, -labA) / Pi
    val (c0, cMid, cMax) = getCs(labL, a_, b_)
    val mid = 0.8f
    val midInv = 1.25f
    val s =
      if (c < cMid) {
        val k1 = mid * c0
        val k2 = 1f - k1 / cMid
        val t = c / (k1 + k2 * c)
        t * mid
      } else {
        val k0 = cMid
        val k1 = (1f - mid) * cMid * cMid * midInv * midInv / c0
        val k2 = 1f - k1 / (cMax - cMid)
        val t = (c - k0) / (k1 + k2 * (c - k0))
        mid + (1f - mid) * t
      }
    (h, s, toe(labL))
  }
}
