import java.io.File
import scala.io.Source
import pprint.*

object InterfaceGenerator {
  def run(jsonPath: String): Unit = {
    val jsonFile = new File(jsonPath)
    val jsonSource = Source.fromFile(jsonFile)
    try {
      println(s"Generating code from ${jsonFile.getAbsolutePath}...")
      val jsonStr = jsonSource.mkString
      val json = ujson.read(jsonStr)
      val types = parseTypes(json("types"))
      pprintln(types)
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
              value -> name
            }.toMap,
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
              name -> typeDescription
            }.toMap
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
        values: Map[Int, String],
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
        members: Map[VarName, TypeDescription]
      ) extends Kind

      case class Function(
        arguments: Vector[(Option[VarName], TypeDescription)],
        returnValue: Option[TypeDescription]
      ) extends Kind
    }
  }
}
