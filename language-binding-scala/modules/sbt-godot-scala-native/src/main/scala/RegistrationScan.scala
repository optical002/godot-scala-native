package godotscala

import java.io.File
import java.util.zip.ZipFile
import sbt.io.IO
import scala.meta._
import scala.collection.JavaConverters._

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
 * fine; a class whose params are all `var` thus qualifies, and the macro
 * auto-exports those `var` params.
 *
 * A `case class` whose parent chain reaches an engine class is rejected: the
 * scan fails the build naming each one (Godot objects have identity, so
 * structural `equals`/`hashCode`/`copy` are wrong for them). Case classes that
 * do not extend an engine class are ordinary game data and are ignored.
 *
 * Moved out of the consuming project (`harness-scala/project/`) into this sbt
 * plugin so downstream game projects carry no build machinery — they apply
 * [[GodotScalaNativePlugin]] and write only game classes.
 */
object RegistrationScan {

  private final case class ClassInfo(
    pkg: String,
    name: String,
    location: String,
    isCase: Boolean,
    isAbstract: Boolean,
    allParamsConstructible: Boolean,
    parent: Option[String]
  )

  /** Classpath resource (packaged into the binding jar) listing every Godot
    * engine base-class name, one per line. See the `engine-classes.txt`
    * resourceGenerator in language-binding-scala/build.sbt. */
  val EngineClassesResource = "gdext/engine-classes.txt"

  /**
   * Marker resource a downstream "godot library" jar packages into its MAIN
   * artifact to opt its node classes into auto-registration. A consuming game
   * project lists such a library only in `libraryDependencies` (no extra
   * setting); the plugin detects the marker on the dependency classpath, then
   * resolves the library's `-sources.jar` and merges its `.scala` sources into
   * the scan — so library nodes register exactly like local game classes, with
   * no consumer-side code. The binding jar itself does NOT carry this marker, so
   * its engine classes are never scanned as registerable. A library declares it
   * with a tiny resourceGenerator (see ../utilities/build.sbt).
   */
  val GodotLibraryMarker = "gdext/godot-library.txt"

  /** True if `jar` is a godot-library main artifact (carries
    * [[GodotLibraryMarker]]). Directory classpath entries (source ProjectRefs)
    * are checked too, for symmetry. */
  def isGodotLibraryArtifact(entry: File): Boolean =
    if (!entry.exists) false
    else if (entry.isDirectory) new File(entry, GodotLibraryMarker).exists
    else
      try {
        val zf = new ZipFile(entry)
        try zf.getEntry(GodotLibraryMarker) != null
        finally zf.close()
      } catch { case _: Throwable => false }

  /** Extract `(virtualPath -> content)` for every `.scala` entry in a sources
    * jar. Used to feed a godot-library's published sources into the scan. */
  def scalaSourcesFromJar(jar: File): Seq[(String, String)] =
    if (!jar.exists || jar.isDirectory) Seq.empty
    else {
      val zf = new ZipFile(jar)
      try
        zf.entries.asScala
          .filter(e => !e.isDirectory && e.getName.endsWith(".scala"))
          .map { e =>
            val is = zf.getInputStream(e)
            try {
              val content = scala.io.Source.fromInputStream(is, "UTF-8").mkString
              (e.getName, content)
            } finally is.close()
          }
          .toVector
      finally zf.close()
    }

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
   * @param librarySources `(virtualPath -> content)` pairs from godot-library
   *                      dependencies' source jars (see [[scalaSourcesFromJar]]).
   *                      Their concrete nodes are scanned and registered exactly
   *                      like local game classes — that is what makes a published
   *                      library's nodes auto-register with no consumer code.
   */
  def generate(
    harnessSrcDir: File,
    engineNames: Set[String],
    selfTest: Boolean,
    librarySources: Seq[(String, String)] = Seq.empty
  ): String =
    generateWithClasses(harnessSrcDir, engineNames, selfTest, librarySources).source

