package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `CameraServer`, extends `Object`. */
abstract class CameraServer extends Object {

  /** CameraServer.set_monitoring_feeds */
  final def setMonitoringFeeds(is_monitoring_feeds: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CameraServer", "set_monitoring_feeds", 2586408642L), hostObject.objectPtr, is_monitoring_feeds)

  /** CameraServer.is_monitoring_feeds */
  final def isMonitoringFeeds(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CameraServer", "is_monitoring_feeds", 36873697L), hostObject.objectPtr)

  /** CameraServer.get_feed */
  final def getFeed(index: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("CameraServer", "get_feed", 361927068L), hostObject.objectPtr, index)

  /** CameraServer.get_feed_count */
  final def getFeedCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("CameraServer", "get_feed_count", 2455072627L), hostObject.objectPtr)

  /** CameraServer.add_feed */
  final def addFeed(feed: CameraFeed): Unit =
    Ptrcall.callVoid1(MethodBind.get("CameraServer", "add_feed", 3204782488L), hostObject.objectPtr, feed.hostObject)

  /** CameraServer.remove_feed */
  final def removeFeed(feed: CameraFeed): Unit =
    Ptrcall.callVoid1(MethodBind.get("CameraServer", "remove_feed", 3204782488L), hostObject.objectPtr, feed.hostObject)

}

object CameraServer {
  /** Class metadata for Gd[CameraServer] lifetime management and casting. */
  given GodotClass[CameraServer] with {
    def className = "CameraServer"
    def isRefCounted = false
    def wrap(o: GodotObject): CameraServer = new CameraServer {}.withHost(o.objectPtr)
    def unwrap(t: CameraServer): GodotObject = t.hostObject
  }

  /** The process-global CameraServer singleton instance. */
  def singleton: CameraServer = new CameraServer {}
    .withHost(Godot.interface.global_get_singleton(
      StringNames.cached("CameraServer").ptr))
}
