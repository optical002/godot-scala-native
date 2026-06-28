// Minimal repro project for the Resource Dict-export bug. Consumes the binding
// + plugin as published artifacts (run `sbt gdext/publishLocal` in
// ../../language-binding-scala first), then `sbt godotBuild` here.
lazy val repro = (project in file("."))
  .enablePlugins(GodotScalaNativePlugin)
  .settings(
    name := "repro",
    scalaVersion := "3.8.1",
    godotProjectDir := baseDirectory.value / ".." / "godot"
  )
