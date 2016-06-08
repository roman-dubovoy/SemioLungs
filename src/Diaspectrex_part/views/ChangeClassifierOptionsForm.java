package Diaspectrex_part.views;

import Diaspectrex_part.util.Validator;
import Diaspectrex_part.util.Classifier;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ChangeClassifierOptionsForm extends javax.swing.JFrame {
    
    private ArrayList<JTextField> normTextFields;
    
    private ArrayList<JTextField> intoksLowTextFields;
    private ArrayList<JTextField> intoksMiddleTextFields;
    private ArrayList<JTextField> intoksHighTextFields;
    
    private ArrayList<JTextField> katabLowTextFields;
    private ArrayList<JTextField> katabMiddleTextFields;
    private ArrayList<JTextField> katabHighTextFields;
    
    private ArrayList<JTextField> allergoLowTextFields;
    private ArrayList<JTextField> allergoMiddleTextFields;
    private ArrayList<JTextField> allergoHighTextFields;
    
    private ArrayList<JTextField> mixedLowTextFields;
    private ArrayList<JTextField> mixedIntoksTextFields;
    private ArrayList<JTextField> mixedAllergoTextFields;
    
    public ChangeClassifierOptionsForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        createTextFieldsArrayLists();
        this.setVisible(true);
    }
    
    private void createTextFieldsArrayLists(){
        normTextFields = new ArrayList<>();
        normTextFields.add(NormField1);
        normTextFields.add(NormField2);
        normTextFields.add(NormField3);
        normTextFields.add(NormField4);
        normTextFields.add(NormField5);
        normTextFields.add(NormField6);
        normTextFields.add(NormField7);
        normTextFields.add(NormField8);
        
        intoksLowTextFields = new ArrayList<>();
        intoksLowTextFields.add(IntoksLowField1);
        intoksLowTextFields.add(IntoksLowField2);
        intoksLowTextFields.add(IntoksLowField3);
        intoksLowTextFields.add(IntoksLowField4);
        intoksLowTextFields.add(IntoksLowField5);
        intoksLowTextFields.add(IntoksLowField6);
        intoksLowTextFields.add(IntoksLowField7);
        intoksLowTextFields.add(IntoksLowField8);
        
        intoksMiddleTextFields = new ArrayList<>();
        intoksMiddleTextFields.add(IntoksMiddleField1);
        intoksMiddleTextFields.add(IntoksMiddleField2);
        intoksMiddleTextFields.add(IntoksMiddleField3);
        intoksMiddleTextFields.add(IntoksMiddleField4);
        intoksMiddleTextFields.add(IntoksMiddleField5);
        intoksMiddleTextFields.add(IntoksMiddleField6);
        intoksMiddleTextFields.add(IntoksMiddleField7);
        intoksMiddleTextFields.add(IntoksMiddleField8);
        
        intoksHighTextFields = new ArrayList<>();
        intoksHighTextFields.add(IntoksHighField1);
        intoksHighTextFields.add(IntoksHighField2);
        intoksHighTextFields.add(IntoksHighField3);
        intoksHighTextFields.add(IntoksHighField4);
        intoksHighTextFields.add(IntoksHighField5);
        intoksHighTextFields.add(IntoksHighField6);
        intoksHighTextFields.add(IntoksHighField7);
        intoksHighTextFields.add(IntoksHighField8);
        
        katabLowTextFields = new ArrayList<>();
        katabLowTextFields.add(KatabLowField1);
        katabLowTextFields.add(KatabLowField2);
        katabLowTextFields.add(KatabLowField3);
        katabLowTextFields.add(KatabLowField4);
        katabLowTextFields.add(KatabLowField5);
        katabLowTextFields.add(KatabLowField6);
        katabLowTextFields.add(KatabLowField7);
        katabLowTextFields.add(KatabLowField8);
        
        katabMiddleTextFields = new ArrayList<>();
        katabMiddleTextFields.add(KatabMiddleField1);
        katabMiddleTextFields.add(KatabMiddleField2);
        katabMiddleTextFields.add(KatabMiddleField3);
        katabMiddleTextFields.add(KatabMiddleField4);
        katabMiddleTextFields.add(KatabMiddleField5);
        katabMiddleTextFields.add(KatabMiddleField6);
        katabMiddleTextFields.add(KatabMiddleField7);
        katabMiddleTextFields.add(KatabMiddleField8);
        
        katabHighTextFields = new ArrayList<>();
        katabHighTextFields.add(KatabHighField1);
        katabHighTextFields.add(KatabHighField2);
        katabHighTextFields.add(KatabHighField3);
        katabHighTextFields.add(KatabHighField4);
        katabHighTextFields.add(KatabHighField5);
        katabHighTextFields.add(KatabHighField6);
        katabHighTextFields.add(KatabHighField7);
        katabHighTextFields.add(KatabHighField8);
        
        allergoLowTextFields = new ArrayList<>();
        allergoLowTextFields.add(AllergoLowField1);
        allergoLowTextFields.add(AllergoLowField2);
        allergoLowTextFields.add(AllergoLowField3);
        allergoLowTextFields.add(AllergoLowField4);
        allergoLowTextFields.add(AllergoLowField5);
        allergoLowTextFields.add(AllergoLowField6);
        allergoLowTextFields.add(AllergoLowField7);
        allergoLowTextFields.add(AllergoLowField8);
        
        allergoMiddleTextFields = new ArrayList<>();
        allergoMiddleTextFields.add(AllergoMiddleField1);
        allergoMiddleTextFields.add(AllergoMiddleField2);
        allergoMiddleTextFields.add(AllergoMiddleField3);
        allergoMiddleTextFields.add(AllergoMiddleField4);
        allergoMiddleTextFields.add(AllergoMiddleField5);
        allergoMiddleTextFields.add(AllergoMiddleField6);
        allergoMiddleTextFields.add(AllergoMiddleField7);
        allergoMiddleTextFields.add(AllergoMiddleField8);
        
        allergoHighTextFields = new ArrayList<>();
        allergoHighTextFields.add(AllergoHighField1);
        allergoHighTextFields.add(AllergoHighField2);
        allergoHighTextFields.add(AllergoHighField3);
        allergoHighTextFields.add(AllergoHighField4);
        allergoHighTextFields.add(AllergoHighField5);
        allergoHighTextFields.add(AllergoHighField6);
        allergoHighTextFields.add(AllergoHighField7);
        allergoHighTextFields.add(AllergoHighField8);
        
        mixedLowTextFields = new ArrayList<>();
        mixedLowTextFields.add(MixedLowField1);
        mixedLowTextFields.add(MixedLowField2);
        mixedLowTextFields.add(MixedLowField3);
        mixedLowTextFields.add(MixedLowField4);
        mixedLowTextFields.add(MixedLowField5);
        mixedLowTextFields.add(MixedLowField6);
        mixedLowTextFields.add(MixedLowField7);
        mixedLowTextFields.add(MixedLowField8);
        
        mixedIntoksTextFields = new ArrayList<>();
        mixedIntoksTextFields.add(MixedIntoksField1);
        mixedIntoksTextFields.add(MixedIntoksField2);
        mixedIntoksTextFields.add(MixedIntoksField3);
        mixedIntoksTextFields.add(MixedIntoksField4);
        mixedIntoksTextFields.add(MixedIntoksField5);
        mixedIntoksTextFields.add(MixedIntoksField6);
        mixedIntoksTextFields.add(MixedIntoksField7);
        mixedIntoksTextFields.add(MixedIntoksField8);
        
        mixedAllergoTextFields = new ArrayList<>();
        mixedAllergoTextFields.add(MixedAllergoField1);
        mixedAllergoTextFields.add(MixedAllergoField2);
        mixedAllergoTextFields.add(MixedAllergoField3);
        mixedAllergoTextFields.add(MixedAllergoField4);
        mixedAllergoTextFields.add(MixedAllergoField5);
        mixedAllergoTextFields.add(MixedAllergoField6);
        mixedAllergoTextFields.add(MixedAllergoField7);
        mixedAllergoTextFields.add(MixedAllergoField8);
    }
    
    private void clearNormFields(){
        for(JTextField f: normTextFields){
            f.setText("");
        }
    }
    
    private void clearIntoksLowFields(){
        for(JTextField f: intoksLowTextFields){
            f.setText("");
        }
    }
    
    private void clearIntoksMiddleFields(){
        for(JTextField f: intoksMiddleTextFields){
            f.setText("");
        }
    }
    
    private void clearIntoksHighFields(){
        for(JTextField f: intoksHighTextFields){
            f.setText("");
        }
    }
    
    private void clearKatabLowFields(){
        for(JTextField f: katabLowTextFields){
            f.setText("");
        }
    }
    
    private void clearKatabMiddleFields(){
        for(JTextField f: katabMiddleTextFields){
            f.setText("");
        }
    }
    
    private void clearKatabHighFields(){
        for(JTextField f: katabHighTextFields){
            f.setText("");
        }
    }
    
    private void clearAllergoLowFields(){
        for(JTextField f: allergoLowTextFields){
            f.setText("");
        }
    }
    
    private void clearAllergoMiddleFields(){
        for(JTextField f: allergoMiddleTextFields){
            f.setText("");
        }
    }
    
    private void clearAllergoHighFields(){
        for(JTextField f: allergoHighTextFields){
            f.setText("");
        }
    }
    
    private void clearMixedLowFields(){
        for(JTextField f: mixedLowTextFields){
            f.setText("");
        }
    }
    
    private void clearMixedIntoksFields(){
        for(JTextField f: mixedIntoksTextFields){
            f.setText("");
        }
    }
    
    private void clearMixedAllergoFields(){
        for(JTextField f: mixedAllergoTextFields){
            f.setText("");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        optionsTabbedPane = new javax.swing.JTabbedPane();
        NormPanel = new javax.swing.JPanel();
        NormInnerPanel = new javax.swing.JPanel();
        NormField1 = new javax.swing.JTextField();
        NormField2 = new javax.swing.JTextField();
        NormField3 = new javax.swing.JTextField();
        NormField4 = new javax.swing.JTextField();
        NormField5 = new javax.swing.JTextField();
        NormField6 = new javax.swing.JTextField();
        NormField7 = new javax.swing.JTextField();
        NormField8 = new javax.swing.JTextField();
        NormSaveButton = new javax.swing.JButton();
        NormClearButton = new javax.swing.JButton();
        NormDefaultLabel = new javax.swing.JLabel();
        IntoksPanel = new javax.swing.JPanel();
        IntoksMiddlePanel = new javax.swing.JPanel();
        IntoksMiddleField1 = new javax.swing.JTextField();
        IntoksMiddleField2 = new javax.swing.JTextField();
        IntoksMiddleField3 = new javax.swing.JTextField();
        IntoksMiddleField4 = new javax.swing.JTextField();
        IntoksMiddleField5 = new javax.swing.JTextField();
        IntoksMiddleField6 = new javax.swing.JTextField();
        IntoksMiddleField7 = new javax.swing.JTextField();
        IntoksMiddleField8 = new javax.swing.JTextField();
        IntoksMiddleSaveButton = new javax.swing.JButton();
        IntoksMiddleClearButton = new javax.swing.JButton();
        IntoksHighPanel = new javax.swing.JPanel();
        IntoksHighField1 = new javax.swing.JTextField();
        IntoksHighField2 = new javax.swing.JTextField();
        IntoksHighField3 = new javax.swing.JTextField();
        IntoksHighField4 = new javax.swing.JTextField();
        IntoksHighField5 = new javax.swing.JTextField();
        IntoksHighField6 = new javax.swing.JTextField();
        IntoksHighField7 = new javax.swing.JTextField();
        IntoksHighField8 = new javax.swing.JTextField();
        IntoksHighClearButton = new javax.swing.JButton();
        IntoksHighSaveButton = new javax.swing.JButton();
        IntoksLabel = new javax.swing.JLabel();
        IntoksLowPanel = new javax.swing.JPanel();
        IntoksLowField1 = new javax.swing.JTextField();
        IntoksLowField2 = new javax.swing.JTextField();
        IntoksLowField3 = new javax.swing.JTextField();
        IntoksLowField4 = new javax.swing.JTextField();
        IntoksLowField5 = new javax.swing.JTextField();
        IntoksLowField6 = new javax.swing.JTextField();
        IntoksLowField7 = new javax.swing.JTextField();
        IntoksLowField8 = new javax.swing.JTextField();
        IntoksLowSaveButton = new javax.swing.JButton();
        IntoksLowClearButton = new javax.swing.JButton();
        IntoksDefaultLabel = new javax.swing.JLabel();
        KatabPanel = new javax.swing.JPanel();
        KatabLowPanel = new javax.swing.JPanel();
        KatabLowField1 = new javax.swing.JTextField();
        KatabLowField2 = new javax.swing.JTextField();
        KatabLowField3 = new javax.swing.JTextField();
        KatabLowField4 = new javax.swing.JTextField();
        KatabLowField5 = new javax.swing.JTextField();
        KatabLowField6 = new javax.swing.JTextField();
        KatabLowField7 = new javax.swing.JTextField();
        KatabLowField8 = new javax.swing.JTextField();
        KatabLowClearButton = new javax.swing.JButton();
        KatabLowSaveButton = new javax.swing.JButton();
        KatabMiddlePanel = new javax.swing.JPanel();
        KatabMiddleField1 = new javax.swing.JTextField();
        KatabMiddleField2 = new javax.swing.JTextField();
        KatabMiddleField3 = new javax.swing.JTextField();
        KatabMiddleField4 = new javax.swing.JTextField();
        KatabMiddleField5 = new javax.swing.JTextField();
        KatabMiddleField6 = new javax.swing.JTextField();
        KatabMiddleField7 = new javax.swing.JTextField();
        KatabMiddleField8 = new javax.swing.JTextField();
        KatabMiddleClearButton = new javax.swing.JButton();
        KatabMiddleSaveButton = new javax.swing.JButton();
        KatabHighPanel = new javax.swing.JPanel();
        KatabHighField1 = new javax.swing.JTextField();
        KatabHighField2 = new javax.swing.JTextField();
        KatabHighField3 = new javax.swing.JTextField();
        KatabHighField4 = new javax.swing.JTextField();
        KatabHighField5 = new javax.swing.JTextField();
        KatabHighField6 = new javax.swing.JTextField();
        KatabHighField7 = new javax.swing.JTextField();
        KatabHighField8 = new javax.swing.JTextField();
        KatabHighClearButton = new javax.swing.JButton();
        KatabHighSaveButton = new javax.swing.JButton();
        KatabLabel = new javax.swing.JLabel();
        katabDefaultLabel = new javax.swing.JLabel();
        AllergoPanel = new javax.swing.JPanel();
        AllergoLowPanel = new javax.swing.JPanel();
        AllergoLowField1 = new javax.swing.JTextField();
        AllergoLowField2 = new javax.swing.JTextField();
        AllergoLowField3 = new javax.swing.JTextField();
        AllergoLowField4 = new javax.swing.JTextField();
        AllergoLowField5 = new javax.swing.JTextField();
        AllergoLowField6 = new javax.swing.JTextField();
        AllergoLowField7 = new javax.swing.JTextField();
        AllergoLowField8 = new javax.swing.JTextField();
        AllergoLowClearButton = new javax.swing.JButton();
        AllergoLowSaveButton = new javax.swing.JButton();
        AllergoMiddlePanel = new javax.swing.JPanel();
        AllergoMiddleField1 = new javax.swing.JTextField();
        AllergoMiddleField2 = new javax.swing.JTextField();
        AllergoMiddleField3 = new javax.swing.JTextField();
        AllergoMiddleField4 = new javax.swing.JTextField();
        AllergoMiddleField5 = new javax.swing.JTextField();
        AllergoMiddleField6 = new javax.swing.JTextField();
        AllergoMiddleField7 = new javax.swing.JTextField();
        AllergoMiddleField8 = new javax.swing.JTextField();
        AllergoMiddleClearButton = new javax.swing.JButton();
        AllergoMiddleSaveButton = new javax.swing.JButton();
        AllergoHighPanel = new javax.swing.JPanel();
        AllergoHighField1 = new javax.swing.JTextField();
        AllergoHighField2 = new javax.swing.JTextField();
        AllergoHighField3 = new javax.swing.JTextField();
        AllergoHighField4 = new javax.swing.JTextField();
        AllergoHighField5 = new javax.swing.JTextField();
        AllergoHighField6 = new javax.swing.JTextField();
        AllergoHighField7 = new javax.swing.JTextField();
        AllergoHighField8 = new javax.swing.JTextField();
        AllergoHighClearButton = new javax.swing.JButton();
        AllergoHighSaveButton = new javax.swing.JButton();
        AllergoLabel = new javax.swing.JLabel();
        allergoDefaultLabel = new javax.swing.JLabel();
        MixedPanel = new javax.swing.JPanel();
        MixedAllergoPanel = new javax.swing.JPanel();
        MixedAllergoField1 = new javax.swing.JTextField();
        MixedAllergoField2 = new javax.swing.JTextField();
        MixedAllergoField3 = new javax.swing.JTextField();
        MixedAllergoField4 = new javax.swing.JTextField();
        MixedAllergoField5 = new javax.swing.JTextField();
        MixedAllergoField6 = new javax.swing.JTextField();
        MixedAllergoField7 = new javax.swing.JTextField();
        MixedAllergoField8 = new javax.swing.JTextField();
        MixedAllergoSaveButton = new javax.swing.JButton();
        MixedAllergoClearButton = new javax.swing.JButton();
        MixedLowPanel = new javax.swing.JPanel();
        MixedLowField1 = new javax.swing.JTextField();
        MixedLowField2 = new javax.swing.JTextField();
        MixedLowField3 = new javax.swing.JTextField();
        MixedLowField4 = new javax.swing.JTextField();
        MixedLowField5 = new javax.swing.JTextField();
        MixedLowField6 = new javax.swing.JTextField();
        MixedLowField7 = new javax.swing.JTextField();
        MixedLowField8 = new javax.swing.JTextField();
        MixedLowClearButton = new javax.swing.JButton();
        MixedLowSaveButton = new javax.swing.JButton();
        MixedIntoksPanel = new javax.swing.JPanel();
        MixedIntoksField1 = new javax.swing.JTextField();
        MixedIntoksField2 = new javax.swing.JTextField();
        MixedIntoksField3 = new javax.swing.JTextField();
        MixedIntoksField4 = new javax.swing.JTextField();
        MixedIntoksField5 = new javax.swing.JTextField();
        MixedIntoksField6 = new javax.swing.JTextField();
        MixedIntoksField7 = new javax.swing.JTextField();
        MixedIntoksField8 = new javax.swing.JTextField();
        MixedIntoksClearButton = new javax.swing.JButton();
        MixedIntoksSaveButton = new javax.swing.JButton();
        MixedLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Настройка классификатора");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                onClosed(evt);
            }
        });

        optionsTabbedPane.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        optionsTabbedPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        optionsTabbedPane.setFont(new java.awt.Font("Buxton Sketch", 0, 16)); // NOI18N
        optionsTabbedPane.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                optionsTabbedPaneKeyPressed(evt);
            }
        });

        NormInnerPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Нормологический тип семиотического сдвига", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Buxton Sketch", 0, 16))); // NOI18N

        NormSaveButton.setFont(new java.awt.Font("Buxton Sketch", 0, 16)); // NOI18N
        NormSaveButton.setText("Сохранить");
        NormSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NormSaveButtonActionPerformed(evt);
            }
        });

        NormClearButton.setFont(new java.awt.Font("Buxton Sketch", 0, 16)); // NOI18N
        NormClearButton.setText("Очистить");
        NormClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NormClearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NormInnerPanelLayout = new javax.swing.GroupLayout(NormInnerPanel);
        NormInnerPanel.setLayout(NormInnerPanelLayout);
        NormInnerPanelLayout.setHorizontalGroup(
            NormInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NormInnerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NormField1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NormField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NormField3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NormField4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NormField5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NormField6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NormField7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NormField8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NormInnerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(NormClearButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NormSaveButton)
                .addContainerGap())
        );

        NormInnerPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {NormField1, NormField2, NormField3, NormField4, NormField5, NormField6, NormField7, NormField8});

        NormInnerPanelLayout.setVerticalGroup(
            NormInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NormInnerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(NormInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NormField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NormField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NormField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NormField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NormField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NormField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NormField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NormField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(NormInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NormSaveButton)
                    .addComponent(NormClearButton)))
        );

        NormDefaultLabel.setFont(new java.awt.Font("Buxton Sketch", 0, 16)); // NOI18N
        NormDefaultLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NormDefaultLabel.setText("Нажмите F7 для установки настроек по умолчанию.");

        javax.swing.GroupLayout NormPanelLayout = new javax.swing.GroupLayout(NormPanel);
        NormPanel.setLayout(NormPanelLayout);
        NormPanelLayout.setHorizontalGroup(
            NormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NormPanelLayout.createSequentialGroup()
                .addGroup(NormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NormPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(NormInnerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(NormPanelLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(NormDefaultLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(56, 56, 56)))
                .addGap(14, 14, 14))
        );
        NormPanelLayout.setVerticalGroup(
            NormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NormPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NormInnerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(NormDefaultLabel)
                .addContainerGap(276, Short.MAX_VALUE))
        );

        optionsTabbedPane.addTab("Нормологический", NormPanel);

        IntoksMiddlePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Умеренная степень", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Buxton Sketch", 0, 16))); // NOI18N

        IntoksMiddleSaveButton.setFont(new java.awt.Font("Buxton Sketch", 0, 16)); // NOI18N
        IntoksMiddleSaveButton.setText("Сохранить");
        IntoksMiddleSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IntoksMiddleSaveButtonActionPerformed(evt);
            }
        });

        IntoksMiddleClearButton.setFont(new java.awt.Font("Buxton Sketch", 0, 16)); // NOI18N
        IntoksMiddleClearButton.setText("Очистить");
        IntoksMiddleClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IntoksMiddleClearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout IntoksMiddlePanelLayout = new javax.swing.GroupLayout(IntoksMiddlePanel);
        IntoksMiddlePanel.setLayout(IntoksMiddlePanelLayout);
        IntoksMiddlePanelLayout.setHorizontalGroup(
            IntoksMiddlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IntoksMiddlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IntoksMiddleField1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IntoksMiddleField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IntoksMiddleField3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IntoksMiddleField4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IntoksMiddleField5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IntoksMiddleField6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IntoksMiddleField7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IntoksMiddleField8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IntoksMiddlePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(IntoksMiddleClearButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IntoksMiddleSaveButton)
                .addContainerGap())
        );

        IntoksMiddlePanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {IntoksMiddleField1, IntoksMiddleField2, IntoksMiddleField3, IntoksMiddleField4, IntoksMiddleField5, IntoksMiddleField6, IntoksMiddleField7, IntoksMiddleField8});

        IntoksMiddlePanelLayout.setVerticalGroup(
            IntoksMiddlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IntoksMiddlePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(IntoksMiddlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IntoksMiddleField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IntoksMiddleField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IntoksMiddleField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IntoksMiddleField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IntoksMiddleField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IntoksMiddleField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IntoksMiddleField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IntoksMiddleField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(IntoksMiddlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IntoksMiddleSaveButton)
                    .addComponent(IntoksMiddleClearButton)))
        );

        IntoksHighPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Выраженная степень", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Buxton Sketch", 0, 16))); // NOI18N

        IntoksHighClearButton.setFont(new java.awt.Font("Buxton Sketch", 0, 16)); // NOI18N
        IntoksHighClearButton.setText("Очистить");
        IntoksHighClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IntoksHighClearButtonActionPerformed(evt);
            }
        });

        IntoksHighSaveButton.setFont(new java.awt.Font("Buxton Sketch", 0, 16)); // NOI18N
        IntoksHighSaveButton.setText("Сохранить");
        IntoksHighSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IntoksHighSaveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout IntoksHighPanelLayout = new javax.swing.GroupLayout(IntoksHighPanel);
        IntoksHighPanel.setLayout(IntoksHighPanelLayout);
        IntoksHighPanelLayout.setHorizontalGroup(
            IntoksHighPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IntoksHighPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IntoksHighField1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IntoksHighField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IntoksHighField3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IntoksHighField4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IntoksHighField5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IntoksHighField6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IntoksHighField7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IntoksHighField8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IntoksHighPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(IntoksHighClearButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IntoksHighSaveButton)
                .addContainerGap())
        );

        IntoksHighPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {IntoksHighField1, IntoksHighField2, IntoksHighField3, IntoksHighField4, IntoksHighField5, IntoksHighField6, IntoksHighField7, IntoksHighField8});

        IntoksHighPanelLayout.setVerticalGroup(
            IntoksHighPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IntoksHighPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(IntoksHighPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IntoksHighField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IntoksHighField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IntoksHighField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IntoksHighField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IntoksHighField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IntoksHighField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IntoksHighField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IntoksHighField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(IntoksHighPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IntoksHighSaveButton)
                    .addComponent(IntoksHighClearButton)))
        );

        IntoksLabel.setFont(new java.awt.Font("Buxton Sketch", 0, 16)); // NOI18N
        IntoksLabel.setText("Интоксикационный тип семиотического сдвига");

        IntoksLowPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Начальная степень", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Buxton Sketch", 0, 16))); // NOI18N

        IntoksLowSaveButton.setFont(new java.awt.Font("Buxton Sketch", 0, 16)); // NOI18N
        IntoksLowSaveButton.setText("Сохранить");
        IntoksLowSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IntoksLowSaveButtonActionPerformed(evt);
            }
        });

        IntoksLowClearButton.setFont(new java.awt.Font("Buxton Sketch", 0, 16)); // NOI18N
        IntoksLowClearButton.setText("Очистить");
        IntoksLowClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IntoksLowClearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout IntoksLowPanelLayout = new javax.swing.GroupLayout(IntoksLowPanel);
        IntoksLowPanel.setLayout(IntoksLowPanelLayout);
        IntoksLowPanelLayout.setHorizontalGroup(
            IntoksLowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IntoksLowPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IntoksLowField1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IntoksLowField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IntoksLowField3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IntoksLowField4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IntoksLowField5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IntoksLowField6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IntoksLowField7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IntoksLowField8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IntoksLowPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(IntoksLowClearButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IntoksLowSaveButton)
                .addContainerGap())
        );

        IntoksLowPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {IntoksLowField1, IntoksLowField2, IntoksLowField3, IntoksLowField4, IntoksLowField5, IntoksLowField6, IntoksLowField7, IntoksLowField8});

        IntoksLowPanelLayout.setVerticalGroup(
            IntoksLowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IntoksLowPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(IntoksLowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IntoksLowField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IntoksLowField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IntoksLowField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IntoksLowField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IntoksLowField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IntoksLowField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IntoksLowField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IntoksLowField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(IntoksLowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IntoksLowSaveButton)
                    .addComponent(IntoksLowClearButton)))
        );

        IntoksDefaultLabel.setFont(new java.awt.Font("Buxton Sketch", 0, 16)); // NOI18N
        IntoksDefaultLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IntoksDefaultLabel.setText("Нажмите F7 для установки настроек по умолчанию.");

        javax.swing.GroupLayout IntoksPanelLayout = new javax.swing.GroupLayout(IntoksPanel);
        IntoksPanel.setLayout(IntoksPanelLayout);
        IntoksPanelLayout.setHorizontalGroup(
            IntoksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IntoksPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(IntoksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(IntoksLowPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, IntoksPanelLayout.createSequentialGroup()
                        .addComponent(IntoksLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(IntoksMiddlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IntoksHighPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IntoksPanelLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(IntoksDefaultLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(70, 70, 70))
        );
        IntoksPanelLayout.setVerticalGroup(
            IntoksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IntoksPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IntoksLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IntoksLowPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(IntoksMiddlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(IntoksHighPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(IntoksDefaultLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        optionsTabbedPane.addTab("Интоксикационный", IntoksPanel);

        KatabLowPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Начальная степень", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Buxton Sketch", 0, 16))); // NOI18N

        KatabLowClearButton.setFont(new java.awt.Font("Buxton Sketch", 0, 16)); // NOI18N
        KatabLowClearButton.setText("Очистить");
        KatabLowClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KatabLowClearButtonActionPerformed(evt);
            }
        });

        KatabLowSaveButton.setFont(new java.awt.Font("Buxton Sketch", 0, 16)); // NOI18N
        KatabLowSaveButton.setText("Сохранить");
        KatabLowSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KatabLowSaveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout KatabLowPanelLayout = new javax.swing.GroupLayout(KatabLowPanel);
        KatabLowPanel.setLayout(KatabLowPanelLayout);
        KatabLowPanelLayout.setHorizontalGroup(
            KatabLowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KatabLowPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(KatabLowField1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(KatabLowField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(KatabLowField3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(KatabLowField4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(KatabLowField5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(KatabLowField6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(KatabLowField7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(KatabLowField8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KatabLowPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(KatabLowClearButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(KatabLowSaveButton)
                .addContainerGap())
        );

        KatabLowPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {KatabLowField1, KatabLowField2, KatabLowField3, KatabLowField4, KatabLowField5, KatabLowField6, KatabLowField7, KatabLowField8});

        KatabLowPanelLayout.setVerticalGroup(
            KatabLowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KatabLowPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(KatabLowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KatabLowField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KatabLowField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KatabLowField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KatabLowField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KatabLowField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KatabLowField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KatabLowField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KatabLowField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(KatabLowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KatabLowSaveButton)
                    .addComponent(KatabLowClearButton)))
        );

        KatabMiddlePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Умеренная степень", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Buxton Sketch", 0, 16))); // NOI18N

        KatabMiddleClearButton.setFont(new java.awt.Font("Buxton Sketch", 0, 16)); // NOI18N
        KatabMiddleClearButton.setText("Очистить");
        KatabMiddleClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KatabMiddleClearButtonActionPerformed(evt);
            }
        });

        KatabMiddleSaveButton.setFont(new java.awt.Font("Buxton Sketch", 0, 16)); // NOI18N
        KatabMiddleSaveButton.setText("Сохранить");
        KatabMiddleSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KatabMiddleSaveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout KatabMiddlePanelLayout = new javax.swing.GroupLayout(KatabMiddlePanel);
        KatabMiddlePanel.setLayout(KatabMiddlePanelLayout);
        KatabMiddlePanelLayout.setHorizontalGroup(
            KatabMiddlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KatabMiddlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(KatabMiddleField1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(KatabMiddleField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(KatabMiddleField3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(KatabMiddleField4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(KatabMiddleField5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(KatabMiddleField6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(KatabMiddleField7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(KatabMiddleField8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KatabMiddlePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(KatabMiddleClearButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(KatabMiddleSaveButton)
                .addContainerGap())
        );

        KatabMiddlePanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {KatabMiddleField1, KatabMiddleField2, KatabMiddleField3, KatabMiddleField4, KatabMiddleField5, KatabMiddleField6, KatabMiddleField7, KatabMiddleField8});

        KatabMiddlePanelLayout.setVerticalGroup(
            KatabMiddlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KatabMiddlePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(KatabMiddlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KatabMiddleField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KatabMiddleField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KatabMiddleField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KatabMiddleField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KatabMiddleField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KatabMiddleField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KatabMiddleField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KatabMiddleField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(KatabMiddlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KatabMiddleSaveButton)
                    .addComponent(KatabMiddleClearButton)))
        );

        KatabHighPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Выраженная степень", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Buxton Sketch", 0, 16))); // NOI18N

        KatabHighClearButton.setFont(new java.awt.Font("Buxton Sketch", 0, 16)); // NOI18N
        KatabHighClearButton.setText("Очистить");
        KatabHighClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KatabHighClearButtonActionPerformed(evt);
            }
        });

        KatabHighSaveButton.setFont(new java.awt.Font("Buxton Sketch", 0, 16)); // NOI18N
        KatabHighSaveButton.setText("Сохранить");
        KatabHighSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KatabHighSaveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout KatabHighPanelLayout = new javax.swing.GroupLayout(KatabHighPanel);
        KatabHighPanel.setLayout(KatabHighPanelLayout);
        KatabHighPanelLayout.setHorizontalGroup(
            KatabHighPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KatabHighPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(KatabHighField1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(KatabHighField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(KatabHighField3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(KatabHighField4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(KatabHighField5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(KatabHighField6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(KatabHighField7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(KatabHighField8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KatabHighPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(KatabHighClearButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(KatabHighSaveButton)
                .addContainerGap())
        );

        KatabHighPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {KatabHighField1, KatabHighField2, KatabHighField3, KatabHighField4, KatabHighField5, KatabHighField6, KatabHighField7, KatabHighField8});

        KatabHighPanelLayout.setVerticalGroup(
            KatabHighPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KatabHighPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(KatabHighPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KatabHighField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KatabHighField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KatabHighField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KatabHighField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KatabHighField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KatabHighField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KatabHighField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KatabHighField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(KatabHighPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KatabHighSaveButton)
                    .addComponent(KatabHighClearButton)))
        );

        KatabLabel.setFont(new java.awt.Font("Buxton Sketch", 0, 16)); // NOI18N
        KatabLabel.setText("Катаболический тип семиотического сдвига");

        katabDefaultLabel.setFont(new java.awt.Font("Buxton Sketch", 0, 16)); // NOI18N
        katabDefaultLabel.setText("Нажмите F7 для установки настроек по умолчанию.");

        javax.swing.GroupLayout KatabPanelLayout = new javax.swing.GroupLayout(KatabPanel);
        KatabPanel.setLayout(KatabPanelLayout);
        KatabPanelLayout.setHorizontalGroup(
            KatabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KatabPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(KatabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(KatabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(KatabHighPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(KatabLabel, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(KatabLowPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(KatabMiddlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(KatabPanelLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(katabDefaultLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        KatabPanelLayout.setVerticalGroup(
            KatabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KatabPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(KatabLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(KatabLowPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(KatabMiddlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(KatabHighPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(katabDefaultLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        optionsTabbedPane.addTab("Катаболический", KatabPanel);

        AllergoLowPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Начальная степень", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Buxton Sketch", 0, 16))); // NOI18N

        AllergoLowClearButton.setFont(new java.awt.Font("Buxton Sketch", 0, 16)); // NOI18N
        AllergoLowClearButton.setText("Очистить");
        AllergoLowClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllergoLowClearButtonActionPerformed(evt);
            }
        });

        AllergoLowSaveButton.setFont(new java.awt.Font("Buxton Sketch", 0, 16)); // NOI18N
        AllergoLowSaveButton.setText("Сохранить");
        AllergoLowSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllergoLowSaveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AllergoLowPanelLayout = new javax.swing.GroupLayout(AllergoLowPanel);
        AllergoLowPanel.setLayout(AllergoLowPanelLayout);
        AllergoLowPanelLayout.setHorizontalGroup(
            AllergoLowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AllergoLowPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AllergoLowField1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AllergoLowField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AllergoLowField3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AllergoLowField4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AllergoLowField5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AllergoLowField6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AllergoLowField7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AllergoLowField8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AllergoLowPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AllergoLowClearButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AllergoLowSaveButton)
                .addContainerGap())
        );

        AllergoLowPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {AllergoLowField1, AllergoLowField2, AllergoLowField3, AllergoLowField4, AllergoLowField5, AllergoLowField6, AllergoLowField7, AllergoLowField8});

        AllergoLowPanelLayout.setVerticalGroup(
            AllergoLowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AllergoLowPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(AllergoLowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AllergoLowField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AllergoLowField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AllergoLowField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AllergoLowField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AllergoLowField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AllergoLowField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AllergoLowField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AllergoLowField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AllergoLowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AllergoLowSaveButton)
                    .addComponent(AllergoLowClearButton)))
        );

        AllergoMiddlePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Умеренная степень", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Buxton Sketch", 0, 16))); // NOI18N

        AllergoMiddleClearButton.setFont(new java.awt.Font("Buxton Sketch", 0, 16)); // NOI18N
        AllergoMiddleClearButton.setText("Очистить");
        AllergoMiddleClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllergoMiddleClearButtonActionPerformed(evt);
            }
        });

        AllergoMiddleSaveButton.setFont(new java.awt.Font("Buxton Sketch", 0, 16)); // NOI18N
        AllergoMiddleSaveButton.setText("Сохранить");
        AllergoMiddleSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllergoMiddleSaveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AllergoMiddlePanelLayout = new javax.swing.GroupLayout(AllergoMiddlePanel);
        AllergoMiddlePanel.setLayout(AllergoMiddlePanelLayout);
        AllergoMiddlePanelLayout.setHorizontalGroup(
            AllergoMiddlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AllergoMiddlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AllergoMiddleField1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AllergoMiddleField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AllergoMiddleField3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AllergoMiddleField4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AllergoMiddleField5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AllergoMiddleField6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AllergoMiddleField7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AllergoMiddleField8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AllergoMiddlePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AllergoMiddleClearButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AllergoMiddleSaveButton)
                .addContainerGap())
        );

        AllergoMiddlePanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {AllergoMiddleField1, AllergoMiddleField2, AllergoMiddleField3, AllergoMiddleField4, AllergoMiddleField5, AllergoMiddleField6, AllergoMiddleField7, AllergoMiddleField8});

        AllergoMiddlePanelLayout.setVerticalGroup(
            AllergoMiddlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AllergoMiddlePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(AllergoMiddlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AllergoMiddleField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AllergoMiddleField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AllergoMiddleField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AllergoMiddleField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AllergoMiddleField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AllergoMiddleField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AllergoMiddleField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AllergoMiddleField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AllergoMiddlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AllergoMiddleSaveButton)
                    .addComponent(AllergoMiddleClearButton)))
        );

        AllergoHighPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Выраженная степень", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Buxton Sketch", 0, 16))); // NOI18N

        AllergoHighClearButton.setFont(new java.awt.Font("Buxton Sketch", 0, 16)); // NOI18N
        AllergoHighClearButton.setText("Очистить");
        AllergoHighClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllergoHighClearButtonActionPerformed(evt);
            }
        });

        AllergoHighSaveButton.setFont(new java.awt.Font("Buxton Sketch", 0, 16)); // NOI18N
        AllergoHighSaveButton.setText("Сохранить");
        AllergoHighSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllergoHighSaveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AllergoHighPanelLayout = new javax.swing.GroupLayout(AllergoHighPanel);
        AllergoHighPanel.setLayout(AllergoHighPanelLayout);
        AllergoHighPanelLayout.setHorizontalGroup(
            AllergoHighPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AllergoHighPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AllergoHighField1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AllergoHighField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AllergoHighField3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AllergoHighField4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AllergoHighField5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AllergoHighField6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AllergoHighField7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AllergoHighField8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AllergoHighPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AllergoHighClearButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AllergoHighSaveButton)
                .addContainerGap())
        );

        AllergoHighPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {AllergoHighField1, AllergoHighField2, AllergoHighField3, AllergoHighField4, AllergoHighField5, AllergoHighField6, AllergoHighField7, AllergoHighField8});

        AllergoHighPanelLayout.setVerticalGroup(
            AllergoHighPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AllergoHighPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(AllergoHighPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AllergoHighField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AllergoHighField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AllergoHighField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AllergoHighField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AllergoHighField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AllergoHighField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AllergoHighField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AllergoHighField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AllergoHighPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AllergoHighSaveButton)
                    .addComponent(AllergoHighClearButton)))
        );

        AllergoLabel.setFont(new java.awt.Font("Buxton Sketch", 0, 16)); // NOI18N
        AllergoLabel.setText("Аллерго-аутоимунный тип семиотического сдвига");

        allergoDefaultLabel.setFont(new java.awt.Font("Buxton Sketch", 0, 16)); // NOI18N
        allergoDefaultLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        allergoDefaultLabel.setText("Нажмите F7 для установки настроек по умолчанию.");

        javax.swing.GroupLayout AllergoPanelLayout = new javax.swing.GroupLayout(AllergoPanel);
        AllergoPanel.setLayout(AllergoPanelLayout);
        AllergoPanelLayout.setHorizontalGroup(
            AllergoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AllergoPanelLayout.createSequentialGroup()
                .addGroup(AllergoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AllergoPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(AllergoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AllergoLabel)
                            .addComponent(AllergoLowPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AllergoMiddlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AllergoHighPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(AllergoPanelLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(allergoDefaultLabel)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        AllergoPanelLayout.setVerticalGroup(
            AllergoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AllergoPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AllergoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AllergoLowPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AllergoMiddlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AllergoHighPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(allergoDefaultLabel)
                .addContainerGap())
        );

        optionsTabbedPane.addTab("Аллерго-аутоимунный", AllergoPanel);

        MixedPanel.setPreferredSize(new java.awt.Dimension(454, 300));

        MixedAllergoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Аллерго-аутоиммунно-катаболически-подобный", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Buxton Sketch", 0, 16))); // NOI18N

        MixedAllergoSaveButton.setFont(new java.awt.Font("Buxton Sketch", 0, 16)); // NOI18N
        MixedAllergoSaveButton.setText("Сохранить");
        MixedAllergoSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MixedAllergoSaveButtonActionPerformed(evt);
            }
        });

        MixedAllergoClearButton.setFont(new java.awt.Font("Buxton Sketch", 0, 16)); // NOI18N
        MixedAllergoClearButton.setText("Очистить");
        MixedAllergoClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MixedAllergoClearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MixedAllergoPanelLayout = new javax.swing.GroupLayout(MixedAllergoPanel);
        MixedAllergoPanel.setLayout(MixedAllergoPanelLayout);
        MixedAllergoPanelLayout.setHorizontalGroup(
            MixedAllergoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MixedAllergoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MixedAllergoField1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MixedAllergoField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MixedAllergoField3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MixedAllergoField4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MixedAllergoField5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MixedAllergoField6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MixedAllergoField7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MixedAllergoField8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MixedAllergoPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MixedAllergoClearButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MixedAllergoSaveButton)
                .addContainerGap())
        );

        MixedAllergoPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {MixedAllergoField1, MixedAllergoField2, MixedAllergoField3, MixedAllergoField4, MixedAllergoField5, MixedAllergoField6, MixedAllergoField7, MixedAllergoField8});

        MixedAllergoPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {MixedAllergoClearButton, MixedAllergoSaveButton});

        MixedAllergoPanelLayout.setVerticalGroup(
            MixedAllergoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MixedAllergoPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(MixedAllergoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MixedAllergoField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MixedAllergoField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MixedAllergoField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MixedAllergoField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MixedAllergoField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MixedAllergoField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MixedAllergoField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MixedAllergoField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(MixedAllergoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MixedAllergoSaveButton)
                    .addComponent(MixedAllergoClearButton)))
        );

        MixedLowPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Начальная степень", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Buxton Sketch", 0, 16))); // NOI18N

        MixedLowClearButton.setFont(new java.awt.Font("Buxton Sketch", 0, 16)); // NOI18N
        MixedLowClearButton.setText("Очистить");
        MixedLowClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MixedLowClearButtonActionPerformed(evt);
            }
        });

        MixedLowSaveButton.setFont(new java.awt.Font("Buxton Sketch", 0, 16)); // NOI18N
        MixedLowSaveButton.setText("Сохранить");
        MixedLowSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MixedLowSaveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MixedLowPanelLayout = new javax.swing.GroupLayout(MixedLowPanel);
        MixedLowPanel.setLayout(MixedLowPanelLayout);
        MixedLowPanelLayout.setHorizontalGroup(
            MixedLowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MixedLowPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MixedLowField1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MixedLowField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MixedLowField3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MixedLowField4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MixedLowField5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MixedLowField6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MixedLowField7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MixedLowField8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MixedLowPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MixedLowClearButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MixedLowSaveButton)
                .addContainerGap())
        );

        MixedLowPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {MixedLowField1, MixedLowField2, MixedLowField3, MixedLowField4, MixedLowField5, MixedLowField6, MixedLowField7, MixedLowField8});

        MixedLowPanelLayout.setVerticalGroup(
            MixedLowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MixedLowPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(MixedLowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MixedLowField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MixedLowField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MixedLowField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MixedLowField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MixedLowField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MixedLowField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MixedLowField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MixedLowField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MixedLowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MixedLowSaveButton)
                    .addComponent(MixedLowClearButton)))
        );

        MixedIntoksPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Интоксикационно-катаболически-подобный", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Buxton Sketch", 0, 16))); // NOI18N

        MixedIntoksClearButton.setFont(new java.awt.Font("Buxton Sketch", 0, 16)); // NOI18N
        MixedIntoksClearButton.setText("Очистить");
        MixedIntoksClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MixedIntoksClearButtonActionPerformed(evt);
            }
        });

        MixedIntoksSaveButton.setFont(new java.awt.Font("Buxton Sketch", 0, 16)); // NOI18N
        MixedIntoksSaveButton.setText("Сохранить");
        MixedIntoksSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MixedIntoksSaveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MixedIntoksPanelLayout = new javax.swing.GroupLayout(MixedIntoksPanel);
        MixedIntoksPanel.setLayout(MixedIntoksPanelLayout);
        MixedIntoksPanelLayout.setHorizontalGroup(
            MixedIntoksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MixedIntoksPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MixedIntoksField1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MixedIntoksField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MixedIntoksField3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MixedIntoksField4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MixedIntoksField5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MixedIntoksField6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MixedIntoksField7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MixedIntoksField8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MixedIntoksPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MixedIntoksClearButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MixedIntoksSaveButton)
                .addContainerGap())
        );

        MixedIntoksPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {MixedIntoksField1, MixedIntoksField2, MixedIntoksField3, MixedIntoksField4, MixedIntoksField5, MixedIntoksField6, MixedIntoksField7, MixedIntoksField8});

        MixedIntoksPanelLayout.setVerticalGroup(
            MixedIntoksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MixedIntoksPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(MixedIntoksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MixedIntoksField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MixedIntoksField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MixedIntoksField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MixedIntoksField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MixedIntoksField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MixedIntoksField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MixedIntoksField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MixedIntoksField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MixedIntoksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MixedIntoksSaveButton)
                    .addComponent(MixedIntoksClearButton)))
        );

        MixedLabel.setFont(new java.awt.Font("Buxton Sketch", 0, 16)); // NOI18N
        MixedLabel.setText("Смешанный тип семиотического сдвига");

        jLabel1.setFont(new java.awt.Font("Buxton Sketch", 0, 16)); // NOI18N
        jLabel1.setText("Нажмите F7 для установки настроек по умолчанию.");

        javax.swing.GroupLayout MixedPanelLayout = new javax.swing.GroupLayout(MixedPanel);
        MixedPanel.setLayout(MixedPanelLayout);
        MixedPanelLayout.setHorizontalGroup(
            MixedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MixedPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MixedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MixedPanelLayout.createSequentialGroup()
                        .addComponent(MixedLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(MixedLowPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MixedIntoksPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MixedAllergoPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(111, 111, 111))
            .addGroup(MixedPanelLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        MixedPanelLayout.setVerticalGroup(
            MixedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MixedPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MixedLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MixedLowPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MixedIntoksPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MixedAllergoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        optionsTabbedPane.addTab("Смешанный", MixedPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(optionsTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(optionsTabbedPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_onClosed
        MainMenuForm.main(null);
    }//GEN-LAST:event_onClosed

    private void NormClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NormClearButtonActionPerformed
        clearNormFields();
        optionsTabbedPane.requestFocus();
    }//GEN-LAST:event_NormClearButtonActionPerformed

    private void IntoksLowClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IntoksLowClearButtonActionPerformed
        clearIntoksLowFields();
        optionsTabbedPane.requestFocus();
    }//GEN-LAST:event_IntoksLowClearButtonActionPerformed

    private void IntoksMiddleClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IntoksMiddleClearButtonActionPerformed
        clearIntoksMiddleFields();
        optionsTabbedPane.requestFocus();
    }//GEN-LAST:event_IntoksMiddleClearButtonActionPerformed

    private void IntoksHighClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IntoksHighClearButtonActionPerformed
        clearIntoksHighFields();
        optionsTabbedPane.requestFocus();
    }//GEN-LAST:event_IntoksHighClearButtonActionPerformed

    private void KatabLowClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KatabLowClearButtonActionPerformed
        clearKatabLowFields();
        optionsTabbedPane.requestFocus();
    }//GEN-LAST:event_KatabLowClearButtonActionPerformed

    private void KatabMiddleClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KatabMiddleClearButtonActionPerformed
        clearKatabMiddleFields();
        optionsTabbedPane.requestFocus();
    }//GEN-LAST:event_KatabMiddleClearButtonActionPerformed

    private void KatabHighClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KatabHighClearButtonActionPerformed
        clearKatabHighFields();
        optionsTabbedPane.requestFocus();
    }//GEN-LAST:event_KatabHighClearButtonActionPerformed

    private void AllergoLowClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllergoLowClearButtonActionPerformed
        clearAllergoLowFields();
        optionsTabbedPane.requestFocus();
    }//GEN-LAST:event_AllergoLowClearButtonActionPerformed

    private void AllergoMiddleClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllergoMiddleClearButtonActionPerformed
        clearAllergoMiddleFields();
        optionsTabbedPane.requestFocus();
    }//GEN-LAST:event_AllergoMiddleClearButtonActionPerformed

    private void AllergoHighClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllergoHighClearButtonActionPerformed
        clearAllergoHighFields();
        optionsTabbedPane.requestFocus();
    }//GEN-LAST:event_AllergoHighClearButtonActionPerformed

    private void MixedLowClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MixedLowClearButtonActionPerformed
        clearMixedLowFields();
        optionsTabbedPane.requestFocus();
    }//GEN-LAST:event_MixedLowClearButtonActionPerformed

    private void MixedIntoksClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MixedIntoksClearButtonActionPerformed
        clearMixedIntoksFields();
        optionsTabbedPane.requestFocus();
    }//GEN-LAST:event_MixedIntoksClearButtonActionPerformed

    private void MixedAllergoClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MixedAllergoClearButtonActionPerformed
        clearMixedAllergoFields();
        optionsTabbedPane.requestFocus();
    }//GEN-LAST:event_MixedAllergoClearButtonActionPerformed

    private void IntoksLowSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IntoksLowSaveButtonActionPerformed
        int[] newIntoksLowOptions = new int[8];
        int sum = 0;
        for(int i = 0; i < intoksLowTextFields.size(); i++){
            if(!Validator.checkOptionsData(intoksLowTextFields.get(i).getText())){
                JOptionPane.showMessageDialog(this, "Введенные данные некорректны!\nВсе ячейки должны быть заполнены числовыми данными.\nЗначения должны лежать в диапазоне от 0 до 101.", "Изменение настроек", JOptionPane.ERROR_MESSAGE);
                clearIntoksLowFields();
                optionsTabbedPane.requestFocus();
                return;
            }
            else{
                newIntoksLowOptions[i] = Integer.valueOf(intoksLowTextFields.get(i).getText());
                sum += newIntoksLowOptions[i];
            }
            if(i == intoksLowTextFields.size() - 1){
                if(sum != 0){
                    Classifier.setNewIntoksLowOptions(newIntoksLowOptions);
                    JOptionPane.showMessageDialog(this, "Настройки успешно сохранены!", "Изменение настроек", JOptionPane.INFORMATION_MESSAGE);
                    clearIntoksLowFields();
                }
                else{
                    JOptionPane.showMessageDialog(this, "Данные не могут содержать только нулевые значения!", "Изменение настроек", JOptionPane.ERROR_MESSAGE);
                    clearIntoksLowFields();
                }
            }
        }
        optionsTabbedPane.requestFocus();
    }//GEN-LAST:event_IntoksLowSaveButtonActionPerformed

    private void IntoksMiddleSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IntoksMiddleSaveButtonActionPerformed
        int[] newIntoksMiddleOptions = new int[8];
        int sum = 0;
        for(int i = 0; i < intoksMiddleTextFields.size(); i++){
            if(!Validator.checkOptionsData(intoksMiddleTextFields.get(i).getText())){
                JOptionPane.showMessageDialog(this, "Введенные данные некорректны!\nВсе ячейки должны быть заполнены числовыми данными.\nЗначения должны лежать в диапазоне от 0 до 101.", "Изменение настроек", JOptionPane.ERROR_MESSAGE);
                clearIntoksMiddleFields();
                optionsTabbedPane.requestFocus();
                return;
            }
            else{
                newIntoksMiddleOptions[i] = Integer.valueOf(intoksMiddleTextFields.get(i).getText());
                sum += newIntoksMiddleOptions[i];
            }
            if(i == intoksMiddleTextFields.size() - 1){
                if(sum != 0){
                    Classifier.setNewIntoksMiddleOptions(newIntoksMiddleOptions);
                    JOptionPane.showMessageDialog(this, "Настройки успешно сохранены!", "Изменение настроек", JOptionPane.INFORMATION_MESSAGE);
                    clearIntoksMiddleFields();
                }
                else{
                    JOptionPane.showMessageDialog(this, "Данные не могут содержать только нулевые значения!", "Изменение настроек", JOptionPane.ERROR_MESSAGE);
                    clearIntoksMiddleFields();
                }
            }
        }
        optionsTabbedPane.requestFocus();
    }//GEN-LAST:event_IntoksMiddleSaveButtonActionPerformed

    private void IntoksHighSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IntoksHighSaveButtonActionPerformed
        int[] newIntoksHighOptions = new int[8];
        int sum = 0;
        for(int i = 0; i < intoksHighTextFields.size(); i++){
            if(!Validator.checkOptionsData(intoksHighTextFields.get(i).getText())){
                JOptionPane.showMessageDialog(this, "Введенные данные некорректны!\nВсе ячейки должны быть заполнены числовыми данными.\nЗначения должны лежать в диапазоне от 0 до 101.", "Изменение настроек", JOptionPane.ERROR_MESSAGE);
                clearIntoksHighFields();
                optionsTabbedPane.requestFocus();
                return;
            }
            else{
                newIntoksHighOptions[i] = Integer.valueOf(intoksHighTextFields.get(i).getText());
                sum += newIntoksHighOptions[i];
            }
            if(i == intoksHighTextFields.size() - 1){
                if(sum != 0){
                    Classifier.setNewIntoksHighOptions(newIntoksHighOptions);
                    JOptionPane.showMessageDialog(this, "Настройки успешно сохранены!", "Изменение настроек", JOptionPane.INFORMATION_MESSAGE);
                    clearIntoksHighFields();
                }
                else{
                    JOptionPane.showMessageDialog(this, "Данные не могут содержать только нулевые значения!", "Изменение настроек", JOptionPane.ERROR_MESSAGE);
                    clearIntoksHighFields();
                }
            }
        }
        optionsTabbedPane.requestFocus();
    }//GEN-LAST:event_IntoksHighSaveButtonActionPerformed

    private void KatabLowSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KatabLowSaveButtonActionPerformed
        int[] newKatabLowOptions = new int[8];
        int sum = 0;
        for(int i = 0; i < katabLowTextFields.size(); i++){
            if(!Validator.checkOptionsData(katabLowTextFields.get(i).getText())){
                JOptionPane.showMessageDialog(this, "Введенные данные некорректны!\nВсе ячейки должны быть заполнены числовыми данными.\nЗначения должны лежать в диапазоне от 0 до 101.", "Изменение настроек", JOptionPane.ERROR_MESSAGE);
                clearKatabLowFields();
                optionsTabbedPane.requestFocus();
                return;
            }
            else{
                newKatabLowOptions[i] = Integer.valueOf(katabLowTextFields.get(i).getText());
                sum += newKatabLowOptions[i];
            }
            if(i == katabLowTextFields.size() - 1){
                if(sum != 0){
                    Classifier.setNewKatabLowOptions(newKatabLowOptions);
                    JOptionPane.showMessageDialog(this, "Настройки успешно сохранены!", "Изменение настроек", JOptionPane.INFORMATION_MESSAGE);
                    clearKatabLowFields();
                }
                else{
                    JOptionPane.showMessageDialog(this, "Данные не могут содержать только нулевые значения!", "Изменение настроек", JOptionPane.ERROR_MESSAGE);
                    clearKatabLowFields();
                }
            }
        }
        optionsTabbedPane.requestFocus();
    }//GEN-LAST:event_KatabLowSaveButtonActionPerformed

    private void KatabMiddleSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KatabMiddleSaveButtonActionPerformed
        int[] newKatabMiddleOptions = new int[8];
        int sum = 0;
        for(int i = 0; i < katabMiddleTextFields.size(); i++){
            if(!Validator.checkOptionsData(katabMiddleTextFields.get(i).getText())){
                JOptionPane.showMessageDialog(this, "Введенные данные некорректны!\nВсе ячейки должны быть заполнены числовыми данными.\nЗначения должны лежать в диапазоне от 0 до 101.", "Изменение настроек", JOptionPane.ERROR_MESSAGE);
                clearKatabMiddleFields();
                optionsTabbedPane.requestFocus();
                return;
            }
            else{
                newKatabMiddleOptions[i] = Integer.valueOf(katabMiddleTextFields.get(i).getText());
                sum += newKatabMiddleOptions[i];
            }
            if(i == katabMiddleTextFields.size() - 1){
                if(sum != 0){
                    Classifier.setNewKatabMiddleOptions(newKatabMiddleOptions);
                    JOptionPane.showMessageDialog(this, "Настройки успешно сохранены!", "Изменение настроек", JOptionPane.INFORMATION_MESSAGE);
                    clearKatabMiddleFields();
                }
                else{
                    JOptionPane.showMessageDialog(this, "Данные не могут содержать только нулевые значения!", "Изменение настроек", JOptionPane.ERROR_MESSAGE);
                    clearKatabMiddleFields();
                }
            }
        }
        optionsTabbedPane.requestFocus();
    }//GEN-LAST:event_KatabMiddleSaveButtonActionPerformed

    private void KatabHighSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KatabHighSaveButtonActionPerformed
        int[] newKatabHighOptions = new int[8];
        int sum = 0;
        for(int i = 0; i < katabHighTextFields.size(); i++){
            if(!Validator.checkOptionsData(katabHighTextFields.get(i).getText())){
                JOptionPane.showMessageDialog(this, "Введенные данные некорректны!\nВсе ячейки должны быть заполнены числовыми данными.\nЗначения должны лежать в диапазоне от 0 до 101.", "Изменение настроек", JOptionPane.ERROR_MESSAGE);
                clearKatabHighFields();
                optionsTabbedPane.requestFocus();
                return;
            }
            else{
                newKatabHighOptions[i] = Integer.valueOf(katabHighTextFields.get(i).getText());
                sum += newKatabHighOptions[i];
            }
            if(i == katabHighTextFields.size() - 1){
                if(sum != 0){
                    Classifier.setNewKatabHighOptions(newKatabHighOptions);
                    JOptionPane.showMessageDialog(this, "Настройки успешно сохранены!", "Изменение настроек", JOptionPane.INFORMATION_MESSAGE);
                    clearKatabHighFields();
                }
                else{
                    JOptionPane.showMessageDialog(this, "Данные не могут содержать только нулевые значения!", "Изменение настроек", JOptionPane.ERROR_MESSAGE);
                    clearKatabHighFields();
                }
            }
        }
        optionsTabbedPane.requestFocus();
    }//GEN-LAST:event_KatabHighSaveButtonActionPerformed

    private void AllergoLowSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllergoLowSaveButtonActionPerformed
        int[] newAllergoLowOptions = new int[8];
        int sum = 0;
        for(int i = 0; i < allergoLowTextFields.size(); i++){
            if(!Validator.checkOptionsData(allergoLowTextFields.get(i).getText())){
                JOptionPane.showMessageDialog(this, "Введенные данные некорректны!\nВсе ячейки должны быть заполнены числовыми данными.\nЗначения должны лежать в диапазоне от 0 до 101.", "Изменение настроек", JOptionPane.ERROR_MESSAGE);
                clearAllergoLowFields();
                optionsTabbedPane.requestFocus();
                return;
            }
            else{
                newAllergoLowOptions[i] = Integer.valueOf(allergoLowTextFields.get(i).getText());
                sum += newAllergoLowOptions[i];
            }
            if(i == allergoLowTextFields.size() - 1){
                if(sum != 0){
                    Classifier.setNewAllergoLowOptions(newAllergoLowOptions);
                    JOptionPane.showMessageDialog(this, "Настройки успешно сохранены!", "Изменение настроек", JOptionPane.INFORMATION_MESSAGE);
                    clearAllergoLowFields();
                }
                else{
                    JOptionPane.showMessageDialog(this, "Данные не могут содержать только нулевые значения!", "Изменение настроек", JOptionPane.ERROR_MESSAGE);
                    clearAllergoLowFields();
                }
            }
        }
        optionsTabbedPane.requestFocus();
    }//GEN-LAST:event_AllergoLowSaveButtonActionPerformed

    private void AllergoMiddleSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllergoMiddleSaveButtonActionPerformed
        int[] newAllergoMiddleOptions = new int[8];
        int sum = 0;
        for(int i = 0; i < allergoMiddleTextFields.size(); i++){
            if(!Validator.checkOptionsData(allergoMiddleTextFields.get(i).getText())){
                JOptionPane.showMessageDialog(this, "Введенные данные некорректны!\nВсе ячейки должны быть заполнены числовыми данными.\nЗначения должны лежать в диапазоне от 0 до 101.", "Изменение настроек", JOptionPane.ERROR_MESSAGE);
                clearAllergoMiddleFields();
                optionsTabbedPane.requestFocus();
                return;
            }
            else{
                newAllergoMiddleOptions[i] = Integer.valueOf(allergoMiddleTextFields.get(i).getText());
                sum += newAllergoMiddleOptions[i];
            }
            if(i == allergoMiddleTextFields.size() - 1){
                if(sum != 0){
                    Classifier.setNewAllergoMiddleOptions(newAllergoMiddleOptions);
                    JOptionPane.showMessageDialog(this, "Настройки успешно сохранены!", "Изменение настроек", JOptionPane.INFORMATION_MESSAGE);
                    clearAllergoMiddleFields();
                }
                else{
                    JOptionPane.showMessageDialog(this, "Данные не могут содержать только нулевые значения!", "Изменение настроек", JOptionPane.ERROR_MESSAGE);
                    clearAllergoMiddleFields();
                }
            }
        }
        optionsTabbedPane.requestFocus();
    }//GEN-LAST:event_AllergoMiddleSaveButtonActionPerformed

    private void AllergoHighSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllergoHighSaveButtonActionPerformed
        int[] newAllergoHighOptions = new int[8];
        int sum = 0;
        for(int i = 0; i < allergoHighTextFields.size(); i++){
            if(!Validator.checkOptionsData(allergoHighTextFields.get(i).getText())){
                JOptionPane.showMessageDialog(this, "Введенные данные некорректны!\nВсе ячейки должны быть заполнены числовыми данными.\nЗначения должны лежать в диапазоне от 0 до 101.", "Изменение настроек", JOptionPane.ERROR_MESSAGE);
                clearAllergoHighFields();
                optionsTabbedPane.requestFocus();
                return;
            }
            else{
                newAllergoHighOptions[i] = Integer.valueOf(allergoHighTextFields.get(i).getText());
                sum += newAllergoHighOptions[i];
            }
            if(i == allergoHighTextFields.size() - 1){
                if(sum != 0){
                    Classifier.setNewAllergoHighOptions(newAllergoHighOptions);
                    JOptionPane.showMessageDialog(this, "Настройки успешно сохранены!", "Изменение настроек", JOptionPane.INFORMATION_MESSAGE);
                    clearAllergoHighFields();
                }
                else{
                    JOptionPane.showMessageDialog(this, "Данные не могут содержать только нулевые значения!", "Изменение настроек", JOptionPane.ERROR_MESSAGE);
                    clearAllergoHighFields();
                }
            }
        }
        optionsTabbedPane.requestFocus();
    }//GEN-LAST:event_AllergoHighSaveButtonActionPerformed

    private void MixedLowSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MixedLowSaveButtonActionPerformed
        int[] newMixedLowOptions = new int[8];
        int sum = 0;
        for(int i = 0; i < mixedLowTextFields.size(); i++){
            if(!Validator.checkOptionsData(mixedLowTextFields.get(i).getText())){
                JOptionPane.showMessageDialog(this, "Введенные данные некорректны!\nВсе ячейки должны быть заполнены числовыми данными.\nЗначения должны лежать в диапазоне от 0 до 101.", "Изменение настроек", JOptionPane.ERROR_MESSAGE);
                clearMixedLowFields();
                optionsTabbedPane.requestFocus();
                return;
            }
            else{
                newMixedLowOptions[i] = Integer.valueOf(mixedLowTextFields.get(i).getText());
                sum += newMixedLowOptions[i];
            }
            if(i == mixedLowTextFields.size() - 1){
                if(sum != 0){
                    Classifier.setNewMixedLowOptions(newMixedLowOptions);
                    JOptionPane.showMessageDialog(this, "Настройки успешно сохранены!", "Изменение настроек", JOptionPane.INFORMATION_MESSAGE);
                    clearMixedLowFields();
                }
                else{
                    JOptionPane.showMessageDialog(this, "Данные не могут содержать только нулевые значения!", "Изменение настроек", JOptionPane.ERROR_MESSAGE);
                    clearMixedLowFields();
                }
            }
        }
        optionsTabbedPane.requestFocus();
    }//GEN-LAST:event_MixedLowSaveButtonActionPerformed

    private void MixedIntoksSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MixedIntoksSaveButtonActionPerformed
        int[] newMixedIntoksOptions = new int[8];
        int sum = 0;
        for(int i = 0; i < mixedIntoksTextFields.size(); i++){
            if(!Validator.checkOptionsData(mixedIntoksTextFields.get(i).getText())){
                JOptionPane.showMessageDialog(this, "Введенные данные некорректны!\nВсе ячейки должны быть заполнены числовыми данными.\nЗначения должны лежать в диапазоне от 0 до 101.", "Изменение настроек", JOptionPane.ERROR_MESSAGE);
                clearMixedIntoksFields();
                optionsTabbedPane.requestFocus();
                return;
            }
            else{
                newMixedIntoksOptions[i] = Integer.valueOf(mixedIntoksTextFields.get(i).getText());
                sum += newMixedIntoksOptions[i];
            }
            if(i == mixedIntoksTextFields.size() - 1){
                if(sum != 0){
                    Classifier.setNewMixedIntoksOptions(newMixedIntoksOptions);
                    JOptionPane.showMessageDialog(this, "Настройки успешно сохранены!", "Изменение настроек", JOptionPane.INFORMATION_MESSAGE);
                    clearMixedIntoksFields();
                }
                else{
                    JOptionPane.showMessageDialog(this, "Данные не могут содержать только нулевые значения!", "Изменение настроек", JOptionPane.ERROR_MESSAGE);
                    clearMixedIntoksFields();
                }
            }
        }
        optionsTabbedPane.requestFocus();
    }//GEN-LAST:event_MixedIntoksSaveButtonActionPerformed

    private void MixedAllergoSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MixedAllergoSaveButtonActionPerformed
        int[] newMixedAllergoOptions = new int[8];
        int sum = 0;
        for(int i = 0; i < mixedAllergoTextFields.size(); i++){
            if(!Validator.checkOptionsData(mixedAllergoTextFields.get(i).getText())){
                JOptionPane.showMessageDialog(this, "Введенные данные некорректны!\nВсе ячейки должны быть заполнены числовыми данными.\nЗначения должны лежать в диапазоне от 0 до 101.", "Изменение настроек", JOptionPane.ERROR_MESSAGE);
                clearMixedAllergoFields();
                optionsTabbedPane.requestFocus();
                return;
            }
            else{
                newMixedAllergoOptions[i] = Integer.valueOf(mixedAllergoTextFields.get(i).getText());
                sum += newMixedAllergoOptions[i];
            }
            if(i == mixedAllergoTextFields.size() - 1){
                if(sum != 0){
                    Classifier.setNewMixedAllergoOptions(newMixedAllergoOptions);
                    JOptionPane.showMessageDialog(this, "Настройки успешно сохранены!", "Изменение настроек", JOptionPane.INFORMATION_MESSAGE);
                    clearMixedAllergoFields();
                }
                else{
                    JOptionPane.showMessageDialog(this, "Данные не могут содержать только нулевые значения!", "Изменение настроек", JOptionPane.ERROR_MESSAGE);
                    clearMixedAllergoFields();
                }
            }
        }
        optionsTabbedPane.requestFocus();
    }//GEN-LAST:event_MixedAllergoSaveButtonActionPerformed

    private void NormSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NormSaveButtonActionPerformed
        int[] newNormOptions = new int[8];
        int sum = 0;
        for(int i = 0; i < normTextFields.size(); i++){
            if(!Validator.checkOptionsData(normTextFields.get(i).getText())){
                JOptionPane.showMessageDialog(this, "Введенные данные некорректны!\nВсе ячейки должны быть заполнены числовыми данными.\nЗначения должны лежать в диапазоне от 0 до 101.", "Изменение настроек", JOptionPane.ERROR_MESSAGE);
                clearNormFields();
                optionsTabbedPane.requestFocus();
                return;
            }
            else{
                newNormOptions[i] = Integer.valueOf(normTextFields.get(i).getText());
                sum += newNormOptions[i];
            }
            if(i == normTextFields.size() - 1){
                if(sum != 0){
                    Classifier.setNewNormOptions(newNormOptions);
                    JOptionPane.showMessageDialog(this, "Настройки успешно сохранены!", "Изменение настроек", JOptionPane.INFORMATION_MESSAGE);
                    clearNormFields();
                }
                else{
                    JOptionPane.showMessageDialog(this, "Данные не могут содержать только нулевые значения!", "Изменение настроек", JOptionPane.ERROR_MESSAGE);
                    clearNormFields();
                }
            }
        }
        optionsTabbedPane.requestFocus();
    }//GEN-LAST:event_NormSaveButtonActionPerformed

    private void optionsTabbedPaneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_optionsTabbedPaneKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_F7  & optionsTabbedPane.getSelectedIndex() == 0){
            ArrayList<int[]> options = Classifier.getDefaultOptionsFromFile();
            Classifier.setNewNormOptions(options.get(0));
            JOptionPane.showMessageDialog(ChangeClassifierOptionsForm.this, "Настройки по умолчанию успешно установлены!", "Изменение настроек", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(evt.getKeyCode() == KeyEvent.VK_F7 & optionsTabbedPane.getSelectedIndex() == 1){
            ArrayList<int[]> options = Classifier.getDefaultOptionsFromFile();
            Classifier.setNewIntoksLowOptions(options.get(7));
            Classifier.setNewIntoksMiddleOptions(options.get(8));
            Classifier.setNewIntoksHighOptions(options.get(9));
            JOptionPane.showMessageDialog(ChangeClassifierOptionsForm.this, "Настройки по умолчанию успешно установлены!", "Изменение настроек", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(evt.getKeyCode() == KeyEvent.VK_F7 & optionsTabbedPane.getSelectedIndex() == 2){
            ArrayList<int[]> options = Classifier.getDefaultOptionsFromFile();
            Classifier.setNewKatabLowOptions(options.get(4));
            Classifier.setNewKatabMiddleOptions(options.get(5));
            Classifier.setNewKatabHighOptions(options.get(6));
            JOptionPane.showMessageDialog(ChangeClassifierOptionsForm.this, "Настройки по умолчанию успешно установлены!", "Изменение настроек", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(evt.getKeyCode() == KeyEvent.VK_F7 & optionsTabbedPane.getSelectedIndex() == 3){
            ArrayList<int[]> options = Classifier.getDefaultOptionsFromFile();
            Classifier.setNewAllergoLowOptions(options.get(1));
            Classifier.setNewAllergoMiddleOptions(options.get(2));
            Classifier.setNewAllergoHighOptions(options.get(3));
            JOptionPane.showMessageDialog(ChangeClassifierOptionsForm.this, "Настройки по умолчанию успешно установлены!", "Изменение настроек", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(evt.getKeyCode() == KeyEvent.VK_F7 & optionsTabbedPane.getSelectedIndex() == 4){
            ArrayList<int[]> options = Classifier.getDefaultOptionsFromFile();
            Classifier.setNewMixedLowOptions(options.get(10));
            Classifier.setNewMixedIntoksOptions(options.get(11));
            Classifier.setNewMixedAllergoOptions(options.get(12));
            JOptionPane.showMessageDialog(ChangeClassifierOptionsForm.this, "Настройки по умолчанию успешно установлены!", "Изменение настроек", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_optionsTabbedPaneKeyPressed

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
            java.util.logging.Logger.getLogger(ChangeClassifierOptionsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeClassifierOptionsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeClassifierOptionsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeClassifierOptionsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangeClassifierOptionsForm();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AllergoHighClearButton;
    private javax.swing.JTextField AllergoHighField1;
    private javax.swing.JTextField AllergoHighField2;
    private javax.swing.JTextField AllergoHighField3;
    private javax.swing.JTextField AllergoHighField4;
    private javax.swing.JTextField AllergoHighField5;
    private javax.swing.JTextField AllergoHighField6;
    private javax.swing.JTextField AllergoHighField7;
    private javax.swing.JTextField AllergoHighField8;
    private javax.swing.JPanel AllergoHighPanel;
    private javax.swing.JButton AllergoHighSaveButton;
    private javax.swing.JLabel AllergoLabel;
    private javax.swing.JButton AllergoLowClearButton;
    private javax.swing.JTextField AllergoLowField1;
    private javax.swing.JTextField AllergoLowField2;
    private javax.swing.JTextField AllergoLowField3;
    private javax.swing.JTextField AllergoLowField4;
    private javax.swing.JTextField AllergoLowField5;
    private javax.swing.JTextField AllergoLowField6;
    private javax.swing.JTextField AllergoLowField7;
    private javax.swing.JTextField AllergoLowField8;
    private javax.swing.JPanel AllergoLowPanel;
    private javax.swing.JButton AllergoLowSaveButton;
    private javax.swing.JButton AllergoMiddleClearButton;
    private javax.swing.JTextField AllergoMiddleField1;
    private javax.swing.JTextField AllergoMiddleField2;
    private javax.swing.JTextField AllergoMiddleField3;
    private javax.swing.JTextField AllergoMiddleField4;
    private javax.swing.JTextField AllergoMiddleField5;
    private javax.swing.JTextField AllergoMiddleField6;
    private javax.swing.JTextField AllergoMiddleField7;
    private javax.swing.JTextField AllergoMiddleField8;
    private javax.swing.JPanel AllergoMiddlePanel;
    private javax.swing.JButton AllergoMiddleSaveButton;
    private javax.swing.JPanel AllergoPanel;
    private javax.swing.JLabel IntoksDefaultLabel;
    private javax.swing.JButton IntoksHighClearButton;
    private javax.swing.JTextField IntoksHighField1;
    private javax.swing.JTextField IntoksHighField2;
    private javax.swing.JTextField IntoksHighField3;
    private javax.swing.JTextField IntoksHighField4;
    private javax.swing.JTextField IntoksHighField5;
    private javax.swing.JTextField IntoksHighField6;
    private javax.swing.JTextField IntoksHighField7;
    private javax.swing.JTextField IntoksHighField8;
    private javax.swing.JPanel IntoksHighPanel;
    private javax.swing.JButton IntoksHighSaveButton;
    private javax.swing.JLabel IntoksLabel;
    private javax.swing.JButton IntoksLowClearButton;
    private javax.swing.JTextField IntoksLowField1;
    private javax.swing.JTextField IntoksLowField2;
    private javax.swing.JTextField IntoksLowField3;
    private javax.swing.JTextField IntoksLowField4;
    private javax.swing.JTextField IntoksLowField5;
    private javax.swing.JTextField IntoksLowField6;
    private javax.swing.JTextField IntoksLowField7;
    private javax.swing.JTextField IntoksLowField8;
    private javax.swing.JPanel IntoksLowPanel;
    private javax.swing.JButton IntoksLowSaveButton;
    private javax.swing.JButton IntoksMiddleClearButton;
    private javax.swing.JTextField IntoksMiddleField1;
    private javax.swing.JTextField IntoksMiddleField2;
    private javax.swing.JTextField IntoksMiddleField3;
    private javax.swing.JTextField IntoksMiddleField4;
    private javax.swing.JTextField IntoksMiddleField5;
    private javax.swing.JTextField IntoksMiddleField6;
    private javax.swing.JTextField IntoksMiddleField7;
    private javax.swing.JTextField IntoksMiddleField8;
    private javax.swing.JPanel IntoksMiddlePanel;
    private javax.swing.JButton IntoksMiddleSaveButton;
    private javax.swing.JPanel IntoksPanel;
    private javax.swing.JButton KatabHighClearButton;
    private javax.swing.JTextField KatabHighField1;
    private javax.swing.JTextField KatabHighField2;
    private javax.swing.JTextField KatabHighField3;
    private javax.swing.JTextField KatabHighField4;
    private javax.swing.JTextField KatabHighField5;
    private javax.swing.JTextField KatabHighField6;
    private javax.swing.JTextField KatabHighField7;
    private javax.swing.JTextField KatabHighField8;
    private javax.swing.JPanel KatabHighPanel;
    private javax.swing.JButton KatabHighSaveButton;
    private javax.swing.JLabel KatabLabel;
    private javax.swing.JButton KatabLowClearButton;
    private javax.swing.JTextField KatabLowField1;
    private javax.swing.JTextField KatabLowField2;
    private javax.swing.JTextField KatabLowField3;
    private javax.swing.JTextField KatabLowField4;
    private javax.swing.JTextField KatabLowField5;
    private javax.swing.JTextField KatabLowField6;
    private javax.swing.JTextField KatabLowField7;
    private javax.swing.JTextField KatabLowField8;
    private javax.swing.JPanel KatabLowPanel;
    private javax.swing.JButton KatabLowSaveButton;
    private javax.swing.JButton KatabMiddleClearButton;
    private javax.swing.JTextField KatabMiddleField1;
    private javax.swing.JTextField KatabMiddleField2;
    private javax.swing.JTextField KatabMiddleField3;
    private javax.swing.JTextField KatabMiddleField4;
    private javax.swing.JTextField KatabMiddleField5;
    private javax.swing.JTextField KatabMiddleField6;
    private javax.swing.JTextField KatabMiddleField7;
    private javax.swing.JTextField KatabMiddleField8;
    private javax.swing.JPanel KatabMiddlePanel;
    private javax.swing.JButton KatabMiddleSaveButton;
    private javax.swing.JPanel KatabPanel;
    private javax.swing.JButton MixedAllergoClearButton;
    private javax.swing.JTextField MixedAllergoField1;
    private javax.swing.JTextField MixedAllergoField2;
    private javax.swing.JTextField MixedAllergoField3;
    private javax.swing.JTextField MixedAllergoField4;
    private javax.swing.JTextField MixedAllergoField5;
    private javax.swing.JTextField MixedAllergoField6;
    private javax.swing.JTextField MixedAllergoField7;
    private javax.swing.JTextField MixedAllergoField8;
    private javax.swing.JPanel MixedAllergoPanel;
    private javax.swing.JButton MixedAllergoSaveButton;
    private javax.swing.JButton MixedIntoksClearButton;
    private javax.swing.JTextField MixedIntoksField1;
    private javax.swing.JTextField MixedIntoksField2;
    private javax.swing.JTextField MixedIntoksField3;
    private javax.swing.JTextField MixedIntoksField4;
    private javax.swing.JTextField MixedIntoksField5;
    private javax.swing.JTextField MixedIntoksField6;
    private javax.swing.JTextField MixedIntoksField7;
    private javax.swing.JTextField MixedIntoksField8;
    private javax.swing.JPanel MixedIntoksPanel;
    private javax.swing.JButton MixedIntoksSaveButton;
    private javax.swing.JLabel MixedLabel;
    private javax.swing.JButton MixedLowClearButton;
    private javax.swing.JTextField MixedLowField1;
    private javax.swing.JTextField MixedLowField2;
    private javax.swing.JTextField MixedLowField3;
    private javax.swing.JTextField MixedLowField4;
    private javax.swing.JTextField MixedLowField5;
    private javax.swing.JTextField MixedLowField6;
    private javax.swing.JTextField MixedLowField7;
    private javax.swing.JTextField MixedLowField8;
    private javax.swing.JPanel MixedLowPanel;
    private javax.swing.JButton MixedLowSaveButton;
    private javax.swing.JPanel MixedPanel;
    private javax.swing.JButton NormClearButton;
    private javax.swing.JLabel NormDefaultLabel;
    private javax.swing.JTextField NormField1;
    private javax.swing.JTextField NormField2;
    private javax.swing.JTextField NormField3;
    private javax.swing.JTextField NormField4;
    private javax.swing.JTextField NormField5;
    private javax.swing.JTextField NormField6;
    private javax.swing.JTextField NormField7;
    private javax.swing.JTextField NormField8;
    private javax.swing.JPanel NormInnerPanel;
    private javax.swing.JPanel NormPanel;
    private javax.swing.JButton NormSaveButton;
    private javax.swing.JLabel allergoDefaultLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel katabDefaultLabel;
    private javax.swing.JTabbedPane optionsTabbedPane;
    // End of variables declaration//GEN-END:variables
}
