SECTION = "devel/chicken"
DESCRIPTION = "Chicken bindings for the Imlib2 image library"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://imlib2.meta;md5=e46ef54b24e31d4669ee085ab438c38b"
DEPENDS_append_class-cross = " chicken-egg-foreigners-cross imlib2-native"
DEPENDS_append_class-crosssdk = " chicken-egg-foreigners-crosssdk imlib2-native"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-foreigners nativesdk-imlib2 chicken-egg-foreigners-crosssdk"
DEPENDS = " chicken-egg-foreigners imlib2 chicken-egg-foreigners-cross"
RDEPENDS_${PN} = " chicken-egg-foreigners"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/imlib2/imlib2-${PV}.tar.gz"

SRC_URI[md5sum] = "001f8a431476c50cf971ddb0d015271a"
SRC_URI[sha256sum] = "449d78524dca24ea79e37e92550046caf48b660ee900beac8ba11c8488eff498"

S = "${WORKDIR}/imlib2-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
