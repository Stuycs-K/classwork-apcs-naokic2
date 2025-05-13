public class Kernel {
  float[][]kernel;

  /**Constructor takes the kernel that will be applied to the image
  *This implementation only allows 3x3 kernels
  */
  public Kernel(float[][]init) {
    kernel = init;
  }

  /**If part of the kernel is off of the image, return black, Otherwise
  *Calculate the convolution of r/g/b separately, and return that color\
  *if the calculation for any of the r,g,b values is outside the range
  *     0-255, then clamp it to that range (< 0 becomes 0, >255 becomes 255)
  */
  color calcNewColor(PImage img, int x, int y) {
    float r =0;
    float g = 0;
    float b=0;
    
    for(int i = -1; i< 2;i++){
      for(int n = -1; n< 2;n++){
        if(poss(x + i, y + n)){
          float scal = kernel[n+1][i+1];
          color place = img.get(x, y);
          r += red(place) * scal;
          g += green(place) * scal;
          b += blue(place)*scal;
      }
    }
    }
    
    
    return color(r,g,b);
  }
    //Hint: start by always returning black.
    //This will let you test your apply method right away!

  
Boolean poss( int x,int y){
  if(x > -1 && x < kernel[0].length)
  {return true;
}
  if(y > -1 && y < kernel.length){
    return true;
  }
   return false;
}

  /**You must write this method that applies the kernel to the source,
  *and saves the data to the destination.*/
  void apply(PImage source, PImage destination) {
    for(int x =0;x < source.width;x ++){
      for(int y =0;y < source.width;y ++){
        destination.set(x,y,calcNewColor(source,x,y));
  }
  }

}
}
