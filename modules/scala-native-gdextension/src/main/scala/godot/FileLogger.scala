package godot

import java.io.{File, FileWriter}
import java.nio.file.{Files, Paths, StandardCopyOption}

class FileLogger private (writer: FileWriter) {
  private def logBase(msg: String): Unit = {
    val millis = System.currentTimeMillis()

    // Simple date/time formatting from epoch
    val seconds = millis / 1000
    val ms = millis % 1000
    val minutes = seconds / 60
    val hours = (minutes / 60) % 24
    val mins = minutes % 60
    val secs = seconds % 60

    val timestamp = f"$hours%02d:$mins%02d:$secs%02d.$ms%03d"
    val threadName = Thread.currentThread().getName
    writer.write(s"[$timestamp] [$threadName] $msg\n")
    writer.flush()
  }

  def log(msg: String): Unit = logBase(msg)
  def logWarning(msg: String): Unit = logBase(s"[WARNING] $msg")
  def logError(msg: String): Unit = logBase(s"[ERROR] $msg")
}
object FileLogger {
  def use[A](logFileName: String)(f: FileLogger => A): A = {
    // Backup previous log file
    val sourceFile = new File(logFileName)
    if (sourceFile.exists()) {
      val backupFileName = logFileName + "-prev"
      val source = Paths.get(logFileName)
      val dest = Paths.get(backupFileName)
      Files.copy(source, dest, StandardCopyOption.REPLACE_EXISTING)
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
