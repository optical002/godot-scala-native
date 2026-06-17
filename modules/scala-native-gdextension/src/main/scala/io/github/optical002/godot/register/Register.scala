package io.github.optical002.godot.register

import scala.quoted.*

/**
 * Automatic, annotation-driven class registration — the gdext
 * `#[derive(GodotClass)]` analogue.
 *
 * `Register.auto[Player]()` scans `Player` at compile time and emits *all* the
 * registration calls: the class itself (Godot base derived from the superclass,
 * with auto-detected virtual overrides), every `@func` method, every
 * `@gdexport` property, and every `@signal`. Game code therefore writes zero
 * registration boilerplate — it only extends an engine class and annotates
 * members.
 */
object Register {

  /** Engine virtuals the framework knows how to dispatch (see ClassRegistration). */
  private val knownVirtuals = List("_ready", "_process", "_physics_process")

  /** Scala types we can marshal for `@func` returns and `@export` fields. */
  private val supportedTypes = Set("scala.Long", "scala.Int", "scala.Double", "scala.Boolean")

  // No `<: GodotScriptClass` bound: the macro is invoked from the generated
  // companion with a type that the compiler does not yet know satisfies the
  // bound. The class must still extend GodotScriptClass (the factory/dispatch
  // casts rely on it); that is guaranteed by usage, not the signature.
  inline def auto[T](): Unit =
    ${ autoImpl[T] }

  private def autoImpl[T: Type](using Quotes): Expr[Unit] = {
    import quotes.reflect.*

    val tpe = TypeRepr.of[T]
    val sym = tpe.typeSymbol
    val className = sym.name
    val classNameExpr = Expr(className)

    // --- engine base class from the direct superclass --------------------
    // `class Player extends Node2D` -> the Godot parent is `Node2D`. We take the
    // first non-trait base class above T; its simple name is the engine class.
    val baseName: String = {
      val supers = sym.typeRef.baseClasses
      // baseClasses lists T then its ancestors most-derived first. The element
      // right after T (skipping T itself) is the direct engine superclass.
      val parent = supers.drop(1).headOption.getOrElse(
        report.errorAndAbort(
          s"$className must extend a generated Godot engine class, e.g. `class $className extends Node2D`"
        )
      )
      parent.name
    }
    val baseNameExpr = Expr(baseName)

    // --- overridden virtuals ---------------------------------------------
    val baseSym = TypeRepr.of[GodotScriptClass].typeSymbol
    def declaresOverride(name: String): Boolean = {
      val owners = sym.typeRef.baseClasses.takeWhile(_ != baseSym)
      owners.exists(c => c.declaredMethods.exists(_.name == name))
    }
    val overridden = Expr(knownVirtuals.filter(declaresOverride).toSet)

    // --- helpers ----------------------------------------------------------
    def hasAnn(s: Symbol, annTpe: TypeRepr): Boolean =
      s.hasAnnotation(annTpe.typeSymbol)

    val funcAnn = TypeRepr.of[func]
    val exportAnn = TypeRepr.of[gdexport]
    val signalAnn = TypeRepr.of[signal]

    // snake_case Godot name from a camelCase Scala name.
    def snake(n: String): String =
      n.flatMap(c => if (c.isUpper) "_" + c.toLower else c.toString)

    // The fully-qualified type name of a member's result/field type.
    def typeName(t: TypeRepr): String = t.dealias.show

    // Build `(inst: GodotScriptClass) => inst.asInstanceOf[T].<member>(...)`.
    // We return the Term so the caller can type it as a function literal.
    def castInst(inst: Term): Term =
      Select.unique(inst, "asInstanceOf").appliedToType(tpe)

    // --- collect members --------------------------------------------------
    val methods = sym.declaredMethods
    val fields = sym.declaredFields

    // For each supported type, emit the correctly-typed registration call by
    // matching the member type string. This keeps the given-instance
    // resolution concrete (no generic A that the macro can't satisfy).
    def registerFuncFor(m: Symbol): Expr[Unit] = {
      val mName = m.name
      val godotName = snake(mName)
      val retTpe = m.tree match {
        case d: DefDef => d.returnTpt.tpe
        case _         => TypeRepr.of[Unit]
      }
      val tn = typeName(retTpe)
      // get-style: no-arg method returning a supported type. Givens are summoned
      // explicitly so the concrete-A instances resolve inside the splice.
      def getterCall[A: Type]: Expr[Unit] = {
        val tv = Expr.summon[io.github.optical002.godot.builtin.ToVariant[A]].getOrElse(
          report.errorAndAbort(s"no ToVariant for @func $className.$mName")
        )
        val vt = Expr.summon[VariantTypeOf[A]].getOrElse(
          report.errorAndAbort(s"no VariantTypeOf for @func $className.$mName")
        )
        val getLambda: Expr[GodotScriptClass => A] = '{ (inst: GodotScriptClass) =>
          ${
            Select
              .unique('{ inst.asInstanceOf[T] }.asTerm, mName)
              .appliedToArgs(Nil)
              .asExprOf[A]
          }
        }
        '{
          MethodRegistration.registerGetter[A](
            $classNameExpr,
            ${ Expr(godotName) },
            $getLambda
          )(using $tv, $vt)
        }
      }
      tn match {
        case "scala.Long"    => getterCall[Long]
        case "scala.Int"     => getterCall[Int]
        case "scala.Double"  => getterCall[Double]
        case "scala.Boolean" => getterCall[Boolean]
        case other =>
          report.errorAndAbort(
            s"@func $className.$mName: unsupported return type '$other' (supported: Long, Int, Double, Boolean)"
          )
      }
    }

