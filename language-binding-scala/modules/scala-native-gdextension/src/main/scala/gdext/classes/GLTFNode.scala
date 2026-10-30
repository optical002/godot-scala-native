package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `GLTFNode`, extends `Resource`. */
abstract class GLTFNode extends Resource {
  override def godotClassName: String = "GLTFNode"

  /** GLTFNode.get_original_name */
  final def getOriginalName(): String = {
    if (gdext.classes.GLTFNode.mb_get_original_name == null) gdext.classes.GLTFNode.mb_get_original_name = MethodBind.get("GLTFNode", "get_original_name", 2841200299L)
    Ptrcall.call0[String](gdext.classes.GLTFNode.mb_get_original_name, livePtr)
  }

  /** GLTFNode.set_original_name */
  final def setOriginalName(originalName: String): Unit = {
    if (gdext.classes.GLTFNode.mb_set_original_name == null) gdext.classes.GLTFNode.mb_set_original_name = MethodBind.get("GLTFNode", "set_original_name", 83702148L)
    Ptrcall.callVoid1(gdext.classes.GLTFNode.mb_set_original_name, livePtr, originalName)
  }

  /** GLTFNode.get_parent */
  final def getParent(): Long = {
    if (gdext.classes.GLTFNode.mb_get_parent == null) gdext.classes.GLTFNode.mb_get_parent = MethodBind.get("GLTFNode", "get_parent", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.GLTFNode.mb_get_parent, livePtr)
  }

  /** GLTFNode.set_parent */
  final def setParent(parent: Long): Unit = {
    if (gdext.classes.GLTFNode.mb_set_parent == null) gdext.classes.GLTFNode.mb_set_parent = MethodBind.get("GLTFNode", "set_parent", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GLTFNode.mb_set_parent, livePtr, parent)
  }

  /** GLTFNode.get_height */
  final def getHeight(): Long = {
    if (gdext.classes.GLTFNode.mb_get_height == null) gdext.classes.GLTFNode.mb_get_height = MethodBind.get("GLTFNode", "get_height", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.GLTFNode.mb_get_height, livePtr)
  }

  /** GLTFNode.set_height */
  final def setHeight(height: Long): Unit = {
    if (gdext.classes.GLTFNode.mb_set_height == null) gdext.classes.GLTFNode.mb_set_height = MethodBind.get("GLTFNode", "set_height", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GLTFNode.mb_set_height, livePtr, height)
  }

  /** GLTFNode.get_xform */
  final def getXform(): gdext.builtin.Transform3D = {
    if (gdext.classes.GLTFNode.mb_get_xform == null) gdext.classes.GLTFNode.mb_get_xform = MethodBind.get("GLTFNode", "get_xform", 4183770049L)
    Ptrcall.call0[gdext.builtin.Transform3D](gdext.classes.GLTFNode.mb_get_xform, livePtr)
  }

  /** GLTFNode.set_xform */
  final def setXform(xform: gdext.builtin.Transform3D): Unit = {
    if (gdext.classes.GLTFNode.mb_set_xform == null) gdext.classes.GLTFNode.mb_set_xform = MethodBind.get("GLTFNode", "set_xform", 2952846383L)
    Ptrcall.callVoid1(gdext.classes.GLTFNode.mb_set_xform, livePtr, xform)
  }

  /** GLTFNode.get_mesh */
  final def getMesh(): Long = {
    if (gdext.classes.GLTFNode.mb_get_mesh == null) gdext.classes.GLTFNode.mb_get_mesh = MethodBind.get("GLTFNode", "get_mesh", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.GLTFNode.mb_get_mesh, livePtr)
  }

  /** GLTFNode.set_mesh */
  final def setMesh(mesh: Long): Unit = {
    if (gdext.classes.GLTFNode.mb_set_mesh == null) gdext.classes.GLTFNode.mb_set_mesh = MethodBind.get("GLTFNode", "set_mesh", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GLTFNode.mb_set_mesh, livePtr, mesh)
  }

  /** GLTFNode.get_camera */
  final def getCamera(): Long = {
    if (gdext.classes.GLTFNode.mb_get_camera == null) gdext.classes.GLTFNode.mb_get_camera = MethodBind.get("GLTFNode", "get_camera", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.GLTFNode.mb_get_camera, livePtr)
  }

  /** GLTFNode.set_camera */
  final def setCamera(camera: Long): Unit = {
    if (gdext.classes.GLTFNode.mb_set_camera == null) gdext.classes.GLTFNode.mb_set_camera = MethodBind.get("GLTFNode", "set_camera", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GLTFNode.mb_set_camera, livePtr, camera)
  }

  /** GLTFNode.get_skin */
  final def getSkin(): Long = {
    if (gdext.classes.GLTFNode.mb_get_skin == null) gdext.classes.GLTFNode.mb_get_skin = MethodBind.get("GLTFNode", "get_skin", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.GLTFNode.mb_get_skin, livePtr)
  }

