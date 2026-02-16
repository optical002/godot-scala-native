
package godot.gdextensioninterface.codegen.types

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import scala.scalanative.unsigned.UInt.*
import godot.types.*



opaque type GDExtensionVariantFromTypeConstructorFunc = CFuncPtr2[
  GDExtensionUninitializedVariantPtr,
  GDExtensionTypePtr,
  Unit
]
object GDExtensionVariantFromTypeConstructorFunc {
  given Tag[GDExtensionVariantFromTypeConstructorFunc] = Tag.Ptr.asInstanceOf[Tag[GDExtensionVariantFromTypeConstructorFunc]]
  
  extension (func: GDExtensionVariantFromTypeConstructorFunc) {
    inline def apply(
      _0: GDExtensionUninitializedVariantPtr,
      _1: GDExtensionTypePtr
    ): Unit = func(_0, _1)
  } 
}


opaque type GDExtensionTypeFromVariantConstructorFunc = CFuncPtr2[
  GDExtensionUninitializedTypePtr,
  GDExtensionVariantPtr,
  Unit
]
object GDExtensionTypeFromVariantConstructorFunc {
  given Tag[GDExtensionTypeFromVariantConstructorFunc] = Tag.Ptr.asInstanceOf[Tag[GDExtensionTypeFromVariantConstructorFunc]]
  
  extension (func: GDExtensionTypeFromVariantConstructorFunc) {
    inline def apply(
      _0: GDExtensionUninitializedTypePtr,
      _1: GDExtensionVariantPtr
    ): Unit = func(_0, _1)
  } 
}


opaque type GDExtensionVariantGetInternalPtrFunc = CFuncPtr1[
  GDExtensionVariantPtr,
  Ptr[CVoidPtr]
]
object GDExtensionVariantGetInternalPtrFunc {
  given Tag[GDExtensionVariantGetInternalPtrFunc] = Tag.Ptr.asInstanceOf[Tag[GDExtensionVariantGetInternalPtrFunc]]
  
  extension (func: GDExtensionVariantGetInternalPtrFunc) {
    inline def apply(
      _0: GDExtensionVariantPtr
    ): Ptr[CVoidPtr] = func(_0)
  } 
}


opaque type GDExtensionPtrOperatorEvaluator = CFuncPtr3[
  GDExtensionConstTypePtr,
  GDExtensionConstTypePtr,
  GDExtensionTypePtr,
  Unit
]
object GDExtensionPtrOperatorEvaluator {
  given Tag[GDExtensionPtrOperatorEvaluator] = Tag.Ptr.asInstanceOf[Tag[GDExtensionPtrOperatorEvaluator]]
  
  extension (func: GDExtensionPtrOperatorEvaluator) {
    inline def apply(
      p_left: GDExtensionConstTypePtr,
      p_right: GDExtensionConstTypePtr,
      r_result: GDExtensionTypePtr
    ): Unit = func(p_left, p_right, r_result)
  } 
}


opaque type GDExtensionPtrBuiltInMethod = CFuncPtr4[
  GDExtensionTypePtr,
  ConstPtr[GDExtensionConstTypePtr],
  GDExtensionTypePtr,
  CInt,
  Unit
]
object GDExtensionPtrBuiltInMethod {
  given Tag[GDExtensionPtrBuiltInMethod] = Tag.Ptr.asInstanceOf[Tag[GDExtensionPtrBuiltInMethod]]
  
  extension (func: GDExtensionPtrBuiltInMethod) {
    inline def apply(
      p_base: GDExtensionTypePtr,
      p_args: ConstPtr[GDExtensionConstTypePtr],
      r_return: GDExtensionTypePtr,
      p_argument_count: CInt
    ): Unit = func(p_base, p_args, r_return, p_argument_count)
  } 
}


opaque type GDExtensionPtrConstructor = CFuncPtr2[
  GDExtensionUninitializedTypePtr,
  ConstPtr[GDExtensionConstTypePtr],
  Unit
]
object GDExtensionPtrConstructor {
  given Tag[GDExtensionPtrConstructor] = Tag.Ptr.asInstanceOf[Tag[GDExtensionPtrConstructor]]
  
  extension (func: GDExtensionPtrConstructor) {
    inline def apply(
      p_base: GDExtensionUninitializedTypePtr,
      p_args: ConstPtr[GDExtensionConstTypePtr]
    ): Unit = func(p_base, p_args)
  } 
}


opaque type GDExtensionPtrDestructor = CFuncPtr1[
  GDExtensionTypePtr,
  Unit
]
object GDExtensionPtrDestructor {
  given Tag[GDExtensionPtrDestructor] = Tag.Ptr.asInstanceOf[Tag[GDExtensionPtrDestructor]]
  
  extension (func: GDExtensionPtrDestructor) {
    inline def apply(
      p_base: GDExtensionTypePtr
    ): Unit = func(p_base)
  } 
}


opaque type GDExtensionPtrSetter = CFuncPtr2[
  GDExtensionTypePtr,
  GDExtensionConstTypePtr,
  Unit
]
object GDExtensionPtrSetter {
  given Tag[GDExtensionPtrSetter] = Tag.Ptr.asInstanceOf[Tag[GDExtensionPtrSetter]]
  
  extension (func: GDExtensionPtrSetter) {
    inline def apply(
      p_base: GDExtensionTypePtr,
      p_value: GDExtensionConstTypePtr
    ): Unit = func(p_base, p_value)
  } 
}


opaque type GDExtensionPtrGetter = CFuncPtr2[
  GDExtensionConstTypePtr,
  GDExtensionTypePtr,
  Unit
]
object GDExtensionPtrGetter {
  given Tag[GDExtensionPtrGetter] = Tag.Ptr.asInstanceOf[Tag[GDExtensionPtrGetter]]
  
  extension (func: GDExtensionPtrGetter) {
    inline def apply(
      p_base: GDExtensionConstTypePtr,
      r_value: GDExtensionTypePtr
    ): Unit = func(p_base, r_value)
  } 
}


opaque type GDExtensionPtrIndexedSetter = CFuncPtr3[
  GDExtensionTypePtr,
  GDExtensionInt,
  GDExtensionConstTypePtr,
  Unit
]
object GDExtensionPtrIndexedSetter {
  given Tag[GDExtensionPtrIndexedSetter] = Tag.Ptr.asInstanceOf[Tag[GDExtensionPtrIndexedSetter]]
  
  extension (func: GDExtensionPtrIndexedSetter) {
    inline def apply(
      p_base: GDExtensionTypePtr,
      p_index: GDExtensionInt,
      p_value: GDExtensionConstTypePtr
    ): Unit = func(p_base, p_index, p_value)
  } 
}


opaque type GDExtensionPtrIndexedGetter = CFuncPtr3[
  GDExtensionConstTypePtr,
  GDExtensionInt,
  GDExtensionTypePtr,
  Unit
]
object GDExtensionPtrIndexedGetter {
  given Tag[GDExtensionPtrIndexedGetter] = Tag.Ptr.asInstanceOf[Tag[GDExtensionPtrIndexedGetter]]
  
  extension (func: GDExtensionPtrIndexedGetter) {
    inline def apply(
      p_base: GDExtensionConstTypePtr,
      p_index: GDExtensionInt,
      r_value: GDExtensionTypePtr
    ): Unit = func(p_base, p_index, r_value)
  } 
}


opaque type GDExtensionPtrKeyedSetter = CFuncPtr3[
  GDExtensionTypePtr,
  GDExtensionConstTypePtr,
  GDExtensionConstTypePtr,
  Unit
]
object GDExtensionPtrKeyedSetter {
  given Tag[GDExtensionPtrKeyedSetter] = Tag.Ptr.asInstanceOf[Tag[GDExtensionPtrKeyedSetter]]
  
  extension (func: GDExtensionPtrKeyedSetter) {
    inline def apply(
      p_base: GDExtensionTypePtr,
      p_key: GDExtensionConstTypePtr,
      p_value: GDExtensionConstTypePtr
    ): Unit = func(p_base, p_key, p_value)
  } 
}


