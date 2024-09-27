public class MyArrays{
  public static void main(String[] args) {
    int[] x = {1,4,6};
    System.out.println(arrayToString(x));
    Boolean y = (returnCopy(x) == x);
    System.out.println("should be false:" + y);
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



    public static int[] returnCopy(int[] ary){
      int[] output = new int[ary.length];
      for(int i=0;i<ary.length;i++) {
        output[i] = ary[i];
      }
      return output;

    }


}
