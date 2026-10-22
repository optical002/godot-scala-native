package godotscala

import java.io.File

/**
 * Picks the engine classes a game links (engine-class trimming).
 *
 * Every engine object Scala sees gets a wrapper of the object's lowest ancestor
 * class the wrapper factory knows. Linking all ~1000 generated engine classes
 * into that factory costs ~40% of the program's classes and about a third of
 * native link time. Instead the factory knows only the classes the game can
 * observe:
 *
 *  - every engine class named anywhere in the game's and godot-libraries'
 *    sources (types, patterns, `cast[X]`, ...) and in the binding's own
 *    hand-written code (`engine-core.txt`);
 *  - their ancestors;
 *  - transitively, every class their methods return (`engine-graph.txt`), so a
 *    value whose type is inferred from a method call is covered too.
 *
 * Any cast the program makes targets one of these classes, and the lowest
 * registered ancestor of an object is a subclass of every registered ancestor,
 * so the wrapper satisfies them all.
 */
object EngineClassScan {

  val GraphResource = "gdext/engine-graph.txt"
  val CoreResource  = "gdext/engine-core.txt"

  final case class Graph(
    parent: Map[String, String],
    returns: Map[String, Seq[String]],
    core: Set[String]
  ) {
    def names: Set[String] = parent.keySet
  }

  /** The graph shipped in the binding jar, or None for a binding without it. */
  def graphFromClasspath(classpath: Seq[File]): Option[Graph] = {
    val loader =
      new java.net.URLClassLoader(classpath.map(_.toURI.toURL).toArray, null)
    def lines(res: String): Option[Seq[String]] =
      Option(loader.getResourceAsStream(res)).map { is =>
        try scala.io.Source.fromInputStream(is, "UTF-8").getLines().toVector
        finally is.close()
      }
    try
      for {
        graphLines <- lines(GraphResource)
        coreLines  <- lines(CoreResource)
      } yield parse(graphLines, coreLines)
    finally loader.close()
  }

  def parse(graphLines: Seq[String], coreLines: Seq[String]): Graph = {
    val rows = graphLines.map(_.split('\t')).filter(_.length >= 2)
    Graph(
      parent = rows.map(r => r(0) -> r(1)).toMap,
      returns = rows.map { r =>
        r(0) -> (if (r.length > 2) r(2).split(',').toSeq.filter(_.nonEmpty) else Seq.empty)
      }.toMap,
      core = coreLines.map(_.trim).filter(_.nonEmpty).toSet
    )
  }

  private val Identifier = """\b[A-Z]\w*\b""".r

  /** Capitalized identifiers by source content (the scan re-runs on every
    * compile; only changed files are re-tokenized). Bounded: cleared when it
    * outgrows a few times a large project. */
  private val identifierCache =
    new java.util.concurrent.ConcurrentHashMap[String, Set[String]]()

  /** Engine class names a source mentions (comments included: harmless). */
  def namesIn(content: String, graph: Graph): Set[String] = {
    var ids = identifierCache.get(content)
    if (ids == null) {
      if (identifierCache.size > 20000) identifierCache.clear()
      ids = Identifier.findAllIn(content).toSet
      identifierCache.put(content, ids)
    }
    ids.filter(graph.parent.contains)
  }

  /** The classes the factory must know, sorted. */
  def closure(graph: Graph, seed: Set[String]): Seq[String] = {
    val seen  = scala.collection.mutable.Set.empty[String]
    var todo  = (seed ++ graph.core + "Object").toList
    while (todo.nonEmpty) {
      val c = todo.head
      todo = todo.tail
      if (graph.parent.contains(c) && seen.add(c)) {
        graph.parent.get(c).filter(_ != "-").foreach(p => todo = p :: todo)
        todo = graph.returns.getOrElse(c, Nil).toList ++ todo
      }
    }
    seen.toVector.sorted
  }

  /** Source of `game.GeneratedEngineClasses`: the factory over `classes`. */
  def renderFactory(classes: Seq[String]): String = {
    val cases = classes
      .map(n => s"""    case "$n" => new gdext.classes.$n {}""")
      .mkString("\n")
    s"""/** The engine classes this game can observe (${classes.size}); see
       | * EngineClassScan in sbt-godot-scala-native. */
       |object GeneratedEngineClasses {
       |  def create(name: String): gdext.classes.Object = name match {
       |$cases
       |    case _ => null
       |  }
       |}
       |""".stripMargin
  }
}
