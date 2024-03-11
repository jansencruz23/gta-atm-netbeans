
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import javax.swing.Timer;

public class ReceiptForm extends javax.swing.JFrame {
    private BankAccount bankAccount;
    private String balanceType;
    private String transactionMode;
    private double amount;
    
    public ReceiptForm(BankAccount bankAccount,
            String balanceType,
            String transactionMode,
            double amount) {
        this.bankAccount = bankAccount;
        this.balanceType = balanceType;
        this.transactionMode = transactionMode;
        this.amount = amount;
        
        initComponents();
        setLocationRelativeTo(null);
        initializeReceipt();
        timer();
    }

    private void initializeReceipt() {
        lblDate.setText("DATE  :" + getCurrentDate());
        lblTime.setText("TIME  :" + getCurrentTime());
        lblMode.setText(transactionMode);
        lblType.setText(balanceType);
        lblAmount.setText("AMOUNT :" + amount);
        lblRef.setText("REF  #:" + getRefNumber());
        
        if (balanceType.equals("SAVINGS")) {
            lblBalance.setText("BALANCE:" + bankAccount.getSavingsBalance());
        }
        else {      
            lblAmount.setText("AMOUNT :" + amount);
            lblBalance.setText("BALANCE:" + bankAccount.getCurrentBalance());
        }
    }
    
    private String getRefNumber() {
        var random = new Random();
        var ref = random.nextInt(1000000, 99999999);
        
        return ref + "";
    }
    
    private String getCurrentDate() {
        var currentDate = LocalDate.now();
        var dateFormat = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        
        return currentDate.format(dateFormat);
    }
    
    private String getCurrentTime() {
        var currentTime = LocalTime.now();
        var timeFormat = DateTimeFormatter.ofPattern("h:mm:ss a");
        
        return currentTime.format(timeFormat);
    }
    
    private void timer() {
        var timer = new Timer(100, new ActionListener() {
            int count = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                progressBar.setValue(count * 100);
                if (count == 30) {
                    ((Timer) e.getSource()).stop();
                    dispose();
                }
            }
        });
        
        timer.start();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblMode = new javax.swing.JLabel();
        lblBalance = new javax.swing.JLabel();
        lblTitle3 = new javax.swing.JLabel();
        lblRef = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        lblTitle7 = new javax.swing.JLabel();
        lblType = new javax.swing.JLabel();
        lblAmount = new javax.swing.JLabel();
        lblTitle10 = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(400, 510));
        setPreferredSize(new java.awt.Dimension(400, 510));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        lblMode.setFont(new java.awt.Font("Fake Receipt", 0, 18)); // NOI18N
        lblMode.setForeground(new java.awt.Color(16, 16, 16));
        lblMode.setText("WITHDRAW");
        jPanel1.add(lblMode);
        lblMode.setBounds(30, 37, 350, 23);

        lblBalance.setFont(new java.awt.Font("Fake Receipt", 0, 18)); // NOI18N
        lblBalance.setForeground(new java.awt.Color(16, 16, 16));
        lblBalance.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBalance.setText("balance:");
        jPanel1.add(lblBalance);
        lblBalance.setBounds(30, 367, 230, 23);

        lblTitle3.setFont(new java.awt.Font("Fake Receipt", 0, 18)); // NOI18N
        lblTitle3.setForeground(new java.awt.Color(16, 16, 16));
        lblTitle3.setText("acct #: 1234567890");
        jPanel1.add(lblTitle3);
        lblTitle3.setBounds(30, 67, 288, 23);

        lblRef.setFont(new java.awt.Font("Fake Receipt", 0, 18)); // NOI18N
        lblRef.setForeground(new java.awt.Color(16, 16, 16));
        lblRef.setText("ref  #: ");
        jPanel1.add(lblRef);
        lblRef.setBounds(30, 97, 311, 23);

        lblDate.setFont(new java.awt.Font("Fake Receipt", 0, 18)); // NOI18N
        lblDate.setForeground(new java.awt.Color(16, 16, 16));
        lblDate.setText("date  :");
        jPanel1.add(lblDate);
        lblDate.setBounds(30, 167, 350, 23);

        lblTime.setFont(new java.awt.Font("Fake Receipt", 0, 18)); // NOI18N
        lblTime.setForeground(new java.awt.Color(16, 16, 16));
        lblTime.setText("time  :");
        jPanel1.add(lblTime);
        lblTime.setBounds(30, 197, 341, 23);

        lblTitle7.setFont(new java.awt.Font("Fake Receipt", 0, 18)); // NOI18N
        lblTitle7.setForeground(new java.awt.Color(16, 16, 16));
        lblTitle7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle7.setText("thank you!");
        jPanel1.add(lblTitle7);
        lblTitle7.setBounds(0, 421, 380, 23);

        lblType.setFont(new java.awt.Font("Fake Receipt", 0, 18)); // NOI18N
        lblType.setForeground(new java.awt.Color(16, 16, 16));
        lblType.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblType.setText("savings");
        jPanel1.add(lblType);
        lblType.setBounds(30, 307, 230, 23);

        lblAmount.setFont(new java.awt.Font("Fake Receipt", 0, 18)); // NOI18N
        lblAmount.setForeground(new java.awt.Color(16, 16, 16));
        lblAmount.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAmount.setText("amount :");
        jPanel1.add(lblAmount);
        lblAmount.setBounds(30, 337, 230, 23);

        lblTitle10.setFont(new java.awt.Font("Fake Receipt", 0, 18)); // NOI18N
        lblTitle10.setForeground(new java.awt.Color(16, 16, 16));
        lblTitle10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle10.setText("chity chity bang bank");
        jPanel1.add(lblTitle10);
        lblTitle10.setBounds(0, 267, 380, 23);

        progressBar.setBackground(new java.awt.Color(0, 51, 153));
        progressBar.setMaximum(3000);
        progressBar.setBorder(null);
        progressBar.setBorderPainted(false);
        jPanel1.add(progressBar);
        progressBar.setBounds(0, 0, 400, 19);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblBalance;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblMode;
    private javax.swing.JLabel lblRef;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTitle10;
    private javax.swing.JLabel lblTitle3;
    private javax.swing.JLabel lblTitle7;
    private javax.swing.JLabel lblType;
    private javax.swing.JProgressBar progressBar;
    // End of variables declaration//GEN-END:variables
}
