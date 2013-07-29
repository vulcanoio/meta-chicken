SECTION = "devel/chicken"
DESCRIPTION = "A binding for libdbus, the IPC mechanism"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://dbus.meta;md5=896e5ddc25aac26d51da6b7b36c62897"
DEPENDS_virtclass-cross += "chicken-egg-easyffi-cross chicken-egg-matchable-cross chicken-egg-miscmacros-cross chicken-egg-foreigners-cross dbus-native"
DEPENDS += "chicken-egg-easyffi chicken-egg-matchable chicken-egg-miscmacros chicken-egg-foreigners dbus chicken-egg-easyffi-cross chicken-egg-matchable-cross chicken-egg-miscmacros-cross chicken-egg-foreigners-cross"
RDEPENDS_${PN} += "chicken-egg-easyffi chicken-egg-matchable chicken-egg-miscmacros chicken-egg-foreigners"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "cedbdb970aecb940b42b910c4743342b"
SRC_URI[sha256sum] = "0b10d4aa4f4f9c285cb80af3b951ac50791fa99db7a2c1d86f1312153f5bbe93"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"