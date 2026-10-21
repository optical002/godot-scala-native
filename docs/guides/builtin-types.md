# Builtin types

Godot's builtin (non-object) types live in `gdext.builtin`. Scala primitives
and `String` convert automatically wherever the binding crosses into Godot:
properties, `@func` return values, and engine method arguments.

| Godot | Scala |
|-------|-------|
| `int` | `Int` / `Long` |
| `float` | `Float` / `Double` |
| `bool` | `Boolean` |
| `String` | `String` |
| `Color` | `Color(r, g, b, a = 1f)` |
| `Vector2`, `Vector3`, `Vector4` (+ `i` variants) | case classes of the same names |
| `Rect2`, `Rect2i`, `AABB`, `Plane`, `Quaternion` | case classes |
| `Basis`, `Transform2D`, `Transform3D`, `Projection` | case classes |
| `Array[T]` | `Arr[A]` |
| `Dictionary[K, V]` | `Dict[K, V]` |
| `PackedFloat32Array`, `PackedInt32Array`, `PackedVector3Array` | classes of the same names |

## Math types

Math types are immutable case classes. As in Godot, their components are
32-bit `Float`s (or `Int` for the `i` variants), so `Vector2(10f, -10f)`
needs float literals.

The whole engine API of the 16 math types is implemented in Scala, ported from
Godot's `core/math`: every method, operator, and constant. None of them call
into the engine, and a generated test checks each one against the engine's own
result. Names follow GDScript in camelCase. Methods without arguments take no
parentheses. Constants keep Godot's names.

```scala
val v = Vector3(1f, 0f, 0f)
val w = (v + Vector3.UP).normalized * 2f
val d = v.distanceTo(w)
val step = v.moveToward(Vector3.ZERO, 0.1f)
val q = Quaternion.fromEuler(Vector3(0f, GodotMath.Pi / 2, 0f))
val t = Transform3D.IDENTITY.rotated(Vector3.UP, 0.5f).translated(v)
val p = t * v                   // Transform3D * Vector3
val c = Color.CORNFLOWER_BLUE.lightened(0.2f)
```

- Operators are Scala operators: `+`, `-`, `*`, `/`, `%` (integer vectors),
  unary `-`, and the comparisons `<`, `<=`, `>`, `>=`, which compare
  lexicographically (`x` first, then `y`, ...) as in Godot.
- Arguments that are `int` in Godot are `Long`. Arguments and results that are
  `float` are `Float` (Godot's `real_t`).
- `intersect3`, `intersectsRay`, and `intersectsSegment` on `Plane` and `AABB`
  return `Option[Vector3]` where GDScript returns a `Variant` that may be `null`.
- `Basis`, `Transform2D`, `Transform3D`, and `Projection` are stored flat, one
  `Float` per element. Their fields are named by column, as GDScript
  names the axes: `basis.x` is the X axis `(xx, xy, xz)`, and
  `transform.origin` is `(ox, oy, oz)`. The `basis`, `origin`, and column
  accessors build the nested value when you ask for it.
- `GodotMath` has Godot's scalar helpers (`lerp`, `lerpAngle`, `snapped`,
  `fposmod`, `isEqualApprox`, `cubicInterpolate`, ...) in single precision.

!!! note "Changed in 0.1.9"
    `Basis(row0, row1, row2)` became `Basis.fromRows(...)`; `Basis(x, y, z)`
    now takes the columns, as GDScript's constructor does. Lowercase constants
    (`Vector3.zero`, `Basis.identity`, `Transform3D.identity`) are deprecated
    in favour of `ZERO` and `IDENTITY`.

`gdext.api.Math.moveToward` provides Godot's scalar `move_toward`.

## `Arr[A]`

```scala
val tags: Arr[String] = Arr.empty[String]
tags.append("boss")
val first = tags(0)
tags.foreach(Gd.print)
```

The methods are `append`, `apply`, `size`, `isEmpty`, `iterator`, `foreach`, and
`free`. An `Arr` you create yourself must be `free()`d; an exported `Arr`
property is released by the binding.
Node elements are written bare (`Arr[Enemy]`). Resource elements use
`Tres[T]`.

## `Dict[K, V]`

```scala
val byId: Dict[Int, String] = Dict.empty[Int, String]
byId.put(1, "one")
val one = byId(1)
byId.free()
```

A `Dict` you create must be `free()`d. An exported `Dict` property is released
by the binding.

## Packed arrays

`PackedFloat32Array`, `PackedInt32Array`, and `PackedVector3Array` are
heap-owned buffers. They are used by mesh and physics APIs such as
`Mesh.surfaceGetArrays` and `ArrayMesh.addSurfaceFromArrays`.

```scala
val weights = PackedFloat32Array.ofSize(4)
weights(0) = 1f
val all = weights.toSeq
weights.free()
```

- The methods are `size`, `resize`, `apply`, `update`, `isEmpty`, `iterator`,
  and `toSeq`.
- Indices are bounds-checked. An out-of-range index throws
  `IndexOutOfBoundsException`.
- **Call `free()`** (or `close()`; the type is `AutoCloseable`) once you no
  longer need an array you created. Using it after `free()` throws.

## Memory

Math values are plain Scala objects that the GC collects. `Arr`, `Dict`, and
packed arrays hold engine storage and are released with `free()`. See
[Memory and object lifetimes](memory.md).