opaque type GDExtensionPtrKeyedGetter = CFuncPtr3[
  GDExtensionConstTypePtr,
  GDExtensionConstTypePtr,
  GDExtensionTypePtr,
  Unit
]
object GDExtensionPtrKeyedGetter {
  given Tag[GDExtensionPtrKeyedGetter] = Tag.Ptr.asInstanceOf[Tag[GDExtensionPtrKeyedGetter]]
  
  extension (func: GDExtensionPtrKeyedGetter) {
    inline def apply(
      p_base: GDExtensionConstTypePtr,
      p_key: GDExtensionConstTypePtr,
      r_value: GDExtensionTypePtr
    ): Unit = func(p_base, p_key, r_value)
  } 
}


opaque type GDExtensionPtrKeyedChecker = CFuncPtr2[
  GDExtensionConstVariantPtr,
  GDExtensionConstVariantPtr,
  CUnsignedInt
]
object GDExtensionPtrKeyedChecker {
  given Tag[GDExtensionPtrKeyedChecker] = Tag.Ptr.asInstanceOf[Tag[GDExtensionPtrKeyedChecker]]
  
  extension (func: GDExtensionPtrKeyedChecker) {
    inline def apply(
      p_base: GDExtensionConstVariantPtr,
      p_key: GDExtensionConstVariantPtr
    ): CUnsignedInt = func(p_base, p_key)
  } 
}


opaque type GDExtensionPtrUtilityFunction = CFuncPtr3[
  GDExtensionTypePtr,
  ConstPtr[GDExtensionConstTypePtr],
  CInt,
  Unit
]
object GDExtensionPtrUtilityFunction {
  given Tag[GDExtensionPtrUtilityFunction] = Tag.Ptr.asInstanceOf[Tag[GDExtensionPtrUtilityFunction]]
  
  extension (func: GDExtensionPtrUtilityFunction) {
    inline def apply(
      r_return: GDExtensionTypePtr,
      p_args: ConstPtr[GDExtensionConstTypePtr],
      p_argument_count: CInt
    ): Unit = func(r_return, p_args, p_argument_count)
  } 
}


opaque type GDExtensionClassConstructor = CFuncPtr0[
  
  GDExtensionObjectPtr
]
object GDExtensionClassConstructor {
  given Tag[GDExtensionClassConstructor] = Tag.Ptr.asInstanceOf[Tag[GDExtensionClassConstructor]]
  
  extension (func: GDExtensionClassConstructor) {
    inline def apply(
      
    ): GDExtensionObjectPtr = func()
  } 
}


opaque type GDExtensionInstanceBindingCreateCallback = CFuncPtr2[
  Ptr[CVoidPtr],
  Ptr[CVoidPtr],
  Ptr[CVoidPtr]
]
object GDExtensionInstanceBindingCreateCallback {
  given Tag[GDExtensionInstanceBindingCreateCallback] = Tag.Ptr.asInstanceOf[Tag[GDExtensionInstanceBindingCreateCallback]]
  
  extension (func: GDExtensionInstanceBindingCreateCallback) {
    inline def apply(
      p_token: Ptr[CVoidPtr],
      p_instance: Ptr[CVoidPtr]
    ): Ptr[CVoidPtr] = func(p_token, p_instance)
  } 
}


opaque type GDExtensionInstanceBindingFreeCallback = CFuncPtr3[
  Ptr[CVoidPtr],
  Ptr[CVoidPtr],
  Ptr[CVoidPtr],
  Unit
]
object GDExtensionInstanceBindingFreeCallback {
  given Tag[GDExtensionInstanceBindingFreeCallback] = Tag.Ptr.asInstanceOf[Tag[GDExtensionInstanceBindingFreeCallback]]
  
  extension (func: GDExtensionInstanceBindingFreeCallback) {
    inline def apply(
      p_token: Ptr[CVoidPtr],
      p_instance: Ptr[CVoidPtr],
      p_binding: Ptr[CVoidPtr]
    ): Unit = func(p_token, p_instance, p_binding)
  } 
}


opaque type GDExtensionInstanceBindingReferenceCallback = CFuncPtr3[
  Ptr[CVoidPtr],
  Ptr[CVoidPtr],
  GDExtensionBool,
  GDExtensionBool
]
object GDExtensionInstanceBindingReferenceCallback {
  given Tag[GDExtensionInstanceBindingReferenceCallback] = Tag.Ptr.asInstanceOf[Tag[GDExtensionInstanceBindingReferenceCallback]]
  
  extension (func: GDExtensionInstanceBindingReferenceCallback) {
    inline def apply(
      p_token: Ptr[CVoidPtr],
      p_binding: Ptr[CVoidPtr],
      p_reference: GDExtensionBool
    ): GDExtensionBool = func(p_token, p_binding, p_reference)
  } 
}


opaque type GDExtensionClassSet = CFuncPtr3[
  GDExtensionClassInstancePtr,
  GDExtensionConstStringNamePtr,
  GDExtensionConstVariantPtr,
  GDExtensionBool
]
object GDExtensionClassSet {
  given Tag[GDExtensionClassSet] = Tag.Ptr.asInstanceOf[Tag[GDExtensionClassSet]]
  
  extension (func: GDExtensionClassSet) {
    inline def apply(
      p_instance: GDExtensionClassInstancePtr,
      p_name: GDExtensionConstStringNamePtr,
      p_value: GDExtensionConstVariantPtr
    ): GDExtensionBool = func(p_instance, p_name, p_value)
  } 
}


opaque type GDExtensionClassGet = CFuncPtr3[
  GDExtensionClassInstancePtr,
  GDExtensionConstStringNamePtr,
  GDExtensionVariantPtr,
  GDExtensionBool
]
object GDExtensionClassGet {
  given Tag[GDExtensionClassGet] = Tag.Ptr.asInstanceOf[Tag[GDExtensionClassGet]]
  
  extension (func: GDExtensionClassGet) {
    inline def apply(
      p_instance: GDExtensionClassInstancePtr,
      p_name: GDExtensionConstStringNamePtr,
      r_ret: GDExtensionVariantPtr
    ): GDExtensionBool = func(p_instance, p_name, r_ret)
  } 
}


opaque type GDExtensionClassGetRID = CFuncPtr1[
  GDExtensionClassInstancePtr,
  CUnsignedLongLong
]
object GDExtensionClassGetRID {
  given Tag[GDExtensionClassGetRID] = Tag.Ptr.asInstanceOf[Tag[GDExtensionClassGetRID]]
  
  extension (func: GDExtensionClassGetRID) {
    inline def apply(
      p_instance: GDExtensionClassInstancePtr
    ): CUnsignedLongLong = func(p_instance)
  } 
}


opaque type GDExtensionClassGetPropertyList = CFuncPtr2[
  GDExtensionClassInstancePtr,
  Ptr[CUnsignedInt],
  ConstPtr[GDExtensionPropertyInfo]
]
object GDExtensionClassGetPropertyList {
  given Tag[GDExtensionClassGetPropertyList] = Tag.Ptr.asInstanceOf[Tag[GDExtensionClassGetPropertyList]]
  
  extension (func: GDExtensionClassGetPropertyList) {
    inline def apply(
      p_instance: GDExtensionClassInstancePtr,
      r_count: Ptr[CUnsignedInt]
    ): ConstPtr[GDExtensionPropertyInfo] = func(p_instance, r_count)
  } 
}


opaque type GDExtensionClassFreePropertyList = CFuncPtr2[
  GDExtensionClassInstancePtr,
  ConstPtr[GDExtensionPropertyInfo],
  Unit
]
object GDExtensionClassFreePropertyList {
  given Tag[GDExtensionClassFreePropertyList] = Tag.Ptr.asInstanceOf[Tag[GDExtensionClassFreePropertyList]]
  
  extension (func: GDExtensionClassFreePropertyList) {
    inline def apply(
      p_instance: GDExtensionClassInstancePtr,
      p_list: ConstPtr[GDExtensionPropertyInfo]
    ): Unit = func(p_instance, p_list)
  } 
}


