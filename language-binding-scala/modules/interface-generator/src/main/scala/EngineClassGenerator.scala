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

    val files = toGenerate.toVector.sorted.flatMap { name =>
      generateClass(name, byName, toGenerate, singletonLookup).map(content =>
        ScalaFile(name, content)
      )
    }
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

  /** Per-method typed-return overrides, keyed by `(declaringClass, godotMethod)`.
    *
    * Object-typed returns default to the raw `GodotObject` handle (see the file
    * header) because a wrapper can't be instantiated for an abstract class in
    * general. But a handful of methods have a single, stable concrete return
    * type that callers always re-wrap by hand — `Node.get_tree` always yields a
    * `SceneTree`. For those we emit the typed wrapper directly (via the
    * macro-derived `ClassMeta`), so call sites need no `Gd.wrap`.
    *
    * The value must be a generated engine class (it is wrapped through
    * `ClassMeta.fromHandle`); a null handle wraps to a null `T`. */
  val returnOverrides: Map[(String, String), String] = Map(
    ("Node", "get_tree") -> "SceneTree"
  )

  /** Enums and bitfields cross the ptrcall boundary as int64. */
  def isEnumLike(t: String): Boolean =
    t.startsWith("enum::") || t.startsWith("bitfield::")

  def scalaType(godotType: String, generated: Set[String]): Option[String] =
    if (builtinScalar.contains(godotType)) Some(builtinScalar(godotType))
    else if (isEnumLike(godotType)) Some("Long")
    else if (generated.contains(godotType)) Some(godotType)
    else None

  // --- emission -----------------------------------------------------------

  def generateClass(
    name: String,
    byName: Map[String, ujson.Value],
    generated: Set[String],
    singletonLookup: Map[String, String],
  ): Option[String] = byName.get(name).map { cls =>
    val parent = cls.obj.get("inherits").map(_.str)
    val isSingleton = singletonLookup.contains(name)

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
      case None    => "gdext.internal.register.GodotScriptClass"
    }

    val singletonDef =
      if (isSingleton) {
        val lookup = singletonLookup(name)
        s"""
           |  /** The process-global $name singleton instance. */
           |  def singleton: $name = new $name {}
           |    .withHost(Godot.interface.global_get_singleton(
           |      StringNames.cached("$lookup").ptr))
           |""".stripMargin
      } else ""

    // The class name is baked into an override so it survives DCE without any
    // typeclass; the macro-derived `ClassMeta[$name]` covers wrap/cast/construct,
    // and `isRefCounted` is now a runtime `isInstanceOf[RefCounted]` check, so no
    // per-class given is emitted. A companion object is emitted only when there is
    // a singleton accessor to hold.
    val companionDef =
      if (singletonDef.nonEmpty) s"""
         |object $name {$singletonDef}
         |""".stripMargin
      else ""

    s"""package gdext.classes
       |
       |import gdext.Godot
       |import gdext.builtin.*
       |import gdext.internal.engine.*
       |import gdext.internal.engine.GodotObject.*
       |
       |/** Generated wrapper for Godot's `$name`${parent.map(p => s", extends `$p`").getOrElse("")}. */
       |abstract class $name extends $extendsClause {
       |  override def godotClassName: String = "$name"
       |$methodDefs
       |}
       |$companionDef""".stripMargin
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

    // Object-typed args pass their engine handle; object-typed returns yield
    // the raw GodotObject (abstract classes can't be instantiated here).
    def toPtrArg(n: String, godotT: String): String =
      if (isGeneratedObject(godotT)) s"$n.hostObject" else n

    val bindExpr =
      s"""MethodBind.get("$declClass", "$mname", ${hash.get}L)"""
    val instance = "hostObject.objectPtr"

    // A curated typed-return override wins over the raw-handle default, but only
    // when the raw return is actually a generated object (so it has a handle to
    // wrap and a derivable `ClassMeta`).
    val overrideType =
      returnOverrides.get((declClass, mname)).filter(_ =>
        retTypeRaw.exists(isGeneratedObject))

    // Object returns become GodotObject in the signature, unless overridden to a
    // concrete wrapper type.
    val retSig =
      overrideType.getOrElse(
        retTypeRaw match {
          case Some(rt) if isGeneratedObject(rt) => "GodotObject"
          case _                                 => retType.getOrElse("Unit")
        }
      )

    // Build the dispatch call uniformly for arity 0..6. Void calls let arg types
    // infer; value-returning calls pass explicit [argTypes..., R] type params.
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

    // For a typed-return override, wrap the raw `GodotObject` handle into the
    // concrete wrapper via the macro-derived `ClassMeta` (null handle -> null T).
    val bodyExpr = overrideType match {
      case Some(t) =>
        s"summon[gdext.internal.engine.ClassMeta[$t]].fromHandle(($callExpr).objectPtr)"
      case None => callExpr
    }

    Some(
      s"""
         |  /** ${declClass}.$mname */
         |  final def $scalaName($paramList): $retSig =
         |    $bodyExpr
         |""".stripMargin
    )
  }

  /** The Ptrcall return type param: object returns go through GodotObject. */
  def callRet(godotT: String): String =
    if (isGeneratedObject(godotT)) "GodotObject" else mapScalar(godotT)

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
