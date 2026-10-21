package gdext.builtin

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import gdext.internal.ffi.types.*
import gdext.internal.ffi.types.GDExtensionVariantType.*

/** Godot's `Rect2`: a `position` and a `size` (16 bytes). */
final case class Rect2(position: Vector2, size: Vector2) {
  def end: Vector2 = position + size

  /** `Rect2 * Transform2D`: the inverse transform of this rect. */
  def *(t: Transform2D): Rect2 = t.xformInv(this)

  def getCenter: Vector2 = position + size * 0.5f
  def getArea: Float = size.x * size.y
  def hasArea: Boolean = size.x > 0f && size.y > 0f

  def hasPoint(point: Vector2): Boolean =
    point.x >= position.x && point.y >= position.y &&
      point.x < position.x + size.x && point.y < position.y + size.y

  def isEqualApprox(rect: Rect2): Boolean =
    position.isEqualApprox(rect.position) && size.isEqualApprox(rect.size)
  def isFinite: Boolean = position.isFinite && size.isFinite

  def intersects(b: Rect2, includeBorders: Boolean = false): Boolean =
    if (includeBorders)
      !(position.x > b.position.x + b.size.x || position.x + size.x < b.position.x ||
        position.y > b.position.y + b.size.y || position.y + size.y < b.position.y)
    else
      !(position.x >= b.position.x + b.size.x || position.x + size.x <= b.position.x ||
        position.y >= b.position.y + b.size.y || position.y + size.y <= b.position.y)

  def encloses(b: Rect2): Boolean =
    b.position.x >= position.x && b.position.y >= position.y &&
      b.position.x + b.size.x <= position.x + size.x &&
      b.position.y + b.size.y <= position.y + size.y

  def intersection(b: Rect2): Rect2 =
    if (!intersects(b)) Rect2(Vector2.ZERO, Vector2.ZERO)
    else {
      val pos = b.position.max(position)
      Rect2(pos, (b.position + b.size).min(position + size) - pos)
    }

  def merge(b: Rect2): Rect2 = {
    val pos = b.position.min(position)
    Rect2(pos, (b.position + b.size).max(position + size) - pos)
  }

  def expand(to: Vector2): Rect2 = {
    val begin = Vector2(math.min(position.x, to.x), math.min(position.y, to.y))
    val e = position + size
    val end = Vector2(math.max(e.x, to.x), math.max(e.y, to.y))
    Rect2(begin, end - begin)
  }

  def getSupport(direction: Vector2): Vector2 =
    Vector2(
      if (direction.x > 0f) position.x + size.x else position.x,
      if (direction.y > 0f) position.y + size.y else position.y
    )

  def grow(amount: Float): Rect2 =
    growIndividual(amount, amount, amount, amount)

  /** `side`: 0 left, 1 top, 2 right, 3 bottom. */
  def growSide(side: Long, amount: Float): Rect2 =
    growIndividual(
      if (side == 0L) amount else 0f,
      if (side == 1L) amount else 0f,
      if (side == 2L) amount else 0f,
      if (side == 3L) amount else 0f
    )

  def growIndividual(
    left: Float,
    top: Float,
    right: Float,
    bottom: Float
  ): Rect2 =
    Rect2(
      Vector2(position.x - left, position.y - top),
      Vector2(size.x + left + right, size.y + top + bottom)
    )

  def abs: Rect2 =
    Rect2(
      Vector2(
        position.x + math.min(size.x, 0f),
        position.y + math.min(size.y, 0f)
      ),
      size.abs
    )
}

object Rect2 {
  def apply(): Rect2 = Rect2(Vector2.ZERO, Vector2.ZERO)
  def apply(x: Float, y: Float, width: Float, height: Float): Rect2 =
    Rect2(Vector2(x, y), Vector2(width, height))
  def apply(r: Rect2i): Rect2 = Rect2(Vector2(r.position), Vector2(r.size))

  private[gdext] inline def writeType(r: Rect2, p: GDExtensionTypePtr): Unit = {
    val f = p.asInstanceOf[Ptr[CFloat]]
    f(0) = r.position.x; f(1) = r.position.y; f(2) = r.size.x; f(3) = r.size.y
  }

  private[gdext] inline def readType(p: GDExtensionTypePtr): Rect2 = {
    val f = p.asInstanceOf[Ptr[CFloat]]
    Rect2(Vector2(f(0), f(1)), Vector2(f(2), f(3)))
  }

  given ToVariant[Rect2] = (value, dest) => {
    val buf = stackalloc[Byte](BuiltinSizes.Rect2.toCSize)
    writeType(value, buf)
    VariantConstructors.fromType(GDEXTENSION_VARIANT_TYPE_RECT2)(dest, buf)
  }

  given FromVariant[Rect2] = variant => {
    val buf = stackalloc[Byte](BuiltinSizes.Rect2.toCSize)
    VariantConstructors.toType(GDEXTENSION_VARIANT_TYPE_RECT2)(buf, variant)
    readType(buf)
  }
}
