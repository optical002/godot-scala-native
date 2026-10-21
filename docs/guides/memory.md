# Memory and object lifetimes

Scala code runs on a garbage collector. Godot objects do not. The binding
keeps the two apart, so the lifetime of a Godot object is always deterministic:
the GC never frees one and never decides when one dies.

| Kind | Who frees it | How |
|------|--------------|-----|
| Plain Scala values (math types, strings, collections) | the GC (Boehm) | automatically |
| Nodes in the scene tree | their parent | `queueFree()` on the node, or freeing the parent |
| Nodes outside the tree, other `Object`s | you | `free()` |
| `RefCounted` / `Resource` | the last reference | `unref()`, or [`Gd.scoped`](#gdscoped) |

## Wrappers

Each engine object has exactly one Scala wrapper. Fetching the same node twice
returns the same object, so `getChild(0, false) eq getChild(0, false)` is
`true`, and fetching a wrapper again allocates nothing. Engine methods return typed wrappers
(`getParent(): Node`, `getMesh(): Mesh`), or `null` when there is no object.

When the engine frees an object, its wrapper goes dead: calling an engine
method on it throws `NullPointerException` instead of crashing the process.

```scala
val n = Gd.create[Node3D]()
n.free()
n.getPosition() // throws NullPointerException: the engine object was freed
```

## `RefCounted` references

Engine methods whose return type is a `RefCounted` class (`ResourceLoader.load`,
`Resource.duplicate`, `DirAccess.open`, `MeshInstance3D.getMesh`, ...) hand you
a reference. So does `Gd.create` of a `RefCounted` class. The wrapper **owns**
that reference until you release it:

```scala
val tex = ResourceLoader.singleton.load("res://icon.svg", "", 1L).cast[Texture2D]
sprite.setTexture(tex)   // the sprite takes its own reference
tex.unref()              // release ours; the sprite keeps the texture alive
```

- `unref()` releases one owned reference, and destroys the object if it was
  the last one. It does nothing on a wrapper that owns no reference, so you
  cannot free an object the engine or another owner still uses.
- `refInc()` takes one more owned reference, for example to keep an
  `InputEvent` that `_input` gave you after the callback returns.
- Forgetting `unref()` leaks the object. It is never freed under you.

### `Gd.scoped`

`Gd.scoped { ... }` releases every reference adopted inside the block when the
block exits, even when it throws. `keep()` takes a reference out of the block,
and you own it from then on:

```scala
val mesh: ArrayMesh = Gd.scoped {
  val arrays = ResourceLoader.singleton.load("res://rock.tres", "", 1L)
  val built = Gd.create[ArrayMesh]()
  // ... fill `built` from `arrays` ...
  meshInstance.setMesh(built)  // the node holds its own reference
  built.keep()                 // and we keep ours past the block
}                              // `arrays` is released here
// later: mesh.unref()
```

Blocks nest. A reference belongs to the innermost block that is open when it
is adopted.

### Exported properties

Exported resource, scene, `Arr`, and `Dict` properties manage themselves:

- assigning a value (from the inspector, GDScript, or a loaded scene) takes a
  reference;
- replacing the value releases the old one;
- freeing the instance releases what its properties still hold.

Values read out of a container (`Arr` elements, `Dict` values, `Object.get`) are
borrowed: the container keeps them alive. Call `refInc()` on one you want to
keep past the container.

### Leak report

`Gc.stats.outstandingOwnedRefs` counts the references Scala currently owns.
When the extension shuts down with references still owned, the binding prints a
warning that names the classes:

```text
WARNING: 2 RefCounted reference(s) still owned by Scala at shutdown
(missing unref() or Gd.scoped): ArrayMesh x1, DirAccess x1
```

## Containers and packed arrays

`Arr`, `Dict`, and the `Packed*Array` types hold engine storage. They implement
`AutoCloseable`: call `free()` (or `close()`) when done, or use
`scala.util.Using`. Using one after `free()` throws. Exported container
properties are released for you, as described above.

## The garbage collector

The binding uses Boehm GC, stop-the-world and single-threaded. A collection
pauses the frame, so the less your per-frame code allocates, the rarer the
pauses. `gdext.api.Gc` gives you control:

| Call | Effect |
|------|--------|
| `Gc.collect()` | Collect now, e.g. on a loading screen or a level change |
| `Gc.disable()` / `Gc.enable()` | Pause automatic collections; calls nest |
| `Gc.paused { ... }` | Run a block with collections paused |
| `Gc.stats` | Heap size, total bytes allocated, collection count, owned references |

`Gc.totalAllocatedBytes` is monotonic, so the difference across a frame is
that frame's allocation.

The binding itself does not allocate on its hot paths: engine calls, signals,
`_process`, and GDScript calls into `@func` methods (see
[Performance](performance.md)). The usual game techniques apply to your own
code:

- preallocate, and reuse objects through pools instead of creating them every
  frame;
- prefer `while` loops and arrays over collection pipelines in per-frame code;
- avoid building strings every frame (`s"..."`, `Gd.print`);
- collect at moments a pause cannot be noticed.
