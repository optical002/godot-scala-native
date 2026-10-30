package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `GLTFSkeleton`, extends `Resource`. */
abstract class GLTFSkeleton extends Resource {
  override def godotClassName: String = "GLTFSkeleton"

  /** GLTFSkeleton.get_godot_skeleton */
  final def getGodotSkeleton(): Skeleton3D = {
    if (gdext.classes.GLTFSkeleton.mb_get_godot_skeleton == null) gdext.classes.GLTFSkeleton.mb_get_godot_skeleton = MethodBind.get("GLTFSkeleton", "get_godot_skeleton", 1814733083L)
    Wrappers.borrowed[Skeleton3D](Ptrcall.call0[Long](gdext.classes.GLTFSkeleton.mb_get_godot_skeleton, livePtr))
  }

  /** GLTFSkeleton.get_bone_attachment_count */
  final def getBoneAttachmentCount(): Long = {
    if (gdext.classes.GLTFSkeleton.mb_get_bone_attachment_count == null) gdext.classes.GLTFSkeleton.mb_get_bone_attachment_count = MethodBind.get("GLTFSkeleton", "get_bone_attachment_count", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.GLTFSkeleton.mb_get_bone_attachment_count, livePtr)
  }

  /** GLTFSkeleton.get_bone_attachment */
  final def getBoneAttachment(idx: Long): BoneAttachment3D = {
    if (gdext.classes.GLTFSkeleton.mb_get_bone_attachment == null) gdext.classes.GLTFSkeleton.mb_get_bone_attachment = MethodBind.get("GLTFSkeleton", "get_bone_attachment", 945440495L)
    Wrappers.borrowed[BoneAttachment3D](Ptrcall.call1[Long, Long](gdext.classes.GLTFSkeleton.mb_get_bone_attachment, livePtr, idx))
  }

}

object GLTFSkeleton {
  private[classes] var mb_get_godot_skeleton: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bone_attachment_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bone_attachment: GDExtensionMethodBindPtr = null
}
