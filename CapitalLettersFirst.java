public class CapitalLettersFirst {

    static String moveCapitalLettersToFront(String s) {
        //code goes here. Your
        String return_string = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                return_string = return_string + s.charAt(i);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLowerCase(s.charAt(i))) {
                return_string = return_string + s.charAt(i);
            }
        }
        return return_string;
        
    }

    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(moveCapitalLettersToFront(s)); // HelloWorld

}

}
