import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.io.FileReader;

public class D5 {

    public static void main(String[] args) {
    ArrayList<String> lists = filereader.reader();

    String[] list = new String[lists.size()];
    for (int i = 0; i < lists.size(); i++) { 
        list[i] = lists.get(i);
    }

        char[][] keypad = {
                {'1', '2', '3'},{'4', '5', '6'},{'7', '8', '9'}};
        int Row = 1;
        int Col = 1;
        String finals = "";

        for (int i=0;i<list.length;i++) {
            for (int x = 0; x < list[i].length(); x++) {
                char move = list[i].charAt(x);
                int nextR = Row;
                int nextC = Col;

                if (move == 'U') {
                    nextR--;
                } else if (move == 'D') {
                    nextR++;
                } else if (move == 'L') {
                    nextC--;
                } else if (move == 'R') {
                    nextC++;
                }

                if ((nextR >= 0 && nextR < 3) && (nextC >= 0 && nextC < 3)) {
                    Row = nextR;
                    Col = nextC;
                }
            }
            finals += (keypad[Row][Col]);
        }

        System.out.println(finals);
    }
}