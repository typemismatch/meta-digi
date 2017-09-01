# Copyright (C) 2016, 2017 Digi International

require recipes-kernel/linux/linux-dey.inc
require recipes-kernel/linux/linux-dtb.inc

SRC_URI_append_ccimx6ul = " \
    file://0001-mfd-Add-Raspberry-Pi-Sense-HAT-core-driver.patch \
    file://0002-ARM-dts-ccimx6ulstarter-sbc-add-support-for-Sense-HA.patch \
"

SRCBRANCH = "v4.1/dey-2.2/maint"
SRCREV = "f1a146c22d8c4e82ab8f3c51bf7efffa7653c458"

COMPATIBLE_MACHINE = "(ccimx6$|ccimx6ul)"
