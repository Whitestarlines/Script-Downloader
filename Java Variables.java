public class Main {
  public static void main(String[] args) {
    
		//Its Adviced to check out Java Data Types, if you don't know abut strings and integer
		
		//These are strings!
    String name = "John";
    System.out.println(name);
		//These are integers! 
		int myNum1;
    myNum1 = 15;
    System.out.println(myNum1);
		//Now we are changing values of myNum(integer)!
    int myNum = 15;
    myNum = 20;  // myNum1 is now 20!
    System.out.println(myNum);
		//Printing text and variables!
    String name1 = "John"; //You can also make it a integer
    System.out.println("Hello " + name1);
    //Joining two string variables
    String firstName = "John ";
    String lastName = "Doe";
    String fullName = firstName + lastName;
    System.out.println(fullName); 
    //Adding two integer variables
    int x = 5;
    int y = 6;
    System.out.println(x + y); // Print the value of x + y
    // Declare many variables  
    int x1 = 5, y1 = 6, z1 = 50;
    System.out.println(x1 + y1 + z1);

    // Minutes Per Hour(integer variable)
    int minutesPerHour = 60;

    // Hours Per Day(integer variable)
    int hoursPerDay = 60;
    
    System.out.println(minutesPerHour);
  }
}
