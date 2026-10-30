package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `GLTFPhysicsShape`, extends `Resource`. */
abstract class GLTFPhysicsShape extends Resource {
  override def godotClassName: String = "GLTFPhysicsShape"

  /** GLTFPhysicsShape.to_node */
  final def toNode(cacheShapes: Boolean = false): CollisionShape3D = {
    if (gdext.classes.GLTFPhysicsShape.mb_to_node == null) gdext.classes.GLTFPhysicsShape.mb_to_node = MethodBind.get("GLTFPhysicsShape", "to_node", 563689933L)
    Wrappers.borrowed[CollisionShape3D](Ptrcall.call1[Boolean, Long](gdext.classes.GLTFPhysicsShape.mb_to_node, livePtr, cacheShapes))
  }

  /** GLTFPhysicsShape.to_resource. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def toResource(cacheShapes: Boolean = false): Shape3D = {
    if (gdext.classes.GLTFPhysicsShape.mb_to_resource == null) gdext.classes.GLTFPhysicsShape.mb_to_resource = MethodBind.get("GLTFPhysicsShape", "to_resource", 1913542110L)
    Wrappers.owned[Shape3D](Ptrcall.call1[Boolean, Long](gdext.classes.GLTFPhysicsShape.mb_to_resource, livePtr, cacheShapes))
  }

  /** GLTFPhysicsShape.get_shape_type */
  final def getShapeType(): String = {
    if (gdext.classes.GLTFPhysicsShape.mb_get_shape_type == null) gdext.classes.GLTFPhysicsShape.mb_get_shape_type = MethodBind.get("GLTFPhysicsShape", "get_shape_type", 201670096L)
    Ptrcall.call0[String](gdext.classes.GLTFPhysicsShape.mb_get_shape_type, livePtr)
  }

  /** GLTFPhysicsShape.set_shape_type */
  final def setShapeType(shapeType: String): Unit = {
    if (gdext.classes.GLTFPhysicsShape.mb_set_shape_type == null) gdext.classes.GLTFPhysicsShape.mb_set_shape_type = MethodBind.get("GLTFPhysicsShape", "set_shape_type", 83702148L)
    Ptrcall.callVoid1(gdext.classes.GLTFPhysicsShape.mb_set_shape_type, livePtr, shapeType)
  }

  /** GLTFPhysicsShape.get_size */
  final def getSize(): gdext.builtin.Vector3 = {
    if (gdext.classes.GLTFPhysicsShape.mb_get_size == null) gdext.classes.GLTFPhysicsShape.mb_get_size = MethodBind.get("GLTFPhysicsShape", "get_size", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.GLTFPhysicsShape.mb_get_size, livePtr)
  }

