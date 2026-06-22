# godot-scala-native

A Scala Native language binding for [Godot](https://godotengine.org/) (a
GDExtension), targeting gdext-level sophistication.
Scala 3.8.1 / Scala Native 0.5.10 / Godot 4.6.1.

> Originally a personal experiment ("I'm not going to continue this project, if
> you feel inspired please copy this and continue implementing it"). The
> reusable binding is now packaged for Maven Central so downstream game projects
> can depend on it directly.

## Using the binding

The binding is published as an ordinary Scala Native library. In a Scala Native
project (`enablePlugins(ScalaNativePlugin)`), add:

```scala
libraryDependencies += "io.github.optical002" %%% "scala-native-gdextension" % "<version>"
```

`%%%` selects the Scala Native + Scala 3 build automatically; the
platform-specific native code is linked at your project's build time, so there
are no per-OS artifacts to pick. See `harness-scala/` for a complete example of
a game project consuming the binding (it uses a source `ProjectRef` because it
co-develops the binding, but a published `libraryDependencies` entry is the
drop-in equivalent).

## Repository layout

- `language-binding-scala/` — the reusable binding library. The `gdext` module
  (artifact `scala-native-gdextension`) is what gets published; the `igen`
  module is a codegen-only tool and is not published.
- `harness-scala/` — an example "game" project that depends on the binding and
  produces the GDExtension `.so`.
- `godot/` — the Godot project the built `.so` is loaded into.

See `CLAUDE.md` and `BUILD.md` for architecture and build/run details.

## Releasing (maintainers)

Publishing to Maven Central (Sonatype Central Portal) is automated via
`sbt-ci-release` and the `.github/workflows/release.yml` workflow. A release is
cut by pushing a semver tag:

```sh
git tag v0.1.0
git push origin v0.1.0
```

`sbt-dynver` turns the tag into the artifact version. The workflow runs
`sbt ci-release` in `language-binding-scala/`, which signs and uploads only the
`gdext` artifact.

### One-time setup

These cannot be scripted and must be done by the maintainer:

1. **Namespace** — register at the [Sonatype Central
   Portal](https://central.sonatype.com/) and verify the `io.github.optical002`
   namespace (GitHub-based verification against the `optical002` account).
2. **GPG key** — generate a key, publish the public key to a keyserver, and
   export the secret key (base64) for the `PGP_SECRET` secret.
3. **Central Portal token** — generate a user token (not the website login).
4. **GitHub Actions secrets** — set `PGP_SECRET`, `PGP_PASSPHRASE`,
   `SONATYPE_USERNAME`, `SONATYPE_PASSWORD` in the repo settings.

To verify packaging locally before a real release:

```sh
cd language-binding-scala
sbt gdext/publishLocalSigned   # inspect the generated POM under ~/.ivy2 / ~/.m2
```
