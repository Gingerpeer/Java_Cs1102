import javax.swing.JOptionPane;

public class Discussion2{
  // creating of a separate method for a while loop learned from GeeksforGeeks(2021)
  void whileLoopMethod(){
    // Variables created to control the while loop
    boolean loop = true;
    int counter = 0;
    JOptionPane.showMessageDialog(null,"This is a while loop example and will only run three times, as the boolean variable 'loop' value will be changed to false through conditional once the the 'counter' variable reaches three.");
    while(loop){
      // (Counter + 1) is but a way to display the amount of times looped in natural counting fashion
      JOptionPane.showMessageDialog(null,"Times looped = " + (counter + 1));
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
    JOptionPane.showMessageDialog(null,"This is a do.. while loop example and will only run three times, as the boolean variable 'loop' value will be changed to false through conditional once the the 'counter' variable reaches three.");
    do{
      // (Counter + 1) is but a way to display the amount of times looped in natural counting fashion
      JOptionPane.showMessageDialog(null,"Times looped = " + (counter + 1));
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
    JOptionPane.showMessageDialog(null,"This is a for loop example and will only run three times, once the the 'counter' variable reaches three.");
    for(counter = 0; counter < 3; counter++){
      // (Counter + 1) is but a way to display the amount of times looped in natural counting fashion
      JOptionPane.showMessageDialog(null,"Times looped = " + (counter + 1));
      
    }
  }
  // do...while loop that takes in an array and loops over the array
  void extraDoWhile(String[] args){
    boolean notDone = true;
    int numberLoop = 0;
    
    JOptionPane.showMessageDialog(null,"This is a do... while loop and will loop over the array provided and output to the console");
    do{
      if(numberLoop > (args.length - 1)){
        notDone = false;
      }else{
        JOptionPane.showMessageDialog(null,"This the " + (numberLoop + 1) + " loop with array value " + args[numberLoop]);
        numberLoop++;
      } 
    }while(notDone);
  }
  void extraWhile(String[] args){
    boolean notDone = true;
    int numberLoop = 0;
    
    JOptionPane.showMessageDialog(null,"This is a while loop and will loop over the array provided and output to the console");
    while(notDone){
      if(numberLoop > (args.length - 1)){
        notDone = false;
      }else{
        JOptionPane.showMessageDialog(null,"This the " + (numberLoop + 1) + " loop with array value " + args[numberLoop]);
        numberLoop++;
      } 
    }
  }
  void extraFor(String[] args){
    int numberLoop;
    JOptionPane.showMessageDialog(null,"This is a for loop and will loop over the array provided and output to the console");
    for(numberLoop = 0; numberLoop < args.length; numberLoop++){
        JOptionPane.showMessageDialog(null,"This the " + (numberLoop + 1) + " loop with array value " + args[numberLoop]);
   }
  }
  void finalFor(String[] arr,int[] args){
    int monthCounter;
    int dayCounter;
    for(monthCounter = 0; monthCounter < arr.length; monthCounter++){
      String month = arr[monthCounter];
      int daysInMonth;
      if(month == "February"){
        daysInMonth = 28;
      }else if(month == "April" || month == "June" || month == "September" || month == "November"){
        daysInMonth = 30;
      }else{
        daysInMonth = 31;
      }
      for(dayCounter = 0; dayCounter < daysInMonth; dayCounter++){
        // the whole premise of using two arrays in this method was unnecessary but a nice way of showing how to do it.
        int day = args[dayCounter];
        System.out.println(day + " " + month);
      }
    }
  }
  void finalWhile(String[] arr,int[] args){
    int monthCounter = 0;
    boolean continueMonthWhile = true;
    while(continueMonthWhile){
      boolean continueDayWhile = true;
      int dayCounter = 0;
      if(monthCounter == (arr.length - 1)){
        continueMonthWhile = false;
      }
      String month = arr[monthCounter];
      int daysInMonth;
      if(month == "February"){
        daysInMonth = 28;
      }else if(month == "April" || month == "June" || month == "September" || month == "November"){
        daysInMonth = 30;
      }else{
        daysInMonth = 31;
      }
      while(continueDayWhile){
        if(dayCounter == daysInMonth){
          continueDayWhile = false;
          monthCounter++;
        }else{
          int day = args[dayCounter];
          System.out.println(day + " " + month);
          dayCounter++;
        }
      }
    }
  }
  void finalDoWhile(String[] arr,int[] args){
    int monthCounter = 0;
    boolean continueMonthWhile = true;
    do{
      boolean continueDayWhile = true;
      int dayCounter = 0;
      if(monthCounter == (arr.length - 1)){
        continueMonthWhile = false;
      }
      String month = arr[monthCounter];
      int daysInMonth;
      if(month == "February"){
        daysInMonth = 28;
      }else if(month == "April" || month == "June" || month == "September" || month == "November"){
        daysInMonth = 30;
      }else{
        daysInMonth = 31;
      }
      do{
        if(dayCounter == daysInMonth){
          continueDayWhile = false;
          monthCounter++;
        }else{
          int day = args[dayCounter];
          System.out.println(day + " " + month);
          dayCounter++;
        }
      }while(continueDayWhile);
    }while(continueMonthWhile);
  }
  void references(){
    JOptionPane.showMessageDialog(null,"References:");
    JOptionPane.showMessageDialog(null,"           GeeksforGeeks. (2021, 3 augustus). Can We Have Multiple Main Methods in Java? Retrieved on 20 april 2022, from https://www.geeksforgeeks.org/can-we-have-multiple-main-methods-in-java/");
    JOptionPane.showMessageDialog(null,"           Eck, D. J. (2019). Introduction to programming using Java, version 8.1. http://math.hws.edu/javanotes");
    JOptionPane.showMessageDialog(null,"           Java Arrays. (n.d.). W3schools. https://www.w3schools.com/java/java_arrays.asp");
  }
  public static void main(String[] args){
    // calendar array found how to declare as per Java Arrays.(n.d.) 
    String[] months = {
      "January",
      "February",
      "March",
      "April",
      "May",
      "June",
      "July",
      "August",
      "September",
      "October",
      "November",
      "December"
    };
    int[] days = {
      1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31
    };
    JOptionPane.showMessageDialog(null,"Welcome to my Discussion Unit Two post.");
    JOptionPane.showMessageDialog(null,"My name is Pierre van Zyl of course CS1102.");
    // calling separate methods in the main method learned from GeeksforGeeks(2021)
    Discussion2 obj = new Discussion2();
    boolean menuBool = true;
    while(menuBool){
      String partSelection = JOptionPane.showInputDialog("Do you wish to view part (1), (2), (3), (4), (5), (6) or (end) to quit?");
      if(partSelection.equals("1")) {
        obj.whileLoopMethod();
        obj.doWhileLoopMethod();
        obj.forLoopMethod();
      }
      if(partSelection.equals("2")) {
        obj.extraDoWhile(months);
        obj.extraWhile(months);
        obj.extraFor(months);
      }
      if(partSelection.equals("3")) {
        JOptionPane.showMessageDialog(null,"See Console for days and months of the year using a for loop");
        obj.finalFor(months,days); 
      }
      if(partSelection.equals("4")) {
        JOptionPane.showMessageDialog(null,"See Console for days and months of the year using a while loop");
        obj.finalWhile(months,days);
      }
      if(partSelection.equals("5")) {
        JOptionPane.showMessageDialog(null,"See Console for days and months of the year using a do-while loop");
        obj.finalDoWhile(months,days);
      }
      if(partSelection.equals("6")) {
        // Details of when to use while, do-while or for loops
        JOptionPane.showMessageDialog(null,"My favorite loop is the for statement, as it is a much smaller amount of code needed to loop over items.");
        JOptionPane.showMessageDialog(null,"However, the while statements are beneficial as they will loop over code until a condition is met. ");
        JOptionPane.showMessageDialog(null,"The Do-while statement is very similar to the while statement, however, the while statement can end without running any code whilst the do-while statement needs to run at least once.");
      }
      if(partSelection.equals("end")) {
        obj.references();
        menuBool = false;
      }
    }
  }
}