
package godot.codegen.gdextensioninterface.codegen.types

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import scala.scalanative.unsigned.UInt.*
import godot.types.*
import godot.codegen.gdextensioninterface.types.*


/**
 * Gets the Godot version that the GDExtension was loaded into.
 *
 * @deprecated Since 4.5. Use get_godot_version2 instead.
 */
opaque type GDExtensionInterfaceGetGodotVersion = CFuncPtr1[
  Ptr[GDExtensionGodotVersion],
  Unit
]
object GDExtensionInterfaceGetGodotVersion {
  given Tag[GDExtensionInterfaceGetGodotVersion] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceGetGodotVersion]]

  extension (func: GDExtensionInterfaceGetGodotVersion) {
    def apply(
      r_godot_version: Ptr[GDExtensionGodotVersion]
    ): Unit = func(r_godot_version)
  } 
}

/**
 * Gets the Godot version that the GDExtension was loaded into.
 */
opaque type GDExtensionInterfaceGetGodotVersion2 = CFuncPtr1[
  Ptr[GDExtensionGodotVersion2],
  Unit
]
object GDExtensionInterfaceGetGodotVersion2 {
  given Tag[GDExtensionInterfaceGetGodotVersion2] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceGetGodotVersion2]]

  extension (func: GDExtensionInterfaceGetGodotVersion2) {
    def apply(
      r_godot_version: Ptr[GDExtensionGodotVersion2]
    ): Unit = func(r_godot_version)
  } 
}

/**
 * Allocates memory.
 *
 * @deprecated Since 4.6. Use mem_alloc2 instead.
 */
opaque type GDExtensionInterfaceMemAlloc = CFuncPtr1[
  CSize,
  CVoidPtr
]
object GDExtensionInterfaceMemAlloc {
  given Tag[GDExtensionInterfaceMemAlloc] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceMemAlloc]]

  extension (func: GDExtensionInterfaceMemAlloc) {
    def apply(
      p_bytes: CSize
    ): CVoidPtr = func(p_bytes)
  } 
}

/**
 * Reallocates memory.
 *
 * @deprecated Since 4.6. Use mem_realloc2 instead.
 */
opaque type GDExtensionInterfaceMemRealloc = CFuncPtr2[
  CVoidPtr,
  CSize,
  CVoidPtr
]
object GDExtensionInterfaceMemRealloc {
  given Tag[GDExtensionInterfaceMemRealloc] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceMemRealloc]]

  extension (func: GDExtensionInterfaceMemRealloc) {
    def apply(
      p_ptr: CVoidPtr,
      p_bytes: CSize
    ): CVoidPtr = func(p_ptr, p_bytes)
  } 
}

/**
 * Frees memory.
 *
 * @deprecated Since 4.6. Use mem_free2 instead.
 */
opaque type GDExtensionInterfaceMemFree = CFuncPtr1[
  CVoidPtr,
  Unit
]
object GDExtensionInterfaceMemFree {
  given Tag[GDExtensionInterfaceMemFree] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceMemFree]]

  extension (func: GDExtensionInterfaceMemFree) {
    def apply(
      p_ptr: CVoidPtr
    ): Unit = func(p_ptr)
  } 
}

/**
 * Allocates memory.
 */
opaque type GDExtensionInterfaceMemAlloc2 = CFuncPtr2[
  CSize,
  GDExtensionBool,
  CVoidPtr
]
object GDExtensionInterfaceMemAlloc2 {
  given Tag[GDExtensionInterfaceMemAlloc2] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceMemAlloc2]]

  extension (func: GDExtensionInterfaceMemAlloc2) {
    def apply(
      p_bytes: CSize,
      p_pad_align: GDExtensionBool
    ): CVoidPtr = func(p_bytes, p_pad_align)
  } 
}

/**
 * Reallocates memory.
 */
opaque type GDExtensionInterfaceMemRealloc2 = CFuncPtr3[
  CVoidPtr,
  CSize,
  GDExtensionBool,
  CVoidPtr
]
object GDExtensionInterfaceMemRealloc2 {
  given Tag[GDExtensionInterfaceMemRealloc2] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceMemRealloc2]]

  extension (func: GDExtensionInterfaceMemRealloc2) {
    def apply(
      p_ptr: CVoidPtr,
      p_bytes: CSize,
      p_pad_align: GDExtensionBool
    ): CVoidPtr = func(p_ptr, p_bytes, p_pad_align)
  } 
}

/**
 * Frees memory.
 */
opaque type GDExtensionInterfaceMemFree2 = CFuncPtr2[
  CVoidPtr,
  GDExtensionBool,
  Unit
]
object GDExtensionInterfaceMemFree2 {
  given Tag[GDExtensionInterfaceMemFree2] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceMemFree2]]

  extension (func: GDExtensionInterfaceMemFree2) {
    def apply(
      p_ptr: CVoidPtr,
      p_pad_align: GDExtensionBool
    ): Unit = func(p_ptr, p_pad_align)
  } 
}

/**
 * Logs an error to Godot's built-in debugger and to the OS terminal.
 */
opaque type GDExtensionInterfacePrintError = CFuncPtr5[
  ConstPtr[CChar],
  ConstPtr[CChar],
  ConstPtr[CChar],
  CInt,
  GDExtensionBool,
  Unit
]
object GDExtensionInterfacePrintError {
  given Tag[GDExtensionInterfacePrintError] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfacePrintError]]

  extension (func: GDExtensionInterfacePrintError) {
    def apply(
      p_description: ConstPtr[CChar],
      p_function: ConstPtr[CChar],
      p_file: ConstPtr[CChar],
      p_line: CInt,
      p_editor_notify: GDExtensionBool
    ): Unit = func(p_description, p_function, p_file, p_line, p_editor_notify)
  } 
}

/**
 * Logs an error with a message to Godot's built-in debugger and to the OS terminal.
 */
opaque type GDExtensionInterfacePrintErrorWithMessage = CFuncPtr6[
  ConstPtr[CChar],
  ConstPtr[CChar],
  ConstPtr[CChar],
  ConstPtr[CChar],
  CInt,
  GDExtensionBool,
  Unit
]
object GDExtensionInterfacePrintErrorWithMessage {
  given Tag[GDExtensionInterfacePrintErrorWithMessage] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfacePrintErrorWithMessage]]

  extension (func: GDExtensionInterfacePrintErrorWithMessage) {
    def apply(
      p_description: ConstPtr[CChar],
      p_message: ConstPtr[CChar],
      p_function: ConstPtr[CChar],
      p_file: ConstPtr[CChar],
      p_line: CInt,
      p_editor_notify: GDExtensionBool
    ): Unit = func(p_description, p_message, p_function, p_file, p_line, p_editor_notify)
  } 
}

/**
 * Logs a warning to Godot's built-in debugger and to the OS terminal.
 */
opaque type GDExtensionInterfacePrintWarning = CFuncPtr5[
  ConstPtr[CChar],
  ConstPtr[CChar],
  ConstPtr[CChar],
  CInt,
  GDExtensionBool,
  Unit
]
object GDExtensionInterfacePrintWarning {
  given Tag[GDExtensionInterfacePrintWarning] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfacePrintWarning]]

  extension (func: GDExtensionInterfacePrintWarning) {
    def apply(
      p_description: ConstPtr[CChar],
      p_function: ConstPtr[CChar],
      p_file: ConstPtr[CChar],
      p_line: CInt,
      p_editor_notify: GDExtensionBool
    ): Unit = func(p_description, p_function, p_file, p_line, p_editor_notify)
  } 
}

/**
 * Logs a warning with a message to Godot's built-in debugger and to the OS terminal.
 */
opaque type GDExtensionInterfacePrintWarningWithMessage = CFuncPtr6[
  ConstPtr[CChar],
  ConstPtr[CChar],
  ConstPtr[CChar],
  ConstPtr[CChar],
  CInt,
  GDExtensionBool,
  Unit
]
object GDExtensionInterfacePrintWarningWithMessage {
  given Tag[GDExtensionInterfacePrintWarningWithMessage] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfacePrintWarningWithMessage]]

  extension (func: GDExtensionInterfacePrintWarningWithMessage) {
    def apply(
      p_description: ConstPtr[CChar],
      p_message: ConstPtr[CChar],
      p_function: ConstPtr[CChar],
      p_file: ConstPtr[CChar],
      p_line: CInt,
      p_editor_notify: GDExtensionBool
    ): Unit = func(p_description, p_message, p_function, p_file, p_line, p_editor_notify)
  } 
}

/**
 * Logs a script error to Godot's built-in debugger and to the OS terminal.
 */
opaque type GDExtensionInterfacePrintScriptError = CFuncPtr5[
  ConstPtr[CChar],
  ConstPtr[CChar],
  ConstPtr[CChar],
  CInt,
  GDExtensionBool,
  Unit
]
object GDExtensionInterfacePrintScriptError {
  given Tag[GDExtensionInterfacePrintScriptError] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfacePrintScriptError]]

  extension (func: GDExtensionInterfacePrintScriptError) {
    def apply(
      p_description: ConstPtr[CChar],
      p_function: ConstPtr[CChar],
      p_file: ConstPtr[CChar],
      p_line: CInt,
      p_editor_notify: GDExtensionBool
    ): Unit = func(p_description, p_function, p_file, p_line, p_editor_notify)
  } 
}

/**
 * Logs a script error with a message to Godot's built-in debugger and to the OS terminal.
 */
opaque type GDExtensionInterfacePrintScriptErrorWithMessage = CFuncPtr6[
  ConstPtr[CChar],
  ConstPtr[CChar],
  ConstPtr[CChar],
  ConstPtr[CChar],
  CInt,
  GDExtensionBool,
  Unit
]
object GDExtensionInterfacePrintScriptErrorWithMessage {
  given Tag[GDExtensionInterfacePrintScriptErrorWithMessage] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfacePrintScriptErrorWithMessage]]

  extension (func: GDExtensionInterfacePrintScriptErrorWithMessage) {
    def apply(
      p_description: ConstPtr[CChar],
      p_message: ConstPtr[CChar],
      p_function: ConstPtr[CChar],
      p_file: ConstPtr[CChar],
      p_line: CInt,
      p_editor_notify: GDExtensionBool
    ): Unit = func(p_description, p_message, p_function, p_file, p_line, p_editor_notify)
  } 
}

/**
 * Gets the size of a native struct (ex. ObjectID) in bytes.
 */
opaque type GDExtensionInterfaceGetNativeStructSize = CFuncPtr1[
  GDExtensionConstStringNamePtr,
  CUnsignedLongLong
]
object GDExtensionInterfaceGetNativeStructSize {
  given Tag[GDExtensionInterfaceGetNativeStructSize] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceGetNativeStructSize]]

  extension (func: GDExtensionInterfaceGetNativeStructSize) {
    def apply(
      p_name: GDExtensionConstStringNamePtr
    ): CUnsignedLongLong = func(p_name)
  } 
}

/**
 * Copies one Variant into a another.
 */
opaque type GDExtensionInterfaceVariantNewCopy = CFuncPtr2[
  GDExtensionUninitializedVariantPtr,
  GDExtensionConstVariantPtr,
  Unit
]
object GDExtensionInterfaceVariantNewCopy {
  given Tag[GDExtensionInterfaceVariantNewCopy] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceVariantNewCopy]]

  extension (func: GDExtensionInterfaceVariantNewCopy) {
    def apply(
      r_dest: GDExtensionUninitializedVariantPtr,
      p_src: GDExtensionConstVariantPtr
    ): Unit = func(r_dest, p_src)
  } 
}

/**
 * Creates a new Variant containing nil.
 */
opaque type GDExtensionInterfaceVariantNewNil = CFuncPtr1[
  GDExtensionUninitializedVariantPtr,
  Unit
]
object GDExtensionInterfaceVariantNewNil {
  given Tag[GDExtensionInterfaceVariantNewNil] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceVariantNewNil]]

  extension (func: GDExtensionInterfaceVariantNewNil) {
    def apply(
      r_dest: GDExtensionUninitializedVariantPtr
    ): Unit = func(r_dest)
  } 
}

/**
 * Destroys a Variant.
 */
opaque type GDExtensionInterfaceVariantDestroy = CFuncPtr1[
  GDExtensionVariantPtr,
  Unit
]
object GDExtensionInterfaceVariantDestroy {
  given Tag[GDExtensionInterfaceVariantDestroy] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceVariantDestroy]]

  extension (func: GDExtensionInterfaceVariantDestroy) {
    def apply(
      p_self: GDExtensionVariantPtr
    ): Unit = func(p_self)
  } 
}

/**
 * Calls a method on a Variant.
 */
opaque type GDExtensionInterfaceVariantCall = CFuncPtr6[
  GDExtensionVariantPtr,
  GDExtensionConstStringNamePtr,
  ConstPtr[GDExtensionConstVariantPtr],
  GDExtensionInt,
  GDExtensionUninitializedVariantPtr,
  Ptr[GDExtensionCallError],
  Unit
]
object GDExtensionInterfaceVariantCall {
  given Tag[GDExtensionInterfaceVariantCall] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceVariantCall]]

  extension (func: GDExtensionInterfaceVariantCall) {
    def apply(
      p_self: GDExtensionVariantPtr,
      p_method: GDExtensionConstStringNamePtr,
      p_args: ConstPtr[GDExtensionConstVariantPtr],
      p_argument_count: GDExtensionInt,
      r_return: GDExtensionUninitializedVariantPtr,
      r_error: Ptr[GDExtensionCallError]
    ): Unit = func(p_self, p_method, p_args, p_argument_count, r_return, r_error)
  } 
}

/**
 * Calls a static method on a Variant.
 */
opaque type GDExtensionInterfaceVariantCallStatic = CFuncPtr6[
  GDExtensionVariantType,
  GDExtensionConstStringNamePtr,
  ConstPtr[GDExtensionConstVariantPtr],
  GDExtensionInt,
  GDExtensionUninitializedVariantPtr,
  Ptr[GDExtensionCallError],
  Unit
]
object GDExtensionInterfaceVariantCallStatic {
  given Tag[GDExtensionInterfaceVariantCallStatic] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceVariantCallStatic]]

  extension (func: GDExtensionInterfaceVariantCallStatic) {
    def apply(
      p_type: GDExtensionVariantType,
      p_method: GDExtensionConstStringNamePtr,
      p_args: ConstPtr[GDExtensionConstVariantPtr],
      p_argument_count: GDExtensionInt,
      r_return: GDExtensionUninitializedVariantPtr,
      r_error: Ptr[GDExtensionCallError]
    ): Unit = func(p_type, p_method, p_args, p_argument_count, r_return, r_error)
  } 
}

/**
 * Evaluate an operator on two Variants.
 */
opaque type GDExtensionInterfaceVariantEvaluate = CFuncPtr5[
  GDExtensionVariantOperator,
  GDExtensionConstVariantPtr,
  GDExtensionConstVariantPtr,
  GDExtensionUninitializedVariantPtr,
  Ptr[GDExtensionBool],
  Unit
]
object GDExtensionInterfaceVariantEvaluate {
  given Tag[GDExtensionInterfaceVariantEvaluate] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceVariantEvaluate]]

  extension (func: GDExtensionInterfaceVariantEvaluate) {
    def apply(
      p_op: GDExtensionVariantOperator,
      p_a: GDExtensionConstVariantPtr,
      p_b: GDExtensionConstVariantPtr,
      r_return: GDExtensionUninitializedVariantPtr,
      r_valid: Ptr[GDExtensionBool]
    ): Unit = func(p_op, p_a, p_b, r_return, r_valid)
  } 
}

/**
 * Sets a key on a Variant to a value.
 */
opaque type GDExtensionInterfaceVariantSet = CFuncPtr4[
  GDExtensionVariantPtr,
  GDExtensionConstVariantPtr,
  GDExtensionConstVariantPtr,
  Ptr[GDExtensionBool],
  Unit
]
object GDExtensionInterfaceVariantSet {
  given Tag[GDExtensionInterfaceVariantSet] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceVariantSet]]

  extension (func: GDExtensionInterfaceVariantSet) {
    def apply(
      p_self: GDExtensionVariantPtr,
      p_key: GDExtensionConstVariantPtr,
      p_value: GDExtensionConstVariantPtr,
      r_valid: Ptr[GDExtensionBool]
    ): Unit = func(p_self, p_key, p_value, r_valid)
  } 
}

/**
 * Sets a named key on a Variant to a value.
 */
opaque type GDExtensionInterfaceVariantSetNamed = CFuncPtr4[
  GDExtensionVariantPtr,
  GDExtensionConstStringNamePtr,
  GDExtensionConstVariantPtr,
  Ptr[GDExtensionBool],
  Unit
]
object GDExtensionInterfaceVariantSetNamed {
  given Tag[GDExtensionInterfaceVariantSetNamed] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceVariantSetNamed]]

  extension (func: GDExtensionInterfaceVariantSetNamed) {
    def apply(
      p_self: GDExtensionVariantPtr,
      p_key: GDExtensionConstStringNamePtr,
      p_value: GDExtensionConstVariantPtr,
      r_valid: Ptr[GDExtensionBool]
    ): Unit = func(p_self, p_key, p_value, r_valid)
  } 
}

/**
 * Sets a keyed property on a Variant to a value.
 */
opaque type GDExtensionInterfaceVariantSetKeyed = CFuncPtr4[
  GDExtensionVariantPtr,
  GDExtensionConstVariantPtr,
  GDExtensionConstVariantPtr,
  Ptr[GDExtensionBool],
  Unit
]
object GDExtensionInterfaceVariantSetKeyed {
  given Tag[GDExtensionInterfaceVariantSetKeyed] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceVariantSetKeyed]]

  extension (func: GDExtensionInterfaceVariantSetKeyed) {
    def apply(
      p_self: GDExtensionVariantPtr,
      p_key: GDExtensionConstVariantPtr,
      p_value: GDExtensionConstVariantPtr,
      r_valid: Ptr[GDExtensionBool]
    ): Unit = func(p_self, p_key, p_value, r_valid)
  } 
}

/**
 * Sets an index on a Variant to a value.
 */
opaque type GDExtensionInterfaceVariantSetIndexed = CFuncPtr5[
  GDExtensionVariantPtr,
  GDExtensionInt,
  GDExtensionConstVariantPtr,
  Ptr[GDExtensionBool],
  Ptr[GDExtensionBool],
  Unit
]
object GDExtensionInterfaceVariantSetIndexed {
  given Tag[GDExtensionInterfaceVariantSetIndexed] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceVariantSetIndexed]]

  extension (func: GDExtensionInterfaceVariantSetIndexed) {
    def apply(
      p_self: GDExtensionVariantPtr,
      p_index: GDExtensionInt,
      p_value: GDExtensionConstVariantPtr,
      r_valid: Ptr[GDExtensionBool],
      r_oob: Ptr[GDExtensionBool]
    ): Unit = func(p_self, p_index, p_value, r_valid, r_oob)
  } 
}

/**
 * Gets the value of a key from a Variant.
 */
opaque type GDExtensionInterfaceVariantGet = CFuncPtr4[
  GDExtensionConstVariantPtr,
  GDExtensionConstVariantPtr,
  GDExtensionUninitializedVariantPtr,
  Ptr[GDExtensionBool],
  Unit
]
object GDExtensionInterfaceVariantGet {
  given Tag[GDExtensionInterfaceVariantGet] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceVariantGet]]

  extension (func: GDExtensionInterfaceVariantGet) {
    def apply(
      p_self: GDExtensionConstVariantPtr,
      p_key: GDExtensionConstVariantPtr,
      r_ret: GDExtensionUninitializedVariantPtr,
      r_valid: Ptr[GDExtensionBool]
    ): Unit = func(p_self, p_key, r_ret, r_valid)
  } 
}

/**
 * Gets the value of a named key from a Variant.
 */
opaque type GDExtensionInterfaceVariantGetNamed = CFuncPtr4[
  GDExtensionConstVariantPtr,
  GDExtensionConstStringNamePtr,
  GDExtensionUninitializedVariantPtr,
  Ptr[GDExtensionBool],
  Unit
]
object GDExtensionInterfaceVariantGetNamed {
  given Tag[GDExtensionInterfaceVariantGetNamed] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceVariantGetNamed]]

  extension (func: GDExtensionInterfaceVariantGetNamed) {
    def apply(
      p_self: GDExtensionConstVariantPtr,
      p_key: GDExtensionConstStringNamePtr,
      r_ret: GDExtensionUninitializedVariantPtr,
      r_valid: Ptr[GDExtensionBool]
    ): Unit = func(p_self, p_key, r_ret, r_valid)
  } 
}

/**
 * Gets the value of a keyed property from a Variant.
 */
opaque type GDExtensionInterfaceVariantGetKeyed = CFuncPtr4[
  GDExtensionConstVariantPtr,
  GDExtensionConstVariantPtr,
  GDExtensionUninitializedVariantPtr,
  Ptr[GDExtensionBool],
  Unit
]
object GDExtensionInterfaceVariantGetKeyed {
  given Tag[GDExtensionInterfaceVariantGetKeyed] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceVariantGetKeyed]]

  extension (func: GDExtensionInterfaceVariantGetKeyed) {
    def apply(
      p_self: GDExtensionConstVariantPtr,
      p_key: GDExtensionConstVariantPtr,
      r_ret: GDExtensionUninitializedVariantPtr,
      r_valid: Ptr[GDExtensionBool]
    ): Unit = func(p_self, p_key, r_ret, r_valid)
  } 
}

/**
 * Gets the value of an index from a Variant.
 */
opaque type GDExtensionInterfaceVariantGetIndexed = CFuncPtr5[
  GDExtensionConstVariantPtr,
  GDExtensionInt,
  GDExtensionUninitializedVariantPtr,
  Ptr[GDExtensionBool],
  Ptr[GDExtensionBool],
  Unit
]
object GDExtensionInterfaceVariantGetIndexed {
  given Tag[GDExtensionInterfaceVariantGetIndexed] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceVariantGetIndexed]]

  extension (func: GDExtensionInterfaceVariantGetIndexed) {
    def apply(
      p_self: GDExtensionConstVariantPtr,
      p_index: GDExtensionInt,
      r_ret: GDExtensionUninitializedVariantPtr,
      r_valid: Ptr[GDExtensionBool],
      r_oob: Ptr[GDExtensionBool]
    ): Unit = func(p_self, p_index, r_ret, r_valid, r_oob)
  } 
}

/**
 * Initializes an iterator over a Variant.
 */
opaque type GDExtensionInterfaceVariantIterInit = CFuncPtr3[
  GDExtensionConstVariantPtr,
  GDExtensionUninitializedVariantPtr,
  Ptr[GDExtensionBool],
  GDExtensionBool
]
object GDExtensionInterfaceVariantIterInit {
  given Tag[GDExtensionInterfaceVariantIterInit] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceVariantIterInit]]

  extension (func: GDExtensionInterfaceVariantIterInit) {
    def apply(
      p_self: GDExtensionConstVariantPtr,
      r_iter: GDExtensionUninitializedVariantPtr,
      r_valid: Ptr[GDExtensionBool]
    ): GDExtensionBool = func(p_self, r_iter, r_valid)
  } 
}

/**
 * Gets the next value for an iterator over a Variant.
 */
