package io.github.optical002.godot.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.codegen.engine.*

/**
 * Exercises the *generated* engine-class wrappers against the live engine —
 * the real proof that codegen output works end to end (singleton lookup,
 * cached method binds, ptrcall marshalling of primitives, builtins, objects
 * and strings).
 */
object EngineSelfTest {
  def run(log: String => Unit): Unit = {
    var passed = 0
    var failed = 0
    def check(name: String)(cond: => Boolean): Unit =
      try
        if (cond) { passed += 1; log(s"PASS $name") }
        else { failed += 1; log(s"FAIL $name") }
      catch { case e: Throwable => failed += 1; log(s"FAIL $name (threw $e)") }

    // Construct a fresh engine object of the named class as a typed wrapper.
    def construct[T](className: String)(wrap: GodotObject => T): T =
      wrap(
        GodotObject.fromPtr(
          Godot.interface.classdb_construct_object2(
            StringNames.cached(className).ptr
          )
        )
      )

    // --- singleton + no-arg returning method, via generated API ---
    check("Engine.singleton.getProcessFrames") {
      Engine.singleton.getProcessFrames() >= 0L
    }
    check("Engine.singleton.getFramesDrawn") {
      Engine.singleton.getFramesDrawn() >= 0L
    }

    // --- builtin-typed property round-trip on a generated Node2D ---
    check("Node2D set/get position (generated)") {
      val node = construct("Node2D")(Node2D.fromObject)
      node.setPosition(Vector2(3.5f, -9.0f))
      node.getPosition() == Vector2(3.5f, -9.0f)
    }

    // --- inherited method reachable on the subtype (Object.is_class via Node2D) ---
    check("Node2D.isClass(\"Node\") true (inherited)") {
      val node = construct("Node2D")(Node2D.fromObject)
      node.isClass("Node")
    }
    check("Node2D.isClass(\"Sprite2D\") false") {
      val node = construct("Node2D")(Node2D.fromObject)
      !node.isClass("Sprite2D")
    }

    // --- object return: getChild on an empty node returns null handle ---
    check("Node.getChildCount on fresh node is 0") {
      val node = construct("Node")(Node.fromObject)
      node.getChildCount(false) == 0L
    }

    // --- object-typed argument marshals through ptrcall ---
    check("Node.isAncestorOf(self) is false (object arg)") {
      val node = construct("Node")(Node.fromObject)
      !node.isAncestorOf(node)
    }

    log(s"EngineSelfTest: $passed passed, $failed failed")
  }
}
