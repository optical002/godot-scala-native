package gdext.sbtplugin

/**
 * Renders the Godot `.gdextension` manifest and resolves per-platform library
 * filenames. The manifest is generated (not hand-written) by the plugin's
 * `godotManifest` task and refreshed by `godotBuild`, so it always agrees with
 * the entry symbol ([[RegistrationScan.EntrySymbol]]) and the library name the
 * build actually drops into the Godot project's `lib/`.
 */
object GodotManifest {

  /** Platform-specific dynamic-library filename for a base name (no prefix /
    * extension). Scala Native emits `lib<base>.so` / `lib<base>.dylib` /
    * `<base>.dll`. */
  def libFileName(base: String, osName: String): String = {
    val os = osName.toLowerCase
    if (os.contains("win")) s"$base.dll"
    else if (os.contains("mac") || os.contains("darwin")) s"lib$base.dylib"
    else s"lib$base.so"
  }

  /** The library filename for the OS this build runs on (the copy target). */
  def currentOsLibFileName(base: String): String =
    libFileName(base, System.getProperty("os.name"))

  /**
   * @param entrySymbol          the `@exported` C symbol Godot calls on load
   *                             (always [[RegistrationScan.EntrySymbol]])
   * @param compatibilityMinimum Godot `compatibility_minimum`
   * @param libBaseName          library base name (no `lib` prefix / extension)
   */
  def render(
    entrySymbol: String,
    compatibilityMinimum: String,
    libBaseName: String
  ): String = {
    val so    = s"lib$libBaseName.so"
    val dylib = s"lib$libBaseName.dylib"
    val dll   = s"$libBaseName.dll"
    s"""; GENERATED — DO NOT EDIT. Written by the sbt-godot-scala-native plugin
       |; (`godotManifest` / `godotBuild`). Change the plugin settings
       |; (godotLibName, godotCompatibilityMinimum) instead, then rebuild.
       |[configuration]
       |entry_symbol = "$entrySymbol"
       |compatibility_minimum = $compatibilityMinimum
       |; Hot-reload the library when the .so is replaced (paired with the atomic
       |; swap in `godotBuild`), so rebuilding does not require an editor restart.
       |reloadable = true
       |
       |[libraries]
       |linux.debug.x86_64   = "res://lib/$so"
       |linux.release.x86_64 = "res://lib/$so"
       |
       |macos.debug          = "res://lib/$dylib"
       |macos.release        = "res://lib/$dylib"
       |macos.debug.arm64    = "res://lib/$dylib"
       |macos.release.arm64  = "res://lib/$dylib"
       |
       |windows.debug.x86_64   = "res://lib/$dll"
       |windows.release.x86_64 = "res://lib/$dll"
       |""".stripMargin
  }
}
