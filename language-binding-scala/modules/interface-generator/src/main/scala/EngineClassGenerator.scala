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
 * base [[gdext.register.GodotScriptClass]] that carries the
 * engine-object handle and the overridable virtuals.
 *
 * Methods dispatch through the inline `Ptrcall` dispatchers with a method bind
 * cached in a companion field, so a call allocates nothing. Object-typed
 * returns yield the typed wrapper (via `Wrappers`, one wrapper per engine
 * object); `Ref<T>` returns (classes under `RefCounted`) are owned by the
 * caller. Static methods live in the companion. `ClassFactory` maps a class
 * name to a fresh wrapper. Unmappable methods are skipped, never
 * broken-emitted.
 */
object EngineClassGenerator {
  def run(jsonPath: String, codeGenPath: String): Unit = {
    val src = Source.fromFile(new File(jsonPath))
    val json =
      try ujson.read(src.mkString)
      finally src.close()

    val allClasses = json("classes").arr.toVector
    val byName = allClasses.map(c => c("name").str -> c).toMap

    val singletonLookup = json.obj
      .get("singletons")
      .map(_.arr.toVector)
      .getOrElse(Vector.empty)
      .map(s => s("type").str -> s("name").str)
      .toMap

    val toGenerate: Set[String] = byName.keySet
    val refCounted = refCountedClasses(byName)

    val files = toGenerate.toVector.sorted.flatMap { name =>
      generateClass(name, byName, toGenerate, refCounted, singletonLookup).map(
        content => ScalaFile(name, content)
      )
    } :+ ScalaFile("ClassFactory", generateFactory(toGenerate.toVector.sorted))
    write(files, codeGenPath)
    println(s"Generated ${files.size} engine classes into $codeGenPath")
  }

  private val bp = "gdext.builtin"

  /** Godot builtin/scalar type -> Scala type. The keys are exactly the value
    * types the marshalling layer (`Ptrcall` PtrArg/PtrRet) knows how to pass. */
  val builtinScalar: Map[String, String] = Map(
    "int"         -> "Long",
    "float"       -> "Double",
    "bool"        -> "Boolean",
    "String"      -> "String",
    "StringName"  -> s"$bp.StringName",
    "Vector2"     -> s"$bp.Vector2",
    "Vector2i"    -> s"$bp.Vector2i",
    "Vector3"     -> s"$bp.Vector3",
    "Vector3i"    -> s"$bp.Vector3i",
    "Vector4"     -> s"$bp.Vector4",
    "Vector4i"    -> s"$bp.Vector4i",
    "Color"       -> s"$bp.Color",
    "Rect2"       -> s"$bp.Rect2",
    "Rect2i"      -> s"$bp.Rect2i",
    "Quaternion"  -> s"$bp.Quaternion",
    "Plane"       -> s"$bp.Plane",
    "AABB"        -> s"$bp.AABB",
    "Basis"       -> s"$bp.Basis",
    "Transform2D" -> s"$bp.Transform2D",
    "Transform3D" -> s"$bp.Transform3D",
    "Projection"  -> s"$bp.Projection"
  )

  /** Enums and bitfields cross the ptrcall boundary as int64. */
  def isEnumLike(t: String): Boolean =
    t.startsWith("enum::") || t.startsWith("bitfield::")

  def scalaType(godotType: String, generated: Set[String]): Option[String] =
    if (builtinScalar.contains(godotType)) Some(builtinScalar(godotType))
    else if (isEnumLike(godotType)) Some("Long")
    else if (generated.contains(godotType)) Some(godotType)
    else None

  /** Classes at or below `RefCounted`: their returns are `Ref<T>` (owned). */
  def refCountedClasses(byName: Map[String, ujson.Value]): Set[String] = {
    def isRc(n: String): Boolean =
      n == "RefCounted" ||
        byName.get(n).flatMap(_.obj.get("inherits")).map(_.str).exists(isRc)
    byName.keySet.filter(isRc)
  }

  // --- emission -----------------------------------------------------------

  /** One emitted method: its source, its bind-field name, whether static. */
  case class Emitted(source: String, bindVar: String, isStatic: Boolean)

