package io.github.optical002.godot

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import io.github.optical002.godot.codegen.gdextensioninterface.codegen.types.Interface
import io.github.optical002.godot.codegen.gdextensioninterface.types.*

object GodotEntry {
  @exported("godot_scala_init")
  def godotScalaInit(
    getProcAddress: GDExtensionInterfaceGetProcAddress,
    library: GDExtensionClassLibraryPtr,
    r_initialization: Ptr[GDExtensionInitialization]
  ): CUnsignedChar = FileLogger.use("godot-init") { logger =>
    logger.log(
      "Starting Scala-Native language binding."
    )
    try {
      val interface = Interface.load(getProcAddress)
    } catch {
      case e: Exception => logger.log(e.toString)
    }

    1.toUByte // Success
  }
}
