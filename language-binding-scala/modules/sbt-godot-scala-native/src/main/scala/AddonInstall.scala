package godotscala

import java.io.File
import sbt.io.IO

/**
 * Installs and updates the bundled GDScript editor addon in
 * `<godotDir>/addons/godot_scala`.
 *
 *  - No addon folder      -> install it and enable it in `project.godot` (only
 *                            when that file has no `[editor_plugins]` section).
 *  - Same `version=`      -> leave it alone.
 *  - Different `version=` -> overwrite the addon files; other files in the
 *                            folder (`.uid`, `.import`, ...) and `project.godot`
 *                            are untouched. Local edits are lost on a version change.
 *
 * The version is the `version="..."` line of `plugin.cfg`; any change under
 * `resources/godot-addon/` must bump it, or existing projects never see it.
 * `SBT_PROJECT_DIR` in `scala_build.gd` is templated to the path from the Godot
 * project to the sbt project.
 */
object AddonInstall {

  val AddonFiles: Seq[String] = Seq("plugin.cfg", "icon.svg", "godot.svg", "scala_build.gd")

  private val VersionLine = """(?m)^\s*version\s*=\s*"([^"]*)"""".r

  def versionOf(cfg: String): Option[String] =
    VersionLine.findFirstMatchIn(cfg).map(_.group(1))

  def resource(name: String): String = {
    val is = getClass.getResourceAsStream("/godot-addon/" + name)
    if (is == null) sys.error(s"plugin resource /godot-addon/$name not found")
    try scala.io.Source.fromInputStream(is, "UTF-8").mkString
    finally is.close()
  }

  def install(godotDir: File, sbtProjectDir: File, log: sbt.util.Logger): Unit = {
    val addonDir     = new File(godotDir, "addons/godot_scala")
    val installedCfg = new File(addonDir, "plugin.cfg")
    val bundled      = versionOf(resource("plugin.cfg"))
    val installed    = if (installedCfg.exists) versionOf(IO.read(installedCfg)) else None
    val isUpdate     = addonDir.exists
    if (isUpdate && installed == bundled) return

    // Path from the Godot project to the sbt project (forward slashes for Godot).
    val rel = godotDir.getCanonicalFile.toPath
      .relativize(sbtProjectDir.getCanonicalFile.toPath)
      .toString
      .replace('\\', '/')

    IO.createDirectory(addonDir)
    AddonFiles.foreach { name =>
      val content = resource(name)
      IO.write(
        new File(addonDir, name),
        if (name == "scala_build.gd") content.replace("@SBT_PROJECT_DIR@", rel) else content
      )
    }

    if (isUpdate) {
      log.info(
        s"[godot] updated editor addon ${installed.getOrElse("?")} -> " +
          s"${bundled.getOrElse("?")} in $addonDir"
      )
      return
    }
    log.info(s"[godot] installed editor addon -> $addonDir (sbt project: $rel)")

    // Best-effort enable in project.godot (only when there's no editor_plugins
    // section yet — avoids risky merges into an existing PackedStringArray).
    val proj  = new File(godotDir, "project.godot")
    val entry = "res://addons/godot_scala/plugin.cfg"
    if (proj.exists) {
      val content = IO.read(proj)
      if (!content.contains(entry)) {
        if (!content.contains("[editor_plugins]")) {
          IO.write(
            proj,
            content.stripLineEnd +
              s"""
                 |
                 |[editor_plugins]
                 |
                 |enabled=PackedStringArray("$entry")
                 |""".stripMargin
          )
          log.info("[godot] enabled the addon in project.godot")
        } else
          log.warn(
            "[godot] addon installed but not auto-enabled (existing " +
              "[editor_plugins] section) — enable it in Project Settings > Plugins"
          )
      }
    }
  }
}
