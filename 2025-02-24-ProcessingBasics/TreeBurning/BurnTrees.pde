import java.util.*;

public class BurnTrees{
  private int[][]map;
  private int ticks;
  private static final int TREE = 2;
  private static final int FIRE = 1;
  private static final int ASH = 3;
  private static final int SPACE = 0;
  private boolean done = false;
  private Frontier fire = new Frontier(false);


  /*Determine if the simulation is still burning
   *@return false if any fires are still burning, true otherwise
   */
  public boolean done(){
    //YOU MUST IMPLEMENT THIS METHOD
    //(BEFORE WRITING ANY CODE READ ALL OF THE CODE AND SEE HOW IT FITS TOGETHER)
    //HINT: do not check the board for fire which is an n^2 operation

    return fire.size() == 0;//placeholder for compilation purposes
  }

  /*This is the core of the simulation. All of the logic for advancing to the next round goes here.
   *All existing fires spread new fires, and turn to ash
   *new fires should remain fire, and not spread.
   */

      public void checkF(int i, int x){
     if(i<(map.length-1) && map[i+1][x] == 2){
       fire.add(new int[]{i+1,x});
       map[i+1][x] = 1;
     }
     if(i > 0 && map[i-1][x] == 2){
       fire.add(new int[]{i-1,x});
       map[i-1][x] = 1;
     }
     if(x>0 && map[i][x-1] == 2){
       fire.add(new int[]{i,x-1});
       map[i][x-1] = 1;
     }
     if(x<(map[0].length-1) && map[i][x+1] == 2){
       fire.add(new int[]{i,x+1});
       map[i][x+1] = 1;
     }
   }

   public void tick(){
       int[] temp = fire.remove();
       checkF(temp[0],temp[1]);
       map[temp[0]][temp[1]] = ASH;
       if(fire.size() == 0){
         done = true;
       }
     ticks++;//leave this here.

     //YOU MUST IMPLEMENT THE REST OF THIS METHOD
     //(BEFORE WRITING ANY CODE READ ALL OF THE CODE AND SEE HOW IT FITS TOGETHER)
   }

  /***********************YOU MIGHT UPDATE THIS**************************/

  /*Initialize the simulation.
   *If you add more instance variables you can add more here,
   *otherwise it is complete
   */



  public BurnTrees(int width,int height, double density){
    map = new int[height][width];
    for(int r=0; r<map.length; r++ ){
      for(int c=0; c<map[r].length; c++ ){
        if(Math.random() < density){
           map[r][c]=TREE;
           
         }
       }
     }
     start();//set the left column on fire.
  }


  /*
   *Sets the trees in the left column of the forest on fire
   */
  public void start(){
    //If you add more instance variables you can add more here,
    //otherwise it is complete.
    for(int i = 0; i < map.length; i++){
      if(map[i][0]==TREE){
        map[i][0]=FIRE;
        fire.add(new int[]{i,0});
        System.out.println(Arrays.toString(fire.peek()) + "hi");
      }
    }
  }







  /***********************DO NOT UPDATE THINGS BELOW HERE**************************/

  /*DO NOT UPDATE THIS
   *PLEASE READ SO YOU SEE HOW THE SIMULATION IS SUPPOSED TO WORK!!!
   */
  public int run(){
    while(!done()){
      tick();
      System.out.println("hello");
    }
    return getTicks();
  }


  /*DO NOT UPDATE THIS*/
  public int getTicks(){
    return ticks;
  }





  /*DO NOT UPDATE THIS*/
  public int outputAll(){
    System.out.println(toString());
    while(!done()){
      tick();
      System.out.println(toString());
    }
    return getTicks();
  }


}
