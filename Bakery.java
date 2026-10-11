public class Bakery extends GroceryStore{

  private boolean hasNuts;  // If the pastry has nuts

  // No-argument constructor
  public Bakery(){
    super ("no brand", 3.50);
  }

  // Parameterized constructor 
  public Bakery (String brand, boolean hasNuts){
    super(brand, 3.50);
    this.hasNuts = hasNuts;
    // Logic?
    double newPrice = 3.50;
    if (hasNuts){
      newPrice = 3.55;
    } else {
      newPrice = 3.55;
      setPrice (newPrice);
    }
  }

  // Parameterized constructor will set name
  public Bakery (String brand){
    super (brand, 1.50);
  }

  // Accessor Method for hasNuts
  public boolean getHasNuts(){
    return hasNuts;
  }

  // Mutator method for hasNuts
  public void setHasNuts(boolean hasNuts){
    this.hasNuts = hasNuts;
  }

  // toString override 
  public String toString(){
    String hasNutsString = "";
    if (hasNuts){
      hasNutsString = " (Has nuts)";
    }
    return super.toString() + " (" + hasNutsString + ") " + "New Price" + getPrice();
  }
}