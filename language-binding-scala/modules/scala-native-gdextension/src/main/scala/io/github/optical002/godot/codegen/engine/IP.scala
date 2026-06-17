package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `IP`, extends `Object`. */
abstract class IP extends Object {

  /** IP.resolve_hostname */
  final def resolveHostname(host: String, ip_type: Long): String =
    Ptrcall.call2[String, Long, String](MethodBind.get("IP", "resolve_hostname", 4283295457L), hostObject.objectPtr, host, ip_type)

  /** IP.resolve_hostname_queue_item */
  final def resolveHostnameQueueItem(host: String, ip_type: Long): Long =
    Ptrcall.call2[String, Long, Long](MethodBind.get("IP", "resolve_hostname_queue_item", 1749894742L), hostObject.objectPtr, host, ip_type)

  /** IP.get_resolve_item_status */
  final def getResolveItemStatus(id: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("IP", "get_resolve_item_status", 3812250196L), hostObject.objectPtr, id)

  /** IP.get_resolve_item_address */
  final def getResolveItemAddress(id: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("IP", "get_resolve_item_address", 844755477L), hostObject.objectPtr, id)

  /** IP.erase_resolve_item */
  final def eraseResolveItem(id: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("IP", "erase_resolve_item", 1286410249L), hostObject.objectPtr, id)

  /** IP.clear_cache */
  final def clearCache(hostname: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("IP", "clear_cache", 3005725572L), hostObject.objectPtr, hostname)

}

object IP {
  /** Class metadata for Gd[IP] lifetime management and casting. */
  given GodotClass[IP] with {
    def className = "IP"
    def isRefCounted = false
    def wrap(o: GodotObject): IP = new IP {}.withHost(o.objectPtr)
    def unwrap(t: IP): GodotObject = t.hostObject
  }

  /** The process-global IP singleton instance. */
  def singleton: IP = new IP {}
    .withHost(Godot.interface.global_get_singleton(
      StringNames.cached("IP").ptr))
}
