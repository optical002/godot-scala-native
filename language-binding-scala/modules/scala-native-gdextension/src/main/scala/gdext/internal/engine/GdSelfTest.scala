package gdext.internal.engine

import gdext.classes.*
import gdext.api.Gd

/**
 * Exercises the object model against the live engine: construction via
 * `Gd.create`, instance ids, manual free, reference-counting, and up/down casts.
 * An engine object is now held as its plain wrapper type (`Node2D`, …) — there is
 * no `Gd[T]` smart pointer — so a `null` reference is the absent/failed-cast
 * sentinel and the lifetime methods are called directly on the wrapper.
 */
object GdSelfTest {
  def run(log: String => Unit): Unit = {
    var passed = 0
    var failed = 0
    def check(name: String)(cond: => Boolean): Unit =
      try
        if (cond) { passed += 1; log(s"PASS $name") }
        else { failed += 1; log(s"FAIL $name") }
      catch { case e: Throwable => failed += 1; log(s"FAIL $name (threw $e)") }

    // --- manual-lifetime object: construct, identify, free ---
    check("Node construct has nonzero instance id") {
      val node = Gd.create[Node]()
      val ok = node != null && node.instanceId.toLong > 0L
      node.free()
      ok
    }

    // --- typed access directly on the wrapper ---
    check("Node2D round-trips position") {
      val n = Gd.create[Node2D]()
      n.setPosition(gdext.builtin.Vector2(4f, 5f))
      val ok = n.getPosition() == gdext.builtin.Vector2(4f, 5f)
      n.free()
      ok
    }

    // --- upcast succeeds, downcast to a wrong sibling fails ---
    check("Node2D upcast to Node succeeds") {
      val n = Gd.create[Node2D]()
      val asNode = n.cast[Node]
      val ok = asNode != null && asNode.instanceId.toLong == n.instanceId.toLong
      n.free()
      ok
    }
    check("Node2D cast to Sprite2D fails (null)") {
      val n = Gd.create[Node2D]()
      val asSprite = n.cast[Sprite2D]
      val ok = asSprite == null
      n.free()
      ok
    }
    check("Sprite2D downcast from Node round-trips") {
      val sprite = Gd.create[Sprite2D]()
      val asNode = sprite.cast[Node]
      val backToSprite = asNode.cast[Sprite2D]
      val ok = backToSprite != null &&
        backToSprite.instanceId.toLong == sprite.instanceId.toLong
      sprite.free()
      ok
    }

    // --- reference-counted lifetime ---
    check("RefCounted create has refcount 1") {
      val rc = Gd.create[RefCounted]()
      val count = rc.getReferenceCount()
      rc.unref() // drop our reference (frees at zero)
      count == 1L
    }
    check("RefCounted free() is a no-op (uses unref instead)") {
      val rc = Gd.create[RefCounted]()
      rc.free() // should NOT destroy a refcounted object
      val stillAlive = rc.getReferenceCount() == 1L
      rc.unref()
      stillAlive
    }

    // --- static FileAccess: read + existence, incl. res:// (PCK-capable) ---
    check("FileAccess.fileExists true for res://project.godot") {
      FileAccess.fileExists("res://project.godot")
    }
    check("FileAccess.fileExists false for a missing path") {
      !FileAccess.fileExists("res://does_not_exist_12345.txt")
    }
    check("FileAccess.getFileAsString reads res://project.godot") {
      val text = FileAccess.getFileAsString("res://project.godot")
      text != null && text.contains("[application]")
    }

    // --- static DirAccess: open + list a res:// directory ---
    check("DirAccess.open + list finds project.godot at res://") {
      val da = DirAccess.open("res://")
      if (da == null) false
      else {
        da.listDirBegin()
        val names = scala.collection.mutable.ListBuffer.empty[String]
        var n = da.getNext()
        while (n != null && n.nonEmpty) { names += n; n = da.getNext() }
        da.listDirEnd()
        names.contains("project.godot")
      }
    }

    log(s"GdSelfTest: $passed passed, $failed failed")
  }
}
