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
 * or object), its primary constructor takes no parameters (Godot's factory
 * builds instances with no args), and its parent chain reaches a Godot engine
 * class — either directly or through other classes in this module (so an
 * abstract base extending an engine class still links its concrete subclasses).
 */
object RegistrationScan {

  private final case class ClassInfo(
    pkg: String,
    name: String,
    isAbstract: Boolean,
    ctorParams: Int,
    parent: Option[String]
  )

  /**
   * @param harnessSrcDir the module's `src/main/scala` directory
   * @param engineDir     the generated engine-class package directory; its file
   *                      names are the authoritative set of Godot base classes
   */
  def generate(harnessSrcDir: File, engineDir: File): String = {
    val engineNames: Set[String] =
      Option(engineDir.listFiles).getOrElse(Array.empty[File]).iterator
        .filter(f => f.isFile && f.getName.endsWith(".scala"))
        .map(_.getName.stripSuffix(".scala"))
        .toSet

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

    val registerable = classes
      .filter { c =>
        !c.isAbstract &&
        c.ctorParams == 0 &&
        c.parent.exists(reachesEngine(_, Set(c.name)))
      }
      .sortBy(c => (c.pkg, c.name))

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
       |// Regenerated on every compile by RegistrationScan (see project/ and build.sbt).
       |// Every concrete class in this module that extends a Godot engine class is
       |// discovered automatically: add a class and it registers, with no edits to
       |// GameEntry or any list. See .claude/memories/layer5-register.md.
       |package game
       |
       |import io.github.optical002.godot.register.Register
       |
       |object GeneratedRegistrations {
       |
       |  /** Registers every auto-discovered game class. Called once from GameEntry. */
       |  def registerAll(): Unit = {
       |$calls
       |  }
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
            ctorParams = c.ctor.paramss.iterator.map(_.size).sum,
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
