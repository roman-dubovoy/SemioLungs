package Diaspectrex_part.views;

import Diaspectrex_part.util.StatisticsTableModel;
import java.awt.Point;
import java.awt.event.MouseEvent;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class StatisticsForm extends javax.swing.JFrame {

    public StatisticsForm() {
        initComponents();
        centerValuesInTable();
        this.setLocationRelativeTo(null);
        this.setVisible(true);       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        statisticsPanel = new javax.swing.JPanel();
        statisticsScrollPane = new javax.swing.JScrollPane();
        statisticsTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Статистика");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                onClosed(evt);
            }
        });

        statisticsTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        statisticsTable.setModel(new StatisticsTableModel());
        statisticsTable.setEnabled(false);
        statisticsTable.setName(""); // NOI18N
        statisticsTable.setRowHeight(25);
        statisticsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEnteredOnTable(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExitedFromTable(evt);
            }
        });
        statisticsScrollPane.setViewportView(statisticsTable);
        if (statisticsTable.getColumnModel().getColumnCount() > 0) {
            statisticsTable.getColumnModel().getColumn(0).setResizable(false);
            statisticsTable.getColumnModel().getColumn(0).setPreferredWidth(67);
            statisticsTable.getColumnModel().getColumn(1).setResizable(false);
            statisticsTable.getColumnModel().getColumn(1).setPreferredWidth(20);
            statisticsTable.getColumnModel().getColumn(2).setResizable(false);
            statisticsTable.getColumnModel().getColumn(2).setPreferredWidth(37);
            statisticsTable.getColumnModel().getColumn(3).setResizable(false);
            statisticsTable.getColumnModel().getColumn(3).setPreferredWidth(40);
            statisticsTable.getColumnModel().getColumn(4).setResizable(false);
            statisticsTable.getColumnModel().getColumn(4).setPreferredWidth(20);
        }

        javax.swing.GroupLayout statisticsPanelLayout = new javax.swing.GroupLayout(statisticsPanel);
        statisticsPanel.setLayout(statisticsPanelLayout);
        statisticsPanelLayout.setHorizontalGroup(
            statisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(statisticsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 884, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        statisticsPanelLayout.setVerticalGroup(
            statisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(statisticsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(statisticsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(statisticsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_onClosed
       StatisticsForm.this.setVisible(false);
       MainMenuForm.main(null);
    }//GEN-LAST:event_onClosed

    private void centerValuesInTable(){
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        statisticsTable.setDefaultRenderer(Object.class, centerRenderer);
        // Располагает текст внутри заголовка таблицы по центру
        //JTableHeader statisticsHeader = statisticsTable.getTableHeader();
        //statisticsHeader.setDefaultRenderer(centerRenderer);
    }
    
    private void mouseEnteredOnTable(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseEnteredOnTable
        statisticsTable.setToolTipText(getTip(statisticsTable, evt));
    }//GEN-LAST:event_mouseEnteredOnTable

    private void mouseExitedFromTable(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseExitedFromTable
        statisticsTable.setToolTipText(getTip(statisticsTable, evt));
    }//GEN-LAST:event_mouseExitedFromTable
    
    private String getTip(JTable table, MouseEvent evt) {
        String tip = null;
        Point p = evt.getPoint();
        int rowIndex = table.rowAtPoint(p);
        int colIndex = table.columnAtPoint(p);
        int realRowIndex = table.convertRowIndexToModel(rowIndex);
        int realColumnIndex = table.convertColumnIndexToModel(colIndex);

        if (realRowIndex == 5 & realColumnIndex == 1) {
            tip = "Смешанный. Начальный вариант";
        }
        if (realRowIndex == 5 & realColumnIndex == 2) {
            tip = "Смешанный. Интоксикационно-катаболически-подобный";
        }
        if (realRowIndex == 5 & realColumnIndex == 3) {
            tip = "Смешанный. Аллерго-аутоиммунно-катаболически-подобный";
        }
        return tip;
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StatisticsForm();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel statisticsPanel;
    private javax.swing.JScrollPane statisticsScrollPane;
    private javax.swing.JTable statisticsTable;
    // End of variables declaration//GEN-END:variables
}
