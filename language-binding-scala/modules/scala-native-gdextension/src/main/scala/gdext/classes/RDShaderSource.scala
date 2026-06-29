package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `RDShaderSource`, extends `RefCounted`. */
abstract class RDShaderSource extends RefCounted {
  override def godotClassName: String = "RDShaderSource"

  /** RDShaderSource.set_stage_source */
  final def setStageSource(stage: Long, source: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("RDShaderSource", "set_stage_source", 620821314L), hostObject.objectPtr, stage, source)

  /** RDShaderSource.get_stage_source */
  final def getStageSource(stage: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("RDShaderSource", "get_stage_source", 3354920045L), hostObject.objectPtr, stage)

  /** RDShaderSource.set_language */
  final def setLanguage(language: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDShaderSource", "set_language", 3422186742L), hostObject.objectPtr, language)

  /** RDShaderSource.get_language */
  final def getLanguage(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDShaderSource", "get_language", 1063538261L), hostObject.objectPtr)

}
