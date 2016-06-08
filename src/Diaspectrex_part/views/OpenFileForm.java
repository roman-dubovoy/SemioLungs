package Diaspectrex_part.views;

import Diaspectrex_part.util.ExcelParser;
import javax.swing.JOptionPane;

public class OpenFileForm extends javax.swing.JFrame {

    public OpenFileForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OpenFile = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                onWindowClosed(evt);
            }
        });

        OpenFile.setCurrentDirectory(null);
        OpenFile.setDialogTitle("Открытие файла");
        OpenFile.setFileSelectionMode(javax.swing.JFileChooser.FILES_AND_DIRECTORIES);
        OpenFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OpenFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OpenFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OpenFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenFileActionPerformed
        if (evt.getActionCommand().equals(OpenFile.APPROVE_SELECTION)){
            ExcelParser excelParser = new ExcelParser(OpenFile.getSelectedFile().getPath());
            //ArrayList<Float> medicalData = excelParser.readLineByCode(RegistrationForm.patientCard.getCode());
            float[] medicalData = excelParser.readLineByCode(RegistrationForm.patientCard.getCode());
            if(medicalData != null){
                RegistrationForm.patientCard.setArrayOfMedicalData(medicalData);
                MainMenuForm.dataBaseWorker.addMedicalData(RegistrationForm.patientCard);
                Object[] options = {"Да", "Нет"};
                int result = JOptionPane.showOptionDialog(OpenFileForm.this, "Данные успешно сохранены!\nЖелаете продолжить работу и провести классификацию?", 
                "Мед. данные",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options ,null);
                if(result == JOptionPane.YES_OPTION){
                    OpenFileForm.this.setVisible(false);
                    ClassificationFrom.main(null);
                }
                if (result == JOptionPane.NO_OPTION){
                    OpenFileForm.this.setVisible(false);
                    MainMenuForm.main(null);
                }
            }
            else{
                Object[] options = {"Да", "Нет"};
                int result = JOptionPane.showOptionDialog(OpenFileForm.this, "Ошибка данных!\nЖелаете ввести данные вручную?", 
                "Мед. данные",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options ,null);
                if(result == JOptionPane.YES_OPTION){
                    OpenFileForm.this.setVisible(false);
                    MedicalDataForm.main(null);
                }
                if (result == JOptionPane.NO_OPTION){
                    OpenFileForm.this.setVisible(false);
                    MainMenuForm.main(null);
                }
            }
        } else if (evt.getActionCommand().equals(OpenFile.CANCEL_SELECTION)) {
            OpenFileForm.this.setVisible(false);
            MainMenuForm.main(null);
        }       
    }//GEN-LAST:event_OpenFileActionPerformed

    private void onWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_onWindowClosed
        MainMenuForm.main(null);
    }//GEN-LAST:event_onWindowClosed

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
            java.util.logging.Logger.getLogger(OpenFileForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OpenFileForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OpenFileForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OpenFileForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                OpenFileForm openFile = new OpenFileForm();
                openFile.setLocationRelativeTo(null);
                openFile.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser OpenFile;
    // End of variables declaration//GEN-END:variables
}
