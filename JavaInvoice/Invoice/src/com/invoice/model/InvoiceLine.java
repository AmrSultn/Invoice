package com.invoice.model;

public class InvoiceLine {
    private String item;
    private double price;
    private int count;
    private InvoiceHeader header;

    public InvoiceLine() {
    }

    public InvoiceLine(String item, double price, int count, InvoiceHeader header) {
        this.item = item;
        this.price = price;
        this.count = count;
        this.header = header;
    }

    public InvoiceHeader getHeader() {
        return header;
    }
     public void setItem(String item) {
        this.item = item;
    }

    public void setHeader(InvoiceHeader header) {
        this.header = header;
    }

    public String getItem() {
        return item;
    }

   

    public double getPrice() {
        return price;
    }
    
    @Override
    public String toString() {
        return header.getNum() + "," + item + "," + price + "," + count;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getLineTotal() {
        return price * count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    

    

    
    
}
