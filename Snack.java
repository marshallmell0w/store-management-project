public class Snack extends GroceryStore{

  private int quantity; // Amount of snacks 

  // No-argument constructor
  public Snack(){
    super ("no brand", 1.50);
  }
  
  // Parameterized constructor will set quantity
  public Snack(String brand, int quantity){
    super (brand, 1.50 + quantity * 0.50);
    this.quantity = quantity;
  }

  // Parameterized constructor will set name
  public Snack (String brand){
    super (brand, 1.50);
  }

  // Accessor method for quantity
  public int getQuantity(){
    return quantity;
  }

  // Mutator method for quantity
  public void setQuantity(int quantity){
    this.quantity = quantity;
  }
  // toString override
  public String toString(){
    return super.toString() + " (" + quantity + ") " + "New price: " + getPrice();
 }

}