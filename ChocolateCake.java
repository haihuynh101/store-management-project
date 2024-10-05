public class ChocolateCake extends Chocolate  {

// Instance Variables

  
  private int numSlices; 
private String Icing; 


  
  // Constructors
  // No-Arguement Constructor 
  
  public ChocolateCake() {
numSlices=1;
    Icing = "vanilla";
  }
/*
  *Parameterized constructor
  */


public ChocolateCake(int numSlices, String Icing){
this.numSlices=numSlices;
 this.Icing= Icing;
}

 /*
  *Accessor Method 
  */
  
public int getnumSlices(){
return  numSlices;

  
}


  public String getIcing(){
return Icing;

  
}





 /*
  *Mutator Method 
  */
  

  public void setnumSlices(int numSlices){
this.numSlices=numSlices;
  }

public void setIcing(String Icing){
this.Icing=Icing;

  
}

  
 /*
  *ToString
  */
  
public String toString() {

  return " Chocolate cake" + "\nNumber of slices: "+ numSlices+ "\nFlavor of Icing: "+ Icing; 
  
}

  
  // Other Method
  


  
}




