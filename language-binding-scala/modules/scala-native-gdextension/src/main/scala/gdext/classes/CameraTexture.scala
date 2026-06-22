package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `CameraTexture`, extends `Texture2D`. */
abstract class CameraTexture extends Texture2D {

  /** CameraTexture.set_camera_feed_id */
  final def setCameraFeedId(feed_id: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CameraTexture", "set_camera_feed_id", 1286410249L), hostObject.objectPtr, feed_id)

  /** CameraTexture.get_camera_feed_id */
  final def getCameraFeedId(): Long =
    Ptrcall.call0[Long](MethodBind.get("CameraTexture", "get_camera_feed_id", 3905245786L), hostObject.objectPtr)

  /** CameraTexture.set_which_feed */
  final def setWhichFeed(which_feed: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CameraTexture", "set_which_feed", 1595299230L), hostObject.objectPtr, which_feed)

  /** CameraTexture.get_which_feed */
  final def getWhichFeed(): Long =
    Ptrcall.call0[Long](MethodBind.get("CameraTexture", "get_which_feed", 91039457L), hostObject.objectPtr)

  /** CameraTexture.set_camera_active */
  final def setCameraActive(active: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CameraTexture", "set_camera_active", 2586408642L), hostObject.objectPtr, active)

  /** CameraTexture.get_camera_active */
  final def getCameraActive(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CameraTexture", "get_camera_active", 36873697L), hostObject.objectPtr)

}

object CameraTexture {
  /** Class metadata for Gd[CameraTexture] lifetime management and casting. */
  given GodotClass[CameraTexture] with {
    def className = "CameraTexture"
    def isRefCounted = true
    def wrap(o: GodotObject): CameraTexture = new CameraTexture {}.withHost(o.objectPtr)
    def unwrap(t: CameraTexture): GodotObject = t.hostObject
  }
}
