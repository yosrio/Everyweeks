/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;
import java.io.IOException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

/**
 *
 * @author yosrio
 */
public class Read {

    public Read() {

    }

    public void bacaData(String data) throws IOException, BiffException {
        File file = new File(data);

        Workbook workBook = Workbook.getWorkbook(file);
        Sheet[] sheet = workBook.getSheets();

        int baris = sheet[0].getRows();
        int kolom = sheet[0].getColumns();

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                String ret = sheet[0].getCell(j, i).getContents();
                System.out.print(ret + "\t");
            }
            if (i == 0) {
                System.out.println("");
                System.out.println("========================================================================================================================");
            }
            System.out.println("");
        }
    }
}
