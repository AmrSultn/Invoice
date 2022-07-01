package com.sales.model;
import java.util.ArrayList;
import java.util.Date;
public class InvoiceHeader {
    private int num;
    private String customer;
    private Date invoiceDate;
    private ArrayList<InvoiceLine>lines;

    public InvoiceHeader() {
    }

    public InvoiceHeader(int num, String customer, Date invoiceDate) {
        this.num = num;
        this.customer = customer;
        this.invoiceDate = invoiceDate;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }
    
    public ArrayList<InvoiceLine> getLines() {
        if (lines == null) {
            lines = new ArrayList<>();
        }
        return lines;
    }
    public void setline(ArrayList<InvoiceLine>InvoiceLine){
        this.lines=InvoiceLine;
        
    
    }

    @Override
    public String toString() {
        return "InvoiceHeader{" + "num=" + num + ", customer=" + customer + ", invoiceDate=" + invoiceDate + '}';
    }
    
    public double getInvoiceTotal(){
            double total=0.0;
            for(int i=0;i<lines.size();i++){
                total+=lines.get(i).getLineTotal();
            }
            
            return total;
            
    
}

   
}
