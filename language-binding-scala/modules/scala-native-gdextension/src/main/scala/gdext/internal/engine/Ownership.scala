package gdext.internal.engine

import gdext.internal.register.GodotScriptClass

/** Book-keeping for `RefCounted` references owned by Scala code.
  *
  * A wrapper owns one reference per [[adopt]] (an engine `Ref<T>` return,
  * `Gd.create` of a RefCounted, `refInc()`), counted on the wrapper and in
  * [[outstanding]]. `unref()` releases one. Inside a `Gd.scoped` block every
  * adopted reference is also recorded in the innermost scope, which releases
  * whatever is still recorded when the block exits; `keep()` takes a reference
  * back out of the scope so it outlives the block.
  *
  * Single-threaded, like the rest of the binding.
  */
private[gdext] object Ownership {
  private var count: Long = 0L

  // Wrappers that currently own references, for the shutdown leak report.
  // Identity-keyed open addressing: re-adopting a known wrapper allocates
  // nothing.
  private val owners =
    new java.util.IdentityHashMap[GodotScriptClass, java.lang.Boolean]()

  /** References adopted by Scala and not yet released. */
  def outstanding: Long = count

  /** One line per class still owning references, e.g. "ArrayMesh x2", or empty
    * when every adopted reference was released.
    */
  def leakReport: Seq[String] = {
    val byClass = scala.collection.mutable.LinkedHashMap.empty[String, Int]
    owners.keySet().forEach { w =>
      val n = w.godotClassName
      byClass(n) = byClass.getOrElse(n, 0) + w.ownedRefs
    }
    byClass.toSeq.map { case (n, c) => s"$n x$c" }
  }

  /** A `Gd.scoped` block: the references adopted while it is innermost. */
  final class Scope(val parent: Scope) {
    private[Ownership] var items = new Array[GodotScriptClass](8)
    private[Ownership] var size = 0

    private[Ownership] def add(w: GodotScriptClass): Unit = {
      if (size == items.length) items = java.util.Arrays.copyOf(items, size * 2)
      items(size) = w
      size += 1
    }

    /** Drop the most recent record of `w`; false if this scope has none. */
    private[Ownership] def remove(w: GodotScriptClass): Boolean = {
      var i = size - 1
      while (i >= 0) {
        if (items(i) eq w) {
          System.arraycopy(items, i + 1, items, i, size - i - 1)
          size -= 1
          items(size) = null
          return true
        }
        i -= 1
      }
      false
    }
  }

  private var current: Scope = null

  def enter(): Scope = {
    current = new Scope(current)
    current
  }

  /** Release every reference still recorded in `s`, newest first. */
  def exit(s: Scope): Unit = {
    current = s.parent
    var i = s.size - 1
    while (i >= 0) {
      val w = s.items(i)
      s.items(i) = null
      s.size = i
      release(w)
      i -= 1
    }
  }

  /** `w` now owns one more reference (already taken engine-side). */
  def adopt(w: GodotScriptClass): Unit = {
    w.ownedRefs += 1
    count += 1
    owners.put(w, java.lang.Boolean.TRUE)
    if (current != null) current.add(w)
  }

  /** Count a reference taken with `refInc()`; never recorded in a scope. */
  def acquired(w: GodotScriptClass): Unit = {
    w.ownedRefs += 1
    count += 1
    owners.put(w, java.lang.Boolean.TRUE)
  }

  /** Move one of `w`'s references out of the scopes, to the caller. */
  def keep(w: GodotScriptClass): Unit = {
    var s = current
    while (s != null && !s.remove(w)) s = s.parent
  }

  /** Release one owned reference of `w`: drop it from any scope that recorded
    * it, then unreference the object, destroying it if that was the last
    * reference. Returns false when `w` owned no reference.
    */
  def unref(w: GodotScriptClass): Boolean =
    if (w.ownedRefs <= 0) false
    else {
      keep(w)
      release(w)
      true
    }

  private def release(w: GodotScriptClass): Unit =
    if (w.ownedRefs > 0) {
      w.ownedRefs -= 1
      count -= 1
      if (w.ownedRefs == 0) owners.remove(w)
      val p = w.hostPtr
      if (p != null && GodotScriptClass.unreference(p))
        gdext.Godot.interface.object_destroy(p)
    }
}
