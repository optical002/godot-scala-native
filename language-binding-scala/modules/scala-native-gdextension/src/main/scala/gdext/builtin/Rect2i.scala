package gdext.builtin

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import gdext.internal.ffi.types.*
import gdext.internal.ffi.types.GDExtensionVariantType.*

/** Godot's `Rect2i`: an integer `position` and `size` (16 bytes). */
final case class Rect2i(position: Vector2i, size: Vector2i) {
  def end: Vector2i = position + size

  def getCenter: Vector2i = position + size / 2
  def getArea: Long = size.x.toLong * size.y
  def hasArea: Boolean = size.x > 0 && size.y > 0

  def hasPoint(point: Vector2i): Boolean =
    point.x >= position.x && point.y >= position.y &&
      point.x < position.x + size.x && point.y < position.y + size.y

  def intersects(b: Rect2i): Boolean =
    !(position.x >= b.position.x + b.size.x || position.x + size.x <= b.position.x ||
      position.y >= b.position.y + b.size.y || position.y + size.y <= b.position.y)

  def encloses(b: Rect2i): Boolean =
    b.position.x >= position.x && b.position.y >= position.y &&
      b.position.x + b.size.x <= position.x + size.x &&
      b.position.y + b.size.y <= position.y + size.y

  def intersection(b: Rect2i): Rect2i =
    if (!intersects(b)) Rect2i(Vector2i.ZERO, Vector2i.ZERO)
    else {
      val pos = b.position.max(position)
      Rect2i(pos, (b.position + b.size).min(position + size) - pos)
    }

  def merge(b: Rect2i): Rect2i = {
    val pos = b.position.min(position)
    Rect2i(pos, (b.position + b.size).max(position + size) - pos)
  }

  def expand(to: Vector2i): Rect2i = {
    val begin = Vector2i(math.min(position.x, to.x), math.min(position.y, to.y))
    val e = position + size
    val end = Vector2i(math.max(e.x, to.x), math.max(e.y, to.y))
    Rect2i(begin, end - begin)
  }

  def grow(amount: Long): Rect2i =
    growIndividual(amount, amount, amount, amount)

  /** `side`: 0 left, 1 top, 2 right, 3 bottom. */
  def growSide(side: Long, amount: Long): Rect2i =
    growIndividual(
      if (side == 0L) amount else 0L,
      if (side == 1L) amount else 0L,
      if (side == 2L) amount else 0L,
      if (side == 3L) amount else 0L
    )

  def growIndividual(left: Long, top: Long, right: Long, bottom: Long): Rect2i =
    Rect2i(
      Vector2i(position.x - left.toInt, position.y - top.toInt),
      Vector2i(size.x + (left + right).toInt, size.y + (top + bottom).toInt)
    )

  def abs: Rect2i =
    Rect2i(
      Vector2i(
        position.x + math.min(size.x, 0),
        position.y + math.min(size.y, 0)
      ),
      size.abs
    )
}

object Rect2i {
  def apply(): Rect2i = Rect2i(Vector2i.ZERO, Vector2i.ZERO)
  def apply(x: Int, y: Int, width: Int, height: Int): Rect2i =
    Rect2i(Vector2i(x, y), Vector2i(width, height))
  def apply(r: Rect2): Rect2i = Rect2i(Vector2i(r.position), Vector2i(r.size))

  private[gdext] inline def writeType(
    r: Rect2i,
    p: GDExtensionTypePtr
  ): Unit = {
    val f = p.asInstanceOf[Ptr[CInt]]
    f(0) = r.position.x; f(1) = r.position.y; f(2) = r.size.x; f(3) = r.size.y
  }

  private[gdext] inline def readType(p: GDExtensionTypePtr): Rect2i = {
    val f = p.asInstanceOf[Ptr[CInt]]
    Rect2i(Vector2i(f(0), f(1)), Vector2i(f(2), f(3)))
  }

  given ToVariant[Rect2i] = (value, dest) => {
    val buf = stackalloc[Byte](BuiltinSizes.Rect2i.toCSize)
    writeType(value, buf)
    VariantConstructors.fromType(GDEXTENSION_VARIANT_TYPE_RECT2I)(dest, buf)
  }

  given FromVariant[Rect2i] = variant => {
    val buf = stackalloc[Byte](BuiltinSizes.Rect2i.toCSize)
    VariantConstructors.toType(GDEXTENSION_VARIANT_TYPE_RECT2I)(buf, variant)
    readType(buf)
  }
}
