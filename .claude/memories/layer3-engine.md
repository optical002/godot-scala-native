# Layer 3 — engine classes

Generated from `extension_api.json` by `igen/EngineClassGenerator.scala`.
Output: `gdext/.../codegen/engine/*.scala` (do not hand-edit).

## Shape (abstract-class model)
```scala
abstract class Node2D extends CanvasItem {
  final def setPosition(p: Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node2D","set_position",HASH), hostObject.objectPtr, p)
}
object Node2D { given GodotClass[Node2D] with { def className="Node2D"; def wrap(o)=new Node2D{}.withHost(...) ... } }
```
- Real Scala inheritance, rooted at `Object extends GodotScriptClass`
  (register package) which carries `hostObject` + virtuals + `withHost`.
- **Users `extend` these directly**: `class Player extends Node2D` inherits all
  methods + virtual override points.
- Methods dispatch via `Ptrcall` through `hostObject.objectPtr`.
- Object-typed args take the typed class (pass `.hostObject`); object-typed
  **returns yield raw `GodotObject`** (can't instantiate an abstract class).
- Singletons get `def singleton` (e.g. `Engine.singleton`).

## Runtime (`engine/`)
- `MethodBind.scala` — caches `classdb_get_method_bind(class,method,hash)`.
- `Ptrcall.scala` — `PtrArg`/`PtrRet` typeclasses + fixed-arity dispatchers
  (`callVoid0..6`, `call0..6`). **Dispatchers are NOT `inline`** (inlining caused
  a dotty crash). PtrArg/PtrRet givens cover: Long/Int/Bool/Double, String,
  StringName (handle), and all fixed-layout math builtins.

## Generator scope (now: ALL classes)
Generates **every** class in `extension_api.json` (~1023 files) — full type
universe so any object arg/return resolves, and every node/editor type is
available to subclass. `toGenerate = byName.keySet` (allowlist removed).
- Type map (`builtinScalar` + `isEnumLike`): primitives, String, StringName,
  and the math builtins → Scala types; `enum::`/`bitfield::` → **`Long`**
  (int64 on the ptrcall boundary); any generated class → object (passed as
  `hostObject`, returned as raw `GodotObject`).
- Method skipped if: vararg, static, virtual, no hash, **>6 args**, any
  arg/return type unmappable, or a universal Any/AnyRef name
  (`getClass`/`toString`/… — emitting crashes dotty).
- Method names + arg names backticked via `sanitize` (full Scala keyword set;
  Godot has args named `override`, etc.).
- Singletons read from the JSON `singletons` array → `def singleton`.
- Method emission is best-effort, not full GDScript parity: NodePath, typed
  arrays, Variant, Callable/Signal/RID, packed arrays are still unmapped →
  those methods are skipped. (Full GDScript API parity for a Harness subclass
  is still achieved engine-side: it's registered with the real base, so ClassDB
  exposes the base's whole method list.)
