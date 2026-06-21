package io.github.optical002.godot.builtin

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import io.github.optical002.godot.Godot
import io.github.optical002.godot.engine.MethodBind
import io.github.optical002.godot.codegen.gdextensioninterface.types.*
import io.github.optical002.godot.codegen.gdextensioninterface.types.GDExtensionVariantType.*

/**
 * Reads a `PackedStringArray` returned by a no-argument engine method into a
 * Scala `Seq[String]`.
 *
 * The code generator drops methods whose return type is `PackedStringArray`
 * (the `Ptrcall` seam has no case for it), so the few we need —
 * `AnimationMixer.get_animation_list`, `SpriteFrames.get_animation_names` — are
 * unreachable through generated wrappers. This is the bespoke reader for them:
 * call the bind via `object_method_bind_ptrcall` into a heap-sized buffer, read
 * the element count via the `PackedStringArray.size` builtin method, then decode
 * each element through `packed_string_array_operator_index` (which hands back an
 * interior pointer to the element String — read it, never destroy it). The array
 * value itself is owned by us and destroyed when done.
 */
object PackedStringArrayRead {
  // PackedStringArray.size hash from extension_api.json (Godot 4.6.1).
  private final val HashSize = 3173160232L

  /** Call a no-arg engine method returning PackedStringArray; decode to Seq. */
  def call0(
    className: String,
    methodName: String,
    hash: Long,
    instance: GDExtensionObjectPtr
  ): Seq[String] = {
    val bind = MethodBind.get(className, methodName, hash)
    // A wrong hash (or a method removed in this engine build) yields a null
    // bind; degrade to an empty list rather than crashing.
    if (bind == null) return Seq.empty
    val psa = stackalloc[Byte](BuiltinSizes.PackedStringArray.toCSize)
    Godot.interface.object_method_bind_ptrcall(bind, instance, null, psa)
    try readAll(psa)
    finally VariantConstructors
      .destructor(GDEXTENSION_VARIANT_TYPE_PACKED_STRING_ARRAY)(psa)
  }

  private def size(psa: GDExtensionTypePtr): Int = {
    val out = stackalloc[GDExtensionInt]()
    BuiltinMethods
      .method(GDEXTENSION_VARIANT_TYPE_PACKED_STRING_ARRAY, "size", HashSize)
      .apply(psa, null, out.asInstanceOf[GDExtensionTypePtr], 0)
    (!out).toInt
  }

  private def readAll(psa: GDExtensionTypePtr): Seq[String] = {
    val n = size(psa)
    val b = Seq.newBuilder[String]
    var i = 0
    while (i < n) {
      // Interior pointer into the array's i-th String — decode, do NOT destroy.
      val strPtr = Godot.interface.packed_string_array_operator_index(psa, i.toLong)
      b += GString.fromPtr(strPtr).toScala
      i += 1
    }
    b.result()
  }
}
