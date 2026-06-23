package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `GLTFSkin`, extends `Resource`. */
abstract class GLTFSkin extends Resource {

  /** GLTFSkin.get_skin_root */
  final def getSkinRoot(): Long =
    Ptrcall.call0[Long](MethodBind.get("GLTFSkin", "get_skin_root", 2455072627L), hostObject.objectPtr)

  /** GLTFSkin.set_skin_root */
  final def setSkinRoot(skin_root: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFSkin", "set_skin_root", 1286410249L), hostObject.objectPtr, skin_root)

  /** GLTFSkin.get_skeleton */
  final def getSkeleton(): Long =
    Ptrcall.call0[Long](MethodBind.get("GLTFSkin", "get_skeleton", 2455072627L), hostObject.objectPtr)

  /** GLTFSkin.set_skeleton */
  final def setSkeleton(skeleton: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFSkin", "set_skeleton", 1286410249L), hostObject.objectPtr, skeleton)

  /** GLTFSkin.get_godot_skin */
  final def getGodotSkin(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("GLTFSkin", "get_godot_skin", 1032037385L), hostObject.objectPtr)

  /** GLTFSkin.set_godot_skin */
  final def setGodotSkin(godot_skin: Skin): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFSkin", "set_godot_skin", 3971435618L), hostObject.objectPtr, godot_skin.hostObject)

}

object GLTFSkin {
  /** Class metadata for Gd[GLTFSkin] lifetime management and casting. */
  given GodotClass[GLTFSkin] with {
    def className = "GLTFSkin"
    def isRefCounted = true
    def wrap(o: GodotObject): GLTFSkin = new GLTFSkin {}.withHost(o.objectPtr)
    def unwrap(t: GLTFSkin): GodotObject = t.hostObject
  }
}
