package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `GLTFPhysicsBody`, extends `Resource`. */
abstract class GLTFPhysicsBody extends Resource {
  override def godotClassName: String = "GLTFPhysicsBody"

  /** GLTFPhysicsBody.to_node */
  final def toNode(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("GLTFPhysicsBody", "to_node", 3224013656L), hostObject.objectPtr)

  /** GLTFPhysicsBody.get_body_type */
  final def getBodyType(): String =
    Ptrcall.call0[String](MethodBind.get("GLTFPhysicsBody", "get_body_type", 201670096L), hostObject.objectPtr)

  /** GLTFPhysicsBody.set_body_type */
  final def setBodyType(body_type: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFPhysicsBody", "set_body_type", 83702148L), hostObject.objectPtr, body_type)

  /** GLTFPhysicsBody.get_mass */
  final def getMass(): Double =
    Ptrcall.call0[Double](MethodBind.get("GLTFPhysicsBody", "get_mass", 1740695150L), hostObject.objectPtr)

  /** GLTFPhysicsBody.set_mass */
  final def setMass(mass: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFPhysicsBody", "set_mass", 373806689L), hostObject.objectPtr, mass)

  /** GLTFPhysicsBody.get_linear_velocity */
  final def getLinearVelocity(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("GLTFPhysicsBody", "get_linear_velocity", 3360562783L), hostObject.objectPtr)

  /** GLTFPhysicsBody.set_linear_velocity */
  final def setLinearVelocity(linear_velocity: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFPhysicsBody", "set_linear_velocity", 3460891852L), hostObject.objectPtr, linear_velocity)

  /** GLTFPhysicsBody.get_angular_velocity */
  final def getAngularVelocity(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("GLTFPhysicsBody", "get_angular_velocity", 3360562783L), hostObject.objectPtr)

  /** GLTFPhysicsBody.set_angular_velocity */
  final def setAngularVelocity(angular_velocity: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFPhysicsBody", "set_angular_velocity", 3460891852L), hostObject.objectPtr, angular_velocity)

  /** GLTFPhysicsBody.get_center_of_mass */
  final def getCenterOfMass(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("GLTFPhysicsBody", "get_center_of_mass", 3360562783L), hostObject.objectPtr)

  /** GLTFPhysicsBody.set_center_of_mass */
  final def setCenterOfMass(center_of_mass: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFPhysicsBody", "set_center_of_mass", 3460891852L), hostObject.objectPtr, center_of_mass)

  /** GLTFPhysicsBody.get_inertia_diagonal */
  final def getInertiaDiagonal(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("GLTFPhysicsBody", "get_inertia_diagonal", 3360562783L), hostObject.objectPtr)

  /** GLTFPhysicsBody.set_inertia_diagonal */
  final def setInertiaDiagonal(inertia_diagonal: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFPhysicsBody", "set_inertia_diagonal", 3460891852L), hostObject.objectPtr, inertia_diagonal)

  /** GLTFPhysicsBody.get_inertia_orientation */
  final def getInertiaOrientation(): gdext.builtin.Quaternion =
    Ptrcall.call0[gdext.builtin.Quaternion](MethodBind.get("GLTFPhysicsBody", "get_inertia_orientation", 1222331677L), hostObject.objectPtr)

  /** GLTFPhysicsBody.set_inertia_orientation */
  final def setInertiaOrientation(inertia_orientation: gdext.builtin.Quaternion): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFPhysicsBody", "set_inertia_orientation", 1727505552L), hostObject.objectPtr, inertia_orientation)

  /** GLTFPhysicsBody.get_inertia_tensor */
  final def getInertiaTensor(): gdext.builtin.Basis =
    Ptrcall.call0[gdext.builtin.Basis](MethodBind.get("GLTFPhysicsBody", "get_inertia_tensor", 2716978435L), hostObject.objectPtr)

  /** GLTFPhysicsBody.set_inertia_tensor */
  final def setInertiaTensor(inertia_tensor: gdext.builtin.Basis): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFPhysicsBody", "set_inertia_tensor", 1055510324L), hostObject.objectPtr, inertia_tensor)

}
