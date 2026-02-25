
package godot.codegen.gdextensioninterface.types

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import scala.scalanative.unsigned.UInt.*
import godot.types.*



type GDExtensionVariantFromTypeConstructorFunc = CFuncPtr2[
  GDExtensionUninitializedVariantPtr,
  GDExtensionTypePtr,
  Unit
]


type GDExtensionTypeFromVariantConstructorFunc = CFuncPtr2[
  GDExtensionUninitializedTypePtr,
  GDExtensionVariantPtr,
  Unit
]


type GDExtensionVariantGetInternalPtrFunc = CFuncPtr1[
  GDExtensionVariantPtr,
  CVoidPtr
]


type GDExtensionPtrOperatorEvaluator = CFuncPtr3[
  GDExtensionConstTypePtr,
  GDExtensionConstTypePtr,
  GDExtensionTypePtr,
  Unit
]


type GDExtensionPtrBuiltInMethod = CFuncPtr4[
  GDExtensionTypePtr,
  Ptr[GDExtensionConstTypePtr],
  GDExtensionTypePtr,
  CInt,
  Unit
]


type GDExtensionPtrConstructor = CFuncPtr2[
  GDExtensionUninitializedTypePtr,
  Ptr[GDExtensionConstTypePtr],
  Unit
]


type GDExtensionPtrDestructor = CFuncPtr1[
  GDExtensionTypePtr,
  Unit
]


type GDExtensionPtrSetter = CFuncPtr2[
  GDExtensionTypePtr,
  GDExtensionConstTypePtr,
  Unit
]


type GDExtensionPtrGetter = CFuncPtr2[
  GDExtensionConstTypePtr,
  GDExtensionTypePtr,
  Unit
]


type GDExtensionPtrIndexedSetter = CFuncPtr3[
  GDExtensionTypePtr,
  GDExtensionInt,
  GDExtensionConstTypePtr,
  Unit
]


type GDExtensionPtrIndexedGetter = CFuncPtr3[
  GDExtensionConstTypePtr,
  GDExtensionInt,
  GDExtensionTypePtr,
  Unit
]


type GDExtensionPtrKeyedSetter = CFuncPtr3[
  GDExtensionTypePtr,
  GDExtensionConstTypePtr,
  GDExtensionConstTypePtr,
  Unit
]


type GDExtensionPtrKeyedGetter = CFuncPtr3[
  GDExtensionConstTypePtr,
  GDExtensionConstTypePtr,
  GDExtensionTypePtr,
  Unit
]


type GDExtensionPtrKeyedChecker = CFuncPtr2[
  GDExtensionConstVariantPtr,
  GDExtensionConstVariantPtr,
  CUnsignedInt
]


type GDExtensionPtrUtilityFunction = CFuncPtr3[
  GDExtensionTypePtr,
  Ptr[GDExtensionConstTypePtr],
  CInt,
  Unit
]


type GDExtensionClassConstructor = CFuncPtr0[
  
  GDExtensionObjectPtr
]


type GDExtensionInstanceBindingCreateCallback = CFuncPtr2[
  CVoidPtr,
  CVoidPtr,
  CVoidPtr
]


type GDExtensionInstanceBindingFreeCallback = CFuncPtr3[
  CVoidPtr,
  CVoidPtr,
  CVoidPtr,
  Unit
]


type GDExtensionInstanceBindingReferenceCallback = CFuncPtr3[
  CVoidPtr,
  CVoidPtr,
  GDExtensionBool,
  GDExtensionBool
]


type GDExtensionClassSet = CFuncPtr3[
  GDExtensionClassInstancePtr,
  GDExtensionConstStringNamePtr,
  GDExtensionConstVariantPtr,
  GDExtensionBool
]


type GDExtensionClassGet = CFuncPtr3[
  GDExtensionClassInstancePtr,
  GDExtensionConstStringNamePtr,
  GDExtensionVariantPtr,
  GDExtensionBool
]


type GDExtensionClassGetRID = CFuncPtr1[
  GDExtensionClassInstancePtr,
  CUnsignedLongLong
]


type GDExtensionClassGetPropertyList = CFuncPtr2[
  GDExtensionClassInstancePtr,
  Ptr[CUnsignedInt],
  Ptr[GDExtensionPropertyInfo]
]


type GDExtensionClassFreePropertyList = CFuncPtr2[
  GDExtensionClassInstancePtr,
  Ptr[GDExtensionPropertyInfo],
  Unit
]


