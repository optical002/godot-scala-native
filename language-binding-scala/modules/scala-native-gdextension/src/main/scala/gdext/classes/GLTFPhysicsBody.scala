package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `GLTFPhysicsBody`, extends `Resource`. */
abstract class GLTFPhysicsBody extends Resource {
  override def godotClassName: String = "GLTFPhysicsBody"

  /** GLTFPhysicsBody.to_node */
  final def toNode(): CollisionObject3D = {
    if (gdext.classes.GLTFPhysicsBody.mb_to_node == null) gdext.classes.GLTFPhysicsBody.mb_to_node = MethodBind.get("GLTFPhysicsBody", "to_node", 3224013656L)
    Wrappers.borrowed[CollisionObject3D](Ptrcall.call0[Long](gdext.classes.GLTFPhysicsBody.mb_to_node, livePtr))
  }

  /** GLTFPhysicsBody.get_body_type */
  final def getBodyType(): String = {
    if (gdext.classes.GLTFPhysicsBody.mb_get_body_type == null) gdext.classes.GLTFPhysicsBody.mb_get_body_type = MethodBind.get("GLTFPhysicsBody", "get_body_type", 201670096L)
    Ptrcall.call0[String](gdext.classes.GLTFPhysicsBody.mb_get_body_type, livePtr)
  }

  /** GLTFPhysicsBody.set_body_type */
  final def setBodyType(body_type: String): Unit = {
    if (gdext.classes.GLTFPhysicsBody.mb_set_body_type == null) gdext.classes.GLTFPhysicsBody.mb_set_body_type = MethodBind.get("GLTFPhysicsBody", "set_body_type", 83702148L)
    Ptrcall.callVoid1(gdext.classes.GLTFPhysicsBody.mb_set_body_type, livePtr, body_type)
  }

  /** GLTFPhysicsBody.get_mass */
  final def getMass(): Double = {
    if (gdext.classes.GLTFPhysicsBody.mb_get_mass == null) gdext.classes.GLTFPhysicsBody.mb_get_mass = MethodBind.get("GLTFPhysicsBody", "get_mass", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.GLTFPhysicsBody.mb_get_mass, livePtr)
  }

  /** GLTFPhysicsBody.set_mass */
  final def setMass(mass: Double): Unit = {
    if (gdext.classes.GLTFPhysicsBody.mb_set_mass == null) gdext.classes.GLTFPhysicsBody.mb_set_mass = MethodBind.get("GLTFPhysicsBody", "set_mass", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GLTFPhysicsBody.mb_set_mass, livePtr, mass)
  }

  /** GLTFPhysicsBody.get_linear_velocity */
  final def getLinearVelocity(): gdext.builtin.Vector3 = {
    if (gdext.classes.GLTFPhysicsBody.mb_get_linear_velocity == null) gdext.classes.GLTFPhysicsBody.mb_get_linear_velocity = MethodBind.get("GLTFPhysicsBody", "get_linear_velocity", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.GLTFPhysicsBody.mb_get_linear_velocity, livePtr)
  }

