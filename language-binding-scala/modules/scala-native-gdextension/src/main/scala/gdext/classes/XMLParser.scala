package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `XMLParser`, extends `RefCounted`. */
abstract class XMLParser extends RefCounted {
  override def godotClassName: String = "XMLParser"

  /** XMLParser.read */
  final def read(): gdext.classes.Error = {
    if (gdext.classes.XMLParser.mb_read == null) gdext.classes.XMLParser.mb_read = MethodBind.get("XMLParser", "read", 166280745L)
    gdext.classes.Error(Ptrcall.call0[Long](gdext.classes.XMLParser.mb_read, livePtr))
  }

  /** XMLParser.get_node_type */
  final def getNodeType(): gdext.classes.XMLParser.NodeType = {
    if (gdext.classes.XMLParser.mb_get_node_type == null) gdext.classes.XMLParser.mb_get_node_type = MethodBind.get("XMLParser", "get_node_type", 2984359541L)
    gdext.classes.XMLParser.NodeType(Ptrcall.call0[Long](gdext.classes.XMLParser.mb_get_node_type, livePtr))
  }

  /** XMLParser.get_node_name */
  final def getNodeName(): String = {
    if (gdext.classes.XMLParser.mb_get_node_name == null) gdext.classes.XMLParser.mb_get_node_name = MethodBind.get("XMLParser", "get_node_name", 201670096L)
    Ptrcall.call0[String](gdext.classes.XMLParser.mb_get_node_name, livePtr)
  }

  /** XMLParser.get_node_data */
  final def getNodeData(): String = {
    if (gdext.classes.XMLParser.mb_get_node_data == null) gdext.classes.XMLParser.mb_get_node_data = MethodBind.get("XMLParser", "get_node_data", 201670096L)
    Ptrcall.call0[String](gdext.classes.XMLParser.mb_get_node_data, livePtr)
  }

  /** XMLParser.get_node_offset */
  final def getNodeOffset(): Long = {
    if (gdext.classes.XMLParser.mb_get_node_offset == null) gdext.classes.XMLParser.mb_get_node_offset = MethodBind.get("XMLParser", "get_node_offset", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.XMLParser.mb_get_node_offset, livePtr)
  }

