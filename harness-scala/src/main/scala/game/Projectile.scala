package game

import gdext.classes.Node2D
import scala.scalanative.unsafe.exported

/** A minimal game node referenced by `Player`'s exports. */
final case class Projectile(
  var name: String,
) extends Node2D
