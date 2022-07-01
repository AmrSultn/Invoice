
package com.sales.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;



public class InvLineTableModel extends AbstractTableModel {
    
     private ArrayList<InvoiceLine> LinesArray;
     private String [] columns ={"Item Name","Unit Price","Count", " ToTal"};

    public InvLineTableModel(ArrayList<InvoiceLine> LinesArray) {
        this.LinesArray = LinesArray;
    }
     



        
    @Override
    public int getRowCount(){
        return LinesArray.size();


        
    } 

    @Override
    public int getColumnCount(){
        return columns.length;
}
        

    

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        InvoiceLine line = LinesArray.get(rowIndex);
        switch (columnIndex){
            case 0: return line.getItem();
            case 1: return line.getPrice();
            case 2: return line.getCount();
            case 3: return line.getLineTotal();
            default: return"";
            
        }
    }
    public String getColumnName(int column){
        return columns[column];
       
        
        }
}