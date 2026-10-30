# Performance

The binding follows godot-cpp's design. Engine methods are called through
`ptrcall`, which passes arguments in their native layout rather than wrapping
them in Variants, and the math types are computed in Scala, with no engine
call.

## What a call costs

The numbers come from `godot/memory_verify.gd`, which measures Scala heap
bytes and time per operation over 20 000 calls (Linux x86_64, Godot 4.6.1).
"0.1.8" is the previous release, which always built in debug mode.

| Operation | 0.1.8 | 0.1.9 (`releaseFast`, default) | 0.1.9 (`debug`) |
|-----------|-------|------------------------|-----------------|
| `node.setPosition(v)` | 832 B, 1982 ns | **0 B, 33 ns** | 32 B, 130 ns |
| `node.getPosition()` | 832 B, 2090 ns | 32 B, 92 ns | 32 B, 114 ns |
| `node.getChild(0, false)` | 1072 B, 2467 ns | **0 B, 60 ns** | 64 B, 201 ns |
| `node.findChild("Child", ...)` (String argument) | 1760 B, 4934 ns | **0 B, 178 ns** | 96 B, 473 ns |
| `node.getName()` (StringName return) | 864 B, 2310 ns | **0 B, 56 ns** | 0 B, 83 ns |
| `Input.singleton` | 128 B, 282 ns | **0 B, 7 ns** | 0 B, 8 ns |
| `emitSignal` from Scala | 944 B, 2310 ns | **0 B, 102 ns** | 96 B, 334 ns |
| GDScript → Scala `@func` call | 2704 B, 5353 ns | **0 B, 100 ns** | 0 B, 119 ns |
| `process` dispatch, per node per frame | 130 B | **0 B** | 0 B |
| `((a + b) * 2f).dot(b)` on `Vector3` | 64 B, 43 ns | **0 B, 5 ns** | 64 B, 94 ns |
| `(t * t).xform(v)` on `Transform3D` | 448 B, 466 ns | 64 B, 92 ns | 96 B, 141 ns |

A call that returns a math value allocates exactly that value (a `Vector3` is
32 bytes, a `Transform3D` 64). Nothing else on these paths allocates.

Not yet allocation-free:

- Reading or writing an exported property from GDScript (`node.speed`,
  `node.speed = 3`) allocates on each access: 64 bytes for a `Long`, about
  200 bytes to set a `String`. `@func` methods called from GDScript allocate
  nothing. Prefer a `@func` for values GDScript reads every frame.
- Building a `String` returned from an engine call allocates the `String`.
- `debug` builds box some pointers (see the table above).

## How

- **Cached method binds.** Each engine method resolves its `MethodBind` once
  and keeps it in a field. Earlier releases looked it up in a map, under a string
  key built on every call.
- **Specialized marshalling.** Argument and return conversion is expanded at
  compile time for each method's exact types, so no primitive is boxed and no
  typeclass is involved. Strings are converted through a stack buffer as
  UTF-16.
- **One wrapper per object.** Wrappers are cached on the engine object itself
  (Godot's instance bindings), as godot-cpp does. Fetching an object again
  allocates nothing.
- **Callbacks without boxing.** `process`, `physicsProcess`, the input
  virtuals, and `@func` dispatch enter Scala through exported C functions
  that take plain integers, not through closures that box each argument.
- **Native math.** All 367 methods of the 16 math types, plus their operators
  and constants, are ported from Godot's `core/math`. A generated test
  (`godot/math_parity_verify.gd`, 604 checks over every method, member, and
  operator) compares each one with the engine on 25 random inputs. `Basis`,
  `Transform2D`, `Transform3D`, and `Projection` are stored flat, so a value
  is one object rather than four to six.
- **Optimized builds.** Projects build with Scala Native's optimizer
  (`releaseFast`) by default. The optimizer inlines the small operations and
  removes temporary objects, which is why `debug` builds allocate more.

## Build modes

`godotNativeMode` in `build.sbt` selects the Scala Native mode:

| Mode | Use it for | Notes |
|------|------------|-------|
| `releaseFast` (default) | development and shipping | Full optimizer. Links in about the same time as `debug` on the harness project. |
| `releaseFull` | final builds | More optimization, slower link. |
| `debug` | the fastest link, e.g. very large projects during hot reload | No optimizer: the zero-allocation results above do not hold. |

```scala title="build.sbt"
godotNativeMode := "debug"
```

## Build times

A code change rebuilds in three steps: the Scala compile, Scala Native's link
(NIR linking, optimizer, LLVM IR generation) and `clang`. The plugin keeps each
of them small:

- **Only the engine classes your game can observe are linked.** That is every
  engine class your sources (and godot-library dependencies) name, their
  parents, and every class their methods return. On a small game this is ~150
  of Godot's ~1000 classes, which roughly halves the optimizer's work. Turn it
  off with `godotTrimEngineClasses := false` if a dependency that is not a
  godot-library uses engine classes your own code never names.
- **Unchanged code is not recompiled to native code.** Editing one method
  recompiles that source directory only; adding a lambda or class renumbers
  only your own classes.
- **Editing a method body does not re-run class registration.**

Measured on the harness game without its test-harness classes (`releaseFast`,
16 cores, warm sbt server as used by the editor's `~godotBuild` watch): a
one-line edit takes 11–15 s end to end, of which 7–10 s is the native link.
Adding a lambda takes 12–16 s.

`debug` mode does not link faster for small edits: its optimizer runs in
parallel and does not produce identical output twice, so every native file is
recompiled on each build. Keep `releaseFast` for development.

The sbt server holds compiled library code between builds (~150 MB). With the
default 1 GB heap some of it is dropped and reloaded; giving sbt more memory
(`-J-Xmx2G` in `.sbtopts`) keeps all of it.

See [Memory and object lifetimes](memory.md) for the GC controls and for keeping
your own per-frame code free of allocations.
