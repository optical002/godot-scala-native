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
  (`callVoid0..2`, `call0..2`). **Dispatchers are NOT `inline`** (inlining caused
  a dotty crash).

## Generator scope
Curated `allowlist` (Object/Node/CanvasItem/Node2D/Sprite2D/Engine/RefCounted) +
inheritance closure. Skips: vararg, static, virtual, >2 args, unmapped types,
universal Any/AnyRef names (`getClass`/`toString`/… — emitting them crashes dotty).
Lifting `allowlist` generates more.
