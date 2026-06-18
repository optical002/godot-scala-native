package io.github.optical002.godot.register

import scala.quoted.*
import io.github.optical002.godot.builtin.{ToVariant, FromVariant}
import io.github.optical002.godot.codegen.gdextensioninterface.types.*
import io.github.optical002.godot.codegen.gdextensioninterface.types.GDExtensionVariantType.*

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
  private val knownVirtuals = List(
    "_ready", "_process", "_physics_process",
    "_enter_tree", "_exit_tree", "_update_property",
    "_can_handle", "_parse_property"
  )

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
    // Filtering out traits matters for `case class`es, which the compiler also
    // mixes with `Product`/`Serializable` — these can sort ahead of the real
    // superclass in the linearization.
    val baseName: String = {
      val supers = sym.typeRef.baseClasses
      // baseClasses lists T then its ancestors most-derived first. The first
      // class (non-trait) above T is the direct engine superclass.
      val parent = supers.drop(1)
        .find(s => !s.flags.is(Flags.Trait))
        .getOrElse(
          report.errorAndAbort(
            s"$className must extend a generated Godot engine class, e.g. `class $className extends Node2D`"
          )
        )
      parent.name
    }
    val baseNameExpr = Expr(baseName)

    // --- runtime vs. tool class ------------------------------------------
    // `is_runtime` is only meaningful for Nodes: it keeps the editor from
    // ticking their _process/_ready while merely editing a scene. Resources
    // (and any other non-Node Object) are never ticked, and they must be REAL
    // instances in the editor because you edit and save them there. Registering
    // a Resource as runtime sends the editor down its placeholder/recreate path,
    // which hangs the editor on hot-reload when the resource is referenced by an
    // open scene. So: Node subtree -> runtime; everything else -> tool/non-runtime.
    val isRuntimeExpr =
      Expr(tpe <:< TypeRepr.of[io.github.optical002.godot.codegen.engine.Node])

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

    // Build the get/set lambdas for a field of type A on T.
    def fieldLambdas[A: Type](
      fName: String
    ): (Expr[GodotScriptClass => A], Expr[(GodotScriptClass, A) => Unit]) = {
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
      (getLambda, setLambda)
    }

    def emitExport[A: Type](
      fName: String,
      propName: String,
      et: Expr[ExportType[A]]
    ): Expr[Unit] = {
      val (g, s) = fieldLambdas[A](fName)
      '{
        PropertyRegistration.registerExport[A](
          $classNameExpr,
          ${ Expr(propName) },
          get = $g,
          set = $s
        )(using $et)
      }
    }

    // For a parameterless Scala 3 enum field, synthesize an ExportType inline
    // (no pre-written given is possible for user enums).
    def enumExportType[A: Type]: Option[Expr[ExportType[A]]] = {
      val sym = TypeRepr.of[A].typeSymbol
      if (!sym.flags.is(Flags.Enum)) None
      else {
        val cases = sym.children
        if (cases.isEmpty || cases.exists(_.isClassDef))
          report.errorAndAbort(
            s"@gdexport $className: enum ${sym.name} must have only parameterless cases"
          )
        val hintStr = Expr(cases.map(_.name).mkString(","))
        val companion = sym.companionModule
        Some('{
          new ExportType[A] {
            def variantType = GDEXTENSION_VARIANT_TYPE_INT
            override def hint = PropertyHint.Enum
            override def hintString = $hintStr
            override def usage = PropertyUsage.Default | PropertyUsage.ClassIsEnum
            def toVariant(value: A, dest: GDExtensionVariantPtr): Unit =
              ToVariant[Long].toVariant(
                value.asInstanceOf[scala.reflect.Enum].ordinal.toLong,
                dest
              )
            def fromVariant(v: GDExtensionVariantPtr): A =
              ${
                Select
                  .unique(Ref(companion), "fromOrdinal")
                  .appliedTo('{ FromVariant[Int].fromVariant(v) }.asTerm)
                  .asExprOf[A]
              }
          }
        })
      }
    }

    def registerExportFor(f: Symbol): Expr[Unit] = {
      val fName = f.name
      val propName = snake(fName)
      val fTpe = f.tree match {
        case v: ValDef => v.tpt.tpe
        case _         => TypeRepr.of[Any]
      }
      fTpe.asType match {
        case '[a] =>
          Expr.summon[ExportType[a]] match {
            case Some(et) => emitExport[a](fName, propName, et)
            case None =>
              enumExportType[a] match {
                case Some(et) => emitExport[a](fName, propName, et)
                case None =>
                  report.errorAndAbort(
                    s"@gdexport $className.$fName: unsupported type '${typeName(fTpe)}' " +
                      "(need an ExportType[A] given, or a parameterless enum)"
                  )
              }
          }
      }
    }

    def registerSignalFor(m: Symbol): Expr[Unit] =
      '{ SignalRegistration.registerSignal($classNameExpr, ${ Expr(snake(m.name)) }) }

    // --- constructor-param auto-export ------------------------------------
    // Any class (case or not) extending an engine class exports each `var`
    // primary-ctor param as if `@gdexport` were inlined on it — a `var` so a
    // setter exists for Godot to write through (`val`/plain params are skipped
    // silently). Params need no explicit default: the factory below fills any
    // un-defaulted one from its type's `DefaultValue` (an explicit `= ...` still
    // wins). So `class Player(var projectile: Gd[Projectile]) extends Node2D`
    // exports `projectile` with no annotation and no default.
    val ctorParamFields: List[Symbol] = {
      val paramNames = sym.primaryConstructor.paramSymss.flatten.map(_.name).toSet
      fields.filter(f => paramNames.contains(f.name) && f.flags.is(Flags.Mutable))
    }

    val funcRegs = methods.filter(hasAnn(_, funcAnn)).map(registerFuncFor)
    // Body-annotated exports plus the case-class ctor-param exports, de-duped by
    // name so a param that is also `@gdexport`-annotated only registers once.
    val exportFields =
      (fields.filter(hasAnn(_, exportAnn)) ++ ctorParamFields)
        .foldLeft((Set.empty[String], List.empty[Symbol])) {
          case ((seen, acc), f) =>
            if (seen.contains(f.name)) (seen, acc)
            else (seen + f.name, f :: acc)
        }
        ._2
        .reverse
    val exportRegs = exportFields.map(registerExportFor)
    val signalRegs = methods.filter(hasAnn(_, signalAnn)).map(registerSignalFor)

    // --- assemble ---------------------------------------------------------
    // Godot builds instances with no args, so we must supply every primary-ctor
    // param explicitly (a `Nil` Apply does NOT fill defaults). For each param,
    // in order of preference:
    //   1. the user's explicit default, if any — its getter lives on the
    //      companion as `<init>$default$N` (mangled `$lessinit$greater$default$N`);
    //   2. otherwise a value summoned from the param type's `DefaultValue`;
    //   3. otherwise, for a parameterless enum, its first case (`fromOrdinal(0)`).
    // So params need no `= ...` for any supported export type.
    val factory: Expr[() => GodotScriptClass] = {
      val ctor = sym.primaryConstructor
      val params = ctor.paramSymss.flatten.filterNot(_.isType)
      val companion = sym.companionModule
      val defaultGetters: Map[String, Symbol] =
        if (companion.exists)
          companion.declaredMethods
            .filter(_.name.contains("$default$"))
            .map(m => m.name -> m)
            .toMap
        else Map.empty

      def defaultValueArg(p: Symbol): Term = {
        val ptpe = p.tree match {
          case v: ValDef => v.tpt.tpe
          case _ =>
            report.errorAndAbort(
              s"$className: cannot determine the type of constructor parameter '${p.name}'"
            )
        }
        ptpe.asType match {
          case '[a] =>
            Expr.summon[DefaultValue[a]] match {
              case Some(dv) => '{ $dv.default }.asTerm
              case None =>
                val es = TypeRepr.of[a].typeSymbol
                if (es.flags.is(Flags.Enum))
                  Select
                    .unique(Ref(es.companionModule), "fromOrdinal")
                    .appliedTo(Literal(IntConstant(0)))
                else
                  report.errorAndAbort(
                    s"$className: constructor parameter '${p.name}' of type " +
                      s"'${typeName(ptpe)}' has no default — give it one (`= ...`) " +
                      "or provide a DefaultValue given for its type"
                  )
            }
        }
      }

      val args: List[Term] = params.zipWithIndex.map { case (p, i) =>
        val direct = s"$$lessinit$$greater$$default$$${i + 1}"
        val alt    = s"<init>$$default$$${i + 1}"
        defaultGetters.get(direct).orElse(defaultGetters.get(alt)) match {
          // The getter is a nullary method (`def ...$default$N = <expr>`), so
          // referencing it via Select evaluates it — no empty arg list.
          case Some(m) => Select(Ref(companion), m)
          case None    => defaultValueArg(p)
        }
      }
      val newExpr = Apply(Select(New(Inferred(tpe)), ctor), args)
      '{ () => ${ newExpr.asExprOf[T] }.asInstanceOf[GodotScriptClass] }
    }

    val classReg: Expr[Unit] = '{
      ClassRegistration.register(
        ClassDescriptor(
          className = $classNameExpr,
          parentClassName = $baseNameExpr,
          factory = $factory,
          overriddenVirtuals = $overridden,
          isRuntime = $isRuntimeExpr
        )
      )
    }

    val all: List[Expr[Unit]] = classReg :: (funcRegs ++ exportRegs ++ signalRegs).toList
    Expr.block(all.init, all.last)
  }
}
