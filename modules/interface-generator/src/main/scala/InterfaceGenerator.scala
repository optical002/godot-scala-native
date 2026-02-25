import InterfaceGenerator.Type.Kind

import java.io.{File, FileWriter}
import scala.io.Source
import scala.scalanative.unsafe.CStruct22

object InterfaceGenerator {
  def run(
    jsonPath: String,
    codeGenPath: String
  ): Unit = {
    val jsonFile = new File(jsonPath)
    val jsonSource = Source.fromFile(jsonFile)
    try {
      println(s"Generating code from ${jsonFile.getAbsolutePath}...")
      val jsonStr = jsonSource.mkString
      val json = ujson.read(jsonStr)
      val types = parseTypes(json("types"))
      val interfaces = parseInterface(json("interface"))
      val scalaFiles = processTypes(types) ++ processInterface(interfaces)
      write(scalaFiles, codeGenPath)
    } finally {
      jsonSource.close()
    }
  }

  def extractDescription(innerJson: ujson.Value): Option[String] = {
    innerJson.obj.get("description").map { json =>
      json.arr.map(_.str).mkString("\n")
    }
  }

  def extractTypeDescription(
    innerJson: ujson.Value
  ): TypeDescription = {
    val type_ = innerJson("type").str
    val description = extractDescription(innerJson)
    (type_, description)
  }

  def extractDeprecated(
    innerJson: ujson.Value
  ): Option[Deprecated] = {
    innerJson.obj.get("deprecated").map { json =>
      Deprecated(
        since = json("since").str,
        replaceWith = json.obj.get("replace_with").map(_.str).getOrElse("")
      )
    }
  }

  def extractArguments(
    innerJson: ujson.Value
  ): Arguments = {
    innerJson("arguments").arr.map { memberJson =>
      val maybeName = memberJson.obj.get("name").map(_.str)
      val typeDescription = extractTypeDescription(memberJson)
      (maybeName, typeDescription)
    }.toVector
  }

  def extractReturnValue(
    innerJson: ujson.Value
  ): Option[TypeDescription] = {
    innerJson.obj.get("return_value").map(extractTypeDescription)
  }

  def parseTypes(json: ujson.Value): Vector[Type] = {
    json.arr.map { typeJson =>
      import Type.Kind.*
      val name = typeJson("name").str
      val kind: Type.Kind = typeJson("kind").str match {
        case "enum" =>
          Enum(
            values = typeJson("values").arr.map { valueJson =>
              val name = valueJson("name").str
              val value = valueJson("value").num.toInt
              (value, name)
            }.toVector,
            isBitfield = typeJson.obj.get("is_bitfield").exists(_.bool)
          )
        case "handle" =>
          Handle(
            isConst = typeJson.obj.get("is_const").exists(_.bool),
            isUninitialized =
              typeJson.obj.get("is_uninitialized").exists(_.bool),
            parent = typeJson.obj.get("parent").map(_.str)
          )
        case "alias" =>
          Alias(
            type_ = typeJson("type").str
          )
        case "struct" =>
          Struct(
            members = typeJson("members").arr.map { memberJson =>
              val name = memberJson("name").str
              val typeDescription = extractTypeDescription(memberJson)
              (name, typeDescription)
            }.toVector
          )
        case "function" =>
          Function(
            arguments = extractArguments(typeJson),
            returnValue = extractReturnValue(typeJson)
          )
        case keyword => throw new Exception(s"Invalid kind keyword: $keyword")
      }
      val description = extractDescription(typeJson)
      val deprecated = extractDeprecated(typeJson)
      Type(
        name = name,
        kind = kind,
        description = description,
        deprecated = deprecated
      )
    }.toVector
  }

  def parseInterface(json: ujson.Value): Vector[Interface] = {
    json.arr.map { interfaceJson =>
      Interface(
        name = interfaceJson("name").str,
        description = extractDescription(interfaceJson),
        deprecated = extractDeprecated(interfaceJson),
        arguments = extractArguments(interfaceJson),
        returnValue = extractReturnValue(interfaceJson),
        since = interfaceJson("since").str,
        see = interfaceJson.obj
          .get("see")
          .map(_.arr.map(_.str).toVector)
          .getOrElse(Vector.empty),
        legacyTypeName = interfaceJson.obj.get("legacy_type_name").map(_.str)
      )
    }.toVector
  }

  def write(scalaFiles: Vector[ScalaFile], path: String): Unit = {
    new File(path).mkdirs()
    scalaFiles.foreach { scalaFile =>
      val subPath = s"$path/${scalaFile.path}"
      new File(subPath).mkdirs()
      val writer =
        new FileWriter(s"$subPath/${scalaFile.name}.scala")
      try {
        writer.write(scalaFile.content)
      } finally {
        writer.close()
      }
    }
  }

