package gdext

import gdext.internal.ffi.interface.Interface
import gdext.internal.ffi.types.*

/**
 * Process-global access to the loaded GDExtension interface and the class
 * library handle.
 *
 * gdext keeps the resolved `sys` function table in a global; this is the
 * Scala-Native equivalent. Every wrapper (Variant, builtins, engine classes,
 * registration) reaches the engine through [[interface]] rather than threading
 * the table through every call site.
 *
 * The fields are set once from `godot_scala_init` and read for the remainder of
 * the process. The init callback runs single-threaded before any other Godot
 * thread touches the extension, so a plain `var` with no synchronization is
 * safe for the publish; later phases that spin up worker threads must revisit
 * this if they mutate it (they should not).
 */
private[gdext] object Godot {
  private var _interface: Interface = null
  private var _library: GDExtensionClassLibraryPtr = null

  /** The resolved GDExtension interface function table. */
  def interface: Interface = {
    if (_interface == null)
      throw new IllegalStateException(
        "Godot interface accessed before godot_scala_init ran"
      )
    _interface
  }

  /** The opaque class-library handle Godot passed to the entry point. */
  def library: GDExtensionClassLibraryPtr = _library

  /** True once the interface table has been loaded and is safe to call. */
  def isReady: Boolean = _interface != null

  private[gdext] def initialize(
    interface: Interface,
    library: GDExtensionClassLibraryPtr
  ): Unit = {
    _interface = interface
    _library = library
  }
}
