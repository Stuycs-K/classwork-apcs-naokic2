import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class D1_1 {

    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("D7_input.txt");
        String compress = readFile(input);
        int len = decompress(compress);
        System.out.println(len);
    }

    public static String readFile(File file) throws FileNotFoundException {
        String content = "";
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            content += scanner.nextLine();
            }
        scanner.close();
        return content;
    }

    public static int decompress(String compress) {
        int len = 0;
        int i = 0;

        while (i < compress.length()) {
            if (compress.charAt(i) == '(') {
                int markerStart = i;
                 int markerEnd = compress.indexOf(')', i);
                String marker = compress.substring(markerStart + 1, markerEnd);
                String[] parts = marker.split("x");
                int chars = Integer.parseInt(parts[0]);
                int Count = Integer.parseInt(parts[1]);
                String repeat = compress.substring(markerEnd + 1, markerEnd + 1 + chars);
                 len += repeat.length() * Count;
                i = markerEnd + 1 + chars;
            } else {
                len++;
                i++;
            }
        }
        return len;
    }
}