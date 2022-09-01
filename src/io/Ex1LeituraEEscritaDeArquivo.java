package io;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Ex1LeituraEEscritaDeArquivo {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(new File("Request.txt"), "UTF-8");
        PrintStream ps = new PrintStream("Response.txt");
        while(scanner.hasNext()) {
            String linha = scanner.nextLine();
            System.out.println(linha);

            String[] valores = linha.split(":");
            Integer salario = Integer.valueOf(valores[1].trim());

            if(salario < 3000) {
                ps.println(valores[0]);
            }
        }
        ps.close();
        scanner.close();
    }
}
