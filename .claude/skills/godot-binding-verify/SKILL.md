---
name: godot-binding-verify
description: Verify a change to the Scala Native Godot binding actually works by running the Godot project headless — the ONLY real proof, since a clean sbt compile or nativeLink proves nothing. Use after editing anything in language-binding-scala (gdext binding, igen generator, sbt-godot-scala-native plugin) or harness-scala game classes, and before committing or claiming a binding change works. Covers the publishLocal → godotBuild → headless-run order, which verify script to pick (verify.gd, export_verify.gd, export_hints_verify.gd, export_comp_verify.gd, node_harness_verify.gd, the hot-reload and comp-enum editor addons), and which error strings mean failure ("Cannot get class 'X'", missing library, registration failure).
---

# Verifying a binding change

**A clean `sbt` compile is not proof.** Compilation says the Scala typechecks; it
says nothing about whether the `.so` loads, classes register with Godot, or
ptrcall marshalling is correct. Only a clean headless run proves that.

## The loop

Always in this order — harness consumes *published* artifacts, so skipping step 1
after a binding change silently links the previous jar:

```
cd language-binding-scala && sbt publishLocal   # after ANY change here
cd harness-scala          && sbt godotBuild     # generates + native-links + swaps .so
cd godot && godot --headless --path . --quit-after 5
```

`godotBuild` also regenerates `godot/scala.gdextension` and installs the editor
addon. After moving the entry symbol, `cd harness-scala && sbt clean` first —
stale `.nir` gives "multiple definition of godot_scala_init".

## Which script proves what

Run from `godot/`. Scene runs use `--quit-after N`; script runs use `--script`.

| Script | Proves | Invocation |
|---|---|---|
| `verify.gd` | core registration, methods, signals, properties | `godot --headless --path . --script verify.gd` |
| `export_verify.gd` | `@gdexport` round-trips, typed `Arr`/`Dict` defaults | `--script export_verify.gd` |
| `export_hints_verify.gd` | export hints / ranges / enum hints reach the inspector | `--script export_hints_verify.gd` |
| `export_comp_verify.gd` | component-reference dropdown property lists | `--script export_comp_verify.gd` |
| `node_harness_verify.gd` | all ~238 node types generate + subclass + register; prints `HARNESS VALIDATION: PASS` | `--script node_harness_verify.gd` |
| `addons/hot_reload_verify/` | E2E editor hot-reload (edit → rebuild → reload → property visible) | `godot --headless -e -- verify-hot-reload` |
| `addons/comp_enum_verify/` | comp-enum dropdowns in a real editor session | `godot --headless --editor --path . -- verify-comp-enum` |

Pre-warm the hot-reload test with a `sbt godotBuild` first, or the cold sbt
server blows its timeout.

## Read the output — exit 0 is not enough

Godot exits 0 on plenty of failures. Scan stdout for:

- `Cannot get class 'X'` — the class never registered (registration failure, or
  the `.so` loaded an older image).
- `Can't open dynamic library` / missing library — the swap did not land, or
  `scala.gdextension` points at the wrong path/name.
- `ERROR:` / `SCRIPT ERROR:` — anything here is a failure even with exit 0.
- Silence where a self-test banner should be — the entry symbol never ran.

Logs split: binding internals → `godot/.scala/log` (file); game code → Godot's
Output/stdout. `GODOT_SCALA_TRACE=1` (or a `.scala/trace` file) turns on the
verbose reload trace with thread ids + ms timestamps.

## Scope limits

A headless *runtime* run cannot catch editor-only regressions — placeholder
handling, inspector plugin behaviour, and reload recreate paths only manifest in
an editor session. If the change touches registration flags (`is_runtime`),
editor integration, or anything under `EditorIntegration`, run the editor-context
addons above too; a passing scene run is not sufficient evidence there.
