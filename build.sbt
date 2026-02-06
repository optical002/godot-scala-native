lazy val scalaVersionStr = "3.8.1"
lazy val build =
  taskKey[Unit]("Builds godot library and copies it to demo project")

Global / onLoad := {
  (Global / onLoad).value.andThen { state =>
    "project gdext" :: state
  }
}

lazy val igen = (project in file("modules/interface-generator"))
  .enablePlugins(ScalaNativePlugin)
  .settings(
    name := "interface-generator",
    scalaVersion := scalaVersionStr
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

        val demoDir = baseDirectory.value / "demo"
        val demoLibDir = demoDir / "lib"

        IO.createDirectory(demoLibDir)

        val targetLib = demoLibDir / libFile.getName
        IO.copyFile(libFile, targetLib)
      }
    )
