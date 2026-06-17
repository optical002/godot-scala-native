@main
def main(): Unit = {
  // Layer 1: raw GDExtension interface FFI.
  InterfaceGenerator.run(
    jsonPath = "gdextension/gdextension_interface.json",
    codeGenPath =
      "modules/scala-native-gdextension/src/main/scala/io/github/optical002/godot/codegen/gdextensioninterface"
  )

  // Layer 3: typed engine-class wrappers.
  EngineClassGenerator.run(
    jsonPath = "gdextension/extension_api.json",
    codeGenPath =
      "modules/scala-native-gdextension/src/main/scala/io/github/optical002/godot/codegen/engine"
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
