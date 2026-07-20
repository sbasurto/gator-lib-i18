#!/bin/bash
set -eu

msgfmt --source --java2 -d src/gator/lib/i18/ -r Messages -l es po/es/es.po
msgfmt --source --java2 -d src/gator/lib/i18/ -r Messages -l en po/en/en.po
sed -i '1s/^/package gator.lib.i18;\r\r/' src/gator/lib/i18/Messages_es.java
sed -i '1s/^/package gator.lib.i18;\r\r/' src/gator/lib/i18/Messages_en.java
./gradlew jar
