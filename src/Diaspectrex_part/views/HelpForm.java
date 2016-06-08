package Diaspectrex_part.views;

public class HelpForm extends javax.swing.JFrame {

    public HelpForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        helpTabbedPane = new javax.swing.JTabbedPane();
        registrationPanel = new javax.swing.JPanel();
        registrationScrollPane = new javax.swing.JScrollPane();
        registrationEditorPane = new javax.swing.JEditorPane();
        medicalDataPanel = new javax.swing.JPanel();
        medicalDataScrollPane = new javax.swing.JScrollPane();
        medicalDataEditorPane = new javax.swing.JEditorPane();
        classificationPanel = new javax.swing.JPanel();
        classificationScrollPane = new javax.swing.JScrollPane();
        classificationEditorPane = new javax.swing.JEditorPane();
        statisticsPanel = new javax.swing.JPanel();
        statisticsScrollPane = new javax.swing.JScrollPane();
        statisticsEditorPane = new javax.swing.JEditorPane();
        searchCardsPanel = new javax.swing.JPanel();
        searchCardsScrollPane = new javax.swing.JScrollPane();
        searchCardsEditorPane = new javax.swing.JEditorPane();
        classifierOptionsPanel = new javax.swing.JPanel();
        classifierOptionsScrollPane = new javax.swing.JScrollPane();
        classifierOptionsEditorPane = new javax.swing.JEditorPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Справочная информация");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                onClosed(evt);
            }
        });

        helpTabbedPane.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        helpTabbedPane.setFont(new java.awt.Font("Buxton Sketch", 0, 16)); // NOI18N

        registrationScrollPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        registrationEditorPane.setEditable(false);
        registrationEditorPane.setContentType("text/html"); // NOI18N
        registrationEditorPane.setText("<html>\n  <body>\n    <p style=\"font-size: 14px; font-family: Buxton Sketch; text-align: center; margin: 1px; padding: 1px;\">\n      \n   <strong>Регистрация</strong>\n    </p>\n    <p style=\"margin: 1px; padding: 1px;\">Чтобы зарегистрировать нового пациента:\n    <ol>\n            <li >Введите код карты пациента.</li>\n            <li>Введите фамилию пациента.</li>\n            <li>Введите имя пациента.</li>\n            <li>Введите отчество пациента.</li>\n            <li>Выберите год рождения пациента.</li>\n            <li>Нажмите кнопку \"Зарегистрировать\".</li>\t\n    </ol>\n    </p>\n    <p style=\"margin: 1px; padding: 1px;\">\n            Если Вы желаете очистить всю введённую информацию нажмите кнопку \"Очистить\".   \n    </p>\n    <p style=\"font-size: 14px; font-family: Buxton Sketch; color: red; text-align: center; margin: 0px; padding: 0px;\">\n        <strong>Замечания</strong>   \n    <ol>\n            <li >Все поля формы должны быть заполнены.</li>\n            <li >Код может содержать только буквы латинского алфавита и цифры.</li>\n            <li >Код пациента должен быть уникальным. В случае ошибки будет выведено соответствующее сообщение.</li>\n            <li>ФИО пациента могут быть введены только с использованием букв украинского и русского алфавитов.</li>\n            <li>ФИО следует вводить с большой буквы.</li>\n    </ol>\n    </p>\n  </body>\n</html>\n\n");
        registrationEditorPane.setCaretPosition(0);
        registrationScrollPane.setViewportView(registrationEditorPane);

        javax.swing.GroupLayout registrationPanelLayout = new javax.swing.GroupLayout(registrationPanel);
        registrationPanel.setLayout(registrationPanelLayout);
        registrationPanelLayout.setHorizontalGroup(
            registrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registrationScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
        );
        registrationPanelLayout.setVerticalGroup(
            registrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registrationScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
        );

        helpTabbedPane.addTab("Регистрация", registrationPanel);

        medicalDataEditorPane.setContentType("text/html"); // NOI18N
        medicalDataEditorPane.setText("<html>\n  <body>\n    <p style=\"font-size: 14px; font-family: Buxton Sketch; text-align: center; margin: 1px; padding: 1px;\">\n         <strong>Ввод медицинских данных</strong>\n    </p>\n    <p style=\"margin: 1px; padding: 1px;\">\n            Для ввода медицинских данных пациента:\n    <ol>\n            <li >Зарегистрируйте пациента или найдите его карту в разделе \"Картотека\".</li>\n            <li>Введите медицинские данные.</li>\n            <li>Нажмите кнопку \"Сохранить\".</li>\t\n    </ol>\n    </p>\n    <p style=\"margin: 1px; padding: 1px;\">\n            Если Вы желаете очистить все введённые данные нажмите кнопку \"Очистить\".   \n    </p>\n    <p style=\"font-size: 14px; font-family: Buxton Sketch; color: red; text-align: center; margin: 0px; padding: 0px;\">\n        <strong>Замечания</strong>   \n    <ol>\n            <li >Не обязательтно заполнять все поля. Пропущенные поля получат значение 0.0 по умолчанию.</li>\n            <li >Вы можете вводить данные в виде:\n\t<ul style=\"list-style-type: none;\">\n\t        <li>- 78.65</li>\n\t        <li>- 78,65</li>\n\t</ul>\n\tОба варианта ввода являются верными.\n            </li>\n            <li>Максимальное количество цифр до запятой - 2, после запятой - 2.</li>\n    </ol>\n    </p>\n  </body>\n</html>\n");
        medicalDataEditorPane.setCaretPosition(0);
        medicalDataScrollPane.setViewportView(medicalDataEditorPane);

        javax.swing.GroupLayout medicalDataPanelLayout = new javax.swing.GroupLayout(medicalDataPanel);
        medicalDataPanel.setLayout(medicalDataPanelLayout);
        medicalDataPanelLayout.setHorizontalGroup(
            medicalDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(medicalDataScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
        );
        medicalDataPanelLayout.setVerticalGroup(
            medicalDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(medicalDataScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
        );

        helpTabbedPane.addTab("Мед. данные", medicalDataPanel);

        classificationEditorPane.setContentType("text/html"); // NOI18N
        classificationEditorPane.setText("<html>\n  <body>\n    <p style=\"font-size: 14px; font-family: Buxton Sketch; text-align: center; margin: 1px; padding: 1px;\">\n         <strong>Классификация</strong>\n    </p>\n    <p style=\"margin: 1px; padding: 1px;\">\n            Для проведения классификации:\n    <ol>\n            <li >Зарегистрируйте пациента или найдите его карту в разделе \"Картотека\".</li>\n            <li>Введите медицинские данные.</li>\n            <li>Введите, если требуется, поправки в виде комментариев к диагнозу.</li>\n            <li>Нажмите кнопку \"Сохранить\".</li>\t\n    </ol>\n    </p>\n    <p style=\"margin: 1px; padding: 1px;\">\n            Если Вы желаете очистить введённые комментарии нажмите кнопку \"Очистить\".   \n    </p>\n    <p style=\"font-size: 14px; font-family: Buxton Sketch; color: red; text-align: center; margin: 0px; padding: 0px;\">\n        <strong>Замечания</strong>   \n    <ol>\n            <li >Комментирование не является обязательным. Поле может быть пустым.</li>\n    </ol>\n    </p>\n  </body>\n</html>");
        classificationScrollPane.setViewportView(classificationEditorPane);

        javax.swing.GroupLayout classificationPanelLayout = new javax.swing.GroupLayout(classificationPanel);
        classificationPanel.setLayout(classificationPanelLayout);
        classificationPanelLayout.setHorizontalGroup(
            classificationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(classificationScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
        );
        classificationPanelLayout.setVerticalGroup(
            classificationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(classificationScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
        );

        helpTabbedPane.addTab("Классификация", classificationPanel);

        statisticsEditorPane.setContentType("text/html"); // NOI18N
        statisticsEditorPane.setText("<html>\n  <body>\n    <p style=\"font-size: 14px; font-family: Buxton Sketch; text-align: center; margin: 1px; padding: 1px;\">\n      \n<strong>Статистика</strong>\n    </p>\n    <p style=\"margin: 1px; padding: 1px;\">\n            Для просмотра статистики выберите пункт меню \"Статистика\".<br>\n            Для каждого типа семиотического сдвига будет выведено количество пациентов с таким типом.\n    </p>\n  </body>\n</html>");
        statisticsScrollPane.setViewportView(statisticsEditorPane);

        javax.swing.GroupLayout statisticsPanelLayout = new javax.swing.GroupLayout(statisticsPanel);
        statisticsPanel.setLayout(statisticsPanelLayout);
        statisticsPanelLayout.setHorizontalGroup(
            statisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(statisticsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
        );
        statisticsPanelLayout.setVerticalGroup(
            statisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(statisticsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
        );

        helpTabbedPane.addTab("Статистика", statisticsPanel);

        searchCardsEditorPane.setContentType("text/html"); // NOI18N
        searchCardsEditorPane.setText("<html>\n  <body>\n    <p style=\"font-size: 14px; font-family: Buxton Sketch; text-align: center; margin: 1px; padding: 1px;\">\n      \n<strong>Картотека</strong>\n    </p>\n    <p style=\"margin: 1px; padding: 1px;\">\n            Для поиска карты пациента:\n    <ol>\n            <li >Введите фамилию пациента для поиска.</li>\n            <li>Нажмите кнопку \"Поиск\".</li>\t\n            <li>Выбирите в таблице нужную строку.</li>\n            <li>Нажмите кнопку \"Выбрать\".</li>\t\n    </ol>\n    </p>\n    <p style=\"margin: 1px; padding: 1px;\">\n            Если Вы желаетеудалить одну или несколько карт пациентов:\n    <ol>\n            <li>Выбирите в таблице нужные строки.</li>\n            <li>Нажмите кнопку \"Удалить\".</li>\n    </ol>\n    </p>\n    <p style=\"font-size: 14px; font-family: Buxton Sketch; color: red; text-align: center; margin: 0px; padding: 0px;\">\n        <strong>Замечания</strong>   \n    <ol>\n            <li >Фамилия пациента может содержать только буквы украинского и русского алфавитов.</li>\n            <li>Фамилия пациента должна быть введена с большой буквы.</li>\n    </ol>\n    </p>\n  </body>\n</html>");
        searchCardsEditorPane.setCaretPosition(0);
        searchCardsScrollPane.setViewportView(searchCardsEditorPane);

        javax.swing.GroupLayout searchCardsPanelLayout = new javax.swing.GroupLayout(searchCardsPanel);
        searchCardsPanel.setLayout(searchCardsPanelLayout);
        searchCardsPanelLayout.setHorizontalGroup(
            searchCardsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(searchCardsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
        );
        searchCardsPanelLayout.setVerticalGroup(
            searchCardsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(searchCardsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
        );

        helpTabbedPane.addTab("Картотека", searchCardsPanel);

        classifierOptionsEditorPane.setContentType("text/html"); // NOI18N
        classifierOptionsEditorPane.setText("<html>\n  <body>\n    <p style=\"font-size: 14px; font-family: Buxton Sketch; text-align: center; margin: 1px; padding: 1px;\">\n      \n<strong>Настройка классификатора</strong>\n    </p>\n    <p style=\"margin: 1px; padding: 1px;\">\n            Для изменения настроек классификатора:\n    <ol>\n            <li >Выберите пункт меню \"Настройки\"</li>\n            <li>Выбирите тип семиотического сдвига.</li>\n            <li>Введите данные для определённой степени сдвига.</li>\n            <li>Нажмите кнопку \"Сохранить\".</li>\t\n    </ol>\n             При  необходимости повторяйте вышеуказанные пункты для каждого типа семиотического сдвига.\n    </p>\n    <p style=\"margin: 1px; padding: 1px;\">\n            Если Вы желаете очистить все введённые данные нажмите кнопку \"Очистить\".<br>\n            Если Вы желаете установить настройки по умолчанию:\n       <ol>\n            <li>Выбирите тип семиотического сдвига.</li>\n            <li>Нажмите клавишу F7</li>\n    </ol>\n    </p>\n    <p style=\"font-size: 14px; font-family: Buxton Sketch; color: red; text-align: center; margin: 0px; padding: 0px;\">\n        <strong>Замечания</strong>   \n    <ol>\n            <li>Все поля настроек для выбранного типа семиотического сдвига должны быть заполнены.</li>\n            <li>Введенные данные должны быть целыми числами в диапазоне от 0 до 101.</li>\n            <li>Введенные данные не могут содержать только нулевые значения.</li>\n    </ol>\n    </p>\n  </body>\n</html>\n");
        classifierOptionsEditorPane.setCaretPosition(0);
        classifierOptionsScrollPane.setViewportView(classifierOptionsEditorPane);

        javax.swing.GroupLayout classifierOptionsPanelLayout = new javax.swing.GroupLayout(classifierOptionsPanel);
        classifierOptionsPanel.setLayout(classifierOptionsPanelLayout);
        classifierOptionsPanelLayout.setHorizontalGroup(
            classifierOptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(classifierOptionsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
        );
        classifierOptionsPanelLayout.setVerticalGroup(
            classifierOptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(classifierOptionsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
        );

        helpTabbedPane.addTab("Настройки", classifierOptionsPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(helpTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(helpTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_onClosed
        MainMenuForm.main(null);
    }//GEN-LAST:event_onClosed

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
            java.util.logging.Logger.getLogger(HelpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HelpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HelpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HelpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HelpForm();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane classificationEditorPane;
    private javax.swing.JPanel classificationPanel;
    private javax.swing.JScrollPane classificationScrollPane;
    private javax.swing.JEditorPane classifierOptionsEditorPane;
    private javax.swing.JPanel classifierOptionsPanel;
    private javax.swing.JScrollPane classifierOptionsScrollPane;
    private javax.swing.JTabbedPane helpTabbedPane;
    private javax.swing.JEditorPane medicalDataEditorPane;
    private javax.swing.JPanel medicalDataPanel;
    private javax.swing.JScrollPane medicalDataScrollPane;
    private javax.swing.JEditorPane registrationEditorPane;
    private javax.swing.JPanel registrationPanel;
    private javax.swing.JScrollPane registrationScrollPane;
    private javax.swing.JEditorPane searchCardsEditorPane;
    private javax.swing.JPanel searchCardsPanel;
    private javax.swing.JScrollPane searchCardsScrollPane;
    private javax.swing.JEditorPane statisticsEditorPane;
    private javax.swing.JPanel statisticsPanel;
    private javax.swing.JScrollPane statisticsScrollPane;
    // End of variables declaration//GEN-END:variables
}
