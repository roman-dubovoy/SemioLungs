package Diaspectrex_part.views;

import Diaspectrex_part.util.Validator;
import Diaspectrex_part.util.PatientCard;
import java.awt.Color;
import javax.swing.JOptionPane;

public class RegistrationForm extends javax.swing.JFrame {

    public static PatientCard patientCard;

    public RegistrationForm() {
        initComponents();
        this.setTitle("Регистрация пациента");
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SurnameLabel = new javax.swing.JLabel();
        SurnameTextField = new javax.swing.JTextField();
        NameLabel = new javax.swing.JLabel();
        NameTextField = new javax.swing.JTextField();
        SecondNameLabel = new javax.swing.JLabel();
        SecondNameTextField = new javax.swing.JTextField();
        DataAbout = new javax.swing.JLabel();
        ClearButton = new javax.swing.JButton();
        CodeTextField = new javax.swing.JTextField();
        Code = new javax.swing.JLabel();
        RegistrationButton = new javax.swing.JButton();
        YearBirthLabel = new javax.swing.JLabel();
        YearComboBox = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Регистрация");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                onClosed(evt);
            }
        });

        SurnameLabel.setFont(new java.awt.Font("Buxton Sketch", 0, 16)); // NOI18N
        SurnameLabel.setText("Фамилия:");

        SurnameTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SurnameTextFieldTextFieldMouseClicked(evt);
            }
        });

        NameLabel.setFont(new java.awt.Font("Buxton Sketch", 0, 16)); // NOI18N
        NameLabel.setText("Имя:");

        NameTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NameTextFieldMouseClicked(evt);
            }
        });

        SecondNameLabel.setFont(new java.awt.Font("Buxton Sketch", 0, 16)); // NOI18N
        SecondNameLabel.setText("Отчество:");

        SecondNameTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SecondNameTextFieldMouseClicked(evt);
            }
        });

        DataAbout.setFont(new java.awt.Font("Buxton Sketch", 0, 16)); // NOI18N
        DataAbout.setText("Данные о пациенте:");

        ClearButton.setText("Очистить");
        ClearButton.setBorder(null);
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        CodeTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CodeTextFieldMouseClicked(evt);
            }
        });

        Code.setFont(new java.awt.Font("Buxton Sketch", 0, 16)); // NOI18N
        Code.setText("Код:");

        RegistrationButton.setText("Зарегистрировать");
        RegistrationButton.setBorder(null);
        RegistrationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrationButtonActionPerformed(evt);
            }
        });

        YearBirthLabel.setFont(new java.awt.Font("Buxton Sketch", 0, 16)); // NOI18N
        YearBirthLabel.setText("Год рожд.");

        YearComboBox.setFont(new java.awt.Font("Buxton Sketch", 0, 16)); // NOI18N
        YearComboBox.setMaximumRowCount(6);
        YearComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010" }));
        YearComboBox.setSelectedIndex(25);
        YearComboBox.setActionCommand("");
        YearComboBox.setAutoscrolls(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DataAbout)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SecondNameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SurnameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Code, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(YearBirthLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SecondNameTextField)
                            .addComponent(NameTextField)
                            .addComponent(SurnameTextField)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(YearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RegistrationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DataAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Code))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SurnameLabel)
                    .addComponent(SurnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameLabel)
                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SecondNameLabel)
                    .addComponent(SecondNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(YearBirthLabel)
                    .addComponent(YearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RegistrationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {ClearButton, RegistrationButton});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearAllFields() {
        SurnameTextField.setText("");
        NameTextField.setText("");
        SecondNameTextField.setText("");
        CodeTextField.setText("");
        YearComboBox.setSelectedIndex(25);
    }

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        clearAllFields();
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void RegistrationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrationButtonActionPerformed
        if(!Validator.checkCode(CodeTextField.getText())){
            CodeTextField.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, "Данные введены неверно!", "Ошибка регистрации", JOptionPane.ERROR_MESSAGE);
        }
        else if (!Validator.checkFIO(SurnameTextField.getText())){
            SurnameTextField.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, "Данные введены неверно!", "Ошибка регистрации", JOptionPane.ERROR_MESSAGE);
        }
        else if(!Validator.checkFIO(NameTextField.getText())){
            NameTextField.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, "Данные введены неверно!", "Ошибка регистрации", JOptionPane.ERROR_MESSAGE);
        }
        else if(!Validator.checkFIO(SecondNameTextField.getText())){
            SecondNameTextField.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, "Данные введены неверно!", "Ошибка регистрации", JOptionPane.ERROR_MESSAGE);
        }
        else {
             patientCard = new PatientCard(CodeTextField.getText(), SurnameTextField.getText(), NameTextField.getText(),
                    SecondNameTextField.getText(), Integer.parseInt(YearComboBox.getSelectedItem().toString()));
            if(MainMenuForm.dataBaseWorker.isPatientCardExists(patientCard)){
                Object[] options = {"ОК"};
                int result = JOptionPane.showOptionDialog(RegistrationForm.this, "Пациент с таким кодом уже зарегистирован!\nВведите код повторно!", 
                    "Ошибка регистрации",JOptionPane.OK_OPTION, JOptionPane.ERROR_MESSAGE, null, options ,null);
                if(result == JOptionPane.OK_OPTION){
                   CodeTextField.setText("");
                }
            }
            else{
                MainMenuForm.dataBaseWorker.addPatientCard(patientCard);
                Object[] options = {"Да", "Нет"};
                int result = JOptionPane.showOptionDialog(null, "Пациент успешно зарегистрирован!\n Желаете продолжить работу и ввести мед. данные?", "Регистрация",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, null);

                if (result == JOptionPane.YES_OPTION) {
                    clearAllFields();
                    new ChoiceDialog(RegistrationForm.this).setLocationRelativeTo(null);
                }
                if (result == JOptionPane.NO_OPTION) {
                    clearAllFields();
                    RegistrationForm.this.setVisible(false);
                    MainMenuForm.main(null);
                }
            }
        }
    }//GEN-LAST:event_RegistrationButtonActionPerformed

    /*RegActPerf
    if (FromFile.isSelected()){
         this.setVisible(false);
         OpenFileFrame openFile = new OpenFileFrame();
         openFile.setVisible(true);
         openFile.setLocationRelativeTo(null);
         }
         else{
         if(Manual.isSelected())
         this.setVisible(false);
         ClassifierForm cl = new ClassifierForm();
         cl.setVisible(true);
         cl.setLocationRelativeTo(null);
         }*/
            //patient.to_database(txtFile);
            /*try {
         //patient.to_database("D:\\test.txt");
         FileWriter fw = new FileWriter(txtFile, true);
         CharSequence csq = patient.toString();
         fw.append(csq);
         fw.append('\n');
         fw.flush();
         fw.close();
         } catch (Exception e) {
         System.out.println(e);
         }*/
    
    private void onClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_onClosed
        MainMenuForm.main(null);
    }//GEN-LAST:event_onClosed

    private void SurnameTextFieldTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SurnameTextFieldTextFieldMouseClicked
        if(SurnameTextField.getForeground().equals(Color.red)){
            SurnameTextField.setText("");
            SurnameTextField.setForeground(Color.black);
        }
    }//GEN-LAST:event_SurnameTextFieldTextFieldMouseClicked

    private void CodeTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CodeTextFieldMouseClicked
        if(CodeTextField.getForeground().equals(Color.red)){
            CodeTextField.setText("");
            CodeTextField.setForeground(Color.black);
        }
    }//GEN-LAST:event_CodeTextFieldMouseClicked

    private void NameTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NameTextFieldMouseClicked
        if(NameTextField.getForeground().equals(Color.red)){
            NameTextField.setText("");
            NameTextField.setForeground(Color.black);
        }
    }//GEN-LAST:event_NameTextFieldMouseClicked

    private void SecondNameTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SecondNameTextFieldMouseClicked
        if(SecondNameTextField.getForeground().equals(Color.red)){
            SecondNameTextField.setText("");
            SecondNameTextField.setForeground(Color.black);
        }
    }//GEN-LAST:event_SecondNameTextFieldMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        /*try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationForm();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearButton;
    private javax.swing.JLabel Code;
    private javax.swing.JTextField CodeTextField;
    private javax.swing.JLabel DataAbout;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JButton RegistrationButton;
    private javax.swing.JLabel SecondNameLabel;
    private javax.swing.JTextField SecondNameTextField;
    private javax.swing.JLabel SurnameLabel;
    private javax.swing.JTextField SurnameTextField;
    private javax.swing.JLabel YearBirthLabel;
    private javax.swing.JComboBox YearComboBox;
    // End of variables declaration//GEN-END:variables
}
