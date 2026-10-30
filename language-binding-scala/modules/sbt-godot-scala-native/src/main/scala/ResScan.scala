package godotscala

import java.io.{BufferedReader, File, FileInputStream, InputStreamReader}
import java.nio.charset.StandardCharsets
import java.nio.file.Files

/**
 * Build-time generator for the typed `res://` tree (`game.Res`).
 *
 * Walks the Godot project and emits one `inline def` per file, typed from Godot's
 * own metadata, so a renamed/deleted asset breaks compilation of code that uses
 * it and a wrong-kind resource is a type error:
 *
 *  - `<f>.import` present  -> its `type="X"` (`PackedScene` imports, e.g. `.glb`,
 *                             become `ScenePath[Node]`).
 *  - `.tres`               -> `type=` of the `[gd_resource ...]` header.
 *  - `.tscn`               -> `type=` of the root `[node ...]` (inherited scene -> `Node`).
 *  - `.res` / `.scn`       -> `ResPath[Resource]` / `ScenePath[Node]` (binary, unread).
 *  - anything else         -> `FilePath`.
 *
 * Reads headers only. Never fails the build: an unknown class name falls back to
 * `Resource`/`Node` with a warning, and colliding names get an extension suffix.
 * Output is sorted and has no timestamps, so unchanged input gives identical text.
 */
object ResScan {

  sealed trait Kind
  final case class Res(scalaType: String) extends Kind
  final case class Scene(rootType: String) extends Kind
  case object Plain extends Kind

  /** `rel` is the `/`-separated path under the project root. */
  final case class Entry(rel: String, kind: Kind)

  final case class Result(entries: Seq[Entry], warnings: Seq[String])

  private val EngineResource = "gdext.classes.Resource"
  private val EngineNode     = "gdext.classes.Node"

  private val SkippedDirs  = Set("addons")
  private val SkippedExts  = Set("import", "uid", "gd", "gdextension", "cs", "tmp")
  private val SkippedFiles = Set("project.godot", "export_presets.cfg")

  private val TypeAttr = """\btype="([^"]+)"""".r

  // ---- walking ---------------------------------------------------------------

  /** Asset files under `godotDir` (sorted), skipping Godot's and the build's own
    * directories, any dir with a `.gdignore` or a `build.sbt`, and `excluded`. */
  def assetFiles(godotDir: File, excluded: Seq[File] = Seq.empty): Seq[File] = {
    val excludedPaths = excluded.map(canonical).toSet
    def walk(dir: File): Seq[File] = {
      val children = Option(dir.listFiles).getOrElse(Array.empty[File]).toSeq.sortBy(_.getName)
      children.flatMap { f =>
        val n = f.getName
        if (n.startsWith(".")) Seq.empty
        else if (f.isDirectory) {
          if (
            SkippedDirs.contains(n) ||
            Files.isSymbolicLink(f.toPath) ||
            new File(f, ".gdignore").exists ||
            new File(f, "build.sbt").exists ||
            excludedPaths.contains(canonical(f))
          ) Seq.empty
          else walk(f)
        } else if (SkippedFiles.contains(n) || SkippedExts.contains(ext(n))) Seq.empty
        else Seq(f)
      }
    }
    if (!godotDir.isDirectory || new File(godotDir, ".gdignore").exists) Seq.empty
    else walk(godotDir)
  }

  /** Cheap change fingerprint: path, size and mtime of every asset and its
    * `.import`, plus the class map. Unchanged -> the scan can be skipped. */
  def fingerprint(
    godotDir: File,
    files: Seq[File],
    gameClasses: Map[String, String],
    objectName: String
  ): String = {
    val md = java.security.MessageDigest.getInstance("MD5")
    def add(s: String): Unit = md.update((s + "\n").getBytes(StandardCharsets.UTF_8))
    add(objectName)
    add(generatorStamp)
    files.foreach { f =>
      add(s"${rel(godotDir, f)}|${f.length}|${f.lastModified}")
      val imp = new File(f.getPath + ".import")
      if (imp.exists) add(s"import|${imp.length}|${imp.lastModified}")
    }
    gameClasses.toSeq.sorted.foreach { case (k, v) => add(s"class|$k|$v") }
    md.digest().map("%02x".format(_)).mkString
  }

  /** Size + mtime of the jar (or class dir) holding this generator, so a
    * plugin upgrade or `publishLocal` invalidates the fingerprint. */
  private lazy val generatorStamp: String =
    try {
      val f = new File(getClass.getProtectionDomain.getCodeSource.getLocation.toURI)
      s"${f.getPath}|${f.length}|${f.lastModified}"
    } catch { case _: Exception => "" }

