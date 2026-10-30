package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Script`, extends `Resource`. */
abstract class Script extends Resource {
  override def godotClassName: String = "Script"

  /** Script.can_instantiate */
  final def canInstantiate(): Boolean = {
    if (gdext.classes.Script.mb_can_instantiate == null) gdext.classes.Script.mb_can_instantiate = MethodBind.get("Script", "can_instantiate", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Script.mb_can_instantiate, livePtr)
  }

  /** Script.instance_has */
  final def instanceHas(baseObject: Object): Boolean = {
    if (gdext.classes.Script.mb_instance_has == null) gdext.classes.Script.mb_instance_has = MethodBind.get("Script", "instance_has", 397768994L)
    Ptrcall.call1[GodotObject, Boolean](gdext.classes.Script.mb_instance_has, livePtr, Wrappers.handle(baseObject))
  }

  /** Script.has_source_code */
  final def hasSourceCode(): Boolean = {
    if (gdext.classes.Script.mb_has_source_code == null) gdext.classes.Script.mb_has_source_code = MethodBind.get("Script", "has_source_code", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Script.mb_has_source_code, livePtr)
  }

  /** Script.get_source_code */
  final def getSourceCode(): String = {
    if (gdext.classes.Script.mb_get_source_code == null) gdext.classes.Script.mb_get_source_code = MethodBind.get("Script", "get_source_code", 201670096L)
    Ptrcall.call0[String](gdext.classes.Script.mb_get_source_code, livePtr)
  }

  /** Script.set_source_code */
  final def setSourceCode(source: String): Unit = {
    if (gdext.classes.Script.mb_set_source_code == null) gdext.classes.Script.mb_set_source_code = MethodBind.get("Script", "set_source_code", 83702148L)
    Ptrcall.callVoid1(gdext.classes.Script.mb_set_source_code, livePtr, source)
  }

  /** Script.reload */
  final def reload(keepState: Boolean = false): gdext.classes.Error = {
    if (gdext.classes.Script.mb_reload == null) gdext.classes.Script.mb_reload = MethodBind.get("Script", "reload", 1633102583L)
    gdext.classes.Error(Ptrcall.call1[Boolean, Long](gdext.classes.Script.mb_reload, livePtr, keepState))
  }

  /** Script.get_base_script. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getBaseScript(): Script = {
    if (gdext.classes.Script.mb_get_base_script == null) gdext.classes.Script.mb_get_base_script = MethodBind.get("Script", "get_base_script", 278624046L)
    Wrappers.owned[Script](Ptrcall.call0[Long](gdext.classes.Script.mb_get_base_script, livePtr))
  }

  /** Script.get_instance_base_type */
  final def getInstanceBaseType(): String = {
    if (gdext.classes.Script.mb_get_instance_base_type == null) gdext.classes.Script.mb_get_instance_base_type = MethodBind.get("Script", "get_instance_base_type", 2002593661L)
    Ptrcall.call0[SnArg](gdext.classes.Script.mb_get_instance_base_type, livePtr)
  }

  /** Script.get_global_name */
  final def getGlobalName(): String = {
    if (gdext.classes.Script.mb_get_global_name == null) gdext.classes.Script.mb_get_global_name = MethodBind.get("Script", "get_global_name", 2002593661L)
    Ptrcall.call0[SnArg](gdext.classes.Script.mb_get_global_name, livePtr)
  }

  /** Script.has_script_signal */
  final def hasScriptSignal(signalName: String): Boolean = {
    if (gdext.classes.Script.mb_has_script_signal == null) gdext.classes.Script.mb_has_script_signal = MethodBind.get("Script", "has_script_signal", 2619796661L)
    Ptrcall.call1[SnArg, Boolean](gdext.classes.Script.mb_has_script_signal, livePtr, SnArg(signalName))
  }

  /** Script.is_tool */
  final def isTool(): Boolean = {
    if (gdext.classes.Script.mb_is_tool == null) gdext.classes.Script.mb_is_tool = MethodBind.get("Script", "is_tool", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Script.mb_is_tool, livePtr)
  }

  /** Script.is_abstract */
  final def isAbstract(): Boolean = {
    if (gdext.classes.Script.mb_is_abstract == null) gdext.classes.Script.mb_is_abstract = MethodBind.get("Script", "is_abstract", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Script.mb_is_abstract, livePtr)
  }

}

object Script {
  private[classes] var mb_can_instantiate: GDExtensionMethodBindPtr = null
  private[classes] var mb_instance_has: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_source_code: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_source_code: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_source_code: GDExtensionMethodBindPtr = null
  private[classes] var mb_reload: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_base_script: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_instance_base_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_global_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_script_signal: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_tool: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_abstract: GDExtensionMethodBindPtr = null
}
