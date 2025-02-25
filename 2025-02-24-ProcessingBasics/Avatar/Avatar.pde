//draw a face/creature/person/whatever at location x,y
void avatar(int x, int y){
  fill(270, 230, 200);
  ellipse(x-2, y+15, 50, 60);
  
  rect(x-10,y+40,15,30);
  
  fill(70,90,200);
  ellipse(x-13,y+3,10,6);
  ellipse(x+10,y+3,10,6);
  
  rect();

  fill(0, 0, 255); 
  rect(x-50, y+60, 100, 130);
  
}

//setup will draw two of your avatars.
void setup(){
         size(800,800);
         background(255);
         avatar(200,200);
         avatar(600,600);
}
