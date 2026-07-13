package gdext

import gdext.api.Gd

/**
 * The language binding's logging facade. Lives in the binding (not in any game
 * project) so all binding internals — and game code that wants it — share one
 * definition.
 *
 * The two output channels are deliberately split:
 *  - [[godot]]  → Godot's Output panel only (via `gdext.api.Gd` printing)
 *  - [[file]]   → the binding's `godot-init` side log file only (via
 *    [[FileLogger]])
 *  - [[both]]   → both of the above
 *
 * Convention in this project: the **binding's own** lifecycle/diagnostic output
 * goes to the [[file]] log, while game code (e.g. a `Player` node) uses
 * [[godot]] so it shows up in the editor's Output panel.
 */
private[gdext] object Log {
  // The binding's side log, kept under the hidden `.scala/` dir in the Godot
  // project (next to the `.so`) so it doesn't clutter the project root. Read
  // relative to Godot's working directory (the project root). The previous run's
  // log is rotated to `.scala/log.prev` (see FileLogger).
  private final val File = ".scala/log"

  /** Ensure the parent dir of a project-relative path exists (best-effort). */
  private[gdext] def ensureParentDir(path: String): Unit = {
    val p = new java.io.File(path).getParentFile
    if (p != null) { p.mkdirs(); () }
  }

  /** Print to Godot's Output panel. */
  def godot(msg: String): Unit = Gd.print(msg)

  /** Report a warning to Godot's error console. */
  def warning(msg: String): Unit = Gd.printWarning(msg)

  /** Report an error to Godot's error console. */
  def error(msg: String): Unit = Gd.printError(msg)

  /** Append a line to the binding's side log file. */
  def file(msg: String): Unit = {
    ensureParentDir(File)
    val w = new java.io.FileWriter(File, true)
    try w.write(s"$msg\n")
    finally w.close()
  }

  /**
   * Verbose lifecycle tracing, OFF by default. Enabling it floods `.scala/log`
   * (a line per binding call) which noticeably slows scene-heavy runs like a
   * headless export, so it is opt-in.
   *
   * Enabled by the presence of a `.scala/trace` marker file next to the log —
   * NOT an env var: on Scala Native/Windows `System.getenv` throws during
   * `godot_scala_init` (its EnvVars table can't initialize that early), which
   * would abort init. The file check has no such constraint. Create the file
   * (`touch godot/.scala/trace`) to turn tracing on; delete it to turn it off.
   */
  val traceEnabled: Boolean =
    try new java.io.File(".scala/trace").exists()
    catch { case _: Throwable => false }

  def trace(msg: String): Unit =
    if (traceEnabled) {
      // Do NOT touch Thread.currentThread() here: on Scala Native/Windows the
      // first thread-local access during godot_scala_init triggers main-thread
      // setup -> System.getenv -> NPE (EnvVars not yet initialized). Keep the
      // prefix thread-free (timestamp only) so logging never forces that path.
      val prefix =
        try s"[${System.nanoTime() / 1000000L}ms] "
        catch { case _: Throwable => "[trace] " }
      file(s"$prefix$msg")
    }

  /** Truncate the side log file and write the first line (start-of-run). */
  def fileReset(msg: String): Unit = FileLogger.use(File)(_.log(msg))

  /** Emit to both Godot's Output panel and the side log file. */
  def both(msg: String): Unit = {
    godot(msg)
    file(msg)
  }
}
