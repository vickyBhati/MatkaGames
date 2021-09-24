package com.dev.goldengames.model;

import androidx.annotation.NonNull;

import java.util.List;

public class Modelgame {

    /**
     * status : 1
     * data : 1
     * message : Game options fetched successfully.
     * value : {"balance":"4620.00","single":[{"name":0,"value":10},{"name":1,"value":1},{"name":2,"value":2},{"name":3,"value":3},{"name":4,"value":4},{"name":5,"value":5},{"name":6,"value":6},{"name":7,"value":7},{"name":8,"value":8},{"name":9,"value":9}],"jodi":[{"name":0,"value":231},{"name":1,"value":232},{"name":2,"value":233},{"name":3,"value":234},{"name":4,"value":235},{"name":5,"value":236},{"name":6,"value":237},{"name":7,"value":238},{"name":0,"value":239},{"name":0,"value":240},{"name":10,"value":241},{"name":11,"value":242},{"name":12,"value":243},{"name":13,"value":244},{"name":14,"value":245},{"name":15,"value":246},{"name":16,"value":247},{"name":17,"value":248},{"name":18,"value":249},{"name":19,"value":250},{"name":20,"value":251},{"name":21,"value":252},{"name":22,"value":253},{"name":23,"value":254},{"name":24,"value":255},{"name":25,"value":256},{"name":26,"value":257},{"name":27,"value":258},{"name":28,"value":259},{"name":29,"value":260},{"name":30,"value":261},{"name":31,"value":262},{"name":32,"value":263},{"name":33,"value":264},{"name":34,"value":265},{"name":35,"value":266},{"name":36,"value":267},{"name":37,"value":268},{"name":38,"value":269},{"name":39,"value":270},{"name":40,"value":271},{"name":41,"value":272},{"name":42,"value":273},{"name":43,"value":274},{"name":44,"value":275},{"name":45,"value":276},{"name":46,"value":277},{"name":47,"value":278},{"name":48,"value":279},{"name":49,"value":280},{"name":50,"value":281},{"name":51,"value":282},{"name":52,"value":283},{"name":53,"value":284},{"name":54,"value":285},{"name":55,"value":286},{"name":56,"value":287},{"name":57,"value":288},{"name":58,"value":289},{"name":59,"value":290},{"name":60,"value":291},{"name":61,"value":292},{"name":62,"value":293},{"name":63,"value":294},{"name":64,"value":295},{"name":65,"value":296},{"name":66,"value":297},{"name":67,"value":298},{"name":68,"value":299},{"name":69,"value":300},{"name":70,"value":301},{"name":71,"value":302},{"name":72,"value":303},{"name":73,"value":304},{"name":74,"value":305},{"name":75,"value":306},{"name":76,"value":307},{"name":77,"value":308},{"name":78,"value":309},{"name":79,"value":310},{"name":80,"value":311},{"name":81,"value":312},{"name":82,"value":313},{"name":83,"value":314},{"name":84,"value":315},{"name":85,"value":316},{"name":86,"value":317},{"name":87,"value":318},{"name":88,"value":319},{"name":89,"value":320},{"name":90,"value":321},{"name":91,"value":322},{"name":92,"value":323},{"name":93,"value":324},{"name":94,"value":325},{"name":95,"value":326},{"name":96,"value":327},{"name":97,"value":328},{"name":98,"value":329},{"name":99,"value":330}],"singlePatti":[{"name":120,"value":13},{"name":123,"value":16},{"name":124,"value":17},{"name":125,"value":18},{"name":126,"value":19},{"name":127,"value":20},{"name":128,"value":11},{"name":129,"value":12},{"name":130,"value":14},{"name":134,"value":28},{"name":135,"value":29},{"name":136,"value":30},{"name":137,"value":21},{"name":138,"value":22},{"name":139,"value":23},{"name":140,"value":15},{"name":145,"value":40},{"name":146,"value":31},{"name":147,"value":32},{"name":148,"value":33},{"name":149,"value":24},{"name":150,"value":26},{"name":156,"value":42},{"name":157,"value":43},{"name":158,"value":34},{"name":159,"value":25},{"name":160,"value":27},{"name":167,"value":44},{"name":168,"value":35},{"name":169,"value":36},{"name":170,"value":38},{"name":178,"value":46},{"name":179,"value":37},{"name":180,"value":39},{"name":189,"value":48},{"name":190,"value":50},{"name":230,"value":45},{"name":234,"value":49},{"name":235,"value":60},{"name":236,"value":41},{"name":237,"value":52},{"name":238,"value":53},{"name":239,"value":54},{"name":240,"value":56},{"name":245,"value":51},{"name":246,"value":62},{"name":247,"value":63},{"name":248,"value":64},{"name":249,"value":55},{"name":250,"value":47},{"name":256,"value":73},{"name":257,"value":74},{"name":258,"value":65},{"name":259,"value":66},{"name":260,"value":58},{"name":267,"value":75},{"name":268,"value":76},{"name":269,"value":57},{"name":270,"value":59},{"name":278,"value":67},{"name":279,"value":68},{"name":280,"value":70},{"name":289,"value":69},{"name":290,"value":61},{"name":340,"value":77},{"name":345,"value":72},{"name":346,"value":83},{"name":347,"value":84},{"name":348,"value":85},{"name":349,"value":86},{"name":350,"value":78},{"name":356,"value":94},{"name":357,"value":95},{"name":358,"value":96},{"name":359,"value":87},{"name":360,"value":79},{"name":367,"value":106},{"name":368,"value":97},{"name":369,"value":88},{"name":370,"value":80},{"name":378,"value":98},{"name":379,"value":89},{"name":380,"value":71},{"name":389,"value":90},{"name":390,"value":82},{"name":450,"value":99},{"name":456,"value":105},{"name":457,"value":116},{"name":458,"value":107},{"name":459,"value":108},{"name":460,"value":100},{"name":467,"value":117},{"name":468,"value":118},{"name":469,"value":109},{"name":470,"value":81},{"name":478,"value":119},{"name":479,"value":110},{"name":480,"value":92},{"name":489,"value":91},{"name":490,"value":93},{"name":560,"value":101},{"name":567,"value":128},{"name":568,"value":129},{"name":569,"value":120},{"name":570,"value":102},{"name":578,"value":130},{"name":579,"value":111},{"name":580,"value":103},{"name":589,"value":112},{"name":590,"value":104},{"name":670,"value":113},{"name":678,"value":121},{"name":679,"value":122},{"name":680,"value":114},{"name":689,"value":123},{"name":690,"value":115},{"name":780,"value":125},{"name":789,"value":124},{"name":790,"value":126},{"name":890,"value":127}],"doublePatti":[{"name":100,"value":131},{"name":110,"value":132},{"name":112,"value":134},{"name":113,"value":135},{"name":114,"value":136},{"name":115,"value":137},{"name":116,"value":138},{"name":117,"value":139},{"name":118,"value":140},{"name":119,"value":141},{"name":122,"value":145},{"name":133,"value":147},{"name":144,"value":149},{"name":155,"value":151},{"name":166,"value":133},{"name":177,"value":155},{"name":188,"value":157},{"name":199,"value":159},{"name":200,"value":142},{"name":220,"value":144},{"name":223,"value":167},{"name":224,"value":148},{"name":225,"value":169},{"name":226,"value":150},{"name":227,"value":161},{"name":228,"value":152},{"name":229,"value":143},{"name":233,"value":158},{"name":244,"value":160},{"name":255,"value":162},{"name":266,"value":154},{"name":277,"value":146},{"name":288,"value":168},{"name":299,"value":170},{"name":300,"value":153},{"name":330,"value":156},{"name":334,"value":180},{"name":335,"value":171},{"name":336,"value":172},{"name":337,"value":163},{"name":338,"value":164},{"name":339,"value":165},{"name":344,"value":181},{"name":355,"value":173},{"name":366,"value":175},{"name":377,"value":177},{"name":388,"value":179},{"name":399,"value":191},{"name":400,"value":174},{"name":440,"value":178},{"name":445,"value":183},{"name":446,"value":184},{"name":447,"value":185},{"name":448,"value":166},{"name":449,"value":187},{"name":455,"value":194},{"name":466,"value":176},{"name":477,"value":188},{"name":488,"value":190},{"name":499,"value":182},{"name":500,"value":195},{"name":550,"value":200},{"name":556,"value":186},{"name":557,"value":197},{"name":558,"value":198},{"name":559,"value":189},{"name":566,"value":207},{"name":577,"value":199},{"name":588,"value":201},{"name":599,"value":193},{"name":600,"value":196},{"name":660,"value":192},{"name":667,"value":209},{"name":668,"value":210},{"name":669,"value":211},{"name":677,"value":220},{"name":688,"value":202},{"name":699,"value":204},{"name":700,"value":217},{"name":770,"value":214},{"name":778,"value":212},{"name":779,"value":203},{"name":788,"value":213},{"name":799,"value":205},{"name":800,"value":208},{"name":880,"value":206},{"name":889,"value":215},{"name":899,"value":216},{"name":900,"value":219},{"name":990,"value":218}],"triplePatti":[{"name":0,"value":1000},{"name":111,"value":111},{"name":222,"value":222},{"name":333,"value":333},{"name":444,"value":444},{"name":555,"value":555},{"name":666,"value":666},{"name":777,"value":777},{"name":888,"value":888},{"name":999,"value":999}]}
     */

