package gdext

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import gdext.builtin.*
import gdext.internal.ffi.types.*
import gdext.internal.ffi.types.GDExtensionVariantType.*
import gdext.internal.engine.{ClassMeta, ObjectRef}
import gdext.internal.register.GodotScriptClass

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
  export gdext.internal.engine.InstanceId
  export gdext.internal.engine.{Tres, Tscn, Required}
  export gdext.internal.engine.{ResPath, ScenePath, FilePath}
  export gdext.internal.register.ExportHint
  export gdext.internal.Gc

  /** Emit a (currently no-arg) signal previously declared with `@signal`. */
  export gdext.internal.register.SignalRegistration.{emit as emitSignal}

  /**
   * The user-facing engine-glue facade. Holds object construction
   * ([[Gd.create]]) and logging ([[Gd.print]] / [[Gd.printError]] /
   * [[Gd.printWarning]]) — the one short handle game code reaches for. (The old
   * `Gd[T]` smart-pointer TYPE is gone: an engine object is now held as its plain
   * wrapper type, e.g. `Node2D`, and lifetime methods live directly on it.)
   */
  object Gd {

    /**
     * Construct a brand-new engine object of class `T`. A reference-counted
     * object (a `Resource`, a `RefCounted`) comes back owning its first
     * reference: release it with `unref()`, or create it inside [[scoped]]. If
     * `parent` is given, the new node is added as its child. Works for engine
     * and user classes.
     */
    def create[T <: GodotScriptClass](parent: Option[gdext.classes.Node] = None)(using
      ClassMeta[T]
    ): T = {
      val obj = ObjectRef.construct[T]
      parent match {
        case Some(p) if p != null && obj != null =>
          obj match {
            case n: gdext.classes.Node => p.addChild(n, false, 0L)
            case _                     => ()
          }
        case _ => ()
      }
      obj
    }

    /**
     * Run `body`, then release every `RefCounted` reference adopted inside it
     * (engine methods returning a `Ref<T>`, such as `ResourceLoader.load` or
     * `Resource.duplicate`, and `Gd.create` of a RefCounted class) that was not
     * kept with `keep()`. Released even if `body` throws. Blocks nest; a
     * reference belongs to the innermost one.
     *
     * {{{
     *   Gd.scoped {
     *     val tex = ResourceLoader.singleton.load(path, "", 0L)
     *     sprite.setTexture(tex)      // the sprite takes its own reference
     *   }                             // ours is released here
     * }}}
     */
    def scoped[A](body: => A): A = {
      val s = gdext.internal.engine.Ownership.enter()
      try body
      finally gdext.internal.engine.Ownership.exit(s)
    }

    /**
     * Wrap a raw engine-object handle (a [[gdext.internal.engine.GodotObject]],
     * e.g. one read from a Variant) as the typed wrapper `T`. Generated engine
     * methods already return typed wrappers. Identity-preserving (one wrapper
     * per engine object). Returns a `null` `T` for a null handle.
     */
    def wrap[T <: GodotScriptClass](o: gdext.internal.engine.GodotObject)(using
      meta: ClassMeta[T]
    ): T =
      import gdext.internal.engine.GodotObject.objectPtr
      meta.fromHandle(o.objectPtr)

    /**
     * Routes log/diagnostic output into Godot's own Output and error consoles.
     *  - [[print]] uses the engine `print` utility — text lands in the editor
     *    Output panel / stdout, like GDScript's `print()`.
     *  - [[printError]] / [[printWarning]] use the GDExtension `print_error` /
     *    `print_warning` calls (error console, with source tag).
     *
     * Safe to call before the interface is loaded ([[Godot.interface]]): they
     * fall back to stdout/stderr so early-init messages are never lost.
     */
    object Printing {
      // Engine `print` utility function (vararg). Hash from extension_api.json 4.6.1.
      private final val PrintHash = 2648703342L
      private var printFn: GDExtensionPtrUtilityFunction = null

      private def printUtility: GDExtensionPtrUtilityFunction = {
        if (printFn == null)
          printFn = Godot.interface.variant_get_ptr_utility_function(
            StringNames.cached("print").ptr,
            PrintHash
          )
        printFn
      }

      /** Print a line to Godot's Output panel (like GDScript `print`). */
      def print(msg: String): Unit = {
        if (!Godot.isReady) { System.out.println(msg); return }
        // Build a String value, then a String-typed Variant from it, and invoke
        // the `print` utility with that single Variant argument.
        val strBuf = stackalloc[Byte](BuiltinSizes.String.toCSize)
        val gstr = GString.from(msg, strBuf)
        val varBuf = stackalloc[Byte](BuiltinSizes.Variant.toCSize)
        val v = Variant.fromPtr(varBuf)
        VariantConstructors
          .fromType(GDEXTENSION_VARIANT_TYPE_STRING)(v.ptr, gstr.ptr)

        val args = stackalloc[GDExtensionConstTypePtr](1)
        args(0) = v.ptr
        printUtility(null, args, 1)

        v.destroy()
        gstr.destroy()
      }

      /** Report an error to Godot's error console. */
      def printError(msg: String): Unit = {
        if (!Godot.isReady) { System.err.println(s"[ERROR] $msg"); return }
        Zone.acquire { implicit z =>
          Godot.interface.print_error(
            toCString(msg),
            toCString(""),
            toCString("scala-native"),
            0,
            0.toUByte
          )
        }
      }

      /** Report a warning to Godot's error console. */
      def printWarning(msg: String): Unit = {
        if (!Godot.isReady) { System.err.println(s"[WARNING] $msg"); return }
        Zone.acquire { implicit z =>
          Godot.interface.print_warning(
            toCString(msg),
            toCString(""),
            toCString("scala-native"),
            0,
            0.toUByte
          )
        }
      }
    }

    // Surface the print methods directly on `Gd` (Gd.print / Gd.printError / …).
    export Printing.*
  }

  /**
   * Numeric helpers mirroring Godot's `@GlobalScope` math utilities, for game
   * code that wants the engine's exact semantics without an engine call.
   * Reached as `gdext.api.Math`.
   */
  object Math {

    /**
     * Godot's `move_toward`: step `from` toward `to` by at most `delta` (never
     * overshooting). Matches the engine's scalar `move_toward`.
     */
    def moveToward(from: Double, to: Double, delta: Double): Double =
      if (scala.math.abs(to - from) <= delta) to
      else from + scala.math.signum(to - from) * delta

    /** `Float` overload of [[moveToward]]. */
    def moveToward(from: Float, to: Float, delta: Float): Float =
      if (scala.math.abs(to - from) <= delta) to
      else from + scala.math.signum(to - from) * delta
  }

  // ---- Generated-glue surface (used by the auto-generated entry/registration)
  export gdext.internal.register.Register

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

    /** Install the engine-wrapper factory (generated by the build). Must run
      * before [[run]]. */
    def useEngineClasses(create: String => gdext.classes.Object): Unit =
      gdext.internal.engine.Wrappers.installFactory(create)

    /** A factory covering every engine class (links all ~1000 of them). Used
      * when the build's engine-class trimming is turned off. */
    def allEngineClasses(name: String): gdext.classes.Object =
      gdext.classes.ClassFactory.create(name).asInstanceOf[gdext.classes.Object]

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
