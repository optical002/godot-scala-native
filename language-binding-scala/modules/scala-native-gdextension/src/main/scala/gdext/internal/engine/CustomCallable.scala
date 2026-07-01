package gdext.internal.engine

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.atomic.AtomicLong

import gdext.Godot
import gdext.builtin.Callable
import gdext.internal.ffi.types.*
import gdext.internal.ffi.types.GDExtensionCallErrorType.*
import gdext.internal.register.Tokens

/**
 * Builds a Godot `Callable` backed by a Scala closure (a *custom* callable),
 * via the GDExtension `callable_custom_create2` interface. This lets game code
 * connect a signal to a lambda directly — no registered `@func` method and no
 * string method name.
 *
 * How the closure survives the FFI boundary: Scala Native `CFuncPtr`s must be
 * non-capturing, so the trampolines below are static and the closure lives in a
 * [[registry]] keyed by a generated `id`. That `id` is what we hand Godot as the
 * opaque `callable_userdata` pointer (packed via [[Tokens]], exactly like the
 * class/instance tokens — the GC never chases a fabricated pointer because the
 * closure is kept alive by the registry, not the pointer). Each trampoline reads
 * the id back to find its closure; `free_func` drops the registry entry when
 * Godot frees the Callable, so the closure is reachable for exactly as long as
 * the engine holds it.
 */
object CustomCallable {

  /** Live closures, keyed by the id we pass as `callable_userdata`. */
  private val registry = new ConcurrentHashMap[Long, () => Unit]()
  private val nextId = new AtomicLong(1L)

  // --- the static trampolines Godot calls (non-capturing) ------------------

  private val callFunc: GDExtensionCallableCustomCall =
    (
      userdata: CVoidPtr,
      _args: Ptr[GDExtensionConstVariantPtr],
      _argCount: GDExtensionInt,
      _rReturn: GDExtensionVariantPtr,
      rError: Ptr[GDExtensionCallError]
    ) => {
      val f = registry.get(Tokens.fromPtr(userdata))
      if (f != null) f()
      if (rError != null) !(!rError).at_error = GDEXTENSION_CALL_OK
    }

  private val isValidFunc: GDExtensionCallableCustomIsValid =
    (userdata: CVoidPtr) =>
      (if (registry.containsKey(Tokens.fromPtr(userdata))) 1 else 0).toUByte

  private val freeFunc: GDExtensionCallableCustomFree =
    (userdata: CVoidPtr) => { registry.remove(Tokens.fromPtr(userdata)); () }

  /**
   * Build a `Callable` invoking `f` into caller storage `dest` (at least
   * [[gdext.builtin.BuiltinSizes.Callable]] bytes). The returned Callable owns a
   * registry slot freed when Godot frees the Callable.
   */
  def of(f: () => Unit, dest: Ptr[Byte]): Callable = {
    val id = nextId.getAndIncrement()
    registry.put(id, f)

    val info = stackalloc[GDExtensionCallableCustomInfo2](1)
    // Zero the struct so every optional callback we don't set is null.
    val raw = info.asInstanceOf[Ptr[Byte]]
    var i = 0
    val n = sizeof[GDExtensionCallableCustomInfo2].toInt
    while (i < n) { raw(i) = 0.toByte; i += 1 }

    // Field-pointer writes, matching ClassRegistration's struct-fill idiom.
    !(!info).at_callable_userdata = Tokens.toPtr(id)
    !(!info).at_token = Godot.library.asInstanceOf[CVoidPtr]
    !(!info).at_object_id = 0.toULong
    !(!info).at_call_func = callFunc
    !(!info).at_is_valid_func = isValidFunc
    !(!info).at_free_func = freeFunc

    Godot.interface.callable_custom_create2(
      dest.asInstanceOf[GDExtensionUninitializedTypePtr],
      info
    )
    Callable.fromPtr(dest)
  }
}
