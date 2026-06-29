package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `GridContainer`, extends `Container`. */
abstract class GridContainer extends Container {
  override def godotClassName: String = "GridContainer"

  /** GridContainer.set_columns */
  final def setColumns(columns: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GridContainer", "set_columns", 1286410249L), hostObject.objectPtr, columns)

  /** GridContainer.get_columns */
  final def getColumns(): Long =
    Ptrcall.call0[Long](MethodBind.get("GridContainer", "get_columns", 3905245786L), hostObject.objectPtr)

}
