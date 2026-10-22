// Patched copy of Scala Native 0.5.10 `tools/.../codegen/IncrementalCodeGenContext.scala`
// (BSD-licensed, https://github.com/scala-native/scala-native): hashes each
// source directory's definitions by content (see `stableHash`), so directories
// holding C-string literals are no longer regenerated on every link. Shipped in
// sbt-godot-scala-native alongside snpatch/Metadata.scala; re-copy on upgrade.
package scala.scalanative
package codegen

import java.io.{ByteArrayOutputStream, File, ObjectOutputStream, PrintWriter}
import java.nio.ByteBuffer
import java.nio.file.{Files, Path, Paths}

import scala.collection.concurrent.TrieMap
import scala.io.Source
import scala.language.implicitConversions

import scala.scalanative.build.Build

private[codegen] class IncrementalCodeGenContext(config: build.Config) {
  private val package2hash: TrieMap[String, Long] = TrieMap[String, Long]()
  private val pack2hashPrev: TrieMap[String, Long] = TrieMap[String, Long]()
  private val changed: TrieMap[String, Long] = TrieMap[String, Long]()
  private val dumpPackage2hash: Path = config.workDir.resolve("package2hash")

  def collectFromPreviousState(): Unit = {
    if (Build.userConfigHasChanged(config))
      Files.deleteIfExists(dumpPackage2hash)
    else if (Files.exists(dumpPackage2hash)) {
      Source
        .fromFile(dumpPackage2hash.toUri())
        .getLines()
        .toList
        .foreach { vec =>
          vec.split(',') match {
            case Array(packageName, hashCodeString) =>
              pack2hashPrev.put(packageName, hashCodeString.toLong)
            case _ => // ignore
          }
        }
    }
  }

  def addEntry(packageName: String, defns: Seq[nir.Defn]): Unit = {
    val hash = defns.foldLeft(0L)(_ + IncrementalCodeGenContext.stableHash(_)) // patched
    val prevHash = pack2hashPrev.get(packageName)
    package2hash.put(packageName, hash)
    if (prevHash.forall(_ != hash)) {
      changed.put(packageName, hash)
    }
  }

  def shouldCompile(packageName: String): Boolean =
    changed.contains(packageName)

  def dump(): Unit = {
    // dump the result in the current execution
    val pwHash = new PrintWriter(dumpPackage2hash.toFile())
    try
      package2hash.foreach {
        case (packageName, hash) =>
          pwHash.write(packageName)
          pwHash.write(",")
          pwHash.println(hash)
      }
    finally pwHash.close()
  }

  def clear(): Unit = {
    package2hash.clear()
    pack2hashPrev.clear()
    changed.clear()
  }
}

// patched: content-based hashing of NIR definitions.
private[codegen] object IncrementalCodeGenContext {

  /** `hashCode` of a NIR tree, except that arrays hash by content. Upstream
    * uses `Defn.hashCode`, and `nir.Val.ByteString` (every C-string literal)
    * holds an `Array[Byte]`, which hashes by identity: any source directory
    * with a C-string constant looked changed on every link. Products hash their
    * first parameter list, like case-class `hashCode` (so positions stay out). */
  def stableHash(x: Any): Int = {
    import scala.util.hashing.MurmurHash3.{mix, finalizeHash}
    x match {
      case null           => 0
      case a: Array[Byte] => java.util.Arrays.hashCode(a)
      case a: Array[_] =>
        var h = 0x3c074a61; var i = 0
        while (i < a.length) { h = mix(h, stableHash(a(i))); i += 1 }
        finalizeHash(h, a.length)
      case s: String => s.hashCode
      case m: scala.collection.Map[_, _] =>
        m.foldLeft(0)((acc, kv) => acc + mix(stableHash(kv._1), stableHash(kv._2)))
      case s: scala.collection.Set[_] =>
        s.foldLeft(0)((acc, e) => acc + stableHash(e))
      case it: Iterable[_] =>
        var h = 0x6c62272e; var n = 0
        it.foreach { e => h = mix(h, stableHash(e)); n += 1 }
        finalizeHash(h, n)
      case p: Product =>
        var h = p.productPrefix.hashCode; var i = 0
        val n = p.productArity
        while (i < n) { h = mix(h, stableHash(p.productElement(i))); i += 1 }
        finalizeHash(h, n)
      case other => other.##
    }
  }
}
