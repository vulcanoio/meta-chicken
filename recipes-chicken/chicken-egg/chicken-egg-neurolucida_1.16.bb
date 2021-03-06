SECTION = "devel/chicken"
DESCRIPTION = "Output Neurolucida XML files in various formats."
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://neurolucida.meta;md5=59a7e3708888db06b1c6bf4a15df6705"
DEPENDS_append_class-cross = " chicken-egg-typeclass-cross chicken-egg-sxml-transforms-cross chicken-egg-sxpath-cross chicken-egg-ssax-cross chicken-egg-getopt-long-cross chicken-egg-digraph-cross chicken-egg-iset-cross chicken-egg-format-graph-cross chicken-egg-kd-tree-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-typeclass-crosssdk chicken-egg-sxml-transforms-crosssdk chicken-egg-sxpath-crosssdk chicken-egg-ssax-crosssdk chicken-egg-getopt-long-crosssdk chicken-egg-digraph-crosssdk chicken-egg-iset-crosssdk chicken-egg-format-graph-crosssdk chicken-egg-kd-tree-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-typeclass nativesdk-chicken-egg-sxml-transforms nativesdk-chicken-egg-sxpath nativesdk-chicken-egg-ssax nativesdk-chicken-egg-getopt-long nativesdk-chicken-egg-digraph nativesdk-chicken-egg-iset nativesdk-chicken-egg-format-graph nativesdk-chicken-egg-kd-tree chicken-egg-typeclass-crosssdk chicken-egg-sxml-transforms-crosssdk chicken-egg-sxpath-crosssdk chicken-egg-ssax-crosssdk chicken-egg-getopt-long-crosssdk chicken-egg-digraph-crosssdk chicken-egg-iset-crosssdk chicken-egg-format-graph-crosssdk chicken-egg-kd-tree-crosssdk"
DEPENDS = " chicken-egg-typeclass chicken-egg-sxml-transforms chicken-egg-sxpath chicken-egg-ssax chicken-egg-getopt-long chicken-egg-digraph chicken-egg-iset chicken-egg-format-graph chicken-egg-kd-tree chicken-egg-typeclass-cross chicken-egg-sxml-transforms-cross chicken-egg-sxpath-cross chicken-egg-ssax-cross chicken-egg-getopt-long-cross chicken-egg-digraph-cross chicken-egg-iset-cross chicken-egg-format-graph-cross chicken-egg-kd-tree-cross"
RDEPENDS_${PN} = " chicken-egg-typeclass chicken-egg-sxml-transforms chicken-egg-sxpath chicken-egg-ssax chicken-egg-getopt-long chicken-egg-digraph chicken-egg-iset chicken-egg-format-graph chicken-egg-kd-tree"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/neurolucida/neurolucida-${PV}.tar.gz"

SRC_URI[md5sum] = "cc217b048fbbe2a6db59059e0d4dfad5"
SRC_URI[sha256sum] = "0dce2f3e24e1836aa7eb4d5f76e691e6868f62bcebd84bdfc87f9c514424c08d"

S = "${WORKDIR}/neurolucida-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
