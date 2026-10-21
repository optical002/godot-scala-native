package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `RDShaderSource`, extends `RefCounted`. */
abstract class RDShaderSource extends RefCounted {
  override def godotClassName: String = "RDShaderSource"

  /** RDShaderSource.set_stage_source */
  final def setStageSource(stage: Long, source: String): Unit = {
    if (gdext.classes.RDShaderSource.mb_set_stage_source == null) gdext.classes.RDShaderSource.mb_set_stage_source = MethodBind.get("RDShaderSource", "set_stage_source", 620821314L)
    Ptrcall.callVoid2(gdext.classes.RDShaderSource.mb_set_stage_source, livePtr, stage, source)
  }

  /** RDShaderSource.get_stage_source */
  final def getStageSource(stage: Long): String = {
    if (gdext.classes.RDShaderSource.mb_get_stage_source == null) gdext.classes.RDShaderSource.mb_get_stage_source = MethodBind.get("RDShaderSource", "get_stage_source", 3354920045L)
    Ptrcall.call1[Long, String](gdext.classes.RDShaderSource.mb_get_stage_source, livePtr, stage)
  }

  /** RDShaderSource.set_language */
  final def setLanguage(language: Long): Unit = {
    if (gdext.classes.RDShaderSource.mb_set_language == null) gdext.classes.RDShaderSource.mb_set_language = MethodBind.get("RDShaderSource", "set_language", 3422186742L)
    Ptrcall.callVoid1(gdext.classes.RDShaderSource.mb_set_language, livePtr, language)
  }

  /** RDShaderSource.get_language */
  final def getLanguage(): Long = {
    if (gdext.classes.RDShaderSource.mb_get_language == null) gdext.classes.RDShaderSource.mb_get_language = MethodBind.get("RDShaderSource", "get_language", 1063538261L)
    Ptrcall.call0[Long](gdext.classes.RDShaderSource.mb_get_language, livePtr)
  }

}

object RDShaderSource {
  private[classes] var mb_set_stage_source: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_stage_source: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_language: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_language: GDExtensionMethodBindPtr = null
}
