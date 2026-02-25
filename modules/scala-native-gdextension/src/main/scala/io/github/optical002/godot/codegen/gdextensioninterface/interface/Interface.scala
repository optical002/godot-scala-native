
package io.github.optical002.godot.codegen.gdextensioninterface.codegen.types

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import scala.scalanative.unsigned.UInt.*
import io.github.optical002.godot.types.*
import io.github.optical002.godot.codegen.gdextensioninterface.types.*


/**
 * Gets the Godot version that the GDExtension was loaded into.
 *
 * @deprecated Since 4.5. Use get_godot_version2 instead.
 */
type GDExtensionInterfaceGetGodotVersion = CFuncPtr1[
  Ptr[GDExtensionGodotVersion], // r_godot_version
  Unit
]

/**
 * Gets the Godot version that the GDExtension was loaded into.
 */
type GDExtensionInterfaceGetGodotVersion2 = CFuncPtr1[
  Ptr[GDExtensionGodotVersion2], // r_godot_version
  Unit
]

/**
 * Allocates memory.
 *
 * @deprecated Since 4.6. Use mem_alloc2 instead.
 */
type GDExtensionInterfaceMemAlloc = CFuncPtr1[
  CSize, // p_bytes
  CVoidPtr
]

/**
 * Reallocates memory.
 *
 * @deprecated Since 4.6. Use mem_realloc2 instead.
 */
type GDExtensionInterfaceMemRealloc = CFuncPtr2[
  CVoidPtr, // p_ptr
  CSize, // p_bytes
  CVoidPtr
]

/**
 * Frees memory.
 *
 * @deprecated Since 4.6. Use mem_free2 instead.
 */
type GDExtensionInterfaceMemFree = CFuncPtr1[
  CVoidPtr, // p_ptr
  Unit
]

/**
 * Allocates memory.
 */
type GDExtensionInterfaceMemAlloc2 = CFuncPtr2[
  CSize, // p_bytes
  GDExtensionBool, // p_pad_align
  CVoidPtr
]

/**
 * Reallocates memory.
 */
type GDExtensionInterfaceMemRealloc2 = CFuncPtr3[
  CVoidPtr, // p_ptr
  CSize, // p_bytes
  GDExtensionBool, // p_pad_align
  CVoidPtr
]

/**
 * Frees memory.
 */
type GDExtensionInterfaceMemFree2 = CFuncPtr2[
  CVoidPtr, // p_ptr
  GDExtensionBool, // p_pad_align
  Unit
]

/**
 * Logs an error to Godot's built-in debugger and to the OS terminal.
 */
type GDExtensionInterfacePrintError = CFuncPtr5[
  Ptr[CChar], // p_description
  Ptr[CChar], // p_function
  Ptr[CChar], // p_file
  CInt, // p_line
  GDExtensionBool, // p_editor_notify
  Unit
]

/**
 * Logs an error with a message to Godot's built-in debugger and to the OS terminal.
 */
type GDExtensionInterfacePrintErrorWithMessage = CFuncPtr6[
  Ptr[CChar], // p_description
  Ptr[CChar], // p_message
  Ptr[CChar], // p_function
  Ptr[CChar], // p_file
  CInt, // p_line
  GDExtensionBool, // p_editor_notify
  Unit
]

/**
 * Logs a warning to Godot's built-in debugger and to the OS terminal.
 */
type GDExtensionInterfacePrintWarning = CFuncPtr5[
  Ptr[CChar], // p_description
  Ptr[CChar], // p_function
  Ptr[CChar], // p_file
  CInt, // p_line
  GDExtensionBool, // p_editor_notify
  Unit
]

/**
 * Logs a warning with a message to Godot's built-in debugger and to the OS terminal.
 */
type GDExtensionInterfacePrintWarningWithMessage = CFuncPtr6[
  Ptr[CChar], // p_description
  Ptr[CChar], // p_message
  Ptr[CChar], // p_function
  Ptr[CChar], // p_file
  CInt, // p_line
  GDExtensionBool, // p_editor_notify
  Unit
]

/**
 * Logs a script error to Godot's built-in debugger and to the OS terminal.
 */
type GDExtensionInterfacePrintScriptError = CFuncPtr5[
  Ptr[CChar], // p_description
  Ptr[CChar], // p_function
  Ptr[CChar], // p_file
  CInt, // p_line
  GDExtensionBool, // p_editor_notify
  Unit
]

/**
 * Logs a script error with a message to Godot's built-in debugger and to the OS terminal.
 */
type GDExtensionInterfacePrintScriptErrorWithMessage = CFuncPtr6[
  Ptr[CChar], // p_description
  Ptr[CChar], // p_message
  Ptr[CChar], // p_function
  Ptr[CChar], // p_file
  CInt, // p_line
  GDExtensionBool, // p_editor_notify
  Unit
]

/**
 * Gets the size of a native struct (ex. ObjectID) in bytes.
 */
type GDExtensionInterfaceGetNativeStructSize = CFuncPtr1[
  GDExtensionConstStringNamePtr, // p_name
  CUnsignedLongLong
]

/**
 * Copies one Variant into a another.
 */
type GDExtensionInterfaceVariantNewCopy = CFuncPtr2[
  GDExtensionUninitializedVariantPtr, // r_dest
  GDExtensionConstVariantPtr, // p_src
  Unit
]

/**
 * Creates a new Variant containing nil.
 */
type GDExtensionInterfaceVariantNewNil = CFuncPtr1[
  GDExtensionUninitializedVariantPtr, // r_dest
  Unit
]

/**
 * Destroys a Variant.
 */
type GDExtensionInterfaceVariantDestroy = CFuncPtr1[
  GDExtensionVariantPtr, // p_self
  Unit
]

/**
 * Calls a method on a Variant.
 */
type GDExtensionInterfaceVariantCall = CFuncPtr6[
  GDExtensionVariantPtr, // p_self
  GDExtensionConstStringNamePtr, // p_method
  Ptr[GDExtensionConstVariantPtr], // p_args
  GDExtensionInt, // p_argument_count
  GDExtensionUninitializedVariantPtr, // r_return
  Ptr[GDExtensionCallError], // r_error
  Unit
]

/**
 * Calls a static method on a Variant.
 */
type GDExtensionInterfaceVariantCallStatic = CFuncPtr6[
  GDExtensionVariantType, // p_type
  GDExtensionConstStringNamePtr, // p_method
  Ptr[GDExtensionConstVariantPtr], // p_args
  GDExtensionInt, // p_argument_count
  GDExtensionUninitializedVariantPtr, // r_return
  Ptr[GDExtensionCallError], // r_error
  Unit
]

/**
 * Evaluate an operator on two Variants.
 */
type GDExtensionInterfaceVariantEvaluate = CFuncPtr5[
  GDExtensionVariantOperator, // p_op
  GDExtensionConstVariantPtr, // p_a
  GDExtensionConstVariantPtr, // p_b
  GDExtensionUninitializedVariantPtr, // r_return
  Ptr[GDExtensionBool], // r_valid
  Unit
]

/**
 * Sets a key on a Variant to a value.
 */
type GDExtensionInterfaceVariantSet = CFuncPtr4[
  GDExtensionVariantPtr, // p_self
  GDExtensionConstVariantPtr, // p_key
  GDExtensionConstVariantPtr, // p_value
  Ptr[GDExtensionBool], // r_valid
  Unit
]

/**
 * Sets a named key on a Variant to a value.
 */
type GDExtensionInterfaceVariantSetNamed = CFuncPtr4[
  GDExtensionVariantPtr, // p_self
  GDExtensionConstStringNamePtr, // p_key
  GDExtensionConstVariantPtr, // p_value
  Ptr[GDExtensionBool], // r_valid
  Unit
]

/**
 * Sets a keyed property on a Variant to a value.
 */
type GDExtensionInterfaceVariantSetKeyed = CFuncPtr4[
  GDExtensionVariantPtr, // p_self
  GDExtensionConstVariantPtr, // p_key
  GDExtensionConstVariantPtr, // p_value
  Ptr[GDExtensionBool], // r_valid
  Unit
]

/**
 * Sets an index on a Variant to a value.
 */
type GDExtensionInterfaceVariantSetIndexed = CFuncPtr5[
  GDExtensionVariantPtr, // p_self
  GDExtensionInt, // p_index
  GDExtensionConstVariantPtr, // p_value
  Ptr[GDExtensionBool], // r_valid
  Ptr[GDExtensionBool], // r_oob
  Unit
]

/**
 * Gets the value of a key from a Variant.
 */
type GDExtensionInterfaceVariantGet = CFuncPtr4[
  GDExtensionConstVariantPtr, // p_self
  GDExtensionConstVariantPtr, // p_key
  GDExtensionUninitializedVariantPtr, // r_ret
  Ptr[GDExtensionBool], // r_valid
  Unit
]

/**
 * Gets the value of a named key from a Variant.
 */
type GDExtensionInterfaceVariantGetNamed = CFuncPtr4[
  GDExtensionConstVariantPtr, // p_self
  GDExtensionConstStringNamePtr, // p_key
  GDExtensionUninitializedVariantPtr, // r_ret
  Ptr[GDExtensionBool], // r_valid
  Unit
]

/**
 * Gets the value of a keyed property from a Variant.
 */
type GDExtensionInterfaceVariantGetKeyed = CFuncPtr4[
  GDExtensionConstVariantPtr, // p_self
  GDExtensionConstVariantPtr, // p_key
  GDExtensionUninitializedVariantPtr, // r_ret
  Ptr[GDExtensionBool], // r_valid
  Unit
]

/**
 * Gets the value of an index from a Variant.
 */
type GDExtensionInterfaceVariantGetIndexed = CFuncPtr5[
  GDExtensionConstVariantPtr, // p_self
  GDExtensionInt, // p_index
  GDExtensionUninitializedVariantPtr, // r_ret
  Ptr[GDExtensionBool], // r_valid
  Ptr[GDExtensionBool], // r_oob
  Unit
]

/**
 * Initializes an iterator over a Variant.
 */
type GDExtensionInterfaceVariantIterInit = CFuncPtr3[
  GDExtensionConstVariantPtr, // p_self
  GDExtensionUninitializedVariantPtr, // r_iter
  Ptr[GDExtensionBool], // r_valid
  GDExtensionBool
]

/**
 * Gets the next value for an iterator over a Variant.
 */
type GDExtensionInterfaceVariantIterNext = CFuncPtr3[
  GDExtensionConstVariantPtr, // p_self
  GDExtensionVariantPtr, // r_iter
  Ptr[GDExtensionBool], // r_valid
  GDExtensionBool
]

/**
 * Gets the next value for an iterator over a Variant.
 */
type GDExtensionInterfaceVariantIterGet = CFuncPtr4[
  GDExtensionConstVariantPtr, // p_self
  GDExtensionVariantPtr, // r_iter
  GDExtensionUninitializedVariantPtr, // r_ret
  Ptr[GDExtensionBool], // r_valid
  Unit
]

/**
 * Gets the hash of a Variant.
 */
type GDExtensionInterfaceVariantHash = CFuncPtr1[
  GDExtensionConstVariantPtr, // p_self
  GDExtensionInt
]

/**
 * Gets the recursive hash of a Variant.
 */
type GDExtensionInterfaceVariantRecursiveHash = CFuncPtr2[
  GDExtensionConstVariantPtr, // p_self
  GDExtensionInt, // p_recursion_count
  GDExtensionInt
]

/**
 * Compares two Variants by their hash.
 */
type GDExtensionInterfaceVariantHashCompare = CFuncPtr2[
  GDExtensionConstVariantPtr, // p_self
  GDExtensionConstVariantPtr, // p_other
  GDExtensionBool
]

/**
 * Converts a Variant to a boolean.
 */
type GDExtensionInterfaceVariantBooleanize = CFuncPtr1[
  GDExtensionConstVariantPtr, // p_self
  GDExtensionBool
]

/**
 * Duplicates a Variant.
 */
type GDExtensionInterfaceVariantDuplicate = CFuncPtr3[
  GDExtensionConstVariantPtr, // p_self
  GDExtensionVariantPtr, // r_ret
  GDExtensionBool, // p_deep
  Unit
]

/**
 * Converts a Variant to a string.
 */
type GDExtensionInterfaceVariantStringify = CFuncPtr2[
  GDExtensionConstVariantPtr, // p_self
  GDExtensionStringPtr, // r_ret
  Unit
]

/**
 * Gets the type of a Variant.
 */
type GDExtensionInterfaceVariantGetType = CFuncPtr1[
  GDExtensionConstVariantPtr, // p_self
  GDExtensionVariantType
]

/**
 * Checks if a Variant has the given method.
 */
type GDExtensionInterfaceVariantHasMethod = CFuncPtr2[
  GDExtensionConstVariantPtr, // p_self
  GDExtensionConstStringNamePtr, // p_method
  GDExtensionBool
]

/**
 * Checks if a type of Variant has the given member.
 */
type GDExtensionInterfaceVariantHasMember = CFuncPtr2[
  GDExtensionVariantType, // p_type
  GDExtensionConstStringNamePtr, // p_member
  GDExtensionBool
]

/**
 * Checks if a Variant has a key.
 */
type GDExtensionInterfaceVariantHasKey = CFuncPtr3[
  GDExtensionConstVariantPtr, // p_self
  GDExtensionConstVariantPtr, // p_key
  Ptr[GDExtensionBool], // r_valid
  GDExtensionBool
]

/**
 * Gets the object instance ID from a variant of type GDEXTENSION_VARIANT_TYPE_OBJECT.
 * If the variant isn't of type GDEXTENSION_VARIANT_TYPE_OBJECT, then zero will be returned.
 * The instance ID will be returned even if the object is no longer valid - use `object_get_instance_by_id()` to check if the object is still valid.
 */
type GDExtensionInterfaceVariantGetObjectInstanceId = CFuncPtr1[
  GDExtensionConstVariantPtr, // p_self
  GDObjectInstanceID
]

/**
 * Gets the name of a Variant type.
 */
type GDExtensionInterfaceVariantGetTypeName = CFuncPtr2[
  GDExtensionVariantType, // p_type
  GDExtensionUninitializedStringPtr, // r_name
  Unit
]

/**
 * Checks if Variants can be converted from one type to another.
 */
type GDExtensionInterfaceVariantCanConvert = CFuncPtr2[
  GDExtensionVariantType, // p_from
  GDExtensionVariantType, // p_to
  GDExtensionBool
]

/**
 * Checks if Variant can be converted from one type to another using stricter rules.
 */
type GDExtensionInterfaceVariantCanConvertStrict = CFuncPtr2[
  GDExtensionVariantType, // p_from
  GDExtensionVariantType, // p_to
  GDExtensionBool
]

/**
 * Gets a pointer to a function that can create a Variant of the given type from a raw value.
 */
type GDExtensionInterfaceGetVariantFromTypeConstructor = CFuncPtr1[
  GDExtensionVariantType, // p_type
  GDExtensionVariantFromTypeConstructorFunc
]

/**
 * Gets a pointer to a function that can get the raw value from a Variant of the given type.
 */
type GDExtensionInterfaceGetVariantToTypeConstructor = CFuncPtr1[
  GDExtensionVariantType, // p_type
  GDExtensionTypeFromVariantConstructorFunc
]

/**
 * Provides a function pointer for retrieving a pointer to a variant's internal value.
 * Access to a variant's internal value can be used to modify it in-place, or to retrieve its value without the overhead of variant conversion functions.
 * It is recommended to cache the getter for all variant types in a function table to avoid retrieval overhead upon use.
 * 
 * Each function assumes the variant's type has already been determined and matches the function.
 * Invoking the function with a variant of a mismatched type has undefined behavior, and may lead to a segmentation fault.
 */
