lazy val scalaVersionStr = "3.8.1"
lazy val regenerate =
  taskKey[Unit]("Regenerates the GDExtension bindings from the JSON API")

// NOTE: no `Global / onLoad` default-project override here. This build is loaded
// as a source dependency by ../harness-scala (via ProjectRef), and a global
// onLoad running `project gdext` would also fire in that aggregate build — where
// `gdext` is not a root-build project ID — and break loading. Use explicit
// `sbt gdext/<task>` / `sbt igen/<task>` instead.

lazy val igen = (project in file("modules/interface-generator"))
  .enablePlugins(ScalaNativePlugin)
  .settings(
    name := "interface-generator",
    scalaVersion := scalaVersionStr,
    libraryDependencies ++= Seq(
      "com.lihaoyi" %%% "upickle" % "4.4.2", // json
      "com.lihaoyi" %%% "pprint" % "0.9.6"
    ),
    // Runs the generator. Paths in Main.scala are relative to this build's root
    // (language-binding-scala/), which is sbt's working directory, so no extra
    // configuration is needed.
    regenerate := (Compile / run).toTask("").value
  )

// The binding library: the Scala Native bindings + registration framework.
// It is compiled as a Scala Native library and depended on by game projects
// (see ../harness-scala, which references this project via a source ProjectRef);
// it does NOT itself produce the GDExtension .so or export the entry symbol.
lazy val gdext =
  (project in file("modules/scala-native-gdextension"))
    .enablePlugins(ScalaNativePlugin)
    .settings(
      name := "scala-native-gdextension",
      scalaVersion := scalaVersionStr
    )