  // ---- typing ----------------------------------------------------------------

  def scan(
    godotDir: File,
    files: Seq[File],
    engineNames: Set[String],
    gameClasses: Map[String, String]
  ): Result = {
    val warnings = Vector.newBuilder[String]

    def resolve(godotName: String, fallback: String, where: String): String =
      if (engineNames.contains(godotName) && godotName != "EngineExtras")
        s"gdext.classes.$godotName"
      else
        gameClasses.get(godotName) match {
          case Some(fqcn) => fqcn
          case None =>
            warnings += s"$where: unknown class '$godotName', typed as ${fallback.split('.').last}"
            fallback
        }

    val entries = files.map { f =>
      val r   = rel(godotDir, f)
      val imp = new File(f.getPath + ".import")
      val kind: Kind =
        if (imp.exists)
          importType(imp) match {
            case Some("PackedScene") => Scene(EngineNode)
            case Some(t)             => Res(resolve(t, EngineResource, r))
            case None                => Plain
          }
        else
          ext(f.getName) match {
            case "tres" =>
              headerType(f) match {
                case Some(t) => Res(resolve(t, EngineResource, r))
                case None    => Res(EngineResource)
              }
            case "tscn" =>
              sceneRootType(f) match {
                case Some(t) => Scene(resolve(t, EngineNode, r))
                case None    => Scene(EngineNode)
              }
            case "res" => Res(EngineResource)
            case "scn" => Scene(EngineNode)
            case _     => Plain
          }
      Entry(r, kind)
    }
    Result(entries, warnings.result())
  }

  /** `type=` of the first line (`[gd_resource type="X" ...]`). */
  private def headerType(f: File): Option[String] =
    firstLine(f).flatMap(l =>
      if (l.startsWith("[gd_resource")) TypeAttr.findFirstMatchIn(l).map(_.group(1)) else None
    )

  /** `type=` of the root node: the first `[node` line. `None` for an inherited
    * scene (root carries `instance=` and no `type=`). */
  private def sceneRootType(f: File): Option[String] =
    withLines(f) { next =>
      var line = next()
      while (line != null && !line.startsWith("[node ")) line = next()
      if (line == null || line.contains("instance=")) None
      else TypeAttr.findFirstMatchIn(line).map(_.group(1))
    }

  /** `type=` in the `[remap]` section of an `.import` file (absent for
    * `importer="keep"`/`"skip"`). */
  private def importType(f: File): Option[String] =
    withLines(f) { next =>
      var line = next()
      var inRemap = false
      var found: Option[String] = None
      while (found.isEmpty && line != null) {
        val t = line.trim
        if (t.startsWith("[")) inRemap = t == "[remap]"
        else if (inRemap && t.startsWith("type="))
          found = TypeAttr.findFirstMatchIn(t).map(_.group(1)).filter(_.nonEmpty)
        line = next()
      }
      found
    }

  private def firstLine(f: File): Option[String] = withLines(f)(next => Option(next()))

  private def withLines[A](f: File)(body: (() => String) => Option[A]): Option[A] =
    try {
      val r = new BufferedReader(new InputStreamReader(new FileInputStream(f), StandardCharsets.UTF_8))
      try body(() => r.readLine())
      finally r.close()
    } catch { case _: java.io.IOException => None }

  // ---- naming ----------------------------------------------------------------

  private val Keywords = Set(
    "abstract", "case", "catch", "class", "def", "do", "else", "enum", "export",
    "extends", "false", "final", "finally", "for", "given", "if", "implicit",
    "import", "lazy", "match", "new", "null", "object", "override", "package",
    "private", "protected", "return", "sealed", "super", "then", "throw", "trait",
    "true", "try", "type", "val", "var", "while", "with", "yield"
  )
  // Members of every `object`: a same-named generated def would clash.
  private val Reserved = Set(
    "equals", "hashCode", "toString", "getClass", "notify", "notifyAll", "wait",
    "clone", "finalize", "eq", "ne", "synchronized", "asInstanceOf", "isInstanceOf"
  )

  /** A stable camelCase identifier for a file stem or directory name. */
  def identifier(raw: String): String = {
    val parts = raw.split("[^\\p{L}\\p{N}]+").filter(_.nonEmpty).toList
    val camel = parts match {
      case Nil => "_"
      case head :: tail =>
        lowerHead(head) + tail.map(p => p.head.toUpper.toString + p.tail).mkString
    }
    val id = if (camel.head.isDigit) "_" + camel else camel
    if (Keywords.contains(id)) s"`$id`"
    else if (Reserved.contains(id)) id + "_"
    else id
  }

