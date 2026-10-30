package godotscala

import java.io.File
import java.nio.charset.StandardCharsets
import java.nio.file.Files

/** Build-time generator for the typed Input Map (`game.Actions`).
  *
  * Reads the `[input]` section of `project.godot` and emits one enum case per
  * action, plus Godot's built-in `ui_*` actions (the engine registers those
  * itself; `project.godot` lists one only when it was edited). A renamed or
  * deleted action then breaks compilation of code that uses it.
  *
  * Feature-tagged overrides (`ui_copy.macos`) are the same action and are
  * skipped. Output is sorted and has no timestamps.
  */
object ActionScan {

  /** One action: its Godot name and a short description of its bound events. */
  final case class Action(name: String, events: Seq[String])

  /** Godot 4.6's built-in actions (`InputMap::get_builtins`), feature tags
    * dropped.
    */
  val Builtins: Seq[String] = Seq(
    "ui_accept",
    "ui_accessibility_drag_and_drop",
    "ui_cancel",
    "ui_close_dialog",
    "ui_colorpicker_delete_preset",
    "ui_copy",
    "ui_cut",
    "ui_down",
    "ui_end",
    "ui_filedialog_delete",
    "ui_filedialog_find",
    "ui_filedialog_focus_path",
    "ui_filedialog_refresh",
    "ui_filedialog_show_hidden",
    "ui_filedialog_up_one_level",
    "ui_focus_mode",
    "ui_focus_next",
    "ui_focus_prev",
    "ui_graph_delete",
    "ui_graph_duplicate",
    "ui_graph_follow_left",
    "ui_graph_follow_right",
    "ui_home",
    "ui_left",
    "ui_menu",
    "ui_page_down",
    "ui_page_up",
    "ui_paste",
    "ui_redo",
    "ui_right",
    "ui_select",
    "ui_swap_input_direction",
    "ui_text_add_selection_for_next_occurrence",
    "ui_text_backspace",
    "ui_text_backspace_all_to_left",
    "ui_text_backspace_word",
    "ui_text_caret_add_above",
    "ui_text_caret_add_below",
    "ui_text_caret_document_end",
    "ui_text_caret_document_start",
    "ui_text_caret_down",
    "ui_text_caret_left",
    "ui_text_caret_line_end",
    "ui_text_caret_line_start",
    "ui_text_caret_page_down",
    "ui_text_caret_page_up",
    "ui_text_caret_right",
    "ui_text_caret_up",
    "ui_text_caret_word_left",
    "ui_text_caret_word_right",
    "ui_text_clear_carets_and_selection",
    "ui_text_completion_accept",
    "ui_text_completion_query",
    "ui_text_completion_replace",
    "ui_text_dedent",
    "ui_text_delete",
    "ui_text_delete_all_to_right",
    "ui_text_delete_word",
    "ui_text_indent",
    "ui_text_newline",
    "ui_text_newline_above",
    "ui_text_newline_blank",
    "ui_text_scroll_down",
    "ui_text_scroll_up",
    "ui_text_select_all",
    "ui_text_select_word_under_caret",
    "ui_text_skip_selection_for_next_occurrence",
    "ui_text_submit",
    "ui_text_toggle_insert_mode",
    "ui_undo",
    "ui_unicode_start",
    "ui_up"
  )

  private val Section = """^\[([^\]]+)\]\s*$""".r
  private val Entry = """^("?)([^"=]+)\1\s*=(.*)$""".r
  private val EventObj = """Object\((\w+),([^)]*)\)""".r
  private def field(body: String, name: String): Option[Long] =
    ("\"" + name + "\":(-?\\d+)").r
      .findFirstMatchIn(body)
      .map(_.group(1).toLong)

  /** The actions `project.godot` declares, in file order. */
  def parse(projectGodot: String): Seq[Action] = {
    val out = Vector.newBuilder[Action]
    var inInput = false
    var depth = 0
    var current: Option[String] = None
    val body = new StringBuilder
    projectGodot.split('\n').foreach { raw =>
      val line = raw.stripSuffix("\r")
      if (depth == 0) line match {
        case Section(name)                  => inInput = name == "input"
        case Entry(_, key, rest) if inInput =>
          current = Some(key.trim)
          body.clear()
          body ++= rest
          depth = braces(rest)
          if (depth == 0) {
            out += action(current.get, body.toString); current = None
          }
        case _ => ()
      }
      else {
        body ++= "\n" ++= line
        depth += braces(line)
        if (depth <= 0) {
          depth = 0
          current.foreach(n => out += action(n, body.toString))
          current = None
        }
      }
    }
    out.result()
  }

