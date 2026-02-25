
package godot.codegen.gdextensioninterface.types

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import scala.scalanative.unsigned.UInt.*
import godot.types.*



type GDExtensionVariantFromTypeConstructorFunc = CFuncPtr2[
  GDExtensionUninitializedVariantPtr, // _0
  GDExtensionTypePtr, // _1
  Unit
]


type GDExtensionTypeFromVariantConstructorFunc = CFuncPtr2[
  GDExtensionUninitializedTypePtr, // _0
  GDExtensionVariantPtr, // _1
  Unit
]


type GDExtensionVariantGetInternalPtrFunc = CFuncPtr1[
  GDExtensionVariantPtr, // _0
  CVoidPtr
]


type GDExtensionPtrOperatorEvaluator = CFuncPtr3[
  GDExtensionConstTypePtr, // p_left
  GDExtensionConstTypePtr, // p_right
  GDExtensionTypePtr, // r_result
  Unit
]


type GDExtensionPtrBuiltInMethod = CFuncPtr4[
  GDExtensionTypePtr, // p_base
  Ptr[GDExtensionConstTypePtr], // p_args
  GDExtensionTypePtr, // r_return
  CInt, // p_argument_count
  Unit
]


type GDExtensionPtrConstructor = CFuncPtr2[
  GDExtensionUninitializedTypePtr, // p_base
  Ptr[GDExtensionConstTypePtr], // p_args
  Unit
]


type GDExtensionPtrDestructor = CFuncPtr1[
  GDExtensionTypePtr, // p_base
  Unit
]


type GDExtensionPtrSetter = CFuncPtr2[
  GDExtensionTypePtr, // p_base
  GDExtensionConstTypePtr, // p_value
  Unit
]


type GDExtensionPtrGetter = CFuncPtr2[
  GDExtensionConstTypePtr, // p_base
  GDExtensionTypePtr, // r_value
  Unit
]


type GDExtensionPtrIndexedSetter = CFuncPtr3[
  GDExtensionTypePtr, // p_base
  GDExtensionInt, // p_index
  GDExtensionConstTypePtr, // p_value
  Unit
]


type GDExtensionPtrIndexedGetter = CFuncPtr3[
  GDExtensionConstTypePtr, // p_base
  GDExtensionInt, // p_index
  GDExtensionTypePtr, // r_value
  Unit
]


type GDExtensionPtrKeyedSetter = CFuncPtr3[
  GDExtensionTypePtr, // p_base
  GDExtensionConstTypePtr, // p_key
  GDExtensionConstTypePtr, // p_value
  Unit
]


type GDExtensionPtrKeyedGetter = CFuncPtr3[
  GDExtensionConstTypePtr, // p_base
  GDExtensionConstTypePtr, // p_key
  GDExtensionTypePtr, // r_value
  Unit
]


type GDExtensionPtrKeyedChecker = CFuncPtr2[
  GDExtensionConstVariantPtr, // p_base
  GDExtensionConstVariantPtr, // p_key
  CUnsignedInt
]


type GDExtensionPtrUtilityFunction = CFuncPtr3[
  GDExtensionTypePtr, // r_return
  Ptr[GDExtensionConstTypePtr], // p_args
  CInt, // p_argument_count
  Unit
]


type GDExtensionClassConstructor = CFuncPtr0[
  
  GDExtensionObjectPtr
]


type GDExtensionInstanceBindingCreateCallback = CFuncPtr2[
  CVoidPtr, // p_token
  CVoidPtr, // p_instance
  CVoidPtr
]


type GDExtensionInstanceBindingFreeCallback = CFuncPtr3[
  CVoidPtr, // p_token
  CVoidPtr, // p_instance
  CVoidPtr, // p_binding
  Unit
]


type GDExtensionInstanceBindingReferenceCallback = CFuncPtr3[
  CVoidPtr, // p_token
  CVoidPtr, // p_binding
  GDExtensionBool, // p_reference
  GDExtensionBool
]


type GDExtensionClassSet = CFuncPtr3[
  GDExtensionClassInstancePtr, // p_instance
  GDExtensionConstStringNamePtr, // p_name
  GDExtensionConstVariantPtr, // p_value
  GDExtensionBool
]


type GDExtensionClassGet = CFuncPtr3[
  GDExtensionClassInstancePtr, // p_instance
  GDExtensionConstStringNamePtr, // p_name
  GDExtensionVariantPtr, // r_ret
  GDExtensionBool
]


