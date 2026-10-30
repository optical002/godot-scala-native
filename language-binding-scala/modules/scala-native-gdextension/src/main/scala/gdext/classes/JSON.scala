package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `JSON`, extends `Resource`. */
abstract class JSON extends Resource {
  override def godotClassName: String = "JSON"

  /** JSON.parse */
  final def parse(jsonText: String, keepText: Boolean = false): gdext.classes.Error = {
    if (gdext.classes.JSON.mb_parse == null) gdext.classes.JSON.mb_parse = MethodBind.get("JSON", "parse", 885841341L)
    gdext.classes.Error(Ptrcall.call2[String, Boolean, Long](gdext.classes.JSON.mb_parse, livePtr, jsonText, keepText))
  }

  /** JSON.get_parsed_text */
  final def getParsedText(): String = {
    if (gdext.classes.JSON.mb_get_parsed_text == null) gdext.classes.JSON.mb_get_parsed_text = MethodBind.get("JSON", "get_parsed_text", 201670096L)
    Ptrcall.call0[String](gdext.classes.JSON.mb_get_parsed_text, livePtr)
  }

  /** JSON.get_error_line */
  final def getErrorLine(): Long = {
    if (gdext.classes.JSON.mb_get_error_line == null) gdext.classes.JSON.mb_get_error_line = MethodBind.get("JSON", "get_error_line", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.JSON.mb_get_error_line, livePtr)
  }

  /** JSON.get_error_message */
  final def getErrorMessage(): String = {
    if (gdext.classes.JSON.mb_get_error_message == null) gdext.classes.JSON.mb_get_error_message = MethodBind.get("JSON", "get_error_message", 201670096L)
    Ptrcall.call0[String](gdext.classes.JSON.mb_get_error_message, livePtr)
  }

}

object JSON {
  private[classes] var mb_parse: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_parsed_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_error_line: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_error_message: GDExtensionMethodBindPtr = null
}
