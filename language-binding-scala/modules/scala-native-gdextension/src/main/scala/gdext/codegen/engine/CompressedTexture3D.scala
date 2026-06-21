package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `CompressedTexture3D`, extends `Texture3D`. */
abstract class CompressedTexture3D extends Texture3D {

  /** CompressedTexture3D.load */
  final def load(path: String): Long =
    Ptrcall.call1[String, Long](MethodBind.get("CompressedTexture3D", "load", 166001499L), hostObject.objectPtr, path)

  /** CompressedTexture3D.get_load_path */
  final def getLoadPath(): String =
    Ptrcall.call0[String](MethodBind.get("CompressedTexture3D", "get_load_path", 201670096L), hostObject.objectPtr)

}

object CompressedTexture3D {
  /** Class metadata for Gd[CompressedTexture3D] lifetime management and casting. */
  given GodotClass[CompressedTexture3D] with {
    def className = "CompressedTexture3D"
    def isRefCounted = true
    def wrap(o: GodotObject): CompressedTexture3D = new CompressedTexture3D {}.withHost(o.objectPtr)
    def unwrap(t: CompressedTexture3D): GodotObject = t.hostObject
  }
}
