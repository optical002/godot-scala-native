package io.github.optical002.godot

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import io.github.optical002.godot.codegen.gdextensioninterface.interface.Interface
import io.github.optical002.godot.codegen.gdextensioninterface.types.*
import io.github.optical002.godot.codegen.gdextensioninterface.types.GDExtensionInitializationLevel.*

/**
 * Reusable GDExtension bootstrap provided by the binding library.
 *
 * A consumer module (the user's game project) owns the actual
 * `@exported("godot_scala_init")` entry symbol and the dynamic-library build
 * target; it simply forwards the three entry-point arguments to [[run]] along
 * with a callback that registers the user's classes. This keeps all the
 * interface-loading, init-struct, self-test and hot-reload machinery here in
 * the library while letting the game project decide *what* to register.
 *
 * Registration runs at the SCENE initialization level (when the SceneTree and
 * node types are available) and is re-run on each hot-reload; the registration
 * APIs are reload-safe (see ClassRegistration).
 */
object GodotEngine {

  // The game project's class-registration callback. Stored statically because
  // the per-level `initialize` callback below is a CFuncPtr and cannot capture
  // closures — it reads this field instead.
  private var registerClasses: () => Unit = () => ()

  // Guards the one-time self-tests so a hot-reload's repeated SCENE-init does
  // not re-run (and re-spam) them.
  private var selfTestsRan = false

  /** Optional library self-tests, run once on first SCENE init. */
  private var runSelfTests: Boolean = false

  /**
   * Bootstrap the extension. Call this from the game project's exported entry
   * point, passing a callback that registers the game's classes.
   *
   * @param register invoked at SCENE init (and on each hot-reload) to register
   *                 the game's classes
   * @param selfTest if true, run the binding's internal self-tests once
   */
  def run(
    getProcAddress: GDExtensionInterfaceGetProcAddress,
    library: GDExtensionClassLibraryPtr,
    r_initialization: Ptr[GDExtensionInitialization],
    register: () => Unit,
    selfTest: Boolean = false
  ): CUnsignedChar = {
    try {
      registerClasses = register
      runSelfTests = selfTest

      val interface = Interface.load(getProcAddress)
      Godot.initialize(interface, library)

      // Write through the field-pointer accessors so the assignments target
      // Godot's struct memory directly (no risk of mutating a local copy).
      !(!r_initialization).at_minimum_initialization_level =
        GDEXTENSION_INITIALIZATION_SCENE
      !(!r_initialization).at_userdata = null
      !(!r_initialization).at_initialize = initialize
      !(!r_initialization).at_deinitialize = deinitialize

      Log.fileReset("Scala-Native language binding initialized.")
      1.toUByte // Success
    } catch {
      case e: Throwable =>
        // Never let an exception unwind across the C ABI boundary back into
        // Godot. Report it to Godot's error console and the binding log file.
        if (Godot.isReady) Log.error(s"Initialization failed: $e")
        Log.fileReset(s"[ERROR] Initialization failed: $e")
        0.toUByte // Failure
    }
  }

  private val initialize: GDExtensionInitializeCallback =
    (userdata: CVoidPtr, level: GDExtensionInitializationLevel) => {
      if (level == GDEXTENSION_INITIALIZATION_SCENE) {
        Log.file("initialize(SCENE)")
        if (runSelfTests && !selfTestsRan) {
          selfTestsRan = true
          io.github.optical002.godot.builtin.BuiltinSelfTest.run(Log.file)
          io.github.optical002.godot.engine.EngineSelfTest.run(Log.file)
          io.github.optical002.godot.engine.GdSelfTest.run(Log.file)
        }
        registerClasses()
        Log.file("registered game classes")
      }
    }

  private val deinitialize: GDExtensionDeinitializeCallback =
    (userdata: CVoidPtr, level: GDExtensionInitializationLevel) => {
      if (level == GDEXTENSION_INITIALIZATION_SCENE) {
        // NOTE: we deliberately do NOT unregister classes here. On an editor
        // hot-reload the new library image initializes before the old one is
        // deinitialized, so a deinit-side unregister races the new image's
        // registration and produces "unregister unexisting" errors. Instead,
        // registration is made reload-safe on the init side: `register` probes
        // ClassDB and unregisters any stale copy before re-registering.
        Log.file("deinitialize(SCENE)")
      }
    }
}
