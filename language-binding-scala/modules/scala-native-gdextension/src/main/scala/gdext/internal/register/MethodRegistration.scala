package gdext.internal.register

import gdext.internal.StringNames
import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import scala.scalanative.libc.stdlib
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.atomic.AtomicLong
import gdext.Godot
import gdext.builtin.*
import gdext.internal.ffi.types.*
import gdext.internal.Addr
import gdext.builtin.VariantIO
import gdext.internal.engine.Wrappers
import gdext.internal.ffi.types.GDExtensionClassMethodFlags.*

/**
 * Registers Scala methods on a registered class so they are callable from
 * GDScript / the engine (the `#[func]` analogue), and provides the getter/
 * setter methods that property (`@export`) registration links together.
 *
 * Dispatch goes through the Variant `call_func` path: the trampoline finds the
 * instance and the method dispatcher by their tokens, then invokes the
 * dispatcher with the raw argument Variants and the return Variant slot. A
 * dispatcher reads its args via the Phase 1 [[FromVariant]] seam and writes its
 * result via [[ToVariant]]. All argument/return marshalling reuses that seam,
 * so any builtin-convertible type is supported.
 */
object MethodRegistration {

  /**
   * A registered method's runtime dispatch over raw Variant storage. The
   * argument array and return slot arrive as `Long` addresses (see
   * [[gdext.internal.Addr]]), so a call boxes nothing.
   */
  abstract class Dispatch {
    def apply(inst: GodotScriptClass, args: Long, argCount: Long, ret: Long): Unit
  }

  private val methods = new gdext.internal.SlotTable[Dispatch]

  /** The address of the `i`-th argument Variant. */
  inline def argAt(args: Long, i: Int): Long =
    !Addr.ptr[Long](args + i * 8L)

  /**
   * Getter dispatch: primitives are written straight into the return Variant
   * (no boxing); any other type goes through its [[ToVariant]].
   */
  inline def getterDispatch[A](inline get: GodotScriptClass => A)(using
    tv: ToVariant[A]
  ): Dispatch =
    inline scala.compiletime.erasedValue[A] match {
      case _: Long =>
        new Dispatch {
          def apply(inst: GodotScriptClass, a: Long, n: Long, ret: Long) =
            VariantIO.writeLong(ret, get(inst).asInstanceOf[Long])
        }
      case _: Int =>
        new Dispatch {
          def apply(inst: GodotScriptClass, a: Long, n: Long, ret: Long) =
            VariantIO.writeLong(ret, get(inst).asInstanceOf[Int].toLong)
        }
      case _: Double =>
        new Dispatch {
          def apply(inst: GodotScriptClass, a: Long, n: Long, ret: Long) =
            VariantIO.writeDouble(ret, get(inst).asInstanceOf[Double])
        }
      case _: Float =>
        new Dispatch {
          def apply(inst: GodotScriptClass, a: Long, n: Long, ret: Long) =
            VariantIO.writeDouble(ret, get(inst).asInstanceOf[Float].toDouble)
        }
      case _: Boolean =>
        new Dispatch {
          def apply(inst: GodotScriptClass, a: Long, n: Long, ret: Long) =
            VariantIO.writeBool(ret, get(inst).asInstanceOf[Boolean])
        }
      case _ =>
        new Dispatch {
          def apply(inst: GodotScriptClass, a: Long, n: Long, ret: Long) =
            tv.toVariant(get(inst), Addr.ptr[Byte](ret))
        }
    }

  /** Setter dispatch: the counterpart of [[getterDispatch]] for argument 0. */
  inline def setterDispatch[A](inline set: (GodotScriptClass, A) => Unit)(using
    fv: FromVariant[A]
  ): Dispatch =
    inline scala.compiletime.erasedValue[A] match {
      case _: Long =>
        new Dispatch {
          def apply(inst: GodotScriptClass, a: Long, n: Long, ret: Long) =
            set(inst, VariantIO.readLong(argAt(a, 0)).asInstanceOf[A])
        }
      case _: Int =>
        new Dispatch {
          def apply(inst: GodotScriptClass, a: Long, n: Long, ret: Long) =
            set(inst, VariantIO.readLong(argAt(a, 0)).toInt.asInstanceOf[A])
        }
      case _: Double =>
        new Dispatch {
          def apply(inst: GodotScriptClass, a: Long, n: Long, ret: Long) =
            set(inst, VariantIO.readDouble(argAt(a, 0)).asInstanceOf[A])
        }
      case _: Float =>
        new Dispatch {
          def apply(inst: GodotScriptClass, a: Long, n: Long, ret: Long) =
            set(inst, VariantIO.readDouble(argAt(a, 0)).toFloat.asInstanceOf[A])
        }
      case _: Boolean =>
        new Dispatch {
          def apply(inst: GodotScriptClass, a: Long, n: Long, ret: Long) =
            set(inst, VariantIO.readBool(argAt(a, 0)).asInstanceOf[A])
        }
      case _ =>
        new Dispatch {
          def apply(inst: GodotScriptClass, a: Long, n: Long, ret: Long) =
            set(inst, fv.fromVariant(Addr.ptr[Byte](argAt(a, 0))))
        }
    }

