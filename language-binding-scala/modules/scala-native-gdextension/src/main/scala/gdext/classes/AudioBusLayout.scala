package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioBusLayout`, extends `Resource`. */
abstract class AudioBusLayout extends Resource {

}

object AudioBusLayout {
  /** Class metadata for Gd[AudioBusLayout] lifetime management and casting. */
  given GodotClass[AudioBusLayout] with {
    def className = "AudioBusLayout"
    def isRefCounted = true
    def wrap(o: GodotObject): AudioBusLayout = new AudioBusLayout {}.withHost(o.objectPtr)
    def unwrap(t: AudioBusLayout): GodotObject = t.hostObject
  }
}
