package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `SliderJoint3D`, extends `Joint3D`. */
abstract class SliderJoint3D extends Joint3D {

  /** SliderJoint3D.set_param */
  final def setParam(param: Long, value: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("SliderJoint3D", "set_param", 918243683L), hostObject.objectPtr, param, value)

  /** SliderJoint3D.get_param */
  final def getParam(param: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("SliderJoint3D", "get_param", 959925627L), hostObject.objectPtr, param)

}

object SliderJoint3D {
  /** Class metadata for Gd[SliderJoint3D] lifetime management and casting. */
  given GodotClass[SliderJoint3D] with {
    def className = "SliderJoint3D"
    def isRefCounted = false
    def wrap(o: GodotObject): SliderJoint3D = new SliderJoint3D {}.withHost(o.objectPtr)
    def unwrap(t: SliderJoint3D): GodotObject = t.hostObject
  }
}
