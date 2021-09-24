package com.dev.goldengames.model;

import java.util.List;

public class ModelDashboard {


    /**
     * status : 1
     * message : Market List
     * data : [{"market_id":28,"market_name":"Sridevi","open_start_time":"01/01/2021 01:00:00","open_end_time":"01/01/2021 11:30:00","close_start_time":"01/01/2021 01:00:00","close_end_time":"01/01/2021 12:30:00","max_bet_time":5,"max_bet_amount":2000,"open_panna":"***","open_result_value":"*","close_panna":"***","close_result_value":"*","result":"***-**-***"},{"market_id":31,"market_name":"Madhur Day","open_start_time":"01/01/2021 01:00:00","open_end_time":"01/01/2021 13:00:00","close_start_time":"01/01/2021 01:00:00","close_end_time":"01/01/2021 14:00:00","max_bet_time":5,"max_bet_amount":2000,"open_panna":"***","open_result_value":"*","close_panna":"***","close_result_value":"*","result":"***-**-***"},{"market_id":44,"market_name":"Time Bazar","open_start_time":"01/01/2021 01:00:00","open_end_time":"01/01/2021 13:00:00","close_start_time":"01/01/2021 01:00:00","close_end_time":"01/01/2021 14:00:00","max_bet_time":5,"max_bet_amount":5000,"open_panna":"***","open_result_value":"*","close_panna":"***","close_result_value":"*","result":"***-**-***"},{"market_id":32,"market_name":"Milan Day","open_start_time":"01/01/2021 01:00:00","open_end_time":"01/01/2021 15:00:00","close_start_time":"01/01/2021 01:00:00","close_end_time":"01/01/2021 17:00:00","max_bet_time":5,"max_bet_amount":2000,"open_panna":"***","open_result_value":"*","close_panna":"***","close_result_value":"*","result":"***-**-***"},{"market_id":45,"market_name":"Rajdhani Day","open_start_time":"01/01/2021 01:00:00","open_end_time":"01/01/2021 15:10:00","close_start_time":"01/01/2021 01:00:00","close_end_time":"01/01/2021 17:10:00","max_bet_time":5,"max_bet_amount":1000,"open_panna":"***","open_result_value":"*","close_panna":"***","close_result_value":"*","result":"***-**-***"},{"market_id":46,"market_name":"Superme Day","open_start_time":"01/01/2021 01:00:00","open_end_time":"01/01/2021 15:30:00","close_start_time":"01/01/2021 01:00:00","close_end_time":"01/01/2021 17:30:00","max_bet_time":5,"max_bet_amount":2000,"open_panna":"***","open_result_value":"*","close_panna":"***","close_result_value":"*","result":"***-**-***"},{"market_id":27,"market_name":"Kalyan","open_start_time":"01/01/2021 01:00:00","open_end_time":"01/01/2021 15:40:00","close_start_time":"01/01/2021 01:00:00","close_end_time":"01/01/2021 17:40:00","max_bet_time":5,"max_bet_amount":5000,"open_panna":"***","open_result_value":"*","close_panna":"***","close_result_value":"*","result":"***-**-***"},{"market_id":47,"market_name":"Sridevi Night","open_start_time":"01/01/2021 01:00:00","open_end_time":"01/01/2021 19:30:00","close_start_time":"01/01/2021 01:00:00","close_end_time":"01/01/2021 20:30:00","max_bet_time":5,"max_bet_amount":2000,"open_panna":"***","open_result_value":"*","close_panna":"***","close_result_value":"*","result":"***-**-***"},{"market_id":48,"market_name":"Madhur Night","open_start_time":"01/01/2021 01:00:00","open_end_time":"01/01/2021 20:30:00","close_start_time":"01/01/2021 01:00:00","close_end_time":"01/01/2021 22:30:00","max_bet_time":5,"max_bet_amount":2000,"open_panna":"***","open_result_value":"*","close_panna":"***","close_result_value":"*","result":"***-**-***"},{"market_id":49,"market_name":"Supreme Night","open_start_time":"01/01/2021 01:00:00","open_end_time":"01/01/2021 20:40:00","close_start_time":"01/01/2021 01:00:00","close_end_time":"01/01/2021 22:40:00","max_bet_time":5,"max_bet_amount":2000,"open_panna":"***","open_result_value":"*","close_panna":"***","close_result_value":"*","result":"***-**-***"},{"market_id":50,"market_name":"Milan Night","open_start_time":"01/01/2021 01:00:00","open_end_time":"01/01/2021 21:00:00","close_start_time":"01/01/2021 01:00:00","close_end_time":"01/01/2021 23:00:00","max_bet_time":5,"max_bet_amount":2000,"open_panna":"***","open_result_value":"*","close_panna":"***","close_result_value":"*","result":"***-**-***"},{"market_id":51,"market_name":"Rajdhani Night","open_start_time":"01/01/2021 01:00:00","open_end_time":"01/01/2021 21:15:00","close_start_time":"01/01/2021 01:00:00","close_end_time":"01/01/2021 23:40:00","max_bet_time":5,"max_bet_amount":2000,"open_panna":"***","open_result_value":"*","close_panna":"***","close_result_value":"*","result":"***-**-***"},{"market_id":43,"market_name":"Main Ratan","open_start_time":"01/01/2021 01:00:00","open_end_time":"01/01/2021 21:30:00","close_start_time":"01/01/2021 01:00:00","close_end_time":"01/01/2021 23:55:00","max_bet_time":5,"max_bet_amount":5000,"open_panna":"***","open_result_value":"*","close_panna":"***","close_result_value":"*","result":"***-**-***"},{"market_id":52,"market_name":"Kalyan Night","open_start_time":"01/01/2021 01:00:00","open_end_time":"01/01/2021 21:30:00","close_start_time":"01/01/2021 01:00:00","close_end_time":"01/01/2021 23:50:00","max_bet_time":5,"max_bet_amount":2000,"open_panna":"***","open_result_value":"*","close_panna":"***","close_result_value":"*","result":"***-**-***"}]
     */

