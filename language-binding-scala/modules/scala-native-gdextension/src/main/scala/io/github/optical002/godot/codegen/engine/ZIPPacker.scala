package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `ZIPPacker`, extends `RefCounted`. */
abstract class ZIPPacker extends RefCounted {

  /** ZIPPacker.open */
  final def open(path: String, append: Long): Long =
    Ptrcall.call2[String, Long, Long](MethodBind.get("ZIPPacker", "open", 1936816515L), hostObject.objectPtr, path, append)

  /** ZIPPacker.set_compression_level */
  final def setCompressionLevel(compression_level: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("ZIPPacker", "set_compression_level", 1286410249L), hostObject.objectPtr, compression_level)

  /** ZIPPacker.get_compression_level */
  final def getCompressionLevel(): Long =
    Ptrcall.call0[Long](MethodBind.get("ZIPPacker", "get_compression_level", 3905245786L), hostObject.objectPtr)

  /** ZIPPacker.start_file */
  final def startFile(path: String): Long =
    Ptrcall.call1[String, Long](MethodBind.get("ZIPPacker", "start_file", 166001499L), hostObject.objectPtr, path)

  /** ZIPPacker.close_file */
  final def closeFile(): Long =
    Ptrcall.call0[Long](MethodBind.get("ZIPPacker", "close_file", 166280745L), hostObject.objectPtr)

  /** ZIPPacker.close */
  final def close(): Long =
    Ptrcall.call0[Long](MethodBind.get("ZIPPacker", "close", 166280745L), hostObject.objectPtr)

}

object ZIPPacker {
  /** Class metadata for Gd[ZIPPacker] lifetime management and casting. */
  given GodotClass[ZIPPacker] with {
    def className = "ZIPPacker"
    def isRefCounted = true
    def wrap(o: GodotObject): ZIPPacker = new ZIPPacker {}.withHost(o.objectPtr)
    def unwrap(t: ZIPPacker): GodotObject = t.hostObject
  }
}
