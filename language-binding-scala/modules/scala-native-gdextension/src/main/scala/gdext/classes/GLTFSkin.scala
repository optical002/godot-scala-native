package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `GLTFSkin`, extends `Resource`. */
abstract class GLTFSkin extends Resource {
  override def godotClassName: String = "GLTFSkin"

  /** GLTFSkin.get_skin_root */
  final def getSkinRoot(): Long = {
    if (gdext.classes.GLTFSkin.mb_get_skin_root == null) gdext.classes.GLTFSkin.mb_get_skin_root = MethodBind.get("GLTFSkin", "get_skin_root", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.GLTFSkin.mb_get_skin_root, livePtr)
  }

  /** GLTFSkin.set_skin_root */
  final def setSkinRoot(skinRoot: Long): Unit = {
    if (gdext.classes.GLTFSkin.mb_set_skin_root == null) gdext.classes.GLTFSkin.mb_set_skin_root = MethodBind.get("GLTFSkin", "set_skin_root", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GLTFSkin.mb_set_skin_root, livePtr, skinRoot)
  }

  /** GLTFSkin.get_skeleton */
  final def getSkeleton(): Long = {
    if (gdext.classes.GLTFSkin.mb_get_skeleton == null) gdext.classes.GLTFSkin.mb_get_skeleton = MethodBind.get("GLTFSkin", "get_skeleton", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.GLTFSkin.mb_get_skeleton, livePtr)
  }

  /** GLTFSkin.set_skeleton */
  final def setSkeleton(skeleton: Long): Unit = {
    if (gdext.classes.GLTFSkin.mb_set_skeleton == null) gdext.classes.GLTFSkin.mb_set_skeleton = MethodBind.get("GLTFSkin", "set_skeleton", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GLTFSkin.mb_set_skeleton, livePtr, skeleton)
  }

  /** GLTFSkin.get_godot_skin. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getGodotSkin(): Skin = {
    if (gdext.classes.GLTFSkin.mb_get_godot_skin == null) gdext.classes.GLTFSkin.mb_get_godot_skin = MethodBind.get("GLTFSkin", "get_godot_skin", 1032037385L)
    Wrappers.owned[Skin](Ptrcall.call0[Long](gdext.classes.GLTFSkin.mb_get_godot_skin, livePtr))
  }

  /** GLTFSkin.set_godot_skin */
  final def setGodotSkin(godotSkin: Skin): Unit = {
    if (gdext.classes.GLTFSkin.mb_set_godot_skin == null) gdext.classes.GLTFSkin.mb_set_godot_skin = MethodBind.get("GLTFSkin", "set_godot_skin", 3971435618L)
    Ptrcall.callVoid1(gdext.classes.GLTFSkin.mb_set_godot_skin, livePtr, Wrappers.handle(godotSkin))
  }

}

object GLTFSkin {
  private[classes] var mb_get_skin_root: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_skin_root: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_skeleton: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_skeleton: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_godot_skin: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_godot_skin: GDExtensionMethodBindPtr = null
}
