package gdext.internal.engine

import gdext.Godot
import gdext.builtin.*
import gdext.classes.*

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

    // Construct a fresh engine object of class T as a typed wrapper, using the
    // generated GodotClass[T] evidence.
    def construct[T](using cls: GodotClass[T]): T =
      cls.wrap(
        GodotObject.fromPtr(
          Godot.interface.classdb_construct_object2(
            StringNames.cached(cls.className).ptr
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
      val node = construct[Node2D]
      node.setPosition(Vector2(3.5f, -9.0f))
      node.getPosition() == Vector2(3.5f, -9.0f)
    }

    // --- inherited method reachable on the subtype (Object.is_class via Node2D) ---
    check("Node2D.isClass(\"Node\") true (inherited)") {
      construct[Node2D].isClass("Node")
    }
    check("Node2D.isClass(\"Sprite2D\") false") {
      !construct[Node2D].isClass("Sprite2D")
    }

    // --- object return: getChildCount on a fresh node is 0 ---
    check("Node.getChildCount on fresh node is 0") {
      construct[Node].getChildCount(false) == 0L
    }

    // --- object-typed argument marshals through ptrcall ---
    check("Node.isAncestorOf(self) is false (object arg)") {
      val node = construct[Node]
      !node.isAncestorOf(node)
    }

    // --- Vector3 round-trip (expanded builtin marshalling) ---
    check("Node3D set/get position (Vector3)") {
      val node = construct[Node3D]
      node.setPosition(Vector3(1.5f, -2.0f, 8.25f))
      node.getPosition() == Vector3(1.5f, -2.0f, 8.25f)
    }

    // --- enum argument/return marshals as Long ---
    check("Node set/get process_mode (enum as Long)") {
      val node = construct[Node]
      node.setProcessMode(4L) // PROCESS_MODE_DISABLED
      node.getProcessMode() == 4L
    }

    // --- Transform2D argument marshals (6 floats); origin read back via position ---
    check("Node2D setTransform origin reads back (Transform2D arg)") {
      val node = construct[Node2D]
      node.setTransform(
        Transform2D(Vector2(1f, 0f), Vector2(0f, 1f), Vector2(5f, 7f))
      )
      node.getPosition() == Vector2(5f, 7f)
    }

    log(s"EngineSelfTest: $passed passed, $failed failed")
  }
}
