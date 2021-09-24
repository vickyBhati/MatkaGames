package com.dev.goldengames.model;

import com.google.gson.annotations.SerializedName;

public class BhavListModel {

    /**
     * status : 1
     * message : Bhav List
     * data : {"single":{"full_bhav":10},"jodi":{"full_bhav":100},"single-patti":{"full_bhav":150},"double-patti":{"full_bhav":300},"triple-patti":{"full_bhav":600},"half-sangam":{"full_bhav":700},"full-sangam":{"full_bhav":800}}
     */

    private int status;
    private String message;
    private DataBean data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * single : {"full_bhav":10}
         * jodi : {"full_bhav":100}
         * single-patti : {"full_bhav":150}
         * double-patti : {"full_bhav":300}
         * triple-patti : {"full_bhav":600}
         * half-sangam : {"full_bhav":700}
         * full-sangam : {"full_bhav":800}
         */

        private SingleBean single;
        private JodiBean jodi;
        @SerializedName("single-patti")
        private SinglepattiBean singlepatti;
        @SerializedName("double-patti")
        private DoublepattiBean doublepatti;
        @SerializedName("triple-patti")
        private TriplepattiBean triplepatti;
        @SerializedName("half-sangam")
        private HalfsangamBean halfsangam;
        @SerializedName("full-sangam")
        private FullsangamBean fullsangam;

        public SingleBean getSingle() {
            return single;
        }

        public void setSingle(SingleBean single) {
            this.single = single;
        }

        public JodiBean getJodi() {
            return jodi;
        }

        public void setJodi(JodiBean jodi) {
            this.jodi = jodi;
        }

        public SinglepattiBean getSinglepatti() {
            return singlepatti;
        }

        public void setSinglepatti(SinglepattiBean singlepatti) {
            this.singlepatti = singlepatti;
        }

        public DoublepattiBean getDoublepatti() {
            return doublepatti;
        }

        public void setDoublepatti(DoublepattiBean doublepatti) {
            this.doublepatti = doublepatti;
        }

        public TriplepattiBean getTriplepatti() {
            return triplepatti;
        }

        public void setTriplepatti(TriplepattiBean triplepatti) {
            this.triplepatti = triplepatti;
        }

        public HalfsangamBean getHalfsangam() {
            return halfsangam;
        }

        public void setHalfsangam(HalfsangamBean halfsangam) {
            this.halfsangam = halfsangam;
        }

        public FullsangamBean getFullsangam() {
            return fullsangam;
        }

        public void setFullsangam(FullsangamBean fullsangam) {
            this.fullsangam = fullsangam;
        }

        public static class SingleBean {
            /**
             * full_bhav : 10
             */

            private int full_bhav;

            public int getFull_bhav() {
                return full_bhav;
            }

            public void setFull_bhav(int full_bhav) {
                this.full_bhav = full_bhav;
            }
        }

        public static class JodiBean {
            /**
             * full_bhav : 100
             */

            private int full_bhav;

            public int getFull_bhav() {
                return full_bhav;
            }

            public void setFull_bhav(int full_bhav) {
                this.full_bhav = full_bhav;
            }
        }

        public static class SinglepattiBean {
            /**
             * full_bhav : 150
             */

            private int full_bhav;

            public int getFull_bhav() {
                return full_bhav;
            }

            public void setFull_bhav(int full_bhav) {
                this.full_bhav = full_bhav;
            }
        }

        public static class DoublepattiBean {
            /**
             * full_bhav : 300
             */

            private int full_bhav;

            public int getFull_bhav() {
                return full_bhav;
            }

            public void setFull_bhav(int full_bhav) {
                this.full_bhav = full_bhav;
            }
        }

        public static class TriplepattiBean {
            /**
             * full_bhav : 600
             */

            private int full_bhav;

            public int getFull_bhav() {
                return full_bhav;
            }

            public void setFull_bhav(int full_bhav) {
                this.full_bhav = full_bhav;
            }
        }

        public static class HalfsangamBean {
            /**
             * full_bhav : 700
             */

            private int full_bhav;

            public int getFull_bhav() {
                return full_bhav;
            }

            public void setFull_bhav(int full_bhav) {
                this.full_bhav = full_bhav;
            }
        }

        public static class FullsangamBean {
            /**
             * full_bhav : 800
             */

            private int full_bhav;

            public int getFull_bhav() {
                return full_bhav;
            }

            public void setFull_bhav(int full_bhav) {
                this.full_bhav = full_bhav;
            }
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "single=" + single +
                    ", jodi=" + jodi +
                    ", singlepatti=" + singlepatti +
                    ", doublepatti=" + doublepatti +
                    ", triplepatti=" + triplepatti +
                    ", halfsangam=" + halfsangam +
                    ", fullsangam=" + fullsangam +
                    '}';
        }
    }
}