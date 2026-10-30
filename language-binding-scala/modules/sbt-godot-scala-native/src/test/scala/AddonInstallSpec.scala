package godotscala

import java.io.File
import java.nio.file.Files
import sbt.io.IO

class AddonInstallSpec extends munit.FunSuite {

  private val bundled = AddonInstall.versionOf(AddonInstall.resource("plugin.cfg")).get

  // <root>/godot (Godot project) and <root>/scala (sbt project)
  private def project(body: (File, File) => Unit): Unit = {
    val root = Files.createTempDirectory("addoninstall").toFile
    try {
      val godot = new File(root, "godot")
      val scala = new File(root, "scala")
      IO.createDirectory(godot)
      IO.createDirectory(scala)
      body(godot, scala)
    } finally IO.delete(root)
  }

  private def addon(godot: File, name: String) = new File(godot, s"addons/godot_scala/$name")

  private def cfg(version: String) = s"""[plugin]\n\nname="Godot Scala Build"\nversion="$version"\n"""

  test("versionOf reads the plugin.cfg version line") {
    assertEquals(AddonInstall.versionOf(cfg("1.2.3")), Some("1.2.3"))
    assertEquals(AddonInstall.versionOf("[plugin]\nname=x\n"), None)
  }

  test("fresh install writes all files and enables the addon") {
    project { (godot, scala) =>
      IO.write(new File(godot, "project.godot"), "config_version=5\n")
      AddonInstall.install(godot, scala, sbt.util.Logger.Null)

      AddonInstall.AddonFiles.foreach(n => assert(addon(godot, n).exists, n))
      assert(IO.read(addon(godot, "scala_build.gd")).contains("""const SBT_PROJECT_DIR := "../scala""""))
      assert(IO.read(new File(godot, "project.godot")).contains("res://addons/godot_scala/plugin.cfg"))
    }
  }

  test("same version leaves the addon untouched") {
    project { (godot, scala) =>
      IO.write(addon(godot, "plugin.cfg"), cfg(bundled))
      IO.write(addon(godot, "scala_build.gd"), "# edited")
      AddonInstall.install(godot, scala, sbt.util.Logger.Null)

      assertEquals(IO.read(addon(godot, "scala_build.gd")), "# edited")
      assert(!addon(godot, "godot.svg").exists)
    }
  }

  test("different version overwrites the addon files only") {
    project { (godot, scala) =>
      val proj = "config_version=5\n"
      IO.write(new File(godot, "project.godot"), proj)
      IO.write(addon(godot, "plugin.cfg"), cfg("0.0.1"))
      IO.write(addon(godot, "scala_build.gd"), "# old")
      IO.write(addon(godot, "scala_build.gd.uid"), "uid://keep")
      AddonInstall.install(godot, scala, sbt.util.Logger.Null)

      assertEquals(AddonInstall.versionOf(IO.read(addon(godot, "plugin.cfg"))), Some(bundled))
      assert(IO.read(addon(godot, "scala_build.gd")).contains("""const SBT_PROJECT_DIR := "../scala""""))
      assert(addon(godot, "godot.svg").exists)
      assertEquals(IO.read(addon(godot, "scala_build.gd.uid")), "uid://keep")
      assertEquals(IO.read(new File(godot, "project.godot")), proj)
    }
  }

  test("missing plugin.cfg counts as a different version") {
    project { (godot, scala) =>
      IO.write(addon(godot, "scala_build.gd"), "# old")
      AddonInstall.install(godot, scala, sbt.util.Logger.Null)

      assert(addon(godot, "plugin.cfg").exists)
      assert(IO.read(addon(godot, "scala_build.gd")).contains("const SBT_PROJECT_DIR"))
    }
  }
}
