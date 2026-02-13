package godot.gdextensioninterface.codegen.types

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import scala.scalanative.unsigned.UInt.*
import godot.types.ConstPtr
import godot.types.CStruct23

opaque type GDExtensionCallError = CStruct3[
  GDExtensionCallErrorType,
  CInt,
  CInt
]
object GDExtensionCallError {
  extension (struct: GDExtensionCallError) {
    def at: Ptr[GDExtensionCallError] = struct.toPtr

    def error: GDExtensionCallErrorType = struct._1
    def error_=(v: GDExtensionCallErrorType) = struct._1_=(v)
    def at_error: Ptr[GDExtensionCallErrorType] = struct.at1

    def argument: CInt = struct._2
    def argument_=(v: CInt) = struct._2_=(v)
    def at_argument: Ptr[CInt] = struct.at2

    def expected: CInt = struct._3
    def expected_=(v: CInt) = struct._3_=(v)
    def at_expected: Ptr[CInt] = struct.at3

  }
}

opaque type GDExtensionInstanceBindingCallbacks = CStruct3[
  GDExtensionInstanceBindingCreateCallback,
  GDExtensionInstanceBindingFreeCallback,
  GDExtensionInstanceBindingReferenceCallback
]
object GDExtensionInstanceBindingCallbacks {
  extension (struct: GDExtensionInstanceBindingCallbacks) {
    def at: Ptr[GDExtensionInstanceBindingCallbacks] = struct.toPtr

    def create_callback: GDExtensionInstanceBindingCreateCallback = struct._1
    def create_callback_=(v: GDExtensionInstanceBindingCreateCallback) =
      struct._1_=(v)
    def at_create_callback: Ptr[GDExtensionInstanceBindingCreateCallback] =
      struct.at1

    def free_callback: GDExtensionInstanceBindingFreeCallback = struct._2
    def free_callback_=(v: GDExtensionInstanceBindingFreeCallback) =
      struct._2_=(v)
    def at_free_callback: Ptr[GDExtensionInstanceBindingFreeCallback] =
      struct.at2

    def reference_callback: GDExtensionInstanceBindingReferenceCallback =
      struct._3
    def reference_callback_=(v: GDExtensionInstanceBindingReferenceCallback) =
      struct._3_=(v)
    def at_reference_callback
      : Ptr[GDExtensionInstanceBindingReferenceCallback] = struct.at3

  }
}

opaque type GDExtensionPropertyInfo = CStruct6[
  GDExtensionVariantType,
  GDExtensionStringNamePtr,
  GDExtensionStringNamePtr,
  CUnsignedInt,
  GDExtensionStringPtr,
  CUnsignedInt
]
object GDExtensionPropertyInfo {
  extension (struct: GDExtensionPropertyInfo) {
    def at: Ptr[GDExtensionPropertyInfo] = struct.toPtr

    def _type: GDExtensionVariantType = struct._1
    def _type_=(v: GDExtensionVariantType) = struct._1_=(v)
    def at__type: Ptr[GDExtensionVariantType] = struct.at1

    def name: GDExtensionStringNamePtr = struct._2
    def name_=(v: GDExtensionStringNamePtr) = struct._2_=(v)
    def at_name: Ptr[GDExtensionStringNamePtr] = struct.at2

    def class_name: GDExtensionStringNamePtr = struct._3
    def class_name_=(v: GDExtensionStringNamePtr) = struct._3_=(v)
    def at_class_name: Ptr[GDExtensionStringNamePtr] = struct.at3

    def hint: CUnsignedInt = struct._4
    def hint_=(v: CUnsignedInt) = struct._4_=(v)
    def at_hint: Ptr[CUnsignedInt] = struct.at4

    def hint_string: GDExtensionStringPtr = struct._5
    def hint_string_=(v: GDExtensionStringPtr) = struct._5_=(v)
    def at_hint_string: Ptr[GDExtensionStringPtr] = struct.at5

    def usage: CUnsignedInt = struct._6
    def usage_=(v: CUnsignedInt) = struct._6_=(v)
    def at_usage: Ptr[CUnsignedInt] = struct.at6

  }
}

opaque type GDExtensionMethodInfo = CStruct8[
  GDExtensionStringNamePtr,
  GDExtensionPropertyInfo,
  CUnsignedInt,
  CInt,
  CUnsignedInt,
  Ptr[GDExtensionPropertyInfo],
  CUnsignedInt,
  Ptr[GDExtensionVariantPtr]
]
object GDExtensionMethodInfo {
  extension (struct: GDExtensionMethodInfo) {
    def at: Ptr[GDExtensionMethodInfo] = struct.toPtr

    def name: GDExtensionStringNamePtr = struct._1
    def name_=(v: GDExtensionStringNamePtr) = struct._1_=(v)
    def at_name: Ptr[GDExtensionStringNamePtr] = struct.at1

    def return_value: GDExtensionPropertyInfo = struct._2
    def return_value_=(v: GDExtensionPropertyInfo) = struct._2_=(v)
    def at_return_value: Ptr[GDExtensionPropertyInfo] = struct.at2

    def flags: CUnsignedInt = struct._3
    def flags_=(v: CUnsignedInt) = struct._3_=(v)
    def at_flags: Ptr[CUnsignedInt] = struct.at3

    def id: CInt = struct._4
    def id_=(v: CInt) = struct._4_=(v)
    def at_id: Ptr[CInt] = struct.at4

    def argument_count: CUnsignedInt = struct._5
    def argument_count_=(v: CUnsignedInt) = struct._5_=(v)
    def at_argument_count: Ptr[CUnsignedInt] = struct.at5

    def arguments: Ptr[GDExtensionPropertyInfo] = struct._6
    def arguments_=(v: Ptr[GDExtensionPropertyInfo]) = struct._6_=(v)
    def at_arguments: Ptr[Ptr[GDExtensionPropertyInfo]] = struct.at6

    def default_argument_count: CUnsignedInt = struct._7
    def default_argument_count_=(v: CUnsignedInt) = struct._7_=(v)
    def at_default_argument_count: Ptr[CUnsignedInt] = struct.at7

    def default_arguments: Ptr[GDExtensionVariantPtr] = struct._8
    def default_arguments_=(v: Ptr[GDExtensionVariantPtr]) = struct._8_=(v)
    def at_default_arguments: Ptr[Ptr[GDExtensionVariantPtr]] = struct.at8

  }
}

/** @deprecated
  *   Since 4.2. Use GDExtensionClassCreationInfo4 instead.
  */
opaque type GDExtensionClassCreationInfo = CStruct17[
  GDExtensionBool,
  GDExtensionBool,
  GDExtensionClassSet,
  GDExtensionClassGet,
  GDExtensionClassGetPropertyList,
  GDExtensionClassFreePropertyList,
  GDExtensionClassPropertyCanRevert,
  GDExtensionClassPropertyGetRevert,
  GDExtensionClassNotification,
  GDExtensionClassToString,
  GDExtensionClassReference,
  GDExtensionClassUnreference,
  GDExtensionClassCreateInstance,
  GDExtensionClassFreeInstance,
  GDExtensionClassGetVirtual,
  GDExtensionClassGetRID,
  Ptr[CVoidPtr]
]
object GDExtensionClassCreationInfo {
  extension (struct: GDExtensionClassCreationInfo) {
    def at: Ptr[GDExtensionClassCreationInfo] = struct.toPtr

    def is_virtual: GDExtensionBool = struct._1
    def is_virtual_=(v: GDExtensionBool) = struct._1_=(v)
    def at_is_virtual: Ptr[GDExtensionBool] = struct.at1

    def is_abstract: GDExtensionBool = struct._2
    def is_abstract_=(v: GDExtensionBool) = struct._2_=(v)
    def at_is_abstract: Ptr[GDExtensionBool] = struct.at2

    def set_func: GDExtensionClassSet = struct._3
    def set_func_=(v: GDExtensionClassSet) = struct._3_=(v)
    def at_set_func: Ptr[GDExtensionClassSet] = struct.at3

    def get_func: GDExtensionClassGet = struct._4
    def get_func_=(v: GDExtensionClassGet) = struct._4_=(v)
    def at_get_func: Ptr[GDExtensionClassGet] = struct.at4

    def get_property_list_func: GDExtensionClassGetPropertyList = struct._5
    def get_property_list_func_=(v: GDExtensionClassGetPropertyList) =
      struct._5_=(v)
    def at_get_property_list_func: Ptr[GDExtensionClassGetPropertyList] =
      struct.at5

    def free_property_list_func: GDExtensionClassFreePropertyList = struct._6
    def free_property_list_func_=(v: GDExtensionClassFreePropertyList) =
      struct._6_=(v)
    def at_free_property_list_func: Ptr[GDExtensionClassFreePropertyList] =
      struct.at6

    def property_can_revert_func: GDExtensionClassPropertyCanRevert = struct._7
    def property_can_revert_func_=(v: GDExtensionClassPropertyCanRevert) =
      struct._7_=(v)
    def at_property_can_revert_func: Ptr[GDExtensionClassPropertyCanRevert] =
      struct.at7

    def property_get_revert_func: GDExtensionClassPropertyGetRevert = struct._8
    def property_get_revert_func_=(v: GDExtensionClassPropertyGetRevert) =
      struct._8_=(v)
    def at_property_get_revert_func: Ptr[GDExtensionClassPropertyGetRevert] =
      struct.at8

    def notification_func: GDExtensionClassNotification = struct._9
    def notification_func_=(v: GDExtensionClassNotification) = struct._9_=(v)
    def at_notification_func: Ptr[GDExtensionClassNotification] = struct.at9

    def to_string_func: GDExtensionClassToString = struct._10
    def to_string_func_=(v: GDExtensionClassToString) = struct._10_=(v)
    def at_to_string_func: Ptr[GDExtensionClassToString] = struct.at10

    def reference_func: GDExtensionClassReference = struct._11
    def reference_func_=(v: GDExtensionClassReference) = struct._11_=(v)
    def at_reference_func: Ptr[GDExtensionClassReference] = struct.at11

    def unreference_func: GDExtensionClassUnreference = struct._12
    def unreference_func_=(v: GDExtensionClassUnreference) = struct._12_=(v)
    def at_unreference_func: Ptr[GDExtensionClassUnreference] = struct.at12

