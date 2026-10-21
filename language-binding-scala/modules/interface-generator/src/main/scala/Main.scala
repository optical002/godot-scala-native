@main
def main(): Unit = {
  InterfaceGenerator.run(
    jsonPath = "gdextension/gdextension_interface.json",
    codeGenPath =
      "modules/scala-native-gdextension/src/main/scala/gdext/internal/ffi"
  )
  EngineClassGenerator.run(
    jsonPath = "gdextension/extension_api.json",
    codeGenPath =
      "modules/scala-native-gdextension/src/main/scala/gdext/classes"
  )

  // Builtin data (sizes, color names) and the math parity harness.
  BuiltinGenerator.run(
    jsonPath = "gdextension/extension_api.json",
    builtinDir = "modules/scala-native-gdextension/src/main/scala/gdext/builtin",
    harnessDir = "../harness-scala/src/main/scala/game/harness",
    godotDir = "../godot"
  )

  // Validation harness: one empty `Harness*` subclass per instantiable node
  // type (written into the sibling harness project), plus the scene + manifest
  // the Godot-side validator consumes. Paths are relative to this build root.
  HarnessClassGenerator.run(
    jsonPath = "gdextension/extension_api.json",
    harnessSrcDir = "../harness-scala/src/main/scala/game/harness",
    godotDir = "../godot"
  )
}
