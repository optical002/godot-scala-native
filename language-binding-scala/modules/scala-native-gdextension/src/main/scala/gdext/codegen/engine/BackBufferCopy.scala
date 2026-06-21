package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `BackBufferCopy`, extends `Node2D`. */
abstract class BackBufferCopy extends Node2D {

  /** BackBufferCopy.set_rect */
  final def setRect(rect: gdext.builtin.Rect2): Unit =
    Ptrcall.callVoid1(MethodBind.get("BackBufferCopy", "set_rect", 2046264180L), hostObject.objectPtr, rect)

  /** BackBufferCopy.get_rect */
  final def getRect(): gdext.builtin.Rect2 =
    Ptrcall.call0[gdext.builtin.Rect2](MethodBind.get("BackBufferCopy", "get_rect", 1639390495L), hostObject.objectPtr)

  /** BackBufferCopy.set_copy_mode */
  final def setCopyMode(copy_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("BackBufferCopy", "set_copy_mode", 1713538590L), hostObject.objectPtr, copy_mode)

  /** BackBufferCopy.get_copy_mode */
  final def getCopyMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("BackBufferCopy", "get_copy_mode", 3271169440L), hostObject.objectPtr)

}

object BackBufferCopy {
  /** Class metadata for Gd[BackBufferCopy] lifetime management and casting. */
  given GodotClass[BackBufferCopy] with {
    def className = "BackBufferCopy"
    def isRefCounted = false
    def wrap(o: GodotObject): BackBufferCopy = new BackBufferCopy {}.withHost(o.objectPtr)
    def unwrap(t: BackBufferCopy): GodotObject = t.hostObject
  }
}
