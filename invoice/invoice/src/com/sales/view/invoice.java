
package com.sales.view;

import com.sales.controller.InvoiceAction;
import com.sales.model.InvHeaderTable;
import com.sales.model.InvoiceHeader;
import com.sales.controller.Tselection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JTable;

import com.sales.model.InvoiceLine;
import javax.swing.JLabel;

import javax.swing.event.ListSelectionListener;

public class invoice extends javax.swing.JFrame {

     InvoiceAction invoiceAction;
    public invoice() {
        initComponents();
        invoiceAction=new InvoiceAction(this);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        InvHTb1 = new javax.swing.JTable();
        CreateInvoiceButton = new javax.swing.JButton();
        deleteInvoiceButton = new javax.swing.JButton();
        InvoiceNumber = new javax.swing.JLabel();
        InvoiceDate = new javax.swing.JLabel();
        InvoiceName = new javax.swing.JLabel();
        InvoiceTotal = new javax.swing.JLabel();
        invNum = new javax.swing.JLabel();
        invDate = new javax.swing.JLabel();
        custName = new javax.swing.JLabel();
        invTotal = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        InvLTb1 = new javax.swing.JTable();
        New = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        LoadFile = new javax.swing.JMenuItem();
        saveMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        InvHTb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        InvHTb1.setShowVerticalLines(true);
        InvHTb1.getSelectionModel().addListSelectionListener(selectionListener);
        jScrollPane1.setViewportView(InvHTb1);

        CreateInvoiceButton.addActionListener(ActionListener);
        CreateInvoiceButton.setText("New Invoice");

        deleteInvoiceButton.addActionListener(ActionListener);
        deleteInvoiceButton.setText("Delete Invoice");
        deleteInvoiceButton.setToolTipText("");
        deleteInvoiceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteInvoiceButtonActionPerformed(evt);
            }
        });

        InvoiceNumber.setText("Invoice Num");

        InvoiceDate.setText("Invoice Date");

        InvoiceName.setText("Customer Name");

        InvoiceTotal.setText("Invoice Total");

        InvLTb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        InvLTb1.setShowVerticalLines(true);
        jScrollPane2.setViewportView(InvLTb1);

        CreateLineButton.addActionListener(ActionListener);
        New.setText("New");
        New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewActionPerformed(evt);
            }
        });

        jButton4.setText("Delete Line");
        deleteLineButton.addActionListener(ActionListener);

        jMenu1.setText("File");

        LoadFile.addActionListener(ActionListener);
        LoadFile.setText("Load File");
        LoadFile.addActionListener(invoiceAction);
        LoadFile.setActionCommand("Load File");
        jMenu1.add(LoadFile);

        saveMenu.addActionListener(ActionListener);
        saveMenu.setText("Save File");
        saveMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuActionPerformed(evt);
            }
        });
        jMenu1.add(saveMenu);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InvoiceNumber)
                            .addComponent(InvoiceDate)
                            .addComponent(InvoiceName)
                            .addComponent(InvoiceTotal))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(invTotal)
                            .addComponent(custName)
                            .addComponent(invDate)
                            .addComponent(invNum))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CreateInvoiceButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteInvoiceButton)
                .addGap(160, 160, 160)
                .addComponent(New)
                .addGap(79, 79, 79)
                .addComponent(jButton4)
                .addContainerGap(184, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(InvoiceNumber)
                            .addComponent(invNum))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(InvoiceDate)
                            .addComponent(invDate))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(InvoiceName)
                            .addComponent(custName))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(InvoiceTotal)
                            .addComponent(invTotal))
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deleteInvoiceButton)
                            .addComponent(CreateInvoiceButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(New)
                            .addComponent(jButton4))))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewActionPerformed
    }//GEN-LAST:event_NewActionPerformed

    private void saveMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuActionPerformed
    }//GEN-LAST:event_saveMenuActionPerformed

    private void deleteInvoiceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteInvoiceButtonActionPerformed
    }//GEN-LAST:event_deleteInvoiceButtonActionPerformed

    
    public static void main(String args[]) {
        
        
        java.awt.EventQueue.invokeLater(() -> {
            new invoice().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateInvoiceButton;
    private javax.swing.JTable InvHTb1;
    private javax.swing.JTable InvLTb1;
    private javax.swing.JLabel InvoiceDate;
    private javax.swing.JLabel InvoiceName;
    private javax.swing.JLabel InvoiceNumber;
    private javax.swing.JLabel InvoiceTotal;
    private javax.swing.JMenuItem LoadFile;
    private javax.swing.JButton New;
    private javax.swing.JLabel custName;
    private javax.swing.JButton deleteInvoiceButton;
    private javax.swing.JLabel invDate;
    private javax.swing.JLabel invNum;
    private javax.swing.JLabel invTotal;
    private javax.swing.JButton jButton4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem saveMenu;
    // End of variables declaration//GEN-END:variables

    private  InvoiceAction  ActionListener =new InvoiceAction(this);
    private ArrayList<InvoiceHeader> invoicesArray;
    private InvHeaderTable headerTableModel;
    public  static SimpleDateFormat dateFormat =new SimpleDateFormat("dd-mm-yyyy");
    private Tselection selectionListener = new Tselection(this);
    
    


    public void setInvoicesArray(ArrayList<InvoiceHeader > invoicesArray) {
        this.invoicesArray = invoicesArray;
    }

    public ArrayList<InvoiceHeader> getInvoicesArray() {
        return invoicesArray;
    }
    
    
      public InvoiceHeader getInvObject(int code){
        for (InvoiceHeader inv : invoicesArray){
            if(inv.getNum()==code){
            return inv;
         
        }   
    }
    return null;
    
      } 
      
      
      

    public JTable getInvHTB1() {
        return InvHTb1;
    }

    public JTable getInvLTb1() {
        return InvLTb1;
    }

    public JLabel getInvoiceDate() {
        return invDate;
    }

    public JLabel getCustomerName() {
        return custName;
    }

    public JLabel getInvoiceNumber() {
        return invNum;
    }

    public JLabel getInvoiceTotal() {
        return invTotal;
    }
    

   
    

    private static class CreateLineButton {

        private static void addActionListener(InvoiceAction ActionListener) {
        }

        public CreateLineButton() {
        }
    }

    private static class deleteLineButton {

        private static void addActionListener(InvoiceAction ActionListener) {
           
        }

        public deleteLineButton() {
        }
    }

    private static class LoadFile {

        public LoadFile() {
        }
    }

    public InvHeaderTable getHeaderTableModel() {
        return headerTableModel;
    }

    public void setHeaderTableModel(InvHeaderTable headerTableModel) {
        this.headerTableModel = headerTableModel;
    }

    

   
    

    
    }

        
            
        
 