  /** A getter: `() => A`, exposed as a no-arg method returning `A`. */
  inline def registerGetter[A](
    className: String,
    methodName: String,
    inline get: GodotScriptClass => A
  )(using tv: ToVariant[A], vt: VariantTypeOf[A]): Unit =
    register(
      className,
      methodName,
      argTypes = Nil,
      returnType = Some(vt.variantType),
      dispatch = getterDispatch[A](get)
    )

  /** A setter: `A => Unit`, exposed as a 1-arg void method. */
  inline def registerSetter[A](
    className: String,
    methodName: String,
    inline set: (GodotScriptClass, A) => Unit
  )(using fv: FromVariant[A], vt: VariantTypeOf[A]): Unit =
    register(
      className,
      methodName,
      argTypes = List(vt.variantType),
      returnType = None,
      dispatch = setterDispatch[A](set)
    )

  /** Getter backed by an [[ExportType]] (covers object/enum/dict exports). */
  def registerExportGetter[A](
    className: String,
    methodName: String,
    get: GodotScriptClass => A
  )(using et: ExportType[A]): Unit =
    register(
      className,
      methodName,
      argTypes = Nil,
      returnType = Some(et.variantType),
      dispatch = new Dispatch {
        def apply(inst: GodotScriptClass, a: Long, n: Long, ret: Long) =
          et.toVariantAt(get(inst), ret)
      }
    )

  /** Setter backed by an [[ExportType]]. */
  def registerExportSetter[A](
    className: String,
    methodName: String,
    set: (GodotScriptClass, A) => Unit
  )(using et: ExportType[A]): Unit =
    register(
      className,
      methodName,
      argTypes = List(et.variantType),
      returnType = None,
      dispatch = new Dispatch {
        def apply(inst: GodotScriptClass, a: Long, n: Long, ret: Long) =
          set(inst, et.fromVariantAt(argAt(a, 0)))
      }
    )

  /**
   * A no-argument, void "action" method — e.g. a signal handler bound via a
   * [[gdext.builtin.Callable]] (`Callable(object, name)`).
   * When the engine invokes it, `action` runs with the live Scala instance.
   */
  def registerAction(
    className: String,
    methodName: String,
    action: GodotScriptClass => Unit
  ): Unit =
    register(
      className,
      methodName,
      argTypes = Nil,
      returnType = None,
      dispatch = new Dispatch {
        def apply(inst: GodotScriptClass, a: Long, n: Long, ret: Long) =
          action(inst)
      }
    )

  // --- core registration --------------------------------------------------

  private[register] def register(
    className: String,
    methodName: String,
    argTypes: List[GDExtensionVariantType],
    returnType: Option[GDExtensionVariantType],
    dispatch: Dispatch
  ): Unit = {
    val methodToken = methods.add(dispatch)

    // Allocate with the concrete struct size. NOTE: do NOT route this through a
    // generic `malloc(sizeof[T])` helper — inside a generic, `sizeof[T]` does
    // not pick up the opaque type's Tag and under-allocates, so Godot reads out
    // of bounds and crashes. Use the concrete sizeof here.
    val infoSize = sizeof[GDExtensionClassMethodInfo]
    val info =
      stdlib.malloc(infoSize).asInstanceOf[Ptr[GDExtensionClassMethodInfo]]
    zeroBytes(info.asInstanceOf[Ptr[Byte]], infoSize.toInt)

    // Write through the field-pointer accessors so the writes land in the
    // malloc'd struct (dereferencing `!info` and assigning may target a copy).
    !(!info).at_name = StringNames.cached(methodName).ptr
    !(!info).at_method_userdata = Tokens.toPtr(methodToken)
    !(!info).at_call_func = callTrampoline
    !(!info).at_ptrcall_func = null.asInstanceOf[GDExtensionClassMethodPtrCall]
    !(!info).at_method_flags = GDEXTENSION_METHOD_FLAG_NORMAL.toUInt

    returnType.foreach { rt =>
      !(!info).at_has_return_value = 1.toUByte
      !(!info).at_return_value_info = propertyInfo(rt, "")
    }

    !(!info).at_argument_count = argTypes.size.toUInt
    if (argTypes.nonEmpty) {
      val count = argTypes.size
      val piBytes = sizeof[GDExtensionPropertyInfo].toLong * count
      val argArr = stdlib
        .malloc(piBytes)
        .asInstanceOf[Ptr[GDExtensionPropertyInfo]]
      argTypes.zipWithIndex.foreach { case (t, i) =>
        fillPropertyInfo(argArr + i, t, s"arg$i")
      }
      !(!info).at_arguments_info = argArr

      // arguments_metadata is "an array of size argument_count"; Godot reads it,
      // so provide a zeroed (NONE) metadata entry per argument.
      val metaBytes =
        sizeof[GDExtensionClassMethodArgumentMetadata].toLong * count
      val metaArr = stdlib
        .malloc(metaBytes)
        .asInstanceOf[Ptr[GDExtensionClassMethodArgumentMetadata]]
      zeroBytes(metaArr.asInstanceOf[Ptr[Byte]], metaBytes.toInt)
      !(!info).at_arguments_metadata = metaArr
    }

    gdext.Log.trace(
      s"registerMethod: $className.$methodName (token=$methodToken, args=${argTypes.size}, hasReturn=${returnType.isDefined})"
    )
    Godot.interface.classdb_register_extension_class_method(
      Godot.library,
      StringNames.cached(className).ptr,
      info
    )
  }

