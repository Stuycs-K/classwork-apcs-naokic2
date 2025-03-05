import java.util.math.random;
public class Preliminary{
public static void main(String[] args) {

}


/**Modify the array as per the partition algorithm discussed in class
*@param data is the array to partition
*@param lo is the leftmost index of the array (inclusive)
*@param hi is the rightmost index of the array (inclusive)
*@return the index of the final position of the pivot element.
*/
public static int partition( int [] data, int lo, int hi){
  int v;
  int a;
  int b;

  int seed = (Math.random() * data.length());
  int temp = data[0];
  data[0] = data[seed];
  data[seed] = temp;
  while(a<b){
  int v = data[v];
}




}
}
