SECTION = "devel/chicken"
DESCRIPTION = "High-level HTTP client library"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://http-client.meta;md5=48c836189a9c431d1be1b9d40c57799b"
DEPENDS_append_class-cross = " chicken-egg-intarweb-cross chicken-egg-uri-common-cross chicken-egg-message-digest-cross chicken-egg-md5-cross chicken-egg-string-utils-cross chicken-egg-sendfile-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-intarweb-crosssdk chicken-egg-uri-common-crosssdk chicken-egg-message-digest-crosssdk chicken-egg-md5-crosssdk chicken-egg-string-utils-crosssdk chicken-egg-sendfile-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-intarweb nativesdk-chicken-egg-uri-common nativesdk-chicken-egg-message-digest nativesdk-chicken-egg-md5 nativesdk-chicken-egg-string-utils nativesdk-chicken-egg-sendfile chicken-egg-intarweb-crosssdk chicken-egg-uri-common-crosssdk chicken-egg-message-digest-crosssdk chicken-egg-md5-crosssdk chicken-egg-string-utils-crosssdk chicken-egg-sendfile-crosssdk"
DEPENDS = " chicken-egg-intarweb chicken-egg-uri-common chicken-egg-message-digest chicken-egg-md5 chicken-egg-string-utils chicken-egg-sendfile chicken-egg-intarweb-cross chicken-egg-uri-common-cross chicken-egg-message-digest-cross chicken-egg-md5-cross chicken-egg-string-utils-cross chicken-egg-sendfile-cross"
RDEPENDS_${PN} = " chicken-egg-intarweb chicken-egg-uri-common chicken-egg-message-digest chicken-egg-md5 chicken-egg-string-utils chicken-egg-sendfile"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/http-client/http-client-${PV}.tar.gz"

SRC_URI[md5sum] = "d2205e4a075e8a32516154052ee34f0b"
SRC_URI[sha256sum] = "36eb656e2e157bb854b3977e1449cd1b65a0d964ef9f3d2a9934bdd831f4748a"

S = "${WORKDIR}/http-client-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
