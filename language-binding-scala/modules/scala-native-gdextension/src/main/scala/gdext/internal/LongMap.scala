package gdext.internal

/** An open-addressing `Long -> Long` hash map over primitive arrays: lookups
  * and updates of existing keys never allocate (no boxing, no entry objects),
  * which is what the per-call identity and handle caches need. Not thread-safe;
  * the binding runs single-threaded.
  */
private[gdext] final class LongMap(initialCapacity: Int = 64) {
  private var keys = new Array[Long](capacityFor(initialCapacity))
  private var values = new Array[Long](keys.length)
  private var used = new Array[Boolean](keys.length)
  private var count = 0

  private def capacityFor(n: Int): Int = {
    var c = 16
    while (c < n * 2) c <<= 1
    c
  }

  private inline def slot(k: Long, mask: Int): Int = {
    val h = k * 0x9e3779b97f4a7c15L
    (h ^ (h >>> 32)).toInt & mask
  }

  def size: Int = count

  /** The value for `k`, or `default` when absent. */
  def getOrElse(k: Long, default: Long): Long = {
    val mask = keys.length - 1
    var i = slot(k, mask)
    while (used(i)) {
      if (keys(i) == k) return values(i)
      i = (i + 1) & mask
    }
    default
  }

  def contains(k: Long): Boolean = {
    val mask = keys.length - 1
    var i = slot(k, mask)
    while (used(i)) {
      if (keys(i) == k) return true
      i = (i + 1) & mask
    }
    false
  }

  def update(k: Long, v: Long): Unit = {
    if ((count + 1) * 2 > keys.length) grow()
    val mask = keys.length - 1
    var i = slot(k, mask)
    while (used(i)) {
      if (keys(i) == k) { values(i) = v; return }
      i = (i + 1) & mask
    }
    used(i) = true; keys(i) = k; values(i) = v; count += 1
  }

  /** Remove `k` (backward-shift deletion, so probing stays correct). */
  def remove(k: Long): Unit = {
    val mask = keys.length - 1
    var i = slot(k, mask)
    while (used(i)) {
      if (keys(i) == k) {
        used(i) = false; count -= 1
        var j = (i + 1) & mask
        while (used(j)) {
          val kj = keys(j); val vj = values(j)
          used(j) = false; count -= 1
          update(kj, vj)
          j = (j + 1) & mask
        }
        return
      }
      i = (i + 1) & mask
    }
  }

  def clear(): Unit = {
    java.util.Arrays.fill(used, false)
    count = 0
  }

  private def grow(): Unit = {
    val oldK = keys; val oldV = values; val oldU = used
    keys = new Array[Long](oldK.length * 2)
    values = new Array[Long](keys.length)
    used = new Array[Boolean](keys.length)
    count = 0
    var i = 0
    while (i < oldK.length) {
      if (oldU(i)) update(oldK(i), oldV(i))
      i += 1
    }
  }
}
