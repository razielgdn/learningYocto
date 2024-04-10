SUMMARY = "recipe for an image"
DESCRIPTION = "Custom image"
LICENSE = "MIT"
include recipes-core/images/core-image-base.bb

IMAGE_FEATURES += "nfs-server "
IMAGE_INSTALL += "\
rsync \
ntfs-3g-ntfsprogs \
"
#IMAGE_INSTALL += "tzdata-northamerica tzdata"
# Add ssh
IMAGE_FEATURES += "ssh-server-dropbear"

#Add support for wifi and bluetooth
IMAGE_INSTALL += "linux-firmware-bcm43430"

#Add mount.nfs
IMAGE_INSTALL += "nfs-utils"

#Add Network Manager
IMAGE_INSTALL += "networkmanager networkmanager-bash-completion networkmanager-nmtui" 
IMAGE_INSTALL += "vim"
IMAGE_INSTALL += "nano"
#Only produce the "rpi-sdimg" image format
IMAGE_FSTYPES = "rpi-sdimg"

#Remove old builds
RM_OLD_IMAGE = "1"

IMAGE_INSTALL:append = " systemd-analyze"
