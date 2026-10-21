package game

import gdext.annotations.*
import gdext.classes.Node

/** Runs every generated math parity check (`game.harness.MathParity`). Driven
  * by `godot/math_parity_verify.gd`.
  */
final class MathParityProbe(var trials: Long = 25L) extends Node {

  /** "passed total" on the first line, then one line per failing check. */
  @func def run(): String = {
    val checks = game.harness.MathParity.checks
    val failures = checks.flatMap { case (label, check) =>
      val out = MathParityKit.run(label, check, trials.toInt)
      if (out.isEmpty) None else Some(out)
    }
    (s"${checks.size - failures.size} ${checks.size}" +: failures)
      .mkString("\n")
  }
}
