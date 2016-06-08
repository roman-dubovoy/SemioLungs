package Diaspectrex_part.views;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class ChoiceDialog extends JDialog{
        
    public ChoiceDialog(Component parent){
        initDialog(parent);
    }
    
    void initDialog(Component parent){
        this.setTitle("Выбор");
        this.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
        this.setLayout(new GridBagLayout());
        this.setSize(new Dimension(200,100));
        
        JLabel choiceLabel = new JLabel("Выберите способ ввода:");
        choiceLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        choiceLabel.setHorizontalTextPosition(JLabel.CENTER);
        choiceLabel.setVerticalTextPosition(JLabel.BOTTOM);
        
        JButton fromFileButton = new JButton();
        fromFileButton.setText("Из файла");
        fromFileButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
        fromFileButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                ChoiceDialog.this.setVisible(false);
                parent.setVisible(false);
                OpenFileForm.main(null);
            }
        });
        
        JButton manualButton = new JButton();
        manualButton.setText("Вручную");
        manualButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
        manualButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                ChoiceDialog.this.setVisible(false);
                parent.setVisible(false);
                MedicalDataForm.main(null);
            }
        });
        
        this.add(choiceLabel, new GridBagConstraints(0, 0, 2, 1, 0, 0, 
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(3,3,3,3), 0, 0));
        this.add(fromFileButton, new GridBagConstraints(0, 1, 1, 1, 0, 0, 
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(3,3,3,3), 0, 0));
        this.add(manualButton, new GridBagConstraints(1, 1, 1, 1, 0, 0, 
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(3,3,3,3), 0, 0));
        
        this.setVisible(true);
    }
}
