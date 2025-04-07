static final int SQUARE_SIZE = 100;
int [][]grid;


//The setup() function is run one time at the start of your program.
//You can initialize instance variables here after you set the size.


void setup() {
 
  size(615, 515);
  //this grid must be of dimensions: int[width/SQUARE_SIZE][height/SQUARE_SIZE]
  //columns map to X, rows map to Y
  grid=new int[][] { {1, 1, 1, 0, 1, 1 },
                     {1, 0, 1, 0, 0, 0 },
                     {1, 1, 1, 1, 1, 0 },
                     {0, 0, 0, 1, 1, 0 },
                     {1, 1, 0, 0, 0, 0 } };
 

  //ALTERNATE INITIALIZATION:
  //After you test the above array:
  //change this in the constant above:
  //int SQUARE_SIZE = 20;
  //grid = new int[height/SQUARE_SIZE][width/SQUARE_SIZE];
  //optionally loop over the array and assign random 1/0 values.
}

/**1. Fill the screen with Black Squares with a white border
  *this is a practice method to help you with part 2.
  *The intended behavior is to only place squares that fit on the screen, not partial ones on the edge.
  *When the square size is 100,there should be a 15 pixel gap on the right and bottom sides of the window.
  *Remember that arrays use r,c, but positional methods use (x,y) which translates to (c,r) in this case.
  */
void grid() {
  for (int i = 0; i + SQUARE_SIZE < width; i+= SQUARE_SIZE)
  {
    for (int k = 0; k + SQUARE_SIZE < height; k += SQUARE_SIZE)
    {
      fill(0);
      square(i,k, SQUARE_SIZE);
    }
  }
}

/**2. Fill the screen with Squares with a white border
 *When the corresponding value of colors is 0, fill with color(100)
 *When the corresponding value of colors is not 0, fill with color(200)
 */
void grid(int[][]colors) {
    for (int i = 0; i < grid.length; i++)
  {
    for (int k = 0; k < grid[0].length; k++)
    {
        if (grid[i][k] == 0) fill(100);
        else fill(200);
      square(k * SQUARE_SIZE, i * SQUARE_SIZE, SQUARE_SIZE);
    }
  }
}
 


//The draw() function is run repeatedly after setup() is run once.
//This method is limited to 60 times per second, but can run slower
//The method only stops when you exit the program.
void draw() {
  //test your two grid methods here!
  //grid();
  grid(grid);//switch over to this after part 1 works.
}

/**3. when you click on a square, change the corresponding value in the grid[][] array.
*click will toggle 1 and 0.
*You must calculate which square based on the current mouse position variables (mouseX and mouseY).
*When you click this will toggle the color being displayed by your grid(int[][]) method.
*You must switch to the  grid(int[][]) method in your draw() before testing this method.
*/
void mouseClicked() {
  int x = mouseY / SQUARE_SIZE;
  int y = mouseX / SQUARE_SIZE;
  grid[x][y] = grid[x][y] == 0? 1 : 0;

}
