public class ArrayFejl {

    public static void printTreForsteElementer(String[] array) {
        try {
            System.out.println("Første element: " + array[0]);
            System.out.println("Andet element: " + array[1]);
            System.out.println("Tredje element: " + array[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Fejl: Der er ikke nok elementer i arrayet til at vise tre navne.");
            System.out.println("Antal elementer i arrayet: " + array.length);
        }

        System.out.println("---- Slut på print ----\n");
    }

    public static void main(String[] args) {
        String[] navne1 = {"Anna", "Bob", "Clara", "David"};
        String[] navne2 = {"Eva", "Frank"};

        System.out.println("Printer navne1:");
        printTreForsteElementer(navne1);

        System.out.println("Printer navne2:");
        printTreForsteElementer(navne2);

        System.out.println("Programmet fortsætter uden at stoppe 😊");
    }
}
