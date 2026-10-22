// Patched copy of Scala Native 0.5.10 `tools/.../codegen/Metadata.scala`
// (Scala Native is BSD-licensed: https://github.com/scala-native/scala-native).
//
// Upstream numbers classes by iterating `linker.Class.subclasses`, a
// `mutable.Set` keyed by identity hashCode, and traits by iterating a HashMap,
// so ids differ on every JVM run. Type tests are lowered to id-range compares
// before incremental codegen hashes each source directory, so every directory
// looked changed and all LLVM IR was regenerated and recompiled on every link.
// The `sortBy` lines make the ids stable. Classes in the project's own packages
// (`Metadata.LastPackagesProperty`, set by the plugin) are numbered after their
// library siblings, so adding a project class or lambda renumbers only project
// classes instead of every class sorted after it.
//
// Shipped in sbt-godot-scala-native; it shadows the toolchain's class because
// the plugin jar precedes `tools_2.12` on the build classpath. Tied to the
// exact Scala Native version the plugin pins: re-copy on every upgrade.
package scala.scalanative
package codegen

import scala.collection.mutable

import scalanative.linker.{Class, ReachabilityAnalysis, Trait}

private[scalanative] class Metadata(
    val analysis: ReachabilityAnalysis.Result,
    val buildConfig: build.Config,
    proxies: Seq[nir.Defn]
)(implicit val platform: PlatformInfo) {
  def config: build.NativeConfig = buildConfig.compilerConfig
  private implicit def self: Metadata = this

  final val usesLockWords = platform.isMultithreadingEnabled
  val lockWordType = if (usesLockWords) Some(nir.Type.Ptr) else None
  private[codegen] val lockWordVals = lockWordType.map(_ => nir.Val.Null).toList

  val layouts = new CommonMemoryLayouts()
  val rtti = mutable.Map.empty[linker.Info, RuntimeTypeInformation]
  val vtable = mutable.Map.empty[linker.Class, VirtualTable]
  val itable = mutable.Map.empty[linker.Class, ITable]
  val layout = mutable.Map.empty[linker.Class, FieldLayout]
  val dynmap = mutable.Map.empty[linker.Class, DynamicHashMap]
  val ids = mutable.Map.empty[linker.ScopeInfo, Int]
  val ranges = mutable.Map.empty[linker.Class, Range]

  val classes = initClassIdsAndRanges()
  val (traits, traitIdsContext) = initTraitIds()
  val moduleArray = new ModuleArray(this)

  initTraitMetadata()
  initClassMetadata()

  val canAlwaysUseFastITables = rtti.valuesIterator.forall(_.canUseFastITables)

  def initTraitIds(): (Seq[Trait], TraitsUniverse.TraitId.Context) = {
    val traits = analysis.infos.valuesIterator.collect {
      case info: Trait => info
    }.toIndexedSeq
      .sortBy(_.name.mangle) // patched: stable trait ids
    val universe = new TraitsUniverse(traits)
    val ctx = universe.assignIds(ids)
    (traits, ctx)
  }

  def initClassIdsAndRanges(): Seq[Class] = {
    val lastPackages = Metadata.lastPackages // patched
    val out = mutable.UnrolledBuffer.empty[Class]
    var id = 0

    def loop(
        node: Class,
        topLevelSubclassOrdering: Array[Class] => Array[Class]
    ): Unit = {
      out += node
      val start = id
      id += 1
      topLevelSubclassOrdering(
        node.subclasses
          .filter(_.parent.contains(node))
          .toArray
          .sortBy(c => Metadata.orderKey(c, lastPackages)) // patched: stable class ids
      ).foreach(loop(_, identity))
      val end = id - 1
      ids(node) = start
      ranges(node) = start to end
    }

    def fromRootClass(
        symbol: nir.Global.Top,
        ordering: Array[Class] => Array[Class] = identity
    ) =
      loop(
        node = analysis.infos(symbol).asInstanceOf[Class],
        topLevelSubclassOrdering = ordering
      )

    nir.Rt.PrimitiveTypes.foreach(fromRootClass(_))
    fromRootClass(
      nir.Rt.Object.name,
      ordering = subclasses => {
        val (arrays, other) =
          subclasses.partition(_.name == nir.Rt.GenericArray.name)
        arrays ++ other
      }
    )

    out.toSeq
  }

  def initClassMetadata(): Unit = {
    classes.foreach { node =>
      vtable(node) = new VirtualTable(node)
      layout(node) = new FieldLayout(node)
      if (layouts.ClassRtti.usesDynMap) {
        dynmap(node) = new DynamicHashMap(node, proxies)
      }
      itable(node) = ITable.build(node)
      rtti(node) = new RuntimeTypeInformation(node)
    }
  }

  def initTraitMetadata(): Unit = {
    traits.foreach { node =>
      rtti(node) = new RuntimeTypeInformation(node)
    }
  }
}

// patched: ordering helpers for the stable class ids above.
private[scalanative] object Metadata {

  /** System property: comma-separated packages whose classes are numbered
    * last among their siblings. */
  final val LastPackagesProperty = "godot.scalanative.lastPackages"

  private[codegen] def lastPackages: Array[String] =
    Option(System.getProperty(LastPackagesProperty))
      .map(_.split(',').filter(_.nonEmpty).map(_ + "."))
      .getOrElse(Array.empty)

  private[codegen] def orderKey(
      c: Class,
      lastPackages: Array[String]
  ): (Boolean, String) = {
    val name = c.name.id
    (lastPackages.exists(name.startsWith), c.name.mangle)
  }
}
