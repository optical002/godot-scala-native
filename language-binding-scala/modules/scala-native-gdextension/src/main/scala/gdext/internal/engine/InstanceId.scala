package gdext.internal.engine

/**
 * A Godot object's stable instance id — the Scala analogue of gdext's
 * `InstanceId`.
 *
 * Godot assigns every `Object` a process-unique, non-zero id that stays valid for
 * the object's lifetime. It is exposed over the C ABI as a `u64`; Godot has no
 * public accessor for the raw `u64`, only the `i64` form, so this type carries the
 * `i64` (a reinterpreted-but-lossless view of the same bits) and exposes it via
 * [[toI64]] / [[toLong]]. A zero value is the null/invalid sentinel.
 */
opaque type InstanceId = Long

object InstanceId:
  /** Wrap a raw `i64` instance id (as returned by `Object.get_instance_id`). */
  def fromI64(id: Long): InstanceId = id

  /** The null/invalid sentinel (id 0). */
  val none: InstanceId = 0L

  extension (self: InstanceId)
    /** The id as an `i64` (matches gdext's `InstanceId::to_i64`). */
    def toI64: Long = self

    /** The id as a `Long` (alias for [[toI64]]). */
    def toLong: Long = self

    /** True if this is the null/invalid sentinel. */
    def isNull: Boolean = self == 0L
