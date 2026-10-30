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

    val enums = collectEnums(json, toGenerate)
    enumTypes = enums.map(e => e.godotKey -> e.fqn).toMap
    val classEnums = enums.filter(_.owner.nonEmpty).groupBy(_.owner.get)
    val globalEnums = enums.filter(_.owner.isEmpty)

    val files = toGenerate.toVector.sorted.flatMap { name =>
      generateClass(
        name,
        byName,
        toGenerate,
        refCounted,
        singletonLookup,
        classEnums.getOrElse(name, Vector.empty)
      ).map(content => ScalaFile(name, content))
    } :+ ScalaFile("ClassFactory", generateFactory(toGenerate.toVector.sorted)) :+
      ScalaFile(GlobalEnumsFile, generateGlobalEnums(globalEnums))
    write(files, codeGenPath)
    println(s"Generated ${files.size} engine classes into $codeGenPath")
  }

  /** File holding the `@GlobalScope` enums (`Key`, `MouseButton`, ...). */
  val GlobalEnumsFile = "GlobalEnums"

  /**
   * Hand-written traits mixed into a generated class or its companion, so typed
   * helpers sit on the engine type itself without hand-editing generated code.
   */
  val classMixins: Map[String, String] = Map(
    "InputEvent" -> "gdext.internal.input.InputEventOps"
  )
  val companionMixins: Map[String, String] = Map(
    "Input" -> "gdext.internal.input.InputOps"
  )

  // --- enums --------------------------------------------------------------

  /**
   * A Godot enum or bitfield, emitted as `opaque type Name <: Long = Long` with
   * a same-named companion of constants. `owner` is the declaring class (the
   * type lives in that class's companion); None for a global enum.
   */
  case class EnumDef(
    owner: Option[String],
    name: String,
    isBitfield: Boolean,
    values: Vector[(String, Long)]
  ) {
    def godotKey: String = owner.fold(name)(o => s"$o.$name")
    def fqn: String = s"gdext.classes.$godotKey"
  }

  /** `enum::`/`bitfield::` key -> Scala type, for the enums this run emits.
    * Others (`Variant.Type`, `Variant.Operator`) stay `Long`. */
  private var enumTypes: Map[String, String] = Map.empty

  def collectEnums(json: ujson.Value, generated: Set[String]): Vector[EnumDef] = {
    def toDef(owner: Option[String], e: ujson.Value): EnumDef = {
      val raw = e("values").arr.toVector.map(v => v("name").str -> v("value").num.toLong)
      val names = constantNames(raw.map(_._1))
      EnumDef(
        owner,
        e("name").str,
        e.obj.get("is_bitfield").exists(_.bool),
        names.zip(raw.map(_._2))
      )
    }
    val global = json.obj
      .get("global_enums")
      .map(_.arr.toVector)
      .getOrElse(Vector.empty)
      .filterNot(_("name").str.contains('.'))
      .map(e => toDef(None, e))
    val perClass = json("classes").arr.toVector
      .filter(c => generated.contains(c("name").str))
      .flatMap { c =>
        c.obj.get("enums").map(_.arr.toVector).getOrElse(Vector.empty)
          .map(e => toDef(Some(c("name").str), e))
      }
    global ++ perClass
  }

  /**
   * Godot constant names -> PascalCase Scala names, with the prefix all values
   * share dropped (`MOUSE_MODE_CAPTURED` -> `Captured`). A name that would then
   * start with a digit keeps the prefix's last word (`KEY_0` -> `Key0`).
   */
  def constantNames(godot: Vector[String]): Vector[String] = {
    val prefix =
      if (godot.size < 2) ""
      else {
        var p = godot.head
        godot.tail.foreach(n => while (!n.startsWith(p)) p = p.dropRight(1))
        p.take(p.lastIndexOf('_') + 1)
      }
    val lastWord = pascal(prefix.split('_').filter(_.nonEmpty).lastOption.getOrElse(""))
    godot.map { n =>
      val rest = pascal(n.drop(prefix.length))
      if (rest.isEmpty) pascal(n)
      else if (rest.head.isDigit) lastWord + rest
      else rest
    }
  }

  private def pascal(s: String): String =
    s.split('_').filter(_.nonEmpty).map(w => w.toLowerCase.capitalize).mkString

  def generateGlobalEnums(enums: Vector[EnumDef]): String =
    s"""package gdext.classes
       |
       |// Godot's `@GlobalScope` enums and bitfields (generated).
       |${enums.map(e => emitEnum(e, "")).mkString("\n")}""".stripMargin

  /** One enum: the opaque type plus its companion of constants. */
  def emitEnum(e: EnumDef, ind: String): String = {
    val t = e.name
    val consts = e.values.map { case (n, v) =>
      s"$ind  final val $n: $t = ${v}L.asInstanceOf[$t]\n"
    }.mkString
    val unique = e.values.groupBy(_._2).values.map(_.head).toVector.sortBy(_._2)
    val values = unique.map(v => s"${v._2}L").mkString(", ")
    val nameCases = unique.map { case (n, v) =>
      s"""$ind      case ${v}L => "$n"\n"""
    }.mkString
    // A bitfield has no `<: Long` bound: with one, Long's own `|` would win
    // over these and return a bare Long.
    val flagOps =
      if (!e.isBitfield) ""
      else
        s"""$ind  extension (self: $t) {
           |$ind    inline def value: Long = self.asInstanceOf[Long]
           |$ind    inline def |(other: $t): $t = (self.value | other.value).asInstanceOf[$t]
           |$ind    inline def &(other: $t): $t = (self.value & other.value).asInstanceOf[$t]
           |$ind    /** Every bit of `flag` is set. */
           |$ind    inline def has(flag: $t): Boolean = (self.value & flag.value) == flag.value
           |$ind  }
           |""".stripMargin
    val kind  = if (e.isBitfield) "bitfield" else "enum"
    val bound = if (e.isBitfield) "" else " <: Long"
    s"""
       |$ind/** Godot $kind `${e.godotKey}`. */
       |${ind}opaque type $t$bound = Long
       |
       |${ind}object $t {
       |$consts
       |$ind  /** A value from its raw Godot integer. */
       |$ind  inline def apply(value: Long): $t = value.asInstanceOf[$t]
       |
       |$ind  /** Every named value, ascending, aliases once. */
       |$ind  val values: scala.IArray[$t] = scala.IArray[Long]($values).asInstanceOf[scala.IArray[$t]]
       |
       |$ind  extension (self: $t)
       |$ind    /** The constant's Scala name, or the number for an unnamed value. */
       |$ind    def name: String = self.asInstanceOf[Long] match {
       |$nameCases$ind      case other => other.toString
       |$ind    }
       |$flagOps$ind}
       |""".stripMargin
  }

  private def enumKey(godotT: String): String =
    godotT.stripPrefix("enum::").stripPrefix("bitfield::")

  private val bp = "gdext.builtin"

  /** Godot builtin/scalar type -> Scala type. The keys are exactly the value
    * types the marshalling layer (`Ptrcall` PtrArg/PtrRet) knows how to pass. */
  val builtinScalar: Map[String, String] = Map(
    "int"         -> "Long",
    "float"       -> "Double",
    "bool"        -> "Boolean",
    "String"      -> "String",
    "StringName"  -> "String",
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

  /** Enums and bitfields cross the ptrcall boundary as int64; their Scala
    * types are opaque `Long` subtypes, so the ptrcall type param stays `Long`. */
  def isEnumLike(t: String): Boolean =
    t.startsWith("enum::") || t.startsWith("bitfield::")

  def enumScalaType(godotT: String): String =
    enumTypes.getOrElse(enumKey(godotT), "Long")

  def scalaType(godotType: String, generated: Set[String]): Option[String] =
    if (builtinScalar.contains(godotType)) Some(builtinScalar(godotType))
    else if (isEnumLike(godotType)) Some(enumScalaType(godotType))
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

  /**
   * One emitted method: its source, its bind-field name, whether static, and
   * (instance methods) the singleton-companion forwarder's source.
   */
  case class Emitted(
    source: String,
    bindVar: String,
    isStatic: Boolean,
    scalaName: String,
    forwarder: String
  )

  def generateClass(
    name: String,
    byName: Map[String, ujson.Value],
    generated: Set[String],
    refCounted: Set[String],
    singletonLookup: Map[String, String],
    enums: Vector[EnumDef]
  ): Option[String] = byName.get(name).map { cls =>
    val parent = cls.obj.get("inherits").map(_.str)
    val isSingleton = singletonLookup.contains(name)

    // Only this class's own methods (inheritance provides the rest).
    val methods =
      cls.obj.get("methods").map(_.arr.toVector).getOrElse(Vector.empty)

    val emitted = methods.flatMap(m => emitMethod(name, m, generated, refCounted))
    val methodDefs = emitted.filterNot(_.isStatic).map(_.source).mkString
    val staticDefs = emitted.filter(_.isStatic).map(_.source).mkString
    val enumDefs = enums.map(e => emitEnum(e, "  ")).mkString

    // A singleton's methods are also reachable on its companion
    // (`Input.isKeyPressed(...)`), unless a static already owns the name.
    val staticNames = emitted.filter(_.isStatic).map(_.scalaName).toSet
    val forwarderDefs =
      if (!isSingleton) ""
      else
        emitted
          .filter(e => !e.isStatic && !staticNames.contains(e.scalaName))
          .map(_.forwarder)
          .mkString

    // One cached MethodBind per emitted method, resolved on first call.
    val bindVars = emitted.map { e =>
      s"  private[classes] var ${e.bindVar}: GDExtensionMethodBindPtr = null\n"
    }.mkString

    // The superclass clause: extend the Godot parent, or (at the root) the
    // binding's script base which carries hostObject + the virtuals.
    val extendsClause = (parent match {
      case Some(p) => s"$p"
      case None    => "gdext.internal.register.GodotScriptClass"
    }) + classMixins.get(name).fold("")(m => s" with $m")
    val companionExtends = companionMixins.get(name).fold("")(m => s" extends $m")

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

    val companionBody = bindVars + singletonDef + forwarderDefs + staticDefs + enumDefs
    val companionDef =
      if (companionBody.nonEmpty || companionExtends.nonEmpty) s"""
         |object $name$companionExtends {
         |$companionBody}
         |""".stripMargin
      else ""

    s"""package gdext.classes
       |
       |import gdext.Godot
       |import gdext.builtin.*
       |import gdext.internal.StringNames
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
      val an = sanitize(methodName(a("name").str))
      scalaType(a("type").str, generated).map(t => (an, t, a("type").str))
    }
    if (scalaArgs.exists(_.isEmpty)) return None
    val mappedArgs: List[(String, String, String)] = scalaArgs.flatten.toList
    val defaults = args.map(a =>
      a.obj.get("default_value").flatMap(d => defaultExpr(a("type").str, d.str))
    )

    val scalaName = sanitize(methodName(mname))
    val paramList = mappedArgs
      .zip(defaults)
      .map { case ((n, t, _), d) => s"$n: $t" + d.fold("")(v => s" = $v") }
      .mkString(", ")

    // Object-typed args pass their engine handle (null passes a null handle);
    // StringName-typed `String` args are tagged so Marshal builds a StringName.
    def toPtrArg(n: String, godotT: String): String =
      if (isGeneratedObject(godotT)) s"Wrappers.handle($n)"
      else if (godotT == "StringName") s"SnArg($n)"
      else if (godotT.startsWith("bitfield::") && enumScalaType(godotT) != "Long")
        s"$n.asInstanceOf[Long]"
      else n

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
      case Some(rt) if isEnumLike(rt) && enumScalaType(rt) != "Long" =>
        s"${enumScalaType(rt)}($callExpr)"
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
        isStatic,
        scalaName,
        s"""
           |  /** Forwards to [[singleton]]: ${declClass}.$mname */
           |  final def $scalaName($paramList): $retSig =
           |    singleton.$scalaName(${mappedArgs.map(_._1).mkString(", ")})
           |""".stripMargin
      )
    )
  }

  private val IntLit   = """-?\d+""".r
  private val FloatLit = """-?\d+(\.\d+)?(e-?\d+)?""".r
  private val Ctor     = """(\w+)\((.*)\)""".r

  /**
   * A Godot `default_value` as a Scala default-argument expression, or None
   * when its form isn't mapped (the parameter is then required).
   */
  def defaultExpr(godotT: String, raw: String): Option[String] = {
    def floats(args: String, n: Int): Option[Seq[String]] = {
      val parts = args.split(',').map(_.trim).toSeq
      if (parts.size == n && parts.forall(FloatLit.matches)) Some(parts.map(_ + "f"))
      else None
    }
    def ints(args: String, n: Int): Option[Seq[String]] = {
      val parts = args.split(',').map(_.trim).toSeq
      if (parts.size == n && parts.forall(IntLit.matches)) Some(parts) else None
    }
    godotT match {
      case "bool" if raw == "true" || raw == "false" => Some(raw)
      case "int" if IntLit.matches(raw)              => Some(raw + "L")
      case "float" if FloatLit.matches(raw) =>
        Some(if (raw.exists(c => c == '.' || c == 'e')) raw else raw + ".0")
      case t if isEnumLike(t) && IntLit.matches(raw) =>
        val st = enumScalaType(t)
        Some(if (st == "Long") raw + "L" else s"$st(${raw}L)")
      case "String" | "StringName" =>
        val s = raw.stripPrefix("&")
        if (s.length >= 2 && s.head == '"' && s.last == '"' && !s.exists(c => c == '\\' || c == '$'))
          Some(s)
        else None
      case t if raw == "null" && isGeneratedObject(t) && !builtinScalar.contains(t) =>
        Some("null")
      case t @ ("Vector2" | "Vector3" | "Color" | "Rect2" | "Vector2i" | "Vector3i") =>
        val arity = Map("Vector2" -> 2, "Vector3" -> 3, "Color" -> 4, "Rect2" -> 4,
          "Vector2i" -> 2, "Vector3i" -> 3)(t)
        raw match {
          case Ctor(`t`, args) =>
            val parts = if (t.endsWith("i")) ints(args, arity) else floats(args, arity)
            parts.map(p => s"$bp.$t(${p.mkString(", ")})")
          case _ => None
        }
      case _ => None
    }
  }

  /**
   * The Ptrcall return type param. Object returns are read as the pointer's
   * address (`Long`), which `Wrappers` resolves without boxing a `Ptr`.
   */
  def callRet(godotT: String): String =
    if (isGeneratedObject(godotT)) "Long"
    else if (godotT == "StringName") "SnArg"
    else mapScalar(godotT)

  /** The Ptrcall arg type param: object args go through GodotObject,
    * StringName args through SnArg. */
  def ptrArgType(arg: (String, String, String)): String =
    if (isGeneratedObject(arg._3)) "GodotObject"
    else if (arg._3 == "StringName") "SnArg"
    else if (isEnumLike(arg._3)) "Long"
    else arg._2

  /** The ptrcall-level type: enums cross as their raw `Long`. */
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
