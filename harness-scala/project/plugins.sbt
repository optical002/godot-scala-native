// The only plugin a consumer needs: it brings sbt-scala-native transitively and
// supplies all GDExtension build machinery via GodotScalaNativePlugin. Pinned to
// the binding's local `publishLocal` version (see ../language-binding-scala).
// Released consumers resolve the same coordinates from JitPack instead
// (resolvers += "jitpack" at "https://jitpack.io").
addSbtPlugin("com.github.optical002.godot-scala-native" % "sbt-godot-scala-native" % "0.1.2")
