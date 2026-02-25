
package godot.codegen.gdextensioninterface.types

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import scala.scalanative.unsigned.UInt.*
import godot.types.*


/**
 * In this API there are multiple functions which expect the caller to pass a pointer
 * on return value as parameter.
 * In order to make it clear if the caller should initialize the return value or not
 * we have two flavor of types:
 * - `GDExtensionXXXPtr` for pointer on an initialized value
 * - `GDExtensionUninitializedXXXPtr` for pointer on uninitialized value
 * 
 * Notes:
 * - Not respecting those requirements can seems harmless, but will lead to unexpected
 * segfault or memory leak (for instance with a specific compiler/OS, or when two
 * native extensions start doing ptrcall on each other).
 * - Initialization must be done with the function pointer returned by `variant_get_ptr_constructor`,
 * zero-initializing the variable should not be considered a valid initialization method here !
 * - Some types have no destructor (see `extension_api.json`'s `has_destructor` field), for
 * them it is always safe to skip the constructor for the return value if you are in a hurry ;-)
 */
type GDExtensionVariantPtr = Ptr[Byte]


type GDExtensionConstVariantPtr = Ptr[Byte]


type GDExtensionUninitializedVariantPtr = Ptr[Byte]


type GDExtensionStringNamePtr = Ptr[Byte]


type GDExtensionConstStringNamePtr = Ptr[Byte]


type GDExtensionUninitializedStringNamePtr = Ptr[Byte]


type GDExtensionStringPtr = Ptr[Byte]


type GDExtensionConstStringPtr = Ptr[Byte]


type GDExtensionUninitializedStringPtr = Ptr[Byte]


type GDExtensionObjectPtr = Ptr[Byte]


type GDExtensionConstObjectPtr = Ptr[Byte]


type GDExtensionUninitializedObjectPtr = Ptr[Byte]


type GDExtensionTypePtr = Ptr[Byte]


type GDExtensionConstTypePtr = Ptr[Byte]


type GDExtensionUninitializedTypePtr = Ptr[Byte]


type GDExtensionMethodBindPtr = Ptr[Byte]


type GDExtensionRefPtr = Ptr[Byte]


type GDExtensionConstRefPtr = Ptr[Byte]


type GDExtensionClassInstancePtr = Ptr[Byte]


type GDExtensionClassLibraryPtr = Ptr[Byte]

/**
 * Pointer to custom ScriptInstance native implementation.
 */
type GDExtensionScriptInstanceDataPtr = Ptr[Byte]


type GDExtensionScriptLanguagePtr = Ptr[Byte]

/**
 * Pointer to ScriptInstance.
 */
type GDExtensionScriptInstancePtr = Ptr[Byte]

