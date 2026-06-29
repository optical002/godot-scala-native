package gdext.internal.engine

import gdext.internal.ffi.types.*

/**
 * A thin opaque view over the raw engine-object handle, used at FFI boundaries
 * (object-typed method args/returns, the `ClassMeta.fromHandle` factory). The
 * typed wrappers themselves (Node, Node2D, ...) are abstract classes that carry
 * this handle via [[gdext.internal.register.GodotScriptClass]] and own the
 * lifetime/ref-counting operations (`free`/`unref`/`refInc`/`cast`).
 *
 * A null handle is the engine's "no object" / failed-cast sentinel.
 */
opaque type GodotObject = GDExtensionObjectPtr

object GodotObject {
  extension (o: GodotObject) {
    def objectPtr: GDExtensionObjectPtr = o
    def isNull: Boolean = o == null
  }

  def fromPtr(p: GDExtensionObjectPtr): GodotObject = p
  def Null: GodotObject = null
}
