import javax.swing.*;

public class AccountForm extends JFrame {
    private BankAccount bankAccount;
    private String action;
    
    public AccountForm(BankAccount bankAccount, String action) {
        initComponents();
        setLocationRelativeTo(null);
        
        this.bankAccount = bankAccount;
        this.action = action;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSavings = new javax.swing.JButton();
        btnCurrent = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(850, 460));
        setMinimumSize(new java.awt.Dimension(850, 460));
        setPreferredSize(new java.awt.Dimension(850, 460));
        setResizable(false);
        setSize(new java.awt.Dimension(850, 460));
        getContentPane().setLayout(null);

        btnSavings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/savings.png"))); // NOI18N
        btnSavings.setText("   ");
        btnSavings.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSavings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSavingsActionPerformed(evt);
            }
        });
        getContentPane().add(btnSavings);
        btnSavings.setBounds(90, 210, 510, 50);

        btnCurrent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/current.png"))); // NOI18N
        btnCurrent.setText("   ");
        btnCurrent.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCurrent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCurrentActionPerformed(evt);
            }
        });
        getContentPane().add(btnCurrent);
        btnCurrent.setBounds(90, 130, 510, 50);

        btnCancel.setBackground(new java.awt.Color(255, 102, 102));
        btnCancel.setForeground(new java.awt.Color(255, 102, 102));
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel.png"))); // NOI18N
        btnCancel.setToolTipText("");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel);
        btnCancel.setBounds(640, 330, 120, 40);

        btnBack.setBackground(new java.awt.Color(204, 204, 204));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back.png"))); // NOI18N
        btnBack.setMaximumSize(new java.awt.Dimension(75, 23));
        btnBack.setMinimumSize(new java.awt.Dimension(75, 23));
        btnBack.setPreferredSize(new java.awt.Dimension(75, 23));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(490, 330, 120, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/acc.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-3, 0, 860, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
        new MenuForm(bankAccount).setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
        new LoginForm(bankAccount).setVisible(true);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnCurrentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCurrentActionPerformed
        openForm("CURRENT");
    }//GEN-LAST:event_btnCurrentActionPerformed

    private void btnSavingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSavingsActionPerformed
        openForm("SAVINGS");
    }//GEN-LAST:event_btnSavingsActionPerformed

    private void openForm(String balanceType) {
        this.dispose();
        
        switch (action) {
            case "DEPOSIT":
                new DepositForm(bankAccount, balanceType).setVisible(true);
                break;
            case "WITHDRAW":
                new WithdrawForm(bankAccount, balanceType).setVisible(true);
                break;
            case "BALANCE":
                new BalanceForm(bankAccount, balanceType).setVisible(true);
                break;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCurrent;
    private javax.swing.JButton btnSavings;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
