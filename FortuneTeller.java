import java.util.Scanner;

public class FortuneTeller {
    public static void main(String[] args) {
        // make the thing more dynamic. Substitute the hardcoded string with a method call for getting an input from the user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int number = input.nextInt(); 
        input.close();
        if (number < 5)  {
            System.out.println("You will have a great day!");
        } 
        else {
            System.out.println("You will have a bad day!");
        }
    }
}
