package gdext.internal

import scala.scalanative.unsafe.*

/**
 * Makes Scala-Native GC allocation safe on threads the engine created.
 *
 * In Scala Native's multithreaded mode (triggered by any `java.lang.Thread`
 * reference in the program) the GC keeps per-thread allocation state in a
 * thread-local that is set only for the main thread and for threads SN itself
 * creates. When Godot calls one of our class callbacks (create/free instance, a
 * property getter/setter, a virtual) from one of ITS OWN threads — e.g. the
 * editor's resource-import / inspector workers — that thread has no mutator
 * state, and the first allocation NULL-derefs and SIGSEGVs in the GC allocator.
 *
 * [[ensureRegistered]] registers the calling thread as a GC mutator on first
 * touch (idempotent: a no-op if it is already one, including the main thread).
 * We register and LEAVE registered for the thread's lifetime — Godot's workers
 * are long-lived pool threads, and unregistering mid-callback would race the
 * GC's stop-the-world. The cost is one small mutator struct per allocating
 * foreign thread, bounded by Godot's worker-pool size.
 *
 * Call it at the top of every callback Godot can invoke before that callback
 * allocates. It is the cheapest possible guard (a thread-local NULL check) once
 * the thread is registered.
 */
private[gdext] object GcThread:
  def ensureRegistered(): Unit =
    GcThreadExtern.register()
    ()

@extern
private object GcThreadExtern:
  @name("scalanative_gdext_gc_register_current_thread")
  def register(): CInt = extern

  @name("scalanative_gdext_gc_unregister_current_thread")
  def unregister(): Unit = extern
