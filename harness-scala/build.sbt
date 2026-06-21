lazy val scalaVersionStr = "3.8.1"
lazy val build =
  taskKey[Unit]("Builds the godot library and copies it to the godot project")

// The GDExtension entry point is generated, not hand-written (see
// RegistrationScan / GeneratedEntry). These two keys are the only project-specific
// inputs. `entrySymbol` MUST equal `entry_symbol` in godot/godot_scala.gdextension.
lazy val entrySymbol = settingKey[String](
  "C symbol Godot loads as entry_symbol (must match godot/godot_scala.gdextension)"
)
lazy val entrySelfTest = settingKey[Boolean](
  "Run the binding's internal self-tests once at SCENE init"
)

// Source dependency on the language binding. This mimics a real downstream game
// project consuming the binding: here it references the sibling build directly
// (no publishing). To switch to a published artifact later, replace this with a
// `libraryDependencies` entry against `gdext`'s coordinates and drop the
// `.dependsOn(gdext)` below.
lazy val gdext = ProjectRef(file("../language-binding-scala"), "gdext")

// The game/harness project: where a user of the binding writes their Godot
// classes (base package `game`). This is the actual GDExtension dynamic library
// Godot loads; it owns the exported entry symbol.
lazy val harness =
  (project in file("."))
    .enablePlugins(ScalaNativePlugin)
    .dependsOn(gdext)
    .settings(
      name := "harness",
      scalaVersion := scalaVersionStr,
      entrySymbol := "godot_scala_init",
      entrySelfTest := true,
      nativeConfig ~= {
        _.withMode(scalanative.build.Mode.debug)
          .withBuildTarget(scalanative.build.BuildTarget.libraryDynamic)
      },
      // Auto-registration: scan this project's sources every compile and generate
      // `game.GeneratedRegistrations` (one `Register.auto[T]()` per concrete game
      // class extending a Godot engine class) plus `game.GeneratedEntry` (the
      // `@exported(entrySymbol)` GDExtension entry point that calls `registerAll()`
      // once). No entry code is hand-written. The output is a managed source under
      // target/ — never committed, never hand-edited.
      Compile / sourceGenerators += Def.task {
        val srcDir = baseDirectory.value / "src" / "main" / "scala"
        // Resolves into ../language-binding-scala/modules/scala-native-gdextension
        // via the source ProjectRef above.
        val engineDir =
          (gdext / baseDirectory).value / "src" / "main" / "scala" /
            "gdext" / "codegen" / "engine"
        val outFile =
          (Compile / sourceManaged).value / "game" / "GeneratedRegistrations.scala"
        IO.write(
          outFile,
          RegistrationScan.generate(
            srcDir,
            engineDir,
            entrySymbol.value,
            entrySelfTest.value
          )
        )
        streams.value.log.info(s"[auto-register] generated $outFile")
        Seq(outFile)
      }.taskValue,
      build := {
        val libFile = (Compile / nativeLink).value

        val godotDir = baseDirectory.value / ".." / "godot"
        val godotLibDir = godotDir / "lib"

        IO.createDirectory(godotLibDir)

        // The Godot manifest expects `libscala-native-gdextension.so`; Scala
        // Native names the output after this module (`libharness.so`), so copy
        // under the manifest's expected name.
        val targetName = "libscala-native-gdextension.so"

        // Atomic swap: copy to a temp file in the same directory, then rename
        // over the target. The editor may have the old .so mmap'd; overwriting
        // it in place corrupts the running editor (freeze). A rename gives the
        // editor a fresh inode to hot-reload while the old one stays valid until
        // released. Combined with `reloadable = true` in the .gdextension
        // manifest, this lets the editor pick up the new build without a
        // restart.
        val targetLib = godotLibDir / targetName
        val tmpLib = godotLibDir / (targetName + ".new")
        IO.copyFile(libFile, tmpLib)
        java.nio.file.Files.move(
          tmpLib.toPath,
          targetLib.toPath,
          java.nio.file.StandardCopyOption.REPLACE_EXISTING,
          java.nio.file.StandardCopyOption.ATOMIC_MOVE
        )

        // Stamp the swap time (epoch millis) for the running editor to read on
        // its next hot-reload, so the binding can report the full swap→live
        // reload latency on the Godot Output panel. Written at the project root
        // (Godot's working dir), matching where the binding reads it.
        IO.write(godotDir / "reload.stamp", System.currentTimeMillis().toString)
      }
    )
