int width = 300;
  int x = 200;
  int x2 = 300;
  int speed = 3;
  int speed1 = 3;
  int speed2 = -3;
void setup() {
  size(600,600);
}

void draw() {
  
  // Go to the recipe to run the demonstration before starting this program
  
  /*
  Use the code from your Bullseye program to draw the rings shown in this recipe.
  You can use the noFill() command to make your ellipses transparent.
  Make the rings move past each other.
  When the rings hit the side of the sketch, make them reverse their direction.
  */
background(148, 161, 237);
   x=x+speed1;
   x2=x2+speed2;
   
  for(int i = 0; i<30; i++) {
    noFill();
    ellipse(x, 250, width, width);
    width -= 10;
  }
  
  for(int i = 0; i<30; i++) {
    ellipse(x2, 250, width, width);
    width -= 10;
  }
  
  width = 300;
  if (x>=600) {
    speed1 = speed1*-1;
  }
  else if(x<0) {
    speed1 = speed1*-1;
  }
  
  
  
  if( x2< 0) {
    speed2 = speed2*-1;
  }
  else if(x>=600) {
    speed2 = speed2*-1;
  }
    

}