    def create_instance_func: GDExtensionClassCreateInstance = struct._13
    def create_instance_func_=(v: GDExtensionClassCreateInstance) =
      struct._13_=(v)
    def at_create_instance_func: Ptr[GDExtensionClassCreateInstance] =
      struct.at13

    def free_instance_func: GDExtensionClassFreeInstance = struct._14
    def free_instance_func_=(v: GDExtensionClassFreeInstance) = struct._14_=(v)
    def at_free_instance_func: Ptr[GDExtensionClassFreeInstance] = struct.at14

    def get_virtual_func: GDExtensionClassGetVirtual = struct._15
    def get_virtual_func_=(v: GDExtensionClassGetVirtual) = struct._15_=(v)
    def at_get_virtual_func: Ptr[GDExtensionClassGetVirtual] = struct.at15

    def get_rid_func: GDExtensionClassGetRID = struct._16
    def get_rid_func_=(v: GDExtensionClassGetRID) = struct._16_=(v)
    def at_get_rid_func: Ptr[GDExtensionClassGetRID] = struct.at16

    def class_userdata: Ptr[CVoidPtr] = struct._17
    def class_userdata_=(v: Ptr[CVoidPtr]) = struct._17_=(v)
    def at_class_userdata: Ptr[Ptr[CVoidPtr]] = struct.at17

  }
}

/** @deprecated
  *   Since 4.3. Use GDExtensionClassCreationInfo4 instead.
  */
opaque type GDExtensionClassCreationInfo2 = CStruct22[
  GDExtensionBool,
  GDExtensionBool,
  GDExtensionBool,
  GDExtensionClassSet,
  GDExtensionClassGet,
  GDExtensionClassGetPropertyList,
  GDExtensionClassFreePropertyList,
  GDExtensionClassPropertyCanRevert,
  GDExtensionClassPropertyGetRevert,
  GDExtensionClassValidateProperty,
  GDExtensionClassNotification2,
  GDExtensionClassToString,
  GDExtensionClassReference,
  GDExtensionClassUnreference,
  GDExtensionClassCreateInstance,
  GDExtensionClassFreeInstance,
  GDExtensionClassRecreateInstance,
  GDExtensionClassGetVirtual,
  GDExtensionClassGetVirtualCallData,
  GDExtensionClassCallVirtualWithData,
  GDExtensionClassGetRID,
  Ptr[CVoidPtr]
]
object GDExtensionClassCreationInfo2 {
  extension (struct: GDExtensionClassCreationInfo2) {
    def at: Ptr[GDExtensionClassCreationInfo2] = struct.toPtr

    def is_virtual: GDExtensionBool = struct._1
    def is_virtual_=(v: GDExtensionBool) = struct._1_=(v)
    def at_is_virtual: Ptr[GDExtensionBool] = struct.at1

    def is_abstract: GDExtensionBool = struct._2
    def is_abstract_=(v: GDExtensionBool) = struct._2_=(v)
    def at_is_abstract: Ptr[GDExtensionBool] = struct.at2

    def is_exposed: GDExtensionBool = struct._3
    def is_exposed_=(v: GDExtensionBool) = struct._3_=(v)
    def at_is_exposed: Ptr[GDExtensionBool] = struct.at3

    def set_func: GDExtensionClassSet = struct._4
    def set_func_=(v: GDExtensionClassSet) = struct._4_=(v)
    def at_set_func: Ptr[GDExtensionClassSet] = struct.at4

    def get_func: GDExtensionClassGet = struct._5
    def get_func_=(v: GDExtensionClassGet) = struct._5_=(v)
    def at_get_func: Ptr[GDExtensionClassGet] = struct.at5

    def get_property_list_func: GDExtensionClassGetPropertyList = struct._6
    def get_property_list_func_=(v: GDExtensionClassGetPropertyList) =
      struct._6_=(v)
    def at_get_property_list_func: Ptr[GDExtensionClassGetPropertyList] =
      struct.at6

    def free_property_list_func: GDExtensionClassFreePropertyList = struct._7
    def free_property_list_func_=(v: GDExtensionClassFreePropertyList) =
      struct._7_=(v)
    def at_free_property_list_func: Ptr[GDExtensionClassFreePropertyList] =
      struct.at7

    def property_can_revert_func: GDExtensionClassPropertyCanRevert = struct._8
    def property_can_revert_func_=(v: GDExtensionClassPropertyCanRevert) =
      struct._8_=(v)
    def at_property_can_revert_func: Ptr[GDExtensionClassPropertyCanRevert] =
      struct.at8

    def property_get_revert_func: GDExtensionClassPropertyGetRevert = struct._9
    def property_get_revert_func_=(v: GDExtensionClassPropertyGetRevert) =
      struct._9_=(v)
    def at_property_get_revert_func: Ptr[GDExtensionClassPropertyGetRevert] =
      struct.at9

    def validate_property_func: GDExtensionClassValidateProperty = struct._10
    def validate_property_func_=(v: GDExtensionClassValidateProperty) =
      struct._10_=(v)
    def at_validate_property_func: Ptr[GDExtensionClassValidateProperty] =
      struct.at10

    def notification_func: GDExtensionClassNotification2 = struct._11
    def notification_func_=(v: GDExtensionClassNotification2) = struct._11_=(v)
    def at_notification_func: Ptr[GDExtensionClassNotification2] = struct.at11

    def to_string_func: GDExtensionClassToString = struct._12
    def to_string_func_=(v: GDExtensionClassToString) = struct._12_=(v)
    def at_to_string_func: Ptr[GDExtensionClassToString] = struct.at12

    def reference_func: GDExtensionClassReference = struct._13
    def reference_func_=(v: GDExtensionClassReference) = struct._13_=(v)
    def at_reference_func: Ptr[GDExtensionClassReference] = struct.at13

    def unreference_func: GDExtensionClassUnreference = struct._14
    def unreference_func_=(v: GDExtensionClassUnreference) = struct._14_=(v)
    def at_unreference_func: Ptr[GDExtensionClassUnreference] = struct.at14

    def create_instance_func: GDExtensionClassCreateInstance = struct._15
    def create_instance_func_=(v: GDExtensionClassCreateInstance) =
      struct._15_=(v)
    def at_create_instance_func: Ptr[GDExtensionClassCreateInstance] =
      struct.at15

    def free_instance_func: GDExtensionClassFreeInstance = struct._16
    def free_instance_func_=(v: GDExtensionClassFreeInstance) = struct._16_=(v)
    def at_free_instance_func: Ptr[GDExtensionClassFreeInstance] = struct.at16

    def recreate_instance_func: GDExtensionClassRecreateInstance = struct._17
    def recreate_instance_func_=(v: GDExtensionClassRecreateInstance) =
      struct._17_=(v)
    def at_recreate_instance_func: Ptr[GDExtensionClassRecreateInstance] =
      struct.at17

    def get_virtual_func: GDExtensionClassGetVirtual = struct._18
    def get_virtual_func_=(v: GDExtensionClassGetVirtual) = struct._18_=(v)
    def at_get_virtual_func: Ptr[GDExtensionClassGetVirtual] = struct.at18

    def get_virtual_call_data_func: GDExtensionClassGetVirtualCallData =
      struct._19
    def get_virtual_call_data_func_=(v: GDExtensionClassGetVirtualCallData) =
      struct._19_=(v)
    def at_get_virtual_call_data_func: Ptr[GDExtensionClassGetVirtualCallData] =
      struct.at19

    def call_virtual_with_data_func: GDExtensionClassCallVirtualWithData =
      struct._20
    def call_virtual_with_data_func_=(v: GDExtensionClassCallVirtualWithData) =
      struct._20_=(v)
    def at_call_virtual_with_data_func
      : Ptr[GDExtensionClassCallVirtualWithData] = struct.at20

    def get_rid_func: GDExtensionClassGetRID = struct._21
    def get_rid_func_=(v: GDExtensionClassGetRID) = struct._21_=(v)
    def at_get_rid_func: Ptr[GDExtensionClassGetRID] = struct.at21

    def class_userdata: Ptr[CVoidPtr] = struct._22
    def class_userdata_=(v: Ptr[CVoidPtr]) = struct._22_=(v)
    def at_class_userdata: Ptr[Ptr[CVoidPtr]] = struct.at22

  }
}

/** @deprecated
  *   Since 4.4. Use GDExtensionClassCreationInfo4 instead.
  */
opaque type GDExtensionClassCreationInfo3 = CStruct23[
  GDExtensionBool,
  GDExtensionBool,
  GDExtensionBool,
  GDExtensionBool,
  GDExtensionClassSet,
  GDExtensionClassGet,
  GDExtensionClassGetPropertyList,
  GDExtensionClassFreePropertyList2,
  GDExtensionClassPropertyCanRevert,
  GDExtensionClassPropertyGetRevert,
  GDExtensionClassValidateProperty,
  GDExtensionClassNotification2,
  GDExtensionClassToString,
  GDExtensionClassReference,
  GDExtensionClassUnreference,
  GDExtensionClassCreateInstance,
  GDExtensionClassFreeInstance,
  GDExtensionClassRecreateInstance,
  GDExtensionClassGetVirtual,
  GDExtensionClassGetVirtualCallData,
  GDExtensionClassCallVirtualWithData,
  GDExtensionClassGetRID,
  Ptr[CVoidPtr]
]
object GDExtensionClassCreationInfo3 {
  extension (struct: GDExtensionClassCreationInfo3) {
    def at: Ptr[GDExtensionClassCreationInfo3] = struct.toPtr

    def is_virtual: GDExtensionBool = struct._1
    def is_virtual_=(v: GDExtensionBool) = struct._1_=(v)
    def at_is_virtual: Ptr[GDExtensionBool] = struct.at1

    def is_abstract: GDExtensionBool = struct._2
    def is_abstract_=(v: GDExtensionBool) = struct._2_=(v)
    def at_is_abstract: Ptr[GDExtensionBool] = struct.at2

    def is_exposed: GDExtensionBool = struct._3
    def is_exposed_=(v: GDExtensionBool) = struct._3_=(v)
    def at_is_exposed: Ptr[GDExtensionBool] = struct.at3

