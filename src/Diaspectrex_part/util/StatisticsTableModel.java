package Diaspectrex_part.util;

import Diaspectrex_part.views.MainMenuForm;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import javax.swing.table.AbstractTableModel;

public class StatisticsTableModel extends AbstractTableModel {
    
    private final int columnCount = 5;
    ArrayList<String []> dataArrayList;
    
    public StatisticsTableModel(){
        dataArrayList = new ArrayList<>();
        dataArrayList.add(new String[]{"Нормологический", "0", "0", "0", "0"});
        dataArrayList.add(new String[]{"Интоксикационно-подобный", "0", "0", "0", "0"});
        dataArrayList.add(new String[]{"Катаболически-подобный", "0", "0", "0", "0"});
        dataArrayList.add(new String[]{"Аллерго-аутоимунно-подобный", "0", "0", "0", "0"});
        dataArrayList.add(new String[]{"Смешанный", "0", "0", "0", "0"});
        dataArrayList.add(new String[]{"Не распознано", "0", "0", "0", "0"});
        addStatistics(MainMenuForm.dataBaseWorker.countStatistics());
    }
    
    private void addStatistics(HashMap<String, Integer> diagnosisAndAmout){
        Integer allSum = 0;
        for(Entry<String, Integer> diagnosisAndAmountSet: diagnosisAndAmout.entrySet()){
            String diagnosisAndPower = diagnosisAndAmountSet.getKey();
            String[] tableRow;
            if(diagnosisAndPower.equals("Нормологический")){
                tableRow = getRow(diagnosisAndPower);
                tableRow[4] = diagnosisAndAmountSet.getValue().toString();
            }
            else if(diagnosisAndPower.equals("Не распознано")){
                tableRow = getRow(diagnosisAndPower);
                tableRow[4] = diagnosisAndAmountSet.getValue().toString();
            }
            else{
                String[] diagnosisAndPowerSeparately = diagnosisAndPower.split(" ");
                tableRow = getRow(diagnosisAndPowerSeparately[0]);
                if(tableRow != null){ 
                    if(diagnosisAndPowerSeparately[1].equals("начальная") ||
                            diagnosisAndPowerSeparately[1].equals("начальный")){
                        tableRow[1] = diagnosisAndAmountSet.getValue().toString();
                    }
                    if(diagnosisAndPowerSeparately[1].equals("умеренная") ||
                            diagnosisAndPowerSeparately[1].equals("интоксикационно-катаболически-подобный")){
                        tableRow[2] = diagnosisAndAmountSet.getValue().toString(); 
                    }
                    if(diagnosisAndPowerSeparately[1].equals("выраженная") ||
                            diagnosisAndPowerSeparately[1].equals("аллерго-аутоиммунно-катаболически-подобный")){
                        tableRow[3] = diagnosisAndAmountSet.getValue().toString();
                    }
                }   
            }
            allSum += diagnosisAndAmountSet.getValue();
        }
        dataArrayList.add(new String[]{"Всего", "", "", "", allSum.toString()});
    }
    
    private String[] getRow(String type){
        for(String[] tableRow: dataArrayList){
            if(type.equals(tableRow[0])){
                return tableRow;
            }
        }
        return null;
    }
    
    
    
    @Override
    public int getRowCount() {
        return dataArrayList.size();
    }

    @Override
    public int getColumnCount() {
        return columnCount;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if((!dataArrayList.get(rowIndex)[0].equals("Нормологический") &
            !dataArrayList.get(rowIndex)[0].equals("Не распознано") & 
            !dataArrayList.get(rowIndex)[0].equals("Всего")) & columnIndex == 4){
            Integer sumForDiagnosis = 0;
            for(int i = 1; i < 4; i++){
                sumForDiagnosis += Integer.parseInt(dataArrayList.get(rowIndex)[i]);
            }
            return sumForDiagnosis.toString();
        }
        return dataArrayList.get(rowIndex)[columnIndex];
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch(columnIndex){
            case 0: return "Тип семиотического сдвига";
            case 1: return "Начальная степень";
            case 2: return "Умеренная степень";
            case 3: return "Выраженная степень";
            case 4: return "Итого";
        }
        return "Нет такого столбца";
    }
    
    public void addPatientCard(String[] row){
        String[] patientCard = new String[getColumnCount()];
        if (row.length != patientCard.length){
            System.err.println("Длинна строки не совпадает с ожидаемой");
        }
        else {
            dataArrayList.add(row);
        }
    }
}
