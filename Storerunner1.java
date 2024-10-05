import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    Chocolate c1 = new Chocolate ();
    Chocolate c2 = new Chocolate ("dark chocolate",6.50, "large");
 System.out.println(c1);
            System.out.println(" "); 

        System.out.println(c2);
            System.out.println(" "); 

    
ChocolateCake Ck2 = new ChocolateCake();
ChocolateCake Ck3 = new ChocolateCake(4,"Strawberry");
    
 System.out.println(Ck2);
                System.out.println(" "); 
        System.out.println(Ck3);
                System.out.println(" "); 



ChocolateBall Cb4 = new ChocolateBall();
    ChocolateBall Cb5 = new ChocolateBall(5, "peanut butter");

        System.out.println(Cb4);
                System.out.println(" "); 
        System.out.println(Cb5);

 
      
    // Creates a Scanner object - feel free to delete if not using!
    Scanner input = new Scanner(System.in);






    // Closes the Scanner object
    input.close();
    
  }
}