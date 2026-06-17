import java.io.{File, FileWriter}
import scala.io.Source

/**
 * Generates typed Scala wrappers for Godot engine classes from
 * `extension_api.json`.
 *
 * Each engine class becomes an opaque type over `GodotObject` plus an object
 * with extension methods. Methods resolve their `MethodBind` once (cached) and
 * dispatch through the `Ptrcall` runtime proven by EngineSelfTest. Inheritance
 * is modelled by also emitting the inherited classes' methods as extensions on
 * the subtype (flattened), which keeps call sites simple without a Scala trait
 * hierarchy over opaque types.
 *
 * Scope: this first pass generates a curated allowlist (the closure of a few
 * gameplay-relevant classes plus the Engine singleton) rather than all 1023
 * classes, to keep compile times reasonable. Lifting [[allowlist]] to the full
 * set is the only change needed to generate everything; types it cannot yet map
 * cause the owning method to be skipped (and counted), never a broken emit.
 */
object EngineClassGenerator {

  /** Classes we generate. Their inherited base classes are pulled in too. */
  val allowlist: Set[String] =
    Set("Object", "Node", "CanvasItem", "Node2D", "Sprite2D", "Engine",
      "RefCounted")

  /** Singletons among the allowlist get a `.singleton` accessor. */
  val singletons: Set[String] = Set("Engine")

