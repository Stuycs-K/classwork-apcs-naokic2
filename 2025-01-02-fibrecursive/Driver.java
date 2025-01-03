public class Driver {
  public static void main(String[] args) {
    System.out.println(fib(50));


    makeWords(3,"","abc");
  }
  public static int fib(int n) {
    if(n<2) {return n;}
    return fib(n-1) + fib(n-2);
  }

  public static void makeWords(int remainingLetters, String result, String alphabet){
    if (remainingLetters == 0) {
      System.out.println(result);


    }
    String[] alphabet1 = alphabet.split("");
    for(int i=0;i<alphabet.length();i++) {

      makeWords(remainingLetters - 1, result + alphabet1[i], alphabet);
    }
  }




}
