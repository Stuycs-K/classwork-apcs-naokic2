//draw a face/creature/person/whatever at location x,y
void avatar(int x, int y){
  fill(270, 230, 200);
  rect(x-25, y, 50, 60);

  
}

//setup will draw two of your avatars.
void setup(){
         size(800,800);
         background(255);
         avatar(200,200);
         avatar(600,600);
}
