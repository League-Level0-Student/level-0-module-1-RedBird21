void mousePressed(){
  System.out.println(mouseX+ " "+mouseY);
}

void setup(){

size (800,800);
}
  
 void draw(){ 
   textSize(100);
for (int iceCream = 0; iceCream < 3; iceCream += 1) {
  text ("ice cream", 169,166 + iceCream * 100);
  
 
    
  }
  
  
}

 
