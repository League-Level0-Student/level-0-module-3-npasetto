String number(int count) {
  if (count>0) {
   return count+""; 
  }else{
    return "no more";
  }
}
String bottles(int count) {
  if (count==1) {
   return "bottle"; 
  }else{
   return "bottles"; 
  }
}
void setup() {
for (int i=99; i>=0; i--) {
  print(number(i)+" "+bottles(i)+" of beer on the wall, "+number(i)+" "+bottles(i)+" of beer.\n");
  if (i==0) {
    print("Go to the store and buy some more, 99 bottles of beer on the wall.");
  }else{
  print("Take one down and pass it around, "+number(i-1)+" "+bottles(i-1)+" of beer on the wall.\n\n");
  }
}
}