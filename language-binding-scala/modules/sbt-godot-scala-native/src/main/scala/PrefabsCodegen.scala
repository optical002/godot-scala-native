package godotscala

import java.io.File
import scala.io.Source

/** Build-time generation of the HOCON files a game's prefab/id config layer
  * reads at runtime:
  *
  *   - `<generatedDir>/prefabs.conf` — parsed from a Godot `prefabs.tres`
  *     (class `Prefabs`) plus each referenced `.tscn`'s root node `type=`. The
  *     `prefabs` runtime module ([[prefabs.ParseCtx]]) consumes this index.
  *   - `<generatedDir>/<idConf._2>` — one per [[IdConf]] entry, mapping every
  *     `<name>.conf` stem under `<configDir>/<idConf.subdir>/` to its own string
  *     key.
  *
  * Game-agnostic: paths and the id-config table come in as parameters (the sbt
  * plugin's `genConfig` task supplies them from project settings). Ported from
  * the survivor-game `project/Codegen.scala` (itself a port of the Rust
  * `codegen` crate).
  */
object PrefabsCodegen {

  /** `(config subdir under configDir, generated file rel. to generatedDir,
    * hocon section name)` — one per id-bearing config directory. */
  final case class IdConf(subdir: String, outFile: String, section: String)

  /**
   * Generate all config artifacts.
   *
   * @param prefabsTres   the Godot `prefabs.tres` resource file
   * @param prefabsDir    root dir holding the referenced prefab `.tscn`s (the
   *                      `res://prefabs/` mount point)
   * @param generatedDir  output dir for `prefabs.conf` + the id confs
   * @param configDir     base dir the id-conf `subdir`s are resolved against
   * @param idConfs       the id directories to emit
   */
  def run(
    prefabsTres: File,
    prefabsDir: File,
    generatedDir: File,
    configDir: File,
    idConfs: Seq[IdConf],
    log: String => Unit = Console.err.println
  ): Unit = {
    for (idc <- idConfs)
      generateIdsConf(configDir, generatedDir, idc)

    val entries: Seq[PrefabEntry] =
      readToString(prefabsTres) match {
        case Some(text) =>
          extractPrefabEntries(text, prefabsDir).getOrElse {
            log("codegen: prefabs.tres has no parseable `scenes = { ... }` block; emitting empty prefabs.conf")
            Seq.empty
          }
        case None =>
          log(s"codegen: prefabs.tres not found at ${prefabsTres.getPath}; emitting empty prefabs.conf")
          Seq.empty
      }

    val tree = buildTree(entries)
    val body = new StringBuilder
    body.append(
      "# AUTO-GENERATED from prefabs.tres by the godot-scala-native plugin.\n" +
        "# Do not edit by hand. Edit the .tres in the Godot editor and rebuild.\n" +
        "prefabs {\n"
    )
    emitNode(tree, body, 1)
    body.append("}\n")

    writeIfChanged(new File(generatedDir, "prefabs.conf"), body.toString)
  }

  /** List the `*.conf` file stems in `dir`, sorted for deterministic output. */
  private def collectConfNames(dir: File): Seq[String] = {
    val files = Option(dir.listFiles()).getOrElse(Array.empty[File])
    files.toSeq
      .filter(f => f.getName.endsWith(".conf"))
      .map(f => f.getName.stripSuffix(".conf"))
      .sorted
  }

  private def generateIdsConf(configDir: File, generatedDir: File, idc: IdConf): Unit = {
    val names = collectConfNames(new File(configDir, idc.subdir))
    val out   = new File(generatedDir, idc.outFile)

    val body = new StringBuilder
    body.append(
      s"# AUTO-GENERATED from ${idc.subdir}/*.conf by the godot-scala-native plugin.\n" +
        "# Do not edit by hand. Edit the per-entry files and rebuild.\n" +
        s"${idc.section} {\n"
    )
    for (name <- names)
      body.append("  ").append(name).append(" = \"").append(name).append("\"\n")
    body.append("}\n")

    writeIfChanged(out, body.toString)
  }

