package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `RegExMatch`, extends `RefCounted`. */
abstract class RegExMatch extends RefCounted {
  override def godotClassName: String = "RegExMatch"

  /** RegExMatch.get_subject */
  final def getSubject(): String =
    Ptrcall.call0[String](MethodBind.get("RegExMatch", "get_subject", 201670096L), hostObject.objectPtr)

  /** RegExMatch.get_group_count */
  final def getGroupCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("RegExMatch", "get_group_count", 3905245786L), hostObject.objectPtr)

}
