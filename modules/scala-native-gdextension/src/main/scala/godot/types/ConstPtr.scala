package godot.types

import scala.scalanative.unsafe.*

opaque type ConstPtr[T] = Ptr[T]

object ConstPtr {
  extension [T](p: ConstPtr[T])(using Tag[T]) {
    def apply(i: Int): T = p(i)
  }

  def fromPtr[T](p: Ptr[T]): ConstPtr[T] = p
}
