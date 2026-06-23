package gdext.internal.register

import java.util.concurrent.ConcurrentHashMap

/**
 * Records, per `(className, propertyName)`, the required scene root node type of
 * a `Tscn[T]` export. Godot has no native hint to filter a PackedScene picker by
 * root-node type, so the editor inspector plugin (Phase E) reads this registry
 * to know which scenes a given property may accept.
 */
object SceneExportRegistry {
  private val byKey = new ConcurrentHashMap[String, String]()
  // Secondary index by property name alone: the inspector plugin sees a property
  // name but getting the edited object's class name cheaply isn't always
  // available, so a by-name lookup is the pragmatic path (collisions across
  // classes sharing a scene-export property name fall back to the last recorded).
  private val byProp = new ConcurrentHashMap[String, String]()

  private def key(className: String, propertyName: String): String =
    s"$className::$propertyName"

  def record(className: String, propertyName: String, rootType: String): Unit = {
    byKey.put(key(className, propertyName), rootType)
    byProp.put(propertyName, rootType)
  }

  /** The required root type for a scene export, or null if not a Tscn export. */
  def rootTypeOf(className: String, propertyName: String): String =
    byKey.get(key(className, propertyName))

  /** By property name only (see [[byProp]]); null if not a scene export. */
  def rootTypeByProp(propertyName: String): String =
    byProp.get(propertyName)

  def size: Int = byKey.size
}