  /** GLTFNode.set_skin */
  final def setSkin(skin: Long): Unit = {
    if (gdext.classes.GLTFNode.mb_set_skin == null) gdext.classes.GLTFNode.mb_set_skin = MethodBind.get("GLTFNode", "set_skin", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GLTFNode.mb_set_skin, livePtr, skin)
  }

  /** GLTFNode.get_skeleton */
  final def getSkeleton(): Long = {
    if (gdext.classes.GLTFNode.mb_get_skeleton == null) gdext.classes.GLTFNode.mb_get_skeleton = MethodBind.get("GLTFNode", "get_skeleton", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.GLTFNode.mb_get_skeleton, livePtr)
  }

  /** GLTFNode.set_skeleton */
  final def setSkeleton(skeleton: Long): Unit = {
    if (gdext.classes.GLTFNode.mb_set_skeleton == null) gdext.classes.GLTFNode.mb_set_skeleton = MethodBind.get("GLTFNode", "set_skeleton", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GLTFNode.mb_set_skeleton, livePtr, skeleton)
  }

  /** GLTFNode.get_position */
  final def getPosition(): gdext.builtin.Vector3 = {
    if (gdext.classes.GLTFNode.mb_get_position == null) gdext.classes.GLTFNode.mb_get_position = MethodBind.get("GLTFNode", "get_position", 3783033775L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.GLTFNode.mb_get_position, livePtr)
  }

  /** GLTFNode.set_position */
  final def setPosition(position: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.GLTFNode.mb_set_position == null) gdext.classes.GLTFNode.mb_set_position = MethodBind.get("GLTFNode", "set_position", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.GLTFNode.mb_set_position, livePtr, position)
  }

  /** GLTFNode.get_rotation */
  final def getRotation(): gdext.builtin.Quaternion = {
    if (gdext.classes.GLTFNode.mb_get_rotation == null) gdext.classes.GLTFNode.mb_get_rotation = MethodBind.get("GLTFNode", "get_rotation", 2916281908L)
    Ptrcall.call0[gdext.builtin.Quaternion](gdext.classes.GLTFNode.mb_get_rotation, livePtr)
  }

  /** GLTFNode.set_rotation */
  final def setRotation(rotation: gdext.builtin.Quaternion): Unit = {
    if (gdext.classes.GLTFNode.mb_set_rotation == null) gdext.classes.GLTFNode.mb_set_rotation = MethodBind.get("GLTFNode", "set_rotation", 1727505552L)
    Ptrcall.callVoid1(gdext.classes.GLTFNode.mb_set_rotation, livePtr, rotation)
  }

  /** GLTFNode.get_scale */
  final def getScale(): gdext.builtin.Vector3 = {
    if (gdext.classes.GLTFNode.mb_get_scale == null) gdext.classes.GLTFNode.mb_get_scale = MethodBind.get("GLTFNode", "get_scale", 3783033775L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.GLTFNode.mb_get_scale, livePtr)
  }

  /** GLTFNode.set_scale */
  final def setScale(scale: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.GLTFNode.mb_set_scale == null) gdext.classes.GLTFNode.mb_set_scale = MethodBind.get("GLTFNode", "set_scale", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.GLTFNode.mb_set_scale, livePtr, scale)
  }

  /** GLTFNode.append_child_index */
  final def appendChildIndex(childIndex: Long): Unit = {
    if (gdext.classes.GLTFNode.mb_append_child_index == null) gdext.classes.GLTFNode.mb_append_child_index = MethodBind.get("GLTFNode", "append_child_index", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GLTFNode.mb_append_child_index, livePtr, childIndex)
  }

  /** GLTFNode.get_light */
  final def getLight(): Long = {
    if (gdext.classes.GLTFNode.mb_get_light == null) gdext.classes.GLTFNode.mb_get_light = MethodBind.get("GLTFNode", "get_light", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.GLTFNode.mb_get_light, livePtr)
  }

  /** GLTFNode.set_light */
  final def setLight(light: Long): Unit = {
    if (gdext.classes.GLTFNode.mb_set_light == null) gdext.classes.GLTFNode.mb_set_light = MethodBind.get("GLTFNode", "set_light", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GLTFNode.mb_set_light, livePtr, light)
  }

  /** GLTFNode.get_visible */
  final def getVisible(): Boolean = {
    if (gdext.classes.GLTFNode.mb_get_visible == null) gdext.classes.GLTFNode.mb_get_visible = MethodBind.get("GLTFNode", "get_visible", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.GLTFNode.mb_get_visible, livePtr)
  }

  /** GLTFNode.set_visible */
  final def setVisible(visible: Boolean): Unit = {
    if (gdext.classes.GLTFNode.mb_set_visible == null) gdext.classes.GLTFNode.mb_set_visible = MethodBind.get("GLTFNode", "set_visible", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.GLTFNode.mb_set_visible, livePtr, visible)
  }

}

object GLTFNode {
  private[classes] var mb_get_original_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_original_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_parent: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_parent: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_xform: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_xform: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_mesh: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_mesh: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_camera: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_camera: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_skin: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_skin: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_skeleton: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_skeleton: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_rotation: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_rotation: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_append_child_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_light: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_light: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_visible: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_visible: GDExtensionMethodBindPtr = null
}
