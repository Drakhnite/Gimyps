package fr.poec.gestion_rh.payslip;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import jxl.Workbook;
import jxl.write.Number;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class bulletinXls {

	// Chargement du fichier "modèle"
    InputStream xlsRefStream = new FileInputStream("patatos.xsl");
    Workbook refWorkbook = Workbook.getWorkbook(xlsRefStream);
   
    // Création du fichier de sortie
    File outFile = new File("myPatatos.xls");
    WorkBook outWorkbook = Workbook.createWorkbook(outFile, refWorkbook);
}
