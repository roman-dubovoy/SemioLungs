package Diaspectrex_part.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;


public class Classifier {
    //Стандартные диагнозы
    private static final String NORMAL = "Нормологический";
    
    private static final String INTAKSICIONIY_LOW = "Интоксикационно-подобный начальная";
    private static final String INTAKSICIONIY_MIDDLE = "Интоксикационно-подобный умеренная";
    private static final String INTAKSICIONIY_HIGH = "Интоксикационно-подобный выраженная";
    
    private static final String KATABOLICHESKIY_LOW = "Катаболически-подобный начальная";
    private static final String KATABOLICHESKIY_MIDDLE = "Катаболически-подобный умеренная";
    private static final String KATABOLICHESKIY_HIGH = "Катаболически-подобный выраженная";
    
    private static final String ALLERGO_AUTOIMUNNIY_LOW = "Аллерго-аутоимунно-подобный начальная";
    private static final String ALLERGO_AUTOIMUNNIY_MIDDLE = "Аллерго-аутоимунно-подобный умеренная";
    private static final String ALLERGO_AUTOIMUNNIY_HIGH = "Аллерго-аутоимунно-подобный выраженная";
    
    private static final String SMESHANIY_LOW = "Смешанный начальный";
    private static final String SMESHANIY_INTAKSICIONNO_KATABOLICHESKIY = "Смешанный интоксикационно-катаболически-подобный";
    private static final String SMESHANIY_ALLERGO_AUTOIMUNNO_KATABOLICHESKIY = "Смешанный аллерго-аутоиммунно-катаболически-подобный";
    
    private static final String NEOPOZNANIY = "Не распознано";
    
    private static ArrayList<int[]> currentOptions;   

    public static ArrayList<int[]> getOptions() {
        return currentOptions;
    }
    
    private static void printOptions(){
        for(int[] i: currentOptions){
            System.out.println(Arrays.toString(i));
        }
    }
    
    public static void getCurrentOptionsFromFile(){
        String path = new File("src\\Diaspectrex_part\\resources\\classifier\\currentOptions.dat").getAbsolutePath();
        path = path.replace("\\dist", "");
        try(FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis)){
            currentOptions = (ArrayList<int[]>)ois.readObject();
            if(currentOptions == null){
                currentOptions = getDefaultOptionsFromFile();
            }
            System.out.println("Полученные настройки классификтора:");
            printOptions();
        } catch(IOException e){
            System.err.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }
    
    public static ArrayList<int[]> getDefaultOptionsFromFile(){
        String path = new File("src\\Diaspectrex_part\\resources\\classifier\\defaultOptions.dat").getAbsolutePath();
        path = path.replace("\\dist", "");
        try(FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis)){
            ArrayList<int[]> options = (ArrayList<int[]>)ois.readObject();
            return options;
        } catch(IOException e){
            System.err.println(e.getMessage());
            return null;
        } catch (ClassNotFoundException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }
    
    public static void saveNewOptionsIntoFile(){
        String path = new File("src\\Diaspectrex_part\\resources\\classifier\\currentOptions.dat").getAbsolutePath();
        path = path.replace("\\dist", "");
        try (FileOutputStream fos = new FileOutputStream(new File(path));
            ObjectOutputStream oos = new ObjectOutputStream(fos)){
            System.out.println("Сохранённые настройки классификтора:");
            printOptions();
            oos.writeChars("");
            oos.writeObject(currentOptions);
            oos.flush();
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }       
    }
    
    public static void setNewNormOptions(int[] newNormOptions){
        currentOptions.set(0, newNormOptions);
    }
    
    public static void setNewAllergoLowOptions(int[] newAllergoLowOptions){
        currentOptions.set(1, newAllergoLowOptions);
    }
    
    public static void setNewAllergoMiddleOptions(int[] newAllergoMiddleOptions){
        currentOptions.set(2, newAllergoMiddleOptions);
    }
    
    public static void setNewAllergoHighOptions(int[] newAllergoHighOptions){
        currentOptions.set(3, newAllergoHighOptions);
    }
    
    public static void setNewKatabLowOptions(int[] newKatabLowOptions){
        currentOptions.set(4, newKatabLowOptions);
    }
    
    public static void setNewKatabMiddleOptions(int[] newKatabMiddleOptions){
        currentOptions.set(5, newKatabMiddleOptions);
    }
    
    public static void setNewKatabHighOptions(int[] newKatabHighOptions){
        currentOptions.set(6, newKatabHighOptions);
    }
    
    public static void setNewIntoksLowOptions(int[] newIntoksLowOptions){
        currentOptions.set(7, newIntoksLowOptions);
    }
    
    public static void setNewIntoksMiddleOptions(int[] newIntoksMiddleOptions){
        currentOptions.set(8, newIntoksMiddleOptions);
    }
    
