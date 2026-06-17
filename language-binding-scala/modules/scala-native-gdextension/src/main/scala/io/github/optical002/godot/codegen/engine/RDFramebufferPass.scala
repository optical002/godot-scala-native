package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `RDFramebufferPass`, extends `RefCounted`. */
abstract class RDFramebufferPass extends RefCounted {

  /** RDFramebufferPass.set_depth_attachment */
  final def setDepthAttachment(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDFramebufferPass", "set_depth_attachment", 1286410249L), hostObject.objectPtr, p_member)

  /** RDFramebufferPass.get_depth_attachment */
  final def getDepthAttachment(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDFramebufferPass", "get_depth_attachment", 3905245786L), hostObject.objectPtr)

}

object RDFramebufferPass {
  /** Class metadata for Gd[RDFramebufferPass] lifetime management and casting. */
  given GodotClass[RDFramebufferPass] with {
    def className = "RDFramebufferPass"
    def isRefCounted = true
    def wrap(o: GodotObject): RDFramebufferPass = new RDFramebufferPass {}.withHost(o.objectPtr)
    def unwrap(t: RDFramebufferPass): GodotObject = t.hostObject
  }
}
