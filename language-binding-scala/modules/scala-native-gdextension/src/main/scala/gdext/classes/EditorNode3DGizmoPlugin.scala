package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `EditorNode3DGizmoPlugin`, extends `Resource`. */
abstract class EditorNode3DGizmoPlugin extends Resource {
  override def godotClassName: String = "EditorNode3DGizmoPlugin"

  /** EditorNode3DGizmoPlugin.create_material */
  final def createMaterial(name: String, color: gdext.builtin.Color, billboard: Boolean = false, onTop: Boolean = false, useVertexColor: Boolean = false): Unit = {
    if (gdext.classes.EditorNode3DGizmoPlugin.mb_create_material == null) gdext.classes.EditorNode3DGizmoPlugin.mb_create_material = MethodBind.get("EditorNode3DGizmoPlugin", "create_material", 3486012546L)
    Ptrcall.callVoid5(gdext.classes.EditorNode3DGizmoPlugin.mb_create_material, livePtr, name, color, billboard, onTop, useVertexColor)
  }

  /** EditorNode3DGizmoPlugin.create_icon_material */
  final def createIconMaterial(name: String, texture: Texture2D, onTop: Boolean = false, color: gdext.builtin.Color = gdext.builtin.Color(1f, 1f, 1f, 1f)): Unit = {
    if (gdext.classes.EditorNode3DGizmoPlugin.mb_create_icon_material == null) gdext.classes.EditorNode3DGizmoPlugin.mb_create_icon_material = MethodBind.get("EditorNode3DGizmoPlugin", "create_icon_material", 3804976916L)
    Ptrcall.callVoid4(gdext.classes.EditorNode3DGizmoPlugin.mb_create_icon_material, livePtr, name, Wrappers.handle(texture), onTop, color)
  }

  /** EditorNode3DGizmoPlugin.create_handle_material */
  final def createHandleMaterial(name: String, billboard: Boolean = false, texture: Texture2D = null): Unit = {
    if (gdext.classes.EditorNode3DGizmoPlugin.mb_create_handle_material == null) gdext.classes.EditorNode3DGizmoPlugin.mb_create_handle_material = MethodBind.get("EditorNode3DGizmoPlugin", "create_handle_material", 2486475223L)
    Ptrcall.callVoid3(gdext.classes.EditorNode3DGizmoPlugin.mb_create_handle_material, livePtr, name, billboard, Wrappers.handle(texture))
  }

  /** EditorNode3DGizmoPlugin.add_material */
  final def addMaterial(name: String, material: StandardMaterial3D): Unit = {
    if (gdext.classes.EditorNode3DGizmoPlugin.mb_add_material == null) gdext.classes.EditorNode3DGizmoPlugin.mb_add_material = MethodBind.get("EditorNode3DGizmoPlugin", "add_material", 1374068695L)
    Ptrcall.callVoid2(gdext.classes.EditorNode3DGizmoPlugin.mb_add_material, livePtr, name, Wrappers.handle(material))
  }

  /** EditorNode3DGizmoPlugin.get_material. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getMaterial(name: String, gizmo: EditorNode3DGizmo = null): StandardMaterial3D = {
    if (gdext.classes.EditorNode3DGizmoPlugin.mb_get_material == null) gdext.classes.EditorNode3DGizmoPlugin.mb_get_material = MethodBind.get("EditorNode3DGizmoPlugin", "get_material", 974464017L)
    Wrappers.owned[StandardMaterial3D](Ptrcall.call2[String, GodotObject, Long](gdext.classes.EditorNode3DGizmoPlugin.mb_get_material, livePtr, name, Wrappers.handle(gizmo)))
  }

}

object EditorNode3DGizmoPlugin {
  private[classes] var mb_create_material: GDExtensionMethodBindPtr = null
  private[classes] var mb_create_icon_material: GDExtensionMethodBindPtr = null
  private[classes] var mb_create_handle_material: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_material: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_material: GDExtensionMethodBindPtr = null
}
