package godotscala

import sbt._
import sbt.Keys._
import sbt.nio.Keys.watchTriggers
import sbt.nio.file.{**, Glob}
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
 *   resolvers += "jitpack" at "https://jitpack.io"
 *   addSbtPlugin("com.github.optical002.godot-scala-native" % "sbt-godot-scala-native" % "<version>")
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
    val godotNativeMode = settingKey[String](
      "Scala Native build mode: releaseFast (default), releaseFull (slowest link, fastest code) or debug (fastest link, no optimizer)"
    )
    val godotResRefs = settingKey[Boolean](
      "Generate the typed `game.Res` tree of res:// paths from the Godot project (default true)"
    )
    val godotResObject = settingKey[String](
      "Name of the generated res:// object in package `game` (default Res)"
    )
    val godotInputActions = settingKey[Boolean](
      "Generate the typed `game.Actions` enum from project.godot's Input Map (default true)"
    )
    val godotActionsObject = settingKey[String](
      "Name of the generated Input Map enum in package `game` (default Actions)"
    )
    val godotTrimEngineClasses = settingKey[Boolean](
      "Link only the engine classes the game can observe instead of all ~1000 (default true)"
    )
    val godotManifest = taskKey[File](
      "Generates the .gdextension manifest into the Godot project root"
    )
    val godotBuild = taskKey[Unit](
      "Builds the GDExtension library, swaps it into the Godot project, and writes the manifest"
    )
  }

  import autoImport._

  /** The Scala Native version `snpatch/Metadata.scala` was copied from. Must
    * equal the `sbt-scala-native` version in language-binding-scala/build.sbt. */
  private val PatchedScalaNativeVersion = "0.5.10"

  /** Read by snpatch/Metadata (`Metadata.LastPackagesProperty`). */
  private val SnPatchLastPackagesProperty = "godot.scalanative.lastPackages"

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
    godotNativeMode           := "releaseFast",
    godotResRefs              := true,
    godotTrimEngineClasses    := true,
    godotResObject            := "Res",
    godotInputActions         := true,
    godotActionsObject        := "Actions",

    // The binding artifact. `.cross(ScalaNativeCrossVersion.binary)` applies the
    // Scala Native platform suffix (e.g. `_native0.5_3`) — this is exactly what
    // `%%%` expands to, without needing sbt-platform-deps on the plugin's
    // classpath. The version is the plugin's own version, embedded at
    // plugin-build time (see GodotScalaNativeBuildInfo), so the plugin and the
    // binding it pulls in are always released together.
    // Released binding artifacts are served by JitPack; during local
    // co-development the version is instead found in the local ivy repo
    // (publishLocal), which is consulted first, so this resolver is inert then.
    resolvers += "jitpack" at "https://jitpack.io",
    libraryDependencies +=
      ("com.github.optical002.godot-scala-native" % "scala-native-gdextension" % GodotScalaNativeBuildInfo.version)
        .cross(ScalaNativeCrossVersion.binary),

    // A dynamic library (.so/.dylib/.dll) Godot can dlopen, built with the
    // Boehm GC in single-threaded mode:
    // - Multithreading is forced off. Scala Native turns it on whenever a
    //   program references `java.lang.Thread`; in MT mode Boehm crashes on
    //   Windows at extension load and IMMIX corrupts the heap under Godot's
    //   `_process`. Game code must therefore not rely on system threads.
    // - Boehm is the GC that runs stably here (verified on real gameplay). It
    //   must be installed on the build host (`-lgc`, found on the toolchain's
    //   standard search paths — no explicit `-I`/`-L`/`-rpath` on purpose, so
    //   no machine-specific prefix is hard-coded).
    // - `godotNativeMode` picks the optimizer level. releaseFast runs Scala
    //   Native's optimizer (inlining, devirtualization, box elimination),
    //   which the binding's allocation-free hot path relies on; debug skips it
    //   for the quickest link during hot-reload iteration.
    nativeConfig := {
      val c = nativeConfig.value
      val mode = godotNativeMode.value match {
        case "debug"       => Mode.debug
        case "releaseFast" => Mode.releaseFast
        case "releaseFull" => Mode.releaseFull
        case other =>
          sys.error(
            s"godotNativeMode must be debug, releaseFast or releaseFull (got '$other')"
          )
      }
      c.withMode(mode)
        .withBuildTarget(BuildTarget.libraryDynamic)
        .withGC(scala.scalanative.build.GC.boehm)
        .withMultithreading(false)
    },

    // Auto-registration: scan this project's sources every compile and generate
    // `game.GeneratedRegistrations` (one `Register.auto[T]()` per concrete game
    // class extending a Godot engine class) plus `game.GeneratedEntry` (the
    // `@exported(godotEntrySymbol)` GDExtension entry point that calls
    // `registerAll()` once). No entry code is hand-written. The output is a
    // managed source under target/ — never committed, never hand-edited.
    // Resolve `sources`-classified artifacts too, so godot-library dependencies'
    // published sources are available to the auto-registration scan below.
    transitiveClassifiers := Seq("sources"),

    Compile / sourceGenerators += Def.task {
      val log    = streams.value.log
      // The bundled Metadata patch (snpatch/Metadata.scala) is a copy of one
      // exact toolchain version; on any other version it may break nativeLink.
      if (scala.scalanative.nir.Versions.current != PatchedScalaNativeVersion)
        log.warn(
          s"[godot] Scala Native ${scala.scalanative.nir.Versions.current} on the build " +
            s"classpath, but the bundled toolchain patch targets $PatchedScalaNativeVersion. " +
            "Remove any sbt-scala-native override, or nativeLink may fail."
        )
      val srcDir = (Compile / scalaSource).value
      val cpFiles = (Compile / dependencyClasspath).value.files
      // Engine base-class names come from the binding's `engine-classes.txt`
      // resource on the classpath — no path into the binding's sources.
      var lapT = System.nanoTime()
      def lap(what: String): Unit = {
        val now = System.nanoTime()
        log.debug(s"[godot] generators $what: ${(now - lapT) / 1000000} ms")
        lapT = now
      }
      val engineNames = RegistrationScan.engineNamesFromClasspath(cpFiles)
      lap("engine names")

      // Godot-library auto-registration: a dependency that packages the marker
      // resource (RegistrationScan.GodotLibraryMarker) in its MAIN jar opts its
      // nodes into the scan. We detect those marker-carrying MAIN jars on the
      // dependency classpath, then pull the matching `-sources.jar` (resolved via
      // updateClassifiers' `sources` classifier; its module reports carry ONLY
      // the sources artifact, so we correlate by filename stem) and parse the
      // `.scala` inside. The binding jar carries no marker, so its engine classes
      // are never scanned. Consumers add only a normal `libraryDependencies` line.
      val libraryStems: Set[String] =
        cpFiles.iterator
          .filter(RegistrationScan.isGodotLibraryArtifact)
          .map(f => f.getName.stripSuffix(".jar"))
          .toSet
      val librarySources: Seq[(String, String)] =
        if (libraryStems.isEmpty) Seq.empty
        else
          updateClassifiers.value.configurations.iterator
            .flatMap(_.modules.iterator)
            .flatMap(_.artifacts.iterator.map(_._2))
            .filter { f =>
              val n = f.getName
              n.endsWith("-sources.jar") &&
              libraryStems.contains(n.stripSuffix("-sources.jar"))
            }
            .toVector
            .distinct
            .flatMap { srcJar =>
              log.info(s"[auto-register] godot-library sources: ${srcJar.getName}")
              RegistrationScan.scalaSourcesFromJar(srcJar)
            }

      val outFile =
        (Compile / sourceManaged).value / "game" / "GeneratedRegistrations.scala"
      // Settings read up front: sbt does not allow `.value` inside the
      // callback below.
      lap("library sources")
      val engineGraph =
        if (godotTrimEngineClasses.value) EngineClassScan.graphFromClasspath(cpFiles)
        else None
      lap("engine graph")
      val godotDirOpt = godotProjectDir.?.value
      val resEnabled  = godotResRefs.value
      val resObject   = godotResObject.value
      val resFile     = (Compile / sourceManaged).value / "game" / s"$resObject.scala"
      val stampFile   = streams.value.cacheDirectory / "res-scan.stamp"
      val excluded    = Seq(baseDirectory.value, target.value)

      // Typed res:// tree (ResScan). Skipped when disabled or when no Godot
      // project is configured, so a plain `compile` needs no godotProjectDir.
      // Runs inside the registration scan (it needs the scanned class map) and
      // returns its text, whose engine types the wrapper factory must cover.
      def writeRes(godotClasses: Map[String, String]): Seq[File] =
        godotDirOpt match {
          case Some(godotDir) if resEnabled && godotDir.isDirectory =>
            val files = ResScan.assetFiles(godotDir, excluded)
            val stamp = ResScan.fingerprint(godotDir, files, godotClasses, resObject)
            val fresh =
              resFile.exists && stampFile.exists && IO.read(stampFile) == stamp
            if (!fresh) {
              val result = ResScan.scan(godotDir, files, engineNames, godotClasses)
              result.warnings.foreach(w => log.warn(s"[res] $w"))
              val content = ResScan.render(result.entries, resObject)
              if (!resFile.exists || IO.read(resFile) != content) {
                IO.write(resFile, content)
                log.info(s"[res] generated $resFile (${result.entries.size} files)")
              }
              IO.write(stampFile, stamp)
            }
            Seq(resFile)
          case _ =>
            IO.delete(resFile)
            Seq.empty
        }
      var resOut: Seq[File] = Seq.empty

      val scan = RegistrationScan.generateWithClasses(
        srcDir,
        engineNames,
        godotEntrySelfTest.value,
        librarySources,
        engineGraph,
        godotClasses => {
          resOut = writeRes(godotClasses)
          resOut.map(IO.read(_))
        }
      )
      scan.engineClasses.foreach(cs =>
        log.debug(s"[auto-register] ${cs.size} engine classes linked: ${cs.mkString(" ")}")
      )
      lap("scan + res")
      IO.write(outFile, scan.source)
      // Tell the patched toolchain Metadata (snpatch) which classes are the
      // project's own, so it numbers them last: adding a class or lambda then
      // shifts only the project's ids, not the whole program's. The generated
      // sources live in `game`. Ordering only — never affects correctness.
      System.setProperty(
        SnPatchLastPackagesProperty,
        (scan.localPackages + "game").toSeq.sorted.mkString(",")
      )
      log.info(s"[auto-register] generated $outFile")
      outFile +: resOut
    }.taskValue,

    // Typed Input Map (ActionScan): `game.Actions` from project.godot's `[input]`
    // section plus the built-in ui_* actions. Skipped when disabled or when no
    // Godot project is configured. Written only when the text changes.
    Compile / sourceGenerators += Def.task {
      val log     = streams.value.log
      val name    = godotActionsObject.value
      val outFile = (Compile / sourceManaged).value / "game" / s"$name.scala"
      godotProjectDir.?.value match {
        case Some(godotDir) if godotInputActions.value && godotDir.isDirectory =>
          val actions  = ActionScan.actions(ActionScan.read(godotDir / "project.godot"))
          val rendered = ActionScan.render(actions, name)
          rendered.warnings.foreach(w => log.warn(s"[actions] $w"))
          if (!outFile.exists || IO.read(outFile) != rendered.source) {
            IO.write(outFile, rendered.source)
            log.info(s"[actions] generated $outFile (${actions.size} actions)")
          }
          Seq(outFile)
        case _ =>
          IO.delete(outFile)
          Seq.empty
      }
    }.taskValue,

    // `~godotBuild` (the editor addon's watch) also reruns when the asset set or
    // headers change, so `Res` follows the Godot project. Only files whose change
    // can alter `Res`; nothing godotBuild itself writes (`.scala/`, the manifest).
    godotBuild / watchTriggers ++= {
      godotProjectDir.?.value match {
        case Some(godotDir) if godotResRefs.value =>
          Seq(
            Glob(godotDir) / ** / "*.{import,tres,tscn,res,scn,json,txt,csv}"
          )
        case _ => Seq.empty
      }
    },
    godotBuild / watchTriggers ++= {
      godotProjectDir.?.value match {
        case Some(godotDir) if godotInputActions.value => Seq(Glob(godotDir / "project.godot"))
        case _                                         => Seq.empty
      }
    },

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
      val log     = streams.value.log
      val cache   = streams.value.cacheDirectory
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

      // nativeLink is cached (no relink when its inputs are unchanged), so a
      // trigger that changed no code (e.g. an asset save under `~godotBuild`)
      // yields the same file. Skip the swap then, or the editor hot-reloads for
      // nothing.
      val swapStamp = cache / "last-swap.stamp"
      val libStamp =
        s"${libFile.getCanonicalPath}|${libFile.length}|${libFile.lastModified}|$targetLib"
      val unchanged =
        targetLib.exists && swapStamp.exists && IO.read(swapStamp) == libStamp

      if (unchanged)
        log.info(s"[godot] $targetName unchanged, not swapped")
      else {
        IO.copyFile(libFile, tmpLib)
        java.nio.file.Files.move(
          tmpLib.toPath,
          targetLib.toPath,
          java.nio.file.StandardCopyOption.REPLACE_EXISTING,
          java.nio.file.StandardCopyOption.ATOMIC_MOVE
        )

        // Stamp the swap time (epoch millis) for the running editor to read on
        // its next hot-reload, so the binding can report the full swap→live
        // reload latency on the Godot Output panel. Written under `.scala/`,
        // matching where the binding reads it (relative to Godot's working dir).
        IO.write(godotLibDir / "reload.stamp", System.currentTimeMillis().toString)
        IO.write(swapStamp, libStamp)
        log.info(s"[godot] swapped $targetName, manifest $manifest")
      }

      // Install the editor addon, or update it when its plugin.cfg version
      // differs from the bundled one.
      AddonInstall.install(godotDir, baseDirectory.value, log)
    }
  )
}
