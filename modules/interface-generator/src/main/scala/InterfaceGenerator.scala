import java.io.File

object InterfaceGenerator {
  def run(jsonPath: String): Unit = {
    val jsonFile = new File(jsonPath)
    println(s"Generating code from ${jsonFile.getAbsolutePath}...")
  }
}
