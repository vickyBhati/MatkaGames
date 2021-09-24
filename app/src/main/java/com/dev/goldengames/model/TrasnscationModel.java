package com.dev.goldengames.model;

import java.util.List;

public class TrasnscationModel {

    /**
     * status : 1
     * message : Transaction History
     * data : [{"id":4,"from_id":9,"to_id":0,"amount":55,"message":"Bet on Main Mumbai market ( single-patti ) on Close bet type.","created_at":"11-Jan-2021 11:39 AM"},{"id":5,"from_id":9,"to_id":0,"amount":22,"message":"Bet on Kalyan Night market ( triple-patti ) on Close bet type.","created_at":"11-Jan-2021 11:57 AM"},{"id":6,"from_id":9,"to_id":0,"amount":500,"message":"Bet on Kalyan Night market ( triple-patti ) on Open bet type.","created_at":"11-Jan-2021 12:02 PM"},{"id":8,"from_id":9,"to_id":0,"amount":55,"message":"Bet on Main Mumbai market ( single-patti ) on Close bet type.","created_at":"12-Jan-2021 06:22 PM"}]
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
         * id : 4
         * from_id : 9
         * to_id : 0
         * amount : 55
         * message : Bet on Main Mumbai market ( single-patti ) on Close bet type.
         * created_at : 11-Jan-2021 11:39 AM
         */

        private int id;
        private int from_id;
        private int to_id;
        private int amount;
        private String message;

        public String getTransaction_type() {
            return transaction_type;
        }

        public void setTransaction_type(String transaction_type) {
            this.transaction_type = transaction_type;
        }

        private String transaction_type;
        private String created_at;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getFrom_id() {
            return from_id;
        }

        public void setFrom_id(int from_id) {
            this.from_id = from_id;
        }

        public int getTo_id() {
            return to_id;
        }

        public void setTo_id(int to_id) {
            this.to_id = to_id;
        }

        public int getAmount() {
            return amount;
        }

        public void setAmount(int amount) {
            this.amount = amount;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }
    }
}
