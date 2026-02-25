@main
def main(): Unit =
  InterfaceGenerator.run(
    jsonPath = "gdextension/gdextension_interface.json",
    codeGenPath =
      "modules/scala-native-gdextension/src/main/scala/io/github/optical002/godot/codegen/gdextensioninterface"
  )
