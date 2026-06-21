package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `Script`, extends `Resource`. */
abstract class Script extends Resource {

  /** Script.can_instantiate */
  final def canInstantiate(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Script", "can_instantiate", 36873697L), hostObject.objectPtr)

  /** Script.instance_has */
  final def instanceHas(base_object: Object): Boolean =
    Ptrcall.call1[GodotObject, Boolean](MethodBind.get("Script", "instance_has", 397768994L), hostObject.objectPtr, base_object.hostObject)

  /** Script.has_source_code */
  final def hasSourceCode(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Script", "has_source_code", 36873697L), hostObject.objectPtr)

  /** Script.get_source_code */
  final def getSourceCode(): String =
    Ptrcall.call0[String](MethodBind.get("Script", "get_source_code", 201670096L), hostObject.objectPtr)

  /** Script.set_source_code */
  final def setSourceCode(source: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("Script", "set_source_code", 83702148L), hostObject.objectPtr, source)

  /** Script.reload */
  final def reload(keep_state: Boolean): Long =
    Ptrcall.call1[Boolean, Long](MethodBind.get("Script", "reload", 1633102583L), hostObject.objectPtr, keep_state)

  /** Script.get_base_script */
  final def getBaseScript(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Script", "get_base_script", 278624046L), hostObject.objectPtr)

  /** Script.get_instance_base_type */
  final def getInstanceBaseType(): gdext.builtin.StringName =
    Ptrcall.call0[gdext.builtin.StringName](MethodBind.get("Script", "get_instance_base_type", 2002593661L), hostObject.objectPtr)

  /** Script.get_global_name */
  final def getGlobalName(): gdext.builtin.StringName =
    Ptrcall.call0[gdext.builtin.StringName](MethodBind.get("Script", "get_global_name", 2002593661L), hostObject.objectPtr)

  /** Script.has_script_signal */
  final def hasScriptSignal(signal_name: gdext.builtin.StringName): Boolean =
    Ptrcall.call1[gdext.builtin.StringName, Boolean](MethodBind.get("Script", "has_script_signal", 2619796661L), hostObject.objectPtr, signal_name)

  /** Script.is_tool */
  final def isTool(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Script", "is_tool", 36873697L), hostObject.objectPtr)

  /** Script.is_abstract */
  final def isAbstract(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Script", "is_abstract", 36873697L), hostObject.objectPtr)

}

object Script {
  /** Class metadata for Gd[Script] lifetime management and casting. */
  given GodotClass[Script] with {
    def className = "Script"
    def isRefCounted = true
    def wrap(o: GodotObject): Script = new Script {}.withHost(o.objectPtr)
    def unwrap(t: Script): GodotObject = t.hostObject
  }
}
