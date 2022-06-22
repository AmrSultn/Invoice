
package com.sales.controller;

import com.sales.model.InvoiceHeader;
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
    private SimpleDateFormat dateFormat =new SimpleDateFormat("dd-mm-yyyy");
    
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

         private void LoadFile(){
                         
        JFileChooser fileChooser = new JFileChooser();
        try{
        int result = fileChooser.showOpenDialog(frame);
        if (result == JFileChooser.APPROVE_OPTION){
            File headerFile = fileChooser.getSelectedFile();
        Path headerPath = Paths.get(headerFile.getAbsolutePath());
          List<String> headerLines = Files.readAllLines(headerPath);
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
           Date invoiceDate=null;
                try {
                    invoiceDate = dateFormat.parse(str2);
                } catch (ParseException ex) {
                    //exception if date format is wrong
                }
                InvoiceHeader header =new InvoiceHeader(code,str3,invoiceDate);
         }
        }   
        }catch (IOException ex){
            JOptionPane.showMessageDialog(frame,ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
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

       



                
                      

   

       

   

   
   

   

    
       

    

