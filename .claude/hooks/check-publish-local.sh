#!/usr/bin/env bash
# PreToolUse | Bash
# Warns when harness is about to link a stale binding artifact. Filesystem-truth
# based: compares newest binding source against newest locally published jar.
# Warn-only (exit 0 with stderr) — the check is heuristic and harness-only edits
# are legitimately fine.
set -uo pipefail

cmd=$(jq -r '.tool_input.command // empty' 2>/dev/null) || exit 0
case "$cmd" in *godotBuild*) ;; *) exit 0 ;; esac

root="${CLAUDE_PROJECT_DIR:-$(pwd)}"
mods="$root/language-binding-scala/modules"
ivy="$HOME/.ivy2/local/com.github.optical002.godot-scala-native"

[ -d "$mods" ] || exit 0

newest_src=$(find "$mods" \( -name '*.scala' -o -name '*.sbt' -o -name '*.gd' -o -name '*.cfg' \) \
  -not -path '*/target/*' -printf '%T@\n' 2>/dev/null | sort -rn | head -1)

if [ ! -d "$ivy" ]; then
  echo "NOTE: no local publish of com.github.optical002.godot-scala-native found. Run: cd language-binding-scala && sbt publishLocal (0.1.3-SNAPSHOT) before godotBuild." >&2
  exit 0
fi

newest_pub=$(find "$ivy" -name '*.jar' -printf '%T@\n' 2>/dev/null | sort -rn | head -1)

if [ -n "${newest_src:-}" ] && [ -n "${newest_pub:-}" ]; then
  if [ "${newest_src%.*}" -gt "${newest_pub%.*}" ]; then
    echo "STALE ARTIFACT WARNING: language-binding-scala sources are newer than the last publishLocal. harness-scala consumes PUBLISHED artifacts, so godotBuild would link the old jar. Run first: cd language-binding-scala && sbt publishLocal" >&2
  fi
fi

exit 0
