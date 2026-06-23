package godotscala

import java.io.File
import sbt.io.IO
import scala.meta._

/**
 * Build-time discovery of the game's Godot classes.
 *
 * Scala Native dead-code-eliminates any class not referenced from a reachable
 * root and never runs module initializers at library load, so classes cannot
 * register themselves at runtime — every one must be referenced from a reachable
 * root at compile time. Rather than maintain that list by hand in `GameEntry`,
 * this scanner parses the game sources at build time and generates the list.
 *
 * A class is registered iff it is a concrete `class` (not abstract, not a trait
 * or object), every primary-constructor parameter is constructible with no
 * caller args — i.e. it either has a default OR is a `var` (the macro factory
 * fills an un-defaulted `var` from its type's DefaultValue; see Register.scala)
 * — and its parent chain reaches a Godot engine class, either directly or
 * through other classes in this module (so an abstract base extending an engine
 * class still links its concrete subclasses). A zero-param class is vacuously
 * fine; a `case class` (or plain class) whose params are all `var` thus
 * qualifies, and the macro auto-exports those `var` params.
 *
 * Moved out of the consuming project (`harness-scala/project/`) into this sbt
 * plugin so downstream game projects carry no build machinery — they apply
 * [[GodotScalaNativePlugin]] and write only game classes.
 */
object RegistrationScan {

  private final case class ClassInfo(
    pkg: String,
    name: String,
    isAbstract: Boolean,
    allParamsConstructible: Boolean,
    parent: Option[String]
  )

  /** Classpath resource (packaged into the binding jar) listing every Godot
    * engine base-class name, one per line. See the `engine-classes.txt`
    * resourceGenerator in language-binding-scala/build.sbt. */
  val EngineClassesResource = "gdext/engine-classes.txt"

  /**
   * The C symbol Godot loads as the GDExtension `entry_symbol`. Hardcoded (not a
   * build setting): it is emitted as `@exported(EntrySymbol)` onto the generated
   * entry point and **must** equal `entry_symbol` in
   * `godot/godot_scala.gdextension`. Changing it requires editing both here and
   * that manifest (and `sbt clean`, per conventions — stale `.nir` otherwise
   * causes "multiple definition").
   */
  val EntrySymbol = "godot_scala_init"

  /**
   * Reads the authoritative set of Godot engine base-class names from the
   * binding on the given classpath (the `gdext` dependency). Works whether the
   * binding is a source `ProjectRef` (resources on a directory entry) or the
   * published jar — both expose [[EngineClassesResource]] on the classpath.
   */
  def engineNamesFromClasspath(classpath: Seq[File]): Set[String] = {
    val loader =
      new java.net.URLClassLoader(classpath.map(_.toURI.toURL).toArray, null)
    try {
      val is = loader.getResourceAsStream(EngineClassesResource)
      if (is == null) Set.empty
      else
        try
          scala.io.Source
            .fromInputStream(is, "UTF-8")
            .getLines()
            .map(_.trim)
            .filter(_.nonEmpty)
            .toSet
        finally is.close()
    } finally loader.close()
  }

