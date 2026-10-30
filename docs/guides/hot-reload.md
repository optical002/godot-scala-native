# Editor hot reload

The generated `scala.gdextension` manifest is marked `reloadable`. Godot
therefore reloads the library whenever the file changes, and a running editor
picks up new classes, properties, and code without a restart.

## The `godot_scala` editor plugin

The first `sbt godotBuild` installs a GDScript editor plugin into
`godot/addons/godot_scala/` and enables it in `project.godot`. Projects from the
template ship with it already enabled. The plugin:

- starts a warm sbt watch (`sbt --client "~godotBuild"`) in your sbt project, so
  every save rebuilds and swaps the library;
- shows the build status and the reload status at the right edge of the
  editor's top bar;
- adds two bottom docks. **SBT Output** shows the colorized build log, and
  **Scala Hot Reload** shows Godot's GDExtension reload messages. Both have
  per-type filters.

Click the status group in the top bar to **Rebuild**, **Start**, **Restart**,
or **Stop** the sbt server.

`godotBuild` keeps the plugin current: when the `version` in
`addons/godot_scala/plugin.cfg` differs from the one bundled in the sbt plugin,
it rewrites the plugin's files (`plugin.cfg`, `scala_build.gd`, `icon.svg`,
`godot.svg`). Your edits to them are kept until the version changes, then
overwritten. Two constants at the top of `scala_build.gd` control it:

```gdscript
const SBT_PROJECT_DIR := "../scala"   # sbt project, relative to godot/
const SBT_EXECUTABLE := "sbt"         # on PATH, or an absolute path
```

!!! note
    If `project.godot` already has an `[editor_plugins]` section, the build
    does not edit it. Enable the plugin yourself in *Project Settings >
    Plugins*.

## Rebuild time

Each save relinks the native library. Projects build with Scala Native's
optimizer (`godotNativeMode := "releaseFast"`, the default). For a large project
where linking dominates the reload time, `godotNativeMode := "debug"` links
faster, at the cost of the zero-allocation hot path (see
[Performance](performance.md#build-modes)).

## Without the plugin

Run the watch in a terminal instead:

```sh
sbt "~godotBuild"
```

## How the swap stays safe

`godotBuild` writes the new library to a temporary file next to the old one and
then renames it into place. The editor may still have the old library mapped
into memory. A rename gives it a fresh file to reload, while the old one stays
valid until it is released. Overwriting in place would freeze the editor.

## Logs

- Messages from your game code go to Godot's Output panel and stdout.
- Messages from the binding's internals go to `godot/.scala/log`.
- The verbose reload trace is off by default. Create `godot/.scala/trace` or set
  `GODOT_SCALA_TRACE=1` to log each step with thread ids and timestamps.
