package gdext

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import gdext.codegen.gdextensioninterface.interface.Interface
import gdext.codegen.gdextensioninterface.types.*
import gdext.codegen.gdextensioninterface.types.GDExtensionInitializationLevel.*

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
      Log.trace(s"GodotEngine.run: ENTER (selfTest=$selfTest)")
      registerClasses = register
      runSelfTests = selfTest

      val interface = Interface.load(getProcAddress)
      Log.trace("GodotEngine.run: interface loaded")
      Godot.initialize(interface, library)
      Log.trace("GodotEngine.run: Godot.initialize done")

      // Write through the field-pointer accessors so the assignments target
      // Godot's struct memory directly (no risk of mutating a local copy).
      !(!r_initialization).at_minimum_initialization_level =
        GDEXTENSION_INITIALIZATION_SCENE
      !(!r_initialization).at_userdata = null
      !(!r_initialization).at_initialize = initialize
      !(!r_initialization).at_deinitialize = deinitialize

      Log.fileReset("Scala-Native language binding initialized.")
      Log.trace("GodotEngine.run: EXIT success (callbacks registered)")
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
      Log.trace(s"initialize: ENTER level=${level.toInt}")
      if (level == GDEXTENSION_INITIALIZATION_SCENE) {
        Log.trace("initialize(SCENE): begin")
        if (runSelfTests && !selfTestsRan) {
          selfTestsRan = true
          Log.trace("initialize(SCENE): running self-tests")
          gdext.builtin.BuiltinSelfTest.run(Log.file)
          gdext.engine.EngineSelfTest.run(Log.file)
          gdext.engine.GdSelfTest.run(Log.file)
          Log.trace("initialize(SCENE): self-tests done")
        }
        Log.trace("initialize(SCENE): registerClasses() begin")
        registerClasses()
        Log.trace("initialize(SCENE): registerClasses() done")
        Log.file("registered game classes")

        // If this SCENE init replaced classes left over from a previous library
        // image, we just completed an editor hot-reload. Announce it on the
        // Output panel, timing the full "library swap → extension live" latency
        // via the stamp the sbt `build` task drops right after the atomic swap.
        val wasReload = gdext.register.ClassRegistration
          .consumeReloadDetected()
        Log.trace(s"initialize(SCENE): consumeReloadDetected=$wasReload")
        if (wasReload) {
          val suffix = reloadElapsedMs() match {
            case Some(ms) => s" in $ms ms"
            case None     => "" // stamp missing/unreadable — report without timing
          }
          Log.trace(s"initialize(SCENE): about to GodotPrint hot-reload complete$suffix")
          GodotPrint.print(s"[scala-native] hot-reload complete$suffix")
          Log.trace("initialize(SCENE): GodotPrint hot-reload complete returned")
          Log.file(s"hot-reload complete$suffix")
        }
        Log.trace("initialize(SCENE): end")
      } else if (level == GDEXTENSION_INITIALIZATION_EDITOR) {
        // Editor-only: install the inspector plugin for typed scene exports.
        // Reached only when Godot runs as the editor (not in a game run).
        Log.trace("initialize(EDITOR): begin")
        gdext.register.editor.EditorIntegration
          .registerAtEditorLevel()
        Log.trace("initialize(EDITOR): end")
      } else {
        Log.trace(s"initialize: level ${level.toInt} (no-op)")
      }
      Log.trace(s"initialize: EXIT level=${level.toInt}")
    }

  // Name of the file the sbt `build` task stamps (epoch millis) right after it
  // atomically swaps the new `.so` in. Read relative to Godot's working
  // directory, mirroring the binding's `godot-init` log convention.
  private final val ReloadStampFile = "reload.stamp"

  /**
   * Milliseconds elapsed since the library `.so` was swapped in, or `None` if
   * the stamp is absent/unreadable. The stamp is consumed (deleted) on read so
   * it measures exactly one reload. Never throws — timing is best-effort.
   */
  private def reloadElapsedMs(): Option[Long] =
    try {
      Log.trace("reloadElapsedMs: begin")
      val f = new java.io.File(ReloadStampFile)
      if (!f.exists()) { Log.trace("reloadElapsedMs: stamp absent"); None }
      else {
        val stamp =
          new String(java.nio.file.Files.readAllBytes(f.toPath)).trim.toLong
        f.delete()
        Some(System.currentTimeMillis() - stamp)
      }
    } catch { case _: Throwable => None }

  private val deinitialize: GDExtensionDeinitializeCallback =
    (userdata: CVoidPtr, level: GDExtensionInitializationLevel) => {
      Log.trace(s"deinitialize: level=${level.toInt}")
      if (level == GDEXTENSION_INITIALIZATION_SCENE) {
        // Unregister this (old) image's classes as part of its teardown — the
        // standard GDExtension reload protocol. Timestamped reload logs confirm
        // the old image fully deinitializes BEFORE the new image's `run`/
        // `initialize` (no interleaving), so this does not race the new
        // registration. Cleaning up here gives Godot a well-formed
        // unregister(old) -> register(new) -> recreate_instance(new) handoff;
        // without it the live editor instances are never rebound and inspecting
        // them after a reload freezes the editor.
        Log.trace("deinitialize(SCENE): unregisterAll begin")
        gdext.register.ClassRegistration.unregisterAll()
        // Drop comp-dropdown builders so the reloaded image rebuilds them fresh.
        gdext.register.CompEnumRegistry.clear()
        Log.trace("deinitialize(SCENE): unregisterAll done")
        Log.file("deinitialize(SCENE)")
      }
    }
}
