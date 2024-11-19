import java.util.ArrayList;
import java.util.Scanner;
public class filereader { 

    public static String[][] reader(Scanner scanner) {
        
        
        
        ArrayList<String> list = new ArrayList <String>(10);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] part = line.split(", ");
            for (int i = 0; i < part.length; i++) {
                list.add(part[i]);
            }
            }
            return list;
        }
        
    }