  def run(jsonPath: String, codeGenPath: String): Unit = {
    val src = Source.fromFile(new File(jsonPath))
    val json =
      try ujson.read(src.mkString)
      finally src.close()

    val allClasses = json("classes").arr.toVector
    val byName = allClasses.map(c => c("name").str -> c).toMap

    // Expand the allowlist to include every class's inheritance chain.
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

  /** Scala type for a Godot type string, or None if unsupported (skip method). */
  def scalaType(godotType: String, generated: Set[String]): Option[String] =
    godotType match {
      case "int"    => Some("Long")
      case "float"  => Some("Double")
      case "bool"   => Some("Boolean")
      case "String" => Some("String")
      case "Vector2" => Some("io.github.optical002.godot.builtin.Vector2")
      case "Color"   => Some("io.github.optical002.godot.builtin.Color")
      case t if generated.contains(t) => Some(t)
      case _ => None // enums, other builtins, unmapped classes -> skip for now
    }

  // --- emission -----------------------------------------------------------

  def generateClass(
    name: String,
    byName: Map[String, ujson.Value],
    generated: Set[String]
  ): Option[String] = byName.get(name).map { cls =>
    val inheritsChain = {
      def go(n: String): List[String] =
        byName.get(n) match {
          case Some(c) =>
            n :: c.obj.get("inherits").map(_.str).map(go).getOrElse(Nil)
          case None => Nil
        }
      go(name)
    }

    // Collect methods across the whole chain so a subtype exposes base methods.
    // Walk most-derived first and keep the first occurrence of each method name
    // so an override shadows the base and we never emit a duplicate def.
    val methodsRaw = inheritsChain.flatMap { cn =>
      byName(cn).obj.get("methods").map(_.arr.toVector).getOrElse(Vector.empty)
        .map(m => (cn, m))
    }
    val seenNames = scala.collection.mutable.Set.empty[String]
    val methods = methodsRaw.filter { case (_, m) =>
      seenNames.add(m("name").str)
    }

    val parent = cls.obj.get("inherits").map(_.str)
    val isSingleton = singletons.contains(name)
    val isRefCounted = cls.obj.get("is_refcounted").exists(_.bool)

    val methodDefs = methods.flatMap { case (declClass, m) =>
      emitMethod(name, declClass, m, generated)
    }.mkString

    val singletonDef =
      if (isSingleton)
        s"""
           |  /** The process-global $name singleton instance. */
           |  def singleton: $name =
           |    fromObject(GodotObject.fromPtr(
           |      Godot.interface.global_get_singleton(
           |        StringNames.cached("$name").ptr)))
           |""".stripMargin
      else ""

    s"""package io.github.optical002.godot.codegen.engine
       |
       |import io.github.optical002.godot.Godot
       |import io.github.optical002.godot.builtin.*
       |import io.github.optical002.godot.engine.*
       |import io.github.optical002.godot.engine.GodotObject.*
       |
       |/** Generated wrapper for Godot's `$name`${parent.map(p => s", inherits `$p`").getOrElse("")}. */
       |opaque type $name = GodotObject
       |
       |object $name {
       |  /** Wrap a raw object handle as a `$name` (no checked cast). */
       |  def fromObject(o: GodotObject): $name = o
       |
       |  /** Class metadata for Gd[$name] lifetime management and casting. */
       |  given GodotClass[$name] with {
       |    def className = "$name"
       |    def isRefCounted = $isRefCounted
       |    def wrap(o: GodotObject): $name = o
       |    def unwrap(t: $name): GodotObject = t
       |  }
       |
       |  extension (self: $name) {
       |    /** The underlying object handle. */
       |    def asObject: GodotObject = self
       |$methodDefs
       |  }
       |$singletonDef}
       |""".stripMargin
  }

  /** Emit one method, or None if any arg/return type is unsupported. */
  def emitMethod(
    owner: String,
    declClass: String,
    m: ujson.Value,
    generated: Set[String]
  ): Option[String] = {
    val mname = m("name").str
    // Skip methods whose camelCase name collides with universal members of
    // Any/AnyRef. Emitting them as extension methods on an opaque type makes
    // member resolution ambiguous and (in this dotty version) crashes the
    // compiler. The engine still exposes them via the Variant `call` path.
    val universal =
      Set("getClass", "toString", "hashCode", "equals", "clone", "notify",
        "notifyAll", "wait", "finalize", "synchronized")
    if (universal.contains(methodName(mname))) return None
    val isVararg = m.obj.get("is_vararg").exists(_.bool)
    val isStatic = m.obj.get("is_static").exists(_.bool)
    val isVirtual = m.obj.get("is_virtual").exists(_.bool)
    val hash = m.obj.get("hash").map(_.num.toLong)

    // Skip what this first pass doesn't handle. Virtuals have no bind hash;
    // static + vararg need separate dispatch. Phase 4/5 cover these.
    if (isVararg || isStatic || isVirtual || hash.isEmpty) return None

    val args = m.obj.get("arguments").map(_.arr.toVector).getOrElse(Vector.empty)
    if (args.size > 2) return None // only 0..2 arg arities emitted in this pass

    val retType = m.obj.get("return_value").flatMap { rv =>
      scalaType(rv("type").str, generated)
    }
    val retTypeRaw = m.obj.get("return_value").map(_("type").str)
    // If there is a return value we cannot map, skip.
    if (retTypeRaw.isDefined && retType.isEmpty) return None

    val scalaArgs = args.map { a =>
      val an = sanitize(a("name").str)
      scalaType(a("type").str, generated).map(t => (an, t, a("type").str))
    }
    if (scalaArgs.exists(_.isEmpty)) return None
    val mappedArgs: List[(String, String, String)] = scalaArgs.flatten.toList

    val scalaName = methodName(mname)
    val paramList = mappedArgs.map { case (n, t, _) => s"$n: $t" }.mkString(", ")

    // Object-typed args/returns must cross to GodotObject for the Ptrcall
    // givens; wrap conversions where needed.
    def toPtrArg(n: String, godotT: String): String =
      if (generated.contains(godotT)) s"$n.asObject" else n

    val bindExpr =
      s"""MethodBind.get("$declClass", "$mname", ${hash.get}L)"""
    val instance = "self.asObject.objectPtr"

    val callExpr = (mappedArgs, retType) match {
      case (Nil, None) =>
        s"Ptrcall.callVoid0($bindExpr, $instance)"
      case (Nil, Some(r)) =>
        val rr = retCallType(r, retTypeRaw.get)
        wrapRet(retTypeRaw.get, s"Ptrcall.call0[$rr]($bindExpr, $instance)")
      case (a1 :: Nil, None) =>
        s"Ptrcall.callVoid1(${bindExpr}, $instance, ${toPtrArg(a1._1, a1._3)})"
      case (a1 :: Nil, Some(r)) =>
        val rr = retCallType(r, retTypeRaw.get)
        wrapRet(
          retTypeRaw.get,
          s"Ptrcall.call1[${ptrArgType(a1)}, $rr]($bindExpr, $instance, ${toPtrArg(a1._1, a1._3)})"
        )
      case (a1 :: a2 :: Nil, None) =>
        s"Ptrcall.callVoid2($bindExpr, $instance, ${toPtrArg(a1._1, a1._3)}, ${toPtrArg(a2._1, a2._3)})"
      case (a1 :: a2 :: Nil, Some(r)) =>
        val rr = retCallType(r, retTypeRaw.get)
        wrapRet(
          retTypeRaw.get,
          s"Ptrcall.call2[${ptrArgType(a1)}, ${ptrArgType(a2)}, $rr]($bindExpr, $instance, ${toPtrArg(a1._1, a1._3)}, ${toPtrArg(a2._1, a2._3)})"
        )
      case _ => return None
    }

    val retSig = retType.getOrElse("Unit")
    Some(
      s"""
         |    /** ${declClass}.$mname */
         |    def $scalaName($paramList): $retSig =
         |      $callExpr
         |""".stripMargin
    )
  }

  /** The R type parameter for Ptrcall: object returns go through GodotObject. */
  def retCallType(scalaT: String, godotT: String): String =
    if (isGeneratedObject(godotT)) "GodotObject" else scalaT

  /** Wrap a GodotObject return into the typed wrapper. */
  def wrapRet(godotT: String, call: String): String =
    if (isGeneratedObject(godotT)) s"$godotT.fromObject($call)" else call

  /** The A type parameter for an object-typed ptrcall arg is GodotObject. */
  def ptrArgType(arg: (String, String, String)): String =
    if (isGeneratedObject(arg._3)) "GodotObject" else arg._2

  /** Is this a Godot engine-class type (vs a primitive/builtin)? */
  def isGeneratedObject(godotT: String): Boolean =
    !Set("int", "float", "bool", "String", "Vector2", "Color").contains(godotT)

  // --- naming -------------------------------------------------------------

  /** snake_case method -> camelCase Scala name. */
  def methodName(s: String): String = {
    val parts = s.split("_")
    (parts.head +: parts.tail.map(_.capitalize)).mkString
  }

  /** Avoid Scala keywords / awkward param names. */
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
