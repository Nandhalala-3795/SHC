package fileReaders;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import constants.Constants;

public class SYSUSRdatareader {

	
	
	private SYSUSRdatareader() {}
	
	public static Map<String, String> getuserdata() {
		
		FileInputStream fis;
		try {
			File f = new File(Constants.TESTRESOURCESPATH+"//SYSUSERS.xlsx");

			fis = new FileInputStream(f);
		
			Workbook wrkbk = WorkbookFactory.create(fis);
			
			Sheet sh = wrkbk.getSheet("sysusers");
			
			int lastrow_num = sh.getLastRowNum();
			
			Row r = sh.getRow(0);
			
			int lastcolumn_num = r.getLastCellNum();
			
			Map<String, String> datamap = new HashMap<String, String>();
			
			for(int i = lastrow_num ; i==lastrow_num ; i++) {
				Row row = sh.getRow(i);
				for(int j = 0 ; j<lastcolumn_num ; j++) {
					datamap.put(r.getCell(j).getStringCellValue(), 
							row.getCell(j).getStringCellValue());
				}
			}
			System.out.println(datamap);
			
			return datamap;
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (EncryptedDocumentException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		return null;
		
	}
	
public static Map<String, String> getuserrole() {
		
		FileInputStream fis;
		try {
			File f = new File(Constants.TESTRESOURCESPATH+"//SYSUSERS.xlsx");

			fis = new FileInputStream(f);
		
			Workbook wrkbk = WorkbookFactory.create(fis);
			
			Sheet sh = wrkbk.getSheet("user_roles");
			
			System.out.println(Objects.nonNull(sh));
			
			int lastrow_num = sh.getLastRowNum();
			
			Row r = sh.getRow(0);
			
			int lastcolumn_num = r.getLastCellNum();
			
			Map<String, String> datamap = new HashMap<String, String>();
			
			for(int i = lastrow_num ; i==lastrow_num ; i++) {
				Row row = sh.getRow(i);
				for(int j = 0 ; j<lastcolumn_num ; j++) {
					datamap.put(r.getCell(j).getStringCellValue(), 
							row.getCell(j).getStringCellValue());
				}
			}
			System.out.println(datamap);
			
			return datamap;
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (EncryptedDocumentException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		return null;
		
	}

public static Map<String, String> getfuncgrp() {
	
	FileInputStream fis;
	try {
		File f = new File(Constants.TESTRESOURCESPATH+"//SYSUSERS.xlsx");

		fis = new FileInputStream(f);
	
		Workbook wrkbk = WorkbookFactory.create(fis);
		
		Sheet sh = wrkbk.getSheet("Functional_Group");
		
		//System.out.println(Objects.nonNull(sh));
		
		int lastrow_num = sh.getLastRowNum();
		
		//System.out.println(lastrow_num);
		
		Row r = sh.getRow(0);
		
		int lastcolumn_num = r.getLastCellNum();
		
		Map<String, String> datamap = new HashMap<String, String>();
		
		for(int i = 1 ; i<=lastrow_num ; i++) {
			
			Row row = sh.getRow(i);
			for(int j = 0 ; j<lastcolumn_num ; j++) {
				
				datamap.put(r.getCell(j).getStringCellValue()+i, 
						row.getCell(j).getStringCellValue());
				
			}
		}
		//System.out.println(datamap);
		
		return datamap;
		
	} catch (FileNotFoundException e) {

		e.printStackTrace();
	} catch (EncryptedDocumentException e) {

		e.printStackTrace();
	} catch (IOException e) {

		e.printStackTrace();
	}
	
	return null;
	
}
	
}
