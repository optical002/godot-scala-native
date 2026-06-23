package godotscala

import sbt._
import sbt.Keys._
import scala.scalanative.sbtplugin.{ScalaNativeCrossVersion, ScalaNativePlugin}
import scala.scalanative.sbtplugin.ScalaNativePlugin.autoImport._
import scala.scalanative.build.{BuildTarget, Mode}

/**
 * sbt AutoPlugin that turns a plain Scala Native project into a Godot
 * GDExtension consumer of the `scala-native-gdextension` binding.
 *
 * A downstream game project applies this plugin and writes only its game
 * classes:
 *
 * {{{
 *   // project/plugins.sbt
 *   addSbtPlugin("io.github.optical002" % "sbt-godot-scala-native" % "<version>")
 *
 *   // build.sbt
 *   enablePlugins(GodotScalaNativePlugin)
 *   scalaVersion := "3.8.1"
 * }}}
 *
 * The GDExtension entry symbol is fixed (`RegistrationScan.EntrySymbol`) and is
 * not a build setting; it must match `entry_symbol` in the .gdextension manifest.
 *
 * The plugin supplies everything the project used to carry by hand: the binding
 * dependency, the Scala Native dynamic-library `nativeConfig`, the build-time
 * auto-registration source generator (see [[RegistrationScan]]), and the
 * [[autoImport.godotBuild]] task that atomically swaps the built `.so` into the
 * Godot project.
 *
 * Requires (and therefore enables) `ScalaNativePlugin`; declared `noTrigger`,
 * so a project opts in explicitly with `enablePlugins(GodotScalaNativePlugin)`.
 */
object GodotScalaNativePlugin extends AutoPlugin {

  override def requires = ScalaNativePlugin
  override def trigger  = noTrigger

  object autoImport {
    val godotEntrySelfTest = settingKey[Boolean](
      "Run the binding's internal self-tests once at SCENE init"
    )
    val godotProjectDir = settingKey[File](
      "Godot project root the built .so + manifest are written into (MANDATORY — no default)"
    )
    val godotLibName = settingKey[String](
      "Library base name, no `lib` prefix or platform extension (e.g. scala-native-gdextension)"
    )
    val godotManifestName = settingKey[String](
      "Filename of the generated .gdextension manifest in the Godot project root"
    )
    val godotCompatibilityMinimum = settingKey[String](
      "Godot `compatibility_minimum` written into the generated manifest"
    )
    val godotManifest = taskKey[File](
      "Generates the .gdextension manifest into the Godot project root"
    )
    val godotBuild = taskKey[Unit](
      "Builds the GDExtension library, swaps it into the Godot project, and writes the manifest"
    )
  }

  import autoImport._

  /** Resolves the mandatory [[autoImport.godotProjectDir]], failing the task
    * (not project load) with an actionable message when it is unset. */
  private def requireGodotDir(opt: Option[File]): File =
    opt.getOrElse(
      sys.error(
        "godotProjectDir is not set. Point it at your Godot project root, e.g.\n" +
          "  godotProjectDir := baseDirectory.value / \"..\" / \"godot\""
      )
    )

