#!/usr/bin/env bash

# Чтобы каждому разработчику не приходилось вручную выполнять команду подключения,
# После клонирования репозитория каждый разработчик выполняет один раз
# ./scripts/install-git-hooks.sh
# Теперь локальная проверка будет выполняться автоматически
set -euo pipefail

ROOT_DIR="$(git rev-parse --show-toplevel)"

cd "$ROOT_DIR"

chmod +x .githooks/pre-commit

git config core.hooksPath .githooks

echo "Git hooks installed successfully."
