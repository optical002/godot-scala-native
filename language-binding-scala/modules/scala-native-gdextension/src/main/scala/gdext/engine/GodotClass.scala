package gdext.engine

import scala.quoted.*
import gdext.register.GodotScriptClass
import gdext.codegen.engine.RefCounted

/**
 * Type-class describing a Godot engine class `T` (one of the generated opaque
 * wrappers). Carries the metadata `Gd[T]` and casting need at runtime:
 *
 *  - the engine class name (for class-tag / cast lookups),
 *  - whether instances are reference-counted (`RefCounted` subtree) vs
 *    manually-managed (`Object`/`Node` subtree),
 *  - how to wrap a raw [[GodotObject]] handle as a `T` and back.
 *
 * The generator emits one `given GodotClass[T]` per engine class. For
 * **user-defined** registered classes the [[derived]] given synthesizes one
 * automatically, so referencing your own classes through `Gd[T]` (e.g. as an
 * `@gdexport` field) needs no boilerplate.
 */
trait GodotClass[T] {
  def className: String
  def isRefCounted: Boolean
  def wrap(o: GodotObject): T
  def unwrap(t: T): GodotObject
}

object GodotClass {
  def apply[T](using gc: GodotClass[T]): GodotClass[T] = gc

  /**
   * Auto-derive a `GodotClass[T]` for any user class in the engine hierarchy
   * (`T <: GodotScriptClass`). The Godot class name is `T`'s simple name (matching
   * how registration names it), ref-counting is read from the type, and `wrap`
   * builds a fresh Scala wrapper bound to the given handle. Engine classes keep
   * their own (more specific) companion given, so this only fills in user classes.
   */
  inline given derived[T <: GodotScriptClass]: GodotClass[T] = ${ derivedImpl[T] }

  private def derivedImpl[T <: GodotScriptClass: Type](using
    Quotes
  ): Expr[GodotClass[T]] = {
    import quotes.reflect.*
    val tpe = TypeRepr.of[T]
    val sym = tpe.typeSymbol
    if (sym.flags.is(Flags.Abstract) || sym.flags.is(Flags.Trait))
      report.errorAndAbort(
        s"Cannot derive GodotClass for abstract ${sym.name}; only concrete registered classes"
      )

    val name = Expr(sym.name)
    val isRc = Expr(tpe <:< TypeRepr.of[RefCounted])
    // A fresh Scala wrapper, immediately rebound to the real handle via
    // `withHost` — so the constructor-param values are throwaway. We pass the
    // zero value for each (`null.asInstanceOf[A]`: null for refs, 0/false for
    // primitives) rather than summoning real defaults. That keeps `wrap` cheap
    // (no allocation per call) and, crucially, breaks the recursion a real
    // default would cause for a self-referential class (e.g. a `Player` whose
    // ctor takes a `Tscn[Player]` would otherwise need `GodotClass[Player]`).
    val ctor = sym.primaryConstructor
    val ctorArgs: List[Term] =
      ctor.paramSymss.flatten.filterNot(_.isType).map { p =>
        val ptpe = p.tree match {
          case v: ValDef => v.tpt.tpe
          case _         => TypeRepr.of[Any]
        }
        ptpe.asType match { case '[a] => '{ null.asInstanceOf[a] }.asTerm }
      }
    val fresh = Apply(Select(New(Inferred(tpe)), ctor), ctorArgs).asExprOf[T]

    '{
      new GodotClass[T] {
        def className: String = $name
        def isRefCounted: Boolean = $isRc
        def wrap(o: GodotObject): T =
          $fresh.withHost(o.objectPtr).asInstanceOf[T]
        def unwrap(t: T): GodotObject = t.hostObject
      }
    }
  }
}
