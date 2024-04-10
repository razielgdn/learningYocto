DESCRIPTION = "Example to learn how to use a helloworld application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
SRC_URI = "file://hello.c"
#SRCREV = ""
S = "${WORKDIR}"

do_compile(){
    # Your code here
                ${CC} hello.c -o hello ${LDFLAGS}
}
do_install(){
    # Your code here
            install -d ${D}${bindir}
            install -m 0777 hello ${D}${bindir}/
}

