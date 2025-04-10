import java.util.*;
public class Frontier{
    private ArrayDeque<int[]> frontier;
    private boolean stack;
    public Frontier(boolean isStack){
        frontier = new ArrayDeque<int[]>();
        stack = isStack;
    }
    public int[] remove(){
        return frontier.removeLast();
    }

    public int size(){
        return frontier.size();
    }

    public void add(int[] val){
      if(stack){
        frontier.addLast(val);
      }
        frontier.addFirst(val);
    }
    
    public int[] peek(){
     return frontier.peekFirst(); 
    }

}
