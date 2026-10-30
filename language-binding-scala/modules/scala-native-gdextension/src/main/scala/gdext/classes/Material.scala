package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Material`, extends `Resource`. */
abstract class Material extends Resource {
  override def godotClassName: String = "Material"

  /** Material.set_next_pass */
  final def setNextPass(nextPass: Material): Unit = {
    if (gdext.classes.Material.mb_set_next_pass == null) gdext.classes.Material.mb_set_next_pass = MethodBind.get("Material", "set_next_pass", 2757459619L)
    Ptrcall.callVoid1(gdext.classes.Material.mb_set_next_pass, livePtr, Wrappers.handle(nextPass))
  }

  /** Material.get_next_pass. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getNextPass(): Material = {
    if (gdext.classes.Material.mb_get_next_pass == null) gdext.classes.Material.mb_get_next_pass = MethodBind.get("Material", "get_next_pass", 5934680L)
    Wrappers.owned[Material](Ptrcall.call0[Long](gdext.classes.Material.mb_get_next_pass, livePtr))
  }

  /** Material.set_render_priority */
  final def setRenderPriority(priority: Long): Unit = {
    if (gdext.classes.Material.mb_set_render_priority == null) gdext.classes.Material.mb_set_render_priority = MethodBind.get("Material", "set_render_priority", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Material.mb_set_render_priority, livePtr, priority)
  }

  /** Material.get_render_priority */
  final def getRenderPriority(): Long = {
    if (gdext.classes.Material.mb_get_render_priority == null) gdext.classes.Material.mb_get_render_priority = MethodBind.get("Material", "get_render_priority", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Material.mb_get_render_priority, livePtr)
  }

  /** Material.inspect_native_shader_code */
  final def inspectNativeShaderCode(): Unit = {
    if (gdext.classes.Material.mb_inspect_native_shader_code == null) gdext.classes.Material.mb_inspect_native_shader_code = MethodBind.get("Material", "inspect_native_shader_code", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Material.mb_inspect_native_shader_code, livePtr)
  }

  /** Material.create_placeholder. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def createPlaceholder(): Resource = {
    if (gdext.classes.Material.mb_create_placeholder == null) gdext.classes.Material.mb_create_placeholder = MethodBind.get("Material", "create_placeholder", 121922552L)
    Wrappers.owned[Resource](Ptrcall.call0[Long](gdext.classes.Material.mb_create_placeholder, livePtr))
  }

}

object Material {
  private[classes] var mb_set_next_pass: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_next_pass: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_render_priority: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_render_priority: GDExtensionMethodBindPtr = null
  private[classes] var mb_inspect_native_shader_code: GDExtensionMethodBindPtr = null
  private[classes] var mb_create_placeholder: GDExtensionMethodBindPtr = null
}
