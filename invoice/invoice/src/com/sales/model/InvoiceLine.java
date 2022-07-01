package com.sales.model;


public class InvoiceLine {
    private int invum;

    public InvoiceLine(int invum, String item, double price, int count, InvoiceHeader header) {
        this.invum = invum;
        this.item = item;
        this.price = price;
        this.count = count;
        this.header = header;
    }
    private String item;
    private double price;
    private int count;
    private InvoiceHeader header;

    public InvoiceLine() {
    }

    public InvoiceLine(String str4, double price, int count, InvoiceHeader inv) {
        this.item=str4;
        this.price=price;
        this.count=count;
        this.header=inv;
    }

    public int getInvum() {
        return invum;
    }

    public void setInvum(int invum) {
        this.invum = invum;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public InvoiceHeader getHeader() {
        return header;
    }

    public void setHeader(InvoiceHeader header) {
        this.header = header;
    }
    public double getLineTotal(){
        return price * count;
    }

    @Override
    public String toString() {
        return "InvoiceLine {" + "invum=" + invum + ", item=" + item + ", price=" + price + ", count=" + count + ", header=" + header + "}";
    } 
    
}
