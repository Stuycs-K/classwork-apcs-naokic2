/*1.
The size of the x val and y val of the screensize must be divisible by the row# and col#, respectively.
*2.
width/x, height/y
*3.
adding delay
*4.

*/

/**IMPORTANT:
 *Please read through the logic of this sketch before you try to modify anything.
 *Please answer ALL questions in the source code BEFORE writing any code.
 */
TreeSim treeSim;
int ROWS;
int COLS;
double DENSITY;
int SQUARESIZE;

void setup() {
  size(600, 600);
  ROWS = 60;
  COLS = 60;
  SQUARESIZE = 10;
  /**question 1 *********************************
   *At this point you have initialized width, height,ROWS,COLS. You can change these values
   *to alter the screen size, but you cannot just change one value!
   *What must be true about the ratio of these values in order for this simulation to display squares?
   *ANSWER ON THE TOP IN ANSWER SLOT 1.
   */

  DENSITY = 0.65;
  //width is cols, or x.
  treeSim = new TreeSim(ROWS, COLS);

  /**question 2 *********************************
   *Given that you can change the size() and the number of ROWS and COLS,
   *How do you calculate the SQUARESIZE (size of each square you draw) using an expression?
   *ANSWER : replace squareSize = 8; with the correct square size.
   * DO NOT just write a number, it must work when you change the size() command or the ROWS and COLS
   */
  //COPY YOUR CHANGED LINE TO THE TOP IN ANSWER SLOT 2.


}

/*DO NOT UPDATE THIS METHOD*/
void draw() {
  
  //frameCount tells you how many times the draw method was called.
  if (!treeSim.done() && frameCount % 1 == 0) {
    treeSim.tick();
    //println("Frame number: "+ frameCount);
  }
  /**question 3 *********************************
   *Here we only call tick() when the frameCount % 10 == 0.
   *Why do we want to do this?
   *(The print statement is NOT part of the simulation, it is to help you answer this question)
   *hint:  If you cannot figure this out analytically, experiment to test
   *       the difference by changing the code. A print statement is commented out to facilitate testing.
   *ANSWER ON THE TOP IN ANSWER SLOT 3.
   */



  //Convert the 2D array into a grid of RED/GREEN/WHITE/GREY Squares.

    background(0);
  drawSquares(treeSim);
  
  //Output the resulting time and dimensions of the simulation
  if (treeSim.done()) {
     fill(0);
     rect(0, 0, 400, 20);
     textSize(20);
     fill(255);
     text("Simulation of "+COLS+" by "+ROWS+" board lasted "+treeSim.getTicks()+" ticks", 20, 20);
  }
}

/**
 *Clicking the mouse will reset the simulation by re-constructing the treeSim variable.
 */
void mouseClicked() {
  /**question 4 *********************************
   *We can easily reset the simulation by clicking the mouse.
   *Please use the same values that it was initialized with in the setup.
   * ANSWER: UPDATE THE NEXT LINE THEN COPY IT TO THE TOP IN ANSWER SLOT 4.
   */
  treeSim = new TreeSim(ROWS, COLS);
}


/** question 5 *********************************
 *Write the method that will draw ROWSxCOLS colored squares on the screen
 *@param treeSim: a BurnTrees Object to be drawn
 *ANSWER: Complete this method. (DO NOT COPY THIS TO THE TOP!)
 */
void drawSquares(TreeSim treeSim) {
  for(int r=0;r<ROWS;r++){
    for(int c=0;c<COLS;c++){

      int state = treeSim.map[r][c];
      if(state == 1){
        fill(255,0,0);
      }
      if(state == 2){
        fill(0,255,0);
      }
      if(state == 3){
        fill(100,100,100);
      }
      if(state == 0){
        fill(0,0,0);
      }
      square(c*SQUARESIZE,r*SQUARESIZE,SQUARESIZE);
    }}
  
  /**Complete this method.
     *1. Break up your screen by drawing ROWSxCOLS squares of the same color.
   *   URGENT: Use meaningful variable names for your loops here, not just i,j !
   *2. Decide how to fill them in using the treeSim object.
   *   Colors: Fire = RED, Tree = GREEN, SPACE = BLACK, ASH = GREY
   *3. You can use the array directly (treeSim.map) because it is in the same java file (sketch).
   */
}
