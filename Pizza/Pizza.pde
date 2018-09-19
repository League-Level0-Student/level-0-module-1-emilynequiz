 PImage eyeball;
void setup(){
size(600,600);
fill(#D66B13);
noStroke();
ellipse(width/2,height/2,500,500);
fill(#FC0D00);
ellipse(width/2,height/2,450,450);
fill(#FAF208);
ellipse(width/2,height/2,350,350);
fill(#FF1803);
 eyeball = loadImage("eyeball.ppm.gif");
 eyeball.resize(40,40);
image(eyeball, 200, 200);
image(eyeball, 300, 200);
image(eyeball, 380, 300);
image(eyeball, 200, 300);
image(eyeball, 380, 300);





}

void draw(){
if(mousePressed){
image(eyeball, mouseX, mouseY);
} 

}  