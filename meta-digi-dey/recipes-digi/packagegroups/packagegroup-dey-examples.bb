# Copyright (C) 2013 Digi International.

SUMMARY = "DEY examples packagegroup"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

PR = "r0"

inherit packagegroup

RDEPENDS_${PN} = "\
	dey-examples-adc \
	${@base_contains("MACHINE_FEATURES", "alsa", "dey-examples-alsa", "", d)} \
	dey-examples-gpio \
	dey-examples-gpio-sysfs \
	${@base_contains("MACHINE_FEATURES", "rtc", "dey-examples-rtc", "", d)} \
	dey-examples-spidev \
	${@base_contains("MACHINE_FEATURES", "alsa", "dey-examples-vplay", "", d)} \
	dey-examples-watchdog \
"

RDEPENDS_${PN}_append_mxs = "\
	${@base_contains("MACHINE_FEATURES", "bluetooth", "dey-examples-bt", "", d)} \
	${@base_contains("MACHINE_FEATURES", "bluetooth", "dey-examples-btconfig", "", d)} \
	dey-examples-can \
	${@base_contains("MACHINE_FEATURES", "bluetooth", "dey-examples-hdp", "", d)} \
"

RDEPENDS_${PN}_append_mx5 = "\
	${@base_contains("MACHINE_FEATURES", "accelerometer", "dey-examples-accelerometer", "", d)} \
	${@base_contains("MACHINE_FEATURES", "accel-graphics", "dey-examples-opengles", "", d)} \
	dey-examples-sahara \
	dey-examples-v4l2 \
"

RDEPENDS_${PN}_append_ccimx51js_mx5 = "\
	dey-examples-battery \
"

RDEPENDS_${PN}_append_ccimx53js_mx5 = "\
	dey-examples-can \
"

PACKAGE_ARCH = "${MACHINE_ARCH}"
