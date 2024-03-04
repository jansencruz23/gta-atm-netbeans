import javax.swing.*;

public class WithdrawForm extends JFrame {
    private BankAccount bankAccount;
    private String balanceType;
    
    public WithdrawForm(BankAccount bankAccount, String balanceType) {
        initComponents();
        setLocationRelativeTo(null);
        
        this.bankAccount = bankAccount;
        this.balanceType = balanceType;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtWithdraw = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        btn3000 = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnEnter = new javax.swing.JButton();
        btn1000 = new javax.swing.JButton();
        btn2000 = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(850, 460));
        setPreferredSize(new java.awt.Dimension(850, 460));
        setResizable(false);
        getContentPane().setLayout(null);

        txtWithdraw.setFont(new java.awt.Font("Pricedown Bl", 0, 36)); // NOI18N
        txtWithdraw.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtWithdraw);
        txtWithdraw.setBounds(281, 136, 300, 50);

        btnCancel.setBackground(new java.awt.Color(255, 102, 102));
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel.png"))); // NOI18N
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel);
        btnCancel.setBounds(530, 230, 110, 40);

        btn3000.setBackground(new java.awt.Color(102, 102, 102));
        btn3000.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/3000.png"))); // NOI18N
        btn3000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3000ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3000);
        btn3000.setBounds(530, 300, 110, 40);

        btnClear.setBackground(new java.awt.Color(255, 255, 102));
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/clear.png"))); // NOI18N
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear);
        btnClear.setBounds(380, 230, 110, 40);

        btnEnter.setBackground(new java.awt.Color(153, 255, 153));
        btnEnter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/enter.png"))); // NOI18N
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnter);
        btnEnter.setBounds(230, 230, 110, 40);

        btn1000.setBackground(new java.awt.Color(102, 102, 102));
        btn1000.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1000.png"))); // NOI18N
        btn1000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1000ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1000);
        btn1000.setBounds(230, 300, 110, 40);

        btn2000.setBackground(new java.awt.Color(102, 102, 102));
        btn2000.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2000.png"))); // NOI18N
        btn2000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2000ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2000);
        btn2000.setBounds(380, 300, 110, 40);

        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/withdrawbig.png"))); // NOI18N
        getContentPane().add(lblTitle);
        lblTitle.setBounds(0, 30, 850, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gta4.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-3, 0, 850, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
        new MenuForm(bankAccount).setVisible(true);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btn3000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3000ActionPerformed
        txtWithdraw.setText("3000");
    }//GEN-LAST:event_btn3000ActionPerformed

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
       try {
            double money = Double.parseDouble(txtWithdraw.getText());
            double accountBalance = balanceType.equals("CURRENT") 
                    ? bankAccount.getCurrentBalance() 
                    : bankAccount.getSavingsBalance();

            if (accountBalance >= money) {
                if (balanceType.equals("CURRENT")) {
                    bankAccount.setCurrentBalance(accountBalance - money);
                } 
                else {
                    bankAccount.setSavingsBalance(accountBalance - money);
                }
                
                int option = JOptionPane.showConfirmDialog(this, "Do you want another transaction?",
                    "Withdraw Successful", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            
                if (option == JOptionPane.YES_OPTION) {
                    this.dispose();
                    new MenuForm(bankAccount).setVisible(true);
                }
                else {
                    this.dispose();
                    new LoginForm(bankAccount).setVisible(true);
                }
            } 
            else {
                JOptionPane.showMessageDialog(this, "Balance is insufficient.");
            }
        } 
       catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Invalid withdrawal amount.");
        }
    }//GEN-LAST:event_btnEnterActionPerformed

    private void btn1000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1000ActionPerformed
        txtWithdraw.setText("1000");
    }//GEN-LAST:event_btn1000ActionPerformed

    private void btn2000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2000ActionPerformed
        txtWithdraw.setText("2000");
    }//GEN-LAST:event_btn2000ActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtWithdraw.setText("");
    }//GEN-LAST:event_btnClearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1000;
    private javax.swing.JButton btn2000;
    private javax.swing.JButton btn3000;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnEnter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtWithdraw;
    // End of variables declaration//GEN-END:variables
}
