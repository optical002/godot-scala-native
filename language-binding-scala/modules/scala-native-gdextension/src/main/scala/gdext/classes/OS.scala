package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OS`, extends `Object`. */
abstract class OS extends Object {
  override def godotClassName: String = "OS"

  /** OS.get_system_ca_certificates */
  final def getSystemCaCertificates(): String = {
    if (gdext.classes.OS.mb_get_system_ca_certificates == null) gdext.classes.OS.mb_get_system_ca_certificates = MethodBind.get("OS", "get_system_ca_certificates", 2841200299L)
    Ptrcall.call0[String](gdext.classes.OS.mb_get_system_ca_certificates, livePtr)
  }

  /** OS.open_midi_inputs */
  final def openMidiInputs(): Unit = {
    if (gdext.classes.OS.mb_open_midi_inputs == null) gdext.classes.OS.mb_open_midi_inputs = MethodBind.get("OS", "open_midi_inputs", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.OS.mb_open_midi_inputs, livePtr)
  }

  /** OS.close_midi_inputs */
  final def closeMidiInputs(): Unit = {
    if (gdext.classes.OS.mb_close_midi_inputs == null) gdext.classes.OS.mb_close_midi_inputs = MethodBind.get("OS", "close_midi_inputs", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.OS.mb_close_midi_inputs, livePtr)
  }

  /** OS.alert */
  final def alert(text: String, title: String): Unit = {
    if (gdext.classes.OS.mb_alert == null) gdext.classes.OS.mb_alert = MethodBind.get("OS", "alert", 1783970740L)
    Ptrcall.callVoid2(gdext.classes.OS.mb_alert, livePtr, text, title)
  }

  /** OS.crash */
  final def crash(message: String): Unit = {
    if (gdext.classes.OS.mb_crash == null) gdext.classes.OS.mb_crash = MethodBind.get("OS", "crash", 83702148L)
    Ptrcall.callVoid1(gdext.classes.OS.mb_crash, livePtr, message)
  }

  /** OS.set_low_processor_usage_mode */
  final def setLowProcessorUsageMode(enable: Boolean): Unit = {
    if (gdext.classes.OS.mb_set_low_processor_usage_mode == null) gdext.classes.OS.mb_set_low_processor_usage_mode = MethodBind.get("OS", "set_low_processor_usage_mode", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.OS.mb_set_low_processor_usage_mode, livePtr, enable)
  }

  /** OS.is_in_low_processor_usage_mode */
  final def isInLowProcessorUsageMode(): Boolean = {
    if (gdext.classes.OS.mb_is_in_low_processor_usage_mode == null) gdext.classes.OS.mb_is_in_low_processor_usage_mode = MethodBind.get("OS", "is_in_low_processor_usage_mode", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.OS.mb_is_in_low_processor_usage_mode, livePtr)
  }

  /** OS.set_low_processor_usage_mode_sleep_usec */
  final def setLowProcessorUsageModeSleepUsec(usec: Long): Unit = {
    if (gdext.classes.OS.mb_set_low_processor_usage_mode_sleep_usec == null) gdext.classes.OS.mb_set_low_processor_usage_mode_sleep_usec = MethodBind.get("OS", "set_low_processor_usage_mode_sleep_usec", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.OS.mb_set_low_processor_usage_mode_sleep_usec, livePtr, usec)
  }

  /** OS.get_low_processor_usage_mode_sleep_usec */
  final def getLowProcessorUsageModeSleepUsec(): Long = {
    if (gdext.classes.OS.mb_get_low_processor_usage_mode_sleep_usec == null) gdext.classes.OS.mb_get_low_processor_usage_mode_sleep_usec = MethodBind.get("OS", "get_low_processor_usage_mode_sleep_usec", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.OS.mb_get_low_processor_usage_mode_sleep_usec, livePtr)
  }

  /** OS.set_delta_smoothing */
  final def setDeltaSmoothing(delta_smoothing_enabled: Boolean): Unit = {
    if (gdext.classes.OS.mb_set_delta_smoothing == null) gdext.classes.OS.mb_set_delta_smoothing = MethodBind.get("OS", "set_delta_smoothing", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.OS.mb_set_delta_smoothing, livePtr, delta_smoothing_enabled)
  }

  /** OS.is_delta_smoothing_enabled */
  final def isDeltaSmoothingEnabled(): Boolean = {
    if (gdext.classes.OS.mb_is_delta_smoothing_enabled == null) gdext.classes.OS.mb_is_delta_smoothing_enabled = MethodBind.get("OS", "is_delta_smoothing_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.OS.mb_is_delta_smoothing_enabled, livePtr)
  }

  /** OS.get_processor_count */
  final def getProcessorCount(): Long = {
    if (gdext.classes.OS.mb_get_processor_count == null) gdext.classes.OS.mb_get_processor_count = MethodBind.get("OS", "get_processor_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.OS.mb_get_processor_count, livePtr)
  }

  /** OS.get_processor_name */
  final def getProcessorName(): String = {
    if (gdext.classes.OS.mb_get_processor_name == null) gdext.classes.OS.mb_get_processor_name = MethodBind.get("OS", "get_processor_name", 201670096L)
    Ptrcall.call0[String](gdext.classes.OS.mb_get_processor_name, livePtr)
  }

  /** OS.get_system_font_path */
  final def getSystemFontPath(font_name: String, weight: Long, stretch: Long, italic: Boolean): String = {
    if (gdext.classes.OS.mb_get_system_font_path == null) gdext.classes.OS.mb_get_system_font_path = MethodBind.get("OS", "get_system_font_path", 626580860L)
    Ptrcall.call4[String, Long, Long, Boolean, String](gdext.classes.OS.mb_get_system_font_path, livePtr, font_name, weight, stretch, italic)
  }

  /** OS.get_executable_path */
  final def getExecutablePath(): String = {
    if (gdext.classes.OS.mb_get_executable_path == null) gdext.classes.OS.mb_get_executable_path = MethodBind.get("OS", "get_executable_path", 201670096L)
    Ptrcall.call0[String](gdext.classes.OS.mb_get_executable_path, livePtr)
  }

  /** OS.read_string_from_stdin */
  final def readStringFromStdin(buffer_size: Long): String = {
    if (gdext.classes.OS.mb_read_string_from_stdin == null) gdext.classes.OS.mb_read_string_from_stdin = MethodBind.get("OS", "read_string_from_stdin", 723587915L)
    Ptrcall.call1[Long, String](gdext.classes.OS.mb_read_string_from_stdin, livePtr, buffer_size)
  }

  /** OS.get_stdin_type */
  final def getStdinType(): Long = {
    if (gdext.classes.OS.mb_get_stdin_type == null) gdext.classes.OS.mb_get_stdin_type = MethodBind.get("OS", "get_stdin_type", 1704816237L)
    Ptrcall.call0[Long](gdext.classes.OS.mb_get_stdin_type, livePtr)
  }

  /** OS.get_stdout_type */
  final def getStdoutType(): Long = {
    if (gdext.classes.OS.mb_get_stdout_type == null) gdext.classes.OS.mb_get_stdout_type = MethodBind.get("OS", "get_stdout_type", 1704816237L)
    Ptrcall.call0[Long](gdext.classes.OS.mb_get_stdout_type, livePtr)
  }

  /** OS.get_stderr_type */
  final def getStderrType(): Long = {
    if (gdext.classes.OS.mb_get_stderr_type == null) gdext.classes.OS.mb_get_stderr_type = MethodBind.get("OS", "get_stderr_type", 1704816237L)
    Ptrcall.call0[Long](gdext.classes.OS.mb_get_stderr_type, livePtr)
  }

  /** OS.kill */
  final def kill(pid: Long): Long = {
    if (gdext.classes.OS.mb_kill == null) gdext.classes.OS.mb_kill = MethodBind.get("OS", "kill", 844576869L)
    Ptrcall.call1[Long, Long](gdext.classes.OS.mb_kill, livePtr, pid)
  }

  /** OS.shell_open */
  final def shellOpen(uri: String): Long = {
    if (gdext.classes.OS.mb_shell_open == null) gdext.classes.OS.mb_shell_open = MethodBind.get("OS", "shell_open", 166001499L)
    Ptrcall.call1[String, Long](gdext.classes.OS.mb_shell_open, livePtr, uri)
  }

  /** OS.shell_show_in_file_manager */
  final def shellShowInFileManager(file_or_dir_path: String, open_folder: Boolean): Long = {
    if (gdext.classes.OS.mb_shell_show_in_file_manager == null) gdext.classes.OS.mb_shell_show_in_file_manager = MethodBind.get("OS", "shell_show_in_file_manager", 3565188097L)
    Ptrcall.call2[String, Boolean, Long](gdext.classes.OS.mb_shell_show_in_file_manager, livePtr, file_or_dir_path, open_folder)
  }

  /** OS.is_process_running */
  final def isProcessRunning(pid: Long): Boolean = {
    if (gdext.classes.OS.mb_is_process_running == null) gdext.classes.OS.mb_is_process_running = MethodBind.get("OS", "is_process_running", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.OS.mb_is_process_running, livePtr, pid)
  }

  /** OS.get_process_exit_code */
  final def getProcessExitCode(pid: Long): Long = {
    if (gdext.classes.OS.mb_get_process_exit_code == null) gdext.classes.OS.mb_get_process_exit_code = MethodBind.get("OS", "get_process_exit_code", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.OS.mb_get_process_exit_code, livePtr, pid)
  }

  /** OS.get_process_id */
  final def getProcessId(): Long = {
    if (gdext.classes.OS.mb_get_process_id == null) gdext.classes.OS.mb_get_process_id = MethodBind.get("OS", "get_process_id", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.OS.mb_get_process_id, livePtr)
  }

  /** OS.has_environment */
  final def hasEnvironment(variable: String): Boolean = {
    if (gdext.classes.OS.mb_has_environment == null) gdext.classes.OS.mb_has_environment = MethodBind.get("OS", "has_environment", 3927539163L)
    Ptrcall.call1[String, Boolean](gdext.classes.OS.mb_has_environment, livePtr, variable)
  }

  /** OS.get_environment */
  final def getEnvironment(variable: String): String = {
    if (gdext.classes.OS.mb_get_environment == null) gdext.classes.OS.mb_get_environment = MethodBind.get("OS", "get_environment", 3135753539L)
    Ptrcall.call1[String, String](gdext.classes.OS.mb_get_environment, livePtr, variable)
  }

  /** OS.set_environment */
  final def setEnvironment(variable: String, value: String): Unit = {
    if (gdext.classes.OS.mb_set_environment == null) gdext.classes.OS.mb_set_environment = MethodBind.get("OS", "set_environment", 3605043004L)
    Ptrcall.callVoid2(gdext.classes.OS.mb_set_environment, livePtr, variable, value)
  }

  /** OS.unset_environment */
  final def unsetEnvironment(variable: String): Unit = {
    if (gdext.classes.OS.mb_unset_environment == null) gdext.classes.OS.mb_unset_environment = MethodBind.get("OS", "unset_environment", 3089850668L)
    Ptrcall.callVoid1(gdext.classes.OS.mb_unset_environment, livePtr, variable)
  }

  /** OS.get_name */
  final def getName(): String = {
    if (gdext.classes.OS.mb_get_name == null) gdext.classes.OS.mb_get_name = MethodBind.get("OS", "get_name", 201670096L)
    Ptrcall.call0[String](gdext.classes.OS.mb_get_name, livePtr)
  }

  /** OS.get_distribution_name */
  final def getDistributionName(): String = {
    if (gdext.classes.OS.mb_get_distribution_name == null) gdext.classes.OS.mb_get_distribution_name = MethodBind.get("OS", "get_distribution_name", 201670096L)
    Ptrcall.call0[String](gdext.classes.OS.mb_get_distribution_name, livePtr)
  }

  /** OS.get_version */
  final def getVersion(): String = {
    if (gdext.classes.OS.mb_get_version == null) gdext.classes.OS.mb_get_version = MethodBind.get("OS", "get_version", 201670096L)
    Ptrcall.call0[String](gdext.classes.OS.mb_get_version, livePtr)
  }

  /** OS.get_version_alias */
  final def getVersionAlias(): String = {
    if (gdext.classes.OS.mb_get_version_alias == null) gdext.classes.OS.mb_get_version_alias = MethodBind.get("OS", "get_version_alias", 201670096L)
    Ptrcall.call0[String](gdext.classes.OS.mb_get_version_alias, livePtr)
  }

  /** OS.is_restart_on_exit_set */
  final def isRestartOnExitSet(): Boolean = {
    if (gdext.classes.OS.mb_is_restart_on_exit_set == null) gdext.classes.OS.mb_is_restart_on_exit_set = MethodBind.get("OS", "is_restart_on_exit_set", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.OS.mb_is_restart_on_exit_set, livePtr)
  }

  /** OS.delay_usec */
  final def delayUsec(usec: Long): Unit = {
    if (gdext.classes.OS.mb_delay_usec == null) gdext.classes.OS.mb_delay_usec = MethodBind.get("OS", "delay_usec", 998575451L)
    Ptrcall.callVoid1(gdext.classes.OS.mb_delay_usec, livePtr, usec)
  }

  /** OS.delay_msec */
  final def delayMsec(msec: Long): Unit = {
    if (gdext.classes.OS.mb_delay_msec == null) gdext.classes.OS.mb_delay_msec = MethodBind.get("OS", "delay_msec", 998575451L)
    Ptrcall.callVoid1(gdext.classes.OS.mb_delay_msec, livePtr, msec)
  }

  /** OS.get_locale */
  final def getLocale(): String = {
    if (gdext.classes.OS.mb_get_locale == null) gdext.classes.OS.mb_get_locale = MethodBind.get("OS", "get_locale", 201670096L)
    Ptrcall.call0[String](gdext.classes.OS.mb_get_locale, livePtr)
  }

  /** OS.get_locale_language */
  final def getLocaleLanguage(): String = {
    if (gdext.classes.OS.mb_get_locale_language == null) gdext.classes.OS.mb_get_locale_language = MethodBind.get("OS", "get_locale_language", 201670096L)
    Ptrcall.call0[String](gdext.classes.OS.mb_get_locale_language, livePtr)
  }

  /** OS.get_model_name */
  final def getModelName(): String = {
    if (gdext.classes.OS.mb_get_model_name == null) gdext.classes.OS.mb_get_model_name = MethodBind.get("OS", "get_model_name", 201670096L)
    Ptrcall.call0[String](gdext.classes.OS.mb_get_model_name, livePtr)
  }

  /** OS.is_userfs_persistent */
  final def isUserfsPersistent(): Boolean = {
    if (gdext.classes.OS.mb_is_userfs_persistent == null) gdext.classes.OS.mb_is_userfs_persistent = MethodBind.get("OS", "is_userfs_persistent", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.OS.mb_is_userfs_persistent, livePtr)
  }

  /** OS.is_stdout_verbose */
  final def isStdoutVerbose(): Boolean = {
    if (gdext.classes.OS.mb_is_stdout_verbose == null) gdext.classes.OS.mb_is_stdout_verbose = MethodBind.get("OS", "is_stdout_verbose", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.OS.mb_is_stdout_verbose, livePtr)
  }

  /** OS.is_debug_build */
  final def isDebugBuild(): Boolean = {
    if (gdext.classes.OS.mb_is_debug_build == null) gdext.classes.OS.mb_is_debug_build = MethodBind.get("OS", "is_debug_build", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.OS.mb_is_debug_build, livePtr)
  }

  /** OS.get_static_memory_usage */
  final def getStaticMemoryUsage(): Long = {
    if (gdext.classes.OS.mb_get_static_memory_usage == null) gdext.classes.OS.mb_get_static_memory_usage = MethodBind.get("OS", "get_static_memory_usage", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.OS.mb_get_static_memory_usage, livePtr)
  }

  /** OS.get_static_memory_peak_usage */
  final def getStaticMemoryPeakUsage(): Long = {
    if (gdext.classes.OS.mb_get_static_memory_peak_usage == null) gdext.classes.OS.mb_get_static_memory_peak_usage = MethodBind.get("OS", "get_static_memory_peak_usage", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.OS.mb_get_static_memory_peak_usage, livePtr)
  }

  /** OS.move_to_trash */
  final def moveToTrash(path: String): Long = {
    if (gdext.classes.OS.mb_move_to_trash == null) gdext.classes.OS.mb_move_to_trash = MethodBind.get("OS", "move_to_trash", 2113323047L)
    Ptrcall.call1[String, Long](gdext.classes.OS.mb_move_to_trash, livePtr, path)
  }

  /** OS.get_user_data_dir */
  final def getUserDataDir(): String = {
    if (gdext.classes.OS.mb_get_user_data_dir == null) gdext.classes.OS.mb_get_user_data_dir = MethodBind.get("OS", "get_user_data_dir", 201670096L)
    Ptrcall.call0[String](gdext.classes.OS.mb_get_user_data_dir, livePtr)
  }

  /** OS.get_system_dir */
  final def getSystemDir(dir: Long, shared_storage: Boolean): String = {
    if (gdext.classes.OS.mb_get_system_dir == null) gdext.classes.OS.mb_get_system_dir = MethodBind.get("OS", "get_system_dir", 3073895123L)
    Ptrcall.call2[Long, Boolean, String](gdext.classes.OS.mb_get_system_dir, livePtr, dir, shared_storage)
  }

  /** OS.get_config_dir */
  final def getConfigDir(): String = {
    if (gdext.classes.OS.mb_get_config_dir == null) gdext.classes.OS.mb_get_config_dir = MethodBind.get("OS", "get_config_dir", 201670096L)
    Ptrcall.call0[String](gdext.classes.OS.mb_get_config_dir, livePtr)
  }

  /** OS.get_data_dir */
  final def getDataDir(): String = {
    if (gdext.classes.OS.mb_get_data_dir == null) gdext.classes.OS.mb_get_data_dir = MethodBind.get("OS", "get_data_dir", 201670096L)
    Ptrcall.call0[String](gdext.classes.OS.mb_get_data_dir, livePtr)
  }

  /** OS.get_cache_dir */
  final def getCacheDir(): String = {
    if (gdext.classes.OS.mb_get_cache_dir == null) gdext.classes.OS.mb_get_cache_dir = MethodBind.get("OS", "get_cache_dir", 201670096L)
    Ptrcall.call0[String](gdext.classes.OS.mb_get_cache_dir, livePtr)
  }

  /** OS.get_temp_dir */
  final def getTempDir(): String = {
    if (gdext.classes.OS.mb_get_temp_dir == null) gdext.classes.OS.mb_get_temp_dir = MethodBind.get("OS", "get_temp_dir", 201670096L)
    Ptrcall.call0[String](gdext.classes.OS.mb_get_temp_dir, livePtr)
  }

  /** OS.get_unique_id */
  final def getUniqueId(): String = {
    if (gdext.classes.OS.mb_get_unique_id == null) gdext.classes.OS.mb_get_unique_id = MethodBind.get("OS", "get_unique_id", 201670096L)
    Ptrcall.call0[String](gdext.classes.OS.mb_get_unique_id, livePtr)
  }

  /** OS.get_keycode_string */
  final def getKeycodeString(code: Long): String = {
    if (gdext.classes.OS.mb_get_keycode_string == null) gdext.classes.OS.mb_get_keycode_string = MethodBind.get("OS", "get_keycode_string", 2261993717L)
    Ptrcall.call1[Long, String](gdext.classes.OS.mb_get_keycode_string, livePtr, code)
  }

  /** OS.is_keycode_unicode */
  final def isKeycodeUnicode(code: Long): Boolean = {
    if (gdext.classes.OS.mb_is_keycode_unicode == null) gdext.classes.OS.mb_is_keycode_unicode = MethodBind.get("OS", "is_keycode_unicode", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.OS.mb_is_keycode_unicode, livePtr, code)
  }

  /** OS.find_keycode_from_string */
  final def findKeycodeFromString(string: String): Long = {
    if (gdext.classes.OS.mb_find_keycode_from_string == null) gdext.classes.OS.mb_find_keycode_from_string = MethodBind.get("OS", "find_keycode_from_string", 1084858572L)
    Ptrcall.call1[String, Long](gdext.classes.OS.mb_find_keycode_from_string, livePtr, string)
  }

  /** OS.set_use_file_access_save_and_swap */
  final def setUseFileAccessSaveAndSwap(enabled: Boolean): Unit = {
    if (gdext.classes.OS.mb_set_use_file_access_save_and_swap == null) gdext.classes.OS.mb_set_use_file_access_save_and_swap = MethodBind.get("OS", "set_use_file_access_save_and_swap", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.OS.mb_set_use_file_access_save_and_swap, livePtr, enabled)
  }

  /** OS.set_thread_name */
  final def setThreadName(name: String): Long = {
    if (gdext.classes.OS.mb_set_thread_name == null) gdext.classes.OS.mb_set_thread_name = MethodBind.get("OS", "set_thread_name", 166001499L)
    Ptrcall.call1[String, Long](gdext.classes.OS.mb_set_thread_name, livePtr, name)
  }

  /** OS.get_thread_caller_id */
  final def getThreadCallerId(): Long = {
    if (gdext.classes.OS.mb_get_thread_caller_id == null) gdext.classes.OS.mb_get_thread_caller_id = MethodBind.get("OS", "get_thread_caller_id", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.OS.mb_get_thread_caller_id, livePtr)
  }

  /** OS.get_main_thread_id */
  final def getMainThreadId(): Long = {
    if (gdext.classes.OS.mb_get_main_thread_id == null) gdext.classes.OS.mb_get_main_thread_id = MethodBind.get("OS", "get_main_thread_id", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.OS.mb_get_main_thread_id, livePtr)
  }

  /** OS.has_feature */
  final def hasFeature(tag_name: String): Boolean = {
    if (gdext.classes.OS.mb_has_feature == null) gdext.classes.OS.mb_has_feature = MethodBind.get("OS", "has_feature", 3927539163L)
    Ptrcall.call1[String, Boolean](gdext.classes.OS.mb_has_feature, livePtr, tag_name)
  }

  /** OS.is_sandboxed */
  final def isSandboxed(): Boolean = {
    if (gdext.classes.OS.mb_is_sandboxed == null) gdext.classes.OS.mb_is_sandboxed = MethodBind.get("OS", "is_sandboxed", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.OS.mb_is_sandboxed, livePtr)
  }

  /** OS.request_permission */
  final def requestPermission(name: String): Boolean = {
    if (gdext.classes.OS.mb_request_permission == null) gdext.classes.OS.mb_request_permission = MethodBind.get("OS", "request_permission", 2323990056L)
    Ptrcall.call1[String, Boolean](gdext.classes.OS.mb_request_permission, livePtr, name)
  }

  /** OS.request_permissions */
  final def requestPermissions(): Boolean = {
    if (gdext.classes.OS.mb_request_permissions == null) gdext.classes.OS.mb_request_permissions = MethodBind.get("OS", "request_permissions", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.OS.mb_request_permissions, livePtr)
  }

  /** OS.revoke_granted_permissions */
  final def revokeGrantedPermissions(): Unit = {
    if (gdext.classes.OS.mb_revoke_granted_permissions == null) gdext.classes.OS.mb_revoke_granted_permissions = MethodBind.get("OS", "revoke_granted_permissions", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.OS.mb_revoke_granted_permissions, livePtr)
  }

  /** OS.add_logger */
  final def addLogger(logger: Logger): Unit = {
    if (gdext.classes.OS.mb_add_logger == null) gdext.classes.OS.mb_add_logger = MethodBind.get("OS", "add_logger", 4261188958L)
    Ptrcall.callVoid1(gdext.classes.OS.mb_add_logger, livePtr, Wrappers.handle(logger))
  }

  /** OS.remove_logger */
  final def removeLogger(logger: Logger): Unit = {
    if (gdext.classes.OS.mb_remove_logger == null) gdext.classes.OS.mb_remove_logger = MethodBind.get("OS", "remove_logger", 4261188958L)
    Ptrcall.callVoid1(gdext.classes.OS.mb_remove_logger, livePtr, Wrappers.handle(logger))
  }

}

object OS {
  private[classes] var mb_get_system_ca_certificates: GDExtensionMethodBindPtr = null
  private[classes] var mb_open_midi_inputs: GDExtensionMethodBindPtr = null
  private[classes] var mb_close_midi_inputs: GDExtensionMethodBindPtr = null
  private[classes] var mb_alert: GDExtensionMethodBindPtr = null
  private[classes] var mb_crash: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_low_processor_usage_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_in_low_processor_usage_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_low_processor_usage_mode_sleep_usec: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_low_processor_usage_mode_sleep_usec: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_delta_smoothing: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_delta_smoothing_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_processor_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_processor_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_system_font_path: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_executable_path: GDExtensionMethodBindPtr = null
  private[classes] var mb_read_string_from_stdin: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_stdin_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_stdout_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_stderr_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_kill: GDExtensionMethodBindPtr = null
  private[classes] var mb_shell_open: GDExtensionMethodBindPtr = null
  private[classes] var mb_shell_show_in_file_manager: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_process_running: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_process_exit_code: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_process_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_environment: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_environment: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_environment: GDExtensionMethodBindPtr = null
  private[classes] var mb_unset_environment: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_distribution_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_version: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_version_alias: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_restart_on_exit_set: GDExtensionMethodBindPtr = null
  private[classes] var mb_delay_usec: GDExtensionMethodBindPtr = null
  private[classes] var mb_delay_msec: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_locale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_locale_language: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_model_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_userfs_persistent: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_stdout_verbose: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_debug_build: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_static_memory_usage: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_static_memory_peak_usage: GDExtensionMethodBindPtr = null
  private[classes] var mb_move_to_trash: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_user_data_dir: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_system_dir: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_config_dir: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_data_dir: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_cache_dir: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_temp_dir: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_unique_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_keycode_string: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_keycode_unicode: GDExtensionMethodBindPtr = null
  private[classes] var mb_find_keycode_from_string: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_file_access_save_and_swap: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_thread_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_thread_caller_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_main_thread_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_feature: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_sandboxed: GDExtensionMethodBindPtr = null
  private[classes] var mb_request_permission: GDExtensionMethodBindPtr = null
  private[classes] var mb_request_permissions: GDExtensionMethodBindPtr = null
  private[classes] var mb_revoke_granted_permissions: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_logger: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_logger: GDExtensionMethodBindPtr = null

  private var instance: OS = null

  /** The process-global OS singleton instance. */
  def singleton: OS = {
    if (instance == null)
      instance = Wrappers.borrowed[OS](GodotObject.fromPtr(
        Godot.interface.global_get_singleton(StringNames.cached("OS").ptr)))
    instance
  }
}