type GDExtensionClassGetRID = CFuncPtr1[
  GDExtensionClassInstancePtr, // p_instance
  CUnsignedLongLong
]


type GDExtensionClassGetPropertyList = CFuncPtr2[
  GDExtensionClassInstancePtr, // p_instance
  Ptr[CUnsignedInt], // r_count
  Ptr[GDExtensionPropertyInfo]
]


type GDExtensionClassFreePropertyList = CFuncPtr2[
  GDExtensionClassInstancePtr, // p_instance
  Ptr[GDExtensionPropertyInfo], // p_list
  Unit
]


type GDExtensionClassFreePropertyList2 = CFuncPtr3[
  GDExtensionClassInstancePtr, // p_instance
  Ptr[GDExtensionPropertyInfo], // p_list
  CUnsignedInt, // p_count
  Unit
]


type GDExtensionClassPropertyCanRevert = CFuncPtr2[
  GDExtensionClassInstancePtr, // p_instance
  GDExtensionConstStringNamePtr, // p_name
  GDExtensionBool
]


type GDExtensionClassPropertyGetRevert = CFuncPtr3[
  GDExtensionClassInstancePtr, // p_instance
  GDExtensionConstStringNamePtr, // p_name
  GDExtensionVariantPtr, // r_ret
  GDExtensionBool
]


type GDExtensionClassValidateProperty = CFuncPtr2[
  GDExtensionClassInstancePtr, // p_instance
  Ptr[GDExtensionPropertyInfo], // p_property
  GDExtensionBool
]

/**
 *
 * @deprecated Since 4.2. Use GDExtensionClassNotification2 instead.
 */
type GDExtensionClassNotification = CFuncPtr2[
  GDExtensionClassInstancePtr, // p_instance
  CInt, // p_what
  Unit
]


type GDExtensionClassNotification2 = CFuncPtr3[
  GDExtensionClassInstancePtr, // p_instance
  CInt, // p_what
  GDExtensionBool, // p_reversed
  Unit
]


type GDExtensionClassToString = CFuncPtr3[
  GDExtensionClassInstancePtr, // p_instance
  Ptr[GDExtensionBool], // r_is_valid
  GDExtensionStringPtr, // p_out
  Unit
]


type GDExtensionClassReference = CFuncPtr1[
  GDExtensionClassInstancePtr, // p_instance
  Unit
]


type GDExtensionClassUnreference = CFuncPtr1[
  GDExtensionClassInstancePtr, // p_instance
  Unit
]


type GDExtensionClassCallVirtual = CFuncPtr3[
  GDExtensionClassInstancePtr, // p_instance
  Ptr[GDExtensionConstTypePtr], // p_args
  GDExtensionTypePtr, // r_ret
  Unit
]


type GDExtensionClassCreateInstance = CFuncPtr1[
  CVoidPtr, // p_class_userdata
  GDExtensionObjectPtr
]


type GDExtensionClassCreateInstance2 = CFuncPtr2[
  CVoidPtr, // p_class_userdata
  GDExtensionBool, // p_notify_postinitialize
  GDExtensionObjectPtr
]


type GDExtensionClassFreeInstance = CFuncPtr2[
  CVoidPtr, // p_class_userdata
  GDExtensionClassInstancePtr, // p_instance
  Unit
]


type GDExtensionClassRecreateInstance = CFuncPtr2[
  CVoidPtr, // p_class_userdata
  GDExtensionObjectPtr, // p_object
  GDExtensionClassInstancePtr
]


type GDExtensionClassGetVirtual = CFuncPtr2[
  CVoidPtr, // p_class_userdata
  GDExtensionConstStringNamePtr, // p_name
  GDExtensionClassCallVirtual
]


type GDExtensionClassGetVirtual2 = CFuncPtr3[
  CVoidPtr, // p_class_userdata
  GDExtensionConstStringNamePtr, // p_name
  CUnsignedInt, // p_hash
  GDExtensionClassCallVirtual
]


type GDExtensionClassGetVirtualCallData = CFuncPtr2[
  CVoidPtr, // p_class_userdata
  GDExtensionConstStringNamePtr, // p_name
  CVoidPtr
]


type GDExtensionClassGetVirtualCallData2 = CFuncPtr3[
  CVoidPtr, // p_class_userdata
  GDExtensionConstStringNamePtr, // p_name
  CUnsignedInt, // p_hash
  CVoidPtr
]


