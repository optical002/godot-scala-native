package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `NavigationMeshGenerator`, extends `Object`. */
abstract class NavigationMeshGenerator extends Object {
  override def godotClassName: String = "NavigationMeshGenerator"

  /** NavigationMeshGenerator.bake */
  final def bake(navigationMesh: NavigationMesh, rootNode: Node): Unit = {
    if (gdext.classes.NavigationMeshGenerator.mb_bake == null) gdext.classes.NavigationMeshGenerator.mb_bake = MethodBind.get("NavigationMeshGenerator", "bake", 1401173477L)
    Ptrcall.callVoid2(gdext.classes.NavigationMeshGenerator.mb_bake, livePtr, Wrappers.handle(navigationMesh), Wrappers.handle(rootNode))
  }

  /** NavigationMeshGenerator.clear */
  final def clear(navigationMesh: NavigationMesh): Unit = {
    if (gdext.classes.NavigationMeshGenerator.mb_clear == null) gdext.classes.NavigationMeshGenerator.mb_clear = MethodBind.get("NavigationMeshGenerator", "clear", 2923361153L)
    Ptrcall.callVoid1(gdext.classes.NavigationMeshGenerator.mb_clear, livePtr, Wrappers.handle(navigationMesh))
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

  /** Forwards to [[singleton]]: NavigationMeshGenerator.bake */
  final def bake(navigationMesh: NavigationMesh, rootNode: Node): Unit =
    singleton.bake(navigationMesh, rootNode)

  /** Forwards to [[singleton]]: NavigationMeshGenerator.clear */
  final def clear(navigationMesh: NavigationMesh): Unit =
    singleton.clear(navigationMesh)
}
