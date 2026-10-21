package gdext.internal

/** Objects addressed by small integer tokens, for the C callbacks that carry a
  * token instead of a pointer. Lookup is an array index (no boxing, no hashing)
  * and freed tokens are reused, so the table stays as large as the peak number
  * of live entries. Token 0 is never issued (it reads as "null" across the C
  * boundary). Not thread-safe; the binding runs single-threaded.
  */
private[gdext] final class SlotTable[A <: AnyRef] {
  private var slots = new Array[AnyRef](64)
  private var free = new Array[Long](16)
  private var freeCount = 0
  private var next = 1L
  private var live = 0

  def size: Int = live

  def add(a: A): Long = {
    val token =
      if (freeCount > 0) { freeCount -= 1; free(freeCount) }
      else { val t = next; next += 1; t }
    if (token >= slots.length) {
      var n = slots.length * 2
      while (token >= n) n *= 2
      slots = java.util.Arrays.copyOf(slots, n)
    }
    slots(token.toInt) = a
    live += 1
    token
  }

  /** Point an issued `token` at `a` (re-binding an existing slot). */
  def put(token: Long, a: A): Unit = {
    if (token >= slots.length) {
      var n = slots.length * 2
      while (token >= n) n *= 2
      slots = java.util.Arrays.copyOf(slots, n)
    }
    if (slots(token.toInt) == null) live += 1
    slots(token.toInt) = a
    if (token >= next) next = token + 1
  }

  def apply(token: Long): A =
    if (token <= 0 || token >= slots.length) null.asInstanceOf[A]
    else slots(token.toInt).asInstanceOf[A]

  def remove(token: Long): A = {
    val a = apply(token)
    if (a != null) {
      slots(token.toInt) = null
      live -= 1
      if (freeCount == free.length)
        free = java.util.Arrays.copyOf(free, freeCount * 2)
      free(freeCount) = token
      freeCount += 1
    }
    a
  }

  def foreach(f: A => Unit): Unit = {
    var i = 1
    while (i < slots.length) {
      val a = slots(i)
      if (a != null) f(a.asInstanceOf[A])
      i += 1
    }
  }
}
