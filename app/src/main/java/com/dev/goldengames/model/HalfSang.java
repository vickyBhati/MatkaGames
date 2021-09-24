package com.dev.goldengames.model;

public class HalfSang {

    private String number;
    private String amount;
    private String bet_type;


    public HalfSang(String number , String amount, String bet_type){
        this.number = number;
        this.amount = amount;
        this.bet_type = bet_type;
    }

    public String getNumber(){
        return this.number;
    }

    public String getAmount(){
        return this.amount;
    }
    public String getBet_type(){
        return this.bet_type;
    }

}
