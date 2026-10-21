package game

import scala.collection.mutable

import gdext.builtin.*
import gdext.internal.engine.{Dyn, VariantCall}

/** Inputs, engine calls and comparisons for the generated math parity checks
  * (`game.harness.MathParity*`). Each check draws random inputs in the method's
  * valid domain, runs the Scala implementation and the engine's own through a
  * Variant call, and compares.
  */
object MathParityKit {
  final class Rng(seed: Long) {
    private val r = new scala.util.Random(seed)
    def nextFloat(): Float = r.nextFloat()
    def nextInt(n: Int): Int = r.nextInt(n)
    def nextLong(): Long = r.nextLong()
    def nextBoolean(): Boolean = r.nextBoolean()
  }

  // --- Variant plumbing (every Dyn is freed when the check ends) ----------

  private val live = mutable.ArrayBuffer.empty[Dyn]
  private def keep(d: Dyn): Dyn = { live += d; d }
  def release(): Unit = { live.foreach(_.close()); live.clear() }

  def v[A](a: A)(using tv: ToVariant[A]): Dyn = keep(Dyn.of(a))
  def nil: Dyn = keep(Dyn.nil())
  def call(self: Dyn, method: String, args: Dyn*): Dyn = keep(
    VariantCall.call(self, method, args*)
  )
  def callStatic(sample: Dyn, method: String, args: Dyn*): Dyn =
    keep(VariantCall.callStatic(sample, method, args*))
  def op(code: Int, a: Dyn, b: Dyn): Dyn = keep(
    VariantCall.evaluate(code, a, b)
  )
  def get(self: Dyn, member: String): Dyn = keep(
    VariantCall.getNamed(self, member)
  )
  val Op = VariantCall.Op

  def optVector3(d: Dyn): Option[Vector3] =
    if (d.isNil) None else Some(d.as[Vector3])

  // Instances for static calls, one per type.
  val sampleVector2 = Vector2.ZERO
  val sampleVector2i = Vector2i.ZERO
  val sampleVector3 = Vector3.ZERO
  val sampleVector3i = Vector3i.ZERO
  val sampleVector4 = Vector4.ZERO
  val sampleVector4i = Vector4i.ZERO
  val sampleRect2 = Rect2()
  val sampleRect2i = Rect2i()
  val samplePlane = Plane()
  val sampleQuaternion = Quaternion.IDENTITY
  val sampleAABB = AABB()
  val sampleBasis = Basis.IDENTITY
  val sampleTransform2D = Transform2D.IDENTITY
  val sampleTransform3D = Transform3D.IDENTITY
  val sampleProjection = Projection.IDENTITY
  val sampleColor = Color(0f, 0f, 0f, 1f)

  // --- scalars ------------------------------------------------------------

  def float(r: Rng): Float = r.nextFloat() * 20f - 10f
  def floatNonZero(r: Rng): Float = {
    val f = float(r); if (math.abs(f) < 0.1f) 1.5f else f
  }
  def unit(r: Rng): Float = r.nextFloat()
  def positive(r: Rng): Float = r.nextFloat() * 5f + 0.1f
  def angle(r: Rng): Float = (r.nextFloat() * 2f - 1f) * math.Pi.toFloat
  def range(r: Rng, lo: Float, hi: Float): Float =
    lo + r.nextFloat() * (hi - lo)
  def int(r: Rng): Long = (r.nextInt(201) - 100).toLong
  def intNonZero(r: Rng): Long = { val i = int(r); if (i == 0L) 3L else i }
  def intRange(r: Rng, lo: Int, hi: Int): Long =
    (lo + r.nextInt(hi - lo + 1)).toLong
  def uint32(r: Rng): Long = r.nextLong() & 0xffffffffL
  def long(r: Rng): Long = r.nextLong()
  def bool(r: Rng): Boolean = r.nextBoolean()

  // --- vectors ------------------------------------------------------------

