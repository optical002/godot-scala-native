package gdext.internal.register

import gdext.internal.engine.{Tres, Required}
import gdext.builtin.{PackedStringArrayRead, ObjectPropertyList}
import gdext.classes.{Skeleton3D, AnimationMixer, SpriteFrames, AnimationTree}

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
          gdext.Log.trace(
            s"CompEnum builder threw for $className.$propName: $t"
          )
          Seq.empty
      }
    }

  /** Drop all builders on hot-reload deinit (mirrors ClassRegistry.clearClasses). */
  def clear(): Unit = builders.clear()
}

/**
 * Enumeration helpers + the [[AsRef]] projection. Each helper takes the comp
 * already projected to its bare wrapper type `E` and returns the option names; a
 * null/unassigned comp yields `Seq("")` so the resulting ENUM has a single valid
 * empty entry rather than a malformed empty hint string.
 */
object CompEnum {

  def boneNames(sk: Skeleton3D): Seq[String] =
    if (sk == null) Seq("")
    else {
      // Iterate getBoneName(i) (a String return) rather than the comma-joined
      // getConcatenatedBoneNames (a StringName return) — the StringName ptrcall
      // return path is a known-buggy Phase-2 caveat (see Ptrcall.PtrRet).
      val n = sk.getBoneCount().toInt
      if (n <= 0) Seq("")
      else (0 until n).map(i => sk.getBoneName(i.toLong))
    }

  def animationNames(m: AnimationMixer): Seq[String] =
    if (m == null) Seq("")
    else {
      val names = PackedStringArrayRead.call0(
        "AnimationMixer", "get_animation_list", 1139954409L, m.hostObject.objectPtr
      )
      if (names.isEmpty) Seq("") else names
    }

  def spriteAnimationNames(f: SpriteFrames): Seq[String] =
    if (f == null) Seq("")
    else {
      val names = PackedStringArrayRead.call0(
        "SpriteFrames", "get_animation_names", 1139954409L, f.hostObject.objectPtr
      )
      if (names.isEmpty) Seq("") else names
    }

  def animationTreeParams(t: AnimationTree): Seq[String] =
    if (t == null) Seq("")
    else {
      val params = ObjectPropertyList
        .names(t.hostObject.objectPtr)
        .filter(_.startsWith("parameters/"))
        .map(_.stripPrefix("parameters/"))
        .distinct
      if (params.isEmpty) Seq("") else params
    }

  /**
   * Projects a comp field's declared type `C` to the bare wrapper `E` the
   * enumeration expects. Summoned at the macro site; the annotation fixes `E`, so
   * a comp of an incompatible type fails to summon with a clear compile error. An
   * unassigned/empty reference projects to a null `E` (the helpers guard it).
   */
  trait AsRef[C, E] {
    def ref(c: C): E
  }
  object AsRef {
    import gdext.internal.register.GodotScriptClass
    // A comp declared as a `Sub` reference satisfies an enumeration expecting a
    // `Super` reference (e.g. an `AnimationPlayer` comp enumerated as an
    // `AnimationMixer`). The wrapper only holds an opaque handle and enumeration
    // reads it through the supertype, so the upcast is sound. `<:<` is reflexive,
    // so this also covers the exact-type case.
    given bare[E <: GodotScriptClass, F](using E <:< F): AsRef[E, F] =
      c => if (c == null) null.asInstanceOf[F] else c.asInstanceOf[F]
    given tres[E <: GodotScriptClass, F](using E <:< F): AsRef[Tres[E], F] =
      c => if (c == null || c.raw == null) null.asInstanceOf[F] else c.raw.asInstanceOf[F]
    given opt[C, F](using inner: AsRef[C, F]): AsRef[Option[C], F] =
      c => c.fold(null.asInstanceOf[F])(inner.ref)
    given req[C, F](using inner: AsRef[C, F]): AsRef[Required[C], F] =
      c => c.toOption.fold(null.asInstanceOf[F])(inner.ref)
  }
}
