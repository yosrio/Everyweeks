/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

/**
 *
 * @author yosrio
 */
public class Data {

    private String namaFile;
    private int noSheet;

    public Data() {

    }

    public Data(String namaFile) {
        this.namaFile = namaFile;
    }

    public Data(String namaFile, int noSheet) {
        this.namaFile = namaFile;
        this.noSheet = noSheet;
    }

    public String getNamaFile() {
        return namaFile;
    }

    public void setNamaFile(String namaFile) {
        this.namaFile = namaFile;
    }

    public int getNoSheet() {
        return noSheet;
    }

    public void setNoSheet(int noSheet) {
        this.noSheet = noSheet;
    }

    public Sheet[] getFile() throws IOException, BiffException {
        File file = new File(getNamaFile() + ".xls");
        if (file.exists()) {
            Workbook workBook = Workbook.getWorkbook(file);
            Sheet[] sheet = workBook.getSheets();
            if (getNoSheet() >= 0 && getNoSheet() <= sheet.length) {
                return sheet;
            } else {
                JOptionPane.showMessageDialog(null, "Sheet tidak ada!");
                return null;
            }
        } else {
            JOptionPane.showMessageDialog(null, "File tidak ditemukan!");
            return null;
        }
    }
}
