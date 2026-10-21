# Layer 3 — engine classes

Generated from `extension_api.json` by `igen/EngineClassGenerator.scala`.
Output: `gdext/.../classes/*.scala`, package **`gdext.classes`** (do not hand-edit).
Consumers import engine classes from `gdext.classes` (e.g. `import
gdext.classes.Node2D`).

## Shape (abstract-class model)
```scala
abstract class Node extends Object {
  final def getChild(idx: Long, include_internal: Boolean): Node = {
    if (gdext.classes.Node.mb_get_child == null) gdext.classes.Node.mb_get_child = MethodBind.get("Node", "get_child", HASH)
    Wrappers.borrowed[Node](Ptrcall.call2[Long, Boolean, Long](gdext.classes.Node.mb_get_child, livePtr, idx, include_internal))
  }
}
object Node { private[classes] var mb_get_child: GDExtensionMethodBindPtr = null; ... }
```
- Real Scala inheritance, rooted at `Object extends GodotScriptClass`
  (register package) which carries the handle + virtuals.
- **Users `extend` these directly**: `class Player extends Node2D`.
- **Bind per method**: a null-checked `private[classes] var mb_<godot_name>`
  in the companion, resolved once via `MethodBind.get` (cold path). Never call
  `MethodBind.get` per call (it built a string key + closure: ~400 B/call).
- Instance is `livePtr` (throws NPE on a dead/unbound wrapper); statics pass a
  null instance and live in the companion.
- **Object returns are typed**: `Ptrcall.callN[..., Long]` reads the pointer as
  an address, then `Wrappers.borrowed[T](addr)` (`Object*`) or
  `Wrappers.owned[T](addr)` (`Ref<T>`, i.e. the return class derives from
  `RefCounted`; adopts the +1 the engine hands over — verified by
  `memory_verify.gd`'s `ref counts after Ref<T> returns: load=1 duplicate=1`).
- Object args: `Wrappers.handle(x)` (null-safe).
- Singletons: `def singleton` cached in a companion `var`.
- `ClassFactory.scala` (generated, one `case "Name" => new Name {}` per class):
  `Wrappers` builds the most-derived wrapper on first sight of an object.

## Runtime (`internal/engine/`)
- `MethodBind.scala` — `get` (cold, string-keyed cache) + `CachedBind` for
  hand-written callers.
- `Ptrcall.scala` — `Marshal.size/write/release/read[A]` are `inline` +
  `erasedValue` matches (no typeclasses, no boxing); `Ptrcall.callVoidN/callN`
  are `inline`; `invoke` is `inline` (a stack buffer passed to a non-inline
  method gets boxed). `release` destroys temp String args after the call.
  `read[StringName]` interns via `StringNames.adopt`.
- `Wrappers.scala` — instance-binding cache (see layer4-obj).

## Generator scope (ALL classes)
Generates **every** class in `extension_api.json` (~1024 files + ClassFactory).
- Type map (`builtinScalar` + `isEnumLike`): primitives, String, StringName,
  and the math builtins → Scala types; `enum::`/`bitfield::` → **`Long`**;
  any generated class → its wrapper type.
- Method skipped if: vararg, virtual, no hash, **>6 args**, any arg/return
  type unmappable, or a universal Any/AnyRef name (`getClass`/`toString`/… —
  emitting crashes dotty). Statics are emitted (71).
- Method names + arg names backticked via `sanitize`.
- Unmapped (methods skipped): NodePath, typed arrays, Variant, Callable/Signal/
  RID, packed arrays.

## Engine gotchas found via slice_ragdoll_verify.gd (Godot 4.6.1)
- `MeshInstance3D.bake_mesh_from_current_skeleton_pose` reads bone transforms
  from the RenderingServer: under `--headless` (dummy renderer) the skeleton RID
  is invalid, it errors and returns null. Skin on the CPU instead
  (`Skin.getBindPose` x `Skeleton3D.getBoneGlobalPose`).
- Since 4.3, SkeletonModifier3D results (incl. `PhysicalBoneSimulator3D`) are
  transient: after the frame `get_bone_pose`/`get_bone_global_pose` return the
  pre-modifier (animation) pose. Read the ragdoll pose inside the simulator's
  `modification_processed` signal.
- `physical_bones_start_simulation` with only unknown bone names simulates all.
- Hand-written extras (`classes/EngineExtras.scala`, the one hand-written file
  in `classes/`; the edit hook blocks Edit/Write there, so change it with care)
  route through `Ptrcall.invoke` and `liveObject(self)`. Generated wrappers
  guard via `livePtr`; statics use a null instance.
