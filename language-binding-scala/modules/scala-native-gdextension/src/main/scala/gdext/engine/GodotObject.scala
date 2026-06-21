package gdext.engine

import gdext.codegen.gdextensioninterface.types.*

/**
 * The raw engine-object handle that every typed engine-class wrapper carries.
 *
 * Engine classes (Node, Node2D, Sprite2D, ...) are generated as opaque types
 * that are all representationally this pointer; the type only exists to give
 * the Scala compiler the right method set and inheritance. The actual lifetime
 * and ref-counting management is Phase 4's `Gd[T]`; for Phase 2 we operate on
 * borrowed/raw handles (singletons, freshly constructed objects).
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
