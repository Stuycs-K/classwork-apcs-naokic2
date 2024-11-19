import java.util.ArrayList;
public class D1 {



  public static void solve(ArrayList<String> list) {
    String [][] dlist= new String[list.size()][2];
    for(int i=0;i<list.size();i++){
      dlist[i][0] = (list.get(i)).substring(0,1);
      dlist[i][1] = list.get(i).substring(1);
    }
    int dir = 0;
    int[] move = {0,0};
    System.out.println(dlist);

}

public static void toString(String[][] d) {
  for(int i=0;i<d.length;i++) {
    System.out.println(d[i][0] + "--" + d[i][1]);
  }
}
public static void main(String[] args) {
  ArrayList<String> list = filereader.reader();
  solve(list);
}
}
