import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

      // Creates a Scanner object - feel free to delete if not using!
    Scanner input = new Scanner(System.in);
   
    boolean didMakePurchase = false;
    System.out.println("Grocery Shopping Online: What are you buying today?");
    System.out.println("1. Drinks");
    System.out.println("2. Snacks");
    System.out.println("3. Bakery");
    int userSelection = input.nextInt();
    
// If user selects drinks
    if (userSelection == 1){
 System.out.println("What's the brand?");
      String drinkBrand = input.nextLine();
      drinkBrand = input.nextLine(); // prevents skipping
      System.out.println("What size drink?(1 for S, 2 for M, 3 for L)");
      int drinkSize = input.nextInt();

      // create drink
      System.out.println(); // blank line
      Drink newDrink = new Drink(drinkBrand, drinkSize);
      System.out.println("Here's your order:");
      System.out.println(); // blank line
      System.out.println(newDrink);

      didMakePurchase = true;
    }

// If user selects snacks
    if (userSelection == 2){
      System.out.println("What's the brand?");
      String snackBrand = input.nextLine();
      snackBrand = input.nextLine(); // prevent skipping
      System.out.println("How many wanted (Quantity)?");
      int snackQuantity = input.nextInt();
      
      // create snack
      System.out.println(); // blank line
      Snack newSnack = new Snack (snackBrand, snackQuantity);
      System.out.println("Here's your order:");
      System.out.println(); // blank line
      System.out.println(newSnack);

      didMakePurchase = true;
    }

// If user selects bakery
    if (userSelection == 3){
System.out.println("Whats the brand?");
      String pastryBrand = input.nextLine();
      pastryBrand = input.nextLine(); // prevent skipping
      System.out.println("Has nuts? (1 for Yes, 2 for No)");
      int pastryNum = input.nextInt();
      boolean pastryNuts = false;
      if (pastryNum == 1) {
        pastryNuts = true;
      }
      
      // create bakery 
      System.out.println(); // blank line
      Bakery newPastry = new Bakery(pastryBrand, pastryNuts);
      System.out.println("Here's your order:");
      System.out.println(); // blank line
      System.out.println(newPastry);

      didMakePurchase = true;
    }

// Finishes
   if (didMakePurchase){
      System.out.println("Thank you for your purchase!");
    } else {
      System.out.println("Maybe next time!");
    }
    // Closes the Scanner object
    input.close();
    
  }
}