type GDExtensionClassFreePropertyList2 = CFuncPtr3[
  GDExtensionClassInstancePtr,
  Ptr[GDExtensionPropertyInfo],
  CUnsignedInt,
  Unit
]


type GDExtensionClassPropertyCanRevert = CFuncPtr2[
  GDExtensionClassInstancePtr,
  GDExtensionConstStringNamePtr,
  GDExtensionBool
]


type GDExtensionClassPropertyGetRevert = CFuncPtr3[
  GDExtensionClassInstancePtr,
  GDExtensionConstStringNamePtr,
  GDExtensionVariantPtr,
  GDExtensionBool
]


type GDExtensionClassValidateProperty = CFuncPtr2[
  GDExtensionClassInstancePtr,
  Ptr[GDExtensionPropertyInfo],
  GDExtensionBool
]

/**
 *
 * @deprecated Since 4.2. Use GDExtensionClassNotification2 instead.
 */
type GDExtensionClassNotification = CFuncPtr2[
  GDExtensionClassInstancePtr,
  CInt,
  Unit
]


type GDExtensionClassNotification2 = CFuncPtr3[
  GDExtensionClassInstancePtr,
  CInt,
  GDExtensionBool,
  Unit
]


type GDExtensionClassToString = CFuncPtr3[
  GDExtensionClassInstancePtr,
  Ptr[GDExtensionBool],
  GDExtensionStringPtr,
  Unit
]


type GDExtensionClassReference = CFuncPtr1[
  GDExtensionClassInstancePtr,
  Unit
]


type GDExtensionClassUnreference = CFuncPtr1[
  GDExtensionClassInstancePtr,
  Unit
]


type GDExtensionClassCallVirtual = CFuncPtr3[
  GDExtensionClassInstancePtr,
  Ptr[GDExtensionConstTypePtr],
  GDExtensionTypePtr,
  Unit
]


type GDExtensionClassCreateInstance = CFuncPtr1[
  CVoidPtr,
  GDExtensionObjectPtr
]


type GDExtensionClassCreateInstance2 = CFuncPtr2[
  CVoidPtr,
  GDExtensionBool,
  GDExtensionObjectPtr
]


type GDExtensionClassFreeInstance = CFuncPtr2[
  CVoidPtr,
  GDExtensionClassInstancePtr,
  Unit
]


type GDExtensionClassRecreateInstance = CFuncPtr2[
  CVoidPtr,
  GDExtensionObjectPtr,
  GDExtensionClassInstancePtr
]


type GDExtensionClassGetVirtual = CFuncPtr2[
  CVoidPtr,
  GDExtensionConstStringNamePtr,
  GDExtensionClassCallVirtual
]


type GDExtensionClassGetVirtual2 = CFuncPtr3[
  CVoidPtr,
  GDExtensionConstStringNamePtr,
  CUnsignedInt,
  GDExtensionClassCallVirtual
]


type GDExtensionClassGetVirtualCallData = CFuncPtr2[
  CVoidPtr,
  GDExtensionConstStringNamePtr,
  CVoidPtr
]


type GDExtensionClassGetVirtualCallData2 = CFuncPtr3[
  CVoidPtr,
  GDExtensionConstStringNamePtr,
  CUnsignedInt,
  CVoidPtr
]


type GDExtensionClassCallVirtualWithData = CFuncPtr5[
  GDExtensionClassInstancePtr,
  GDExtensionConstStringNamePtr,
  CVoidPtr,
  Ptr[GDExtensionConstTypePtr],
  GDExtensionTypePtr,
  Unit
]

/**
 * Passed a pointer to a PackedStringArray that should be filled with the classes that may be used by the GDExtension.
 */
type GDExtensionEditorGetClassesUsedCallback = CFuncPtr1[
  GDExtensionTypePtr,
  Unit
]


type GDExtensionClassMethodCall = CFuncPtr6[
  CVoidPtr,
  GDExtensionClassInstancePtr,
  Ptr[GDExtensionConstVariantPtr],
  GDExtensionInt,
  GDExtensionVariantPtr,
  Ptr[GDExtensionCallError],
  Unit
]


type GDExtensionClassMethodValidatedCall = CFuncPtr4[
  CVoidPtr,
  GDExtensionClassInstancePtr,
  Ptr[GDExtensionConstVariantPtr],
  GDExtensionVariantPtr,
  Unit
]


