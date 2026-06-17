package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `OS`, extends `Object`. */
abstract class OS extends Object {

  /** OS.get_system_ca_certificates */
  final def getSystemCaCertificates(): String =
    Ptrcall.call0[String](MethodBind.get("OS", "get_system_ca_certificates", 2841200299L), hostObject.objectPtr)

  /** OS.open_midi_inputs */
  final def openMidiInputs(): Unit =
    Ptrcall.callVoid0(MethodBind.get("OS", "open_midi_inputs", 3218959716L), hostObject.objectPtr)

  /** OS.close_midi_inputs */
  final def closeMidiInputs(): Unit =
    Ptrcall.callVoid0(MethodBind.get("OS", "close_midi_inputs", 3218959716L), hostObject.objectPtr)

  /** OS.alert */
  final def alert(text: String, title: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("OS", "alert", 1783970740L), hostObject.objectPtr, text, title)

  /** OS.crash */
  final def crash(message: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("OS", "crash", 83702148L), hostObject.objectPtr, message)

  /** OS.set_low_processor_usage_mode */
  final def setLowProcessorUsageMode(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("OS", "set_low_processor_usage_mode", 2586408642L), hostObject.objectPtr, enable)

  /** OS.is_in_low_processor_usage_mode */
  final def isInLowProcessorUsageMode(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("OS", "is_in_low_processor_usage_mode", 36873697L), hostObject.objectPtr)

  /** OS.set_low_processor_usage_mode_sleep_usec */
  final def setLowProcessorUsageModeSleepUsec(usec: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("OS", "set_low_processor_usage_mode_sleep_usec", 1286410249L), hostObject.objectPtr, usec)

  /** OS.get_low_processor_usage_mode_sleep_usec */
  final def getLowProcessorUsageModeSleepUsec(): Long =
    Ptrcall.call0[Long](MethodBind.get("OS", "get_low_processor_usage_mode_sleep_usec", 3905245786L), hostObject.objectPtr)

  /** OS.set_delta_smoothing */
  final def setDeltaSmoothing(delta_smoothing_enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("OS", "set_delta_smoothing", 2586408642L), hostObject.objectPtr, delta_smoothing_enabled)

