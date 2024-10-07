public class ArrayMethods {

public static void main(String[]args) {        //testing functions

  int[] x = {1,4,6,8};
  int[] z = {2,3,6,9};
  System.out.println(arrayToString(x));
  System.out.println(arrayToString(z));
  int[][] testcase = {{2,3,4}, {4,3,2}, {33,23,42}};
  int[][] testcase2 = {{2,3,4}, {4,3}, {33,23,42}};
  System.out.println(arrToString(testcase));
  System.out.println(arr2DSum(testcase));
  System.out.println(arrToString(swapRC(testcase)));
  System.out.println(arrToString(copy (testcase2)));
  

}



public static String arrayToString(int[] arr) {       // turns 1d arr to string
  String x = "[";
  for(int i=0;i<arr.length-1;i++) {
    x += arr[i];
    x+= ", ";
  }
  x = x + arr[arr.length - 1] + "]";
  return x;
}

public static String arrToString(int[][] arr)         // turns 2d arr to string
{
    String finale = "[";
  for(int i = 0; i < arr.length - 1; i++)

  {
    finale += arrayToString(arr[i]) + ", ";

  }

  finale += arrayToString(arr[arr.length-1]) + "]";
  return finale;

}

public static int arr2DSum(int [][]nums) {             // returns sum of all values in 2d arr
  int sum =0;
  for(int i=0; i <nums.length;i++) {
    for(int x=0; x <nums[i].length;x++) {
      sum += nums[i][x];
    }
  }
  return sum;
}


public static int[][] swapRC (int[][] nums){           // exchanges rows/columns of array. (references and size)
  int[][] output = new int [nums[0].length][nums.length];
  for(int i=0;i<nums[0].length;i++) {
    for(int x=0;x<nums.length;x++) {
      output[i][x] = nums[x][i];
    }
  }
  return output;
}

public static void replaceNegative(int[][] vals) {     //replaces all neg #'s with 0 unless row & column are the same, then replaces with 1
  for(int i =0;i<vals.length;i++) {
    for(int x=0;x<vals[i].length;x++) {
      if(vals[i][x] < 0) {
        if(x == i) {
          vals[i][x] = 1;
        }
        vals[i][x] = 0;
      }
    }
  }
}




public static int[] rowCopy (int[] row) {
  int[] copy = new int [row.length];
  for(int i=0;i<row.length; i++) {
    copy[i] = row[i];
  }
  return copy;
}


