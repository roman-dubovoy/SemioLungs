package Diaspectrex_part.views;

import Diaspectrex_part.util.Validator;
import Diaspectrex_part.util.PatientCard;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class SearchForm extends javax.swing.JFrame {
    
    private static int searchButtonPressedCount = 0;

    public SearchForm() {
        initComponents();
        centerValuesInTable();
        searchResultTable.getColumnModel().getColumn(0).setMaxWidth(55);
        searchResultTable.getColumnModel().getColumn(1).setMaxWidth(85);
        searchResultTable.getColumnModel().getColumn(2).setMaxWidth(75);
        searchResultTable.getColumnModel().getColumn(3).setMaxWidth(85);
        searchResultTable.getColumnModel().getColumn(4).setMaxWidth(50);
        searchResultTable.getColumnModel().getColumn(5).setMaxWidth(85);
        searchResultTable.getColumnModel().getColumn(6).setMaxWidth(255);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private void centerValuesInTable(){
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        searchResultTable.setDefaultRenderer(Object.class, centerRenderer);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchPanel = new javax.swing.JPanel();
        inputSurnameLabel = new javax.swing.JLabel();
        searchBySurnameTextField = new javax.swing.JTextField();
        searchResultScrollPane = new javax.swing.JScrollPane();
        searchResultTable = new javax.swing.JTable();
        SearchButton = new javax.swing.JButton();
        choiceButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Поиск карты пациента");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                onClosed(evt);
            }
        });

        searchPanel.setBorder(new javax.swing.border.MatteBorder(null));

        inputSurnameLabel.setFont(new java.awt.Font("Buxton Sketch", 0, 16)); // NOI18N
        inputSurnameLabel.setText("Введите фамилию для поиска:");

        searchResultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Код", "Фамилия", "Имя", "Отчество", "Год", "Мед. данные", "Диагноз"
            }
        ));
        searchResultScrollPane.setViewportView(searchResultTable);

        SearchButton.setText("Поиск");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchResultScrollPane)
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputSurnameLabel)
                            .addGroup(searchPanelLayout.createSequentialGroup()
                                .addComponent(searchBySurnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SearchButton)))
                        .addGap(0, 366, Short.MAX_VALUE)))
                .addContainerGap())
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inputSurnameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchBySurnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchResultScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        choiceButton.setText("Выбрать");
        choiceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Удалить");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(deleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(choiceButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(choiceButton)
                    .addComponent(deleteButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        if (!Validator.checkFIO(searchBySurnameTextField.getText())){
            searchBySurnameTextField.setText("");
            JOptionPane.showMessageDialog(SearchForm.this, "Фамилия введена некорректно!", "Ошибка поиска", JOptionPane.ERROR_MESSAGE, null);
        }
        else{
            DefaultTableModel model = (DefaultTableModel) searchResultTable.getModel();
            if(searchButtonPressedCount == 1){
                model.setRowCount(0);
                model.fireTableDataChanged();
                searchButtonPressedCount = 0;
            }
            if(searchButtonPressedCount == 0){
                ArrayList<String[]> foundPatientCards = MainMenuForm.dataBaseWorker.searchPatientsCards(searchBySurnameTextField.getText());
                if(foundPatientCards.isEmpty()){
                    Object[] options = {"Да", "Нет"};
                    int result = JOptionPane.showOptionDialog(SearchForm.this, "Совпадений не найдено!\n Желаете зарегистировать нового пациента?", "Поиск",
                            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, null);
                    if(result == JOptionPane.YES_OPTION){
                        SearchForm.this.setVisible(false);
                        RegistrationForm.main(null);
                    }
                    if(result == JOptionPane.NO_OPTION){
                        searchBySurnameTextField.setText("");
                    }
                }
                else{
                    for (String[] foundPatientCard : foundPatientCards) {
                        model.addRow(foundPatientCard);
                    }
                    searchButtonPressedCount = 1;
                }
            }
        }
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void choiceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceButtonActionPerformed
        if(searchResultTable.getRowCount() != 0){
            String[] patientCardInfo = new String[searchResultTable.getColumnCount()-1];
            for(int i = 0; i < patientCardInfo.length; i++){
                patientCardInfo[i] = searchResultTable.getValueAt(searchResultTable.getSelectedRow(), i).toString();
            }
            RegistrationForm.patientCard = new PatientCard(patientCardInfo[0],patientCardInfo[1],patientCardInfo[2],
                                        patientCardInfo[3], Integer.valueOf(patientCardInfo[4]));
            if(searchResultTable.getValueAt(searchResultTable.getSelectedRow(), 5).toString().equals("Внесены")){
                RegistrationForm.patientCard.setArrayOfMedicalData(MainMenuForm.dataBaseWorker.getMedicalDataByCode(patientCardInfo[0]));
            }
            Object[] options = {"Ок"};
            int result = JOptionPane.showOptionDialog(SearchForm.this, "Карта пациента выбрана!", "Поиск", 
                    JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, null);
            if(result == JOptionPane.OK_OPTION){
                SearchForm.this.setVisible(false);
                MainMenuForm.main(null);
            }
        }
    }//GEN-LAST:event_choiceButtonActionPerformed

    private void onClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_onClosed
        MainMenuForm.main(null);
    }//GEN-LAST:event_onClosed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        if(searchResultTable.getRowCount() != 0){
            DefaultTableModel model = (DefaultTableModel) searchResultTable.getModel();
            int[] selectedRows = searchResultTable.getSelectedRows();
            if(selectedRows != null){
                for(int i = 0; i < selectedRows.length; i++){
                    MainMenuForm.dataBaseWorker.deletePatientCard(searchResultTable.getValueAt(selectedRows[i], 0).toString());
                    model.removeRow(selectedRows[i]);
                }
                model.fireTableDataChanged();
            }
            JOptionPane.showMessageDialog(this, "Карта(ы) пациента(ов) успешно удалены!", "Удаление карт", JOptionPane.INFORMATION_MESSAGE);
            searchBySurnameTextField.setText("");
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SearchForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchForm();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SearchButton;
    private javax.swing.JButton choiceButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel inputSurnameLabel;
    private javax.swing.JTextField searchBySurnameTextField;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JScrollPane searchResultScrollPane;
    private javax.swing.JTable searchResultTable;
    // End of variables declaration//GEN-END:variables
}
