package com.sales.model;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import com.sales.view.invoice;
public class InvHeaderTable  extends AbstractTableModel {
    private ArrayList<InvoiceHeader> invoicesArray;
    private String [] columns ={"Invoice Num","invoice date","customer name","Total"};
    

        public InvHeaderTable(ArrayList<InvoiceHeader> invoicesArray) {
        this.invoicesArray = invoicesArray;
    }

    @Override
    public int getRowCount() {
        return invoicesArray.size();
    
    }

    @Override
    public int getColumnCount() {
                return columns.length;

    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
                 InvoiceHeader inv = invoicesArray.get(rowIndex) ;
                 switch(columnIndex){
                     case 0:return inv.getNum();
                     case 1:return invoice.dateFormat.format(inv.getInvoiceDate());
                     case 2:return inv.getCustomer();
                     case 3:return inv.getInvoiceTotal();
                 }
                  return "";
    }
                 

    
    public String getColumnName(int column){
       
        return columns[column];
       
                
    }
}
        

       
    
    

