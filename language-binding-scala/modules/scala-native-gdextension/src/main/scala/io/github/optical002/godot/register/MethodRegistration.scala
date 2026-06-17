package io.github.optical002.godot.register

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import scala.scalanative.libc.stdlib
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.atomic.AtomicLong
import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.codegen.gdextensioninterface.types.*
import io.github.optical002.godot.codegen.gdextensioninterface.types.GDExtensionClassMethodFlags.*

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

  /** A registered method's runtime dispatch over raw Variant pointers. */
  private type Dispatch =
    (GodotScriptClass, Ptr[GDExtensionConstVariantPtr], Long, GDExtensionVariantPtr) => Unit

  private val methods = new ConcurrentHashMap[Long, Dispatch]()
  private val methodIds = new AtomicLong(1L)

  /** A getter: `() => A`, exposed as a no-arg method returning `A`. */
  def registerGetter[A](
    className: String,
    methodName: String,
    get: GodotScriptClass => A
  )(using tv: ToVariant[A], vt: VariantTypeOf[A]): Unit =
    register(
      className,
      methodName,
      argTypes = Nil,
      returnType = Some(vt.variantType),
      dispatch = (inst, _args, _n, rRet) => tv.toVariant(get(inst), rRet)
    )

  /** A setter: `A => Unit`, exposed as a 1-arg void method. */
  def registerSetter[A](
    className: String,
    methodName: String,
    set: (GodotScriptClass, A) => Unit
  )(using fv: FromVariant[A], vt: VariantTypeOf[A]): Unit =
    register(
      className,
      methodName,
      argTypes = List(vt.variantType),
      returnType = None,
      dispatch = (inst, args, _n, _rRet) => set(inst, fv.fromVariant(args(0)))
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
      dispatch = (inst, _args, _n, rRet) => {
        io.github.optical002.godot.Log.trace(s"EXPORT-GET: $className.$methodName begin")
        et.toVariant(get(inst), rRet)
        io.github.optical002.godot.Log.trace(s"EXPORT-GET: $className.$methodName done")
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
      dispatch = (inst, args, _n, _rRet) => {
        io.github.optical002.godot.Log.trace(s"EXPORT-SET: $className.$methodName begin")
        set(inst, et.fromVariant(args(0)))
        io.github.optical002.godot.Log.trace(s"EXPORT-SET: $className.$methodName done")
      }
    )

  // --- core registration --------------------------------------------------

  private def register(
    className: String,
    methodName: String,
    argTypes: List[GDExtensionVariantType],
    returnType: Option[GDExtensionVariantType],
    dispatch: Dispatch
  ): Unit = {
    val methodToken = methodIds.getAndIncrement()
    methods.put(methodToken, dispatch)

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

    io.github.optical002.godot.Log.trace(
      s"registerMethod: $className.$methodName (token=$methodToken, args=${argTypes.size}, hasReturn=${returnType.isDefined})"
    )
    Godot.interface.classdb_register_extension_class_method(
      Godot.library,
      StringNames.cached(className).ptr,
      info
    )
  }

  private val callTrampoline: GDExtensionClassMethodCall =
    (
      methodUserdata: CVoidPtr,
      instance: GDExtensionClassInstancePtr,
      args: Ptr[GDExtensionConstVariantPtr],
      argCount: GDExtensionInt,
      rReturn: GDExtensionVariantPtr,
      _rError: Ptr[GDExtensionCallError]
    ) => {
      val instTok = Tokens.fromPtr(instance)
      val mTok = Tokens.fromPtr(methodUserdata)
      val scala = ClassRegistry.instanceFor(instTok)
      val dispatch = methods.get(mTok)
      io.github.optical002.godot.Log.trace(
        s"callTrampoline: ENTER methodToken=$mTok instToken=$instTok argc=$argCount " +
          s"scala=${if (scala == null) "null" else scala.getClass.getSimpleName} dispatch=${if (dispatch == null) "null" else "ok"}"
      )
      if (scala != null && dispatch != null)
        dispatch(scala, args, argCount.toLong, rReturn)
      io.github.optical002.godot.Log.trace(s"callTrampoline: EXIT methodToken=$mTok instToken=$instTok")
    }

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
}