  /**
   * @param harnessSrcDir the module's `src/main/scala` directory
   * @param engineNames   the authoritative set of Godot base-class names
   *                      (see [[engineNamesFromClasspath]])
   * @param selfTest      whether the generated entry runs the binding's internal
   *                      self-tests once at SCENE init
   */
  def generate(
    harnessSrcDir: File,
    engineNames: Set[String],
    selfTest: Boolean
  ): String = {
    val classes: Seq[ClassInfo] =
      allScalaFiles(harnessSrcDir).flatMap(parseFile)
    val byName: Map[String, ClassInfo] = classes.map(c => c.name -> c).toMap

    def reachesEngine(name: String, seen: Set[String]): Boolean =
      if (engineNames.contains(name)) true
      else if (seen.contains(name)) false // cycle guard
      else
        byName.get(name) match {
          case Some(ci) => ci.parent.exists(reachesEngine(_, seen + name))
          case None     => false
        }

    // Godot requires a parent extension class to be registered before its
    // child, so emit classes parents-first. `depth` counts hops up the
    // in-module parent chain: a class rooted directly on an engine class is
    // depth 0, its custom subclass depth 1, and so on. Single inheritance means
    // a depth-ascending order is a valid topological order; (pkg, name) stays as
    // a deterministic tiebreaker.
    def depth(name: String, seen: Set[String]): Int =
      byName.get(name).flatMap(_.parent) match {
        case Some(p) if byName.contains(p) && !seen.contains(p) =>
          1 + depth(p, seen + name)
        case _ => 0
      }

    val registerable = classes
      .filter { c =>
        !c.isAbstract &&
        c.allParamsConstructible &&
        c.parent.exists(reachesEngine(_, Set(c.name)))
      }
      .sortBy(c => (depth(c.name, Set(c.name)), c.pkg, c.name))

    val calls =
      if (registerable.isEmpty) "    // (no game classes discovered)"
      else
        registerable
          .map { c =>
            val fqn = if (c.pkg.isEmpty) c.name else s"${c.pkg}.${c.name}"
            s"    Register.auto[$fqn]()"
          }
          .mkString("\n")

    s"""// GENERATED — DO NOT EDIT.
       |// Regenerated on every compile by RegistrationScan (shipped in the
       |// sbt-godot-scala-native plugin). Every concrete class in this module that
       |// extends a Godot engine class is discovered automatically: add a class and
       |// it registers, with no entry edits or any list. The GDExtension entry point
       |// below is generated too — the exported symbol is fixed
       |// ("$EntrySymbol"). See .claude/memories/layer5-register.md.
       |package game
       |
       |import scala.scalanative.unsafe.*
       |import scala.scalanative.unsigned.*
       |import gdext.api.*
       |
       |object GeneratedRegistrations {
       |
       |  /** Registers every auto-discovered game class. Called once from the
       |    * generated entry point. */
       |  def registerAll(): Unit = {
       |$calls
       |  }
       |}
       |
       |/**
       | * The game project's GDExtension entry point.
       | *
       | * Godot calls the `@exported` C symbol "$EntrySymbol" (see
       | * godot/godot_scala.gdextension's `entry_symbol`) when the extension loads;
       | * we forward to the binding's `gdext.api.GodotEntry.run`. The `@exported`
       | * annotation also keeps this method a reachable Scala Native linker root.
       | * The FFI types in the signature come via `gdext.api` aliases, so this
       | * generated glue never names an internal package.
       | *
       | * Generated — the symbol is fixed in RegistrationScan.EntrySymbol; it must
       | * equal `entry_symbol` in the .gdextension manifest.
       | */
       |object GeneratedEntry {
       |  @exported("$EntrySymbol")
       |  def init(
       |    getProcAddress: EntryGetProcAddress,
       |    library: EntryClassLibraryPtr,
       |    r_initialization: Ptr[EntryInitialization]
       |  ): CUnsignedChar =
       |    GodotEntry.run(
       |      getProcAddress,
       |      library,
       |      r_initialization,
       |      register = () => GeneratedRegistrations.registerAll(),
       |      selfTest = $selfTest
       |    )
       |}
       |""".stripMargin
  }

  private def allScalaFiles(dir: File): Seq[File] =
    if (!dir.exists) Seq.empty
    else {
      val entries = Option(dir.listFiles).getOrElse(Array.empty[File]).toSeq
      entries.filter(f => f.isFile && f.getName.endsWith(".scala")) ++
        entries.filter(_.isDirectory).flatMap(allScalaFiles)
    }

  private def parseFile(f: File): Seq[ClassInfo] = {
    val input = Input.VirtualFile(f.getAbsolutePath, IO.read(f))
    dialects.Scala3(input).parse[Source] match {
      case Parsed.Success(src) => collectClasses(src, "")
      case Parsed.Error(_, msg, _) =>
        System.err.println(
          s"[auto-register] could not parse ${f.getName}, skipping: $msg"
        )
        Seq.empty
    }
  }

  private def collectClasses(tree: Tree, pkg: String): Seq[ClassInfo] =
    tree match {
      case s: Source => s.stats.flatMap(collectClasses(_, pkg))
      case p: Pkg =>
        val name   = p.ref.toString
        val nextPk = if (pkg.isEmpty) name else s"$pkg.$name"
        p.stats.flatMap(collectClasses(_, nextPk))
      case c: Defn.Class =>
        Seq(
          ClassInfo(
            pkg = pkg,
            name = c.name.value,
            isAbstract = c.mods.exists(_.is[Mod.Abstract]),
            allParamsConstructible = c.ctor.paramss.forall(_.forall { p =>
              p.default.isDefined || p.mods.exists(_.is[Mod.VarParam])
            }),
            parent = c.templ.inits.headOption.map(i => typeName(i.tpe))
          )
        )
      case _ => Seq.empty
    }

  /** Simple (unqualified) trailing name of a parent type. */
  private def typeName(t: Type): String = t match {
    case Type.Name(v)            => v
    case Type.Select(_, n)       => n.value
    case Type.Apply(tpe, _)      => typeName(tpe)
    case other                   => other.toString.split('.').last
  }
}
