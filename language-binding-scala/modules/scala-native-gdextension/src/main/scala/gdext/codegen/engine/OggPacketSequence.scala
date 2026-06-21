package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `OggPacketSequence`, extends `Resource`. */
abstract class OggPacketSequence extends Resource {

  /** OggPacketSequence.set_sampling_rate */
  final def setSamplingRate(sampling_rate: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("OggPacketSequence", "set_sampling_rate", 373806689L), hostObject.objectPtr, sampling_rate)

  /** OggPacketSequence.get_sampling_rate */
  final def getSamplingRate(): Double =
    Ptrcall.call0[Double](MethodBind.get("OggPacketSequence", "get_sampling_rate", 1740695150L), hostObject.objectPtr)

  /** OggPacketSequence.get_length */
  final def getLength(): Double =
    Ptrcall.call0[Double](MethodBind.get("OggPacketSequence", "get_length", 1740695150L), hostObject.objectPtr)

}

object OggPacketSequence {
  /** Class metadata for Gd[OggPacketSequence] lifetime management and casting. */
  given GodotClass[OggPacketSequence] with {
    def className = "OggPacketSequence"
    def isRefCounted = true
    def wrap(o: GodotObject): OggPacketSequence = new OggPacketSequence {}.withHost(o.objectPtr)
    def unwrap(t: OggPacketSequence): GodotObject = t.hostObject
  }
}
