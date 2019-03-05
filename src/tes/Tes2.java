/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author yosrio
 */
public class Tes2 {

    public static void main(String[] args) throws FileNotFoundException, IOException{
        String excelFile = "TermVector.xlsx";
        FileInputStream fis = new FileInputStream(excelFile);
        Workbook book = new XSSFWorkbook(fis);
// data ada di Sheet 1, perhitungan sheet dimulai dari 0
        Sheet sheet = book.getSheetAt(0);

// misalnya kita akan membaca isi cell B2
        String address = "B2";
        CellReference cellReference = new CellReference(address);
        Row row = sheet.getRow(cellReference.getRow());
        Cell cell = row.getCell(cellReference.getCol());

        String isiCellB2 = cell.getStringCellValue();

    }

}
