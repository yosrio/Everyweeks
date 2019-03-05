/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

/**
 *
 * @author yosrio
 */
public class Read2 {

    public static String read(String dataFile) {
        try {
            POIFSFileSystem fs = new POIFSFileSystem(new FileInputStream(new File(dataFile)));
            HSSFWorkbook wb = new HSSFWorkbook(fs);
            HSSFSheet sheet = wb.getSheetAt(0);
            HSSFRow row = sheet.getRow(1);
            String str = row.getCell(0).getRichStringCellValue().getString();
            return str;
        } catch (Exception e) {
            return e.getMessage();
        }
    }
    
}
