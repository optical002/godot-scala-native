package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `NavigationMeshGenerator`, extends `Object`. */
abstract class NavigationMeshGenerator extends Object {
  override def godotClassName: String = "NavigationMeshGenerator"

  /** NavigationMeshGenerator.bake */
  final def bake(navigation_mesh: NavigationMesh, root_node: Node): Unit = {
    if (gdext.classes.NavigationMeshGenerator.mb_bake == null) gdext.classes.NavigationMeshGenerator.mb_bake = MethodBind.get("NavigationMeshGenerator", "bake", 1401173477L)
    Ptrcall.callVoid2(gdext.classes.NavigationMeshGenerator.mb_bake, livePtr, Wrappers.handle(navigation_mesh), Wrappers.handle(root_node))
  }

  /** NavigationMeshGenerator.clear */
  final def clear(navigation_mesh: NavigationMesh): Unit = {
    if (gdext.classes.NavigationMeshGenerator.mb_clear == null) gdext.classes.NavigationMeshGenerator.mb_clear = MethodBind.get("NavigationMeshGenerator", "clear", 2923361153L)
    Ptrcall.callVoid1(gdext.classes.NavigationMeshGenerator.mb_clear, livePtr, Wrappers.handle(navigation_mesh))
  }

}

object NavigationMeshGenerator {
  private[classes] var mb_bake: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear: GDExtensionMethodBindPtr = null

  private var instance: NavigationMeshGenerator = null

  /** The process-global NavigationMeshGenerator singleton instance. */
  def singleton: NavigationMeshGenerator = {
    if (instance == null)
      instance = Wrappers.borrowed[NavigationMeshGenerator](GodotObject.fromPtr(
        Godot.interface.global_get_singleton(StringNames.cached("NavigationMeshGenerator").ptr)))
    instance
  }
}
