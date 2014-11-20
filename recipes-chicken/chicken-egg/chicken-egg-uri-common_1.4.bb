SECTION = "devel/chicken"
DESCRIPTION = "Parser for common URI schemes"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://uri-common.meta;md5=3a68c19704242347487cce53495c1dc8"
DEPENDS_virtclass-cross += "chicken-egg-uri-generic-cross chicken-egg-defstruct-cross chicken-egg-matchable-cross"
DEPENDS += "chicken-egg-uri-generic chicken-egg-defstruct chicken-egg-matchable chicken-egg-uri-generic-cross chicken-egg-defstruct-cross chicken-egg-matchable-cross"
RDEPENDS_${PN} += "chicken-egg-uri-generic chicken-egg-defstruct chicken-egg-matchable"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "7e734503a52ab80b3bdb6eed59decf74"
SRC_URI[sha256sum] = "25c887bfb4b56572e02de7d9f9a21c34c5f0e21438912b135a42aa8d0e816b0b"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"