opaque type GDExtensionInterfaceVariantIterNext = CFuncPtr3[
  GDExtensionConstVariantPtr,
  GDExtensionVariantPtr,
  Ptr[GDExtensionBool],
  GDExtensionBool
]
object GDExtensionInterfaceVariantIterNext {
  given Tag[GDExtensionInterfaceVariantIterNext] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceVariantIterNext]]

  extension (func: GDExtensionInterfaceVariantIterNext) {
    def apply(
      p_self: GDExtensionConstVariantPtr,
      r_iter: GDExtensionVariantPtr,
      r_valid: Ptr[GDExtensionBool]
    ): GDExtensionBool = func(p_self, r_iter, r_valid)
  } 
}

/**
 * Gets the next value for an iterator over a Variant.
 */
opaque type GDExtensionInterfaceVariantIterGet = CFuncPtr4[
  GDExtensionConstVariantPtr,
  GDExtensionVariantPtr,
  GDExtensionUninitializedVariantPtr,
  Ptr[GDExtensionBool],
  Unit
]
object GDExtensionInterfaceVariantIterGet {
  given Tag[GDExtensionInterfaceVariantIterGet] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceVariantIterGet]]

  extension (func: GDExtensionInterfaceVariantIterGet) {
    def apply(
      p_self: GDExtensionConstVariantPtr,
      r_iter: GDExtensionVariantPtr,
      r_ret: GDExtensionUninitializedVariantPtr,
      r_valid: Ptr[GDExtensionBool]
    ): Unit = func(p_self, r_iter, r_ret, r_valid)
  } 
}

/**
 * Gets the hash of a Variant.
 */
opaque type GDExtensionInterfaceVariantHash = CFuncPtr1[
  GDExtensionConstVariantPtr,
  GDExtensionInt
]
object GDExtensionInterfaceVariantHash {
  given Tag[GDExtensionInterfaceVariantHash] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceVariantHash]]

  extension (func: GDExtensionInterfaceVariantHash) {
    def apply(
      p_self: GDExtensionConstVariantPtr
    ): GDExtensionInt = func(p_self)
  } 
}

/**
 * Gets the recursive hash of a Variant.
 */
opaque type GDExtensionInterfaceVariantRecursiveHash = CFuncPtr2[
  GDExtensionConstVariantPtr,
  GDExtensionInt,
  GDExtensionInt
]
object GDExtensionInterfaceVariantRecursiveHash {
  given Tag[GDExtensionInterfaceVariantRecursiveHash] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceVariantRecursiveHash]]

  extension (func: GDExtensionInterfaceVariantRecursiveHash) {
    def apply(
      p_self: GDExtensionConstVariantPtr,
      p_recursion_count: GDExtensionInt
    ): GDExtensionInt = func(p_self, p_recursion_count)
  } 
}

/**
 * Compares two Variants by their hash.
 */
opaque type GDExtensionInterfaceVariantHashCompare = CFuncPtr2[
  GDExtensionConstVariantPtr,
  GDExtensionConstVariantPtr,
  GDExtensionBool
]
object GDExtensionInterfaceVariantHashCompare {
  given Tag[GDExtensionInterfaceVariantHashCompare] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceVariantHashCompare]]

  extension (func: GDExtensionInterfaceVariantHashCompare) {
    def apply(
      p_self: GDExtensionConstVariantPtr,
      p_other: GDExtensionConstVariantPtr
    ): GDExtensionBool = func(p_self, p_other)
  } 
}

/**
 * Converts a Variant to a boolean.
 */
opaque type GDExtensionInterfaceVariantBooleanize = CFuncPtr1[
  GDExtensionConstVariantPtr,
  GDExtensionBool
]
object GDExtensionInterfaceVariantBooleanize {
  given Tag[GDExtensionInterfaceVariantBooleanize] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceVariantBooleanize]]

  extension (func: GDExtensionInterfaceVariantBooleanize) {
    def apply(
      p_self: GDExtensionConstVariantPtr
    ): GDExtensionBool = func(p_self)
  } 
}

/**
 * Duplicates a Variant.
 */
opaque type GDExtensionInterfaceVariantDuplicate = CFuncPtr3[
  GDExtensionConstVariantPtr,
  GDExtensionVariantPtr,
  GDExtensionBool,
  Unit
]
object GDExtensionInterfaceVariantDuplicate {
  given Tag[GDExtensionInterfaceVariantDuplicate] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceVariantDuplicate]]

  extension (func: GDExtensionInterfaceVariantDuplicate) {
    def apply(
      p_self: GDExtensionConstVariantPtr,
      r_ret: GDExtensionVariantPtr,
      p_deep: GDExtensionBool
    ): Unit = func(p_self, r_ret, p_deep)
  } 
}

/**
 * Converts a Variant to a string.
 */
opaque type GDExtensionInterfaceVariantStringify = CFuncPtr2[
  GDExtensionConstVariantPtr,
  GDExtensionStringPtr,
  Unit
]
object GDExtensionInterfaceVariantStringify {
  given Tag[GDExtensionInterfaceVariantStringify] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceVariantStringify]]

  extension (func: GDExtensionInterfaceVariantStringify) {
    def apply(
      p_self: GDExtensionConstVariantPtr,
      r_ret: GDExtensionStringPtr
    ): Unit = func(p_self, r_ret)
  } 
}

/**
 * Gets the type of a Variant.
 */
opaque type GDExtensionInterfaceVariantGetType = CFuncPtr1[
  GDExtensionConstVariantPtr,
  GDExtensionVariantType
]
object GDExtensionInterfaceVariantGetType {
  given Tag[GDExtensionInterfaceVariantGetType] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceVariantGetType]]

  extension (func: GDExtensionInterfaceVariantGetType) {
    def apply(
      p_self: GDExtensionConstVariantPtr
    ): GDExtensionVariantType = func(p_self)
  } 
}

/**
 * Checks if a Variant has the given method.
 */
opaque type GDExtensionInterfaceVariantHasMethod = CFuncPtr2[
  GDExtensionConstVariantPtr,
  GDExtensionConstStringNamePtr,
  GDExtensionBool
]
object GDExtensionInterfaceVariantHasMethod {
  given Tag[GDExtensionInterfaceVariantHasMethod] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceVariantHasMethod]]

  extension (func: GDExtensionInterfaceVariantHasMethod) {
    def apply(
      p_self: GDExtensionConstVariantPtr,
      p_method: GDExtensionConstStringNamePtr
    ): GDExtensionBool = func(p_self, p_method)
  } 
}

/**
 * Checks if a type of Variant has the given member.
 */
opaque type GDExtensionInterfaceVariantHasMember = CFuncPtr2[
  GDExtensionVariantType,
  GDExtensionConstStringNamePtr,
  GDExtensionBool
]
object GDExtensionInterfaceVariantHasMember {
  given Tag[GDExtensionInterfaceVariantHasMember] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceVariantHasMember]]

  extension (func: GDExtensionInterfaceVariantHasMember) {
    def apply(
      p_type: GDExtensionVariantType,
      p_member: GDExtensionConstStringNamePtr
    ): GDExtensionBool = func(p_type, p_member)
  } 
}

/**
 * Checks if a Variant has a key.
 */
opaque type GDExtensionInterfaceVariantHasKey = CFuncPtr3[
  GDExtensionConstVariantPtr,
  GDExtensionConstVariantPtr,
  Ptr[GDExtensionBool],
  GDExtensionBool
]
object GDExtensionInterfaceVariantHasKey {
  given Tag[GDExtensionInterfaceVariantHasKey] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceVariantHasKey]]

  extension (func: GDExtensionInterfaceVariantHasKey) {
    def apply(
      p_self: GDExtensionConstVariantPtr,
      p_key: GDExtensionConstVariantPtr,
      r_valid: Ptr[GDExtensionBool]
    ): GDExtensionBool = func(p_self, p_key, r_valid)
  } 
}

/**
 * Gets the object instance ID from a variant of type GDEXTENSION_VARIANT_TYPE_OBJECT.
 * If the variant isn't of type GDEXTENSION_VARIANT_TYPE_OBJECT, then zero will be returned.
 * The instance ID will be returned even if the object is no longer valid - use `object_get_instance_by_id()` to check if the object is still valid.
 */
opaque type GDExtensionInterfaceVariantGetObjectInstanceId = CFuncPtr1[
  GDExtensionConstVariantPtr,
  GDObjectInstanceID
]
object GDExtensionInterfaceVariantGetObjectInstanceId {
  given Tag[GDExtensionInterfaceVariantGetObjectInstanceId] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceVariantGetObjectInstanceId]]

  extension (func: GDExtensionInterfaceVariantGetObjectInstanceId) {
    def apply(
      p_self: GDExtensionConstVariantPtr
    ): GDObjectInstanceID = func(p_self)
  } 
}

/**
 * Gets the name of a Variant type.
 */
opaque type GDExtensionInterfaceVariantGetTypeName = CFuncPtr2[
  GDExtensionVariantType,
  GDExtensionUninitializedStringPtr,
  Unit
]
object GDExtensionInterfaceVariantGetTypeName {
  given Tag[GDExtensionInterfaceVariantGetTypeName] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceVariantGetTypeName]]

  extension (func: GDExtensionInterfaceVariantGetTypeName) {
    def apply(
      p_type: GDExtensionVariantType,
      r_name: GDExtensionUninitializedStringPtr
    ): Unit = func(p_type, r_name)
  } 
}

/**
 * Checks if Variants can be converted from one type to another.
 */
opaque type GDExtensionInterfaceVariantCanConvert = CFuncPtr2[
  GDExtensionVariantType,
  GDExtensionVariantType,
  GDExtensionBool
]
object GDExtensionInterfaceVariantCanConvert {
  given Tag[GDExtensionInterfaceVariantCanConvert] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceVariantCanConvert]]

  extension (func: GDExtensionInterfaceVariantCanConvert) {
    def apply(
      p_from: GDExtensionVariantType,
      p_to: GDExtensionVariantType
    ): GDExtensionBool = func(p_from, p_to)
  } 
}

/**
 * Checks if Variant can be converted from one type to another using stricter rules.
 */
opaque type GDExtensionInterfaceVariantCanConvertStrict = CFuncPtr2[
  GDExtensionVariantType,
  GDExtensionVariantType,
  GDExtensionBool
]
object GDExtensionInterfaceVariantCanConvertStrict {
  given Tag[GDExtensionInterfaceVariantCanConvertStrict] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceVariantCanConvertStrict]]

  extension (func: GDExtensionInterfaceVariantCanConvertStrict) {
    def apply(
      p_from: GDExtensionVariantType,
      p_to: GDExtensionVariantType
    ): GDExtensionBool = func(p_from, p_to)
  } 
}

/**
 * Gets a pointer to a function that can create a Variant of the given type from a raw value.
 */
opaque type GDExtensionInterfaceGetVariantFromTypeConstructor = CFuncPtr1[
  GDExtensionVariantType,
  GDExtensionVariantFromTypeConstructorFunc
]
object GDExtensionInterfaceGetVariantFromTypeConstructor {
  given Tag[GDExtensionInterfaceGetVariantFromTypeConstructor] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceGetVariantFromTypeConstructor]]

  extension (func: GDExtensionInterfaceGetVariantFromTypeConstructor) {
    def apply(
      p_type: GDExtensionVariantType
    ): GDExtensionVariantFromTypeConstructorFunc = func(p_type)
  } 
}

/**
 * Gets a pointer to a function that can get the raw value from a Variant of the given type.
 */
opaque type GDExtensionInterfaceGetVariantToTypeConstructor = CFuncPtr1[
  GDExtensionVariantType,
  GDExtensionTypeFromVariantConstructorFunc
]
object GDExtensionInterfaceGetVariantToTypeConstructor {
  given Tag[GDExtensionInterfaceGetVariantToTypeConstructor] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceGetVariantToTypeConstructor]]

  extension (func: GDExtensionInterfaceGetVariantToTypeConstructor) {
    def apply(
      p_type: GDExtensionVariantType
    ): GDExtensionTypeFromVariantConstructorFunc = func(p_type)
  } 
}

/**
 * Provides a function pointer for retrieving a pointer to a variant's internal value.
 * Access to a variant's internal value can be used to modify it in-place, or to retrieve its value without the overhead of variant conversion functions.
 * It is recommended to cache the getter for all variant types in a function table to avoid retrieval overhead upon use.
 * 
 * Each function assumes the variant's type has already been determined and matches the function.
 * Invoking the function with a variant of a mismatched type has undefined behavior, and may lead to a segmentation fault.
 */
opaque type GDExtensionInterfaceVariantGetPtrInternalGetter = CFuncPtr1[
  GDExtensionVariantType,
  GDExtensionVariantGetInternalPtrFunc
]
object GDExtensionInterfaceVariantGetPtrInternalGetter {
  given Tag[GDExtensionInterfaceVariantGetPtrInternalGetter] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceVariantGetPtrInternalGetter]]

  extension (func: GDExtensionInterfaceVariantGetPtrInternalGetter) {
    def apply(
      p_type: GDExtensionVariantType
    ): GDExtensionVariantGetInternalPtrFunc = func(p_type)
  } 
}

/**
 * Gets a pointer to a function that can evaluate the given Variant operator on the given Variant types.
 */
opaque type GDExtensionInterfaceVariantGetPtrOperatorEvaluator = CFuncPtr3[
  GDExtensionVariantOperator,
  GDExtensionVariantType,
  GDExtensionVariantType,
  GDExtensionPtrOperatorEvaluator
]
object GDExtensionInterfaceVariantGetPtrOperatorEvaluator {
  given Tag[GDExtensionInterfaceVariantGetPtrOperatorEvaluator] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceVariantGetPtrOperatorEvaluator]]

  extension (func: GDExtensionInterfaceVariantGetPtrOperatorEvaluator) {
    def apply(
      p_operator: GDExtensionVariantOperator,
      p_type_a: GDExtensionVariantType,
      p_type_b: GDExtensionVariantType
    ): GDExtensionPtrOperatorEvaluator = func(p_operator, p_type_a, p_type_b)
  } 
}

/**
 * Gets a pointer to a function that can call a builtin method on a type of Variant.
 */
opaque type GDExtensionInterfaceVariantGetPtrBuiltinMethod = CFuncPtr3[
  GDExtensionVariantType,
  GDExtensionConstStringNamePtr,
  GDExtensionInt,
  GDExtensionPtrBuiltInMethod
]
object GDExtensionInterfaceVariantGetPtrBuiltinMethod {
  given Tag[GDExtensionInterfaceVariantGetPtrBuiltinMethod] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceVariantGetPtrBuiltinMethod]]

  extension (func: GDExtensionInterfaceVariantGetPtrBuiltinMethod) {
    def apply(
      p_type: GDExtensionVariantType,
      p_method: GDExtensionConstStringNamePtr,
      p_hash: GDExtensionInt
    ): GDExtensionPtrBuiltInMethod = func(p_type, p_method, p_hash)
  } 
}

/**
 * Gets a pointer to a function that can call one of the constructors for a type of Variant.
 */
opaque type GDExtensionInterfaceVariantGetPtrConstructor = CFuncPtr2[
  GDExtensionVariantType,
  CInt,
  GDExtensionPtrConstructor
]
object GDExtensionInterfaceVariantGetPtrConstructor {
  given Tag[GDExtensionInterfaceVariantGetPtrConstructor] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceVariantGetPtrConstructor]]

  extension (func: GDExtensionInterfaceVariantGetPtrConstructor) {
    def apply(
      p_type: GDExtensionVariantType,
      p_constructor: CInt
    ): GDExtensionPtrConstructor = func(p_type, p_constructor)
  } 
}

/**
 * Gets a pointer to a function than can call the destructor for a type of Variant.
 */
opaque type GDExtensionInterfaceVariantGetPtrDestructor = CFuncPtr1[
  GDExtensionVariantType,
  GDExtensionPtrDestructor
]
object GDExtensionInterfaceVariantGetPtrDestructor {
  given Tag[GDExtensionInterfaceVariantGetPtrDestructor] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceVariantGetPtrDestructor]]

  extension (func: GDExtensionInterfaceVariantGetPtrDestructor) {
    def apply(
      p_type: GDExtensionVariantType
    ): GDExtensionPtrDestructor = func(p_type)
  } 
}

/**
 * Constructs a Variant of the given type, using the first constructor that matches the given arguments.
 */
opaque type GDExtensionInterfaceVariantConstruct = CFuncPtr5[
  GDExtensionVariantType,
  GDExtensionUninitializedVariantPtr,
  ConstPtr[GDExtensionConstVariantPtr],
  CInt,
  Ptr[GDExtensionCallError],
  Unit
]
object GDExtensionInterfaceVariantConstruct {
  given Tag[GDExtensionInterfaceVariantConstruct] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceVariantConstruct]]

  extension (func: GDExtensionInterfaceVariantConstruct) {
    def apply(
      p_type: GDExtensionVariantType,
      r_base: GDExtensionUninitializedVariantPtr,
      p_args: ConstPtr[GDExtensionConstVariantPtr],
      p_argument_count: CInt,
      r_error: Ptr[GDExtensionCallError]
    ): Unit = func(p_type, r_base, p_args, p_argument_count, r_error)
  } 
}

/**
 * Gets a pointer to a function that can call a member's setter on the given Variant type.
 */
opaque type GDExtensionInterfaceVariantGetPtrSetter = CFuncPtr2[
  GDExtensionVariantType,
  GDExtensionConstStringNamePtr,
  GDExtensionPtrSetter
]
object GDExtensionInterfaceVariantGetPtrSetter {
  given Tag[GDExtensionInterfaceVariantGetPtrSetter] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceVariantGetPtrSetter]]

  extension (func: GDExtensionInterfaceVariantGetPtrSetter) {
    def apply(
      p_type: GDExtensionVariantType,
      p_member: GDExtensionConstStringNamePtr
    ): GDExtensionPtrSetter = func(p_type, p_member)
  } 
}

/**
 * Gets a pointer to a function that can call a member's getter on the given Variant type.
 */
opaque type GDExtensionInterfaceVariantGetPtrGetter = CFuncPtr2[
  GDExtensionVariantType,
  GDExtensionConstStringNamePtr,
  GDExtensionPtrGetter
]
object GDExtensionInterfaceVariantGetPtrGetter {
  given Tag[GDExtensionInterfaceVariantGetPtrGetter] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceVariantGetPtrGetter]]

  extension (func: GDExtensionInterfaceVariantGetPtrGetter) {
    def apply(
      p_type: GDExtensionVariantType,
      p_member: GDExtensionConstStringNamePtr
    ): GDExtensionPtrGetter = func(p_type, p_member)
  } 
}

/**
 * Gets a pointer to a function that can set an index on the given Variant type.
 */
opaque type GDExtensionInterfaceVariantGetPtrIndexedSetter = CFuncPtr1[
  GDExtensionVariantType,
  GDExtensionPtrIndexedSetter
]
object GDExtensionInterfaceVariantGetPtrIndexedSetter {
  given Tag[GDExtensionInterfaceVariantGetPtrIndexedSetter] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceVariantGetPtrIndexedSetter]]

  extension (func: GDExtensionInterfaceVariantGetPtrIndexedSetter) {
    def apply(
      p_type: GDExtensionVariantType
    ): GDExtensionPtrIndexedSetter = func(p_type)
  } 
}

/**
 * Gets a pointer to a function that can get an index on the given Variant type.
 */
opaque type GDExtensionInterfaceVariantGetPtrIndexedGetter = CFuncPtr1[
  GDExtensionVariantType,
  GDExtensionPtrIndexedGetter
]
object GDExtensionInterfaceVariantGetPtrIndexedGetter {
  given Tag[GDExtensionInterfaceVariantGetPtrIndexedGetter] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceVariantGetPtrIndexedGetter]]

  extension (func: GDExtensionInterfaceVariantGetPtrIndexedGetter) {
    def apply(
      p_type: GDExtensionVariantType
    ): GDExtensionPtrIndexedGetter = func(p_type)
  } 
}

/**
 * Gets a pointer to a function that can set a key on the given Variant type.
 */
opaque type GDExtensionInterfaceVariantGetPtrKeyedSetter = CFuncPtr1[
  GDExtensionVariantType,
  GDExtensionPtrKeyedSetter
]
object GDExtensionInterfaceVariantGetPtrKeyedSetter {
  given Tag[GDExtensionInterfaceVariantGetPtrKeyedSetter] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceVariantGetPtrKeyedSetter]]

  extension (func: GDExtensionInterfaceVariantGetPtrKeyedSetter) {
    def apply(
      p_type: GDExtensionVariantType
    ): GDExtensionPtrKeyedSetter = func(p_type)
  } 
}

/**
 * Gets a pointer to a function that can get a key on the given Variant type.
 */
opaque type GDExtensionInterfaceVariantGetPtrKeyedGetter = CFuncPtr1[
  GDExtensionVariantType,
  GDExtensionPtrKeyedGetter
]
object GDExtensionInterfaceVariantGetPtrKeyedGetter {
  given Tag[GDExtensionInterfaceVariantGetPtrKeyedGetter] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceVariantGetPtrKeyedGetter]]

  extension (func: GDExtensionInterfaceVariantGetPtrKeyedGetter) {
    def apply(
      p_type: GDExtensionVariantType
    ): GDExtensionPtrKeyedGetter = func(p_type)
  } 
}

/**
 * Gets a pointer to a function that can check a key on the given Variant type.
 */
opaque type GDExtensionInterfaceVariantGetPtrKeyedChecker = CFuncPtr1[
  GDExtensionVariantType,
  GDExtensionPtrKeyedChecker
]
object GDExtensionInterfaceVariantGetPtrKeyedChecker {
  given Tag[GDExtensionInterfaceVariantGetPtrKeyedChecker] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceVariantGetPtrKeyedChecker]]

  extension (func: GDExtensionInterfaceVariantGetPtrKeyedChecker) {
    def apply(
      p_type: GDExtensionVariantType
    ): GDExtensionPtrKeyedChecker = func(p_type)
  } 
}

/**
 * Gets the value of a constant from the given Variant type.
 */
opaque type GDExtensionInterfaceVariantGetConstantValue = CFuncPtr3[
  GDExtensionVariantType,
  GDExtensionConstStringNamePtr,
  GDExtensionUninitializedVariantPtr,
  Unit
]
object GDExtensionInterfaceVariantGetConstantValue {
  given Tag[GDExtensionInterfaceVariantGetConstantValue] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceVariantGetConstantValue]]

  extension (func: GDExtensionInterfaceVariantGetConstantValue) {
    def apply(
      p_type: GDExtensionVariantType,
      p_constant: GDExtensionConstStringNamePtr,
      r_ret: GDExtensionUninitializedVariantPtr
    ): Unit = func(p_type, p_constant, r_ret)
  } 
}

/**
 * Gets a pointer to a function that can call a Variant utility function.
 */
