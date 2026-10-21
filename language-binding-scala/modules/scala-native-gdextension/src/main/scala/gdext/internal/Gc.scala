package gdext.internal

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*

/** Control over the Scala Native garbage collector (Boehm, stop-the-world,
  * single-threaded — the GC the sbt plugin always configures).
  *
  * Engine objects never depend on the GC: their lifetimes follow Godot (scene
  * tree, `free()`, owned `RefCounted` references), so collecting, pausing or
  * resuming the GC never frees a Godot object. What the GC reclaims is plain
  * Scala heap: wrappers, closures, strings, collections, math values.
  *
  * Typical game use: `Gc.collect()` at a loading screen or level transition,
  * and `Gc.paused { ... }` around a short burst that must not stutter. Reached
  * as `gdext.api.Gc`.
  */
object Gc {

  /** A snapshot of the collector's counters. */
  final case class Stats(
    heapBytes: Long,
    totalAllocatedBytes: Long,
    collections: Long,
    outstandingOwnedRefs: Long
  )

  /** Run a full collection now. */
  def collect(): Unit = BoehmExtern.GC_gcollect()

  /** Stop automatic collections until a matching [[enable]]. Calls nest: the GC
    * runs again only once every `disable` has been matched. The heap grows
    * instead of collecting while disabled.
    */
  def disable(): Unit = BoehmExtern.GC_disable()

  /** Undo one [[disable]]. */
  def enable(): Unit = BoehmExtern.GC_enable()

  /** Run `body` with automatic collections paused, re-enabling on exit. */
  inline def paused[A](inline body: A): A = {
    disable()
    try body
    finally enable()
  }

  /** Bytes allocated on the GC heap since start-up (monotonic). */
  def totalAllocatedBytes: Long = BoehmExtern.GC_get_total_bytes().toLong

  /** Current GC heap size in bytes. */
  def heapBytes: Long = BoehmExtern.GC_get_heap_size().toLong

  /** Number of collections run since start-up. */
  def collections: Long = BoehmExtern.GC_get_gc_no().toLong

  def stats: Stats =
    Stats(
      heapBytes,
      totalAllocatedBytes,
      collections,
      gdext.internal.engine.Ownership.outstanding
    )
}

@extern
private object BoehmExtern {
  def GC_gcollect(): Unit = extern
  def GC_disable(): Unit = extern
  def GC_enable(): Unit = extern
  def GC_get_total_bytes(): CSize = extern
  def GC_get_heap_size(): CSize = extern
  def GC_get_gc_no(): CSize = extern
}
