public class Drink extends GroceryStore{

  private int size; // Size of drink

  // No-argument constructor
  public Drink() {
    super("no brand", 1.50);
  }

  // Parameterized constructor will set size
  public Drink (String brand, int size){
    super (brand, 1.50 + size);
    this.size = size;
  }
 
  // Parameterized constructor will set name
  public Drink (String brand){
    super (brand, 1.50);
  }

  // Accessor method for size
  public int getSize(){
    return size;
  }

  // Mutator method for size
  public void setSize(int size){
    this.size = size;
  }
  // toString override
  public String toString(){
    return super.toString() + " (" + size + ") " + " Price: " + getPrice();
 }
}