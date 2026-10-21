package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `IP`, extends `Object`. */
abstract class IP extends Object {
  override def godotClassName: String = "IP"

  /** IP.resolve_hostname */
  final def resolveHostname(host: String, ip_type: Long): String = {
    if (gdext.classes.IP.mb_resolve_hostname == null) gdext.classes.IP.mb_resolve_hostname = MethodBind.get("IP", "resolve_hostname", 4283295457L)
    Ptrcall.call2[String, Long, String](gdext.classes.IP.mb_resolve_hostname, livePtr, host, ip_type)
  }

  /** IP.resolve_hostname_queue_item */
  final def resolveHostnameQueueItem(host: String, ip_type: Long): Long = {
    if (gdext.classes.IP.mb_resolve_hostname_queue_item == null) gdext.classes.IP.mb_resolve_hostname_queue_item = MethodBind.get("IP", "resolve_hostname_queue_item", 1749894742L)
    Ptrcall.call2[String, Long, Long](gdext.classes.IP.mb_resolve_hostname_queue_item, livePtr, host, ip_type)
  }

  /** IP.get_resolve_item_status */
  final def getResolveItemStatus(id: Long): Long = {
    if (gdext.classes.IP.mb_get_resolve_item_status == null) gdext.classes.IP.mb_get_resolve_item_status = MethodBind.get("IP", "get_resolve_item_status", 3812250196L)
    Ptrcall.call1[Long, Long](gdext.classes.IP.mb_get_resolve_item_status, livePtr, id)
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
  final def clearCache(hostname: String): Unit = {
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
}
