lazy val scalaVersionStr = "3.8.1"
lazy val regenerate =
  taskKey[Unit]("Regenerates the GDExtension bindings from the JSON API")

// Publishing (JitPack). Releases are cut by pushing a plain semver git tag
// (e.g. `0.1.1`); JitPack then builds on demand via the repo-root `jitpack.yml`
// (which runs `sbt publishM2`) and serves the artifacts from
// https://jitpack.io under the group `com.github.optical002.godot-scala-native`.
// The `organization` is set to exactly that JitPack group so `publishLocal`
// (local co-development, ../harness-scala) yields the SAME coordinates as the
// released artifacts.
inThisBuild(
  Seq(
    organization := "com.github.optical002.godot-scala-native",
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
    versionScheme := Some("early-semver")
  )
)

// JitPack exports the requested tag as the VERSION env var (tags are plain
// semver, e.g. `0.1.1`). Local builds (`sbt publishLocal`) have no VERSION and
// use the pinned NEXT release version, which harness-scala /
// godot-scala-native-utilities reference for the co-development loop; it does
// not exist on JitPack until the matching tag is pushed, and locally-published
// artifacts win over JitPack (the local ivy repo is consulted first).
ThisBuild / version := sys.env.getOrElse("VERSION", "0.1.2")

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
      // JitPack release builds (VERSION set) skip scaladoc: it needs a ~6 GB
      // heap over the large codegen/ sources (see .sbtopts) and JitPack serves
      // no docs. Local publishing is unaffected.
      Compile / doc / sources := {
        val s = (Compile / doc / sources).value
        if (sys.env.contains("VERSION")) Nil else s
      },
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
      // Publish with the fully cross-versioned artifact filename
      // (`sbt-godot-scala-native_2.12_1.0-<ver>.jar`) so it matches the Maven
      // coordinate path. The legacy (default) style names the file with the bare
      // module name while the path carries the `_2.12_1.0` suffix; JitPack
      // serves files verbatim from the `publishM2` output, so the layout must be
      // proper Maven style for sbt (>= 1.4, which tries the Maven-style plugin
      // pattern) to resolve the plugin from https://jitpack.io.
      sbtPluginPublishLegacyMavenStyle := false,
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
          s"""package godotscala
             |
             |/** Generated: this plugin's published version, used to pull the
             |  * matching `scala-native-gdextension` binding into consumers. */
             |private[godotscala] object GodotScalaNativeBuildInfo {
             |  final val version: String = "${version.value}"
             |}
             |""".stripMargin
        )
        Seq(out)
      }.taskValue
    )
