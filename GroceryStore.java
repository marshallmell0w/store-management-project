public class GroceryStore{
   // Attributes 
  private String brand;
  private double price;

  // No-argument constructor
  public GroceryStore(){
    this.brand = "no brand";
    this.price = 0.0;
  }

  // Parameterized Constructor
  public GroceryStore(String brand, double price){
    this.brand = brand;
    this.price = price;
  }
    // Accessor method brand
    public String getBrand(){
      return brand;
    }
 // Mutator method brand
    public void setBrand (String brand){
      this.brand = brand;
    }
 
  // Accessor method price
    public double getPrice(){
      return price;
    }
  // Mutator method price
  public void setPrice(double price){
    this.price = price;
  }
  public String toString(){
    return brand + "is" + price;
  }
  
}