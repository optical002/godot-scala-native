package gdext.builtin

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import gdext.internal.ffi.types.*
import gdext.internal.ffi.types.GDExtensionVariantType.*

/** Godot's `AABB`: an axis-aligned box, `position` and `size` (24 bytes). */
final case class AABB(position: Vector3, size: Vector3) {
  def end: Vector3 = position + size

  /** `AABB * Transform3D`: the inverse transform of this box. */
  def *(t: Transform3D): AABB = t.xformInv(this)

  def abs: AABB =
    AABB(
      Vector3(
        position.x + math.min(size.x, 0f),
        position.y + math.min(size.y, 0f),
        position.z + math.min(size.z, 0f)
      ),
      size.abs
    )

  def getCenter: Vector3 = position + size * 0.5f
  def getVolume: Float = size.x * size.y * size.z
  def hasVolume: Boolean = size.x > 0f && size.y > 0f && size.z > 0f
  def hasSurface: Boolean = size.x > 0f || size.y > 0f || size.z > 0f

  def hasPoint(point: Vector3): Boolean =
    point.x >= position.x && point.y >= position.y && point.z >= position.z &&
      point.x <= position.x + size.x && point.y <= position.y + size.y &&
      point.z <= position.z + size.z

  def isEqualApprox(aabb: AABB): Boolean =
    position.isEqualApprox(aabb.position) && size.isEqualApprox(aabb.size)
  def isFinite: Boolean = position.isFinite && size.isFinite

  def intersects(o: AABB): Boolean =
    !(position.x >= o.position.x + o.size.x || position.x + size.x <= o.position.x ||
      position.y >= o.position.y + o.size.y || position.y + size.y <= o.position.y ||
      position.z >= o.position.z + o.size.z || position.z + size.z <= o.position.z)

  def encloses(o: AABB): Boolean = {
    val srcMax = position + size
    val dstMax = o.position + o.size
    position.x <= o.position.x && srcMax.x >= dstMax.x &&
    position.y <= o.position.y && srcMax.y >= dstMax.y &&
    position.z <= o.position.z && srcMax.z >= dstMax.z
  }

  def intersectsPlane(plane: Plane): Boolean = {
    var over = false
    var under = false
    var i = 0
    while (i < 8) {
      if (plane.distanceTo(getEndpoint(i)) > 0f) over = true else under = true
      i += 1
    }
    under && over
  }

  def intersection(o: AABB): AABB = {
    val srcMin = position; val srcMax = position + size
    val dstMin = o.position; val dstMax = o.position + o.size
    if (
      srcMin.x > dstMax.x || srcMax.x < dstMin.x ||
      srcMin.y > dstMax.y || srcMax.y < dstMin.y ||
      srcMin.z > dstMax.z || srcMax.z < dstMin.z
    ) AABB(Vector3.ZERO, Vector3.ZERO)
    else {
      val min = Vector3(
        if (srcMin.x > dstMin.x) srcMin.x else dstMin.x,
        if (srcMin.y > dstMin.y) srcMin.y else dstMin.y,
        if (srcMin.z > dstMin.z) srcMin.z else dstMin.z
      )
      val max = Vector3(
        if (srcMax.x < dstMax.x) srcMax.x else dstMax.x,
        if (srcMax.y < dstMax.y) srcMax.y else dstMax.y,
        if (srcMax.z < dstMax.z) srcMax.z else dstMax.z
      )
      AABB(min, max - min)
    }
  }

  def merge(o: AABB): AABB = {
    val beg1 = position; val beg2 = o.position
    val end1 = size + beg1; val end2 = o.size + beg2
    val min = Vector3(
      if (beg1.x < beg2.x) beg1.x else beg2.x,
      if (beg1.y < beg2.y) beg1.y else beg2.y,
      if (beg1.z < beg2.z) beg1.z else beg2.z
    )
    val max = Vector3(
      if (end1.x > end2.x) end1.x else end2.x,
      if (end1.y > end2.y) end1.y else end2.y,
      if (end1.z > end2.z) end1.z else end2.z
    )
    AABB(min, max - min)
  }

  def expand(toPoint: Vector3): AABB = {
    val e = position + size
    val begin = Vector3(
      math.min(position.x, toPoint.x),
      math.min(position.y, toPoint.y),
      math.min(position.z, toPoint.z)
    )
    val end = Vector3(
      math.max(e.x, toPoint.x),
      math.max(e.y, toPoint.y),
      math.max(e.z, toPoint.z)
    )
    AABB(begin, end - begin)
  }

  def grow(by: Float): AABB =
    AABB(
      Vector3(position.x - by, position.y - by, position.z - by),
      Vector3(size.x + 2.0f * by, size.y + 2.0f * by, size.z + 2.0f * by)
    )

  def getSupport(direction: Vector3): Vector3 =
    Vector3(
      if (direction.x > 0f) position.x + size.x else position.x,
      if (direction.y > 0f) position.y + size.y else position.y,
      if (direction.z > 0f) position.z + size.z else position.z
    )

  def getLongestAxisIndex: Long = {
    var axis = 0L; var maxSize = size.x
    if (size.y > maxSize) { axis = 1L; maxSize = size.y }
    if (size.z > maxSize) axis = 2L
    axis
  }
  def getLongestAxis: Vector3 = getLongestAxisIndex match {
    case 0L => Vector3(1f, 0f, 0f)
    case 1L => Vector3(0f, 1f, 0f)
    case _  => Vector3(0f, 0f, 1f)
  }
  def getLongestAxisSize: Float = math.max(size.x, math.max(size.y, size.z))

  def getShortestAxisIndex: Long = {
    var axis = 0L; var minSize = size.x
    if (size.y < minSize) { axis = 1L; minSize = size.y }
    if (size.z < minSize) axis = 2L
    axis
  }
  def getShortestAxis: Vector3 = getShortestAxisIndex match {
    case 0L => Vector3(1f, 0f, 0f)
    case 1L => Vector3(0f, 1f, 0f)
    case _  => Vector3(0f, 0f, 1f)
  }
  def getShortestAxisSize: Float = math.min(size.x, math.min(size.y, size.z))

  /** Corner `idx` (0-7); bit 2 picks max x, bit 1 max y, bit 0 max z. */
  def getEndpoint(idx: Long): Vector3 = {
    if (idx < 0L || idx > 7L)
      throw new IndexOutOfBoundsException(s"AABB endpoint $idx")
    Vector3(
      if ((idx & 4L) != 0L) position.x + size.x else position.x,
      if ((idx & 2L) != 0L) position.y + size.y else position.y,
      if ((idx & 1L) != 0L) position.z + size.z else position.z
    )
  }

  /** Where the segment `from`-`to` enters this box, if it does. */
  def intersectsSegment(from: Vector3, to: Vector3): Option[Vector3] = {
    var min = 0f
    var max = 1f
    var i = 0
    while (i < 3) {
      val segFrom = from(i)
      val segTo = to(i)
      val boxBegin = position(i)
      val boxEnd = boxBegin + size(i)
      var cmin = 0f
      var cmax = 0f
      if (segFrom < segTo) {
        if (segFrom > boxEnd || segTo < boxBegin) return None
        val length = segTo - segFrom
        cmin = if (segFrom < boxBegin) (boxBegin - segFrom) / length else 0f
        cmax = if (segTo > boxEnd) (boxEnd - segFrom) / length else 1f
      } else {
        if (segTo > boxEnd || segFrom < boxBegin) return None
        val length = segTo - segFrom
        cmin = if (segFrom > boxEnd) (boxEnd - segFrom) / length else 0f
        cmax = if (segTo < boxBegin) (boxBegin - segFrom) / length else 1f
      }
      if (cmin > min) min = cmin
      if (cmax < max) max = cmax
      if (max < min) return None
      i += 1
    }
    Some(from + (to - from) * min)
  }

  /** Where the ray from `from` along `dir` enters this box, if it does. A ray
    * that starts inside reports its entry point behind `from`.
    */
  def intersectsRay(from: Vector3, dir: Vector3): Option[Vector3] = {
    val e = end
    var tmin = -1e20f
    var tmax = 1e20f
    var i = 0
    while (i < 3) {
      if (dir(i) == 0f) {
        if (from(i) < position(i) || from(i) > e(i)) return None
      } else {
        var t1 = (position(i) - from(i)) / dir(i)
        var t2 = (e(i) - from(i)) / dir(i)
        if (t1 > t2) { val t = t1; t1 = t2; t2 = t }
        if (t1 >= tmin) tmin = t1
        if (t2 < tmax) {
          if (t2 < 0f) return None
          tmax = t2
        }
        if (tmin > tmax) return None
      }
      i += 1
    }
    Some(from + dir * tmin)
  }
}

object AABB {
  def apply(): AABB = AABB(Vector3.ZERO, Vector3.ZERO)

  private[gdext] inline def writeType(a: AABB, p: GDExtensionTypePtr): Unit = {
    val f = p.asInstanceOf[Ptr[CFloat]]
    f(0) = a.position.x; f(1) = a.position.y; f(2) = a.position.z
    f(3) = a.size.x; f(4) = a.size.y; f(5) = a.size.z
  }

  private[gdext] inline def readType(p: GDExtensionTypePtr): AABB = {
    val f = p.asInstanceOf[Ptr[CFloat]]
    AABB(Vector3(f(0), f(1), f(2)), Vector3(f(3), f(4), f(5)))
  }

  given ToVariant[AABB] = (value, dest) => {
    val buf = stackalloc[Byte](BuiltinSizes.AABB.toCSize)
    writeType(value, buf)
    VariantConstructors.fromType(GDEXTENSION_VARIANT_TYPE_AABB)(dest, buf)
  }

  given FromVariant[AABB] = variant => {
    val buf = stackalloc[Byte](BuiltinSizes.AABB.toCSize)
    VariantConstructors.toType(GDEXTENSION_VARIANT_TYPE_AABB)(buf, variant)
    readType(buf)
  }
}
