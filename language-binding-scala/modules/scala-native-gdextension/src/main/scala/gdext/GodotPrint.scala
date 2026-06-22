package gdext

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import gdext.builtin.*
import gdext.internal.ffi.types.*
import gdext.internal.ffi.types.GDExtensionVariantType.*

/**
 * Routes log/diagnostic output into Godot's own Output and error consoles,
 * instead of (or in addition to) a side file.
 *
 *  - [[print]] uses the engine `print` utility function — text lands in the
 *    editor Output panel / stdout, exactly like GDScript's `print()`.
 *  - [[printError]] / [[printWarning]] use the GDExtension `print_error` /
 *    `print_warning` calls, which show in the error console with file/line.
 *
 * All of these are safe to call only after the interface is loaded
 * ([[Godot.interface]]); before that they fall back to stdout so early-init
 * messages are never lost.
 */
object GodotPrint {

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
    // Build a String value, then a String-typed Variant from it, and invoke the
    // `print` utility with that single Variant argument.
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
