import java.io.{File, FileWriter}
import scala.io.Source

/**
 * Generates typed Scala wrappers for Godot engine classes from
 * `extension_api.json`.
 *
 * Each engine class is emitted as an `abstract class Name extends Parent`, so
 * user classes extend them with the natural Scala idiom (`class Player extends
 * Node2D`). Real Scala inheritance gives a subclass all of the base methods and
 * the virtual override points; registration derives a class's Godot parent from
 * its direct superclass. The chain roots at `Object`, which extends the binding
 * base [[io.github.optical002.godot.register.GodotScriptClass]] that carries the
 * engine-object handle and the overridable virtuals.
 *
 * Methods dispatch through `Ptrcall` using `hostObject` (the instance's engine
 * handle). Object-typed returns yield the raw `GodotObject` handle (a concrete
 * typed wrapper cannot be instantiated for an abstract class); object-typed
 * arguments accept the abstract base and pass its handle.
 *
 * Scope: a curated allowlist (closure of a few gameplay classes + the Engine
 * singleton). Lifting [[allowlist]] generates more; unmappable methods are
 * skipped, never broken-emitted.
 */
object EngineClassGenerator {

  val allowlist: Set[String] =
    Set("Object", "Node", "CanvasItem", "Node2D", "Sprite2D", "Engine",
      "RefCounted")

  val singletons: Set[String] = Set("Engine")

  def run(jsonPath: String, codeGenPath: String): Unit = {
    val src = Source.fromFile(new File(jsonPath))
    val json =
      try ujson.read(src.mkString)
      finally src.close()

    val allClasses = json("classes").arr.toVector
    val byName = allClasses.map(c => c("name").str -> c).toMap

    def chain(name: String): List[String] =
      byName.get(name) match {
        case None => Nil
        case Some(c) =>
          name :: c.obj.get("inherits").map(_.str).map(chain).getOrElse(Nil)
      }
    val toGenerate = allowlist.flatMap(chain)

    val files = toGenerate.toVector.sorted.flatMap { name =>
      generateClass(name, byName, toGenerate).map(content =>
        ScalaFile(name, content)
      )
    }
    write(files, codeGenPath)
    println(s"Generated ${files.size} engine classes into $codeGenPath")
  }

  // --- type mapping -------------------------------------------------------

  def scalaType(godotType: String, generated: Set[String]): Option[String] =
    godotType match {
      case "int"     => Some("Long")
      case "float"   => Some("Double")
      case "bool"    => Some("Boolean")
      case "String"  => Some("String")
      case "Vector2" => Some("io.github.optical002.godot.builtin.Vector2")
      case "Color"   => Some("io.github.optical002.godot.builtin.Color")
      case t if generated.contains(t) => Some(t)
      case _ => None
    }

  // --- emission -----------------------------------------------------------

  def generateClass(
    name: String,
    byName: Map[String, ujson.Value],
    generated: Set[String]
  ): Option[String] = byName.get(name).map { cls =>
    val parent = cls.obj.get("inherits").map(_.str)
    val isSingleton = singletons.contains(name)
    val isRefCounted = cls.obj.get("is_refcounted").exists(_.bool)

    // Only this class's own methods (inheritance provides the rest).
    val methods =
      cls.obj.get("methods").map(_.arr.toVector).getOrElse(Vector.empty)

    val methodDefs = methods.flatMap { m =>
      emitMethod(name, m, generated)
    }.mkString

    // The superclass clause: extend the Godot parent, or (at the root) the
    // binding's script base which carries hostObject + the virtuals.
    val extendsClause = parent match {
      case Some(p) => s"$p"
      case None    => "io.github.optical002.godot.register.GodotScriptClass"
    }

    val singletonDef =
      if (isSingleton)
        s"""
           |  /** The process-global $name singleton instance. */
           |  def singleton: $name = new $name {}
           |    .withHost(Godot.interface.global_get_singleton(
           |      StringNames.cached("$name").ptr))
           |""".stripMargin
      else ""

    s"""package io.github.optical002.godot.codegen.engine
       |
       |import io.github.optical002.godot.Godot
       |import io.github.optical002.godot.builtin.*
       |import io.github.optical002.godot.engine.*
       |import io.github.optical002.godot.engine.GodotObject.*
       |
       |/** Generated wrapper for Godot's `$name`${parent.map(p => s", extends `$p`").getOrElse("")}. */
       |abstract class $name extends $extendsClause {
       |$methodDefs
       |}
       |
       |object $name {
       |  /** Class metadata for Gd[$name] lifetime management and casting. */
       |  given GodotClass[$name] with {
       |    def className = "$name"
       |    def isRefCounted = $isRefCounted
       |    def wrap(o: GodotObject): $name = new $name {}.withHost(o.objectPtr)
       |    def unwrap(t: $name): GodotObject = t.hostObject
       |  }
       |$singletonDef}
       |""".stripMargin
  }

