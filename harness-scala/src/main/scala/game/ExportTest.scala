package game

import gdext.builtin.Color
import gdext.codegen.engine.Node
import gdext.register.*

/**
 * Showcases every inspector export hint the binding supports. Each `@gdexport`
 * carries an `ExportHint` (the analogue of GDScript's `@export_range`,
 * `@export_file`, …), and the fields are organised with `@exportCategory` /
 * `@exportGroup` / `@exportSubgroup` markers. Auto-registered like any other
 * `game` class; add an `ExportTest` node to a scene to see it in the inspector.
 */
final class ExportTest extends Node {
  // --- Numbers (range + easing) ------------------------------------------
  @exportCategory("Numbers")
  @gdexport(ExportHint.range(0, 100)) var health: Int = 100
  @gdexport(ExportHint.range(0, 999, 1, "or_greater")) var damage: Int = 10
  @gdexport(ExportHint.range(0.0, 1.0, 0.01)) var ratio: Double = 0.5
  @gdexport(ExportHint.expEasing()) var falloff: Double = 1.0

  // --- Text (multiline + locale) -----------------------------------------
  @exportGroup("Text")
  @gdexport(ExportHint.multiline) var bio: String = ""
  @gdexport(ExportHint.locale) var language: String = "en"

  // --- Paths (file/dir, local + global) ----------------------------------
  @exportGroup("Paths")
  @gdexport(ExportHint.file("*.png")) var icon: String = ""
  @gdexport(ExportHint.dir) var folder: String = ""
  @gdexport(ExportHint.globalFile("*.txt")) var externalFile: String = ""
  @gdexport(ExportHint.globalDir) var externalFolder: String = ""

  // --- Appearance (color, with a subgroup) -------------------------------
  @exportGroup("Appearance")
  @gdexport var tint: Color = Color(1, 1, 1, 1)
  @exportSubgroup("Advanced")
  @gdexport(ExportHint.colorNoAlpha) var solidTint: Color = Color(1, 1, 1, 1)
}
