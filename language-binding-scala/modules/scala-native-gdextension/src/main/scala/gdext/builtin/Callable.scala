package gdext.builtin

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import gdext.Godot
import gdext.internal.ffi.types.*
import gdext.internal.ffi.types.GDExtensionVariantType.*

/**
 * Godot's `Callable` (16 bytes, [[BuiltinSizes.Callable]]).
 *
 * Built bound to an object + method name via the engine's builtin constructor
 * (Callable constructor index 2 = `(Object, StringName)`). When the engine
 * later invokes it — e.g. a connected signal fires — it calls that method on
 * that object. For one of our registered classes, that routes back into Scala
 * through the method-call trampoline (so the bound method must be registered,
 * e.g. via [[gdext.register.MethodRegistration]]).
 *
 * Represented as a pointer to its 16-byte storage, like [[StringName]].
 */
opaque type Callable = Ptr[Byte]

object Callable {
  extension (c: Callable) {
    def ptr: Ptr[Byte] = c

    /** Release the underlying Callable value in place. */
    def destroy(): Unit =
      VariantConstructors.destructor(GDEXTENSION_VARIANT_TYPE_CALLABLE)(
        c.asInstanceOf[GDExtensionTypePtr]
      )
  }

  /** Wrap existing 16-byte Callable storage without copying. */
  def fromPtr(p: Ptr[Byte]): Callable = p

  /**
   * Build `Callable(object, method)` into caller storage `dest` (at least
   * [[BuiltinSizes.Callable]] bytes).
   */
  def of(
    objectPtr: GDExtensionObjectPtr,
    method: StringName,
    dest: Ptr[Byte]
  ): Callable = {
    val ctor =
      Godot.interface.variant_get_ptr_constructor(GDEXTENSION_VARIANT_TYPE_CALLABLE, 2)
    // The Object argument's type-pointer is a pointer to the object handle.
    val objSlot = stackalloc[GDExtensionObjectPtr](1)
    !objSlot = objectPtr
    val args = stackalloc[GDExtensionConstTypePtr](2)
    args(0) = objSlot.asInstanceOf[GDExtensionConstTypePtr]
    args(1) = method.ptr.asInstanceOf[GDExtensionConstTypePtr]
    ctor(dest.asInstanceOf[GDExtensionUninitializedTypePtr], args)
    dest
  }
}
