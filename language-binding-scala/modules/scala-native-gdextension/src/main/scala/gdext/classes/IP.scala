package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `IP`, extends `Object`. */
abstract class IP extends Object {
  override def godotClassName: String = "IP"

  /** IP.resolve_hostname */
  final def resolveHostname(host: String, ipType: gdext.classes.IP.Type = gdext.classes.IP.Type(3L)): String = {
    if (gdext.classes.IP.mb_resolve_hostname == null) gdext.classes.IP.mb_resolve_hostname = MethodBind.get("IP", "resolve_hostname", 4283295457L)
    Ptrcall.call2[String, Long, String](gdext.classes.IP.mb_resolve_hostname, livePtr, host, ipType)
  }

  /** IP.resolve_hostname_queue_item */
  final def resolveHostnameQueueItem(host: String, ipType: gdext.classes.IP.Type = gdext.classes.IP.Type(3L)): Long = {
    if (gdext.classes.IP.mb_resolve_hostname_queue_item == null) gdext.classes.IP.mb_resolve_hostname_queue_item = MethodBind.get("IP", "resolve_hostname_queue_item", 1749894742L)
    Ptrcall.call2[String, Long, Long](gdext.classes.IP.mb_resolve_hostname_queue_item, livePtr, host, ipType)
  }

  /** IP.get_resolve_item_status */
  final def getResolveItemStatus(id: Long): gdext.classes.IP.ResolverStatus = {
    if (gdext.classes.IP.mb_get_resolve_item_status == null) gdext.classes.IP.mb_get_resolve_item_status = MethodBind.get("IP", "get_resolve_item_status", 3812250196L)
    gdext.classes.IP.ResolverStatus(Ptrcall.call1[Long, Long](gdext.classes.IP.mb_get_resolve_item_status, livePtr, id))
  }

  /** IP.get_resolve_item_address */
  final def getResolveItemAddress(id: Long): String = {
    if (gdext.classes.IP.mb_get_resolve_item_address == null) gdext.classes.IP.mb_get_resolve_item_address = MethodBind.get("IP", "get_resolve_item_address", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.IP.mb_get_resolve_item_address, livePtr, id)
  }

  /** IP.erase_resolve_item */
  final def eraseResolveItem(id: Long): Unit = {
    if (gdext.classes.IP.mb_erase_resolve_item == null) gdext.classes.IP.mb_erase_resolve_item = MethodBind.get("IP", "erase_resolve_item", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.IP.mb_erase_resolve_item, livePtr, id)
  }

  /** IP.clear_cache */
  final def clearCache(hostname: String = ""): Unit = {
    if (gdext.classes.IP.mb_clear_cache == null) gdext.classes.IP.mb_clear_cache = MethodBind.get("IP", "clear_cache", 3005725572L)
    Ptrcall.callVoid1(gdext.classes.IP.mb_clear_cache, livePtr, hostname)
  }

}

object IP {
  private[classes] var mb_resolve_hostname: GDExtensionMethodBindPtr = null
  private[classes] var mb_resolve_hostname_queue_item: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_resolve_item_status: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_resolve_item_address: GDExtensionMethodBindPtr = null
  private[classes] var mb_erase_resolve_item: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_cache: GDExtensionMethodBindPtr = null

  private var instance: IP = null

  /** The process-global IP singleton instance. */
  def singleton: IP = {
    if (instance == null)
      instance = Wrappers.borrowed[IP](GodotObject.fromPtr(
        Godot.interface.global_get_singleton(StringNames.cached("IP").ptr)))
    instance
  }

  /** Forwards to [[singleton]]: IP.resolve_hostname */
  final def resolveHostname(host: String, ipType: gdext.classes.IP.Type = gdext.classes.IP.Type(3L)): String =
    singleton.resolveHostname(host, ipType)

  /** Forwards to [[singleton]]: IP.resolve_hostname_queue_item */
  final def resolveHostnameQueueItem(host: String, ipType: gdext.classes.IP.Type = gdext.classes.IP.Type(3L)): Long =
    singleton.resolveHostnameQueueItem(host, ipType)

  /** Forwards to [[singleton]]: IP.get_resolve_item_status */
  final def getResolveItemStatus(id: Long): gdext.classes.IP.ResolverStatus =
    singleton.getResolveItemStatus(id)

  /** Forwards to [[singleton]]: IP.get_resolve_item_address */
  final def getResolveItemAddress(id: Long): String =
    singleton.getResolveItemAddress(id)

  /** Forwards to [[singleton]]: IP.erase_resolve_item */
  final def eraseResolveItem(id: Long): Unit =
    singleton.eraseResolveItem(id)

  /** Forwards to [[singleton]]: IP.clear_cache */
  final def clearCache(hostname: String = ""): Unit =
    singleton.clearCache(hostname)

  /** Godot enum `IP.ResolverStatus`. */
  opaque type ResolverStatus <: Long = Long

  object ResolverStatus {
    final val None: ResolverStatus = 0L.asInstanceOf[ResolverStatus]
    final val Waiting: ResolverStatus = 1L.asInstanceOf[ResolverStatus]
    final val Done: ResolverStatus = 2L.asInstanceOf[ResolverStatus]
    final val Error: ResolverStatus = 3L.asInstanceOf[ResolverStatus]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ResolverStatus = value.asInstanceOf[ResolverStatus]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ResolverStatus] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[ResolverStatus]]

    extension (self: ResolverStatus)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "None"
        case 1L => "Waiting"
        case 2L => "Done"
        case 3L => "Error"
        case other => other.toString
      }
  }

  /** Godot enum `IP.Type`. */
  opaque type Type <: Long = Long

  object Type {
    final val None: Type = 0L.asInstanceOf[Type]
    final val Ipv4: Type = 1L.asInstanceOf[Type]
    final val Ipv6: Type = 2L.asInstanceOf[Type]
    final val Any: Type = 3L.asInstanceOf[Type]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Type = value.asInstanceOf[Type]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Type] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[Type]]

    extension (self: Type)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "None"
        case 1L => "Ipv4"
        case 2L => "Ipv6"
        case 3L => "Any"
        case other => other.toString
      }
  }
}
