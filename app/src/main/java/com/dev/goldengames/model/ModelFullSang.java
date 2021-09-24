package com.dev.goldengames.model;

public class ModelFullSang {

    private String number;
    private String amount;


    public ModelFullSang(String number , String amount){
        this.number = number;
        this.amount = amount;

    }

    public String getNumber(){
        return this.number;
    }

    public String getAmount(){
        return this.amount;
    }

}
