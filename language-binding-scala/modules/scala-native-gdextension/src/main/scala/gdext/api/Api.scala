package gdext

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*

/**
 * The binding's public API surface. Game code imports `gdext.api.*` for the
 * everyday helpers, alongside the three packages `gdext.classes` (engine
 * classes), `gdext.builtin` (builtin types) and `gdext.annotations` (the
 * registration annotations). Everything else under `gdext.*` is internal.
 *
 * This object also exposes the small "generated-glue" surface the build's
 * source generator targets — [[GodotEntry]], [[Register]] and the entry FFI
 * type aliases — so the generated entry point never names an internal package.
 */
object api {

  // ---- Everyday user-facing helpers (re-exported from their internal homes) --
  export gdext.GodotPrint
  export gdext.engine.Gd
  export gdext.engine.{Tres, Tscn, Required}
  export gdext.register.ExportHint

  /** Emit a (currently no-arg) signal previously declared with `@signal`. */
  export gdext.register.SignalRegistration.{emit as emitSignal}

  // ---- Generated-glue surface (used by the auto-generated entry/registration)
  export gdext.register.Register

  /** GDExtension entry-point FFI types, surfaced as public aliases so the
    * generated entry can name them without importing `gdext.internal.ffi`. */
  type EntryGetProcAddress = gdext.internal.ffi.types.GDExtensionInterfaceGetProcAddress
  type EntryClassLibraryPtr = gdext.internal.ffi.types.GDExtensionClassLibraryPtr
  type EntryInitialization  = gdext.internal.ffi.types.GDExtensionInitialization

  /**
   * The library's GDExtension bootstrap, called by the generated entry point.
   * A thin facade over the (internal) bootstrap so the heavy interface-loading
   * / init-struct / hot-reload machinery stays hidden in the library.
   */
  object GodotEntry {
    def run(
      getProcAddress: EntryGetProcAddress,
      library: EntryClassLibraryPtr,
      r_initialization: Ptr[EntryInitialization],
      register: () => Unit,
      selfTest: Boolean = false
    ): CUnsignedChar =
      gdext.GodotEngine.run(
        getProcAddress,
        library,
        r_initialization,
        register,
        selfTest
      )
  }
}
