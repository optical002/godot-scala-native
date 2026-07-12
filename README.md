# godot-scala-native

[![Release](https://img.shields.io/jitpack/version/com.github.optical002/godot-scala-native?label=release&color=brightgreen)](https://jitpack.io/#optical002/godot-scala-native)

A Scala Native language binding for [Godot](https://godotengine.org/) (a
GDExtension), targeting gdext-level sophistication. Write your game classes in
Scala, extend Godot engine classes directly, and they are auto-registered —
compiled to a native library via [Scala Native](https://scala-native.org/).

## Quick start

Use the [giter8 template](https://github.com/optical002/godot-scala-native-template.g8)
— it scaffolds a ready-to-run Godot 4 + Scala project and carries the full
instructions:

```sh
sbt new optical002/godot-scala-native-template.g8
```

## Build dependencies

Building the GDExtension compiles Scala → Scala Native → LLVM/Clang → a native
dynamic library, so a native toolchain is required in addition to the JVM one:

| Dependency | Required version | Purpose |
|------------|------------------|---------|
| **JDK** | **17** (Temurin) | Runs sbt / the Scala toolchain. |
| **sbt** | launcher (project pins `1.9.7`) | Build tool; the launcher self-fetches the pinned sbt. |
| **LLVM / Clang** | **≥ 16** | Scala Native compiles through LLVM/Clang. |
| **C/C++ build tools** | Linux: `clang`+`lld` · macOS: Xcode CLT · **Windows: VS 2022 "Desktop development with C++"** | System toolchain Scala Native links against. |
| **Boehm GC** (`libgc` + `gc.h`, a.k.a. bdwgc) | any recent | The extension links `GC.boehm` (`-lgc`); the header/lib must be on clang's search path. |
| **Git** | any recent | Clone / tooling. |
| **Godot** | **4.6.x** (standard, not .NET) | Loads the built library. Not installed by the script below. |

### Windows — install the dependencies with one command

On a fresh Windows machine, run this in **PowerShell** to install everything
above except Godot:

```powershell
irm https://raw.githubusercontent.com/optical002/godot-scala-native/main/install-toolchain.ps1 | iex
```

It detects what's already present, skips it, and installs the rest via `winget`
(falling back to Scoop when winget is unavailable). Installs are idempotent, so
the command is safe to re-run. VS C++ Build Tools may prompt for admin. Boehm GC
is wired onto clang's search path automatically (persistent `C_INCLUDE_PATH` /
`LIBRARY_PATH`), so the build needs no manual environment setup — open a new
terminal afterwards so the updated variables take effect.

> **Note:** Boehm GC on Windows in Scala Native's multithreaded mode is a known
> upstream rough edge — the first `sbt godotBuild` is where the `.dll` link is
> confirmed.

On **Linux/macOS**, install the toolchain from the table via your package
manager (see [`BUILD.md`](BUILD.md) and the Scala Native
[setup guide](https://scala-native.org/en/stable/user/setup.html)).

## Artifacts

Released on [JitPack](https://jitpack.io/#optical002/godot-scala-native) under
the group `com.github.optical002.godot-scala-native`:

- `sbt-godot-scala-native` — the sbt plugin a game project adds (it injects
  everything else)
- `scala-native-gdextension` — the binding library itself

```scala
// project/plugins.sbt
resolvers += "jitpack" at "https://jitpack.io"
addSbtPlugin("com.github.optical002.godot-scala-native" % "sbt-godot-scala-native" % "<version>")
```

Companion game-development libraries (reactive cells, HOCON config, prefabs, …)
live in
[godot-scala-native-utilities](https://github.com/optical002/godot-scala-native-utilities).