type GDExtensionClassCallVirtualWithData = CFuncPtr5[
  GDExtensionClassInstancePtr, // p_instance
  GDExtensionConstStringNamePtr, // p_name
  CVoidPtr, // p_virtual_call_userdata
  Ptr[GDExtensionConstTypePtr], // p_args
  GDExtensionTypePtr, // r_ret
  Unit
]

/**
 * Passed a pointer to a PackedStringArray that should be filled with the classes that may be used by the GDExtension.
 */
type GDExtensionEditorGetClassesUsedCallback = CFuncPtr1[
  GDExtensionTypePtr, // p_packed_string_array
  Unit
]


type GDExtensionClassMethodCall = CFuncPtr6[
  CVoidPtr, // method_userdata
  GDExtensionClassInstancePtr, // p_instance
  Ptr[GDExtensionConstVariantPtr], // p_args
  GDExtensionInt, // p_argument_count
  GDExtensionVariantPtr, // r_return
  Ptr[GDExtensionCallError], // r_error
  Unit
]


type GDExtensionClassMethodValidatedCall = CFuncPtr4[
  CVoidPtr, // method_userdata
  GDExtensionClassInstancePtr, // p_instance
  Ptr[GDExtensionConstVariantPtr], // p_args
  GDExtensionVariantPtr, // r_return
  Unit
]


type GDExtensionClassMethodPtrCall = CFuncPtr4[
  CVoidPtr, // method_userdata
  GDExtensionClassInstancePtr, // p_instance
  Ptr[GDExtensionConstTypePtr], // p_args
  GDExtensionTypePtr, // r_ret
  Unit
]


type GDExtensionCallableCustomCall = CFuncPtr5[
  CVoidPtr, // callable_userdata
  Ptr[GDExtensionConstVariantPtr], // p_args
  GDExtensionInt, // p_argument_count
  GDExtensionVariantPtr, // r_return
  Ptr[GDExtensionCallError], // r_error
  Unit
]


type GDExtensionCallableCustomIsValid = CFuncPtr1[
  CVoidPtr, // callable_userdata
  GDExtensionBool
]


type GDExtensionCallableCustomFree = CFuncPtr1[
  CVoidPtr, // callable_userdata
  Unit
]


type GDExtensionCallableCustomHash = CFuncPtr1[
  CVoidPtr, // callable_userdata
  CUnsignedInt
]


type GDExtensionCallableCustomEqual = CFuncPtr2[
  CVoidPtr, // callable_userdata_a
  CVoidPtr, // callable_userdata_b
  GDExtensionBool
]


type GDExtensionCallableCustomLessThan = CFuncPtr2[
  CVoidPtr, // callable_userdata_a
  CVoidPtr, // callable_userdata_b
  GDExtensionBool
]


type GDExtensionCallableCustomToString = CFuncPtr3[
  CVoidPtr, // callable_userdata
  Ptr[GDExtensionBool], // r_is_valid
  GDExtensionStringPtr, // r_out
  Unit
]


type GDExtensionCallableCustomGetArgumentCount = CFuncPtr2[
  CVoidPtr, // callable_userdata
  Ptr[GDExtensionBool], // r_is_valid
  GDExtensionInt
]


type GDExtensionScriptInstanceSet = CFuncPtr3[
  GDExtensionScriptInstanceDataPtr, // p_instance
  GDExtensionConstStringNamePtr, // p_name
  GDExtensionConstVariantPtr, // p_value
  GDExtensionBool
]


type GDExtensionScriptInstanceGet = CFuncPtr3[
  GDExtensionScriptInstanceDataPtr, // p_instance
  GDExtensionConstStringNamePtr, // p_name
  GDExtensionVariantPtr, // r_ret
  GDExtensionBool
]


type GDExtensionScriptInstanceGetPropertyList = CFuncPtr2[
  GDExtensionScriptInstanceDataPtr, // p_instance
  Ptr[CUnsignedInt], // r_count
  Ptr[GDExtensionPropertyInfo]
]

/**
 *
 * @deprecated Since 4.3. Use GDExtensionScriptInstanceFreePropertyList2 instead.
 */
type GDExtensionScriptInstanceFreePropertyList = CFuncPtr2[
  GDExtensionScriptInstanceDataPtr, // p_instance
  Ptr[GDExtensionPropertyInfo], // p_list
  Unit
]


type GDExtensionScriptInstanceFreePropertyList2 = CFuncPtr3[
  GDExtensionScriptInstanceDataPtr, // p_instance
  Ptr[GDExtensionPropertyInfo], // p_list
  CUnsignedInt, // p_count
  Unit
]


