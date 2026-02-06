@main
def main(): Unit =
  InterfaceGenerator.run(
    jsonPath = "gdextension/gdextension_interface.json",
    codeGenPath =
      "modules/scala-native-gdextension/src/main/scala/godot/gdextensioninterface/codegen"
  )
