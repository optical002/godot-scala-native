package game

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import io.github.optical002.godot.GodotEngine
import io.github.optical002.godot.codegen.gdextensioninterface.types.*

/**
 * The game project's GDExtension entry point.
 *
 * Godot calls `godot_scala_init` (see godot/godot_scala.gdextension) when the
 * extension loads. We forward to the binding's [[GodotEngine.run]].
 *
 * Set up once, never touched again. Adding or removing a game class requires NO
 * edit here: class registration is fully handled by the framework. A build-time
 * source generator scans the game sources and emits `GeneratedRegistrations`,
 * which lists one `Register.auto[T]()` per discovered class; we just call
 * `registerAll()`.
 *
 * Why discovery is at build time, not runtime: Scala Native dead-code-eliminates
 * any class not referenced from a reachable root and never runs module
 * initializers at library load, so classes cannot self-register at runtime. The
 * generated `Register.auto[T]()` calls are what keep each class linked and
 * perform its annotation-driven registration.
 */
object GameEntry {
  @exported("godot_scala_init")
  def godotScalaInit(
    getProcAddress: GDExtensionInterfaceGetProcAddress,
    library: GDExtensionClassLibraryPtr,
    r_initialization: Ptr[GDExtensionInitialization]
  ): CUnsignedChar =
    GodotEngine.run(
      getProcAddress,
      library,
      r_initialization,
      register = () => GeneratedRegistrations.registerAll(),
      selfTest = true
    )
}