  /** GLTFPhysicsBody.set_linear_velocity */
  final def setLinearVelocity(linear_velocity: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.GLTFPhysicsBody.mb_set_linear_velocity == null) gdext.classes.GLTFPhysicsBody.mb_set_linear_velocity = MethodBind.get("GLTFPhysicsBody", "set_linear_velocity", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.GLTFPhysicsBody.mb_set_linear_velocity, livePtr, linear_velocity)
  }

  /** GLTFPhysicsBody.get_angular_velocity */
  final def getAngularVelocity(): gdext.builtin.Vector3 = {
    if (gdext.classes.GLTFPhysicsBody.mb_get_angular_velocity == null) gdext.classes.GLTFPhysicsBody.mb_get_angular_velocity = MethodBind.get("GLTFPhysicsBody", "get_angular_velocity", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.GLTFPhysicsBody.mb_get_angular_velocity, livePtr)
  }

  /** GLTFPhysicsBody.set_angular_velocity */
  final def setAngularVelocity(angular_velocity: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.GLTFPhysicsBody.mb_set_angular_velocity == null) gdext.classes.GLTFPhysicsBody.mb_set_angular_velocity = MethodBind.get("GLTFPhysicsBody", "set_angular_velocity", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.GLTFPhysicsBody.mb_set_angular_velocity, livePtr, angular_velocity)
  }

  /** GLTFPhysicsBody.get_center_of_mass */
  final def getCenterOfMass(): gdext.builtin.Vector3 = {
    if (gdext.classes.GLTFPhysicsBody.mb_get_center_of_mass == null) gdext.classes.GLTFPhysicsBody.mb_get_center_of_mass = MethodBind.get("GLTFPhysicsBody", "get_center_of_mass", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.GLTFPhysicsBody.mb_get_center_of_mass, livePtr)
  }

  /** GLTFPhysicsBody.set_center_of_mass */
  final def setCenterOfMass(center_of_mass: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.GLTFPhysicsBody.mb_set_center_of_mass == null) gdext.classes.GLTFPhysicsBody.mb_set_center_of_mass = MethodBind.get("GLTFPhysicsBody", "set_center_of_mass", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.GLTFPhysicsBody.mb_set_center_of_mass, livePtr, center_of_mass)
  }

  /** GLTFPhysicsBody.get_inertia_diagonal */
  final def getInertiaDiagonal(): gdext.builtin.Vector3 = {
    if (gdext.classes.GLTFPhysicsBody.mb_get_inertia_diagonal == null) gdext.classes.GLTFPhysicsBody.mb_get_inertia_diagonal = MethodBind.get("GLTFPhysicsBody", "get_inertia_diagonal", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.GLTFPhysicsBody.mb_get_inertia_diagonal, livePtr)
  }

  /** GLTFPhysicsBody.set_inertia_diagonal */
  final def setInertiaDiagonal(inertia_diagonal: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.GLTFPhysicsBody.mb_set_inertia_diagonal == null) gdext.classes.GLTFPhysicsBody.mb_set_inertia_diagonal = MethodBind.get("GLTFPhysicsBody", "set_inertia_diagonal", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.GLTFPhysicsBody.mb_set_inertia_diagonal, livePtr, inertia_diagonal)
  }

  /** GLTFPhysicsBody.get_inertia_orientation */
  final def getInertiaOrientation(): gdext.builtin.Quaternion = {
    if (gdext.classes.GLTFPhysicsBody.mb_get_inertia_orientation == null) gdext.classes.GLTFPhysicsBody.mb_get_inertia_orientation = MethodBind.get("GLTFPhysicsBody", "get_inertia_orientation", 1222331677L)
    Ptrcall.call0[gdext.builtin.Quaternion](gdext.classes.GLTFPhysicsBody.mb_get_inertia_orientation, livePtr)
  }

  /** GLTFPhysicsBody.set_inertia_orientation */
  final def setInertiaOrientation(inertia_orientation: gdext.builtin.Quaternion): Unit = {
    if (gdext.classes.GLTFPhysicsBody.mb_set_inertia_orientation == null) gdext.classes.GLTFPhysicsBody.mb_set_inertia_orientation = MethodBind.get("GLTFPhysicsBody", "set_inertia_orientation", 1727505552L)
    Ptrcall.callVoid1(gdext.classes.GLTFPhysicsBody.mb_set_inertia_orientation, livePtr, inertia_orientation)
  }

  /** GLTFPhysicsBody.get_inertia_tensor */
  final def getInertiaTensor(): gdext.builtin.Basis = {
    if (gdext.classes.GLTFPhysicsBody.mb_get_inertia_tensor == null) gdext.classes.GLTFPhysicsBody.mb_get_inertia_tensor = MethodBind.get("GLTFPhysicsBody", "get_inertia_tensor", 2716978435L)
    Ptrcall.call0[gdext.builtin.Basis](gdext.classes.GLTFPhysicsBody.mb_get_inertia_tensor, livePtr)
  }

  /** GLTFPhysicsBody.set_inertia_tensor */
  final def setInertiaTensor(inertia_tensor: gdext.builtin.Basis): Unit = {
    if (gdext.classes.GLTFPhysicsBody.mb_set_inertia_tensor == null) gdext.classes.GLTFPhysicsBody.mb_set_inertia_tensor = MethodBind.get("GLTFPhysicsBody", "set_inertia_tensor", 1055510324L)
    Ptrcall.callVoid1(gdext.classes.GLTFPhysicsBody.mb_set_inertia_tensor, livePtr, inertia_tensor)
  }

}

object GLTFPhysicsBody {
  private[classes] var mb_from_node: GDExtensionMethodBindPtr = null
  private[classes] var mb_to_node: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_body_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_body_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_mass: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_mass: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_linear_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_linear_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_angular_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_angular_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_center_of_mass: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_center_of_mass: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_inertia_diagonal: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_inertia_diagonal: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_inertia_orientation: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_inertia_orientation: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_inertia_tensor: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_inertia_tensor: GDExtensionMethodBindPtr = null

  /** GLTFPhysicsBody.from_node. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def fromNode(body_node: CollisionObject3D): GLTFPhysicsBody = {
    if (gdext.classes.GLTFPhysicsBody.mb_from_node == null) gdext.classes.GLTFPhysicsBody.mb_from_node = MethodBind.get("GLTFPhysicsBody", "from_node", 420544174L)
    Wrappers.owned[GLTFPhysicsBody](Ptrcall.call1[GodotObject, Long](gdext.classes.GLTFPhysicsBody.mb_from_node, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], Wrappers.handle(body_node)))
  }
}
