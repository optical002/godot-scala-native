lazy val scalaVersionStr = "3.8.1"
lazy val build =
  taskKey[Unit]("Builds godot library and copies it to demo project")
lazy val regenerate =
  taskKey[Unit]("Regenerates the GDExtension bindings from the JSON API")

Global / onLoad := {
  (Global / onLoad).value.andThen { state =>
    "project gdext" :: state
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

lazy val gdext =
  (project in file("modules/scala-native-gdextension"))
    .enablePlugins(ScalaNativePlugin)
    .settings(
      name := "scala-native-gdextension",
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

        val targetLib = demoLibDir / libFile.getName
        IO.copyFile(libFile, targetLib)
      }
    )
