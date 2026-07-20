# gator-lib-i18

Runtime translation bundles used by Gator Java applications.

The artifact provides `gator.lib.i18.Messages_es` and
`gator.lib.i18.Messages_en`. Translation sources live under `po/`; regenerate
the Java bundles with `./creaTraducciones.sh` when GNU gettext is installed.

Requires Java 21. Build and verify with:

```bash
./gradlew clean check jar
```

Licensed under GPL-3.0-or-later; see [LICENSE](LICENSE) and [NOTICE](NOTICE).
