package gdext.register

/**
 * An inspector hint override for an exported property — the analogue of
 * GDScript's `@export_range`, `@export_file`, `@export_multiline`, … . Passed as
 * the argument to [[gdexport]] (`@gdexport(ExportHint.range(0, 100)) var hp: Int`).
 *
 * It overrides the `hint` / `hint_string` an [[ExportType]] would otherwise emit
 * and ORs `usageExtra` into the property usage. The value is plain runtime data;
 * the `Register` macro just forwards it into [[PropertyRegistration.registerExport]].
 */
final case class ExportHint(
  hint: Int,
  hintString: String = "",
  usageExtra: Int = 0
)

object ExportHint {
  /** No override — the [[ExportType]]'s own hint metadata is used as-is. */
  val none: ExportHint = ExportHint(PropertyHint.None)

  /**
   * Slider/spinbox for a numeric property (`@export_range`). `flags` are the
   * extra GDScript range tokens, e.g. `"or_greater"`, `"or_less"`, `"exp"`,
   * `"hide_slider"`, `"radians_as_degrees"`, `"degrees"`, `"suffix:px"`.
   */
  def range(
    min: Double,
    max: Double,
    step: Double = 1.0,
    flags: String*
  ): ExportHint = {
    val parts = f"$min%s,$max%s,$step%s" +: flags
    ExportHint(PropertyHint.Range, parts.mkString(","))
  }

  /** Easing curve editor for a float (`@export_exp_easing`). */
  def expEasing(attenuation: Boolean = false, positiveOnly: Boolean = false): ExportHint = {
    val opts = Seq(
      Option.when(attenuation)("attenuation"),
      Option.when(positiveOnly)("positive_only")
    ).flatten
    ExportHint(PropertyHint.ExpEasing, opts.mkString(","))
  }

  /** Multi-line text box for a String (`@export_multiline`). */
  val multiline: ExportHint = ExportHint(PropertyHint.MultilineText)

  /** Project-relative file picker (`@export_file`). `filter` e.g. `"*.png"`. */
  def file(filter: String = ""): ExportHint = ExportHint(PropertyHint.File, filter)

  /** Project-relative directory picker (`@export_dir`). */
  val dir: ExportHint = ExportHint(PropertyHint.Dir)

  /** Absolute-path file picker (`@export_global_file`). */
  def globalFile(filter: String = ""): ExportHint =
    ExportHint(PropertyHint.GlobalFile, filter)

  /** Absolute-path directory picker (`@export_global_dir`). */
  val globalDir: ExportHint = ExportHint(PropertyHint.GlobalDir)

  /** Locale picker for a String (`@export_locale`). */
  val locale: ExportHint = ExportHint(PropertyHint.LocaleId)

  /** Color picker without the alpha channel (`@export_color_no_alpha`). */
  val colorNoAlpha: ExportHint = ExportHint(PropertyHint.ColorNoAlpha)
}
