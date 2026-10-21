package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `EncodedObjectAsID`, extends `RefCounted`. */
abstract class EncodedObjectAsID extends RefCounted {
  override def godotClassName: String = "EncodedObjectAsID"

  /** EncodedObjectAsID.set_object_id */
  final def setObjectId(id: Long): Unit = {
    if (gdext.classes.EncodedObjectAsID.mb_set_object_id == null) gdext.classes.EncodedObjectAsID.mb_set_object_id = MethodBind.get("EncodedObjectAsID", "set_object_id", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.EncodedObjectAsID.mb_set_object_id, livePtr, id)
  }

  /** EncodedObjectAsID.get_object_id */
  final def getObjectId(): Long = {
    if (gdext.classes.EncodedObjectAsID.mb_get_object_id == null) gdext.classes.EncodedObjectAsID.mb_get_object_id = MethodBind.get("EncodedObjectAsID", "get_object_id", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.EncodedObjectAsID.mb_get_object_id, livePtr)
  }

}

object EncodedObjectAsID {
  private[classes] var mb_set_object_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_object_id: GDExtensionMethodBindPtr = null
}
