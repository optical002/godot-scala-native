package godot

import scala.scalanative.unsafe._
import scala.scalanative.unsigned._

object GodotEntry {
  @exported("godot_scala_init")
  def init(
    getProcAddress: Ptr[Byte],
    library: Ptr[Byte],
    init: Ptr[Byte]
  ): CUnsignedChar = {
      1.toUByte
  }
}
