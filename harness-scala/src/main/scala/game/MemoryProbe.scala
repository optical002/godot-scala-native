package game

import gdext.annotations.*
import gdext.api.*
import gdext.builtin.*
import gdext.classes.*

/** Measures Scala-heap allocation and time per operation on the binding's hot
  * paths, plus RefCounted ownership. Driven by `godot/memory_verify.gd`, which
  * holds the per-step byte budgets.
  */
final class MemoryProbe(
  var step: String = "noop",
  var iterations: Long = 1000L,
  /** Exported resource: the binding must release a replaced value. */
  var stats: Option[PlayerStats],
  /** Exported container: the binding must free a replaced handle. */
  var scores: Arr[Int]
) extends Node3D {

  private var child: Node3D = null
  private var processFrames = 0L

  @signal def pinged(): Unit = ()

  override def ready(): Unit = {
    child = Gd.create[Node3D]()
    child.setName("Child")
    addChild(child, false, Node.InternalMode.Disabled)
  }

  override def process(delta: Double): Unit = processFrames += 1

  @func def processFrameCount(): Long = processFrames

  @func def gcTotalBytes(): Long = Gc.totalAllocatedBytes

  @func def outstandingOwnedRefs(): Long = Gc.stats.outstandingOwnedRefs

  /** A no-op `@func`, called N times from GDScript to cost the dispatch path.
    */
  @func def noop(): Long = 0L

  /** Returns "bytesPerOp nsPerOp" for `step`, measured over `iterations`
    * operations after a warm-up of the same length.
    */
  @func def measure(): String = {
    val n = iterations
    val op = ops.getOrElse(step, throw new IllegalArgumentException(step))
    var i = 0L
    while (i < n) { op(); i += 1 }
    val b0 = Gc.totalAllocatedBytes
    val t0 = System.nanoTime()
    i = 0L
    while (i < n) { op(); i += 1 }
    val t1 = System.nanoTime()
    val b1 = Gc.totalAllocatedBytes
    s"${(b1 - b0).toDouble / n} ${(t1 - t0).toDouble / n}"
  }

  private val v2 = Vector2(1f, 2f)
  private val v3a = Vector3(1f, 2f, 3f)
  private val v3b = Vector3(-4f, 0.5f, 2f)
  private val t3 = Transform3D.identity * Transform3D(
    Basis.identity,
    Vector3(1f, 2f, 3f)
  )
  private var sink: AnyRef = null
  private var fsink: Float = 0f
  private var bsink: Boolean = false

  private val ops: Map[String, () => Unit] = Map(
    "noop" -> (() => ()),
    "setPosition" -> (() => child.setPosition(v3a)),
    "getPosition" -> (() => sink = child.getPosition()),
    "getChild" -> (() => sink = getChild(0L, false)),
    "getName" -> (() => sink = child.getName()),
    "setName" -> (() => child.setName("Child")),
    "findChild" -> (() => sink = findChild("Child", false, false)),
    "singleton" -> (() => sink = Input.singleton),
    "getTree" -> (() => sink = getTree()),
    "emitSignal" -> (() => emitSignal(hostObject, "pinged")),
    "vectorMath" -> (() => fsink += ((v3a + v3b) * 2f).dot(v3b)),
    "transformMath" -> (() => fsink += (t3 * t3).xform(v3a).x),
    "inputKey" -> (() => bsink = Input.getKey(Key.Space, KeyState.JustPressed)),
    "inputAction" -> (() => bsink = Input.getAction(Actions.Jump, KeyState.Pressed)),
    "inputForward" -> (() => bsink = Input.isKeyPressed(Key.Space))
  )

  /** RefCounted ownership and wrapper lifetime rules; "" when all hold. */
  @func def testOwnership(): String = {
    val failures = scala.collection.mutable.ArrayBuffer.empty[String]
    def check(label: String, ok: Boolean): Unit = if (!ok) failures += label

    val before = Gc.stats.outstandingOwnedRefs

    // A reference adopted inside `scoped` is released at its end.
    val scopedObj = Gd.scoped(Gd.create[RefCounted]())
    check("scoped: object freed at block end", scopedObj.hostObject.isNull)
    check("scoped: count restored", Gc.stats.outstandingOwnedRefs == before)

    // `keep()` moves the reference out of the block to the caller.
    val kept = Gd.scoped(Gd.create[RefCounted]().keep())
    check("keep: object alive after block", !kept.hostObject.isNull)
    check("keep: one ref", kept.getReferenceCount() == 1L)
    check("keep: counted", Gc.stats.outstandingOwnedRefs == before + 1)
    kept.unref()
    check("unref: last ref destroys", kept.hostObject.isNull)
    check("unref: count restored", Gc.stats.outstandingOwnedRefs == before)

    // Nested scopes: the inner block releases only its own references.
    Gd.scoped {
      val outer = Gd.create[RefCounted]()
      Gd.scoped { Gd.create[RefCounted](); () }
      check("nested: outer alive after inner", !outer.hostObject.isNull)
    }
    check("nested: count restored", Gc.stats.outstandingOwnedRefs == before)

    // An exception still releases.
    var thrown: RefCounted = null
    try
      Gd.scoped {
        thrown = Gd.create[RefCounted]()
        throw new RuntimeException("boom")
      }
    catch { case _: RuntimeException => () }
    check("exception: released", thrown.hostObject.isNull)

    // Engine `Ref<T>` returns are owned: loading twice inside one block takes
    // two references on the one wrapper, both released at the end.
    Gd.scoped {
      val a =
        ResourceLoader.singleton.load("res://new_player_stats.tres", "", ResourceLoader.CacheMode.Reuse)
      val b =
        ResourceLoader.singleton.load("res://new_player_stats.tres", "", ResourceLoader.CacheMode.Reuse)
      check("identity: same resource, same wrapper", a eq b)
      check("load: two refs held", a.getReferenceCount() == 2L)
    }
    check("load: count restored", Gc.stats.outstandingOwnedRefs == before)

    // Generated `Res` references: typed loads with no cast, owned like `load`.
    Gd.scoped {
      val stats: PlayerStats = Res.newPlayerStats.load()
      check("Res: typed resource load", stats != null)
      val icon: CompressedTexture2D = Res.icon.load()
      check("Res: imported texture load", icon != null && icon.getWidth() > 0L)
      val scene: Tscn[Player] = Res.test.load()
      check("Res: scene load", scene.isAssigned && scene.rootClassName == "Player")
    }
    check("Res: count restored", Gc.stats.outstandingOwnedRefs == before)
    val player: Player = Res.test.instantiate()
    check("Res: instantiate typed root", player != null)
    if (player != null) player.free()
    check("Res: instantiate releases the scene", Gc.stats.outstandingOwnedRefs == before)
    check("Res: file path", Res.harnessManifest.exists && Res.harnessManifest.readText().nonEmpty)

    // Each `refInc()` is one more owned reference; `unref()` beyond what the
    // wrapper owns is ignored instead of freeing someone else's object.
    val twice = Gd.create[RefCounted]().refInc()
    check("refInc: two refs", twice.getReferenceCount() == 2L)
    twice.unref()
    check("unref: one left, alive", !twice.hostObject.isNull)
    twice.unref()
    check("unref: destroyed at zero", twice.hostObject.isNull)
    twice.unref()
    check("extra unref ignored", Gc.stats.outstandingOwnedRefs == before)

    // Node identity and liveness.
    check(
      "identity: getChild returns the same wrapper",
      getChild(0L, false) eq child
    )
    val doomed = Gd.create[Node3D]()
    doomed.free()
    check("free: wrapper is dead", doomed.hostObject.isNull)
    val npe =
      try { doomed.getPosition(); false }
      catch { case _: NullPointerException => true }
    check("free: call on a dead wrapper throws NullPointerException", npe)

    failures.mkString("; ")
  }

  /** Reference counts seen right after engine calls that return a fresh
    * `Ref<T>`: "load=<n> duplicate=<n>".
    */
  @func def refCountsAfterReturn(): String = Gd.scoped {
    val loaded =
      ResourceLoader.singleton.load("res://new_player_stats.tres", "", ResourceLoader.CacheMode.Ignore)
    val loadedCount = loaded.getReferenceCount()
    val dup = loaded.duplicate(false)
    val dupCount = dup.getReferenceCount()
    s"load=$loadedCount duplicate=$dupCount"
  }
}
