public class Main {
  public static void main(String[] args) {
    int myInt = 9;
    double myDouble = myInt; // Automatic casting: int to double

    System.out.println(myInt);
    System.out.println(myDouble);

    double myDouble1 = 9.78;
    int myInt1 = (int) myDouble1; // Explicit casting: double to int

    System.out.println(myDouble);
    System.out.println(myInt);
    
  }
}