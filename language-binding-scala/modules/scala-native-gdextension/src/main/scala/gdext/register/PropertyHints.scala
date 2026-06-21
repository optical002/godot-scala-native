package gdext.register

/**
 * Godot `PropertyHint` values (subset we emit), pinned from
 * `extension_api.json` global_enums for Godot 4.6.1. The inspector uses these
 * (with `hint_string`) to choose the editing widget for an exported property.
 */
object PropertyHint {
  val None: Int           = 0
  val Range: Int          = 1  // hint_string = "min,max[,step][,extra…]"
  val ExpEasing: Int      = 4  // hint_string = "" | "attenuation" | "positive_only"
  val Enum: Int           = 2
  val File: Int           = 13 // hint_string = file filter, e.g. "*.png"
  val Dir: Int            = 14
  val GlobalFile: Int     = 15 // hint_string = file filter
  val GlobalDir: Int      = 16
  val ResourceType: Int   = 17 // hint_string = resource class name
  val MultilineText: Int  = 18
  val ColorNoAlpha: Int   = 21
  // Typed collections (Array[T], Dictionary[K,V]) use TYPE_STRING with an
  // encoded hint_string — this is what GDScript's @export emits (verified
  // against the live engine), not ARRAY_TYPE/DICTIONARY_TYPE.
  val TypeString: Int     = 23
  val LocaleId: Int       = 32
  val NodeType: Int       = 34 // hint_string = node class name
}

/** Godot `PropertyUsageFlags` (subset). */
object PropertyUsage {
  val None: Int        = 0
  val Storage: Int     = 2
  val Editor: Int      = 4
  val Default: Int     = 6 // STORAGE | EDITOR
  // Inspector section markers (Godot PropertyUsageFlags: GROUP=1<<6, CATEGORY=
  // 1<<7, SUBGROUP=1<<8). Group/Subgroup are normally registered via their
  // dedicated ClassDB calls (which set their own flag); Category has no such
  // call, so it is emitted as a marker property carrying this usage flag.
  val Group: Int       = 64
  val Category: Int    = 128
  val Subgroup: Int    = 256
  val ClassIsEnum: Int = 65536
}
