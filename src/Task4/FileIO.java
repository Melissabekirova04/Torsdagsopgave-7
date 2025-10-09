package Task4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileIO {

    public String laesFilIndhold(String filnavn) throws FileNotFoundException {
        File fil = new File(filnavn);
        Scanner filScanner = new Scanner(fil);

        StringBuilder indhold = new StringBuilder();

        while (filScanner.hasNextLine()) {
            indhold.append(filScanner.nextLine()).append("\n");
        }

        filScanner.close();
        return indhold.toString();
    }
}


