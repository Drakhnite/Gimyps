package fr.poec.gestion_rh.payslip;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class bulletinXls {

	public Map<Integer, List<String>> readJExcel(String fileLocation) throws IOException, BiffException {

		Map<Integer, List<String>> data = new HashMap<>();

		Workbook workbook = Workbook.getWorkbook(new File(fileLocation));
		Sheet sheet = workbook.getSheet(0);
		int rows = sheet.getRows();
		int columns = sheet.getColumns();

		for (int i = 0; i < rows; i++) {
			data.put(i, new ArrayList<String>());
			for (int j = 0; j < columns; j++) {
				data.get(i).add(sheet.getCell(j, i).getContents());
			}
		}
		return data;
	}
//	FileOutputStream fileOut = new FileOutputStream("temp.xls");
//	workbook.write();
//	workbook.close();
}