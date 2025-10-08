package task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilLæsningFodbold {
    public static void main(String[] args) {
        Scanner tastatur = new Scanner(System.in);
        boolean filFundet = false;

        while (!filFundet) {
            System.out.println("Indtast filnavnet (fx findes.txt):");
            String filnavn = tastatur.nextLine();

            try {
                File fil = new File(filnavn);
                Scanner filScanner = new Scanner(fil);
                System.out.println("\nIndholdet af filen '" + filnavn + "':\n");

                while (filScanner.hasNextLine()) {
                    String linje = filScanner.nextLine();
                    System.out.println(linje);
                }

                filScanner.close();
                filFundet = true; // Filen blev fundet og læst
            } catch (FileNotFoundException e) {
                System.out.println("Fejl: Fandt ikke filen '" + filnavn + "'. Prøv igen.\n");
            }
        }

        System.out.println("\nProgrammet er færdigt ⚽");
        tastatur.close();
    }
}