type GDExtensionInterfaceVariantGetPtrInternalGetter = CFuncPtr1[
  GDExtensionVariantType, // p_type
  GDExtensionVariantGetInternalPtrFunc
]

/**
 * Gets a pointer to a function that can evaluate the given Variant operator on the given Variant types.
 */
type GDExtensionInterfaceVariantGetPtrOperatorEvaluator = CFuncPtr3[
  GDExtensionVariantOperator, // p_operator
  GDExtensionVariantType, // p_type_a
  GDExtensionVariantType, // p_type_b
  GDExtensionPtrOperatorEvaluator
]

/**
 * Gets a pointer to a function that can call a builtin method on a type of Variant.
 */
type GDExtensionInterfaceVariantGetPtrBuiltinMethod = CFuncPtr3[
  GDExtensionVariantType, // p_type
  GDExtensionConstStringNamePtr, // p_method
  GDExtensionInt, // p_hash
  GDExtensionPtrBuiltInMethod
]

/**
 * Gets a pointer to a function that can call one of the constructors for a type of Variant.
 */
type GDExtensionInterfaceVariantGetPtrConstructor = CFuncPtr2[
  GDExtensionVariantType, // p_type
  CInt, // p_constructor
  GDExtensionPtrConstructor
]

/**
 * Gets a pointer to a function than can call the destructor for a type of Variant.
 */
type GDExtensionInterfaceVariantGetPtrDestructor = CFuncPtr1[
  GDExtensionVariantType, // p_type
  GDExtensionPtrDestructor
]

/**
 * Constructs a Variant of the given type, using the first constructor that matches the given arguments.
 */
type GDExtensionInterfaceVariantConstruct = CFuncPtr5[
  GDExtensionVariantType, // p_type
  GDExtensionUninitializedVariantPtr, // r_base
  Ptr[GDExtensionConstVariantPtr], // p_args
  CInt, // p_argument_count
  Ptr[GDExtensionCallError], // r_error
  Unit
]

/**
 * Gets a pointer to a function that can call a member's setter on the given Variant type.
 */
type GDExtensionInterfaceVariantGetPtrSetter = CFuncPtr2[
  GDExtensionVariantType, // p_type
  GDExtensionConstStringNamePtr, // p_member
  GDExtensionPtrSetter
]

/**
 * Gets a pointer to a function that can call a member's getter on the given Variant type.
 */
type GDExtensionInterfaceVariantGetPtrGetter = CFuncPtr2[
  GDExtensionVariantType, // p_type
  GDExtensionConstStringNamePtr, // p_member
  GDExtensionPtrGetter
]

/**
 * Gets a pointer to a function that can set an index on the given Variant type.
 */
type GDExtensionInterfaceVariantGetPtrIndexedSetter = CFuncPtr1[
  GDExtensionVariantType, // p_type
  GDExtensionPtrIndexedSetter
]

/**
 * Gets a pointer to a function that can get an index on the given Variant type.
 */
type GDExtensionInterfaceVariantGetPtrIndexedGetter = CFuncPtr1[
  GDExtensionVariantType, // p_type
  GDExtensionPtrIndexedGetter
]

/**
 * Gets a pointer to a function that can set a key on the given Variant type.
 */
type GDExtensionInterfaceVariantGetPtrKeyedSetter = CFuncPtr1[
  GDExtensionVariantType, // p_type
  GDExtensionPtrKeyedSetter
]

/**
 * Gets a pointer to a function that can get a key on the given Variant type.
 */
type GDExtensionInterfaceVariantGetPtrKeyedGetter = CFuncPtr1[
  GDExtensionVariantType, // p_type
  GDExtensionPtrKeyedGetter
]

/**
 * Gets a pointer to a function that can check a key on the given Variant type.
 */
type GDExtensionInterfaceVariantGetPtrKeyedChecker = CFuncPtr1[
  GDExtensionVariantType, // p_type
  GDExtensionPtrKeyedChecker
]

/**
 * Gets the value of a constant from the given Variant type.
 */
type GDExtensionInterfaceVariantGetConstantValue = CFuncPtr3[
  GDExtensionVariantType, // p_type
  GDExtensionConstStringNamePtr, // p_constant
  GDExtensionUninitializedVariantPtr, // r_ret
  Unit
]

/**
 * Gets a pointer to a function that can call a Variant utility function.
 */
type GDExtensionInterfaceVariantGetPtrUtilityFunction = CFuncPtr2[
  GDExtensionConstStringNamePtr, // p_function
  GDExtensionInt, // p_hash
  GDExtensionPtrUtilityFunction
]

/**
 * Creates a String from a Latin-1 encoded C string.
 */
type GDExtensionInterfaceStringNewWithLatin1Chars = CFuncPtr2[
  GDExtensionUninitializedStringPtr, // r_dest
  Ptr[CChar], // p_contents
  Unit
]

/**
 * Creates a String from a UTF-8 encoded C string.
 */
type GDExtensionInterfaceStringNewWithUtf8Chars = CFuncPtr2[
  GDExtensionUninitializedStringPtr, // r_dest
  Ptr[CChar], // p_contents
  Unit
]

/**
 * Creates a String from a UTF-16 encoded C string.
 */
type GDExtensionInterfaceStringNewWithUtf16Chars = CFuncPtr2[
  GDExtensionUninitializedStringPtr, // r_dest
  Ptr[CChar16], // p_contents
  Unit
]

/**
 * Creates a String from a UTF-32 encoded C string.
 */
type GDExtensionInterfaceStringNewWithUtf32Chars = CFuncPtr2[
  GDExtensionUninitializedStringPtr, // r_dest
  Ptr[CChar32], // p_contents
  Unit
]

/**
 * Creates a String from a wide C string.
 */
type GDExtensionInterfaceStringNewWithWideChars = CFuncPtr2[
  GDExtensionUninitializedStringPtr, // r_dest
  Ptr[CWideChar], // p_contents
  Unit
]

/**
 * Creates a String from a Latin-1 encoded C string with the given length.
 */
type GDExtensionInterfaceStringNewWithLatin1CharsAndLen = CFuncPtr3[
  GDExtensionUninitializedStringPtr, // r_dest
  Ptr[CChar], // p_contents
  GDExtensionInt, // p_size
  Unit
]

/**
 * Creates a String from a UTF-8 encoded C string with the given length.
 *
 * @deprecated Since 4.3. Use string_new_with_utf8_chars_and_len2 instead.
 */
type GDExtensionInterfaceStringNewWithUtf8CharsAndLen = CFuncPtr3[
  GDExtensionUninitializedStringPtr, // r_dest
  Ptr[CChar], // p_contents
  GDExtensionInt, // p_size
  Unit
]

/**
 * Creates a String from a UTF-8 encoded C string with the given length.
 */
type GDExtensionInterfaceStringNewWithUtf8CharsAndLen2 = CFuncPtr3[
  GDExtensionUninitializedStringPtr, // r_dest
  Ptr[CChar], // p_contents
  GDExtensionInt, // p_size
  GDExtensionInt
]

/**
 * Creates a String from a UTF-16 encoded C string with the given length.
 *
 * @deprecated Since 4.3. Use string_new_with_utf16_chars_and_len2 instead.
 */
type GDExtensionInterfaceStringNewWithUtf16CharsAndLen = CFuncPtr3[
  GDExtensionUninitializedStringPtr, // r_dest
  Ptr[CChar16], // p_contents
  GDExtensionInt, // p_char_count
  Unit
]

/**
 * Creates a String from a UTF-16 encoded C string with the given length.
 */
type GDExtensionInterfaceStringNewWithUtf16CharsAndLen2 = CFuncPtr4[
  GDExtensionUninitializedStringPtr, // r_dest
  Ptr[CChar16], // p_contents
  GDExtensionInt, // p_char_count
  GDExtensionBool, // p_default_little_endian
  GDExtensionInt
]

/**
 * Creates a String from a UTF-32 encoded C string with the given length.
 */
type GDExtensionInterfaceStringNewWithUtf32CharsAndLen = CFuncPtr3[
  GDExtensionUninitializedStringPtr, // r_dest
  Ptr[CChar32], // p_contents
  GDExtensionInt, // p_char_count
  Unit
]

/**
 * Creates a String from a wide C string with the given length.
 */
type GDExtensionInterfaceStringNewWithWideCharsAndLen = CFuncPtr3[
  GDExtensionUninitializedStringPtr, // r_dest
  Ptr[CWideChar], // p_contents
  GDExtensionInt, // p_char_count
  Unit
]

/**
 * Converts a String to a Latin-1 encoded C string.
 * It doesn't write a null terminator.
 */
type GDExtensionInterfaceStringToLatin1Chars = CFuncPtr3[
  GDExtensionConstStringPtr, // p_self
  Ptr[CChar], // r_text
  GDExtensionInt, // p_max_write_length
  GDExtensionInt
]

/**
 * Converts a String to a UTF-8 encoded C string.
 * It doesn't write a null terminator.
 */
type GDExtensionInterfaceStringToUtf8Chars = CFuncPtr3[
  GDExtensionConstStringPtr, // p_self
  Ptr[CChar], // r_text
  GDExtensionInt, // p_max_write_length
  GDExtensionInt
]

/**
 * Converts a String to a UTF-16 encoded C string.
 * It doesn't write a null terminator.
 */
type GDExtensionInterfaceStringToUtf16Chars = CFuncPtr3[
  GDExtensionConstStringPtr, // p_self
  Ptr[CChar16], // r_text
  GDExtensionInt, // p_max_write_length
  GDExtensionInt
]

/**
 * Converts a String to a UTF-32 encoded C string.
 * It doesn't write a null terminator.
 */
type GDExtensionInterfaceStringToUtf32Chars = CFuncPtr3[
  GDExtensionConstStringPtr, // p_self
  Ptr[CChar32], // r_text
  GDExtensionInt, // p_max_write_length
  GDExtensionInt
]

/**
 * Converts a String to a wide C string.
 * It doesn't write a null terminator.
 */
type GDExtensionInterfaceStringToWideChars = CFuncPtr3[
  GDExtensionConstStringPtr, // p_self
  Ptr[CWideChar], // r_text
  GDExtensionInt, // p_max_write_length
  GDExtensionInt
]

/**
 * Gets a pointer to the character at the given index from a String.
 */
type GDExtensionInterfaceStringOperatorIndex = CFuncPtr2[
  GDExtensionStringPtr, // p_self
  GDExtensionInt, // p_index
  Ptr[CChar32]
]

/**
 * Gets a const pointer to the character at the given index from a String.
 */
type GDExtensionInterfaceStringOperatorIndexConst = CFuncPtr2[
  GDExtensionConstStringPtr, // p_self
  GDExtensionInt, // p_index
  Ptr[CChar32]
]

/**
 * Appends another String to a String.
 */
type GDExtensionInterfaceStringOperatorPlusEqString = CFuncPtr2[
  GDExtensionStringPtr, // p_self
  GDExtensionConstStringPtr, // p_b
  Unit
]

/**
 * Appends a character to a String.
 */
type GDExtensionInterfaceStringOperatorPlusEqChar = CFuncPtr2[
  GDExtensionStringPtr, // p_self
  CChar32, // p_b
  Unit
]

/**
 * Appends a Latin-1 encoded C string to a String.
 */
type GDExtensionInterfaceStringOperatorPlusEqCstr = CFuncPtr2[
  GDExtensionStringPtr, // p_self
  Ptr[CChar], // p_b
  Unit
]

/**
 * Appends a wide C string to a String.
 */
type GDExtensionInterfaceStringOperatorPlusEqWcstr = CFuncPtr2[
  GDExtensionStringPtr, // p_self
  Ptr[CWideChar], // p_b
  Unit
]

/**
 * Appends a UTF-32 encoded C string to a String.
 */
type GDExtensionInterfaceStringOperatorPlusEqC32str = CFuncPtr2[
  GDExtensionStringPtr, // p_self
  Ptr[CChar32], // p_b
  Unit
]

/**
 * Resizes the underlying string data to the given number of characters.
 * Space needs to be allocated for the null terminating character ('\0') which
 * also must be added manually, in order for all string functions to work correctly.
 * 
 * Warning: This is an error-prone operation - only use it if there's no other
 * efficient way to accomplish your goal.
 */
type GDExtensionInterfaceStringResize = CFuncPtr2[
  GDExtensionStringPtr, // p_self
  GDExtensionInt, // p_resize
  GDExtensionInt
]

/**
 * Creates a StringName from a Latin-1 encoded C string.
 * If `p_is_static` is true, then:
 * - The StringName will reuse the `p_contents` buffer instead of copying it.
 * - You must guarantee that the buffer remains valid for the duration of the application (e.g. string literal).
 * - You must not call a destructor for this StringName. Incrementing the initial reference once should achieve this.
 * 
 * `p_is_static` is purely an optimization and can easily introduce undefined behavior if used wrong. In case of doubt, set it to false.
 */
type GDExtensionInterfaceStringNameNewWithLatin1Chars = CFuncPtr3[
  GDExtensionUninitializedStringNamePtr, // r_dest
  Ptr[CChar], // p_contents
  GDExtensionBool, // p_is_static
  Unit
]

/**
 * Creates a StringName from a UTF-8 encoded C string.
 */
type GDExtensionInterfaceStringNameNewWithUtf8Chars = CFuncPtr2[
  GDExtensionUninitializedStringNamePtr, // r_dest
  Ptr[CChar], // p_contents
  Unit
]

/**
 * Creates a StringName from a UTF-8 encoded string with a given number of characters.
 */
type GDExtensionInterfaceStringNameNewWithUtf8CharsAndLen = CFuncPtr3[
  GDExtensionUninitializedStringNamePtr, // r_dest
  Ptr[CChar], // p_contents
  GDExtensionInt, // p_size
  Unit
]

/**
 * Opens a raw XML buffer on an XMLParser instance.
 */
type GDExtensionInterfaceXmlParserOpenBuffer = CFuncPtr3[
  GDExtensionObjectPtr, // p_instance
  Ptr[UByte], // p_buffer
  CSize, // p_size
  GDExtensionInt
]

/**
 * Stores the given buffer using an instance of FileAccess.
 */
type GDExtensionInterfaceFileAccessStoreBuffer = CFuncPtr3[
  GDExtensionObjectPtr, // p_instance
  Ptr[UByte], // p_src
  CUnsignedLongLong, // p_length
  Unit
]

/**
 * Reads the next p_length bytes into the given buffer using an instance of FileAccess.
 */
type GDExtensionInterfaceFileAccessGetBuffer = CFuncPtr3[
  GDExtensionConstObjectPtr, // p_instance
  Ptr[UByte], // p_dst
  CUnsignedLongLong, // p_length
  CUnsignedLongLong
]

/**
 * Returns writable pointer to internal Image buffer.
 */
type GDExtensionInterfaceImagePtrw = CFuncPtr1[
  GDExtensionObjectPtr, // p_instance
  Ptr[UByte]
]

/**
 * Returns read only pointer to internal Image buffer.
 */
type GDExtensionInterfaceImagePtr = CFuncPtr1[
  GDExtensionObjectPtr, // p_instance
  Ptr[UByte]
]

/**
 * Adds a group task to an instance of WorkerThreadPool.
 */
type GDExtensionInterfaceWorkerThreadPoolAddNativeGroupTask = CFuncPtr7[
  GDExtensionObjectPtr, // p_instance
  GDExtensionWorkerThreadPoolGroupTask, // p_func
  CVoidPtr, // p_userdata
  CInt, // p_elements
  CInt, // p_tasks
  GDExtensionBool, // p_high_priority
  GDExtensionConstStringPtr, // p_description
  CLongLong
]

