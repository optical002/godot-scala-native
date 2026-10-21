package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `RegExMatch`, extends `RefCounted`. */
abstract class RegExMatch extends RefCounted {
  override def godotClassName: String = "RegExMatch"

  /** RegExMatch.get_subject */
  final def getSubject(): String = {
    if (gdext.classes.RegExMatch.mb_get_subject == null) gdext.classes.RegExMatch.mb_get_subject = MethodBind.get("RegExMatch", "get_subject", 201670096L)
    Ptrcall.call0[String](gdext.classes.RegExMatch.mb_get_subject, livePtr)
  }

  /** RegExMatch.get_group_count */
  final def getGroupCount(): Long = {
    if (gdext.classes.RegExMatch.mb_get_group_count == null) gdext.classes.RegExMatch.mb_get_group_count = MethodBind.get("RegExMatch", "get_group_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RegExMatch.mb_get_group_count, livePtr)
  }

}

object RegExMatch {
  private[classes] var mb_get_subject: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_group_count: GDExtensionMethodBindPtr = null
}