  private def writeIfChanged(path: File, body: String): Unit = {
    readToString(path) match {
      case Some(existing) if existing == body => ()
      case _ =>
        Option(path.getParentFile).foreach(_.mkdirs())
        val w = new java.io.FileWriter(path)
        try w.write(body)
        finally w.close()
    }
  }

  private def readToString(f: File): Option[String] =
    if (f.isFile) {
      val src = Source.fromFile(f, "UTF-8")
      try Some(src.mkString)
      finally src.close()
    } else None

  private final case class PrefabEntry(key: String, rootType: String, tscnAbsPath: Option[File])

  /** Parse `prefabs.tres`, returning one entry per `scenes` dictionary key. For
    * each key we resolve its `ExtResource("...")` back to the
    * `[ext_resource ... path="res://prefabs/.../X.tscn" id="..."]` line, then
    * open the `.tscn` and read the root `[node ... type="X"]`. */
  private def extractPrefabEntries(text: String, prefabsDir: File): Option[Seq[PrefabEntry]] = {
    val extResources = collectExtResources(text)

    val resourceIdx = text.indexOf("[resource]")
    if (resourceIdx < 0) return None
    val afterResource = text.substring(resourceIdx)
    val scenesIdx = afterResource.indexOf("scenes")
    if (scenesIdx < 0) return None
    val openRel = afterResource.substring(scenesIdx).indexOf('{')
    if (openRel < 0) return None
    val openIdx = openRel + scenesIdx
    val closeIdx = findMatchingBrace(afterResource.substring(openIdx)) match {
      case Some(c) => c
      case None    => return None
    }
    val block = afterResource.substring(openIdx + 1, openIdx + closeIdx)

    val entries = scala.collection.mutable.ArrayBuffer.empty[PrefabEntry]
    var rest = block
    var continue = true
    while (continue) {
      val q1 = rest.indexOf('"')
      if (q1 < 0) { continue = false }
      else {
        val afterOpen = rest.substring(q1 + 1)
        val q2Rel = afterOpen.indexOf('"')
        if (q2Rel < 0) { continue = false }
        else {
          val key  = afterOpen.substring(0, q2Rel)
          val tail = afterOpen.substring(q2Rel + 1).replaceAll("^\\s+", "")
          if (tail.startsWith(":")) {
            extractExtResourceId(tail).foreach { rid =>
              val rootTypeOpt: Option[(File, String)] =
                extResources.get(rid)
                  .flatMap(resPath => resPathToTscn(resPath, prefabsDir))
                  .flatMap(tscnAbs => readRootType(tscnAbs).map(t => (tscnAbs, t)))
              val (tscnAbsPath, typeName) = rootTypeOpt match {
                case Some((p, t)) => (Some(p), t)
                case None         => (None, "Node")
              }
              if (!entries.exists(_.key == key))
                entries += PrefabEntry(key, typeName, tscnAbsPath)
            }
          }
          rest = afterOpen.substring(q2Rel + 1)
        }
      }
    }

    Some(entries.toSeq)
  }

  private def collectExtResources(text: String): Map[String, String] = {
    val out = scala.collection.mutable.Map.empty[String, String]
    for (raw <- text.linesIterator) {
      val line = raw.trim
      if (line.startsWith("[ext_resource") && line.contains("type=\"PackedScene\"")) {
        for {
          path <- quotedAttr(line, "path=")
          id   <- quotedAttr(line, "id=")
        } out(id) = path
      }
    }
    out.toMap
  }

