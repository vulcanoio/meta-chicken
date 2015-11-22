SECTION = "devel/chicken"
DESCRIPTION = "Bindings to version 3.x of the SQLite API"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://sqlite3.meta;md5=6caf33d13bfd7b31de73796e10530444"
DEPENDS_append_class-cross = " chicken-egg-check-errors-cross chicken-egg-synch-cross chicken-egg-miscmacros-cross chicken-egg-matchable-cross chicken-egg-sql-null-cross sqlite3-native"
DEPENDS_append_class-crosssdk = " chicken-egg-check-errors-crosssdk chicken-egg-synch-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-matchable-crosssdk chicken-egg-sql-null-crosssdk sqlite3-native"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-check-errors nativesdk-chicken-egg-synch nativesdk-chicken-egg-miscmacros nativesdk-chicken-egg-matchable nativesdk-chicken-egg-sql-null chicken-egg-check-errors-crosssdk chicken-egg-synch-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-matchable-crosssdk chicken-egg-sql-null-crosssdk"
DEPENDS = " chicken-egg-check-errors chicken-egg-synch chicken-egg-miscmacros chicken-egg-matchable chicken-egg-sql-null sqlite3 chicken-egg-check-errors-cross chicken-egg-synch-cross chicken-egg-miscmacros-cross chicken-egg-matchable-cross chicken-egg-sql-null-cross"
RDEPENDS_${PN} = " chicken-egg-check-errors chicken-egg-synch chicken-egg-miscmacros chicken-egg-matchable chicken-egg-sql-null"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/sqlite3/sqlite3-${PV}.tar.gz"

SRC_URI[md5sum] = "3842aa0586c80538f3dca16b986d0427"
SRC_URI[sha256sum] = "46dc9991b5f476d713ab7eb2e701dd0bae80fc55bcf64ccfa891664dc21ba58f"

S = "${WORKDIR}/sqlite3-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
