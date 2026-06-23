package gdext.internal.engine

import gdext.classes.*

/**
 * Exercises the Phase 3 object model: `Gd[T]` construction, instance ids,
 * manual free, reference-counting, and up/down casts — against the live engine.
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
    check("Gd[Node] construct has nonzero instance id") {
      val node = Gd.newInstance[Node]
      val ok = !node.isNull && node.instanceId > 0L
      node.free()
      ok
    }

    // --- typed access through Gd.get ---
    check("Gd[Node2D].get round-trips position") {
      val gd = Gd.newInstance[Node2D]
      gd.get.setPosition(gdext.builtin.Vector2(4f, 5f))
      val ok =
        gd.get.getPosition() == gdext.builtin.Vector2(4f, 5f)
      gd.free()
      ok
    }

    // --- upcast succeeds, downcast to a wrong sibling fails ---
    check("Gd[Node2D] upcast to Node succeeds") {
      val gd = Gd.newInstance[Node2D]
      val asNode = gd.cast[Node]
      val ok = !asNode.isNull && asNode.instanceId == gd.instanceId
      gd.free()
      ok
    }
    check("Gd[Node2D] cast to Sprite2D fails (null)") {
      val gd = Gd.newInstance[Node2D]
      val asSprite = gd.cast[Sprite2D]
      val ok = asSprite.isNull
      gd.free()
      ok
    }
    check("Gd[Sprite2D] downcast from Node round-trips") {
      val sprite = Gd.newInstance[Sprite2D]
      val asNode = sprite.cast[Node]
      val backToSprite = asNode.cast[Sprite2D]
      val ok = !backToSprite.isNull && backToSprite.instanceId == sprite.instanceId
      sprite.free()
      ok
    }

    // --- reference-counted lifetime ---
    check("Gd[RefCounted] newInstance has refcount 1") {
      val rc = Gd.newInstance[RefCounted]
      val count = rc.get.getReferenceCount()
      rc.unref() // drop our reference (frees at zero)
      count == 1L
    }
    check("RefCounted free() is a no-op (uses unref instead)") {
      val rc = Gd.newInstance[RefCounted]
      rc.free() // should NOT destroy a refcounted object
      val stillAlive = rc.get.getReferenceCount() == 1L
      rc.unref()
      stillAlive
    }

    log(s"GdSelfTest: $passed passed, $failed failed")
  }
}
