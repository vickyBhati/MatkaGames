package com.dev.goldengames.model;

import androidx.annotation.NonNull;

public class Candy {
    private String number;
    private String amount;
    public Candy(String value, String amount) {
        this.number = value;
        this.amount = amount;
    }
    public String getValue() { return this.number; }
    public String getAmount() { return this.amount; }

    @NonNull
    @Override
    public String toString() {
        return number+""+amount;
    }
}