  def vector2(r: Rng): Vector2 = Vector2(float(r), float(r))
  def vector2n(r: Rng): Vector2 = vector2(r).normalized
  def unitVector2(r: Rng): Vector2 = Vector2(unit(r), unit(r))
  def vector3(r: Rng): Vector3 = Vector3(float(r), float(r), float(r))
  def vector3n(r: Rng): Vector3 = vector3(r).normalized
  def vector4(r: Rng): Vector4 = Vector4(float(r), float(r), float(r), float(r))
  private def i(r: Rng): Int = r.nextInt(201) - 100
  private def inz(r: Rng): Int = { val v = i(r); if (v == 0) 7 else v }
  def vector2i(r: Rng): Vector2i = Vector2i(i(r), i(r))
  def vector2iNonZero(r: Rng): Vector2i = Vector2i(inz(r), inz(r))
  def vector3i(r: Rng): Vector3i = Vector3i(i(r), i(r), i(r))
  def vector3iNonZero(r: Rng): Vector3i = Vector3i(inz(r), inz(r), inz(r))
  def vector4i(r: Rng): Vector4i = Vector4i(i(r), i(r), i(r), i(r))
  def vector4iNonZero(r: Rng): Vector4i =
    Vector4i(inz(r), inz(r), inz(r), inz(r))

  /** A positive step of the same shape as `like` (for snapped / posmodv). */
  def stepOf(r: Rng, like: Vector2): Vector2 = Vector2(positive(r), positive(r))
  def stepOf(r: Rng, like: Vector3): Vector3 =
    Vector3(positive(r), positive(r), positive(r))
  def stepOf(r: Rng, like: Vector4): Vector4 =
    Vector4(positive(r), positive(r), positive(r), positive(r))
  private def istep(r: Rng): Int = 1 + r.nextInt(10)
  def stepOf(r: Rng, like: Vector2i): Vector2i = Vector2i(istep(r), istep(r))
  def stepOf(r: Rng, like: Vector3i): Vector3i =
    Vector3i(istep(r), istep(r), istep(r))
  def stepOf(r: Rng, like: Vector4i): Vector4i =
    Vector4i(istep(r), istep(r), istep(r), istep(r))

  // --- composites ---------------------------------------------------------

  def rect2(r: Rng): Rect2 =
    Rect2(vector2(r), Vector2(positive(r), positive(r)))
  def rect2i(r: Rng): Rect2i =
    Rect2i(vector2i(r), Vector2i(1 + r.nextInt(50), 1 + r.nextInt(50)))
  def aABB(r: Rng): AABB =
    AABB(vector3(r), Vector3(positive(r), positive(r), positive(r)))
  def plane(r: Rng): Plane = Plane(vector3n(r), float(r))
  def quaternion(r: Rng): Quaternion = {
    val q = Quaternion(float(r), float(r), float(r), float(r))
    q.normalized
  }
  def basisRotation(r: Rng): Basis = Basis(quaternion(r))
  def basis(r: Rng): Basis =
    basisRotation(r).scaled(
      Vector3(range(r, 0.5f, 2f), range(r, 0.5f, 2f), range(r, 0.5f, 2f))
    )
  def transform3D(r: Rng): Transform3D = Transform3D(basis(r), vector3(r))
  def transform2D(r: Rng): Transform2D =
    Transform2D(
      angle(r),
      Vector2(range(r, 0.5f, 2f), range(r, 0.5f, 2f)),
      range(r, -0.3f, 0.3f),
      vector2(r)
    )
  def projection(r: Rng): Projection =
    Projection.createPerspective(
      range(r, 30f, 100f),
      range(r, 0.5f, 2f),
      range(r, 0.05f, 1f),
      range(r, 10f, 500f)
    )
  def color(r: Rng): Color = Color(unit(r), unit(r), unit(r), unit(r))

  def htmlCode(r: Rng): String = color(r).toHtml(r.nextBoolean())
  def maybeHtml(r: Rng): String =
    r.nextInt(4) match {
      case 0 => "#" + htmlCode(r)
      case 1 => htmlCode(r)
      case 2 => "#12x"
      case _ => "abcd"
    }
  private val someNames =
    Seq("red", "Alice Blue", "dark-olive_green", "WHITE", "not a color")
  def colorString(r: Rng): String =
    if (r.nextBoolean()) htmlCode(r) else someNames(r.nextInt(someNames.size))

