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
}
