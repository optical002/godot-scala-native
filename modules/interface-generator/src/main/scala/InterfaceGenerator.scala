import InterfaceGenerator.Type.Kind

import java.io.{File, FileWriter}
import scala.io.Source

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
      val scalaFiles = produceScalaFiles(types)
      write(scalaFiles, codeGenPath)
    } finally {
      jsonSource.close()
    }
  }

  def parseTypes(json: ujson.Value): Vector[Type] = {
    json.arr.map { typeJson =>
      import Type.Kind.*

      def extractDescription(innerJson: ujson.Value): Option[String] = {
        innerJson.obj.get("description").map { json =>
          json.arr.map(_.str).mkString("\n")
        }
      }
      def extractTypeDescription(innerJson: ujson.Value): TypeDescription = {
        val type_ = innerJson("type").str
        val description = extractDescription(innerJson)
        (type_, description)
      }

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
            arguments = typeJson("arguments").arr.map { memberJson =>
              val maybeName = memberJson.obj.get("name").map(_.str)
              val typeDescription = extractTypeDescription(memberJson)
              (maybeName, typeDescription)
            }.toVector,
            returnValue =
              typeJson.obj.get("return_value").map(extractTypeDescription)
          )
        case keyword => throw new Exception(s"Invalid kind keyword: $keyword")
      }
      val description = extractDescription(typeJson)
      val deprecated = typeJson.obj.get("deprecated").map { json =>
        Deprecated(
          since = json("since").str,
          replaceWith = json("replace_with").str
        )
      }
      Type(
        name = name,
        kind = kind,
        description = description,
        deprecated = deprecated
      )
    }.toVector
  }
  // TODO parse Interface from json as well.

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

  def produceScalaFiles(
    types: Vector[Type]
  ): Vector[ScalaFile] = {
    def formatComment(type_ : Type): String = {
      if (type_.description.isEmpty && type_.deprecated.isEmpty) ""
      else
        Vector(
          Vector("/**"),
          type_.description.toVector.flatMap { desc =>
            desc.split("\n").map { line =>
              s" * $line"
            }
          },
          type_.deprecated.toVector.flatMap { dep =>
            Vector(
              " *",
              s" * @deprecated Since ${dep.since}. Use ${dep.replaceWith} instead."
            )
          },
          Vector(" */")
        ).flatten.mkString("\n")
    }

    def produceTypes: Vector[ScalaFile] = {
      types.map { type_ =>
        ScalaFile(
          path = "types", name = type_.name,
          content = type_.kind match {
            case Kind.Enum(values, isBitfield) => {
              val typeName = if (isBitfield) "CInt" else "CUnsignedInt"
              val valueSuffix = if (isBitfield) "" else ".toUInt"
              val valuesStr = values.sortBy(_._1).map { case (value, valueName) =>
                s"  final val $valueName: $typeName = $value$valueSuffix"
              }.mkString("\n")
              val comment = formatComment(type_)

              s"""
                 |package godot.gdextensioninterface.codegen.types
                 |
                 |import scala.scalanative.unsafe.*
                 |import scala.scalanative.unsigned.*
                 |
                 |$comment
                 |object ${type_.name} {
                 |$valuesStr
                 |}
                 |""".stripMargin
            }
            case Kind.Handle(isConst, isUninitialized, parent) => ""
            case Kind.Alias(type_) => ""
            case Kind.Struct(members) => ""
            case Kind.Function(arguments, returnValue) => ""
          }
        )
      }
    }

    produceTypes
  }

  case class ScalaFile(
    content: String,
    path: String,
    name: String
  )

  case class Deprecated(since: String, replaceWith: String)

  case class Type(
    name: String,
    kind: Type.Kind,
    description: Option[String],
    deprecated: Option[Deprecated]
  )
  object Type {
    sealed trait Kind
    object Kind {
      type VarName = String
      type TypeName = String
      type TypeDescription =
        (TypeName, Option[String]) // (type, maybe-description)

      // NOTE from godot docs:
      // An enum should be represented as an int32_t, unless is_bitfield is true,
      // in which case an uint32_t should be used.
      case class Enum(
        values: Vector[(Int, String)],
        isBitfield: Boolean
      ) extends Kind

      case class Handle(
        isConst: Boolean,
        isUninitialized: Boolean,
        parent: Option[TypeName]
      ) extends Kind

      case class Alias(
        type_ : TypeName
      ) extends Kind

      case class Struct(
        members: Vector[(VarName, TypeDescription)]
      ) extends Kind

      case class Function(
        arguments: Vector[(Option[VarName], TypeDescription)],
        returnValue: Option[TypeDescription]
      ) extends Kind
    }
  }
}
