package Diaspectrex_part.util;

public class PatientCard {

    private String code;
    private String surname;
    private String name;
    private String secondName;
    private int yearOfBirth;
    private float[]arrayOfMedicalData;
    private String diagnosis;
    private String comment;
    
    public PatientCard(String code, String surname, String name, String secondName, int yearOfBirth) {
        this.code = code;
        this.surname = surname;
        this.name = name;
        this.secondName = secondName;
        this.yearOfBirth = yearOfBirth;
    }
    
    public String getCode() {
        return code;
    }
    
    public void setCode(String code){
        this.code = code;
    }
    

    public String getSurname() {
        return surname;
    }
    
    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }
    
    public void setSecondName(String SecondName){
    this.secondName = SecondName;
    }
    
    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    
    public void setArrayOfMedicalData(float[] data){
        if(data == null){
            System.err.println("PatientCard.setArrayOfData(): Error!!! Required parametr is null.");
        }
        else{
            this.arrayOfMedicalData = data;
            System.out.println("PatientCard.setArrayOfData(): data has been written!");
        }
    }
    
    public float[] getArrayOfMedicalData() {
        return arrayOfMedicalData;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
    
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}