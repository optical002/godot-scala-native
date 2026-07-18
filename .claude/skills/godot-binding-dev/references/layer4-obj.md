# Layer 4 — object model (`engine/`, `ClassMeta`, `ClassTags`)

For holding/managing engine objects you fetch or construct. **There is no `Gd[T]`
smart pointer** (it was removed — a Rust-port overcomplication). An engine object
is held as **its plain wrapper type** (`Node2D`, `PlayerStats`, a user class);
every wrapper extends `GodotScriptClass`, which carries the engine handle and the
lifetime ops. A `null` reference is the absent / failed-cast sentinel.

## `GodotScriptClass` (`register/GodotScriptClass.scala`) — the hub
Root base of the whole hierarchy. Carries `_hostObject` (the handle) and:
- `hostObject`/`hostPtr` (raw handle), `withHost(ptr)` (rebind, fluent),
  `instanceId: InstanceId`, `godotClassName` (override; baked literal on engine
  wrappers, else `getClass.getSimpleName` — currently a convenience, unused).
- `isRefCounted = this.isInstanceOf[RefCounted]` (no typeclass field).
- **lifetime, plain members**: `free()` (`object_destroy`, no-op for RefCounted),
  `unref()` (RefCounted only), `refInc()` (take a strong ref; **named `refInc`,
  NOT `reference`, to avoid clashing with the generated
  `RefCounted.reference(): Boolean` engine method** — don't rename it back).
- `cast[U <: GodotScriptClass](using ClassMeta[U]): U` — `object_cast_to` + class
  tag; returns `null` on failed cast (real engine type check).
- object-Variant `given to/fromVariant[T <: GodotScriptClass]` live in `object
  GodotScriptClass` so implicit search finds them for **any** engine/user class
  (no import) — this is what lets `Arr[Enemy]`/`Dict[Int, Tres[Stats]]` work.
  `from` side preserves identity + `refInc()`s RefCounted payloads.

## `ClassMeta[T]` (`engine/ClassMeta.scala`) — the only residual typeclass
Slim: `{ className; fromHandle(ptr): T }` — all that's needed at a
handle→object boundary (cast/export-read/construct). **No instances are written
or generated**; a single `inline given derived[T <: GodotScriptClass]` macro
synthesizes one from the type: `className = T.simpleName`, `fromHandle = new
T{}.withHost(p)` (anonymous concrete subclass — works for abstract engine
wrappers), with the `boundInstance` identity check. The generator emits **no**
per-class given (was ~1024 `given GodotClass`). Summoned only at boundaries.

## Construction — `Gd.create` (facade in `api/Api.scala`)
The `Gd` **type** is gone; the **name `Gd` is reused as a facade object** in
`gdext.api` holding construction + logging:
- `Gd.create[T <: GodotScriptClass](parent: Option[Node] = None): T` — forwards
  to `engine/ObjectRef.construct[T]` (`classdb_construct_object2` + `init_ref` if
  RefCounted), optionally `addChild`s. Works for engine AND user classes.
- `Gd.print` / `printError` / `printWarning` — nested `object Printing` (the old
  `GodotPrint` logic verbatim; `GodotPrint.scala` was deleted). `gdext.Log` and
  `GodotEngine` call `gdext.api.Gd.print`.

## Identity preservation (kept — not a `Gd` artifact)
`ClassRegistry.instancesByObjectId` maps a Godot object id → the canonical Scala
instance Godot drives. `ClassMeta.boundInstance` consults it from `fromHandle`, so
fetching a live user node through an export returns THAT instance, not a fresh
wrapper. This survives `Gd`'s removal — keep it.

## Two lifetime regimes
- Manually-managed (Object/Node): `free()` → `object_destroy`. Scene-tree nodes
  are owned by their parent — don't free those.
- RefCounted (Resource): `Gd.create` calls `init_ref`; `unref()` drops; `refInc()`
  holds (called when a Resource is read out of an export Variant so it outlives
  Godot's temporary loader ref). `free()` is a no-op on RefCounted.

## `ClassTags.scala`
Caches `classdb_get_class_tag(name)` for `object_cast_to` (backs `cast`).
