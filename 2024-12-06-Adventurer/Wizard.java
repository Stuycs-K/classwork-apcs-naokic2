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
  public int getSpecialMax(){
    return 100;
  }
  //hurt or hinder the target adventurer
  public String attack(Adventurer other){
    other.applyDamage(1);
    return "Used attack! dealt 1 damage!";
  }

  //heall or buff the target adventurer
  public String support(Adventurer other){
    other.restoreSpecial(5);
    return "You have healed " + other + "5 points!";
  }

  //heall or buff self
  public String support(){
      restoreSpecial(5);

      return "You have: " + HogwartsPoints + " many hogwarts points.";
  }

  //hurt or hinder the target adventurer, consume some special resource
  public String specialAttack(Adventurer other){
    if(HogwartsPoints >= 10){
      other.applyDamage(3);
      HogwartsPoints -= 10;
      return "Used special attack! dealt 3 damage, but consumed 10 Hogwarts Points! You have: " + HogwartsPoints + " many points left.";
    } else {
      return "Insufficient HogwartsPoints.";
    }
  }




}