  /** Emit one method, or None if any arg/return type is unsupported. */
  def emitMethod(
    declClass: String,
    m: ujson.Value,
    generated: Set[String]
  ): Option[String] = {
    val mname = m("name").str
    val universal =
      Set("getClass", "toString", "hashCode", "equals", "clone", "notify",
        "notifyAll", "wait", "finalize", "synchronized")
    if (universal.contains(methodName(mname))) return None
    val isVararg = m.obj.get("is_vararg").exists(_.bool)
    val isStatic = m.obj.get("is_static").exists(_.bool)
    val isVirtual = m.obj.get("is_virtual").exists(_.bool)
    val hash = m.obj.get("hash").map(_.num.toLong)

    if (isVararg || isStatic || isVirtual || hash.isEmpty) return None

    val args = m.obj.get("arguments").map(_.arr.toVector).getOrElse(Vector.empty)
    if (args.size > 2) return None

    val retType = m.obj.get("return_value").flatMap { rv =>
      scalaType(rv("type").str, generated)
    }
    val retTypeRaw = m.obj.get("return_value").map(_("type").str)
    if (retTypeRaw.isDefined && retType.isEmpty) return None

    val scalaArgs = args.map { a =>
      val an = sanitize(a("name").str)
      scalaType(a("type").str, generated).map(t => (an, t, a("type").str))
    }
    if (scalaArgs.exists(_.isEmpty)) return None
    val mappedArgs: List[(String, String, String)] = scalaArgs.flatten.toList

    val scalaName = methodName(mname)
    val paramList = mappedArgs.map { case (n, t, _) => s"$n: $t" }.mkString(", ")

    // Object-typed args pass their engine handle; object-typed returns yield
    // the raw GodotObject (abstract classes can't be instantiated here).
    def toPtrArg(n: String, godotT: String): String =
      if (isGeneratedObject(godotT)) s"$n.hostObject" else n

    val bindExpr =
      s"""MethodBind.get("$declClass", "$mname", ${hash.get}L)"""
    val instance = "hostObject.objectPtr"

    // Object returns become GodotObject in the signature.
    val retSig =
      retTypeRaw match {
        case Some(rt) if isGeneratedObject(rt) => "GodotObject"
        case _                                 => retType.getOrElse("Unit")
      }

    val callExpr = (mappedArgs, retTypeRaw) match {
      case (Nil, None) =>
        s"Ptrcall.callVoid0($bindExpr, $instance)"
      case (Nil, Some(rt)) =>
        s"Ptrcall.call0[${callRet(rt)}]($bindExpr, $instance)"
      case (a1 :: Nil, None) =>
        s"Ptrcall.callVoid1($bindExpr, $instance, ${toPtrArg(a1._1, a1._3)})"
      case (a1 :: Nil, Some(rt)) =>
        s"Ptrcall.call1[${ptrArgType(a1)}, ${callRet(rt)}]($bindExpr, $instance, ${toPtrArg(a1._1, a1._3)})"
      case (a1 :: a2 :: Nil, None) =>
        s"Ptrcall.callVoid2($bindExpr, $instance, ${toPtrArg(a1._1, a1._3)}, ${toPtrArg(a2._1, a2._3)})"
      case (a1 :: a2 :: Nil, Some(rt)) =>
        s"Ptrcall.call2[${ptrArgType(a1)}, ${ptrArgType(a2)}, ${callRet(rt)}]($bindExpr, $instance, ${toPtrArg(a1._1, a1._3)}, ${toPtrArg(a2._1, a2._3)})"
      case _ => return None
    }

    Some(
      s"""
         |  /** ${declClass}.$mname */
         |  final def $scalaName($paramList): $retSig =
         |    $callExpr
         |""".stripMargin
    )
  }

  /** The Ptrcall return type param: object returns go through GodotObject. */
  def callRet(godotT: String): String =
    if (isGeneratedObject(godotT)) "GodotObject" else mapScalar(godotT)

  /** The Ptrcall arg type param: object args go through GodotObject. */
  def ptrArgType(arg: (String, String, String)): String =
    if (isGeneratedObject(arg._3)) "GodotObject" else arg._2

  def mapScalar(godotT: String): String = godotT match {
    case "int"     => "Long"
    case "float"   => "Double"
    case "bool"    => "Boolean"
    case "String"  => "String"
    case "Vector2" => "io.github.optical002.godot.builtin.Vector2"
    case "Color"   => "io.github.optical002.godot.builtin.Color"
    case other     => other
  }

  def isGeneratedObject(godotT: String): Boolean =
    !Set("int", "float", "bool", "String", "Vector2", "Color").contains(godotT)

  // --- naming -------------------------------------------------------------

  def methodName(s: String): String = {
    val parts = s.split("_")
    (parts.head +: parts.tail.map(_.capitalize)).mkString
  }

  def sanitize(n: String): String = {
    val reserved =
      Set("type", "val", "var", "def", "object", "class", "new", "import",
        "match", "case", "with", "for", "yield", "if", "else", "this")
    if (reserved.contains(n)) s"`$n`" else n
  }

  // --- io -----------------------------------------------------------------

  case class ScalaFile(name: String, content: String)

  def write(files: Vector[ScalaFile], path: String): Unit = {
    val dir = new File(path)
    dir.mkdirs()
    files.foreach { f =>
      val w = new FileWriter(new File(dir, s"${f.name}.scala"))
      try w.write(f.content)
      finally w.close()
    }
  }
}
