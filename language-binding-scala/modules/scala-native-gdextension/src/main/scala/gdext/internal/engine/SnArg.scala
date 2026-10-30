package gdext.internal.engine

/** A Scala `String` that crosses a ptrcall as a Godot `StringName`. Generated
  * wrappers take and return plain `String`s and tag StringName-typed values
  * with this so [[Marshal]] picks the StringName representation: an argument
  * is a temporary StringName built on the stack and destroyed after the call;
  * a return is decoded once per distinct name via
  * [[gdext.internal.StringNames.adoptText]]. */
opaque type SnArg <: String = String

object SnArg {
  inline def apply(s: String): SnArg = s
}
