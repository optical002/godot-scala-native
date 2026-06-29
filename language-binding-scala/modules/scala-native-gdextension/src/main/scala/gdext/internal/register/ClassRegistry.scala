package gdext.internal.register

import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.atomic.AtomicLong

/**
 * Process-global registry backing the static GDExtension class callbacks.
 *
 * GDExtension callbacks are C function pointers and cannot capture Scala
 * closures, so all per-class and per-instance state lives here and is reached
 * from the static trampolines via opaque tokens:
 *
 *  - **class token**: a small integer passed to Godot as `class_userdata`. The
 *    create/get-virtual callbacks use it to find the [[ClassDescriptor]].
 *  - **instance token**: a small integer handed to `object_set_instance` as the
 *    instance pointer. The free/virtual-call callbacks use it to find the live
 *    [[GodotScriptClass]].
 *
 * Using integer tokens (rather than raw object addresses) keeps the GC from
 * ever seeing a disguised pointer to a managed object — the Scala instances are
 * held alive by strong references in [[instances]] until explicitly freed.
 */
object ClassRegistry {
  private val classes = new ConcurrentHashMap[Long, ClassDescriptor]()
  private val instances = new ConcurrentHashMap[Long, GodotScriptClass]()
  private val classIds = new AtomicLong(1L)
  private val instanceIds = new AtomicLong(1L)

  // Secondary index: Godot object instance id -> the canonical Scala instance
  // bound to it, plus instance token -> object id so free can evict both. This
  // lets `ClassMeta.fromHandle` return the SAME Scala object Godot drives the
  // virtuals on (the one stored via `object_set_instance`) instead of a fresh
  // wrapper with its own field state. Without it, fetching a user node through an
  // exported-node field yields a second Scala object whose state diverges from
  // the processed one.
  private val instancesByObjectId = new ConcurrentHashMap[Long, GodotScriptClass]()
  private val objectIdByToken = new ConcurrentHashMap[Long, java.lang.Long]()

  // Class name -> its token, so re-registration of the same class (e.g. on a
  // hot-reload) reuses the existing entry instead of duplicating it.
  private val classTokensByName = new ConcurrentHashMap[String, Long]()

  def registerClass(desc: ClassDescriptor): Long = {
    val id = classIds.getAndIncrement()
    val replaced = classTokensByName.containsKey(desc.className)
    classes.put(id, desc)
    classTokensByName.put(desc.className, id)
    gdext.Log.trace(
      s"ClassRegistry.registerClass: ${desc.className} -> token $id" +
        (if (replaced) " (replaced prior token)" else "")
    )
    id
  }

  def classFor(token: Long): ClassDescriptor = classes.get(token)

  /** True if a class with this Godot name is already registered. */
  def isClassRegistered(className: String): Boolean =
    classTokensByName.containsKey(className)

  /** Names of all currently-registered classes. */
  def registeredClassNames: Array[String] =
    classTokensByName.keySet().toArray(Array.empty[String])

  /**
   * The Godot parent-class name registered for `className`, or null if unknown.
   * Lets callers order unregistration children-before-parents (Godot refuses to
   * unregister a class while a registered extension class still inherits it).
   */
  def parentNameOf(className: String): String =
    if (!classTokensByName.containsKey(className)) null
    else {
      val d = classes.get(classTokensByName.get(className))
      if (d == null) null else d.parentClassName
    }

  /** Forget all class registrations (instances are kept; see callers). */
  def clearClasses(): Unit = {
    classes.clear()
    classTokensByName.clear()
  }

  /**
   * Register a freshly-bound Scala instance. `objectId` is the Godot instance id
   * of the engine object it is bound to (0 if unknown), used to index the
   * instance so [[instanceForObjectId]] can recover this exact object when the
   * same engine node is later fetched through `Gd[T]`.
   */
  def addInstance(obj: GodotScriptClass, objectId: Long): Long = {
    val id = instanceIds.getAndIncrement()
    instances.put(id, obj)
    if (objectId != 0L) {
      instancesByObjectId.put(objectId, obj)
      objectIdByToken.put(id, objectId)
    }
    gdext.Log.trace(
      s"ClassRegistry.addInstance: token $id (objectId=$objectId) = ${obj.getClass.getSimpleName} (live=${instances.size})"
    )
    id
  }

  def instanceFor(token: Long): GodotScriptClass = instances.get(token)

  /** The canonical Scala instance bound to the engine object with this instance
    * id, or null if none is bound (e.g. a pure engine object). */
  def instanceForObjectId(objectId: Long): GodotScriptClass =
    instancesByObjectId.get(objectId)

  def removeInstance(token: Long): GodotScriptClass = {
    val r = instances.remove(token)
    val objectId: java.lang.Long = objectIdByToken.remove(token)
    if (objectId != null) instancesByObjectId.remove(objectId.longValue)
    gdext.Log.trace(
      s"ClassRegistry.removeInstance: token $token = ${if (r == null) "null" else r.getClass.getSimpleName} (live=${instances.size})"
    )
    r
  }
}

/**
 * Static description of one registered class: its Godot name, its parent engine
 * class, the factory that builds a fresh Scala instance, and which engine
 * virtuals the subclass overrides (by Godot method name, e.g. "_process").
 */
final case class ClassDescriptor(
  className: String,
  parentClassName: String,
  factory: () => GodotScriptClass,
  overriddenVirtuals: Set[String],
  // Runtime classes are not instantiated by the editor while merely editing a
  // scene. Editor tool classes (inspector plugins) must set this false so the
  // editor creates and drives them.
  isRuntime: Boolean = true
)
