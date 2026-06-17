package io.github.optical002.godot.engine

import scala.quoted.*
import io.github.optical002.godot.register.GodotScriptClass
import io.github.optical002.godot.codegen.engine.RefCounted

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
    if (sym.primaryConstructor.paramSymss.flatten.nonEmpty)
      report.errorAndAbort(
        s"Cannot derive GodotClass for ${sym.name}: its constructor must take no arguments"
      )

    val name = Expr(sym.name)
    val isRc = Expr(tpe <:< TypeRepr.of[RefCounted])
    // `new T()` (a fresh Scala wrapper); bound to the handle in `wrap` below.
    val fresh =
      Apply(Select(New(Inferred(tpe)), sym.primaryConstructor), Nil).asExprOf[T]

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
