#
# Copyright (C) 2012 Digi International.
#
DESCRIPTION = "DBL busybox based image."

IMAGE_INSTALL = "packagegroup-dbl-core ${ROOTFS_PKGMANAGE_BOOTSTRAP} ${CORE_IMAGE_EXTRA_INSTALL}"

IMAGE_LINGUAS = " "

LICENSE = "MIT"

inherit core-image
inherit dey-image

INC_PR = "r0"
PR = "${INC_PR}"

# These features will move to the project's local.conf
# where they can be customized by platform.

# Only common features to remain here.
IMAGE_FEATURES += "ssh-server-dropbear"
IMAGE_FEATURES += "package-management"
IMAGE_FEATURES += "dey-network"

# Machine dependant features
IMAGE_FEATURES += '${@base_contains("MACHINE_FEATURES", "alsa", "dey-audio", "", d)}'
IMAGE_FEATURES += '${@base_contains("MACHINE_FEATURES", "accel-video", "dey-gstreamer", "", d)}'
IMAGE_FEATURES += '${@base_contains("MACHINE_FEATURES", "wifi", "dey-wireless", "", d)}'
IMAGE_FEATURES += '${@base_contains("MACHINE_FEATURES", "bluetooth", "dey-bluetooth", "", d)}'

IMAGE_ROOTFS_SIZE = "8192"

ROOTFS_POSTPROCESS_COMMAND += "dey_rootfs_tuning;"
