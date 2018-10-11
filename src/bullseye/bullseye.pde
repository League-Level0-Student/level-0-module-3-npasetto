void setup() {
  size(500,500);
for (int i=300; i>0; i=i-10) {
  if ((i/10)%2==1) {
  fill(255,255,255);
  }else{
   fill(255,0,0); 
  }
  ellipse(250,250,i,i);
}
}