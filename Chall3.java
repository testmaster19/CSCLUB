//buying # of breadsticks
import java.util.Scanner;

public class Chall3 {

  
   

  public static void main(String[] args) 
  {
    breadsticks();
  }

  public static void breadsticks()
  {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("How many Breadsticks do you want to order?: ");

    //output
    int userBread = myObj.nextInt();  // Read user input
    System.out.println("I want to order: " + userBread + " Bread Sticks");  // Output user input2
    
    if (userBread > 5)
    {
      System.out.println("\nI can get more Sauce to eat along with my breadstick! :D ");
    }
    else
    {
      System.out.println("I cannot get more than 1 sauce along with it :C");
    }

  }

}