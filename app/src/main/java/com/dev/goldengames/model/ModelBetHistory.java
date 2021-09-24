package com.dev.goldengames.model;

import java.util.List;

public class ModelBetHistory {
    /**
     * status : 1
     * message : Bet History
     * data : [{"id":14,"market_id":7,"patti_type":"jodi","selected_number":"22","value_on_number":7,"bet_type":"Close","created_at":"16-Jan-2021 04:10 PM","updated_at":"16-Jan-2021 04:10 PM","market":{"id":7,"linked_market_id":0,"name":"Milan Night","open_start_time":"01:00:00","open_end_time":"20:55:00","close_start_time":"01:00:00","close_end_time":"23:00:00","market_type":null,"status":"A","random_series":"","is_auto_create":"N","draw_time":null,"week_days":"[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\"]","set_result_type":"M","max_bet_time":1,"max_bet_amount":5000,"is_expired":"N","perception_number":null,"created":"2020-12-12 03:10:27","modified":"2020-12-12 15:40:27","created_by":null,"created_ip":"59.95.88.209","modified_by":null,"modified_ip":"103.71.22.77"}},{"id":13,"market_id":7,"patti_type":"triple-patti","selected_number":"222","value_on_number":1,"bet_type":"Close","created_at":"16-Jan-2021 04:07 PM","updated_at":"16-Jan-2021 04:07 PM","market":{"id":7,"linked_market_id":0,"name":"Milan Night","open_start_time":"01:00:00","open_end_time":"20:55:00","close_start_time":"01:00:00","close_end_time":"23:00:00","market_type":null,"status":"A","random_series":"","is_auto_create":"N","draw_time":null,"week_days":"[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\"]","set_result_type":"M","max_bet_time":1,"max_bet_amount":5000,"is_expired":"N","perception_number":null,"created":"2020-12-12 03:10:27","modified":"2020-12-12 15:40:27","created_by":null,"created_ip":"59.95.88.209","modified_by":null,"modified_ip":"103.71.22.77"}},{"id":10,"market_id":7,"patti_type":"single-patti","selected_number":"2","value_on_number":25,"bet_type":"Open","created_at":"15-Jan-2021 07:17 PM","updated_at":"15-Jan-2021 07:17 PM","market":{"id":7,"linked_market_id":0,"name":"Milan Night","open_start_time":"01:00:00","open_end_time":"20:55:00","close_start_time":"01:00:00","close_end_time":"23:00:00","market_type":null,"status":"A","random_series":"","is_auto_create":"N","draw_time":null,"week_days":"[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\"]","set_result_type":"M","max_bet_time":1,"max_bet_amount":5000,"is_expired":"N","perception_number":null,"created":"2020-12-12 03:10:27","modified":"2020-12-12 15:40:27","created_by":null,"created_ip":"59.95.88.209","modified_by":null,"modified_ip":"103.71.22.77"}},{"id":8,"market_id":2,"patti_type":"single-patti","selected_number":"25","value_on_number":55,"bet_type":"Close","created_at":"12-Jan-2021 06:22 PM","updated_at":"12-Jan-2021 06:22 PM","market":{"id":2,"linked_market_id":0,"name":"Main Mumbai","open_start_time":"01:00:00","open_end_time":"21:35:00","close_start_time":"01:00:00","close_end_time":"23:59:00","market_type":null,"status":"A","random_series":"","is_auto_create":"N","draw_time":null,"week_days":"[\"1\",\"2\",\"3\",\"4\",\"5\"]","set_result_type":"M","max_bet_time":1,"max_bet_amount":0,"is_expired":"N","perception_number":null,"created":"2021-01-04 08:59:36","modified":"2021-01-04 21:29:36","created_by":null,"created_ip":"59.95.88.209","modified_by":null,"modified_ip":"103.71.22.19"}}]
     */

    private int status;
    private String message;
    private List<DataBean> data;

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

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 14
         * market_id : 7
         * patti_type : jodi
         * selected_number : 22
         * value_on_number : 7
         * bet_type : Close
         * created_at : 16-Jan-2021 04:10 PM
         * updated_at : 16-Jan-2021 04:10 PM
         * market : {"id":7,"linked_market_id":0,"name":"Milan Night","open_start_time":"01:00:00","open_end_time":"20:55:00","close_start_time":"01:00:00","close_end_time":"23:00:00","market_type":null,"status":"A","random_series":"","is_auto_create":"N","draw_time":null,"week_days":"[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\"]","set_result_type":"M","max_bet_time":1,"max_bet_amount":5000,"is_expired":"N","perception_number":null,"created":"2020-12-12 03:10:27","modified":"2020-12-12 15:40:27","created_by":null,"created_ip":"59.95.88.209","modified_by":null,"modified_ip":"103.71.22.77"}
         */

        private int id;
        private int market_id;
        private String patti_type;
        private String selected_number;
        private int value_on_number;
        private String bet_type;
        private String created_at;
        private String updated_at;
        private MarketBean market;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getMarket_id() {
            return market_id;
        }

        public void setMarket_id(int market_id) {
            this.market_id = market_id;
        }

        public String getPatti_type() {
            return patti_type;
        }

        public void setPatti_type(String patti_type) {
            this.patti_type = patti_type;
        }

        public String getSelected_number() {
            return selected_number;
        }

        public void setSelected_number(String selected_number) {
            this.selected_number = selected_number;
        }

        public int getValue_on_number() {
            return value_on_number;
        }

        public void setValue_on_number(int value_on_number) {
            this.value_on_number = value_on_number;
        }

        public String getBet_type() {
            return bet_type;
        }

        public void setBet_type(String bet_type) {
            this.bet_type = bet_type;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }

