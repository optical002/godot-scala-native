package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `ClassDB`, extends `Object`. */
abstract class ClassDB extends Object {

  /** ClassDB.get_parent_class */
  final def getParentClass(`class`: io.github.optical002.godot.builtin.StringName): io.github.optical002.godot.builtin.StringName =
    Ptrcall.call1[io.github.optical002.godot.builtin.StringName, io.github.optical002.godot.builtin.StringName](MethodBind.get("ClassDB", "get_parent_class", 1965194235L), hostObject.objectPtr, `class`)

  /** ClassDB.class_exists */
  final def classExists(`class`: io.github.optical002.godot.builtin.StringName): Boolean =
    Ptrcall.call1[io.github.optical002.godot.builtin.StringName, Boolean](MethodBind.get("ClassDB", "class_exists", 2619796661L), hostObject.objectPtr, `class`)

  /** ClassDB.is_parent_class */
  final def isParentClass(`class`: io.github.optical002.godot.builtin.StringName, inherits: io.github.optical002.godot.builtin.StringName): Boolean =
    Ptrcall.call2[io.github.optical002.godot.builtin.StringName, io.github.optical002.godot.builtin.StringName, Boolean](MethodBind.get("ClassDB", "is_parent_class", 471820014L), hostObject.objectPtr, `class`, inherits)

  /** ClassDB.can_instantiate */
  final def canInstantiate(`class`: io.github.optical002.godot.builtin.StringName): Boolean =
    Ptrcall.call1[io.github.optical002.godot.builtin.StringName, Boolean](MethodBind.get("ClassDB", "can_instantiate", 2619796661L), hostObject.objectPtr, `class`)

  /** ClassDB.class_get_api_type */
  final def classGetApiType(`class`: io.github.optical002.godot.builtin.StringName): Long =
    Ptrcall.call1[io.github.optical002.godot.builtin.StringName, Long](MethodBind.get("ClassDB", "class_get_api_type", 2475317043L), hostObject.objectPtr, `class`)

  /** ClassDB.class_has_signal */
  final def classHasSignal(`class`: io.github.optical002.godot.builtin.StringName, signal: io.github.optical002.godot.builtin.StringName): Boolean =
    Ptrcall.call2[io.github.optical002.godot.builtin.StringName, io.github.optical002.godot.builtin.StringName, Boolean](MethodBind.get("ClassDB", "class_has_signal", 471820014L), hostObject.objectPtr, `class`, signal)

  /** ClassDB.class_get_property_getter */
  final def classGetPropertyGetter(`class`: io.github.optical002.godot.builtin.StringName, property: io.github.optical002.godot.builtin.StringName): io.github.optical002.godot.builtin.StringName =
    Ptrcall.call2[io.github.optical002.godot.builtin.StringName, io.github.optical002.godot.builtin.StringName, io.github.optical002.godot.builtin.StringName](MethodBind.get("ClassDB", "class_get_property_getter", 3770832642L), hostObject.objectPtr, `class`, property)

  /** ClassDB.class_get_property_setter */
  final def classGetPropertySetter(`class`: io.github.optical002.godot.builtin.StringName, property: io.github.optical002.godot.builtin.StringName): io.github.optical002.godot.builtin.StringName =
    Ptrcall.call2[io.github.optical002.godot.builtin.StringName, io.github.optical002.godot.builtin.StringName, io.github.optical002.godot.builtin.StringName](MethodBind.get("ClassDB", "class_get_property_setter", 3770832642L), hostObject.objectPtr, `class`, property)

  /** ClassDB.class_has_method */
  final def classHasMethod(`class`: io.github.optical002.godot.builtin.StringName, method: io.github.optical002.godot.builtin.StringName, no_inheritance: Boolean): Boolean =
    Ptrcall.call3[io.github.optical002.godot.builtin.StringName, io.github.optical002.godot.builtin.StringName, Boolean, Boolean](MethodBind.get("ClassDB", "class_has_method", 3860701026L), hostObject.objectPtr, `class`, method, no_inheritance)

