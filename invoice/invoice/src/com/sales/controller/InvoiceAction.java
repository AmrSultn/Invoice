package com.sales.controller;

import com.sales.model.InvHeaderTable;
import com.sales.model.InvoiceHeader;
import com.sales.model.InvoiceLine;
import com.sales.view.invoice;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;



public class InvoiceAction implements ActionListener {
    private static   invoice frame;  
    public  InvoiceAction (invoice frame) {
        InvoiceAction.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         switch (e.getActionCommand()) {
             case "Save File" :
                saveFiles();
                 break;
             case "Load File":
                    LoadFile();
                     break;
             case "New":
                 createNewInvoice();
                 break;
                     
             case "Delete Invoice":
                 deleteInvoice();
                 break;
             case "New Line" :
                 createNewLine();
                 break;
             case "Delete Line" :
                 deleteLine();
                  break;
            }
         }

    private void saveFiles() {
        
    }    

         private void LoadFile() {
                         
        JFileChooser fileChooser = new JFileChooser();
        ArrayList<InvoiceHeader> InvoiceHeaders;
        try{
        int result = fileChooser.showOpenDialog(frame);
        if (result == JFileChooser.APPROVE_OPTION){
            File headerFile = fileChooser.getSelectedFile();
        Path headerPath = Paths.get(headerFile.getAbsolutePath());
          List<String> headerLines = Files.readAllLines(headerPath);
          InvoiceHeaders=new ArrayList<>();
          for(int i=0;i<headerLines.size();i++)
          {
            System.out.println(headerLines.get(i));
          }
        for(String headerLine : headerLines){
           String []arr = headerLine.split(",");
           String str1 = arr[0];
           String str2 = arr[1];
           String str3 = arr[2];
           int code = Integer.parseInt(str1);
           Date invoiceDate=invoice.dateFormat.parse(str2);
           InvoiceHeader header = new InvoiceHeader(code,str3,invoiceDate);
           InvoiceHeaders.add(header);
        }
        frame.setInvoicesArray(InvoiceHeaders);
        result = fileChooser.showOpenDialog(frame);
        if  (result == JFileChooser.APPROVE_OPTION){
             File lineFile = fileChooser.getSelectedFile();
        Path linePath = Paths.get(lineFile.getAbsolutePath());
          List<String> lineLines = Files.readAllLines(linePath);
          for (String lineLine :lineLines ){
              String[] arr =lineLine.split(",");
              String str1 =arr[0]; //ItemInvoiceNumber 
              String str2 =arr[1]; //ItemInvoiceName
              String str3 =arr[2]; //ItemInvoicePrice
              String str4 =arr[3]; //ItemInvoiceCount
              int invCode =Integer.parseInt(str1);
              double price =Double.parseDouble(str3);
              int count = Integer.parseInt(str4);
              InvoiceHeader inv = frame.getInvObject(invCode);
              InvoiceLine line = new InvoiceLine(str2,price,count,inv);
              inv.getLines().add(line);
          
          }
        
          InvHeaderTable headerTableModel = new InvHeaderTable(InvoiceHeaders);
          frame.setHeaderTableModel(headerTableModel);
          frame.getInvHTB1().setModel (headerTableModel);
            System.out.println("file is reading");
            for (int x=0;x<InvoiceHeaders.get(0).getLines().size();x++)
            {
                System.out.println(InvoiceHeaders.get(0).getLines().get(x).getItem());
            }
            }
        
        
                

        }
        }catch (  IOException ex) {
            JOptionPane.showMessageDialog(frame,"Wrong load file","Error",JOptionPane.ERROR_MESSAGE);
                }
                  
        catch (ParseException ex){
            JOptionPane.showMessageDialog(frame,"Wrong Date Entered","Error",JOptionPane.ERROR_MESSAGE);
        }
         }


    private void createNewInvoice() {
    }

    private void deleteInvoice() {
    }

    private void createNewLine() {
    }

    private void deleteLine() {
    }

    private static class ex {

    private  void getMessage() {
            
            
        }
      
        public ex() {
        }
    }
  
    }

       



                
                      

   

       

   

   
   

   

    
       

    