  def generateClass(
    name: String,
    byName: Map[String, ujson.Value],
    generated: Set[String],
    refCounted: Set[String],
    singletonLookup: Map[String, String],
  ): Option[String] = byName.get(name).map { cls =>
    val parent = cls.obj.get("inherits").map(_.str)
    val isSingleton = singletonLookup.contains(name)

    // Only this class's own methods (inheritance provides the rest).
    val methods =
      cls.obj.get("methods").map(_.arr.toVector).getOrElse(Vector.empty)

    val emitted = methods.flatMap(m => emitMethod(name, m, generated, refCounted))
    val methodDefs = emitted.filterNot(_.isStatic).map(_.source).mkString
    val staticDefs = emitted.filter(_.isStatic).map(_.source).mkString

    // One cached MethodBind per emitted method, resolved on first call.
    val bindVars = emitted.map { e =>
      s"  private[classes] var ${e.bindVar}: GDExtensionMethodBindPtr = null\n"
    }.mkString

    // The superclass clause: extend the Godot parent, or (at the root) the
    // binding's script base which carries hostObject + the virtuals.
    val extendsClause = parent match {
      case Some(p) => s"$p"
      case None    => "gdext.internal.register.GodotScriptClass"
    }

    val singletonDef =
      if (isSingleton) {
        val lookup = singletonLookup(name)
        s"""
           |  private var instance: $name = null
           |
           |  /** The process-global $name singleton instance. */
           |  def singleton: $name = {
           |    if (instance == null)
           |      instance = Wrappers.borrowed[$name](GodotObject.fromPtr(
           |        Godot.interface.global_get_singleton(StringNames.cached("$lookup").ptr)))
           |    instance
           |  }
           |""".stripMargin
      } else ""

    val companionDef =
      if (singletonDef.nonEmpty || bindVars.nonEmpty) s"""
         |object $name {
         |$bindVars$singletonDef$staticDefs}
         |""".stripMargin
      else ""

    s"""package gdext.classes
       |
       |import gdext.Godot
       |import gdext.builtin.*
       |import gdext.internal.engine.*
       |import gdext.internal.engine.GodotObject.*
       |import gdext.internal.ffi.types.GDExtensionMethodBindPtr
       |
       |/** Generated wrapper for Godot's `$name`${parent.map(p => s", extends `$p`").getOrElse("")}. */
       |abstract class $name extends $extendsClause {
       |  override def godotClassName: String = "$name"
       |$methodDefs
       |}
       |$companionDef""".stripMargin
  }

  /**
   * The wrapper factory: Godot class name -> a fresh wrapper of that class.
   * `Wrappers` uses it the first time it sees an engine object, so every
   * wrapper is of the object's most-derived generated class.
   */
  def generateFactory(names: Vector[String]): String = {
    val cases = names.map(n => s"""    case "$n" => new $n {}""").mkString("\n")
    s"""package gdext.classes
       |
       |import gdext.internal.register.GodotScriptClass
       |
       |/** Generated: a wrapper of the named engine class, or null if unknown. */
       |private[gdext] object ClassFactory {
       |  def create(className: String): GodotScriptClass = className match {
       |$cases
       |    case _ => null
       |  }
       |}
       |""".stripMargin
  }