  /** What one scan produces: the registrations source, the Godot class name ->
    * Scala FQCN of every class reaching an engine class (for [[ResScan]]), the
    * packages declared by the module's own (non-library) sources, and the engine
    * classes the wrapper factory knows (None: all of them). */
  final case class Scan(
    source: String,
    godotClasses: Map[String, String],
    localPackages: Set[String],
    engineClasses: Option[Seq[String]]
  )

  /** [[generate]] plus what [[Scan]] carries. With `engineGraph`, the generated
    * entry installs a wrapper factory over just the engine classes the sources
    * can observe (see [[EngineClassScan]]); without it, over all of them. */
  def generateWithClasses(
    harnessSrcDir: File,
    engineNames: Set[String],
    selfTest: Boolean,
    librarySources: Seq[(String, String)],
    engineGraph: Option[EngineClassScan.Graph] = None,
    generatedSources: Map[String, String] => Seq[String] = _ => Seq.empty
  ): Scan = {
    // Local game sources + every godot-library dependency's published sources,
    // as uniform (path, content) units so both feed the same scan/fingerprint.
    val localUnits: Seq[(String, String)] =
      allScalaFiles(harnessSrcDir).map(f => (f.getAbsolutePath, IO.read(f)))
    val allUnits: Seq[(String, String)] = localUnits ++ librarySources

    val parsed: Seq[(String, Seq[ClassInfo], String, Seq[String])] =
      allUnits.map { case (path, content) =>
        val (cs, shape, pkgs) = parseSource(path, content)
        (path, cs, shape, pkgs)
      }
    val classes: Seq[ClassInfo] = parsed.flatMap(_._2)
    val localPackages: Set[String] =
      parsed.take(localUnits.size).flatMap(_._4).toSet
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

    val caseClasses =
      classes.filter(c => c.isCase && c.parent.exists(reachesEngine(_, Set(c.name))))
    if (caseClasses.nonEmpty)
      sys.error(
        caseClasses
          .map(c => s"  ${c.location}: case class ${c.name}")
          .mkString(
            "[auto-register] Godot classes cannot be case classes; " +
              "declare them as a plain `class` instead:\n",
            "\n",
            ""
          )
      )

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

    // Fingerprint of all scanned sources. Embedding it makes this generated file
    // change whenever any game source changes, which forces Zinc to recompile it
    // so the `Register.auto[T]` macro factories re-expand against the CURRENT
    // class definitions. Without it the generated text is byte-identical across
    // builds (the class list is unchanged), Zinc skips recompiling it, and the
    // stale Scala Native NIR keeps calling an old constructor after you add/remove
    // a `var` field — nativeLink then fails with "unknown constructor /
    // unreachable symbol". It hashes each source's *shape* (see [[shapeOf]]):
    // bodies of methods with a declared return type are dropped, because the
    // macros read only declarations, so editing such a body recompiles just its
    // own file instead of re-expanding every `Register.auto[T]` here.
    val srcFingerprint = {
      val md = java.security.MessageDigest.getInstance("MD5")
      // Include library sources too: bumping a godot-library version changes its
      // node shapes, which must re-expand the `Register.auto[T]` macros here.
      parsed
        .sortBy(_._1)
        .foreach { case (_, _, shape, _) => md.update(shape.getBytes("UTF-8")) }
      md.digest().map("%02x".format(_)).mkString
    }

    val godotClasses: Map[String, String] =
      classes
        .filter(c => !c.isCase && c.parent.exists(reachesEngine(_, Set(c.name))))
        .map(c => c.name -> (if (c.pkg.isEmpty) c.name else s"${c.pkg}.${c.name}"))
        .toMap

    // Other generated sources (the Res tree) need the class map, and their
    // engine types must be in the factory too.
    val extraSources = generatedSources(godotClasses)
    val engineClasses: Option[Seq[String]] = engineGraph.map { g =>
      val seed = (allUnits.iterator.map(_._2) ++ extraSources.iterator)
        .flatMap(EngineClassScan.namesIn(_, g))
        .toSet
      EngineClassScan.closure(g, seed)
    }
    val (factoryDefn, factoryRef) = engineClasses match {
      case Some(cs) => (EngineClassScan.renderFactory(cs), "GeneratedEngineClasses.create")
      case None     => ("", "GodotEntry.allEngineClasses")
    }

    val source = s"""// GENERATED — DO NOT EDIT.
       |// Regenerated on every compile by RegistrationScan (shipped in the
       |// sbt-godot-scala-native plugin). Every concrete class in this module that
       |// extends a Godot engine class is discovered automatically: add a class and
       |// it registers, with no entry edits or any list. The GDExtension entry point
       |// below is generated too — the exported symbol is fixed
       |// ("$EntrySymbol").
       |// source-fingerprint: $srcFingerprint
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
       |  ): CUnsignedChar = {
       |    GodotEntry.useEngineClasses($factoryRef)
       |    GodotEntry.run(
       |      getProcAddress,
       |      library,
       |      r_initialization,
       |      register = () => GeneratedRegistrations.registerAll(),
       |      selfTest = $selfTest
       |    )
       |  }
       |}
       |
       |$factoryDefn""".stripMargin
    Scan(source, godotClasses, localPackages, engineClasses)
  }