  /** GLTFPhysicsShape.set_size */
  final def setSize(size: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.GLTFPhysicsShape.mb_set_size == null) gdext.classes.GLTFPhysicsShape.mb_set_size = MethodBind.get("GLTFPhysicsShape", "set_size", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.GLTFPhysicsShape.mb_set_size, livePtr, size)
  }

  /** GLTFPhysicsShape.get_radius */
  final def getRadius(): Double = {
    if (gdext.classes.GLTFPhysicsShape.mb_get_radius == null) gdext.classes.GLTFPhysicsShape.mb_get_radius = MethodBind.get("GLTFPhysicsShape", "get_radius", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.GLTFPhysicsShape.mb_get_radius, livePtr)
  }

  /** GLTFPhysicsShape.set_radius */
  final def setRadius(radius: Double): Unit = {
    if (gdext.classes.GLTFPhysicsShape.mb_set_radius == null) gdext.classes.GLTFPhysicsShape.mb_set_radius = MethodBind.get("GLTFPhysicsShape", "set_radius", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GLTFPhysicsShape.mb_set_radius, livePtr, radius)
  }

  /** GLTFPhysicsShape.get_height */
  final def getHeight(): Double = {
    if (gdext.classes.GLTFPhysicsShape.mb_get_height == null) gdext.classes.GLTFPhysicsShape.mb_get_height = MethodBind.get("GLTFPhysicsShape", "get_height", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.GLTFPhysicsShape.mb_get_height, livePtr)
  }

  /** GLTFPhysicsShape.set_height */
  final def setHeight(height: Double): Unit = {
    if (gdext.classes.GLTFPhysicsShape.mb_set_height == null) gdext.classes.GLTFPhysicsShape.mb_set_height = MethodBind.get("GLTFPhysicsShape", "set_height", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GLTFPhysicsShape.mb_set_height, livePtr, height)
  }

  /** GLTFPhysicsShape.get_is_trigger */
  final def getIsTrigger(): Boolean = {
    if (gdext.classes.GLTFPhysicsShape.mb_get_is_trigger == null) gdext.classes.GLTFPhysicsShape.mb_get_is_trigger = MethodBind.get("GLTFPhysicsShape", "get_is_trigger", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.GLTFPhysicsShape.mb_get_is_trigger, livePtr)
  }

  /** GLTFPhysicsShape.set_is_trigger */
  final def setIsTrigger(isTrigger: Boolean): Unit = {
    if (gdext.classes.GLTFPhysicsShape.mb_set_is_trigger == null) gdext.classes.GLTFPhysicsShape.mb_set_is_trigger = MethodBind.get("GLTFPhysicsShape", "set_is_trigger", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.GLTFPhysicsShape.mb_set_is_trigger, livePtr, isTrigger)
  }

  /** GLTFPhysicsShape.get_mesh_index */
  final def getMeshIndex(): Long = {
    if (gdext.classes.GLTFPhysicsShape.mb_get_mesh_index == null) gdext.classes.GLTFPhysicsShape.mb_get_mesh_index = MethodBind.get("GLTFPhysicsShape", "get_mesh_index", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.GLTFPhysicsShape.mb_get_mesh_index, livePtr)
  }

  /** GLTFPhysicsShape.set_mesh_index */
  final def setMeshIndex(meshIndex: Long): Unit = {
    if (gdext.classes.GLTFPhysicsShape.mb_set_mesh_index == null) gdext.classes.GLTFPhysicsShape.mb_set_mesh_index = MethodBind.get("GLTFPhysicsShape", "set_mesh_index", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GLTFPhysicsShape.mb_set_mesh_index, livePtr, meshIndex)
  }

  /** GLTFPhysicsShape.get_importer_mesh. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getImporterMesh(): ImporterMesh = {
    if (gdext.classes.GLTFPhysicsShape.mb_get_importer_mesh == null) gdext.classes.GLTFPhysicsShape.mb_get_importer_mesh = MethodBind.get("GLTFPhysicsShape", "get_importer_mesh", 3161779525L)
    Wrappers.owned[ImporterMesh](Ptrcall.call0[Long](gdext.classes.GLTFPhysicsShape.mb_get_importer_mesh, livePtr))
  }

  /** GLTFPhysicsShape.set_importer_mesh */
  final def setImporterMesh(importerMesh: ImporterMesh): Unit = {
    if (gdext.classes.GLTFPhysicsShape.mb_set_importer_mesh == null) gdext.classes.GLTFPhysicsShape.mb_set_importer_mesh = MethodBind.get("GLTFPhysicsShape", "set_importer_mesh", 2255166972L)
    Ptrcall.callVoid1(gdext.classes.GLTFPhysicsShape.mb_set_importer_mesh, livePtr, Wrappers.handle(importerMesh))
  }

}

object GLTFPhysicsShape {
  private[classes] var mb_from_node: GDExtensionMethodBindPtr = null
  private[classes] var mb_to_node: GDExtensionMethodBindPtr = null
  private[classes] var mb_from_resource: GDExtensionMethodBindPtr = null
  private[classes] var mb_to_resource: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_shape_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_shape_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_is_trigger: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_is_trigger: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_mesh_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_mesh_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_importer_mesh: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_importer_mesh: GDExtensionMethodBindPtr = null

  /** GLTFPhysicsShape.from_node. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def fromNode(shapeNode: CollisionShape3D): GLTFPhysicsShape = {
    if (gdext.classes.GLTFPhysicsShape.mb_from_node == null) gdext.classes.GLTFPhysicsShape.mb_from_node = MethodBind.get("GLTFPhysicsShape", "from_node", 3613751275L)
    Wrappers.owned[GLTFPhysicsShape](Ptrcall.call1[GodotObject, Long](gdext.classes.GLTFPhysicsShape.mb_from_node, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], Wrappers.handle(shapeNode)))
  }

  /** GLTFPhysicsShape.from_resource. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def fromResource(shapeResource: Shape3D): GLTFPhysicsShape = {
    if (gdext.classes.GLTFPhysicsShape.mb_from_resource == null) gdext.classes.GLTFPhysicsShape.mb_from_resource = MethodBind.get("GLTFPhysicsShape", "from_resource", 3845569786L)
    Wrappers.owned[GLTFPhysicsShape](Ptrcall.call1[GodotObject, Long](gdext.classes.GLTFPhysicsShape.mb_from_resource, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], Wrappers.handle(shapeResource)))
  }
}
