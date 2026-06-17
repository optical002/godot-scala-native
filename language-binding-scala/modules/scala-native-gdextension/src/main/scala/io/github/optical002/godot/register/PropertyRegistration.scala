package io.github.optical002.godot.register

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*

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
    set: (GodotScriptClass, A) => Unit
  )(using et: ExportType[A]): Unit = {
    val getter = s"get_$propertyName"
    val setter = s"set_$propertyName"

    MethodRegistration.registerExportGetter(className, getter, get)
    MethodRegistration.registerExportSetter(className, setter, set)

    val info = MethodRegistration.propertyInfo(
      et.variantType,
      propertyName,
      et.hint,
      et.hintString,
      et.className,
      et.usage
    )

    Godot.interface.classdb_register_extension_class_property(
      Godot.library,
      StringNames.cached(className).ptr,
      info,
      StringNames.cached(setter).ptr,
      StringNames.cached(getter).ptr
    )

    et.sceneRootType.foreach { rt =>
      SceneExportRegistry.record(className, propertyName, rt)
    }
  }
}
