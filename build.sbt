import scala.sys.process._

name := "godot-scala-native"
scalaVersion := "3.3.1"

enablePlugins(ScalaNativePlugin)

nativeConfig ~= {
  _.withMode(scalanative.build.Mode.debug)
   .withBuildTarget(scalanative.build.BuildTarget.libraryDynamic)
}

lazy val build = taskKey[Unit]("")

build := {
  val libFile = (Compile / nativeLink).value

  val demoDir = baseDirectory.value / "demo"
  val demoLibDir = demoDir / "lib"

  IO.createDirectory(demoLibDir)

  val targetLib = demoLibDir / libFile.getName
  IO.copyFile(libFile, targetLib)
}