/**
 * Adds a task to an instance of WorkerThreadPool.
 */
type GDExtensionInterfaceWorkerThreadPoolAddNativeTask = CFuncPtr5[
  GDExtensionObjectPtr, // p_instance
  GDExtensionWorkerThreadPoolTask, // p_func
  CVoidPtr, // p_userdata
  GDExtensionBool, // p_high_priority
  GDExtensionConstStringPtr, // p_description
  CLongLong
]

/**
 * Gets a pointer to a byte in a PackedByteArray.
 */
type GDExtensionInterfacePackedByteArrayOperatorIndex = CFuncPtr2[
  GDExtensionTypePtr, // p_self
  GDExtensionInt, // p_index
  Ptr[UByte]
]

/**
 * Gets a const pointer to a byte in a PackedByteArray.
 */
type GDExtensionInterfacePackedByteArrayOperatorIndexConst = CFuncPtr2[
  GDExtensionConstTypePtr, // p_self
  GDExtensionInt, // p_index
  Ptr[UByte]
]

/**
 * Gets a pointer to a 32-bit float in a PackedFloat32Array.
 */
type GDExtensionInterfacePackedFloat32ArrayOperatorIndex = CFuncPtr2[
  GDExtensionTypePtr, // p_self
  GDExtensionInt, // p_index
  Ptr[CFloat]
]

/**
 * Gets a const pointer to a 32-bit float in a PackedFloat32Array.
 */
type GDExtensionInterfacePackedFloat32ArrayOperatorIndexConst = CFuncPtr2[
  GDExtensionConstTypePtr, // p_self
  GDExtensionInt, // p_index
  Ptr[CFloat]
]

/**
 * Gets a pointer to a 64-bit float in a PackedFloat64Array.
 */
type GDExtensionInterfacePackedFloat64ArrayOperatorIndex = CFuncPtr2[
  GDExtensionTypePtr, // p_self
  GDExtensionInt, // p_index
  Ptr[CDouble]
]

/**
 * Gets a const pointer to a 64-bit float in a PackedFloat64Array.
 */
type GDExtensionInterfacePackedFloat64ArrayOperatorIndexConst = CFuncPtr2[
  GDExtensionConstTypePtr, // p_self
  GDExtensionInt, // p_index
  Ptr[CDouble]
]

/**
 * Gets a pointer to a 32-bit integer in a PackedInt32Array.
 */
type GDExtensionInterfacePackedInt32ArrayOperatorIndex = CFuncPtr2[
  GDExtensionTypePtr, // p_self
  GDExtensionInt, // p_index
  Ptr[CInt]
]

/**
 * Gets a const pointer to a 32-bit integer in a PackedInt32Array.
 */
type GDExtensionInterfacePackedInt32ArrayOperatorIndexConst = CFuncPtr2[
  GDExtensionConstTypePtr, // p_self
  GDExtensionInt, // p_index
  Ptr[CInt]
]

/**
 * Gets a pointer to a 64-bit integer in a PackedInt64Array.
 */
type GDExtensionInterfacePackedInt64ArrayOperatorIndex = CFuncPtr2[
  GDExtensionTypePtr, // p_self
  GDExtensionInt, // p_index
  Ptr[CLongLong]
]

/**
 * Gets a const pointer to a 64-bit integer in a PackedInt64Array.
 */
type GDExtensionInterfacePackedInt64ArrayOperatorIndexConst = CFuncPtr2[
  GDExtensionConstTypePtr, // p_self
  GDExtensionInt, // p_index
  Ptr[CLongLong]
]

/**
 * Gets a pointer to a string in a PackedStringArray.
 */
type GDExtensionInterfacePackedStringArrayOperatorIndex = CFuncPtr2[
  GDExtensionTypePtr, // p_self
  GDExtensionInt, // p_index
  GDExtensionStringPtr
]

/**
 * Gets a const pointer to a string in a PackedStringArray.
 */
type GDExtensionInterfacePackedStringArrayOperatorIndexConst = CFuncPtr2[
  GDExtensionConstTypePtr, // p_self
  GDExtensionInt, // p_index
  GDExtensionStringPtr
]

/**
 * Gets a pointer to a Vector2 in a PackedVector2Array.
 */
type GDExtensionInterfacePackedVector2ArrayOperatorIndex = CFuncPtr2[
  GDExtensionTypePtr, // p_self
  GDExtensionInt, // p_index
  GDExtensionTypePtr
]

/**
 * Gets a const pointer to a Vector2 in a PackedVector2Array.
 */
type GDExtensionInterfacePackedVector2ArrayOperatorIndexConst = CFuncPtr2[
  GDExtensionConstTypePtr, // p_self
  GDExtensionInt, // p_index
  GDExtensionTypePtr
]

/**
 * Gets a pointer to a Vector3 in a PackedVector3Array.
 */
type GDExtensionInterfacePackedVector3ArrayOperatorIndex = CFuncPtr2[
  GDExtensionTypePtr, // p_self
  GDExtensionInt, // p_index
  GDExtensionTypePtr
]

/**
 * Gets a const pointer to a Vector3 in a PackedVector3Array.
 */
type GDExtensionInterfacePackedVector3ArrayOperatorIndexConst = CFuncPtr2[
  GDExtensionConstTypePtr, // p_self
  GDExtensionInt, // p_index
  GDExtensionTypePtr
]

/**
 * Gets a pointer to a Vector4 in a PackedVector4Array.
 */
type GDExtensionInterfacePackedVector4ArrayOperatorIndex = CFuncPtr2[
  GDExtensionTypePtr, // p_self
  GDExtensionInt, // p_index
  GDExtensionTypePtr
]

/**
 * Gets a const pointer to a Vector4 in a PackedVector4Array.
 */
type GDExtensionInterfacePackedVector4ArrayOperatorIndexConst = CFuncPtr2[
  GDExtensionConstTypePtr, // p_self
  GDExtensionInt, // p_index
  GDExtensionTypePtr
]

/**
 * Gets a pointer to a color in a PackedColorArray.
 */
type GDExtensionInterfacePackedColorArrayOperatorIndex = CFuncPtr2[
  GDExtensionTypePtr, // p_self
  GDExtensionInt, // p_index
  GDExtensionTypePtr
]

/**
 * Gets a const pointer to a color in a PackedColorArray.
 */
type GDExtensionInterfacePackedColorArrayOperatorIndexConst = CFuncPtr2[
  GDExtensionConstTypePtr, // p_self
  GDExtensionInt, // p_index
  GDExtensionTypePtr
]

/**
 * Gets a pointer to a Variant in an Array.
 */
type GDExtensionInterfaceArrayOperatorIndex = CFuncPtr2[
  GDExtensionTypePtr, // p_self
  GDExtensionInt, // p_index
  GDExtensionVariantPtr
]

/**
 * Gets a const pointer to a Variant in an Array.
 */
type GDExtensionInterfaceArrayOperatorIndexConst = CFuncPtr2[
  GDExtensionConstTypePtr, // p_self
  GDExtensionInt, // p_index
  GDExtensionVariantPtr
]

/**
 * Sets an Array to be a reference to another Array object.
 *
 * @deprecated Since 4.5. Use  instead.
 */
type GDExtensionInterfaceArrayRef = CFuncPtr2[
  GDExtensionTypePtr, // p_self
  GDExtensionConstTypePtr, // p_from
  Unit
]

/**
 * Makes an Array into a typed Array.
 */
type GDExtensionInterfaceArraySetTyped = CFuncPtr4[
  GDExtensionTypePtr, // p_self
  GDExtensionVariantType, // p_type
  GDExtensionConstStringNamePtr, // p_class_name
  GDExtensionConstVariantPtr, // p_script
  Unit
]

/**
 * Gets a pointer to a Variant in a Dictionary with the given key.
 */
type GDExtensionInterfaceDictionaryOperatorIndex = CFuncPtr2[
  GDExtensionTypePtr, // p_self
  GDExtensionConstVariantPtr, // p_key
  GDExtensionVariantPtr
]

/**
 * Gets a const pointer to a Variant in a Dictionary with the given key.
 */
type GDExtensionInterfaceDictionaryOperatorIndexConst = CFuncPtr2[
  GDExtensionConstTypePtr, // p_self
  GDExtensionConstVariantPtr, // p_key
  GDExtensionVariantPtr
]

/**
 * Makes a Dictionary into a typed Dictionary.
 */
type GDExtensionInterfaceDictionarySetTyped = CFuncPtr7[
  GDExtensionTypePtr, // p_self
  GDExtensionVariantType, // p_key_type
  GDExtensionConstStringNamePtr, // p_key_class_name
  GDExtensionConstVariantPtr, // p_key_script
  GDExtensionVariantType, // p_value_type
  GDExtensionConstStringNamePtr, // p_value_class_name
  GDExtensionConstVariantPtr, // p_value_script
  Unit
]

/**
 * Calls a method on an Object.
 */
type GDExtensionInterfaceObjectMethodBindCall = CFuncPtr6[
  GDExtensionMethodBindPtr, // p_method_bind
  GDExtensionObjectPtr, // p_instance
  Ptr[GDExtensionConstVariantPtr], // p_args
  GDExtensionInt, // p_arg_count
  GDExtensionUninitializedVariantPtr, // r_ret
  Ptr[GDExtensionCallError], // r_error
  Unit
]

/**
 * Calls a method on an Object (using a "ptrcall").
 */
type GDExtensionInterfaceObjectMethodBindPtrcall = CFuncPtr4[
  GDExtensionMethodBindPtr, // p_method_bind
  GDExtensionObjectPtr, // p_instance
  Ptr[GDExtensionConstTypePtr], // p_args
  GDExtensionTypePtr, // r_ret
  Unit
]

/**
 * Destroys an Object.
 */
type GDExtensionInterfaceObjectDestroy = CFuncPtr1[
  GDExtensionObjectPtr, // p_o
  Unit
]

/**
 * Gets a global singleton by name.
 */
type GDExtensionInterfaceGlobalGetSingleton = CFuncPtr1[
  GDExtensionConstStringNamePtr, // p_name
  GDExtensionObjectPtr
]

/**
 * Gets a pointer representing an Object's instance binding.
 */
type GDExtensionInterfaceObjectGetInstanceBinding = CFuncPtr3[
  GDExtensionObjectPtr, // p_o
  CVoidPtr, // p_token
  Ptr[GDExtensionInstanceBindingCallbacks], // p_callbacks
  CVoidPtr
]

/**
 * Sets an Object's instance binding.
 */
type GDExtensionInterfaceObjectSetInstanceBinding = CFuncPtr4[
  GDExtensionObjectPtr, // p_o
  CVoidPtr, // p_token
  CVoidPtr, // p_binding
  Ptr[GDExtensionInstanceBindingCallbacks], // p_callbacks
  Unit
]

/**
 * Free an Object's instance binding.
 */
type GDExtensionInterfaceObjectFreeInstanceBinding = CFuncPtr2[
  GDExtensionObjectPtr, // p_o
  CVoidPtr, // p_token
  Unit
]

/**
 * Sets an extension class instance on a Object.
 * `p_classname` should be a registered extension class and should extend the `p_o` Object's class.
 */
type GDExtensionInterfaceObjectSetInstance = CFuncPtr3[
  GDExtensionObjectPtr, // p_o
  GDExtensionConstStringNamePtr, // p_classname
  GDExtensionClassInstancePtr, // p_instance
  Unit
]

/**
 * Gets the class name of an Object.
 * If the GDExtension wraps the Godot object in an abstraction specific to its class, this is the
 * function that should be used to determine which wrapper to use.
 */
type GDExtensionInterfaceObjectGetClassName = CFuncPtr3[
  GDExtensionConstObjectPtr, // p_object
  GDExtensionClassLibraryPtr, // p_library
  GDExtensionUninitializedStringNamePtr, // r_class_name
  GDExtensionBool
]

/**
 * Casts an Object to a different type.
 */
type GDExtensionInterfaceObjectCastTo = CFuncPtr2[
  GDExtensionConstObjectPtr, // p_object
  CVoidPtr, // p_class_tag
  GDExtensionObjectPtr
]

/**
 * Gets an Object by its instance ID.
 */
type GDExtensionInterfaceObjectGetInstanceFromId = CFuncPtr1[
  GDObjectInstanceID, // p_instance_id
  GDExtensionObjectPtr
]

/**
 * Gets the instance ID from an Object.
 */
type GDExtensionInterfaceObjectGetInstanceId = CFuncPtr1[
  GDExtensionConstObjectPtr, // p_object
  GDObjectInstanceID
]

/**
 * Checks if this object has a script with the given method.
 */
type GDExtensionInterfaceObjectHasScriptMethod = CFuncPtr2[
  GDExtensionConstObjectPtr, // p_object
  GDExtensionConstStringNamePtr, // p_method
  GDExtensionBool
]

/**
 * Call the given script method on this object.
 */
type GDExtensionInterfaceObjectCallScriptMethod = CFuncPtr6[
  GDExtensionObjectPtr, // p_object
  GDExtensionConstStringNamePtr, // p_method
  Ptr[GDExtensionConstVariantPtr], // p_args
  GDExtensionInt, // p_argument_count
  GDExtensionUninitializedVariantPtr, // r_return
  Ptr[GDExtensionCallError], // r_error
  Unit
]

/**
 * Gets the Object from a reference.
 */
type GDExtensionInterfaceRefGetObject = CFuncPtr1[
  GDExtensionConstRefPtr, // p_ref
  GDExtensionObjectPtr
]

/**
 * Sets the Object referred to by a reference.
 */
type GDExtensionInterfaceRefSetObject = CFuncPtr2[
  GDExtensionRefPtr, // p_ref
  GDExtensionObjectPtr, // p_object
  Unit
]

/**
 * Creates a script instance that contains the given info and instance data.
 *
 * @deprecated Since 4.2. Use script_instance_create3 instead.
 */
type GDExtensionInterfaceScriptInstanceCreate = CFuncPtr2[
  Ptr[GDExtensionScriptInstanceInfo], // p_info
  GDExtensionScriptInstanceDataPtr, // p_instance_data
  GDExtensionScriptInstancePtr
]

/**
 * Creates a script instance that contains the given info and instance data.
 *
 * @deprecated Since 4.3. Use script_instance_create3 instead.
 */
type GDExtensionInterfaceScriptInstanceCreate2 = CFuncPtr2[
  Ptr[GDExtensionScriptInstanceInfo2], // p_info
  GDExtensionScriptInstanceDataPtr, // p_instance_data
  GDExtensionScriptInstancePtr
]

/**
 * Creates a script instance that contains the given info and instance data.
 */
type GDExtensionInterfaceScriptInstanceCreate3 = CFuncPtr2[
  Ptr[GDExtensionScriptInstanceInfo3], // p_info
  GDExtensionScriptInstanceDataPtr, // p_instance_data
  GDExtensionScriptInstancePtr
]

/**
 * Creates a placeholder script instance for a given script and instance.
 * This interface is optional as a custom placeholder could also be created with script_instance_create().
 */
type GDExtensionInterfacePlaceholderScriptInstanceCreate = CFuncPtr3[
  GDExtensionObjectPtr, // p_language
  GDExtensionObjectPtr, // p_script
  GDExtensionObjectPtr, // p_owner
  GDExtensionScriptInstancePtr
]

/**
 * Updates a placeholder script instance with the given properties and values.
 * The passed in placeholder must be an instance of PlaceHolderScriptInstance
 * such as the one returned by placeholder_script_instance_create().
 */
