package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `SkeletonProfileHumanoid`, extends `SkeletonProfile`. */
abstract class SkeletonProfileHumanoid extends SkeletonProfile {

}

object SkeletonProfileHumanoid {
  /** Class metadata for Gd[SkeletonProfileHumanoid] lifetime management and casting. */
  given GodotClass[SkeletonProfileHumanoid] with {
    def className = "SkeletonProfileHumanoid"
    def isRefCounted = true
    def wrap(o: GodotObject): SkeletonProfileHumanoid = new SkeletonProfileHumanoid {}.withHost(o.objectPtr)
    def unwrap(t: SkeletonProfileHumanoid): GodotObject = t.hostObject
  }
}
