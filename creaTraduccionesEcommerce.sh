#!/bin/bash
set -eu

msgfmt --java2 -d src/ -r gator.lib.i18.EcommerceMessgaes -l es po/es/ecommerce_es.po
./gradlew jar
