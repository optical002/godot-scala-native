package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `SceneReplicationConfig`, extends `Resource`. */
abstract class SceneReplicationConfig extends Resource {
  override def godotClassName: String = "SceneReplicationConfig"

}

object SceneReplicationConfig {

  /** Godot enum `SceneReplicationConfig.ReplicationMode`. */
  opaque type ReplicationMode <: Long = Long

  object ReplicationMode {
    final val Never: ReplicationMode = 0L.asInstanceOf[ReplicationMode]
    final val Always: ReplicationMode = 1L.asInstanceOf[ReplicationMode]
    final val OnChange: ReplicationMode = 2L.asInstanceOf[ReplicationMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ReplicationMode = value.asInstanceOf[ReplicationMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ReplicationMode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[ReplicationMode]]

    extension (self: ReplicationMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Never"
        case 1L => "Always"
        case 2L => "OnChange"
        case other => other.toString
      }
  }
}
