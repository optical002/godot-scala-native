lazy val scalaVersionStr = "3.8.1"
lazy val regenerate =
  taskKey[Unit]("Regenerates the GDExtension bindings from the JSON API")

// Publishing metadata (Maven Central via the Sonatype Central Portal). The
// `version` is intentionally NOT set: sbt-dynver (bundled with sbt-ci-release)
// derives it from git tags (`vX.Y.Z`); untagged builds get a `-SNAPSHOT`.
inThisBuild(
  Seq(
    organization := "io.github.optical002",
    homepage := Some(url("https://github.com/optical002/godot-scala-native")),
    licenses := Seq(
      "MIT" -> url("https://opensource.org/licenses/MIT")
    ),
    developers := List(
      Developer(
        "optical002",
        "optical002",
        "pauliussuku@gmail.com",
        url("https://github.com/optical002")
      )
    ),
    scmInfo := Some(
      ScmInfo(
        url("https://github.com/optical002/godot-scala-native"),
        "scm:git:git@github.com:optical002/godot-scala-native.git"
      )
    ),
    versionScheme := Some("early-semver"),
    // Target the Sonatype Central Portal (central.sonatype.com), not the legacy
    // OSSRH host that sbt-ci-release defaults to. Required for namespaces
    // registered on the new portal.
    sonatypeCredentialHost := xerial.sbt.Sonatype.sonatypeCentralHost
  )
)

// NOTE: no `Global / onLoad` default-project override here. This build is loaded
// as a source dependency by ../harness-scala (via ProjectRef), and a global
// onLoad running `project gdext` would also fire in that aggregate build — where
// `gdext` is not a root-build project ID — and break loading. Use explicit
// `sbt gdext/<task>` / `sbt igen/<task>` instead.

// Aggregating root. It exists only to group the modules; it is never published
// (only `gdext` is). No `Global / onLoad` here — see the note below.
lazy val root = (project in file("."))
  .aggregate(igen, gdext)
  .settings(
    name := "godot-scala-native",
    publish / skip := true
  )

lazy val igen = (project in file("modules/interface-generator"))
  .enablePlugins(ScalaNativePlugin)
  .settings(
    name := "interface-generator",
    scalaVersion := scalaVersionStr,
    // Codegen-only tool; not a published artifact.
    publish / skip := true,
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
      description :=
        "Scala Native language binding for Godot (a GDExtension).",
      scalaVersion := scalaVersionStr,
      // Package the authoritative list of generated engine base-class names into
      // the jar as `gdext/engine-classes.txt`. Downstream projects' build-time
      // auto-registration (RegistrationScan) reads this off the classpath, so a
      // consumer needs only the published artifact — no access to these sources.
      Compile / resourceGenerators += Def.task {
        val engineDir =
          (Compile / scalaSource).value / "gdext" / "codegen" / "engine"
        val names =
          Option(engineDir.listFiles)
            .getOrElse(Array.empty[File])
            .iterator
            .filter(f => f.isFile && f.getName.endsWith(".scala"))
            .map(_.getName.stripSuffix(".scala"))
            .toVector
            .sorted
        val out =
          (Compile / resourceManaged).value / "gdext" / "engine-classes.txt"
        IO.write(out, names.mkString("\n"))
        Seq(out)
      }.taskValue
    )
