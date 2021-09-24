package com.dev.goldengames.model;

public class ForgotModel {

    /**
     * status : 1
     * message : Login Successful
     * data : {"id":56,"name":"Divyank k","mobile":"5874569854","wallet":0,"created_at":"01-Jan-2021"}
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
         * id : 56
         * name : Divyank k
         * mobile : 5874569854
         * wallet : 0
         * created_at : 01-Jan-2021
         */

        private int user_id;

        public int getUser_id() {
            return user_id;
        }

        public void setUser_id(int user_id) {
            this.user_id = user_id;
        }
    }

}

