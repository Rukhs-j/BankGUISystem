/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main.view;
import java.sql.*;
import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;
import javax.swing.*;


/**
 *
 * @author RUKHSAR-JAMADAR
 */
public class Transaction extends javax.swing.JFrame {
    
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";          //declaration of static variable JDBC_DRIVER and value initialized to it
    static final String DB_URL = "jdbc:mysql://localhost:3307/accountdetails"; //declaration of static variable DB_URL,databse path initialized to it
    //Database Credentials
    static final String USER = "root";                                  //declaration of static variable USER and value initialized to it
    static final String PASS = "";
    static Connection connection;
    static PreparedStatement pst=null;
    Calendar calendar = Calendar.getInstance();
               java.sql.Date date = new java.sql.Date(calendar.getTime().getTime());
              
 
    ResultSet rs;
    

    

    /**
     * Creates new form Transaction
     */
    public Transaction() {
        initComponents();
     
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        am_f = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        bal_f = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        accno_f = new javax.swing.JTextField();
        date_f = new javax.swing.JTextField();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(102, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("******* Transaction ******");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 11, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Account Number:");
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 46, -1, -1));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 86, -1, -1));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 135, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Amount:");
        jLabel6.setToolTipText("");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 156, -1, -1));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 212, -1, -1));

        am_f.setText("amount");
        am_f.setToolTipText("");
        am_f.setMargin(new java.awt.Insets(2, 20, 2, 20));
        am_f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                am_fActionPerformed(evt);
            }
        });
        getContentPane().add(am_f, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 153, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Balance");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        bal_f.setText("balance");
        bal_f.setToolTipText("");
        bal_f.setDisabledTextColor(new java.awt.Color(51, 51, 0));
        bal_f.setDragEnabled(true);
        bal_f.setMargin(new java.awt.Insets(2, 20, 2, 20));
        getContentPane().add(bal_f, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 102, 102));
        jButton1.setText("Deposit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 255, 255));
        jButton2.setText("withdraw");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, -1, -1));

        jButton3.setBackground(new java.awt.Color(51, 0, 51));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 0, 204));
        jButton3.setText("find");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Date");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        accno_f.setText("jTextField1");
        getContentPane().add(accno_f, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        date_f.setText("jTextField1");
        date_f.setMargin(new java.awt.Insets(2, 20, 2, 20));
        getContentPane().add(date_f, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void am_fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_am_fActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_am_fActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try
        {
        String acc_no=accno_f.getText();
        Class.forName(JDBC_DRIVER);
        connection=DriverManager.getConnection(DB_URL,USER,PASS);
        pst=connection.prepareStatement(" SELECT `balance` FROM `account_tbl` WHERE `account_number`='"+acc_no+"'");
        
       
        rs=pst.executeQuery();
        if(rs.next()==false)
        {
          JOptionPane.showMessageDialog(this,"account number not found");   
        }
        else
        {
            String balance=rs.getString(1);
            bal_f.setText(balance.trim());
           date_f.setText(date.toString());
        }
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);  
            
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try
        {
        String amt=am_f.getText().toString();
        String acc_no=accno_f.getText();
        Class.forName(JDBC_DRIVER);
        connection=DriverManager.getConnection(DB_URL,USER,PASS);
        pst=connection.prepareStatement(" SELECT `balance` FROM `account_tbl` WHERE `account_number`='"+acc_no+"'");
        
       
        rs=pst.executeQuery();
        if(rs.next()==false)
        {
          JOptionPane.showMessageDialog(this,"account number not found");   
        }
        else
        {
            String balance=rs.getString(1);
           int bal=Integer.parseInt(balance);
           int amt1=Integer.parseInt(amt);
           bal=bal+amt1;
           
           bal_f.setText(String.valueOf(bal));
           am_f.setText(String.valueOf(amt1));
         
            String sql="INSERT INTO `transaction_tbl`( `account_number`, `date`, `amount`, `balance`) VALUES ('"+acc_no+"','"+date+"','"+amt1+"','"+bal+"')";
             System.out.println("sql " + sql);
        pst=connection.prepareStatement(sql);
        pst.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Amount deposited SUCCESSFULLY!!");
  
        }
        
        }
        catch(Exception e)
        {
          JOptionPane.showMessageDialog(null,e);    
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try
        {
        String amt=am_f.getText().toString();
        String acc_no=accno_f.getText();
        Class.forName(JDBC_DRIVER);
        connection=DriverManager.getConnection(DB_URL,USER,PASS);
        pst=connection.prepareStatement(" SELECT `balance` FROM `account_tbl` WHERE `account_number`='"+acc_no+"'");
        
       
        rs=pst.executeQuery();
        if(rs.next()==false)
        {
          JOptionPane.showMessageDialog(this,"account number not found");   
        }
        else
        {
            String balance=rs.getString(1);
           int bal=Integer.parseInt(balance);
           int amt1=Integer.parseInt(amt);
           if(bal>=amt1)
           {
           bal=bal-amt1;
            bal_f.setText(String.valueOf(bal));
            am_f.setText(String.valueOf(amt1));
            String sql1="INSERT INTO `transaction_tbl`( `account_number`, `date`, `amount`, `balance`) VALUES ('"+acc_no+"','"+date+"','"+amt1+"','"+bal+"')";
             System.out.println("sql " + sql1);
        pst=connection.prepareStatement(sql1);
        pst.executeUpdate(sql1);
            JOptionPane.showMessageDialog(this,"amount withdrawl Successfully!");     
            
           }
           else
           {
             JOptionPane.showMessageDialog(this,"Insufficient balance!!plz check the balance");     
           }
           
          
        }
        
        }
        catch(Exception e)
        {
          JOptionPane.showMessageDialog(null,e);    
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Transaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transaction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accno_f;
    private javax.swing.JTextField am_f;
    private javax.swing.JTextField bal_f;
    private javax.swing.JTextField date_f;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

   
    }