  /** Emit one method, or None if any arg/return type is unsupported. */
  def emitMethod(
    declClass: String,
    m: ujson.Value,
    generated: Set[String],
    refCounted: Set[String]
  ): Option[Emitted] = {
    val mname = m("name").str
    val universal =
      Set("getClass", "toString", "hashCode", "equals", "clone", "notify",
        "notifyAll", "wait", "finalize", "synchronized")
    if (universal.contains(methodName(mname))) return None
    val isVararg = m.obj.get("is_vararg").exists(_.bool)
    val isStatic = m.obj.get("is_static").exists(_.bool)
    val isVirtual = m.obj.get("is_virtual").exists(_.bool)
    val hash = m.obj.get("hash").map(_.num.toLong)

    if (isVararg || isVirtual || hash.isEmpty) return None

    val args = m.obj.get("arguments").map(_.arr.toVector).getOrElse(Vector.empty)
    if (args.size > 6) return None // Ptrcall has fixed-arity dispatchers up to 6

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

    val scalaName = sanitize(methodName(mname))
    val paramList = mappedArgs.map { case (n, t, _) => s"$n: $t" }.mkString(", ")

    // Object-typed args pass their engine handle (null passes a null handle).
    def toPtrArg(n: String, godotT: String): String =
      if (isGeneratedObject(godotT)) s"Wrappers.handle($n)" else n

    val bindVar = s"mb_$mname"
    val bindExpr = s"gdext.classes.$declClass.$bindVar"
    val bindInit =
      s"""if ($bindExpr == null) $bindExpr = MethodBind.get("$declClass", "$mname", ${hash.get}L)"""
    // A wrapper whose engine object was freed throws instead of crashing.
    val instance =
      if (isStatic) "null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr]"
      else "livePtr"

    val retSig = retType.getOrElse("Unit")

    val n        = mappedArgs.size
    val argExprs = mappedArgs.map(a => toPtrArg(a._1, a._3))
    val argTail  = if (argExprs.isEmpty) "" else ", " + argExprs.mkString(", ")
    val callExpr = retTypeRaw match {
      case None =>
        s"Ptrcall.callVoid$n($bindExpr, $instance$argTail)"
      case Some(rt) =>
        val typeParams = (mappedArgs.map(ptrArgType) :+ callRet(rt)).mkString(", ")
        s"Ptrcall.call$n[$typeParams]($bindExpr, $instance$argTail)"
    }

    // Object returns become the typed wrapper. A `Ref<T>` return carries a
    // reference the caller now owns; a plain `Object*` return is borrowed.
    val bodyExpr = retTypeRaw match {
      case Some(rt) if isGeneratedObject(rt) && refCounted.contains(rt) =>
        s"Wrappers.owned[$rt]($callExpr)"
      case Some(rt) if isGeneratedObject(rt) =>
        s"Wrappers.borrowed[$rt]($callExpr)"
      case _ => callExpr
    }

    val doc = retTypeRaw match {
      case Some(rt) if isGeneratedObject(rt) && refCounted.contains(rt) =>
        s"${declClass}.$mname. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`."
      case _ => s"${declClass}.$mname"
    }

    Some(
      Emitted(
        s"""
           |  /** $doc */
           |  final def $scalaName($paramList): $retSig = {
           |    $bindInit
           |    $bodyExpr
           |  }
           |""".stripMargin,
        bindVar,
        isStatic
      )
    )
  }

  /**
   * The Ptrcall return type param. Object returns are read as the pointer's
   * address (`Long`), which `Wrappers` resolves without boxing a `Ptr`.
   */
  def callRet(godotT: String): String =
    if (isGeneratedObject(godotT)) "Long" else mapScalar(godotT)

  /** The Ptrcall arg type param: object args go through GodotObject. */
  def ptrArgType(arg: (String, String, String)): String =
    if (isGeneratedObject(arg._3)) "GodotObject" else arg._2

  def mapScalar(godotT: String): String =
    if (builtinScalar.contains(godotT)) builtinScalar(godotT)
    else if (isEnumLike(godotT)) "Long"
    else godotT

  /** A type passed as an engine object handle (vs. a by-value scalar/builtin). */
  def isGeneratedObject(godotT: String): Boolean =
    !builtinScalar.contains(godotT) && !isEnumLike(godotT)

  // --- naming -------------------------------------------------------------

  def methodName(s: String): String = {
    val parts = s.split("_")
    (parts.head +: parts.tail.map(_.capitalize)).mkString
  }

  /** Scala 3 hard keywords — illegal as plain identifiers, so backtick them. */
  private val reserved: Set[String] =
    Set("abstract", "case", "catch", "class", "def", "do", "else", "enum",
      "export", "extends", "false", "final", "finally", "for", "given", "if",
      "implicit", "import", "lazy", "match", "new", "null", "object",
      "override", "package", "private", "protected", "return", "sealed",
      "super", "then", "throw", "trait", "true", "try", "type", "val", "var",
      "while", "with", "yield", "this")

  def sanitize(n: String): String =
    if (reserved.contains(n)) s"`$n`" else n

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
