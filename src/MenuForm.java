import javax.swing.*;

public class MenuForm extends JFrame {
    private BankAccount bankAccount;
    
    public MenuForm(BankAccount bankAccount) {
        initComponents();
        setLocationRelativeTo(null);
        this.bankAccount = bankAccount;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBalance = new javax.swing.JButton();
        btnDeposit = new javax.swing.JButton();
        btnWithdraw = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(850, 460));
        setPreferredSize(new java.awt.Dimension(850, 460));
        setResizable(false);
        getContentPane().setLayout(null);

        btnBalance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alance.png"))); // NOI18N
        btnBalance.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBalanceActionPerformed(evt);
            }
        });
        getContentPane().add(btnBalance);
        btnBalance.setBounds(580, 110, 180, 180);

        btnDeposit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/deposit3.png"))); // NOI18N
        btnDeposit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositActionPerformed(evt);
            }
        });
        getContentPane().add(btnDeposit);
        btnDeposit.setBounds(110, 110, 180, 180);

        btnWithdraw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/www.png"))); // NOI18N
        btnWithdraw.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnWithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWithdrawActionPerformed(evt);
            }
        });
        getContentPane().add(btnWithdraw);
        btnWithdraw.setBounds(345, 110, 180, 180);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/deposit.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 310, 180, 20);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ww.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(350, 305, 170, 30);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/b.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(590, 300, 160, 40);

        btnCancel.setBackground(new java.awt.Color(255, 102, 102));
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel.png"))); // NOI18N
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel);
        btnCancel.setBounds(640, 363, 120, 40);

        jLabel4.setFont(new java.awt.Font("Pricedown", 0, 48)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 20, 850, 70);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/enu.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(-3, -4, 860, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositActionPerformed
        this.dispose();
        new AccountForm(bankAccount, "DEPOSIT").setVisible(true);
    }//GEN-LAST:event_btnDepositActionPerformed

    private void btnWithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWithdrawActionPerformed
        this.dispose();
        new AccountForm(bankAccount, "WITHDRAW").setVisible(true);
    }//GEN-LAST:event_btnWithdrawActionPerformed

    private void btnBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBalanceActionPerformed
        this.dispose();
        new AccountForm(bankAccount, "BALANCE").setVisible(true);
    }//GEN-LAST:event_btnBalanceActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
        new LoginForm(bankAccount).setVisible(true);
    }//GEN-LAST:event_btnCancelActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBalance;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDeposit;
    private javax.swing.JButton btnWithdraw;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
