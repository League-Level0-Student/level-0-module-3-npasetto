void setup() {
 size(500,500); 
 noFill();
}
int x = 100;
void draw() {
  clear();
  background(255,255,255);
  for (int i=200;i>0;i=i-10) {
   ellipse(x,250,i,i); 
   ellipse(500-x,250,i,i);
  }
  
  x=x+1;
}