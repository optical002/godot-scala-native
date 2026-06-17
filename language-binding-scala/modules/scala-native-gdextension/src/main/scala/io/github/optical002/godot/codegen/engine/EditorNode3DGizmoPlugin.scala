package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorNode3DGizmoPlugin`, extends `Resource`. */
abstract class EditorNode3DGizmoPlugin extends Resource {

  /** EditorNode3DGizmoPlugin.create_material */
  final def createMaterial(name: String, color: io.github.optical002.godot.builtin.Color, billboard: Boolean, on_top: Boolean, use_vertex_color: Boolean): Unit =
    Ptrcall.callVoid5(MethodBind.get("EditorNode3DGizmoPlugin", "create_material", 3486012546L), hostObject.objectPtr, name, color, billboard, on_top, use_vertex_color)

  /** EditorNode3DGizmoPlugin.create_icon_material */
  final def createIconMaterial(name: String, texture: Texture2D, on_top: Boolean, color: io.github.optical002.godot.builtin.Color): Unit =
    Ptrcall.callVoid4(MethodBind.get("EditorNode3DGizmoPlugin", "create_icon_material", 3804976916L), hostObject.objectPtr, name, texture.hostObject, on_top, color)

  /** EditorNode3DGizmoPlugin.create_handle_material */
  final def createHandleMaterial(name: String, billboard: Boolean, texture: Texture2D): Unit =
    Ptrcall.callVoid3(MethodBind.get("EditorNode3DGizmoPlugin", "create_handle_material", 2486475223L), hostObject.objectPtr, name, billboard, texture.hostObject)

  /** EditorNode3DGizmoPlugin.add_material */
  final def addMaterial(name: String, material: StandardMaterial3D): Unit =
    Ptrcall.callVoid2(MethodBind.get("EditorNode3DGizmoPlugin", "add_material", 1374068695L), hostObject.objectPtr, name, material.hostObject)

  /** EditorNode3DGizmoPlugin.get_material */
  final def getMaterial(name: String, gizmo: EditorNode3DGizmo): GodotObject =
    Ptrcall.call2[String, GodotObject, GodotObject](MethodBind.get("EditorNode3DGizmoPlugin", "get_material", 974464017L), hostObject.objectPtr, name, gizmo.hostObject)

}

object EditorNode3DGizmoPlugin {
  /** Class metadata for Gd[EditorNode3DGizmoPlugin] lifetime management and casting. */
  given GodotClass[EditorNode3DGizmoPlugin] with {
    def className = "EditorNode3DGizmoPlugin"
    def isRefCounted = true
    def wrap(o: GodotObject): EditorNode3DGizmoPlugin = new EditorNode3DGizmoPlugin {}.withHost(o.objectPtr)
    def unwrap(t: EditorNode3DGizmoPlugin): GodotObject = t.hostObject
  }
}
