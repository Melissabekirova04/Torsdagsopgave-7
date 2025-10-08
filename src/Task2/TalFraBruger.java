package Task2;

import java.util.Scanner;

public class TalFraBruger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fødselsår = 0;
        boolean gyldigtInput = false;

        while (!gyldigtInput) {
            System.out.println("Indtast dit fødselsår:");

            String input = scanner.nextLine();

            try {
                fødselsår = Integer.parseInt(input);
                gyldigtInput = true; // Vi fik et tal, så vi kan stoppe løkken
            } catch (NumberFormatException e) {
                System.out.println("Fejl: Du skal indtaste et helt tal (fx 1995). Prøv igen!\n");
            }
        }

        int nuværendeÅr = 2025;
        int alder = nuværendeÅr - fødselsår;

        System.out.println("Du er cirka " + alder + " år gammel.");
        scanner.close();
    }
}

