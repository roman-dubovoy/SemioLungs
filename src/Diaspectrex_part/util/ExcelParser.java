package Diaspectrex_part.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;


public class ExcelParser {
    private HSSFWorkbook excelFile;
	
public ExcelParser(String fileName){
	try {
            this.excelFile = new HSSFWorkbook(new FileInputStream(fileName));
	} catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
	}
    }
	
    public float[] readLineByCode(String patientCardCode){        
	float[] data = new float[32];
        for(int i = 0; i < 32; i++){
            data[i] = 0.0f;
        }
        
	boolean isDataFound = false;

	for(int i = 0; i < excelFile.getNumberOfSheets(); i++){
            Sheet sheet = excelFile.getSheetAt(i);
            Iterator<Row> rowIterator = sheet.iterator();
            while(rowIterator.hasNext()){
            Row row = rowIterator.next();
            Cell specialCode = row.getCell(0);
            if (specialCode.getStringCellValue().equals(patientCardCode)){
		Iterator<Cell> cellIterator = row.iterator(); 
		while(cellIterator.hasNext()){
                    Cell cell = cellIterator.next();
                    int cellType = cell.getCellType();
                    switch(cellType){  
                        case Cell.CELL_TYPE_NUMERIC:
                                data[cell.getColumnIndex()-1] = (float)cell.getNumericCellValue();
				break;     
			default:
				if(cell.getColumnIndex() == 0) continue;
                                else break;	
                    }
		}
		isDataFound = true;
            }
            else
		continue;
        }
	if(isDataFound)
            break;
	}
        float sum = 0;
        for(int i = 0; i < data.length; i++){
            sum += data[i];
        }
        if(sum>= 99.8 & sum <= 100.2){
            return data;
        }
    return null;
    }
}
