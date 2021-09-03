// User input
import java.util.Scanner;

public class Chall1 {

    public static void main(String[] args){
        System.out.println("Please choose a number 0 or 1");

        Scanner input = new Scanner (System.in);
        int check = input.nextInt ();
        
        if (check == 0) {
            System.out.println("User input 0 YOU WON!");
        }
        else if (check == 1) {
            System.out.println("User input 1 YOU LOSE");

        }
        else {
            System.out.println("User didn't input 0 or 1");
        }
        
    }
}