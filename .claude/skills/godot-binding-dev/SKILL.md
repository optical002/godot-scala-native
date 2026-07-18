---
name: godot-binding-dev
description: Working on the Scala Native ↔ Godot GDExtension binding in this workspace — the gdext library, the igen code generators, the sbt-godot-scala-native plugin, or harness-scala game classes. Use when touching Variant/GString/StringName/math-type marshalling, generated engine classes, Ptrcall or MethodBind, the FFI Interface, GodotScriptClass/ClassMeta/casting/refcounting, class registration macros (Register.auto, @func, @gdexport, @signal, ExportType, ExportHint, comp-enum dropdowns), RegistrationScan auto-discovery, the generated entry point, editor hot-reload, the godot_scala editor addon, publishing/JitPack/versioning, or when hitting segfaults, "Cannot get class", stale-NIR link errors, editor freezes on reload, or struct/sizeof/FFI crashes. Carries the co-development build order and an index of per-layer reference docs.
---

# Binding development

## Build order (non-negotiable)

`harness-scala` consumes the binding and plugin as **published artifacts** — there
is no source `ProjectRef`. So any change under `language-binding-scala/` (binding
code, generator, or plugin) must be republished before harness will see it:

```
cd language-binding-scala && sbt publishLocal   # gdext + plugin @ 0.1.6
cd harness-scala          && sbt godotBuild     # generate, compile, link, swap .so
```

Skipping the publish links the *previous* jar and shows up as a confusing runtime
failure, not a build error. The `check-publish-local` hook warns when binding
sources are newer than the last publish.

Other commands:

- `cd language-binding-scala && sbt igen/regenerate` — regenerate FFI, engine
  classes, and the node validation harness from the dumped API JSON.
- `cd harness-scala && sbt clean` — required after moving the entry symbol; stale
  `.nir` causes "multiple definition of godot_scala_init".
- `sbt --client "~godotBuild"` — what the editor addon runs for hot-reload.

To prove a change works, use the **godot-binding-verify** skill. A clean compile
is not proof.

## Never hand-edit (generated)

| Path | Regenerate with |
|---|---|
| `gdext/classes/` (~1025 files) | `igen/EngineClassGenerator.scala` → `sbt igen/regenerate` |
| `gdext/internal/ffi/` | `igen/InterfaceGenerator.scala` → `sbt igen/regenerate` |
| `godot/scala.gdextension` | plugin `godotManifest`; tune `godotLibName` / `godotCompatibilityMinimum` / `godotManifestName` |
| `game/GeneratedRegistrations.scala`, `game/GeneratedEntry.scala` | `RegistrationScan` (runs every compile) |
| `game/harness/Harness*.scala`, `godot/harness_manifest.json`, `godot/node_harness.tscn` | `igen/HarnessClassGenerator` → `sbt igen/regenerate` |

A `PreToolUse` hook blocks edits to the first three. When editing the editor
addon, change **both** the plugin's template resource and the installed copy in
`godot/addons/godot_scala/` — they differ only in `SBT_PROJECT_DIR`.

## Reference map

Read only what the task needs.

| Reference | Read when you need to… |
|---|---|
| [architecture.md](references/architecture.md) | understand modules, package layout, public-vs-internal surface, bootstrap, publishing |
| [conventions.md](references/conventions.md) | recall hard-won gotchas: struct writes, `sizeof`, the C ABI exception boundary, hot-reload protocol, logging split |
| [layer1-ffi.md](references/layer1-ffi.md) | touch the raw GDExtension FFI, interface loading, or `gdextension_interface.json` codegen |
| [layer2-builtin.md](references/layer2-builtin.md) | work on Variant, GString/StringName, math types, Array/Dictionary marshalling |
| [layer3-engine.md](references/layer3-engine.md) | work on generated engine classes or the engine-class generator |
| [layer4-obj.md](references/layer4-obj.md) | work on casting, refcounting, instance lifetime, `ClassMeta` (note: there is no `Gd[T]` smart pointer) |
| [layer5-register.md](references/layer5-register.md) | register user classes: macros, annotations, methods/properties/signals, export hints |

## Invariants worth restating

- Public surface is `gdext.api`, `gdext.classes`, `gdext.builtin`,
  `gdext.annotations`. Everything else is `gdext.internal.*`, much of it
  `private[gdext]` and compiler-enforced.
- Never let exceptions unwind across the C ABI — catch at the boundary.
- Dev version is `0.1.6`; releases are plain semver tags built by JitPack.

## Maintenance

When you change the project's structure or discover a new gotcha, update the
matching `references/*.md` — that is how a from-scratch session stays accurate.
Add binding and plugin changes to the topmost *Unreleased* section of the root
`CHANGELOG.md`.
