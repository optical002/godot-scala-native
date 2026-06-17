package game

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import io.github.optical002.godot.GodotEngine
import io.github.optical002.godot.codegen.gdextensioninterface.types.*
import io.github.optical002.godot.register.Register

/**
 * The game project's GDExtension entry point.
 *
 * Godot calls `godot_scala_init` (see demo/godot_scala.gdextension) when the
 * extension loads. We forward to the binding's [[GodotEngine.run]] with a
 * callback that registers the game's classes.
 *
 * NOTE on the one line per class: Scala Native dead-code-eliminates any class
 * not referenced from a reachable root and never runs module initializers at
 * library load, so genuinely self-registering classes (zero mentions) cannot
 * work here. Listing each class once via `Register.auto[T]()` is the minimal
 * reliable form — it both references the type (keeping it linked) and performs
 * the full annotation-driven registration. There is still no registration
 * *logic* in game code; only the class name, once.
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
      register = () => {
        Register.auto[Player]()
        // add more classes here, one line each: Register.auto[Enemy](), ...
      },
      selfTest = true
    )
}