type GDExtensionScriptInstanceGetClassCategory = CFuncPtr2[
  GDExtensionScriptInstanceDataPtr, // p_instance
  Ptr[GDExtensionPropertyInfo], // p_class_category
  GDExtensionBool
]


type GDExtensionScriptInstanceGetPropertyType = CFuncPtr3[
  GDExtensionScriptInstanceDataPtr, // p_instance
  GDExtensionConstStringNamePtr, // p_name
  Ptr[GDExtensionBool], // r_is_valid
  GDExtensionVariantType
]


type GDExtensionScriptInstanceValidateProperty = CFuncPtr2[
  GDExtensionScriptInstanceDataPtr, // p_instance
  Ptr[GDExtensionPropertyInfo], // p_property
  GDExtensionBool
]


type GDExtensionScriptInstancePropertyCanRevert = CFuncPtr2[
  GDExtensionScriptInstanceDataPtr, // p_instance
  GDExtensionConstStringNamePtr, // p_name
  GDExtensionBool
]


type GDExtensionScriptInstancePropertyGetRevert = CFuncPtr3[
  GDExtensionScriptInstanceDataPtr, // p_instance
  GDExtensionConstStringNamePtr, // p_name
  GDExtensionVariantPtr, // r_ret
  GDExtensionBool
]


type GDExtensionScriptInstanceGetOwner = CFuncPtr1[
  GDExtensionScriptInstanceDataPtr, // p_instance
  GDExtensionObjectPtr
]


type GDExtensionScriptInstancePropertyStateAdd = CFuncPtr3[
  GDExtensionConstStringNamePtr, // p_name
  GDExtensionConstVariantPtr, // p_value
  CVoidPtr, // p_userdata
  Unit
]


type GDExtensionScriptInstanceGetPropertyState = CFuncPtr3[
  GDExtensionScriptInstanceDataPtr, // p_instance
  GDExtensionScriptInstancePropertyStateAdd, // p_add_func
  CVoidPtr, // p_userdata
  Unit
]


type GDExtensionScriptInstanceGetMethodList = CFuncPtr2[
  GDExtensionScriptInstanceDataPtr, // p_instance
  Ptr[CUnsignedInt], // r_count
  Ptr[GDExtensionMethodInfo]
]

/**
 *
 * @deprecated Since 4.3. Use GDExtensionScriptInstanceFreeMethodList2 instead.
 */
type GDExtensionScriptInstanceFreeMethodList = CFuncPtr2[
  GDExtensionScriptInstanceDataPtr, // p_instance
  Ptr[GDExtensionMethodInfo], // p_list
  Unit
]


type GDExtensionScriptInstanceFreeMethodList2 = CFuncPtr3[
  GDExtensionScriptInstanceDataPtr, // p_instance
  Ptr[GDExtensionMethodInfo], // p_list
  CUnsignedInt, // p_count
  Unit
]


type GDExtensionScriptInstanceHasMethod = CFuncPtr2[
  GDExtensionScriptInstanceDataPtr, // p_instance
  GDExtensionConstStringNamePtr, // p_name
  GDExtensionBool
]


type GDExtensionScriptInstanceGetMethodArgumentCount = CFuncPtr3[
  GDExtensionScriptInstanceDataPtr, // p_instance
  GDExtensionConstStringNamePtr, // p_name
  Ptr[GDExtensionBool], // r_is_valid
  GDExtensionInt
]


type GDExtensionScriptInstanceCall = CFuncPtr6[
  GDExtensionScriptInstanceDataPtr, // p_self
  GDExtensionConstStringNamePtr, // p_method
  Ptr[GDExtensionConstVariantPtr], // p_args
  GDExtensionInt, // p_argument_count
  GDExtensionVariantPtr, // r_return
  Ptr[GDExtensionCallError], // r_error
  Unit
]

/**
 *
 * @deprecated Since 4.2. Use GDExtensionScriptInstanceNotification2 instead.
 */
type GDExtensionScriptInstanceNotification = CFuncPtr2[
  GDExtensionScriptInstanceDataPtr, // p_instance
  CInt, // p_what
  Unit
]


type GDExtensionScriptInstanceNotification2 = CFuncPtr3[
  GDExtensionScriptInstanceDataPtr, // p_instance
  CInt, // p_what
  GDExtensionBool, // p_reversed
  Unit
]