  /** `Player` -> `player`, `HUD` -> `hud`, `UIRoot` -> `uiRoot`. */
  private def lowerHead(s: String): String = {
    val upper = s.takeWhile(_.isUpper).length
    if (upper == 0) s
    else if (upper == s.length) s.toLowerCase
    else if (upper == 1) s.head.toLower.toString + s.tail
    else s.take(upper - 1).toLowerCase + s.drop(upper - 1)
  }

  // ---- rendering -------------------------------------------------------------

  private final class Dir {
    val dirs  = scala.collection.mutable.Map.empty[String, Dir]
    val files = scala.collection.mutable.ArrayBuffer.empty[Entry]
  }

  def render(entries: Seq[Entry], objectName: String): String = {
    val root = new Dir
    entries.foreach { e =>
      val segs = e.rel.split('/').toList
      val dir  = segs.init.foldLeft(root)((d, s) => d.dirs.getOrElseUpdate(s, new Dir))
      dir.files += e
    }
    val sb = new StringBuilder
    sb ++= "// GENERATED — DO NOT EDIT.\n"
    sb ++= "// Regenerated by ResScan (sbt-godot-scala-native) from the Godot project's\n"
    sb ++= "// files. Disable with `godotResRefs := false`.\n"
    sb ++= "package game\n\n"
    sb ++= "import gdext.api.{FilePath, ResPath, ScenePath}\n\n"
    sb ++= s"object $objectName {\n"
    renderDir(root, 1, sb)
    sb ++= "}\n"
    sb.toString
  }

  private def renderDir(d: Dir, depth: Int, sb: StringBuilder): Unit = {
    val ind = "  " * depth
    // Name every member of this directory, resolving collisions deterministically:
    // colliding files take their extension as a suffix (`playerPng`), and any
    // remaining duplicate a numeric one (sorted by original name).
    val dirNames  = d.dirs.keys.toSeq.sorted.map(n => (identifier(n), Left(n): Either[String, Entry]))
    val fileBases = d.files.sortBy(_.rel).map(e => (identifier(stem(e.rel)), Right(e): Either[String, Entry]))
    val clashing  = (dirNames ++ fileBases).groupBy(_._1).filter(_._2.size > 1).keySet
    val named0 = dirNames ++ fileBases.map {
      case (id, r @ Right(e)) if clashing.contains(id) =>
        val x = ext(fileName(e.rel))
        (if (x.isEmpty) id else identifier(stem(e.rel) + "_" + x), r)
      case other => other
    }
    val seen = scala.collection.mutable.Map.empty[String, Int]
    val named = named0.map { case (id, m) =>
      val n = seen.getOrElse(id, 0) + 1
      seen(id) = n
      (if (n == 1) id else s"${id.stripSuffix("`")}$n".stripPrefix("`"), m)
    }
    named.sortBy(_._1).foreach {
      case (id, Left(dirName)) =>
        sb ++= s"${ind}object $id {\n"
        renderDir(d.dirs(dirName), depth + 1, sb)
        sb ++= s"$ind}\n"
      case (id, Right(e)) =>
        val p = literal("res://" + e.rel)
        // `_root_`-qualified: a member named like a package (`game.json`,
        // a `ui/` folder) would otherwise shadow it inside this object.
        val line = e.kind match {
          case Res(t0) =>
            val t = s"_root_.$t0"
            s"inline def $id: ResPath[$t] = ResPath[$t]($p)"
          case Scene(t0) =>
            val t = s"_root_.$t0"
            s"inline def $id: ScenePath[$t] = ScenePath[$t]($p)"
          case Plain    => s"inline def $id: FilePath = FilePath($p)"
        }
        sb ++= s"$ind$line\n"
    }
  }

  // ---- helpers ---------------------------------------------------------------

  private def literal(s: String): String =
    "\"" + s.flatMap {
      case '"'  => "\\\""
      case '\\' => "\\\\"
      case c    => c.toString
    } + "\""

  private def canonical(f: File): String = f.getCanonicalFile.getPath

  private def rel(root: File, f: File): String =
    root.toPath.relativize(f.toPath).toString.replace('\\', '/')

  private def fileName(rel: String): String = rel.substring(rel.lastIndexOf('/') + 1)

  private def ext(name: String): String = {
    val i = name.lastIndexOf('.')
    if (i <= 0) "" else name.substring(i + 1).toLowerCase
  }

  private def stem(rel: String): String = {
    val n = fileName(rel)
    val i = n.lastIndexOf('.')
    if (i <= 0) n else n.substring(0, i)
  }
}
