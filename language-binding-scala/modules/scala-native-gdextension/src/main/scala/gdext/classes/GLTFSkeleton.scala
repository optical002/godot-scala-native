package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `GLTFSkeleton`, extends `Resource`. */
abstract class GLTFSkeleton extends Resource {

  /** GLTFSkeleton.get_godot_skeleton */
  final def getGodotSkeleton(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("GLTFSkeleton", "get_godot_skeleton", 1814733083L), hostObject.objectPtr)

  /** GLTFSkeleton.get_bone_attachment_count */
  final def getBoneAttachmentCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("GLTFSkeleton", "get_bone_attachment_count", 2455072627L), hostObject.objectPtr)

  /** GLTFSkeleton.get_bone_attachment */
  final def getBoneAttachment(idx: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("GLTFSkeleton", "get_bone_attachment", 945440495L), hostObject.objectPtr, idx)

}

object GLTFSkeleton {
  /** Class metadata for Gd[GLTFSkeleton] lifetime management and casting. */
  given GodotClass[GLTFSkeleton] with {
    def className = "GLTFSkeleton"
    def isRefCounted = true
    def wrap(o: GodotObject): GLTFSkeleton = new GLTFSkeleton {}.withHost(o.objectPtr)
    def unwrap(t: GLTFSkeleton): GodotObject = t.hostObject
  }
}
