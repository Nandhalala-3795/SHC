package fileUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import reports.Logger;


public class ExcelReader {

	private FileInputStream fis;
	@SuppressWarnings("unused")
	private FileOutputStream fos;
	private Workbook wb;
	private Sheet sh;
	private Row rw;
	private Cell cl;
	private File file;
	private Map<String, Integer> sheetnames = new HashMap<String, Integer>();
	//private Map<String, Integer> columnnames = new HashMap<String, Integer>();
	
	public ExcelReader(File excelfile) {
		
		file = excelfile;
		loadfile();
		getSheetNames();
	}
	
	public ExcelReader(String excelfilepath) {
		
		file = new File(excelfilepath);
		
	}
	
	private boolean isFileExsists() {
		
		boolean flag = false;
		
		if(file.isFile()&&file.exists())
			flag = true;
		else
			Logger.LogFail("File not found");
		return flag;
	}
	
	@SuppressWarnings("finally")
	private boolean loadfile() {
		boolean flag = false;
		
			try {
				if(isFileExsists()) {
					fis = new FileInputStream(file);
					wb = WorkbookFactory.create(fis);
					getSheetNames();
				}
			} catch (EncryptedDocumentException | IOException e) {
				Logger.LogFail(e.getMessage());
				e.printStackTrace();
			}
		
		finally {
			return flag;
			}
		
	}
	
	private boolean unloadfile() {
		
		boolean flag = false;
		try {
			wb.close();
			fis.close();
			flag = true;
		} catch (IOException e) {
			Logger.LogFail(e.getMessage());
			e.printStackTrace();
		}
		return flag;
	}
	
	private void getSheetNames() {
		int n = wb.getNumberOfSheets();
		for(int i = 0 ; i<=n ; i++) {
			try {
				sheetnames.put( wb.getSheetAt(i).getSheetName() , i);
			}
			catch(Exception e){
				break;
			}
		}
	}
	
	private boolean isSheetExsists(String sheetname) {
		boolean flag = false;
				
		if(sheetnames.containsKey(sheetname))
			flag = true;
		
		return flag;
	}
	
	@SuppressWarnings("unused")
	private boolean isSheetActive(String sheetname) {
		boolean flag = false;
		
		if(wb.getActiveSheetIndex()==wb.getSheetIndex(sheetname))
			flag = true;
		
		return flag;
	}
	
	private Map<String , Integer> getcolumnnames(String Sheetname, String columnname){
		
		Map <String , Integer> columnnames = new HashMap<>();
		if(isSheetExsists(Sheetname)) {
			sh = wb.getSheet(Sheetname);
		}
		else {
			Logger.LogFail("No such sheet is present with name : "+Sheetname);
		}
		if(sh.isSelected()) {
			int firstrow = sh.getFirstRowNum();
			int lastrow = sh.getLastRowNum();
			sh.getRow(firstrow).forEach(cl->{columnnames.put(cl.getStringCellValue(), cl.getColumnIndex());});
		}
		else {
			Logger.LogFail("Sheet with name is not selected : "+Sheetname);
		}
//		int firstrow = sh.getFirstRowNum();
//		int lastrow = sh.getLastRowNum();
//		sh.getRow(firstrow).forEach(cl->{columnnames.put(cl.getStringCellValue(), cl.getColumnIndex());});
		return columnnames;
		
	}
	
	
	
	
	
	public String getcellData(String sheetname, String Columnname, int rownum) {
		String celldata = null;
		
		if(Objects.isNull(fis))
			loadfile();
		
		Map<String, Integer> columns = getcolumnnames(sheetname, Columnname);
		if(columns.equals(Columnname)) {
			rw = sh.getRow(rownum);
			cl = rw.getCell(columns.get(Columnname));
		}
		switch(cl.getCellType()) {
		case STRING:
			celldata = cl.getStringCellValue();
			break;
		case BOOLEAN:
            celldata = Boolean.toString(cl.getBooleanCellValue());
            break;
		case NUMERIC:
			if(DateUtil.isCellDateFormatted(cl)){
				celldata = String.valueOf(cl.getDateCellValue());
			}else {
				celldata = String.valueOf(cl.getNumericCellValue());
			}
			break;
		case BLANK:
			celldata = "";
			break;
		case _NONE:
			celldata = null;
			break;
		case ERROR:
			celldata = String.valueOf(cl.getErrorCellValue());
			break;
		case FORMULA:
			celldata = String.valueOf(cl.getCellFormula());
		default:
			break;
			
		}
		
		if(Objects.nonNull(fis))
			unloadfile();
		
		return celldata;
	}
	
}