  def formatComment(
    description: Option[String],
    deprecated: Option[Deprecated]
  ) = {
    if (description.isEmpty && deprecated.isEmpty) ""
    else
      Vector(
        Vector("/**"),
        description.toVector.flatMap { desc =>
          desc.split("\n").map { line =>
            s" * $line"
          }
        },
        deprecated.toVector.flatMap { dep =>
          Vector(
            " *",
            s" * @deprecated Since ${dep.since}. Use ${dep.replaceWith} instead."
          )
        },
        Vector(" */")
      ).flatten.mkString("\n")
  }

  def formatComment(type_ : Type): String = {
    formatComment(type_.description, type_.deprecated)
  }

  def parseTypeName(toParseType: String): String = {
    val baseTypeMap: Map[String, String] = Vector(
      ("void" -> "CVoidPtr"),
      ("int8_t" -> "CSignedChar"),
      ("uint8_t" -> "UByte"),
      ("int16_t" -> "Short"),
      ("uint16_t" -> "UShort"),
      ("int32_t" -> "CInt"),
      ("uint32_t" -> "CUnsignedInt"),
      ("int64_t" -> "CLongLong"),
      ("uint64_t" -> "CUnsignedLongLong"),
      ("size_t" -> "CSize"),
      ("char" -> "CChar"),
      ("char16_t" -> "CChar16"),
      ("char32_t" -> "CChar32"),
      ("wchar_t" -> "CWideChar"),
      ("float" -> "CFloat"),
      ("double" -> "CDouble")
    ).toMap
    def ptrOrRaw: String = {
      if (toParseType.endsWith("*")) {
        val isConst = toParseType.startsWith("const ")
        val rawType =
          toParseType.stripPrefix("const ").stripSuffix("*")
        if (rawType == "void") {
          "CVoidPtr"
        } else {
          val ptrType = if (isConst) "ConstPtr" else "Ptr"
          s"$ptrType[${baseTypeMap.get(rawType).getOrElse(rawType)}]"
        }
      } else {
        toParseType
      }
    }
    baseTypeMap.get(toParseType).getOrElse(ptrOrRaw)
  }

  def generateFunctionDefinition(
    comment: String,
    name: String,
    function: Kind.Function
  ): String = {
    val Kind.Function(arguments, returnValue) = function
    val argumentTypes = arguments
      .map(a => parseTypeName(a._2._1))
      .mkString(",\n  ")
    val returnType = returnValue
      .map(r => parseTypeName(r._1))
      .getOrElse("Unit")
    val funcParams = arguments.zipWithIndex
      .map { case (a, idx) =>
        val paramName = a._1
          .filter(_.nonEmpty)
          .getOrElse(s"_$idx")
        val paramType = parseTypeName(a._2._1)
        (paramName, paramType)
      }
    val callParams = funcParams.map(_._1).mkString(", ")
    val funcParamsStr = funcParams
      .map { case (pName, pType) => s"$pName: $pType" }
      .mkString(",\n      ")
    s"""
     |$comment
     |opaque type ${name} = CFuncPtr${arguments.length}[
     |  $argumentTypes${if (arguments.isEmpty) "" else ","}
     |  $returnType
     |]
     |object ${name} {
     |  given Tag[${name}] = Tag.Ptr(Tag.Unit).asInstanceOf[Tag[${name}]]
     |
     |  extension (func: ${name}) {
     |    def apply(
     |      $funcParamsStr
     |    ): $returnType = func($callParams)
     |  } 
     |}
     |""".stripMargin
  }

