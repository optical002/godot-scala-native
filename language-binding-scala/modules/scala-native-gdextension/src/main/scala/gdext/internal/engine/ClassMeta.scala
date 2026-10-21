package gdext.internal.engine

import scala.quoted.*
import gdext.internal.register.GodotScriptClass

/**
 * Minimal type-directed metadata for a Godot class `T` (an engine wrapper or a
 * user-registered class). This is all that remains of the old `GodotClass[T]`
 * typeclass once `Gd[T]` is gone: the only thing the rest of the binding still
 * needs at a type boundary is the ability to turn a raw engine handle into a
 * typed `T` wrapper (plus the class name for string-keyed engine calls).
 *
 *  - `className` — the Godot class name, for class-tag / construct lookups.
 *  - `fromHandle` — the object's one wrapper as a `T` (its bound user instance,
 *    else a cached wrapper of its most-derived engine class; see [[Wrappers]]).
 *
 * Dropped vs `GodotClass`: `isRefCounted` (now `value.isInstanceOf[RefCounted]`)
 * and `unwrap` (now `t.hostObject`/`t.hostPtr` directly on the value).
 *
 * **There are no hand-written or generated instances.** Every `ClassMeta[T]` is
 * synthesized by the single [[derived]] macro from the type `T`, so adding an
 * engine class or a user class needs no boilerplate. `ClassMeta` is only ever
 * summoned at a handle→object boundary (cast targets, export reads, construction);
 * once you hold a `T`, you never need it again.
 */
trait ClassMeta[T] {
  def className: String
  def fromHandle(p: gdext.internal.ffi.types.GDExtensionObjectPtr): T
}

object ClassMeta {
  def apply[T](using m: ClassMeta[T]): ClassMeta[T] = m

  /**
   * Every `ClassMeta` behaves the same apart from its name: `fromHandle` asks
   * [[Wrappers]] for the object's one wrapper (its bound user instance, or a
   * wrapper of its most-derived engine class). So one instance per class name
   * is shared, and summoning one does not allocate.
   */
  private final class Named[T](val className: String) extends ClassMeta[T] {
    def fromHandle(p: gdext.internal.ffi.types.GDExtensionObjectPtr): T =
      Wrappers.of(p).asInstanceOf[T]
  }

  private val byName =
    new java.util.concurrent.ConcurrentHashMap[String, ClassMeta[?]]()

  def named[T](className: String): ClassMeta[T] = {
    val hit = byName.get(className)
    if (hit != null) hit.asInstanceOf[ClassMeta[T]]
    else {
      val m = new Named[T](className)
      byName.put(className, m)
      m
    }
  }

  /**
   * The `ClassMeta[T]` for any class in the engine hierarchy
   * (`T <: GodotScriptClass`), engine wrappers and user classes alike. The Godot
   * class name is `T`'s simple name, matching how registration names it.
   */
  inline given derived[T <: GodotScriptClass]: ClassMeta[T] = ${ derivedImpl[T] }

  private def derivedImpl[T <: GodotScriptClass: Type](using
    Quotes
  ): Expr[ClassMeta[T]] = {
    import quotes.reflect.*
    val name = Expr(TypeRepr.of[T].typeSymbol.name)
    '{ ClassMeta.named[T]($name) }
  }
}
