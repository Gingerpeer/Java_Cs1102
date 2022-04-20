public class Discussion2{
  // creating of a separate method for a while loop learned from GeeksforGeeks(2021)
  void whileLoopMethod(){
    // Variables created to control the while loop
    boolean loop = true;
    int counter = 0;
    System.out.println("This is a while loop example and will only run three times, as the boolean variable 'loop' value will be changed to false through conditional once the the 'counter' variable reaches three.");
    while(loop){
      // (Counter + 1) is but a way to display the amount of times looped in natural counting fashion
      System.out.println("Times looped = " + (counter + 1));
      counter = counter + 1;
      // conditional to make the boolean variable loop false and thus break out of the loop once counter is equal to 3
      if(counter == 3){
        loop = false;
      }
    }
  }
  void doWhileLoopMethod(){
    // Variables created to control the while loop
    boolean loop = true;
    int counter = 0;
    System.out.println("This is a do.. while loop example and will only run three times, as the boolean variable 'loop' value will be changed to false through conditional once the the 'counter' variable reaches three.");
    do{
      // (Counter + 1) is but a way to display the amount of times looped in natural counting fashion
      System.out.println("Times looped = " + (counter + 1));
      counter = counter + 1;
      // conditional to make the boolean variable loop false and thus break out of the loop once counter is equal to 3
      if(counter == 3){
        loop = false;
      }
    }
    while(loop);
  }
  void forLoopMethod(){
    // Variable created to control the for loop
    int counter;
    System.out.println("This is a for loop example and will only run three times, once the the 'counter' variable reaches three.");
    for(counter = 0; counter < 3; counter++){
      // (Counter + 1) is but a way to display the amount of times looped in natural counting fashion
      System.out.println("Times looped = " + (counter + 1));
      
    }
  }
  void references(){
    System.out.println("References:");
    System.out.println("           GeeksforGeeks. (2021, 3 augustus). Can We Have Multiple Main Methods in Java? Retrieved on 20 april 2022, from https://www.geeksforgeeks.org/can-we-have-multiple-main-methods-in-java/");
    System.out.println("       ");
    System.out.println("           Eck, D. J. (2019). Introduction to programming using Java, version 8.1. http://math.hws.edu/javanotes");
  }
  public static void main(String[] args){
    System.out.println("This is my discussion two post.");
    // calling separate methods in the main method learned from GeeksforGeeks(2021)
    Discussion2 obj = new Discussion2();
    obj.whileLoopMethod();
    obj.doWhileLoopMethod();
    obj.forLoopMethod();
    obj.references();
    
  }
}