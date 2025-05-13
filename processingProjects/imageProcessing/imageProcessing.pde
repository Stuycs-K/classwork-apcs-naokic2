  String[]names;
  Kernel[]kernels;
  int currentKernel;
  PImage car,destination;
  //you can have other instance variables here

  void draw(){
    
    
    //Required to have the sketch allow for keyPressed()
    //You don't need code here.
  }

  void keyPressed(){
    currentKernel = (currentKernel + 1) % kernels.length;
    Kernel select = kernels[currentKernel];
    PImage car = loadImage("redcar.png");
  PImage output = car.copy();
    select.apply(car,output);
    image(output,car.width,0);
    //write code to cycle through kernel here
  }

  void setup(){
    size(1450,500);
  PImage car = loadImage("redcar.png");
  PImage output = car.copy();
    
    //you will still need your old initialization here
    //including drawing your starting images.
    currentKernel = 0;
    names = new String[]{
      "Identity", "Blur", "Sharpen",
      "Outline", "Left Sobel", "Right Sobel",
      "Top Sobel", "Emboss"
    };

    kernels = new Kernel[] {
      new Kernel( new float[][] {
        {0, 0, 0},
        {0, 1, 0},
        {0, 0, 0}
      }) ,
      new Kernel( new float[][] {
        {.111, .111, .111},
        {.111, .111, .111},
        {.111, .111, .111}
      }) ,
      new Kernel( new float[][] {
        {0, -1, 0},
        {-1, 5, -1},
        {0, -1, 0}
      }) ,
      new Kernel( new float[][] {
        {-1, -1, -1},
        {-1, 8, -1},
        {-1, -1, -1}
      }) ,
      new Kernel( new float[][] {
        {1, 0, -1},
        {2, 0, -2},
        {1, 0, -1}
      }) ,
      new Kernel( new float[][] {
        {-1, 0, 1},
        {-2, 0, 2},
        {-1, 0, 1}
      }) ,
      new Kernel( new float[][] {
        {1, 2,  1},
        {0, 0, 0},
        {-1, -2, -1}
      }),
      new Kernel( new float[][] {
        {-2, -1,  0},
        {-1, 1, 1},
        {0, 1, 2}
      })
    };
   kernels[0].apply(car,output);
  image(car,0,0);
  image(output,car.width,0);
    
    
  }
