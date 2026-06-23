package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `GLTFPhysicsShape`, extends `Resource`. */
abstract class GLTFPhysicsShape extends Resource {

  /** GLTFPhysicsShape.to_node */
  final def toNode(cache_shapes: Boolean): GodotObject =
    Ptrcall.call1[Boolean, GodotObject](MethodBind.get("GLTFPhysicsShape", "to_node", 563689933L), hostObject.objectPtr, cache_shapes)

  /** GLTFPhysicsShape.to_resource */
  final def toResource(cache_shapes: Boolean): GodotObject =
    Ptrcall.call1[Boolean, GodotObject](MethodBind.get("GLTFPhysicsShape", "to_resource", 1913542110L), hostObject.objectPtr, cache_shapes)

  /** GLTFPhysicsShape.get_shape_type */
  final def getShapeType(): String =
    Ptrcall.call0[String](MethodBind.get("GLTFPhysicsShape", "get_shape_type", 201670096L), hostObject.objectPtr)

  /** GLTFPhysicsShape.set_shape_type */
  final def setShapeType(shape_type: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFPhysicsShape", "set_shape_type", 83702148L), hostObject.objectPtr, shape_type)

  /** GLTFPhysicsShape.get_size */
  final def getSize(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("GLTFPhysicsShape", "get_size", 3360562783L), hostObject.objectPtr)

  /** GLTFPhysicsShape.set_size */
  final def setSize(size: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFPhysicsShape", "set_size", 3460891852L), hostObject.objectPtr, size)

  /** GLTFPhysicsShape.get_radius */
  final def getRadius(): Double =
    Ptrcall.call0[Double](MethodBind.get("GLTFPhysicsShape", "get_radius", 1740695150L), hostObject.objectPtr)

  /** GLTFPhysicsShape.set_radius */
  final def setRadius(radius: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFPhysicsShape", "set_radius", 373806689L), hostObject.objectPtr, radius)

  /** GLTFPhysicsShape.get_height */
  final def getHeight(): Double =
    Ptrcall.call0[Double](MethodBind.get("GLTFPhysicsShape", "get_height", 1740695150L), hostObject.objectPtr)

  /** GLTFPhysicsShape.set_height */
  final def setHeight(height: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFPhysicsShape", "set_height", 373806689L), hostObject.objectPtr, height)

  /** GLTFPhysicsShape.get_is_trigger */
  final def getIsTrigger(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("GLTFPhysicsShape", "get_is_trigger", 36873697L), hostObject.objectPtr)

  /** GLTFPhysicsShape.set_is_trigger */
  final def setIsTrigger(is_trigger: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFPhysicsShape", "set_is_trigger", 2586408642L), hostObject.objectPtr, is_trigger)

  /** GLTFPhysicsShape.get_mesh_index */
  final def getMeshIndex(): Long =
    Ptrcall.call0[Long](MethodBind.get("GLTFPhysicsShape", "get_mesh_index", 3905245786L), hostObject.objectPtr)

  /** GLTFPhysicsShape.set_mesh_index */
  final def setMeshIndex(mesh_index: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFPhysicsShape", "set_mesh_index", 1286410249L), hostObject.objectPtr, mesh_index)

  /** GLTFPhysicsShape.get_importer_mesh */
  final def getImporterMesh(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("GLTFPhysicsShape", "get_importer_mesh", 3161779525L), hostObject.objectPtr)

  /** GLTFPhysicsShape.set_importer_mesh */
  final def setImporterMesh(importer_mesh: ImporterMesh): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFPhysicsShape", "set_importer_mesh", 2255166972L), hostObject.objectPtr, importer_mesh.hostObject)

}

object GLTFPhysicsShape {
  /** Class metadata for Gd[GLTFPhysicsShape] lifetime management and casting. */
  given GodotClass[GLTFPhysicsShape] with {
    def className = "GLTFPhysicsShape"
    def isRefCounted = true
    def wrap(o: GodotObject): GLTFPhysicsShape = new GLTFPhysicsShape {}.withHost(o.objectPtr)
    def unwrap(t: GLTFPhysicsShape): GodotObject = t.hostObject
  }
}
