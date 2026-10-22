package gdext

import java.io.{File, FileWriter}

private[gdext] class FileLogger private (writer: FileWriter) {
  private def logBase(msg: String): Unit = {
    val millis = System.currentTimeMillis()

    // Simple date/time formatting from epoch
    val seconds = millis / 1000
    val ms = millis % 1000
    val minutes = seconds / 60
    val hours = (minutes / 60) % 24
    val mins = minutes % 60
    val secs = seconds % 60

    // Hand-padded: an `f"..."` interpolator links java.util.Formatter (and with
    // it regex and java.math) into every game.
    def pad(v: Long, w: Int): String = {
      val s = v.toString
      if (s.length >= w) s else "0" * (w - s.length) + s
    }
    val timestamp = s"${pad(hours, 2)}:${pad(mins, 2)}:${pad(secs, 2)}.${pad(ms, 3)}"
    val threadName = Thread.currentThread().getName
    writer.write(s"[$timestamp] [$threadName] $msg\n")
    writer.flush()
  }

  def log(msg: String): Unit = logBase(msg)
  def logWarning(msg: String): Unit = logBase(s"[WARNING] $msg")
  def logError(msg: String): Unit = logBase(s"[ERROR] $msg")
}
private[gdext] object FileLogger {
  def use[A](logFileName: String)(f: FileLogger => A): A = {
    // The log lives under `.scala/`; make sure that dir exists before writing.
    Log.ensureParentDir(logFileName)
    // Keep the previous log as `<name>.prev` (java.io only: java.nio.file
    // would link a large part of the JDK into every game).
    val sourceFile = new File(logFileName)
    if (sourceFile.exists()) {
      val backup = new File(logFileName + ".prev")
      backup.delete()
      sourceFile.renameTo(backup)
    }

    val writer = new FileWriter(logFileName, false)
    val fileLogger = new FileLogger(writer)
    try {
      f(fileLogger)
    } finally {
      writer.close()
    }
  }
}
