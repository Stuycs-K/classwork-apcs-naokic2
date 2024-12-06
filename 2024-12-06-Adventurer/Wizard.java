public class Wizard extends Adventurer{
  private int HogwartsPoints;
  public Wizard(String name, int hp) {
    super(name, hp);
  }
  public Wizard(String name){
    super(name);
  }

  //Abstract methods are meant to be implemented in child classes.

  /*
    all adventurers must have a custom special
    consumable resource (mana/rage/money/witts etc)
  */
  //give it a short name (fewer than 13 characters)
  public String getSpecialName() {
  return "Hogwarts Points";
  }
  //accessor methods
  public int getSpecial() {
    return HogwartsPoints;
  }
  public void setSpecial(int n){

    HogwartsPoints = n;
  }
  public int getSpecialMax()
    return 100;
  }
  //hurt or hinder the target adventurer
  public abstract String attack(Adventurer other){

  }

  //heall or buff the target adventurer
  public abstract String support(Adventurer other){

  }

  //heall or buff self
  public abstract String support(){

  }

  //hurt or hinder the target adventurer, consume some special resource
  public abstract String specialAttack(Adventurer other){
    
  }




}