opaque type GDExtensionClassFreePropertyList2 = CFuncPtr3[
  GDExtensionClassInstancePtr,
  ConstPtr[GDExtensionPropertyInfo],
  CUnsignedInt,
  Unit
]
object GDExtensionClassFreePropertyList2 {
  given Tag[GDExtensionClassFreePropertyList2] = Tag.Ptr.asInstanceOf[Tag[GDExtensionClassFreePropertyList2]]
  
  extension (func: GDExtensionClassFreePropertyList2) {
    inline def apply(
      p_instance: GDExtensionClassInstancePtr,
      p_list: ConstPtr[GDExtensionPropertyInfo],
      p_count: CUnsignedInt
    ): Unit = func(p_instance, p_list, p_count)
  } 
}


opaque type GDExtensionClassPropertyCanRevert = CFuncPtr2[
  GDExtensionClassInstancePtr,
  GDExtensionConstStringNamePtr,
  GDExtensionBool
]
object GDExtensionClassPropertyCanRevert {
  given Tag[GDExtensionClassPropertyCanRevert] = Tag.Ptr.asInstanceOf[Tag[GDExtensionClassPropertyCanRevert]]
  
  extension (func: GDExtensionClassPropertyCanRevert) {
    inline def apply(
      p_instance: GDExtensionClassInstancePtr,
      p_name: GDExtensionConstStringNamePtr
    ): GDExtensionBool = func(p_instance, p_name)
  } 
}


opaque type GDExtensionClassPropertyGetRevert = CFuncPtr3[
  GDExtensionClassInstancePtr,
  GDExtensionConstStringNamePtr,
  GDExtensionVariantPtr,
  GDExtensionBool
]
object GDExtensionClassPropertyGetRevert {
  given Tag[GDExtensionClassPropertyGetRevert] = Tag.Ptr.asInstanceOf[Tag[GDExtensionClassPropertyGetRevert]]
  
  extension (func: GDExtensionClassPropertyGetRevert) {
    inline def apply(
      p_instance: GDExtensionClassInstancePtr,
      p_name: GDExtensionConstStringNamePtr,
      r_ret: GDExtensionVariantPtr
    ): GDExtensionBool = func(p_instance, p_name, r_ret)
  } 
}


opaque type GDExtensionClassValidateProperty = CFuncPtr2[
  GDExtensionClassInstancePtr,
  Ptr[GDExtensionPropertyInfo],
  GDExtensionBool
]
object GDExtensionClassValidateProperty {
  given Tag[GDExtensionClassValidateProperty] = Tag.Ptr.asInstanceOf[Tag[GDExtensionClassValidateProperty]]
  
  extension (func: GDExtensionClassValidateProperty) {
    inline def apply(
      p_instance: GDExtensionClassInstancePtr,
      p_property: Ptr[GDExtensionPropertyInfo]
    ): GDExtensionBool = func(p_instance, p_property)
  } 
}

/**
 *
 * @deprecated Since 4.2. Use GDExtensionClassNotification2 instead.
 */
opaque type GDExtensionClassNotification = CFuncPtr2[
  GDExtensionClassInstancePtr,
  CInt,
  Unit
]
object GDExtensionClassNotification {
  given Tag[GDExtensionClassNotification] = Tag.Ptr.asInstanceOf[Tag[GDExtensionClassNotification]]
  
  extension (func: GDExtensionClassNotification) {
    inline def apply(
      p_instance: GDExtensionClassInstancePtr,
      p_what: CInt
    ): Unit = func(p_instance, p_what)
  } 
}


opaque type GDExtensionClassNotification2 = CFuncPtr3[
  GDExtensionClassInstancePtr,
  CInt,
  GDExtensionBool,
  Unit
]
object GDExtensionClassNotification2 {
  given Tag[GDExtensionClassNotification2] = Tag.Ptr.asInstanceOf[Tag[GDExtensionClassNotification2]]
  
  extension (func: GDExtensionClassNotification2) {
    inline def apply(
      p_instance: GDExtensionClassInstancePtr,
      p_what: CInt,
      p_reversed: GDExtensionBool
    ): Unit = func(p_instance, p_what, p_reversed)
  } 
}


opaque type GDExtensionClassToString = CFuncPtr3[
  GDExtensionClassInstancePtr,
  Ptr[GDExtensionBool],
  GDExtensionStringPtr,
  Unit
]
object GDExtensionClassToString {
  given Tag[GDExtensionClassToString] = Tag.Ptr.asInstanceOf[Tag[GDExtensionClassToString]]
  
  extension (func: GDExtensionClassToString) {
    inline def apply(
      p_instance: GDExtensionClassInstancePtr,
      r_is_valid: Ptr[GDExtensionBool],
      p_out: GDExtensionStringPtr
    ): Unit = func(p_instance, r_is_valid, p_out)
  } 
}


opaque type GDExtensionClassReference = CFuncPtr1[
  GDExtensionClassInstancePtr,
  Unit
]
object GDExtensionClassReference {
  given Tag[GDExtensionClassReference] = Tag.Ptr.asInstanceOf[Tag[GDExtensionClassReference]]
  
  extension (func: GDExtensionClassReference) {
    inline def apply(
      p_instance: GDExtensionClassInstancePtr
    ): Unit = func(p_instance)
  } 
}


opaque type GDExtensionClassUnreference = CFuncPtr1[
  GDExtensionClassInstancePtr,
  Unit
]
object GDExtensionClassUnreference {
  given Tag[GDExtensionClassUnreference] = Tag.Ptr.asInstanceOf[Tag[GDExtensionClassUnreference]]
  
  extension (func: GDExtensionClassUnreference) {
    inline def apply(
      p_instance: GDExtensionClassInstancePtr
    ): Unit = func(p_instance)
  } 
}


opaque type GDExtensionClassCallVirtual = CFuncPtr3[
  GDExtensionClassInstancePtr,
  ConstPtr[GDExtensionConstTypePtr],
  GDExtensionTypePtr,
  Unit
]
object GDExtensionClassCallVirtual {
  given Tag[GDExtensionClassCallVirtual] = Tag.Ptr.asInstanceOf[Tag[GDExtensionClassCallVirtual]]
  
  extension (func: GDExtensionClassCallVirtual) {
    inline def apply(
      p_instance: GDExtensionClassInstancePtr,
      p_args: ConstPtr[GDExtensionConstTypePtr],
      r_ret: GDExtensionTypePtr
    ): Unit = func(p_instance, p_args, r_ret)
  } 
}


opaque type GDExtensionClassCreateInstance = CFuncPtr1[
  Ptr[CVoidPtr],
  GDExtensionObjectPtr
]
object GDExtensionClassCreateInstance {
  given Tag[GDExtensionClassCreateInstance] = Tag.Ptr.asInstanceOf[Tag[GDExtensionClassCreateInstance]]
  
  extension (func: GDExtensionClassCreateInstance) {
    inline def apply(
      p_class_userdata: Ptr[CVoidPtr]
    ): GDExtensionObjectPtr = func(p_class_userdata)
  } 
}


opaque type GDExtensionClassCreateInstance2 = CFuncPtr2[
  Ptr[CVoidPtr],
  GDExtensionBool,
  GDExtensionObjectPtr
]
object GDExtensionClassCreateInstance2 {
  given Tag[GDExtensionClassCreateInstance2] = Tag.Ptr.asInstanceOf[Tag[GDExtensionClassCreateInstance2]]
  
  extension (func: GDExtensionClassCreateInstance2) {
    inline def apply(
      p_class_userdata: Ptr[CVoidPtr],
      p_notify_postinitialize: GDExtensionBool
    ): GDExtensionObjectPtr = func(p_class_userdata, p_notify_postinitialize)
  } 
}


opaque type GDExtensionClassFreeInstance = CFuncPtr2[
  Ptr[CVoidPtr],
  GDExtensionClassInstancePtr,
  Unit
]
object GDExtensionClassFreeInstance {
  given Tag[GDExtensionClassFreeInstance] = Tag.Ptr.asInstanceOf[Tag[GDExtensionClassFreeInstance]]
  
  extension (func: GDExtensionClassFreeInstance) {
    inline def apply(
      p_class_userdata: Ptr[CVoidPtr],
      p_instance: GDExtensionClassInstancePtr
    ): Unit = func(p_class_userdata, p_instance)
  } 
}


