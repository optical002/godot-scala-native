# Building the Scala Native Godot binding

## Prerequisites

- **JDK 17+** and **sbt 1.9.7** (the repo pins it via `project/build.properties`).
- A **Clang** toolchain — Scala Native compiles through LLVM/Clang.
- **Godot 4.5** (the bundled `gdextension/extension_api.json` is the 4.5 API;
  `compatibility_minimum` in the manifest is 4.2).

### Per-OS toolchain

| OS      | Toolchain                                              | Output file                         |
|---------|--------------------------------------------------------|-------------------------------------|
| Linux   | `clang`, `lld` (e.g. `apt install clang lld`)          | `libscala-native-gdextension.so`    |
| macOS   | Xcode Command Line Tools (`xcode-select --install`)    | `libscala-native-gdextension.dylib` |
| Windows | LLVM/Clang + MSVC build tools (or clang via MSYS2)     | `scala-native-gdextension.dll`      |

See the Scala Native [environment setup](https://scala-native.org/en/stable/user/setup.html)
for the canonical per-OS instructions.

## Common tasks

```sh
# Regenerate the Layer-1 FFI bindings from gdextension/gdextension_interface.json.
# Run this after editing the JSON or the InterfaceGenerator. Output lands under
# .../godot/codegen/gdextensioninterface/ and is a build artifact (never hand-edit).
cd language-binding-scala && sbt igen/regenerate

# Compile, native-link, and copy the produced dynamic library into godot/lib/.
cd harness-scala && sbt build
```

`harness-scala`'s `build` task copies whatever Scala Native produced for the
current OS (`.so` / `.dylib` / `.dll`) into `godot/lib/`. It pulls in the binding
library from `../language-binding-scala` via a source `ProjectRef`, so no
separate publish step is needed. Build on each target OS and collect the three
libraries into `godot/lib/` to ship a cross-platform extension; the matching row
in `godot/godot_scala.gdextension` selects the right one at load time.

## Running the godot project

Open `godot/` in Godot 4.5. On load, the extension writes an initialization line
to a `godot-init` log file in Godot's working directory (see `FileLogger`).
