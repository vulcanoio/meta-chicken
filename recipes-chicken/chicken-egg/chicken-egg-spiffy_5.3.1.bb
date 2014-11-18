SECTION = "devel/chicken"
DESCRIPTION = "A small but powerful web server"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://spiffy.meta;md5=a6ad4f7d1b9a61455c3c93df7f436b00"
DEPENDS_virtclass-cross += "chicken-egg-intarweb-cross chicken-egg-uri-common-cross chicken-egg-uri-generic-cross chicken-egg-sendfile-cross"
DEPENDS += "chicken-egg-intarweb chicken-egg-uri-common chicken-egg-uri-generic chicken-egg-sendfile chicken-egg-intarweb-cross chicken-egg-uri-common-cross chicken-egg-uri-generic-cross chicken-egg-sendfile-cross chicken-egg-spiffy-cross"
RDEPENDS_${PN} += "chicken-egg-intarweb chicken-egg-uri-common chicken-egg-uri-generic chicken-egg-sendfile"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "d09e81df879b68f556ae1c5538b631cb"
SRC_URI[sha256sum] = "e98ef57001a618489ca2c1ce7c238400749cca7786ec3ebde52234e92372fa56"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"