package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `EncodedObjectAsID`, extends `RefCounted`. */
abstract class EncodedObjectAsID extends RefCounted {

  /** EncodedObjectAsID.set_object_id */
  final def setObjectId(id: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("EncodedObjectAsID", "set_object_id", 1286410249L), hostObject.objectPtr, id)

  /** EncodedObjectAsID.get_object_id */
  final def getObjectId(): Long =
    Ptrcall.call0[Long](MethodBind.get("EncodedObjectAsID", "get_object_id", 3905245786L), hostObject.objectPtr)

}

object EncodedObjectAsID {
  /** Class metadata for Gd[EncodedObjectAsID] lifetime management and casting. */
  given GodotClass[EncodedObjectAsID] with {
    def className = "EncodedObjectAsID"
    def isRefCounted = true
    def wrap(o: GodotObject): EncodedObjectAsID = new EncodedObjectAsID {}.withHost(o.objectPtr)
    def unwrap(t: EncodedObjectAsID): GodotObject = t.hostObject
  }
}
