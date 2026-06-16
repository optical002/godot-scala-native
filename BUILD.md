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
sbt igen/regenerate

# Compile, native-link, and copy the produced dynamic library into demo/lib/.
sbt gdext/build
```

`gdext/build` copies whatever Scala Native produced for the current OS
(`.so` / `.dylib` / `.dll`) into `demo/lib/`. Build on each target OS and
collect the three libraries into `demo/lib/` to ship a cross-platform extension;
the matching row in `demo/godot_scala.gdextension` selects the right one at load
time.

## Running the demo

Open `demo/` in Godot 4.5. On load, the extension writes an initialization line
to a `godot-init` log file in Godot's working directory (see `FileLogger`).