    private int status;
    private String message;

    public String getContact_no() {
        return contact_no;
    }

    public void setContact_no(String contact_no) {
        this.contact_no = contact_no;
    }

    private String contact_no;
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
         * market_id : 28
         * market_name : Sridevi
         * open_start_time : 01/01/2021 01:00:00
         * open_end_time : 01/01/2021 11:30:00
         * close_start_time : 01/01/2021 01:00:00
         * close_end_time : 01/01/2021 12:30:00
         * max_bet_time : 5
         * max_bet_amount : 2000
         * open_panna : ***
         * open_result_value : *
         * close_panna : ***
         * close_result_value : *
         * result : ***-**-***
         */

        private int market_id;
        private String market_name;
        private String open_start_time;
        private String open_end_time;
        private String close_start_time;
        private String close_end_time;
        private int max_bet_time;
        private int max_bet_amount;
        private String status;
        private String open_panna;
        private String open_result_value;
        private String close_panna;

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        private String close_result_value;
        private String o_end_time;

        public String getO_end_time() {
            return o_end_time;
        }

        public void setO_end_time(String o_end_time) {
            this.o_end_time = o_end_time;
        }

        public String getC_end_time() {
            return c_end_time;
        }

        public void setC_end_time(String c_end_time) {
            this.c_end_time = c_end_time;
        }

        private String c_end_time;
        private String result;

        public int getMarket_id() {
            return market_id;
        }

        public void setMarket_id(int market_id) {
            this.market_id = market_id;
        }

        public String getMarket_name() {
            return market_name;
        }

        public void setMarket_name(String market_name) {
            this.market_name = market_name;
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

        public String getOpen_panna() {
            return open_panna;
        }

        public void setOpen_panna(String open_panna) {
            this.open_panna = open_panna;
        }

        public String getOpen_result_value() {
            return open_result_value;
        }

        public void setOpen_result_value(String open_result_value) {
            this.open_result_value = open_result_value;
        }

        public String getClose_panna() {
            return close_panna;
        }

        public void setClose_panna(String close_panna) {
            this.close_panna = close_panna;
        }

        public String getClose_result_value() {
            return close_result_value;
        }

        public void setClose_result_value(String close_result_value) {
            this.close_result_value = close_result_value;
        }

        public String getResult() {
            return result;
        }

        public void setResult(String result) {
            this.result = result;
        }
    }
}
