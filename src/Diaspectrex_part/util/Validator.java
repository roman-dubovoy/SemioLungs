package Diaspectrex_part.util;

import java.util.regex.*;

public class Validator {
    public static boolean checkFIO(String uncheckedString){
        Pattern pattern = Pattern.compile("(^[А-ЯІЇЄҐ][а-яіїєґ]+$)|(^[А-ЯІЇЄҐ][а-яіїєґ]+\\-[А-ЯІЇЄҐ][а-яіїєґ]+$)");
        Matcher matcher = pattern.matcher(uncheckedString);
        return matcher.matches();
    }
    
    public static boolean checkCode(String uncheckedString){
        Pattern pattern = Pattern.compile("^(\\w+$)|(^\\w+\\-\\w+$)");
        Matcher mathcer = pattern.matcher(uncheckedString);
        return mathcer.matches();
    }
    
    public static boolean checkMedicalData(String uncheckedString){
        Pattern pattern = Pattern.compile("(^\\d{1,2}$)|(^\\d{1,2}(\\.|,)\\d{1,2}$)|(^100((\\.|,)[012])?$)");
        Matcher matcher = pattern.matcher(uncheckedString);
        return matcher.matches();
    }
    
    public static boolean checkOptionsData(String uncheckedString){
        Pattern pattern = Pattern.compile("(^\\d{1,2}$)|(^101$)");
        Matcher matcher = pattern.matcher(uncheckedString);
        return matcher.matches();
    }
}
