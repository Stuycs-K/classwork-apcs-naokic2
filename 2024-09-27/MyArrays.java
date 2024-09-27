public class MyArrays{
  public static void main(String[] args) {
    int[] x = {1,4,6};
    System.out.println(arrayToString(x));

  }

  public static String arrayToString(int[] arr) {
    String x = "[";
    for(int i=0;i<arr.length-1;i++) {
      x += arr[i];
      x+= ", ";
    }
    x = x + arr[arr.length - 1] + "]";
    return x;
  }
}
