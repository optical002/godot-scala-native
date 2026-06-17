import java.io.{File, FileWriter}
import scala.io.Source

/**
 * Generates a `Harness`-prefixed subclass for every instantiable, non-editor
 * Godot **node** type (e.g. `HarnessNode2D extends Node2D`). These empty
 * subclasses exercise the full binding pipeline — the engine-class generator,
 * Scala inheritance, auto-discovery ([[RegistrationScan]]) and GDExtension
 * registration — for every base node type at once, and are what the Godot-side
 * validation (`node_harness_verify.gd`) checks.
 *
 * It also emits two data artifacts into the Godot project:
 *  - `harness_manifest.json` — `[{ "name": "HarnessX", "base": "X" }, ...]`,
 *    so the validator is data-driven (no hand-kept list).
 *  - `node_harness.tscn` — a scene with one of every Harness node.
 *
 * Scope mirrors the user decision: classes whose chain reaches `Node`, with
 * `is_instantiable == true` and `api_type != "editor"` (editor classes are not
 * in ClassDB during a normal headless run, so they can't be validated there).
 */
object HarnessClassGenerator {

  val prefix = "Harness"

  def run(jsonPath: String, harnessSrcDir: String, godotDir: String): Unit = {
    val src = Source.fromFile(new File(jsonPath))
    val json =
      try ujson.read(src.mkString)
      finally src.close()

    val byName =
      json("classes").arr.toVector.map(c => c("name").str -> c).toMap

    def reachesNode(name: String): Boolean = {
      var cur = Option(name)
      while (cur.nonEmpty) {
        val n = cur.get
        if (n == "Node") return true
        cur = byName.get(n).flatMap(_.obj.get("inherits").map(_.str))
      }
      false
    }

    val targets: Vector[String] =
      byName.toVector
        .collect {
          case (name, c)
              if c.obj.get("is_instantiable").exists(_.bool) &&
                c.obj.get("api_type").forall(_.str != "editor") &&
                reachesNode(name) =>
            name
        }
        .sorted

    writeHarnessClasses(targets, harnessSrcDir)
    writeManifest(targets, godotDir)
    writeScene(targets, godotDir)
    println(
      s"Generated ${targets.size} Harness node classes into $harnessSrcDir"
    )
  }

  private def writeHarnessClasses(targets: Vector[String], dir: String): Unit = {
    val out = new File(dir)
    // Clean stale generated files so removed classes don't linger.
    if (out.isDirectory)
      Option(out.listFiles).getOrElse(Array.empty[File]).foreach { f =>
        if (f.getName.startsWith(prefix) && f.getName.endsWith(".scala"))
          f.delete()
      }
    out.mkdirs()
    targets.foreach { base =>
      val name = prefix + base
      val content =
        s"""package game.harness
           |
           |// GENERATED — DO NOT EDIT (HarnessClassGenerator).
           |// Empty subclass of Godot's `$base`; proves the binding can subclass
           |// and register this base node type. Regenerate via `sbt igen/regenerate`.
           |final class $name
           |    extends io.github.optical002.godot.codegen.engine.$base
           |""".stripMargin
      val w = new FileWriter(new File(out, s"$name.scala"))
      try w.write(content)
      finally w.close()
    }
  }

  private def writeManifest(targets: Vector[String], godotDir: String): Unit = {
    val entries = targets.map { base =>
      ujson.Obj("name" -> (prefix + base), "base" -> base)
    }
    val w = new FileWriter(new File(godotDir, "harness_manifest.json"))
    try w.write(ujson.write(ujson.Arr(entries*), indent = 2))
    finally w.close()
  }

  private def writeScene(targets: Vector[String], godotDir: String): Unit = {
    val sb = new StringBuilder
    sb.append("[gd_scene format=3]\n\n")
    sb.append("[node name=\"HarnessRoot\" type=\"Node\"]\n")
    targets.foreach { base =>
      val name = prefix + base
      sb.append(s"""\n[node name="$name" type="$name" parent="."]\n""")
    }
    val w = new FileWriter(new File(godotDir, "node_harness.tscn"))
    try w.write(sb.toString)
    finally w.close()
  }
}