  // --- comparison ---------------------------------------------------------

  trait Near[A] { def near(a: A, b: A): Boolean }
  private def nearF(a: Float, b: Float): Boolean =
    (a.isNaN && b.isNaN) || a == b ||
      math
        .abs(a - b) <= 2e-3f * math.max(1f, math.max(math.abs(a), math.abs(b)))
  given Near[Float] = nearF(_, _)
  given Near[Long] = _ == _
  given Near[Boolean] = _ == _
  given Near[String] = _ == _
  given Near[Vector2] = (a, b) => nearF(a.x, b.x) && nearF(a.y, b.y)
  given Near[Vector3] = (a, b) =>
    nearF(a.x, b.x) && nearF(a.y, b.y) && nearF(a.z, b.z)
  given Near[Vector4] = (a, b) =>
    nearF(a.x, b.x) && nearF(a.y, b.y) && nearF(a.z, b.z) && nearF(a.w, b.w)
  given Near[Vector2i] = _ == _
  given Near[Vector3i] = _ == _
  given Near[Vector4i] = _ == _
  given Near[Rect2i] = _ == _
  given Near[Rect2] = (a, b) =>
    summon[Near[Vector2]].near(a.position, b.position) && summon[Near[Vector2]]
      .near(a.size, b.size)
  given Near[AABB] = (a, b) =>
    summon[Near[Vector3]].near(a.position, b.position) && summon[Near[Vector3]]
      .near(a.size, b.size)
  given Near[Plane] = (a, b) =>
    summon[Near[Vector3]].near(a.normal, b.normal) && nearF(a.d, b.d)
  given Near[Quaternion] = (a, b) =>
    nearF(a.x, b.x) && nearF(a.y, b.y) && nearF(a.z, b.z) && nearF(a.w, b.w)
  given Near[Basis] = (a, b) =>
    summon[Near[Vector3]].near(a.x, b.x) && summon[Near[Vector3]]
      .near(a.y, b.y) &&
      summon[Near[Vector3]].near(a.z, b.z)
  given Near[Transform2D] = (a, b) =>
    summon[Near[Vector2]].near(a.x, b.x) && summon[Near[Vector2]]
      .near(a.y, b.y) &&
      summon[Near[Vector2]].near(a.origin, b.origin)
  given Near[Transform3D] = (a, b) =>
    summon[Near[Basis]].near(a.basis, b.basis) && summon[Near[Vector3]]
      .near(a.origin, b.origin)
  given Near[Projection] = (a, b) =>
    a.toArray.zip(b.toArray).forall((x, y) => nearF(x, y))
  given Near[Color] = (a, b) =>
    nearF(a.r, b.r) && nearF(a.g, b.g) && nearF(a.b, b.b) && nearF(a.a, b.a)
  given Near[Option[Vector3]] = (a, b) =>
    (a, b) match {
      case (Some(x), Some(y)) => summon[Near[Vector3]].near(x, y)
      case (None, None)       => true
      case _                  => false
    }

  /** "" when `scala` matches `engine`, else a description of the mismatch. */
  def same[A](label: String, scala: A, engine: A)(using n: Near[A]): String =
    if (n.near(scala, engine)) "" else s"$label: scala=$scala engine=$engine"

  /** Integer vector members are `Int` in Scala and `int` (64-bit) in the
    * engine.
    */
  def same(label: String, scala: Int, engine: Long): String =
    if (scala.toLong == engine) "" else s"$label: scala=$scala engine=$engine"

  /** Run `check` on `trials` seeds; "" on success, else the first failure. */
  def run(label: String, check: Rng => String, trials: Int): String = {
    var t = 0
    var out = ""
    while (t < trials && out.isEmpty) {
      out =
        try check(new Rng(label.hashCode.toLong * 1000003L + t))
        catch {
          case e: Throwable =>
            s"$label: ${e.getClass.getSimpleName}: ${e.getMessage}"
        } finally release()
      t += 1
    }
    out
  }
}
