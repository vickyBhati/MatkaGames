package com.dev.goldengames;

public class ModelLogin {

    /**
     * token_type : Bearer
     * expires_in : 3600
     * access_token : eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImp0aSI6IjU4OWE3NTcyOTZlNTI1OTA4NDQ1NGY1YzdiYTRhMjk1ZDRiZDJlZjM5YzEyYjI0ZDIxNjQ1NTdkZGEwYWFlMDY1NDFiNmMyNDg5N2ZjMGY5In0.eyJhdWQiOiI2YTFkMjFmMS1lZTJhLTVhMjctYzE3ZC02MDJmMWMxNDAwYTciLCJqdGkiOiI1ODlhNzU3Mjk2ZTUyNTkwODQ0NTRmNWM3YmE0YTI5NWQ0YmQyZWYzOWMxMmIyNGQyMTY0NTU3ZGRhMGFhZTA2NTQxYjZjMjQ4OTdmYzBmOSIsImlhdCI6MTYxMzgxMjQzNiwibmJmIjoxNjEzODEyNDM2LCJleHAiOjE2MTM4MTYwMzYsInN1YiI6IjEiLCJzY29wZXMiOltdfQ.e04ZAnLl2uy0F2F4oaUXfWnBEEzwxstWVmGXonHtO_6P596ohP2mU7-btE6-qyqMMIXmjjeGUu2KsRmzdTId9Trb5u--hAbim40hnG7eDMQMCq_4SJ5HpAB_w3-5GhCfY6awzQYK2RFZ77G6-76cRosPlgNdAndwh7mnIfWC4jEkhm1SkxhPDuejnUp6MqYCqRYAsxAh29L9padMTvr8EqZJ9-gvwxV0pNb6geMvZAht63AIiGAAIgGjMHGajdXQVCmHSgr_MJQbrXfwfeqhcSB5aslyoOTJD9WeRZn2_NImLVzQ7YqzIntgCJilHL7JyAJJobOexiZ0XJty10F5wQ
     * refresh_token : def502000bed48f41d4b67508383ea44b1b008a7bb5bee2106e3d721becb8c85bec6fe7ae0fdf6f46a47d2517c64fff1898392aa1e7f24952a12dd0bb8d542fc3e89d65f71a63622c8c462e542cb89efeb8b2a5fc1dcc256048998f9c8400727abba6534f930019b99e40b2550afc56ecd466066a5e84ff2e39022fae6842a2fc3d37d5aa8e88640e1851996ef34725398f467e92941c15b8e7705a48d25600dddd24f29a6c848570a20c7670f824bb457c0754199f916d7b1534f6a1ecb247d6b09663379e7a2d0c0310e08cbbb7f6c19a2badb6e90ea3304055ea7a9c102fa8fec8e2225dd648fbb41f0fe2b6f26553e86063ec9b630921ab427ff0102577028b7c753f86947f101080da047c498f58a245cdfa6aa15ddca221580e1315a2f918278f865e459963ca27df62307e01865d965b946c6120bd41ba4db051553a5980fd3cbf7b7465e061a412a4a5b9dd96fd4214a40b354b58e0c89bf45ba94c4e433e824f4cb6a75a6041803e2a14303ed302c20d14e20e080fc172fc824af4431fc2e4b94b6
     */

    private String token_type;
    private int expires_in;
    private String access_token;
    private String refresh_token;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;

    public String getToken_type() {
        return token_type;
    }

    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }

    public int getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(int expires_in) {
        this.expires_in = expires_in;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getRefresh_token() {
        return refresh_token;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }
}