opaque type GDExtensionInterfaceVariantGetPtrUtilityFunction = CFuncPtr2[
  GDExtensionConstStringNamePtr,
  GDExtensionInt,
  GDExtensionPtrUtilityFunction
]
object GDExtensionInterfaceVariantGetPtrUtilityFunction {
  given Tag[GDExtensionInterfaceVariantGetPtrUtilityFunction] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceVariantGetPtrUtilityFunction]]

  extension (func: GDExtensionInterfaceVariantGetPtrUtilityFunction) {
    def apply(
      p_function: GDExtensionConstStringNamePtr,
      p_hash: GDExtensionInt
    ): GDExtensionPtrUtilityFunction = func(p_function, p_hash)
  } 
}

/**
 * Creates a String from a Latin-1 encoded C string.
 */
opaque type GDExtensionInterfaceStringNewWithLatin1Chars = CFuncPtr2[
  GDExtensionUninitializedStringPtr,
  ConstPtr[CChar],
  Unit
]
object GDExtensionInterfaceStringNewWithLatin1Chars {
  given Tag[GDExtensionInterfaceStringNewWithLatin1Chars] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceStringNewWithLatin1Chars]]

  extension (func: GDExtensionInterfaceStringNewWithLatin1Chars) {
    def apply(
      r_dest: GDExtensionUninitializedStringPtr,
      p_contents: ConstPtr[CChar]
    ): Unit = func(r_dest, p_contents)
  } 
}

/**
 * Creates a String from a UTF-8 encoded C string.
 */
opaque type GDExtensionInterfaceStringNewWithUtf8Chars = CFuncPtr2[
  GDExtensionUninitializedStringPtr,
  ConstPtr[CChar],
  Unit
]
object GDExtensionInterfaceStringNewWithUtf8Chars {
  given Tag[GDExtensionInterfaceStringNewWithUtf8Chars] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceStringNewWithUtf8Chars]]

  extension (func: GDExtensionInterfaceStringNewWithUtf8Chars) {
    def apply(
      r_dest: GDExtensionUninitializedStringPtr,
      p_contents: ConstPtr[CChar]
    ): Unit = func(r_dest, p_contents)
  } 
}

/**
 * Creates a String from a UTF-16 encoded C string.
 */
opaque type GDExtensionInterfaceStringNewWithUtf16Chars = CFuncPtr2[
  GDExtensionUninitializedStringPtr,
  ConstPtr[CChar16],
  Unit
]
object GDExtensionInterfaceStringNewWithUtf16Chars {
  given Tag[GDExtensionInterfaceStringNewWithUtf16Chars] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceStringNewWithUtf16Chars]]

  extension (func: GDExtensionInterfaceStringNewWithUtf16Chars) {
    def apply(
      r_dest: GDExtensionUninitializedStringPtr,
      p_contents: ConstPtr[CChar16]
    ): Unit = func(r_dest, p_contents)
  } 
}

/**
 * Creates a String from a UTF-32 encoded C string.
 */
opaque type GDExtensionInterfaceStringNewWithUtf32Chars = CFuncPtr2[
  GDExtensionUninitializedStringPtr,
  ConstPtr[CChar32],
  Unit
]
object GDExtensionInterfaceStringNewWithUtf32Chars {
  given Tag[GDExtensionInterfaceStringNewWithUtf32Chars] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceStringNewWithUtf32Chars]]

  extension (func: GDExtensionInterfaceStringNewWithUtf32Chars) {
    def apply(
      r_dest: GDExtensionUninitializedStringPtr,
      p_contents: ConstPtr[CChar32]
    ): Unit = func(r_dest, p_contents)
  } 
}

/**
 * Creates a String from a wide C string.
 */
opaque type GDExtensionInterfaceStringNewWithWideChars = CFuncPtr2[
  GDExtensionUninitializedStringPtr,
  ConstPtr[CWideChar],
  Unit
]
object GDExtensionInterfaceStringNewWithWideChars {
  given Tag[GDExtensionInterfaceStringNewWithWideChars] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceStringNewWithWideChars]]

  extension (func: GDExtensionInterfaceStringNewWithWideChars) {
    def apply(
      r_dest: GDExtensionUninitializedStringPtr,
      p_contents: ConstPtr[CWideChar]
    ): Unit = func(r_dest, p_contents)
  } 
}

/**
 * Creates a String from a Latin-1 encoded C string with the given length.
 */
opaque type GDExtensionInterfaceStringNewWithLatin1CharsAndLen = CFuncPtr3[
  GDExtensionUninitializedStringPtr,
  ConstPtr[CChar],
  GDExtensionInt,
  Unit
]
object GDExtensionInterfaceStringNewWithLatin1CharsAndLen {
  given Tag[GDExtensionInterfaceStringNewWithLatin1CharsAndLen] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceStringNewWithLatin1CharsAndLen]]

  extension (func: GDExtensionInterfaceStringNewWithLatin1CharsAndLen) {
    def apply(
      r_dest: GDExtensionUninitializedStringPtr,
      p_contents: ConstPtr[CChar],
      p_size: GDExtensionInt
    ): Unit = func(r_dest, p_contents, p_size)
  } 
}

/**
 * Creates a String from a UTF-8 encoded C string with the given length.
 *
 * @deprecated Since 4.3. Use string_new_with_utf8_chars_and_len2 instead.
 */
opaque type GDExtensionInterfaceStringNewWithUtf8CharsAndLen = CFuncPtr3[
  GDExtensionUninitializedStringPtr,
  ConstPtr[CChar],
  GDExtensionInt,
  Unit
]
object GDExtensionInterfaceStringNewWithUtf8CharsAndLen {
  given Tag[GDExtensionInterfaceStringNewWithUtf8CharsAndLen] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceStringNewWithUtf8CharsAndLen]]

  extension (func: GDExtensionInterfaceStringNewWithUtf8CharsAndLen) {
    def apply(
      r_dest: GDExtensionUninitializedStringPtr,
      p_contents: ConstPtr[CChar],
      p_size: GDExtensionInt
    ): Unit = func(r_dest, p_contents, p_size)
  } 
}

/**
 * Creates a String from a UTF-8 encoded C string with the given length.
 */
opaque type GDExtensionInterfaceStringNewWithUtf8CharsAndLen2 = CFuncPtr3[
  GDExtensionUninitializedStringPtr,
  ConstPtr[CChar],
  GDExtensionInt,
  GDExtensionInt
]
object GDExtensionInterfaceStringNewWithUtf8CharsAndLen2 {
  given Tag[GDExtensionInterfaceStringNewWithUtf8CharsAndLen2] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceStringNewWithUtf8CharsAndLen2]]

  extension (func: GDExtensionInterfaceStringNewWithUtf8CharsAndLen2) {
    def apply(
      r_dest: GDExtensionUninitializedStringPtr,
      p_contents: ConstPtr[CChar],
      p_size: GDExtensionInt
    ): GDExtensionInt = func(r_dest, p_contents, p_size)
  } 
}

/**
 * Creates a String from a UTF-16 encoded C string with the given length.
 *
 * @deprecated Since 4.3. Use string_new_with_utf16_chars_and_len2 instead.
 */
opaque type GDExtensionInterfaceStringNewWithUtf16CharsAndLen = CFuncPtr3[
  GDExtensionUninitializedStringPtr,
  ConstPtr[CChar16],
  GDExtensionInt,
  Unit
]
object GDExtensionInterfaceStringNewWithUtf16CharsAndLen {
  given Tag[GDExtensionInterfaceStringNewWithUtf16CharsAndLen] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceStringNewWithUtf16CharsAndLen]]

  extension (func: GDExtensionInterfaceStringNewWithUtf16CharsAndLen) {
    def apply(
      r_dest: GDExtensionUninitializedStringPtr,
      p_contents: ConstPtr[CChar16],
      p_char_count: GDExtensionInt
    ): Unit = func(r_dest, p_contents, p_char_count)
  } 
}

/**
 * Creates a String from a UTF-16 encoded C string with the given length.
 */
opaque type GDExtensionInterfaceStringNewWithUtf16CharsAndLen2 = CFuncPtr4[
  GDExtensionUninitializedStringPtr,
  ConstPtr[CChar16],
  GDExtensionInt,
  GDExtensionBool,
  GDExtensionInt
]
object GDExtensionInterfaceStringNewWithUtf16CharsAndLen2 {
  given Tag[GDExtensionInterfaceStringNewWithUtf16CharsAndLen2] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceStringNewWithUtf16CharsAndLen2]]

  extension (func: GDExtensionInterfaceStringNewWithUtf16CharsAndLen2) {
    def apply(
      r_dest: GDExtensionUninitializedStringPtr,
      p_contents: ConstPtr[CChar16],
      p_char_count: GDExtensionInt,
      p_default_little_endian: GDExtensionBool
    ): GDExtensionInt = func(r_dest, p_contents, p_char_count, p_default_little_endian)
  } 
}

/**
 * Creates a String from a UTF-32 encoded C string with the given length.
 */
opaque type GDExtensionInterfaceStringNewWithUtf32CharsAndLen = CFuncPtr3[
  GDExtensionUninitializedStringPtr,
  ConstPtr[CChar32],
  GDExtensionInt,
  Unit
]
object GDExtensionInterfaceStringNewWithUtf32CharsAndLen {
  given Tag[GDExtensionInterfaceStringNewWithUtf32CharsAndLen] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceStringNewWithUtf32CharsAndLen]]

  extension (func: GDExtensionInterfaceStringNewWithUtf32CharsAndLen) {
    def apply(
      r_dest: GDExtensionUninitializedStringPtr,
      p_contents: ConstPtr[CChar32],
      p_char_count: GDExtensionInt
    ): Unit = func(r_dest, p_contents, p_char_count)
  } 
}

/**
 * Creates a String from a wide C string with the given length.
 */
opaque type GDExtensionInterfaceStringNewWithWideCharsAndLen = CFuncPtr3[
  GDExtensionUninitializedStringPtr,
  ConstPtr[CWideChar],
  GDExtensionInt,
  Unit
]
object GDExtensionInterfaceStringNewWithWideCharsAndLen {
  given Tag[GDExtensionInterfaceStringNewWithWideCharsAndLen] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceStringNewWithWideCharsAndLen]]

  extension (func: GDExtensionInterfaceStringNewWithWideCharsAndLen) {
    def apply(
      r_dest: GDExtensionUninitializedStringPtr,
      p_contents: ConstPtr[CWideChar],
      p_char_count: GDExtensionInt
    ): Unit = func(r_dest, p_contents, p_char_count)
  } 
}

/**
 * Converts a String to a Latin-1 encoded C string.
 * It doesn't write a null terminator.
 */
opaque type GDExtensionInterfaceStringToLatin1Chars = CFuncPtr3[
  GDExtensionConstStringPtr,
  Ptr[CChar],
  GDExtensionInt,
  GDExtensionInt
]
object GDExtensionInterfaceStringToLatin1Chars {
  given Tag[GDExtensionInterfaceStringToLatin1Chars] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceStringToLatin1Chars]]

  extension (func: GDExtensionInterfaceStringToLatin1Chars) {
    def apply(
      p_self: GDExtensionConstStringPtr,
      r_text: Ptr[CChar],
      p_max_write_length: GDExtensionInt
    ): GDExtensionInt = func(p_self, r_text, p_max_write_length)
  } 
}

/**
 * Converts a String to a UTF-8 encoded C string.
 * It doesn't write a null terminator.
 */
opaque type GDExtensionInterfaceStringToUtf8Chars = CFuncPtr3[
  GDExtensionConstStringPtr,
  Ptr[CChar],
  GDExtensionInt,
  GDExtensionInt
]
object GDExtensionInterfaceStringToUtf8Chars {
  given Tag[GDExtensionInterfaceStringToUtf8Chars] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceStringToUtf8Chars]]

  extension (func: GDExtensionInterfaceStringToUtf8Chars) {
    def apply(
      p_self: GDExtensionConstStringPtr,
      r_text: Ptr[CChar],
      p_max_write_length: GDExtensionInt
    ): GDExtensionInt = func(p_self, r_text, p_max_write_length)
  } 
}

/**
 * Converts a String to a UTF-16 encoded C string.
 * It doesn't write a null terminator.
 */
opaque type GDExtensionInterfaceStringToUtf16Chars = CFuncPtr3[
  GDExtensionConstStringPtr,
  Ptr[CChar16],
  GDExtensionInt,
  GDExtensionInt
]
object GDExtensionInterfaceStringToUtf16Chars {
  given Tag[GDExtensionInterfaceStringToUtf16Chars] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceStringToUtf16Chars]]

  extension (func: GDExtensionInterfaceStringToUtf16Chars) {
    def apply(
      p_self: GDExtensionConstStringPtr,
      r_text: Ptr[CChar16],
      p_max_write_length: GDExtensionInt
    ): GDExtensionInt = func(p_self, r_text, p_max_write_length)
  } 
}

/**
 * Converts a String to a UTF-32 encoded C string.
 * It doesn't write a null terminator.
 */
opaque type GDExtensionInterfaceStringToUtf32Chars = CFuncPtr3[
  GDExtensionConstStringPtr,
  Ptr[CChar32],
  GDExtensionInt,
  GDExtensionInt
]
object GDExtensionInterfaceStringToUtf32Chars {
  given Tag[GDExtensionInterfaceStringToUtf32Chars] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceStringToUtf32Chars]]

  extension (func: GDExtensionInterfaceStringToUtf32Chars) {
    def apply(
      p_self: GDExtensionConstStringPtr,
      r_text: Ptr[CChar32],
      p_max_write_length: GDExtensionInt
    ): GDExtensionInt = func(p_self, r_text, p_max_write_length)
  } 
}

/**
 * Converts a String to a wide C string.
 * It doesn't write a null terminator.
 */
opaque type GDExtensionInterfaceStringToWideChars = CFuncPtr3[
  GDExtensionConstStringPtr,
  Ptr[CWideChar],
  GDExtensionInt,
  GDExtensionInt
]
object GDExtensionInterfaceStringToWideChars {
  given Tag[GDExtensionInterfaceStringToWideChars] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceStringToWideChars]]

  extension (func: GDExtensionInterfaceStringToWideChars) {
    def apply(
      p_self: GDExtensionConstStringPtr,
      r_text: Ptr[CWideChar],
      p_max_write_length: GDExtensionInt
    ): GDExtensionInt = func(p_self, r_text, p_max_write_length)
  } 
}

/**
 * Gets a pointer to the character at the given index from a String.
 */
opaque type GDExtensionInterfaceStringOperatorIndex = CFuncPtr2[
  GDExtensionStringPtr,
  GDExtensionInt,
  Ptr[CChar32]
]
object GDExtensionInterfaceStringOperatorIndex {
  given Tag[GDExtensionInterfaceStringOperatorIndex] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceStringOperatorIndex]]

  extension (func: GDExtensionInterfaceStringOperatorIndex) {
    def apply(
      p_self: GDExtensionStringPtr,
      p_index: GDExtensionInt
    ): Ptr[CChar32] = func(p_self, p_index)
  } 
}

/**
 * Gets a const pointer to the character at the given index from a String.
 */
opaque type GDExtensionInterfaceStringOperatorIndexConst = CFuncPtr2[
  GDExtensionConstStringPtr,
  GDExtensionInt,
  ConstPtr[CChar32]
]
object GDExtensionInterfaceStringOperatorIndexConst {
  given Tag[GDExtensionInterfaceStringOperatorIndexConst] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceStringOperatorIndexConst]]

  extension (func: GDExtensionInterfaceStringOperatorIndexConst) {
    def apply(
      p_self: GDExtensionConstStringPtr,
      p_index: GDExtensionInt
    ): ConstPtr[CChar32] = func(p_self, p_index)
  } 
}

/**
 * Appends another String to a String.
 */
opaque type GDExtensionInterfaceStringOperatorPlusEqString = CFuncPtr2[
  GDExtensionStringPtr,
  GDExtensionConstStringPtr,
  Unit
]
object GDExtensionInterfaceStringOperatorPlusEqString {
  given Tag[GDExtensionInterfaceStringOperatorPlusEqString] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceStringOperatorPlusEqString]]

  extension (func: GDExtensionInterfaceStringOperatorPlusEqString) {
    def apply(
      p_self: GDExtensionStringPtr,
      p_b: GDExtensionConstStringPtr
    ): Unit = func(p_self, p_b)
  } 
}

/**
 * Appends a character to a String.
 */
opaque type GDExtensionInterfaceStringOperatorPlusEqChar = CFuncPtr2[
  GDExtensionStringPtr,
  CChar32,
  Unit
]
object GDExtensionInterfaceStringOperatorPlusEqChar {
  given Tag[GDExtensionInterfaceStringOperatorPlusEqChar] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceStringOperatorPlusEqChar]]

  extension (func: GDExtensionInterfaceStringOperatorPlusEqChar) {
    def apply(
      p_self: GDExtensionStringPtr,
      p_b: CChar32
    ): Unit = func(p_self, p_b)
  } 
}

/**
 * Appends a Latin-1 encoded C string to a String.
 */
opaque type GDExtensionInterfaceStringOperatorPlusEqCstr = CFuncPtr2[
  GDExtensionStringPtr,
  ConstPtr[CChar],
  Unit
]
object GDExtensionInterfaceStringOperatorPlusEqCstr {
  given Tag[GDExtensionInterfaceStringOperatorPlusEqCstr] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceStringOperatorPlusEqCstr]]

  extension (func: GDExtensionInterfaceStringOperatorPlusEqCstr) {
    def apply(
      p_self: GDExtensionStringPtr,
      p_b: ConstPtr[CChar]
    ): Unit = func(p_self, p_b)
  } 
}

/**
 * Appends a wide C string to a String.
 */
opaque type GDExtensionInterfaceStringOperatorPlusEqWcstr = CFuncPtr2[
  GDExtensionStringPtr,
  ConstPtr[CWideChar],
  Unit
]
object GDExtensionInterfaceStringOperatorPlusEqWcstr {
  given Tag[GDExtensionInterfaceStringOperatorPlusEqWcstr] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceStringOperatorPlusEqWcstr]]

  extension (func: GDExtensionInterfaceStringOperatorPlusEqWcstr) {
    def apply(
      p_self: GDExtensionStringPtr,
      p_b: ConstPtr[CWideChar]
    ): Unit = func(p_self, p_b)
  } 
}

/**
 * Appends a UTF-32 encoded C string to a String.
 */
opaque type GDExtensionInterfaceStringOperatorPlusEqC32str = CFuncPtr2[
  GDExtensionStringPtr,
  ConstPtr[CChar32],
  Unit
]
object GDExtensionInterfaceStringOperatorPlusEqC32str {
  given Tag[GDExtensionInterfaceStringOperatorPlusEqC32str] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceStringOperatorPlusEqC32str]]

  extension (func: GDExtensionInterfaceStringOperatorPlusEqC32str) {
    def apply(
      p_self: GDExtensionStringPtr,
      p_b: ConstPtr[CChar32]
    ): Unit = func(p_self, p_b)
  } 
}

/**
 * Resizes the underlying string data to the given number of characters.
 * Space needs to be allocated for the null terminating character ('\0') which
 * also must be added manually, in order for all string functions to work correctly.
 * 
 * Warning: This is an error-prone operation - only use it if there's no other
 * efficient way to accomplish your goal.
 */
opaque type GDExtensionInterfaceStringResize = CFuncPtr2[
  GDExtensionStringPtr,
  GDExtensionInt,
  GDExtensionInt
]
object GDExtensionInterfaceStringResize {
  given Tag[GDExtensionInterfaceStringResize] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceStringResize]]

  extension (func: GDExtensionInterfaceStringResize) {
    def apply(
      p_self: GDExtensionStringPtr,
      p_resize: GDExtensionInt
    ): GDExtensionInt = func(p_self, p_resize)
  } 
}

/**
 * Creates a StringName from a Latin-1 encoded C string.
 * If `p_is_static` is true, then:
 * - The StringName will reuse the `p_contents` buffer instead of copying it.
 * - You must guarantee that the buffer remains valid for the duration of the application (e.g. string literal).
 * - You must not call a destructor for this StringName. Incrementing the initial reference once should achieve this.
 * 
 * `p_is_static` is purely an optimization and can easily introduce undefined behavior if used wrong. In case of doubt, set it to false.
 */
opaque type GDExtensionInterfaceStringNameNewWithLatin1Chars = CFuncPtr3[
  GDExtensionUninitializedStringNamePtr,
  ConstPtr[CChar],
  GDExtensionBool,
  Unit
]
object GDExtensionInterfaceStringNameNewWithLatin1Chars {
  given Tag[GDExtensionInterfaceStringNameNewWithLatin1Chars] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceStringNameNewWithLatin1Chars]]

  extension (func: GDExtensionInterfaceStringNameNewWithLatin1Chars) {
    def apply(
      r_dest: GDExtensionUninitializedStringNamePtr,
      p_contents: ConstPtr[CChar],
      p_is_static: GDExtensionBool
    ): Unit = func(r_dest, p_contents, p_is_static)
  } 
}

/**
 * Creates a StringName from a UTF-8 encoded C string.
 */
opaque type GDExtensionInterfaceStringNameNewWithUtf8Chars = CFuncPtr2[
  GDExtensionUninitializedStringNamePtr,
  ConstPtr[CChar],
  Unit
]
object GDExtensionInterfaceStringNameNewWithUtf8Chars {
  given Tag[GDExtensionInterfaceStringNameNewWithUtf8Chars] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceStringNameNewWithUtf8Chars]]

  extension (func: GDExtensionInterfaceStringNameNewWithUtf8Chars) {
    def apply(
      r_dest: GDExtensionUninitializedStringNamePtr,
      p_contents: ConstPtr[CChar]
    ): Unit = func(r_dest, p_contents)
  } 
}

/**
 * Creates a StringName from a UTF-8 encoded string with a given number of characters.
 */
opaque type GDExtensionInterfaceStringNameNewWithUtf8CharsAndLen = CFuncPtr3[
  GDExtensionUninitializedStringNamePtr,
  ConstPtr[CChar],
  GDExtensionInt,
  Unit
]
object GDExtensionInterfaceStringNameNewWithUtf8CharsAndLen {
  given Tag[GDExtensionInterfaceStringNameNewWithUtf8CharsAndLen] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceStringNameNewWithUtf8CharsAndLen]]

  extension (func: GDExtensionInterfaceStringNameNewWithUtf8CharsAndLen) {
    def apply(
      r_dest: GDExtensionUninitializedStringNamePtr,
      p_contents: ConstPtr[CChar],
      p_size: GDExtensionInt
    ): Unit = func(r_dest, p_contents, p_size)
  } 
}

/**
 * Opens a raw XML buffer on an XMLParser instance.
 */
opaque type GDExtensionInterfaceXmlParserOpenBuffer = CFuncPtr3[
  GDExtensionObjectPtr,
  ConstPtr[UByte],
  CSize,
  GDExtensionInt
]
object GDExtensionInterfaceXmlParserOpenBuffer {
  given Tag[GDExtensionInterfaceXmlParserOpenBuffer] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceXmlParserOpenBuffer]]

  extension (func: GDExtensionInterfaceXmlParserOpenBuffer) {
    def apply(
      p_instance: GDExtensionObjectPtr,
      p_buffer: ConstPtr[UByte],
      p_size: CSize
    ): GDExtensionInt = func(p_instance, p_buffer, p_size)
  } 
}

/**
 * Stores the given buffer using an instance of FileAccess.
 */
