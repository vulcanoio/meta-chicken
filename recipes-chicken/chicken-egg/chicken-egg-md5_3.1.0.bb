SECTION = "devel/chicken"
DESCRIPTION = "Computes MD5 (RFC1321) checksums"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://md5.meta;md5=e0865fe3e39fbe1c7c495179f221c358"
DEPENDS_append_class-cross = " chicken-egg-message-digest-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-message-digest-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-message-digest chicken-egg-message-digest-crosssdk"
DEPENDS = " chicken-egg-message-digest chicken-egg-message-digest-cross"
RDEPENDS_${PN} = " chicken-egg-message-digest"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/md5/md5-${PV}.tar.gz"

SRC_URI[md5sum] = "cdae9f97031ea84edfdc25e46bc213c9"
SRC_URI[sha256sum] = "288d1818f892b3b1fdde8fdcf4504a7547491149aee342a7631b9dad31fcbf3f"

S = "${WORKDIR}/md5-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