opaque type GDExtensionClassRecreateInstance = CFuncPtr2[
  Ptr[CVoidPtr],
  GDExtensionObjectPtr,
  GDExtensionClassInstancePtr
]
object GDExtensionClassRecreateInstance {
  given Tag[GDExtensionClassRecreateInstance] = Tag.Ptr.asInstanceOf[Tag[GDExtensionClassRecreateInstance]]
  
  extension (func: GDExtensionClassRecreateInstance) {
    inline def apply(
      p_class_userdata: Ptr[CVoidPtr],
      p_object: GDExtensionObjectPtr
    ): GDExtensionClassInstancePtr = func(p_class_userdata, p_object)
  } 
}


opaque type GDExtensionClassGetVirtual = CFuncPtr2[
  Ptr[CVoidPtr],
  GDExtensionConstStringNamePtr,
  GDExtensionClassCallVirtual
]
object GDExtensionClassGetVirtual {
  given Tag[GDExtensionClassGetVirtual] = Tag.Ptr.asInstanceOf[Tag[GDExtensionClassGetVirtual]]
  
  extension (func: GDExtensionClassGetVirtual) {
    inline def apply(
      p_class_userdata: Ptr[CVoidPtr],
      p_name: GDExtensionConstStringNamePtr
    ): GDExtensionClassCallVirtual = func(p_class_userdata, p_name)
  } 
}


opaque type GDExtensionClassGetVirtual2 = CFuncPtr3[
  Ptr[CVoidPtr],
  GDExtensionConstStringNamePtr,
  CUnsignedInt,
  GDExtensionClassCallVirtual
]
object GDExtensionClassGetVirtual2 {
  given Tag[GDExtensionClassGetVirtual2] = Tag.Ptr.asInstanceOf[Tag[GDExtensionClassGetVirtual2]]
  
  extension (func: GDExtensionClassGetVirtual2) {
    inline def apply(
      p_class_userdata: Ptr[CVoidPtr],
      p_name: GDExtensionConstStringNamePtr,
      p_hash: CUnsignedInt
    ): GDExtensionClassCallVirtual = func(p_class_userdata, p_name, p_hash)
  } 
}


opaque type GDExtensionClassGetVirtualCallData = CFuncPtr2[
  Ptr[CVoidPtr],
  GDExtensionConstStringNamePtr,
  Ptr[CVoidPtr]
]
object GDExtensionClassGetVirtualCallData {
  given Tag[GDExtensionClassGetVirtualCallData] = Tag.Ptr.asInstanceOf[Tag[GDExtensionClassGetVirtualCallData]]
  
  extension (func: GDExtensionClassGetVirtualCallData) {
    inline def apply(
      p_class_userdata: Ptr[CVoidPtr],
      p_name: GDExtensionConstStringNamePtr
    ): Ptr[CVoidPtr] = func(p_class_userdata, p_name)
  } 
}


opaque type GDExtensionClassGetVirtualCallData2 = CFuncPtr3[
  Ptr[CVoidPtr],
  GDExtensionConstStringNamePtr,
  CUnsignedInt,
  Ptr[CVoidPtr]
]
object GDExtensionClassGetVirtualCallData2 {
  given Tag[GDExtensionClassGetVirtualCallData2] = Tag.Ptr.asInstanceOf[Tag[GDExtensionClassGetVirtualCallData2]]
  
  extension (func: GDExtensionClassGetVirtualCallData2) {
    inline def apply(
      p_class_userdata: Ptr[CVoidPtr],
      p_name: GDExtensionConstStringNamePtr,
      p_hash: CUnsignedInt
    ): Ptr[CVoidPtr] = func(p_class_userdata, p_name, p_hash)
  } 
}


opaque type GDExtensionClassCallVirtualWithData = CFuncPtr5[
  GDExtensionClassInstancePtr,
  GDExtensionConstStringNamePtr,
  Ptr[CVoidPtr],
  ConstPtr[GDExtensionConstTypePtr],
  GDExtensionTypePtr,
  Unit
]
object GDExtensionClassCallVirtualWithData {
  given Tag[GDExtensionClassCallVirtualWithData] = Tag.Ptr.asInstanceOf[Tag[GDExtensionClassCallVirtualWithData]]
  
  extension (func: GDExtensionClassCallVirtualWithData) {
    inline def apply(
      p_instance: GDExtensionClassInstancePtr,
      p_name: GDExtensionConstStringNamePtr,
      p_virtual_call_userdata: Ptr[CVoidPtr],
      p_args: ConstPtr[GDExtensionConstTypePtr],
      r_ret: GDExtensionTypePtr
    ): Unit = func(p_instance, p_name, p_virtual_call_userdata, p_args, r_ret)
  } 
}

/**
 * Passed a pointer to a PackedStringArray that should be filled with the classes that may be used by the GDExtension.
 */
opaque type GDExtensionEditorGetClassesUsedCallback = CFuncPtr1[
  GDExtensionTypePtr,
  Unit
]
object GDExtensionEditorGetClassesUsedCallback {
  given Tag[GDExtensionEditorGetClassesUsedCallback] = Tag.Ptr.asInstanceOf[Tag[GDExtensionEditorGetClassesUsedCallback]]
  
  extension (func: GDExtensionEditorGetClassesUsedCallback) {
    inline def apply(
      p_packed_string_array: GDExtensionTypePtr
    ): Unit = func(p_packed_string_array)
  } 
}


opaque type GDExtensionClassMethodCall = CFuncPtr6[
  Ptr[CVoidPtr],
  GDExtensionClassInstancePtr,
  ConstPtr[GDExtensionConstVariantPtr],
  GDExtensionInt,
  GDExtensionVariantPtr,
  Ptr[GDExtensionCallError],
  Unit
]
object GDExtensionClassMethodCall {
  given Tag[GDExtensionClassMethodCall] = Tag.Ptr.asInstanceOf[Tag[GDExtensionClassMethodCall]]
  
  extension (func: GDExtensionClassMethodCall) {
    inline def apply(
      method_userdata: Ptr[CVoidPtr],
      p_instance: GDExtensionClassInstancePtr,
      p_args: ConstPtr[GDExtensionConstVariantPtr],
      p_argument_count: GDExtensionInt,
      r_return: GDExtensionVariantPtr,
      r_error: Ptr[GDExtensionCallError]
    ): Unit = func(method_userdata, p_instance, p_args, p_argument_count, r_return, r_error)
  } 
}


opaque type GDExtensionClassMethodValidatedCall = CFuncPtr4[
  Ptr[CVoidPtr],
  GDExtensionClassInstancePtr,
  ConstPtr[GDExtensionConstVariantPtr],
  GDExtensionVariantPtr,
  Unit
]
object GDExtensionClassMethodValidatedCall {
  given Tag[GDExtensionClassMethodValidatedCall] = Tag.Ptr.asInstanceOf[Tag[GDExtensionClassMethodValidatedCall]]
  
  extension (func: GDExtensionClassMethodValidatedCall) {
    inline def apply(
      method_userdata: Ptr[CVoidPtr],
      p_instance: GDExtensionClassInstancePtr,
      p_args: ConstPtr[GDExtensionConstVariantPtr],
      r_return: GDExtensionVariantPtr
    ): Unit = func(method_userdata, p_instance, p_args, r_return)
  } 
}


opaque type GDExtensionClassMethodPtrCall = CFuncPtr4[
  Ptr[CVoidPtr],
  GDExtensionClassInstancePtr,
  ConstPtr[GDExtensionConstTypePtr],
  GDExtensionTypePtr,
  Unit
]
object GDExtensionClassMethodPtrCall {
  given Tag[GDExtensionClassMethodPtrCall] = Tag.Ptr.asInstanceOf[Tag[GDExtensionClassMethodPtrCall]]
  
  extension (func: GDExtensionClassMethodPtrCall) {
    inline def apply(
      method_userdata: Ptr[CVoidPtr],
      p_instance: GDExtensionClassInstancePtr,
      p_args: ConstPtr[GDExtensionConstTypePtr],
      r_ret: GDExtensionTypePtr
    ): Unit = func(method_userdata, p_instance, p_args, r_ret)
  } 
}