type GDExtensionClassMethodPtrCall = CFuncPtr4[
  CVoidPtr,
  GDExtensionClassInstancePtr,
  Ptr[GDExtensionConstTypePtr],
  GDExtensionTypePtr,
  Unit
]


type GDExtensionCallableCustomCall = CFuncPtr5[
  CVoidPtr,
  Ptr[GDExtensionConstVariantPtr],
  GDExtensionInt,
  GDExtensionVariantPtr,
  Ptr[GDExtensionCallError],
  Unit
]


type GDExtensionCallableCustomIsValid = CFuncPtr1[
  CVoidPtr,
  GDExtensionBool
]


type GDExtensionCallableCustomFree = CFuncPtr1[
  CVoidPtr,
  Unit
]


type GDExtensionCallableCustomHash = CFuncPtr1[
  CVoidPtr,
  CUnsignedInt
]


type GDExtensionCallableCustomEqual = CFuncPtr2[
  CVoidPtr,
  CVoidPtr,
  GDExtensionBool
]


type GDExtensionCallableCustomLessThan = CFuncPtr2[
  CVoidPtr,
  CVoidPtr,
  GDExtensionBool
]


type GDExtensionCallableCustomToString = CFuncPtr3[
  CVoidPtr,
  Ptr[GDExtensionBool],
  GDExtensionStringPtr,
  Unit
]


type GDExtensionCallableCustomGetArgumentCount = CFuncPtr2[
  CVoidPtr,
  Ptr[GDExtensionBool],
  GDExtensionInt
]


type GDExtensionScriptInstanceSet = CFuncPtr3[
  GDExtensionScriptInstanceDataPtr,
  GDExtensionConstStringNamePtr,
  GDExtensionConstVariantPtr,
  GDExtensionBool
]


type GDExtensionScriptInstanceGet = CFuncPtr3[
  GDExtensionScriptInstanceDataPtr,
  GDExtensionConstStringNamePtr,
  GDExtensionVariantPtr,
  GDExtensionBool
]


type GDExtensionScriptInstanceGetPropertyList = CFuncPtr2[
  GDExtensionScriptInstanceDataPtr,
  Ptr[CUnsignedInt],
  Ptr[GDExtensionPropertyInfo]
]

/**
 *
 * @deprecated Since 4.3. Use GDExtensionScriptInstanceFreePropertyList2 instead.
 */
type GDExtensionScriptInstanceFreePropertyList = CFuncPtr2[
  GDExtensionScriptInstanceDataPtr,
  Ptr[GDExtensionPropertyInfo],
  Unit
]


type GDExtensionScriptInstanceFreePropertyList2 = CFuncPtr3[
  GDExtensionScriptInstanceDataPtr,
  Ptr[GDExtensionPropertyInfo],
  CUnsignedInt,
  Unit
]


type GDExtensionScriptInstanceGetClassCategory = CFuncPtr2[
  GDExtensionScriptInstanceDataPtr,
  Ptr[GDExtensionPropertyInfo],
  GDExtensionBool
]


type GDExtensionScriptInstanceGetPropertyType = CFuncPtr3[
  GDExtensionScriptInstanceDataPtr,
  GDExtensionConstStringNamePtr,
  Ptr[GDExtensionBool],
  GDExtensionVariantType
]


type GDExtensionScriptInstanceValidateProperty = CFuncPtr2[
  GDExtensionScriptInstanceDataPtr,
  Ptr[GDExtensionPropertyInfo],
  GDExtensionBool
]


type GDExtensionScriptInstancePropertyCanRevert = CFuncPtr2[
  GDExtensionScriptInstanceDataPtr,
  GDExtensionConstStringNamePtr,
  GDExtensionBool
]


type GDExtensionScriptInstancePropertyGetRevert = CFuncPtr3[
  GDExtensionScriptInstanceDataPtr,
  GDExtensionConstStringNamePtr,
  GDExtensionVariantPtr,
  GDExtensionBool
]


type GDExtensionScriptInstanceGetOwner = CFuncPtr1[
  GDExtensionScriptInstanceDataPtr,
  GDExtensionObjectPtr
]


type GDExtensionScriptInstancePropertyStateAdd = CFuncPtr3[
  GDExtensionConstStringNamePtr,
  GDExtensionConstVariantPtr,
  CVoidPtr,
  Unit
]