  override lazy val projectSettings: Seq[Setting[_]] = Seq(
    // Project-specific inputs, with sensible defaults a consumer can override.
    // (The GDExtension entry symbol is NOT a setting — it is fixed in
    // RegistrationScan.EntrySymbol and must match the .gdextension manifest.)
    // `godotEntrySelfTest` is optional (defaults to false). `godotProjectDir` is
    // intentionally NOT given a default — a consumer must point it at their Godot
    // project root; the tasks fail with a clear message if it is unset.
    godotEntrySelfTest        := false,
    godotLibName              := "scala-native-gdextension",
    godotManifestName         := "scala.gdextension",
    godotCompatibilityMinimum := "4.2",

    // The binding artifact. `.cross(ScalaNativeCrossVersion.binary)` applies the
    // Scala Native platform suffix (e.g. `_native0.5_3`) — this is exactly what
    // `%%%` expands to, without needing sbt-platform-deps on the plugin's
    // classpath. The version is the plugin's own version, embedded at
    // plugin-build time (see GodotScalaNativeBuildInfo), so the plugin and the
    // binding it pulls in are always released together.
    libraryDependencies +=
      ("io.github.optical002" % "scala-native-gdextension" % GodotScalaNativeBuildInfo.version)
        .cross(ScalaNativeCrossVersion.binary),

    // Produce a dynamic library (.so/.dylib/.dll) Godot can dlopen.
    nativeConfig ~= {
      _.withMode(Mode.debug)
        .withBuildTarget(BuildTarget.libraryDynamic)
    },

    // Auto-registration: scan this project's sources every compile and generate
    // `game.GeneratedRegistrations` (one `Register.auto[T]()` per concrete game
    // class extending a Godot engine class) plus `game.GeneratedEntry` (the
    // `@exported(godotEntrySymbol)` GDExtension entry point that calls
    // `registerAll()` once). No entry code is hand-written. The output is a
    // managed source under target/ — never committed, never hand-edited.
    Compile / sourceGenerators += Def.task {
      val srcDir = (Compile / scalaSource).value
      // Engine base-class names come from the binding's `engine-classes.txt`
      // resource on the classpath — no path into the binding's sources.
      val engineNames =
        RegistrationScan.engineNamesFromClasspath(
          (Compile / dependencyClasspath).value.files
        )
      val outFile =
        (Compile / sourceManaged).value / "game" / "GeneratedRegistrations.scala"
      IO.write(
        outFile,
        RegistrationScan.generate(
          srcDir,
          engineNames,
          godotEntrySelfTest.value
        )
      )
      streams.value.log.info(s"[auto-register] generated $outFile")
      Seq(outFile)
    }.taskValue,

    // Generates the `.gdextension` manifest into the Godot project root. The
    // entry symbol is always RegistrationScan.EntrySymbol (it must match the
    // generated entry point); library names derive from `godotLibName`, so the
    // manifest and the file `godotBuild` drops into `lib/` never drift. Written
    // only when the content changes, to avoid spurious editor file-watch churn.
    godotManifest := {
      val log = streams.value.log
      val out = requireGodotDir(godotProjectDir.?.value) / godotManifestName.value
      val content = GodotManifest.render(
        RegistrationScan.EntrySymbol,
        godotCompatibilityMinimum.value,
        godotLibName.value
      )
      val current = if (out.exists) IO.read(out) else ""
      if (current != content) {
        IO.write(out, content)
        log.info(s"[godot] wrote manifest $out")
      }
      out
    },

    godotBuild := {
      val libFile = (Compile / nativeLink).value
      // Refresh the manifest alongside the library so the two always agree.
      val manifest = godotManifest.value

      val godotDir    = requireGodotDir(godotProjectDir.?.value)
      // Everything the build drops into the Godot project lives under the hidden
      // `.scala/` dir (only the .gdextension manifest sits at the project root).
      val godotLibDir = godotDir / ".scala"

      IO.createDirectory(godotLibDir)

      // Scala Native names the output after this module (e.g. `libgame.so`), so
      // copy under the platform-specific name the manifest expects.
      val targetName = GodotManifest.currentOsLibFileName(godotLibName.value)

      // Atomic swap: copy to a temp file in the same directory, then rename
      // over the target. The editor may have the old .so mmap'd; overwriting
      // it in place corrupts the running editor (freeze). A rename gives the
      // editor a fresh inode to hot-reload while the old one stays valid until
      // released. Combined with `reloadable = true` in the .gdextension
      // manifest, this lets the editor pick up the new build without a restart.
      val targetLib = godotLibDir / targetName
      val tmpLib    = godotLibDir / (targetName + ".new")
      IO.copyFile(libFile, tmpLib)
      java.nio.file.Files.move(
        tmpLib.toPath,
        targetLib.toPath,
        java.nio.file.StandardCopyOption.REPLACE_EXISTING,
        java.nio.file.StandardCopyOption.ATOMIC_MOVE
      )

      // Stamp the swap time (epoch millis) for the running editor to read on its
      // next hot-reload, so the binding can report the full swap→live reload
      // latency on the Godot Output panel. Written under `.scala/`, matching
      // where the binding reads it (relative to Godot's working dir).
      IO.write(godotLibDir / "reload.stamp", System.currentTimeMillis().toString)

      // First-run convenience: drop the editor addon into the Godot project (only
      // if it isn't already there, so user edits are never clobbered).
      installAddon(godotDir, baseDirectory.value, streams.value.log)

      streams.value.log.info(s"[godot] swapped $targetName, manifest $manifest")
    }
  )

  /**
   * Install the bundled GDScript editor addon into `<godotDir>/addons/godot_scala`
   * if it is not already present. The addon's `SBT_PROJECT_DIR` is templated to
   * the path from the Godot project to the sbt project, and the addon is enabled
   * in `project.godot` when that project has no `[editor_plugins]` section yet.
   */
  private def installAddon(
    godotDir: File,
    sbtProjectDir: File,
    log: sbt.util.Logger
  ): Unit = {
    val addonDir = godotDir / "addons" / "godot_scala"
    if (addonDir.exists) return // already installed / customized — leave it

    def resource(name: String): String = {
      val is = getClass.getResourceAsStream("/godot-addon/" + name)
      if (is == null) sys.error(s"plugin resource /godot-addon/$name not found")
      try scala.io.Source.fromInputStream(is, "UTF-8").mkString
      finally is.close()
    }

    // Path from the Godot project to the sbt project (forward slashes for Godot).
    val rel = godotDir.getCanonicalFile.toPath
      .relativize(sbtProjectDir.getCanonicalFile.toPath)
      .toString
      .replace('\\', '/')

    IO.createDirectory(addonDir)
    IO.write(addonDir / "plugin.cfg", resource("plugin.cfg"))
    IO.write(addonDir / "icon.svg", resource("icon.svg"))
    IO.write(
      addonDir / "scala_build.gd",
      resource("scala_build.gd").replace("@SBT_PROJECT_DIR@", rel)
    )
    log.info(s"[godot] installed editor addon -> $addonDir (sbt project: $rel)")

    // Best-effort enable in project.godot (only when there's no editor_plugins
    // section yet — avoids risky merges into an existing PackedStringArray).
    val proj  = godotDir / "project.godot"
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
