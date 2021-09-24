package com.dev.goldengames.model;

public class BasicModel {


    /**
     * status : 1
     * message : Registration Successful
     * data : {"password":"25d55ad283aa400af464c76d713c07ad","username":"vikram96","mobile":"7728990513","name":"cccc","id":57}
     */

    private int status;
    private String message;

    public String getWallet() {
        return wallet;
    }

    public void setWallet(String wallet) {
        this.wallet = wallet;
    }

    private String wallet;
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
         * password : 25d55ad283aa400af464c76d713c07ad
         * username : vikram96
         * mobile : 7728990513
         * name : cccc
         * id : 57
         */

        private String password;
        private String username;
        private String mobile;
        private String name;
        private int id;

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }
}