  private def braces(s: String): Int = {
    var d = 0
    var inStr = false
    var i = 0
    while (i < s.length) {
      val c = s.charAt(i)
      if (c == '"' && (i == 0 || s.charAt(i - 1) != '\\')) inStr = !inStr
      else if (!inStr && c == '{') d += 1
      else if (!inStr && c == '}') d -= 1
      i += 1
    }
    d
  }

  private def action(name: String, body: String): Action =
    Action(
      name,
      EventObj.findAllMatchIn(body).toVector.flatMap { m =>
        val f = m.group(2)
        m.group(1) match {
          case "InputEventKey" =>
            field(f, "keycode")
              .filter(_ != 0)
              .map(c => s"key $c")
              .orElse(
                field(f, "physical_keycode")
                  .filter(_ != 0)
                  .map(c => s"physical key $c")
              )
              .orElse(
                field(f, "key_label").filter(_ != 0).map(c => s"key label $c")
              )
          case "InputEventMouseButton" =>
            field(f, "button_index").map(b => s"mouse button $b")
          case "InputEventJoypadButton" =>
            field(f, "button_index").map(b => s"joypad button $b")
          case "InputEventJoypadMotion" =>
            val dir = """"axis_value":(-?)""".r
              .findFirstMatchIn(f)
              .map(m => if (m.group(1).isEmpty) "+" else "-")
            field(f, "axis").map(a => s"joypad axis $a${dir.getOrElse("")}")
          case other => Some(other)
        }
      }
    )

  /** Project actions plus the built-ins, deduplicated, feature tags dropped. */
  def actions(projectGodot: String): Seq[Action] = {
    val declared = parse(projectGodot).filterNot(_.name.contains('.'))
    val byName = declared.map(a => a.name -> a).toMap
    val all = (declared.map(_.name) ++ Builtins).distinct
    all.map(n => byName.getOrElse(n, Action(n, Seq.empty)))
  }

  /** `move_left` -> `MoveLeft`; a leading digit gets an `Action` prefix. */
  def identifier(name: String): String = {
    val id =
      name.split("[^A-Za-z0-9]+").filter(_.nonEmpty).map(_.capitalize).mkString
    if (id.isEmpty) "Action"
    else if (id.head.isDigit) "Action" + id
    else id
  }

  /** Warnings for names that clashed and were suffixed. */
  final case class Rendered(source: String, warnings: Seq[String])

  def render(actions: Seq[Action], objectName: String): Rendered = {
    val project =
      actions.filterNot(a => Builtins.contains(a.name) && a.events.isEmpty)
    val ordered = project.sortBy(_.name) ++ actions
      .filter(a => !project.contains(a))
      .sortBy(_.name)
    val seen = scala.collection.mutable.Map.empty[String, Int]
    val warnings = Vector.newBuilder[String]
    val cases = ordered.map { a =>
      val base = identifier(a.name)
      val n = seen.getOrElse(base, 0) + 1
      seen(base) = n
      val id = if (n == 1) base else s"$base$n"
      if (n > 1) warnings += s"action '${a.name}' named $id ($base is taken)"
      val bound = if (a.events.isEmpty) "" else ": " + a.events.mkString(", ")
      s"  /** `${a.name}`$bound */\n  case $id extends $objectName(${literal(a.name)})\n"
    }
    val sb = new StringBuilder
    sb ++= "// GENERATED — DO NOT EDIT.\n"
    sb ++= "// Regenerated by ActionScan (sbt-godot-scala-native) from project.godot's\n"
    sb ++= "// Input Map and Godot's built-in ui_* actions. Disable with\n"
    sb ++= "// `godotInputActions := false`.\n"
    sb ++= "package game\n\n"
    sb ++= "/** The Input Map actions, for `Input.getAction(Actions.Jump, KeyState.JustPressed)`. */\n"
    sb ++= s"enum $objectName(val name: String) extends gdext.api.InputAction {\n"
    sb ++= cases.mkString("\n")
    sb ++= "}\n"
    Rendered(sb.toString, warnings.result())
  }

  private def literal(s: String): String =
    "\"" + s.flatMap {
      case '"'  => "\\\""
      case '\\' => "\\\\"
      case '$'  => "$"
      case c    => c.toString
    } + "\""

  def read(projectFile: File): String =
    if (projectFile.isFile)
      new String(Files.readAllBytes(projectFile.toPath), StandardCharsets.UTF_8)
    else ""
}