opaque type GDExtensionCallableCustomCall = CFuncPtr5[
  Ptr[CVoidPtr],
  ConstPtr[GDExtensionConstVariantPtr],
  GDExtensionInt,
  GDExtensionVariantPtr,
  Ptr[GDExtensionCallError],
  Unit
]
object GDExtensionCallableCustomCall {
  given Tag[GDExtensionCallableCustomCall] = Tag.Ptr.asInstanceOf[Tag[GDExtensionCallableCustomCall]]
  
  extension (func: GDExtensionCallableCustomCall) {
    inline def apply(
      callable_userdata: Ptr[CVoidPtr],
      p_args: ConstPtr[GDExtensionConstVariantPtr],
      p_argument_count: GDExtensionInt,
      r_return: GDExtensionVariantPtr,
      r_error: Ptr[GDExtensionCallError]
    ): Unit = func(callable_userdata, p_args, p_argument_count, r_return, r_error)
  } 
}


opaque type GDExtensionCallableCustomIsValid = CFuncPtr1[
  Ptr[CVoidPtr],
  GDExtensionBool
]
object GDExtensionCallableCustomIsValid {
  given Tag[GDExtensionCallableCustomIsValid] = Tag.Ptr.asInstanceOf[Tag[GDExtensionCallableCustomIsValid]]
  
  extension (func: GDExtensionCallableCustomIsValid) {
    inline def apply(
      callable_userdata: Ptr[CVoidPtr]
    ): GDExtensionBool = func(callable_userdata)
  } 
}


opaque type GDExtensionCallableCustomFree = CFuncPtr1[
  Ptr[CVoidPtr],
  Unit
]
object GDExtensionCallableCustomFree {
  given Tag[GDExtensionCallableCustomFree] = Tag.Ptr.asInstanceOf[Tag[GDExtensionCallableCustomFree]]
  
  extension (func: GDExtensionCallableCustomFree) {
    inline def apply(
      callable_userdata: Ptr[CVoidPtr]
    ): Unit = func(callable_userdata)
  } 
}


opaque type GDExtensionCallableCustomHash = CFuncPtr1[
  Ptr[CVoidPtr],
  CUnsignedInt
]
object GDExtensionCallableCustomHash {
  given Tag[GDExtensionCallableCustomHash] = Tag.Ptr.asInstanceOf[Tag[GDExtensionCallableCustomHash]]
  
  extension (func: GDExtensionCallableCustomHash) {
    inline def apply(
      callable_userdata: Ptr[CVoidPtr]
    ): CUnsignedInt = func(callable_userdata)
  } 
}


opaque type GDExtensionCallableCustomEqual = CFuncPtr2[
  Ptr[CVoidPtr],
  Ptr[CVoidPtr],
  GDExtensionBool
]
object GDExtensionCallableCustomEqual {
  given Tag[GDExtensionCallableCustomEqual] = Tag.Ptr.asInstanceOf[Tag[GDExtensionCallableCustomEqual]]
  
  extension (func: GDExtensionCallableCustomEqual) {
    inline def apply(
      callable_userdata_a: Ptr[CVoidPtr],
      callable_userdata_b: Ptr[CVoidPtr]
    ): GDExtensionBool = func(callable_userdata_a, callable_userdata_b)
  } 
}


opaque type GDExtensionCallableCustomLessThan = CFuncPtr2[
  Ptr[CVoidPtr],
  Ptr[CVoidPtr],
  GDExtensionBool
]
object GDExtensionCallableCustomLessThan {
  given Tag[GDExtensionCallableCustomLessThan] = Tag.Ptr.asInstanceOf[Tag[GDExtensionCallableCustomLessThan]]
  
  extension (func: GDExtensionCallableCustomLessThan) {
    inline def apply(
      callable_userdata_a: Ptr[CVoidPtr],
      callable_userdata_b: Ptr[CVoidPtr]
    ): GDExtensionBool = func(callable_userdata_a, callable_userdata_b)
  } 
}


opaque type GDExtensionCallableCustomToString = CFuncPtr3[
  Ptr[CVoidPtr],
  Ptr[GDExtensionBool],
  GDExtensionStringPtr,
  Unit
]
object GDExtensionCallableCustomToString {
  given Tag[GDExtensionCallableCustomToString] = Tag.Ptr.asInstanceOf[Tag[GDExtensionCallableCustomToString]]
  
  extension (func: GDExtensionCallableCustomToString) {
    inline def apply(
      callable_userdata: Ptr[CVoidPtr],
      r_is_valid: Ptr[GDExtensionBool],
      r_out: GDExtensionStringPtr
    ): Unit = func(callable_userdata, r_is_valid, r_out)
  } 
}


opaque type GDExtensionCallableCustomGetArgumentCount = CFuncPtr2[
  Ptr[CVoidPtr],
  Ptr[GDExtensionBool],
  GDExtensionInt
]
object GDExtensionCallableCustomGetArgumentCount {
  given Tag[GDExtensionCallableCustomGetArgumentCount] = Tag.Ptr.asInstanceOf[Tag[GDExtensionCallableCustomGetArgumentCount]]
  
  extension (func: GDExtensionCallableCustomGetArgumentCount) {
    inline def apply(
      callable_userdata: Ptr[CVoidPtr],
      r_is_valid: Ptr[GDExtensionBool]
    ): GDExtensionInt = func(callable_userdata, r_is_valid)
  } 
}


opaque type GDExtensionScriptInstanceSet = CFuncPtr3[
  GDExtensionScriptInstanceDataPtr,
  GDExtensionConstStringNamePtr,
  GDExtensionConstVariantPtr,
  GDExtensionBool
]
object GDExtensionScriptInstanceSet {
  given Tag[GDExtensionScriptInstanceSet] = Tag.Ptr.asInstanceOf[Tag[GDExtensionScriptInstanceSet]]
  
  extension (func: GDExtensionScriptInstanceSet) {
    inline def apply(
      p_instance: GDExtensionScriptInstanceDataPtr,
      p_name: GDExtensionConstStringNamePtr,
      p_value: GDExtensionConstVariantPtr
    ): GDExtensionBool = func(p_instance, p_name, p_value)
  } 
}


opaque type GDExtensionScriptInstanceGet = CFuncPtr3[
  GDExtensionScriptInstanceDataPtr,
  GDExtensionConstStringNamePtr,
  GDExtensionVariantPtr,
  GDExtensionBool
]
object GDExtensionScriptInstanceGet {
  given Tag[GDExtensionScriptInstanceGet] = Tag.Ptr.asInstanceOf[Tag[GDExtensionScriptInstanceGet]]
  
  extension (func: GDExtensionScriptInstanceGet) {
    inline def apply(
      p_instance: GDExtensionScriptInstanceDataPtr,
      p_name: GDExtensionConstStringNamePtr,
      r_ret: GDExtensionVariantPtr
    ): GDExtensionBool = func(p_instance, p_name, r_ret)
  } 
}


opaque type GDExtensionScriptInstanceGetPropertyList = CFuncPtr2[
  GDExtensionScriptInstanceDataPtr,
  Ptr[CUnsignedInt],
  ConstPtr[GDExtensionPropertyInfo]
]
object GDExtensionScriptInstanceGetPropertyList {
  given Tag[GDExtensionScriptInstanceGetPropertyList] = Tag.Ptr.asInstanceOf[Tag[GDExtensionScriptInstanceGetPropertyList]]
  
  extension (func: GDExtensionScriptInstanceGetPropertyList) {
    inline def apply(
      p_instance: GDExtensionScriptInstanceDataPtr,
      r_count: Ptr[CUnsignedInt]
    ): ConstPtr[GDExtensionPropertyInfo] = func(p_instance, r_count)
  } 
}

/**
 *
 * @deprecated Since 4.3. Use GDExtensionScriptInstanceFreePropertyList2 instead.
 */
opaque type GDExtensionScriptInstanceFreePropertyList = CFuncPtr2[
  GDExtensionScriptInstanceDataPtr,
  ConstPtr[GDExtensionPropertyInfo],
  Unit
]
object GDExtensionScriptInstanceFreePropertyList {
  given Tag[GDExtensionScriptInstanceFreePropertyList] = Tag.Ptr.asInstanceOf[Tag[GDExtensionScriptInstanceFreePropertyList]]
  
