SECTION = "devel/chicken"
DESCRIPTION = "A slicer procedure for lists, strings and vectors"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://slice.meta;md5=caa490b6ba57cd7b34ae5f6f3c83cff4"
DEPENDS_append_class-cross = " chicken-egg-utf8-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-utf8-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-utf8 chicken-egg-utf8-crosssdk"
DEPENDS = " chicken-egg-utf8 chicken-egg-utf8-cross"
RDEPENDS_${PN} = " chicken-egg-utf8"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/slice/slice-${PV}.tar.gz"

SRC_URI[md5sum] = "8e95bdc736bda64b4e5e6b879ce9c668"
SRC_URI[sha256sum] = "ae7f87057f268ec1a97972744332ce0e6ff3e287879abf21bb38ac84ebbf67c6"

S = "${WORKDIR}/slice-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
