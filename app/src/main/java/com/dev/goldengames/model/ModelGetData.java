package com.dev.goldengames.model;

public class ModelGetData {
    /**
     * status : 1
     * message : User Detail
     * data : {"id":58,"name":"viksa","mobile":"7777777777","username":"test","wallet":0}
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
         * id : 58
         * name : viksa
         * mobile : 7777777777
         * username : test
         * wallet : 0
         */

        private int id;
        private String name;
        private String mobile;
        private String username;
        private int wallet;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public int getWallet() {
            return wallet;
        }

        public void setWallet(int wallet) {
            this.wallet = wallet;
        }
    }


    /**
     * status : 1
     * data : 1
     * message : User profile fetched successfully.
     * value : {"login_id":"sahu","email":"","address":"","mob_phone":"9109922277"}
     */


}