  // The method-call callback is an `@exported` method taking its pointer
  // parameters as `Long` addresses; `gdext_trampolines.c` supplies its
  // address. A CFuncPtr made from a lambda would box every parameter on every
  // call.
  @exported("gdext_scala_method_call")
  def methodCallExport(
    methodUserdata: Long,
    instance: Long,
    args: Long,
    argCount: Long,
    rReturn: Long,
    rError: Long
  ): Unit = {
    val scala = ClassRegistry.instanceFor(instance)
    val dispatch = methods(methodUserdata)
    gdext.Log.trace(
      s"callTrampoline: methodToken=$methodUserdata instToken=$instance argc=$argCount " +
        s"scala=${if (scala == null) "null" else scala.getClass.getSimpleName} dispatch=${if (dispatch == null) "null" else "ok"}"
    )
    if (scala != null && dispatch != null)
      dispatch(scala, args, argCount, rReturn)
  }

  private lazy val callTrampoline: GDExtensionClassMethodCall =
    CFuncPtr.fromPtr[GDExtensionClassMethodCall](TrampolineAddrs.methodCall())

  // --- helpers ------------------------------------------------------------

  private[register] def propertyInfo(
    t: GDExtensionVariantType,
    name: String,
    hint: Int = PropertyHint.None,
    hintString: String = "",
    className: String = "",
    usage: Int = PropertyUsage.Default
  ): Ptr[GDExtensionPropertyInfo] = {
    val pi = stdlib
      .malloc(sizeof[GDExtensionPropertyInfo])
      .asInstanceOf[Ptr[GDExtensionPropertyInfo]]
    fillPropertyInfo(pi, t, name, hint, hintString, className, usage)
    pi
  }

  /** Populate a (caller-allocated) PropertyInfo via field-pointer writes. */
  private def fillPropertyInfo(
    pi: Ptr[GDExtensionPropertyInfo],
    t: GDExtensionVariantType,
    name: String,
    hint: Int = PropertyHint.None,
    hintString: String = "",
    className: String = "",
    usage: Int = PropertyUsage.Default
  ): Unit = {
    zeroBytes(pi.asInstanceOf[Ptr[Byte]], sizeof[GDExtensionPropertyInfo].toInt)
    !(!pi).at__type = t
    !(!pi).at_name = StringNames.cached(name).ptr
    !(!pi).at_class_name = StringNames.cached(className).ptr
    !(!pi).at_hint = hint.toUInt
    !(!pi).at_hint_string = heapGString(hintString)
    !(!pi).at_usage = usage.toUInt
  }

  /** A heap GString handle holding `s` (PropertyInfo wants a String hint). */
  private[register] def heapGString(s: String): GDExtensionStringPtr = {
    val buf = stdlib.malloc(BuiltinSizes.String.toCSize)
    GString.from(s, buf)
    buf
  }

  private def zeroBytes(p: Ptr[Byte], n: Int): Unit = {
    var i = 0
    while (i < n) { p(i) = 0.toByte; i += 1 }
  }
}

/** Maps a Scala type to its Godot Variant type tag, for registration info. */
trait VariantTypeOf[A] {
  def variantType: GDExtensionVariantType
}
object VariantTypeOf {
  import GDExtensionVariantType.*
  given VariantTypeOf[Long] with { def variantType = GDEXTENSION_VARIANT_TYPE_INT }
  given VariantTypeOf[Int] with { def variantType = GDEXTENSION_VARIANT_TYPE_INT }
  given VariantTypeOf[Double] with { def variantType = GDEXTENSION_VARIANT_TYPE_FLOAT }
  given VariantTypeOf[Boolean] with { def variantType = GDEXTENSION_VARIANT_TYPE_BOOL }
  given VariantTypeOf[String] with { def variantType = GDEXTENSION_VARIANT_TYPE_STRING }
}