  /** OS.is_delta_smoothing_enabled */
  final def isDeltaSmoothingEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("OS", "is_delta_smoothing_enabled", 36873697L), hostObject.objectPtr)

  /** OS.get_processor_count */
  final def getProcessorCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("OS", "get_processor_count", 3905245786L), hostObject.objectPtr)

  /** OS.get_processor_name */
  final def getProcessorName(): String =
    Ptrcall.call0[String](MethodBind.get("OS", "get_processor_name", 201670096L), hostObject.objectPtr)

  /** OS.get_system_font_path */
  final def getSystemFontPath(font_name: String, weight: Long, stretch: Long, italic: Boolean): String =
    Ptrcall.call4[String, Long, Long, Boolean, String](MethodBind.get("OS", "get_system_font_path", 626580860L), hostObject.objectPtr, font_name, weight, stretch, italic)

  /** OS.get_executable_path */
  final def getExecutablePath(): String =
    Ptrcall.call0[String](MethodBind.get("OS", "get_executable_path", 201670096L), hostObject.objectPtr)

  /** OS.read_string_from_stdin */
  final def readStringFromStdin(buffer_size: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("OS", "read_string_from_stdin", 723587915L), hostObject.objectPtr, buffer_size)

  /** OS.get_stdin_type */
  final def getStdinType(): Long =
    Ptrcall.call0[Long](MethodBind.get("OS", "get_stdin_type", 1704816237L), hostObject.objectPtr)

  /** OS.get_stdout_type */
  final def getStdoutType(): Long =
    Ptrcall.call0[Long](MethodBind.get("OS", "get_stdout_type", 1704816237L), hostObject.objectPtr)

  /** OS.get_stderr_type */
  final def getStderrType(): Long =
    Ptrcall.call0[Long](MethodBind.get("OS", "get_stderr_type", 1704816237L), hostObject.objectPtr)

  /** OS.kill */
  final def kill(pid: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("OS", "kill", 844576869L), hostObject.objectPtr, pid)

  /** OS.shell_open */
  final def shellOpen(uri: String): Long =
    Ptrcall.call1[String, Long](MethodBind.get("OS", "shell_open", 166001499L), hostObject.objectPtr, uri)

  /** OS.shell_show_in_file_manager */
  final def shellShowInFileManager(file_or_dir_path: String, open_folder: Boolean): Long =
    Ptrcall.call2[String, Boolean, Long](MethodBind.get("OS", "shell_show_in_file_manager", 3565188097L), hostObject.objectPtr, file_or_dir_path, open_folder)

  /** OS.is_process_running */
  final def isProcessRunning(pid: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("OS", "is_process_running", 1116898809L), hostObject.objectPtr, pid)

  /** OS.get_process_exit_code */
  final def getProcessExitCode(pid: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("OS", "get_process_exit_code", 923996154L), hostObject.objectPtr, pid)

  /** OS.get_process_id */
  final def getProcessId(): Long =
    Ptrcall.call0[Long](MethodBind.get("OS", "get_process_id", 3905245786L), hostObject.objectPtr)

  /** OS.has_environment */
  final def hasEnvironment(variable: String): Boolean =
    Ptrcall.call1[String, Boolean](MethodBind.get("OS", "has_environment", 3927539163L), hostObject.objectPtr, variable)

  /** OS.get_environment */
  final def getEnvironment(variable: String): String =
    Ptrcall.call1[String, String](MethodBind.get("OS", "get_environment", 3135753539L), hostObject.objectPtr, variable)

  /** OS.set_environment */
  final def setEnvironment(variable: String, value: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("OS", "set_environment", 3605043004L), hostObject.objectPtr, variable, value)

  /** OS.unset_environment */
  final def unsetEnvironment(variable: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("OS", "unset_environment", 3089850668L), hostObject.objectPtr, variable)

  /** OS.get_name */
  final def getName(): String =
    Ptrcall.call0[String](MethodBind.get("OS", "get_name", 201670096L), hostObject.objectPtr)

  /** OS.get_distribution_name */
  final def getDistributionName(): String =
    Ptrcall.call0[String](MethodBind.get("OS", "get_distribution_name", 201670096L), hostObject.objectPtr)

  /** OS.get_version */
  final def getVersion(): String =
    Ptrcall.call0[String](MethodBind.get("OS", "get_version", 201670096L), hostObject.objectPtr)

  /** OS.get_version_alias */
  final def getVersionAlias(): String =
    Ptrcall.call0[String](MethodBind.get("OS", "get_version_alias", 201670096L), hostObject.objectPtr)

  /** OS.is_restart_on_exit_set */
  final def isRestartOnExitSet(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("OS", "is_restart_on_exit_set", 36873697L), hostObject.objectPtr)

  /** OS.delay_usec */
  final def delayUsec(usec: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("OS", "delay_usec", 998575451L), hostObject.objectPtr, usec)

  /** OS.delay_msec */
  final def delayMsec(msec: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("OS", "delay_msec", 998575451L), hostObject.objectPtr, msec)

  /** OS.get_locale */
  final def getLocale(): String =
    Ptrcall.call0[String](MethodBind.get("OS", "get_locale", 201670096L), hostObject.objectPtr)

  /** OS.get_locale_language */
  final def getLocaleLanguage(): String =
    Ptrcall.call0[String](MethodBind.get("OS", "get_locale_language", 201670096L), hostObject.objectPtr)

  /** OS.get_model_name */
  final def getModelName(): String =
    Ptrcall.call0[String](MethodBind.get("OS", "get_model_name", 201670096L), hostObject.objectPtr)

  /** OS.is_userfs_persistent */
  final def isUserfsPersistent(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("OS", "is_userfs_persistent", 36873697L), hostObject.objectPtr)

  /** OS.is_stdout_verbose */
  final def isStdoutVerbose(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("OS", "is_stdout_verbose", 36873697L), hostObject.objectPtr)

  /** OS.is_debug_build */
  final def isDebugBuild(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("OS", "is_debug_build", 36873697L), hostObject.objectPtr)

  /** OS.get_static_memory_usage */
  final def getStaticMemoryUsage(): Long =
    Ptrcall.call0[Long](MethodBind.get("OS", "get_static_memory_usage", 3905245786L), hostObject.objectPtr)

  /** OS.get_static_memory_peak_usage */
  final def getStaticMemoryPeakUsage(): Long =
    Ptrcall.call0[Long](MethodBind.get("OS", "get_static_memory_peak_usage", 3905245786L), hostObject.objectPtr)

  /** OS.move_to_trash */
  final def moveToTrash(path: String): Long =
    Ptrcall.call1[String, Long](MethodBind.get("OS", "move_to_trash", 2113323047L), hostObject.objectPtr, path)

  /** OS.get_user_data_dir */
  final def getUserDataDir(): String =
    Ptrcall.call0[String](MethodBind.get("OS", "get_user_data_dir", 201670096L), hostObject.objectPtr)

  /** OS.get_system_dir */
  final def getSystemDir(dir: Long, shared_storage: Boolean): String =
    Ptrcall.call2[Long, Boolean, String](MethodBind.get("OS", "get_system_dir", 3073895123L), hostObject.objectPtr, dir, shared_storage)

  /** OS.get_config_dir */
  final def getConfigDir(): String =
    Ptrcall.call0[String](MethodBind.get("OS", "get_config_dir", 201670096L), hostObject.objectPtr)

  /** OS.get_data_dir */
  final def getDataDir(): String =
    Ptrcall.call0[String](MethodBind.get("OS", "get_data_dir", 201670096L), hostObject.objectPtr)

  /** OS.get_cache_dir */
  final def getCacheDir(): String =
    Ptrcall.call0[String](MethodBind.get("OS", "get_cache_dir", 201670096L), hostObject.objectPtr)

  /** OS.get_temp_dir */
  final def getTempDir(): String =
    Ptrcall.call0[String](MethodBind.get("OS", "get_temp_dir", 201670096L), hostObject.objectPtr)

  /** OS.get_unique_id */
  final def getUniqueId(): String =
    Ptrcall.call0[String](MethodBind.get("OS", "get_unique_id", 201670096L), hostObject.objectPtr)

  /** OS.get_keycode_string */
  final def getKeycodeString(code: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("OS", "get_keycode_string", 2261993717L), hostObject.objectPtr, code)

  /** OS.is_keycode_unicode */
  final def isKeycodeUnicode(code: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("OS", "is_keycode_unicode", 1116898809L), hostObject.objectPtr, code)

  /** OS.find_keycode_from_string */
  final def findKeycodeFromString(string: String): Long =
    Ptrcall.call1[String, Long](MethodBind.get("OS", "find_keycode_from_string", 1084858572L), hostObject.objectPtr, string)

  /** OS.set_use_file_access_save_and_swap */
  final def setUseFileAccessSaveAndSwap(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("OS", "set_use_file_access_save_and_swap", 2586408642L), hostObject.objectPtr, enabled)

  /** OS.set_thread_name */
  final def setThreadName(name: String): Long =
    Ptrcall.call1[String, Long](MethodBind.get("OS", "set_thread_name", 166001499L), hostObject.objectPtr, name)

  /** OS.get_thread_caller_id */
  final def getThreadCallerId(): Long =
    Ptrcall.call0[Long](MethodBind.get("OS", "get_thread_caller_id", 3905245786L), hostObject.objectPtr)

  /** OS.get_main_thread_id */
  final def getMainThreadId(): Long =
    Ptrcall.call0[Long](MethodBind.get("OS", "get_main_thread_id", 3905245786L), hostObject.objectPtr)

  /** OS.has_feature */
  final def hasFeature(tag_name: String): Boolean =
    Ptrcall.call1[String, Boolean](MethodBind.get("OS", "has_feature", 3927539163L), hostObject.objectPtr, tag_name)

  /** OS.is_sandboxed */
  final def isSandboxed(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("OS", "is_sandboxed", 36873697L), hostObject.objectPtr)

  /** OS.request_permission */
  final def requestPermission(name: String): Boolean =
    Ptrcall.call1[String, Boolean](MethodBind.get("OS", "request_permission", 2323990056L), hostObject.objectPtr, name)

  /** OS.request_permissions */
  final def requestPermissions(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("OS", "request_permissions", 2240911060L), hostObject.objectPtr)

  /** OS.revoke_granted_permissions */
  final def revokeGrantedPermissions(): Unit =
    Ptrcall.callVoid0(MethodBind.get("OS", "revoke_granted_permissions", 3218959716L), hostObject.objectPtr)

  /** OS.add_logger */
  final def addLogger(logger: Logger): Unit =
    Ptrcall.callVoid1(MethodBind.get("OS", "add_logger", 4261188958L), hostObject.objectPtr, logger.hostObject)

  /** OS.remove_logger */
  final def removeLogger(logger: Logger): Unit =
    Ptrcall.callVoid1(MethodBind.get("OS", "remove_logger", 4261188958L), hostObject.objectPtr, logger.hostObject)

}

object OS {
  /** Class metadata for Gd[OS] lifetime management and casting. */
  given GodotClass[OS] with {
    def className = "OS"
    def isRefCounted = false
    def wrap(o: GodotObject): OS = new OS {}.withHost(o.objectPtr)
    def unwrap(t: OS): GodotObject = t.hostObject
  }

  /** The process-global OS singleton instance. */
  def singleton: OS = new OS {}
    .withHost(Godot.interface.global_get_singleton(
      StringNames.cached("OS").ptr))
}
