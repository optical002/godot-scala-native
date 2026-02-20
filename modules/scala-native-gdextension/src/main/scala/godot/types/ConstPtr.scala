package godot.types

import scala.scalanative.unsafe.*

opaque type ConstPtr[T] = Ptr[T]

object ConstPtr {
  given [T](using tag: Tag[T]): Tag[ConstPtr[T]] =
    Tag.Ptr.asInstanceOf[Tag[ConstPtr[T]]]

  given [T]: Conversion[Ptr[T], ConstPtr[T]] = identity

  extension [T](p: ConstPtr[T])(using Tag[T]) {
    def apply(i: Int): T = p(i)
  }

  def fromPtr[T](p: Ptr[T]): ConstPtr[T] = p
}
