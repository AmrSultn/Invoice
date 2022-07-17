package com.invoice.controller;

import com.invoice.model.InvoiceHeader;
import com.invoice.model.InvoiceLine;
import com.invoice.model.InvoiceLineTableModel;
import com.invoice.view.Invoice;
import java.util.ArrayList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class TableSelection implements ListSelectionListener {

    private Invoice frame;

    public TableSelection(Invoice frame) {
        this.frame = frame;
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        int selectedInvIndex = frame.getInvHTbl().getSelectedRow();
        System.out.println("InvoiceSelected: " + selectedInvIndex);
        if (selectedInvIndex != -1) {
            InvoiceHeader selectedInv = frame.getInvoicesArray().get(selectedInvIndex);
            ArrayList<InvoiceLine> lines = selectedInv.getLines();
            InvoiceLineTableModel lineTableModel = new InvoiceLineTableModel(lines);
            frame.setLinesArray(lines);
            frame.getInvLTbl().setModel(lineTableModel);
            frame.getCustNameLbl().setText(selectedInv.getCustomer());
            frame.getInvNumLbl().setText("" + selectedInv.getNum());
            frame.getInvTotalIbl().setText("" + selectedInv.getInvoiceTotal());
            frame.getInvDateLbl().setText(Invoice.dateFormat.format(selectedInv.getInvDate()));
        }
    }

}