    private int status;
    private int data;
    private String message;
    private ValueBean value;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ValueBean getValue() {
        return value;
    }

    public void setValue(ValueBean value) {
        this.value = value;
    }

    public static class ValueBean {
        /**
         * balance : 4620.00
         * single : [{"name":0,"value":10},{"name":1,"value":1},{"name":2,"value":2},{"name":3,"value":3},{"name":4,"value":4},{"name":5,"value":5},{"name":6,"value":6},{"name":7,"value":7},{"name":8,"value":8},{"name":9,"value":9}]
         * jodi : [{"name":0,"value":231},{"name":1,"value":232},{"name":2,"value":233},{"name":3,"value":234},{"name":4,"value":235},{"name":5,"value":236},{"name":6,"value":237},{"name":7,"value":238},{"name":0,"value":239},{"name":0,"value":240},{"name":10,"value":241},{"name":11,"value":242},{"name":12,"value":243},{"name":13,"value":244},{"name":14,"value":245},{"name":15,"value":246},{"name":16,"value":247},{"name":17,"value":248},{"name":18,"value":249},{"name":19,"value":250},{"name":20,"value":251},{"name":21,"value":252},{"name":22,"value":253},{"name":23,"value":254},{"name":24,"value":255},{"name":25,"value":256},{"name":26,"value":257},{"name":27,"value":258},{"name":28,"value":259},{"name":29,"value":260},{"name":30,"value":261},{"name":31,"value":262},{"name":32,"value":263},{"name":33,"value":264},{"name":34,"value":265},{"name":35,"value":266},{"name":36,"value":267},{"name":37,"value":268},{"name":38,"value":269},{"name":39,"value":270},{"name":40,"value":271},{"name":41,"value":272},{"name":42,"value":273},{"name":43,"value":274},{"name":44,"value":275},{"name":45,"value":276},{"name":46,"value":277},{"name":47,"value":278},{"name":48,"value":279},{"name":49,"value":280},{"name":50,"value":281},{"name":51,"value":282},{"name":52,"value":283},{"name":53,"value":284},{"name":54,"value":285},{"name":55,"value":286},{"name":56,"value":287},{"name":57,"value":288},{"name":58,"value":289},{"name":59,"value":290},{"name":60,"value":291},{"name":61,"value":292},{"name":62,"value":293},{"name":63,"value":294},{"name":64,"value":295},{"name":65,"value":296},{"name":66,"value":297},{"name":67,"value":298},{"name":68,"value":299},{"name":69,"value":300},{"name":70,"value":301},{"name":71,"value":302},{"name":72,"value":303},{"name":73,"value":304},{"name":74,"value":305},{"name":75,"value":306},{"name":76,"value":307},{"name":77,"value":308},{"name":78,"value":309},{"name":79,"value":310},{"name":80,"value":311},{"name":81,"value":312},{"name":82,"value":313},{"name":83,"value":314},{"name":84,"value":315},{"name":85,"value":316},{"name":86,"value":317},{"name":87,"value":318},{"name":88,"value":319},{"name":89,"value":320},{"name":90,"value":321},{"name":91,"value":322},{"name":92,"value":323},{"name":93,"value":324},{"name":94,"value":325},{"name":95,"value":326},{"name":96,"value":327},{"name":97,"value":328},{"name":98,"value":329},{"name":99,"value":330}]
         * singlePatti : [{"name":120,"value":13},{"name":123,"value":16},{"name":124,"value":17},{"name":125,"value":18},{"name":126,"value":19},{"name":127,"value":20},{"name":128,"value":11},{"name":129,"value":12},{"name":130,"value":14},{"name":134,"value":28},{"name":135,"value":29},{"name":136,"value":30},{"name":137,"value":21},{"name":138,"value":22},{"name":139,"value":23},{"name":140,"value":15},{"name":145,"value":40},{"name":146,"value":31},{"name":147,"value":32},{"name":148,"value":33},{"name":149,"value":24},{"name":150,"value":26},{"name":156,"value":42},{"name":157,"value":43},{"name":158,"value":34},{"name":159,"value":25},{"name":160,"value":27},{"name":167,"value":44},{"name":168,"value":35},{"name":169,"value":36},{"name":170,"value":38},{"name":178,"value":46},{"name":179,"value":37},{"name":180,"value":39},{"name":189,"value":48},{"name":190,"value":50},{"name":230,"value":45},{"name":234,"value":49},{"name":235,"value":60},{"name":236,"value":41},{"name":237,"value":52},{"name":238,"value":53},{"name":239,"value":54},{"name":240,"value":56},{"name":245,"value":51},{"name":246,"value":62},{"name":247,"value":63},{"name":248,"value":64},{"name":249,"value":55},{"name":250,"value":47},{"name":256,"value":73},{"name":257,"value":74},{"name":258,"value":65},{"name":259,"value":66},{"name":260,"value":58},{"name":267,"value":75},{"name":268,"value":76},{"name":269,"value":57},{"name":270,"value":59},{"name":278,"value":67},{"name":279,"value":68},{"name":280,"value":70},{"name":289,"value":69},{"name":290,"value":61},{"name":340,"value":77},{"name":345,"value":72},{"name":346,"value":83},{"name":347,"value":84},{"name":348,"value":85},{"name":349,"value":86},{"name":350,"value":78},{"name":356,"value":94},{"name":357,"value":95},{"name":358,"value":96},{"name":359,"value":87},{"name":360,"value":79},{"name":367,"value":106},{"name":368,"value":97},{"name":369,"value":88},{"name":370,"value":80},{"name":378,"value":98},{"name":379,"value":89},{"name":380,"value":71},{"name":389,"value":90},{"name":390,"value":82},{"name":450,"value":99},{"name":456,"value":105},{"name":457,"value":116},{"name":458,"value":107},{"name":459,"value":108},{"name":460,"value":100},{"name":467,"value":117},{"name":468,"value":118},{"name":469,"value":109},{"name":470,"value":81},{"name":478,"value":119},{"name":479,"value":110},{"name":480,"value":92},{"name":489,"value":91},{"name":490,"value":93},{"name":560,"value":101},{"name":567,"value":128},{"name":568,"value":129},{"name":569,"value":120},{"name":570,"value":102},{"name":578,"value":130},{"name":579,"value":111},{"name":580,"value":103},{"name":589,"value":112},{"name":590,"value":104},{"name":670,"value":113},{"name":678,"value":121},{"name":679,"value":122},{"name":680,"value":114},{"name":689,"value":123},{"name":690,"value":115},{"name":780,"value":125},{"name":789,"value":124},{"name":790,"value":126},{"name":890,"value":127}]
         * doublePatti : [{"name":100,"value":131},{"name":110,"value":132},{"name":112,"value":134},{"name":113,"value":135},{"name":114,"value":136},{"name":115,"value":137},{"name":116,"value":138},{"name":117,"value":139},{"name":118,"value":140},{"name":119,"value":141},{"name":122,"value":145},{"name":133,"value":147},{"name":144,"value":149},{"name":155,"value":151},{"name":166,"value":133},{"name":177,"value":155},{"name":188,"value":157},{"name":199,"value":159},{"name":200,"value":142},{"name":220,"value":144},{"name":223,"value":167},{"name":224,"value":148},{"name":225,"value":169},{"name":226,"value":150},{"name":227,"value":161},{"name":228,"value":152},{"name":229,"value":143},{"name":233,"value":158},{"name":244,"value":160},{"name":255,"value":162},{"name":266,"value":154},{"name":277,"value":146},{"name":288,"value":168},{"name":299,"value":170},{"name":300,"value":153},{"name":330,"value":156},{"name":334,"value":180},{"name":335,"value":171},{"name":336,"value":172},{"name":337,"value":163},{"name":338,"value":164},{"name":339,"value":165},{"name":344,"value":181},{"name":355,"value":173},{"name":366,"value":175},{"name":377,"value":177},{"name":388,"value":179},{"name":399,"value":191},{"name":400,"value":174},{"name":440,"value":178},{"name":445,"value":183},{"name":446,"value":184},{"name":447,"value":185},{"name":448,"value":166},{"name":449,"value":187},{"name":455,"value":194},{"name":466,"value":176},{"name":477,"value":188},{"name":488,"value":190},{"name":499,"value":182},{"name":500,"value":195},{"name":550,"value":200},{"name":556,"value":186},{"name":557,"value":197},{"name":558,"value":198},{"name":559,"value":189},{"name":566,"value":207},{"name":577,"value":199},{"name":588,"value":201},{"name":599,"value":193},{"name":600,"value":196},{"name":660,"value":192},{"name":667,"value":209},{"name":668,"value":210},{"name":669,"value":211},{"name":677,"value":220},{"name":688,"value":202},{"name":699,"value":204},{"name":700,"value":217},{"name":770,"value":214},{"name":778,"value":212},{"name":779,"value":203},{"name":788,"value":213},{"name":799,"value":205},{"name":800,"value":208},{"name":880,"value":206},{"name":889,"value":215},{"name":899,"value":216},{"name":900,"value":219},{"name":990,"value":218}]
         * triplePatti : [{"name":0,"value":1000},{"name":111,"value":111},{"name":222,"value":222},{"name":333,"value":333},{"name":444,"value":444},{"name":555,"value":555},{"name":666,"value":666},{"name":777,"value":777},{"name":888,"value":888},{"name":999,"value":999}]
         */