type GDExtensionInterfacePlaceholderScriptInstanceUpdate = CFuncPtr3[
  GDExtensionScriptInstancePtr, // p_placeholder
  GDExtensionConstTypePtr, // p_properties
  GDExtensionConstTypePtr, // p_values
  Unit
]

/**
 * Get the script instance data attached to this object.
 */
type GDExtensionInterfaceObjectGetScriptInstance = CFuncPtr2[
  GDExtensionConstObjectPtr, // p_object
  GDExtensionObjectPtr, // p_language
  GDExtensionScriptInstanceDataPtr
]

/**
 * Set the script instance data attached to this object.
 */
type GDExtensionInterfaceObjectSetScriptInstance = CFuncPtr2[
  GDExtensionObjectPtr, // p_object
  GDExtensionScriptInstanceDataPtr, // p_script_instance
  Unit
]

/**
 * Creates a custom Callable object from a function pointer.
 * Provided struct can be safely freed once the function returns.
 *
 * @deprecated Since 4.3. Use callable_custom_create2 instead.
 */
type GDExtensionInterfaceCallableCustomCreate = CFuncPtr2[
  GDExtensionUninitializedTypePtr, // r_callable
  Ptr[GDExtensionCallableCustomInfo], // p_callable_custom_info
  Unit
]

/**
 * Creates a custom Callable object from a function pointer.
 * Provided struct can be safely freed once the function returns.
 */
type GDExtensionInterfaceCallableCustomCreate2 = CFuncPtr2[
  GDExtensionUninitializedTypePtr, // r_callable
  Ptr[GDExtensionCallableCustomInfo2], // p_callable_custom_info
  Unit
]

/**
 * Retrieves the userdata pointer from a custom Callable.
 * If the Callable is not a custom Callable or the token does not match the one provided to callable_custom_create() via GDExtensionCallableCustomInfo then NULL will be returned.
 */
type GDExtensionInterfaceCallableCustomGetUserdata = CFuncPtr2[
  GDExtensionConstTypePtr, // p_callable
  CVoidPtr, // p_token
  CVoidPtr
]

/**
 * Constructs an Object of the requested class.
 * The passed class must be a built-in godot class, or an already-registered extension class. In both cases, object_set_instance() should be called to fully initialize the object.
 *
 * @deprecated Since 4.4. Use classdb_construct_object2 instead.
 */
type GDExtensionInterfaceClassdbConstructObject = CFuncPtr1[
  GDExtensionConstStringNamePtr, // p_classname
  GDExtensionObjectPtr
]

/**
 * Constructs an Object of the requested class.
 * The passed class must be a built-in godot class, or an already-registered extension class. In both cases, object_set_instance() should be called to fully initialize the object.
 * 
 * "NOTIFICATION_POSTINITIALIZE" must be sent after construction.
 */
type GDExtensionInterfaceClassdbConstructObject2 = CFuncPtr1[
  GDExtensionConstStringNamePtr, // p_classname
  GDExtensionObjectPtr
]

/**
 * Gets a pointer to the MethodBind in ClassDB for the given class, method and hash.
 */
type GDExtensionInterfaceClassdbGetMethodBind = CFuncPtr3[
  GDExtensionConstStringNamePtr, // p_classname
  GDExtensionConstStringNamePtr, // p_methodname
  GDExtensionInt, // p_hash
  GDExtensionMethodBindPtr
]

/**
 * Gets a pointer uniquely identifying the given built-in class in the ClassDB.
 */
type GDExtensionInterfaceClassdbGetClassTag = CFuncPtr1[
  GDExtensionConstStringNamePtr, // p_classname
  CVoidPtr
]

/**
 * Registers an extension class in the ClassDB.
 * Provided struct can be safely freed once the function returns.
 *
 * @deprecated Since 4.2. Use classdb_register_extension_class5 instead.
 */
type GDExtensionInterfaceClassdbRegisterExtensionClass = CFuncPtr4[
  GDExtensionClassLibraryPtr, // p_library
  GDExtensionConstStringNamePtr, // p_class_name
  GDExtensionConstStringNamePtr, // p_parent_class_name
  Ptr[GDExtensionClassCreationInfo], // p_extension_funcs
  Unit
]

/**
 * Registers an extension class in the ClassDB.
 * Provided struct can be safely freed once the function returns.
 *
 * @deprecated Since 4.3. Use classdb_register_extension_class5 instead.
 */
type GDExtensionInterfaceClassdbRegisterExtensionClass2 = CFuncPtr4[
  GDExtensionClassLibraryPtr, // p_library
  GDExtensionConstStringNamePtr, // p_class_name
  GDExtensionConstStringNamePtr, // p_parent_class_name
  Ptr[GDExtensionClassCreationInfo2], // p_extension_funcs
  Unit
]

/**
 * Registers an extension class in the ClassDB.
 * Provided struct can be safely freed once the function returns.
 *
 * @deprecated Since 4.4. Use classdb_register_extension_class5 instead.
 */
type GDExtensionInterfaceClassdbRegisterExtensionClass3 = CFuncPtr4[
  GDExtensionClassLibraryPtr, // p_library
  GDExtensionConstStringNamePtr, // p_class_name
  GDExtensionConstStringNamePtr, // p_parent_class_name
  Ptr[GDExtensionClassCreationInfo3], // p_extension_funcs
  Unit
]

/**
 * Registers an extension class in the ClassDB.
 * Provided struct can be safely freed once the function returns.
 *
 * @deprecated Since 4.5. Use classdb_register_extension_class5 instead.
 */
type GDExtensionInterfaceClassdbRegisterExtensionClass4 = CFuncPtr4[
  GDExtensionClassLibraryPtr, // p_library
  GDExtensionConstStringNamePtr, // p_class_name
  GDExtensionConstStringNamePtr, // p_parent_class_name
  Ptr[GDExtensionClassCreationInfo4], // p_extension_funcs
  Unit
]

/**
 * Registers an extension class in the ClassDB.
 * Provided struct can be safely freed once the function returns.
 */
type GDExtensionInterfaceClassdbRegisterExtensionClass5 = CFuncPtr4[
  GDExtensionClassLibraryPtr, // p_library
  GDExtensionConstStringNamePtr, // p_class_name
  GDExtensionConstStringNamePtr, // p_parent_class_name
  Ptr[GDExtensionClassCreationInfo5], // p_extension_funcs
  Unit
]

/**
 * Registers a method on an extension class in the ClassDB.
 * Provided struct can be safely freed once the function returns.
 */
type GDExtensionInterfaceClassdbRegisterExtensionClassMethod = CFuncPtr3[
  GDExtensionClassLibraryPtr, // p_library
  GDExtensionConstStringNamePtr, // p_class_name
  Ptr[GDExtensionClassMethodInfo], // p_method_info
  Unit
]

/**
 * Registers a virtual method on an extension class in ClassDB, that can be implemented by scripts or other extensions.
 * Provided struct can be safely freed once the function returns.
 */
type GDExtensionInterfaceClassdbRegisterExtensionClassVirtualMethod = CFuncPtr3[
  GDExtensionClassLibraryPtr, // p_library
  GDExtensionConstStringNamePtr, // p_class_name
  Ptr[GDExtensionClassVirtualMethodInfo], // p_method_info
  Unit
]

/**
 * Registers an integer constant on an extension class in the ClassDB.
 * Note about registering bitfield values (if p_is_bitfield is true): even though p_constant_value is signed, language bindings are
 * advised to treat bitfields as uint64_t, since this is generally clearer and can prevent mistakes like using -1 for setting all bits.
 * Language APIs should thus provide an abstraction that registers bitfields (uint64_t) separately from regular constants (int64_t).
 */
type GDExtensionInterfaceClassdbRegisterExtensionClassIntegerConstant = CFuncPtr6[
  GDExtensionClassLibraryPtr, // p_library
  GDExtensionConstStringNamePtr, // p_class_name
  GDExtensionConstStringNamePtr, // p_enum_name
  GDExtensionConstStringNamePtr, // p_constant_name
  GDExtensionInt, // p_constant_value
  GDExtensionBool, // p_is_bitfield
  Unit
]

/**
 * Registers a property on an extension class in the ClassDB.
 * Provided struct can be safely freed once the function returns.
 */
type GDExtensionInterfaceClassdbRegisterExtensionClassProperty = CFuncPtr5[
  GDExtensionClassLibraryPtr, // p_library
  GDExtensionConstStringNamePtr, // p_class_name
  Ptr[GDExtensionPropertyInfo], // p_info
  GDExtensionConstStringNamePtr, // p_setter
  GDExtensionConstStringNamePtr, // p_getter
  Unit
]

/**
 * Registers an indexed property on an extension class in the ClassDB.
 * Provided struct can be safely freed once the function returns.
 */
type GDExtensionInterfaceClassdbRegisterExtensionClassPropertyIndexed = CFuncPtr6[
  GDExtensionClassLibraryPtr, // p_library
  GDExtensionConstStringNamePtr, // p_class_name
  Ptr[GDExtensionPropertyInfo], // p_info
  GDExtensionConstStringNamePtr, // p_setter
  GDExtensionConstStringNamePtr, // p_getter
  GDExtensionInt, // p_index
  Unit
]

/**
 * Registers a property group on an extension class in the ClassDB.
 */
type GDExtensionInterfaceClassdbRegisterExtensionClassPropertyGroup = CFuncPtr4[
  GDExtensionClassLibraryPtr, // p_library
  GDExtensionConstStringNamePtr, // p_class_name
  GDExtensionConstStringPtr, // p_group_name
  GDExtensionConstStringPtr, // p_prefix
  Unit
]

/**
 * Registers a property subgroup on an extension class in the ClassDB.
 */
type GDExtensionInterfaceClassdbRegisterExtensionClassPropertySubgroup = CFuncPtr4[
  GDExtensionClassLibraryPtr, // p_library
  GDExtensionConstStringNamePtr, // p_class_name
  GDExtensionConstStringPtr, // p_subgroup_name
  GDExtensionConstStringPtr, // p_prefix
  Unit
]

/**
 * Registers a signal on an extension class in the ClassDB.
 * Provided structs can be safely freed once the function returns.
 */
type GDExtensionInterfaceClassdbRegisterExtensionClassSignal = CFuncPtr5[
  GDExtensionClassLibraryPtr, // p_library
  GDExtensionConstStringNamePtr, // p_class_name
  GDExtensionConstStringNamePtr, // p_signal_name
  Ptr[GDExtensionPropertyInfo], // p_argument_info
  GDExtensionInt, // p_argument_count
  Unit
]

/**
 * Unregisters an extension class in the ClassDB.
 * Unregistering a parent class before a class that inherits it will result in failure. Inheritors must be unregistered first.
 */
type GDExtensionInterfaceClassdbUnregisterExtensionClass = CFuncPtr2[
  GDExtensionClassLibraryPtr, // p_library
  GDExtensionConstStringNamePtr, // p_class_name
  Unit
]

/**
 * Gets the path to the current GDExtension library.
 */
type GDExtensionInterfaceGetLibraryPath = CFuncPtr2[
  GDExtensionClassLibraryPtr, // p_library
  GDExtensionUninitializedStringPtr, // r_path
  Unit
]

/**
 * Adds an editor plugin.
 * It's safe to call during initialization.
 */
type GDExtensionInterfaceEditorAddPlugin = CFuncPtr1[
  GDExtensionConstStringNamePtr, // p_class_name
  Unit
]

/**
 * Removes an editor plugin.
 */
type GDExtensionInterfaceEditorRemovePlugin = CFuncPtr1[
  GDExtensionConstStringNamePtr, // p_class_name
  Unit
]

/**
 * Loads new XML-formatted documentation data in the editor.
 * The provided pointer can be immediately freed once the function returns.
 */
type GDExtensionInterfaceEditorHelpLoadXmlFromUtf8Chars = CFuncPtr1[
  Ptr[CChar], // p_data
  Unit
]

/**
 * Loads new XML-formatted documentation data in the editor.
 * The provided pointer can be immediately freed once the function returns.
 */
type GDExtensionInterfaceEditorHelpLoadXmlFromUtf8CharsAndLen = CFuncPtr2[
  Ptr[CChar], // p_data
  GDExtensionInt, // p_size
  Unit
]

/**
 * Registers a callback that Godot can call to get the list of all classes (from ClassDB) that may be used by the calling GDExtension.
 * This is used by the editor to generate a build profile (in "Tools" > "Engine Compilation Configuration Editor..." > "Detect from project"),
 * in order to recompile Godot with only the classes used.
 * In the provided callback, the GDExtension should provide the list of classes that _may_ be used statically, thus the time of invocation shouldn't matter.
 * If a GDExtension doesn't register a callback, Godot will assume that it could be using any classes.
 */
type GDExtensionInterfaceEditorRegisterGetClassesUsedCallback = CFuncPtr2[
  GDExtensionClassLibraryPtr, // p_library
  GDExtensionEditorGetClassesUsedCallback, // p_callback
  Unit
]

/**
 * Registers callbacks to be called at different phases of the main loop.
 */
type GDExtensionInterfaceRegisterMainLoopCallbacks = CFuncPtr2[
  GDExtensionClassLibraryPtr, // p_library
  Ptr[GDExtensionMainLoopCallbacks], // p_callbacks
  Unit
]