opaque type GDExtensionInterfaceFileAccessStoreBuffer = CFuncPtr3[
  GDExtensionObjectPtr,
  ConstPtr[UByte],
  CUnsignedLongLong,
  Unit
]
object GDExtensionInterfaceFileAccessStoreBuffer {
  given Tag[GDExtensionInterfaceFileAccessStoreBuffer] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceFileAccessStoreBuffer]]

  extension (func: GDExtensionInterfaceFileAccessStoreBuffer) {
    def apply(
      p_instance: GDExtensionObjectPtr,
      p_src: ConstPtr[UByte],
      p_length: CUnsignedLongLong
    ): Unit = func(p_instance, p_src, p_length)
  } 
}

/**
 * Reads the next p_length bytes into the given buffer using an instance of FileAccess.
 */
opaque type GDExtensionInterfaceFileAccessGetBuffer = CFuncPtr3[
  GDExtensionConstObjectPtr,
  Ptr[UByte],
  CUnsignedLongLong,
  CUnsignedLongLong
]
object GDExtensionInterfaceFileAccessGetBuffer {
  given Tag[GDExtensionInterfaceFileAccessGetBuffer] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceFileAccessGetBuffer]]

  extension (func: GDExtensionInterfaceFileAccessGetBuffer) {
    def apply(
      p_instance: GDExtensionConstObjectPtr,
      p_dst: Ptr[UByte],
      p_length: CUnsignedLongLong
    ): CUnsignedLongLong = func(p_instance, p_dst, p_length)
  } 
}

/**
 * Returns writable pointer to internal Image buffer.
 */
opaque type GDExtensionInterfaceImagePtrw = CFuncPtr1[
  GDExtensionObjectPtr,
  Ptr[UByte]
]
object GDExtensionInterfaceImagePtrw {
  given Tag[GDExtensionInterfaceImagePtrw] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceImagePtrw]]

  extension (func: GDExtensionInterfaceImagePtrw) {
    def apply(
      p_instance: GDExtensionObjectPtr
    ): Ptr[UByte] = func(p_instance)
  } 
}

/**
 * Returns read only pointer to internal Image buffer.
 */
opaque type GDExtensionInterfaceImagePtr = CFuncPtr1[
  GDExtensionObjectPtr,
  ConstPtr[UByte]
]
object GDExtensionInterfaceImagePtr {
  given Tag[GDExtensionInterfaceImagePtr] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceImagePtr]]

  extension (func: GDExtensionInterfaceImagePtr) {
    def apply(
      p_instance: GDExtensionObjectPtr
    ): ConstPtr[UByte] = func(p_instance)
  } 
}

/**
 * Adds a group task to an instance of WorkerThreadPool.
 */
opaque type GDExtensionInterfaceWorkerThreadPoolAddNativeGroupTask = CFuncPtr7[
  GDExtensionObjectPtr,
  GDExtensionWorkerThreadPoolGroupTask,
  CVoidPtr,
  CInt,
  CInt,
  GDExtensionBool,
  GDExtensionConstStringPtr,
  CLongLong
]
object GDExtensionInterfaceWorkerThreadPoolAddNativeGroupTask {
  given Tag[GDExtensionInterfaceWorkerThreadPoolAddNativeGroupTask] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceWorkerThreadPoolAddNativeGroupTask]]

  extension (func: GDExtensionInterfaceWorkerThreadPoolAddNativeGroupTask) {
    def apply(
      p_instance: GDExtensionObjectPtr,
      p_func: GDExtensionWorkerThreadPoolGroupTask,
      p_userdata: CVoidPtr,
      p_elements: CInt,
      p_tasks: CInt,
      p_high_priority: GDExtensionBool,
      p_description: GDExtensionConstStringPtr
    ): CLongLong = func(p_instance, p_func, p_userdata, p_elements, p_tasks, p_high_priority, p_description)
  } 
}

/**
 * Adds a task to an instance of WorkerThreadPool.
 */
opaque type GDExtensionInterfaceWorkerThreadPoolAddNativeTask = CFuncPtr5[
  GDExtensionObjectPtr,
  GDExtensionWorkerThreadPoolTask,
  CVoidPtr,
  GDExtensionBool,
  GDExtensionConstStringPtr,
  CLongLong
]
object GDExtensionInterfaceWorkerThreadPoolAddNativeTask {
  given Tag[GDExtensionInterfaceWorkerThreadPoolAddNativeTask] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceWorkerThreadPoolAddNativeTask]]

  extension (func: GDExtensionInterfaceWorkerThreadPoolAddNativeTask) {
    def apply(
      p_instance: GDExtensionObjectPtr,
      p_func: GDExtensionWorkerThreadPoolTask,
      p_userdata: CVoidPtr,
      p_high_priority: GDExtensionBool,
      p_description: GDExtensionConstStringPtr
    ): CLongLong = func(p_instance, p_func, p_userdata, p_high_priority, p_description)
  } 
}

/**
 * Gets a pointer to a byte in a PackedByteArray.
 */
opaque type GDExtensionInterfacePackedByteArrayOperatorIndex = CFuncPtr2[
  GDExtensionTypePtr,
  GDExtensionInt,
  Ptr[UByte]
]
object GDExtensionInterfacePackedByteArrayOperatorIndex {
  given Tag[GDExtensionInterfacePackedByteArrayOperatorIndex] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfacePackedByteArrayOperatorIndex]]

  extension (func: GDExtensionInterfacePackedByteArrayOperatorIndex) {
    def apply(
      p_self: GDExtensionTypePtr,
      p_index: GDExtensionInt
    ): Ptr[UByte] = func(p_self, p_index)
  } 
}

/**
 * Gets a const pointer to a byte in a PackedByteArray.
 */
opaque type GDExtensionInterfacePackedByteArrayOperatorIndexConst = CFuncPtr2[
  GDExtensionConstTypePtr,
  GDExtensionInt,
  ConstPtr[UByte]
]
object GDExtensionInterfacePackedByteArrayOperatorIndexConst {
  given Tag[GDExtensionInterfacePackedByteArrayOperatorIndexConst] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfacePackedByteArrayOperatorIndexConst]]

  extension (func: GDExtensionInterfacePackedByteArrayOperatorIndexConst) {
    def apply(
      p_self: GDExtensionConstTypePtr,
      p_index: GDExtensionInt
    ): ConstPtr[UByte] = func(p_self, p_index)
  } 
}

/**
 * Gets a pointer to a 32-bit float in a PackedFloat32Array.
 */
opaque type GDExtensionInterfacePackedFloat32ArrayOperatorIndex = CFuncPtr2[
  GDExtensionTypePtr,
  GDExtensionInt,
  Ptr[CFloat]
]
object GDExtensionInterfacePackedFloat32ArrayOperatorIndex {
  given Tag[GDExtensionInterfacePackedFloat32ArrayOperatorIndex] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfacePackedFloat32ArrayOperatorIndex]]

  extension (func: GDExtensionInterfacePackedFloat32ArrayOperatorIndex) {
    def apply(
      p_self: GDExtensionTypePtr,
      p_index: GDExtensionInt
    ): Ptr[CFloat] = func(p_self, p_index)
  } 
}

/**
 * Gets a const pointer to a 32-bit float in a PackedFloat32Array.
 */
opaque type GDExtensionInterfacePackedFloat32ArrayOperatorIndexConst = CFuncPtr2[
  GDExtensionConstTypePtr,
  GDExtensionInt,
  ConstPtr[CFloat]
]
object GDExtensionInterfacePackedFloat32ArrayOperatorIndexConst {
  given Tag[GDExtensionInterfacePackedFloat32ArrayOperatorIndexConst] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfacePackedFloat32ArrayOperatorIndexConst]]

  extension (func: GDExtensionInterfacePackedFloat32ArrayOperatorIndexConst) {
    def apply(
      p_self: GDExtensionConstTypePtr,
      p_index: GDExtensionInt
    ): ConstPtr[CFloat] = func(p_self, p_index)
  } 
}

/**
 * Gets a pointer to a 64-bit float in a PackedFloat64Array.
 */
opaque type GDExtensionInterfacePackedFloat64ArrayOperatorIndex = CFuncPtr2[
  GDExtensionTypePtr,
  GDExtensionInt,
  Ptr[CDouble]
]
object GDExtensionInterfacePackedFloat64ArrayOperatorIndex {
  given Tag[GDExtensionInterfacePackedFloat64ArrayOperatorIndex] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfacePackedFloat64ArrayOperatorIndex]]

  extension (func: GDExtensionInterfacePackedFloat64ArrayOperatorIndex) {
    def apply(
      p_self: GDExtensionTypePtr,
      p_index: GDExtensionInt
    ): Ptr[CDouble] = func(p_self, p_index)
  } 
}

/**
 * Gets a const pointer to a 64-bit float in a PackedFloat64Array.
 */
opaque type GDExtensionInterfacePackedFloat64ArrayOperatorIndexConst = CFuncPtr2[
  GDExtensionConstTypePtr,
  GDExtensionInt,
  ConstPtr[CDouble]
]
object GDExtensionInterfacePackedFloat64ArrayOperatorIndexConst {
  given Tag[GDExtensionInterfacePackedFloat64ArrayOperatorIndexConst] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfacePackedFloat64ArrayOperatorIndexConst]]

  extension (func: GDExtensionInterfacePackedFloat64ArrayOperatorIndexConst) {
    def apply(
      p_self: GDExtensionConstTypePtr,
      p_index: GDExtensionInt
    ): ConstPtr[CDouble] = func(p_self, p_index)
  } 
}

/**
 * Gets a pointer to a 32-bit integer in a PackedInt32Array.
 */
opaque type GDExtensionInterfacePackedInt32ArrayOperatorIndex = CFuncPtr2[
  GDExtensionTypePtr,
  GDExtensionInt,
  Ptr[CInt]
]
object GDExtensionInterfacePackedInt32ArrayOperatorIndex {
  given Tag[GDExtensionInterfacePackedInt32ArrayOperatorIndex] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfacePackedInt32ArrayOperatorIndex]]

  extension (func: GDExtensionInterfacePackedInt32ArrayOperatorIndex) {
    def apply(
      p_self: GDExtensionTypePtr,
      p_index: GDExtensionInt
    ): Ptr[CInt] = func(p_self, p_index)
  } 
}

/**
 * Gets a const pointer to a 32-bit integer in a PackedInt32Array.
 */
opaque type GDExtensionInterfacePackedInt32ArrayOperatorIndexConst = CFuncPtr2[
  GDExtensionConstTypePtr,
  GDExtensionInt,
  ConstPtr[CInt]
]
object GDExtensionInterfacePackedInt32ArrayOperatorIndexConst {
  given Tag[GDExtensionInterfacePackedInt32ArrayOperatorIndexConst] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfacePackedInt32ArrayOperatorIndexConst]]

  extension (func: GDExtensionInterfacePackedInt32ArrayOperatorIndexConst) {
    def apply(
      p_self: GDExtensionConstTypePtr,
      p_index: GDExtensionInt
    ): ConstPtr[CInt] = func(p_self, p_index)
  } 
}

/**
 * Gets a pointer to a 64-bit integer in a PackedInt64Array.
 */
opaque type GDExtensionInterfacePackedInt64ArrayOperatorIndex = CFuncPtr2[
  GDExtensionTypePtr,
  GDExtensionInt,
  Ptr[CLongLong]
]
object GDExtensionInterfacePackedInt64ArrayOperatorIndex {
  given Tag[GDExtensionInterfacePackedInt64ArrayOperatorIndex] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfacePackedInt64ArrayOperatorIndex]]

  extension (func: GDExtensionInterfacePackedInt64ArrayOperatorIndex) {
    def apply(
      p_self: GDExtensionTypePtr,
      p_index: GDExtensionInt
    ): Ptr[CLongLong] = func(p_self, p_index)
  } 
}

/**
 * Gets a const pointer to a 64-bit integer in a PackedInt64Array.
 */
opaque type GDExtensionInterfacePackedInt64ArrayOperatorIndexConst = CFuncPtr2[
  GDExtensionConstTypePtr,
  GDExtensionInt,
  ConstPtr[CLongLong]
]
object GDExtensionInterfacePackedInt64ArrayOperatorIndexConst {
  given Tag[GDExtensionInterfacePackedInt64ArrayOperatorIndexConst] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfacePackedInt64ArrayOperatorIndexConst]]

  extension (func: GDExtensionInterfacePackedInt64ArrayOperatorIndexConst) {
    def apply(
      p_self: GDExtensionConstTypePtr,
      p_index: GDExtensionInt
    ): ConstPtr[CLongLong] = func(p_self, p_index)
  } 
}

/**
 * Gets a pointer to a string in a PackedStringArray.
 */
opaque type GDExtensionInterfacePackedStringArrayOperatorIndex = CFuncPtr2[
  GDExtensionTypePtr,
  GDExtensionInt,
  GDExtensionStringPtr
]
object GDExtensionInterfacePackedStringArrayOperatorIndex {
  given Tag[GDExtensionInterfacePackedStringArrayOperatorIndex] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfacePackedStringArrayOperatorIndex]]

  extension (func: GDExtensionInterfacePackedStringArrayOperatorIndex) {
    def apply(
      p_self: GDExtensionTypePtr,
      p_index: GDExtensionInt
    ): GDExtensionStringPtr = func(p_self, p_index)
  } 
}

/**
 * Gets a const pointer to a string in a PackedStringArray.
 */
opaque type GDExtensionInterfacePackedStringArrayOperatorIndexConst = CFuncPtr2[
  GDExtensionConstTypePtr,
  GDExtensionInt,
  GDExtensionStringPtr
]
object GDExtensionInterfacePackedStringArrayOperatorIndexConst {
  given Tag[GDExtensionInterfacePackedStringArrayOperatorIndexConst] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfacePackedStringArrayOperatorIndexConst]]

  extension (func: GDExtensionInterfacePackedStringArrayOperatorIndexConst) {
    def apply(
      p_self: GDExtensionConstTypePtr,
      p_index: GDExtensionInt
    ): GDExtensionStringPtr = func(p_self, p_index)
  } 
}

/**
 * Gets a pointer to a Vector2 in a PackedVector2Array.
 */
opaque type GDExtensionInterfacePackedVector2ArrayOperatorIndex = CFuncPtr2[
  GDExtensionTypePtr,
  GDExtensionInt,
  GDExtensionTypePtr
]
object GDExtensionInterfacePackedVector2ArrayOperatorIndex {
  given Tag[GDExtensionInterfacePackedVector2ArrayOperatorIndex] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfacePackedVector2ArrayOperatorIndex]]

  extension (func: GDExtensionInterfacePackedVector2ArrayOperatorIndex) {
    def apply(
      p_self: GDExtensionTypePtr,
      p_index: GDExtensionInt
    ): GDExtensionTypePtr = func(p_self, p_index)
  } 
}

/**
 * Gets a const pointer to a Vector2 in a PackedVector2Array.
 */
opaque type GDExtensionInterfacePackedVector2ArrayOperatorIndexConst = CFuncPtr2[
  GDExtensionConstTypePtr,
  GDExtensionInt,
  GDExtensionTypePtr
]
object GDExtensionInterfacePackedVector2ArrayOperatorIndexConst {
  given Tag[GDExtensionInterfacePackedVector2ArrayOperatorIndexConst] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfacePackedVector2ArrayOperatorIndexConst]]

  extension (func: GDExtensionInterfacePackedVector2ArrayOperatorIndexConst) {
    def apply(
      p_self: GDExtensionConstTypePtr,
      p_index: GDExtensionInt
    ): GDExtensionTypePtr = func(p_self, p_index)
  } 
}

/**
 * Gets a pointer to a Vector3 in a PackedVector3Array.
 */
opaque type GDExtensionInterfacePackedVector3ArrayOperatorIndex = CFuncPtr2[
  GDExtensionTypePtr,
  GDExtensionInt,
  GDExtensionTypePtr
]
object GDExtensionInterfacePackedVector3ArrayOperatorIndex {
  given Tag[GDExtensionInterfacePackedVector3ArrayOperatorIndex] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfacePackedVector3ArrayOperatorIndex]]

  extension (func: GDExtensionInterfacePackedVector3ArrayOperatorIndex) {
    def apply(
      p_self: GDExtensionTypePtr,
      p_index: GDExtensionInt
    ): GDExtensionTypePtr = func(p_self, p_index)
  } 
}

/**
 * Gets a const pointer to a Vector3 in a PackedVector3Array.
 */
opaque type GDExtensionInterfacePackedVector3ArrayOperatorIndexConst = CFuncPtr2[
  GDExtensionConstTypePtr,
  GDExtensionInt,
  GDExtensionTypePtr
]
object GDExtensionInterfacePackedVector3ArrayOperatorIndexConst {
  given Tag[GDExtensionInterfacePackedVector3ArrayOperatorIndexConst] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfacePackedVector3ArrayOperatorIndexConst]]

  extension (func: GDExtensionInterfacePackedVector3ArrayOperatorIndexConst) {
    def apply(
      p_self: GDExtensionConstTypePtr,
      p_index: GDExtensionInt
    ): GDExtensionTypePtr = func(p_self, p_index)
  } 
}

/**
 * Gets a pointer to a Vector4 in a PackedVector4Array.
 */
opaque type GDExtensionInterfacePackedVector4ArrayOperatorIndex = CFuncPtr2[
  GDExtensionTypePtr,
  GDExtensionInt,
  GDExtensionTypePtr
]
object GDExtensionInterfacePackedVector4ArrayOperatorIndex {
  given Tag[GDExtensionInterfacePackedVector4ArrayOperatorIndex] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfacePackedVector4ArrayOperatorIndex]]

  extension (func: GDExtensionInterfacePackedVector4ArrayOperatorIndex) {
    def apply(
      p_self: GDExtensionTypePtr,
      p_index: GDExtensionInt
    ): GDExtensionTypePtr = func(p_self, p_index)
  } 
}

/**
 * Gets a const pointer to a Vector4 in a PackedVector4Array.
 */
opaque type GDExtensionInterfacePackedVector4ArrayOperatorIndexConst = CFuncPtr2[
  GDExtensionConstTypePtr,
  GDExtensionInt,
  GDExtensionTypePtr
]
object GDExtensionInterfacePackedVector4ArrayOperatorIndexConst {
  given Tag[GDExtensionInterfacePackedVector4ArrayOperatorIndexConst] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfacePackedVector4ArrayOperatorIndexConst]]

  extension (func: GDExtensionInterfacePackedVector4ArrayOperatorIndexConst) {
    def apply(
      p_self: GDExtensionConstTypePtr,
      p_index: GDExtensionInt
    ): GDExtensionTypePtr = func(p_self, p_index)
  } 
}

/**
 * Gets a pointer to a color in a PackedColorArray.
 */
opaque type GDExtensionInterfacePackedColorArrayOperatorIndex = CFuncPtr2[
  GDExtensionTypePtr,
  GDExtensionInt,
  GDExtensionTypePtr
]
object GDExtensionInterfacePackedColorArrayOperatorIndex {
  given Tag[GDExtensionInterfacePackedColorArrayOperatorIndex] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfacePackedColorArrayOperatorIndex]]

  extension (func: GDExtensionInterfacePackedColorArrayOperatorIndex) {
    def apply(
      p_self: GDExtensionTypePtr,
      p_index: GDExtensionInt
    ): GDExtensionTypePtr = func(p_self, p_index)
  } 
}

/**
 * Gets a const pointer to a color in a PackedColorArray.
 */
opaque type GDExtensionInterfacePackedColorArrayOperatorIndexConst = CFuncPtr2[
  GDExtensionConstTypePtr,
  GDExtensionInt,
  GDExtensionTypePtr
]
object GDExtensionInterfacePackedColorArrayOperatorIndexConst {
  given Tag[GDExtensionInterfacePackedColorArrayOperatorIndexConst] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfacePackedColorArrayOperatorIndexConst]]

  extension (func: GDExtensionInterfacePackedColorArrayOperatorIndexConst) {
    def apply(
      p_self: GDExtensionConstTypePtr,
      p_index: GDExtensionInt
    ): GDExtensionTypePtr = func(p_self, p_index)
  } 
}

/**
 * Gets a pointer to a Variant in an Array.
 */
opaque type GDExtensionInterfaceArrayOperatorIndex = CFuncPtr2[
  GDExtensionTypePtr,
  GDExtensionInt,
  GDExtensionVariantPtr
]
object GDExtensionInterfaceArrayOperatorIndex {
  given Tag[GDExtensionInterfaceArrayOperatorIndex] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceArrayOperatorIndex]]

  extension (func: GDExtensionInterfaceArrayOperatorIndex) {
    def apply(
      p_self: GDExtensionTypePtr,
      p_index: GDExtensionInt
    ): GDExtensionVariantPtr = func(p_self, p_index)
  } 
}

/**
 * Gets a const pointer to a Variant in an Array.
 */
opaque type GDExtensionInterfaceArrayOperatorIndexConst = CFuncPtr2[
  GDExtensionConstTypePtr,
  GDExtensionInt,
  GDExtensionVariantPtr
]
object GDExtensionInterfaceArrayOperatorIndexConst {
  given Tag[GDExtensionInterfaceArrayOperatorIndexConst] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceArrayOperatorIndexConst]]

  extension (func: GDExtensionInterfaceArrayOperatorIndexConst) {
    def apply(
      p_self: GDExtensionConstTypePtr,
      p_index: GDExtensionInt
    ): GDExtensionVariantPtr = func(p_self, p_index)
  } 
}

/**
 * Sets an Array to be a reference to another Array object.
 *
 * @deprecated Since 4.5. Use  instead.
 */
opaque type GDExtensionInterfaceArrayRef = CFuncPtr2[
  GDExtensionTypePtr,
  GDExtensionConstTypePtr,
  Unit
]
object GDExtensionInterfaceArrayRef {
  given Tag[GDExtensionInterfaceArrayRef] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceArrayRef]]

  extension (func: GDExtensionInterfaceArrayRef) {
    def apply(
      p_self: GDExtensionTypePtr,
      p_from: GDExtensionConstTypePtr
    ): Unit = func(p_self, p_from)
  } 
}

/**
 * Makes an Array into a typed Array.
 */
opaque type GDExtensionInterfaceArraySetTyped = CFuncPtr4[
  GDExtensionTypePtr,
  GDExtensionVariantType,
  GDExtensionConstStringNamePtr,
  GDExtensionConstVariantPtr,
  Unit
]
object GDExtensionInterfaceArraySetTyped {
  given Tag[GDExtensionInterfaceArraySetTyped] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceArraySetTyped]]

  extension (func: GDExtensionInterfaceArraySetTyped) {
    def apply(
      p_self: GDExtensionTypePtr,
      p_type: GDExtensionVariantType,
      p_class_name: GDExtensionConstStringNamePtr,
      p_script: GDExtensionConstVariantPtr
    ): Unit = func(p_self, p_type, p_class_name, p_script)
  } 
}

/**
 * Gets a pointer to a Variant in a Dictionary with the given key.
 */
opaque type GDExtensionInterfaceDictionaryOperatorIndex = CFuncPtr2[
  GDExtensionTypePtr,
  GDExtensionConstVariantPtr,
  GDExtensionVariantPtr
]
object GDExtensionInterfaceDictionaryOperatorIndex {
  given Tag[GDExtensionInterfaceDictionaryOperatorIndex] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceDictionaryOperatorIndex]]

  extension (func: GDExtensionInterfaceDictionaryOperatorIndex) {
    def apply(
      p_self: GDExtensionTypePtr,
      p_key: GDExtensionConstVariantPtr
    ): GDExtensionVariantPtr = func(p_self, p_key)
  } 
}

