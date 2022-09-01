package io;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Ex2Agrupamento {

    public static void main(String[] args) throws IOException {

        Scanner scannerFileA = new Scanner(new File("File_A.batata"));
        Scanner scannerFileB = new Scanner(new File("File_B.batata"));
        Scanner scannerFileC = new Scanner(new File("File_C.batata"));

        PrintStream psFile = new PrintStream("Agrupamento.txt");

        while(scannerFileC.hasNext()) {
            while(scannerFileB.hasNext()){
                while(scannerFileA.hasNext()){
                    String linhaFileA = scannerFileA.nextLine();
                    psFile.println(linhaFileA);
                }
                String linhaFileB = scannerFileB.nextLine();
                psFile.println(linhaFileB);
            }
            String linhaFileC = scannerFileC.nextLine();
            psFile.println(linhaFileC);
        }
        psFile.close();

        scannerFileA.close();
        scannerFileB.close();
        scannerFileB.close();
    }
}