class Interface private() {
  var get_godot_version: GDExtensionInterfaceGetGodotVersion = null.asInstanceOf[GDExtensionInterfaceGetGodotVersion]
  var get_godot_version2: GDExtensionInterfaceGetGodotVersion2 = null.asInstanceOf[GDExtensionInterfaceGetGodotVersion2]
  var mem_alloc: GDExtensionInterfaceMemAlloc = null.asInstanceOf[GDExtensionInterfaceMemAlloc]
  var mem_realloc: GDExtensionInterfaceMemRealloc = null.asInstanceOf[GDExtensionInterfaceMemRealloc]
  var mem_free: GDExtensionInterfaceMemFree = null.asInstanceOf[GDExtensionInterfaceMemFree]
  var mem_alloc2: GDExtensionInterfaceMemAlloc2 = null.asInstanceOf[GDExtensionInterfaceMemAlloc2]
  var mem_realloc2: GDExtensionInterfaceMemRealloc2 = null.asInstanceOf[GDExtensionInterfaceMemRealloc2]
  var mem_free2: GDExtensionInterfaceMemFree2 = null.asInstanceOf[GDExtensionInterfaceMemFree2]
  var print_error: GDExtensionInterfacePrintError = null.asInstanceOf[GDExtensionInterfacePrintError]
  var print_error_with_message: GDExtensionInterfacePrintErrorWithMessage = null.asInstanceOf[GDExtensionInterfacePrintErrorWithMessage]
  var print_warning: GDExtensionInterfacePrintWarning = null.asInstanceOf[GDExtensionInterfacePrintWarning]
  var print_warning_with_message: GDExtensionInterfacePrintWarningWithMessage = null.asInstanceOf[GDExtensionInterfacePrintWarningWithMessage]
  var print_script_error: GDExtensionInterfacePrintScriptError = null.asInstanceOf[GDExtensionInterfacePrintScriptError]
  var print_script_error_with_message: GDExtensionInterfacePrintScriptErrorWithMessage = null.asInstanceOf[GDExtensionInterfacePrintScriptErrorWithMessage]
  var get_native_struct_size: GDExtensionInterfaceGetNativeStructSize = null.asInstanceOf[GDExtensionInterfaceGetNativeStructSize]
  var variant_new_copy: GDExtensionInterfaceVariantNewCopy = null.asInstanceOf[GDExtensionInterfaceVariantNewCopy]
  var variant_new_nil: GDExtensionInterfaceVariantNewNil = null.asInstanceOf[GDExtensionInterfaceVariantNewNil]
  var variant_destroy: GDExtensionInterfaceVariantDestroy = null.asInstanceOf[GDExtensionInterfaceVariantDestroy]
  var variant_call: GDExtensionInterfaceVariantCall = null.asInstanceOf[GDExtensionInterfaceVariantCall]
  var variant_call_static: GDExtensionInterfaceVariantCallStatic = null.asInstanceOf[GDExtensionInterfaceVariantCallStatic]
  var variant_evaluate: GDExtensionInterfaceVariantEvaluate = null.asInstanceOf[GDExtensionInterfaceVariantEvaluate]
  var variant_set: GDExtensionInterfaceVariantSet = null.asInstanceOf[GDExtensionInterfaceVariantSet]
  var variant_set_named: GDExtensionInterfaceVariantSetNamed = null.asInstanceOf[GDExtensionInterfaceVariantSetNamed]
  var variant_set_keyed: GDExtensionInterfaceVariantSetKeyed = null.asInstanceOf[GDExtensionInterfaceVariantSetKeyed]
  var variant_set_indexed: GDExtensionInterfaceVariantSetIndexed = null.asInstanceOf[GDExtensionInterfaceVariantSetIndexed]
  var variant_get: GDExtensionInterfaceVariantGet = null.asInstanceOf[GDExtensionInterfaceVariantGet]
  var variant_get_named: GDExtensionInterfaceVariantGetNamed = null.asInstanceOf[GDExtensionInterfaceVariantGetNamed]
  var variant_get_keyed: GDExtensionInterfaceVariantGetKeyed = null.asInstanceOf[GDExtensionInterfaceVariantGetKeyed]
  var variant_get_indexed: GDExtensionInterfaceVariantGetIndexed = null.asInstanceOf[GDExtensionInterfaceVariantGetIndexed]
  var variant_iter_init: GDExtensionInterfaceVariantIterInit = null.asInstanceOf[GDExtensionInterfaceVariantIterInit]
  var variant_iter_next: GDExtensionInterfaceVariantIterNext = null.asInstanceOf[GDExtensionInterfaceVariantIterNext]
  var variant_iter_get: GDExtensionInterfaceVariantIterGet = null.asInstanceOf[GDExtensionInterfaceVariantIterGet]
  var variant_hash: GDExtensionInterfaceVariantHash = null.asInstanceOf[GDExtensionInterfaceVariantHash]
  var variant_recursive_hash: GDExtensionInterfaceVariantRecursiveHash = null.asInstanceOf[GDExtensionInterfaceVariantRecursiveHash]
  var variant_hash_compare: GDExtensionInterfaceVariantHashCompare = null.asInstanceOf[GDExtensionInterfaceVariantHashCompare]
  var variant_booleanize: GDExtensionInterfaceVariantBooleanize = null.asInstanceOf[GDExtensionInterfaceVariantBooleanize]
  var variant_duplicate: GDExtensionInterfaceVariantDuplicate = null.asInstanceOf[GDExtensionInterfaceVariantDuplicate]
  var variant_stringify: GDExtensionInterfaceVariantStringify = null.asInstanceOf[GDExtensionInterfaceVariantStringify]
  var variant_get_type: GDExtensionInterfaceVariantGetType = null.asInstanceOf[GDExtensionInterfaceVariantGetType]
  var variant_has_method: GDExtensionInterfaceVariantHasMethod = null.asInstanceOf[GDExtensionInterfaceVariantHasMethod]
  var variant_has_member: GDExtensionInterfaceVariantHasMember = null.asInstanceOf[GDExtensionInterfaceVariantHasMember]
  var variant_has_key: GDExtensionInterfaceVariantHasKey = null.asInstanceOf[GDExtensionInterfaceVariantHasKey]
  var variant_get_object_instance_id: GDExtensionInterfaceVariantGetObjectInstanceId = null.asInstanceOf[GDExtensionInterfaceVariantGetObjectInstanceId]
  var variant_get_type_name: GDExtensionInterfaceVariantGetTypeName = null.asInstanceOf[GDExtensionInterfaceVariantGetTypeName]
  var variant_can_convert: GDExtensionInterfaceVariantCanConvert = null.asInstanceOf[GDExtensionInterfaceVariantCanConvert]
  var variant_can_convert_strict: GDExtensionInterfaceVariantCanConvertStrict = null.asInstanceOf[GDExtensionInterfaceVariantCanConvertStrict]
  var get_variant_from_type_constructor: GDExtensionInterfaceGetVariantFromTypeConstructor = null.asInstanceOf[GDExtensionInterfaceGetVariantFromTypeConstructor]
  var get_variant_to_type_constructor: GDExtensionInterfaceGetVariantToTypeConstructor = null.asInstanceOf[GDExtensionInterfaceGetVariantToTypeConstructor]
  var variant_get_ptr_internal_getter: GDExtensionInterfaceVariantGetPtrInternalGetter = null.asInstanceOf[GDExtensionInterfaceVariantGetPtrInternalGetter]
  var variant_get_ptr_operator_evaluator: GDExtensionInterfaceVariantGetPtrOperatorEvaluator = null.asInstanceOf[GDExtensionInterfaceVariantGetPtrOperatorEvaluator]
  var variant_get_ptr_builtin_method: GDExtensionInterfaceVariantGetPtrBuiltinMethod = null.asInstanceOf[GDExtensionInterfaceVariantGetPtrBuiltinMethod]
  var variant_get_ptr_constructor: GDExtensionInterfaceVariantGetPtrConstructor = null.asInstanceOf[GDExtensionInterfaceVariantGetPtrConstructor]
  var variant_get_ptr_destructor: GDExtensionInterfaceVariantGetPtrDestructor = null.asInstanceOf[GDExtensionInterfaceVariantGetPtrDestructor]
  var variant_construct: GDExtensionInterfaceVariantConstruct = null.asInstanceOf[GDExtensionInterfaceVariantConstruct]
  var variant_get_ptr_setter: GDExtensionInterfaceVariantGetPtrSetter = null.asInstanceOf[GDExtensionInterfaceVariantGetPtrSetter]
  var variant_get_ptr_getter: GDExtensionInterfaceVariantGetPtrGetter = null.asInstanceOf[GDExtensionInterfaceVariantGetPtrGetter]
  var variant_get_ptr_indexed_setter: GDExtensionInterfaceVariantGetPtrIndexedSetter = null.asInstanceOf[GDExtensionInterfaceVariantGetPtrIndexedSetter]
  var variant_get_ptr_indexed_getter: GDExtensionInterfaceVariantGetPtrIndexedGetter = null.asInstanceOf[GDExtensionInterfaceVariantGetPtrIndexedGetter]
  var variant_get_ptr_keyed_setter: GDExtensionInterfaceVariantGetPtrKeyedSetter = null.asInstanceOf[GDExtensionInterfaceVariantGetPtrKeyedSetter]
  var variant_get_ptr_keyed_getter: GDExtensionInterfaceVariantGetPtrKeyedGetter = null.asInstanceOf[GDExtensionInterfaceVariantGetPtrKeyedGetter]
  var variant_get_ptr_keyed_checker: GDExtensionInterfaceVariantGetPtrKeyedChecker = null.asInstanceOf[GDExtensionInterfaceVariantGetPtrKeyedChecker]
  var variant_get_constant_value: GDExtensionInterfaceVariantGetConstantValue = null.asInstanceOf[GDExtensionInterfaceVariantGetConstantValue]
  var variant_get_ptr_utility_function: GDExtensionInterfaceVariantGetPtrUtilityFunction = null.asInstanceOf[GDExtensionInterfaceVariantGetPtrUtilityFunction]
  var string_new_with_latin1_chars: GDExtensionInterfaceStringNewWithLatin1Chars = null.asInstanceOf[GDExtensionInterfaceStringNewWithLatin1Chars]
  var string_new_with_utf8_chars: GDExtensionInterfaceStringNewWithUtf8Chars = null.asInstanceOf[GDExtensionInterfaceStringNewWithUtf8Chars]
  var string_new_with_utf16_chars: GDExtensionInterfaceStringNewWithUtf16Chars = null.asInstanceOf[GDExtensionInterfaceStringNewWithUtf16Chars]
  var string_new_with_utf32_chars: GDExtensionInterfaceStringNewWithUtf32Chars = null.asInstanceOf[GDExtensionInterfaceStringNewWithUtf32Chars]
  var string_new_with_wide_chars: GDExtensionInterfaceStringNewWithWideChars = null.asInstanceOf[GDExtensionInterfaceStringNewWithWideChars]
  var string_new_with_latin1_chars_and_len: GDExtensionInterfaceStringNewWithLatin1CharsAndLen = null.asInstanceOf[GDExtensionInterfaceStringNewWithLatin1CharsAndLen]
  var string_new_with_utf8_chars_and_len: GDExtensionInterfaceStringNewWithUtf8CharsAndLen = null.asInstanceOf[GDExtensionInterfaceStringNewWithUtf8CharsAndLen]
  var string_new_with_utf8_chars_and_len2: GDExtensionInterfaceStringNewWithUtf8CharsAndLen2 = null.asInstanceOf[GDExtensionInterfaceStringNewWithUtf8CharsAndLen2]
  var string_new_with_utf16_chars_and_len: GDExtensionInterfaceStringNewWithUtf16CharsAndLen = null.asInstanceOf[GDExtensionInterfaceStringNewWithUtf16CharsAndLen]
  var string_new_with_utf16_chars_and_len2: GDExtensionInterfaceStringNewWithUtf16CharsAndLen2 = null.asInstanceOf[GDExtensionInterfaceStringNewWithUtf16CharsAndLen2]
  var string_new_with_utf32_chars_and_len: GDExtensionInterfaceStringNewWithUtf32CharsAndLen = null.asInstanceOf[GDExtensionInterfaceStringNewWithUtf32CharsAndLen]
  var string_new_with_wide_chars_and_len: GDExtensionInterfaceStringNewWithWideCharsAndLen = null.asInstanceOf[GDExtensionInterfaceStringNewWithWideCharsAndLen]
  var string_to_latin1_chars: GDExtensionInterfaceStringToLatin1Chars = null.asInstanceOf[GDExtensionInterfaceStringToLatin1Chars]
  var string_to_utf8_chars: GDExtensionInterfaceStringToUtf8Chars = null.asInstanceOf[GDExtensionInterfaceStringToUtf8Chars]
  var string_to_utf16_chars: GDExtensionInterfaceStringToUtf16Chars = null.asInstanceOf[GDExtensionInterfaceStringToUtf16Chars]
  var string_to_utf32_chars: GDExtensionInterfaceStringToUtf32Chars = null.asInstanceOf[GDExtensionInterfaceStringToUtf32Chars]
  var string_to_wide_chars: GDExtensionInterfaceStringToWideChars = null.asInstanceOf[GDExtensionInterfaceStringToWideChars]
  var string_operator_index: GDExtensionInterfaceStringOperatorIndex = null.asInstanceOf[GDExtensionInterfaceStringOperatorIndex]
  var string_operator_index_const: GDExtensionInterfaceStringOperatorIndexConst = null.asInstanceOf[GDExtensionInterfaceStringOperatorIndexConst]
  var string_operator_plus_eq_string: GDExtensionInterfaceStringOperatorPlusEqString = null.asInstanceOf[GDExtensionInterfaceStringOperatorPlusEqString]
  var string_operator_plus_eq_char: GDExtensionInterfaceStringOperatorPlusEqChar = null.asInstanceOf[GDExtensionInterfaceStringOperatorPlusEqChar]
  var string_operator_plus_eq_cstr: GDExtensionInterfaceStringOperatorPlusEqCstr = null.asInstanceOf[GDExtensionInterfaceStringOperatorPlusEqCstr]
  var string_operator_plus_eq_wcstr: GDExtensionInterfaceStringOperatorPlusEqWcstr = null.asInstanceOf[GDExtensionInterfaceStringOperatorPlusEqWcstr]
  var string_operator_plus_eq_c32str: GDExtensionInterfaceStringOperatorPlusEqC32str = null.asInstanceOf[GDExtensionInterfaceStringOperatorPlusEqC32str]
  var string_resize: GDExtensionInterfaceStringResize = null.asInstanceOf[GDExtensionInterfaceStringResize]
  var string_name_new_with_latin1_chars: GDExtensionInterfaceStringNameNewWithLatin1Chars = null.asInstanceOf[GDExtensionInterfaceStringNameNewWithLatin1Chars]
  var string_name_new_with_utf8_chars: GDExtensionInterfaceStringNameNewWithUtf8Chars = null.asInstanceOf[GDExtensionInterfaceStringNameNewWithUtf8Chars]
  var string_name_new_with_utf8_chars_and_len: GDExtensionInterfaceStringNameNewWithUtf8CharsAndLen = null.asInstanceOf[GDExtensionInterfaceStringNameNewWithUtf8CharsAndLen]
  var xml_parser_open_buffer: GDExtensionInterfaceXmlParserOpenBuffer = null.asInstanceOf[GDExtensionInterfaceXmlParserOpenBuffer]
  var file_access_store_buffer: GDExtensionInterfaceFileAccessStoreBuffer = null.asInstanceOf[GDExtensionInterfaceFileAccessStoreBuffer]
  var file_access_get_buffer: GDExtensionInterfaceFileAccessGetBuffer = null.asInstanceOf[GDExtensionInterfaceFileAccessGetBuffer]
  var image_ptrw: GDExtensionInterfaceImagePtrw = null.asInstanceOf[GDExtensionInterfaceImagePtrw]
  var image_ptr: GDExtensionInterfaceImagePtr = null.asInstanceOf[GDExtensionInterfaceImagePtr]
  var worker_thread_pool_add_native_group_task: GDExtensionInterfaceWorkerThreadPoolAddNativeGroupTask = null.asInstanceOf[GDExtensionInterfaceWorkerThreadPoolAddNativeGroupTask]
  var worker_thread_pool_add_native_task: GDExtensionInterfaceWorkerThreadPoolAddNativeTask = null.asInstanceOf[GDExtensionInterfaceWorkerThreadPoolAddNativeTask]
  var packed_byte_array_operator_index: GDExtensionInterfacePackedByteArrayOperatorIndex = null.asInstanceOf[GDExtensionInterfacePackedByteArrayOperatorIndex]
  var packed_byte_array_operator_index_const: GDExtensionInterfacePackedByteArrayOperatorIndexConst = null.asInstanceOf[GDExtensionInterfacePackedByteArrayOperatorIndexConst]
  var packed_float32_array_operator_index: GDExtensionInterfacePackedFloat32ArrayOperatorIndex = null.asInstanceOf[GDExtensionInterfacePackedFloat32ArrayOperatorIndex]
  var packed_float32_array_operator_index_const: GDExtensionInterfacePackedFloat32ArrayOperatorIndexConst = null.asInstanceOf[GDExtensionInterfacePackedFloat32ArrayOperatorIndexConst]
  var packed_float64_array_operator_index: GDExtensionInterfacePackedFloat64ArrayOperatorIndex = null.asInstanceOf[GDExtensionInterfacePackedFloat64ArrayOperatorIndex]
  var packed_float64_array_operator_index_const: GDExtensionInterfacePackedFloat64ArrayOperatorIndexConst = null.asInstanceOf[GDExtensionInterfacePackedFloat64ArrayOperatorIndexConst]
  var packed_int32_array_operator_index: GDExtensionInterfacePackedInt32ArrayOperatorIndex = null.asInstanceOf[GDExtensionInterfacePackedInt32ArrayOperatorIndex]
  var packed_int32_array_operator_index_const: GDExtensionInterfacePackedInt32ArrayOperatorIndexConst = null.asInstanceOf[GDExtensionInterfacePackedInt32ArrayOperatorIndexConst]
  var packed_int64_array_operator_index: GDExtensionInterfacePackedInt64ArrayOperatorIndex = null.asInstanceOf[GDExtensionInterfacePackedInt64ArrayOperatorIndex]
  var packed_int64_array_operator_index_const: GDExtensionInterfacePackedInt64ArrayOperatorIndexConst = null.asInstanceOf[GDExtensionInterfacePackedInt64ArrayOperatorIndexConst]
  var packed_string_array_operator_index: GDExtensionInterfacePackedStringArrayOperatorIndex = null.asInstanceOf[GDExtensionInterfacePackedStringArrayOperatorIndex]
  var packed_string_array_operator_index_const: GDExtensionInterfacePackedStringArrayOperatorIndexConst = null.asInstanceOf[GDExtensionInterfacePackedStringArrayOperatorIndexConst]
  var packed_vector2_array_operator_index: GDExtensionInterfacePackedVector2ArrayOperatorIndex = null.asInstanceOf[GDExtensionInterfacePackedVector2ArrayOperatorIndex]
  var packed_vector2_array_operator_index_const: GDExtensionInterfacePackedVector2ArrayOperatorIndexConst = null.asInstanceOf[GDExtensionInterfacePackedVector2ArrayOperatorIndexConst]
  var packed_vector3_array_operator_index: GDExtensionInterfacePackedVector3ArrayOperatorIndex = null.asInstanceOf[GDExtensionInterfacePackedVector3ArrayOperatorIndex]
  var packed_vector3_array_operator_index_const: GDExtensionInterfacePackedVector3ArrayOperatorIndexConst = null.asInstanceOf[GDExtensionInterfacePackedVector3ArrayOperatorIndexConst]
  var packed_vector4_array_operator_index: GDExtensionInterfacePackedVector4ArrayOperatorIndex = null.asInstanceOf[GDExtensionInterfacePackedVector4ArrayOperatorIndex]
  var packed_vector4_array_operator_index_const: GDExtensionInterfacePackedVector4ArrayOperatorIndexConst = null.asInstanceOf[GDExtensionInterfacePackedVector4ArrayOperatorIndexConst]
  var packed_color_array_operator_index: GDExtensionInterfacePackedColorArrayOperatorIndex = null.asInstanceOf[GDExtensionInterfacePackedColorArrayOperatorIndex]
  var packed_color_array_operator_index_const: GDExtensionInterfacePackedColorArrayOperatorIndexConst = null.asInstanceOf[GDExtensionInterfacePackedColorArrayOperatorIndexConst]
  var array_operator_index: GDExtensionInterfaceArrayOperatorIndex = null.asInstanceOf[GDExtensionInterfaceArrayOperatorIndex]
  var array_operator_index_const: GDExtensionInterfaceArrayOperatorIndexConst = null.asInstanceOf[GDExtensionInterfaceArrayOperatorIndexConst]
  var array_ref: GDExtensionInterfaceArrayRef = null.asInstanceOf[GDExtensionInterfaceArrayRef]
  var array_set_typed: GDExtensionInterfaceArraySetTyped = null.asInstanceOf[GDExtensionInterfaceArraySetTyped]
  var dictionary_operator_index: GDExtensionInterfaceDictionaryOperatorIndex = null.asInstanceOf[GDExtensionInterfaceDictionaryOperatorIndex]
  var dictionary_operator_index_const: GDExtensionInterfaceDictionaryOperatorIndexConst = null.asInstanceOf[GDExtensionInterfaceDictionaryOperatorIndexConst]
  var dictionary_set_typed: GDExtensionInterfaceDictionarySetTyped = null.asInstanceOf[GDExtensionInterfaceDictionarySetTyped]
  var object_method_bind_call: GDExtensionInterfaceObjectMethodBindCall = null.asInstanceOf[GDExtensionInterfaceObjectMethodBindCall]
  var object_method_bind_ptrcall: GDExtensionInterfaceObjectMethodBindPtrcall = null.asInstanceOf[GDExtensionInterfaceObjectMethodBindPtrcall]
  var object_destroy: GDExtensionInterfaceObjectDestroy = null.asInstanceOf[GDExtensionInterfaceObjectDestroy]
  var global_get_singleton: GDExtensionInterfaceGlobalGetSingleton = null.asInstanceOf[GDExtensionInterfaceGlobalGetSingleton]
  var object_get_instance_binding: GDExtensionInterfaceObjectGetInstanceBinding = null.asInstanceOf[GDExtensionInterfaceObjectGetInstanceBinding]
  var object_set_instance_binding: GDExtensionInterfaceObjectSetInstanceBinding = null.asInstanceOf[GDExtensionInterfaceObjectSetInstanceBinding]
  var object_free_instance_binding: GDExtensionInterfaceObjectFreeInstanceBinding = null.asInstanceOf[GDExtensionInterfaceObjectFreeInstanceBinding]
  var object_set_instance: GDExtensionInterfaceObjectSetInstance = null.asInstanceOf[GDExtensionInterfaceObjectSetInstance]
  var object_get_class_name: GDExtensionInterfaceObjectGetClassName = null.asInstanceOf[GDExtensionInterfaceObjectGetClassName]
  var object_cast_to: GDExtensionInterfaceObjectCastTo = null.asInstanceOf[GDExtensionInterfaceObjectCastTo]
  var object_get_instance_from_id: GDExtensionInterfaceObjectGetInstanceFromId = null.asInstanceOf[GDExtensionInterfaceObjectGetInstanceFromId]
  var object_get_instance_id: GDExtensionInterfaceObjectGetInstanceId = null.asInstanceOf[GDExtensionInterfaceObjectGetInstanceId]
  var object_has_script_method: GDExtensionInterfaceObjectHasScriptMethod = null.asInstanceOf[GDExtensionInterfaceObjectHasScriptMethod]
  var object_call_script_method: GDExtensionInterfaceObjectCallScriptMethod = null.asInstanceOf[GDExtensionInterfaceObjectCallScriptMethod]
  var ref_get_object: GDExtensionInterfaceRefGetObject = null.asInstanceOf[GDExtensionInterfaceRefGetObject]
  var ref_set_object: GDExtensionInterfaceRefSetObject = null.asInstanceOf[GDExtensionInterfaceRefSetObject]
  var script_instance_create: GDExtensionInterfaceScriptInstanceCreate = null.asInstanceOf[GDExtensionInterfaceScriptInstanceCreate]
  var script_instance_create2: GDExtensionInterfaceScriptInstanceCreate2 = null.asInstanceOf[GDExtensionInterfaceScriptInstanceCreate2]
  var script_instance_create3: GDExtensionInterfaceScriptInstanceCreate3 = null.asInstanceOf[GDExtensionInterfaceScriptInstanceCreate3]
  var placeholder_script_instance_create: GDExtensionInterfacePlaceholderScriptInstanceCreate = null.asInstanceOf[GDExtensionInterfacePlaceholderScriptInstanceCreate]
  var placeholder_script_instance_update: GDExtensionInterfacePlaceholderScriptInstanceUpdate = null.asInstanceOf[GDExtensionInterfacePlaceholderScriptInstanceUpdate]
  var object_get_script_instance: GDExtensionInterfaceObjectGetScriptInstance = null.asInstanceOf[GDExtensionInterfaceObjectGetScriptInstance]
  var object_set_script_instance: GDExtensionInterfaceObjectSetScriptInstance = null.asInstanceOf[GDExtensionInterfaceObjectSetScriptInstance]
  var callable_custom_create: GDExtensionInterfaceCallableCustomCreate = null.asInstanceOf[GDExtensionInterfaceCallableCustomCreate]
  var callable_custom_create2: GDExtensionInterfaceCallableCustomCreate2 = null.asInstanceOf[GDExtensionInterfaceCallableCustomCreate2]
  var callable_custom_get_userdata: GDExtensionInterfaceCallableCustomGetUserdata = null.asInstanceOf[GDExtensionInterfaceCallableCustomGetUserdata]
  var classdb_construct_object: GDExtensionInterfaceClassdbConstructObject = null.asInstanceOf[GDExtensionInterfaceClassdbConstructObject]
  var classdb_construct_object2: GDExtensionInterfaceClassdbConstructObject2 = null.asInstanceOf[GDExtensionInterfaceClassdbConstructObject2]
  var classdb_get_method_bind: GDExtensionInterfaceClassdbGetMethodBind = null.asInstanceOf[GDExtensionInterfaceClassdbGetMethodBind]
  var classdb_get_class_tag: GDExtensionInterfaceClassdbGetClassTag = null.asInstanceOf[GDExtensionInterfaceClassdbGetClassTag]
  var classdb_register_extension_class: GDExtensionInterfaceClassdbRegisterExtensionClass = null.asInstanceOf[GDExtensionInterfaceClassdbRegisterExtensionClass]
  var classdb_register_extension_class2: GDExtensionInterfaceClassdbRegisterExtensionClass2 = null.asInstanceOf[GDExtensionInterfaceClassdbRegisterExtensionClass2]
  var classdb_register_extension_class3: GDExtensionInterfaceClassdbRegisterExtensionClass3 = null.asInstanceOf[GDExtensionInterfaceClassdbRegisterExtensionClass3]
  var classdb_register_extension_class4: GDExtensionInterfaceClassdbRegisterExtensionClass4 = null.asInstanceOf[GDExtensionInterfaceClassdbRegisterExtensionClass4]
  var classdb_register_extension_class5: GDExtensionInterfaceClassdbRegisterExtensionClass5 = null.asInstanceOf[GDExtensionInterfaceClassdbRegisterExtensionClass5]
  var classdb_register_extension_class_method: GDExtensionInterfaceClassdbRegisterExtensionClassMethod = null.asInstanceOf[GDExtensionInterfaceClassdbRegisterExtensionClassMethod]
  var classdb_register_extension_class_virtual_method: GDExtensionInterfaceClassdbRegisterExtensionClassVirtualMethod = null.asInstanceOf[GDExtensionInterfaceClassdbRegisterExtensionClassVirtualMethod]
  var classdb_register_extension_class_integer_constant: GDExtensionInterfaceClassdbRegisterExtensionClassIntegerConstant = null.asInstanceOf[GDExtensionInterfaceClassdbRegisterExtensionClassIntegerConstant]
  var classdb_register_extension_class_property: GDExtensionInterfaceClassdbRegisterExtensionClassProperty = null.asInstanceOf[GDExtensionInterfaceClassdbRegisterExtensionClassProperty]
  var classdb_register_extension_class_property_indexed: GDExtensionInterfaceClassdbRegisterExtensionClassPropertyIndexed = null.asInstanceOf[GDExtensionInterfaceClassdbRegisterExtensionClassPropertyIndexed]
  var classdb_register_extension_class_property_group: GDExtensionInterfaceClassdbRegisterExtensionClassPropertyGroup = null.asInstanceOf[GDExtensionInterfaceClassdbRegisterExtensionClassPropertyGroup]
  var classdb_register_extension_class_property_subgroup: GDExtensionInterfaceClassdbRegisterExtensionClassPropertySubgroup = null.asInstanceOf[GDExtensionInterfaceClassdbRegisterExtensionClassPropertySubgroup]
  var classdb_register_extension_class_signal: GDExtensionInterfaceClassdbRegisterExtensionClassSignal = null.asInstanceOf[GDExtensionInterfaceClassdbRegisterExtensionClassSignal]
  var classdb_unregister_extension_class: GDExtensionInterfaceClassdbUnregisterExtensionClass = null.asInstanceOf[GDExtensionInterfaceClassdbUnregisterExtensionClass]
  var get_library_path: GDExtensionInterfaceGetLibraryPath = null.asInstanceOf[GDExtensionInterfaceGetLibraryPath]
  var editor_add_plugin: GDExtensionInterfaceEditorAddPlugin = null.asInstanceOf[GDExtensionInterfaceEditorAddPlugin]
  var editor_remove_plugin: GDExtensionInterfaceEditorRemovePlugin = null.asInstanceOf[GDExtensionInterfaceEditorRemovePlugin]
  var editor_help_load_xml_from_utf8_chars: GDExtensionInterfaceEditorHelpLoadXmlFromUtf8Chars = null.asInstanceOf[GDExtensionInterfaceEditorHelpLoadXmlFromUtf8Chars]
  var editor_help_load_xml_from_utf8_chars_and_len: GDExtensionInterfaceEditorHelpLoadXmlFromUtf8CharsAndLen = null.asInstanceOf[GDExtensionInterfaceEditorHelpLoadXmlFromUtf8CharsAndLen]
  var editor_register_get_classes_used_callback: GDExtensionInterfaceEditorRegisterGetClassesUsedCallback = null.asInstanceOf[GDExtensionInterfaceEditorRegisterGetClassesUsedCallback]
  var register_main_loop_callbacks: GDExtensionInterfaceRegisterMainLoopCallbacks = null.asInstanceOf[GDExtensionInterfaceRegisterMainLoopCallbacks]
}
object Interface {

