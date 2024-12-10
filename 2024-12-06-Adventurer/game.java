import java.util.Scanner;
public class game{
  public static void main(String[] args) {

    Scanner userInput = new Scanner(System.in);

    //You can do the rest many times:

    System.out.println("Enter username");
    //Read one line of user input
    String userName = userInput.nextLine();
    //Do something with the input
    System.out.println("Username is: " + userName);

    Adventurer player = new Wizard(userName,10);
    Adventurer foe = new CodeWarrior("Mr.K",10);
    while(player.getHP > 0 && foe.getHP > 0) {
      String HP = player.getHP + "/" + player.getmaxHP + " HP";
      String Special = player.getSpecial + "/" + player.getSpecialMax + " HogwartsPoints";
      System.out.println(player.getName + ", " + HP + ", " + Special);

      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");

      String action = userInput.nextLine();

      if (action.equals("a")) {
        player.attack(foe);
      }
      if (action.equals("sp")) {
        player.specialAttack(foe);
      }
      if (action.equals("su")) {
        player.support();
      }
      if (action.equals("quit")) {
        return;
      }

  }

}
}
