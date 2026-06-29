package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `EncodedObjectAsID`, extends `RefCounted`. */
abstract class EncodedObjectAsID extends RefCounted {
  override def godotClassName: String = "EncodedObjectAsID"

  /** EncodedObjectAsID.set_object_id */
  final def setObjectId(id: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("EncodedObjectAsID", "set_object_id", 1286410249L), hostObject.objectPtr, id)

  /** EncodedObjectAsID.get_object_id */
  final def getObjectId(): Long =
    Ptrcall.call0[Long](MethodBind.get("EncodedObjectAsID", "get_object_id", 3905245786L), hostObject.objectPtr)

}
