package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `GLTFNode`, extends `Resource`. */
abstract class GLTFNode extends Resource {

  /** GLTFNode.get_original_name */
  final def getOriginalName(): String =
    Ptrcall.call0[String](MethodBind.get("GLTFNode", "get_original_name", 2841200299L), hostObject.objectPtr)

  /** GLTFNode.set_original_name */
  final def setOriginalName(original_name: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFNode", "set_original_name", 83702148L), hostObject.objectPtr, original_name)

  /** GLTFNode.get_parent */
  final def getParent(): Long =
    Ptrcall.call0[Long](MethodBind.get("GLTFNode", "get_parent", 2455072627L), hostObject.objectPtr)

  /** GLTFNode.set_parent */
  final def setParent(parent: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFNode", "set_parent", 1286410249L), hostObject.objectPtr, parent)

  /** GLTFNode.get_height */
  final def getHeight(): Long =
    Ptrcall.call0[Long](MethodBind.get("GLTFNode", "get_height", 2455072627L), hostObject.objectPtr)

  /** GLTFNode.set_height */
  final def setHeight(height: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFNode", "set_height", 1286410249L), hostObject.objectPtr, height)

  /** GLTFNode.get_xform */
  final def getXform(): io.github.optical002.godot.builtin.Transform3D =
    Ptrcall.call0[io.github.optical002.godot.builtin.Transform3D](MethodBind.get("GLTFNode", "get_xform", 4183770049L), hostObject.objectPtr)

  /** GLTFNode.set_xform */
  final def setXform(xform: io.github.optical002.godot.builtin.Transform3D): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFNode", "set_xform", 2952846383L), hostObject.objectPtr, xform)

  /** GLTFNode.get_mesh */
  final def getMesh(): Long =
    Ptrcall.call0[Long](MethodBind.get("GLTFNode", "get_mesh", 2455072627L), hostObject.objectPtr)

  /** GLTFNode.set_mesh */
  final def setMesh(mesh: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFNode", "set_mesh", 1286410249L), hostObject.objectPtr, mesh)

  /** GLTFNode.get_camera */
  final def getCamera(): Long =
    Ptrcall.call0[Long](MethodBind.get("GLTFNode", "get_camera", 2455072627L), hostObject.objectPtr)

  /** GLTFNode.set_camera */
  final def setCamera(camera: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFNode", "set_camera", 1286410249L), hostObject.objectPtr, camera)

  /** GLTFNode.get_skin */
  final def getSkin(): Long =
    Ptrcall.call0[Long](MethodBind.get("GLTFNode", "get_skin", 2455072627L), hostObject.objectPtr)

  /** GLTFNode.set_skin */
  final def setSkin(skin: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFNode", "set_skin", 1286410249L), hostObject.objectPtr, skin)

  /** GLTFNode.get_skeleton */
  final def getSkeleton(): Long =
    Ptrcall.call0[Long](MethodBind.get("GLTFNode", "get_skeleton", 2455072627L), hostObject.objectPtr)

  /** GLTFNode.set_skeleton */
  final def setSkeleton(skeleton: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFNode", "set_skeleton", 1286410249L), hostObject.objectPtr, skeleton)

  /** GLTFNode.get_position */
  final def getPosition(): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector3](MethodBind.get("GLTFNode", "get_position", 3783033775L), hostObject.objectPtr)

  /** GLTFNode.set_position */
  final def setPosition(position: io.github.optical002.godot.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFNode", "set_position", 3460891852L), hostObject.objectPtr, position)

  /** GLTFNode.get_rotation */
  final def getRotation(): io.github.optical002.godot.builtin.Quaternion =
    Ptrcall.call0[io.github.optical002.godot.builtin.Quaternion](MethodBind.get("GLTFNode", "get_rotation", 2916281908L), hostObject.objectPtr)

  /** GLTFNode.set_rotation */
  final def setRotation(rotation: io.github.optical002.godot.builtin.Quaternion): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFNode", "set_rotation", 1727505552L), hostObject.objectPtr, rotation)

  /** GLTFNode.get_scale */
  final def getScale(): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector3](MethodBind.get("GLTFNode", "get_scale", 3783033775L), hostObject.objectPtr)

  /** GLTFNode.set_scale */
  final def setScale(scale: io.github.optical002.godot.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFNode", "set_scale", 3460891852L), hostObject.objectPtr, scale)

  /** GLTFNode.append_child_index */
  final def appendChildIndex(child_index: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFNode", "append_child_index", 1286410249L), hostObject.objectPtr, child_index)

  /** GLTFNode.get_light */
  final def getLight(): Long =
    Ptrcall.call0[Long](MethodBind.get("GLTFNode", "get_light", 2455072627L), hostObject.objectPtr)

  /** GLTFNode.set_light */
  final def setLight(light: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFNode", "set_light", 1286410249L), hostObject.objectPtr, light)

  /** GLTFNode.get_visible */
  final def getVisible(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("GLTFNode", "get_visible", 2240911060L), hostObject.objectPtr)

  /** GLTFNode.set_visible */
  final def setVisible(visible: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFNode", "set_visible", 2586408642L), hostObject.objectPtr, visible)

}

object GLTFNode {
  /** Class metadata for Gd[GLTFNode] lifetime management and casting. */
  given GodotClass[GLTFNode] with {
    def className = "GLTFNode"
    def isRefCounted = true
    def wrap(o: GodotObject): GLTFNode = new GLTFNode {}.withHost(o.objectPtr)
    def unwrap(t: GLTFNode): GodotObject = t.hostObject
  }
}
