public class MyArrays{
  public static void main(String[] args) {
    int[] x = {1,4,6,8};
    int[] z = {2,3,6,9};
    System.out.println(arrayToString(x));
    Boolean y = (returnCopy(x) == x);
    System.out.println("should be false:" + y);
    System.out.println(concatArray(x, z));
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

    public static int[] concatArray(int[]ary1,int[]ary2) {
      int[] output = new int[ary1.length + ary2.length - 2];
      int index = 0;
      for(int i=0;i< ary1.length;i++) {
        output[index] = ary1[i];
        index += 1;
      }
      for(int i=index;i<ary1.length + index; i++) {
        output[index] = ary2[i];
        index += 1;
      }
      return output;
    }

}
