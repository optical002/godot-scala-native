package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `FBXState`, extends `GLTFState`. */
abstract class FBXState extends GLTFState {

  /** FBXState.get_allow_geometry_helper_nodes */
  final def getAllowGeometryHelperNodes(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("FBXState", "get_allow_geometry_helper_nodes", 2240911060L), hostObject.objectPtr)

  /** FBXState.set_allow_geometry_helper_nodes */
  final def setAllowGeometryHelperNodes(allow: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("FBXState", "set_allow_geometry_helper_nodes", 2586408642L), hostObject.objectPtr, allow)

}

object FBXState {
  /** Class metadata for Gd[FBXState] lifetime management and casting. */
  given GodotClass[FBXState] with {
    def className = "FBXState"
    def isRefCounted = true
    def wrap(o: GodotObject): FBXState = new FBXState {}.withHost(o.objectPtr)
    def unwrap(t: FBXState): GodotObject = t.hostObject
  }
}
