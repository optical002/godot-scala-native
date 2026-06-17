package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `JSON`, extends `Resource`. */
abstract class JSON extends Resource {

  /** JSON.parse */
  final def parse(json_text: String, keep_text: Boolean): Long =
    Ptrcall.call2[String, Boolean, Long](MethodBind.get("JSON", "parse", 885841341L), hostObject.objectPtr, json_text, keep_text)

  /** JSON.get_parsed_text */
  final def getParsedText(): String =
    Ptrcall.call0[String](MethodBind.get("JSON", "get_parsed_text", 201670096L), hostObject.objectPtr)

  /** JSON.get_error_line */
  final def getErrorLine(): Long =
    Ptrcall.call0[Long](MethodBind.get("JSON", "get_error_line", 3905245786L), hostObject.objectPtr)

  /** JSON.get_error_message */
  final def getErrorMessage(): String =
    Ptrcall.call0[String](MethodBind.get("JSON", "get_error_message", 201670096L), hostObject.objectPtr)

}

object JSON {
  /** Class metadata for Gd[JSON] lifetime management and casting. */
  given GodotClass[JSON] with {
    def className = "JSON"
    def isRefCounted = true
    def wrap(o: GodotObject): JSON = new JSON {}.withHost(o.objectPtr)
    def unwrap(t: JSON): GodotObject = t.hostObject
  }
}
