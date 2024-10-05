public class Chocolate {


// Instance Variables

private String flavor; 
  private String size; 
private double price; 


  
  // Constructors
  // No-Arguement Constructor
public Chocolate() {
flavor="milk chocolate ";
  price=5.00;
  size="medium";
}
/*
  *Parameterized constructor
  */
public Chocolate(String flavor, double price, String size){
this.flavor=flavor;
  this.price=price;
    this.size=size;


    
  }
  
  /*
  *Accessor Method 
  */
  


  
public String getFlavor(){
return  flavor;

  
}


  public double getPrice(){
return price;

  
}



public String getSize(){
return size;

  
}

/*
  *Mutator Method 
  */
  

  public void setFlavor(String flavor){
this.flavor=flavor;
  }

public void setPrice(double price){
this.price=price;

  
}

  public void setSize(String size){
this.size=size;


  }  
 /*
  *ToString
  */
  
public String toString() {

  return "Chocolate" + "\nFlavor: " +flavor+"\nPrice: $"+price +"\nSize: " +size;
}

  
  // Other Method
  




  










}