  private def allScalaFiles(dir: File): Seq[File] =
    if (!dir.exists) Seq.empty
    else {
      val entries = Option(dir.listFiles).getOrElse(Array.empty[File]).toSeq
      entries.filter(f => f.isFile && f.getName.endsWith(".scala")) ++
        entries.filter(_.isDirectory).flatMap(allScalaFiles)
    }

  /** The classes in a source, plus its fingerprint shape (the raw content if
    * it does not parse). */
  /** Parse results by (path, content): the sbt server re-runs the scan on every
    * compile, but usually only one file changed. */
  private val parseCache =
    new java.util.concurrent.ConcurrentHashMap[(String, String), (Seq[ClassInfo], String, Seq[String])]()

  private def parseSource(
    path: String,
    content: String
  ): (Seq[ClassInfo], String, Seq[String]) = {
    val key = (path, content)
    val hit = parseCache.get(key)
    if (hit != null) hit
    else {
      // One entry per path: drop the previous version of this file.
      parseCache.keySet.removeIf(_._1 == path)
      val r = parseSourceUncached(path, content)
      parseCache.put(key, r)
      r
    }
  }

  private def parseSourceUncached(
    path: String,
    content: String
  ): (Seq[ClassInfo], String, Seq[String]) = {
    val input = Input.VirtualFile(path, content)
    dialects.Scala3(input).parse[Source] match {
      case Parsed.Success(src) =>
        (collectClasses(src, ""), shapeOf(src), packagesOf(src, ""))
      case Parsed.Error(_, msg, _) =>
        System.err.println(
          s"[auto-register] could not parse $path, skipping: $msg"
        )
        (Seq.empty, content, Seq.empty)
    }
  }

  /** Fully qualified names of the packages a source declares. */
  private def packagesOf(tree: Tree, outer: String): Seq[String] =
    tree match {
      case s: Source => s.stats.flatMap(packagesOf(_, outer))
      case p: Pkg =>
        val name = if (outer.isEmpty) p.ref.toString else s"$outer.${p.ref}"
        name +: p.stats.flatMap(packagesOf(_, name))
      case _ => Seq.empty
    }

  /** The source with the body of every method that declares its return type
    * replaced by `???`. `Register.auto` reads declarations only (names,
    * annotations, parameter and return types, constructor defaults), so these
    * bodies cannot change what it expands to. A method without a declared
    * return type keeps its body: its type is inferred from it. Field
    * initializers keep theirs for the same reason. */
  private[godotscala] def shapeOf(src: Source): String =
    src
      .transform {
        case d: Defn.Def if d.decltpe.isDefined => d.copy(body = Term.Name("???"))
      }
      .printSyntaxFor(dialects.Scala3)


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
            location = s"${c.pos.input.syntax}:${c.pos.startLine + 1}",
            isCase = c.mods.exists(_.is[Mod.Case]),
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
