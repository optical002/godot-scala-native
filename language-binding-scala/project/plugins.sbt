addSbtPlugin("org.scala-native" % "sbt-scala-native" % "0.5.10")
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.5.6")
// Publishing to Maven Central (Sonatype Central Portal). Bundles sbt-sonatype,
// sbt-pgp, sbt-dynver and sbt-git: version is derived from git tags, artifacts
// are GPG-signed, and `sbt ci-release` uploads. See README for the release flow.
addSbtPlugin("com.github.sbt" % "sbt-ci-release" % "1.9.3")
