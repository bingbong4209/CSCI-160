/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

/**
 *
 * @author Calvin
 */
public class FunWithWords extends javax.swing.JFrame {

    /**
     * Creates new form FunWithWords
     */
    public FunWithWords() {
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

        verbLabel = new javax.swing.JLabel();
        noun1Label = new javax.swing.JLabel();
        adverbLabel = new javax.swing.JLabel();
        prepositionLabel = new javax.swing.JLabel();
        noun2Label = new javax.swing.JLabel();
        noun3Label = new javax.swing.JLabel();
        noun4Label = new javax.swing.JLabel();
        noun1TextField = new javax.swing.JTextField();
        noun2TextField = new javax.swing.JTextField();
        noun3TextField = new javax.swing.JTextField();
        noun4TextField = new javax.swing.JTextField();
        verb1TextField = new javax.swing.JTextField();
        preposition1TextField = new javax.swing.JTextField();
        adverb1TextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputTextArea = new javax.swing.JTextArea();
        titleInfo = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        verbLabel.setText("Verb");

        noun1Label.setText("Noun 1");

        adverbLabel.setText("Adverb");

        prepositionLabel.setText("Preposition");

        noun2Label.setText("Noun 2");

        noun3Label.setText("Noun 3");

        noun4Label.setText("Noun 4");

        noun1TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noun1TextFieldActionPerformed(evt);
            }
        });

        noun2TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noun2TextFieldActionPerformed(evt);
            }
        });

        noun3TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noun3TextFieldActionPerformed(evt);
            }
        });

        noun4TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noun4TextFieldActionPerformed(evt);
            }
        });

        verb1TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verb1TextFieldActionPerformed(evt);
            }
        });

        preposition1TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preposition1TextFieldActionPerformed(evt);
            }
        });

        adverb1TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adverb1TextFieldActionPerformed(evt);
            }
        });

        outputTextArea.setColumns(20);
        outputTextArea.setRows(5);
        jScrollPane1.setViewportView(outputTextArea);

        titleInfo.setText("MAD LIB");

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(prepositionLabel)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(noun1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(noun2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(noun3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(noun4Label, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(verbLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(adverbLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titleInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(adverb1TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(preposition1TextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(verb1TextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(noun4TextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(noun3TextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(noun2TextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(noun1TextField, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(22, 22, 22)
                                .addComponent(submitButton)))))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleInfo)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noun1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noun1Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noun2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noun2Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noun3TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noun3Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noun4TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noun4Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verb1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verbLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(preposition1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prepositionLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(adverb1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(submitButton))
                    .addComponent(adverbLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void noun1TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noun1TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noun1TextFieldActionPerformed

    private void noun2TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noun2TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noun2TextFieldActionPerformed

    private void noun3TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noun3TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noun3TextFieldActionPerformed

    private void noun4TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noun4TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noun4TextFieldActionPerformed

    private void verb1TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verb1TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verb1TextFieldActionPerformed

    private void preposition1TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preposition1TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_preposition1TextFieldActionPerformed

    private void adverb1TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adverb1TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adverb1TextFieldActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        
        String noun1 = noun1TextField.getText();
        String noun2 = noun2TextField.getText();
        String noun3 = noun3TextField.getText();
        String noun4 = noun4TextField.getText();
        String verb1 = verb1TextField.getText();
        String adverb1 = adverb1TextField.getText();
        String preposition1 = preposition1TextField.getText();
        outputTextArea.setText(noun1 + " is a hot mess, \n" 
        + noun2 + " is rolling on the floor, \n" 
        + noun3 + " is on fire, \n" 
        + noun4 + " is " + verb1 + " " + adverb1 + " with Martha Stewart, \n"
        + "and I am sitting in the corner " + preposition1 + " all the action.");
    }//GEN-LAST:event_submitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(FunWithWords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FunWithWords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FunWithWords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FunWithWords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FunWithWords().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adverb1TextField;
    private javax.swing.JLabel adverbLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel noun1Label;
    private javax.swing.JTextField noun1TextField;
    private javax.swing.JLabel noun2Label;
    private javax.swing.JTextField noun2TextField;
    private javax.swing.JLabel noun3Label;
    private javax.swing.JTextField noun3TextField;
    private javax.swing.JLabel noun4Label;
    private javax.swing.JTextField noun4TextField;
    private javax.swing.JTextArea outputTextArea;
    private javax.swing.JTextField preposition1TextField;
    private javax.swing.JLabel prepositionLabel;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel titleInfo;
    private javax.swing.JTextField verb1TextField;
    private javax.swing.JLabel verbLabel;
    // End of variables declaration//GEN-END:variables
}