  extension (func: GDExtensionScriptInstanceFreePropertyList) {
    inline def apply(
      p_instance: GDExtensionScriptInstanceDataPtr,
      p_list: ConstPtr[GDExtensionPropertyInfo]
    ): Unit = func(p_instance, p_list)
  } 
}


opaque type GDExtensionScriptInstanceFreePropertyList2 = CFuncPtr3[
  GDExtensionScriptInstanceDataPtr,
  ConstPtr[GDExtensionPropertyInfo],
  CUnsignedInt,
  Unit
]
object GDExtensionScriptInstanceFreePropertyList2 {
  given Tag[GDExtensionScriptInstanceFreePropertyList2] = Tag.Ptr.asInstanceOf[Tag[GDExtensionScriptInstanceFreePropertyList2]]
  
  extension (func: GDExtensionScriptInstanceFreePropertyList2) {
    inline def apply(
      p_instance: GDExtensionScriptInstanceDataPtr,
      p_list: ConstPtr[GDExtensionPropertyInfo],
      p_count: CUnsignedInt
    ): Unit = func(p_instance, p_list, p_count)
  } 
}


opaque type GDExtensionScriptInstanceGetClassCategory = CFuncPtr2[
  GDExtensionScriptInstanceDataPtr,
  Ptr[GDExtensionPropertyInfo],
  GDExtensionBool
]
object GDExtensionScriptInstanceGetClassCategory {
  given Tag[GDExtensionScriptInstanceGetClassCategory] = Tag.Ptr.asInstanceOf[Tag[GDExtensionScriptInstanceGetClassCategory]]
  
  extension (func: GDExtensionScriptInstanceGetClassCategory) {
    inline def apply(
      p_instance: GDExtensionScriptInstanceDataPtr,
      p_class_category: Ptr[GDExtensionPropertyInfo]
    ): GDExtensionBool = func(p_instance, p_class_category)
  } 
}


opaque type GDExtensionScriptInstanceGetPropertyType = CFuncPtr3[
  GDExtensionScriptInstanceDataPtr,
  GDExtensionConstStringNamePtr,
  Ptr[GDExtensionBool],
  GDExtensionVariantType
]
object GDExtensionScriptInstanceGetPropertyType {
  given Tag[GDExtensionScriptInstanceGetPropertyType] = Tag.Ptr.asInstanceOf[Tag[GDExtensionScriptInstanceGetPropertyType]]
  
  extension (func: GDExtensionScriptInstanceGetPropertyType) {
    inline def apply(
      p_instance: GDExtensionScriptInstanceDataPtr,
      p_name: GDExtensionConstStringNamePtr,
      r_is_valid: Ptr[GDExtensionBool]
    ): GDExtensionVariantType = func(p_instance, p_name, r_is_valid)
  } 
}


opaque type GDExtensionScriptInstanceValidateProperty = CFuncPtr2[
  GDExtensionScriptInstanceDataPtr,
  Ptr[GDExtensionPropertyInfo],
  GDExtensionBool
]
object GDExtensionScriptInstanceValidateProperty {
  given Tag[GDExtensionScriptInstanceValidateProperty] = Tag.Ptr.asInstanceOf[Tag[GDExtensionScriptInstanceValidateProperty]]
  
  extension (func: GDExtensionScriptInstanceValidateProperty) {
    inline def apply(
      p_instance: GDExtensionScriptInstanceDataPtr,
      p_property: Ptr[GDExtensionPropertyInfo]
    ): GDExtensionBool = func(p_instance, p_property)
  } 
}


opaque type GDExtensionScriptInstancePropertyCanRevert = CFuncPtr2[
  GDExtensionScriptInstanceDataPtr,
  GDExtensionConstStringNamePtr,
  GDExtensionBool
]
object GDExtensionScriptInstancePropertyCanRevert {
  given Tag[GDExtensionScriptInstancePropertyCanRevert] = Tag.Ptr.asInstanceOf[Tag[GDExtensionScriptInstancePropertyCanRevert]]
  
  extension (func: GDExtensionScriptInstancePropertyCanRevert) {
    inline def apply(
      p_instance: GDExtensionScriptInstanceDataPtr,
      p_name: GDExtensionConstStringNamePtr
    ): GDExtensionBool = func(p_instance, p_name)
  } 
}


opaque type GDExtensionScriptInstancePropertyGetRevert = CFuncPtr3[
  GDExtensionScriptInstanceDataPtr,
  GDExtensionConstStringNamePtr,
  GDExtensionVariantPtr,
  GDExtensionBool
]
object GDExtensionScriptInstancePropertyGetRevert {
  given Tag[GDExtensionScriptInstancePropertyGetRevert] = Tag.Ptr.asInstanceOf[Tag[GDExtensionScriptInstancePropertyGetRevert]]
  
  extension (func: GDExtensionScriptInstancePropertyGetRevert) {
    inline def apply(
      p_instance: GDExtensionScriptInstanceDataPtr,
      p_name: GDExtensionConstStringNamePtr,
      r_ret: GDExtensionVariantPtr
    ): GDExtensionBool = func(p_instance, p_name, r_ret)
  } 
}


opaque type GDExtensionScriptInstanceGetOwner = CFuncPtr1[
  GDExtensionScriptInstanceDataPtr,
  GDExtensionObjectPtr
]
object GDExtensionScriptInstanceGetOwner {
  given Tag[GDExtensionScriptInstanceGetOwner] = Tag.Ptr.asInstanceOf[Tag[GDExtensionScriptInstanceGetOwner]]
  
  extension (func: GDExtensionScriptInstanceGetOwner) {
    inline def apply(
      p_instance: GDExtensionScriptInstanceDataPtr
    ): GDExtensionObjectPtr = func(p_instance)
  } 
}


opaque type GDExtensionScriptInstancePropertyStateAdd = CFuncPtr3[
  GDExtensionConstStringNamePtr,
  GDExtensionConstVariantPtr,
  Ptr[CVoidPtr],
  Unit
]
object GDExtensionScriptInstancePropertyStateAdd {
  given Tag[GDExtensionScriptInstancePropertyStateAdd] = Tag.Ptr.asInstanceOf[Tag[GDExtensionScriptInstancePropertyStateAdd]]
  
  extension (func: GDExtensionScriptInstancePropertyStateAdd) {
    inline def apply(
      p_name: GDExtensionConstStringNamePtr,
      p_value: GDExtensionConstVariantPtr,
      p_userdata: Ptr[CVoidPtr]
    ): Unit = func(p_name, p_value, p_userdata)
  } 
}


opaque type GDExtensionScriptInstanceGetPropertyState = CFuncPtr3[
  GDExtensionScriptInstanceDataPtr,
  GDExtensionScriptInstancePropertyStateAdd,
  Ptr[CVoidPtr],
  Unit
]
object GDExtensionScriptInstanceGetPropertyState {
  given Tag[GDExtensionScriptInstanceGetPropertyState] = Tag.Ptr.asInstanceOf[Tag[GDExtensionScriptInstanceGetPropertyState]]
  
  extension (func: GDExtensionScriptInstanceGetPropertyState) {
    inline def apply(
      p_instance: GDExtensionScriptInstanceDataPtr,
      p_add_func: GDExtensionScriptInstancePropertyStateAdd,
      p_userdata: Ptr[CVoidPtr]
    ): Unit = func(p_instance, p_add_func, p_userdata)
  } 
}


opaque type GDExtensionScriptInstanceGetMethodList = CFuncPtr2[
  GDExtensionScriptInstanceDataPtr,
  Ptr[CUnsignedInt],
  ConstPtr[GDExtensionMethodInfo]
]
object GDExtensionScriptInstanceGetMethodList {
  given Tag[GDExtensionScriptInstanceGetMethodList] = Tag.Ptr.asInstanceOf[Tag[GDExtensionScriptInstanceGetMethodList]]
  
