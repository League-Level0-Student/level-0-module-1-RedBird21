PImage face;
void setup() {
 face = loadImage ("stinky.png");
 size(1000,800);
 face.resize(1000,800);
 image(face, 0,0);
 fill (#F4F50C);
 ellipse(320,390, 210,210);
 ellipse (648,380, 210,210);
 fill (#FF0000);
 ellipse(700,372, 70,70);
 ellipse(270,385, 70,70);
}
void draw() {

}
