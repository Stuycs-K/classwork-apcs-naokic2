//draw a face/creature/person/whatever at location x,y
void avatar(int x, int y){
  fill(270, 230, 200);
  ellipse(x-2, y+15, 50, 60);
  
  rect(x-10,y+40,15,30);
  
  fill(70,90,200);
  ellipse(x-13,y+3,10,6);
  ellipse(x+10,y+3,10,6);
  
  rect(x-11,y+20,20,7);

  fill(99, 81, 0);
  rect(x-50, y+60, 100, 130);
  fill(99, 81, 200);
  rect(x-70, y+60, 20, 90);
  rect(x+50, y+60, 20, 90);
  rect(x+30, y+190, 20, 90);
  rect(x-50, y+190, 20, 90);
}

//setup will draw two of your avatars.
void setup(){
         size(1000,1000);
         background(255);
         avatar(200,200);
         avatar(600,600);
}
