package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `XMLParser`, extends `RefCounted`. */
abstract class XMLParser extends RefCounted {

  /** XMLParser.read */
  final def read(): Long =
    Ptrcall.call0[Long](MethodBind.get("XMLParser", "read", 166280745L), hostObject.objectPtr)

  /** XMLParser.get_node_type */
  final def getNodeType(): Long =
    Ptrcall.call0[Long](MethodBind.get("XMLParser", "get_node_type", 2984359541L), hostObject.objectPtr)

  /** XMLParser.get_node_name */
  final def getNodeName(): String =
    Ptrcall.call0[String](MethodBind.get("XMLParser", "get_node_name", 201670096L), hostObject.objectPtr)

  /** XMLParser.get_node_data */
  final def getNodeData(): String =
    Ptrcall.call0[String](MethodBind.get("XMLParser", "get_node_data", 201670096L), hostObject.objectPtr)

  /** XMLParser.get_node_offset */
  final def getNodeOffset(): Long =
    Ptrcall.call0[Long](MethodBind.get("XMLParser", "get_node_offset", 3905245786L), hostObject.objectPtr)

  /** XMLParser.get_attribute_count */
  final def getAttributeCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("XMLParser", "get_attribute_count", 3905245786L), hostObject.objectPtr)

  /** XMLParser.get_attribute_name */
  final def getAttributeName(idx: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("XMLParser", "get_attribute_name", 844755477L), hostObject.objectPtr, idx)

  /** XMLParser.get_attribute_value */
  final def getAttributeValue(idx: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("XMLParser", "get_attribute_value", 844755477L), hostObject.objectPtr, idx)

  /** XMLParser.has_attribute */
  final def hasAttribute(name: String): Boolean =
    Ptrcall.call1[String, Boolean](MethodBind.get("XMLParser", "has_attribute", 3927539163L), hostObject.objectPtr, name)

  /** XMLParser.get_named_attribute_value */
  final def getNamedAttributeValue(name: String): String =
    Ptrcall.call1[String, String](MethodBind.get("XMLParser", "get_named_attribute_value", 3135753539L), hostObject.objectPtr, name)

  /** XMLParser.get_named_attribute_value_safe */
  final def getNamedAttributeValueSafe(name: String): String =
    Ptrcall.call1[String, String](MethodBind.get("XMLParser", "get_named_attribute_value_safe", 3135753539L), hostObject.objectPtr, name)

  /** XMLParser.is_empty */
  final def isEmpty(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("XMLParser", "is_empty", 36873697L), hostObject.objectPtr)

  /** XMLParser.get_current_line */
  final def getCurrentLine(): Long =
    Ptrcall.call0[Long](MethodBind.get("XMLParser", "get_current_line", 3905245786L), hostObject.objectPtr)

  /** XMLParser.skip_section */
  final def skipSection(): Unit =
    Ptrcall.callVoid0(MethodBind.get("XMLParser", "skip_section", 3218959716L), hostObject.objectPtr)

  /** XMLParser.seek */
  final def seek(position: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("XMLParser", "seek", 844576869L), hostObject.objectPtr, position)

  /** XMLParser.open */
  final def open(file: String): Long =
    Ptrcall.call1[String, Long](MethodBind.get("XMLParser", "open", 166001499L), hostObject.objectPtr, file)

}

object XMLParser {
  /** Class metadata for Gd[XMLParser] lifetime management and casting. */
  given GodotClass[XMLParser] with {
    def className = "XMLParser"
    def isRefCounted = true
    def wrap(o: GodotObject): XMLParser = new XMLParser {}.withHost(o.objectPtr)
    def unwrap(t: XMLParser): GodotObject = t.hostObject
  }
}
