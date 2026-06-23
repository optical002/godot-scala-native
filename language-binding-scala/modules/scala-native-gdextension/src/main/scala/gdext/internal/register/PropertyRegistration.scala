package gdext.internal.register

import gdext.Godot
import gdext.builtin.*
import gdext.internal.ffi.types.GDExtensionVariantType.GDEXTENSION_VARIANT_TYPE_NIL

/**
 * Registers an `@export`-style property on a registered class.
 *
 * Godot models a property as a name plus a setter and getter *method* (by
 * name). So this registers a `set_<name>` and `get_<name>` method pair (via
 * [[MethodRegistration]]) and then links them with
 * `classdb_register_extension_class_property`. The property then appears in the
 * inspector and is readable/writable from GDScript.
 */
object PropertyRegistration {

  def registerProperty[A](
    className: String,
    propertyName: String,
    get: GodotScriptClass => A,
    set: (GodotScriptClass, A) => Unit
  )(using
    tv: ToVariant[A],
    fv: FromVariant[A],
    vt: VariantTypeOf[A]
  ): Unit = {
    val getter = s"get_$propertyName"
    val setter = s"set_$propertyName"

    MethodRegistration.registerGetter(className, getter, get)
    MethodRegistration.registerSetter(className, setter, set)

    val info = MethodRegistration.propertyInfo(vt.variantType, propertyName)

    Godot.interface.classdb_register_extension_class_property(
      Godot.library,
      StringNames.cached(className).ptr,
      info,
      StringNames.cached(setter).ptr,
      StringNames.cached(getter).ptr
    )
  }

  /**
   * Register an exported property using an [[ExportType]] — the path the macro
   * uses for all exports. Threads the variant type plus the inspector hint /
   * hint_string / class_name / usage into the PropertyInfo, and records any
   * scene-root requirement for the editor plugin.
   */
  def registerExport[A](
    className: String,
    propertyName: String,
    get: GodotScriptClass => A,
    set: (GodotScriptClass, A) => Unit,
    hint: ExportHint = ExportHint.none
  )(using et: ExportType[A]): Unit = {
    val getter = s"get_$propertyName"
    val setter = s"set_$propertyName"

    // An ExportHint (from `@gdexport(ExportHint.…)`) overrides the ExportType's
    // own hint/hint_string and ORs any extra usage bits; with no hint the
    // ExportType's inspector metadata is used verbatim (the common case).
    val overriding = hint.hint != PropertyHint.None
    val effHint       = if (overriding) hint.hint else et.hint
    val effHintString = if (overriding) hint.hintString else et.hintString
    val effUsage      = et.usage | hint.usageExtra

    gdext.Log.trace(
      s"registerExport: $className.$propertyName variantType=${et.variantType} " +
        s"hint=$effHint hintString='$effHintString' className='${et.className}' usage=$effUsage"
    )
    MethodRegistration.registerExportGetter(className, getter, get)
    MethodRegistration.registerExportSetter(className, setter, set)

    val info = MethodRegistration.propertyInfo(
      et.variantType,
      propertyName,
      effHint,
      effHintString,
      et.className,
      effUsage
    )

    gdext.Log.trace(s"registerExport: $className.$propertyName classdb_register_extension_class_property begin")
    Godot.interface.classdb_register_extension_class_property(
      Godot.library,
      StringNames.cached(className).ptr,
      info,
      StringNames.cached(setter).ptr,
      StringNames.cached(getter).ptr
    )
    gdext.Log.trace(s"registerExport: $className.$propertyName done")

    et.sceneRootType.foreach { rt =>
      SceneExportRegistry.record(className, propertyName, rt)
    }
  }

  /**
   * Inspector section markers (`@export_group` / `@export_subgroup` /
   * `@export_category`). These are **positional**: each applies to every
   * property registered *after* it, so the macro emits them interleaved in
   * source order. Group and subgroup have dedicated ClassDB calls; category has
   * none, so it is emitted as a NIL marker property carrying USAGE_CATEGORY.
   */
  def registerGroup(className: String, name: String, prefix: String): Unit =
    Godot.interface.classdb_register_extension_class_property_group(
      Godot.library,
      StringNames.cached(className).ptr,
      MethodRegistration.heapGString(name),
      MethodRegistration.heapGString(prefix)
    )

  def registerSubgroup(className: String, name: String, prefix: String): Unit =
    Godot.interface.classdb_register_extension_class_property_subgroup(
      Godot.library,
      StringNames.cached(className).ptr,
      MethodRegistration.heapGString(name),
      MethodRegistration.heapGString(prefix)
    )

  def registerCategory(className: String, name: String): Unit = {
    val info = MethodRegistration.propertyInfo(
      GDEXTENSION_VARIANT_TYPE_NIL,
      name,
      PropertyHint.None,
      "",
      "",
      PropertyUsage.Category
    )
    Godot.interface.classdb_register_extension_class_property(
      Godot.library,
      StringNames.cached(className).ptr,
      info,
      StringNames.cached("").ptr,
      StringNames.cached("").ptr
    )
  }
}
