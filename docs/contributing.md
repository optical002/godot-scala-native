# Contributing

This page is about working **on the binding itself**. To build a game, see
[Getting started](getting-started/install.md).

## Repository layout

The repository root is a workspace, not an sbt build. It has three siblings:

| Directory | What it is |
|-----------|------------|
| `language-binding-scala/` | The binding library (`gdext`), the code generators (`igen`), and the sbt plugin (`sbtGodotPlugin`). |
| `harness-scala/` | A separate sbt build that plays "someone's game project". It contains only game classes and consumes the binding as a **published** artifact. |
| `godot/` | The Godot project the harness library is loaded into, with the verification scripts. |

## Build loop

```sh
cd language-binding-scala && sbt publishLocal
```

```sh
cd harness-scala && sbt godotBuild
```

```sh
cd godot && godot --headless --path . --quit-after 5
```

`publishLocal` must run after **any** change in `language-binding-scala`.
Otherwise the harness links the previous jar. That produces a confusing runtime
failure, not a build error.

A clean `sbt` compile does not prove a change works. Only a clean headless run
does. Read the output, because exit code 0 is not enough.

## Verification scripts

Run them from `godot/`:

| Script | Covers |
|--------|--------|
| `verify.gd` | Core registration, methods, signals, properties |
| `export_verify.gd` | `@gdexport` round-trips, typed `Arr`/`Dict` defaults |
| `export_hints_verify.gd` | Export hints and inspector sections |
| `export_comp_verify.gd` | Component-reference dropdowns |
| `node_harness_verify.gd` | Every node type generates, subclasses, and registers |
| `slice_ragdoll_verify.gd` | Packed arrays, mesh arrays, ragdoll |

```sh
godot --headless --path . --script verify.gd
```

## Code generation

Engine classes (`gdext/classes/`) and the FFI layer (`gdext/internal/ffi/`) are
generated from `language-binding-scala/gdextension/extension_api.json` and
`gdextension_interface.json`. **Never edit generated code.** Change the
generator and regenerate:

```sh
cd language-binding-scala && sbt igen/regenerate
```

## Conventions

- Format with scalafmt.
- The public surface is `gdext.api`, `gdext.classes`, `gdext.builtin`, and
  `gdext.annotations`. Everything else lives in `gdext.internal`.
- Every binding or plugin change gets an entry under the topmost
  *Unreleased* section of `CHANGELOG.md`.

## Docs site

This site is built with [MkDocs Material](https://squidfunk.github.io/mkdocs-material/)
from `docs/` and deployed by `.github/workflows/docs.yml` on every push to `main`.
To preview it locally:

```sh
pip install -r docs/requirements.txt
```

```sh
mkdocs serve
```

The Scaladoc under `/api/` is produced by `sbt gdext/doc` and copied in by
the workflow. `mkdocs serve` does not include it.
