package Diaspectrex_part.views;

import Diaspectrex_part.util.Classifier;
import Diaspectrex_part.util.DBWorker;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.*;

public class MainMenuForm extends JFrame{
    
    public static DBWorker dataBaseWorker = new DBWorker();
    
    static{
        Classifier.getCurrentOptionsFromFile();
    }
    
    public MainMenuForm(){
        initWindow();
    }
    
    public void initWindow(){
        this.setTitle("SemioLungs");
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setSize(new Dimension(305,305));
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(new BorderLayout());
        JPanel functions = new JPanel();
        functions.setBackground(new Color(240,240,240));
        functions.setLayout(new GridBagLayout());
        
       JLabel registration = new JLabel("Регистрация");
       registration.setFont(new Font("Buxton Sketch", Font.PLAIN, 16));
       registration.setIcon(new ImageIcon(getClass().getResource("/Diaspectrex_part/resources/img/registration_90x90_grey.jpg")));
       registration.setHorizontalTextPosition(JLabel.CENTER);
       registration.setVerticalTextPosition(JLabel.BOTTOM);
       
       registration.addMouseListener(new MouseListener(){
            
            @Override
            public void mousePressed(MouseEvent e){
                MainMenuForm.this.setVisible(false);
                RegistrationForm.main(null);
            }
            
            @Override
            public void mouseReleased(MouseEvent e){}
            @Override
            public void mouseEntered(MouseEvent e){
                registration.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
            }
            @Override
            public void mouseExited(MouseEvent e){
                registration.setBorder(BorderFactory.createLineBorder(new Color(240,240,240)));
            }
            @Override
            public void mouseClicked(MouseEvent e){}
       });
       
       JLabel medicalData = new JLabel("Мед. данные");
       medicalData.setFont(new Font("Buxton Sketch", Font.PLAIN, 16));
       medicalData.setIcon(new ImageIcon(getClass().getResource("/Diaspectrex_part/resources/img/medical_data_90x90_grey.jpg")));
       medicalData.setHorizontalTextPosition(JLabel.CENTER);
       medicalData.setVerticalTextPosition(JLabel.BOTTOM);             
       
       medicalData.addMouseListener(new MouseListener(){
            @Override
            public void mousePressed(MouseEvent e){
                if(RegistrationForm.patientCard != null){
                    if(RegistrationForm.patientCard.getArrayOfMedicalData() != null){
                        Object[] options = {"Да", "Нет"};
                        int result = JOptionPane.showOptionDialog(null, "Карта данного пациента содержит мед.данные!\n Желаете изменить существующие данные?", "Ввод мед.данных",
                                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, null);
                        if(result == JOptionPane.YES_OPTION){
                            new ChoiceDialog(MainMenuForm.this).setLocationRelativeTo(null);
                        }
                    }
                    else{
                        new ChoiceDialog(MainMenuForm.this).setLocationRelativeTo(null);
                    }
                }
                else{
                    Object[] options = {"Регистрация", "Поиск"};
                    int result = JOptionPane.showOptionDialog(MainMenuForm.this, "Не выбрана карта пациента!\nВыбирите действие для продолжения работы:", "Мед. данные", 
                            JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE, null, options, null);
                    if(result == JOptionPane.YES_OPTION){
                        MainMenuForm.this.setVisible(false);
                        RegistrationForm.main(null);
                    }
                    if(result == JOptionPane.NO_OPTION){
                        MainMenuForm.this.setVisible(false);
                        SearchForm.main(null);
                    }
                }
            }
            @Override
            public void mouseReleased(MouseEvent e){}
            @Override
            public void mouseEntered(MouseEvent e){
                medicalData.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
            }
            @Override
            public void mouseExited(MouseEvent e){
                medicalData.setBorder(BorderFactory.createLineBorder(new Color(240,240,240)));
            }
            @Override
            public void mouseClicked(MouseEvent e){}
       });
       
       JLabel classification = new JLabel("Классификация");
       classification.setFont(new Font("Buxton Sketch", Font.PLAIN, 16));
       classification.setIcon(new ImageIcon(getClass().getResource("/Diaspectrex_part/resources/img/classification_90x90_grey.jpg")));
       classification.setHorizontalTextPosition(JLabel.CENTER);
       classification.setVerticalTextPosition(JLabel.BOTTOM);
       classification.addMouseListener(new MouseListener(){
            @Override
            public void mousePressed(MouseEvent e){
                if(RegistrationForm.patientCard != null){
                    if(RegistrationForm.patientCard.getArrayOfMedicalData() == null){
                        Object[] options = {"Да", "Нет"};
                        int result = JOptionPane.showOptionDialog(null, "Медицинские данные пациента отсутствуют!\n Желаете продолжить работу и ввести мед. данные?", "Классификация",
                        JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE, null, options, null);

                        if (result == JOptionPane.YES_OPTION) {
                            new ChoiceDialog(MainMenuForm.this).setLocationRelativeTo(null);
                        }
                        if (result == JOptionPane.NO_OPTION) {
                        }
                    }
                    else{
                        MainMenuForm.this.setVisible(false);
                        ClassificationFrom.main(null);
                    }
                }
                else{
                    Object[] options = {"Регистрация", "Поиск"};
                    int result = JOptionPane.showOptionDialog(MainMenuForm.this, "Не выбрана карта пациента!\nВыбирите действие для продолжения работы:", "Классификация", 
                            JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE, null, options, null);
                    if(result == JOptionPane.YES_OPTION){
                        MainMenuForm.this.setVisible(false);
                        RegistrationForm.main(null);
                    }
                    if(result == JOptionPane.NO_OPTION){
                        MainMenuForm.this.setVisible(false);
                        SearchForm.main(null);
                    }
                }
            }
            @Override
            public void mouseReleased(MouseEvent e){}
            @Override
            public void mouseEntered(MouseEvent e){
                classification.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
            }
            @Override
            public void mouseExited(MouseEvent e){
                classification.setBorder(BorderFactory.createLineBorder(new Color(240,240,240)));
            }
            @Override
            public void mouseClicked(MouseEvent e){}
       });
       
       JLabel statistics = new JLabel("Статистика");
       statistics.setFont(new Font("Buxton Sketch", Font.PLAIN, 16));
       statistics.setIcon(new ImageIcon(getClass().getResource("/Diaspectrex_part/resources/img/statistics_90x90_grey.jpg")));
       statistics.setHorizontalTextPosition(JLabel.CENTER);
       statistics.setVerticalTextPosition(JLabel.BOTTOM);
       statistics.addMouseListener(new MouseListener(){
            @Override
            public void mousePressed(MouseEvent e){
                MainMenuForm.this.setVisible(false);
                StatisticsForm.main(null);
            }
            @Override
            public void mouseReleased(MouseEvent e){}
            @Override
            public void mouseEntered(MouseEvent e){
                statistics.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
            }
            @Override
            public void mouseExited(MouseEvent e){
                statistics.setBorder(BorderFactory.createLineBorder(new Color(240,240,240)));
            }
            @Override
            public void mouseClicked(MouseEvent e){}
       });
       
       JLabel authorization = new JLabel("Картотека");
       authorization.setFont(new Font("Buxton Sketch", Font.PLAIN, 16));
       authorization.setIcon(new ImageIcon(getClass().getResource("/Diaspectrex_part/resources/img/search_90x90_grey.jpg")));
       authorization.setHorizontalTextPosition(JLabel.CENTER);
       authorization.setVerticalTextPosition(JLabel.BOTTOM);
       authorization.addMouseListener(new MouseListener(){
            @Override
            public void mousePressed(MouseEvent e){
                MainMenuForm.this.setVisible(false);
                SearchForm.main(null);
            }
            @Override
            public void mouseReleased(MouseEvent e){}
            @Override
            public void mouseEntered(MouseEvent e){
                authorization.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
            }
            @Override
            public void mouseExited(MouseEvent e){
                authorization.setBorder(BorderFactory.createLineBorder(new Color(240,240,240)));
            }
            @Override
            public void mouseClicked(MouseEvent e){}
       });
       
       JLabel settings = new JLabel("Настройки");
       settings.setFont(new Font("Buxton Sketch", Font.PLAIN, 16));
       settings.setIcon(new ImageIcon(getClass().getResource("/Diaspectrex_part/resources/img/settings_90x90_grey.jpg")));
       settings.setHorizontalTextPosition(JLabel.CENTER);
       settings.setVerticalTextPosition(JLabel.BOTTOM);
       settings.addMouseListener(new MouseListener(){
            @Override
            public void mousePressed(MouseEvent e){
                MainMenuForm.this.setVisible(false);
                ChangeClassifierOptionsForm.main(null);
            }
            @Override
            public void mouseReleased(MouseEvent e){}
            @Override
            public void mouseEntered(MouseEvent e){
                settings.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
            }
            @Override
            public void mouseExited(MouseEvent e){
                settings.setBorder(BorderFactory.createLineBorder(new Color(240,240,240)));
            }
            @Override
            public void mouseClicked(MouseEvent e){}
       });

       functions.add(registration, new GridBagConstraints(0, 0, 1, 1, 0, 0, 
               GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(3,3,3,3), 0, 0));
       
       functions.add(medicalData, new GridBagConstraints(1, 0, 1, 1, 0, 0, 
               GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(3,3,3,3), 0, 0));
       
       functions.add(classification, new GridBagConstraints(2, 0, 1, 1, 0, 0, 
               GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(3,3,3,3), 0, 0));
       
       functions.add(statistics, new GridBagConstraints(0, 1, 1, 1, 0, 0, 
               GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(3,3,3,3), 0, 0));
       
       functions.add(authorization, new GridBagConstraints(1, 1, 1, 1, 0, 0, 
               GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(3,3,3,3), 0, 0));
       
       functions.add(settings, new GridBagConstraints(2, 1, 1, 1, 0, 0, 
               GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(3,3,3,3), 0, 0));
       
       JMenu menu = new JMenu("Нажмите F11 для справки");
       menu.setFont(new Font("Buxton Sketch", Font.PLAIN, 16));
       JMenuBar menuBar = new JMenuBar();
       menuBar.add(menu);
       this.add(menuBar, BorderLayout.NORTH);
       
        this.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {}
            @Override
            public void windowClosing(WindowEvent e) {
                Object[] options = {"Да", "Нет"};                
                int result = JOptionPane.showOptionDialog(MainMenuForm.this, "Завершить работу?", "АИС DiaSpectrex", 
                JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, null, options, null);
                if (result == JOptionPane.YES_OPTION){
                    MainMenuForm.dataBaseWorker.closeConnection();
                    Classifier.saveNewOptionsIntoFile();
                    e.getWindow().setVisible(false);
                    System.exit(0);
                }
            }
            @Override
            public void windowClosed(WindowEvent e) {}
            @Override
            public void windowIconified(WindowEvent e) {}
            @Override
            public void windowDeiconified(WindowEvent e) {}
            @Override
            public void windowActivated(WindowEvent e) {}
            @Override
            public void windowDeactivated(WindowEvent e) {
            }
        });
        
        this.addKeyListener(new KeyListener(){

            @Override
            public void keyTyped(KeyEvent ke) {}

            @Override
            public void keyPressed(KeyEvent ke) {
                if(ke.getKeyCode() == KeyEvent.VK_F11){
                    MainMenuForm.this.setVisible(false);
                    HelpForm.main(null);
                }
            }

            @Override
            public void keyReleased(KeyEvent ke) {}
        });
        
       
       this.add(functions, BorderLayout.SOUTH);
       //this.pack();
       this.setVisible(true);
    }
    
    public static void main(String args[]) {
        
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
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenuForm();
            }
        });
    }
}
