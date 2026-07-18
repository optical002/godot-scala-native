#!/usr/bin/env bash
# PostToolUse | Edit|Write
# Reminds to log binding/plugin changes in CHANGELOG.md. Gated on git status so
# it goes quiet once the changelog has already been touched this working tree.
set -uo pipefail

p=$(jq -r '.tool_input.file_path // empty' 2>/dev/null) || exit 0
[ -n "$p" ] || exit 0

case "$p" in
  */language-binding-scala/modules/*) ;;
  *) exit 0 ;;
esac

# Don't nag about the generated/managed side.
case "$p" in
  */target/*) exit 0 ;;
esac

root="${CLAUDE_PROJECT_DIR:-$(pwd)}"
cd "$root" 2>/dev/null || exit 0

if git diff --name-only HEAD 2>/dev/null | grep -q '^CHANGELOG\.md$'; then
  exit 0   # already updated — stay quiet
fi

echo "REMINDER: binding/plugin change — add an entry under the topmost '## [0.1.3-SNAPSHOT] — Unreleased' section of CHANGELOG.md." >&2
exit 0
