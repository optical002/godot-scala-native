package gdext.internal.register

import gdext.internal.engine.{Tres, Required, ClassMeta}
import gdext.internal.engine.GodotObject.*
import gdext.builtin.{PackedStringArrayRead, ObjectPropertyList, StringNames}
import gdext.classes.{Skeleton3D, AnimationMixer, SpriteFrames, AnimationTree,
  AnimationNodeStateMachine}

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

  /** True when no comp-enum builder is registered for ANY property. Lets the
    * `validate_property` trampoline early-out before allocating per-call strings
    * — the common case (a project using no comp-reference dropdowns), where the
    * editor still calls `validate_property` for every property of every node. */
  def isEmpty: Boolean = builders.isEmpty

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

  // PROPERTY_USAGE_* flags relevant to filtering an AnimationTree's parameters:
  // a tree reports every nested node's internals (current_length/position/delta,
  // per-blend-point backward, ...) alongside the few genuinely settable params.
  // Keep only entries the inspector itself would show as editable.
  private final val UsageStorage = 2L
  private final val UsageEditor = 4L
  private final val UsageReadOnly = 1L << 28

  private def editableParams(t: AnimationTree, prefix: String): Seq[String] =
    ObjectPropertyList
      .namesWithUsage(t.hostObject.objectPtr)
      .collect {
        case (name, usage)
            if name.startsWith(prefix) &&
              (usage & UsageReadOnly) == 0L &&
              (usage & (UsageStorage | UsageEditor)) != 0L =>
          name.stripPrefix(prefix)
      }
      .distinct

  def animationTreeParams(t: AnimationTree): Seq[String] =
    if (t == null) Seq("")
    else {
      val params = editableParams(t, "parameters/")
      if (params.isEmpty) Seq("") else params
    }

  def animationStateNames(t: AnimationTree): Seq[String] =
    if (t == null) Seq("")
    else {
      // The root AnimationNodeStateMachine stores one `states/<name>/node`
      // property per state (including the built-in Start/End); the tree's own
      // `parameters/...` list can't be used because states whose node has no
      // parameters (e.g. a plain AnimationNodeAnimation) don't appear there.
      val root = t.getTreeRoot()
      val names =
        if (root.isNull) Seq.empty[String]
        else
          ObjectPropertyList
            .names(root.objectPtr)
            .collect {
              case p if p.startsWith("states/") && p.endsWith("/node") =>
                p.stripPrefix("states/").stripSuffix("/node")
            }
            .distinct
      if (names.isEmpty) Seq("") else names
    }

  def animationStateParams(t: AnimationTree, state: String): Seq[String] =
    if (t == null || state.isEmpty) Seq("")
    else {
      val params = editableParams(t, s"parameters/$state/")
      if (params.isEmpty) Seq("") else params
    }

  /** Names of the sub-nodes inside one state's `AnimationNodeBlendTree` (e.g. a
    * OneShot to fire, or a plain AnimationNodeAnimation whose clip is swapped at
    * runtime). Read from the blend tree's own `nodes/<name>/node` properties, so
    * every sub-node is listed — NOT from the tree's `parameters/...` paths, which
    * omit sub-nodes that expose no editable parameter (e.g. AnimationNodeAnimation). */
  def animationStateNodeNames(t: AnimationTree, state: String): Seq[String] =
    if (t == null || state.isEmpty) Seq("")
    else {
      val root = t.getTreeRoot()
      val names =
        if (root.isNull) Seq.empty[String]
        else {
          val stateMachine =
            summon[ClassMeta[AnimationNodeStateMachine]].fromHandle(root.objectPtr)
          val stateNode = stateMachine.getNode(StringNames.cached(state))
          if (stateNode.isNull) Seq.empty[String]
          else
            ObjectPropertyList
              .names(stateNode.objectPtr)
              .collect {
                case p if p.startsWith("nodes/") && p.endsWith("/node") =>
                  p.stripPrefix("nodes/").stripSuffix("/node")
              }
              .distinct
        }
      if (names.isEmpty) Seq("") else names
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
