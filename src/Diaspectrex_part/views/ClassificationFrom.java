package Diaspectrex_part.views;

import Diaspectrex_part.util.Classifier;
import javax.swing.JOptionPane;

public class ClassificationFrom extends javax.swing.JFrame {
    
    public static String diagnosis;
    
    public ClassificationFrom() {
        initComponents();
        diagnosis = Classifier.classify(RegistrationForm.patientCard.getArrayOfMedicalData());
        System.out.println("Diagnosis " + diagnosis);
        diagnosisLabel.setText(diagnosis);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ClassificationPane = new javax.swing.JPanel();
        DiagnosisLabel = new javax.swing.JLabel();
        CommentLabel = new javax.swing.JLabel();
        CommentScrollPane = new javax.swing.JScrollPane();
        CommentTextArea = new javax.swing.JTextArea();
        diagnosisLabel = new javax.swing.JLabel();
        ClearCommentButton = new javax.swing.JButton();
        SaveButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Диагностирование");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                onClosed(evt);
            }
        });

        ClassificationPane.setBorder(new javax.swing.border.MatteBorder(null));

        DiagnosisLabel.setFont(new java.awt.Font("Buxton Sketch", 0, 16)); // NOI18N
        DiagnosisLabel.setText("Диагноз: ");

        CommentLabel.setFont(new java.awt.Font("Buxton Sketch", 0, 16)); // NOI18N
        CommentLabel.setText("Комментарии: ");

        CommentTextArea.setColumns(20);
        CommentTextArea.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CommentTextArea.setLineWrap(true);
        CommentTextArea.setRows(5);
        CommentScrollPane.setViewportView(CommentTextArea);

        diagnosisLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        diagnosisLabel.setText("Диагноз");

        javax.swing.GroupLayout ClassificationPaneLayout = new javax.swing.GroupLayout(ClassificationPane);
        ClassificationPane.setLayout(ClassificationPaneLayout);
        ClassificationPaneLayout.setHorizontalGroup(
            ClassificationPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClassificationPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ClassificationPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DiagnosisLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CommentLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ClassificationPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CommentScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diagnosisLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ClassificationPaneLayout.setVerticalGroup(
            ClassificationPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClassificationPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ClassificationPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DiagnosisLabel)
                    .addComponent(diagnosisLabel))
                .addGap(9, 9, 9)
                .addGroup(ClassificationPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CommentLabel)
                    .addComponent(CommentScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ClearCommentButton.setFont(new java.awt.Font("Buxton Sketch", 0, 16)); // NOI18N
        ClearCommentButton.setText("Очистить");
        ClearCommentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearCommentButtonActionPerformed(evt);
            }
        });

        SaveButton.setFont(new java.awt.Font("Buxton Sketch", 0, 16)); // NOI18N
        SaveButton.setText("Сохранить");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ClassificationPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ClearCommentButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SaveButton)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ClearCommentButton, SaveButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ClassificationPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClearCommentButton)
                    .addComponent(SaveButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void onClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_onClosed
        MainMenuForm.main(null);
    }//GEN-LAST:event_onClosed

    private void ClearCommentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearCommentButtonActionPerformed
        CommentTextArea.setText("");
    }//GEN-LAST:event_ClearCommentButtonActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        if (CommentTextArea.getText().isEmpty()){
            RegistrationForm.patientCard.setComment("");
        }
        else{
            RegistrationForm.patientCard.setComment(CommentTextArea.getText());
        }
        RegistrationForm.patientCard.setDiagnosis(diagnosisLabel.getText());
        MainMenuForm.dataBaseWorker.addDiagnosisAndComment(RegistrationForm.patientCard);
        Object[] options = {"ОК"};
        int result = JOptionPane.showOptionDialog(ClassificationFrom.this, "Данные успешно сохранены", 
                "Классификация",JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options ,null);
        if (result == JOptionPane.OK_OPTION){
            RegistrationForm.patientCard = null;
            CommentTextArea.setText("");
            ClassificationFrom.this.setVisible(false);
            MainMenuForm.main(null);
        }
    }//GEN-LAST:event_SaveButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ClassificationFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClassificationFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClassificationFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClassificationFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClassificationFrom();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ClassificationPane;
    private javax.swing.JButton ClearCommentButton;
    private javax.swing.JLabel CommentLabel;
    private javax.swing.JScrollPane CommentScrollPane;
    private javax.swing.JTextArea CommentTextArea;
    private javax.swing.JLabel DiagnosisLabel;
    private javax.swing.JButton SaveButton;
    private javax.swing.JLabel diagnosisLabel;
    // End of variables declaration//GEN-END:variables
}