  /** XMLParser.get_attribute_count */
  final def getAttributeCount(): Long = {
    if (gdext.classes.XMLParser.mb_get_attribute_count == null) gdext.classes.XMLParser.mb_get_attribute_count = MethodBind.get("XMLParser", "get_attribute_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.XMLParser.mb_get_attribute_count, livePtr)
  }

  /** XMLParser.get_attribute_name */
  final def getAttributeName(idx: Long): String = {
    if (gdext.classes.XMLParser.mb_get_attribute_name == null) gdext.classes.XMLParser.mb_get_attribute_name = MethodBind.get("XMLParser", "get_attribute_name", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.XMLParser.mb_get_attribute_name, livePtr, idx)
  }

  /** XMLParser.get_attribute_value */
  final def getAttributeValue(idx: Long): String = {
    if (gdext.classes.XMLParser.mb_get_attribute_value == null) gdext.classes.XMLParser.mb_get_attribute_value = MethodBind.get("XMLParser", "get_attribute_value", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.XMLParser.mb_get_attribute_value, livePtr, idx)
  }

  /** XMLParser.has_attribute */
  final def hasAttribute(name: String): Boolean = {
    if (gdext.classes.XMLParser.mb_has_attribute == null) gdext.classes.XMLParser.mb_has_attribute = MethodBind.get("XMLParser", "has_attribute", 3927539163L)
    Ptrcall.call1[String, Boolean](gdext.classes.XMLParser.mb_has_attribute, livePtr, name)
  }

  /** XMLParser.get_named_attribute_value */
  final def getNamedAttributeValue(name: String): String = {
    if (gdext.classes.XMLParser.mb_get_named_attribute_value == null) gdext.classes.XMLParser.mb_get_named_attribute_value = MethodBind.get("XMLParser", "get_named_attribute_value", 3135753539L)
    Ptrcall.call1[String, String](gdext.classes.XMLParser.mb_get_named_attribute_value, livePtr, name)
  }

  /** XMLParser.get_named_attribute_value_safe */
  final def getNamedAttributeValueSafe(name: String): String = {
    if (gdext.classes.XMLParser.mb_get_named_attribute_value_safe == null) gdext.classes.XMLParser.mb_get_named_attribute_value_safe = MethodBind.get("XMLParser", "get_named_attribute_value_safe", 3135753539L)
    Ptrcall.call1[String, String](gdext.classes.XMLParser.mb_get_named_attribute_value_safe, livePtr, name)
  }

  /** XMLParser.is_empty */
  final def isEmpty(): Boolean = {
    if (gdext.classes.XMLParser.mb_is_empty == null) gdext.classes.XMLParser.mb_is_empty = MethodBind.get("XMLParser", "is_empty", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.XMLParser.mb_is_empty, livePtr)
  }

  /** XMLParser.get_current_line */
  final def getCurrentLine(): Long = {
    if (gdext.classes.XMLParser.mb_get_current_line == null) gdext.classes.XMLParser.mb_get_current_line = MethodBind.get("XMLParser", "get_current_line", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.XMLParser.mb_get_current_line, livePtr)
  }

  /** XMLParser.skip_section */
  final def skipSection(): Unit = {
    if (gdext.classes.XMLParser.mb_skip_section == null) gdext.classes.XMLParser.mb_skip_section = MethodBind.get("XMLParser", "skip_section", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.XMLParser.mb_skip_section, livePtr)
  }

  /** XMLParser.seek */
  final def seek(position: Long): gdext.classes.Error = {
    if (gdext.classes.XMLParser.mb_seek == null) gdext.classes.XMLParser.mb_seek = MethodBind.get("XMLParser", "seek", 844576869L)
    gdext.classes.Error(Ptrcall.call1[Long, Long](gdext.classes.XMLParser.mb_seek, livePtr, position))
  }

  /** XMLParser.open */
  final def open(file: String): gdext.classes.Error = {
    if (gdext.classes.XMLParser.mb_open == null) gdext.classes.XMLParser.mb_open = MethodBind.get("XMLParser", "open", 166001499L)
    gdext.classes.Error(Ptrcall.call1[String, Long](gdext.classes.XMLParser.mb_open, livePtr, file))
  }

}

object XMLParser {
  private[classes] var mb_read: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_node_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_node_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_node_data: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_node_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_attribute_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_attribute_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_attribute_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_attribute: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_named_attribute_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_named_attribute_value_safe: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_empty: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_current_line: GDExtensionMethodBindPtr = null
  private[classes] var mb_skip_section: GDExtensionMethodBindPtr = null
  private[classes] var mb_seek: GDExtensionMethodBindPtr = null
  private[classes] var mb_open: GDExtensionMethodBindPtr = null

  /** Godot enum `XMLParser.NodeType`. */
  opaque type NodeType <: Long = Long

  object NodeType {
    final val None: NodeType = 0L.asInstanceOf[NodeType]
    final val Element: NodeType = 1L.asInstanceOf[NodeType]
    final val ElementEnd: NodeType = 2L.asInstanceOf[NodeType]
    final val Text: NodeType = 3L.asInstanceOf[NodeType]
    final val Comment: NodeType = 4L.asInstanceOf[NodeType]
    final val Cdata: NodeType = 5L.asInstanceOf[NodeType]
    final val Unknown: NodeType = 6L.asInstanceOf[NodeType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): NodeType = value.asInstanceOf[NodeType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[NodeType] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L).asInstanceOf[scala.IArray[NodeType]]

    extension (self: NodeType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "None"
        case 1L => "Element"
        case 2L => "ElementEnd"
        case 3L => "Text"
        case 4L => "Comment"
        case 5L => "Cdata"
        case 6L => "Unknown"
        case other => other.toString
      }
  }
}
