package Diaspectrex_part.util;

import com.mysql.fabric.jdbc.FabricMySQLDriver;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class DBWorker {
    //Переменные для соединения с БД
    private static final String HOST = "jdbc:mysql://localhost:3306/";
    private static final String HOST_AND_DB = "jdbc:mysql://localhost:3306/diaspectrex?autoReconnect=false&useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    
    //Queries
    private static final String CREATE_DB = "CREATE DATABASE IF NOT EXISTS diaspectrex";
    //Работа с таблицей patients_cards
    private static final String CREATE_PATIENTS_TABLE = "CREATE TABLE patients_cards (patientCardCode VARCHAR(20) NOT NULL UNIQUE,Surname VARCHAR(75) NOT NULL,Name VARCHAR(75) NOT NULL,SecondName VARCHAR(75) NULL,yearOfBirth INT UNSIGNED NULL,PRIMARY KEY (code)) ENGINE = InnoDB DEFAULT CHARACTER SET = utf8;";
    private static final String INSERT_INTO_PATIENTS_CARDS = "INSERT INTO patients_cards (patientCardCode, Surname, Name, SecondName, yearOfBirth) VALUES(?,?,?,?,?)";
    private static final String UPDATE_PATIENTS_CARDS = "UPDATE patients_cards SET diagnosis = ?, comment = ? where patientCardCode = ?";
    private static final String CHECK_PATIENT_CARDS_BY_CODE = "SELECT patientCardCode FROM patients_cards";
    private static final String SEARCH_PATIENT_CARDS_BY_SURNAME = "SELECT * FROM patients_cards WHERE Surname = ?";
    private static final String DELETE_PATIENT_CARD_BY_CODE = "DELETE FROM patients_cards WHERE patientCardCode = ?";
    
    //patientCardCode and 32 cells of data
    private static final String CREATE_PATIENTS_MEDICAL_DATA_TABLE = "CREATE TABLE patients_medical_data (patientCardCode VARCHAR(20) NOT NULL UNIQUE PRIMARY KEY, cell1 FLOAT DEFAULT '0', cell2 FLOAT DEFAULT '0', cell3 FLOAT DEFAULT '0', cell4 FLOAT DEFAULT '0', cell5 FLOAT DEFAULT '0', cell6 FLOAT DEFAULT '0', cell7 FLOAT DEFAULT '0', cell8 FLOAT DEFAULT '0', cell9 FLOAT DEFAULT '0', cell10 FLOAT DEFAULT '0', cell11 FLOAT DEFAULT '0', cell12 FLOAT DEFAULT '0', cell13 FLOAT DEFAULT '0', cell14 FLOAT DEFAULT '0', cell15 FLOAT DEFAULT '0', cell16 FLOAT DEFAULT '0', cell17 FLOAT DEFAULT '0', cell18 FLOAT DEFAULT '0', cell19 FLOAT DEFAULT '0', cell20 FLOAT DEFAULT '0', cell21 FLOAT DEFAULT '0', cell22 FLOAT DEFAULT '0', cell23 FLOAT DEFAULT '0', cell24 FLOAT DEFAULT '0', cell25 FLOAT DEFAULT '0', cell26 FLOAT DEFAULT '0', cell27 FLOAT DEFAULT '0', cell28 FLOAT DEFAULT '0', cell29 FLOAT DEFAULT '0', cell30 FLOAT DEFAULT '0', cell31 FLOAT DEFAULT '0', cell32 FLOAT DEFAULT '0', FOREIGN KEY(patientCardCode) REFERENCES patients_cards) ENGINE = InnoDB DEFAULT CHARACTER SET = utf8;";
    private static final String INSERT_INTO_PATIENTS_MEDICAL_DATA = "INSERT INTO patients_medical_data VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    private static final String GET_MEDICAL_DATA_BY_CODE = "SELECT * FROM patients_medical_data WHERE patientCardCode = ?";
    private static final String UPDATE_MEDICAL_DATA = "UPDATE patients_medical_data SET cell1 = ?, cell2 = ?, cell3 = ?, cell4 = ?,  cell5 = ?, cell6 = ?, cell7 = ?, cell8 = ?, cell9 = ?, cell10 = ?, cell11 = ?, cell12 = ?, cell13 = ?, cell14 = ?, cell15 = ?, cell16 = ?, cell17 = ?, cell18 = ?, cell19 = ?, cell20 = ?,  cell21 = ?, cell22 = ?, cell23 = ?, cell24 = ?, cell25 = ?, cell26 = ?, cell27 = ?, cell28 = ?, cell29 = ?, cell30 = ?, cell31 = ?, cell32 = ? WHERE patientCardCode = ?";
    
    private static final String COUNT_STATISTICS = "SELECT diagnosis, COUNT(*) amount FROM patients_cards WHERE diagnosis IS NOT NULL GROUP BY diagnosis";
    
    //Connection
    private Connection connection;

    public DBWorker() {
        try {
            Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(HOST_AND_DB,USERNAME,PASSWORD);
            connection = DriverManager.getConnection(HOST,USERNAME,PASSWORD);
            if(!isDatabaseCreated()){
                Statement createDB = connection.createStatement();
                createDB.execute(CREATE_DB);
                System.out.println("Database was created.");
            }
            else{
                System.out.println("Database already exists.");
                if(!isTableCreated("patients_cards")){
                    createTable("patients_cards");
                }
                else{
                    System.out.println("Table \"patientsCards\" already exists.");
                }
                if(!isTableCreated("patients_medical_data")){
                    createTable("patients_medical_data");
                }
                else{
                    System.out.println("Table \"patientsMedicalData\" already exists.");
                }
                openConnection();
            }
        }catch (SQLException e){
            System.err.println("Connection failed!");
        }
    }
    
    public void openConnection(){
        try{
        StringBuilder URL = new StringBuilder();
        URL.append(HOST);
        URL.append("diaspectrex");
        URL.append("?autoReconnect=false&useSSL=false"); 
        connection = DriverManager.getConnection(URL.toString(),USERNAME,PASSWORD);
        } catch(SQLException e){
            System.err.println("Ошибка подключения к БД diaspectrex: DBWorker.openConnection()");
        }
    }
    
    public Connection getConnection() {
        return connection;
    }
    
    public void closeConnection(){
        try{
        connection.close();
        } catch(SQLException e){
            System.err.println("Error of closing connection!");
            e.printStackTrace();
        }
    }
    
    public void createTable(String name){
        StringBuilder URL = new StringBuilder();
        URL.append(HOST);
        URL.append("diaspectrex");
        URL.append("?autoReconnect=false&useSSL=false");  
        try {         
            connection = DriverManager.getConnection(URL.toString(),USERNAME,PASSWORD);
            Statement createTable = connection.createStatement();
            if(name.equals("patinets")){
                createTable.execute(CREATE_PATIENTS_TABLE);
                System.out.println("Table \"patientsCards\" was created.");
            }
            if(name.equals("patients_medical_data")){
                createTable.execute(CREATE_PATIENTS_MEDICAL_DATA_TABLE);
                System.out.println("Table \"patientsMedicalData\" was created.");
            }
        } catch (SQLException e) {
            System.err.println("Error of creating patients schema.");
            e.printStackTrace();
        }
    }    
    
    private boolean isDatabaseCreated(){
        try{
            Statement showDatabases = connection.createStatement(); 
            ResultSet databases = showDatabases.executeQuery("SHOW DATABASES");
            while(databases.next()){
                if (databases.getString("DATABASE").equals("diaspectrex")){
                    return true;
                }
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }
    
    private boolean isTableCreated(String tableName){
        try{
            DatabaseMetaData dbmeta = connection.getMetaData();
            //getTables(String catalog, String schemaPattern, String tableNamePattern, String[] types)
            ResultSet tables = dbmeta.getTables("diaspectrex", "", "%", null);
            while(tables.next()){
                if (tables.getString("table_name").equals(tableName)){
                    return true;
                }
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }
    
    public void addPatientCard(PatientCard patientCard){
        try{
            PreparedStatement insertIntoPatientsCards = connection.prepareStatement(INSERT_INTO_PATIENTS_CARDS);
            insertIntoPatientsCards.setString(1, patientCard.getCode());
            insertIntoPatientsCards.setString(2, patientCard.getSurname());
            insertIntoPatientsCards.setString(3, patientCard.getName());
            insertIntoPatientsCards.setString(4, patientCard.getSecondName());
            insertIntoPatientsCards.setInt(5, patientCard.getYearOfBirth());
            insertIntoPatientsCards.execute();
        }catch (SQLException e){
            System.err.println("Ошибка добавления записи в таблицу patients_cards: DBWorker.addPatientCard()");
        }
    }
    
    public void deletePatientCard(String patientCardCode){
        try{
            PreparedStatement deletePatientCard = connection.prepareStatement(DELETE_PATIENT_CARD_BY_CODE);
            deletePatientCard.setString(1, patientCardCode);
            deletePatientCard.execute();
        } catch(SQLException e){
            System.err.println("Ошибка удаления записей из таблицы patients_cards: DBWorker.deletePatientCard()");
            System.err.println(e.getMessage());
        }
    }
    
    public boolean isPatientCardExists(PatientCard patientCard){
        try{
        PreparedStatement getPatientsCardsCodes = connection.prepareStatement(CHECK_PATIENT_CARDS_BY_CODE);
        ResultSet allCodes = getPatientsCardsCodes.executeQuery();
        while(allCodes.next()){
            if(allCodes.getString("patientCardCode").equals(patientCard.getCode())){
                return true;
            }
        }
        return false;
        } catch(SQLException e){
            System.err.println("Ошибка проверки существования в patients_cards: DBWorker.isPatientCardExists()");
            return false;
        }
        
    }
    
    public void addDiagnosisAndComment(PatientCard patientCard){
        try{
            PreparedStatement updatePatientCard = connection.prepareStatement(UPDATE_PATIENTS_CARDS);
            updatePatientCard.setString(1, patientCard.getDiagnosis());
            updatePatientCard.setString(2, patientCard.getComment());
            updatePatientCard.setString(3, patientCard.getCode());
            updatePatientCard.execute();
        } catch(SQLException e){
            System.err.println("Ошибка добавления диагноза и комментария в таблицу patients_cards: DBWorker.addDiagnosisAndComment()");
            System.err.println(e.getMessage());
        }
    }
    
    public ArrayList<String[]> searchPatientsCards(String surname){
        ArrayList<String[]> searchedCards = new ArrayList<>();
        try{
            PreparedStatement searchCards = connection.prepareStatement(SEARCH_PATIENT_CARDS_BY_SURNAME);
            searchCards.setString(1, surname);
            ResultSet searchResult = searchCards.executeQuery();
            while(searchResult.next()){
                float[] data = getMedicalDataByCode(searchResult.getString("patientCardCode"));
                if(data != null){
                    if(searchResult.getString("diagnosis") == null){
                        String[] patientCardRecord = {searchResult.getString("patientCardCode"), searchResult.getString("Surname"),
                                    searchResult.getString("Name"), searchResult.getString("SecondName"), 
                                    String.valueOf(searchResult.getInt("YearOfBirth")), "Внесены", "Отсутствует"};
                        searchedCards.add(patientCardRecord);
                    }
                    else{
                        String[] patientCardRecord = {searchResult.getString("patientCardCode"), searchResult.getString("Surname"),
                                    searchResult.getString("Name"), searchResult.getString("SecondName"), 
                                    String.valueOf(searchResult.getInt("YearOfBirth")), "Внесены", searchResult.getString("diagnosis")};
                        searchedCards.add(patientCardRecord);
                    }
                }
                else{
                    String[] patientCardRecord = {searchResult.getString("patientCardCode"), searchResult.getString("Surname"),
                                    searchResult.getString("Name"), searchResult.getString("SecondName"), 
                                    String.valueOf(searchResult.getInt("YearOfBirth")), "Отсутствуют", "Не диагностирован."};
                    searchedCards.add(patientCardRecord);
                }
            }
            return searchedCards;
        } catch(SQLException e){
            System.err.println("Ошибка поиска в таблице patients_cards: DBWorker.searchPatientsCards()");
            return searchedCards;
        }
    }
    
    public void addMedicalData(PatientCard patientCard){ 
        try{
            PreparedStatement insertIntoPatientsMedicalData = connection.prepareStatement(INSERT_INTO_PATIENTS_MEDICAL_DATA);
            insertIntoPatientsMedicalData.setString(1, patientCard.getCode());
            
            float[] arrayOfMedicalData = patientCard.getArrayOfMedicalData();
            
            insertIntoPatientsMedicalData.setFloat(2, arrayOfMedicalData[0]);
            insertIntoPatientsMedicalData.setFloat(3, arrayOfMedicalData[1]);
            insertIntoPatientsMedicalData.setFloat(4, arrayOfMedicalData[2]);
            insertIntoPatientsMedicalData.setFloat(5, arrayOfMedicalData[3]);
            insertIntoPatientsMedicalData.setFloat(6, arrayOfMedicalData[4]);
            insertIntoPatientsMedicalData.setFloat(7, arrayOfMedicalData[5]);
            insertIntoPatientsMedicalData.setFloat(8, arrayOfMedicalData[6]);
            insertIntoPatientsMedicalData.setFloat(9, arrayOfMedicalData[7]);
            insertIntoPatientsMedicalData.setFloat(10, arrayOfMedicalData[8]);
            insertIntoPatientsMedicalData.setFloat(11, arrayOfMedicalData[9]);
            insertIntoPatientsMedicalData.setFloat(12, arrayOfMedicalData[10]);
            insertIntoPatientsMedicalData.setFloat(13, arrayOfMedicalData[11]);
            insertIntoPatientsMedicalData.setFloat(14, arrayOfMedicalData[12]);
            insertIntoPatientsMedicalData.setFloat(15, arrayOfMedicalData[13]);
            insertIntoPatientsMedicalData.setFloat(16, arrayOfMedicalData[14]);
            insertIntoPatientsMedicalData.setFloat(17, arrayOfMedicalData[15]);
            insertIntoPatientsMedicalData.setFloat(18, arrayOfMedicalData[16]);
            insertIntoPatientsMedicalData.setFloat(19, arrayOfMedicalData[17]);
            insertIntoPatientsMedicalData.setFloat(20, arrayOfMedicalData[18]);
            insertIntoPatientsMedicalData.setFloat(21, arrayOfMedicalData[19]);
            insertIntoPatientsMedicalData.setFloat(22, arrayOfMedicalData[20]);
            insertIntoPatientsMedicalData.setFloat(23, arrayOfMedicalData[21]);
            insertIntoPatientsMedicalData.setFloat(24, arrayOfMedicalData[22]);
            insertIntoPatientsMedicalData.setFloat(25, arrayOfMedicalData[23]);
            insertIntoPatientsMedicalData.setFloat(26, arrayOfMedicalData[24]);
            insertIntoPatientsMedicalData.setFloat(27, arrayOfMedicalData[25]);
            insertIntoPatientsMedicalData.setFloat(28, arrayOfMedicalData[26]);
            insertIntoPatientsMedicalData.setFloat(29, arrayOfMedicalData[27]);
            insertIntoPatientsMedicalData.setFloat(30, arrayOfMedicalData[28]);
            insertIntoPatientsMedicalData.setFloat(31, arrayOfMedicalData[29]);
            insertIntoPatientsMedicalData.setFloat(32, arrayOfMedicalData[30]);
            insertIntoPatientsMedicalData.setFloat(33, arrayOfMedicalData[31]);
            
            insertIntoPatientsMedicalData.execute();
        } catch(SQLException e){
            System.err.println("Ошибка добавления записи в таблицу patients_medical_data");
        }
    }
    
    public float[] getMedicalDataByCode(String patientCardCode){
        float[] medicalData = null;
        try{
            PreparedStatement getMedicalDataStatement = connection.prepareStatement(GET_MEDICAL_DATA_BY_CODE);
            getMedicalDataStatement.setString(1, patientCardCode);
            ResultSet medicalDataSet = getMedicalDataStatement.executeQuery();
            int i = 0, j = 2;
            while(medicalDataSet.next()){
                if(i == 0){
                    medicalData = new float[32];
                }
                medicalData[i] = medicalDataSet.getFloat(j);
                i++;
                j++;
            }
            return medicalData;           
        }catch(SQLException e){
            System.err.println(e.getMessage());
            return medicalData;
        }
    }
    
    public void updateMedicalData(PatientCard patientCard){
        try{
            PreparedStatement updateMedData = connection.prepareStatement(UPDATE_MEDICAL_DATA);
                        float[] data = patientCard.getArrayOfMedicalData();
            for(int i = 0, j = 1; i < data.length; i++, j++){
                updateMedData.setFloat(j, data[i]);
            }
            updateMedData.setString(33, patientCard.getCode());
            updateMedData.execute();
        } catch(SQLException e){
            System.err.println("Ошибка при обновление данных в таблице patients_medical_data: DBWorker.updateMedicalData()");
            System.err.println(e.getMessage());
        }
    }
    
    public HashMap<String, Integer> countStatistics(){
        HashMap<String, Integer> statisticsMap = new HashMap<>();
        try{
            PreparedStatement countStatistics = connection.prepareStatement(COUNT_STATISTICS);
            ResultSet statisticsSet = countStatistics.executeQuery();
            while(statisticsSet.next()){
                statisticsMap.put(statisticsSet.getString("diagnosis"), statisticsSet.getInt("amount"));
            }
        } catch(SQLException e){
            System.err.println("Ошибка подсчёта статистики.");
            return null;
        }
        
        for (Entry<String, Integer> set: statisticsMap.entrySet()){
            System.out.println(set.getKey() + ": " + set.getValue());
        }
        
        return statisticsMap;
    }
}
