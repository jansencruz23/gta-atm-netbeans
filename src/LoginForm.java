import javax.swing.*;

public class LoginForm extends JFrame {
    private BankAccount bankAccount;
    private int tries = 3;

    public LoginForm() {
        initComponents();
        setLocationRelativeTo(null);
        bankAccount = new BankAccount();
    }
    
    public LoginForm(BankAccount bankAccount) {
        initComponents();
        this.bankAccount = bankAccount;
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jLabel1 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        btnEnter = new javax.swing.JButton();
        txtPin = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(850, 460));
        setResizable(false);
        setSize(new java.awt.Dimension(850, 460));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Pricedown Bl", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pin.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(280, 140, 300, 30);

        btnCancel.setBackground(new java.awt.Color(255, 102, 102));
        btnCancel.setFont(new java.awt.Font("Pricedown Bl", 0, 18)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel.png"))); // NOI18N
        btnCancel.setMaximumSize(new java.awt.Dimension(72, 23));
        btnCancel.setMinimumSize(new java.awt.Dimension(72, 23));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel);
        btnCancel.setBounds(440, 270, 150, 40);

        btnEnter.setBackground(new java.awt.Color(153, 255, 153));
        btnEnter.setFont(new java.awt.Font("Pricedown Bl", 0, 18)); // NOI18N
        btnEnter.setForeground(new java.awt.Color(51, 51, 51));
        btnEnter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/enter.png"))); // NOI18N
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnter);
        btnEnter.setBounds(270, 270, 150, 40);

        txtPin.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        txtPin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPinKeyTyped(evt);
            }
        });
        getContentPane().add(txtPin);
        txtPin.setBounds(280, 170, 300, 50);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo2.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(-30, 280, 320, 180);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sub.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 20, 850, 33);

        jLabel2.setFont(new java.awt.Font("Pricedown", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 30, 850, 90);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gta2.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, -10, 850, 460);

        jLabel4.setFont(new java.awt.Font("Pricedown", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 30, 850, 90);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
        String password = String.valueOf(txtPin.getPassword());

        if (password.equals(bankAccount.getPinNumber())) {
            this.dispose();
            new MenuForm(bankAccount).setVisible(true);
        }
        else {
            tries--;
            if (tries > 0) {
                JOptionPane.showMessageDialog(this, "Incorrect PIN. Try again.");
                txtPin.setText("");
            }
            else {
                dispose();
            }
        }
    }//GEN-LAST:event_btnEnterActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtPinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPinKeyTyped
        String password = String.valueOf(txtPin.getPassword());
        char c = evt.getKeyChar();
        
        if (!Character.isDigit(c) || password.length() >= 6) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPinKeyTyped

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnEnter;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField txtPin;
    // End of variables declaration//GEN-END:variables
}
