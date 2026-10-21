package gdext.internal.register

import scala.scalanative.unsafe.*

/** Addresses of the `@exported` engine callbacks (see `gdext_trampolines.c`).
  */
@extern
private[register] object TrampolineAddrs {
  @name("gdext_addr_virtual_process")
  def process(): CVoidPtr = extern
  @name("gdext_addr_virtual_physics_process")
  def physicsProcess(): CVoidPtr = extern
  @name("gdext_addr_virtual_input")
  def input(): CVoidPtr = extern
  @name("gdext_addr_virtual_shortcut_input")
  def shortcutInput(): CVoidPtr = extern
  @name("gdext_addr_virtual_unhandled_input")
  def unhandledInput(): CVoidPtr = extern
  @name("gdext_addr_virtual_unhandled_key_input")
  def unhandledKeyInput(): CVoidPtr = extern
  @name("gdext_addr_method_call")
  def methodCall(): CVoidPtr = extern
}
