void setup() {
    size(500, 500);
}
void draw() {
    background(200, 200, 200);
    noStroke();
    fill (#FF0000);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill (#207139);
    rect(176, 103, 12, 32);
    if(mousePressed) {
      fill (#C8C8C8);
      ellipse(90,200, 70,70);
    }
}

  
