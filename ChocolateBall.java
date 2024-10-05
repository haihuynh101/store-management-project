public class ChocolateBall extends Chocolate  {
// Instance Variables

  private int amountOfBalls; 
private String fillingFlavor; 



  // Constructors
  // No-Arguement Constructor

  
  public ChocolateBall() {
amountOfBalls=3;
    fillingFlavor = "caramel";
  }


/*
  *Parameterized constructor
  */
public ChocolateBall(int amountOfBalls, String fillingFlavor){
this.amountOfBalls=amountOfBalls;
 this.fillingFlavor= fillingFlavor;
}



  /*
  *Accessor Method 
  */
  
  
public int amountOfBalls(){
return  amountOfBalls;

  
}


  public String fillingFlavor(){
return fillingFlavor;

  
}



/*
  *Mutator Method 
  */

  public void amountOfBalls(int amountOfBalls){
this.amountOfBalls=amountOfBalls;
  }

public void fillingFlavor(String fillingFlavor){
this.fillingFlavor=fillingFlavor;

  
}

 /*
  *ToString
  */

public String toString() {

  return " Chocolate ball" + "\nAmount of Chocolate balls : "+ amountOfBalls+ "\nfillingFlavor: "+ fillingFlavor; 
  






  

}
}