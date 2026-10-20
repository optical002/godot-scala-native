# API (Scaladoc)

<!-- Raw HTML links: the Scaladoc is copied into site/api/ after `mkdocs build`,
     so MkDocs cannot see (or validate) it. This page is served at /reference/api/. -->
<a class="md-button md-button--primary" href="../../api/index.html">Open the Scaladoc</a>

The Scaladoc is generated from the binding's sources on every docs build. It
documents the current `main` branch, which may be ahead of the latest
release.

## Public packages

| Package | Contents |
|---------|----------|
| <a href="../../api/gdext/api$.html"><code>gdext.api</code></a> | Everyday helpers: `Gd.create`, `Gd.wrap`, `Gd.print`, `Tres`, `Tscn`, `Required`, `ExportHint`, `emitSignal`, `Math`. |
| <a href="../../api/gdext/annotations.html"><code>gdext.annotations</code></a> | `@func`, `@signal`, `@gdexport`, inspector sections, component-reference dropdowns. |
| <a href="../../api/gdext/builtin.html"><code>gdext.builtin</code></a> | Builtin value types: math types, `Color`, `Arr`, `Dict`, packed arrays. |
| <a href="../../api/gdext/classes.html"><code>gdext.classes</code></a> | About 1000 engine classes generated from Godot's `extension_api.json`. |

Everything under `gdext.internal` is an implementation detail. Much of it is
`private[gdext]`, so game code cannot reach it anyway.

## Engine class naming

Engine classes keep Godot's names. Methods are camelCase versions of Godot's
snake_case methods:

| Godot | Scala |
|-------|-------|
| `Node2D.set_position(pos)` | `setPosition(pos)` |
| `Node.queue_free()` | `queueFree()` |
| `FileAccess.get_file_as_string(path)` | `FileAccess.getFileAsString(path)` |

For what each engine method does, Godot's
[class reference](https://docs.godotengine.org/en/stable/classes/index.html)
is the authoritative source.