        public MarketBean getMarket() {
            return market;
        }

        public void setMarket(MarketBean market) {
            this.market = market;
        }

        public static class MarketBean {
            /**
             * id : 7
             * linked_market_id : 0
             * name : Milan Night
             * open_start_time : 01:00:00
             * open_end_time : 20:55:00
             * close_start_time : 01:00:00
             * close_end_time : 23:00:00
             * market_type : null
             * status : A
             * random_series :
             * is_auto_create : N
             * draw_time : null
             * week_days : ["1","2","3","4","5","6"]
             * set_result_type : M
             * max_bet_time : 1
             * max_bet_amount : 5000
             * is_expired : N
             * perception_number : null
             * created : 2020-12-12 03:10:27
             * modified : 2020-12-12 15:40:27
             * created_by : null
             * created_ip : 59.95.88.209
             * modified_by : null
             * modified_ip : 103.71.22.77
             */

            private int id;
            private int linked_market_id;
            private String name;
            private String open_start_time;
            private String open_end_time;
            private String close_start_time;
            private String close_end_time;
            private Object market_type;
            private String status;
            private String random_series;
            private String is_auto_create;
            private Object draw_time;
            private String week_days;
            private String set_result_type;
            private int max_bet_time;
            private int max_bet_amount;
            private String is_expired;
            private Object perception_number;
            private String created;
            private String modified;
            private Object created_by;
            private String created_ip;
            private Object modified_by;
            private String modified_ip;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getLinked_market_id() {
                return linked_market_id;
            }

            public void setLinked_market_id(int linked_market_id) {
                this.linked_market_id = linked_market_id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getOpen_start_time() {
                return open_start_time;
            }

            public void setOpen_start_time(String open_start_time) {
                this.open_start_time = open_start_time;
            }

            public String getOpen_end_time() {
                return open_end_time;
            }

            public void setOpen_end_time(String open_end_time) {
                this.open_end_time = open_end_time;
            }

            public String getClose_start_time() {
                return close_start_time;
            }

            public void setClose_start_time(String close_start_time) {
                this.close_start_time = close_start_time;
            }

            public String getClose_end_time() {
                return close_end_time;
            }

            public void setClose_end_time(String close_end_time) {
                this.close_end_time = close_end_time;
            }

            public Object getMarket_type() {
                return market_type;
            }

            public void setMarket_type(Object market_type) {
                this.market_type = market_type;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getRandom_series() {
                return random_series;
            }

            public void setRandom_series(String random_series) {
                this.random_series = random_series;
            }

            public String getIs_auto_create() {
                return is_auto_create;
            }

            public void setIs_auto_create(String is_auto_create) {
                this.is_auto_create = is_auto_create;
            }

            public Object getDraw_time() {
                return draw_time;
            }

            public void setDraw_time(Object draw_time) {
                this.draw_time = draw_time;
            }

            public String getWeek_days() {
                return week_days;
            }

            public void setWeek_days(String week_days) {
                this.week_days = week_days;
            }

            public String getSet_result_type() {
                return set_result_type;
            }

            public void setSet_result_type(String set_result_type) {
                this.set_result_type = set_result_type;
            }

            public int getMax_bet_time() {
                return max_bet_time;
            }

            public void setMax_bet_time(int max_bet_time) {
                this.max_bet_time = max_bet_time;
            }

            public int getMax_bet_amount() {
                return max_bet_amount;
            }

            public void setMax_bet_amount(int max_bet_amount) {
                this.max_bet_amount = max_bet_amount;
            }

            public String getIs_expired() {
                return is_expired;
            }

            public void setIs_expired(String is_expired) {
                this.is_expired = is_expired;
            }

            public Object getPerception_number() {
                return perception_number;
            }

            public void setPerception_number(Object perception_number) {
                this.perception_number = perception_number;
            }

            public String getCreated() {
                return created;
            }

            public void setCreated(String created) {
                this.created = created;
            }

            public String getModified() {
                return modified;
            }

            public void setModified(String modified) {
                this.modified = modified;
            }

            public Object getCreated_by() {
                return created_by;
            }

            public void setCreated_by(Object created_by) {
                this.created_by = created_by;
            }

            public String getCreated_ip() {
                return created_ip;
            }

            public void setCreated_ip(String created_ip) {
                this.created_ip = created_ip;
            }

            public Object getModified_by() {
                return modified_by;
            }

            public void setModified_by(Object modified_by) {
                this.modified_by = modified_by;
            }

            public String getModified_ip() {
                return modified_ip;
            }

            public void setModified_ip(String modified_ip) {
                this.modified_ip = modified_ip;
            }
        }
    }

    /**
     * status : 1
     * message : Bet History
     * data : [{"id":8,"market_id":2,"patti_type":"single-patti","selected_number":"25","value_on_number":55,"bet_type":"Close","created_at":"12-Jan-2021 06:22 PM","updated_at":"12-Jan-2021 06:22 PM"},{"id":6,"market_id":3,"patti_type":"triple-patti","selected_number":"100","value_on_number":500,"bet_type":"Open","created_at":"11-Jan-2021 12:02 PM","updated_at":"11-Jan-2021 12:02 PM"},{"id":5,"market_id":3,"patti_type":"triple-patti","selected_number":"25","value_on_number":22,"bet_type":"Close","created_at":"11-Jan-2021 11:57 AM","updated_at":"11-Jan-2021 11:57 AM"},{"id":4,"market_id":2,"patti_type":"single-patti","selected_number":"855","value_on_number":55,"bet_type":"Close","created_at":"11-Jan-2021 11:39 AM","updated_at":"11-Jan-2021 11:39 AM"}]
     */

}
