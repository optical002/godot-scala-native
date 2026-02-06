package godot

object GodotEntry {
  @exported("godot_scala_init")
  def godotScalaInit(
    getProcAddressRaw: Ptr[Byte],
    libraryRaw: Ptr[Byte],
    initPtr: Ptr[Byte]
  ): CUnsignedChar = FileLogger.use("godot-init") { logger =>
    logger.log("Starting Scala-Native language binding.")
    
    
    
    1.toUByte // Success
  }
}
