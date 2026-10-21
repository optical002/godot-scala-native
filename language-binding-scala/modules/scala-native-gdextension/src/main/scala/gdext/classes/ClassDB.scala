package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ClassDB`, extends `Object`. */
abstract class ClassDB extends Object {
  override def godotClassName: String = "ClassDB"

  /** ClassDB.get_parent_class */
  final def getParentClass(`class`: gdext.builtin.StringName): gdext.builtin.StringName = {
    if (gdext.classes.ClassDB.mb_get_parent_class == null) gdext.classes.ClassDB.mb_get_parent_class = MethodBind.get("ClassDB", "get_parent_class", 1965194235L)
    Ptrcall.call1[gdext.builtin.StringName, gdext.builtin.StringName](gdext.classes.ClassDB.mb_get_parent_class, livePtr, `class`)
  }

  /** ClassDB.class_exists */
  final def classExists(`class`: gdext.builtin.StringName): Boolean = {
    if (gdext.classes.ClassDB.mb_class_exists == null) gdext.classes.ClassDB.mb_class_exists = MethodBind.get("ClassDB", "class_exists", 2619796661L)
    Ptrcall.call1[gdext.builtin.StringName, Boolean](gdext.classes.ClassDB.mb_class_exists, livePtr, `class`)
  }

  /** ClassDB.is_parent_class */
  final def isParentClass(`class`: gdext.builtin.StringName, inherits: gdext.builtin.StringName): Boolean = {
    if (gdext.classes.ClassDB.mb_is_parent_class == null) gdext.classes.ClassDB.mb_is_parent_class = MethodBind.get("ClassDB", "is_parent_class", 471820014L)
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, Boolean](gdext.classes.ClassDB.mb_is_parent_class, livePtr, `class`, inherits)
  }

  /** ClassDB.can_instantiate */
  final def canInstantiate(`class`: gdext.builtin.StringName): Boolean = {
    if (gdext.classes.ClassDB.mb_can_instantiate == null) gdext.classes.ClassDB.mb_can_instantiate = MethodBind.get("ClassDB", "can_instantiate", 2619796661L)
    Ptrcall.call1[gdext.builtin.StringName, Boolean](gdext.classes.ClassDB.mb_can_instantiate, livePtr, `class`)
  }

  /** ClassDB.class_get_api_type */
  final def classGetApiType(`class`: gdext.builtin.StringName): Long = {
    if (gdext.classes.ClassDB.mb_class_get_api_type == null) gdext.classes.ClassDB.mb_class_get_api_type = MethodBind.get("ClassDB", "class_get_api_type", 2475317043L)
    Ptrcall.call1[gdext.builtin.StringName, Long](gdext.classes.ClassDB.mb_class_get_api_type, livePtr, `class`)
  }

  /** ClassDB.class_has_signal */
  final def classHasSignal(`class`: gdext.builtin.StringName, signal: gdext.builtin.StringName): Boolean = {
    if (gdext.classes.ClassDB.mb_class_has_signal == null) gdext.classes.ClassDB.mb_class_has_signal = MethodBind.get("ClassDB", "class_has_signal", 471820014L)
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, Boolean](gdext.classes.ClassDB.mb_class_has_signal, livePtr, `class`, signal)
  }

  /** ClassDB.class_get_property_getter */
  final def classGetPropertyGetter(`class`: gdext.builtin.StringName, property: gdext.builtin.StringName): gdext.builtin.StringName = {
    if (gdext.classes.ClassDB.mb_class_get_property_getter == null) gdext.classes.ClassDB.mb_class_get_property_getter = MethodBind.get("ClassDB", "class_get_property_getter", 3770832642L)
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, gdext.builtin.StringName](gdext.classes.ClassDB.mb_class_get_property_getter, livePtr, `class`, property)
  }

  /** ClassDB.class_get_property_setter */
  final def classGetPropertySetter(`class`: gdext.builtin.StringName, property: gdext.builtin.StringName): gdext.builtin.StringName = {
    if (gdext.classes.ClassDB.mb_class_get_property_setter == null) gdext.classes.ClassDB.mb_class_get_property_setter = MethodBind.get("ClassDB", "class_get_property_setter", 3770832642L)
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, gdext.builtin.StringName](gdext.classes.ClassDB.mb_class_get_property_setter, livePtr, `class`, property)
  }

  /** ClassDB.class_has_method */
  final def classHasMethod(`class`: gdext.builtin.StringName, method: gdext.builtin.StringName, no_inheritance: Boolean): Boolean = {
    if (gdext.classes.ClassDB.mb_class_has_method == null) gdext.classes.ClassDB.mb_class_has_method = MethodBind.get("ClassDB", "class_has_method", 3860701026L)
    Ptrcall.call3[gdext.builtin.StringName, gdext.builtin.StringName, Boolean, Boolean](gdext.classes.ClassDB.mb_class_has_method, livePtr, `class`, method, no_inheritance)
  }

  /** ClassDB.class_get_method_argument_count */
  final def classGetMethodArgumentCount(`class`: gdext.builtin.StringName, method: gdext.builtin.StringName, no_inheritance: Boolean): Long = {
    if (gdext.classes.ClassDB.mb_class_get_method_argument_count == null) gdext.classes.ClassDB.mb_class_get_method_argument_count = MethodBind.get("ClassDB", "class_get_method_argument_count", 3885694822L)
    Ptrcall.call3[gdext.builtin.StringName, gdext.builtin.StringName, Boolean, Long](gdext.classes.ClassDB.mb_class_get_method_argument_count, livePtr, `class`, method, no_inheritance)
  }

  /** ClassDB.class_has_integer_constant */
  final def classHasIntegerConstant(`class`: gdext.builtin.StringName, name: gdext.builtin.StringName): Boolean = {
    if (gdext.classes.ClassDB.mb_class_has_integer_constant == null) gdext.classes.ClassDB.mb_class_has_integer_constant = MethodBind.get("ClassDB", "class_has_integer_constant", 471820014L)
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, Boolean](gdext.classes.ClassDB.mb_class_has_integer_constant, livePtr, `class`, name)
  }

  /** ClassDB.class_get_integer_constant */
  final def classGetIntegerConstant(`class`: gdext.builtin.StringName, name: gdext.builtin.StringName): Long = {
    if (gdext.classes.ClassDB.mb_class_get_integer_constant == null) gdext.classes.ClassDB.mb_class_get_integer_constant = MethodBind.get("ClassDB", "class_get_integer_constant", 2419549490L)
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, Long](gdext.classes.ClassDB.mb_class_get_integer_constant, livePtr, `class`, name)
  }

  /** ClassDB.class_has_enum */
  final def classHasEnum(`class`: gdext.builtin.StringName, name: gdext.builtin.StringName, no_inheritance: Boolean): Boolean = {
    if (gdext.classes.ClassDB.mb_class_has_enum == null) gdext.classes.ClassDB.mb_class_has_enum = MethodBind.get("ClassDB", "class_has_enum", 3860701026L)
    Ptrcall.call3[gdext.builtin.StringName, gdext.builtin.StringName, Boolean, Boolean](gdext.classes.ClassDB.mb_class_has_enum, livePtr, `class`, name, no_inheritance)
  }

  /** ClassDB.class_get_integer_constant_enum */
  final def classGetIntegerConstantEnum(`class`: gdext.builtin.StringName, name: gdext.builtin.StringName, no_inheritance: Boolean): gdext.builtin.StringName = {
    if (gdext.classes.ClassDB.mb_class_get_integer_constant_enum == null) gdext.classes.ClassDB.mb_class_get_integer_constant_enum = MethodBind.get("ClassDB", "class_get_integer_constant_enum", 2457504236L)
    Ptrcall.call3[gdext.builtin.StringName, gdext.builtin.StringName, Boolean, gdext.builtin.StringName](gdext.classes.ClassDB.mb_class_get_integer_constant_enum, livePtr, `class`, name, no_inheritance)
  }

  /** ClassDB.is_class_enum_bitfield */
  final def isClassEnumBitfield(`class`: gdext.builtin.StringName, `enum`: gdext.builtin.StringName, no_inheritance: Boolean): Boolean = {
    if (gdext.classes.ClassDB.mb_is_class_enum_bitfield == null) gdext.classes.ClassDB.mb_is_class_enum_bitfield = MethodBind.get("ClassDB", "is_class_enum_bitfield", 3860701026L)
    Ptrcall.call3[gdext.builtin.StringName, gdext.builtin.StringName, Boolean, Boolean](gdext.classes.ClassDB.mb_is_class_enum_bitfield, livePtr, `class`, `enum`, no_inheritance)
  }

  /** ClassDB.is_class_enabled */
  final def isClassEnabled(`class`: gdext.builtin.StringName): Boolean = {
    if (gdext.classes.ClassDB.mb_is_class_enabled == null) gdext.classes.ClassDB.mb_is_class_enabled = MethodBind.get("ClassDB", "is_class_enabled", 2619796661L)
    Ptrcall.call1[gdext.builtin.StringName, Boolean](gdext.classes.ClassDB.mb_is_class_enabled, livePtr, `class`)
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
}
