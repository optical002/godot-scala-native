package godotscala

import java.io.File
import java.nio.file.Files
import sbt.io.IO

class ResScanSpec extends munit.FunSuite {

  private val engine = Set("Node", "Node3D", "Resource", "CompressedTexture2D", "AudioStreamOggVorbis")
  private val game   = Map("Player" -> "game.Player", "PlayerStats" -> "game.PlayerStats")

  private def project(files: (String, String)*)(body: File => Unit): Unit = {
    val dir = Files.createTempDirectory("resscan").toFile
    try {
      files.foreach { case (rel, content) => IO.write(new File(dir, rel), content) }
      body(dir)
    } finally IO.delete(dir)
  }

  private def generate(dir: File): String = {
    val files = ResScan.assetFiles(dir)
    ResScan.render(ResScan.scan(dir, files, engine, game).entries, "Res")
  }

  private def kinds(dir: File): Map[String, ResScan.Kind] =
    ResScan.scan(dir, ResScan.assetFiles(dir), engine, game).entries.map(e => e.rel -> e.kind).toMap

  test("types come from .import, .tres header and .tscn root") {
    project(
      "icon.svg" -> "<svg/>",
      "icon.svg.import" -> "[remap]\n\nimporter=\"texture\"\ntype=\"CompressedTexture2D\"\n",
      "sfx/jump.ogg" -> "",
      "sfx/jump.ogg.import" -> "[remap]\nimporter=\"oggvorbisstr\"\ntype=\"AudioStreamOggVorbis\"\n",
      "stats.tres" -> "[gd_resource type=\"PlayerStats\" format=3 uid=\"uid://x\"]\n\n[resource]\n",
      "plain.tres" -> "[gd_resource type=\"Resource\" format=3]\n",
      "player.tscn" -> "[gd_scene format=3]\n\n[ext_resource type=\"PlayerStats\" path=\"res://stats.tres\" id=\"1\"]\n\n[node name=\"Player\" type=\"Player\"]\n\n[node name=\"C\" type=\"Node3D\" parent=\".\"]\n",
      "level.tscn" -> "[gd_scene format=3]\n\n[node name=\"L\" type=\"Node3D\"]\n",
      "data/levels.json" -> "{}"
    ) { dir =>
      val k = kinds(dir)
      assertEquals(k("icon.svg"), ResScan.Res("gdext.classes.CompressedTexture2D"))
      assertEquals(k("sfx/jump.ogg"), ResScan.Res("gdext.classes.AudioStreamOggVorbis"))
      assertEquals(k("stats.tres"), ResScan.Res("game.PlayerStats"))
      assertEquals(k("plain.tres"), ResScan.Res("gdext.classes.Resource"))
      assertEquals(k("player.tscn"), ResScan.Scene("game.Player"))
      assertEquals(k("level.tscn"), ResScan.Scene("gdext.classes.Node3D"))
      assertEquals(k("data/levels.json"), ResScan.Plain)
    }
  }

  test("fallbacks: inherited scene, unknown class, keep importer, imported scene") {
    project(
      "inherited.tscn" -> "[gd_scene format=3]\n\n[ext_resource type=\"PackedScene\" path=\"res://b.tscn\" id=\"1\"]\n\n[node name=\"I\" instance=ExtResource(\"1\")]\n",
      "ghost.tres" -> "[gd_resource type=\"GhostRes\" format=3]\n",
      "ghost.tscn" -> "[gd_scene format=3]\n[node name=\"G\" type=\"GhostNode\"]\n",
      "raw.bin" -> "",
      "raw.bin.import" -> "[remap]\nimporter=\"keep\"\n",
      "model.glb" -> "",
      "model.glb.import" -> "[remap]\nimporter=\"scene\"\ntype=\"PackedScene\"\n"
    ) { dir =>
      val r = ResScan.scan(dir, ResScan.assetFiles(dir), engine, game)
      val k = r.entries.map(e => e.rel -> e.kind).toMap
      assertEquals(k("inherited.tscn"), ResScan.Scene("gdext.classes.Node"))
      assertEquals(k("ghost.tres"), ResScan.Res("gdext.classes.Resource"))
      assertEquals(k("ghost.tscn"), ResScan.Scene("gdext.classes.Node"))
      assertEquals(k("raw.bin"), ResScan.Plain)
      assertEquals(k("model.glb"), ResScan.Scene("gdext.classes.Node"))
      assertEquals(r.warnings.size, 2)
    }
  }

