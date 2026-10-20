# Troubleshooting

Godot often exits with code 0 even when something went wrong. Read the output
and look for the messages below.

## `Cannot get class 'X'`

The class was not registered.

- Check the [registration rules](guides/classes.md#what-gets-registered). The
  class must be concrete, must reach an engine class, and every constructor
  parameter must be a `var` or have a default.
- Make sure `sbt godotBuild` finished and printed `[godot] swapped ...`.
- If the editor was open during the build, check the **Scala Hot Reload** dock.
  The reload may have failed.

## `Can't open dynamic library`

Godot cannot find or load the library.

- Run `sbt godotBuild` at least once. The library goes to `godot/.scala/`.
- `godot/scala.gdextension` must match `godotLibName`. Rebuild to regenerate it.
- On Linux, `ldd godot/.scala/libscala-native-gdextension.so` lists unresolved
  dependencies. A missing `libgc.so` means Boehm GC is not installed at runtime.

## Link error: `cannot find -lgc` or `gc.h: No such file`

Boehm GC is not on Clang's search path. Install it (see
[Install the toolchain](getting-started/install.md)), or export
`C_INCLUDE_PATH` and `LIBRARY_PATH` to its include and lib directories.

## Link error: unknown constructor or unreachable symbol

This happens after changing a class's constructor parameters, when stale
intermediate files are left behind. Run:

```sh
sbt clean godotBuild
```

The same fix applies to `multiple definition of godot_scala_init`.

## The scene shows broken UIDs or the class is missing on first open

A freshly scaffolded project needs its first import. Open it in the editor
once, or run:

```sh
godot --headless --path godot --import
```

## `Method already bound`

A `@func` maps to the same Godot name as a property accessor. For example,
`getHp` collides with the `get_hp` accessor of an exported `hp`. Rename the method.

## Crash after starting a `Thread`

Multithreading is disabled in the build. See the
[sbt plugin reference](reference/sbt-plugin.md#what-the-plugin-configures-for-you).
Keep game code on Godot's main thread.

## Collecting more information

- Game output: Godot's Output panel or stdout.
- Binding internals: `godot/.scala/log`.
- Verbose reload trace: create `godot/.scala/trace` or set `GODOT_SCALA_TRACE=1`.

If you are still stuck, open an
[issue](https://github.com/optical002/godot-scala-native/issues) with the
Godot version, your OS, and the log output.
