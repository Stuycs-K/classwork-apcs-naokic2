import java.util.ArrayList;
public class D1 {
  int N;
  int S;
  int W;
  int E;

  public static String direction_out(String direction,String step) {
    ArrayList<String> dir = new ArrayList<String>(4);
    dir.add("N");
    dir.add("E");
    dir.add("S");
    dir.add("W");

      if (step.equals("R")) {
        if (dir.indexOf(direction) < 3) {
          return dir.get(dir.indexOf(direction) + 1);
        }
        else {
            return dir.get(0);
          }

      }
      else {
        if (dir.indexOf(direction) > 0) {
          return dir.get(dir.indexOf(direction) - 1);
        }
        else {
          return dir.get(3);
        }
      }


  }

}
