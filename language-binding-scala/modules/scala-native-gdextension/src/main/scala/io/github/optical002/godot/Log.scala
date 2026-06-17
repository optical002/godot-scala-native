package io.github.optical002.godot

/**
 * The language binding's logging facade. Lives in the binding (not in any game
 * project) so all binding internals — and game code that wants it — share one
 * definition.
 *
 * The two output channels are deliberately split:
 *  - [[godot]]  → Godot's Output panel only (via [[GodotPrint]])
 *  - [[file]]   → the binding's `godot-init` side log file only (via
 *    [[FileLogger]])
 *  - [[both]]   → both of the above
 *
 * Convention in this project: the **binding's own** lifecycle/diagnostic output
 * goes to the [[file]] log, while game code (e.g. a `Player` node) uses
 * [[godot]] so it shows up in the editor's Output panel.
 */
object Log {
  private final val File = "godot-init"

  /** Print to Godot's Output panel. */
  def godot(msg: String): Unit = GodotPrint.print(msg)

  /** Report a warning to Godot's error console. */
  def warning(msg: String): Unit = GodotPrint.printWarning(msg)

  /** Report an error to Godot's error console. */
  def error(msg: String): Unit = GodotPrint.printError(msg)

  /** Append a line to the binding's side log file. */
  def file(msg: String): Unit = {
    val w = new java.io.FileWriter(File, true)
    try w.write(s"$msg\n")
    finally w.close()
  }

  /**
   * Verbose hot-reload tracing. Prefixes every line with a millisecond timestamp
   * and the current thread (id/name) so a cross-thread deadlock — e.g. the
   * editor's resource-preview worker contending with the main thread — is
   * visible in the ordering. Flushes per line (via [[file]]) so the last line
   * before a freeze always survives.
   */
  def trace(msg: String): Unit = {
    val t = Thread.currentThread()
    file(s"[${System.nanoTime() / 1000000L}ms t=${t.getId}/${t.getName}] $msg")
  }

  /** Truncate the side log file and write the first line (start-of-run). */
  def fileReset(msg: String): Unit = FileLogger.use(File)(_.log(msg))

  /** Emit to both Godot's Output panel and the side log file. */
  def both(msg: String): Unit = {
    godot(msg)
    file(msg)
  }
}
