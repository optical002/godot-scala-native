// scalameta is used by RegistrationScan.scala (the harness auto-registration
// source generator) to parse game sources at build time and discover which
// classes extend a Godot engine class. Lives in the meta-build so it is on the
// classpath when compiling build.sbt / project/*.scala.
libraryDependencies += "org.scalameta" %% "scalameta" % "4.9.9"