        private String balance;
        private List<SingleBean> single;
        private List<JodiBean> jodi;
        private List<SinglePattiBean> singlePatti;
        private List<DoublePattiBean> doublePatti;
        private List<TriplePattiBean> triplePatti;

        public String getBalance() {
            return balance;
        }

        public void setBalance(String balance) {
            this.balance = balance;
        }

        public List<SingleBean> getSingle() {
            return single;
        }

        public void setSingle(List<SingleBean> single) {
            this.single = single;
        }

        public List<JodiBean> getJodi() {
            return jodi;
        }

        public void setJodi(List<JodiBean> jodi) {
            this.jodi = jodi;
        }

        public List<SinglePattiBean> getSinglePatti() {
            return singlePatti;
        }

        public void setSinglePatti(List<SinglePattiBean> singlePatti) {
            this.singlePatti = singlePatti;
        }

        public List<DoublePattiBean> getDoublePatti() {
            return doublePatti;
        }

        public void setDoublePatti(List<DoublePattiBean> doublePatti) {
            this.doublePatti = doublePatti;
        }

        public List<TriplePattiBean> getTriplePatti() {
            return triplePatti;
        }

        public void setTriplePatti(List<TriplePattiBean> triplePatti) {
            this.triplePatti = triplePatti;
        }

