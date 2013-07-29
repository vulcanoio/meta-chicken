SECTION = "devel/chicken"
DESCRIPTION = "Generates bindings from C/C++ declarations"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://easyffi.meta;md5=9b730f55a507c69bf40165c4a45c91ce"
DEPENDS_virtclass-cross += "chicken-egg-silex-cross chicken-egg-matchable-cross chicken-egg-regex-cross chicken-egg-make-cross"
DEPENDS += "chicken-egg-silex chicken-egg-matchable chicken-egg-regex chicken-egg-make chicken-egg-silex-cross chicken-egg-matchable-cross chicken-egg-regex-cross chicken-egg-make-cross"
RDEPENDS_${PN} += "chicken-egg-silex chicken-egg-matchable chicken-egg-regex chicken-egg-make"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "24c0350dcb621ec1bf77cf94f03429f4"
SRC_URI[sha256sum] = "dbc038f6e06c45540a4e086baef9d8c049f9e4294cce8a3bbb2c600405f2e706"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"