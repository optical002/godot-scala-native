lazy val scalaVersionStr = "3.8.1"
lazy val build =
  taskKey[Unit]("Builds godot library and copies it to demo project")
lazy val regenerate =
  taskKey[Unit]("Regenerates the GDExtension bindings from the JSON API")

Global / onLoad := {
  (Global / onLoad).value.andThen { state =>
    "project harness" :: state
  }
}

lazy val igen = (project in file("modules/interface-generator"))
  .enablePlugins(ScalaNativePlugin)
  .settings(
    name := "interface-generator",
    scalaVersion := scalaVersionStr,
    libraryDependencies ++= Seq(
      "com.lihaoyi" %%% "upickle" % "4.4.2", // json
      "com.lihaoyi" %%% "pprint" % "0.9.6"
    ),
    // Runs the generator. Paths in Main.scala are relative to the repo root,
    // which is sbt's working directory, so no extra configuration is needed.
    regenerate := (Compile / run).toTask("").value
  )

// The binding library: the Scala Native bindings + registration framework.
// It is compiled as a Scala Native library and depended on by game projects;
// it does NOT itself produce the GDExtension .so or export the entry symbol.
lazy val gdext =
  (project in file("modules/scala-native-gdextension"))
    .enablePlugins(ScalaNativePlugin)
    .settings(
      name := "scala-native-gdextension",
      scalaVersion := scalaVersionStr
    )

// The game/harness project: where a user of the binding writes their Godot
// classes (base package `game`). This module owns the exported entry symbol and
// is the actual GDExtension dynamic library Godot loads.
lazy val harness =
  (project in file("modules/harness"))
    .enablePlugins(ScalaNativePlugin)
    .dependsOn(gdext)
    .settings(
      name := "harness",
      scalaVersion := scalaVersionStr,
      nativeConfig ~= {
        _.withMode(scalanative.build.Mode.debug)
          .withBuildTarget(scalanative.build.BuildTarget.libraryDynamic)
      },
      build := {
        val libFile = (Compile / nativeLink).value

        val demoDir = baseDirectory.value / ".." / ".." / "demo"
        val demoLibDir = demoDir / "lib"

        IO.createDirectory(demoLibDir)

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
        val targetLib = demoLibDir / targetName
        val tmpLib = demoLibDir / (targetName + ".new")
        IO.copyFile(libFile, tmpLib)
        java.nio.file.Files.move(
          tmpLib.toPath,
          targetLib.toPath,
          java.nio.file.StandardCopyOption.REPLACE_EXISTING,
          java.nio.file.StandardCopyOption.ATOMIC_MOVE
        )
      }
    )