  /** Find a quoted attribute on a `.tres`/`.tscn` line. Matches `key` only when
    * preceded by whitespace, `[`, or `,`, so `id=` does not accidentally match
    * the `id=` substring inside `uid=`. */
  private def quotedAttr(line: String, key: String): Option[String] = {
    var searchFrom = 0
    var result: Option[String] = None
    var done = false
    while (!done) {
      val rel = line.indexOf(key, searchFrom)
      if (rel < 0) done = true
      else {
        val idx = rel
        val precededOk = idx == 0 || {
          val c = line.charAt(idx - 1)
          c == ' ' || c == '\t' || c == '[' || c == ','
        }
        if (precededOk) {
          val after = line.substring(idx + key.length)
          if (after.startsWith("\"")) {
            val body = after.substring(1)
            val end  = body.indexOf('"')
            if (end >= 0) result = Some(body.substring(0, end))
          }
          done = true
        } else {
          searchFrom = idx + key.length
        }
      }
    }
    result
  }

  private def extractExtResourceId(tail: String): Option[String] = {
    val idx = tail.indexOf("ExtResource(")
    if (idx < 0) None
    else {
      val after = tail.substring(idx + "ExtResource(".length).replaceAll("^\\s+", "")
      if (!after.startsWith("\"")) None
      else {
        val body = after.substring(1)
        val end  = body.indexOf('"')
        if (end < 0) None else Some(body.substring(0, end))
      }
    }
  }

  private def resPathToTscn(resPath: String, prefabsDir: File): Option[File] = {
    val prefix = "res://prefabs/"
    if (!resPath.startsWith(prefix)) None
    else Some(new File(prefabsDir, resPath.substring(prefix.length)))
  }

  private def readRootType(tscn: File): Option[String] =
    readToString(tscn).flatMap { text =>
      text.linesIterator
        .map(_.trim)
        .filter(_.startsWith("[node "))
        .flatMap(line => quotedAttr(line, "type="))
        .find(_ => true)
    }

  /** One node in the prefab tree. May simultaneously be a leaf (a key like
    * `a/b` registered directly) and a group (a parent for nested keys like
    * `a/b/c`). When both occur, the group is emitted with a `_` prefix to keep
    * the HOCON valid. */
  private final class TreeNode {
    var leaf: Option[Leaf] = None
    val children: scala.collection.mutable.TreeMap[String, TreeNode] =
      scala.collection.mutable.TreeMap.empty[String, TreeNode]
  }
  private final case class Leaf(path: String, rootType: String)

  private def buildTree(entries: Seq[PrefabEntry]): TreeNode = {
    val root = new TreeNode
    for (e <- entries) {
      var node = root
      for (seg <- e.key.split('/'))
        node = node.children.getOrElseUpdate(seg, new TreeNode)
      node.leaf = Some(Leaf(e.key, e.rootType))
    }
    root
  }

  private def emitNode(node: TreeNode, out: StringBuilder, depth: Int): Unit = {
    val indent = "  " * depth
    for ((name, child) <- node.children) {
      child.leaf.foreach { leaf =>
        out.append(indent)
          .append(name)
          .append(" = { path = \"")
          .append(leaf.path)
          .append("\", type = \"")
          .append(leaf.rootType)
          .append("\" }\n")
      }
      if (child.children.nonEmpty) {
        val groupName = if (child.leaf.isDefined) s"_$name" else name
        out.append(indent).append(groupName).append(" {\n")
        emitNode(child, out, depth + 1)
        out.append(indent).append("}\n")
      }
    }
  }

  private def findMatchingBrace(text: String): Option[Int] = {
    val bytes = text
    if (bytes.isEmpty || bytes.charAt(0) != '{') return None
    var depth = 0
    var inString = false
    var escape = false
    var i = 0
    var result: Option[Int] = None
    while (i < bytes.length && result.isEmpty) {
      val b = bytes.charAt(i)
      if (escape) { escape = false }
      else if (b == '\\' && inString) { escape = true }
      else if (b == '"') { inString = !inString }
      else if (!inString) {
        if (b == '{') depth += 1
        else if (b == '}') {
          depth -= 1
          if (depth == 0) result = Some(i)
        }
      }
      i += 1
    }
    result
  }
}
