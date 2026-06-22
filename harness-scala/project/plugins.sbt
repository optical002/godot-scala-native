// The only plugin a consumer needs: it brings sbt-scala-native transitively and
// supplies all GDExtension build machinery via GodotScalaNativePlugin. Pinned to
// the binding's local `publishLocal` version (see ../language-binding-scala).
addSbtPlugin("io.github.optical002" % "sbt-godot-scala-native" % "0.1.0-SNAPSHOT")

