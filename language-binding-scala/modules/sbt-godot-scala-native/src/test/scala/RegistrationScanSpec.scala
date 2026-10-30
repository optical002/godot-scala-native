package godotscala

import scala.meta._

class RegistrationScanSpec extends munit.FunSuite {

  private def shape(code: String): String =
    RegistrationScan.shapeOf(dialects.Scala3(Input.String(code)).parse[Source].get)

  private val base =
    """package game
      |final class Player(var speed: Double = 120.0) extends Node2D {
      |  override def ready(): Unit = { println("a") }
      |  @func def score(): Int = 1
      |  def inferred = 1
      |}
      |""".stripMargin

  test("editing a body with a declared return type keeps the shape") {
    assertEquals(shape(base.replace("""println("a")""", """println("b")""")), shape(base))
    assertEquals(shape(base.replace("Int = 1", "Int = 2")), shape(base))
  }

  test("changes the macro can see change the shape") {
    val changes = Seq(
      "speed: Double = 120.0" -> "speed: Double = 99.0",       // constructor default
      "(var speed: Double = 120.0)" -> "(var speed: Double = 120.0, var hp: Int = 1)",
      "@func def score" -> "def score",                         // annotation
      "score(): Int" -> "score(): Long",                        // signature
      "def inferred = 1" -> "def inferred = \"x\""              // inferred return type
    )
    changes.foreach { case (from, to) =>
      assert(base.contains(from), from)
      assertNotEquals(shape(base.replace(from, to)), shape(base), s"$from -> $to")
    }
  }
}
