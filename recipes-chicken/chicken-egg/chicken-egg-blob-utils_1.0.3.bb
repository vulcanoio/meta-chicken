SECTION = "devel/chicken"
DESCRIPTION = "Blob Utilities"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://blob-utils.meta;md5=87426bbdce89b822db6138cec889179d"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross chicken-egg-string-utils-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk chicken-egg-string-utils-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper nativesdk-chicken-egg-string-utils chicken-egg-setup-helper-crosssdk chicken-egg-string-utils-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-string-utils chicken-egg-setup-helper-cross chicken-egg-string-utils-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper chicken-egg-string-utils"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/blob-utils/blob-utils-${PV}.tar.gz"

SRC_URI[md5sum] = "2a737bdafed9ec30d5177f06242a737d"
SRC_URI[sha256sum] = "ac4a7ed349dde12c10678eb1de4b77b7ca3c3adfda0d4e3b95be630ef9a5631c"

S = "${WORKDIR}/blob-utils-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
