package gdext

import scala.scalanative.unsafe.*
import gdext.api.Gd

@extern
private[gdext] object LinuxThread:
  // Real OS thread id (gettid syscall wrapper). Unlike Thread.currentThread().getId,
  // this distinguishes a foreign (engine-created) thread from the SN main thread.
  @name("scalanative_gdext_gettid")
  def gettid(): Long = extern

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
   * Verbose hot-reload/editor tracing, ON by default so `.scala/log` captures
   * the full binding lifecycle out of the box. Opt out by setting the
   * `GODOT_SCALA_TRACE` environment variable to `0`/`off`/`false`/`no`. Each
   * line is prefixed with a millisecond timestamp and the current thread
   * (id/name) so cross-thread ordering — e.g. an editor worker contending with
   * the main thread — is visible, and flushes per line (via [[file]]) so the
   * last line before a freeze always survives.
   */
  val traceEnabled: Boolean =
    Option(System.getenv("GODOT_SCALA_TRACE")).map(_.trim.toLowerCase) match {
      case Some("0") | Some("off") | Some("false") | Some("no") => false
      case _                                                    => true
    }

  def trace(msg: String): Unit =
    if (traceEnabled) {
      // Tracing must never break init/callbacks: swallow any error from the
      // thread/tid probes (e.g. platform-specific null) and still log the line.
      val prefix =
        try {
          val t = Thread.currentThread()
          s"[${System.nanoTime() / 1000000L}ms t=${t.getId}/${t.getName} tid=${LinuxThread.gettid()}] "
        } catch { case _: Throwable => "[trace] " }
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
