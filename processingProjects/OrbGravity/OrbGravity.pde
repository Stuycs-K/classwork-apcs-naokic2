
ArrayList<Orb>orbList;
Orb earth, center;
static double G = 20;
static int ORBIT = 0;
static int EARTH = 1;
static int OFF = 2;
static int MODE = EARTH;
static float SPRING_CONSTANT = 0.1;
static float SPRING_LENGTH = 100;
static boolean SPRING = false;
static boolean BOUNCE = false;
static boolean CLEAR_BACKGROUND = true;
static boolean change = false;
/**
 *IN THIS TAB: MODIFY YOUR SETUP BEFORE YOU EDIT ORB
 */

void setup() {
  size(1200, 900);
  //CHANGE THIS
  //make an orb at the center of the screen with a mass of 100.
  //note: Orb Constructor parameters: x,y,xSpeed,ySpeed,radius,mass
  center = new Orb(width/2,height/2,0,0,40,3);
  
  //CHANGE THIS
  //make earth (mass of 500million) place it very far off the bottom of the screen
  earth = new Orb(600, 1000000, 0,0,1,500000000);


  //DO NOT CHANGE THIS:
  orbList = new ArrayList<Orb>();
}
void mouseClicked() {
  orbList.add(new Orb(mouseX, mouseY, 1, 0, 20, 10));
  change = true;
}

void keyPressed() {
 
  if(key == ' '){
  MODE++;
  MODE%=3;
  }
  if(key == 'b'){
    BOUNCE = !BOUNCE;
  }
  if(key == 's'){
    SPRING = !SPRING;
  }
  if(key == 'c'){
    CLEAR_BACKGROUND = !CLEAR_BACKGROUND;
  }
}
void draw() {
  if(CLEAR_BACKGROUND){
  background(255);
  }


  for (Orb o : orbList) {
    o.move();
    o.display();
    if(SPRING){
        o.springAttract(center); 
    }
    if (MODE==EARTH)
      o.applyForce(o.attractTo(earth));
      
    if (MODE==ORBIT)
      o.applyForce(o.attractTo(center));
  }
  
  if (MODE==ORBIT || SPRING)
    center.display();
  fill(0);
  
  

  if (MODE==ORBIT)
  
    text("Orbit Mode", 20, 20);
  if (MODE==EARTH)
    text("Earth Mode", 20, 20);
  if (MODE==OFF)
    text("OFF", 20, 20);
  if(SPRING){
    text("SPRING = ON", 20,40);
  } else{
    text("SPRING = OFF", 20,40);
  }
  if(BOUNCE){
    text("BOUNCE = ON", 20,60);
  }else{
    text("BOUNCE = OFF", 20,60);
  }
  if(CLEAR_BACKGROUND){
    text("CLEAR BACKGROUND = ON",20,80);
  }else{
   text("CLEAR BACKGROUND = OFF",20,80); 
  }
  text(orbList.size(), 100, 20);

}
