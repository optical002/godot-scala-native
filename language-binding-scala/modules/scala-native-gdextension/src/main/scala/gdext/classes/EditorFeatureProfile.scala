package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `EditorFeatureProfile`, extends `RefCounted`. */
abstract class EditorFeatureProfile extends RefCounted {
  override def godotClassName: String = "EditorFeatureProfile"

  /** EditorFeatureProfile.set_disable_class */
  final def setDisableClass(className: String, disable: Boolean): Unit = {
    if (gdext.classes.EditorFeatureProfile.mb_set_disable_class == null) gdext.classes.EditorFeatureProfile.mb_set_disable_class = MethodBind.get("EditorFeatureProfile", "set_disable_class", 2524380260L)
    Ptrcall.callVoid2(gdext.classes.EditorFeatureProfile.mb_set_disable_class, livePtr, SnArg(className), disable)
  }

  /** EditorFeatureProfile.is_class_disabled */
  final def isClassDisabled(className: String): Boolean = {
    if (gdext.classes.EditorFeatureProfile.mb_is_class_disabled == null) gdext.classes.EditorFeatureProfile.mb_is_class_disabled = MethodBind.get("EditorFeatureProfile", "is_class_disabled", 2619796661L)
    Ptrcall.call1[SnArg, Boolean](gdext.classes.EditorFeatureProfile.mb_is_class_disabled, livePtr, SnArg(className))
  }

  /** EditorFeatureProfile.set_disable_class_editor */
  final def setDisableClassEditor(className: String, disable: Boolean): Unit = {
    if (gdext.classes.EditorFeatureProfile.mb_set_disable_class_editor == null) gdext.classes.EditorFeatureProfile.mb_set_disable_class_editor = MethodBind.get("EditorFeatureProfile", "set_disable_class_editor", 2524380260L)
    Ptrcall.callVoid2(gdext.classes.EditorFeatureProfile.mb_set_disable_class_editor, livePtr, SnArg(className), disable)
  }

  /** EditorFeatureProfile.is_class_editor_disabled */
  final def isClassEditorDisabled(className: String): Boolean = {
    if (gdext.classes.EditorFeatureProfile.mb_is_class_editor_disabled == null) gdext.classes.EditorFeatureProfile.mb_is_class_editor_disabled = MethodBind.get("EditorFeatureProfile", "is_class_editor_disabled", 2619796661L)
    Ptrcall.call1[SnArg, Boolean](gdext.classes.EditorFeatureProfile.mb_is_class_editor_disabled, livePtr, SnArg(className))
  }

  /** EditorFeatureProfile.set_disable_class_property */
  final def setDisableClassProperty(className: String, property: String, disable: Boolean): Unit = {
    if (gdext.classes.EditorFeatureProfile.mb_set_disable_class_property == null) gdext.classes.EditorFeatureProfile.mb_set_disable_class_property = MethodBind.get("EditorFeatureProfile", "set_disable_class_property", 865197084L)
    Ptrcall.callVoid3(gdext.classes.EditorFeatureProfile.mb_set_disable_class_property, livePtr, SnArg(className), SnArg(property), disable)
  }

  /** EditorFeatureProfile.is_class_property_disabled */
  final def isClassPropertyDisabled(className: String, property: String): Boolean = {
    if (gdext.classes.EditorFeatureProfile.mb_is_class_property_disabled == null) gdext.classes.EditorFeatureProfile.mb_is_class_property_disabled = MethodBind.get("EditorFeatureProfile", "is_class_property_disabled", 471820014L)
    Ptrcall.call2[SnArg, SnArg, Boolean](gdext.classes.EditorFeatureProfile.mb_is_class_property_disabled, livePtr, SnArg(className), SnArg(property))
  }

  /** EditorFeatureProfile.set_disable_feature */
  final def setDisableFeature(feature: gdext.classes.EditorFeatureProfile.Feature, disable: Boolean): Unit = {
    if (gdext.classes.EditorFeatureProfile.mb_set_disable_feature == null) gdext.classes.EditorFeatureProfile.mb_set_disable_feature = MethodBind.get("EditorFeatureProfile", "set_disable_feature", 1884871044L)
    Ptrcall.callVoid2(gdext.classes.EditorFeatureProfile.mb_set_disable_feature, livePtr, feature, disable)
  }

