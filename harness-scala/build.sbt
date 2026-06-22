// A downstream game project consuming the binding. It carries no build
// machinery: the `sbt-godot-scala-native` plugin (applied below, resolved from
// project/plugins.sbt) supplies the binding dependency, the Scala Native
// dynamic-library config, the auto-registration source generator, and the
// `godotBuild` task. This project holds only its game classes (package `game`)
// plus the settings below.
//
// Local co-development loop (the binding is consumed as a published artifact,
// not a source ProjectRef): in ../language-binding-scala run `sbt publishLocal`
// after any binding/plugin change, then here run `sbt godotBuild`.
lazy val harness =
  (project in file("."))
    .enablePlugins(GodotScalaNativePlugin)
    .settings(
      name := "harness",
      scalaVersion := "3.8.1",
      // Mandatory: where the built .so + generated .gdextension manifest go.
      godotProjectDir := baseDirectory.value / ".." / "godot",
      // Optional (defaults to false): run the binding's self-tests at scene init.
      godotEntrySelfTest := true
    )
