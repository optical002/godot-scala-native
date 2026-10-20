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

```scala
val v = Vector3(1f, 0f, 0f)
val w = (v + Vector3(0f, 1f, 0f)).normalized * 2f
val d = v.distanceTo(w)
val step = v.moveToward(Vector3.zero, 0.1f)
```

- `Vector2`: `+`, `-`, `*`, `length`, `lengthSquared`, `moveToward`.
- `Vector3`: the above plus `/`, unary `-`, `dot`, `cross`, `normalized`,
  `distanceTo`, `distanceSquaredTo`, `limitLength`, `rotatedY`.
- `Basis`: `xform`, `*`, `transposed`, `determinant`, `inverse`, `identity`.
- `Transform3D`: `xform`, `*`, `affineInverse`, `identity`.

`gdext.api.Math.moveToward` provides Godot's scalar `move_toward`.

## `Arr[A]`

```scala
val tags: Arr[String] = Arr.empty[String]
tags.append("boss")
val first = tags(0)
tags.foreach(Gd.print)
```

The methods are `append`, `apply`, `size`, `isEmpty`, `iterator`, and `foreach`.
Node elements are written bare (`Arr[Enemy]`). Resource elements use
`Tres[T]`.

## `Dict[K, V]`

```scala
val byId: Dict[Int, String] = Dict.empty[Int, String]
byId.put(1, "one")
val one = byId(1)
```

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
- **Call `free()`** once you no longer need an array you created. Using it after
  `free()` throws.

## Memory notes

- The binding links the Boehm garbage collector, so Scala objects are collected
  as usual.
- Godot objects follow Godot's rules. `Resource` subclasses are
  reference-counted. Nodes are owned by the scene tree and freed with
  `queueFree()`, or with `free()` if they never entered the tree.
