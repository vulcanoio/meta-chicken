SECTION = "devel/chicken"
DESCRIPTION = "Tool for analyzing log files to extract PASS/FAIL status"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://logpro.meta;md5=578ecd0626836a531318547abdc882d5"
DEPENDS_append_class-cross = " chicken-egg-format-cross chicken-egg-regex-cross chicken-egg-regex-literals-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-format-crosssdk chicken-egg-regex-crosssdk chicken-egg-regex-literals-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-format nativesdk-chicken-egg-regex nativesdk-chicken-egg-regex-literals chicken-egg-format-crosssdk chicken-egg-regex-crosssdk chicken-egg-regex-literals-crosssdk"
DEPENDS = " chicken-egg-format chicken-egg-regex chicken-egg-regex-literals chicken-egg-format-cross chicken-egg-regex-cross chicken-egg-regex-literals-cross"
RDEPENDS_${PN} = " chicken-egg-format chicken-egg-regex chicken-egg-regex-literals"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/logpro/logpro-${PV}.tar.gz"

SRC_URI[md5sum] = "bbff79dae143a6e70274e5edac08f2b0"
SRC_URI[sha256sum] = "c8244d69f8cac42913591fd74367a73cdda84c1b56d67cc4b76ef0f6d7a4f9cc"

S = "${WORKDIR}/logpro-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
