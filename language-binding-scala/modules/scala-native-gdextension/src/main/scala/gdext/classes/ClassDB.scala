package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ClassDB`, extends `Object`. */
abstract class ClassDB extends Object {
  override def godotClassName: String = "ClassDB"

  /** ClassDB.get_parent_class */
  final def getParentClass(`class`: String): String = {
    if (gdext.classes.ClassDB.mb_get_parent_class == null) gdext.classes.ClassDB.mb_get_parent_class = MethodBind.get("ClassDB", "get_parent_class", 1965194235L)
    Ptrcall.call1[SnArg, SnArg](gdext.classes.ClassDB.mb_get_parent_class, livePtr, SnArg(`class`))
  }

  /** ClassDB.class_exists */
  final def classExists(`class`: String): Boolean = {
    if (gdext.classes.ClassDB.mb_class_exists == null) gdext.classes.ClassDB.mb_class_exists = MethodBind.get("ClassDB", "class_exists", 2619796661L)
    Ptrcall.call1[SnArg, Boolean](gdext.classes.ClassDB.mb_class_exists, livePtr, SnArg(`class`))
  }

  /** ClassDB.is_parent_class */
  final def isParentClass(`class`: String, inherits: String): Boolean = {
    if (gdext.classes.ClassDB.mb_is_parent_class == null) gdext.classes.ClassDB.mb_is_parent_class = MethodBind.get("ClassDB", "is_parent_class", 471820014L)
    Ptrcall.call2[SnArg, SnArg, Boolean](gdext.classes.ClassDB.mb_is_parent_class, livePtr, SnArg(`class`), SnArg(inherits))
  }

  /** ClassDB.can_instantiate */
  final def canInstantiate(`class`: String): Boolean = {
    if (gdext.classes.ClassDB.mb_can_instantiate == null) gdext.classes.ClassDB.mb_can_instantiate = MethodBind.get("ClassDB", "can_instantiate", 2619796661L)
    Ptrcall.call1[SnArg, Boolean](gdext.classes.ClassDB.mb_can_instantiate, livePtr, SnArg(`class`))
  }

  /** ClassDB.class_get_api_type */
  final def classGetApiType(`class`: String): gdext.classes.ClassDB.APIType = {
    if (gdext.classes.ClassDB.mb_class_get_api_type == null) gdext.classes.ClassDB.mb_class_get_api_type = MethodBind.get("ClassDB", "class_get_api_type", 2475317043L)
    gdext.classes.ClassDB.APIType(Ptrcall.call1[SnArg, Long](gdext.classes.ClassDB.mb_class_get_api_type, livePtr, SnArg(`class`)))
  }

  /** ClassDB.class_has_signal */
  final def classHasSignal(`class`: String, signal: String): Boolean = {
    if (gdext.classes.ClassDB.mb_class_has_signal == null) gdext.classes.ClassDB.mb_class_has_signal = MethodBind.get("ClassDB", "class_has_signal", 471820014L)
    Ptrcall.call2[SnArg, SnArg, Boolean](gdext.classes.ClassDB.mb_class_has_signal, livePtr, SnArg(`class`), SnArg(signal))
  }

  /** ClassDB.class_get_property_getter */
  final def classGetPropertyGetter(`class`: String, property: String): String = {
    if (gdext.classes.ClassDB.mb_class_get_property_getter == null) gdext.classes.ClassDB.mb_class_get_property_getter = MethodBind.get("ClassDB", "class_get_property_getter", 3770832642L)
    Ptrcall.call2[SnArg, SnArg, SnArg](gdext.classes.ClassDB.mb_class_get_property_getter, livePtr, SnArg(`class`), SnArg(property))
  }

  /** ClassDB.class_get_property_setter */
  final def classGetPropertySetter(`class`: String, property: String): String = {
    if (gdext.classes.ClassDB.mb_class_get_property_setter == null) gdext.classes.ClassDB.mb_class_get_property_setter = MethodBind.get("ClassDB", "class_get_property_setter", 3770832642L)
    Ptrcall.call2[SnArg, SnArg, SnArg](gdext.classes.ClassDB.mb_class_get_property_setter, livePtr, SnArg(`class`), SnArg(property))
  }

  /** ClassDB.class_has_method */
  final def classHasMethod(`class`: String, method: String, noInheritance: Boolean = false): Boolean = {
    if (gdext.classes.ClassDB.mb_class_has_method == null) gdext.classes.ClassDB.mb_class_has_method = MethodBind.get("ClassDB", "class_has_method", 3860701026L)
    Ptrcall.call3[SnArg, SnArg, Boolean, Boolean](gdext.classes.ClassDB.mb_class_has_method, livePtr, SnArg(`class`), SnArg(method), noInheritance)
  }

  /** ClassDB.class_get_method_argument_count */
  final def classGetMethodArgumentCount(`class`: String, method: String, noInheritance: Boolean = false): Long = {
    if (gdext.classes.ClassDB.mb_class_get_method_argument_count == null) gdext.classes.ClassDB.mb_class_get_method_argument_count = MethodBind.get("ClassDB", "class_get_method_argument_count", 3885694822L)
    Ptrcall.call3[SnArg, SnArg, Boolean, Long](gdext.classes.ClassDB.mb_class_get_method_argument_count, livePtr, SnArg(`class`), SnArg(method), noInheritance)
  }

  /** ClassDB.class_has_integer_constant */
  final def classHasIntegerConstant(`class`: String, name: String): Boolean = {
    if (gdext.classes.ClassDB.mb_class_has_integer_constant == null) gdext.classes.ClassDB.mb_class_has_integer_constant = MethodBind.get("ClassDB", "class_has_integer_constant", 471820014L)
    Ptrcall.call2[SnArg, SnArg, Boolean](gdext.classes.ClassDB.mb_class_has_integer_constant, livePtr, SnArg(`class`), SnArg(name))
  }

  /** ClassDB.class_get_integer_constant */
  final def classGetIntegerConstant(`class`: String, name: String): Long = {
    if (gdext.classes.ClassDB.mb_class_get_integer_constant == null) gdext.classes.ClassDB.mb_class_get_integer_constant = MethodBind.get("ClassDB", "class_get_integer_constant", 2419549490L)
    Ptrcall.call2[SnArg, SnArg, Long](gdext.classes.ClassDB.mb_class_get_integer_constant, livePtr, SnArg(`class`), SnArg(name))
  }

  /** ClassDB.class_has_enum */
  final def classHasEnum(`class`: String, name: String, noInheritance: Boolean = false): Boolean = {
    if (gdext.classes.ClassDB.mb_class_has_enum == null) gdext.classes.ClassDB.mb_class_has_enum = MethodBind.get("ClassDB", "class_has_enum", 3860701026L)
    Ptrcall.call3[SnArg, SnArg, Boolean, Boolean](gdext.classes.ClassDB.mb_class_has_enum, livePtr, SnArg(`class`), SnArg(name), noInheritance)
  }

  /** ClassDB.class_get_integer_constant_enum */
  final def classGetIntegerConstantEnum(`class`: String, name: String, noInheritance: Boolean = false): String = {
    if (gdext.classes.ClassDB.mb_class_get_integer_constant_enum == null) gdext.classes.ClassDB.mb_class_get_integer_constant_enum = MethodBind.get("ClassDB", "class_get_integer_constant_enum", 2457504236L)
    Ptrcall.call3[SnArg, SnArg, Boolean, SnArg](gdext.classes.ClassDB.mb_class_get_integer_constant_enum, livePtr, SnArg(`class`), SnArg(name), noInheritance)
  }

  /** ClassDB.is_class_enum_bitfield */
  final def isClassEnumBitfield(`class`: String, `enum`: String, noInheritance: Boolean = false): Boolean = {
    if (gdext.classes.ClassDB.mb_is_class_enum_bitfield == null) gdext.classes.ClassDB.mb_is_class_enum_bitfield = MethodBind.get("ClassDB", "is_class_enum_bitfield", 3860701026L)
    Ptrcall.call3[SnArg, SnArg, Boolean, Boolean](gdext.classes.ClassDB.mb_is_class_enum_bitfield, livePtr, SnArg(`class`), SnArg(`enum`), noInheritance)
  }

  /** ClassDB.is_class_enabled */
  final def isClassEnabled(`class`: String): Boolean = {
    if (gdext.classes.ClassDB.mb_is_class_enabled == null) gdext.classes.ClassDB.mb_is_class_enabled = MethodBind.get("ClassDB", "is_class_enabled", 2619796661L)
    Ptrcall.call1[SnArg, Boolean](gdext.classes.ClassDB.mb_is_class_enabled, livePtr, SnArg(`class`))
  }

}

object ClassDB {
  private[classes] var mb_get_parent_class: GDExtensionMethodBindPtr = null
  private[classes] var mb_class_exists: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_parent_class: GDExtensionMethodBindPtr = null
  private[classes] var mb_can_instantiate: GDExtensionMethodBindPtr = null
  private[classes] var mb_class_get_api_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_class_has_signal: GDExtensionMethodBindPtr = null
  private[classes] var mb_class_get_property_getter: GDExtensionMethodBindPtr = null
  private[classes] var mb_class_get_property_setter: GDExtensionMethodBindPtr = null
  private[classes] var mb_class_has_method: GDExtensionMethodBindPtr = null
  private[classes] var mb_class_get_method_argument_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_class_has_integer_constant: GDExtensionMethodBindPtr = null
  private[classes] var mb_class_get_integer_constant: GDExtensionMethodBindPtr = null
  private[classes] var mb_class_has_enum: GDExtensionMethodBindPtr = null
  private[classes] var mb_class_get_integer_constant_enum: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_class_enum_bitfield: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_class_enabled: GDExtensionMethodBindPtr = null

  private var instance: ClassDB = null

  /** The process-global ClassDB singleton instance. */
  def singleton: ClassDB = {
    if (instance == null)
      instance = Wrappers.borrowed[ClassDB](GodotObject.fromPtr(
        Godot.interface.global_get_singleton(StringNames.cached("ClassDB").ptr)))
    instance
  }

  /** Forwards to [[singleton]]: ClassDB.get_parent_class */
  final def getParentClass(`class`: String): String =
    singleton.getParentClass(`class`)

  /** Forwards to [[singleton]]: ClassDB.class_exists */
  final def classExists(`class`: String): Boolean =
    singleton.classExists(`class`)

  /** Forwards to [[singleton]]: ClassDB.is_parent_class */
  final def isParentClass(`class`: String, inherits: String): Boolean =
    singleton.isParentClass(`class`, inherits)

  /** Forwards to [[singleton]]: ClassDB.can_instantiate */
  final def canInstantiate(`class`: String): Boolean =
    singleton.canInstantiate(`class`)

  /** Forwards to [[singleton]]: ClassDB.class_get_api_type */
  final def classGetApiType(`class`: String): gdext.classes.ClassDB.APIType =
    singleton.classGetApiType(`class`)

  /** Forwards to [[singleton]]: ClassDB.class_has_signal */
  final def classHasSignal(`class`: String, signal: String): Boolean =
    singleton.classHasSignal(`class`, signal)

  /** Forwards to [[singleton]]: ClassDB.class_get_property_getter */
  final def classGetPropertyGetter(`class`: String, property: String): String =
    singleton.classGetPropertyGetter(`class`, property)

  /** Forwards to [[singleton]]: ClassDB.class_get_property_setter */
  final def classGetPropertySetter(`class`: String, property: String): String =
    singleton.classGetPropertySetter(`class`, property)

  /** Forwards to [[singleton]]: ClassDB.class_has_method */
  final def classHasMethod(`class`: String, method: String, noInheritance: Boolean = false): Boolean =
    singleton.classHasMethod(`class`, method, noInheritance)

  /** Forwards to [[singleton]]: ClassDB.class_get_method_argument_count */
  final def classGetMethodArgumentCount(`class`: String, method: String, noInheritance: Boolean = false): Long =
    singleton.classGetMethodArgumentCount(`class`, method, noInheritance)

  /** Forwards to [[singleton]]: ClassDB.class_has_integer_constant */
  final def classHasIntegerConstant(`class`: String, name: String): Boolean =
    singleton.classHasIntegerConstant(`class`, name)

  /** Forwards to [[singleton]]: ClassDB.class_get_integer_constant */
  final def classGetIntegerConstant(`class`: String, name: String): Long =
    singleton.classGetIntegerConstant(`class`, name)

  /** Forwards to [[singleton]]: ClassDB.class_has_enum */
  final def classHasEnum(`class`: String, name: String, noInheritance: Boolean = false): Boolean =
    singleton.classHasEnum(`class`, name, noInheritance)

  /** Forwards to [[singleton]]: ClassDB.class_get_integer_constant_enum */
  final def classGetIntegerConstantEnum(`class`: String, name: String, noInheritance: Boolean = false): String =
    singleton.classGetIntegerConstantEnum(`class`, name, noInheritance)

  /** Forwards to [[singleton]]: ClassDB.is_class_enum_bitfield */
  final def isClassEnumBitfield(`class`: String, `enum`: String, noInheritance: Boolean = false): Boolean =
    singleton.isClassEnumBitfield(`class`, `enum`, noInheritance)

  /** Forwards to [[singleton]]: ClassDB.is_class_enabled */
  final def isClassEnabled(`class`: String): Boolean =
    singleton.isClassEnabled(`class`)

  /** Godot enum `ClassDB.APIType`. */
  opaque type APIType <: Long = Long

  object APIType {
    final val Core: APIType = 0L.asInstanceOf[APIType]
    final val Editor: APIType = 1L.asInstanceOf[APIType]
    final val Extension: APIType = 2L.asInstanceOf[APIType]
    final val EditorExtension: APIType = 3L.asInstanceOf[APIType]
    final val None: APIType = 4L.asInstanceOf[APIType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): APIType = value.asInstanceOf[APIType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[APIType] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[APIType]]

    extension (self: APIType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Core"
        case 1L => "Editor"
        case 2L => "Extension"
        case 3L => "EditorExtension"
        case 4L => "None"
        case other => other.toString
      }
  }
}
