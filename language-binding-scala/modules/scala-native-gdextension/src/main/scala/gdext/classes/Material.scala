package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `Material`, extends `Resource`. */
abstract class Material extends Resource {
  override def godotClassName: String = "Material"

  /** Material.set_next_pass */
  final def setNextPass(next_pass: Material): Unit =
    Ptrcall.callVoid1(MethodBind.get("Material", "set_next_pass", 2757459619L), hostObject.objectPtr, next_pass.hostObject)

  /** Material.get_next_pass */
  final def getNextPass(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Material", "get_next_pass", 5934680L), hostObject.objectPtr)

  /** Material.set_render_priority */
  final def setRenderPriority(priority: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Material", "set_render_priority", 1286410249L), hostObject.objectPtr, priority)

  /** Material.get_render_priority */
  final def getRenderPriority(): Long =
    Ptrcall.call0[Long](MethodBind.get("Material", "get_render_priority", 3905245786L), hostObject.objectPtr)

  /** Material.inspect_native_shader_code */
  final def inspectNativeShaderCode(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Material", "inspect_native_shader_code", 3218959716L), hostObject.objectPtr)

  /** Material.create_placeholder */
  final def createPlaceholder(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Material", "create_placeholder", 121922552L), hostObject.objectPtr)

}
