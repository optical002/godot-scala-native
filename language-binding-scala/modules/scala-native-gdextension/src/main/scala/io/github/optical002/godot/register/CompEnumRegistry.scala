package io.github.optical002.godot.register

import io.github.optical002.godot.engine.{Gd, Tres, Required}
import io.github.optical002.godot.builtin.{PackedStringArrayRead, ObjectPropertyList}
import io.github.optical002.godot.codegen.engine.{Skeleton3D, AnimationMixer, SpriteFrames, AnimationTree}

/**
 * Runtime backing for the component-reference dropdown annotations
 * ([[exportBoneName]] / [[exportAnimation]] / [[exportSpriteAnimation]] /
 * [[exportAnimationProperty]]).
 *
 * The `Register` macro registers, for each annotated `String` property, a
 * builder closure keyed by `(className, propName)`. The closure reads the
 * sibling comp's current value off the live instance and enumerates the option
 * names. At inspect time `ClassRegistration`'s `validate_property` trampoline
 * looks the builder up and rewrites the property to an ENUM with those options.
 */
object CompEnumRegistry {
  private val builders =
    new java.util.concurrent.ConcurrentHashMap[String, GodotScriptClass => Seq[String]]()

  private def key(className: String, propName: String): String =
    s"$className::$propName"

  /** Register an enum-names builder for one string property. */
  def register(
    className: String,
    propName: String,
    build: GodotScriptClass => Seq[String]
  ): Unit =
    builders.put(key(className, propName), build)

  /**
   * Look up and run the builder for `(className, propName)`. Returns `None` when
   * no comp annotation governs the property (so the trampoline leaves it alone).
   * A throwing builder degrades to `Some(Seq.empty)` — never let an exception
   * unwind across the C ABI boundary.
   */
  def namesFor(
    className: String,
    propName: String,
    inst: GodotScriptClass
  ): Option[Seq[String]] =
    Option(builders.get(key(className, propName))).map { b =>
      try b(inst)
      catch {
        case t: Throwable =>
          io.github.optical002.godot.Log.trace(
            s"CompEnum builder threw for $className.$propName: $t"
          )
          Seq.empty
      }
    }

  /** Drop all builders on hot-reload deinit (mirrors ClassRegistry.clearClasses). */
  def clear(): Unit = builders.clear()
}

/**
 * Enumeration helpers + the [[AsGd]] projection. Each helper takes the comp
 * already projected to a `Gd[E]` and returns the option names; a null/unassigned
 * comp yields `Seq("")` so the resulting ENUM has a single valid empty entry
 * rather than a malformed empty hint string.
 */
object CompEnum {

  def boneNames(g: Gd[Skeleton3D]): Seq[String] =
    if (g == null || g.isNull) Seq("")
    else {
      // Iterate getBoneName(i) (a String return) rather than the comma-joined
      // getConcatenatedBoneNames (a StringName return) — the StringName ptrcall
      // return path is a known-buggy Phase-2 caveat (see Ptrcall.PtrRet).
      val sk = g.get
      val n = sk.getBoneCount().toInt
      if (n <= 0) Seq("")
      else (0 until n).map(i => sk.getBoneName(i.toLong))
    }

  def animationNames(g: Gd[AnimationMixer]): Seq[String] =
    if (g == null || g.isNull) Seq("")
    else {
      val names = PackedStringArrayRead.call0(
        "AnimationMixer", "get_animation_list", 1139954409L, g.objectPtr
      )
      if (names.isEmpty) Seq("") else names
    }

  def spriteAnimationNames(g: Gd[SpriteFrames]): Seq[String] =
    if (g == null || g.isNull) Seq("")
    else {
      val names = PackedStringArrayRead.call0(
        "SpriteFrames", "get_animation_names", 1139954409L, g.objectPtr
      )
      if (names.isEmpty) Seq("") else names
    }

  def animationTreeParams(g: Gd[AnimationTree]): Seq[String] =
    if (g == null || g.isNull) Seq("")
    else {
      val params = ObjectPropertyList
        .names(g.objectPtr)
        .filter(_.startsWith("parameters/"))
        .map(_.stripPrefix("parameters/"))
        .distinct
      if (params.isEmpty) Seq("") else params
    }

  /**
   * Projects a comp field's declared type `C` to the `Gd[E]` the enumeration
   * expects. Summoned at the macro site; the annotation fixes `E`, so a comp of
   * an incompatible type fails to summon with a clear compile error. An
   * unassigned/empty reference projects to a null `Gd[E]` (the helpers guard it).
   */
  trait AsGd[C, E] {
    def gd(c: C): Gd[E]
  }
  object AsGd {
    // A comp declared as `Gd[Sub]` satisfies an enumeration expecting `Gd[Super]`
    // (e.g. an `AnimationPlayer` comp enumerated as an `AnimationMixer`). `Gd` is
    // invariant, but it only wraps an opaque handle and enumeration reads it
    // through the supertype, so the cast is sound. `<:<` is reflexive, so this
    // also covers the exact-type case.
    given gd[E, F](using E <:< F): AsGd[Gd[E], F] =
      c => if (c == null) null.asInstanceOf[Gd[F]] else c.asInstanceOf[Gd[F]]
    given tres[E, F](using E <:< F): AsGd[Tres[E], F] =
      c => if (c == null) null.asInstanceOf[Gd[F]] else c.raw.asInstanceOf[Gd[F]]
    given opt[C, F](using inner: AsGd[C, F]): AsGd[Option[C], F] =
      c => c.fold(null.asInstanceOf[Gd[F]])(inner.gd)
    given req[C, F](using inner: AsGd[C, F]): AsGd[Required[C], F] =
      c => c.toOption.fold(null.asInstanceOf[Gd[F]])(inner.gd)
  }
}