  private def loadBatch0(
    result: Interface,
    getProcAddr: GDExtensionInterfaceGetProcAddress
  )(implicit zone: Zone): Unit = {
      result.get_godot_version = getProcAddr.apply(toCString("get_godot_version")).asInstanceOf[GDExtensionInterfaceGetGodotVersion]
      result.get_godot_version2 = getProcAddr.apply(toCString("get_godot_version2")).asInstanceOf[GDExtensionInterfaceGetGodotVersion2]
      result.mem_alloc = getProcAddr.apply(toCString("mem_alloc")).asInstanceOf[GDExtensionInterfaceMemAlloc]
      result.mem_realloc = getProcAddr.apply(toCString("mem_realloc")).asInstanceOf[GDExtensionInterfaceMemRealloc]
      result.mem_free = getProcAddr.apply(toCString("mem_free")).asInstanceOf[GDExtensionInterfaceMemFree]
      result.mem_alloc2 = getProcAddr.apply(toCString("mem_alloc2")).asInstanceOf[GDExtensionInterfaceMemAlloc2]
      result.mem_realloc2 = getProcAddr.apply(toCString("mem_realloc2")).asInstanceOf[GDExtensionInterfaceMemRealloc2]
      result.mem_free2 = getProcAddr.apply(toCString("mem_free2")).asInstanceOf[GDExtensionInterfaceMemFree2]
      result.print_error = getProcAddr.apply(toCString("print_error")).asInstanceOf[GDExtensionInterfacePrintError]
      result.print_error_with_message = getProcAddr.apply(toCString("print_error_with_message")).asInstanceOf[GDExtensionInterfacePrintErrorWithMessage]
      result.print_warning = getProcAddr.apply(toCString("print_warning")).asInstanceOf[GDExtensionInterfacePrintWarning]
      result.print_warning_with_message = getProcAddr.apply(toCString("print_warning_with_message")).asInstanceOf[GDExtensionInterfacePrintWarningWithMessage]
      result.print_script_error = getProcAddr.apply(toCString("print_script_error")).asInstanceOf[GDExtensionInterfacePrintScriptError]
      result.print_script_error_with_message = getProcAddr.apply(toCString("print_script_error_with_message")).asInstanceOf[GDExtensionInterfacePrintScriptErrorWithMessage]
      result.get_native_struct_size = getProcAddr.apply(toCString("get_native_struct_size")).asInstanceOf[GDExtensionInterfaceGetNativeStructSize]
      result.variant_new_copy = getProcAddr.apply(toCString("variant_new_copy")).asInstanceOf[GDExtensionInterfaceVariantNewCopy]
      result.variant_new_nil = getProcAddr.apply(toCString("variant_new_nil")).asInstanceOf[GDExtensionInterfaceVariantNewNil]
      result.variant_destroy = getProcAddr.apply(toCString("variant_destroy")).asInstanceOf[GDExtensionInterfaceVariantDestroy]
      result.variant_call = getProcAddr.apply(toCString("variant_call")).asInstanceOf[GDExtensionInterfaceVariantCall]
      result.variant_call_static = getProcAddr.apply(toCString("variant_call_static")).asInstanceOf[GDExtensionInterfaceVariantCallStatic]
  }