  extension (func: GDExtensionScriptInstanceGetMethodList) {
    inline def apply(
      p_instance: GDExtensionScriptInstanceDataPtr,
      r_count: Ptr[CUnsignedInt]
    ): ConstPtr[GDExtensionMethodInfo] = func(p_instance, r_count)
  } 
}

/**
 *
 * @deprecated Since 4.3. Use GDExtensionScriptInstanceFreeMethodList2 instead.
 */
opaque type GDExtensionScriptInstanceFreeMethodList = CFuncPtr2[
  GDExtensionScriptInstanceDataPtr,
  ConstPtr[GDExtensionMethodInfo],
  Unit
]
object GDExtensionScriptInstanceFreeMethodList {
  given Tag[GDExtensionScriptInstanceFreeMethodList] = Tag.Ptr.asInstanceOf[Tag[GDExtensionScriptInstanceFreeMethodList]]
  
  extension (func: GDExtensionScriptInstanceFreeMethodList) {
    inline def apply(
      p_instance: GDExtensionScriptInstanceDataPtr,
      p_list: ConstPtr[GDExtensionMethodInfo]
    ): Unit = func(p_instance, p_list)
  } 
}


opaque type GDExtensionScriptInstanceFreeMethodList2 = CFuncPtr3[
  GDExtensionScriptInstanceDataPtr,
  ConstPtr[GDExtensionMethodInfo],
  CUnsignedInt,
  Unit
]
object GDExtensionScriptInstanceFreeMethodList2 {
  given Tag[GDExtensionScriptInstanceFreeMethodList2] = Tag.Ptr.asInstanceOf[Tag[GDExtensionScriptInstanceFreeMethodList2]]
  
  extension (func: GDExtensionScriptInstanceFreeMethodList2) {
    inline def apply(
      p_instance: GDExtensionScriptInstanceDataPtr,
      p_list: ConstPtr[GDExtensionMethodInfo],
      p_count: CUnsignedInt
    ): Unit = func(p_instance, p_list, p_count)
  } 
}


opaque type GDExtensionScriptInstanceHasMethod = CFuncPtr2[
  GDExtensionScriptInstanceDataPtr,
  GDExtensionConstStringNamePtr,
  GDExtensionBool
]
object GDExtensionScriptInstanceHasMethod {
  given Tag[GDExtensionScriptInstanceHasMethod] = Tag.Ptr.asInstanceOf[Tag[GDExtensionScriptInstanceHasMethod]]
  
  extension (func: GDExtensionScriptInstanceHasMethod) {
    inline def apply(
      p_instance: GDExtensionScriptInstanceDataPtr,
      p_name: GDExtensionConstStringNamePtr
    ): GDExtensionBool = func(p_instance, p_name)
  } 
}


opaque type GDExtensionScriptInstanceGetMethodArgumentCount = CFuncPtr3[
  GDExtensionScriptInstanceDataPtr,
  GDExtensionConstStringNamePtr,
  Ptr[GDExtensionBool],
  GDExtensionInt
]
object GDExtensionScriptInstanceGetMethodArgumentCount {
  given Tag[GDExtensionScriptInstanceGetMethodArgumentCount] = Tag.Ptr.asInstanceOf[Tag[GDExtensionScriptInstanceGetMethodArgumentCount]]
  
  extension (func: GDExtensionScriptInstanceGetMethodArgumentCount) {
    inline def apply(
      p_instance: GDExtensionScriptInstanceDataPtr,
      p_name: GDExtensionConstStringNamePtr,
      r_is_valid: Ptr[GDExtensionBool]
    ): GDExtensionInt = func(p_instance, p_name, r_is_valid)
  } 
}


opaque type GDExtensionScriptInstanceCall = CFuncPtr6[
  GDExtensionScriptInstanceDataPtr,
  GDExtensionConstStringNamePtr,
  ConstPtr[GDExtensionConstVariantPtr],
  GDExtensionInt,
  GDExtensionVariantPtr,
  Ptr[GDExtensionCallError],
  Unit
]
object GDExtensionScriptInstanceCall {
  given Tag[GDExtensionScriptInstanceCall] = Tag.Ptr.asInstanceOf[Tag[GDExtensionScriptInstanceCall]]
  
  extension (func: GDExtensionScriptInstanceCall) {
    inline def apply(
      p_self: GDExtensionScriptInstanceDataPtr,
      p_method: GDExtensionConstStringNamePtr,
      p_args: ConstPtr[GDExtensionConstVariantPtr],
      p_argument_count: GDExtensionInt,
      r_return: GDExtensionVariantPtr,
      r_error: Ptr[GDExtensionCallError]
    ): Unit = func(p_self, p_method, p_args, p_argument_count, r_return, r_error)
  } 
}

/**
 *
 * @deprecated Since 4.2. Use GDExtensionScriptInstanceNotification2 instead.
 */
opaque type GDExtensionScriptInstanceNotification = CFuncPtr2[
  GDExtensionScriptInstanceDataPtr,
  CInt,
  Unit
]
object GDExtensionScriptInstanceNotification {
  given Tag[GDExtensionScriptInstanceNotification] = Tag.Ptr.asInstanceOf[Tag[GDExtensionScriptInstanceNotification]]
  
  extension (func: GDExtensionScriptInstanceNotification) {
    inline def apply(
      p_instance: GDExtensionScriptInstanceDataPtr,
      p_what: CInt
    ): Unit = func(p_instance, p_what)
  } 
}


opaque type GDExtensionScriptInstanceNotification2 = CFuncPtr3[
  GDExtensionScriptInstanceDataPtr,
  CInt,
  GDExtensionBool,
  Unit
]
object GDExtensionScriptInstanceNotification2 {
  given Tag[GDExtensionScriptInstanceNotification2] = Tag.Ptr.asInstanceOf[Tag[GDExtensionScriptInstanceNotification2]]
  
  extension (func: GDExtensionScriptInstanceNotification2) {
    inline def apply(
      p_instance: GDExtensionScriptInstanceDataPtr,
      p_what: CInt,
      p_reversed: GDExtensionBool
    ): Unit = func(p_instance, p_what, p_reversed)
  } 
}


opaque type GDExtensionScriptInstanceToString = CFuncPtr3[
  GDExtensionScriptInstanceDataPtr,
  Ptr[GDExtensionBool],
  GDExtensionStringPtr,
  Unit
]
object GDExtensionScriptInstanceToString {
  given Tag[GDExtensionScriptInstanceToString] = Tag.Ptr.asInstanceOf[Tag[GDExtensionScriptInstanceToString]]
  
  extension (func: GDExtensionScriptInstanceToString) {
    inline def apply(
      p_instance: GDExtensionScriptInstanceDataPtr,
      r_is_valid: Ptr[GDExtensionBool],
      r_out: GDExtensionStringPtr
    ): Unit = func(p_instance, r_is_valid, r_out)
  } 
}


opaque type GDExtensionScriptInstanceRefCountIncremented = CFuncPtr1[
  GDExtensionScriptInstanceDataPtr,
  Unit
]
object GDExtensionScriptInstanceRefCountIncremented {
  given Tag[GDExtensionScriptInstanceRefCountIncremented] = Tag.Ptr.asInstanceOf[Tag[GDExtensionScriptInstanceRefCountIncremented]]
  
  extension (func: GDExtensionScriptInstanceRefCountIncremented) {
    inline def apply(
      p_instance: GDExtensionScriptInstanceDataPtr
    ): Unit = func(p_instance)
  } 
}


opaque type GDExtensionScriptInstanceRefCountDecremented = CFuncPtr1[
  GDExtensionScriptInstanceDataPtr,
  GDExtensionBool
]
object GDExtensionScriptInstanceRefCountDecremented {
  given Tag[GDExtensionScriptInstanceRefCountDecremented] = Tag.Ptr.asInstanceOf[Tag[GDExtensionScriptInstanceRefCountDecremented]]
  
  extension (func: GDExtensionScriptInstanceRefCountDecremented) {
    inline def apply(
      p_instance: GDExtensionScriptInstanceDataPtr
    ): GDExtensionBool = func(p_instance)
  } 
}


