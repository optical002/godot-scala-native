package io.github.optical002.godot.engine

import scala.scalanative.unsafe.*
import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.StringNames
import io.github.optical002.godot.codegen.gdextensioninterface.types.*

/**
 * Caches per-class "class tags" used by `object_cast_to`.
 *
 * `classdb_get_class_tag(name)` returns an opaque token identifying a class in
 * ClassDB; `object_cast_to(obj, tag)` returns the object if it is-a that class
 * (else null). The tag is stable, so we memoize it per class name.
 */
object ClassTags {
  private val cache =
    new java.util.concurrent.ConcurrentHashMap[String, CVoidPtr]()

  def tag(className: String): CVoidPtr =
    cache.computeIfAbsent(
      className,
      _ =>
        Godot.interface.classdb_get_class_tag(
          StringNames.cached(className).ptr
        )
    )
}
