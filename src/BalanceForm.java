import javax.swing.*;

public class BalanceForm extends JFrame {
    private BankAccount bankAccount;
    private String balanceType;
    
    public BalanceForm(BankAccount bankAccount, String balanceType) {
        initComponents();
        setLocationRelativeTo(null);
        
        this.bankAccount = bankAccount;
        this.balanceType = balanceType;
        displayBalance();
    }
    
    private void displayBalance() {
        if (balanceType.equals("CURRENT")) {
            lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/currentbalance.png")));
            txtBalance.setText(bankAccount.getCurrentBalance() + "");
        }
        else {
            lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/savingsbalance.png")));
            txtBalance.setText(bankAccount.getSavingsBalance() + "");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        txtBalance = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(850, 460));
        setPreferredSize(new java.awt.Dimension(850, 460));
        setResizable(false);
        getContentPane().setLayout(null);

        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/currentbalance.png"))); // NOI18N
        getContentPane().add(lblTitle);
        lblTitle.setBounds(0, 30, 850, 50);

        txtBalance.setEditable(false);
        txtBalance.setFont(new java.awt.Font("Pricedown Bl", 0, 36)); // NOI18N
        txtBalance.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtBalance);
        txtBalance.setBounds(281, 136, 300, 50);

        btnBack.setBackground(new java.awt.Color(204, 204, 204));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(270, 230, 150, 40);

        btnCancel.setBackground(new java.awt.Color(255, 102, 102));
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel.png"))); // NOI18N
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel);
        btnCancel.setBounds(440, 230, 150, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gta5.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-3, 0, 860, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
        new AccountForm(bankAccount, "BALANCE").setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
        new LoginForm(bankAccount).setVisible(true);
    }//GEN-LAST:event_btnCancelActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtBalance;
    // End of variables declaration//GEN-END:variables
}