opaque type GDExtensionScriptInstanceGetScript = CFuncPtr1[
  GDExtensionScriptInstanceDataPtr,
  GDExtensionObjectPtr
]
object GDExtensionScriptInstanceGetScript {
  given Tag[GDExtensionScriptInstanceGetScript] = Tag.Ptr.asInstanceOf[Tag[GDExtensionScriptInstanceGetScript]]
  
  extension (func: GDExtensionScriptInstanceGetScript) {
    inline def apply(
      p_instance: GDExtensionScriptInstanceDataPtr
    ): GDExtensionObjectPtr = func(p_instance)
  } 
}


opaque type GDExtensionScriptInstanceIsPlaceholder = CFuncPtr1[
  GDExtensionScriptInstanceDataPtr,
  GDExtensionBool
]
object GDExtensionScriptInstanceIsPlaceholder {
  given Tag[GDExtensionScriptInstanceIsPlaceholder] = Tag.Ptr.asInstanceOf[Tag[GDExtensionScriptInstanceIsPlaceholder]]
  
  extension (func: GDExtensionScriptInstanceIsPlaceholder) {
    inline def apply(
      p_instance: GDExtensionScriptInstanceDataPtr
    ): GDExtensionBool = func(p_instance)
  } 
}


opaque type GDExtensionScriptInstanceGetLanguage = CFuncPtr1[
  GDExtensionScriptInstanceDataPtr,
  GDExtensionScriptLanguagePtr
]
object GDExtensionScriptInstanceGetLanguage {
  given Tag[GDExtensionScriptInstanceGetLanguage] = Tag.Ptr.asInstanceOf[Tag[GDExtensionScriptInstanceGetLanguage]]
  
  extension (func: GDExtensionScriptInstanceGetLanguage) {
    inline def apply(
      p_instance: GDExtensionScriptInstanceDataPtr
    ): GDExtensionScriptLanguagePtr = func(p_instance)
  } 
}


opaque type GDExtensionScriptInstanceFree = CFuncPtr1[
  GDExtensionScriptInstanceDataPtr,
  Unit
]
object GDExtensionScriptInstanceFree {
  given Tag[GDExtensionScriptInstanceFree] = Tag.Ptr.asInstanceOf[Tag[GDExtensionScriptInstanceFree]]
  
  extension (func: GDExtensionScriptInstanceFree) {
    inline def apply(
      p_instance: GDExtensionScriptInstanceDataPtr
    ): Unit = func(p_instance)
  } 
}


opaque type GDExtensionWorkerThreadPoolGroupTask = CFuncPtr2[
  Ptr[CVoidPtr],
  CUnsignedInt,
  Unit
]
object GDExtensionWorkerThreadPoolGroupTask {
  given Tag[GDExtensionWorkerThreadPoolGroupTask] = Tag.Ptr.asInstanceOf[Tag[GDExtensionWorkerThreadPoolGroupTask]]
  
  extension (func: GDExtensionWorkerThreadPoolGroupTask) {
    inline def apply(
      _0: Ptr[CVoidPtr],
      _1: CUnsignedInt
    ): Unit = func(_0, _1)
  } 
}


opaque type GDExtensionWorkerThreadPoolTask = CFuncPtr1[
  Ptr[CVoidPtr],
  Unit
]
object GDExtensionWorkerThreadPoolTask {
  given Tag[GDExtensionWorkerThreadPoolTask] = Tag.Ptr.asInstanceOf[Tag[GDExtensionWorkerThreadPoolTask]]
  
  extension (func: GDExtensionWorkerThreadPoolTask) {
    inline def apply(
      _0: Ptr[CVoidPtr]
    ): Unit = func(_0)
  } 
}


opaque type GDExtensionInitializeCallback = CFuncPtr2[
  Ptr[CVoidPtr],
  GDExtensionInitializationLevel,
  Unit
]
object GDExtensionInitializeCallback {
  given Tag[GDExtensionInitializeCallback] = Tag.Ptr.asInstanceOf[Tag[GDExtensionInitializeCallback]]
  
  extension (func: GDExtensionInitializeCallback) {
    inline def apply(
      p_userdata: Ptr[CVoidPtr],
      p_level: GDExtensionInitializationLevel
    ): Unit = func(p_userdata, p_level)
  } 
}


opaque type GDExtensionDeinitializeCallback = CFuncPtr2[
  Ptr[CVoidPtr],
  GDExtensionInitializationLevel,
  Unit
]
object GDExtensionDeinitializeCallback {
  given Tag[GDExtensionDeinitializeCallback] = Tag.Ptr.asInstanceOf[Tag[GDExtensionDeinitializeCallback]]
  
  extension (func: GDExtensionDeinitializeCallback) {
    inline def apply(
      p_userdata: Ptr[CVoidPtr],
      p_level: GDExtensionInitializationLevel
    ): Unit = func(p_userdata, p_level)
  } 
}


opaque type GDExtensionInterfaceFunctionPtr = CFuncPtr0[
  
  Unit
]
object GDExtensionInterfaceFunctionPtr {
  given Tag[GDExtensionInterfaceFunctionPtr] = Tag.Ptr.asInstanceOf[Tag[GDExtensionInterfaceFunctionPtr]]
  
  extension (func: GDExtensionInterfaceFunctionPtr) {
    inline def apply(
      
    ): Unit = func()
  } 
}


opaque type GDExtensionInterfaceGetProcAddress = CFuncPtr1[
  ConstPtr[CChar],
  GDExtensionInterfaceFunctionPtr
]
object GDExtensionInterfaceGetProcAddress {
  given Tag[GDExtensionInterfaceGetProcAddress] = Tag.Ptr.asInstanceOf[Tag[GDExtensionInterfaceGetProcAddress]]
  
  extension (func: GDExtensionInterfaceGetProcAddress) {
    inline def apply(
      p_function_name: ConstPtr[CChar]
    ): GDExtensionInterfaceFunctionPtr = func(p_function_name)
  } 
}

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
opaque type GDExtensionInitializationFunction = CFuncPtr3[
  GDExtensionInterfaceGetProcAddress,
  GDExtensionClassLibraryPtr,
  Ptr[GDExtensionInitialization],
  GDExtensionBool
]
object GDExtensionInitializationFunction {
  given Tag[GDExtensionInitializationFunction] = Tag.Ptr.asInstanceOf[Tag[GDExtensionInitializationFunction]]
  
  extension (func: GDExtensionInitializationFunction) {
    inline def apply(
      p_get_proc_address: GDExtensionInterfaceGetProcAddress,
      p_library: GDExtensionClassLibraryPtr,
      r_initialization: Ptr[GDExtensionInitialization]
    ): GDExtensionBool = func(p_get_proc_address, p_library, r_initialization)
  } 
}

/**
 * Called when starting the main loop.
 */
opaque type GDExtensionMainLoopStartupCallback = CFuncPtr0[
  
  Unit
]
object GDExtensionMainLoopStartupCallback {
  given Tag[GDExtensionMainLoopStartupCallback] = Tag.Ptr.asInstanceOf[Tag[GDExtensionMainLoopStartupCallback]]
  
  extension (func: GDExtensionMainLoopStartupCallback) {
    inline def apply(
      
    ): Unit = func()
  } 
}

/**
 * Called when shutting down the main loop.
 */
opaque type GDExtensionMainLoopShutdownCallback = CFuncPtr0[
  
  Unit
]
object GDExtensionMainLoopShutdownCallback {
  given Tag[GDExtensionMainLoopShutdownCallback] = Tag.Ptr.asInstanceOf[Tag[GDExtensionMainLoopShutdownCallback]]
  
  extension (func: GDExtensionMainLoopShutdownCallback) {
    inline def apply(
      
    ): Unit = func()
  } 
}

/**
 * Called for every frame iteration of the main loop.
 */
opaque type GDExtensionMainLoopFrameCallback = CFuncPtr0[
  
  Unit
]
object GDExtensionMainLoopFrameCallback {
  given Tag[GDExtensionMainLoopFrameCallback] = Tag.Ptr.asInstanceOf[Tag[GDExtensionMainLoopFrameCallback]]
  
  extension (func: GDExtensionMainLoopFrameCallback) {
    inline def apply(
      
    ): Unit = func()
  } 
}