    def is_runtime: GDExtensionBool = struct._4
    def is_runtime_=(v: GDExtensionBool) = struct._4_=(v)
    def at_is_runtime: Ptr[GDExtensionBool] = struct.at4

    def set_func: GDExtensionClassSet = struct._5
    def set_func_=(v: GDExtensionClassSet) = struct._5_=(v)
    def at_set_func: Ptr[GDExtensionClassSet] = struct.at5

    def get_func: GDExtensionClassGet = struct._6
    def get_func_=(v: GDExtensionClassGet) = struct._6_=(v)
    def at_get_func: Ptr[GDExtensionClassGet] = struct.at6

    def get_property_list_func: GDExtensionClassGetPropertyList = struct._7
    def get_property_list_func_=(v: GDExtensionClassGetPropertyList) =
      struct._7_=(v)
    def at_get_property_list_func: Ptr[GDExtensionClassGetPropertyList] =
      struct.at7

    def free_property_list_func: GDExtensionClassFreePropertyList2 = struct._8
    def free_property_list_func_=(v: GDExtensionClassFreePropertyList2) =
      struct._8_=(v)
    def at_free_property_list_func: Ptr[GDExtensionClassFreePropertyList2] =
      struct.at8

    def property_can_revert_func: GDExtensionClassPropertyCanRevert = struct._9
    def property_can_revert_func_=(v: GDExtensionClassPropertyCanRevert) =
      struct._9_=(v)
    def at_property_can_revert_func: Ptr[GDExtensionClassPropertyCanRevert] =
      struct.at9

    def property_get_revert_func: GDExtensionClassPropertyGetRevert = struct._10
    def property_get_revert_func_=(v: GDExtensionClassPropertyGetRevert) =
      struct._10_=(v)
    def at_property_get_revert_func: Ptr[GDExtensionClassPropertyGetRevert] =
      struct.at10

    def validate_property_func: GDExtensionClassValidateProperty = struct._11
    def validate_property_func_=(v: GDExtensionClassValidateProperty) =
      struct._11_=(v)
    def at_validate_property_func: Ptr[GDExtensionClassValidateProperty] =
      struct.at11

    def notification_func: GDExtensionClassNotification2 = struct._12
    def notification_func_=(v: GDExtensionClassNotification2) = struct._12_=(v)
    def at_notification_func: Ptr[GDExtensionClassNotification2] = struct.at12

    def to_string_func: GDExtensionClassToString = struct._13
    def to_string_func_=(v: GDExtensionClassToString) = struct._13_=(v)
    def at_to_string_func: Ptr[GDExtensionClassToString] = struct.at13

    def reference_func: GDExtensionClassReference = struct._14
    def reference_func_=(v: GDExtensionClassReference) = struct._14_=(v)
    def at_reference_func: Ptr[GDExtensionClassReference] = struct.at14

    def unreference_func: GDExtensionClassUnreference = struct._15
    def unreference_func_=(v: GDExtensionClassUnreference) = struct._15_=(v)
    def at_unreference_func: Ptr[GDExtensionClassUnreference] = struct.at15

    def create_instance_func: GDExtensionClassCreateInstance = struct._16
    def create_instance_func_=(v: GDExtensionClassCreateInstance) =
      struct._16_=(v)
    def at_create_instance_func: Ptr[GDExtensionClassCreateInstance] =
      struct.at16

    def free_instance_func: GDExtensionClassFreeInstance = struct._17
    def free_instance_func_=(v: GDExtensionClassFreeInstance) = struct._17_=(v)
    def at_free_instance_func: Ptr[GDExtensionClassFreeInstance] = struct.at17

    def recreate_instance_func: GDExtensionClassRecreateInstance = struct._18
    def recreate_instance_func_=(v: GDExtensionClassRecreateInstance) =
      struct._18_=(v)
    def at_recreate_instance_func: Ptr[GDExtensionClassRecreateInstance] =
      struct.at18

    def get_virtual_func: GDExtensionClassGetVirtual = struct._19
    def get_virtual_func_=(v: GDExtensionClassGetVirtual) = struct._19_=(v)
    def at_get_virtual_func: Ptr[GDExtensionClassGetVirtual] = struct.at19

    def get_virtual_call_data_func: GDExtensionClassGetVirtualCallData =
      struct._20
    def get_virtual_call_data_func_=(v: GDExtensionClassGetVirtualCallData) =
      struct._20_=(v)
    def at_get_virtual_call_data_func: Ptr[GDExtensionClassGetVirtualCallData] =
      struct.at20

    def call_virtual_with_data_func: GDExtensionClassCallVirtualWithData =
      struct._21
    def call_virtual_with_data_func_=(v: GDExtensionClassCallVirtualWithData) =
      struct._21_=(v)
    def at_call_virtual_with_data_func
      : Ptr[GDExtensionClassCallVirtualWithData] = struct.at21

    def get_rid_func: GDExtensionClassGetRID = struct._22
    def get_rid_func_=(v: GDExtensionClassGetRID) = struct._22_=(v)
    def at_get_rid_func: Ptr[GDExtensionClassGetRID] = struct.at22

    def class_userdata: Ptr[CVoidPtr] = struct._23
    def class_userdata_=(v: Ptr[CVoidPtr]) = struct._23_=(v)
    def at_class_userdata: Ptr[Ptr[CVoidPtr]] = struct.at23

  }
}

opaque type GDExtensionClassCreationInfo4 = CStruct23[
  GDExtensionBool,
  GDExtensionBool,
  GDExtensionBool,
  GDExtensionBool,
  GDExtensionConstStringPtr,
  GDExtensionClassSet,
  GDExtensionClassGet,
  GDExtensionClassGetPropertyList,
  GDExtensionClassFreePropertyList2,
  GDExtensionClassPropertyCanRevert,
  GDExtensionClassPropertyGetRevert,
  GDExtensionClassValidateProperty,
  GDExtensionClassNotification2,
  GDExtensionClassToString,
  GDExtensionClassReference,
  GDExtensionClassUnreference,
  GDExtensionClassCreateInstance2,
  GDExtensionClassFreeInstance,
  GDExtensionClassRecreateInstance,
  GDExtensionClassGetVirtual2,
  GDExtensionClassGetVirtualCallData2,
  GDExtensionClassCallVirtualWithData,
  Ptr[CVoidPtr]
]
object GDExtensionClassCreationInfo4 {
  extension (struct: GDExtensionClassCreationInfo4) {
    def at: Ptr[GDExtensionClassCreationInfo4] = struct.toPtr

    def is_virtual: GDExtensionBool = struct._1
    def is_virtual_=(v: GDExtensionBool) = struct._1_=(v)
    def at_is_virtual: Ptr[GDExtensionBool] = struct.at1

    def is_abstract: GDExtensionBool = struct._2
    def is_abstract_=(v: GDExtensionBool) = struct._2_=(v)
    def at_is_abstract: Ptr[GDExtensionBool] = struct.at2

    def is_exposed: GDExtensionBool = struct._3
    def is_exposed_=(v: GDExtensionBool) = struct._3_=(v)
    def at_is_exposed: Ptr[GDExtensionBool] = struct.at3

    def is_runtime: GDExtensionBool = struct._4
    def is_runtime_=(v: GDExtensionBool) = struct._4_=(v)
    def at_is_runtime: Ptr[GDExtensionBool] = struct.at4

    def icon_path: GDExtensionConstStringPtr = struct._5
    def icon_path_=(v: GDExtensionConstStringPtr) = struct._5_=(v)
    def at_icon_path: Ptr[GDExtensionConstStringPtr] = struct.at5

    def set_func: GDExtensionClassSet = struct._6
    def set_func_=(v: GDExtensionClassSet) = struct._6_=(v)
    def at_set_func: Ptr[GDExtensionClassSet] = struct.at6

    def get_func: GDExtensionClassGet = struct._7
    def get_func_=(v: GDExtensionClassGet) = struct._7_=(v)
    def at_get_func: Ptr[GDExtensionClassGet] = struct.at7

    def get_property_list_func: GDExtensionClassGetPropertyList = struct._8
    def get_property_list_func_=(v: GDExtensionClassGetPropertyList) =
      struct._8_=(v)
    def at_get_property_list_func: Ptr[GDExtensionClassGetPropertyList] =
      struct.at8

    def free_property_list_func: GDExtensionClassFreePropertyList2 = struct._9
    def free_property_list_func_=(v: GDExtensionClassFreePropertyList2) =
      struct._9_=(v)
    def at_free_property_list_func: Ptr[GDExtensionClassFreePropertyList2] =
      struct.at9

    def property_can_revert_func: GDExtensionClassPropertyCanRevert = struct._10
    def property_can_revert_func_=(v: GDExtensionClassPropertyCanRevert) =
      struct._10_=(v)
    def at_property_can_revert_func: Ptr[GDExtensionClassPropertyCanRevert] =
      struct.at10

    def property_get_revert_func: GDExtensionClassPropertyGetRevert = struct._11
    def property_get_revert_func_=(v: GDExtensionClassPropertyGetRevert) =
      struct._11_=(v)
    def at_property_get_revert_func: Ptr[GDExtensionClassPropertyGetRevert] =
      struct.at11

    def validate_property_func: GDExtensionClassValidateProperty = struct._12
    def validate_property_func_=(v: GDExtensionClassValidateProperty) =
      struct._12_=(v)
    def at_validate_property_func: Ptr[GDExtensionClassValidateProperty] =
      struct.at12

    def notification_func: GDExtensionClassNotification2 = struct._13
    def notification_func_=(v: GDExtensionClassNotification2) = struct._13_=(v)
    def at_notification_func: Ptr[GDExtensionClassNotification2] = struct.at13

    def to_string_func: GDExtensionClassToString = struct._14
    def to_string_func_=(v: GDExtensionClassToString) = struct._14_=(v)
    def at_to_string_func: Ptr[GDExtensionClassToString] = struct.at14

    def reference_func: GDExtensionClassReference = struct._15
    def reference_func_=(v: GDExtensionClassReference) = struct._15_=(v)
    def at_reference_func: Ptr[GDExtensionClassReference] = struct.at15