  private def loadBatch1(
    result: Interface,
    getProcAddr: GDExtensionInterfaceGetProcAddress
  )(implicit zone: Zone): Unit = {
      result.variant_evaluate = getProcAddr.apply(toCString("variant_evaluate")).asInstanceOf[GDExtensionInterfaceVariantEvaluate]
      result.variant_set = getProcAddr.apply(toCString("variant_set")).asInstanceOf[GDExtensionInterfaceVariantSet]
      result.variant_set_named = getProcAddr.apply(toCString("variant_set_named")).asInstanceOf[GDExtensionInterfaceVariantSetNamed]
      result.variant_set_keyed = getProcAddr.apply(toCString("variant_set_keyed")).asInstanceOf[GDExtensionInterfaceVariantSetKeyed]
      result.variant_set_indexed = getProcAddr.apply(toCString("variant_set_indexed")).asInstanceOf[GDExtensionInterfaceVariantSetIndexed]
      result.variant_get = getProcAddr.apply(toCString("variant_get")).asInstanceOf[GDExtensionInterfaceVariantGet]
      result.variant_get_named = getProcAddr.apply(toCString("variant_get_named")).asInstanceOf[GDExtensionInterfaceVariantGetNamed]
      result.variant_get_keyed = getProcAddr.apply(toCString("variant_get_keyed")).asInstanceOf[GDExtensionInterfaceVariantGetKeyed]
      result.variant_get_indexed = getProcAddr.apply(toCString("variant_get_indexed")).asInstanceOf[GDExtensionInterfaceVariantGetIndexed]
      result.variant_iter_init = getProcAddr.apply(toCString("variant_iter_init")).asInstanceOf[GDExtensionInterfaceVariantIterInit]
      result.variant_iter_next = getProcAddr.apply(toCString("variant_iter_next")).asInstanceOf[GDExtensionInterfaceVariantIterNext]
      result.variant_iter_get = getProcAddr.apply(toCString("variant_iter_get")).asInstanceOf[GDExtensionInterfaceVariantIterGet]
      result.variant_hash = getProcAddr.apply(toCString("variant_hash")).asInstanceOf[GDExtensionInterfaceVariantHash]
      result.variant_recursive_hash = getProcAddr.apply(toCString("variant_recursive_hash")).asInstanceOf[GDExtensionInterfaceVariantRecursiveHash]
      result.variant_hash_compare = getProcAddr.apply(toCString("variant_hash_compare")).asInstanceOf[GDExtensionInterfaceVariantHashCompare]
      result.variant_booleanize = getProcAddr.apply(toCString("variant_booleanize")).asInstanceOf[GDExtensionInterfaceVariantBooleanize]
      result.variant_duplicate = getProcAddr.apply(toCString("variant_duplicate")).asInstanceOf[GDExtensionInterfaceVariantDuplicate]
      result.variant_stringify = getProcAddr.apply(toCString("variant_stringify")).asInstanceOf[GDExtensionInterfaceVariantStringify]
      result.variant_get_type = getProcAddr.apply(toCString("variant_get_type")).asInstanceOf[GDExtensionInterfaceVariantGetType]
      result.variant_has_method = getProcAddr.apply(toCString("variant_has_method")).asInstanceOf[GDExtensionInterfaceVariantHasMethod]
  }


  private def loadBatch2(
    result: Interface,
    getProcAddr: GDExtensionInterfaceGetProcAddress
  )(implicit zone: Zone): Unit = {
      result.variant_has_member = getProcAddr.apply(toCString("variant_has_member")).asInstanceOf[GDExtensionInterfaceVariantHasMember]
      result.variant_has_key = getProcAddr.apply(toCString("variant_has_key")).asInstanceOf[GDExtensionInterfaceVariantHasKey]
      result.variant_get_object_instance_id = getProcAddr.apply(toCString("variant_get_object_instance_id")).asInstanceOf[GDExtensionInterfaceVariantGetObjectInstanceId]
      result.variant_get_type_name = getProcAddr.apply(toCString("variant_get_type_name")).asInstanceOf[GDExtensionInterfaceVariantGetTypeName]
      result.variant_can_convert = getProcAddr.apply(toCString("variant_can_convert")).asInstanceOf[GDExtensionInterfaceVariantCanConvert]
      result.variant_can_convert_strict = getProcAddr.apply(toCString("variant_can_convert_strict")).asInstanceOf[GDExtensionInterfaceVariantCanConvertStrict]
      result.get_variant_from_type_constructor = getProcAddr.apply(toCString("get_variant_from_type_constructor")).asInstanceOf[GDExtensionInterfaceGetVariantFromTypeConstructor]
      result.get_variant_to_type_constructor = getProcAddr.apply(toCString("get_variant_to_type_constructor")).asInstanceOf[GDExtensionInterfaceGetVariantToTypeConstructor]
      result.variant_get_ptr_internal_getter = getProcAddr.apply(toCString("variant_get_ptr_internal_getter")).asInstanceOf[GDExtensionInterfaceVariantGetPtrInternalGetter]
      result.variant_get_ptr_operator_evaluator = getProcAddr.apply(toCString("variant_get_ptr_operator_evaluator")).asInstanceOf[GDExtensionInterfaceVariantGetPtrOperatorEvaluator]
      result.variant_get_ptr_builtin_method = getProcAddr.apply(toCString("variant_get_ptr_builtin_method")).asInstanceOf[GDExtensionInterfaceVariantGetPtrBuiltinMethod]
      result.variant_get_ptr_constructor = getProcAddr.apply(toCString("variant_get_ptr_constructor")).asInstanceOf[GDExtensionInterfaceVariantGetPtrConstructor]
      result.variant_get_ptr_destructor = getProcAddr.apply(toCString("variant_get_ptr_destructor")).asInstanceOf[GDExtensionInterfaceVariantGetPtrDestructor]
      result.variant_construct = getProcAddr.apply(toCString("variant_construct")).asInstanceOf[GDExtensionInterfaceVariantConstruct]
      result.variant_get_ptr_setter = getProcAddr.apply(toCString("variant_get_ptr_setter")).asInstanceOf[GDExtensionInterfaceVariantGetPtrSetter]
      result.variant_get_ptr_getter = getProcAddr.apply(toCString("variant_get_ptr_getter")).asInstanceOf[GDExtensionInterfaceVariantGetPtrGetter]
      result.variant_get_ptr_indexed_setter = getProcAddr.apply(toCString("variant_get_ptr_indexed_setter")).asInstanceOf[GDExtensionInterfaceVariantGetPtrIndexedSetter]
      result.variant_get_ptr_indexed_getter = getProcAddr.apply(toCString("variant_get_ptr_indexed_getter")).asInstanceOf[GDExtensionInterfaceVariantGetPtrIndexedGetter]
      result.variant_get_ptr_keyed_setter = getProcAddr.apply(toCString("variant_get_ptr_keyed_setter")).asInstanceOf[GDExtensionInterfaceVariantGetPtrKeyedSetter]
      result.variant_get_ptr_keyed_getter = getProcAddr.apply(toCString("variant_get_ptr_keyed_getter")).asInstanceOf[GDExtensionInterfaceVariantGetPtrKeyedGetter]
  }


  private def loadBatch3(
    result: Interface,
    getProcAddr: GDExtensionInterfaceGetProcAddress
  )(implicit zone: Zone): Unit = {
      result.variant_get_ptr_keyed_checker = getProcAddr.apply(toCString("variant_get_ptr_keyed_checker")).asInstanceOf[GDExtensionInterfaceVariantGetPtrKeyedChecker]
      result.variant_get_constant_value = getProcAddr.apply(toCString("variant_get_constant_value")).asInstanceOf[GDExtensionInterfaceVariantGetConstantValue]
      result.variant_get_ptr_utility_function = getProcAddr.apply(toCString("variant_get_ptr_utility_function")).asInstanceOf[GDExtensionInterfaceVariantGetPtrUtilityFunction]
      result.string_new_with_latin1_chars = getProcAddr.apply(toCString("string_new_with_latin1_chars")).asInstanceOf[GDExtensionInterfaceStringNewWithLatin1Chars]
      result.string_new_with_utf8_chars = getProcAddr.apply(toCString("string_new_with_utf8_chars")).asInstanceOf[GDExtensionInterfaceStringNewWithUtf8Chars]
      result.string_new_with_utf16_chars = getProcAddr.apply(toCString("string_new_with_utf16_chars")).asInstanceOf[GDExtensionInterfaceStringNewWithUtf16Chars]
      result.string_new_with_utf32_chars = getProcAddr.apply(toCString("string_new_with_utf32_chars")).asInstanceOf[GDExtensionInterfaceStringNewWithUtf32Chars]
      result.string_new_with_wide_chars = getProcAddr.apply(toCString("string_new_with_wide_chars")).asInstanceOf[GDExtensionInterfaceStringNewWithWideChars]
      result.string_new_with_latin1_chars_and_len = getProcAddr.apply(toCString("string_new_with_latin1_chars_and_len")).asInstanceOf[GDExtensionInterfaceStringNewWithLatin1CharsAndLen]
      result.string_new_with_utf8_chars_and_len = getProcAddr.apply(toCString("string_new_with_utf8_chars_and_len")).asInstanceOf[GDExtensionInterfaceStringNewWithUtf8CharsAndLen]
      result.string_new_with_utf8_chars_and_len2 = getProcAddr.apply(toCString("string_new_with_utf8_chars_and_len2")).asInstanceOf[GDExtensionInterfaceStringNewWithUtf8CharsAndLen2]
      result.string_new_with_utf16_chars_and_len = getProcAddr.apply(toCString("string_new_with_utf16_chars_and_len")).asInstanceOf[GDExtensionInterfaceStringNewWithUtf16CharsAndLen]
      result.string_new_with_utf16_chars_and_len2 = getProcAddr.apply(toCString("string_new_with_utf16_chars_and_len2")).asInstanceOf[GDExtensionInterfaceStringNewWithUtf16CharsAndLen2]
      result.string_new_with_utf32_chars_and_len = getProcAddr.apply(toCString("string_new_with_utf32_chars_and_len")).asInstanceOf[GDExtensionInterfaceStringNewWithUtf32CharsAndLen]
      result.string_new_with_wide_chars_and_len = getProcAddr.apply(toCString("string_new_with_wide_chars_and_len")).asInstanceOf[GDExtensionInterfaceStringNewWithWideCharsAndLen]
      result.string_to_latin1_chars = getProcAddr.apply(toCString("string_to_latin1_chars")).asInstanceOf[GDExtensionInterfaceStringToLatin1Chars]
      result.string_to_utf8_chars = getProcAddr.apply(toCString("string_to_utf8_chars")).asInstanceOf[GDExtensionInterfaceStringToUtf8Chars]
      result.string_to_utf16_chars = getProcAddr.apply(toCString("string_to_utf16_chars")).asInstanceOf[GDExtensionInterfaceStringToUtf16Chars]
      result.string_to_utf32_chars = getProcAddr.apply(toCString("string_to_utf32_chars")).asInstanceOf[GDExtensionInterfaceStringToUtf32Chars]
      result.string_to_wide_chars = getProcAddr.apply(toCString("string_to_wide_chars")).asInstanceOf[GDExtensionInterfaceStringToWideChars]
  }


  private def loadBatch4(
    result: Interface,
    getProcAddr: GDExtensionInterfaceGetProcAddress
  )(implicit zone: Zone): Unit = {
      result.string_operator_index = getProcAddr.apply(toCString("string_operator_index")).asInstanceOf[GDExtensionInterfaceStringOperatorIndex]
      result.string_operator_index_const = getProcAddr.apply(toCString("string_operator_index_const")).asInstanceOf[GDExtensionInterfaceStringOperatorIndexConst]
      result.string_operator_plus_eq_string = getProcAddr.apply(toCString("string_operator_plus_eq_string")).asInstanceOf[GDExtensionInterfaceStringOperatorPlusEqString]
      result.string_operator_plus_eq_char = getProcAddr.apply(toCString("string_operator_plus_eq_char")).asInstanceOf[GDExtensionInterfaceStringOperatorPlusEqChar]
      result.string_operator_plus_eq_cstr = getProcAddr.apply(toCString("string_operator_plus_eq_cstr")).asInstanceOf[GDExtensionInterfaceStringOperatorPlusEqCstr]
      result.string_operator_plus_eq_wcstr = getProcAddr.apply(toCString("string_operator_plus_eq_wcstr")).asInstanceOf[GDExtensionInterfaceStringOperatorPlusEqWcstr]
      result.string_operator_plus_eq_c32str = getProcAddr.apply(toCString("string_operator_plus_eq_c32str")).asInstanceOf[GDExtensionInterfaceStringOperatorPlusEqC32str]
      result.string_resize = getProcAddr.apply(toCString("string_resize")).asInstanceOf[GDExtensionInterfaceStringResize]
      result.string_name_new_with_latin1_chars = getProcAddr.apply(toCString("string_name_new_with_latin1_chars")).asInstanceOf[GDExtensionInterfaceStringNameNewWithLatin1Chars]
      result.string_name_new_with_utf8_chars = getProcAddr.apply(toCString("string_name_new_with_utf8_chars")).asInstanceOf[GDExtensionInterfaceStringNameNewWithUtf8Chars]
      result.string_name_new_with_utf8_chars_and_len = getProcAddr.apply(toCString("string_name_new_with_utf8_chars_and_len")).asInstanceOf[GDExtensionInterfaceStringNameNewWithUtf8CharsAndLen]
      result.xml_parser_open_buffer = getProcAddr.apply(toCString("xml_parser_open_buffer")).asInstanceOf[GDExtensionInterfaceXmlParserOpenBuffer]
      result.file_access_store_buffer = getProcAddr.apply(toCString("file_access_store_buffer")).asInstanceOf[GDExtensionInterfaceFileAccessStoreBuffer]
      result.file_access_get_buffer = getProcAddr.apply(toCString("file_access_get_buffer")).asInstanceOf[GDExtensionInterfaceFileAccessGetBuffer]
      result.image_ptrw = getProcAddr.apply(toCString("image_ptrw")).asInstanceOf[GDExtensionInterfaceImagePtrw]
      result.image_ptr = getProcAddr.apply(toCString("image_ptr")).asInstanceOf[GDExtensionInterfaceImagePtr]
      result.worker_thread_pool_add_native_group_task = getProcAddr.apply(toCString("worker_thread_pool_add_native_group_task")).asInstanceOf[GDExtensionInterfaceWorkerThreadPoolAddNativeGroupTask]
      result.worker_thread_pool_add_native_task = getProcAddr.apply(toCString("worker_thread_pool_add_native_task")).asInstanceOf[GDExtensionInterfaceWorkerThreadPoolAddNativeTask]
      result.packed_byte_array_operator_index = getProcAddr.apply(toCString("packed_byte_array_operator_index")).asInstanceOf[GDExtensionInterfacePackedByteArrayOperatorIndex]
      result.packed_byte_array_operator_index_const = getProcAddr.apply(toCString("packed_byte_array_operator_index_const")).asInstanceOf[GDExtensionInterfacePackedByteArrayOperatorIndexConst]
  }


