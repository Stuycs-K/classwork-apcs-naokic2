import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class Reader{
  public static void main(String[] args) {

  }



  public static int[][] getValues(String filename) throws FileNotFoundException{
    Scanner text = new Scanner( new File(filename));
    ArrayList<String> lines = new ArrayList<String>;
    while(text.hasNextLine()){
      String line = text.nextLine();
      if(line.length() != 0){
      maze.add(line);
    }
    }
    int[][] maze = new int[lines][lines.size()];



  }



}
