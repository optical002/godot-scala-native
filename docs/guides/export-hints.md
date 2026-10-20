# Export hints and sections

## Hints

`@gdexport` takes an optional `ExportHint`, the counterpart of GDScript's
`@export_range`, `@export_file`, and so on:

```scala
import gdext.classes.Node
import gdext.builtin.Color
import gdext.annotations.*
import gdext.api.*

final class ExportTest extends Node {
  @gdexport(ExportHint.range(0, 100)) var health: Int = 100
  @gdexport(ExportHint.range(0, 999, 1, "or_greater")) var damage: Int = 10
  @gdexport(ExportHint.range(0.0, 1.0, 0.01)) var ratio: Double = 0.5
  @gdexport(ExportHint.expEasing()) var falloff: Double = 1.0
  @gdexport(ExportHint.multiline) var bio: String = ""
  @gdexport(ExportHint.locale) var language: String = "en"
  @gdexport(ExportHint.file("*.png")) var icon: String = ""
  @gdexport(ExportHint.dir) var folder: String = ""
  @gdexport(ExportHint.globalFile("*.txt")) var externalFile: String = ""
  @gdexport(ExportHint.globalDir) var externalFolder: String = ""
  @gdexport(ExportHint.colorNoAlpha) var solidTint: Color = Color(1, 1, 1, 1)
}
```

| Factory | GDScript equivalent |
|---------|---------------------|
| `range(min, max, step, flags*)` | `@export_range` (flags such as `"or_greater"`, `"or_less"`, `"suffix:px"`) |
| `expEasing()` | `@export_exp_easing` |
| `multiline` | `@export_multiline` |
| `file(filter)` / `dir` | `@export_file` / `@export_dir` |
| `globalFile(filter)` / `globalDir` | `@export_global_file` / `@export_global_dir` |
| `locale` | locale picker |
| `colorNoAlpha` | `@export_color_no_alpha` |

## Inspector sections

Put `@exportCategory`, `@exportGroup`, or `@exportSubgroup` on a `@gdexport`
field. The section starts at that property and covers every property declared
after it, just like in GDScript.

```scala
final class Weapon extends Node {
  @exportCategory("Numbers")
  @gdexport var damage: Int = 10

  @exportGroup("Appearance")
  @gdexport var tint: Color = Color(1, 1, 1, 1)

  @exportSubgroup("Advanced")
  @gdexport(ExportHint.colorNoAlpha) var solidTint: Color = Color(1, 1, 1, 1)
}
```

`@exportGroup(name, prefix)` and `@exportSubgroup(name, prefix)` also accept
Godot's optional prefix.

## Component-reference dropdowns

These annotations turn a `String` property into a dropdown. Its options are read
at inspect time from another exported property on the same class:

| Annotation | Options come from |
|------------|-------------------|
| `@exportBoneName(comp)` | bones of a `Skeleton3D` |
| `@exportAnimation(comp)` | animations of an `AnimationPlayer` / `AnimationMixer` |
| `@exportSpriteAnimation(comp)` | animation names of a `SpriteFrames` |
| `@exportAnimationProperty(comp)` | `parameters/...` paths of an `AnimationTree` |
| `@exportAnimationStateName(comp)` | states of an `AnimationTree`'s root state machine |
| `@exportAnimationStateProperty(comp, state)` | parameters under the state named by the `state` field |
| `@exportAnimationStateNode(comp, state)` | sub-nodes of that state's blend tree |

```scala
final class Rig extends Node {
  @gdexport var skeleton: Skeleton3D = null
  @exportBoneName("skeleton") @gdexport var boneName: String = ""

  @gdexport var stateTree: AnimationTree = null
  @exportAnimationStateName(nameOf(stateTree)) @gdexport var stateName: String = ""
  @exportAnimationStateProperty(nameOf(stateTree), nameOf(stateName))
  @gdexport var stateParam: String = ""
}
```

- `comp` is the Scala name of the sibling field. In a class body,
  `nameOf(field)` checks that name at compile time and keeps it correct
  through renames. On `var` constructor parameters, use a string literal.
- A node class that uses any of these annotations registers as a *tool* class,
  so the dropdowns work in the editor. Guard any `_process` logic that should
  not run in the editor.
