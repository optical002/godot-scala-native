// Patched copy of Scala Native 0.5.10 `tools/.../linker/ClassLoader.scala`
// (BSD-licensed, https://github.com/scala-native/scala-native): jar entries come
// from `ClassPathCache`, reused across links. Shipped in sbt-godot-scala-native
// with the other snpatch files; re-copy on every Scala Native upgrade.
package scala.scalanative
package linker

import scala.collection.mutable

import scala.scalanative.build.Logger
import scalanative.io.VirtualDirectory
import scalanative.util.Scope

sealed abstract class ClassLoader {

  def classesWithEntryPoints: Iterable[nir.Global.Top]

  def definedServicesProviders: Map[nir.Global.Top, Iterable[nir.Global.Top]]

  def load(global: nir.Global.Top): Option[Seq[nir.Defn]]

}

object ClassLoader {

  def fromDisk(config: build.Config)(implicit in: Scope): ClassLoader = {
    val classpath = config.classPath.map { path =>
      // patched: unchanged jars are reused across links (see ClassPathCache)
      ClassPathCache
        .get(path)
        .getOrElse(ClassPath(VirtualDirectory.real(path), config.logger))
    }
    new FromDisk(classpath)
  }

  def fromMemory(defns: Seq[nir.Defn]): ClassLoader =
    new FromMemory(defns)

  final class FromDisk(classpath: Seq[ClassPath]) extends ClassLoader {
    lazy val classesWithEntryPoints: Iterable[nir.Global.Top] = {
      classpath.flatMap(_.classesWithEntryPoints)
    }
    lazy val definedServicesProviders
        : Map[nir.Global.Top, Iterable[nir.Global.Top]] =
      classpath.flatMap(_.definedServicesProviders).toMap

    def load(global: nir.Global.Top): Option[Seq[nir.Defn]] =
      classpath.collectFirst {
        case path if path.contains(global) =>
          path.load(global)
      }.flatten
  }

  final class FromMemory(defns: Seq[nir.Defn]) extends ClassLoader {

    private val scopes = {
      val out =
        mutable.Map.empty[nir.Global.Top, mutable.UnrolledBuffer[nir.Defn]]
      defns.foreach { defn =>
        val owner = defn.name.top
        val buf =
          out.getOrElseUpdate(owner, mutable.UnrolledBuffer.empty[nir.Defn])
        buf += defn
      }
      out
    }

    lazy val classesWithEntryPoints: Iterable[nir.Global.Top] = {
      scopes.filter {
        case (_, defns) => defns.exists(_.isEntryPoint)
      }.keySet
    }

    def definedServicesProviders
        : Map[nir.Global.Top, Iterable[nir.Global.Top]] =
      Map.empty

    def load(global: nir.Global.Top): Option[Seq[nir.Defn]] =
      scopes.get(global).map(_.toSeq)

  }

}

/** patched: JVM-wide cache of jar classpath entries. In a long-lived sbt server
  * every link used to re-list every jar, re-read the header of every `.nir`
  * file (entry-point scan) and re-deserialize every reachable class. A jar is
  * keyed by canonical path, size and mtime, so republishing it evicts it. NIR
  * definitions are immutable, so sharing them between links is safe. Directory
  * entries (the project's own classes) are never cached. Entries are held
  * softly (~150 MB of NIR on the harness), so memory pressure drops them
  * instead of failing; a dropped entry is rebuilt on the next link. */
private[scalanative] object ClassPathCache {
  private final case class Entry(
      size: Long,
      mtime: Long,
      scope: Scope,
      classPath: java.lang.ref.SoftReference[ClassPath]
  )
  private val entries = mutable.Map.empty[String, Entry]

  def get(path: java.nio.file.Path): Option[ClassPath] = {
    val f = path.toFile
    if (!f.isFile || !f.getName.endsWith(".jar")) None
    else
      entries.synchronized {
        val key = f.getCanonicalPath
        val (size, mtime) = (f.length, f.lastModified)
        val hit = entries.get(key).collect {
          case e if e.size == size && e.mtime == mtime => e.classPath.get
        }
        hit match {
          case Some(cp) if cp != null => Some(cp)
          case _ =>
            val old = entries.get(key)
            old.foreach(e => try e.scope.close() catch { case _: Throwable => () })
            val scope = Scope.unsafe()
            val cp = ClassPath(VirtualDirectory.real(path)(scope), build.Logger.nullLogger)
            entries(key) = Entry(size, mtime, scope, new java.lang.ref.SoftReference(cp))
            Some(cp)
        }
      }
  }
}
