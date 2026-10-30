package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `CameraTexture`, extends `Texture2D`. */
abstract class CameraTexture extends Texture2D {
  override def godotClassName: String = "CameraTexture"

  /** CameraTexture.set_camera_feed_id */
  final def setCameraFeedId(feedId: Long): Unit = {
    if (gdext.classes.CameraTexture.mb_set_camera_feed_id == null) gdext.classes.CameraTexture.mb_set_camera_feed_id = MethodBind.get("CameraTexture", "set_camera_feed_id", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.CameraTexture.mb_set_camera_feed_id, livePtr, feedId)
  }

  /** CameraTexture.get_camera_feed_id */
  final def getCameraFeedId(): Long = {
    if (gdext.classes.CameraTexture.mb_get_camera_feed_id == null) gdext.classes.CameraTexture.mb_get_camera_feed_id = MethodBind.get("CameraTexture", "get_camera_feed_id", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.CameraTexture.mb_get_camera_feed_id, livePtr)
  }

  /** CameraTexture.set_which_feed */
  final def setWhichFeed(whichFeed: gdext.classes.CameraServer.FeedImage): Unit = {
    if (gdext.classes.CameraTexture.mb_set_which_feed == null) gdext.classes.CameraTexture.mb_set_which_feed = MethodBind.get("CameraTexture", "set_which_feed", 1595299230L)
    Ptrcall.callVoid1(gdext.classes.CameraTexture.mb_set_which_feed, livePtr, whichFeed)
  }

  /** CameraTexture.get_which_feed */
  final def getWhichFeed(): gdext.classes.CameraServer.FeedImage = {
    if (gdext.classes.CameraTexture.mb_get_which_feed == null) gdext.classes.CameraTexture.mb_get_which_feed = MethodBind.get("CameraTexture", "get_which_feed", 91039457L)
    gdext.classes.CameraServer.FeedImage(Ptrcall.call0[Long](gdext.classes.CameraTexture.mb_get_which_feed, livePtr))
  }

  /** CameraTexture.set_camera_active */
  final def setCameraActive(active: Boolean): Unit = {
    if (gdext.classes.CameraTexture.mb_set_camera_active == null) gdext.classes.CameraTexture.mb_set_camera_active = MethodBind.get("CameraTexture", "set_camera_active", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CameraTexture.mb_set_camera_active, livePtr, active)
  }

  /** CameraTexture.get_camera_active */
  final def getCameraActive(): Boolean = {
    if (gdext.classes.CameraTexture.mb_get_camera_active == null) gdext.classes.CameraTexture.mb_get_camera_active = MethodBind.get("CameraTexture", "get_camera_active", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CameraTexture.mb_get_camera_active, livePtr)
  }

}

object CameraTexture {
  private[classes] var mb_set_camera_feed_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_camera_feed_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_which_feed: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_which_feed: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_camera_active: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_camera_active: GDExtensionMethodBindPtr = null
}
