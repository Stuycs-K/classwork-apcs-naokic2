import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class Reader{
  public static void main(String[] args) {

  }



  public static int[][] getValues(String filename) throws FileNotFoundException{
    Scanner text = new Scanner( new File(filename));
    while(text.hasNextLine()){
      String line = text.nextLine();
      ArrayList<String> line = new ArrayList<String>;
      if(line.length() != 0){
        line.add()

      }
      ArrayList<ArrayList<String>> maze = new ArrayList<Arraylist<String>>;
      maze.add(line);
    }


  }



}
