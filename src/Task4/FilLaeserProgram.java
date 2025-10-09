package Task4;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilLaeserProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileIO fileIO = new FileIO();

        boolean filFundet = false;

        while (!filFundet) {
            System.out.println("Indtast filnavnet (fx findes.txt):");
            String filnavn = scanner.nextLine();

            try {
                String indhold = fileIO.laesFilIndhold(filnavn);
                System.out.println("\nIndholdet af filen '" + filnavn + "':\n");
                System.out.println(indhold);
                filFundet = true;
            } catch (FileNotFoundException e) {
                System.out.println("Fejl: Fandt ikke filen '" + filnavn + "'. Prøv igen.\n");
            }
        }

        System.out.println("Programmet er færdigt ⚽");
        scanner.close();
    }
}