/**
 * Gets a const pointer to a Variant in a Dictionary with the given key.
 */
opaque type GDExtensionInterfaceDictionaryOperatorIndexConst = CFuncPtr2[
  GDExtensionConstTypePtr,
  GDExtensionConstVariantPtr,
  GDExtensionVariantPtr
]
object GDExtensionInterfaceDictionaryOperatorIndexConst {
  given Tag[GDExtensionInterfaceDictionaryOperatorIndexConst] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceDictionaryOperatorIndexConst]]

  extension (func: GDExtensionInterfaceDictionaryOperatorIndexConst) {
    def apply(
      p_self: GDExtensionConstTypePtr,
      p_key: GDExtensionConstVariantPtr
    ): GDExtensionVariantPtr = func(p_self, p_key)
  } 
}

/**
 * Makes a Dictionary into a typed Dictionary.
 */
opaque type GDExtensionInterfaceDictionarySetTyped = CFuncPtr7[
  GDExtensionTypePtr,
  GDExtensionVariantType,
  GDExtensionConstStringNamePtr,
  GDExtensionConstVariantPtr,
  GDExtensionVariantType,
  GDExtensionConstStringNamePtr,
  GDExtensionConstVariantPtr,
  Unit
]
object GDExtensionInterfaceDictionarySetTyped {
  given Tag[GDExtensionInterfaceDictionarySetTyped] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceDictionarySetTyped]]

  extension (func: GDExtensionInterfaceDictionarySetTyped) {
    def apply(
      p_self: GDExtensionTypePtr,
      p_key_type: GDExtensionVariantType,
      p_key_class_name: GDExtensionConstStringNamePtr,
      p_key_script: GDExtensionConstVariantPtr,
      p_value_type: GDExtensionVariantType,
      p_value_class_name: GDExtensionConstStringNamePtr,
      p_value_script: GDExtensionConstVariantPtr
    ): Unit = func(p_self, p_key_type, p_key_class_name, p_key_script, p_value_type, p_value_class_name, p_value_script)
  } 
}

/**
 * Calls a method on an Object.
 */
opaque type GDExtensionInterfaceObjectMethodBindCall = CFuncPtr6[
  GDExtensionMethodBindPtr,
  GDExtensionObjectPtr,
  ConstPtr[GDExtensionConstVariantPtr],
  GDExtensionInt,
  GDExtensionUninitializedVariantPtr,
  Ptr[GDExtensionCallError],
  Unit
]
object GDExtensionInterfaceObjectMethodBindCall {
  given Tag[GDExtensionInterfaceObjectMethodBindCall] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceObjectMethodBindCall]]

  extension (func: GDExtensionInterfaceObjectMethodBindCall) {
    def apply(
      p_method_bind: GDExtensionMethodBindPtr,
      p_instance: GDExtensionObjectPtr,
      p_args: ConstPtr[GDExtensionConstVariantPtr],
      p_arg_count: GDExtensionInt,
      r_ret: GDExtensionUninitializedVariantPtr,
      r_error: Ptr[GDExtensionCallError]
    ): Unit = func(p_method_bind, p_instance, p_args, p_arg_count, r_ret, r_error)
  } 
}

/**
 * Calls a method on an Object (using a "ptrcall").
 */
opaque type GDExtensionInterfaceObjectMethodBindPtrcall = CFuncPtr4[
  GDExtensionMethodBindPtr,
  GDExtensionObjectPtr,
  ConstPtr[GDExtensionConstTypePtr],
  GDExtensionTypePtr,
  Unit
]
object GDExtensionInterfaceObjectMethodBindPtrcall {
  given Tag[GDExtensionInterfaceObjectMethodBindPtrcall] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceObjectMethodBindPtrcall]]

  extension (func: GDExtensionInterfaceObjectMethodBindPtrcall) {
    def apply(
      p_method_bind: GDExtensionMethodBindPtr,
      p_instance: GDExtensionObjectPtr,
      p_args: ConstPtr[GDExtensionConstTypePtr],
      r_ret: GDExtensionTypePtr
    ): Unit = func(p_method_bind, p_instance, p_args, r_ret)
  } 
}

/**
 * Destroys an Object.
 */
opaque type GDExtensionInterfaceObjectDestroy = CFuncPtr1[
  GDExtensionObjectPtr,
  Unit
]
object GDExtensionInterfaceObjectDestroy {
  given Tag[GDExtensionInterfaceObjectDestroy] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceObjectDestroy]]

  extension (func: GDExtensionInterfaceObjectDestroy) {
    def apply(
      p_o: GDExtensionObjectPtr
    ): Unit = func(p_o)
  } 
}

/**
 * Gets a global singleton by name.
 */
opaque type GDExtensionInterfaceGlobalGetSingleton = CFuncPtr1[
  GDExtensionConstStringNamePtr,
  GDExtensionObjectPtr
]
object GDExtensionInterfaceGlobalGetSingleton {
  given Tag[GDExtensionInterfaceGlobalGetSingleton] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceGlobalGetSingleton]]

  extension (func: GDExtensionInterfaceGlobalGetSingleton) {
    def apply(
      p_name: GDExtensionConstStringNamePtr
    ): GDExtensionObjectPtr = func(p_name)
  } 
}

/**
 * Gets a pointer representing an Object's instance binding.
 */
opaque type GDExtensionInterfaceObjectGetInstanceBinding = CFuncPtr3[
  GDExtensionObjectPtr,
  CVoidPtr,
  ConstPtr[GDExtensionInstanceBindingCallbacks],
  CVoidPtr
]
object GDExtensionInterfaceObjectGetInstanceBinding {
  given Tag[GDExtensionInterfaceObjectGetInstanceBinding] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceObjectGetInstanceBinding]]

  extension (func: GDExtensionInterfaceObjectGetInstanceBinding) {
    def apply(
      p_o: GDExtensionObjectPtr,
      p_token: CVoidPtr,
      p_callbacks: ConstPtr[GDExtensionInstanceBindingCallbacks]
    ): CVoidPtr = func(p_o, p_token, p_callbacks)
  } 
}

/**
 * Sets an Object's instance binding.
 */
opaque type GDExtensionInterfaceObjectSetInstanceBinding = CFuncPtr4[
  GDExtensionObjectPtr,
  CVoidPtr,
  CVoidPtr,
  ConstPtr[GDExtensionInstanceBindingCallbacks],
  Unit
]
object GDExtensionInterfaceObjectSetInstanceBinding {
  given Tag[GDExtensionInterfaceObjectSetInstanceBinding] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceObjectSetInstanceBinding]]

  extension (func: GDExtensionInterfaceObjectSetInstanceBinding) {
    def apply(
      p_o: GDExtensionObjectPtr,
      p_token: CVoidPtr,
      p_binding: CVoidPtr,
      p_callbacks: ConstPtr[GDExtensionInstanceBindingCallbacks]
    ): Unit = func(p_o, p_token, p_binding, p_callbacks)
  } 
}

/**
 * Free an Object's instance binding.
 */
opaque type GDExtensionInterfaceObjectFreeInstanceBinding = CFuncPtr2[
  GDExtensionObjectPtr,
  CVoidPtr,
  Unit
]
object GDExtensionInterfaceObjectFreeInstanceBinding {
  given Tag[GDExtensionInterfaceObjectFreeInstanceBinding] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceObjectFreeInstanceBinding]]

  extension (func: GDExtensionInterfaceObjectFreeInstanceBinding) {
    def apply(
      p_o: GDExtensionObjectPtr,
      p_token: CVoidPtr
    ): Unit = func(p_o, p_token)
  } 
}

/**
 * Sets an extension class instance on a Object.
 * `p_classname` should be a registered extension class and should extend the `p_o` Object's class.
 */
opaque type GDExtensionInterfaceObjectSetInstance = CFuncPtr3[
  GDExtensionObjectPtr,
  GDExtensionConstStringNamePtr,
  GDExtensionClassInstancePtr,
  Unit
]
object GDExtensionInterfaceObjectSetInstance {
  given Tag[GDExtensionInterfaceObjectSetInstance] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceObjectSetInstance]]

  extension (func: GDExtensionInterfaceObjectSetInstance) {
    def apply(
      p_o: GDExtensionObjectPtr,
      p_classname: GDExtensionConstStringNamePtr,
      p_instance: GDExtensionClassInstancePtr
    ): Unit = func(p_o, p_classname, p_instance)
  } 
}

/**
 * Gets the class name of an Object.
 * If the GDExtension wraps the Godot object in an abstraction specific to its class, this is the
 * function that should be used to determine which wrapper to use.
 */
opaque type GDExtensionInterfaceObjectGetClassName = CFuncPtr3[
  GDExtensionConstObjectPtr,
  GDExtensionClassLibraryPtr,
  GDExtensionUninitializedStringNamePtr,
  GDExtensionBool
]
object GDExtensionInterfaceObjectGetClassName {
  given Tag[GDExtensionInterfaceObjectGetClassName] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceObjectGetClassName]]

  extension (func: GDExtensionInterfaceObjectGetClassName) {
    def apply(
      p_object: GDExtensionConstObjectPtr,
      p_library: GDExtensionClassLibraryPtr,
      r_class_name: GDExtensionUninitializedStringNamePtr
    ): GDExtensionBool = func(p_object, p_library, r_class_name)
  } 
}

/**
 * Casts an Object to a different type.
 */
opaque type GDExtensionInterfaceObjectCastTo = CFuncPtr2[
  GDExtensionConstObjectPtr,
  CVoidPtr,
  GDExtensionObjectPtr
]
object GDExtensionInterfaceObjectCastTo {
  given Tag[GDExtensionInterfaceObjectCastTo] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceObjectCastTo]]

  extension (func: GDExtensionInterfaceObjectCastTo) {
    def apply(
      p_object: GDExtensionConstObjectPtr,
      p_class_tag: CVoidPtr
    ): GDExtensionObjectPtr = func(p_object, p_class_tag)
  } 
}

/**
 * Gets an Object by its instance ID.
 */
opaque type GDExtensionInterfaceObjectGetInstanceFromId = CFuncPtr1[
  GDObjectInstanceID,
  GDExtensionObjectPtr
]
object GDExtensionInterfaceObjectGetInstanceFromId {
  given Tag[GDExtensionInterfaceObjectGetInstanceFromId] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceObjectGetInstanceFromId]]

  extension (func: GDExtensionInterfaceObjectGetInstanceFromId) {
    def apply(
      p_instance_id: GDObjectInstanceID
    ): GDExtensionObjectPtr = func(p_instance_id)
  } 
}

/**
 * Gets the instance ID from an Object.
 */
opaque type GDExtensionInterfaceObjectGetInstanceId = CFuncPtr1[
  GDExtensionConstObjectPtr,
  GDObjectInstanceID
]
object GDExtensionInterfaceObjectGetInstanceId {
  given Tag[GDExtensionInterfaceObjectGetInstanceId] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceObjectGetInstanceId]]

  extension (func: GDExtensionInterfaceObjectGetInstanceId) {
    def apply(
      p_object: GDExtensionConstObjectPtr
    ): GDObjectInstanceID = func(p_object)
  } 
}

/**
 * Checks if this object has a script with the given method.
 */
opaque type GDExtensionInterfaceObjectHasScriptMethod = CFuncPtr2[
  GDExtensionConstObjectPtr,
  GDExtensionConstStringNamePtr,
  GDExtensionBool
]
object GDExtensionInterfaceObjectHasScriptMethod {
  given Tag[GDExtensionInterfaceObjectHasScriptMethod] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceObjectHasScriptMethod]]

  extension (func: GDExtensionInterfaceObjectHasScriptMethod) {
    def apply(
      p_object: GDExtensionConstObjectPtr,
      p_method: GDExtensionConstStringNamePtr
    ): GDExtensionBool = func(p_object, p_method)
  } 
}

/**
 * Call the given script method on this object.
 */
opaque type GDExtensionInterfaceObjectCallScriptMethod = CFuncPtr6[
  GDExtensionObjectPtr,
  GDExtensionConstStringNamePtr,
  ConstPtr[GDExtensionConstVariantPtr],
  GDExtensionInt,
  GDExtensionUninitializedVariantPtr,
  Ptr[GDExtensionCallError],
  Unit
]
object GDExtensionInterfaceObjectCallScriptMethod {
  given Tag[GDExtensionInterfaceObjectCallScriptMethod] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceObjectCallScriptMethod]]

  extension (func: GDExtensionInterfaceObjectCallScriptMethod) {
    def apply(
      p_object: GDExtensionObjectPtr,
      p_method: GDExtensionConstStringNamePtr,
      p_args: ConstPtr[GDExtensionConstVariantPtr],
      p_argument_count: GDExtensionInt,
      r_return: GDExtensionUninitializedVariantPtr,
      r_error: Ptr[GDExtensionCallError]
    ): Unit = func(p_object, p_method, p_args, p_argument_count, r_return, r_error)
  } 
}

/**
 * Gets the Object from a reference.
 */
opaque type GDExtensionInterfaceRefGetObject = CFuncPtr1[
  GDExtensionConstRefPtr,
  GDExtensionObjectPtr
]
object GDExtensionInterfaceRefGetObject {
  given Tag[GDExtensionInterfaceRefGetObject] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceRefGetObject]]

  extension (func: GDExtensionInterfaceRefGetObject) {
    def apply(
      p_ref: GDExtensionConstRefPtr
    ): GDExtensionObjectPtr = func(p_ref)
  } 
}

/**
 * Sets the Object referred to by a reference.
 */
opaque type GDExtensionInterfaceRefSetObject = CFuncPtr2[
  GDExtensionRefPtr,
  GDExtensionObjectPtr,
  Unit
]
object GDExtensionInterfaceRefSetObject {
  given Tag[GDExtensionInterfaceRefSetObject] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceRefSetObject]]

  extension (func: GDExtensionInterfaceRefSetObject) {
    def apply(
      p_ref: GDExtensionRefPtr,
      p_object: GDExtensionObjectPtr
    ): Unit = func(p_ref, p_object)
  } 
}

/**
 * Creates a script instance that contains the given info and instance data.
 *
 * @deprecated Since 4.2. Use script_instance_create3 instead.
 */
opaque type GDExtensionInterfaceScriptInstanceCreate = CFuncPtr2[
  ConstPtr[GDExtensionScriptInstanceInfo],
  GDExtensionScriptInstanceDataPtr,
  GDExtensionScriptInstancePtr
]
object GDExtensionInterfaceScriptInstanceCreate {
  given Tag[GDExtensionInterfaceScriptInstanceCreate] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceScriptInstanceCreate]]

  extension (func: GDExtensionInterfaceScriptInstanceCreate) {
    def apply(
      p_info: ConstPtr[GDExtensionScriptInstanceInfo],
      p_instance_data: GDExtensionScriptInstanceDataPtr
    ): GDExtensionScriptInstancePtr = func(p_info, p_instance_data)
  } 
}

/**
 * Creates a script instance that contains the given info and instance data.
 *
 * @deprecated Since 4.3. Use script_instance_create3 instead.
 */
opaque type GDExtensionInterfaceScriptInstanceCreate2 = CFuncPtr2[
  ConstPtr[GDExtensionScriptInstanceInfo2],
  GDExtensionScriptInstanceDataPtr,
  GDExtensionScriptInstancePtr
]
object GDExtensionInterfaceScriptInstanceCreate2 {
  given Tag[GDExtensionInterfaceScriptInstanceCreate2] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceScriptInstanceCreate2]]

  extension (func: GDExtensionInterfaceScriptInstanceCreate2) {
    def apply(
      p_info: ConstPtr[GDExtensionScriptInstanceInfo2],
      p_instance_data: GDExtensionScriptInstanceDataPtr
    ): GDExtensionScriptInstancePtr = func(p_info, p_instance_data)
  } 
}

/**
 * Creates a script instance that contains the given info and instance data.
 */
opaque type GDExtensionInterfaceScriptInstanceCreate3 = CFuncPtr2[
  ConstPtr[GDExtensionScriptInstanceInfo3],
  GDExtensionScriptInstanceDataPtr,
  GDExtensionScriptInstancePtr
]
object GDExtensionInterfaceScriptInstanceCreate3 {
  given Tag[GDExtensionInterfaceScriptInstanceCreate3] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceScriptInstanceCreate3]]

  extension (func: GDExtensionInterfaceScriptInstanceCreate3) {
    def apply(
      p_info: ConstPtr[GDExtensionScriptInstanceInfo3],
      p_instance_data: GDExtensionScriptInstanceDataPtr
    ): GDExtensionScriptInstancePtr = func(p_info, p_instance_data)
  } 
}

/**
 * Creates a placeholder script instance for a given script and instance.
 * This interface is optional as a custom placeholder could also be created with script_instance_create().
 */
opaque type GDExtensionInterfacePlaceholderScriptInstanceCreate = CFuncPtr3[
  GDExtensionObjectPtr,
  GDExtensionObjectPtr,
  GDExtensionObjectPtr,
  GDExtensionScriptInstancePtr
]
object GDExtensionInterfacePlaceholderScriptInstanceCreate {
  given Tag[GDExtensionInterfacePlaceholderScriptInstanceCreate] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfacePlaceholderScriptInstanceCreate]]

  extension (func: GDExtensionInterfacePlaceholderScriptInstanceCreate) {
    def apply(
      p_language: GDExtensionObjectPtr,
      p_script: GDExtensionObjectPtr,
      p_owner: GDExtensionObjectPtr
    ): GDExtensionScriptInstancePtr = func(p_language, p_script, p_owner)
  } 
}

/**
 * Updates a placeholder script instance with the given properties and values.
 * The passed in placeholder must be an instance of PlaceHolderScriptInstance
 * such as the one returned by placeholder_script_instance_create().
 */
opaque type GDExtensionInterfacePlaceholderScriptInstanceUpdate = CFuncPtr3[
  GDExtensionScriptInstancePtr,
  GDExtensionConstTypePtr,
  GDExtensionConstTypePtr,
  Unit
]
object GDExtensionInterfacePlaceholderScriptInstanceUpdate {
  given Tag[GDExtensionInterfacePlaceholderScriptInstanceUpdate] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfacePlaceholderScriptInstanceUpdate]]

  extension (func: GDExtensionInterfacePlaceholderScriptInstanceUpdate) {
    def apply(
      p_placeholder: GDExtensionScriptInstancePtr,
      p_properties: GDExtensionConstTypePtr,
      p_values: GDExtensionConstTypePtr
    ): Unit = func(p_placeholder, p_properties, p_values)
  } 
}

/**
 * Get the script instance data attached to this object.
 */
opaque type GDExtensionInterfaceObjectGetScriptInstance = CFuncPtr2[
  GDExtensionConstObjectPtr,
  GDExtensionObjectPtr,
  GDExtensionScriptInstanceDataPtr
]
object GDExtensionInterfaceObjectGetScriptInstance {
  given Tag[GDExtensionInterfaceObjectGetScriptInstance] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceObjectGetScriptInstance]]

  extension (func: GDExtensionInterfaceObjectGetScriptInstance) {
    def apply(
      p_object: GDExtensionConstObjectPtr,
      p_language: GDExtensionObjectPtr
    ): GDExtensionScriptInstanceDataPtr = func(p_object, p_language)
  } 
}

/**
 * Set the script instance data attached to this object.
 */
opaque type GDExtensionInterfaceObjectSetScriptInstance = CFuncPtr2[
  GDExtensionObjectPtr,
  GDExtensionScriptInstanceDataPtr,
  Unit
]
object GDExtensionInterfaceObjectSetScriptInstance {
  given Tag[GDExtensionInterfaceObjectSetScriptInstance] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceObjectSetScriptInstance]]

  extension (func: GDExtensionInterfaceObjectSetScriptInstance) {
    def apply(
      p_object: GDExtensionObjectPtr,
      p_script_instance: GDExtensionScriptInstanceDataPtr
    ): Unit = func(p_object, p_script_instance)
  } 
}

/**
 * Creates a custom Callable object from a function pointer.
 * Provided struct can be safely freed once the function returns.
 *
 * @deprecated Since 4.3. Use callable_custom_create2 instead.
 */
opaque type GDExtensionInterfaceCallableCustomCreate = CFuncPtr2[
  GDExtensionUninitializedTypePtr,
  Ptr[GDExtensionCallableCustomInfo],
  Unit
]
object GDExtensionInterfaceCallableCustomCreate {
  given Tag[GDExtensionInterfaceCallableCustomCreate] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceCallableCustomCreate]]

  extension (func: GDExtensionInterfaceCallableCustomCreate) {
    def apply(
      r_callable: GDExtensionUninitializedTypePtr,
      p_callable_custom_info: Ptr[GDExtensionCallableCustomInfo]
    ): Unit = func(r_callable, p_callable_custom_info)
  } 
}

/**
 * Creates a custom Callable object from a function pointer.
 * Provided struct can be safely freed once the function returns.
 */
opaque type GDExtensionInterfaceCallableCustomCreate2 = CFuncPtr2[
  GDExtensionUninitializedTypePtr,
  Ptr[GDExtensionCallableCustomInfo2],
  Unit
]
object GDExtensionInterfaceCallableCustomCreate2 {
  given Tag[GDExtensionInterfaceCallableCustomCreate2] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceCallableCustomCreate2]]

  extension (func: GDExtensionInterfaceCallableCustomCreate2) {
    def apply(
      r_callable: GDExtensionUninitializedTypePtr,
      p_callable_custom_info: Ptr[GDExtensionCallableCustomInfo2]
    ): Unit = func(r_callable, p_callable_custom_info)
  } 
}

/**
 * Retrieves the userdata pointer from a custom Callable.
 * If the Callable is not a custom Callable or the token does not match the one provided to callable_custom_create() via GDExtensionCallableCustomInfo then NULL will be returned.
 */
opaque type GDExtensionInterfaceCallableCustomGetUserdata = CFuncPtr2[
  GDExtensionConstTypePtr,
  CVoidPtr,
  CVoidPtr
]
object GDExtensionInterfaceCallableCustomGetUserdata {
  given Tag[GDExtensionInterfaceCallableCustomGetUserdata] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceCallableCustomGetUserdata]]

  extension (func: GDExtensionInterfaceCallableCustomGetUserdata) {
    def apply(
      p_callable: GDExtensionConstTypePtr,
      p_token: CVoidPtr
    ): CVoidPtr = func(p_callable, p_token)
  } 
}

/**
 * Constructs an Object of the requested class.
 * The passed class must be a built-in godot class, or an already-registered extension class. In both cases, object_set_instance() should be called to fully initialize the object.
 *
 * @deprecated Since 4.4. Use classdb_construct_object2 instead.
 */
opaque type GDExtensionInterfaceClassdbConstructObject = CFuncPtr1[
  GDExtensionConstStringNamePtr,
  GDExtensionObjectPtr
]
object GDExtensionInterfaceClassdbConstructObject {
  given Tag[GDExtensionInterfaceClassdbConstructObject] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceClassdbConstructObject]]

  extension (func: GDExtensionInterfaceClassdbConstructObject) {
    def apply(
      p_classname: GDExtensionConstStringNamePtr
    ): GDExtensionObjectPtr = func(p_classname)
  } 
}

