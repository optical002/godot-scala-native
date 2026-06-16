package io.github.optical002.godot

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import io.github.optical002.godot.codegen.gdextensioninterface.interface.Interface
import io.github.optical002.godot.codegen.gdextensioninterface.types.*
import io.github.optical002.godot.codegen.gdextensioninterface.types.GDExtensionInitializationLevel.*

object GodotEntry {

  /**
   * GDExtension entry point. Godot calls this once when the extension is
   * loaded (symbol name `godot_scala_init`, see demo/godot_scala.gdextension).
   *
   * We resolve the interface function table, publish it on [[Godot]], and fill
   * `r_initialization` with the minimum initialization level plus the
   * per-level initialize/deinitialize callbacks. Returning 0 would tell Godot
   * the extension failed to load.
   */
  @exported("godot_scala_init")
  def godotScalaInit(
    getProcAddress: GDExtensionInterfaceGetProcAddress,
    library: GDExtensionClassLibraryPtr,
    r_initialization: Ptr[GDExtensionInitialization]
  ): CUnsignedChar = {
    try {
      val interface = Interface.load(getProcAddress)
      Godot.initialize(interface, library)

      // Gameplay extensions register their classes at the SCENE level, which
      // is also when the SceneTree and node types become available. gdext
      // defaults here too. Editor-only/tool classes (Phase 5) will lower this.
      // Write through the field-pointer accessors so the assignments target
      // Godot's struct memory directly (no risk of mutating a local copy).
      !(!r_initialization).at_minimum_initialization_level =
        GDEXTENSION_INITIALIZATION_SCENE
      !(!r_initialization).at_userdata = null
      !(!r_initialization).at_initialize = GodotEntry.initialize
      !(!r_initialization).at_deinitialize = GodotEntry.deinitialize

      logInit("godot-init", "Scala-Native language binding initialized.")
      1.toUByte // Success
    } catch {
      case e: Throwable =>
        // Never let an exception unwind across the C ABI boundary back into
        // Godot. Report it and fail the load cleanly. (Phase 6 routes this to
        // Godot's print_error once the string helpers exist.)
        logInit("godot-init", s"Initialization failed: $e")
        0.toUByte // Failure
    }
  }

  /**
   * Per-level initialization callback. Godot invokes this once for each
   * initialization level up to `minimum_initialization_level`, in increasing
   * order. Class registration (Phase 4) hooks in here at the SCENE level.
   */
  private val initialize: GDExtensionInitializeCallback =
    (userdata: CVoidPtr, level: GDExtensionInitializationLevel) => {
      if (level == GDEXTENSION_INITIALIZATION_SCENE)
        logAppend("godot-init", "initialize(SCENE)")
    }

  /**
   * Per-level deinitialization callback, invoked in decreasing level order
   * when the extension is unloaded. Class deregistration / cleanup hooks here.
   */
  private val deinitialize: GDExtensionDeinitializeCallback =
    (userdata: CVoidPtr, level: GDExtensionInitializationLevel) => {
      if (level == GDEXTENSION_INITIALIZATION_SCENE)
        logAppend("godot-init", "deinitialize(SCENE)")
    }

  /** Truncating log used for the one-shot init line. */
  private def logInit(file: String, msg: String): Unit =
    FileLogger.use(file)(_.log(msg))

  /**
   * Append-mode log for the deferred init/deinit callbacks, which fire after
   * `godotScalaInit` has returned and its FileLogger has been closed.
   */
  private def logAppend(file: String, msg: String): Unit = {
    val w = new java.io.FileWriter(file, true)
    try w.write(s"$msg\n")
    finally w.close()
  }
}
