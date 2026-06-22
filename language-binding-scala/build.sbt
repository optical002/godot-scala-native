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

// Stable, pinnable version for local `publishLocal`. Untagged dynver builds
// otherwise embed a dirty-tree timestamp (e.g. `0.0.0+38-<sha>+<date>-SNAPSHOT`)
// that changes constantly, which the sibling `harness-scala` — now a published-
// artifact consumer (it applies `sbt-godot-scala-native` and depends on the
// published `gdext`, no source ProjectRef) — cannot pin. Both `gdext` and the
// sbt plugin publish under this version, and harness pins it in its plugins.sbt.
//
// NOTE: this overrides sbt-dynver. The repo is currently untagged (no releases),
// so dynver only ever produced snapshots anyway. When cutting a real release,
// guard this on CI/tag presence so sbt-ci-release derives the version from the
// git tag instead.
ThisBuild / version := "0.1.0-SNAPSHOT"

// Aggregating root. It exists only to group the modules; it is never published
// (only `gdext` and the sbt plugin are).
lazy val root = (project in file("."))
  .aggregate(igen, gdext, sbtGodotPlugin)
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
          (Compile / scalaSource).value / "gdext" / "classes"
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

// The sbt plugin that downstream game projects apply (see ../harness-scala).
// Pure JVM (Scala 2.12, sbt 1.x) — it must NOT depend on `gdext` (Scala 3.8 /
// Scala Native). It ships RegistrationScan + the GodotScalaNativePlugin
// AutoPlugin (the build machinery formerly hand-carried by each consumer) and
// brings sbt-scala-native transitively, so a consumer adds a single
// `addSbtPlugin` line. Published alongside `gdext` under the same version.
lazy val sbtGodotPlugin =
  (project in file("modules/sbt-godot-scala-native"))
    .enablePlugins(SbtPlugin)
    .settings(
      name := "sbt-godot-scala-native",
      // sbt 1.9.x runs on Scala 2.12.
      scalaVersion := "2.12.20",
      // Depend on sbt-scala-native so `ScalaNativePlugin` / `nativeConfig` /
      // `%%%` are available to compile this plugin and, transitively, to the
      // consuming build (no extra addSbtPlugin line downstream).
      addSbtPlugin("org.scala-native" % "sbt-scala-native" % "0.5.10"),
      // scalameta parses game sources in RegistrationScan.
      libraryDependencies += "org.scalameta" %% "scalameta" % "4.9.9",
      // Embed this build's version so the plugin pulls the matching `gdext`.
      Compile / sourceGenerators += Def.task {
        val out =
          (Compile / sourceManaged).value / "GodotScalaNativeBuildInfo.scala"
        IO.write(
          out,
          s"""package gdext.sbtplugin
             |
             |/** Generated: this plugin's published version, used to pull the
             |  * matching `scala-native-gdextension` binding into consumers. */
             |private[sbtplugin] object GodotScalaNativeBuildInfo {
             |  final val version: String = "${version.value}"
             |}
             |""".stripMargin
        )
        Seq(out)
      }.taskValue
    )
