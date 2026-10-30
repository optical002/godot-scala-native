package godotscala

class ActionScanSpec extends munit.FunSuite {

  private val project =
    """config_version=5
      |
      |[application]
      |
      |config/name="Game"
      |
      |[input]
      |
      |jump={
      |"deadzone": 0.2,
      |"events": [Object(InputEventKey,"resource_local_to_scene":false,"device":-1,"keycode":0,"physical_keycode":32,"key_label":0,"unicode":32,"echo":false,"script":null)
      |, Object(InputEventJoypadButton,"resource_local_to_scene":false,"device":-1,"button_index":0,"pressure":0.0,"pressed":true,"script":null)
      |]
      |}
      |move_left={
      |"deadzone": 0.2,
      |"events": [Object(InputEventJoypadMotion,"device":-1,"axis":0,"axis_value":-1.0,"script":null)
      |]
      |}
      |"2nd-fire"={
      |"deadzone": 0.5,
      |"events": [Object(InputEventMouseButton,"device":-1,"button_index":2,"pressed":true,"script":null)
      |]
      |}
      |ui_accept={
      |"deadzone": 0.5,
      |"events": [Object(InputEventKey,"device":-1,"keycode":4194309,"physical_keycode":0,"script":null)
      |]
      |}
      |ui_copy.macos={
      |"deadzone": 0.5,
      |"events": []
      |}
      |
      |[rendering]
      |
      |renderer/rendering_method="mobile"
      |""".stripMargin

  test("parses actions and their events from the [input] section") {
    val parsed = ActionScan.parse(project).map(a => a.name -> a.events).toMap
    assertEquals(parsed("jump"), Seq("physical key 32", "joypad button 0"))
    assertEquals(parsed("move_left"), Seq("joypad axis 0-"))
    assertEquals(parsed("2nd-fire"), Seq("mouse button 2"))
    assertEquals(parsed("ui_accept"), Seq("key 4194309"))
    assert(!parsed.contains("config/name"))
  }

  test("adds built-ins once and drops feature-tagged overrides") {
    val names = ActionScan.actions(project).map(_.name)
    assertEquals(names.count(_ == "ui_accept"), 1)
    assert(names.contains("ui_cancel"))
    assert(!names.exists(_.contains('.')))
  }

  test("renders an enum with project actions first") {
    val src = ActionScan.render(ActionScan.actions(project), "Actions").source
    assert(
      src.contains(
        "enum Actions(val name: String) extends gdext.api.InputAction {"
      )
    )
    assert(src.contains("case Jump extends Actions(\"jump\")"))
    assert(src.contains("case Action2ndFire extends Actions(\"2nd-fire\")"))
    assert(src.contains("/** `jump`: physical key 32, joypad button 0 */"))
    assert(src.indexOf("case UiAccept") < src.indexOf("case UiCancel"))
    assert(src.indexOf("case MoveLeft") < src.indexOf("case UiCancel"))
  }

  test("an empty or missing project yields only the built-ins") {
    assertEquals(ActionScan.actions("").map(_.name), ActionScan.Builtins)
  }

  test("clashing identifiers get a numeric suffix and a warning") {
    val r = ActionScan.render(
      Seq(ActionScan.Action("fire", Nil), ActionScan.Action("Fire", Nil)),
      "Actions"
    )
    assert(r.source.contains("case Fire2 extends"))
    assertEquals(r.warnings.size, 1)
  }
}
