package gdext.builtin

import gdext.codegen.gdextensioninterface.types.GDExtensionVariantType.*

/**
 * Self-test exercised from the SCENE initialize callback. Round-trips values
 * through Variant and reports PASS/FAIL lines via the supplied logger.
 *
 * This runs against the live engine, so it is the real proof that the Variant
 * marshalling (constructor cache, buffer sizes, type-pointer layout) is correct
 * — something no amount of `sbt compile` can establish.
 */
object BuiltinSelfTest {
  def run(log: String => Unit): Unit = {
    var passed = 0
    var failed = 0

    def check(name: String)(cond: => Boolean): Unit =
      try
        if (cond) { passed += 1; log(s"PASS $name") }
        else { failed += 1; log(s"FAIL $name") }
      catch {
        case e: Throwable => failed += 1; log(s"FAIL $name (threw $e)")
      }

    // --- primitive round-trips through Variant ---
    check("Int round-trip") {
      Variant.scope(42)(_.to[Int] == 42)
    }
    check("Long round-trip") {
      Variant.scope(9000000000L)(_.to[Long] == 9000000000L)
    }
    check("Boolean true round-trip") {
      Variant.scope(true)(_.to[Boolean])
    }
    check("Boolean false round-trip") {
      Variant.scope(false)(v => !v.to[Boolean])
    }
    check("Double round-trip") {
      Variant.scope(3.14159)(v => math.abs(v.to[Double] - 3.14159) < 1e-9)
    }
    check("Float round-trip") {
      Variant.scope(2.5f)(_.to[Float] == 2.5f)
    }

    // --- GString round-trips ---
    check("GString ASCII round-trip") {
      GString.scope("hello godot")(_.toScala == "hello godot")
    }
    check("GString UTF-8 round-trip") {
      GString.scope("héllo · 世界 · 🎮")(_.toScala == "héllo · 世界 · 🎮")
    }
    check("GString empty round-trip") {
      GString.scope("")(_.toScala == "")
    }

    // --- math builtins round-trip through Variant ---
    check("Vector2 round-trip") {
      Variant.scope(Vector2(1.5f, -2.25f))(_.to[Vector2] == Vector2(1.5f, -2.25f))
    }
    check("Vector2 variant type tag") {
      Variant.scope(Vector2(0f, 0f))(_.variantType == GDEXTENSION_VARIANT_TYPE_VECTOR2)
    }
    check("Color round-trip") {
      val c = Color(0.1f, 0.2f, 0.3f, 0.4f)
      Variant.scope(c)(_.to[Color] == c)
    }

    // --- StringName caching returns a stable handle ---
    check("StringName cache identity") {
      StringNames.cached("Player").ptr == StringNames.cached("Player").ptr
    }
    check("StringName distinct names differ") {
      StringNames.cached("Foo").ptr != StringNames.cached("Bar").ptr
    }

    // --- Array operations ---
    check("Array starts empty") {
      GArray.scope(_.size == 0)
    }
    check("Array pushBack grows size") {
      GArray.scope { a =>
        a.pushBack(10)
        a.pushBack(20)
        a.pushBack(30)
        a.size == 3
      }
    }
    check("Array get round-trips ints") {
      GArray.scope { a =>
        a.pushBack(7)
        a.pushBack(8)
        a.get[Int](0) == 7 && a.get[Int](1) == 8
      }
    }
    check("Array holds mixed-typed values") {
      GArray.scope { a =>
        a.pushBack(99)
        a.pushBack(2.5)
        a.get[Int](0) == 99 && math.abs(a.get[Double](1) - 2.5) < 1e-9
      }
    }

    // --- Dictionary operations ---
    check("Dictionary starts empty") {
      Dictionary.scope(_.size == 0)
    }
    check("Dictionary put then get (int->int)") {
      Dictionary.scope { d =>
        d.put(1, 100)
        d.put(2, 200)
        d.size == 2 && d.get[Int, Int](1) == 100 && d.get[Int, Int](2) == 200
      }
    }
    check("Dictionary overwrite key") {
      Dictionary.scope { d =>
        d.put(5, 50)
        d.put(5, 99)
        d.size == 1 && d.get[Int, Int](5) == 99
      }
    }

    // --- variant type tags are reported correctly ---
    check("Int variant type tag") {
      Variant.scope(7)(_.variantType == GDEXTENSION_VARIANT_TYPE_INT)
    }
    check("Bool variant type tag") {
      Variant.scope(true)(_.variantType == GDEXTENSION_VARIANT_TYPE_BOOL)
    }
    check("Float variant type tag") {
      Variant.scope(1.0)(_.variantType == GDEXTENSION_VARIANT_TYPE_FLOAT)
    }

    log(s"BuiltinSelfTest: $passed passed, $failed failed")
  }
}