/**
 * Constructs an Object of the requested class.
 * The passed class must be a built-in godot class, or an already-registered extension class. In both cases, object_set_instance() should be called to fully initialize the object.
 * 
 * "NOTIFICATION_POSTINITIALIZE" must be sent after construction.
 */
opaque type GDExtensionInterfaceClassdbConstructObject2 = CFuncPtr1[
  GDExtensionConstStringNamePtr,
  GDExtensionObjectPtr
]
object GDExtensionInterfaceClassdbConstructObject2 {
  given Tag[GDExtensionInterfaceClassdbConstructObject2] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceClassdbConstructObject2]]

  extension (func: GDExtensionInterfaceClassdbConstructObject2) {
    def apply(
      p_classname: GDExtensionConstStringNamePtr
    ): GDExtensionObjectPtr = func(p_classname)
  } 
}

/**
 * Gets a pointer to the MethodBind in ClassDB for the given class, method and hash.
 */
opaque type GDExtensionInterfaceClassdbGetMethodBind = CFuncPtr3[
  GDExtensionConstStringNamePtr,
  GDExtensionConstStringNamePtr,
  GDExtensionInt,
  GDExtensionMethodBindPtr
]
object GDExtensionInterfaceClassdbGetMethodBind {
  given Tag[GDExtensionInterfaceClassdbGetMethodBind] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceClassdbGetMethodBind]]

  extension (func: GDExtensionInterfaceClassdbGetMethodBind) {
    def apply(
      p_classname: GDExtensionConstStringNamePtr,
      p_methodname: GDExtensionConstStringNamePtr,
      p_hash: GDExtensionInt
    ): GDExtensionMethodBindPtr = func(p_classname, p_methodname, p_hash)
  } 
}

/**
 * Gets a pointer uniquely identifying the given built-in class in the ClassDB.
 */
opaque type GDExtensionInterfaceClassdbGetClassTag = CFuncPtr1[
  GDExtensionConstStringNamePtr,
  CVoidPtr
]
object GDExtensionInterfaceClassdbGetClassTag {
  given Tag[GDExtensionInterfaceClassdbGetClassTag] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceClassdbGetClassTag]]

  extension (func: GDExtensionInterfaceClassdbGetClassTag) {
    def apply(
      p_classname: GDExtensionConstStringNamePtr
    ): CVoidPtr = func(p_classname)
  } 
}

/**
 * Registers an extension class in the ClassDB.
 * Provided struct can be safely freed once the function returns.
 *
 * @deprecated Since 4.2. Use classdb_register_extension_class5 instead.
 */
opaque type GDExtensionInterfaceClassdbRegisterExtensionClass = CFuncPtr4[
  GDExtensionClassLibraryPtr,
  GDExtensionConstStringNamePtr,
  GDExtensionConstStringNamePtr,
  ConstPtr[GDExtensionClassCreationInfo],
  Unit
]
object GDExtensionInterfaceClassdbRegisterExtensionClass {
  given Tag[GDExtensionInterfaceClassdbRegisterExtensionClass] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceClassdbRegisterExtensionClass]]

  extension (func: GDExtensionInterfaceClassdbRegisterExtensionClass) {
    def apply(
      p_library: GDExtensionClassLibraryPtr,
      p_class_name: GDExtensionConstStringNamePtr,
      p_parent_class_name: GDExtensionConstStringNamePtr,
      p_extension_funcs: ConstPtr[GDExtensionClassCreationInfo]
    ): Unit = func(p_library, p_class_name, p_parent_class_name, p_extension_funcs)
  } 
}

/**
 * Registers an extension class in the ClassDB.
 * Provided struct can be safely freed once the function returns.
 *
 * @deprecated Since 4.3. Use classdb_register_extension_class5 instead.
 */
opaque type GDExtensionInterfaceClassdbRegisterExtensionClass2 = CFuncPtr4[
  GDExtensionClassLibraryPtr,
  GDExtensionConstStringNamePtr,
  GDExtensionConstStringNamePtr,
  ConstPtr[GDExtensionClassCreationInfo2],
  Unit
]
object GDExtensionInterfaceClassdbRegisterExtensionClass2 {
  given Tag[GDExtensionInterfaceClassdbRegisterExtensionClass2] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceClassdbRegisterExtensionClass2]]

  extension (func: GDExtensionInterfaceClassdbRegisterExtensionClass2) {
    def apply(
      p_library: GDExtensionClassLibraryPtr,
      p_class_name: GDExtensionConstStringNamePtr,
      p_parent_class_name: GDExtensionConstStringNamePtr,
      p_extension_funcs: ConstPtr[GDExtensionClassCreationInfo2]
    ): Unit = func(p_library, p_class_name, p_parent_class_name, p_extension_funcs)
  } 
}

/**
 * Registers an extension class in the ClassDB.
 * Provided struct can be safely freed once the function returns.
 *
 * @deprecated Since 4.4. Use classdb_register_extension_class5 instead.
 */
opaque type GDExtensionInterfaceClassdbRegisterExtensionClass3 = CFuncPtr4[
  GDExtensionClassLibraryPtr,
  GDExtensionConstStringNamePtr,
  GDExtensionConstStringNamePtr,
  ConstPtr[GDExtensionClassCreationInfo3],
  Unit
]
object GDExtensionInterfaceClassdbRegisterExtensionClass3 {
  given Tag[GDExtensionInterfaceClassdbRegisterExtensionClass3] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceClassdbRegisterExtensionClass3]]

  extension (func: GDExtensionInterfaceClassdbRegisterExtensionClass3) {
    def apply(
      p_library: GDExtensionClassLibraryPtr,
      p_class_name: GDExtensionConstStringNamePtr,
      p_parent_class_name: GDExtensionConstStringNamePtr,
      p_extension_funcs: ConstPtr[GDExtensionClassCreationInfo3]
    ): Unit = func(p_library, p_class_name, p_parent_class_name, p_extension_funcs)
  } 
}

/**
 * Registers an extension class in the ClassDB.
 * Provided struct can be safely freed once the function returns.
 *
 * @deprecated Since 4.5. Use classdb_register_extension_class5 instead.
 */
opaque type GDExtensionInterfaceClassdbRegisterExtensionClass4 = CFuncPtr4[
  GDExtensionClassLibraryPtr,
  GDExtensionConstStringNamePtr,
  GDExtensionConstStringNamePtr,
  ConstPtr[GDExtensionClassCreationInfo4],
  Unit
]
object GDExtensionInterfaceClassdbRegisterExtensionClass4 {
  given Tag[GDExtensionInterfaceClassdbRegisterExtensionClass4] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceClassdbRegisterExtensionClass4]]

  extension (func: GDExtensionInterfaceClassdbRegisterExtensionClass4) {
    def apply(
      p_library: GDExtensionClassLibraryPtr,
      p_class_name: GDExtensionConstStringNamePtr,
      p_parent_class_name: GDExtensionConstStringNamePtr,
      p_extension_funcs: ConstPtr[GDExtensionClassCreationInfo4]
    ): Unit = func(p_library, p_class_name, p_parent_class_name, p_extension_funcs)
  } 
}

/**
 * Registers an extension class in the ClassDB.
 * Provided struct can be safely freed once the function returns.
 */
opaque type GDExtensionInterfaceClassdbRegisterExtensionClass5 = CFuncPtr4[
  GDExtensionClassLibraryPtr,
  GDExtensionConstStringNamePtr,
  GDExtensionConstStringNamePtr,
  ConstPtr[GDExtensionClassCreationInfo5],
  Unit
]
object GDExtensionInterfaceClassdbRegisterExtensionClass5 {
  given Tag[GDExtensionInterfaceClassdbRegisterExtensionClass5] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceClassdbRegisterExtensionClass5]]

  extension (func: GDExtensionInterfaceClassdbRegisterExtensionClass5) {
    def apply(
      p_library: GDExtensionClassLibraryPtr,
      p_class_name: GDExtensionConstStringNamePtr,
      p_parent_class_name: GDExtensionConstStringNamePtr,
      p_extension_funcs: ConstPtr[GDExtensionClassCreationInfo5]
    ): Unit = func(p_library, p_class_name, p_parent_class_name, p_extension_funcs)
  } 
}

/**
 * Registers a method on an extension class in the ClassDB.
 * Provided struct can be safely freed once the function returns.
 */
opaque type GDExtensionInterfaceClassdbRegisterExtensionClassMethod = CFuncPtr3[
  GDExtensionClassLibraryPtr,
  GDExtensionConstStringNamePtr,
  ConstPtr[GDExtensionClassMethodInfo],
  Unit
]
object GDExtensionInterfaceClassdbRegisterExtensionClassMethod {
  given Tag[GDExtensionInterfaceClassdbRegisterExtensionClassMethod] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceClassdbRegisterExtensionClassMethod]]

  extension (func: GDExtensionInterfaceClassdbRegisterExtensionClassMethod) {
    def apply(
      p_library: GDExtensionClassLibraryPtr,
      p_class_name: GDExtensionConstStringNamePtr,
      p_method_info: ConstPtr[GDExtensionClassMethodInfo]
    ): Unit = func(p_library, p_class_name, p_method_info)
  } 
}

/**
 * Registers a virtual method on an extension class in ClassDB, that can be implemented by scripts or other extensions.
 * Provided struct can be safely freed once the function returns.
 */
opaque type GDExtensionInterfaceClassdbRegisterExtensionClassVirtualMethod = CFuncPtr3[
  GDExtensionClassLibraryPtr,
  GDExtensionConstStringNamePtr,
  ConstPtr[GDExtensionClassVirtualMethodInfo],
  Unit
]
object GDExtensionInterfaceClassdbRegisterExtensionClassVirtualMethod {
  given Tag[GDExtensionInterfaceClassdbRegisterExtensionClassVirtualMethod] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceClassdbRegisterExtensionClassVirtualMethod]]

  extension (func: GDExtensionInterfaceClassdbRegisterExtensionClassVirtualMethod) {
    def apply(
      p_library: GDExtensionClassLibraryPtr,
      p_class_name: GDExtensionConstStringNamePtr,
      p_method_info: ConstPtr[GDExtensionClassVirtualMethodInfo]
    ): Unit = func(p_library, p_class_name, p_method_info)
  } 
}

/**
 * Registers an integer constant on an extension class in the ClassDB.
 * Note about registering bitfield values (if p_is_bitfield is true): even though p_constant_value is signed, language bindings are
 * advised to treat bitfields as uint64_t, since this is generally clearer and can prevent mistakes like using -1 for setting all bits.
 * Language APIs should thus provide an abstraction that registers bitfields (uint64_t) separately from regular constants (int64_t).
 */
opaque type GDExtensionInterfaceClassdbRegisterExtensionClassIntegerConstant = CFuncPtr6[
  GDExtensionClassLibraryPtr,
  GDExtensionConstStringNamePtr,
  GDExtensionConstStringNamePtr,
  GDExtensionConstStringNamePtr,
  GDExtensionInt,
  GDExtensionBool,
  Unit
]
object GDExtensionInterfaceClassdbRegisterExtensionClassIntegerConstant {
  given Tag[GDExtensionInterfaceClassdbRegisterExtensionClassIntegerConstant] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceClassdbRegisterExtensionClassIntegerConstant]]

  extension (func: GDExtensionInterfaceClassdbRegisterExtensionClassIntegerConstant) {
    def apply(
      p_library: GDExtensionClassLibraryPtr,
      p_class_name: GDExtensionConstStringNamePtr,
      p_enum_name: GDExtensionConstStringNamePtr,
      p_constant_name: GDExtensionConstStringNamePtr,
      p_constant_value: GDExtensionInt,
      p_is_bitfield: GDExtensionBool
    ): Unit = func(p_library, p_class_name, p_enum_name, p_constant_name, p_constant_value, p_is_bitfield)
  } 
}

/**
 * Registers a property on an extension class in the ClassDB.
 * Provided struct can be safely freed once the function returns.
 */
opaque type GDExtensionInterfaceClassdbRegisterExtensionClassProperty = CFuncPtr5[
  GDExtensionClassLibraryPtr,
  GDExtensionConstStringNamePtr,
  ConstPtr[GDExtensionPropertyInfo],
  GDExtensionConstStringNamePtr,
  GDExtensionConstStringNamePtr,
  Unit
]
object GDExtensionInterfaceClassdbRegisterExtensionClassProperty {
  given Tag[GDExtensionInterfaceClassdbRegisterExtensionClassProperty] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceClassdbRegisterExtensionClassProperty]]

  extension (func: GDExtensionInterfaceClassdbRegisterExtensionClassProperty) {
    def apply(
      p_library: GDExtensionClassLibraryPtr,
      p_class_name: GDExtensionConstStringNamePtr,
      p_info: ConstPtr[GDExtensionPropertyInfo],
      p_setter: GDExtensionConstStringNamePtr,
      p_getter: GDExtensionConstStringNamePtr
    ): Unit = func(p_library, p_class_name, p_info, p_setter, p_getter)
  } 
}

/**
 * Registers an indexed property on an extension class in the ClassDB.
 * Provided struct can be safely freed once the function returns.
 */
opaque type GDExtensionInterfaceClassdbRegisterExtensionClassPropertyIndexed = CFuncPtr6[
  GDExtensionClassLibraryPtr,
  GDExtensionConstStringNamePtr,
  ConstPtr[GDExtensionPropertyInfo],
  GDExtensionConstStringNamePtr,
  GDExtensionConstStringNamePtr,
  GDExtensionInt,
  Unit
]
object GDExtensionInterfaceClassdbRegisterExtensionClassPropertyIndexed {
  given Tag[GDExtensionInterfaceClassdbRegisterExtensionClassPropertyIndexed] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceClassdbRegisterExtensionClassPropertyIndexed]]

  extension (func: GDExtensionInterfaceClassdbRegisterExtensionClassPropertyIndexed) {
    def apply(
      p_library: GDExtensionClassLibraryPtr,
      p_class_name: GDExtensionConstStringNamePtr,
      p_info: ConstPtr[GDExtensionPropertyInfo],
      p_setter: GDExtensionConstStringNamePtr,
      p_getter: GDExtensionConstStringNamePtr,
      p_index: GDExtensionInt
    ): Unit = func(p_library, p_class_name, p_info, p_setter, p_getter, p_index)
  } 
}

/**
 * Registers a property group on an extension class in the ClassDB.
 */
opaque type GDExtensionInterfaceClassdbRegisterExtensionClassPropertyGroup = CFuncPtr4[
  GDExtensionClassLibraryPtr,
  GDExtensionConstStringNamePtr,
  GDExtensionConstStringPtr,
  GDExtensionConstStringPtr,
  Unit
]
object GDExtensionInterfaceClassdbRegisterExtensionClassPropertyGroup {
  given Tag[GDExtensionInterfaceClassdbRegisterExtensionClassPropertyGroup] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceClassdbRegisterExtensionClassPropertyGroup]]

  extension (func: GDExtensionInterfaceClassdbRegisterExtensionClassPropertyGroup) {
    def apply(
      p_library: GDExtensionClassLibraryPtr,
      p_class_name: GDExtensionConstStringNamePtr,
      p_group_name: GDExtensionConstStringPtr,
      p_prefix: GDExtensionConstStringPtr
    ): Unit = func(p_library, p_class_name, p_group_name, p_prefix)
  } 
}

/**
 * Registers a property subgroup on an extension class in the ClassDB.
 */
opaque type GDExtensionInterfaceClassdbRegisterExtensionClassPropertySubgroup = CFuncPtr4[
  GDExtensionClassLibraryPtr,
  GDExtensionConstStringNamePtr,
  GDExtensionConstStringPtr,
  GDExtensionConstStringPtr,
  Unit
]
object GDExtensionInterfaceClassdbRegisterExtensionClassPropertySubgroup {
  given Tag[GDExtensionInterfaceClassdbRegisterExtensionClassPropertySubgroup] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceClassdbRegisterExtensionClassPropertySubgroup]]

  extension (func: GDExtensionInterfaceClassdbRegisterExtensionClassPropertySubgroup) {
    def apply(
      p_library: GDExtensionClassLibraryPtr,
      p_class_name: GDExtensionConstStringNamePtr,
      p_subgroup_name: GDExtensionConstStringPtr,
      p_prefix: GDExtensionConstStringPtr
    ): Unit = func(p_library, p_class_name, p_subgroup_name, p_prefix)
  } 
}

/**
 * Registers a signal on an extension class in the ClassDB.
 * Provided structs can be safely freed once the function returns.
 */
opaque type GDExtensionInterfaceClassdbRegisterExtensionClassSignal = CFuncPtr5[
  GDExtensionClassLibraryPtr,
  GDExtensionConstStringNamePtr,
  GDExtensionConstStringNamePtr,
  ConstPtr[GDExtensionPropertyInfo],
  GDExtensionInt,
  Unit
]
object GDExtensionInterfaceClassdbRegisterExtensionClassSignal {
  given Tag[GDExtensionInterfaceClassdbRegisterExtensionClassSignal] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceClassdbRegisterExtensionClassSignal]]

  extension (func: GDExtensionInterfaceClassdbRegisterExtensionClassSignal) {
    def apply(
      p_library: GDExtensionClassLibraryPtr,
      p_class_name: GDExtensionConstStringNamePtr,
      p_signal_name: GDExtensionConstStringNamePtr,
      p_argument_info: ConstPtr[GDExtensionPropertyInfo],
      p_argument_count: GDExtensionInt
    ): Unit = func(p_library, p_class_name, p_signal_name, p_argument_info, p_argument_count)
  } 
}

/**
 * Unregisters an extension class in the ClassDB.
 * Unregistering a parent class before a class that inherits it will result in failure. Inheritors must be unregistered first.
 */
opaque type GDExtensionInterfaceClassdbUnregisterExtensionClass = CFuncPtr2[
  GDExtensionClassLibraryPtr,
  GDExtensionConstStringNamePtr,
  Unit
]
object GDExtensionInterfaceClassdbUnregisterExtensionClass {
  given Tag[GDExtensionInterfaceClassdbUnregisterExtensionClass] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceClassdbUnregisterExtensionClass]]

  extension (func: GDExtensionInterfaceClassdbUnregisterExtensionClass) {
    def apply(
      p_library: GDExtensionClassLibraryPtr,
      p_class_name: GDExtensionConstStringNamePtr
    ): Unit = func(p_library, p_class_name)
  } 
}

/**
 * Gets the path to the current GDExtension library.
 */
opaque type GDExtensionInterfaceGetLibraryPath = CFuncPtr2[
  GDExtensionClassLibraryPtr,
  GDExtensionUninitializedStringPtr,
  Unit
]
object GDExtensionInterfaceGetLibraryPath {
  given Tag[GDExtensionInterfaceGetLibraryPath] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceGetLibraryPath]]

  extension (func: GDExtensionInterfaceGetLibraryPath) {
    def apply(
      p_library: GDExtensionClassLibraryPtr,
      r_path: GDExtensionUninitializedStringPtr
    ): Unit = func(p_library, r_path)
  } 
}

/**
 * Adds an editor plugin.
 * It's safe to call during initialization.
 */
opaque type GDExtensionInterfaceEditorAddPlugin = CFuncPtr1[
  GDExtensionConstStringNamePtr,
  Unit
]
object GDExtensionInterfaceEditorAddPlugin {
  given Tag[GDExtensionInterfaceEditorAddPlugin] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceEditorAddPlugin]]

  extension (func: GDExtensionInterfaceEditorAddPlugin) {
    def apply(
      p_class_name: GDExtensionConstStringNamePtr
    ): Unit = func(p_class_name)
  } 
}

/**
 * Removes an editor plugin.
 */
opaque type GDExtensionInterfaceEditorRemovePlugin = CFuncPtr1[
  GDExtensionConstStringNamePtr,
  Unit
]
object GDExtensionInterfaceEditorRemovePlugin {
  given Tag[GDExtensionInterfaceEditorRemovePlugin] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceEditorRemovePlugin]]

  extension (func: GDExtensionInterfaceEditorRemovePlugin) {
    def apply(
      p_class_name: GDExtensionConstStringNamePtr
    ): Unit = func(p_class_name)
  } 
}

/**
 * Loads new XML-formatted documentation data in the editor.
 * The provided pointer can be immediately freed once the function returns.
 */
opaque type GDExtensionInterfaceEditorHelpLoadXmlFromUtf8Chars = CFuncPtr1[
  ConstPtr[CChar],
  Unit
]
object GDExtensionInterfaceEditorHelpLoadXmlFromUtf8Chars {
  given Tag[GDExtensionInterfaceEditorHelpLoadXmlFromUtf8Chars] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceEditorHelpLoadXmlFromUtf8Chars]]

  extension (func: GDExtensionInterfaceEditorHelpLoadXmlFromUtf8Chars) {
    def apply(
      p_data: ConstPtr[CChar]
    ): Unit = func(p_data)
  } 
}

/**
 * Loads new XML-formatted documentation data in the editor.
 * The provided pointer can be immediately freed once the function returns.
 */
opaque type GDExtensionInterfaceEditorHelpLoadXmlFromUtf8CharsAndLen = CFuncPtr2[
  ConstPtr[CChar],
  GDExtensionInt,
  Unit
]
object GDExtensionInterfaceEditorHelpLoadXmlFromUtf8CharsAndLen {
  given Tag[GDExtensionInterfaceEditorHelpLoadXmlFromUtf8CharsAndLen] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceEditorHelpLoadXmlFromUtf8CharsAndLen]]

  extension (func: GDExtensionInterfaceEditorHelpLoadXmlFromUtf8CharsAndLen) {
    def apply(
      p_data: ConstPtr[CChar],
      p_size: GDExtensionInt
    ): Unit = func(p_data, p_size)
  } 
}

/**
 * Registers a callback that Godot can call to get the list of all classes (from ClassDB) that may be used by the calling GDExtension.
 * This is used by the editor to generate a build profile (in "Tools" > "Engine Compilation Configuration Editor..." > "Detect from project"),
 * in order to recompile Godot with only the classes used.
 * In the provided callback, the GDExtension should provide the list of classes that _may_ be used statically, thus the time of invocation shouldn't matter.
 * If a GDExtension doesn't register a callback, Godot will assume that it could be using any classes.
 */
opaque type GDExtensionInterfaceEditorRegisterGetClassesUsedCallback = CFuncPtr2[
  GDExtensionClassLibraryPtr,
  GDExtensionEditorGetClassesUsedCallback,
  Unit
]
object GDExtensionInterfaceEditorRegisterGetClassesUsedCallback {
  given Tag[GDExtensionInterfaceEditorRegisterGetClassesUsedCallback] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceEditorRegisterGetClassesUsedCallback]]

  extension (func: GDExtensionInterfaceEditorRegisterGetClassesUsedCallback) {
    def apply(
      p_library: GDExtensionClassLibraryPtr,
      p_callback: GDExtensionEditorGetClassesUsedCallback
    ): Unit = func(p_library, p_callback)
  } 
}

/**
 * Registers callbacks to be called at different phases of the main loop.
 */