  test("skips Godot and build directories and non-asset files") {
    project(
      ".godot/imported/a.ctex" -> "",
      ".scala/libx.so" -> "",
      "addons/godot_scala/plugin.cfg" -> "",
      "ignored/.gdignore" -> "",
      "ignored/a.png" -> "",
      "sbt/build.sbt" -> "",
      "sbt/b.json" -> "",
      "project.godot" -> "",
      "scala.gdextension" -> "",
      "main.gd" -> "",
      "main.gd.uid" -> "",
      "kept.txt" -> ""
    ) { dir =>
      assertEquals(ResScan.assetFiles(dir).map(_.getName), Seq("kept.txt"))
    }
  }

  test("identifiers are valid, camelCase and stable") {
    assertEquals(ResScan.identifier("new_player_stats"), "newPlayerStats")
    assertEquals(ResScan.identifier("Player"), "player")
    assertEquals(ResScan.identifier("HUD"), "hud")
    assertEquals(ResScan.identifier("UIRoot"), "uiRoot")
    assertEquals(ResScan.identifier("2-boss fight"), "_2BossFight")
    assertEquals(ResScan.identifier("type"), "`type`")
    assertEquals(ResScan.identifier("toString"), "toString_")
    assertEquals(ResScan.identifier("---"), "_")
  }

  test("collisions get an extension suffix, never an error") {
    project(
      "player.png" -> "",
      "player.tres" -> "[gd_resource type=\"Resource\" format=3]\n",
      "enemy.tscn" -> "[gd_scene format=3]\n[node name=\"E\" type=\"Node\"]\n",
      "enemy/a.txt" -> "",
      "my-file.txt" -> "",
      "my_file.txt" -> ""
    ) { dir =>
      val out = generate(dir)
      assert(out.contains("inline def playerPng: FilePath"), out)
      assert(out.contains("inline def playerTres: ResPath[_root_.gdext.classes.Resource]"), out)
      assert(out.contains("object Res {"), out)
      assert(out.contains("object enemy {"), out)
      assert(out.contains("inline def enemyTscn: ScenePath[_root_.gdext.classes.Node]"), out)
      assert(out.contains("inline def myFileTxt: FilePath = FilePath(\"res://my-file.txt\")"), out)
      assert(out.contains("inline def myFileTxt2: FilePath = FilePath(\"res://my_file.txt\")"), out)
    }
  }

  test("a deleted file drops its entry; output is deterministic") {
    project(
      "a.txt" -> "",
      "b.txt" -> ""
    ) { dir =>
      val before = generate(dir)
      assertEquals(generate(dir), before)
      assert(before.contains("inline def b: FilePath"))
      IO.delete(new File(dir, "b.txt"))
      val after = generate(dir)
      assert(!after.contains("inline def b:"), after)
      assert(after.contains("inline def a: FilePath"))
    }
  }

  test("fingerprint changes when a file is added or an .import changes") {
    project("a.txt" -> "", "i.png" -> "", "i.png.import" -> "[remap]\ntype=\"CompressedTexture2D\"\n") { dir =>
      def fp = ResScan.fingerprint(dir, ResScan.assetFiles(dir), game, "Res")
      val f0 = fp
      assertEquals(fp, f0)
      IO.write(new File(dir, "c.txt"), "")
      val f1 = fp
      assertNotEquals(f1, f0)
      IO.write(new File(dir, "i.png.import"), "[remap]\ntype=\"Image\"\n\n")
      assertNotEquals(fp, f1)
    }
  }

  test("type names are _root_-qualified, so a member named like a package can't shadow it") {
    project(
      "game.json" -> "{}",
      "gdext/readme.txt" -> "",
      "player.tscn" -> "[gd_scene format=3]\n\n[node name=\"Player\" type=\"Player\"]\n",
      "stats.tres" -> "[gd_resource type=\"PlayerStats\" format=3]\n"
    ) { dir =>
      val out = generate(dir)
      assert(out.contains("inline def game: FilePath"), out)
      assert(out.contains("object gdext {"), out)
      assert(out.contains("ScenePath[_root_.game.Player] = ScenePath[_root_.game.Player]("), out)
      assert(out.contains("ResPath[_root_.game.PlayerStats] = ResPath[_root_.game.PlayerStats]("), out)
    }
  }
}
