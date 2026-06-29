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
 *  - `fromHandle` — wrap a raw handle as a `T`, preserving instance identity
 *    (returns the canonical Scala instance Godot drives, if one is bound).
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
   * The canonical Scala instance already bound to engine object `o` (the one
   * Godot created and drives the virtuals on), or `null` if none is bound.
   *
   * Used by the derived `fromHandle` to preserve instance identity: fetching a
   * user node through an export must return that same object, not a fresh wrapper
   * with re-initialized fields. Kept as a plain method (not inlined into the
   * `fromHandle` quote) so the Scala Native NIR generator never has to lower this
   * call chain at every spliced use site.
   */
  def boundInstance(o: GodotObject): GodotScriptClass = {
    // A null handle has no bound instance — and `object_get_instance_id(null)`
    // would crash. This path is hit when wrapping a null object, e.g. building
    // the default value for a bare `var x: NodeType` export (DefaultValue).
    if (o.isNull) null
    else {
      val objectId = gdext.Godot.interface.object_get_instance_id(o.objectPtr).toLong
      gdext.internal.register.ClassRegistry.instanceForObjectId(objectId)
    }
  }

  /**
   * Derive a `ClassMeta[T]` for any class in the engine hierarchy
   * (`T <: GodotScriptClass`) — engine wrappers AND user classes. The Godot class
   * name is `T`'s simple name (matching how registration names it), and
   * `fromHandle` builds a fresh `new T{}` (an anonymous concrete subclass, since
   * engine wrappers are abstract) bound to the given handle via `withHost`,
   * falling back to the canonical bound instance when one exists.
   */
  inline given derived[T <: GodotScriptClass]: ClassMeta[T] = ${ derivedImpl[T] }

  private def derivedImpl[T <: GodotScriptClass: Type](using
    Quotes
  ): Expr[ClassMeta[T]] = {
    import quotes.reflect.*
    val tpe = TypeRepr.of[T]
    val sym = tpe.typeSymbol

    val name = Expr(sym.name)
    // A fresh `new T{}` immediately rebound to the real handle via `withHost`.
    // The constructor-param values are throwaway (we pass the zero value for each:
    // `null.asInstanceOf[A]` — null for refs, 0/false for primitives) rather than
    // summoning real defaults. That keeps `fromHandle` cheap (no per-call default
    // allocation) and breaks the recursion a real default would cause for a
    // self-referential class (e.g. a `Player` whose ctor takes a `Tscn[Player]`).
    // For abstract engine wrappers this is `new Node2D {}` — the anonymous-subclass
    // form the per-class givens emitted before.
    val ctor = sym.primaryConstructor
    val ctorArgs: List[Term] =
      ctor.paramSymss.flatten.filterNot(_.isType).map { p =>
        val ptpe = p.tree match {
          case v: ValDef => v.tpt.tpe
          case _         => TypeRepr.of[Any]
        }
        ptpe.asType match { case '[a] => '{ null.asInstanceOf[a] }.asTerm }
      }
    val fresh =
      Block(Nil, Apply(Select(New(Inferred(tpe)), ctor), ctorArgs)).asExprOf[T]

    '{
      new ClassMeta[T] {
        def className: String = $name
        def fromHandle(
          p: gdext.internal.ffi.types.GDExtensionObjectPtr
        ): T = {
          // Identity preservation: if this engine object already has a canonical
          // Scala instance bound to it (one Godot created and drives the virtuals
          // on), return THAT instance rather than a fresh wrapper. A fresh wrapper
          // would re-run the class's field initializers, giving a second object
          // whose state diverges from the one being processed. Only fall back to a
          // fresh wrapper for objects with no bound Scala instance (pure engine
          // objects). The lookup lives in `ClassMeta.boundInstance` (a plain
          // method) so this spliced body stays a single flat call.
          val o = GodotObject.fromPtr(p)
          val bound = ClassMeta.boundInstance(o)
          if (bound != null) bound.asInstanceOf[T]
          else ${ fresh }.withHost(p).asInstanceOf[T]
        }
      }
    }
  }
}