opaque type GDExtensionInterfaceRegisterMainLoopCallbacks = CFuncPtr2[
  GDExtensionClassLibraryPtr,
  ConstPtr[GDExtensionMainLoopCallbacks],
  Unit
]
object GDExtensionInterfaceRegisterMainLoopCallbacks {
  given Tag[GDExtensionInterfaceRegisterMainLoopCallbacks] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[GDExtensionInterfaceRegisterMainLoopCallbacks]]

  extension (func: GDExtensionInterfaceRegisterMainLoopCallbacks) {
    def apply(
      p_library: GDExtensionClassLibraryPtr,
      p_callbacks: ConstPtr[GDExtensionMainLoopCallbacks]
    ): Unit = func(p_library, p_callbacks)
  } 
}


class Interface private(
  val get_godot_version: GDExtensionInterfaceGetGodotVersion,
  val get_godot_version2: GDExtensionInterfaceGetGodotVersion2,
  val mem_alloc: GDExtensionInterfaceMemAlloc,
  val mem_realloc: GDExtensionInterfaceMemRealloc,
  val mem_free: GDExtensionInterfaceMemFree,
  val mem_alloc2: GDExtensionInterfaceMemAlloc2,
  val mem_realloc2: GDExtensionInterfaceMemRealloc2,
  val mem_free2: GDExtensionInterfaceMemFree2,
  val print_error: GDExtensionInterfacePrintError,
  val print_error_with_message: GDExtensionInterfacePrintErrorWithMessage,
  val print_warning: GDExtensionInterfacePrintWarning,
  val print_warning_with_message: GDExtensionInterfacePrintWarningWithMessage,
  val print_script_error: GDExtensionInterfacePrintScriptError,
  val print_script_error_with_message: GDExtensionInterfacePrintScriptErrorWithMessage,
  val get_native_struct_size: GDExtensionInterfaceGetNativeStructSize,
  val variant_new_copy: GDExtensionInterfaceVariantNewCopy,
  val variant_new_nil: GDExtensionInterfaceVariantNewNil,
  val variant_destroy: GDExtensionInterfaceVariantDestroy,
  val variant_call: GDExtensionInterfaceVariantCall,
  val variant_call_static: GDExtensionInterfaceVariantCallStatic,
  val variant_evaluate: GDExtensionInterfaceVariantEvaluate,
  val variant_set: GDExtensionInterfaceVariantSet,
  val variant_set_named: GDExtensionInterfaceVariantSetNamed,
  val variant_set_keyed: GDExtensionInterfaceVariantSetKeyed,
  val variant_set_indexed: GDExtensionInterfaceVariantSetIndexed,
  val variant_get: GDExtensionInterfaceVariantGet,
  val variant_get_named: GDExtensionInterfaceVariantGetNamed,
  val variant_get_keyed: GDExtensionInterfaceVariantGetKeyed,
  val variant_get_indexed: GDExtensionInterfaceVariantGetIndexed,
  val variant_iter_init: GDExtensionInterfaceVariantIterInit,
  val variant_iter_next: GDExtensionInterfaceVariantIterNext,
  val variant_iter_get: GDExtensionInterfaceVariantIterGet,
  val variant_hash: GDExtensionInterfaceVariantHash,
  val variant_recursive_hash: GDExtensionInterfaceVariantRecursiveHash,
  val variant_hash_compare: GDExtensionInterfaceVariantHashCompare,
  val variant_booleanize: GDExtensionInterfaceVariantBooleanize,
  val variant_duplicate: GDExtensionInterfaceVariantDuplicate,
  val variant_stringify: GDExtensionInterfaceVariantStringify,
  val variant_get_type: GDExtensionInterfaceVariantGetType,
  val variant_has_method: GDExtensionInterfaceVariantHasMethod,
  val variant_has_member: GDExtensionInterfaceVariantHasMember,
  val variant_has_key: GDExtensionInterfaceVariantHasKey,
  val variant_get_object_instance_id: GDExtensionInterfaceVariantGetObjectInstanceId,
  val variant_get_type_name: GDExtensionInterfaceVariantGetTypeName,
  val variant_can_convert: GDExtensionInterfaceVariantCanConvert,
  val variant_can_convert_strict: GDExtensionInterfaceVariantCanConvertStrict,
  val get_variant_from_type_constructor: GDExtensionInterfaceGetVariantFromTypeConstructor,
  val get_variant_to_type_constructor: GDExtensionInterfaceGetVariantToTypeConstructor,
  val variant_get_ptr_internal_getter: GDExtensionInterfaceVariantGetPtrInternalGetter,
  val variant_get_ptr_operator_evaluator: GDExtensionInterfaceVariantGetPtrOperatorEvaluator,
  val variant_get_ptr_builtin_method: GDExtensionInterfaceVariantGetPtrBuiltinMethod,
  val variant_get_ptr_constructor: GDExtensionInterfaceVariantGetPtrConstructor,
  val variant_get_ptr_destructor: GDExtensionInterfaceVariantGetPtrDestructor,
  val variant_construct: GDExtensionInterfaceVariantConstruct,
  val variant_get_ptr_setter: GDExtensionInterfaceVariantGetPtrSetter,
  val variant_get_ptr_getter: GDExtensionInterfaceVariantGetPtrGetter,
  val variant_get_ptr_indexed_setter: GDExtensionInterfaceVariantGetPtrIndexedSetter,
  val variant_get_ptr_indexed_getter: GDExtensionInterfaceVariantGetPtrIndexedGetter,
  val variant_get_ptr_keyed_setter: GDExtensionInterfaceVariantGetPtrKeyedSetter,
  val variant_get_ptr_keyed_getter: GDExtensionInterfaceVariantGetPtrKeyedGetter,
  val variant_get_ptr_keyed_checker: GDExtensionInterfaceVariantGetPtrKeyedChecker,
  val variant_get_constant_value: GDExtensionInterfaceVariantGetConstantValue,
  val variant_get_ptr_utility_function: GDExtensionInterfaceVariantGetPtrUtilityFunction,
  val string_new_with_latin1_chars: GDExtensionInterfaceStringNewWithLatin1Chars,
  val string_new_with_utf8_chars: GDExtensionInterfaceStringNewWithUtf8Chars,
  val string_new_with_utf16_chars: GDExtensionInterfaceStringNewWithUtf16Chars,
  val string_new_with_utf32_chars: GDExtensionInterfaceStringNewWithUtf32Chars,
  val string_new_with_wide_chars: GDExtensionInterfaceStringNewWithWideChars,
  val string_new_with_latin1_chars_and_len: GDExtensionInterfaceStringNewWithLatin1CharsAndLen,
  val string_new_with_utf8_chars_and_len: GDExtensionInterfaceStringNewWithUtf8CharsAndLen,
  val string_new_with_utf8_chars_and_len2: GDExtensionInterfaceStringNewWithUtf8CharsAndLen2,
  val string_new_with_utf16_chars_and_len: GDExtensionInterfaceStringNewWithUtf16CharsAndLen,
  val string_new_with_utf16_chars_and_len2: GDExtensionInterfaceStringNewWithUtf16CharsAndLen2,
  val string_new_with_utf32_chars_and_len: GDExtensionInterfaceStringNewWithUtf32CharsAndLen,
  val string_new_with_wide_chars_and_len: GDExtensionInterfaceStringNewWithWideCharsAndLen,
  val string_to_latin1_chars: GDExtensionInterfaceStringToLatin1Chars,
  val string_to_utf8_chars: GDExtensionInterfaceStringToUtf8Chars,
  val string_to_utf16_chars: GDExtensionInterfaceStringToUtf16Chars,
  val string_to_utf32_chars: GDExtensionInterfaceStringToUtf32Chars,
  val string_to_wide_chars: GDExtensionInterfaceStringToWideChars,
  val string_operator_index: GDExtensionInterfaceStringOperatorIndex,
  val string_operator_index_const: GDExtensionInterfaceStringOperatorIndexConst,
  val string_operator_plus_eq_string: GDExtensionInterfaceStringOperatorPlusEqString,
  val string_operator_plus_eq_char: GDExtensionInterfaceStringOperatorPlusEqChar,
  val string_operator_plus_eq_cstr: GDExtensionInterfaceStringOperatorPlusEqCstr,
  val string_operator_plus_eq_wcstr: GDExtensionInterfaceStringOperatorPlusEqWcstr,
  val string_operator_plus_eq_c32str: GDExtensionInterfaceStringOperatorPlusEqC32str,
  val string_resize: GDExtensionInterfaceStringResize,
  val string_name_new_with_latin1_chars: GDExtensionInterfaceStringNameNewWithLatin1Chars,
  val string_name_new_with_utf8_chars: GDExtensionInterfaceStringNameNewWithUtf8Chars,
  val string_name_new_with_utf8_chars_and_len: GDExtensionInterfaceStringNameNewWithUtf8CharsAndLen,
  val xml_parser_open_buffer: GDExtensionInterfaceXmlParserOpenBuffer,
  val file_access_store_buffer: GDExtensionInterfaceFileAccessStoreBuffer,
  val file_access_get_buffer: GDExtensionInterfaceFileAccessGetBuffer,
  val image_ptrw: GDExtensionInterfaceImagePtrw,
  val image_ptr: GDExtensionInterfaceImagePtr,
  val worker_thread_pool_add_native_group_task: GDExtensionInterfaceWorkerThreadPoolAddNativeGroupTask,
  val worker_thread_pool_add_native_task: GDExtensionInterfaceWorkerThreadPoolAddNativeTask,
  val packed_byte_array_operator_index: GDExtensionInterfacePackedByteArrayOperatorIndex,
  val packed_byte_array_operator_index_const: GDExtensionInterfacePackedByteArrayOperatorIndexConst,
  val packed_float32_array_operator_index: GDExtensionInterfacePackedFloat32ArrayOperatorIndex,
  val packed_float32_array_operator_index_const: GDExtensionInterfacePackedFloat32ArrayOperatorIndexConst,
  val packed_float64_array_operator_index: GDExtensionInterfacePackedFloat64ArrayOperatorIndex,
  val packed_float64_array_operator_index_const: GDExtensionInterfacePackedFloat64ArrayOperatorIndexConst,
  val packed_int32_array_operator_index: GDExtensionInterfacePackedInt32ArrayOperatorIndex,
  val packed_int32_array_operator_index_const: GDExtensionInterfacePackedInt32ArrayOperatorIndexConst,
  val packed_int64_array_operator_index: GDExtensionInterfacePackedInt64ArrayOperatorIndex,
  val packed_int64_array_operator_index_const: GDExtensionInterfacePackedInt64ArrayOperatorIndexConst,
  val packed_string_array_operator_index: GDExtensionInterfacePackedStringArrayOperatorIndex,
  val packed_string_array_operator_index_const: GDExtensionInterfacePackedStringArrayOperatorIndexConst,
  val packed_vector2_array_operator_index: GDExtensionInterfacePackedVector2ArrayOperatorIndex,
  val packed_vector2_array_operator_index_const: GDExtensionInterfacePackedVector2ArrayOperatorIndexConst,
  val packed_vector3_array_operator_index: GDExtensionInterfacePackedVector3ArrayOperatorIndex,
  val packed_vector3_array_operator_index_const: GDExtensionInterfacePackedVector3ArrayOperatorIndexConst,
  val packed_vector4_array_operator_index: GDExtensionInterfacePackedVector4ArrayOperatorIndex,
  val packed_vector4_array_operator_index_const: GDExtensionInterfacePackedVector4ArrayOperatorIndexConst,
  val packed_color_array_operator_index: GDExtensionInterfacePackedColorArrayOperatorIndex,
  val packed_color_array_operator_index_const: GDExtensionInterfacePackedColorArrayOperatorIndexConst,
  val array_operator_index: GDExtensionInterfaceArrayOperatorIndex,
  val array_operator_index_const: GDExtensionInterfaceArrayOperatorIndexConst,
  val array_ref: GDExtensionInterfaceArrayRef,
  val array_set_typed: GDExtensionInterfaceArraySetTyped,
  val dictionary_operator_index: GDExtensionInterfaceDictionaryOperatorIndex,
  val dictionary_operator_index_const: GDExtensionInterfaceDictionaryOperatorIndexConst,
  val dictionary_set_typed: GDExtensionInterfaceDictionarySetTyped,
  val object_method_bind_call: GDExtensionInterfaceObjectMethodBindCall,
  val object_method_bind_ptrcall: GDExtensionInterfaceObjectMethodBindPtrcall,
  val object_destroy: GDExtensionInterfaceObjectDestroy,
  val global_get_singleton: GDExtensionInterfaceGlobalGetSingleton,
  val object_get_instance_binding: GDExtensionInterfaceObjectGetInstanceBinding,
  val object_set_instance_binding: GDExtensionInterfaceObjectSetInstanceBinding,
  val object_free_instance_binding: GDExtensionInterfaceObjectFreeInstanceBinding,
  val object_set_instance: GDExtensionInterfaceObjectSetInstance,
  val object_get_class_name: GDExtensionInterfaceObjectGetClassName,
  val object_cast_to: GDExtensionInterfaceObjectCastTo,
  val object_get_instance_from_id: GDExtensionInterfaceObjectGetInstanceFromId,
  val object_get_instance_id: GDExtensionInterfaceObjectGetInstanceId,
  val object_has_script_method: GDExtensionInterfaceObjectHasScriptMethod,
  val object_call_script_method: GDExtensionInterfaceObjectCallScriptMethod,
  val ref_get_object: GDExtensionInterfaceRefGetObject,
  val ref_set_object: GDExtensionInterfaceRefSetObject,
  val script_instance_create: GDExtensionInterfaceScriptInstanceCreate,
  val script_instance_create2: GDExtensionInterfaceScriptInstanceCreate2,
  val script_instance_create3: GDExtensionInterfaceScriptInstanceCreate3,
  val placeholder_script_instance_create: GDExtensionInterfacePlaceholderScriptInstanceCreate,
  val placeholder_script_instance_update: GDExtensionInterfacePlaceholderScriptInstanceUpdate,
  val object_get_script_instance: GDExtensionInterfaceObjectGetScriptInstance,
  val object_set_script_instance: GDExtensionInterfaceObjectSetScriptInstance,
  val callable_custom_create: GDExtensionInterfaceCallableCustomCreate,
  val callable_custom_create2: GDExtensionInterfaceCallableCustomCreate2,
  val callable_custom_get_userdata: GDExtensionInterfaceCallableCustomGetUserdata,
  val classdb_construct_object: GDExtensionInterfaceClassdbConstructObject,
  val classdb_construct_object2: GDExtensionInterfaceClassdbConstructObject2,
  val classdb_get_method_bind: GDExtensionInterfaceClassdbGetMethodBind,
  val classdb_get_class_tag: GDExtensionInterfaceClassdbGetClassTag,
  val classdb_register_extension_class: GDExtensionInterfaceClassdbRegisterExtensionClass,
  val classdb_register_extension_class2: GDExtensionInterfaceClassdbRegisterExtensionClass2,
  val classdb_register_extension_class3: GDExtensionInterfaceClassdbRegisterExtensionClass3,
  val classdb_register_extension_class4: GDExtensionInterfaceClassdbRegisterExtensionClass4,
  val classdb_register_extension_class5: GDExtensionInterfaceClassdbRegisterExtensionClass5,
  val classdb_register_extension_class_method: GDExtensionInterfaceClassdbRegisterExtensionClassMethod,
  val classdb_register_extension_class_virtual_method: GDExtensionInterfaceClassdbRegisterExtensionClassVirtualMethod,
  val classdb_register_extension_class_integer_constant: GDExtensionInterfaceClassdbRegisterExtensionClassIntegerConstant,
  val classdb_register_extension_class_property: GDExtensionInterfaceClassdbRegisterExtensionClassProperty,
  val classdb_register_extension_class_property_indexed: GDExtensionInterfaceClassdbRegisterExtensionClassPropertyIndexed,
  val classdb_register_extension_class_property_group: GDExtensionInterfaceClassdbRegisterExtensionClassPropertyGroup,
  val classdb_register_extension_class_property_subgroup: GDExtensionInterfaceClassdbRegisterExtensionClassPropertySubgroup,
  val classdb_register_extension_class_signal: GDExtensionInterfaceClassdbRegisterExtensionClassSignal,
  val classdb_unregister_extension_class: GDExtensionInterfaceClassdbUnregisterExtensionClass,
  val get_library_path: GDExtensionInterfaceGetLibraryPath,
  val editor_add_plugin: GDExtensionInterfaceEditorAddPlugin,
  val editor_remove_plugin: GDExtensionInterfaceEditorRemovePlugin,
  val editor_help_load_xml_from_utf8_chars: GDExtensionInterfaceEditorHelpLoadXmlFromUtf8Chars,
  val editor_help_load_xml_from_utf8_chars_and_len: GDExtensionInterfaceEditorHelpLoadXmlFromUtf8CharsAndLen,
  val editor_register_get_classes_used_callback: GDExtensionInterfaceEditorRegisterGetClassesUsedCallback,
  val register_main_loop_callbacks: GDExtensionInterfaceRegisterMainLoopCallbacks
)
object Interface {
  def load(
    getProcAddr: GDExtensionInterfaceGetProcAddress
  ): Interface = Zone.acquire { implicit zone: Zone =>
    new Interface(
      get_godot_version = getProcAddr(toCString("get_godot_version")).asInstanceOf[GDExtensionInterfaceGetGodotVersion],
      get_godot_version2 = getProcAddr(toCString("get_godot_version2")).asInstanceOf[GDExtensionInterfaceGetGodotVersion2],
      mem_alloc = getProcAddr(toCString("mem_alloc")).asInstanceOf[GDExtensionInterfaceMemAlloc],
      mem_realloc = getProcAddr(toCString("mem_realloc")).asInstanceOf[GDExtensionInterfaceMemRealloc],
      mem_free = getProcAddr(toCString("mem_free")).asInstanceOf[GDExtensionInterfaceMemFree],
      mem_alloc2 = getProcAddr(toCString("mem_alloc2")).asInstanceOf[GDExtensionInterfaceMemAlloc2],
      mem_realloc2 = getProcAddr(toCString("mem_realloc2")).asInstanceOf[GDExtensionInterfaceMemRealloc2],
      mem_free2 = getProcAddr(toCString("mem_free2")).asInstanceOf[GDExtensionInterfaceMemFree2],
      print_error = getProcAddr(toCString("print_error")).asInstanceOf[GDExtensionInterfacePrintError],
      print_error_with_message = getProcAddr(toCString("print_error_with_message")).asInstanceOf[GDExtensionInterfacePrintErrorWithMessage],
      print_warning = getProcAddr(toCString("print_warning")).asInstanceOf[GDExtensionInterfacePrintWarning],
      print_warning_with_message = getProcAddr(toCString("print_warning_with_message")).asInstanceOf[GDExtensionInterfacePrintWarningWithMessage],
      print_script_error = getProcAddr(toCString("print_script_error")).asInstanceOf[GDExtensionInterfacePrintScriptError],
      print_script_error_with_message = getProcAddr(toCString("print_script_error_with_message")).asInstanceOf[GDExtensionInterfacePrintScriptErrorWithMessage],
      get_native_struct_size = getProcAddr(toCString("get_native_struct_size")).asInstanceOf[GDExtensionInterfaceGetNativeStructSize],
      variant_new_copy = getProcAddr(toCString("variant_new_copy")).asInstanceOf[GDExtensionInterfaceVariantNewCopy],
      variant_new_nil = getProcAddr(toCString("variant_new_nil")).asInstanceOf[GDExtensionInterfaceVariantNewNil],
      variant_destroy = getProcAddr(toCString("variant_destroy")).asInstanceOf[GDExtensionInterfaceVariantDestroy],
      variant_call = getProcAddr(toCString("variant_call")).asInstanceOf[GDExtensionInterfaceVariantCall],
      variant_call_static = getProcAddr(toCString("variant_call_static")).asInstanceOf[GDExtensionInterfaceVariantCallStatic],
      variant_evaluate = getProcAddr(toCString("variant_evaluate")).asInstanceOf[GDExtensionInterfaceVariantEvaluate],
      variant_set = getProcAddr(toCString("variant_set")).asInstanceOf[GDExtensionInterfaceVariantSet],
      variant_set_named = getProcAddr(toCString("variant_set_named")).asInstanceOf[GDExtensionInterfaceVariantSetNamed],
      variant_set_keyed = getProcAddr(toCString("variant_set_keyed")).asInstanceOf[GDExtensionInterfaceVariantSetKeyed],
      variant_set_indexed = getProcAddr(toCString("variant_set_indexed")).asInstanceOf[GDExtensionInterfaceVariantSetIndexed],
      variant_get = getProcAddr(toCString("variant_get")).asInstanceOf[GDExtensionInterfaceVariantGet],
      variant_get_named = getProcAddr(toCString("variant_get_named")).asInstanceOf[GDExtensionInterfaceVariantGetNamed],
      variant_get_keyed = getProcAddr(toCString("variant_get_keyed")).asInstanceOf[GDExtensionInterfaceVariantGetKeyed],
      variant_get_indexed = getProcAddr(toCString("variant_get_indexed")).asInstanceOf[GDExtensionInterfaceVariantGetIndexed],
      variant_iter_init = getProcAddr(toCString("variant_iter_init")).asInstanceOf[GDExtensionInterfaceVariantIterInit],
      variant_iter_next = getProcAddr(toCString("variant_iter_next")).asInstanceOf[GDExtensionInterfaceVariantIterNext],
      variant_iter_get = getProcAddr(toCString("variant_iter_get")).asInstanceOf[GDExtensionInterfaceVariantIterGet],
      variant_hash = getProcAddr(toCString("variant_hash")).asInstanceOf[GDExtensionInterfaceVariantHash],
      variant_recursive_hash = getProcAddr(toCString("variant_recursive_hash")).asInstanceOf[GDExtensionInterfaceVariantRecursiveHash],
      variant_hash_compare = getProcAddr(toCString("variant_hash_compare")).asInstanceOf[GDExtensionInterfaceVariantHashCompare],
      variant_booleanize = getProcAddr(toCString("variant_booleanize")).asInstanceOf[GDExtensionInterfaceVariantBooleanize],
      variant_duplicate = getProcAddr(toCString("variant_duplicate")).asInstanceOf[GDExtensionInterfaceVariantDuplicate],
      variant_stringify = getProcAddr(toCString("variant_stringify")).asInstanceOf[GDExtensionInterfaceVariantStringify],
      variant_get_type = getProcAddr(toCString("variant_get_type")).asInstanceOf[GDExtensionInterfaceVariantGetType],
      variant_has_method = getProcAddr(toCString("variant_has_method")).asInstanceOf[GDExtensionInterfaceVariantHasMethod],
      variant_has_member = getProcAddr(toCString("variant_has_member")).asInstanceOf[GDExtensionInterfaceVariantHasMember],
      variant_has_key = getProcAddr(toCString("variant_has_key")).asInstanceOf[GDExtensionInterfaceVariantHasKey],
      variant_get_object_instance_id = getProcAddr(toCString("variant_get_object_instance_id")).asInstanceOf[GDExtensionInterfaceVariantGetObjectInstanceId],
      variant_get_type_name = getProcAddr(toCString("variant_get_type_name")).asInstanceOf[GDExtensionInterfaceVariantGetTypeName],
      variant_can_convert = getProcAddr(toCString("variant_can_convert")).asInstanceOf[GDExtensionInterfaceVariantCanConvert],
      variant_can_convert_strict = getProcAddr(toCString("variant_can_convert_strict")).asInstanceOf[GDExtensionInterfaceVariantCanConvertStrict],
      get_variant_from_type_constructor = getProcAddr(toCString("get_variant_from_type_constructor")).asInstanceOf[GDExtensionInterfaceGetVariantFromTypeConstructor],
      get_variant_to_type_constructor = getProcAddr(toCString("get_variant_to_type_constructor")).asInstanceOf[GDExtensionInterfaceGetVariantToTypeConstructor],
      variant_get_ptr_internal_getter = getProcAddr(toCString("variant_get_ptr_internal_getter")).asInstanceOf[GDExtensionInterfaceVariantGetPtrInternalGetter],
      variant_get_ptr_operator_evaluator = getProcAddr(toCString("variant_get_ptr_operator_evaluator")).asInstanceOf[GDExtensionInterfaceVariantGetPtrOperatorEvaluator],
      variant_get_ptr_builtin_method = getProcAddr(toCString("variant_get_ptr_builtin_method")).asInstanceOf[GDExtensionInterfaceVariantGetPtrBuiltinMethod],
      variant_get_ptr_constructor = getProcAddr(toCString("variant_get_ptr_constructor")).asInstanceOf[GDExtensionInterfaceVariantGetPtrConstructor],
      variant_get_ptr_destructor = getProcAddr(toCString("variant_get_ptr_destructor")).asInstanceOf[GDExtensionInterfaceVariantGetPtrDestructor],
      variant_construct = getProcAddr(toCString("variant_construct")).asInstanceOf[GDExtensionInterfaceVariantConstruct],
      variant_get_ptr_setter = getProcAddr(toCString("variant_get_ptr_setter")).asInstanceOf[GDExtensionInterfaceVariantGetPtrSetter],
      variant_get_ptr_getter = getProcAddr(toCString("variant_get_ptr_getter")).asInstanceOf[GDExtensionInterfaceVariantGetPtrGetter],
      variant_get_ptr_indexed_setter = getProcAddr(toCString("variant_get_ptr_indexed_setter")).asInstanceOf[GDExtensionInterfaceVariantGetPtrIndexedSetter],
      variant_get_ptr_indexed_getter = getProcAddr(toCString("variant_get_ptr_indexed_getter")).asInstanceOf[GDExtensionInterfaceVariantGetPtrIndexedGetter],
      variant_get_ptr_keyed_setter = getProcAddr(toCString("variant_get_ptr_keyed_setter")).asInstanceOf[GDExtensionInterfaceVariantGetPtrKeyedSetter],
      variant_get_ptr_keyed_getter = getProcAddr(toCString("variant_get_ptr_keyed_getter")).asInstanceOf[GDExtensionInterfaceVariantGetPtrKeyedGetter],
      variant_get_ptr_keyed_checker = getProcAddr(toCString("variant_get_ptr_keyed_checker")).asInstanceOf[GDExtensionInterfaceVariantGetPtrKeyedChecker],
      variant_get_constant_value = getProcAddr(toCString("variant_get_constant_value")).asInstanceOf[GDExtensionInterfaceVariantGetConstantValue],
      variant_get_ptr_utility_function = getProcAddr(toCString("variant_get_ptr_utility_function")).asInstanceOf[GDExtensionInterfaceVariantGetPtrUtilityFunction],
      string_new_with_latin1_chars = getProcAddr(toCString("string_new_with_latin1_chars")).asInstanceOf[GDExtensionInterfaceStringNewWithLatin1Chars],
      string_new_with_utf8_chars = getProcAddr(toCString("string_new_with_utf8_chars")).asInstanceOf[GDExtensionInterfaceStringNewWithUtf8Chars],
      string_new_with_utf16_chars = getProcAddr(toCString("string_new_with_utf16_chars")).asInstanceOf[GDExtensionInterfaceStringNewWithUtf16Chars],
      string_new_with_utf32_chars = getProcAddr(toCString("string_new_with_utf32_chars")).asInstanceOf[GDExtensionInterfaceStringNewWithUtf32Chars],
      string_new_with_wide_chars = getProcAddr(toCString("string_new_with_wide_chars")).asInstanceOf[GDExtensionInterfaceStringNewWithWideChars],
      string_new_with_latin1_chars_and_len = getProcAddr(toCString("string_new_with_latin1_chars_and_len")).asInstanceOf[GDExtensionInterfaceStringNewWithLatin1CharsAndLen],
      string_new_with_utf8_chars_and_len = getProcAddr(toCString("string_new_with_utf8_chars_and_len")).asInstanceOf[GDExtensionInterfaceStringNewWithUtf8CharsAndLen],
      string_new_with_utf8_chars_and_len2 = getProcAddr(toCString("string_new_with_utf8_chars_and_len2")).asInstanceOf[GDExtensionInterfaceStringNewWithUtf8CharsAndLen2],
      string_new_with_utf16_chars_and_len = getProcAddr(toCString("string_new_with_utf16_chars_and_len")).asInstanceOf[GDExtensionInterfaceStringNewWithUtf16CharsAndLen],
      string_new_with_utf16_chars_and_len2 = getProcAddr(toCString("string_new_with_utf16_chars_and_len2")).asInstanceOf[GDExtensionInterfaceStringNewWithUtf16CharsAndLen2],
      string_new_with_utf32_chars_and_len = getProcAddr(toCString("string_new_with_utf32_chars_and_len")).asInstanceOf[GDExtensionInterfaceStringNewWithUtf32CharsAndLen],
      string_new_with_wide_chars_and_len = getProcAddr(toCString("string_new_with_wide_chars_and_len")).asInstanceOf[GDExtensionInterfaceStringNewWithWideCharsAndLen],
      string_to_latin1_chars = getProcAddr(toCString("string_to_latin1_chars")).asInstanceOf[GDExtensionInterfaceStringToLatin1Chars],
      string_to_utf8_chars = getProcAddr(toCString("string_to_utf8_chars")).asInstanceOf[GDExtensionInterfaceStringToUtf8Chars],
      string_to_utf16_chars = getProcAddr(toCString("string_to_utf16_chars")).asInstanceOf[GDExtensionInterfaceStringToUtf16Chars],
      string_to_utf32_chars = getProcAddr(toCString("string_to_utf32_chars")).asInstanceOf[GDExtensionInterfaceStringToUtf32Chars],
      string_to_wide_chars = getProcAddr(toCString("string_to_wide_chars")).asInstanceOf[GDExtensionInterfaceStringToWideChars],
      string_operator_index = getProcAddr(toCString("string_operator_index")).asInstanceOf[GDExtensionInterfaceStringOperatorIndex],
      string_operator_index_const = getProcAddr(toCString("string_operator_index_const")).asInstanceOf[GDExtensionInterfaceStringOperatorIndexConst],
      string_operator_plus_eq_string = getProcAddr(toCString("string_operator_plus_eq_string")).asInstanceOf[GDExtensionInterfaceStringOperatorPlusEqString],
      string_operator_plus_eq_char = getProcAddr(toCString("string_operator_plus_eq_char")).asInstanceOf[GDExtensionInterfaceStringOperatorPlusEqChar],
      string_operator_plus_eq_cstr = getProcAddr(toCString("string_operator_plus_eq_cstr")).asInstanceOf[GDExtensionInterfaceStringOperatorPlusEqCstr],
      string_operator_plus_eq_wcstr = getProcAddr(toCString("string_operator_plus_eq_wcstr")).asInstanceOf[GDExtensionInterfaceStringOperatorPlusEqWcstr],
      string_operator_plus_eq_c32str = getProcAddr(toCString("string_operator_plus_eq_c32str")).asInstanceOf[GDExtensionInterfaceStringOperatorPlusEqC32str],
      string_resize = getProcAddr(toCString("string_resize")).asInstanceOf[GDExtensionInterfaceStringResize],
      string_name_new_with_latin1_chars = getProcAddr(toCString("string_name_new_with_latin1_chars")).asInstanceOf[GDExtensionInterfaceStringNameNewWithLatin1Chars],
      string_name_new_with_utf8_chars = getProcAddr(toCString("string_name_new_with_utf8_chars")).asInstanceOf[GDExtensionInterfaceStringNameNewWithUtf8Chars],
      string_name_new_with_utf8_chars_and_len = getProcAddr(toCString("string_name_new_with_utf8_chars_and_len")).asInstanceOf[GDExtensionInterfaceStringNameNewWithUtf8CharsAndLen],
      xml_parser_open_buffer = getProcAddr(toCString("xml_parser_open_buffer")).asInstanceOf[GDExtensionInterfaceXmlParserOpenBuffer],
      file_access_store_buffer = getProcAddr(toCString("file_access_store_buffer")).asInstanceOf[GDExtensionInterfaceFileAccessStoreBuffer],
      file_access_get_buffer = getProcAddr(toCString("file_access_get_buffer")).asInstanceOf[GDExtensionInterfaceFileAccessGetBuffer],
      image_ptrw = getProcAddr(toCString("image_ptrw")).asInstanceOf[GDExtensionInterfaceImagePtrw],
      image_ptr = getProcAddr(toCString("image_ptr")).asInstanceOf[GDExtensionInterfaceImagePtr],
      worker_thread_pool_add_native_group_task = getProcAddr(toCString("worker_thread_pool_add_native_group_task")).asInstanceOf[GDExtensionInterfaceWorkerThreadPoolAddNativeGroupTask],
      worker_thread_pool_add_native_task = getProcAddr(toCString("worker_thread_pool_add_native_task")).asInstanceOf[GDExtensionInterfaceWorkerThreadPoolAddNativeTask],
      packed_byte_array_operator_index = getProcAddr(toCString("packed_byte_array_operator_index")).asInstanceOf[GDExtensionInterfacePackedByteArrayOperatorIndex],
      packed_byte_array_operator_index_const = getProcAddr(toCString("packed_byte_array_operator_index_const")).asInstanceOf[GDExtensionInterfacePackedByteArrayOperatorIndexConst],
      packed_float32_array_operator_index = getProcAddr(toCString("packed_float32_array_operator_index")).asInstanceOf[GDExtensionInterfacePackedFloat32ArrayOperatorIndex],
      packed_float32_array_operator_index_const = getProcAddr(toCString("packed_float32_array_operator_index_const")).asInstanceOf[GDExtensionInterfacePackedFloat32ArrayOperatorIndexConst],
      packed_float64_array_operator_index = getProcAddr(toCString("packed_float64_array_operator_index")).asInstanceOf[GDExtensionInterfacePackedFloat64ArrayOperatorIndex],
      packed_float64_array_operator_index_const = getProcAddr(toCString("packed_float64_array_operator_index_const")).asInstanceOf[GDExtensionInterfacePackedFloat64ArrayOperatorIndexConst],
      packed_int32_array_operator_index = getProcAddr(toCString("packed_int32_array_operator_index")).asInstanceOf[GDExtensionInterfacePackedInt32ArrayOperatorIndex],
      packed_int32_array_operator_index_const = getProcAddr(toCString("packed_int32_array_operator_index_const")).asInstanceOf[GDExtensionInterfacePackedInt32ArrayOperatorIndexConst],
      packed_int64_array_operator_index = getProcAddr(toCString("packed_int64_array_operator_index")).asInstanceOf[GDExtensionInterfacePackedInt64ArrayOperatorIndex],
      packed_int64_array_operator_index_const = getProcAddr(toCString("packed_int64_array_operator_index_const")).asInstanceOf[GDExtensionInterfacePackedInt64ArrayOperatorIndexConst],
      packed_string_array_operator_index = getProcAddr(toCString("packed_string_array_operator_index")).asInstanceOf[GDExtensionInterfacePackedStringArrayOperatorIndex],
      packed_string_array_operator_index_const = getProcAddr(toCString("packed_string_array_operator_index_const")).asInstanceOf[GDExtensionInterfacePackedStringArrayOperatorIndexConst],
      packed_vector2_array_operator_index = getProcAddr(toCString("packed_vector2_array_operator_index")).asInstanceOf[GDExtensionInterfacePackedVector2ArrayOperatorIndex],
      packed_vector2_array_operator_index_const = getProcAddr(toCString("packed_vector2_array_operator_index_const")).asInstanceOf[GDExtensionInterfacePackedVector2ArrayOperatorIndexConst],
      packed_vector3_array_operator_index = getProcAddr(toCString("packed_vector3_array_operator_index")).asInstanceOf[GDExtensionInterfacePackedVector3ArrayOperatorIndex],
      packed_vector3_array_operator_index_const = getProcAddr(toCString("packed_vector3_array_operator_index_const")).asInstanceOf[GDExtensionInterfacePackedVector3ArrayOperatorIndexConst],
      packed_vector4_array_operator_index = getProcAddr(toCString("packed_vector4_array_operator_index")).asInstanceOf[GDExtensionInterfacePackedVector4ArrayOperatorIndex],
      packed_vector4_array_operator_index_const = getProcAddr(toCString("packed_vector4_array_operator_index_const")).asInstanceOf[GDExtensionInterfacePackedVector4ArrayOperatorIndexConst],
      packed_color_array_operator_index = getProcAddr(toCString("packed_color_array_operator_index")).asInstanceOf[GDExtensionInterfacePackedColorArrayOperatorIndex],
      packed_color_array_operator_index_const = getProcAddr(toCString("packed_color_array_operator_index_const")).asInstanceOf[GDExtensionInterfacePackedColorArrayOperatorIndexConst],
      array_operator_index = getProcAddr(toCString("array_operator_index")).asInstanceOf[GDExtensionInterfaceArrayOperatorIndex],
      array_operator_index_const = getProcAddr(toCString("array_operator_index_const")).asInstanceOf[GDExtensionInterfaceArrayOperatorIndexConst],
      array_ref = getProcAddr(toCString("array_ref")).asInstanceOf[GDExtensionInterfaceArrayRef],
      array_set_typed = getProcAddr(toCString("array_set_typed")).asInstanceOf[GDExtensionInterfaceArraySetTyped],
      dictionary_operator_index = getProcAddr(toCString("dictionary_operator_index")).asInstanceOf[GDExtensionInterfaceDictionaryOperatorIndex],
      dictionary_operator_index_const = getProcAddr(toCString("dictionary_operator_index_const")).asInstanceOf[GDExtensionInterfaceDictionaryOperatorIndexConst],
      dictionary_set_typed = getProcAddr(toCString("dictionary_set_typed")).asInstanceOf[GDExtensionInterfaceDictionarySetTyped],
      object_method_bind_call = getProcAddr(toCString("object_method_bind_call")).asInstanceOf[GDExtensionInterfaceObjectMethodBindCall],
      object_method_bind_ptrcall = getProcAddr(toCString("object_method_bind_ptrcall")).asInstanceOf[GDExtensionInterfaceObjectMethodBindPtrcall],
      object_destroy = getProcAddr(toCString("object_destroy")).asInstanceOf[GDExtensionInterfaceObjectDestroy],
      global_get_singleton = getProcAddr(toCString("global_get_singleton")).asInstanceOf[GDExtensionInterfaceGlobalGetSingleton],
      object_get_instance_binding = getProcAddr(toCString("object_get_instance_binding")).asInstanceOf[GDExtensionInterfaceObjectGetInstanceBinding],
      object_set_instance_binding = getProcAddr(toCString("object_set_instance_binding")).asInstanceOf[GDExtensionInterfaceObjectSetInstanceBinding],
      object_free_instance_binding = getProcAddr(toCString("object_free_instance_binding")).asInstanceOf[GDExtensionInterfaceObjectFreeInstanceBinding],
      object_set_instance = getProcAddr(toCString("object_set_instance")).asInstanceOf[GDExtensionInterfaceObjectSetInstance],
      object_get_class_name = getProcAddr(toCString("object_get_class_name")).asInstanceOf[GDExtensionInterfaceObjectGetClassName],
      object_cast_to = getProcAddr(toCString("object_cast_to")).asInstanceOf[GDExtensionInterfaceObjectCastTo],
      object_get_instance_from_id = getProcAddr(toCString("object_get_instance_from_id")).asInstanceOf[GDExtensionInterfaceObjectGetInstanceFromId],
      object_get_instance_id = getProcAddr(toCString("object_get_instance_id")).asInstanceOf[GDExtensionInterfaceObjectGetInstanceId],
      object_has_script_method = getProcAddr(toCString("object_has_script_method")).asInstanceOf[GDExtensionInterfaceObjectHasScriptMethod],
      object_call_script_method = getProcAddr(toCString("object_call_script_method")).asInstanceOf[GDExtensionInterfaceObjectCallScriptMethod],
      ref_get_object = getProcAddr(toCString("ref_get_object")).asInstanceOf[GDExtensionInterfaceRefGetObject],
      ref_set_object = getProcAddr(toCString("ref_set_object")).asInstanceOf[GDExtensionInterfaceRefSetObject],
      script_instance_create = getProcAddr(toCString("script_instance_create")).asInstanceOf[GDExtensionInterfaceScriptInstanceCreate],
      script_instance_create2 = getProcAddr(toCString("script_instance_create2")).asInstanceOf[GDExtensionInterfaceScriptInstanceCreate2],
      script_instance_create3 = getProcAddr(toCString("script_instance_create3")).asInstanceOf[GDExtensionInterfaceScriptInstanceCreate3],
      placeholder_script_instance_create = getProcAddr(toCString("placeholder_script_instance_create")).asInstanceOf[GDExtensionInterfacePlaceholderScriptInstanceCreate],
      placeholder_script_instance_update = getProcAddr(toCString("placeholder_script_instance_update")).asInstanceOf[GDExtensionInterfacePlaceholderScriptInstanceUpdate],
      object_get_script_instance = getProcAddr(toCString("object_get_script_instance")).asInstanceOf[GDExtensionInterfaceObjectGetScriptInstance],
      object_set_script_instance = getProcAddr(toCString("object_set_script_instance")).asInstanceOf[GDExtensionInterfaceObjectSetScriptInstance],
      callable_custom_create = getProcAddr(toCString("callable_custom_create")).asInstanceOf[GDExtensionInterfaceCallableCustomCreate],
      callable_custom_create2 = getProcAddr(toCString("callable_custom_create2")).asInstanceOf[GDExtensionInterfaceCallableCustomCreate2],
      callable_custom_get_userdata = getProcAddr(toCString("callable_custom_get_userdata")).asInstanceOf[GDExtensionInterfaceCallableCustomGetUserdata],
      classdb_construct_object = getProcAddr(toCString("classdb_construct_object")).asInstanceOf[GDExtensionInterfaceClassdbConstructObject],
      classdb_construct_object2 = getProcAddr(toCString("classdb_construct_object2")).asInstanceOf[GDExtensionInterfaceClassdbConstructObject2],
      classdb_get_method_bind = getProcAddr(toCString("classdb_get_method_bind")).asInstanceOf[GDExtensionInterfaceClassdbGetMethodBind],
      classdb_get_class_tag = getProcAddr(toCString("classdb_get_class_tag")).asInstanceOf[GDExtensionInterfaceClassdbGetClassTag],
      classdb_register_extension_class = getProcAddr(toCString("classdb_register_extension_class")).asInstanceOf[GDExtensionInterfaceClassdbRegisterExtensionClass],
      classdb_register_extension_class2 = getProcAddr(toCString("classdb_register_extension_class2")).asInstanceOf[GDExtensionInterfaceClassdbRegisterExtensionClass2],
      classdb_register_extension_class3 = getProcAddr(toCString("classdb_register_extension_class3")).asInstanceOf[GDExtensionInterfaceClassdbRegisterExtensionClass3],
      classdb_register_extension_class4 = getProcAddr(toCString("classdb_register_extension_class4")).asInstanceOf[GDExtensionInterfaceClassdbRegisterExtensionClass4],
      classdb_register_extension_class5 = getProcAddr(toCString("classdb_register_extension_class5")).asInstanceOf[GDExtensionInterfaceClassdbRegisterExtensionClass5],
      classdb_register_extension_class_method = getProcAddr(toCString("classdb_register_extension_class_method")).asInstanceOf[GDExtensionInterfaceClassdbRegisterExtensionClassMethod],
      classdb_register_extension_class_virtual_method = getProcAddr(toCString("classdb_register_extension_class_virtual_method")).asInstanceOf[GDExtensionInterfaceClassdbRegisterExtensionClassVirtualMethod],
      classdb_register_extension_class_integer_constant = getProcAddr(toCString("classdb_register_extension_class_integer_constant")).asInstanceOf[GDExtensionInterfaceClassdbRegisterExtensionClassIntegerConstant],
      classdb_register_extension_class_property = getProcAddr(toCString("classdb_register_extension_class_property")).asInstanceOf[GDExtensionInterfaceClassdbRegisterExtensionClassProperty],
      classdb_register_extension_class_property_indexed = getProcAddr(toCString("classdb_register_extension_class_property_indexed")).asInstanceOf[GDExtensionInterfaceClassdbRegisterExtensionClassPropertyIndexed],
      classdb_register_extension_class_property_group = getProcAddr(toCString("classdb_register_extension_class_property_group")).asInstanceOf[GDExtensionInterfaceClassdbRegisterExtensionClassPropertyGroup],
      classdb_register_extension_class_property_subgroup = getProcAddr(toCString("classdb_register_extension_class_property_subgroup")).asInstanceOf[GDExtensionInterfaceClassdbRegisterExtensionClassPropertySubgroup],
      classdb_register_extension_class_signal = getProcAddr(toCString("classdb_register_extension_class_signal")).asInstanceOf[GDExtensionInterfaceClassdbRegisterExtensionClassSignal],
      classdb_unregister_extension_class = getProcAddr(toCString("classdb_unregister_extension_class")).asInstanceOf[GDExtensionInterfaceClassdbUnregisterExtensionClass],
      get_library_path = getProcAddr(toCString("get_library_path")).asInstanceOf[GDExtensionInterfaceGetLibraryPath],
      editor_add_plugin = getProcAddr(toCString("editor_add_plugin")).asInstanceOf[GDExtensionInterfaceEditorAddPlugin],
      editor_remove_plugin = getProcAddr(toCString("editor_remove_plugin")).asInstanceOf[GDExtensionInterfaceEditorRemovePlugin],
      editor_help_load_xml_from_utf8_chars = getProcAddr(toCString("editor_help_load_xml_from_utf8_chars")).asInstanceOf[GDExtensionInterfaceEditorHelpLoadXmlFromUtf8Chars],
      editor_help_load_xml_from_utf8_chars_and_len = getProcAddr(toCString("editor_help_load_xml_from_utf8_chars_and_len")).asInstanceOf[GDExtensionInterfaceEditorHelpLoadXmlFromUtf8CharsAndLen],
      editor_register_get_classes_used_callback = getProcAddr(toCString("editor_register_get_classes_used_callback")).asInstanceOf[GDExtensionInterfaceEditorRegisterGetClassesUsedCallback],
      register_main_loop_callbacks = getProcAddr(toCString("register_main_loop_callbacks")).asInstanceOf[GDExtensionInterfaceRegisterMainLoopCallbacks]
    )
  }
}