    def unreference_func: GDExtensionClassUnreference = struct._16
    def unreference_func_=(v: GDExtensionClassUnreference) = struct._16_=(v)
    def at_unreference_func: Ptr[GDExtensionClassUnreference] = struct.at16

    def create_instance_func: GDExtensionClassCreateInstance2 = struct._17
    def create_instance_func_=(v: GDExtensionClassCreateInstance2) =
      struct._17_=(v)
    def at_create_instance_func: Ptr[GDExtensionClassCreateInstance2] =
      struct.at17

    def free_instance_func: GDExtensionClassFreeInstance = struct._18
    def free_instance_func_=(v: GDExtensionClassFreeInstance) = struct._18_=(v)
    def at_free_instance_func: Ptr[GDExtensionClassFreeInstance] = struct.at18

    def recreate_instance_func: GDExtensionClassRecreateInstance = struct._19
    def recreate_instance_func_=(v: GDExtensionClassRecreateInstance) =
      struct._19_=(v)
    def at_recreate_instance_func: Ptr[GDExtensionClassRecreateInstance] =
      struct.at19

    def get_virtual_func: GDExtensionClassGetVirtual2 = struct._20
    def get_virtual_func_=(v: GDExtensionClassGetVirtual2) = struct._20_=(v)
    def at_get_virtual_func: Ptr[GDExtensionClassGetVirtual2] = struct.at20

    def get_virtual_call_data_func: GDExtensionClassGetVirtualCallData2 =
      struct._21
    def get_virtual_call_data_func_=(v: GDExtensionClassGetVirtualCallData2) =
      struct._21_=(v)
    def at_get_virtual_call_data_func
      : Ptr[GDExtensionClassGetVirtualCallData2] = struct.at21

    def call_virtual_with_data_func: GDExtensionClassCallVirtualWithData =
      struct._22
    def call_virtual_with_data_func_=(v: GDExtensionClassCallVirtualWithData) =
      struct._22_=(v)
    def at_call_virtual_with_data_func
      : Ptr[GDExtensionClassCallVirtualWithData] = struct.at22

    def class_userdata: Ptr[CVoidPtr] = struct._23
    def class_userdata_=(v: Ptr[CVoidPtr]) = struct._23_=(v)
    def at_class_userdata: Ptr[Ptr[CVoidPtr]] = struct.at23

  }
}

opaque type GDExtensionClassMethodInfo = CStruct13[
  GDExtensionStringNamePtr,
  Ptr[CVoidPtr],
  GDExtensionClassMethodCall,
  GDExtensionClassMethodPtrCall,
  CUnsignedInt,
  GDExtensionBool,
  Ptr[GDExtensionPropertyInfo],
  GDExtensionClassMethodArgumentMetadata,
  CUnsignedInt,
  Ptr[GDExtensionPropertyInfo],
  Ptr[GDExtensionClassMethodArgumentMetadata],
  CUnsignedInt,
  Ptr[GDExtensionVariantPtr]
]
object GDExtensionClassMethodInfo {
  extension (struct: GDExtensionClassMethodInfo) {
    def at: Ptr[GDExtensionClassMethodInfo] = struct.toPtr

    def name: GDExtensionStringNamePtr = struct._1
    def name_=(v: GDExtensionStringNamePtr) = struct._1_=(v)
    def at_name: Ptr[GDExtensionStringNamePtr] = struct.at1

    def method_userdata: Ptr[CVoidPtr] = struct._2
    def method_userdata_=(v: Ptr[CVoidPtr]) = struct._2_=(v)
    def at_method_userdata: Ptr[Ptr[CVoidPtr]] = struct.at2

    def call_func: GDExtensionClassMethodCall = struct._3
    def call_func_=(v: GDExtensionClassMethodCall) = struct._3_=(v)
    def at_call_func: Ptr[GDExtensionClassMethodCall] = struct.at3

    def ptrcall_func: GDExtensionClassMethodPtrCall = struct._4
    def ptrcall_func_=(v: GDExtensionClassMethodPtrCall) = struct._4_=(v)
    def at_ptrcall_func: Ptr[GDExtensionClassMethodPtrCall] = struct.at4

    def method_flags: CUnsignedInt = struct._5
    def method_flags_=(v: CUnsignedInt) = struct._5_=(v)
    def at_method_flags: Ptr[CUnsignedInt] = struct.at5

    def has_return_value: GDExtensionBool = struct._6
    def has_return_value_=(v: GDExtensionBool) = struct._6_=(v)
    def at_has_return_value: Ptr[GDExtensionBool] = struct.at6

    def return_value_info: Ptr[GDExtensionPropertyInfo] = struct._7
    def return_value_info_=(v: Ptr[GDExtensionPropertyInfo]) = struct._7_=(v)
    def at_return_value_info: Ptr[Ptr[GDExtensionPropertyInfo]] = struct.at7

    def return_value_metadata: GDExtensionClassMethodArgumentMetadata =
      struct._8
    def return_value_metadata_=(v: GDExtensionClassMethodArgumentMetadata) =
      struct._8_=(v)
    def at_return_value_metadata: Ptr[GDExtensionClassMethodArgumentMetadata] =
      struct.at8

    def argument_count: CUnsignedInt = struct._9
    def argument_count_=(v: CUnsignedInt) = struct._9_=(v)
    def at_argument_count: Ptr[CUnsignedInt] = struct.at9

    def arguments_info: Ptr[GDExtensionPropertyInfo] = struct._10
    def arguments_info_=(v: Ptr[GDExtensionPropertyInfo]) = struct._10_=(v)
    def at_arguments_info: Ptr[Ptr[GDExtensionPropertyInfo]] = struct.at10

    def arguments_metadata: Ptr[GDExtensionClassMethodArgumentMetadata] =
      struct._11
    def arguments_metadata_=(v: Ptr[GDExtensionClassMethodArgumentMetadata]) =
      struct._11_=(v)
    def at_arguments_metadata
      : Ptr[Ptr[GDExtensionClassMethodArgumentMetadata]] = struct.at11

    def default_argument_count: CUnsignedInt = struct._12
    def default_argument_count_=(v: CUnsignedInt) = struct._12_=(v)
    def at_default_argument_count: Ptr[CUnsignedInt] = struct.at12

    def default_arguments: Ptr[GDExtensionVariantPtr] = struct._13
    def default_arguments_=(v: Ptr[GDExtensionVariantPtr]) = struct._13_=(v)
    def at_default_arguments: Ptr[Ptr[GDExtensionVariantPtr]] = struct.at13

  }
}

opaque type GDExtensionClassVirtualMethodInfo = CStruct7[
  GDExtensionStringNamePtr,
  CUnsignedInt,
  GDExtensionPropertyInfo,
  GDExtensionClassMethodArgumentMetadata,
  CUnsignedInt,
  Ptr[GDExtensionPropertyInfo],
  Ptr[GDExtensionClassMethodArgumentMetadata]
]
object GDExtensionClassVirtualMethodInfo {
  extension (struct: GDExtensionClassVirtualMethodInfo) {
    def at: Ptr[GDExtensionClassVirtualMethodInfo] = struct.toPtr

    def name: GDExtensionStringNamePtr = struct._1
    def name_=(v: GDExtensionStringNamePtr) = struct._1_=(v)
    def at_name: Ptr[GDExtensionStringNamePtr] = struct.at1

    def method_flags: CUnsignedInt = struct._2
    def method_flags_=(v: CUnsignedInt) = struct._2_=(v)
    def at_method_flags: Ptr[CUnsignedInt] = struct.at2

    def return_value: GDExtensionPropertyInfo = struct._3
    def return_value_=(v: GDExtensionPropertyInfo) = struct._3_=(v)
    def at_return_value: Ptr[GDExtensionPropertyInfo] = struct.at3

    def return_value_metadata: GDExtensionClassMethodArgumentMetadata =
      struct._4
    def return_value_metadata_=(v: GDExtensionClassMethodArgumentMetadata) =
      struct._4_=(v)
    def at_return_value_metadata: Ptr[GDExtensionClassMethodArgumentMetadata] =
      struct.at4

    def argument_count: CUnsignedInt = struct._5
    def argument_count_=(v: CUnsignedInt) = struct._5_=(v)
    def at_argument_count: Ptr[CUnsignedInt] = struct.at5

    def arguments: Ptr[GDExtensionPropertyInfo] = struct._6
    def arguments_=(v: Ptr[GDExtensionPropertyInfo]) = struct._6_=(v)
    def at_arguments: Ptr[Ptr[GDExtensionPropertyInfo]] = struct.at6

    def arguments_metadata: Ptr[GDExtensionClassMethodArgumentMetadata] =
      struct._7
    def arguments_metadata_=(v: Ptr[GDExtensionClassMethodArgumentMetadata]) =
      struct._7_=(v)
    def at_arguments_metadata
      : Ptr[Ptr[GDExtensionClassMethodArgumentMetadata]] = struct.at7

  }
}

/** Only `call_func` and `token` are strictly required, however, `object_id`
  * should be passed if its not a static method.
  *
  * `token` should point to an address that uniquely identifies the GDExtension
  * (for example, the `GDExtensionClassLibraryPtr` passed to the entry symbol
  * function.
  *
  * `hash_func`, `equal_func`, and `less_than_func` are optional. If not
  * provided both `call_func` and `callable_userdata` together are used as the
  * identity of the callable for hashing and comparison purposes.
  *
  * The hash returned by `hash_func` is cached, `hash_func` will not be called
  * more than once per callable.
  *
  * `is_valid_func` is necessary if the validity of the callable can change
  * before destruction.
  *
  * `free_func` is necessary if `callable_userdata` needs to be cleaned up when
  * the callable is freed.
  *
  * @deprecated
  *   Since 4.3. Use GDExtensionCallableCustomInfo2 instead.
  */
opaque type GDExtensionCallableCustomInfo = CStruct10[
  Ptr[CVoidPtr],
  Ptr[CVoidPtr],
  GDObjectInstanceID,
  GDExtensionCallableCustomCall,
  GDExtensionCallableCustomIsValid,
  GDExtensionCallableCustomFree,
  GDExtensionCallableCustomHash,
  GDExtensionCallableCustomEqual,
  GDExtensionCallableCustomLessThan,
  GDExtensionCallableCustomToString
]
object GDExtensionCallableCustomInfo {
  extension (struct: GDExtensionCallableCustomInfo) {
    def at: Ptr[GDExtensionCallableCustomInfo] = struct.toPtr

