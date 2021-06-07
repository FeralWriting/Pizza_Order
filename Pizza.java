import java.util.*;
class Pizza {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.println("Would you like a pizza?");
    String order = console.nextLine();
    if (order.equals("no") || order.equals("No")) {
      System.out.println("Get out of here you hooligan, no loitering.");
    } else {
      System.out.println("Okay, what bread would you like?");
      String bread = console.nextLine();
      System.out.println("And sauce?");
      String sauce = console.nextLine();
      System.out.println("What kind of cheese?");
      String cheese = console.nextLine();
      System.out.println("Toppings?");
      String toppings = console.nextLine();
      System.out.println("Finally, what drink would you like?");
      String drink = console.nextLine();
      System.out.println("So you want a " + bread + " pizza with " + sauce + " sauce and " + cheese + " cheese, with " + toppings + " toppings?");
      if (!(drink.equals("none") || drink.equals("None"))){
        System.out.println("Oh, and a " + drink + "?");
      }
      String answer = console.nextLine();
      if (!(answer.equals("yes") || answer.equals("Yes"))) {
        System.out.println("The only right answer is \"yes\", you get one more chance or you will perish.");
        String answer2 = console.nextLine();
        if (!(answer2.equals("yes") || answer2.equals("Yes"))) {
        System.out.println("I have your address, I'll be there in three days. Be ready.");
        }else {
        System.out.println("Good. Coming right up!");
      }
      } else {
        System.out.println("Coming right up!");
      }
    }
    
  }
}