  /** ClassDB.class_get_method_argument_count */
  final def classGetMethodArgumentCount(`class`: io.github.optical002.godot.builtin.StringName, method: io.github.optical002.godot.builtin.StringName, no_inheritance: Boolean): Long =
    Ptrcall.call3[io.github.optical002.godot.builtin.StringName, io.github.optical002.godot.builtin.StringName, Boolean, Long](MethodBind.get("ClassDB", "class_get_method_argument_count", 3885694822L), hostObject.objectPtr, `class`, method, no_inheritance)

  /** ClassDB.class_has_integer_constant */
  final def classHasIntegerConstant(`class`: io.github.optical002.godot.builtin.StringName, name: io.github.optical002.godot.builtin.StringName): Boolean =
    Ptrcall.call2[io.github.optical002.godot.builtin.StringName, io.github.optical002.godot.builtin.StringName, Boolean](MethodBind.get("ClassDB", "class_has_integer_constant", 471820014L), hostObject.objectPtr, `class`, name)

  /** ClassDB.class_get_integer_constant */
  final def classGetIntegerConstant(`class`: io.github.optical002.godot.builtin.StringName, name: io.github.optical002.godot.builtin.StringName): Long =
    Ptrcall.call2[io.github.optical002.godot.builtin.StringName, io.github.optical002.godot.builtin.StringName, Long](MethodBind.get("ClassDB", "class_get_integer_constant", 2419549490L), hostObject.objectPtr, `class`, name)

  /** ClassDB.class_has_enum */
  final def classHasEnum(`class`: io.github.optical002.godot.builtin.StringName, name: io.github.optical002.godot.builtin.StringName, no_inheritance: Boolean): Boolean =
    Ptrcall.call3[io.github.optical002.godot.builtin.StringName, io.github.optical002.godot.builtin.StringName, Boolean, Boolean](MethodBind.get("ClassDB", "class_has_enum", 3860701026L), hostObject.objectPtr, `class`, name, no_inheritance)

  /** ClassDB.class_get_integer_constant_enum */
  final def classGetIntegerConstantEnum(`class`: io.github.optical002.godot.builtin.StringName, name: io.github.optical002.godot.builtin.StringName, no_inheritance: Boolean): io.github.optical002.godot.builtin.StringName =
    Ptrcall.call3[io.github.optical002.godot.builtin.StringName, io.github.optical002.godot.builtin.StringName, Boolean, io.github.optical002.godot.builtin.StringName](MethodBind.get("ClassDB", "class_get_integer_constant_enum", 2457504236L), hostObject.objectPtr, `class`, name, no_inheritance)

  /** ClassDB.is_class_enum_bitfield */
  final def isClassEnumBitfield(`class`: io.github.optical002.godot.builtin.StringName, `enum`: io.github.optical002.godot.builtin.StringName, no_inheritance: Boolean): Boolean =
    Ptrcall.call3[io.github.optical002.godot.builtin.StringName, io.github.optical002.godot.builtin.StringName, Boolean, Boolean](MethodBind.get("ClassDB", "is_class_enum_bitfield", 3860701026L), hostObject.objectPtr, `class`, `enum`, no_inheritance)

  /** ClassDB.is_class_enabled */
  final def isClassEnabled(`class`: io.github.optical002.godot.builtin.StringName): Boolean =
    Ptrcall.call1[io.github.optical002.godot.builtin.StringName, Boolean](MethodBind.get("ClassDB", "is_class_enabled", 2619796661L), hostObject.objectPtr, `class`)

}

object ClassDB {
  /** Class metadata for Gd[ClassDB] lifetime management and casting. */
  given GodotClass[ClassDB] with {
    def className = "ClassDB"
    def isRefCounted = false
    def wrap(o: GodotObject): ClassDB = new ClassDB {}.withHost(o.objectPtr)
    def unwrap(t: ClassDB): GodotObject = t.hostObject
  }

  /** The process-global ClassDB singleton instance. */
  def singleton: ClassDB = new ClassDB {}
    .withHost(Godot.interface.global_get_singleton(
      StringNames.cached("ClassDB").ptr))
}
