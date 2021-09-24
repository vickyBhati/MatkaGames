package com.dev.goldengames.model;

public class ModelAdd {


    private String p_name;
    private String qty;
    private String price;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    private int total;

    public ModelAdd(String p_name, String qty, String price, int total) {
        this.p_name = p_name;
        this.qty = qty;
        this.price = price;
        this.total = total;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