    def callable_userdata: Ptr[CVoidPtr] = struct._1
    def callable_userdata_=(v: Ptr[CVoidPtr]) = struct._1_=(v)
    def at_callable_userdata: Ptr[Ptr[CVoidPtr]] = struct.at1

    def token: Ptr[CVoidPtr] = struct._2
    def token_=(v: Ptr[CVoidPtr]) = struct._2_=(v)
    def at_token: Ptr[Ptr[CVoidPtr]] = struct.at2

    def object_id: GDObjectInstanceID = struct._3
    def object_id_=(v: GDObjectInstanceID) = struct._3_=(v)
    def at_object_id: Ptr[GDObjectInstanceID] = struct.at3

    def call_func: GDExtensionCallableCustomCall = struct._4
    def call_func_=(v: GDExtensionCallableCustomCall) = struct._4_=(v)
    def at_call_func: Ptr[GDExtensionCallableCustomCall] = struct.at4

    def is_valid_func: GDExtensionCallableCustomIsValid = struct._5
    def is_valid_func_=(v: GDExtensionCallableCustomIsValid) = struct._5_=(v)
    def at_is_valid_func: Ptr[GDExtensionCallableCustomIsValid] = struct.at5

    def free_func: GDExtensionCallableCustomFree = struct._6
    def free_func_=(v: GDExtensionCallableCustomFree) = struct._6_=(v)
    def at_free_func: Ptr[GDExtensionCallableCustomFree] = struct.at6

    def hash_func: GDExtensionCallableCustomHash = struct._7
    def hash_func_=(v: GDExtensionCallableCustomHash) = struct._7_=(v)
    def at_hash_func: Ptr[GDExtensionCallableCustomHash] = struct.at7

    def equal_func: GDExtensionCallableCustomEqual = struct._8
    def equal_func_=(v: GDExtensionCallableCustomEqual) = struct._8_=(v)
    def at_equal_func: Ptr[GDExtensionCallableCustomEqual] = struct.at8

    def less_than_func: GDExtensionCallableCustomLessThan = struct._9
    def less_than_func_=(v: GDExtensionCallableCustomLessThan) = struct._9_=(v)
    def at_less_than_func: Ptr[GDExtensionCallableCustomLessThan] = struct.at9

    def to_string_func: GDExtensionCallableCustomToString = struct._10
    def to_string_func_=(v: GDExtensionCallableCustomToString) = struct._10_=(v)
    def at_to_string_func: Ptr[GDExtensionCallableCustomToString] = struct.at10

  }
}

/** Only `call_func` and `token` are strictly required, however, `object_id`
  * should be passed if its not a static method.
  *
  * `token` should point to an address that uniquely identifies the GDExtension
  * (for example, the `GDExtensionClassLibraryPtr` passed to the entry symbol
  * function.
  *
  * `hash_func`, `equal_func`, and `less_than_func` are optional. If not
  * provided both `call_func` and `callable_userdata` together are used as the
  * identity of the callable for hashing and comparison purposes.
  *
  * The hash returned by `hash_func` is cached, `hash_func` will not be called
  * more than once per callable.
  *
  * `is_valid_func` is necessary if the validity of the callable can change
  * before destruction.
  *
  * `free_func` is necessary if `callable_userdata` needs to be cleaned up when
  * the callable is freed.
  */
opaque type GDExtensionCallableCustomInfo2 = CStruct11[
  Ptr[CVoidPtr],
  Ptr[CVoidPtr],
  GDObjectInstanceID,
  GDExtensionCallableCustomCall,
  GDExtensionCallableCustomIsValid,
  GDExtensionCallableCustomFree,
  GDExtensionCallableCustomHash,
  GDExtensionCallableCustomEqual,
  GDExtensionCallableCustomLessThan,
  GDExtensionCallableCustomToString,
  GDExtensionCallableCustomGetArgumentCount
]
object GDExtensionCallableCustomInfo2 {
  extension (struct: GDExtensionCallableCustomInfo2) {
    def at: Ptr[GDExtensionCallableCustomInfo2] = struct.toPtr

    def callable_userdata: Ptr[CVoidPtr] = struct._1
    def callable_userdata_=(v: Ptr[CVoidPtr]) = struct._1_=(v)
    def at_callable_userdata: Ptr[Ptr[CVoidPtr]] = struct.at1

    def token: Ptr[CVoidPtr] = struct._2
    def token_=(v: Ptr[CVoidPtr]) = struct._2_=(v)
    def at_token: Ptr[Ptr[CVoidPtr]] = struct.at2

    def object_id: GDObjectInstanceID = struct._3
    def object_id_=(v: GDObjectInstanceID) = struct._3_=(v)
    def at_object_id: Ptr[GDObjectInstanceID] = struct.at3

    def call_func: GDExtensionCallableCustomCall = struct._4
    def call_func_=(v: GDExtensionCallableCustomCall) = struct._4_=(v)
    def at_call_func: Ptr[GDExtensionCallableCustomCall] = struct.at4

    def is_valid_func: GDExtensionCallableCustomIsValid = struct._5
    def is_valid_func_=(v: GDExtensionCallableCustomIsValid) = struct._5_=(v)
    def at_is_valid_func: Ptr[GDExtensionCallableCustomIsValid] = struct.at5

    def free_func: GDExtensionCallableCustomFree = struct._6
    def free_func_=(v: GDExtensionCallableCustomFree) = struct._6_=(v)
    def at_free_func: Ptr[GDExtensionCallableCustomFree] = struct.at6

    def hash_func: GDExtensionCallableCustomHash = struct._7
    def hash_func_=(v: GDExtensionCallableCustomHash) = struct._7_=(v)
    def at_hash_func: Ptr[GDExtensionCallableCustomHash] = struct.at7

    def equal_func: GDExtensionCallableCustomEqual = struct._8
    def equal_func_=(v: GDExtensionCallableCustomEqual) = struct._8_=(v)
    def at_equal_func: Ptr[GDExtensionCallableCustomEqual] = struct.at8

    def less_than_func: GDExtensionCallableCustomLessThan = struct._9
    def less_than_func_=(v: GDExtensionCallableCustomLessThan) = struct._9_=(v)
    def at_less_than_func: Ptr[GDExtensionCallableCustomLessThan] = struct.at9

    def to_string_func: GDExtensionCallableCustomToString = struct._10
    def to_string_func_=(v: GDExtensionCallableCustomToString) = struct._10_=(v)
    def at_to_string_func: Ptr[GDExtensionCallableCustomToString] = struct.at10

    def get_argument_count_func: GDExtensionCallableCustomGetArgumentCount =
      struct._11
    def get_argument_count_func_=(
      v: GDExtensionCallableCustomGetArgumentCount
    ) = struct._11_=(v)
    def at_get_argument_count_func
      : Ptr[GDExtensionCallableCustomGetArgumentCount] = struct.at11

  }
}

/** @deprecated
  *   Since 4.2. Use GDExtensionScriptInstanceInfo3 instead.
  */
opaque type GDExtensionScriptInstanceInfo = CStruct23[
  GDExtensionScriptInstanceSet,
  GDExtensionScriptInstanceGet,
  GDExtensionScriptInstanceGetPropertyList,
  GDExtensionScriptInstanceFreePropertyList,
  GDExtensionScriptInstancePropertyCanRevert,
  GDExtensionScriptInstancePropertyGetRevert,
  GDExtensionScriptInstanceGetOwner,
  GDExtensionScriptInstanceGetPropertyState,
  GDExtensionScriptInstanceGetMethodList,
  GDExtensionScriptInstanceFreeMethodList,
  GDExtensionScriptInstanceGetPropertyType,
  GDExtensionScriptInstanceHasMethod,
  GDExtensionScriptInstanceCall,
  GDExtensionScriptInstanceNotification,
  GDExtensionScriptInstanceToString,
  GDExtensionScriptInstanceRefCountIncremented,
  GDExtensionScriptInstanceRefCountDecremented,
  GDExtensionScriptInstanceGetScript,
  GDExtensionScriptInstanceIsPlaceholder,
  GDExtensionScriptInstanceSet,
  GDExtensionScriptInstanceGet,
  GDExtensionScriptInstanceGetLanguage,
  GDExtensionScriptInstanceFree
]
object GDExtensionScriptInstanceInfo {
  extension (struct: GDExtensionScriptInstanceInfo) {
    def at: Ptr[GDExtensionScriptInstanceInfo] = struct.toPtr

    def set_func: GDExtensionScriptInstanceSet = struct._1
    def set_func_=(v: GDExtensionScriptInstanceSet) = struct._1_=(v)
    def at_set_func: Ptr[GDExtensionScriptInstanceSet] = struct.at1

    def get_func: GDExtensionScriptInstanceGet = struct._2
    def get_func_=(v: GDExtensionScriptInstanceGet) = struct._2_=(v)
    def at_get_func: Ptr[GDExtensionScriptInstanceGet] = struct.at2

    def get_property_list_func: GDExtensionScriptInstanceGetPropertyList =
      struct._3
    def get_property_list_func_=(v: GDExtensionScriptInstanceGetPropertyList) =
      struct._3_=(v)
    def at_get_property_list_func
      : Ptr[GDExtensionScriptInstanceGetPropertyList] = struct.at3

    def free_property_list_func: GDExtensionScriptInstanceFreePropertyList =
      struct._4
    def free_property_list_func_=(
      v: GDExtensionScriptInstanceFreePropertyList
    ) = struct._4_=(v)
    def at_free_property_list_func
      : Ptr[GDExtensionScriptInstanceFreePropertyList] = struct.at4

    def property_can_revert_func: GDExtensionScriptInstancePropertyCanRevert =
      struct._5
    def property_can_revert_func_=(
      v: GDExtensionScriptInstancePropertyCanRevert
    ) = struct._5_=(v)
    def at_property_can_revert_func
      : Ptr[GDExtensionScriptInstancePropertyCanRevert] = struct.at5

