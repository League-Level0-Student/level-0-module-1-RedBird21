int x = 400; 
int y = 600; 

void setup() {
    size(800, 800);
    
}

void draw() {
  if (mousePressed) {
     System.out.println(mouseX+" "+mouseY);
  }
    background(0, 0, 40); 
    fill(random(255), 0, 0);
    ellipse(x, y + 130, 90, 90);
    fill(248, 128, 0);
    ellipse(x, y + 115, 70, 70);
    fill(255, 153, 0);
    ellipse(x, y + 95, 35, 35);
    fill(100, 100, 100);
    triangle(x, y + 10, x + 50, y + 100, x - 50, y + 100);
    fill (#FCFFFE);
    ellipse(100,100, 230,230);
    fill (#B5B7B6);
    ellipse(165,140, 70,70);
    ellipse(52,150, 50,50);
    ellipse(121,20, 37,37);
    fill (#FFFFFF);
    ellipse(193,309, 3,3);
    ellipse(119,428, 3,3);
    ellipse(207,596, 3,3);
    ellipse(519,690, 3,3);
    ellipse(527,315, 3,3);
    ellipse(527,315, 3,3);
    ellipse(642,99, 3,3);
    ellipse(704,237, 3,3);
    ellipse(676,354, 3,3);
    ellipse(661,539, 3,3);
    ellipse(365,215, 3,3);
    ellipse(365,215, 3,3);
    ellipse(61,687, 3,3);
    ellipse(250,780, 3,3);
    ellipse(769,770, 3,3);
    ellipse(376,424, 3,3);
    ellipse(305,62, 3,3);
    ellipse(494,126, 3,3);
    ellipse(632,20, 3,3);
    ellipse(786,95, 3,3);
    ellipse(787,96, 3,3);
    ellipse(786,399, 3,3);
    ellipse(776,570, 3,3);
    ellipse(776,571, 3,3);
    ellipse(600,775, 3,3);
    ellipse(317,705, 3,3);
    ellipse(482,553, 3,3);
    ellipse(36,285, 3,3);
    ellipse(39,551, 3,3);
    ellipse(419,18, 3,3);
    ellipse(234,157, 3,3);
    ellipse(24,399, 3,3);
    ellipse(108,766, 3,3);
    ellipse(207,24, 3,3);
    ellipse(413,763, 3,3);
    ellipse(363,565, 3,3);
    ellipse(252,451, 3,3);
    ellipse(581,437, 3,3);
    ellipse(669,658, 3,3);
    y-=5;
}
