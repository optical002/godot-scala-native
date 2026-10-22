package gdext.internal.engine

import gdext.classes.{FileAccess, PackedScene, ResourceLoader}
import gdext.internal.register.GodotScriptClass

/**
 * Typed `res://` path references. Each is an opaque `String` (no runtime cost);
 * the type parameter records what the file loads as. The sbt plugin generates a
 * `game.Res` tree of these from the Godot project, so a renamed or deleted asset
 * becomes a compile error. Constructing one by hand is allowed but unchecked.
 *
 *  - `ResPath[T]`   — a resource (`.tres`, imported texture/audio/...) loading as `T`.
 *  - `ScenePath[T]` — a `.tscn` whose root node is `T`; loads as a [[Tscn]].
 *  - `FilePath`     — any other file (json, txt, ...), read through `FileAccess`.
 */
opaque type ResPath[T <: GodotScriptClass] = String

object ResPath {
  inline def apply[T <: GodotScriptClass](path: String): ResPath[T] = path

  extension [T <: GodotScriptClass](p: ResPath[T]) {
    inline def path: String = p

    /** Load (cache mode REUSE) and return the resource as `T`. Owned, like
      * `ResourceLoader.load`: release with `unref()` or inside `Gd.scoped`.
      * `null` when the file can't be loaded or is not a `T`. */
    def load()(using ClassMeta[T]): T = loadAs[T](p)
  }

  private[engine] def loadAs[T <: GodotScriptClass](path: String)(using ClassMeta[T]): T = {
    val res = ResourceLoader.singleton.load(path, "", 1L)
    if (res == null) {
      gdext.api.Gd.printError(s"ResPath: could not load '$path'")
      null.asInstanceOf[T]
    } else {
      val typed = res.cast[T]
      if (typed == null) {
        gdext.api.Gd.printError(
          s"ResPath: '$path' is a ${res.godotClassName}, not a ${summon[ClassMeta[T]].className}"
        )
        res.unref()
      }
      typed
    }
  }
}

opaque type ScenePath[T <: GodotScriptClass] = String

object ScenePath {
  inline def apply[T <: GodotScriptClass](path: String): ScenePath[T] = path

  extension [T <: GodotScriptClass](p: ScenePath[T]) {
    inline def path: String = p

    /** Load the scene as a [[Tscn]]. Its `PackedScene` is owned: release it
      * with `tscn.raw.unref()` or load inside `Gd.scoped`. */
    def load()(using ClassMeta[T]): Tscn[T] =
      Tscn[T](ResPath.loadAs[PackedScene](p))

    /** Load, instantiate and release the `PackedScene`, returning the root as
      * `T` (`null` if the scene can't be loaded or its root is not a `T`). */
    def instantiate()(using ClassMeta[T]): T = {
      val scene = ResPath.loadAs[PackedScene](p)
      if (scene == null) null.asInstanceOf[T]
      else
        try Tscn[T](scene).instantiate()
        finally scene.unref()
    }

    /** [[instantiate]] and add the root as a child of `parent`. */
    def instantiate(parent: gdext.classes.Node)(using ClassMeta[T]): T = {
      val scene = ResPath.loadAs[PackedScene](p)
      if (scene == null) null.asInstanceOf[T]
      else
        try Tscn[T](scene).instantiate(parent)
        finally scene.unref()
    }
  }
}

opaque type FilePath = String

object FilePath {
  inline def apply(path: String): FilePath = path

  extension (p: FilePath) {
    inline def path: String = p
    def exists: Boolean = FileAccess.fileExists(p)

    /** The whole file as text (`""` if it can't be read). Plain files are only
      * in an exported `.pck` if the export preset's include filter lists them. */
    def readText(): String = FileAccess.getFileAsString(p)
  }
}