        public static class SingleBean {
            /**
             * name : 0
             * value : 10
             */

            private int name;
            private int value;

            public int getName() {
                return name;
            }

            public void setName(int name) {
                this.name = name;
            }

            public int getValue() {
                return value;
            }

            public void setValue(int value) {
                this.value = value;
            }

            @NonNull
            @Override
            public String toString() {
                return super.toString();
            }
        }

        public static class JodiBean {
            /**
             * name : 0
             * value : 231
             */

            private int name;
            private int value;

            public int getName() {
                return name;
            }

            public void setName(int name) {
                this.name = name;
            }

            public int getValue() {
                return value;
            }

            public void setValue(int value) {
                this.value = value;
            }
        }

        public static class SinglePattiBean {
            /**
             * name : 120
             * value : 13
             */

            private int name;
            private int value;

            public int getName() {
                return name;
            }

            public void setName(int name) {
                this.name = name;
            }

            public int getValue() {
                return value;
            }

            public void setValue(int value) {
                this.value = value;
            }
        }

        public static class DoublePattiBean {
            /**
             * name : 100
             * value : 131
             */

            private int name;
            private int value;

            public int getName() {
                return name;
            }

            public void setName(int name) {
                this.name = name;
            }

            public int getValue() {
                return value;
            }

            public void setValue(int value) {
                this.value = value;
            }
        }

        public static class TriplePattiBean {
            /**
             * name : 0
             * value : 1000
             */

            private int name;
            private int value;

            public int getName() {
                return name;
            }

            public void setName(int name) {
                this.name = name;
            }

            public int getValue() {
                return value;
            }

            public void setValue(int value) {
                this.value = value;
            }
        }
    }


}