    def registerExportFor(f: Symbol): Expr[Unit] = {
      val fName = f.name
      val propName = snake(fName)
      val fTpe = f.tree match {
        case v: ValDef => v.tpt.tpe
        case _         => TypeRepr.of[Any]
      }
      val tn = typeName(fTpe)
      def propCall[A: Type]: Expr[Unit] = {
        val tv = Expr.summon[io.github.optical002.godot.builtin.ToVariant[A]].getOrElse(
          report.errorAndAbort(s"no ToVariant for @gdexport $className.$fName")
        )
        val fv = Expr.summon[io.github.optical002.godot.builtin.FromVariant[A]].getOrElse(
          report.errorAndAbort(s"no FromVariant for @gdexport $className.$fName")
        )
        val vt = Expr.summon[VariantTypeOf[A]].getOrElse(
          report.errorAndAbort(s"no VariantTypeOf for @gdexport $className.$fName")
        )
        val getLambda: Expr[GodotScriptClass => A] = '{ (inst: GodotScriptClass) =>
          ${ Select.unique('{ inst.asInstanceOf[T] }.asTerm, fName).asExprOf[A] }
        }
        val setLambda: Expr[(GodotScriptClass, A) => Unit] =
          '{ (inst: GodotScriptClass, v: A) =>
            ${
              Select
                .unique('{ inst.asInstanceOf[T] }.asTerm, fName + "_=")
                .appliedTo('{ v }.asTerm)
                .asExprOf[Unit]
            }
          }
        '{
          PropertyRegistration.registerProperty[A](
            $classNameExpr,
            ${ Expr(propName) },
            get = $getLambda,
            set = $setLambda
          )(using $tv, $fv, $vt)
        }
      }
      tn match {
        case "scala.Long"    => propCall[Long]
        case "scala.Int"     => propCall[Int]
        case "scala.Double"  => propCall[Double]
        case "scala.Boolean" => propCall[Boolean]
        case other =>
          report.errorAndAbort(
            s"@export $className.$fName: unsupported type '$other' (supported: Long, Int, Double, Boolean)"
          )
      }
    }

    def registerSignalFor(m: Symbol): Expr[Unit] =
      '{ SignalRegistration.registerSignal($classNameExpr, ${ Expr(snake(m.name)) }) }

    val funcRegs = methods.filter(hasAnn(_, funcAnn)).map(registerFuncFor)
    val exportRegs = fields.filter(hasAnn(_, exportAnn)).map(registerExportFor)
    val signalRegs = methods.filter(hasAnn(_, signalAnn)).map(registerSignalFor)

    // --- assemble ---------------------------------------------------------
    val factory: Expr[() => GodotScriptClass] = {
      val newExpr = Apply(Select(New(Inferred(tpe)), tpe.typeSymbol.primaryConstructor), Nil)
      '{ () => ${ newExpr.asExprOf[T] }.asInstanceOf[GodotScriptClass] }
    }

    val classReg: Expr[Unit] = '{
      ClassRegistration.register(
        ClassDescriptor(
          className = $classNameExpr,
          parentClassName = $baseNameExpr,
          factory = $factory,
          overriddenVirtuals = $overridden
        )
      )
    }

    val all: List[Expr[Unit]] = classReg :: (funcRegs ++ exportRegs ++ signalRegs).toList
    Expr.block(all.init, all.last)
  }
}