type GDExtensionScriptInstanceGetPropertyState = CFuncPtr3[
  GDExtensionScriptInstanceDataPtr,
  GDExtensionScriptInstancePropertyStateAdd,
  CVoidPtr,
  Unit
]


type GDExtensionScriptInstanceGetMethodList = CFuncPtr2[
  GDExtensionScriptInstanceDataPtr,
  Ptr[CUnsignedInt],
  Ptr[GDExtensionMethodInfo]
]

/**
 *
 * @deprecated Since 4.3. Use GDExtensionScriptInstanceFreeMethodList2 instead.
 */
type GDExtensionScriptInstanceFreeMethodList = CFuncPtr2[
  GDExtensionScriptInstanceDataPtr,
  Ptr[GDExtensionMethodInfo],
  Unit
]


type GDExtensionScriptInstanceFreeMethodList2 = CFuncPtr3[
  GDExtensionScriptInstanceDataPtr,
  Ptr[GDExtensionMethodInfo],
  CUnsignedInt,
  Unit
]


type GDExtensionScriptInstanceHasMethod = CFuncPtr2[
  GDExtensionScriptInstanceDataPtr,
  GDExtensionConstStringNamePtr,
  GDExtensionBool
]


type GDExtensionScriptInstanceGetMethodArgumentCount = CFuncPtr3[
  GDExtensionScriptInstanceDataPtr,
  GDExtensionConstStringNamePtr,
  Ptr[GDExtensionBool],
  GDExtensionInt
]


type GDExtensionScriptInstanceCall = CFuncPtr6[
  GDExtensionScriptInstanceDataPtr,
  GDExtensionConstStringNamePtr,
  Ptr[GDExtensionConstVariantPtr],
  GDExtensionInt,
  GDExtensionVariantPtr,
  Ptr[GDExtensionCallError],
  Unit
]

/**
 *
 * @deprecated Since 4.2. Use GDExtensionScriptInstanceNotification2 instead.
 */
type GDExtensionScriptInstanceNotification = CFuncPtr2[
  GDExtensionScriptInstanceDataPtr,
  CInt,
  Unit
]


type GDExtensionScriptInstanceNotification2 = CFuncPtr3[
  GDExtensionScriptInstanceDataPtr,
  CInt,
  GDExtensionBool,
  Unit
]


type GDExtensionScriptInstanceToString = CFuncPtr3[
  GDExtensionScriptInstanceDataPtr,
  Ptr[GDExtensionBool],
  GDExtensionStringPtr,
  Unit
]


type GDExtensionScriptInstanceRefCountIncremented = CFuncPtr1[
  GDExtensionScriptInstanceDataPtr,
  Unit
]


type GDExtensionScriptInstanceRefCountDecremented = CFuncPtr1[
  GDExtensionScriptInstanceDataPtr,
  GDExtensionBool
]


type GDExtensionScriptInstanceGetScript = CFuncPtr1[
  GDExtensionScriptInstanceDataPtr,
  GDExtensionObjectPtr
]


type GDExtensionScriptInstanceIsPlaceholder = CFuncPtr1[
  GDExtensionScriptInstanceDataPtr,
  GDExtensionBool
]


type GDExtensionScriptInstanceGetLanguage = CFuncPtr1[
  GDExtensionScriptInstanceDataPtr,
  GDExtensionScriptLanguagePtr
]


type GDExtensionScriptInstanceFree = CFuncPtr1[
  GDExtensionScriptInstanceDataPtr,
  Unit
]


type GDExtensionWorkerThreadPoolGroupTask = CFuncPtr2[
  CVoidPtr,
  CUnsignedInt,
  Unit
]


type GDExtensionWorkerThreadPoolTask = CFuncPtr1[
  CVoidPtr,
  Unit
]


type GDExtensionInitializeCallback = CFuncPtr2[
  CVoidPtr,
  GDExtensionInitializationLevel,
  Unit
]


type GDExtensionDeinitializeCallback = CFuncPtr2[
  CVoidPtr,
  GDExtensionInitializationLevel,
  Unit
]


type GDExtensionInterfaceFunctionPtr = CVoidPtr


type GDExtensionInterfaceGetProcAddress = CFuncPtr1[
  Ptr[CChar],
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
  GDExtensionInterfaceGetProcAddress,
  GDExtensionClassLibraryPtr,
  Ptr[GDExtensionInitialization],
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

