package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `FBXState`, extends `GLTFState`. */
abstract class FBXState extends GLTFState {
  override def godotClassName: String = "FBXState"

  /** FBXState.get_allow_geometry_helper_nodes */
  final def getAllowGeometryHelperNodes(): Boolean = {
    if (gdext.classes.FBXState.mb_get_allow_geometry_helper_nodes == null) gdext.classes.FBXState.mb_get_allow_geometry_helper_nodes = MethodBind.get("FBXState", "get_allow_geometry_helper_nodes", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.FBXState.mb_get_allow_geometry_helper_nodes, livePtr)
  }

  /** FBXState.set_allow_geometry_helper_nodes */
  final def setAllowGeometryHelperNodes(allow: Boolean): Unit = {
    if (gdext.classes.FBXState.mb_set_allow_geometry_helper_nodes == null) gdext.classes.FBXState.mb_set_allow_geometry_helper_nodes = MethodBind.get("FBXState", "set_allow_geometry_helper_nodes", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.FBXState.mb_set_allow_geometry_helper_nodes, livePtr, allow)
  }

}

object FBXState {
  private[classes] var mb_get_allow_geometry_helper_nodes: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_allow_geometry_helper_nodes: GDExtensionMethodBindPtr = null
}
