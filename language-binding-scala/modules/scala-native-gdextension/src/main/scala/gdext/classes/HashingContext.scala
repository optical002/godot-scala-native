package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `HashingContext`, extends `RefCounted`. */
abstract class HashingContext extends RefCounted {
  override def godotClassName: String = "HashingContext"

  /** HashingContext.start */
  final def start(`type`: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("HashingContext", "start", 3940338335L), hostObject.objectPtr, `type`)

}
