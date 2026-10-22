package godotscala

class EngineClassScanSpec extends munit.FunSuite {

  // Object <- Node <- CanvasItem <- Node2D <- Sprite2D ; Object <- RefCounted <- Resource <- Texture <- Texture2D
  private val graph = EngineClassScan.parse(
    Seq(
      "Object\t-\t",
      "Node\tObject\tSceneTree",
      "SceneTree\tObject\tWindow",
      "Window\tNode\t",
      "CanvasItem\tNode\t",
      "Node2D\tCanvasItem\t",
      "Sprite2D\tNode2D\tTexture2D",
      "RefCounted\tObject\t",
      "Resource\tRefCounted\t",
      "Texture\tResource\t",
      "Texture2D\tTexture\t",
      "Unused\tNode\t"
    ),
    Seq("RefCounted")
  )

  test("closure: named classes, their ancestors, and classes their methods return") {
    val c = EngineClassScan.closure(graph, Set("Sprite2D")).toSet
    assert(Set("Sprite2D", "Node2D", "CanvasItem", "Node", "Object").subsetOf(c)) // ancestors
    assert(Set("Texture2D", "Texture", "Resource").subsetOf(c))                   // Sprite2D returns Texture2D
    assert(Set("SceneTree", "Window").subsetOf(c))                                // Node returns SceneTree -> Window
    assert(c.contains("RefCounted"))                                              // core
    assert(!c.contains("Unused"))
  }

  test("closure always contains Object, even from an empty seed") {
    assertEquals(EngineClassScan.closure(graph, Set.empty).toSet, Set("Object", "RefCounted"))
  }

  test("namesIn finds engine class names only") {
    val src = "val s: Sprite2D = x.cast[Sprite2D]; n match { case w: Window => }; val Player = 1"
    assertEquals(EngineClassScan.namesIn(src, graph), Set("Sprite2D", "Window"))
  }

  test("rendered factory covers exactly the given classes") {
    val out = EngineClassScan.renderFactory(Seq("Node", "Object"))
    assert(out.contains("""case "Node" => new gdext.classes.Node {}"""))
    assert(out.contains("""case "Object" => new gdext.classes.Object {}"""))
    assert(out.contains("case _ => null"))
  }
}