    public static void setNewIntoksHighOptions(int[] newIntoksHighOptions){
        currentOptions.set(9, newIntoksHighOptions);
    }
    
    public static void setNewMixedLowOptions(int[] newMixedLowOptions){
        currentOptions.set(10, newMixedLowOptions);
    }
    
    public static void setNewMixedIntoksOptions(int[] newMixedIntoksOptions){
        currentOptions.set(11, newMixedIntoksOptions);
    }
    
    public static void setNewMixedAllergoOptions(int[] newMixedAllergoOptions){
        currentOptions.set(12, newMixedAllergoOptions);
    }
    
    public static String classify(float[] dataForProcessing){
        //Проверим проценты
        float[] СheckPercents = new float[4];
        int i;
        for (i = 0; i < СheckPercents.length; i++){
            СheckPercents[i] = 0;
        }    
        
        for(i=0;i<6;i++){
            СheckPercents[0] += dataForProcessing[i];
        }
        for(;i<14;i++){
            СheckPercents[1] += dataForProcessing[i];
        }
        for(;i<22;i++){
            СheckPercents[2] += dataForProcessing[i];
        }
        for(;i<32;i++){
            СheckPercents[3] += dataForProcessing[i];
        }

        float Checked = СheckPercents[0]+СheckPercents[1]+СheckPercents[2]+СheckPercents[3];

        if(!(Checked >= 99.8 & Checked <= 100.2)){
            System.err.println("Сумма в процентах = " + Checked + ". Ошибка данных - сумма не равна 100 +/- 0,2%: ");
        }

        if ((СheckPercents[0] > currentOptions.get(0)[0] && СheckPercents[0]<currentOptions.get(0)[1]) && (СheckPercents[1] >= currentOptions.get(0)[2] && СheckPercents[1]<currentOptions.get(0)[3])
                && (СheckPercents[2] >= currentOptions.get(0)[4] && СheckPercents[2] < currentOptions.get(0)[5]) && (СheckPercents[3] >= currentOptions.get(0)[6] && СheckPercents[3] < currentOptions.get(0)[7])){
            return NORMAL;
        }

        //Аллерго-аутоиммунно-подобные
        if ((СheckPercents[0]>currentOptions.get(1)[0] && СheckPercents[0]<currentOptions.get(1)[1]) && (СheckPercents[1]>=currentOptions.get(1)[2] && СheckPercents[1]<currentOptions.get(1)[3])
                && (СheckPercents[2]>currentOptions.get(1)[4] && СheckPercents[2] < currentOptions.get(1)[5]) && (СheckPercents[3] >= currentOptions.get(1)[6] && СheckPercents[3] < currentOptions.get(1)[7])){
            return ALLERGO_AUTOIMUNNIY_LOW;
        }
        else if ((СheckPercents[0]>currentOptions.get(2)[0] && СheckPercents[0]<currentOptions.get(2)[1]) && (СheckPercents[1]>currentOptions.get(2)[2] && СheckPercents[1]<currentOptions.get(2)[3])
                && (СheckPercents[2]>currentOptions.get(2)[4] && СheckPercents[2] < currentOptions.get(2)[5]) && (СheckPercents[3] >=currentOptions.get(2)[6] && СheckPercents[3] < currentOptions.get(2)[7]))
        {
            return ALLERGO_AUTOIMUNNIY_MIDDLE;
        }
        else if (СheckPercents[0]>currentOptions.get(3)[0] && СheckPercents[0]<currentOptions.get(3)[1] && СheckPercents[1]>currentOptions.get(3)[2] && СheckPercents[1]<currentOptions.get(3)[3]
                && СheckPercents[2]>=currentOptions.get(3)[4] && СheckPercents[2] < currentOptions.get(3)[5] && СheckPercents[3] >= currentOptions.get(3)[6] && СheckPercents[3] < currentOptions.get(3)[7])
        {
            return ALLERGO_AUTOIMUNNIY_HIGH;
        }

        //Катаболически-подобные
        if ((СheckPercents[0] >= currentOptions.get(4)[0] && СheckPercents[0]<currentOptions.get(4)[1]) && (СheckPercents[1] >= currentOptions.get(4)[2] && СheckPercents[1]<currentOptions.get(4)[3])
                && (СheckPercents[2] > currentOptions.get(4)[4] && СheckPercents[2] < currentOptions.get(4)[5]) && (СheckPercents[3] > currentOptions.get(4)[6] && СheckPercents[3] < currentOptions.get(4)[7]))
        {
            return KATABOLICHESKIY_LOW;
        }
        else if ((СheckPercents[0] >= currentOptions.get(5)[0] && СheckPercents[0]<currentOptions.get(5)[1]) && (СheckPercents[1]>=currentOptions.get(5)[2] && СheckPercents[1]<currentOptions.get(5)[3])
                && (СheckPercents[2]>currentOptions.get(5)[4] && СheckPercents[2] <currentOptions.get(5)[5]) && (СheckPercents[3] > currentOptions.get(5)[6] && СheckPercents[3] <currentOptions.get(5)[7]))
        {
            return KATABOLICHESKIY_MIDDLE;
        }
        else if ((СheckPercents[0] >= currentOptions.get(6)[0] && СheckPercents[0]<currentOptions.get(6)[1]) && (СheckPercents[1] >= currentOptions.get(6)[2] && СheckPercents[1]<currentOptions.get(6)[3])
                && (СheckPercents[2] > currentOptions.get(6)[4] && СheckPercents[2] < currentOptions.get(6)[5]) && (СheckPercents[3] > currentOptions.get(6)[6] && СheckPercents[3] < currentOptions.get(6)[7]))
        {
            return KATABOLICHESKIY_HIGH;
        }

        //Интоксикационно-подобные
        if ((СheckPercents[0]>=currentOptions.get(7)[0] && СheckPercents[0]<currentOptions.get(7)[1]) && (СheckPercents[1]>currentOptions.get(7)[2] && СheckPercents[1]<currentOptions.get(7)[3])
                && (СheckPercents[2]>currentOptions.get(7)[4] && СheckPercents[2] < currentOptions.get(7)[5]) && (СheckPercents[3] >= currentOptions.get(7)[6] && СheckPercents[3] < currentOptions.get(7)[7]))
        {
            return INTAKSICIONIY_LOW;
        }
        else if ((СheckPercents[0]>currentOptions.get(8)[0] && СheckPercents[0]<currentOptions.get(8)[1]) && (СheckPercents[1]>currentOptions.get(8)[2] && СheckPercents[1]<currentOptions.get(8)[3])
                && (СheckPercents[2]>=currentOptions.get(8)[4] && СheckPercents[2] < currentOptions.get(8)[5]) && (СheckPercents[3] >=currentOptions.get(8)[6] && СheckPercents[3] < currentOptions.get(8)[7]))
        {
            return INTAKSICIONIY_MIDDLE;
        }
        else if ((СheckPercents[0]>=currentOptions.get(9)[0] && СheckPercents[0]<currentOptions.get(9)[1]) && (СheckPercents[1]>currentOptions.get(9)[2] && СheckPercents[1]<currentOptions.get(9)[3])
                && (СheckPercents[2]>=currentOptions.get(9)[4] && СheckPercents[2] < currentOptions.get(9)[5]) && (СheckPercents[3] >=currentOptions.get(9)[6] && СheckPercents[3] < currentOptions.get(9)[7]))
        {
            return INTAKSICIONIY_HIGH;
        }

        //Смешанные
        if (СheckPercents[0]>currentOptions.get(10)[0] && СheckPercents[0]<currentOptions.get(10)[1] && СheckPercents[1]>currentOptions.get(10)[2] && СheckPercents[1]<currentOptions.get(10)[3]
                && СheckPercents[2]>=currentOptions.get(10)[4] && СheckPercents[2] < currentOptions.get(10)[5] && СheckPercents[3] > currentOptions.get(10)[6] && СheckPercents[3] < currentOptions.get(10)[7])
        {
            return SMESHANIY_LOW; //Начальный вариант
        }
        else if (СheckPercents[0]>=currentOptions.get(11)[0] && СheckPercents[0]<currentOptions.get(11)[1] && СheckPercents[1]>currentOptions.get(11)[2] && СheckPercents[1]<currentOptions.get(11)[3]
                && СheckPercents[2]>=currentOptions.get(11)[4] && СheckPercents[2] < currentOptions.get(11)[5] && СheckPercents[3] > currentOptions.get(11)[6] && СheckPercents[3] < currentOptions.get(11)[7])
        {
            return SMESHANIY_INTAKSICIONNO_KATABOLICHESKIY;
        }
        else if (СheckPercents[0]>currentOptions.get(12)[0] && СheckPercents[0]<currentOptions.get(12)[1] && СheckPercents[1]>=currentOptions.get(12)[2] && СheckPercents[1]<currentOptions.get(12)[3]
                && СheckPercents[2]>=currentOptions.get(12)[4] && СheckPercents[2] < currentOptions.get(12)[5] && СheckPercents[3] > currentOptions.get(12)[6] && СheckPercents[3] < currentOptions.get(12)[7])
        {
            return SMESHANIY_ALLERGO_AUTOIMUNNO_KATABOLICHESKIY;
        }

        //Не опознано
        return NEOPOZNANIY;
    }
}