type GDExtensionScriptInstanceToString = CFuncPtr3[
  GDExtensionScriptInstanceDataPtr, // p_instance
  Ptr[GDExtensionBool], // r_is_valid
  GDExtensionStringPtr, // r_out
  Unit
]


type GDExtensionScriptInstanceRefCountIncremented = CFuncPtr1[
  GDExtensionScriptInstanceDataPtr, // p_instance
  Unit
]


type GDExtensionScriptInstanceRefCountDecremented = CFuncPtr1[
  GDExtensionScriptInstanceDataPtr, // p_instance
  GDExtensionBool
]


type GDExtensionScriptInstanceGetScript = CFuncPtr1[
  GDExtensionScriptInstanceDataPtr, // p_instance
  GDExtensionObjectPtr
]


type GDExtensionScriptInstanceIsPlaceholder = CFuncPtr1[
  GDExtensionScriptInstanceDataPtr, // p_instance
  GDExtensionBool
]


type GDExtensionScriptInstanceGetLanguage = CFuncPtr1[
  GDExtensionScriptInstanceDataPtr, // p_instance
  GDExtensionScriptLanguagePtr
]


type GDExtensionScriptInstanceFree = CFuncPtr1[
  GDExtensionScriptInstanceDataPtr, // p_instance
  Unit
]


type GDExtensionWorkerThreadPoolGroupTask = CFuncPtr2[
  CVoidPtr, // _0
  CUnsignedInt, // _1
  Unit
]


type GDExtensionWorkerThreadPoolTask = CFuncPtr1[
  CVoidPtr, // _0
  Unit
]


type GDExtensionInitializeCallback = CFuncPtr2[
  CVoidPtr, // p_userdata
  GDExtensionInitializationLevel, // p_level
  Unit
]


type GDExtensionDeinitializeCallback = CFuncPtr2[
  CVoidPtr, // p_userdata
  GDExtensionInitializationLevel, // p_level
  Unit
]


type GDExtensionInterfaceFunctionPtr = CVoidPtr


type GDExtensionInterfaceGetProcAddress = CFuncPtr1[
  Ptr[CChar], // p_function_name
  GDExtensionInterfaceFunctionPtr
]

/**
 * Each GDExtension should define a C function that matches the signature of GDExtensionInitializationFunction,
 * and export it so that it can be loaded via dlopen() or equivalent for the given platform.
 * 
 * For example:
 * 
 *   GDExtensionBool my_extension_init(GDExtensionInterfaceGetProcAddress p_get_proc_address, GDExtensionClassLibraryPtr p_library, GDExtensionInitialization *r_initialization);
 * 
 * This function's name must be specified as the 'entry_symbol' in the .gdextension file.
 * 
 * This makes it the entry point of the GDExtension and will be called on initialization.
 * 
 * The GDExtension can then modify the r_initialization structure, setting the minimum initialization level,
 * and providing pointers to functions that will be called at various stages of initialization/shutdown.
 * 
 * The rest of the GDExtension's interface to Godot consists of function pointers that can be loaded
 * by calling p_get_proc_address("...") with the name of the function.
 * 
 * For example:
 * 
 *   GDExtensionInterfaceGetGodotVersion get_godot_version = (GDExtensionInterfaceGetGodotVersion)p_get_proc_address("get_godot_version");
 * 
 * (Note that snippet may cause "cast between incompatible function types" on some compilers, you can
 * silence this by adding an intermediary `void*` cast.)
 * 
 * You can then call it like a normal function:
 * 
 *   GDExtensionGodotVersion godot_version;
 *   get_godot_version(&godot_version);
 *   printf("Godot v%d.%d.%d\n", godot_version.major, godot_version.minor, godot_version.patch);
 * 
 * All of these interface functions are described below, together with the name that's used to load it,
 * and the function pointer typedef that shows its signature.
 */
type GDExtensionInitializationFunction = CFuncPtr3[
  GDExtensionInterfaceGetProcAddress, // p_get_proc_address
  GDExtensionClassLibraryPtr, // p_library
  Ptr[GDExtensionInitialization], // r_initialization
  GDExtensionBool
]

/**
 * Called when starting the main loop.
 */
type GDExtensionMainLoopStartupCallback = CFuncPtr0[
  
  Unit
]

/**
 * Called when shutting down the main loop.
 */
type GDExtensionMainLoopShutdownCallback = CFuncPtr0[
  
  Unit
]

/**
 * Called for every frame iteration of the main loop.
 */
type GDExtensionMainLoopFrameCallback = CFuncPtr0[
  
  Unit
]