    def property_get_revert_func: GDExtensionScriptInstancePropertyGetRevert =
      struct._6
    def property_get_revert_func_=(
      v: GDExtensionScriptInstancePropertyGetRevert
    ) = struct._6_=(v)
    def at_property_get_revert_func
      : Ptr[GDExtensionScriptInstancePropertyGetRevert] = struct.at6

    def get_owner_func: GDExtensionScriptInstanceGetOwner = struct._7
    def get_owner_func_=(v: GDExtensionScriptInstanceGetOwner) = struct._7_=(v)
    def at_get_owner_func: Ptr[GDExtensionScriptInstanceGetOwner] = struct.at7

    def get_property_state_func: GDExtensionScriptInstanceGetPropertyState =
      struct._8
    def get_property_state_func_=(
      v: GDExtensionScriptInstanceGetPropertyState
    ) = struct._8_=(v)
    def at_get_property_state_func
      : Ptr[GDExtensionScriptInstanceGetPropertyState] = struct.at8

    def get_method_list_func: GDExtensionScriptInstanceGetMethodList = struct._9
    def get_method_list_func_=(v: GDExtensionScriptInstanceGetMethodList) =
      struct._9_=(v)
    def at_get_method_list_func: Ptr[GDExtensionScriptInstanceGetMethodList] =
      struct.at9

    def free_method_list_func: GDExtensionScriptInstanceFreeMethodList =
      struct._10
    def free_method_list_func_=(v: GDExtensionScriptInstanceFreeMethodList) =
      struct._10_=(v)
    def at_free_method_list_func: Ptr[GDExtensionScriptInstanceFreeMethodList] =
      struct.at10

    def get_property_type_func: GDExtensionScriptInstanceGetPropertyType =
      struct._11
    def get_property_type_func_=(v: GDExtensionScriptInstanceGetPropertyType) =
      struct._11_=(v)
    def at_get_property_type_func
      : Ptr[GDExtensionScriptInstanceGetPropertyType] = struct.at11

    def has_method_func: GDExtensionScriptInstanceHasMethod = struct._12
    def has_method_func_=(v: GDExtensionScriptInstanceHasMethod) =
      struct._12_=(v)
    def at_has_method_func: Ptr[GDExtensionScriptInstanceHasMethod] =
      struct.at12

    def call_func: GDExtensionScriptInstanceCall = struct._13
    def call_func_=(v: GDExtensionScriptInstanceCall) = struct._13_=(v)
    def at_call_func: Ptr[GDExtensionScriptInstanceCall] = struct.at13

    def notification_func: GDExtensionScriptInstanceNotification = struct._14
    def notification_func_=(v: GDExtensionScriptInstanceNotification) =
      struct._14_=(v)
    def at_notification_func: Ptr[GDExtensionScriptInstanceNotification] =
      struct.at14

    def to_string_func: GDExtensionScriptInstanceToString = struct._15
    def to_string_func_=(v: GDExtensionScriptInstanceToString) = struct._15_=(v)
    def at_to_string_func: Ptr[GDExtensionScriptInstanceToString] = struct.at15

    def refcount_incremented_func
      : GDExtensionScriptInstanceRefCountIncremented = struct._16
    def refcount_incremented_func_=(
      v: GDExtensionScriptInstanceRefCountIncremented
    ) = struct._16_=(v)
    def at_refcount_incremented_func
      : Ptr[GDExtensionScriptInstanceRefCountIncremented] = struct.at16

    def refcount_decremented_func
      : GDExtensionScriptInstanceRefCountDecremented = struct._17
    def refcount_decremented_func_=(
      v: GDExtensionScriptInstanceRefCountDecremented
    ) = struct._17_=(v)
    def at_refcount_decremented_func
      : Ptr[GDExtensionScriptInstanceRefCountDecremented] = struct.at17

    def get_script_func: GDExtensionScriptInstanceGetScript = struct._18
    def get_script_func_=(v: GDExtensionScriptInstanceGetScript) =
      struct._18_=(v)
    def at_get_script_func: Ptr[GDExtensionScriptInstanceGetScript] =
      struct.at18

    def is_placeholder_func: GDExtensionScriptInstanceIsPlaceholder = struct._19
    def is_placeholder_func_=(v: GDExtensionScriptInstanceIsPlaceholder) =
      struct._19_=(v)
    def at_is_placeholder_func: Ptr[GDExtensionScriptInstanceIsPlaceholder] =
      struct.at19

    def set_fallback_func: GDExtensionScriptInstanceSet = struct._20
    def set_fallback_func_=(v: GDExtensionScriptInstanceSet) = struct._20_=(v)
    def at_set_fallback_func: Ptr[GDExtensionScriptInstanceSet] = struct.at20

    def get_fallback_func: GDExtensionScriptInstanceGet = struct._21
    def get_fallback_func_=(v: GDExtensionScriptInstanceGet) = struct._21_=(v)
    def at_get_fallback_func: Ptr[GDExtensionScriptInstanceGet] = struct.at21

    def get_language_func: GDExtensionScriptInstanceGetLanguage = struct._22
    def get_language_func_=(v: GDExtensionScriptInstanceGetLanguage) =
      struct._22_=(v)
    def at_get_language_func: Ptr[GDExtensionScriptInstanceGetLanguage] =
      struct.at22

    def free_func: GDExtensionScriptInstanceFree = struct._23
    def free_func_=(v: GDExtensionScriptInstanceFree) = struct._23_=(v)
    def at_free_func: Ptr[GDExtensionScriptInstanceFree] = struct.at23

  }
}

/** @deprecated
  *   Since 4.3. Use GDExtensionScriptInstanceInfo3 instead.
  */
opaque type GDExtensionScriptInstanceInfo2 = CStruct25[
  GDExtensionScriptInstanceSet,
  GDExtensionScriptInstanceGet,
  GDExtensionScriptInstanceGetPropertyList,
  GDExtensionScriptInstanceFreePropertyList,
  GDExtensionScriptInstanceGetClassCategory,
  GDExtensionScriptInstancePropertyCanRevert,
  GDExtensionScriptInstancePropertyGetRevert,
  GDExtensionScriptInstanceGetOwner,
  GDExtensionScriptInstanceGetPropertyState,
  GDExtensionScriptInstanceGetMethodList,
  GDExtensionScriptInstanceFreeMethodList,
  GDExtensionScriptInstanceGetPropertyType,
  GDExtensionScriptInstanceValidateProperty,
  GDExtensionScriptInstanceHasMethod,
  GDExtensionScriptInstanceCall,
  GDExtensionScriptInstanceNotification2,
  GDExtensionScriptInstanceToString,
  GDExtensionScriptInstanceRefCountIncremented,
  GDExtensionScriptInstanceRefCountDecremented,
  GDExtensionScriptInstanceGetScript,
  GDExtensionScriptInstanceIsPlaceholder,
  GDExtensionScriptInstanceSet,
  GDExtensionScriptInstanceGet,
  GDExtensionScriptInstanceGetLanguage,
  GDExtensionScriptInstanceFree
]
object GDExtensionScriptInstanceInfo2 {
  extension (struct: GDExtensionScriptInstanceInfo2) {
    def at: Ptr[GDExtensionScriptInstanceInfo2] = struct.toPtr

    def set_func: GDExtensionScriptInstanceSet = struct._1
    def set_func_=(v: GDExtensionScriptInstanceSet) = struct._1_=(v)
    def at_set_func: Ptr[GDExtensionScriptInstanceSet] = struct.at1

    def get_func: GDExtensionScriptInstanceGet = struct._2
    def get_func_=(v: GDExtensionScriptInstanceGet) = struct._2_=(v)
    def at_get_func: Ptr[GDExtensionScriptInstanceGet] = struct.at2

    def get_property_list_func: GDExtensionScriptInstanceGetPropertyList =
      struct._3
    def get_property_list_func_=(v: GDExtensionScriptInstanceGetPropertyList) =
      struct._3_=(v)
    def at_get_property_list_func
      : Ptr[GDExtensionScriptInstanceGetPropertyList] = struct.at3

    def free_property_list_func: GDExtensionScriptInstanceFreePropertyList =
      struct._4
    def free_property_list_func_=(
      v: GDExtensionScriptInstanceFreePropertyList
    ) = struct._4_=(v)
    def at_free_property_list_func
      : Ptr[GDExtensionScriptInstanceFreePropertyList] = struct.at4

    def get_class_category_func: GDExtensionScriptInstanceGetClassCategory =
      struct._5
    def get_class_category_func_=(
      v: GDExtensionScriptInstanceGetClassCategory
    ) = struct._5_=(v)
    def at_get_class_category_func
      : Ptr[GDExtensionScriptInstanceGetClassCategory] = struct.at5

    def property_can_revert_func: GDExtensionScriptInstancePropertyCanRevert =
      struct._6
    def property_can_revert_func_=(
      v: GDExtensionScriptInstancePropertyCanRevert
    ) = struct._6_=(v)
    def at_property_can_revert_func
      : Ptr[GDExtensionScriptInstancePropertyCanRevert] = struct.at6

    def property_get_revert_func: GDExtensionScriptInstancePropertyGetRevert =
      struct._7
    def property_get_revert_func_=(
      v: GDExtensionScriptInstancePropertyGetRevert
    ) = struct._7_=(v)
    def at_property_get_revert_func
      : Ptr[GDExtensionScriptInstancePropertyGetRevert] = struct.at7

    def get_owner_func: GDExtensionScriptInstanceGetOwner = struct._8
    def get_owner_func_=(v: GDExtensionScriptInstanceGetOwner) = struct._8_=(v)
    def at_get_owner_func: Ptr[GDExtensionScriptInstanceGetOwner] = struct.at8

    def get_property_state_func: GDExtensionScriptInstanceGetPropertyState =
      struct._9
    def get_property_state_func_=(
      v: GDExtensionScriptInstanceGetPropertyState
    ) = struct._9_=(v)
    def at_get_property_state_func
      : Ptr[GDExtensionScriptInstanceGetPropertyState] = struct.at9

    def get_method_list_func: GDExtensionScriptInstanceGetMethodList =
      struct._10
    def get_method_list_func_=(v: GDExtensionScriptInstanceGetMethodList) =
      struct._10_=(v)
    def at_get_method_list_func: Ptr[GDExtensionScriptInstanceGetMethodList] =
      struct.at10

