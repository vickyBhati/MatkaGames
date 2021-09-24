package com.dev.goldengames.model;

import java.util.List;

public class ModelAllPhone {


    /**
     * data : [{"id":"jj","first_name":"jj","last_name":"jj","phone_mobile":"jj"}]
     * message : Succes
     * status : 200
     * success : true
     */

    private String message;
    private int status;
    private boolean success;
    private List<DataBean> data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : jj
         * first_name : jj
         * last_name : jj
         * phone_mobile : jj
         */

        private String id;
        private String first_name;
        private String last_name;
        private String phone_mobile;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getFirst_name() {
            return first_name;
        }

        public void setFirst_name(String first_name) {
            this.first_name = first_name;
        }

        public String getLast_name() {
            return last_name;
        }

        public void setLast_name(String last_name) {
            this.last_name = last_name;
        }

        public String getPhone_mobile() {
            return phone_mobile;
        }

        public void setPhone_mobile(String phone_mobile) {
            this.phone_mobile = phone_mobile;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "id='" + id + '\'' +
                    ", first_name='" + first_name + '\'' +
                    ", last_name='" + last_name + '\'' +
                    ", phone_mobile='" + phone_mobile + '\'' +
                    '}';
        }
    }
}