  private def loadBatch5(
    result: Interface,
    getProcAddr: GDExtensionInterfaceGetProcAddress
  )(implicit zone: Zone): Unit = {
      result.packed_float32_array_operator_index = getProcAddr.apply(toCString("packed_float32_array_operator_index")).asInstanceOf[GDExtensionInterfacePackedFloat32ArrayOperatorIndex]
      result.packed_float32_array_operator_index_const = getProcAddr.apply(toCString("packed_float32_array_operator_index_const")).asInstanceOf[GDExtensionInterfacePackedFloat32ArrayOperatorIndexConst]
      result.packed_float64_array_operator_index = getProcAddr.apply(toCString("packed_float64_array_operator_index")).asInstanceOf[GDExtensionInterfacePackedFloat64ArrayOperatorIndex]
      result.packed_float64_array_operator_index_const = getProcAddr.apply(toCString("packed_float64_array_operator_index_const")).asInstanceOf[GDExtensionInterfacePackedFloat64ArrayOperatorIndexConst]
      result.packed_int32_array_operator_index = getProcAddr.apply(toCString("packed_int32_array_operator_index")).asInstanceOf[GDExtensionInterfacePackedInt32ArrayOperatorIndex]
      result.packed_int32_array_operator_index_const = getProcAddr.apply(toCString("packed_int32_array_operator_index_const")).asInstanceOf[GDExtensionInterfacePackedInt32ArrayOperatorIndexConst]
      result.packed_int64_array_operator_index = getProcAddr.apply(toCString("packed_int64_array_operator_index")).asInstanceOf[GDExtensionInterfacePackedInt64ArrayOperatorIndex]
      result.packed_int64_array_operator_index_const = getProcAddr.apply(toCString("packed_int64_array_operator_index_const")).asInstanceOf[GDExtensionInterfacePackedInt64ArrayOperatorIndexConst]
      result.packed_string_array_operator_index = getProcAddr.apply(toCString("packed_string_array_operator_index")).asInstanceOf[GDExtensionInterfacePackedStringArrayOperatorIndex]
      result.packed_string_array_operator_index_const = getProcAddr.apply(toCString("packed_string_array_operator_index_const")).asInstanceOf[GDExtensionInterfacePackedStringArrayOperatorIndexConst]
      result.packed_vector2_array_operator_index = getProcAddr.apply(toCString("packed_vector2_array_operator_index")).asInstanceOf[GDExtensionInterfacePackedVector2ArrayOperatorIndex]
      result.packed_vector2_array_operator_index_const = getProcAddr.apply(toCString("packed_vector2_array_operator_index_const")).asInstanceOf[GDExtensionInterfacePackedVector2ArrayOperatorIndexConst]
      result.packed_vector3_array_operator_index = getProcAddr.apply(toCString("packed_vector3_array_operator_index")).asInstanceOf[GDExtensionInterfacePackedVector3ArrayOperatorIndex]
      result.packed_vector3_array_operator_index_const = getProcAddr.apply(toCString("packed_vector3_array_operator_index_const")).asInstanceOf[GDExtensionInterfacePackedVector3ArrayOperatorIndexConst]
      result.packed_vector4_array_operator_index = getProcAddr.apply(toCString("packed_vector4_array_operator_index")).asInstanceOf[GDExtensionInterfacePackedVector4ArrayOperatorIndex]
      result.packed_vector4_array_operator_index_const = getProcAddr.apply(toCString("packed_vector4_array_operator_index_const")).asInstanceOf[GDExtensionInterfacePackedVector4ArrayOperatorIndexConst]
      result.packed_color_array_operator_index = getProcAddr.apply(toCString("packed_color_array_operator_index")).asInstanceOf[GDExtensionInterfacePackedColorArrayOperatorIndex]
      result.packed_color_array_operator_index_const = getProcAddr.apply(toCString("packed_color_array_operator_index_const")).asInstanceOf[GDExtensionInterfacePackedColorArrayOperatorIndexConst]
      result.array_operator_index = getProcAddr.apply(toCString("array_operator_index")).asInstanceOf[GDExtensionInterfaceArrayOperatorIndex]
      result.array_operator_index_const = getProcAddr.apply(toCString("array_operator_index_const")).asInstanceOf[GDExtensionInterfaceArrayOperatorIndexConst]
  }


  private def loadBatch6(
    result: Interface,
    getProcAddr: GDExtensionInterfaceGetProcAddress
  )(implicit zone: Zone): Unit = {
      result.array_ref = getProcAddr.apply(toCString("array_ref")).asInstanceOf[GDExtensionInterfaceArrayRef]
      result.array_set_typed = getProcAddr.apply(toCString("array_set_typed")).asInstanceOf[GDExtensionInterfaceArraySetTyped]
      result.dictionary_operator_index = getProcAddr.apply(toCString("dictionary_operator_index")).asInstanceOf[GDExtensionInterfaceDictionaryOperatorIndex]
      result.dictionary_operator_index_const = getProcAddr.apply(toCString("dictionary_operator_index_const")).asInstanceOf[GDExtensionInterfaceDictionaryOperatorIndexConst]
      result.dictionary_set_typed = getProcAddr.apply(toCString("dictionary_set_typed")).asInstanceOf[GDExtensionInterfaceDictionarySetTyped]
      result.object_method_bind_call = getProcAddr.apply(toCString("object_method_bind_call")).asInstanceOf[GDExtensionInterfaceObjectMethodBindCall]
      result.object_method_bind_ptrcall = getProcAddr.apply(toCString("object_method_bind_ptrcall")).asInstanceOf[GDExtensionInterfaceObjectMethodBindPtrcall]
      result.object_destroy = getProcAddr.apply(toCString("object_destroy")).asInstanceOf[GDExtensionInterfaceObjectDestroy]
      result.global_get_singleton = getProcAddr.apply(toCString("global_get_singleton")).asInstanceOf[GDExtensionInterfaceGlobalGetSingleton]
      result.object_get_instance_binding = getProcAddr.apply(toCString("object_get_instance_binding")).asInstanceOf[GDExtensionInterfaceObjectGetInstanceBinding]
      result.object_set_instance_binding = getProcAddr.apply(toCString("object_set_instance_binding")).asInstanceOf[GDExtensionInterfaceObjectSetInstanceBinding]
      result.object_free_instance_binding = getProcAddr.apply(toCString("object_free_instance_binding")).asInstanceOf[GDExtensionInterfaceObjectFreeInstanceBinding]
      result.object_set_instance = getProcAddr.apply(toCString("object_set_instance")).asInstanceOf[GDExtensionInterfaceObjectSetInstance]
      result.object_get_class_name = getProcAddr.apply(toCString("object_get_class_name")).asInstanceOf[GDExtensionInterfaceObjectGetClassName]
      result.object_cast_to = getProcAddr.apply(toCString("object_cast_to")).asInstanceOf[GDExtensionInterfaceObjectCastTo]
      result.object_get_instance_from_id = getProcAddr.apply(toCString("object_get_instance_from_id")).asInstanceOf[GDExtensionInterfaceObjectGetInstanceFromId]
      result.object_get_instance_id = getProcAddr.apply(toCString("object_get_instance_id")).asInstanceOf[GDExtensionInterfaceObjectGetInstanceId]
      result.object_has_script_method = getProcAddr.apply(toCString("object_has_script_method")).asInstanceOf[GDExtensionInterfaceObjectHasScriptMethod]
      result.object_call_script_method = getProcAddr.apply(toCString("object_call_script_method")).asInstanceOf[GDExtensionInterfaceObjectCallScriptMethod]
      result.ref_get_object = getProcAddr.apply(toCString("ref_get_object")).asInstanceOf[GDExtensionInterfaceRefGetObject]
  }


  private def loadBatch7(
    result: Interface,
    getProcAddr: GDExtensionInterfaceGetProcAddress
  )(implicit zone: Zone): Unit = {
      result.ref_set_object = getProcAddr.apply(toCString("ref_set_object")).asInstanceOf[GDExtensionInterfaceRefSetObject]
      result.script_instance_create = getProcAddr.apply(toCString("script_instance_create")).asInstanceOf[GDExtensionInterfaceScriptInstanceCreate]
      result.script_instance_create2 = getProcAddr.apply(toCString("script_instance_create2")).asInstanceOf[GDExtensionInterfaceScriptInstanceCreate2]
      result.script_instance_create3 = getProcAddr.apply(toCString("script_instance_create3")).asInstanceOf[GDExtensionInterfaceScriptInstanceCreate3]
      result.placeholder_script_instance_create = getProcAddr.apply(toCString("placeholder_script_instance_create")).asInstanceOf[GDExtensionInterfacePlaceholderScriptInstanceCreate]
      result.placeholder_script_instance_update = getProcAddr.apply(toCString("placeholder_script_instance_update")).asInstanceOf[GDExtensionInterfacePlaceholderScriptInstanceUpdate]
      result.object_get_script_instance = getProcAddr.apply(toCString("object_get_script_instance")).asInstanceOf[GDExtensionInterfaceObjectGetScriptInstance]
      result.object_set_script_instance = getProcAddr.apply(toCString("object_set_script_instance")).asInstanceOf[GDExtensionInterfaceObjectSetScriptInstance]
      result.callable_custom_create = getProcAddr.apply(toCString("callable_custom_create")).asInstanceOf[GDExtensionInterfaceCallableCustomCreate]
      result.callable_custom_create2 = getProcAddr.apply(toCString("callable_custom_create2")).asInstanceOf[GDExtensionInterfaceCallableCustomCreate2]
      result.callable_custom_get_userdata = getProcAddr.apply(toCString("callable_custom_get_userdata")).asInstanceOf[GDExtensionInterfaceCallableCustomGetUserdata]
      result.classdb_construct_object = getProcAddr.apply(toCString("classdb_construct_object")).asInstanceOf[GDExtensionInterfaceClassdbConstructObject]
      result.classdb_construct_object2 = getProcAddr.apply(toCString("classdb_construct_object2")).asInstanceOf[GDExtensionInterfaceClassdbConstructObject2]
      result.classdb_get_method_bind = getProcAddr.apply(toCString("classdb_get_method_bind")).asInstanceOf[GDExtensionInterfaceClassdbGetMethodBind]
      result.classdb_get_class_tag = getProcAddr.apply(toCString("classdb_get_class_tag")).asInstanceOf[GDExtensionInterfaceClassdbGetClassTag]
      result.classdb_register_extension_class = getProcAddr.apply(toCString("classdb_register_extension_class")).asInstanceOf[GDExtensionInterfaceClassdbRegisterExtensionClass]
      result.classdb_register_extension_class2 = getProcAddr.apply(toCString("classdb_register_extension_class2")).asInstanceOf[GDExtensionInterfaceClassdbRegisterExtensionClass2]
      result.classdb_register_extension_class3 = getProcAddr.apply(toCString("classdb_register_extension_class3")).asInstanceOf[GDExtensionInterfaceClassdbRegisterExtensionClass3]
      result.classdb_register_extension_class4 = getProcAddr.apply(toCString("classdb_register_extension_class4")).asInstanceOf[GDExtensionInterfaceClassdbRegisterExtensionClass4]
      result.classdb_register_extension_class5 = getProcAddr.apply(toCString("classdb_register_extension_class5")).asInstanceOf[GDExtensionInterfaceClassdbRegisterExtensionClass5]
  }


  private def loadBatch8(
    result: Interface,
    getProcAddr: GDExtensionInterfaceGetProcAddress
  )(implicit zone: Zone): Unit = {
      result.classdb_register_extension_class_method = getProcAddr.apply(toCString("classdb_register_extension_class_method")).asInstanceOf[GDExtensionInterfaceClassdbRegisterExtensionClassMethod]
      result.classdb_register_extension_class_virtual_method = getProcAddr.apply(toCString("classdb_register_extension_class_virtual_method")).asInstanceOf[GDExtensionInterfaceClassdbRegisterExtensionClassVirtualMethod]
      result.classdb_register_extension_class_integer_constant = getProcAddr.apply(toCString("classdb_register_extension_class_integer_constant")).asInstanceOf[GDExtensionInterfaceClassdbRegisterExtensionClassIntegerConstant]
      result.classdb_register_extension_class_property = getProcAddr.apply(toCString("classdb_register_extension_class_property")).asInstanceOf[GDExtensionInterfaceClassdbRegisterExtensionClassProperty]
      result.classdb_register_extension_class_property_indexed = getProcAddr.apply(toCString("classdb_register_extension_class_property_indexed")).asInstanceOf[GDExtensionInterfaceClassdbRegisterExtensionClassPropertyIndexed]
      result.classdb_register_extension_class_property_group = getProcAddr.apply(toCString("classdb_register_extension_class_property_group")).asInstanceOf[GDExtensionInterfaceClassdbRegisterExtensionClassPropertyGroup]
      result.classdb_register_extension_class_property_subgroup = getProcAddr.apply(toCString("classdb_register_extension_class_property_subgroup")).asInstanceOf[GDExtensionInterfaceClassdbRegisterExtensionClassPropertySubgroup]
      result.classdb_register_extension_class_signal = getProcAddr.apply(toCString("classdb_register_extension_class_signal")).asInstanceOf[GDExtensionInterfaceClassdbRegisterExtensionClassSignal]
      result.classdb_unregister_extension_class = getProcAddr.apply(toCString("classdb_unregister_extension_class")).asInstanceOf[GDExtensionInterfaceClassdbUnregisterExtensionClass]
      result.get_library_path = getProcAddr.apply(toCString("get_library_path")).asInstanceOf[GDExtensionInterfaceGetLibraryPath]
      result.editor_add_plugin = getProcAddr.apply(toCString("editor_add_plugin")).asInstanceOf[GDExtensionInterfaceEditorAddPlugin]
      result.editor_remove_plugin = getProcAddr.apply(toCString("editor_remove_plugin")).asInstanceOf[GDExtensionInterfaceEditorRemovePlugin]
      result.editor_help_load_xml_from_utf8_chars = getProcAddr.apply(toCString("editor_help_load_xml_from_utf8_chars")).asInstanceOf[GDExtensionInterfaceEditorHelpLoadXmlFromUtf8Chars]
      result.editor_help_load_xml_from_utf8_chars_and_len = getProcAddr.apply(toCString("editor_help_load_xml_from_utf8_chars_and_len")).asInstanceOf[GDExtensionInterfaceEditorHelpLoadXmlFromUtf8CharsAndLen]
      result.editor_register_get_classes_used_callback = getProcAddr.apply(toCString("editor_register_get_classes_used_callback")).asInstanceOf[GDExtensionInterfaceEditorRegisterGetClassesUsedCallback]
      result.register_main_loop_callbacks = getProcAddr.apply(toCString("register_main_loop_callbacks")).asInstanceOf[GDExtensionInterfaceRegisterMainLoopCallbacks]
  }


  def load(
    getProcAddr: GDExtensionInterfaceGetProcAddress
  ): Interface = Zone.acquire { implicit zone: Zone =>
      val result = new Interface()
      loadBatch0(result, getProcAddr)
      loadBatch1(result, getProcAddr)
      loadBatch2(result, getProcAddr)
      loadBatch3(result, getProcAddr)
      loadBatch4(result, getProcAddr)
      loadBatch5(result, getProcAddr)
      loadBatch6(result, getProcAddr)
      loadBatch7(result, getProcAddr)
      loadBatch8(result, getProcAddr)
      result
  }
}