    def free_method_list_func: GDExtensionScriptInstanceFreeMethodList =
      struct._11
    def free_method_list_func_=(v: GDExtensionScriptInstanceFreeMethodList) =
      struct._11_=(v)
    def at_free_method_list_func: Ptr[GDExtensionScriptInstanceFreeMethodList] =
      struct.at11

    def get_property_type_func: GDExtensionScriptInstanceGetPropertyType =
      struct._12
    def get_property_type_func_=(v: GDExtensionScriptInstanceGetPropertyType) =
      struct._12_=(v)
    def at_get_property_type_func
      : Ptr[GDExtensionScriptInstanceGetPropertyType] = struct.at12

    def validate_property_func: GDExtensionScriptInstanceValidateProperty =
      struct._13
    def validate_property_func_=(v: GDExtensionScriptInstanceValidateProperty) =
      struct._13_=(v)
    def at_validate_property_func
      : Ptr[GDExtensionScriptInstanceValidateProperty] = struct.at13

    def has_method_func: GDExtensionScriptInstanceHasMethod = struct._14
    def has_method_func_=(v: GDExtensionScriptInstanceHasMethod) =
      struct._14_=(v)
    def at_has_method_func: Ptr[GDExtensionScriptInstanceHasMethod] =
      struct.at14

    def call_func: GDExtensionScriptInstanceCall = struct._15
    def call_func_=(v: GDExtensionScriptInstanceCall) = struct._15_=(v)
    def at_call_func: Ptr[GDExtensionScriptInstanceCall] = struct.at15

    def notification_func: GDExtensionScriptInstanceNotification2 = struct._16
    def notification_func_=(v: GDExtensionScriptInstanceNotification2) =
      struct._16_=(v)
    def at_notification_func: Ptr[GDExtensionScriptInstanceNotification2] =
      struct.at16

    def to_string_func: GDExtensionScriptInstanceToString = struct._17
    def to_string_func_=(v: GDExtensionScriptInstanceToString) = struct._17_=(v)
    def at_to_string_func: Ptr[GDExtensionScriptInstanceToString] = struct.at17

    def refcount_incremented_func
      : GDExtensionScriptInstanceRefCountIncremented = struct._18
    def refcount_incremented_func_=(
      v: GDExtensionScriptInstanceRefCountIncremented
    ) = struct._18_=(v)
    def at_refcount_incremented_func
      : Ptr[GDExtensionScriptInstanceRefCountIncremented] = struct.at18

    def refcount_decremented_func
      : GDExtensionScriptInstanceRefCountDecremented = struct._19
    def refcount_decremented_func_=(
      v: GDExtensionScriptInstanceRefCountDecremented
    ) = struct._19_=(v)
    def at_refcount_decremented_func
      : Ptr[GDExtensionScriptInstanceRefCountDecremented] = struct.at19

    def get_script_func: GDExtensionScriptInstanceGetScript = struct._20
    def get_script_func_=(v: GDExtensionScriptInstanceGetScript) =
      struct._20_=(v)
    def at_get_script_func: Ptr[GDExtensionScriptInstanceGetScript] =
      struct.at20

    def is_placeholder_func: GDExtensionScriptInstanceIsPlaceholder = struct._21
    def is_placeholder_func_=(v: GDExtensionScriptInstanceIsPlaceholder) =
      struct._21_=(v)
    def at_is_placeholder_func: Ptr[GDExtensionScriptInstanceIsPlaceholder] =
      struct.at21

    def set_fallback_func: GDExtensionScriptInstanceSet = struct._22
    def set_fallback_func_=(v: GDExtensionScriptInstanceSet) = struct._22_=(v)
    def at_set_fallback_func: Ptr[GDExtensionScriptInstanceSet] = struct.at22

    def get_fallback_func: GDExtensionScriptInstanceGet = struct._23
    def get_fallback_func_=(v: GDExtensionScriptInstanceGet) = struct._23_=(v)
    def at_get_fallback_func: Ptr[GDExtensionScriptInstanceGet] = struct.at23

    def get_language_func: GDExtensionScriptInstanceGetLanguage = struct._24
    def get_language_func_=(v: GDExtensionScriptInstanceGetLanguage) =
      struct._24_=(v)
    def at_get_language_func: Ptr[GDExtensionScriptInstanceGetLanguage] =
      struct.at24

    def free_func: GDExtensionScriptInstanceFree = struct._25
    def free_func_=(v: GDExtensionScriptInstanceFree) = struct._25_=(v)
    def at_free_func: Ptr[GDExtensionScriptInstanceFree] = struct.at25

  }
}

opaque type GDExtensionScriptInstanceInfo3 = CStruct26[
  GDExtensionScriptInstanceSet,
  GDExtensionScriptInstanceGet,
  GDExtensionScriptInstanceGetPropertyList,
  GDExtensionScriptInstanceFreePropertyList2,
  GDExtensionScriptInstanceGetClassCategory,
  GDExtensionScriptInstancePropertyCanRevert,
  GDExtensionScriptInstancePropertyGetRevert,
  GDExtensionScriptInstanceGetOwner,
  GDExtensionScriptInstanceGetPropertyState,
  GDExtensionScriptInstanceGetMethodList,
  GDExtensionScriptInstanceFreeMethodList2,
  GDExtensionScriptInstanceGetPropertyType,
  GDExtensionScriptInstanceValidateProperty,
  GDExtensionScriptInstanceHasMethod,
  GDExtensionScriptInstanceGetMethodArgumentCount,
  GDExtensionScriptInstanceCall,
  GDExtensionScriptInstanceNotification2,
  GDExtensionScriptInstanceToString,
  GDExtensionScriptInstanceRefCountIncremented,
  GDExtensionScriptInstanceRefCountDecremented,
  GDExtensionScriptInstanceGetScript,
  GDExtensionScriptInstanceIsPlaceholder,
  GDExtensionScriptInstanceSet,
  GDExtensionScriptInstanceGet,
  GDExtensionScriptInstanceGetLanguage,
  GDExtensionScriptInstanceFree
]
object GDExtensionScriptInstanceInfo3 {
  extension (struct: GDExtensionScriptInstanceInfo3) {
    def at: Ptr[GDExtensionScriptInstanceInfo3] = struct.toPtr

    def set_func: GDExtensionScriptInstanceSet = struct._1
    def set_func_=(v: GDExtensionScriptInstanceSet) = struct._1_=(v)
    def at_set_func: Ptr[GDExtensionScriptInstanceSet] = struct.at1

    def get_func: GDExtensionScriptInstanceGet = struct._2
    def get_func_=(v: GDExtensionScriptInstanceGet) = struct._2_=(v)
    def at_get_func: Ptr[GDExtensionScriptInstanceGet] = struct.at2

    def get_property_list_func: GDExtensionScriptInstanceGetPropertyList =
      struct._3
    def get_property_list_func_=(v: GDExtensionScriptInstanceGetPropertyList) =
      struct._3_=(v)
    def at_get_property_list_func
      : Ptr[GDExtensionScriptInstanceGetPropertyList] = struct.at3

    def free_property_list_func: GDExtensionScriptInstanceFreePropertyList2 =
      struct._4
    def free_property_list_func_=(
      v: GDExtensionScriptInstanceFreePropertyList2
    ) = struct._4_=(v)
    def at_free_property_list_func
      : Ptr[GDExtensionScriptInstanceFreePropertyList2] = struct.at4

    def get_class_category_func: GDExtensionScriptInstanceGetClassCategory =
      struct._5
    def get_class_category_func_=(
      v: GDExtensionScriptInstanceGetClassCategory
    ) = struct._5_=(v)
    def at_get_class_category_func
      : Ptr[GDExtensionScriptInstanceGetClassCategory] = struct.at5

    def property_can_revert_func: GDExtensionScriptInstancePropertyCanRevert =
      struct._6
    def property_can_revert_func_=(
      v: GDExtensionScriptInstancePropertyCanRevert
    ) = struct._6_=(v)
    def at_property_can_revert_func
      : Ptr[GDExtensionScriptInstancePropertyCanRevert] = struct.at6

    def property_get_revert_func: GDExtensionScriptInstancePropertyGetRevert =
      struct._7
    def property_get_revert_func_=(
      v: GDExtensionScriptInstancePropertyGetRevert
    ) = struct._7_=(v)
    def at_property_get_revert_func
      : Ptr[GDExtensionScriptInstancePropertyGetRevert] = struct.at7

    def get_owner_func: GDExtensionScriptInstanceGetOwner = struct._8
    def get_owner_func_=(v: GDExtensionScriptInstanceGetOwner) = struct._8_=(v)
    def at_get_owner_func: Ptr[GDExtensionScriptInstanceGetOwner] = struct.at8

    def get_property_state_func: GDExtensionScriptInstanceGetPropertyState =
      struct._9
    def get_property_state_func_=(
      v: GDExtensionScriptInstanceGetPropertyState
    ) = struct._9_=(v)
    def at_get_property_state_func
      : Ptr[GDExtensionScriptInstanceGetPropertyState] = struct.at9

    def get_method_list_func: GDExtensionScriptInstanceGetMethodList =
      struct._10
    def get_method_list_func_=(v: GDExtensionScriptInstanceGetMethodList) =
      struct._10_=(v)
    def at_get_method_list_func: Ptr[GDExtensionScriptInstanceGetMethodList] =
      struct.at10

    def free_method_list_func: GDExtensionScriptInstanceFreeMethodList2 =
      struct._11
    def free_method_list_func_=(v: GDExtensionScriptInstanceFreeMethodList2) =
      struct._11_=(v)
    def at_free_method_list_func
      : Ptr[GDExtensionScriptInstanceFreeMethodList2] = struct.at11

    def get_property_type_func: GDExtensionScriptInstanceGetPropertyType =
      struct._12
    def get_property_type_func_=(v: GDExtensionScriptInstanceGetPropertyType) =
      struct._12_=(v)
    def at_get_property_type_func
      : Ptr[GDExtensionScriptInstanceGetPropertyType] = struct.at12

