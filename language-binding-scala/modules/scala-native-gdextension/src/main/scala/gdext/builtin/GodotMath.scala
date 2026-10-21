package gdext.builtin

import scala.scalanative.annotation.alwaysinline

/** Godot's scalar math helpers (`core/math/math_funcs.h`), in single precision
  * like the engine's `real_t`. The math builtins are built on these, so their
  * results match the engine's own implementations.
  */
object GodotMath {
  final val CmpEpsilon = 0.00001f
  final val UnitEpsilon = 0.001f
  final val Pi = math.Pi.toFloat
  final val Tau = (2 * math.Pi).toFloat

  @alwaysinline def sqrt(x: Float): Float = math.sqrt(x.toDouble).toFloat
  @alwaysinline def sin(x: Float): Float = math.sin(x.toDouble).toFloat
  @alwaysinline def cos(x: Float): Float = math.cos(x.toDouble).toFloat
  @alwaysinline def tan(x: Float): Float = math.tan(x.toDouble).toFloat
  @alwaysinline def asin(x: Float): Float = math.asin(x.toDouble).toFloat
  @alwaysinline def acos(x: Float): Float = math.acos(x.toDouble).toFloat
  @alwaysinline def atan(x: Float): Float = math.atan(x.toDouble).toFloat
  @alwaysinline def atan2(y: Float, x: Float): Float =
    math.atan2(y.toDouble, x.toDouble).toFloat
  @alwaysinline def floor(x: Float): Float = math.floor(x.toDouble).toFloat
  @alwaysinline def ceil(x: Float): Float = math.ceil(x.toDouble).toFloat
  @alwaysinline def abs(x: Float): Float = math.abs(x)
  @alwaysinline def pow(x: Float, y: Float): Float =
    math.pow(x.toDouble, y.toDouble).toFloat

  /** `std::round`: halfway cases round away from zero. */
  @alwaysinline def round(x: Float): Float =
    if (x < 0f) -floor(-x + 0.5f) else floor(x + 0.5f)

  /** `SIGN`: 1, -1 or 0. */
  @alwaysinline def sign(x: Float): Float =
    if (x > 0f) 1f else if (x < 0f) -1f else 0f

  @alwaysinline def sign(x: Int): Int = if (x > 0) 1 else if (x < 0) -1 else 0

  @alwaysinline def clamp(x: Float, min: Float, max: Float): Float =
    if (x < min) min else if (x > max) max else x

  @alwaysinline def clamp(x: Int, min: Int, max: Int): Int =
    if (x < min) min else if (x > max) max else x

  @alwaysinline def lerp(from: Float, to: Float, weight: Float): Float =
    from + (to - from) * weight

  def lerpAngle(from: Float, to: Float, weight: Float): Float = {
    val difference = fmod(to - from, Tau)
    val distance = fmod(2.0f * difference, Tau) - difference
    from + distance * weight
  }

  /** C `fmod`: the result has the sign of `x`. */
  @alwaysinline def fmod(x: Float, y: Float): Float = x % y

  /** `Math::fposmod`: like `fmod`, but the result has the sign of `y`. */
  def fposmod(x: Float, y: Float): Float = {
    var value = fmod(x, y)
    if ((value < 0f && y > 0f) || (value > 0f && y < 0f)) value += y
    value + 0.0f
  }

  /** `Math::snapped`: round to the nearest multiple of `step` (0 = no-op). */
  def snapped(value: Float, step: Float): Float =
    if (step != 0f) floor(value / step + 0.5f) * step else value

  /** `Math::snapped` for integers (computed in double, truncated back). */
  def snapped(value: Int, step: Int): Int =
    if (step != 0)
      (math.floor(value.toDouble / step.toDouble + 0.5) * step.toDouble).toInt
    else value

  def isEqualApprox(a: Float, b: Float): Boolean =
    if (a == b) true
    else {
      var tolerance = CmpEpsilon * math.abs(a)
      if (tolerance < CmpEpsilon) tolerance = CmpEpsilon
      math.abs(a - b) < tolerance
    }

  def isEqualApprox(a: Float, b: Float, tolerance: Float): Boolean =
    a == b || math.abs(a - b) < tolerance

  @alwaysinline def isZeroApprox(x: Float): Boolean = math.abs(x) < CmpEpsilon

  @alwaysinline def isFinite(x: Float): Boolean =
    !java.lang.Float.isNaN(x) && !java.lang.Float.isInfinite(x)

  @alwaysinline def degToRad(deg: Double): Double = deg * (math.Pi / 180.0)
  @alwaysinline def radToDeg(rad: Double): Double = rad * (180.0 / math.Pi)

  def cubicInterpolate(
    from: Float,
    to: Float,
    pre: Float,
    post: Float,
    weight: Float
  ): Float =
    0.5f * ((from * 2.0f) + (-pre + to) * weight +
      (2.0f * pre - 5.0f * from + 4.0f * to - post) * (weight * weight) +
      (-pre + 3.0f * from - 3.0f * to + post) * (weight * weight * weight))

  /** Barry-Goldman cubic interpolation with explicit knot times. */
  def cubicInterpolateInTime(
    from: Float,
    to: Float,
    pre: Float,
    post: Float,
    weight: Float,
    toT: Float,
    preT: Float,
    postT: Float
  ): Float = {
    val t = lerp(0.0f, toT, weight)
    val a1 = lerp(pre, from, if (preT == 0f) 0.0f else (t - preT) / -preT)
    val a2 = lerp(from, to, if (toT == 0f) 0.5f else t / toT)
    val a3 =
      lerp(to, post, if (postT - toT == 0f) 1.0f else (t - toT) / (postT - toT))
    val b1 =
      lerp(a1, a2, if (toT - preT == 0f) 0.0f else (t - preT) / (toT - preT))
    val b2 = lerp(a2, a3, if (postT == 0f) 1.0f else t / postT)
    lerp(b1, b2, if (toT == 0f) 0.5f else t / toT)
  }

  def bezierInterpolate(
    start: Float,
    control1: Float,
    control2: Float,
    end: Float,
    t: Float
  ): Float = {
    val omt = 1.0f - t
    val omt2 = omt * omt
    val omt3 = omt2 * omt
    val t2 = t * t
    val t3 = t2 * t
    start * omt3 + control1 * omt2 * t * 3.0f + control2 * omt * t2 * 3.0f + end * t3
  }

  def bezierDerivative(
    start: Float,
    control1: Float,
    control2: Float,
    end: Float,
    t: Float
  ): Float = {
    val omt = 1.0f - t
    val omt2 = omt * omt
    val t2 = t * t
    (control1 - start) * 3.0f * omt2 + (control2 - control1) * 6.0f * omt * t +
      (end - control2) * 3.0f * t2
  }
}
