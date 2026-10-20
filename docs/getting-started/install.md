# Install the toolchain

Building a game library compiles Scala to Scala Native, then through
LLVM/Clang to a native dynamic library. You need the JVM toolchain to run the
build and a native toolchain to link the result.

| Dependency | Version | Purpose |
|------------|---------|---------|
| JDK | 17 (Temurin recommended) | Runs sbt and the Scala compiler. |
| sbt | any launcher | Build tool. Each project pins its own sbt version. |
| LLVM / Clang | 16 or newer | Scala Native compiles through Clang. |
| C/C++ build tools | see tabs below | System toolchain Scala Native links against. |
| Boehm GC (`libgc` + `gc.h`) | any recent | The library links the Boehm garbage collector (`-lgc`). |
| Godot | 4.6.x, standard build | Loads the built library. The .NET build is not needed. |

=== "Linux"

    Install Clang, LLD, and Boehm GC from your package manager.

    ```sh
    sudo apt install clang lld libgc-dev
    ```

    On Fedora use `clang lld gc-devel`. On Arch use `clang lld gc`.

    Install JDK 17 and sbt via [SDKMAN!](https://sdkman.io/) or your
    distribution, and download Godot 4.6 from
    [godotengine.org](https://godotengine.org/download).

=== "macOS"

    ```sh
    xcode-select --install
    ```

    ```sh
    brew install llvm bdw-gc sbt openjdk@17
    ```

    If Clang cannot find `gc.h`, point it at Homebrew's prefix:

    ```sh
    export C_INCLUDE_PATH="$(brew --prefix bdw-gc)/include"
    export LIBRARY_PATH="$(brew --prefix bdw-gc)/lib"
    ```

=== "Windows"

    Run this in PowerShell to install everything except Godot and Boehm GC:

    ```powershell
    irm https://raw.githubusercontent.com/optical002/godot-scala-native/main/install-toolchain.ps1 | iex
    ```

    The script detects what is already installed and uses `winget`, falling back
    to Scoop. It installs JDK 17, sbt, LLVM/Clang, the Visual Studio 2022
    "Desktop development with C++" build tools, and Git. Re-running it is safe.
    The Visual Studio step may prompt for admin rights.

    !!! warning "Boehm GC must be installed manually"
        The script currently fails at the Boehm GC step. Install `bdwgc` yourself,
        for example with [vcpkg](https://vcpkg.io):

        ```powershell
        vcpkg install bdwgc:x64-windows
        ```

        Then set `C_INCLUDE_PATH` to the folder containing `gc.h` and
        `LIBRARY_PATH` to the folder containing the library, so Clang can find
        them. Your first `sbt godotBuild` is where the `.dll` build is confirmed.

## Non-standard install locations

The build does not hard-code any install prefix. Boehm GC must be on the
standard search paths of Clang and the linker. If it lives elsewhere (for
example a Nix store path), export these before building:

- `C_INCLUDE_PATH`: the directory holding `gc.h`
- `LIBRARY_PATH`: the directory holding `libgc.*`

See the Scala Native
[environment setup guide](https://scala-native.org/en/stable/user/setup.html)
for the canonical per-OS instructions.

## Check your setup

```sh
java -version
```

```sh
clang --version
```

```sh
godot --version
```

Next: [Create a project](new-project.md).
