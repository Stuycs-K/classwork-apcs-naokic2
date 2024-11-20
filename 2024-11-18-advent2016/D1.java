import java.util.ArrayList;
public class D1 {



  public static ArrayList<String> solve(ArrayList<String> list) {
    ArrayList<String> dlist = new ArrayList<String> (list.size());
    for(int i=0;i<list.size();i++){
      dlist.set(i, (list.get(i).substring(0,1)));
    }
    int dir = 0;
    int[] move = {0,0};
    return dlist;

}

public static void toString(String[][] d) {
  for(int i=0;i<d.length;i++) {
    System.out.println(d[i][0] + "--" + d[i][1]);
  }
}
public static void main(String[] args) {
  ArrayList<String> list = filereader.reader();
  System.out.println(list.size());
  System.out.println(solve(list));
}
}
