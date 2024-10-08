import java.util.Arrays;
public class ArrayDemo{
  public static void main(String[]args){
    int[] x = {1,4,6,8};
    int[][] testcase = {{2,3,4}, {4,3,2}, {33,23,42}};
    int[][] testcase2 = {{2,3,4}, {4,3}, {33,23,42}};
    System.out.println(arrayToString(x) + " -arrtostring1d test");
    System.out.println(arrToString(testcase) + " -arrtostring2d test1");
    System.out.println(arrToString(testcase2) + " -arrtostring2d test2");
    System.out.println(arr2DSum(testcase) + " -arr2dsum test1");
    System.out.println(arr2DSum(testcase2) + " -arr2dsum test2");
    System.out.println(swapRC(testcase) + " -swapRc test1");
    System.out.println(swapRC(testcase2) + " -swapRc test2");
    System.out.println(arrToString(copy(testcase)) + " -copy test1");
    System.out.println(arrToString(copy(testcase2)) + " -copy test2");
    //write your tests here!
    //You can now use Arrays.toString(yourArray) instead of writing arrayToString again.
    //Compare Arrays.toString(yourArray) to YOUR arrayToString() method to make sure yours is correct
    //do not use any other Arrays.method()

  }

  //0. Include your prior methods to help you print a 1D/2D array of ints.
  public static String arrayToString(int[] arr) {       // turns 1d arr to string
    String x = "[";
    for(int i=0;i<arr.length-1;i++) {
      x += arr[i];
      x+= ", ";
    }
    x = x + arr[arr.length - 1] + "]";
    return x;
  }

  //The name of different methods can be the same,
  //as long as the parameters are different! (type and/or quantity must be different)
  //Pro tip: you should be using your 1D arrToString in this method!
  public static String arrToString(int[][] arr) {        // turns 2d arr to string
      String finale = "[";
    for(int i = 0; i < arr.length - 1; i++)
    {
      finale += arrayToString(arr[i]) + ", ";
    }
    finale += arrayToString(arr[arr.length-1]) + "]";
    return finale;
  }

  //1. Calculate and return how many elements equal zero in the 2D array.
  public static int countZeros2D(int[][] nums){
    return 0;
  }

  //2. Calculate the sum of a 2d array
  /*Return the sum of all of the values in the 2D array
   *Use a nested loop instead of a helper method*/
   public static int arr2DSum(int [][]nums) {             // returns sum of all values in 2d arr
     int sum =0;
     for(int i=0; i <nums.length;i++) {
       for(int x=0; x <nums[i].length;x++) {
         sum += nums[i][x];
       }
     }
     return sum;
   }

  //3. Modify a given 2D array of integer as follows:
  //Replace all the negative values:
  //-When the row number is the same as the column number replace
  //that negative with the value 1
  //-All other negatives replace with 0
  public static void replaceNegative(int[][] vals){

  }

  //4. Make a copy of the given 2d array.
  //When testing : make sure that changing the original does NOT change the copy.
  //DO NOT use any built in methods that "copy" an array.
  //You SHOULD write a helper method for this.
  //If you don't see a good way to do that, you should stop and look at prior methods.
  public static int[] rowCopy (int[] row) {
    int[] copy = new int [row.length];
    for(int i=0;i<row.length; i++) {
      copy[i] = row[i];
    }
    return copy;
  }
  
  public static int[][] copy (int[][] nums) {        
    int ref_len = nums.length;
    int[][] copy = new int[ref_len][];
    for(int i=0;i< ref_len;i++) {
      copy[i] = rowCopy(nums[i]);
    }
    return copy;
  }
  
  

  //5. Rotate an array by returning a new array with the rows and columns swapped.
  //   You may assume the array is rectangular and neither rows nor cols is 0.
  //   e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  public static int[][] swapRC (int[][] nums){           // exchanges rows/columns of array. (references and size)
    int[][] output = new int [nums[0].length][nums.length];
    for(int i=0;i<nums[0].length;i++) {
      for(int x=0;x<nums.length;x++) {
        output[i][x] = nums[x][i];
      }
    }
    return output;
  }

  //6. Make an HTML table by putting a table tag around the entire 2d array,
  //   tr tags around each row, and td tags around each value.
  //   You may use a helper method
  //   Note there is no whitespace in the string, it all one line with no spaces/tabs.
  //   e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
  // "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"
  public static String htmlTable(int[][]nums){
    return "";
  }
}
