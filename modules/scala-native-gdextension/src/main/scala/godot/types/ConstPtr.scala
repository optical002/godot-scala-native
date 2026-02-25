package godot.types

import scala.scalanative.unsafe.*

// Changed from opaque to transparent type alias so Tag instances can be inferred
type ConstPtr[T] = Ptr[T]

object ConstPtr {
  // Specific conversion for CString to ConstPtr[CChar]
  given cstringToConstPtr: Conversion[CString, ConstPtr[CChar]] = identity
}