  /** EditorFeatureProfile.is_feature_disabled */
  final def isFeatureDisabled(feature: gdext.classes.EditorFeatureProfile.Feature): Boolean = {
    if (gdext.classes.EditorFeatureProfile.mb_is_feature_disabled == null) gdext.classes.EditorFeatureProfile.mb_is_feature_disabled = MethodBind.get("EditorFeatureProfile", "is_feature_disabled", 2974403161L)
    Ptrcall.call1[Long, Boolean](gdext.classes.EditorFeatureProfile.mb_is_feature_disabled, livePtr, feature)
  }

  /** EditorFeatureProfile.get_feature_name */
  final def getFeatureName(feature: gdext.classes.EditorFeatureProfile.Feature): String = {
    if (gdext.classes.EditorFeatureProfile.mb_get_feature_name == null) gdext.classes.EditorFeatureProfile.mb_get_feature_name = MethodBind.get("EditorFeatureProfile", "get_feature_name", 3401335809L)
    Ptrcall.call1[Long, String](gdext.classes.EditorFeatureProfile.mb_get_feature_name, livePtr, feature)
  }

  /** EditorFeatureProfile.save_to_file */
  final def saveToFile(path: String): gdext.classes.Error = {
    if (gdext.classes.EditorFeatureProfile.mb_save_to_file == null) gdext.classes.EditorFeatureProfile.mb_save_to_file = MethodBind.get("EditorFeatureProfile", "save_to_file", 166001499L)
    gdext.classes.Error(Ptrcall.call1[String, Long](gdext.classes.EditorFeatureProfile.mb_save_to_file, livePtr, path))
  }

  /** EditorFeatureProfile.load_from_file */
  final def loadFromFile(path: String): gdext.classes.Error = {
    if (gdext.classes.EditorFeatureProfile.mb_load_from_file == null) gdext.classes.EditorFeatureProfile.mb_load_from_file = MethodBind.get("EditorFeatureProfile", "load_from_file", 166001499L)
    gdext.classes.Error(Ptrcall.call1[String, Long](gdext.classes.EditorFeatureProfile.mb_load_from_file, livePtr, path))
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

  /** Godot enum `EditorFeatureProfile.Feature`. */
  opaque type Feature <: Long = Long

  object Feature {
    final val Feature3d: Feature = 0L.asInstanceOf[Feature]
    final val Script: Feature = 1L.asInstanceOf[Feature]
    final val AssetLib: Feature = 2L.asInstanceOf[Feature]
    final val SceneTree: Feature = 3L.asInstanceOf[Feature]
    final val NodeDock: Feature = 4L.asInstanceOf[Feature]
    final val FilesystemDock: Feature = 5L.asInstanceOf[Feature]
    final val ImportDock: Feature = 6L.asInstanceOf[Feature]
    final val HistoryDock: Feature = 7L.asInstanceOf[Feature]
    final val Game: Feature = 8L.asInstanceOf[Feature]
    final val SignalsDock: Feature = 9L.asInstanceOf[Feature]
    final val GroupsDock: Feature = 10L.asInstanceOf[Feature]
    final val Max: Feature = 11L.asInstanceOf[Feature]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Feature = value.asInstanceOf[Feature]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Feature] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L).asInstanceOf[scala.IArray[Feature]]

    extension (self: Feature)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Feature3d"
        case 1L => "Script"
        case 2L => "AssetLib"
        case 3L => "SceneTree"
        case 4L => "NodeDock"
        case 5L => "FilesystemDock"
        case 6L => "ImportDock"
        case 7L => "HistoryDock"
        case 8L => "Game"
        case 9L => "SignalsDock"
        case 10L => "GroupsDock"
        case 11L => "Max"
        case other => other.toString
      }
  }
}
