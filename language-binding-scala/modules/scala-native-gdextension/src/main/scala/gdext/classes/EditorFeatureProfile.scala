package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `EditorFeatureProfile`, extends `RefCounted`. */
abstract class EditorFeatureProfile extends RefCounted {
  override def godotClassName: String = "EditorFeatureProfile"

  /** EditorFeatureProfile.set_disable_class */
  final def setDisableClass(class_name: gdext.builtin.StringName, disable: Boolean): Unit = {
    if (gdext.classes.EditorFeatureProfile.mb_set_disable_class == null) gdext.classes.EditorFeatureProfile.mb_set_disable_class = MethodBind.get("EditorFeatureProfile", "set_disable_class", 2524380260L)
    Ptrcall.callVoid2(gdext.classes.EditorFeatureProfile.mb_set_disable_class, livePtr, class_name, disable)
  }

  /** EditorFeatureProfile.is_class_disabled */
  final def isClassDisabled(class_name: gdext.builtin.StringName): Boolean = {
    if (gdext.classes.EditorFeatureProfile.mb_is_class_disabled == null) gdext.classes.EditorFeatureProfile.mb_is_class_disabled = MethodBind.get("EditorFeatureProfile", "is_class_disabled", 2619796661L)
    Ptrcall.call1[gdext.builtin.StringName, Boolean](gdext.classes.EditorFeatureProfile.mb_is_class_disabled, livePtr, class_name)
  }

  /** EditorFeatureProfile.set_disable_class_editor */
  final def setDisableClassEditor(class_name: gdext.builtin.StringName, disable: Boolean): Unit = {
    if (gdext.classes.EditorFeatureProfile.mb_set_disable_class_editor == null) gdext.classes.EditorFeatureProfile.mb_set_disable_class_editor = MethodBind.get("EditorFeatureProfile", "set_disable_class_editor", 2524380260L)
    Ptrcall.callVoid2(gdext.classes.EditorFeatureProfile.mb_set_disable_class_editor, livePtr, class_name, disable)
  }

  /** EditorFeatureProfile.is_class_editor_disabled */
  final def isClassEditorDisabled(class_name: gdext.builtin.StringName): Boolean = {
    if (gdext.classes.EditorFeatureProfile.mb_is_class_editor_disabled == null) gdext.classes.EditorFeatureProfile.mb_is_class_editor_disabled = MethodBind.get("EditorFeatureProfile", "is_class_editor_disabled", 2619796661L)
    Ptrcall.call1[gdext.builtin.StringName, Boolean](gdext.classes.EditorFeatureProfile.mb_is_class_editor_disabled, livePtr, class_name)
  }

  /** EditorFeatureProfile.set_disable_class_property */
  final def setDisableClassProperty(class_name: gdext.builtin.StringName, property: gdext.builtin.StringName, disable: Boolean): Unit = {
    if (gdext.classes.EditorFeatureProfile.mb_set_disable_class_property == null) gdext.classes.EditorFeatureProfile.mb_set_disable_class_property = MethodBind.get("EditorFeatureProfile", "set_disable_class_property", 865197084L)
    Ptrcall.callVoid3(gdext.classes.EditorFeatureProfile.mb_set_disable_class_property, livePtr, class_name, property, disable)
  }

  /** EditorFeatureProfile.is_class_property_disabled */
  final def isClassPropertyDisabled(class_name: gdext.builtin.StringName, property: gdext.builtin.StringName): Boolean = {
    if (gdext.classes.EditorFeatureProfile.mb_is_class_property_disabled == null) gdext.classes.EditorFeatureProfile.mb_is_class_property_disabled = MethodBind.get("EditorFeatureProfile", "is_class_property_disabled", 471820014L)
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, Boolean](gdext.classes.EditorFeatureProfile.mb_is_class_property_disabled, livePtr, class_name, property)
  }

  /** EditorFeatureProfile.set_disable_feature */
  final def setDisableFeature(feature: Long, disable: Boolean): Unit = {
    if (gdext.classes.EditorFeatureProfile.mb_set_disable_feature == null) gdext.classes.EditorFeatureProfile.mb_set_disable_feature = MethodBind.get("EditorFeatureProfile", "set_disable_feature", 1884871044L)
    Ptrcall.callVoid2(gdext.classes.EditorFeatureProfile.mb_set_disable_feature, livePtr, feature, disable)
  }

  /** EditorFeatureProfile.is_feature_disabled */
  final def isFeatureDisabled(feature: Long): Boolean = {
    if (gdext.classes.EditorFeatureProfile.mb_is_feature_disabled == null) gdext.classes.EditorFeatureProfile.mb_is_feature_disabled = MethodBind.get("EditorFeatureProfile", "is_feature_disabled", 2974403161L)
    Ptrcall.call1[Long, Boolean](gdext.classes.EditorFeatureProfile.mb_is_feature_disabled, livePtr, feature)
  }

  /** EditorFeatureProfile.get_feature_name */
  final def getFeatureName(feature: Long): String = {
    if (gdext.classes.EditorFeatureProfile.mb_get_feature_name == null) gdext.classes.EditorFeatureProfile.mb_get_feature_name = MethodBind.get("EditorFeatureProfile", "get_feature_name", 3401335809L)
    Ptrcall.call1[Long, String](gdext.classes.EditorFeatureProfile.mb_get_feature_name, livePtr, feature)
  }

  /** EditorFeatureProfile.save_to_file */
  final def saveToFile(path: String): Long = {
    if (gdext.classes.EditorFeatureProfile.mb_save_to_file == null) gdext.classes.EditorFeatureProfile.mb_save_to_file = MethodBind.get("EditorFeatureProfile", "save_to_file", 166001499L)
    Ptrcall.call1[String, Long](gdext.classes.EditorFeatureProfile.mb_save_to_file, livePtr, path)
  }

  /** EditorFeatureProfile.load_from_file */
  final def loadFromFile(path: String): Long = {
    if (gdext.classes.EditorFeatureProfile.mb_load_from_file == null) gdext.classes.EditorFeatureProfile.mb_load_from_file = MethodBind.get("EditorFeatureProfile", "load_from_file", 166001499L)
    Ptrcall.call1[String, Long](gdext.classes.EditorFeatureProfile.mb_load_from_file, livePtr, path)
  }

}

object EditorFeatureProfile {
  private[classes] var mb_set_disable_class: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_class_disabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_disable_class_editor: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_class_editor_disabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_disable_class_property: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_class_property_disabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_disable_feature: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_feature_disabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_feature_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_save_to_file: GDExtensionMethodBindPtr = null
  private[classes] var mb_load_from_file: GDExtensionMethodBindPtr = null
}
