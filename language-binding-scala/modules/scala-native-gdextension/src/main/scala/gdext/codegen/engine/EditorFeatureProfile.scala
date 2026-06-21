package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorFeatureProfile`, extends `RefCounted`. */
abstract class EditorFeatureProfile extends RefCounted {

  /** EditorFeatureProfile.set_disable_class */
  final def setDisableClass(class_name: gdext.builtin.StringName, disable: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("EditorFeatureProfile", "set_disable_class", 2524380260L), hostObject.objectPtr, class_name, disable)

  /** EditorFeatureProfile.is_class_disabled */
  final def isClassDisabled(class_name: gdext.builtin.StringName): Boolean =
    Ptrcall.call1[gdext.builtin.StringName, Boolean](MethodBind.get("EditorFeatureProfile", "is_class_disabled", 2619796661L), hostObject.objectPtr, class_name)

  /** EditorFeatureProfile.set_disable_class_editor */
  final def setDisableClassEditor(class_name: gdext.builtin.StringName, disable: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("EditorFeatureProfile", "set_disable_class_editor", 2524380260L), hostObject.objectPtr, class_name, disable)

  /** EditorFeatureProfile.is_class_editor_disabled */
  final def isClassEditorDisabled(class_name: gdext.builtin.StringName): Boolean =
    Ptrcall.call1[gdext.builtin.StringName, Boolean](MethodBind.get("EditorFeatureProfile", "is_class_editor_disabled", 2619796661L), hostObject.objectPtr, class_name)

  /** EditorFeatureProfile.set_disable_class_property */
  final def setDisableClassProperty(class_name: gdext.builtin.StringName, property: gdext.builtin.StringName, disable: Boolean): Unit =
    Ptrcall.callVoid3(MethodBind.get("EditorFeatureProfile", "set_disable_class_property", 865197084L), hostObject.objectPtr, class_name, property, disable)

  /** EditorFeatureProfile.is_class_property_disabled */
  final def isClassPropertyDisabled(class_name: gdext.builtin.StringName, property: gdext.builtin.StringName): Boolean =
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, Boolean](MethodBind.get("EditorFeatureProfile", "is_class_property_disabled", 471820014L), hostObject.objectPtr, class_name, property)

  /** EditorFeatureProfile.set_disable_feature */
  final def setDisableFeature(feature: Long, disable: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("EditorFeatureProfile", "set_disable_feature", 1884871044L), hostObject.objectPtr, feature, disable)

  /** EditorFeatureProfile.is_feature_disabled */
  final def isFeatureDisabled(feature: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("EditorFeatureProfile", "is_feature_disabled", 2974403161L), hostObject.objectPtr, feature)

  /** EditorFeatureProfile.get_feature_name */
  final def getFeatureName(feature: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("EditorFeatureProfile", "get_feature_name", 3401335809L), hostObject.objectPtr, feature)

  /** EditorFeatureProfile.save_to_file */
  final def saveToFile(path: String): Long =
    Ptrcall.call1[String, Long](MethodBind.get("EditorFeatureProfile", "save_to_file", 166001499L), hostObject.objectPtr, path)

  /** EditorFeatureProfile.load_from_file */
  final def loadFromFile(path: String): Long =
    Ptrcall.call1[String, Long](MethodBind.get("EditorFeatureProfile", "load_from_file", 166001499L), hostObject.objectPtr, path)

}

object EditorFeatureProfile {
  /** Class metadata for Gd[EditorFeatureProfile] lifetime management and casting. */
  given GodotClass[EditorFeatureProfile] with {
    def className = "EditorFeatureProfile"
    def isRefCounted = true
    def wrap(o: GodotObject): EditorFeatureProfile = new EditorFeatureProfile {}.withHost(o.objectPtr)
    def unwrap(t: EditorFeatureProfile): GodotObject = t.hostObject
  }
}