  def processTypes(
    types: Vector[Type]
  ): Vector[ScalaFile] = {
    types
      .groupBy(_.kind.name)
      .map { case (name, types) =>
        ScalaFile(
          path = "types",
          name = name,
          content = {
            val contents = types.map { type_ =>
              val comment = formatComment(type_)
              type_.kind match
                case Kind.Enum(values, isBitfield) =>
                  val typeName = if (isBitfield) "CInt" else "CUnsignedInt"
                  val valueSuffix = if (isBitfield) "" else ".toUInt"
                  val valuesStr = values
                    .sortBy(_._1)
                    .map { case (value, valueName) =>
                      s"  final val $valueName: ${type_.name} = $value$valueSuffix"
                    }
                    .mkString("\n")
                  s"""
                   |$comment
                   |type ${type_.name} = ${typeName}
                   |object ${type_.name} {
                   |$valuesStr
                   |}""".stripMargin

                case Kind.Handle(isConst, isUninitialized, parent) =>
                  val ptrType = if (isConst) "Ptr[Byte]" else "ConstPtr[Byte]"
                  s"""
                   |$comment
                   |type ${type_.name} = $ptrType
                   |""".stripMargin
                case Kind.Alias(aliasTypeName) =>
                  s"""
                   |$comment
                   |type ${type_.name} = ${parseTypeName(aliasTypeName)}
                   |""".stripMargin
                case Kind.Struct(members) =>
                  val memberTypes = members
                    .map(m => parseTypeName(m._2._1))
                  val memberMethods = members.zipWithIndex
                    .map { case (m, idx) =>
                      val varName = if (m._1 == "type") "_type" else m._1
                      val i = idx + 1
                      val tName = parseTypeName(m._2._1)
                      s"""
                       |    def ${varName}: $tName = struct._$i
                       |    def ${varName}_=(v: $tName) = struct._${i}_=(v)
                       |    def at_${varName}: Ptr[$tName] = struct.at$i
                       |""".stripMargin
                    }
                  val tagImport =
                    if (memberTypes.length >= 23)
                      "import godot.types.Tags.*"
                    else
                      s"import Tag.materializeCStruct${memberTypes.length}Tag"
                  s"""
                   |$comment
                   |opaque type ${type_.name} = CStruct${members.length}[
                   |  ${memberTypes.mkString(",\n  ")}
                   |]
                   |object ${type_.name} {
                   |  $tagImport
                   |
                   |  given Tag[${type_.name}] = 
                   |    materializeCStruct${memberTypes.length}Tag[${memberTypes
                      .mkString(
                        ", "
                      )}].asInstanceOf[Tag[${type_.name}]]
                   |
                   |  extension (struct: ${type_.name}) {
                   |    ${memberMethods.mkString("")}
                   |  }
                   |}""".stripMargin
                case function: Kind.Function =>
                  generateFunctionDefinition(
                    comment = comment,
                    name = type_.name,
                    function = function
                  )
            }
            s"""
             |package godot.codegen.gdextensioninterface.types
             |
             |import scala.scalanative.unsafe.*
             |import scala.scalanative.unsigned.*
             |import scala.scalanative.unsigned.UInt.*
             |import godot.types.*
             |
             |${contents.mkString}
             |""".stripMargin
          }
        )
      }
      .toVector
  }

  def processInterface(
    interfaces: Vector[Interface]
  ): Vector[ScalaFile] =
    Vector(
      ScalaFile(
        path = "interface",
        name = "Interface",
        content = {
          def getInterfaceName(fromName: String) =
            s"GDExtensionInterface${fromName.split("_").map(_.capitalize).mkString}"
          val definitions = interfaces.map { interface =>
            generateFunctionDefinition(
              comment =
                formatComment(interface.description, interface.deprecated),
              name = getInterfaceName(interface.name),
              function =
                Kind.Function(interface.arguments, interface.returnValue)
            )
          }.mkString
          val interfaceVals = interfaces
            .map { interface =>
              s"val ${interface.name}: ${{ getInterfaceName(interface.name) }}"
            }
            .mkString(",\n  ")
          val definitionLoad = interfaces
            .map { interface =>
              s"${interface.name} = getProcAddr(toCString(\"${interface.name}\")).asInstanceOf[${{
                  getInterfaceName(interface.name)
                }}]"
            }
            .mkString(",\n      ")

          s"""
           |package godot.codegen.gdextensioninterface.codegen.types
           |
           |import scala.scalanative.unsafe.*
           |import scala.scalanative.unsigned.*
           |import scala.scalanative.unsigned.UInt.*
           |import godot.types.*
           |import godot.codegen.gdextensioninterface.types.*
           |
           |$definitions
           |
           |class Interface private(
           |  $interfaceVals
           |)
           |object Interface {
           |  def load(
           |    getProcAddr: GDExtensionInterfaceGetProcAddress
           |  ): Interface = Zone.acquire { implicit zone: Zone =>
           |    new Interface(
           |      $definitionLoad
           |    )
           |  }
           |}
           |""".stripMargin
        }
      )
    )

  case class ScalaFile(
    content: String,
    path: String,
    name: String
  )

  case class Deprecated(since: String, replaceWith: String)

  type VarName = String
  type TypeName = String
  type TypeDescription =
    (TypeName, Option[String]) // (type, maybe-description)

  type Arguments = Vector[(Option[VarName], TypeDescription)]

  case class Type(
    name: String,
    kind: Type.Kind,
    description: Option[String],
    deprecated: Option[Deprecated]
  )
  object Type {
    enum Kind(val name: String) {
      // NOTE from godot docs:
      // An enum should be represented as an int32_t, unless is_bitfield is true,
      // in which case an uint32_t should be used.
      case Enum(
        values: Vector[(Int, String)],
        isBitfield: Boolean
      ) extends Kind("Enum")

      case Handle(
        isConst: Boolean,
        isUninitialized: Boolean,
        parent: Option[TypeName]
      ) extends Kind("Handle")

      case Alias(
        type_ : TypeName
      ) extends Kind("Alias")

      case Struct(
        members: Vector[(VarName, TypeDescription)]
      ) extends Kind("Struct")

      case Function(
        arguments: Arguments,
        returnValue: Option[TypeDescription]
      ) extends Kind("Function")
    }
  }

  case class Interface(
    name: String,
    description: Option[String],
    deprecated: Option[Deprecated],
    arguments: Arguments,
    returnValue: Option[TypeDescription],
    since: String,
    see: Vector[String],
    legacyTypeName: Option[String]
  )
}
