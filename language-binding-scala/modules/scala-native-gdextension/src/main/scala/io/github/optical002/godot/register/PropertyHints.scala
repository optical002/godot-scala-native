package io.github.optical002.godot.register

/**
 * Godot `PropertyHint` values (subset we emit), pinned from
 * `extension_api.json` global_enums for Godot 4.6.1. The inspector uses these
 * (with `hint_string`) to choose the editing widget for an exported property.
 */
object PropertyHint {
  val None: Int           = 0
  val Enum: Int           = 2
  val ResourceType: Int   = 17 // hint_string = resource class name
  // Typed collections (Array[T], Dictionary[K,V]) use TYPE_STRING with an
  // encoded hint_string — this is what GDScript's @export emits (verified
  // against the live engine), not ARRAY_TYPE/DICTIONARY_TYPE.
  val TypeString: Int     = 23
  val NodeType: Int       = 34 // hint_string = node class name
}

/** Godot `PropertyUsageFlags` (subset). */
object PropertyUsage {
  val None: Int        = 0
  val Storage: Int     = 2
  val Editor: Int      = 4
  val Default: Int     = 6 // STORAGE | EDITOR
  val ClassIsEnum: Int = 65536
}