    def validate_property_func: GDExtensionScriptInstanceValidateProperty =
      struct._13
    def validate_property_func_=(v: GDExtensionScriptInstanceValidateProperty) =
      struct._13_=(v)
    def at_validate_property_func
      : Ptr[GDExtensionScriptInstanceValidateProperty] = struct.at13

    def has_method_func: GDExtensionScriptInstanceHasMethod = struct._14
    def has_method_func_=(v: GDExtensionScriptInstanceHasMethod) =
      struct._14_=(v)
    def at_has_method_func: Ptr[GDExtensionScriptInstanceHasMethod] =
      struct.at14

    def get_method_argument_count_func
      : GDExtensionScriptInstanceGetMethodArgumentCount = struct._15
    def get_method_argument_count_func_=(
      v: GDExtensionScriptInstanceGetMethodArgumentCount
    ) = struct._15_=(v)
    def at_get_method_argument_count_func
      : Ptr[GDExtensionScriptInstanceGetMethodArgumentCount] = struct.at15

    def call_func: GDExtensionScriptInstanceCall = struct._16
    def call_func_=(v: GDExtensionScriptInstanceCall) = struct._16_=(v)
    def at_call_func: Ptr[GDExtensionScriptInstanceCall] = struct.at16

    def notification_func: GDExtensionScriptInstanceNotification2 = struct._17
    def notification_func_=(v: GDExtensionScriptInstanceNotification2) =
      struct._17_=(v)
    def at_notification_func: Ptr[GDExtensionScriptInstanceNotification2] =
      struct.at17

    def to_string_func: GDExtensionScriptInstanceToString = struct._18
    def to_string_func_=(v: GDExtensionScriptInstanceToString) = struct._18_=(v)
    def at_to_string_func: Ptr[GDExtensionScriptInstanceToString] = struct.at18

    def refcount_incremented_func
      : GDExtensionScriptInstanceRefCountIncremented = struct._19
    def refcount_incremented_func_=(
      v: GDExtensionScriptInstanceRefCountIncremented
    ) = struct._19_=(v)
    def at_refcount_incremented_func
      : Ptr[GDExtensionScriptInstanceRefCountIncremented] = struct.at19

    def refcount_decremented_func
      : GDExtensionScriptInstanceRefCountDecremented = struct._20
    def refcount_decremented_func_=(
      v: GDExtensionScriptInstanceRefCountDecremented
    ) = struct._20_=(v)
    def at_refcount_decremented_func
      : Ptr[GDExtensionScriptInstanceRefCountDecremented] = struct.at20

    def get_script_func: GDExtensionScriptInstanceGetScript = struct._21
    def get_script_func_=(v: GDExtensionScriptInstanceGetScript) =
      struct._21_=(v)
    def at_get_script_func: Ptr[GDExtensionScriptInstanceGetScript] =
      struct.at21

    def is_placeholder_func: GDExtensionScriptInstanceIsPlaceholder = struct._22
    def is_placeholder_func_=(v: GDExtensionScriptInstanceIsPlaceholder) =
      struct._22_=(v)
    def at_is_placeholder_func: Ptr[GDExtensionScriptInstanceIsPlaceholder] =
      struct.at22

    def set_fallback_func: GDExtensionScriptInstanceSet = struct._23
    def set_fallback_func_=(v: GDExtensionScriptInstanceSet) = struct._23_=(v)
    def at_set_fallback_func: Ptr[GDExtensionScriptInstanceSet] = struct.at23

    def get_fallback_func: GDExtensionScriptInstanceGet = struct._24
    def get_fallback_func_=(v: GDExtensionScriptInstanceGet) = struct._24_=(v)
    def at_get_fallback_func: Ptr[GDExtensionScriptInstanceGet] = struct.at24

    def get_language_func: GDExtensionScriptInstanceGetLanguage = struct._25
    def get_language_func_=(v: GDExtensionScriptInstanceGetLanguage) =
      struct._25_=(v)
    def at_get_language_func: Ptr[GDExtensionScriptInstanceGetLanguage] =
      struct.at25

    def free_func: GDExtensionScriptInstanceFree = struct._26
    def free_func_=(v: GDExtensionScriptInstanceFree) = struct._26_=(v)
    def at_free_func: Ptr[GDExtensionScriptInstanceFree] = struct.at26

  }
}

opaque type GDExtensionInitialization = CStruct4[
  GDExtensionInitializationLevel,
  Ptr[CVoidPtr],
  GDExtensionInitializeCallback,
  GDExtensionDeinitializeCallback
]
object GDExtensionInitialization {
  extension (struct: GDExtensionInitialization) {
    def at: Ptr[GDExtensionInitialization] = struct.toPtr

    def minimum_initialization_level: GDExtensionInitializationLevel = struct._1
    def minimum_initialization_level_=(v: GDExtensionInitializationLevel) =
      struct._1_=(v)
    def at_minimum_initialization_level: Ptr[GDExtensionInitializationLevel] =
      struct.at1

    def userdata: Ptr[CVoidPtr] = struct._2
    def userdata_=(v: Ptr[CVoidPtr]) = struct._2_=(v)
    def at_userdata: Ptr[Ptr[CVoidPtr]] = struct.at2

    def initialize: GDExtensionInitializeCallback = struct._3
    def initialize_=(v: GDExtensionInitializeCallback) = struct._3_=(v)
    def at_initialize: Ptr[GDExtensionInitializeCallback] = struct.at3

    def deinitialize: GDExtensionDeinitializeCallback = struct._4
    def deinitialize_=(v: GDExtensionDeinitializeCallback) = struct._4_=(v)
    def at_deinitialize: Ptr[GDExtensionDeinitializeCallback] = struct.at4

  }
}

opaque type GDExtensionGodotVersion = CStruct4[
  CUnsignedInt,
  CUnsignedInt,
  CUnsignedInt,
  ConstPtr[CChar]
]
object GDExtensionGodotVersion {
  extension (struct: GDExtensionGodotVersion) {
    def at: Ptr[GDExtensionGodotVersion] = struct.toPtr

    def major: CUnsignedInt = struct._1
    def major_=(v: CUnsignedInt) = struct._1_=(v)
    def at_major: Ptr[CUnsignedInt] = struct.at1

    def minor: CUnsignedInt = struct._2
    def minor_=(v: CUnsignedInt) = struct._2_=(v)
    def at_minor: Ptr[CUnsignedInt] = struct.at2

    def patch: CUnsignedInt = struct._3
    def patch_=(v: CUnsignedInt) = struct._3_=(v)
    def at_patch: Ptr[CUnsignedInt] = struct.at3

    def string: ConstPtr[CChar] = struct._4
    def string_=(v: ConstPtr[CChar]) = struct._4_=(v)
    def at_string: Ptr[ConstPtr[CChar]] = struct.at4

  }
}

opaque type GDExtensionGodotVersion2 = CStruct9[
  CUnsignedInt,
  CUnsignedInt,
  CUnsignedInt,
  CUnsignedInt,
  ConstPtr[CChar],
  ConstPtr[CChar],
  ConstPtr[CChar],
  CUnsignedLongLong,
  ConstPtr[CChar]
]
object GDExtensionGodotVersion2 {
  extension (struct: GDExtensionGodotVersion2) {
    def at: Ptr[GDExtensionGodotVersion2] = struct.toPtr

    def major: CUnsignedInt = struct._1
    def major_=(v: CUnsignedInt) = struct._1_=(v)
    def at_major: Ptr[CUnsignedInt] = struct.at1

    def minor: CUnsignedInt = struct._2
    def minor_=(v: CUnsignedInt) = struct._2_=(v)
    def at_minor: Ptr[CUnsignedInt] = struct.at2

    def patch: CUnsignedInt = struct._3
    def patch_=(v: CUnsignedInt) = struct._3_=(v)
    def at_patch: Ptr[CUnsignedInt] = struct.at3

    def hex: CUnsignedInt = struct._4
    def hex_=(v: CUnsignedInt) = struct._4_=(v)
    def at_hex: Ptr[CUnsignedInt] = struct.at4

    def status: ConstPtr[CChar] = struct._5
    def status_=(v: ConstPtr[CChar]) = struct._5_=(v)
    def at_status: Ptr[ConstPtr[CChar]] = struct.at5

    def build: ConstPtr[CChar] = struct._6
    def build_=(v: ConstPtr[CChar]) = struct._6_=(v)
    def at_build: Ptr[ConstPtr[CChar]] = struct.at6

    def hash: ConstPtr[CChar] = struct._7
    def hash_=(v: ConstPtr[CChar]) = struct._7_=(v)
    def at_hash: Ptr[ConstPtr[CChar]] = struct.at7

    def timestamp: CUnsignedLongLong = struct._8
    def timestamp_=(v: CUnsignedLongLong) = struct._8_=(v)
    def at_timestamp: Ptr[CUnsignedLongLong] = struct.at8

    def string: ConstPtr[CChar] = struct._9
    def string_=(v: ConstPtr[CChar]) = struct._9_=(v)
    def at_string: Ptr[ConstPtr[CChar]] = struct.at9

  }
}

opaque type GDExtensionMainLoopCallbacks = CStruct3[
  GDExtensionMainLoopStartupCallback,
  GDExtensionMainLoopShutdownCallback,
  GDExtensionMainLoopFrameCallback
]
object GDExtensionMainLoopCallbacks {
  extension (struct: GDExtensionMainLoopCallbacks) {
    def at: Ptr[GDExtensionMainLoopCallbacks] = struct.toPtr

    def startup_func: GDExtensionMainLoopStartupCallback = struct._1
    def startup_func_=(v: GDExtensionMainLoopStartupCallback) = struct._1_=(v)
    def at_startup_func: Ptr[GDExtensionMainLoopStartupCallback] = struct.at1

    def shutdown_func: GDExtensionMainLoopShutdownCallback = struct._2
    def shutdown_func_=(v: GDExtensionMainLoopShutdownCallback) = struct._2_=(v)
    def at_shutdown_func: Ptr[GDExtensionMainLoopShutdownCallback] = struct.at2

    def frame_func: GDExtensionMainLoopFrameCallback = struct._3
    def frame_func_=(v: GDExtensionMainLoopFrameCallback) = struct._3_=(v)
    def at_frame_func: Ptr[GDExtensionMainLoopFrameCallback] = struct.at3

  }
}
