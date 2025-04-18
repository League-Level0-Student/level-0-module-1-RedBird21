PImage face;
void setup() {
 face = loadImage ("stinky.png");
 size(1000,800);
 face.resize(1000,800);
 image(face, 0,0);
 
 ellipse(320,390, 210,210);
 ellipse (648,380, 210,210);
}
void draw() {

}
