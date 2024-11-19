import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class filereader {

    public static ArrayList reader() {

      try {
          File file = new File("values_D1.txt");//1
          Scanner input = new Scanner(file);

          ArrayList<String> list = new ArrayList <String>(10);
          while (input.hasNextLine()) {
              String line = input.nextLine();
              String[] part = line.split(", ");
              for (int i = 0; i < part.length; i++) {
                  list.add(part[i]);
              }
              }
              return list;


        } catch (FileNotFoundException ex) {
            //File not found what should you do?
            System.out.println("File not found");
            return null; //you can return from a void function just don't put a value.
          }

        }

public static void main(String[] args) {
  reader();

}

    }
