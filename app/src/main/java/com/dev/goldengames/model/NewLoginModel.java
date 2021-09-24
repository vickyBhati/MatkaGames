package com.dev.goldengames.model;

public class NewLoginModel {

    /**
     * status : 1
     * message : successfully login
     * data : {"id":3,"name":"Divyank","mobile":"123456789","username":null,"wallet":0,"otp":"","verified_status":1,"role":"User","status":"Active","created_at":"2021-01-07T16:58:21.000000Z","updated_at":"2021-01-07T16:59:23.000000Z"}
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
         * id : 3
         * name : Divyank
         * mobile : 123456789
         * username : null
         * wallet : 0
         * otp :
         * verified_status : 1
         * role : User
         * status : Active
         * created_at : 2021-01-07T16:58:21.000000Z
         * updated_at : 2021-01-07T16:59:23.000000Z
         */

        private int id;
        private String name;
        private String mobile;
        private Object username;
        private int wallet;
        private String otp;
        private int verified_status;
        private String role;
        private String status;
        private String created_at;
        private String updated_at;

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

        public Object getUsername() {
            return username;
        }

        public void setUsername(Object username) {
            this.username = username;
        }

        public int getWallet() {
            return wallet;
        }

        public void setWallet(int wallet) {
            this.wallet = wallet;
        }

        public String getOtp() {
            return otp;
        }

        public void setOtp(String otp) {
            this.otp = otp;
        }

        public int getVerified_status() {
            return verified_status;
        }

        public void setVerified_status(int verified_status) {
            this.verified_status = verified_status;
        }

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
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
    }
}
