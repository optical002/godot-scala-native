package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `CameraServer`, extends `Object`. */
abstract class CameraServer extends Object {
  override def godotClassName: String = "CameraServer"

  /** CameraServer.set_monitoring_feeds */
  final def setMonitoringFeeds(isMonitoringFeeds: Boolean): Unit = {
    if (gdext.classes.CameraServer.mb_set_monitoring_feeds == null) gdext.classes.CameraServer.mb_set_monitoring_feeds = MethodBind.get("CameraServer", "set_monitoring_feeds", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CameraServer.mb_set_monitoring_feeds, livePtr, isMonitoringFeeds)
  }

  /** CameraServer.is_monitoring_feeds */
  final def isMonitoringFeeds(): Boolean = {
    if (gdext.classes.CameraServer.mb_is_monitoring_feeds == null) gdext.classes.CameraServer.mb_is_monitoring_feeds = MethodBind.get("CameraServer", "is_monitoring_feeds", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CameraServer.mb_is_monitoring_feeds, livePtr)
  }

  /** CameraServer.get_feed. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getFeed(index: Long): CameraFeed = {
    if (gdext.classes.CameraServer.mb_get_feed == null) gdext.classes.CameraServer.mb_get_feed = MethodBind.get("CameraServer", "get_feed", 361927068L)
    Wrappers.owned[CameraFeed](Ptrcall.call1[Long, Long](gdext.classes.CameraServer.mb_get_feed, livePtr, index))
  }

  /** CameraServer.get_feed_count */
  final def getFeedCount(): Long = {
    if (gdext.classes.CameraServer.mb_get_feed_count == null) gdext.classes.CameraServer.mb_get_feed_count = MethodBind.get("CameraServer", "get_feed_count", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.CameraServer.mb_get_feed_count, livePtr)
  }

  /** CameraServer.add_feed */
  final def addFeed(feed: CameraFeed): Unit = {
    if (gdext.classes.CameraServer.mb_add_feed == null) gdext.classes.CameraServer.mb_add_feed = MethodBind.get("CameraServer", "add_feed", 3204782488L)
    Ptrcall.callVoid1(gdext.classes.CameraServer.mb_add_feed, livePtr, Wrappers.handle(feed))
  }

  /** CameraServer.remove_feed */
  final def removeFeed(feed: CameraFeed): Unit = {
    if (gdext.classes.CameraServer.mb_remove_feed == null) gdext.classes.CameraServer.mb_remove_feed = MethodBind.get("CameraServer", "remove_feed", 3204782488L)
    Ptrcall.callVoid1(gdext.classes.CameraServer.mb_remove_feed, livePtr, Wrappers.handle(feed))
  }

}

object CameraServer {
  private[classes] var mb_set_monitoring_feeds: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_monitoring_feeds: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_feed: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_feed_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_feed: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_feed: GDExtensionMethodBindPtr = null

  private var instance: CameraServer = null

  /** The process-global CameraServer singleton instance. */
  def singleton: CameraServer = {
    if (instance == null)
      instance = Wrappers.borrowed[CameraServer](GodotObject.fromPtr(
        Godot.interface.global_get_singleton(StringNames.cached("CameraServer").ptr)))
    instance
  }

  /** Forwards to [[singleton]]: CameraServer.set_monitoring_feeds */
  final def setMonitoringFeeds(isMonitoringFeeds: Boolean): Unit =
    singleton.setMonitoringFeeds(isMonitoringFeeds)

  /** Forwards to [[singleton]]: CameraServer.is_monitoring_feeds */
  final def isMonitoringFeeds(): Boolean =
    singleton.isMonitoringFeeds()

  /** Forwards to [[singleton]]: CameraServer.get_feed */
  final def getFeed(index: Long): CameraFeed =
    singleton.getFeed(index)

  /** Forwards to [[singleton]]: CameraServer.get_feed_count */
  final def getFeedCount(): Long =
    singleton.getFeedCount()

  /** Forwards to [[singleton]]: CameraServer.add_feed */
  final def addFeed(feed: CameraFeed): Unit =
    singleton.addFeed(feed)

  /** Forwards to [[singleton]]: CameraServer.remove_feed */
  final def removeFeed(feed: CameraFeed): Unit =
    singleton.removeFeed(feed)

  /** Godot enum `CameraServer.FeedImage`. */
  opaque type FeedImage <: Long = Long

  object FeedImage {
    final val RgbaImage: FeedImage = 0L.asInstanceOf[FeedImage]
    final val YcbcrImage: FeedImage = 0L.asInstanceOf[FeedImage]
    final val YImage: FeedImage = 0L.asInstanceOf[FeedImage]
    final val CbcrImage: FeedImage = 1L.asInstanceOf[FeedImage]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): FeedImage = value.asInstanceOf[FeedImage]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[FeedImage] = scala.IArray[Long](0L, 1L).asInstanceOf[scala.IArray[FeedImage]]

    extension (self: FeedImage)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "RgbaImage"
        case 1L => "CbcrImage"
        case other => other.toString
      }
  }
}
