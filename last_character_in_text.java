import java.util.Scanner;

public class last_character_in_text {
    public static void main(String[] args) {
        // make the thing more dynamic. Substitute the hardcoded string with a method call for getting an input from the user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a text: ");
        String name = input.nextLine(); 
        input.close();
        char lastCharacter = getLastCharacter(name);
        System.out.println("Last character: " + lastCharacter);
    }

    public static char getLastCharacter(String text) {
        return text.charAt(text.length() - 1);
    }
}
