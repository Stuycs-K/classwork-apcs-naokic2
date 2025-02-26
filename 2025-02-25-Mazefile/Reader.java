import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class Reader{
  public static void main(String[] args) {
    try {
      System.out.println(Arrays.deepToString(getValues("maze1.txt")));
  } catch (FileNotFoundException e) {
      System.out.println("File not found: maze1.txt");
      e.printStackTrace(); // Optional: Print the stack trace for debugging
  }
  }



  public static String[][] getValues(String filename) throws FileNotFoundException{
    Scanner text = new Scanner( new File(filename));
    ArrayList<String> lines = new ArrayList<String>();
    while(text.hasNextLine()){
      String line = text.nextLine();
      if(line.length() != 0){
        lines.add(line);
    }
    }
    String[][] maze = new String[lines.size()][lines.get(1).length()];
    for(int i = 0; i < lines.size(); i++){
      String x = lines.get(i);
      for(int j = 0; j < x.length(); j++){
        maze[i][j] = String.valueOf(x.charAt(j));
      }
    }


    return maze;
  }



}
