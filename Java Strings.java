public class Main {
  public static void main(String[] args) {
    String greeting = "Hello";
    System.out.println(greeting);
    String txt1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    System.out.println("The length of the txt string is: " + txt1.length());
    String txt = "Hello World";
    System.out.println(txt.toUpperCase());
    System.out.println(txt.toLowerCase());
    String txt2 = "Please locate where 'locate' occurs!";
    System.out.println(txt2.indexOf("locate"));
    String firstName1 = "John";
    String lastName1 = "Doe";
    System.out.println(firstName1 + " " + lastName1);
    String firstName = "John ";
    String lastName = "Doe";
    System.out.println(firstName.concat(lastName));
    String txt3 = "We are the so-called \"Vikings\" from the north.";
    System.out.println(txt3);
    String txt4 = "It\'s alright.";
    System.out.println(txt4);
    String txt5 = "The character \\ is called backslash.";
    System.out.println(txt5);
    int x1 = 10;
    int y1 = 20;
    int z1 = x1 + y1;
    System.out.println(z1);
    String x = "10";
    int y = 20;
    String z = x + y;
    System.out.println(z);
  }
}