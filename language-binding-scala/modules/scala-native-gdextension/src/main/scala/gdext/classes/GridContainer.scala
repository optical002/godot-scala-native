package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `GridContainer`, extends `Container`. */
abstract class GridContainer extends Container {
  override def godotClassName: String = "GridContainer"

  /** GridContainer.set_columns */
  final def setColumns(columns: Long): Unit = {
    if (gdext.classes.GridContainer.mb_set_columns == null) gdext.classes.GridContainer.mb_set_columns = MethodBind.get("GridContainer", "set_columns", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GridContainer.mb_set_columns, livePtr, columns)
  }

  /** GridContainer.get_columns */
  final def getColumns(): Long = {
    if (gdext.classes.GridContainer.mb_get_columns == null) gdext.classes.GridContainer.mb_get_columns = MethodBind.get("GridContainer", "get_columns", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.GridContainer.mb_get_columns, livePtr)
  }

}

object GridContainer {
  private[classes] var mb_set_columns: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_columns: GDExtensionMethodBindPtr = null
}
