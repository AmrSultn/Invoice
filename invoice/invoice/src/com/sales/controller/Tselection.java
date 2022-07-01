package com.sales.controller;
import com.sales.model.InvLineTableModel;
import com.sales.model.InvoiceHeader;
import com.sales.model.InvoiceLine;
import com.sales.model.InvoiceHeader;
import com.sales.view.invoice;
import java.util.ArrayList;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class Tselection implements  ListSelectionListener {
    private invoice frame;

    public Tselection(invoice frame) {
        this.frame = frame;
    }
    
    
    public void valueChanged(ListSelectionEvent e){
        int selectedInvIndex = frame.getInvHTB1().getSelectedRow();
        System.out.println("Invoice selected :"+ selectedInvIndex);
        InvoiceHeader SelectedInv =frame.getInvoicesArray().get(selectedInvIndex);
        ArrayList<InvoiceLine>lines =SelectedInv.getLines();
        System.out.println("DD: "+lines.get(selectedInvIndex).getItem());
        InvLineTableModel lineTableModel = new InvLineTableModel(lines);
        frame.getInvLTb1().setModel(lineTableModel);
        frame.getInvoiceTotal().setText(""+SelectedInv.getInvoiceTotal());
        frame.getCustomerName().setText(SelectedInv.getCustomer());
        frame.getInvoiceDate().setText(invoice.dateFormat.format(SelectedInv.getInvoiceDate()));
        frame.getInvoiceNumber().setText(""+SelectedInv.getNum());
           }
    
}
