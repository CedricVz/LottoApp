/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lottogui;

/**
 *
 * @author x15015556
 */
public class LottoPhase1GUI extends javax.swing.JFrame {
    
    
    private int[] secret;
    private final int[][] num = new int[3][5];
    private int correctL1; //correctL1 (correct Line 1 -- checking if a number matches secret/result
    private int correctL2;
    private int correctL3;
    /**
     * Creates new form LottoPhase1GUI
     */
    public LottoPhase1GUI() {
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

        lottoPhase1Lbl = new javax.swing.JLabel();
        selectNumLbl = new javax.swing.JLabel();
        line00Tf = new javax.swing.JTextField();
        line10Tf = new javax.swing.JTextField();
        line20Tf = new javax.swing.JTextField();
        line02Tf = new javax.swing.JTextField();
        line01Tf = new javax.swing.JTextField();
        line11Tf = new javax.swing.JTextField();
        line21Tf = new javax.swing.JTextField();
        line22Tf = new javax.swing.JTextField();
        line12Tf = new javax.swing.JTextField();
        line03Tf = new javax.swing.JTextField();
        line13Tf = new javax.swing.JTextField();
        line23Tf = new javax.swing.JTextField();
        line04Tf = new javax.swing.JTextField();
        line14Tf = new javax.swing.JTextField();
        line24Tf = new javax.swing.JTextField();
        line1Lbl = new javax.swing.JLabel();
        line2Lbl = new javax.swing.JLabel();
        line3Lbl = new javax.swing.JLabel();
        resultsLbl = new javax.swing.JLabel();
        displayResults0Lbl = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        matched1Lbl = new javax.swing.JLabel();
        matched2Lbl = new javax.swing.JLabel();
        matched3Lbl = new javax.swing.JLabel();
        matched1NumLbl = new javax.swing.JLabel();
        matched2NumLbl = new javax.swing.JLabel();
        matched3NumLbl = new javax.swing.JLabel();
        playBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        displayResults1Lbl = new javax.swing.JLabel();
        displayResults2Lbl = new javax.swing.JLabel();
        displayResults3Lbl = new javax.swing.JLabel();
        displayResults4Lbl = new javax.swing.JLabel();
        lottoph2Btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lottoPhase1Lbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lottoPhase1Lbl.setText("Lotto Phase 1");

        selectNumLbl.setText("Please select your numbers from 1 - 40, no duplicates:");

        line00Tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                line00TfActionPerformed(evt);
            }
        });

        line10Tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                line10TfActionPerformed(evt);
            }
        });

        line20Tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                line20TfActionPerformed(evt);
            }
        });

        line11Tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                line11TfActionPerformed(evt);
            }
        });

        line1Lbl.setText("Line 1");

        line2Lbl.setText("Line 2");

        line3Lbl.setText("Line 3");

        resultsLbl.setText("Lotto Results:");

        backBtn.setText("<- Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        matched1Lbl.setText("Numbers matched on Line 1:");

        matched2Lbl.setText("Numbers matched on Line 2:");

        matched3Lbl.setText("Numbers matched on Line 3:");

        playBtn.setText("Play game");
        playBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playBtnActionPerformed(evt);
            }
        });

        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        lottoph2Btn.setText("Play Lotto Phase 2");
        lottoph2Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lottoph2BtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backBtn)
                        .addGap(71, 71, 71)
                        .addComponent(lottoph2Btn))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(resultsLbl)
                            .addGap(11, 11, 11)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(line20Tf, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                                .addComponent(line10Tf)
                                .addComponent(line00Tf)
                                .addComponent(displayResults0Lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(line21Tf, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                                            .addComponent(line11Tf))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(line22Tf, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                                            .addComponent(line12Tf))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(line13Tf, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                                            .addComponent(line23Tf))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(line14Tf, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(line24Tf))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(line01Tf, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(line02Tf, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(line03Tf, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(line04Tf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(matched1NumLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(displayResults1Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(displayResults2Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(displayResults3Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(matched2NumLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(matched3NumLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(displayResults4Lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addComponent(selectNumLbl)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(line2Lbl)
                                .addComponent(line1Lbl)
                                .addComponent(line3Lbl)
                                .addComponent(matched3Lbl)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(matched1Lbl)
                                    .addComponent(matched2Lbl)))))
                    .addComponent(lottoPhase1Lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(exitBtn)
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(playBtn)
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lottoPhase1Lbl)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(selectNumLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(line00Tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(line01Tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(line02Tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(line03Tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(line04Tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(line1Lbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(line10Tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(line11Tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(line12Tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(line13Tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(line14Tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(line2Lbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(line20Tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(line21Tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(line22Tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(line23Tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(line24Tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(line3Lbl))
                        .addGap(2, 2, 2)
                        .addComponent(playBtn)
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(displayResults0Lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(displayResults1Lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(displayResults2Lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(displayResults3Lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(displayResults4Lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)))
                    .addComponent(resultsLbl))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(matched1Lbl)
                    .addComponent(matched1NumLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(matched2NumLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(matched2Lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(matched3NumLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(matched3Lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn)
                    .addComponent(exitBtn)
                    .addComponent(lottoph2Btn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void line00TfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_line00TfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_line00TfActionPerformed

    private void line10TfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_line10TfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_line10TfActionPerformed

    private void line20TfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_line20TfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_line20TfActionPerformed

    private void line11TfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_line11TfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_line11TfActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        LottoPhase1GUI p1GUI = new LottoPhase1GUI();
        p1GUI.setVisible(false);
        dispose();
        
        LottoMainGUI mainGUI = new LottoMainGUI();
        mainGUI.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void playBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playBtnActionPerformed
        num[0][0] = Integer.parseInt(line00Tf.getText());
        num[0][1] = Integer.parseInt(line01Tf.getText());
        num[0][2] = Integer.parseInt(line02Tf.getText());
        num[0][3] = Integer.parseInt(line03Tf.getText());
        num[0][4] = Integer.parseInt(line04Tf.getText());
        num[1][0] = Integer.parseInt(line10Tf.getText());
        num[1][1] = Integer.parseInt(line11Tf.getText());
        num[1][2] = Integer.parseInt(line12Tf.getText());
        num[1][3] = Integer.parseInt(line13Tf.getText());
        num[1][4] = Integer.parseInt(line14Tf.getText());
        num[2][0] = Integer.parseInt(line20Tf.getText());
        num[2][1] = Integer.parseInt(line21Tf.getText());
        num[2][2] = Integer.parseInt(line22Tf.getText());
        num[2][3] = Integer.parseInt(line23Tf.getText());
        num[2][4] = Integer.parseInt(line24Tf.getText());
        
        LottoPhase1 p1 = new LottoPhase1();
        p1.setNum(num);
        p1.createSecret();
        secret = p1.getSecret();
        p1.computeCheckInput();
        correctL1 = p1.getCorrectL1();
        correctL2 = p1.getCorrectL2();
        correctL3 = p1.getCorrectL3();
        
        displayResults0Lbl.setText(Integer.toString(secret[0]));
        displayResults1Lbl.setText(Integer.toString(secret[1]));
        displayResults2Lbl.setText(Integer.toString(secret[2]));
        displayResults3Lbl.setText(Integer.toString(secret[3]));
        displayResults4Lbl.setText(Integer.toString(secret[4]));
        
        matched1NumLbl.setText(Integer.toString(correctL1));
        matched2NumLbl.setText(Integer.toString(correctL2));
        matched3NumLbl.setText(Integer.toString(correctL3));
       
    }//GEN-LAST:event_playBtnActionPerformed

    private void lottoph2BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lottoph2BtnActionPerformed
        LottoPhase1GUI p1 = new LottoPhase1GUI();
        p1.setVisible(false);
        dispose();
        
        LottoPhase2GUI p2 = new LottoPhase2GUI();
        p2.setVisible(true);
    }//GEN-LAST:event_lottoph2BtnActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LottoPhase1GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new LottoPhase1GUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel displayResults0Lbl;
    private javax.swing.JLabel displayResults1Lbl;
    private javax.swing.JLabel displayResults2Lbl;
    private javax.swing.JLabel displayResults3Lbl;
    private javax.swing.JLabel displayResults4Lbl;
    private javax.swing.JButton exitBtn;
    private javax.swing.JTextField line00Tf;
    private javax.swing.JTextField line01Tf;
    private javax.swing.JTextField line02Tf;
    private javax.swing.JTextField line03Tf;
    private javax.swing.JTextField line04Tf;
    private javax.swing.JTextField line10Tf;
    private javax.swing.JTextField line11Tf;
    private javax.swing.JTextField line12Tf;
    private javax.swing.JTextField line13Tf;
    private javax.swing.JTextField line14Tf;
    private javax.swing.JLabel line1Lbl;
    private javax.swing.JTextField line20Tf;
    private javax.swing.JTextField line21Tf;
    private javax.swing.JTextField line22Tf;
    private javax.swing.JTextField line23Tf;
    private javax.swing.JTextField line24Tf;
    private javax.swing.JLabel line2Lbl;
    private javax.swing.JLabel line3Lbl;
    private javax.swing.JLabel lottoPhase1Lbl;
    private javax.swing.JButton lottoph2Btn;
    private javax.swing.JLabel matched1Lbl;
    private javax.swing.JLabel matched1NumLbl;
    private javax.swing.JLabel matched2Lbl;
    private javax.swing.JLabel matched2NumLbl;
    private javax.swing.JLabel matched3Lbl;
    private javax.swing.JLabel matched3NumLbl;
    private javax.swing.JButton playBtn;
    private javax.swing.JLabel resultsLbl;
    private javax.swing.JLabel selectNumLbl;
    // End of variables declaration//GEN-END:variables
}
